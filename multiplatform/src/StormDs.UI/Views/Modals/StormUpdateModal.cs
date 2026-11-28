// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Text.RegularExpressions;
using System.Threading;
using System.Threading.Tasks;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Controls.Documents;
using Avalonia.Input;
using Avalonia.Layout;
using Avalonia.Media;
using Avalonia.Threading;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using Storm.AuroraFluid.Kit.Themes;
using StormDs.Core.Localization;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Modals;

/// <summary>
/// Rich STORM Update Window (Avalonia Desktop) matching Android StormUpdateDialogs:
/// Version Transition Card, Metadata Chips, Structured Scrollable Release Notes,
/// Live Download Progress (MB/s + %), Skip/Remind persistence, and Installer Launch.
/// </summary>
public partial class StormUpdateModal : AuroraGlassCard
{
    public enum UpdateModalMode
    {
        Checking,
        UpdateAvailable,
        UpToDate,
        Error
    }

    private static readonly Regex s_htmlTagRegex = new(
        "</?(?:details|summary|b|i|br\\s*/?)>",
        RegexOptions.IgnoreCase | RegexOptions.Compiled);

    private readonly StackPanel _rootStack;
    private readonly TextBlock _titleText;
    private readonly Border _iconBox;
    private readonly AuroraVectorIcon _headerIcon;
    private readonly StackPanel _bodyHost;
    private readonly Action? _onRetryCallback;

    private AuroraUpdateCheckResult? _currentResult;
    private CancellationTokenSource? _downloadCts;
    private bool _isDownloading;

    private ProgressBar? _progressBar;
    private TextBlock? _progressLeftText;
    private TextBlock? _progressSpeedText;
    private TextBlock? _progressPercentText;
    private Border? _progressCard;
    private StackPanel? _actionsPanel;

    public event Action? CloseRequested;

    public StormUpdateModal(UpdateModalMode mode, AuroraUpdateCheckResult? result = null, Action? onRetry = null)
    {
        _currentResult = result;
        _onRetryCallback = onRetry;

        Width = 560;
        MaxHeight = 640;
        Padding = new Thickness(0);
        CornerRadius = new CornerRadius(18);
        SpotlightEnabled = true;

        var theme = AuroraThemeManager.Instance.CurrentTheme;
        Background = new SolidColorBrush(theme.CardColor);
        BorderBrush = new SolidColorBrush(theme.BorderColor);
        BorderThickness = new Thickness(1.2);

        _rootStack = new StackPanel { Spacing = 0 };

        // Header
        var headerGrid = new Grid
        {
            Margin = new Thickness(18, 14, 18, 14),
            ColumnDefinitions = new ColumnDefinitions("Auto,*,Auto")
        };

        _iconBox = new Border
        {
            Width = 40,
            Height = 40,
            CornerRadius = new CornerRadius(12),
            Background = new SolidColorBrush(Color.FromArgb(36, theme.DefaultAccentColor.R, theme.DefaultAccentColor.G, theme.DefaultAccentColor.B)),
            BorderBrush = new SolidColorBrush(Color.FromArgb(115, theme.DefaultAccentColor.R, theme.DefaultAccentColor.G, theme.DefaultAccentColor.B)),
            BorderThickness = new Thickness(1)
        };
        _headerIcon = new AuroraVectorIcon
        {
            Kind = AuroraIconKind.UpdateRocket,
            Size = 20,
            CustomColorOverride = new SolidColorBrush(theme.DefaultAccentColor),
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };
        _iconBox.Child = _headerIcon;
        headerGrid.Children.Add(_iconBox);

        var titleCol = new StackPanel
        {
            Spacing = 2,
            Margin = new Thickness(12, 0, 12, 0),
            VerticalAlignment = VerticalAlignment.Center
        };
        _titleText = new TextBlock
        {
            Text = "STORM DS",
            FontSize = 16.5,
            FontWeight = FontWeight.Bold,
            Foreground = theme.TextPrimaryBrush
        };
        var subtitleText = new TextBlock
        {
            Text = "STORM DS",
            FontSize = 11,
            FontFamily = new FontFamily("Consolas, Cascadia Mono, monospace"),
            Foreground = theme.TextSecondaryBrush
        };
        titleCol.Children.Add(_titleText);
        titleCol.Children.Add(subtitleText);
        headerGrid.Children.Add(titleCol);
        Grid.SetColumn(titleCol, 1);

        var closeBtn = new Border
        {
            Width = 32,
            Height = 32,
            CornerRadius = new CornerRadius(9),
            Background = new SolidColorBrush(theme.HeaderColor),
            BorderBrush = theme.BorderBrush,
            BorderThickness = new Thickness(1),
            Cursor = new Cursor(StandardCursorType.Hand),
            VerticalAlignment = VerticalAlignment.Center
        };
        closeBtn.Child = new AuroraVectorIcon
        {
            Kind = AuroraIconKind.WindowClose,
            Size = 14,
            CustomColorOverride = theme.TextSecondaryBrush,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center
        };
        closeBtn.PointerPressed += (s, e) => RequestSafeClose();
        headerGrid.Children.Add(closeBtn);
        Grid.SetColumn(closeBtn, 2);

        _rootStack.Children.Add(headerGrid);

        // Divider
        _rootStack.Children.Add(new Border
        {
            Height = 1,
            HorizontalAlignment = HorizontalAlignment.Stretch,
            Background = theme.BorderBrush
        });

        _bodyHost = new StackPanel
        {
            Margin = new Thickness(18, 14, 18, 16),
            Spacing = 12
        };
        _rootStack.Children.Add(_bodyHost);

        Content = _rootStack;
        RenderState(mode, result);
    }

    public void UpdateState(UpdateModalMode mode, AuroraUpdateCheckResult? result = null)
    {
        _currentResult = result;
        RenderState(mode, result);
    }

