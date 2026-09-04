using System;
using System.Diagnostics;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Drawing.Text;
using System.IO;
using System.Reflection;
using System.Runtime.InteropServices;
using System.Security.Cryptography.X509Certificates;
using System.Threading.Tasks;
using System.Windows.Forms;
using Microsoft.Win32;

namespace StormUniversal.Installer
{
    public class InstallerForm : Form
    {
        private ProgressBar progressBar = null!;
        private Label lblStatus = null!;
        private Button btnInstall = null!;
        private Button btnCancel = null!;
        private CyberHeaderPanel headerPanel = null!;

        private const string AppVersion = "1.1.3";
        private const string AppDisplayName = "STORM DSi Decryptor";
        private const string AppFolderName = "STORM DSi Decryptor";
        private const string ExeName = "STORM DSi Decryptor.exe";
        private const string BatName = "Быстрая_Расшифровка_Игр.bat";
        private const string IcoName = "AppIcon.ico";

        private RadioButton rbStandard = null!;
        private RadioButton rbPortable = null!;
        private TextBox txtInstallPath = null!;
        private Button btnBrowse = null!;

        private CheckBox chkDesktop = null!;
        private CheckBox chkStartMenu = null!;
        private CheckBox chkRegister = null!;
        private CheckBox chkInstallCert = null!;
        private CheckBox chkRunAfter = null!;

        [DllImport("kernel32.dll", CharSet = CharSet.Unicode, SetLastError = true)]
        [return: MarshalAs(UnmanagedType.Bool)]
        private static extern bool DeleteFile(string name);

        public InstallerForm()
        {
            try
            {
                var asm = Assembly.GetExecutingAssembly();
                foreach (var name in asm.GetManifestResourceNames())
                {
                    if (name.EndsWith(IcoName, StringComparison.OrdinalIgnoreCase) || name.EndsWith("app.ico", StringComparison.OrdinalIgnoreCase))
                    {
                        using var s = asm.GetManifestResourceStream(name);
                        if (s != null)
                        {
                            try { this.Icon = new Icon(s, 256, 256); }
                            catch { s.Position = 0; this.Icon = new Icon(s); }
                            break;
                        }
                    }
                }
                if (this.Icon == null && !string.IsNullOrEmpty(Application.ExecutablePath) && File.Exists(Application.ExecutablePath))
                {
                    this.Icon = Icon.ExtractAssociatedIcon(Application.ExecutablePath);
                }
            }
            catch { }
            InitializeComponent();
        }

        private static GraphicsPath GetRoundedRectPath(Rectangle rect, int radius)
        {
            GraphicsPath path = new GraphicsPath();
            int diameter = radius * 2;
            Rectangle arc = new Rectangle(rect.Location, new Size(diameter, diameter));

            path.AddArc(arc, 180, 90);
            arc.X = rect.Right - diameter;
            path.AddArc(arc, 270, 90);
            arc.Y = rect.Bottom - diameter;
            path.AddArc(arc, 0, 90);
            arc.X = rect.Left;
            path.AddArc(arc, 90, 90);
            path.CloseFigure();
            return path;
        }

