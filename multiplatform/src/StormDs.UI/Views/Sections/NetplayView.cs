// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Layout;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using StormDs.Core.Subsystems;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Sections;

/// <summary>
/// Netplay and Nintendo WFC control panel section.
/// Displays active DNS redirection IP, LAN Mesh discovery state, UDP peer list, and broadcast actions.
/// </summary>
public class NetplayView : ScrollViewer
{
    private readonly TextBlock _dnsStatusText;
    private readonly TextBlock _lanStatusText;
    private readonly TextBlock _actionNoteText;
    private readonly StackPanel _peersStack;

    public NetplayView()
    {
        Margin = new Thickness(16, 8, 16, 8);
        Padding = new Thickness(0, 0, 14, 0);

        var rootStack = new StackPanel { Spacing = 14 };

        var card = new AuroraGlassCard { Padding = new Thickness(18), SpotlightEnabled = true };
        var stack = new StackPanel { Spacing = 10 };

        var titleRow = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 8, VerticalAlignment = VerticalAlignment.Center };
        titleRow.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.WifiGlobe, Size = 22, VerticalAlignment = VerticalAlignment.Center });
        var titleBlock = new TextBlock { Text = "СЕТЕВАЯ ИГРА WFC И LAN MESH", FontSize = 15, FontWeight = FontWeight.Bold };
        titleRow.Children.Add(titleBlock);
        stack.Children.Add(titleRow);

        _dnsStatusText = new TextBlock { FontSize = 12.5 };
        _lanStatusText = new TextBlock { FontSize = 12 };
        _actionNoteText = new TextBlock { FontSize = 11.5 };
        stack.Children.Add(_dnsStatusText);
        stack.Children.Add(_lanStatusText);

        var btnRow = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 10 };
        btnRow.Children.Add(CreateBtn(AuroraIconKind.LanMesh, "Объявить сессию в LAN", async () =>
        {
            var rom = StormDsUiState.Instance.SelectedRom;
            string code = rom?.GameCode ?? "NTR0";
            string title = rom?.GetDisplayTitle(StormDsUiState.Instance.AppConfig.Language) ?? "FreeBIOS";
            int port = StormDsUiState.Instance.AppConfig.LanPort > 0
                ? StormDsUiState.Instance.AppConfig.LanPort
                : NetplayWfcService.DefaultLanPort;
            await StormDsUiState.Instance.NetplayService.BroadcastSessionAnnouncementAsync(code, title, port);
            _actionNoteText.Text = $"Широковещательный анонс отправлен: {title} (UDP:{port})";
            RefreshData();
        }));
        btnRow.Children.Add(CreateBtn(AuroraIconKind.ResetCycle, "Обновить пиры", RefreshData));
        btnRow.Children.Add(CreateBtn(AuroraIconKind.SettingsCore, "Параметры WFC", () =>
        {
            StormDsUiState.Instance.SetNavSection(NavSectionKind.Settings);
        }));
        stack.Children.Add(btnRow);
        stack.Children.Add(_actionNoteText);

        card.Content = stack;
        rootStack.Children.Add(card);

        var peersCard = new AuroraGlassCard { Padding = new Thickness(16), SpotlightEnabled = true };
        var peersRoot = new StackPanel { Spacing = 8 };
        var peersHeader = new TextBlock { Text = "ОБНАРУЖЕННЫЕ ИГРОВЫЕ УЗЛЫ В ЛОКАЛЬНОЙ СЕТИ", FontSize = 11, FontWeight = FontWeight.Bold };
        peersRoot.Children.Add(peersHeader);
        _peersStack = new StackPanel { Spacing = 6 };
        peersRoot.Children.Add(_peersStack);
        peersCard.Content = peersRoot;
        rootStack.Children.Add(peersCard);

        Content = rootStack;

        StormThemeBrushes.BindTheme(this, () =>
        {
            titleBlock.Foreground = StormThemeBrushes.Accent;
            _dnsStatusText.Foreground = StormThemeBrushes.PrimaryText;
            _lanStatusText.Foreground = StormThemeBrushes.SecondaryText;
            _actionNoteText.Foreground = StormThemeBrushes.AccentSecondary;
            peersHeader.Foreground = StormThemeBrushes.SecondaryText;
            RefreshData();
        });

        StormDsUiState.Instance.SettingsSaved += RefreshData;
        RefreshData();
    }

    public void RefreshData()
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        string dns = NetplayWfcService.ResolveDnsAddress(cfg.WfcDnsPreset, cfg.WfcCustomDns);
        _dnsStatusText.Text = $"Активный сервер WFC: {cfg.WfcDnsPreset} ({dns})";
        int port = cfg.LanPort > 0 ? cfg.LanPort : NetplayWfcService.DefaultLanPort;
        _lanStatusText.Text = cfg.LanDiscoveryEnabled
            ? $"LAN Mesh активен на UDP порту {port}"
            : "LAN Mesh поиск отключен в настройках";

        _peersStack.Children.Clear();
        var peers = StormDsUiState.Instance.NetplayService.DiscoveredPeers;
        if (peers.Count == 0)
        {
            _peersStack.Children.Add(new TextBlock
            {
                Text = "Активные игроки в локальной сети не найдены. Нажмите 'Объявить сессию в LAN' для проверки.",
                FontSize = 12,
                Foreground = StormThemeBrushes.SecondaryText,
                TextWrapping = TextWrapping.Wrap
            });
            return;
        }

        foreach (var peer in peers)
        {
            var row = new Border
            {
                Padding = new Thickness(12, 8),
                CornerRadius = new CornerRadius(8),
                Background = StormThemeBrushes.RowSurface,
                BorderBrush = StormThemeBrushes.SubtleBorder,
                BorderThickness = new Thickness(1)
            };
            var sp = new StackPanel { Spacing = 2 };
            sp.Children.Add(new TextBlock { Text = $"{peer.HostName} - {peer.GameTitle}", FontSize = 12.5, FontWeight = FontWeight.SemiBold, Foreground = StormThemeBrushes.PrimaryText });
            sp.Children.Add(new TextBlock { Text = $"{peer.EndPoint} | {peer.GameCode} | Игроков: {peer.PlayerCount}/{peer.MaxPlayers}", FontSize = 10.5, Foreground = StormThemeBrushes.SecondaryText });
            row.Child = sp;
            _peersStack.Children.Add(row);
        }
    }

    private static AuroraVolumetricButton CreateBtn(AuroraIconKind icon, string text, Action onClick)
    {
        var btn = new AuroraVolumetricButton { Height = 32, Padding = new Thickness(12, 2) };
        var sp = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 6, VerticalAlignment = VerticalAlignment.Center };
        sp.Children.Add(new AuroraVectorIcon { Kind = icon, Size = 14, VerticalAlignment = VerticalAlignment.Center });
        sp.Children.Add(new TextBlock { Text = text, FontSize = 11.5, FontWeight = FontWeight.SemiBold, Foreground = Brushes.White, VerticalAlignment = VerticalAlignment.Center });
        btn.Content = sp;
        btn.Click += (_, _) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            onClick();
        };
        return btn;
    }
}