    public void RequestSafeClose()
    {
        if (_isDownloading)
        {
            _downloadCts?.Cancel();
            return;
        }
        CloseRequested?.Invoke();
    }

    private void RenderState(UpdateModalMode mode, AuroraUpdateCheckResult? result)
    {
        _bodyHost.Children.Clear();
        var theme = AuroraThemeManager.Instance.CurrentTheme;
        var accent = theme.DefaultAccentColor;
        var errorColor = Color.Parse("#EF4444");

        if (mode == UpdateModalMode.Checking)
        {
            _titleText.Text = StormDsLoc.T("UpdateModalCheckingTitle");
            _headerIcon.Kind = AuroraIconKind.UpdateRocket;
            SetHeaderTint(accent);

            _bodyHost.Children.Add(new TextBlock
            {
                Text = StormDsLoc.T("UpdateModalCheckingDesc"),
                FontSize = 13,
                Foreground = theme.TextSecondaryBrush,
                TextWrapping = TextWrapping.Wrap
            });
            _bodyHost.Children.Add(new ProgressBar
            {
                IsIndeterminate = true,
                Height = 6,
                Foreground = new SolidColorBrush(accent),
                Background = new SolidColorBrush(theme.HeaderColor)
            });
            return;
        }

        if (mode == UpdateModalMode.UpdateAvailable && result != null)
        {
            _titleText.Text = StormDsLoc.T("UpdateModalAvailableTitle");
            _headerIcon.Kind = AuroraIconKind.UpdateRocket;
            SetHeaderTint(accent);

            string cleanCur = StormDsLoc.AppVersion.TrimStart('v', 'V');
            string cleanNew = result.LatestVersion.ToString().TrimStart('v', 'V');

            // 1. Version Transition Card: Current -> New
            var transitionBorder = new Border
            {
                CornerRadius = new CornerRadius(14),
                Background = new SolidColorBrush(theme.HeaderColor),
                BorderBrush = theme.BorderBrush,
                BorderThickness = new Thickness(1),
                Padding = new Thickness(12, 10)
            };
            var transitionGrid = new Grid
            {
                ColumnDefinitions = new ColumnDefinitions("*,Auto,*")
            };
            transitionGrid.Children.Add(BuildVersionPill(StormDsLoc.T("UpdateModalCurrentVer"), cleanCur, false, theme));

            var arrowBox = new Border
            {
                Width = 30,
                Height = 30,
                Margin = new Thickness(8, 0),
                CornerRadius = new CornerRadius(8),
                Background = new SolidColorBrush(Color.FromArgb(36, accent.R, accent.G, accent.B)),
                VerticalAlignment = VerticalAlignment.Center
            };
            arrowBox.Child = new TextBlock
            {
                Text = "->",
                FontWeight = FontWeight.Bold,
                FontSize = 13,
                Foreground = new SolidColorBrush(accent),
                HorizontalAlignment = HorizontalAlignment.Center,
                VerticalAlignment = VerticalAlignment.Center
            };
            transitionGrid.Children.Add(arrowBox);
            Grid.SetColumn(arrowBox, 1);

            var newPill = BuildVersionPill(StormDsLoc.T("UpdateModalNewVer"), cleanNew, true, theme);
            transitionGrid.Children.Add(newPill);
            Grid.SetColumn(newPill, 2);

            transitionBorder.Child = transitionGrid;
            _bodyHost.Children.Add(transitionBorder);

            // 2. Metadata Chips & Download Source Picker
            var selectedSource = ResolveInitialSource(result);
            var activeResult = result.WithSelectedSource(selectedSource);

            var metaRow = new WrapPanel { Orientation = Orientation.Horizontal };
            var sourceChip = BuildMetaChip(AuroraIconKind.WifiGlobe, activeResult.SourceMirror, theme, true);
            metaRow.Children.Add(sourceChip);
            Border? sizeChip = null;
            if (activeResult.AssetSizeBytes > 0)
            {
                double mb = activeResult.AssetSizeBytes / (1024.0 * 1024.0);
                sizeChip = BuildMetaChip(AuroraIconKind.MemoryRam, $"{mb.ToString("F1", CultureInfo.InvariantCulture)} {StormDsLoc.T("UpdateModalUnitMb")}", theme, false);
                metaRow.Children.Add(sizeChip);
            }
            if (activeResult.PublishedAtUtc.HasValue)
            {
                metaRow.Children.Add(BuildMetaChip(AuroraIconKind.RecentClock, activeResult.PublishedAtUtc.Value.LocalDateTime.ToString("dd.MM.yyyy", CultureInfo.InvariantCulture), theme, false));
            }
            _bodyHost.Children.Add(metaRow);

            // 3. Changelog Label
            _bodyHost.Children.Add(new TextBlock
            {
                Text = StormDsLoc.T("UpdateModalWhatsNew"),
                FontSize = 11,
                FontWeight = FontWeight.Bold,
                FontFamily = new FontFamily("Consolas, Cascadia Mono, monospace"),
                Foreground = theme.TextSecondaryBrush
            });

            // 4. Scrollable Structured Changelog Card
            var notesCard = new Border
            {
                CornerRadius = new CornerRadius(14),
                Background = new SolidColorBrush(theme.BackgroundColor),
                BorderBrush = theme.BorderBrush,
                BorderThickness = new Thickness(1),
                Padding = new Thickness(12, 10)
            };
            var notesScroll = new ScrollViewer
            {
                MinHeight = 110,
                MaxHeight = 230
            };
            var notesStack = new StackPanel { Spacing = 6 };
            PopulateReleaseNotes(notesStack, string.IsNullOrWhiteSpace(activeResult.Changelog) ? $"STORM DS {cleanNew}" : activeResult.Changelog, theme);
            notesScroll.Content = notesStack;
            notesCard.Child = notesScroll;
            _bodyHost.Children.Add(notesCard);

            // 5. Live Download Progress Container (hidden until download starts)
            _progressCard = new Border
            {
                IsVisible = false,
                CornerRadius = new CornerRadius(12),
                Background = new SolidColorBrush(theme.HeaderColor),
                BorderBrush = new SolidColorBrush(Color.FromArgb(100, accent.R, accent.G, accent.B)),
                BorderThickness = new Thickness(1),
                Padding = new Thickness(12, 10)
            };
            var progStack = new StackPanel { Spacing = 8 };
            _progressBar = new ProgressBar
            {
                Minimum = 0,
                Maximum = 100,
                Value = 0,
                Height = 8,
                Foreground = new SolidColorBrush(accent),
                Background = new SolidColorBrush(theme.CardColor)
            };
            progStack.Children.Add(_progressBar);

            var progStats = new Grid { ColumnDefinitions = new ColumnDefinitions("*,Auto,Auto") };
            _progressLeftText = new TextBlock
            {
                Text = StormDsLoc.T("UpdateModalPreparing"),
                FontSize = 11.5,
                FontFamily = new FontFamily("Consolas, Cascadia Mono, monospace"),
                Foreground = theme.TextSecondaryBrush
            };
            _progressSpeedText = new TextBlock
            {
                Text = string.Empty,
                FontSize = 11.5,
                Margin = new Thickness(0, 0, 10, 0),
                FontFamily = new FontFamily("Consolas, Cascadia Mono, monospace"),
                Foreground = theme.TextSecondaryBrush
            };
            _progressPercentText = new TextBlock
            {
                Text = string.Empty,
                FontSize = 11.5,
                FontWeight = FontWeight.Bold,
                FontFamily = new FontFamily("Consolas, Cascadia Mono, monospace"),
                Foreground = new SolidColorBrush(accent)
            };
            progStats.Children.Add(_progressLeftText);
            progStats.Children.Add(_progressSpeedText);
            Grid.SetColumn(_progressSpeedText, 1);
            progStats.Children.Add(_progressPercentText);
            Grid.SetColumn(_progressPercentText, 2);
            progStack.Children.Add(progStats);

            var cancelDlBtn = CreateSecondaryButton(StormDsLoc.T("ActionCancel"), theme, () => _downloadCts?.Cancel());
            progStack.Children.Add(cancelDlBtn);

            _progressCard.Child = progStack;
            _bodyHost.Children.Add(_progressCard);

            // 6. Action Buttons + Source Picker
            _actionsPanel = new StackPanel { Spacing = 8 };

            bool ghAvail = result.GitHubSource != null || !result.DownloadUrl.Contains("stormgamesworld", StringComparison.OrdinalIgnoreCase);
            bool sgwAvail = result.StormMirrorSource != null || result.DownloadUrl.Contains("stormgamesworld", StringComparison.OrdinalIgnoreCase) || result.DownloadUrl.Contains("storm-games.world", StringComparison.OrdinalIgnoreCase);

            var sourceLabel = new TextBlock
            {
                Text = StormDsLoc.T("UpdateModalSourcePickerLabel"),
                FontSize = 11,
                FontWeight = FontWeight.Bold,
                FontFamily = new FontFamily("Consolas, Cascadia Mono, monospace"),
                Foreground = theme.TextSecondaryBrush
            };
            _actionsPanel.Children.Add(sourceLabel);

            var sourceGrid = new Grid
            {
                ColumnDefinitions = new ColumnDefinitions("*,*"),
                ColumnSpacing = 8
            };
            var ghBtn = CreateSecondaryButton("GitHub", theme, () => { });
            var sgwBtn = CreateSecondaryButton("STORM GAMES WORLD", theme, () => { });
            ghBtn.Opacity = ghAvail ? 1.0 : 0.45;
            sgwBtn.Opacity = sgwAvail ? 1.0 : 0.45;
            if (!ghAvail) ghBtn.Cursor = new Cursor(StandardCursorType.Arrow);
            if (!sgwAvail) sgwBtn.Cursor = new Cursor(StandardCursorType.Arrow);

            void ApplySourceSelection(AuroraUpdateDownloadSource next)
            {
                selectedSource = next;
                activeResult = result.WithSelectedSource(next);
                var activeBg = new SolidColorBrush(Color.FromArgb(44, accent.R, accent.G, accent.B));
                var activeBorder = new SolidColorBrush(accent);
                var inactiveBg = new SolidColorBrush(theme.HeaderColor);
                ghBtn.Background = next == AuroraUpdateDownloadSource.GitHub ? activeBg : inactiveBg;
                ghBtn.BorderBrush = next == AuroraUpdateDownloadSource.GitHub ? activeBorder : theme.BorderBrush;
                sgwBtn.Background = next == AuroraUpdateDownloadSource.StormGamesWorld ? activeBg : inactiveBg;
                sgwBtn.BorderBrush = next == AuroraUpdateDownloadSource.StormGamesWorld ? activeBorder : theme.BorderBrush;
                if (sourceChip.Child is StackPanel sp && sp.Children.LastOrDefault() is TextBlock st)
                {
                    st.Text = activeResult.SourceMirror;
                }
                if (sizeChip != null && activeResult.AssetSizeBytes > 0 && sizeChip.Child is StackPanel szSp && szSp.Children.LastOrDefault() is TextBlock szT)
                {
                    double mb = activeResult.AssetSizeBytes / (1024.0 * 1024.0);
                    szT.Text = $"{mb.ToString("F1", CultureInfo.InvariantCulture)} {StormDsLoc.T("UpdateModalUnitMb")}";
                }
            }

            if (ghAvail)
            {
                ghBtn.PointerPressed += (s, e) => ApplySourceSelection(AuroraUpdateDownloadSource.GitHub);
            }
            if (sgwAvail)
            {
                sgwBtn.PointerPressed += (s, e) => ApplySourceSelection(AuroraUpdateDownloadSource.StormGamesWorld);
            }
            ApplySourceSelection(selectedSource);

            sourceGrid.Children.Add(ghBtn);
            sourceGrid.Children.Add(sgwBtn);
            Grid.SetColumn(sgwBtn, 1);
            _actionsPanel.Children.Add(sourceGrid);

            var updateNowBtn = new AuroraVolumetricButton
            {
                IsHero = true,
                Height = 40,
                HorizontalAlignment = HorizontalAlignment.Stretch
            };
            var updContent = new StackPanel
            {
                Orientation = Orientation.Horizontal,
                Spacing = 8,
                HorizontalAlignment = HorizontalAlignment.Center,
                VerticalAlignment = VerticalAlignment.Center
            };
            updContent.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.UpdateRocket, Size = 16, CustomColorOverride = Brushes.White });
            updContent.Children.Add(new TextBlock { Text = StormDsLoc.T("UpdateModalUpdateNow"), FontSize = 13.5, FontWeight = FontWeight.Bold, Foreground = Brushes.White });
            updateNowBtn.Content = updContent;
            updateNowBtn.Click += async (s, e) => await StartDownloadAsync(activeResult);
            _actionsPanel.Children.Add(updateNowBtn);