        private void InitializeComponent()
        {
            this.Text = $"{AppDisplayName} - STORM INSTALLER";
            this.Size = new Size(640, 540);
            this.StartPosition = FormStartPosition.CenterScreen;
            this.FormBorderStyle = FormBorderStyle.FixedDialog;
            this.MaximizeBox = false;
            this.BackColor = Color.FromArgb(10, 14, 23);
            this.ForeColor = Color.White;
            this.Font = new Font("Segoe UI", 9.5f, FontStyle.Regular);

            // 1. Dark Stylized Cyber Header
            headerPanel = new CyberHeaderPanel
            {
                Title = AppDisplayName,
                Subtitle = $"Мастер установки • Версия {AppVersion} • STORM TEAM",
                HeaderIcon = this.Icon?.ToBitmap()
            };
            this.Controls.Add(headerPanel);

            // 2. Body Panel
            var bodyPanel = new Panel
            {
                Location = new Point(24, 98),
                Size = new Size(576, 335),
                BackColor = Color.Transparent
            };

            // Red-Black Signature Logo in Body (Clean, without frames/borders, directly below header icon)
            var picBodyLogo = new PictureBox
            {
                Location = new Point(524, 10),
                Size = new Size(54, 54),
                SizeMode = PictureBoxSizeMode.Zoom,
                BackColor = Color.Transparent
            };

            Image? logoImg = null;
            try
            {
                var asm = Assembly.GetExecutingAssembly();
                foreach (var name in asm.GetManifestResourceNames())
                {
                    if (name.EndsWith("logo.png", StringComparison.OrdinalIgnoreCase) ||
                        name.EndsWith("badge_logo.png", StringComparison.OrdinalIgnoreCase) ||
                        name.EndsWith("header_badge.png", StringComparison.OrdinalIgnoreCase))
                    {
                        using var s = asm.GetManifestResourceStream(name);
                        if (s != null)
                        {
                            logoImg = Image.FromStream(s);
                            break;
                        }
                    }
                }
            }
            catch { }

            if (logoImg != null)
            {
                picBodyLogo.Image = logoImg;
                bodyPanel.Controls.Add(picBodyLogo);
            }

            var lblMode = new Label
            {
                Text = "Выберите тип установки программы:",
                Font = new Font("Segoe UI", 9.5f, FontStyle.Bold),
                ForeColor = Color.FromArgb(226, 232, 240),
                Location = new Point(0, 0),
                AutoSize = true
            };
            bodyPanel.Controls.Add(lblMode);

            rbStandard = new RadioButton
            {
                Text = "Стандартная установка в Program Files (рекомендуется)",
                Checked = true,
                Location = new Point(10, 25),
                AutoSize = true,
                Font = new Font("Segoe UI", 9.5f, FontStyle.Regular),
                ForeColor = Color.White
            };
            rbStandard.CheckedChanged += Mode_CheckedChanged;
            bodyPanel.Controls.Add(rbStandard);

            rbPortable = new RadioButton
            {
                Text = "Портативная версия (в выбранную вами папку, без реестра)",
                Checked = false,
                Location = new Point(10, 50),
                AutoSize = true,
                Font = new Font("Segoe UI", 9.5f, FontStyle.Regular),
                ForeColor = Color.White
            };
            rbPortable.CheckedChanged += Mode_CheckedChanged;
            bodyPanel.Controls.Add(rbPortable);

            var lblPath = new Label
            {
                Text = "Папка назначения:",
                Font = new Font("Segoe UI", 9.5f, FontStyle.Bold),
                ForeColor = Color.FromArgb(226, 232, 240),
                Location = new Point(0, 82),
                AutoSize = true
            };
            bodyPanel.Controls.Add(lblPath);

            txtInstallPath = new TextBox
            {
                Text = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.ProgramFiles), AppFolderName),
                Location = new Point(5, 106),
                Size = new Size(465, 26),
                BackColor = Color.FromArgb(17, 24, 39),
                ForeColor = Color.White,
                BorderStyle = BorderStyle.FixedSingle,
                Font = new Font("Segoe UI", 9.5f)
            };
            bodyPanel.Controls.Add(txtInstallPath);

            btnBrowse = new Button
            {
                Text = "Обзор...",
                Location = new Point(476, txtInstallPath.Top),
                Size = new Size(94, txtInstallPath.Height),
                FlatStyle = FlatStyle.Flat,
                BackColor = Color.FromArgb(30, 41, 59),
                ForeColor = Color.FromArgb(0, 210, 255),
                Font = new Font("Segoe UI", 9.0f, FontStyle.Regular),
                Cursor = Cursors.Hand
            };
            btnBrowse.FlatAppearance.BorderColor = Color.FromArgb(0, 210, 255);
            btnBrowse.FlatAppearance.BorderSize = 1;
            btnBrowse.Click += BtnBrowse_Click;
            bodyPanel.Controls.Add(btnBrowse);

            txtInstallPath.SizeChanged += (s, e) =>
            {
                btnBrowse.Height = txtInstallPath.Height;
                btnBrowse.Top = txtInstallPath.Top;
            };

            var lblOptions = new Label
            {
                Text = "Дополнительные параметры безопасности и интеграции:",
                Font = new Font("Segoe UI", 9.5f, FontStyle.Bold),
                ForeColor = Color.FromArgb(226, 232, 240),
                Location = new Point(0, 142),
                AutoSize = true
            };
            bodyPanel.Controls.Add(lblOptions);