            var secRow = new Grid
            {
                ColumnDefinitions = new ColumnDefinitions("*,*"),
                ColumnSpacing = 8
            };
            var laterBtn = CreateSecondaryButton(StormDsLoc.T("UpdateModalRemindLater"), theme, () =>
            {
                CloseRequested?.Invoke();
            });
            var skipBtn = CreateSecondaryButton(StormDsLoc.T("UpdateModalSkipVersion"), theme, () =>
            {
                StormDsUiState.Instance.AppConfig.SkippedUpdateVersion = cleanNew;
                StormDsUiState.Instance.SaveConfig();
                CloseRequested?.Invoke();
            });
            secRow.Children.Add(laterBtn);
            secRow.Children.Add(skipBtn);
            Grid.SetColumn(skipBtn, 1);
            _actionsPanel.Children.Add(secRow);

            if (!string.IsNullOrWhiteSpace(activeResult.ReleasePageUrl))
            {
                var linkText = new TextBlock
                {
                    Text = StormDsLoc.T("UpdateModalOpenReleasePage"),
                    FontSize = 12,
                    FontWeight = FontWeight.SemiBold,
                    Foreground = new SolidColorBrush(accent),
                    HorizontalAlignment = HorizontalAlignment.Center,
                    Margin = new Thickness(0, 4, 0, 0),
                    Cursor = new Cursor(StandardCursorType.Hand)
                };
                linkText.PointerPressed += (s, e) => OpenExternalUrl(activeResult.ReleasePageUrl);
                _actionsPanel.Children.Add(linkText);
            }