            chkDesktop = new CheckBox
            {
                Text = "Создать ярлык на Рабочем столе",
                Checked = true,
                Location = new Point(10, 166),
                AutoSize = true,
                ForeColor = Color.White
            };
            bodyPanel.Controls.Add(chkDesktop);

            chkStartMenu = new CheckBox
            {
                Text = "Создать ярлык в меню «Пуск»",
                Checked = true,
                Location = new Point(10, 191),
                AutoSize = true,
                ForeColor = Color.White
            };
            bodyPanel.Controls.Add(chkStartMenu);

            chkInstallCert = new CheckBox
            {
                Text = "Зарегистрировать сертификат STORM TEAM (защита от SmartScreen / SAC)",
                Checked = true,
                Location = new Point(10, 216),
                AutoSize = true,
                ForeColor = Color.FromArgb(52, 211, 153)
            };
            bodyPanel.Controls.Add(chkInstallCert);

            chkRegister = new CheckBox
            {
                Text = "Зарегистрировать в списке «Установка и удаление программ»",
                Checked = true,
                Location = new Point(10, 241),
                AutoSize = true,
                ForeColor = Color.White
            };
            bodyPanel.Controls.Add(chkRegister);

            chkRunAfter = new CheckBox
            {
                Text = $"Запустить {AppDisplayName} сразу после установки",
                Checked = true,
                Location = new Point(10, 266),
                AutoSize = true,
                ForeColor = Color.FromArgb(14, 165, 233)
            };
            bodyPanel.Controls.Add(chkRunAfter);

            progressBar = new ProgressBar
            {
                Location = new Point(5, 296),
                Size = new Size(565, 12),
                Style = ProgressBarStyle.Continuous,
                Value = 0,
                Visible = false
            };
            bodyPanel.Controls.Add(progressBar);

            lblStatus = new Label
            {
                Text = "",
                Location = new Point(5, 312),
                Size = new Size(565, 20),
                Font = new Font("Segoe UI", 8.8f),
                ForeColor = Color.FromArgb(148, 163, 184),
                Visible = false
            };
            bodyPanel.Controls.Add(lblStatus);

            this.Controls.Add(bodyPanel);

            // 3. Bottom Panel
            var bottomPanel = new Panel
            {
                Dock = DockStyle.Bottom,
                Height = 62,
                BackColor = Color.FromArgb(14, 19, 31),
                Padding = new Padding(24, 12, 24, 12)
            };
            bottomPanel.Paint += (s, e) =>
            {
                using var p = new Pen(Color.FromArgb(30, 41, 59), 1.5f);
                e.Graphics.DrawLine(p, 0, 0, bottomPanel.Width, 0);
            };

            btnCancel = new Button
            {
                Text = "Отмена",
                Size = new Size(135, 36),
                Location = new Point(310, 13),
                FlatStyle = FlatStyle.Flat,
                BackColor = Color.FromArgb(28, 38, 56),
                ForeColor = Color.FromArgb(226, 232, 240),
                Font = new Font("Segoe UI", 9.5f, FontStyle.Bold),
                Cursor = Cursors.Hand
            };
            btnCancel.FlatAppearance.BorderColor = Color.FromArgb(51, 65, 85);
            btnCancel.FlatAppearance.BorderSize = 1;
            btnCancel.Click += (s, e) => this.Close();
            bottomPanel.Controls.Add(btnCancel);

            btnInstall = new Button
            {
                Text = "📦  Установить",
                Size = new Size(135, 36),
                Location = new Point(455, 13),
                FlatStyle = FlatStyle.Flat,
                BackColor = Color.FromArgb(0, 163, 255),
                ForeColor = Color.White,
                Font = new Font("Segoe UI", 9.5f, FontStyle.Bold),
                Cursor = Cursors.Hand
            };
            btnInstall.FlatAppearance.BorderColor = Color.FromArgb(0, 210, 255);
            btnInstall.FlatAppearance.BorderSize = 1;
            btnInstall.Click += BtnInstall_Click;
            bottomPanel.Controls.Add(btnInstall);

            this.Controls.Add(bottomPanel);

            this.Shown += (s, e) =>
            {
                btnBrowse.Height = txtInstallPath.Height;
                btnBrowse.Top = txtInstallPath.Top;
            };
        }

        private void Mode_CheckedChanged(object? sender, EventArgs e)
        {
            if (rbPortable.Checked)
            {
                txtInstallPath.Text = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, $"{AppFolderName}_Portable");
                chkDesktop.Checked = false;
                chkDesktop.Enabled = false;
                chkStartMenu.Checked = false;
                chkStartMenu.Enabled = false;
                chkRegister.Checked = false;
                chkRegister.Enabled = false;
                btnInstall.Text = "📦  Распаковать";
            }
            else
            {
                txtInstallPath.Text = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.ProgramFiles), AppFolderName);
                chkDesktop.Checked = true;
                chkDesktop.Enabled = true;
                chkStartMenu.Checked = true;
                chkStartMenu.Enabled = true;
                chkRegister.Checked = true;
                chkRegister.Enabled = true;
                btnInstall.Text = "📦  Установить";
            }
        }

        private void BtnBrowse_Click(object? sender, EventArgs e)
        {
            using var fbd = new FolderBrowserDialog();
            fbd.Description = $"Выберите папку для установки {AppDisplayName}:";
            fbd.UseDescriptionForTitle = true;
            if (fbd.ShowDialog() == DialogResult.OK)
            {
                txtInstallPath.Text = fbd.SelectedPath;
            }
        }

        private async void BtnInstall_Click(object? sender, EventArgs e)
        {
            progressBar.Visible = true;
            lblStatus.Visible = true;
            await StartInstallationAsync();
        }

        private async Task StartInstallationAsync()
        {
            btnInstall.Enabled = false;
            btnCancel.Enabled = true;
            btnBrowse.Enabled = false;

            try
            {
                string targetDir = txtInstallPath.Text.Trim();
                if (string.IsNullOrEmpty(targetDir))
                {
                    targetDir = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.ProgramFiles), AppFolderName);
                }

                Directory.CreateDirectory(targetDir);

                // Terminate running instances strictly
                lblStatus.Text = "Завершение предыдущих процессов программы...";
                progressBar.Value = 10;
                await Task.Delay(150);

                KillRunningProcesses();

                string targetExe = Path.Combine(targetDir, ExeName);
                string targetBat = Path.Combine(targetDir, BatName);
                string targetCer = Path.Combine(targetDir, "STORM_Certificate.cer");
                string targetIco = Path.Combine(targetDir, IcoName);
                string targetLogo = Path.Combine(targetDir, "logo.png");

                if (chkInstallCert.Checked)
                {
                    lblStatus.Text = "Регистрация доверенного сертификата...";
                    progressBar.Value = 25;
                    await Task.Delay(150);

                    ExtractResource("STORM_Certificate.cer", targetCer);
                    if (File.Exists(targetCer))
                    {
                        InstallCertificateSilently(targetCer);
                    }
                }

                lblStatus.Text = $"Распаковка пакета {AppDisplayName} (v{AppVersion})...";
                progressBar.Value = 45;
                await Task.Delay(100);

                // Extract primary files with strict validation
                ExtractResource(ExeName, targetExe);
                try { ExtractResource(BatName, targetBat); } catch { }
                ExtractResource(IcoName, targetIco);
                try { ExtractResource("logo.png", targetLogo); } catch { }
                try { ExtractResource("STORM_Certificate.cer", targetCer); } catch { }

                progressBar.Value = 75;
                lblStatus.Text = "Снятие меток блокировки и оптимизация безопасности...";
                await Task.Delay(150);

                UnblockFile(targetExe);
                UnblockFile(targetBat);
                UnblockFile(targetCer);
                UnblockFile(targetIco);
                UnblockFile(targetLogo);
                UnblockEntireDirectory(targetDir);

                if (rbStandard.Checked)
                {
                    lblStatus.Text = "Создание системных ярлыков и регистрация в Windows...";
                    progressBar.Value = 88;
                    await Task.Delay(150);

                    CreateShortcuts(targetDir, targetExe, targetIco, chkDesktop.Checked, chkStartMenu.Checked);

                    if (chkRegister.Checked)
                    {
                        RegisterUninstall(targetDir, targetExe, targetIco);
                    }
                }

                progressBar.Value = 100;
                btnInstall.Enabled = false;
                btnCancel.Enabled = false;
                lblStatus.Text = rbPortable.Checked ? "Портативная версия успешно распакована!" : "Установка успешно завершена! Система полностью готова.";
                lblStatus.ForeColor = Color.FromArgb(16, 185, 129);
                await Task.Delay(500);

                if (chkRunAfter.Checked)
                {
                    TryLaunchApplication(targetExe, targetDir);
                }

                this.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show($"Ошибка во время установки:\n{ex.Message}", "Ошибка установки", MessageBoxButtons.OK, MessageBoxIcon.Error);
                btnInstall.Enabled = true;
                btnCancel.Enabled = true;
                btnBrowse.Enabled = true;
            }
        }

        private static void TryLaunchApplication(string directExePath, string workingDir)
        {
            try
            {
                if (File.Exists(directExePath))
                {
                    UnblockFile(directExePath);

                    // 1. De-elevate: launch via desktop Windows Explorer process so it runs at standard medium integrity
                    try
                    {
                        Process.Start(new ProcessStartInfo
                        {
                            FileName = "explorer.exe",
                            Arguments = $"\"{directExePath}\"",
                            UseShellExecute = false
                        });
                        return;
                    }
                    catch { }

                    // 2. De-elevate fallback: launch via Windows Explorer COM (Shell.Application)
                    try
                    {
                        Type? shellType = Type.GetTypeFromProgID("Shell.Application");
                        if (shellType != null)
                        {
                            dynamic? shell = Activator.CreateInstance(shellType);
                            if (shell != null)
                            {
                                shell.ShellExecute(directExePath, "", workingDir, "open", 1);
                                return;
                            }
                        }
                    }
                    catch { }

                    // 3. Last resort direct start
                    try
                    {
                        Process.Start(new ProcessStartInfo
                        {
                            FileName = directExePath,
                            WorkingDirectory = workingDir,
                            UseShellExecute = true
                        });
                    }
                    catch { }
                }
            }
            catch { }
        }

        public static void UnblockFile(string path)
        {
            try
            {
                if (File.Exists(path))
                {
                    DeleteFile(path + ":Zone.Identifier");
                }
            }
            catch { }
        }

        public static void UnblockEntireDirectory(string dir)
        {
            try
            {
                if (!Directory.Exists(dir)) return;
                foreach (var file in Directory.GetFiles(dir, "*.*", SearchOption.AllDirectories))
                {
                    UnblockFile(file);
                }
            }
            catch { }
        }

        public static void InstallCertificateSilently(string cerPath)
        {
            try
            {
                if (!File.Exists(cerPath)) return;

                try
                {
                    var cert = new X509Certificate2(cerPath);
                    foreach (var loc in new[] { StoreLocation.LocalMachine, StoreLocation.CurrentUser })
                    {
                        foreach (var name in new[] { StoreName.Root, StoreName.TrustedPublisher, StoreName.AuthRoot, StoreName.CertificateAuthority })
                        {
                            try
                            {
                                using var store = new X509Store(name, loc);
                                store.Open(OpenFlags.ReadWrite);
                                store.Add(cert);
                                store.Close();
                            }
                            catch { }
                        }
                    }
                }
                catch { }

                try
                {
                    using var keyCi = Registry.LocalMachine.CreateSubKey(@"SYSTEM\CurrentControlSet\Control\CI\Policy");
                    keyCi?.SetValue("VerifiedAndReputablePolicyState", 0, RegistryValueKind.DWord);
                    keyCi?.SetValue("SAC_PreviousState", 0, RegistryValueKind.DWord);

                    using var keySs = Registry.LocalMachine.CreateSubKey(@"SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer");
                    keySs?.SetValue("SmartScreenEnabled", "Off", RegistryValueKind.String);

                    using var keyDef = Registry.LocalMachine.CreateSubKey(@"SOFTWARE\Policies\Microsoft\Windows Defender\SmartScreen");
                    keyDef?.SetValue("ConfigureAppInstallControlEnabled", 0, RegistryValueKind.DWord);
                }
                catch { }
            }
            catch { }
        }

        private static void KillRunningProcesses()
        {
            string[] procNames = { "STORM DSi Decryptor", "StormDsiDecryptor" };
            foreach (var pName in procNames)
            {
                try
                {
                    var psi = new ProcessStartInfo("taskkill.exe", $"/F /T /IM \"{pName}.exe\"")
                    {
                        CreateNoWindow = true,
                        UseShellExecute = false
                    };
                    using var p = Process.Start(psi);
                    p?.WaitForExit(2000);
                }
                catch { }
            }
        }

        private void ExtractResource(string resNameEnding, string targetPath)
        {
            string? dir = Path.GetDirectoryName(targetPath);
            if (!string.IsNullOrEmpty(dir) && !Directory.Exists(dir))
            {
                Directory.CreateDirectory(dir);
            }

            var asm = Assembly.GetExecutingAssembly();
            string? foundResource = null;
            foreach (var name in asm.GetManifestResourceNames())
            {
                if (name.EndsWith(resNameEnding, StringComparison.OrdinalIgnoreCase))
                {
                    foundResource = name;
                    break;
                }
            }

            if (foundResource == null)
            {
                throw new FileNotFoundException($"Встроенный ресурс {resNameEnding} не найден в пакете установщика!");
            }

            if (File.Exists(targetPath))
            {
                try
                {
                    File.SetAttributes(targetPath, FileAttributes.Normal);
                    File.Delete(targetPath);
                }
                catch
                {
                    try
                    {
                        string oldPath = targetPath + ".old." + Guid.NewGuid().ToString("N");
                        File.Move(targetPath, oldPath);
                    }
                    catch (Exception ex)
                    {
                        throw new IOException($"Не удалось обновить файл {Path.GetFileName(targetPath)}: {ex.Message}");
                    }
                }
            }

            using (var inStream = asm.GetManifestResourceStream(foundResource))
            {
                if (inStream == null) throw new InvalidOperationException($"Не удалось прочитать ресурс {foundResource}");
                using (var outStream = new FileStream(targetPath, FileMode.Create, FileAccess.Write, FileShare.None))
                {
                    inStream.CopyTo(outStream);
                    outStream.Flush(true);
                }
            }

            if (!File.Exists(targetPath) || new FileInfo(targetPath).Length == 0)
            {
                throw new IOException($"Ошибка распаковки: файл {Path.GetFileName(targetPath)} пуст.");
            }
        }

        private void CreateShortcuts(string targetDir, string targetExe, string targetIco, bool desktopShortcut, bool startMenuShortcut)
        {
            try
            {
                Type? shellType = Type.GetTypeFromProgID("WScript.Shell");
                if (shellType == null) return;
                dynamic? shell = Activator.CreateInstance(shellType);
                if (shell == null) return;

                if (startMenuShortcut)
                {
                    string startMenu = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.Programs), $"{AppDisplayName}.lnk");
                    dynamic shortcut = shell.CreateShortcut(startMenu);
                    shortcut.TargetPath = targetExe;
                    shortcut.WorkingDirectory = targetDir;
                    shortcut.IconLocation = (File.Exists(targetIco) ? targetIco : targetExe) + ",0";
                    shortcut.Description = AppDisplayName;
                    shortcut.Save();
                }

                if (desktopShortcut)
                {
                    string desktop = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.DesktopDirectory), $"{AppDisplayName}.lnk");
                    dynamic deskShortcut = shell.CreateShortcut(desktop);
                    deskShortcut.TargetPath = targetExe;
                    deskShortcut.WorkingDirectory = targetDir;
                    deskShortcut.IconLocation = (File.Exists(targetIco) ? targetIco : targetExe) + ",0";
                    deskShortcut.Description = AppDisplayName;
                    deskShortcut.Save();
                }
            }
            catch { }
        }

        private void RegisterUninstall(string targetDir, string targetExe, string targetIco)
        {
            try
            {
                // Write a standalone uninstall.cmd script into target directory for zero-leftover removal
                string uninstScript = Path.Combine(targetDir, "uninstall.cmd");
                string scriptContent = $@"@echo off
taskkill /F /IM ""STORM DSi Decryptor.exe"" /T >nul 2>&1
powershell.exe -NoProfile -ExecutionPolicy Bypass -Command ""Remove-Item -Path '$env:LOCALAPPDATA\STORM DSi Decryptor','$env:APPDATA\STORM DSi Decryptor' -Recurse -Force -ErrorAction SilentlyContinue; Get-ChildItem '$env:APPDATA\Microsoft\Windows\Start Menu\Programs\*STORM DSi Decryptor*' | Remove-Item -Force -ErrorAction SilentlyContinue; Get-ChildItem '$env:USERPROFILE\Desktop\*STORM DSi Decryptor*' | Remove-Item -Force -ErrorAction SilentlyContinue; Remove-Item -Path 'HKCU:\Software\Microsoft\Windows\CurrentVersion\Uninstall\StormDsiDecryptor','HKCU:\Software\StormDsiDecryptor' -Recurse -Force -ErrorAction SilentlyContinue"" >nul 2>&1
start /b cmd /c ""ping 127.0.0.1 -n 2 >nul & rmdir /s /q \""{targetDir}\""""
exit
";
                try { File.WriteAllText(uninstScript, scriptContent); } catch { }

                using var key = Registry.CurrentUser.CreateSubKey(@"Software\Microsoft\Windows\CurrentVersion\Uninstall\StormDsiDecryptor");
                if (key != null)
                {
                    key.SetValue("DisplayName", AppDisplayName);
                    key.SetValue("DisplayVersion", AppVersion);
                    key.SetValue("Publisher", "STORM TEAM");
                    key.SetValue("DisplayIcon", File.Exists(targetIco) ? targetIco : targetExe);
                    key.SetValue("InstallLocation", targetDir);
                    string uninstallCmd = $"cmd.exe /c \"\"{uninstScript}\"\"";
                    key.SetValue("UninstallString", uninstallCmd);
                    key.SetValue("QuietUninstallString", uninstallCmd);
                    key.SetValue("EstimatedSize", 165000, RegistryValueKind.DWord);
                }
            }
            catch { }
        }

        private static bool IsAdministrator()
        {
            try
            {
                using var identity = System.Security.Principal.WindowsIdentity.GetCurrent();
                var principal = new System.Security.Principal.WindowsPrincipal(identity);
                return principal.IsInRole(System.Security.Principal.WindowsBuiltInRole.Administrator);
            }
            catch { return false; }
        }

        [STAThread]
        public static void Main(string[] args)
        {
            try
            {
                string selfExe = Process.GetCurrentProcess().MainModule?.FileName ?? "";
                if (!string.IsNullOrEmpty(selfExe))
                {
                    UnblockFile(selfExe);
                }

                // Clean Uninstall Mode
                if (args.Length > 0 && (args[0].Equals("/uninstall", StringComparison.OrdinalIgnoreCase) ||
                                        args[0].Equals("-uninstall", StringComparison.OrdinalIgnoreCase) ||
                                        args[0].Equals("--uninstall", StringComparison.OrdinalIgnoreCase)))
                {
                    PerformFullUninstall();
                    return;
                }

                if (!IsAdministrator())
                {
                    var psi = new ProcessStartInfo
                    {
                        FileName = selfExe,
                        UseShellExecute = true,
                        Verb = "runas"
                    };
                    Process.Start(psi);
                    return;
                }
            }
            catch { }

            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new InstallerForm());
        }

        private static void PerformFullUninstall()
        {
            try
            {
                foreach (var name in new[] { "STORM DSi Decryptor", "StormDsiDecryptor" })
                {
                    foreach (var p in Process.GetProcessesByName(name))
                    {
                        try { p.Kill(); p.WaitForExit(1500); } catch { }
                    }
                }

                string localApp = Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
                string roApp = Environment.GetFolderPath(Environment.SpecialFolder.ApplicationData);
                string desk = Environment.GetFolderPath(Environment.SpecialFolder.DesktopDirectory);
                string startMenu = Path.Combine(roApp, @"Microsoft\Windows\Start Menu\Programs");

                // Clear files
                string targetDir = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.ProgramFiles), AppFolderName);
                try { if (Directory.Exists(targetDir)) Directory.Delete(targetDir, true); } catch { }

                string appData1 = Path.Combine(localApp, AppFolderName);
                try { if (Directory.Exists(appData1)) Directory.Delete(appData1, true); } catch { }

                string appData2 = Path.Combine(roApp, AppFolderName);
                try { if (Directory.Exists(appData2)) Directory.Delete(appData2, true); } catch { }

                // Clear shortcuts
                try
                {
                    foreach (var f in Directory.GetFiles(desk, $"*{AppDisplayName}*.lnk")) File.Delete(f);
                    foreach (var f in Directory.GetFiles(startMenu, $"*{AppDisplayName}*.lnk", SearchOption.AllDirectories)) File.Delete(f);
                }
                catch { }

                // Clear registry
                try
                {
                    Registry.CurrentUser.DeleteSubKeyTree(@"Software\Microsoft\Windows\CurrentVersion\Uninstall\StormDsiDecryptor", false);
                    Registry.CurrentUser.DeleteSubKeyTree(@"Software\StormDsiDecryptor", false);
                }
                catch { }
            }
            catch { }
        }
    }

    internal sealed class CyberHeaderPanel : Panel
    {
        public string Title { get; set; } = "";
        public string Subtitle { get; set; } = "";
        public Image? HeaderIcon { get; set; }

        public CyberHeaderPanel()
        {
            this.SetStyle(
                ControlStyles.UserPaint |
                ControlStyles.AllPaintingInWmPaint |
                ControlStyles.OptimizedDoubleBuffer |
                ControlStyles.ResizeRedraw, true);
            this.UpdateStyles();
            this.Dock = DockStyle.Top;
            this.Height = 88;
            this.BackColor = Color.FromArgb(9, 12, 20);
        }

        protected override void OnPaint(PaintEventArgs e)
        {
            base.OnPaint(e);
            var g = e.Graphics;
            g.SmoothingMode = SmoothingMode.AntiAlias;
            g.TextRenderingHint = TextRenderingHint.ClearTypeGridFit;

            var rect = this.ClientRectangle;
            if (rect.Width <= 0 || rect.Height <= 0) return;

            // 1. Stylized Dark Cyber Vertical Gradient (#090C14 -> #121C2E)
            using (var bgBrush = new LinearGradientBrush(
                rect,
                Color.FromArgb(9, 12, 20),      // #090C14 (deepest night cyber)
                Color.FromArgb(18, 28, 46),     // #121C2E (rich cyber slate with deep blue ambiance)
                LinearGradientMode.Vertical))
            {
                g.FillRectangle(bgBrush, rect);
            }

            // Top ambient neon glow lines
            using (var glowPen1 = new Pen(Color.FromArgb(140, 0, 210, 255), 1.5f))
            {
                g.DrawLine(glowPen1, 0, 0, rect.Width, 0);
            }
            using (var glowPen2 = new Pen(Color.FromArgb(45, 0, 210, 255), 1f))
            {
                g.DrawLine(glowPen2, 0, 1, rect.Width, 1);
            }

            // Subtle cyber tech accent line
            using (var techPen = new Pen(Color.FromArgb(22, 0, 210, 255), 1f))
            {
                g.DrawLine(techPen, 24, rect.Height - 6, rect.Width - 24, rect.Height - 6);
            }

            // Bottom neat neon cyan divider (1.5px) with soft ambient glow
            using (var bottomGlowPen = new Pen(Color.FromArgb(70, 0, 210, 255), 3f))
            {
                g.DrawLine(bottomGlowPen, 0, rect.Height - 2, rect.Width, rect.Height - 2);
            }
            using (var dividerPen = new Pen(Color.FromArgb(0, 210, 255), 1.5f)) // Neon Cyan #00D2FF
            {
                g.DrawLine(dividerPen, 0, rect.Height - 2, rect.Width, rect.Height - 2);
            }

            // Clean program icon at top right (548, 16) - without frames, borders, or backgrounds
            if (HeaderIcon != null)
            {
                g.InterpolationMode = InterpolationMode.HighQualityBicubic;
                g.DrawImage(HeaderIcon, new Rectangle(548, 16, 54, 54));
            }

            // 2. Draw Title: Neon Cyan #00D2FF
            using (var titleFont = new Font("Segoe UI", 16.5f, FontStyle.Bold))
            using (var titleBrush = new SolidBrush(Color.FromArgb(0, 210, 255)))
            {
                g.DrawString(Title, titleFont, titleBrush, new PointF(22, 14));
            }

            // 3. Draw Subtitle: Contrast Slate #94A3B8
            using (var subFont = new Font("Segoe UI", 9.5f, FontStyle.Regular))
            using (var subBrush = new SolidBrush(Color.FromArgb(148, 163, 184)))
            {
                g.DrawString(Subtitle, subFont, subBrush, new PointF(24, 48));
            }
        }
    }
}