            _bodyHost.Children.Add(_actionsPanel);
            return;
        }

        // UpToDate or Error mode
        bool isError = mode == UpdateModalMode.Error;
        _titleText.Text = isError ? StormDsLoc.T("UpdateModalErrorTitle") : StormDsLoc.T("UpdateModalUpToDateTitle");
        _headerIcon.Kind = isError ? AuroraIconKind.WarningAmber : AuroraIconKind.CheckSuccess;
        SetHeaderTint(isError ? errorColor : accent);

        string badgeVer = StormDsLoc.AppVersion.TrimStart('v', 'V');
        if (!isError)
        {
            _bodyHost.Children.Add(new Border
            {
                CornerRadius = new CornerRadius(10),
                Background = new SolidColorBrush(Color.FromArgb(30, accent.R, accent.G, accent.B)),
                BorderBrush = new SolidColorBrush(Color.FromArgb(110, accent.R, accent.G, accent.B)),
                BorderThickness = new Thickness(1),
                Padding = new Thickness(10, 6),
                HorizontalAlignment = HorizontalAlignment.Left,
                Child = new TextBlock
                {
                    Text = $"STORM DS {badgeVer}",
                    FontFamily = new FontFamily("Consolas, Cascadia Mono, monospace"),
                    FontWeight = FontWeight.Bold,
                    FontSize = 12.5,
                    Foreground = new SolidColorBrush(accent)
                }
            });
        }

        string msg = isError
            ? (result?.ErrorMessage ?? StormDsLoc.T("UpdateModalErrorDefault"))
            : string.Format(StormDsLoc.T("UpdateModalUpToDateFormat"), badgeVer, result?.SourceMirror ?? "GitHub");

        _bodyHost.Children.Add(new TextBlock
        {
            Text = msg,
            FontSize = 13,
            Foreground = theme.TextSecondaryBrush,
            TextWrapping = TextWrapping.Wrap,
            LineHeight = 19
        });

        var infoBtnRow = new Grid
        {
            ColumnDefinitions = isError && _onRetryCallback != null
                ? new ColumnDefinitions("*,*")
                : new ColumnDefinitions("*"),
            ColumnSpacing = 8,
            Margin = new Thickness(0, 4, 0, 0)
        };

        int okCol = 0;
        if (isError && _onRetryCallback != null)
        {
            var retryBtn = CreateSecondaryButton(StormDsLoc.T("UpdateModalRetry"), theme, () => _onRetryCallback());
            infoBtnRow.Children.Add(retryBtn);
            okCol = 1;
        }

        var okBtn = new AuroraVolumetricButton
        {
            IsHero = true,
            Height = 38,
            HorizontalAlignment = HorizontalAlignment.Stretch,
            Content = new TextBlock
            {
                Text = StormDsLoc.T("UpdateModalOk"),
                FontSize = 13,
                FontWeight = FontWeight.Bold,
                Foreground = Brushes.White,
                HorizontalAlignment = HorizontalAlignment.Center,
                VerticalAlignment = VerticalAlignment.Center
            }
        };
        okBtn.Click += (s, e) => CloseRequested?.Invoke();
        infoBtnRow.Children.Add(okBtn);
        Grid.SetColumn(okBtn, okCol);
        _bodyHost.Children.Add(infoBtnRow);
    }

    private async Task StartDownloadAsync(AuroraUpdateCheckResult result)
    {
        if (_isDownloading || string.IsNullOrWhiteSpace(result.DownloadUrl)) return;

        _isDownloading = true;
        _downloadCts = new CancellationTokenSource();
        if (_actionsPanel != null) _actionsPanel.IsVisible = false;
        if (_progressCard != null) _progressCard.IsVisible = true;

        string assetName = !string.IsNullOrWhiteSpace(result.AssetName)
            ? result.AssetName
            : $"STORM_DS_{result.LatestVersion}_Setup.exe";
        string destDir = Path.Combine(Path.GetTempPath(), "STORM_DS_Updates");
        string destPath = Path.Combine(destDir, assetName);

        var progress = new Progress<AuroraDownloadProgress>(p =>
        {
            Dispatcher.UIThread.Post(() =>
            {
                if (_progressBar == null || _progressLeftText == null || _progressSpeedText == null || _progressPercentText == null)
                    return;

                double dlMb = p.DownloadedBytes / (1024.0 * 1024.0);
                long effectiveTotal = p.TotalBytes > 0 ? p.TotalBytes : result.AssetSizeBytes;
                if (effectiveTotal > 0)
                {
                    double totMb = effectiveTotal / (1024.0 * 1024.0);
                    double pct = Math.Clamp((double)p.DownloadedBytes * 100.0 / effectiveTotal, 0.0, 100.0);
                    _progressBar.IsIndeterminate = false;
                    _progressBar.Value = pct;
                    _progressLeftText.Text = $"{dlMb.ToString("F1", CultureInfo.InvariantCulture)} / {totMb.ToString("F1", CultureInfo.InvariantCulture)} {StormDsLoc.T("UpdateModalUnitMb")}";
                    _progressPercentText.Text = $"{(int)pct}%";
                }
                else
                {
                    _progressBar.IsIndeterminate = true;
                    _progressLeftText.Text = dlMb > 0.05
                        ? $"{dlMb.ToString("F1", CultureInfo.InvariantCulture)} {StormDsLoc.T("UpdateModalUnitMb")}"
                        : StormDsLoc.T("UpdateModalPreparing");
                    _progressPercentText.Text = string.Empty;
                }

                _progressSpeedText.Text = p.SpeedMbPerSec > 0.05
                    ? $"{p.SpeedMbPerSec.ToString("F1", CultureInfo.InvariantCulture)} {StormDsLoc.T("UpdateModalUnitMbPerSec")}"
                    : string.Empty;
            });
        });

        try
        {
            var updater = new AuroraDualMirrorUpdater();
            bool ok = await updater.DownloadAndVerifyAsync(
                result.DownloadUrl,
                destPath,
                result.ExpectedSha256,
                progress,
                _downloadCts.Token,
                "STORM_DS");

            _isDownloading = false;

            if (!ok)
            {
                UpdateState(UpdateModalMode.Error, result with
                {
                    ErrorMessage = StormDsLoc.T("UpdateModalDownloadIntegrityError")
                });
                return;
            }

            AuroraTactileFeedbackService.Instance.PlayAchievementChime();
            if (destPath.EndsWith(".exe", StringComparison.OrdinalIgnoreCase))
            {
                Process.Start(new ProcessStartInfo(destPath) { UseShellExecute = true });
                CloseRequested?.Invoke();
            }
            else
            {
                Process.Start(new ProcessStartInfo("explorer.exe", $"/select,\"{destPath}\"") { UseShellExecute = true });
                CloseRequested?.Invoke();
            }
        }
        catch (OperationCanceledException)
        {
            _isDownloading = false;
            RenderState(UpdateModalMode.UpdateAvailable, result);
        }
        catch (Exception ex)
        {
            _isDownloading = false;
            UpdateState(UpdateModalMode.Error, result with
            {
                ErrorMessage = string.Format(StormDsLoc.T("UpdateModalDownloadErrorFormat"), ex.Message)
            });
        }
    }

    private void SetHeaderTint(Color c)
    {
        _headerIcon.CustomColorOverride = new SolidColorBrush(c);
        _iconBox.Background = new SolidColorBrush(Color.FromArgb(36, c.R, c.G, c.B));
        _iconBox.BorderBrush = new SolidColorBrush(Color.FromArgb(115, c.R, c.G, c.B));
    }

    private static AuroraUpdateDownloadSource ResolveInitialSource(AuroraUpdateCheckResult result)
    {
        var pref = (AuroraUpdateDownloadSource)Math.Clamp(StormDsUiState.Instance.AppConfig.UpdateDownloadSource, 0, 2);
        if (pref == AuroraUpdateDownloadSource.StormGamesWorld && result.StormMirrorSource != null)
            return AuroraUpdateDownloadSource.StormGamesWorld;
        if (pref == AuroraUpdateDownloadSource.GitHub && result.GitHubSource != null)
            return AuroraUpdateDownloadSource.GitHub;
        if (result.SourceMirror.Contains("STORM GAMES WORLD", StringComparison.OrdinalIgnoreCase))
            return AuroraUpdateDownloadSource.StormGamesWorld;
        return AuroraUpdateDownloadSource.GitHub;
    }

    private static Border BuildVersionPill(string label, string version, bool accent, AuroraThemeDefinition theme)
    {
        var accentColor = theme.DefaultAccentColor;
        var box = new Border
        {
            CornerRadius = new CornerRadius(10),
            Padding = new Thickness(10, 7),
            Background = accent
                ? new SolidColorBrush(Color.FromArgb(36, accentColor.R, accentColor.G, accentColor.B))
                : new SolidColorBrush(theme.BackgroundColor),
            BorderBrush = accent
                ? new SolidColorBrush(Color.FromArgb(120, accentColor.R, accentColor.G, accentColor.B))
                : theme.BorderBrush,
            BorderThickness = new Thickness(1)
        };
        var col = new StackPanel
        {
            Spacing = 2,
            HorizontalAlignment = HorizontalAlignment.Center
        };
        col.Children.Add(new TextBlock
        {
            Text = label,
            FontSize = 10.5,
            Foreground = theme.TextSecondaryBrush,
            HorizontalAlignment = HorizontalAlignment.Center
        });
        col.Children.Add(new TextBlock
        {
            Text = version,
            FontSize = 14,
            FontWeight = FontWeight.Bold,
            FontFamily = new FontFamily("Consolas, Cascadia Mono, monospace"),
            Foreground = accent ? new SolidColorBrush(accentColor) : theme.TextPrimaryBrush,
            HorizontalAlignment = HorizontalAlignment.Center
        });
        box.Child = col;
        return box;
    }

    private static Border BuildMetaChip(AuroraIconKind iconKind, string text, AuroraThemeDefinition theme, bool highlighted)
    {
        var accent = theme.DefaultAccentColor;
        var chip = new Border
        {
            CornerRadius = new CornerRadius(9),
            Margin = new Thickness(0, 0, 8, 4),
            Padding = new Thickness(9, 5),
            Background = highlighted
                ? new SolidColorBrush(Color.FromArgb(30, accent.R, accent.G, accent.B))
                : new SolidColorBrush(theme.HeaderColor),
            BorderBrush = highlighted
                ? new SolidColorBrush(Color.FromArgb(100, accent.R, accent.G, accent.B))
                : theme.BorderBrush,
            BorderThickness = new Thickness(1)
        };
        var row = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 5 };
        row.Children.Add(new AuroraVectorIcon
        {
            Kind = iconKind,
            Size = 13,
            CustomColorOverride = highlighted ? new SolidColorBrush(accent) : theme.TextSecondaryBrush,
            VerticalAlignment = VerticalAlignment.Center
        });
        row.Children.Add(new TextBlock
        {
            Text = text,
            FontSize = 11,
            FontFamily = new FontFamily("Consolas, Cascadia Mono, monospace"),
            Foreground = highlighted ? theme.TextPrimaryBrush : theme.TextSecondaryBrush,
            VerticalAlignment = VerticalAlignment.Center
        });
        chip.Child = row;
        return chip;
    }

    private static Border CreateSecondaryButton(string text, AuroraThemeDefinition theme, Action onClick)
    {
        var baseBg = new SolidColorBrush(theme.HeaderColor);
        var hoverBg = new SolidColorBrush(Color.FromArgb(60, theme.DefaultAccentColor.R, theme.DefaultAccentColor.G, theme.DefaultAccentColor.B));

        var btn = new Border
        {
            Height = 36,
            CornerRadius = new CornerRadius(11),
            Background = baseBg,
            BorderBrush = theme.BorderBrush,
            BorderThickness = new Thickness(1),
            Padding = new Thickness(10, 0),
            Cursor = new Cursor(StandardCursorType.Hand)
        };
        btn.Child = new TextBlock
        {
            Text = text,
            FontSize = 12.5,
            FontWeight = FontWeight.SemiBold,
            Foreground = theme.TextPrimaryBrush,
            HorizontalAlignment = HorizontalAlignment.Center,
            VerticalAlignment = VerticalAlignment.Center,
            TextTrimming = TextTrimming.CharacterEllipsis
        };
        btn.PointerEntered += (s, e) => btn.Background = hoverBg;
        btn.PointerExited += (s, e) => btn.Background = baseBg;
        btn.PointerPressed += (s, e) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            onClick();
        };
        return btn;
    }

    private static readonly Regex s_langStartTagRegex = new(
        @"<!--\s*lang\s*:\s*([a-zA-Z_-]+)\s*-->",
        RegexOptions.IgnoreCase | RegexOptions.Compiled);

    private static readonly Regex s_langEndTagRegex = new(
        @"<!--\s*/lang\s*-->",
        RegexOptions.IgnoreCase | RegexOptions.Compiled);

    public static string NormalizeReleaseLocaleCode(string? raw)
    {
        if (string.IsNullOrWhiteSpace(raw)) return string.Empty;
        string clean = raw.Trim().ToLowerInvariant().Replace('_', '-');
        if (clean == "in") return "id";
        if (clean.StartsWith("in-", StringComparison.Ordinal)) return "id-" + clean[3..];
        if (clean == "iw") return "he";
        if (clean.StartsWith("iw-", StringComparison.Ordinal)) return "he-" + clean[3..];
        return clean;
    }

    public static string? MatchReleaseLanguageHeading(string? rawHeading)
    {
        if (string.IsNullOrWhiteSpace(rawHeading)) return null;
        string cleaned = rawHeading.Trim().TrimStart('#').Trim().TrimEnd(':', '：').Trim();
        if (cleaned.StartsWith('[') && cleaned.EndsWith(']') && cleaned.Length >= 2)
        {
            cleaned = cleaned[1..^1].Trim();
        }
        return NormalizeReleaseLocaleCode(cleaned) switch
        {
            "ru" or "русский" or "russian" => "ru",
            "en" or "english" or "английский" => "en",
            "de" or "deutsch" or "german" or "немецкий" => "de",
            "es" or "español" or "espanol" or "spanish" or "испанский" => "es",
            "fr" or "français" or "francais" or "french" or "французский" => "fr",
            "id" or "in" or "indonesian" or "bahasa indonesia" or "индонезийский" => "id",
            "it" or "italiano" or "italian" or "итальянский" => "it",
            "ja" or "jp" or "日本語" or "japanese" or "японский" => "ja",
            "pt-br" or "pt" or "português" or "portugues" or "português (brasil)" or "portugues (brasil)" or "portuguese" or "португальский" => "pt-br",
            "zh-hans" or "zh-cn" or "zh" or "简体中文" or "中文" or "chinese" or "chinese (simplified)" or "китайский" => "zh-hans",
            "ko" or "kr" or "한국어" or "korean" or "корейский" => "ko",
            "hi" or "हिन्दी" or "हिंदी" or "hindi" or "хинди" => "hi",
            _ => null
        };
    }

    public static string SelectLocalizedReleaseNotes(string? raw, string? languageCode = null)
    {
        if (string.IsNullOrWhiteSpace(raw)) return string.Empty;
        string normalizedRaw = raw.Replace("\r\n", "\n");
        string[] lines = normalizedRaw.Split('\n');

        // Pass 1: explicit <!-- lang:XX --> ... <!-- /lang --> blocks
        var markerSections = new Dictionary<string, List<string>>(StringComparer.OrdinalIgnoreCase);
        var markerOrder = new List<string>();
        string? activeMarkerLang = null;
        foreach (string line in lines)
        {
            var startMatch = s_langStartTagRegex.Match(line);
            if (startMatch.Success)
            {
                activeMarkerLang = NormalizeReleaseLocaleCode(startMatch.Groups[1].Value);
                if (!markerSections.ContainsKey(activeMarkerLang))
                {
                    markerSections[activeMarkerLang] = new List<string>();
                    markerOrder.Add(activeMarkerLang);
                }
                continue;
            }
            if (s_langEndTagRegex.IsMatch(line))
            {
                activeMarkerLang = null;
                continue;
            }
            if (activeMarkerLang != null)
            {
                markerSections[activeMarkerLang].Add(line);
            }
        }

        var sections = new Dictionary<string, string>(StringComparer.OrdinalIgnoreCase);
        var order = new List<string>();
        if (markerSections.Count >= 2)
        {
            foreach (string key in markerOrder)
            {
                string val = string.Join("\n", markerSections[key]).Trim();
                if (!string.IsNullOrWhiteSpace(val))
                {
                    sections[key] = val;
                    order.Add(key);
                }
            }
        }
        else
        {
            // Pass 2: Markdown headings like ## Русский / ## English / ### Deutsch
            var headingSections = new Dictionary<string, List<string>>(StringComparer.OrdinalIgnoreCase);
            var headingOrder = new List<string>();
            string? currentHeadingLang = null;
            foreach (string line in lines)
            {
                string trimmed = line.Trim();
                if (s_langStartTagRegex.IsMatch(trimmed) || s_langEndTagRegex.IsMatch(trimmed))
                {
                    continue;
                }
                if (trimmed.StartsWith("## ", StringComparison.Ordinal) || trimmed.StartsWith("### ", StringComparison.Ordinal))
                {
                    string? detected = MatchReleaseLanguageHeading(trimmed);
                    if (detected != null)
                    {
                        currentHeadingLang = detected;
                        if (!headingSections.ContainsKey(detected))
                        {
                            headingSections[detected] = new List<string>();
                            headingOrder.Add(detected);
                        }
                        continue;
                    }
                }
                if (currentHeadingLang != null)
                {
                    headingSections[currentHeadingLang].Add(line);
                }
            }
            foreach (string key in headingOrder)
            {
                string val = string.Join("\n", headingSections[key]).Trim();
                if (!string.IsNullOrWhiteSpace(val))
                {
                    sections[key] = val;
                    order.Add(key);
                }
            }
        }

        if (sections.Count < 2)
        {
            return string.Join("\n", lines.Where(l => !s_langStartTagRegex.IsMatch(l) && !s_langEndTagRegex.IsMatch(l))).Trim();
        }

        string rawLocale = !string.IsNullOrWhiteSpace(languageCode)
            ? languageCode
            : (!string.IsNullOrWhiteSpace(StormDsLoc.CurrentLanguage)
                ? StormDsLoc.CurrentLanguage
                : CultureInfo.CurrentUICulture.Name);
        string fullNorm = NormalizeReleaseLocaleCode(rawLocale);
        string baseLang = fullNorm.Split('-')[0];

        var candidates = new List<string>();
        if (!string.IsNullOrEmpty(fullNorm)) candidates.Add(fullNorm);
        if (baseLang == "zh") candidates.Add("zh-hans");
        if (baseLang == "pt") candidates.Add("pt-br");
        if (!string.IsNullOrEmpty(baseLang) && !candidates.Contains(baseLang, StringComparer.OrdinalIgnoreCase))
        {
            candidates.Add(baseLang);
        }
        candidates.Add("en");
        candidates.Add("ru");

        foreach (string candidate in candidates)
        {
            if (sections.TryGetValue(candidate, out string? exact) && !string.IsNullOrWhiteSpace(exact))
            {
                return exact;
            }
            string candBase = candidate.Split('-')[0];
            foreach (string key in order)
            {
                if (key.Split('-')[0].Equals(candBase, StringComparison.OrdinalIgnoreCase) && !string.IsNullOrWhiteSpace(sections[key]))
                {
                    return sections[key];
                }
            }
        }

        foreach (string key in order)
        {
            if (!string.IsNullOrWhiteSpace(sections[key])) return sections[key];
        }
        return raw.Trim();
    }

    private static void PopulateReleaseNotes(StackPanel host, string rawMd, AuroraThemeDefinition theme)
    {
        rawMd = SelectLocalizedReleaseNotes(rawMd);
        var accentBrush = new SolidColorBrush(theme.DefaultAccentColor);
        var lines = rawMd.Replace("\r\n", "\n").Split('\n');

        foreach (var rawLine in lines)
        {
            string line = s_htmlTagRegex.Replace(rawLine, string.Empty).Trim();
            if (line.StartsWith('>')) line = line[1..].Trim();
            if (string.IsNullOrEmpty(line)) continue;

            if (line == "---" || line == "***" || line == "___")
            {
                host.Children.Add(new Border
                {
                    Height = 1,
                    Margin = new Thickness(0, 3),
                    Background = theme.BorderBrush
                });
                continue;
            }

            if (line.StartsWith("### ") || line.StartsWith("## ") || line.StartsWith("# "))
            {
                bool isLarge = !line.StartsWith("### ");
                string heading = line.TrimStart('#').Trim();
                var hRow = new StackPanel
                {
                    Orientation = Orientation.Horizontal,
                    Spacing = 8,
                    Margin = new Thickness(0, isLarge ? 4 : 2, 0, 0)
                };
                hRow.Children.Add(new Border
                {
                    Width = 3,
                    Height = 14,
                    CornerRadius = new CornerRadius(1.5),
                    Background = accentBrush,
                    VerticalAlignment = VerticalAlignment.Center
                });
                var tb = BuildInlineTextBlock(heading, isLarge ? 13 : 12, true, theme.TextPrimaryBrush, theme.TextPrimaryBrush, accentBrush);
                hRow.Children.Add(tb);
                host.Children.Add(hRow);
                continue;
            }

            if (line.StartsWith("- ") || line.StartsWith("* "))
            {
                string item = line[2..].Trim();
                var bGrid = new Grid
                {
                    Margin = new Thickness(4, 0, 0, 0),
                    ColumnDefinitions = new ColumnDefinitions("Auto,*")
                };
                var bullet = new TextBlock
                {
                    Text = "-",
                    FontSize = 12,
                    FontWeight = FontWeight.Bold,
                    FontFamily = new FontFamily("Consolas, Cascadia Mono, monospace"),
                    Foreground = accentBrush,
                    Margin = new Thickness(0, 0, 7, 0)
                };
                var tb = BuildInlineTextBlock(item, 12, false, theme.TextSecondaryBrush, theme.TextPrimaryBrush, accentBrush);
                bGrid.Children.Add(bullet);
                bGrid.Children.Add(tb);
                Grid.SetColumn(tb, 1);
                host.Children.Add(bGrid);
                continue;
            }

            if (line.StartsWith('|') && line.EndsWith('|'))
            {
                var cells = line.Trim('|').Split('|').Select(c => c.Trim()).ToList();
                bool isAlignRow = cells.Count > 0 && cells.All(c => c.Length > 0 && c.All(ch => ch is '-' or ':' or ' '));
                if (!isAlignRow && cells.Any(c => !string.IsNullOrEmpty(c)))
                {
                    host.Children.Add(new Border
                    {
                        CornerRadius = new CornerRadius(7),
                        Background = new SolidColorBrush(Color.FromArgb(40, theme.HeaderColor.R, theme.HeaderColor.G, theme.HeaderColor.B)),
                        Padding = new Thickness(8, 4),
                        Child = new TextBlock
                        {
                            Text = string.Join(" | ", cells),
                            FontSize = 11,
                            FontFamily = new FontFamily("Consolas, Cascadia Mono, monospace"),
                            Foreground = theme.TextSecondaryBrush,
                            TextWrapping = TextWrapping.Wrap
                        }
                    });
                }
                continue;
            }

            host.Children.Add(BuildInlineTextBlock(line, 12, false, theme.TextSecondaryBrush, theme.TextPrimaryBrush, accentBrush));
        }
    }

    private static TextBlock BuildInlineTextBlock(
        string text,
        double fontSize,
        bool defaultBold,
        IBrush baseBrush,
        IBrush boldBrush,
        IBrush codeBrush)
    {
        var tb = new TextBlock
        {
            FontSize = fontSize,
            TextWrapping = TextWrapping.Wrap,
            LineHeight = fontSize + 5,
            Foreground = baseBrush
        };
        var inlines = tb.Inlines ??= new InlineCollection();

        int i = 0;
        while (i < text.Length)
        {
            if (text.AsSpan(i).StartsWith("**"))
            {
                int end = text.IndexOf("**", i + 2, StringComparison.Ordinal);
                if (end > i + 2)
                {
                    inlines.Add(new Run(text[(i + 2)..end]) { FontWeight = FontWeight.Bold, Foreground = boldBrush });
                    i = end + 2;
                    continue;
                }
                inlines.Add(new Run("**") { FontWeight = defaultBold ? FontWeight.Bold : FontWeight.Normal, Foreground = baseBrush });
                i += 2;
                continue;
            }

            if (text[i] == '`')
            {
                int end = text.IndexOf('`', i + 1);
                if (end > i + 1)
                {
                    inlines.Add(new Run(text[(i + 1)..end])
                    {
                        FontFamily = new FontFamily("Consolas, Cascadia Mono, monospace"),
                        FontWeight = FontWeight.Medium,
                        Foreground = codeBrush
                    });
                    i = end + 1;
                    continue;
                }
                inlines.Add(new Run("`") { FontWeight = defaultBold ? FontWeight.Bold : FontWeight.Normal, Foreground = baseBrush });
                i += 1;
                continue;
            }

            int nextBold = text.IndexOf("**", i, StringComparison.Ordinal);
            int nextCode = text.IndexOf('`', i);
            int next = text.Length;
            if (nextBold >= 0 && nextBold < next) next = nextBold;
            if (nextCode >= 0 && nextCode < next) next = nextCode;
            if (next == i) next = i + 1;

            inlines.Add(new Run(text[i..next])
            {
                FontWeight = defaultBold ? FontWeight.Bold : FontWeight.Normal,
                Foreground = baseBrush
            });
            i = next;
        }

        return tb;
    }

    private static void OpenExternalUrl(string url)
    {
        try
        {
            Process.Start(new ProcessStartInfo(url) { UseShellExecute = true });
        }
        catch
        {
            // Ignore browser launch failures
        }
    }
}
