using System;
using System.Diagnostics;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.IO;
using System.Reflection;
using System.Runtime.InteropServices;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;
using Microsoft.Win32;

namespace StormUniversal.Installer
{
    public class InstallerForm : Form
    {
        private ProgressBar progressBar = null!;
        private Label lblStatus = null!;
        private Label lblTitle = null!;
        private Label lblSubtitle = null!;
        private Button btnInstall = null!;
        private Button btnCancel = null!;
        private PictureBox picHeaderLogo = null!;
        private Panel headerPanel = null!;

        private const string AppVersion = "1.0.0";
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
                    if (name.EndsWith(IcoName, StringComparison.OrdinalIgnoreCase))
                    {
                        using var s = asm.GetManifestResourceStream(name);
                        if (s != null)
                        {
                            this.Icon = new Icon(s);
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

        private void InitializeComponent()
        {
            this.Text = $"{AppDisplayName} — STORM INSTALLER";
            this.Size = new Size(640, 520);
            this.StartPosition = FormStartPosition.CenterScreen;
            this.FormBorderStyle = FormBorderStyle.FixedDialog;
            this.MaximizeBox = false;
            this.BackColor = Color.FromArgb(11, 15, 25);
            this.ForeColor = Color.White;
            this.Font = new Font("Segoe UI", 9.5f, FontStyle.Regular);

            // 1. Dark Header
            headerPanel = new Panel
            {
                Dock = DockStyle.Top,
                Height = 88,
                BackColor = Color.FromArgb(17, 24, 39),
                Padding = new Padding(22, 14, 22, 14)
            };
            headerPanel.Paint += (s, e) =>
            {
                using var p = new Pen(Color.FromArgb(0, 210, 255), 2f);
                e.Graphics.DrawLine(p, 0, headerPanel.Height - 1, headerPanel.Width, headerPanel.Height - 1);
            };

            lblTitle = new Label
            {
                Text = AppDisplayName,
                Font = new Font("Segoe UI", 15.5f, FontStyle.Bold),
                ForeColor = Color.FromArgb(0, 210, 255),
                AutoSize = true,
                Location = new Point(22, 16)
            };

            lblSubtitle = new Label
            {
                Text = $"Мастер установки • Версия {AppVersion} • STORM SOFT",
                Font = new Font("Segoe UI", 9.2f, FontStyle.Regular),
                ForeColor = Color.FromArgb(156, 163, 175),
                AutoSize = true,
                Location = new Point(24, 49)
            };

            // Top-Right Header Icon (Clean Program Icon, without frames or borders)
            picHeaderLogo = new PictureBox
            {
                Location = new Point(548, 16),
                Size = new Size(54, 54),
                SizeMode = PictureBoxSizeMode.Zoom,
                BackColor = Color.Transparent
            };

            if (this.Icon != null)
            {
                picHeaderLogo.Image = this.Icon.ToBitmap();
            }

            headerPanel.Controls.Add(lblTitle);
            headerPanel.Controls.Add(lblSubtitle);
            headerPanel.Controls.Add(picHeaderLogo);
            this.Controls.Add(headerPanel);

            // 2. Body Panel
            var bodyPanel = new Panel
            {
                Location = new Point(24, 98),
                Size = new Size(576, 340)
            };

            // Red-Black Signature Logo in Body (Clean, without frames, directly below header icon, same size)
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
                    if (name.EndsWith("logo.png", StringComparison.OrdinalIgnoreCase))
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
                Text = "Стандартная установка в Programs (рекомендуется)",
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
                Text = "Портативная версия (в выбранную папку, без системных записей)",
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
                Text = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "Programs", AppFolderName),
                Location = new Point(5, 105),
                Size = new Size(460, 26),
                BackColor = Color.FromArgb(17, 24, 39),
                ForeColor = Color.White,
                BorderStyle = BorderStyle.FixedSingle,
                Font = new Font("Segoe UI", 9.5f)
            };
            bodyPanel.Controls.Add(txtInstallPath);

            btnBrowse = new Button
            {
                Text = "Обзор...",
                Location = new Point(475, 104),
                Size = new Size(95, 28),
                FlatStyle = FlatStyle.Flat,
                BackColor = Color.FromArgb(30, 41, 59),
                ForeColor = Color.FromArgb(0, 210, 255),
                Cursor = Cursors.Hand
            };
            btnBrowse.FlatAppearance.BorderColor = Color.FromArgb(0, 210, 255);
            btnBrowse.Click += BtnBrowse_Click;
            bodyPanel.Controls.Add(btnBrowse);

            var lblOptions = new Label
            {
                Text = "Дополнительные параметры интеграции:",
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

            chkRegister = new CheckBox
            {
                Text = "Зарегистрировать в списке «Установка и удаление программ»",
                Checked = true,
                Location = new Point(10, 216),
                AutoSize = true,
                ForeColor = Color.White
            };
            bodyPanel.Controls.Add(chkRegister);

            chkRunAfter = new CheckBox
            {
                Text = $"Запустить {AppDisplayName} сразу после установки",
                Checked = true,
                Location = new Point(10, 241),
                AutoSize = true,
                ForeColor = Color.FromArgb(0, 210, 255)
            };
            bodyPanel.Controls.Add(chkRunAfter);

            progressBar = new ProgressBar
            {
                Location = new Point(5, 276),
                Size = new Size(565, 12),
                Style = ProgressBarStyle.Continuous,
                Value = 0,
                Visible = false
            };
            bodyPanel.Controls.Add(progressBar);

            lblStatus = new Label
            {
                Text = "",
                Location = new Point(5, 292),
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
                Height = 60,
                BackColor = Color.FromArgb(17, 24, 39),
                Padding = new Padding(24, 12, 24, 12)
            };

            btnCancel = new Button
            {
                Text = "Отмена",
                Size = new Size(110, 36),
                Location = new Point(365, 12),
                FlatStyle = FlatStyle.Flat,
                BackColor = Color.FromArgb(30, 41, 59),
                ForeColor = Color.FromArgb(226, 232, 240),
                Font = new Font("Segoe UI", 9.5f, FontStyle.Regular),
                Cursor = Cursors.Hand
            };
            btnCancel.FlatAppearance.BorderColor = Color.FromArgb(51, 65, 85);
            btnCancel.Click += (s, e) => this.Close();
            bottomPanel.Controls.Add(btnCancel);

            btnInstall = new Button
            {
                Text = "Установить",
                Size = new Size(135, 36),
                Location = new Point(485, 12),
                FlatStyle = FlatStyle.Flat,
                BackColor = Color.FromArgb(0, 210, 255),
                ForeColor = Color.FromArgb(6, 7, 10),
                Font = new Font("Segoe UI", 9.8f, FontStyle.Bold),
                Cursor = Cursors.Hand
            };
            btnInstall.FlatAppearance.BorderColor = Color.FromArgb(0, 210, 255);
            btnInstall.Click += BtnInstall_Click;
            bottomPanel.Controls.Add(btnInstall);

            this.Controls.Add(bottomPanel);
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
                btnInstall.Text = "Распаковать";
            }
            else
            {
                txtInstallPath.Text = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "Programs", AppFolderName);
                chkDesktop.Checked = true;
                chkDesktop.Enabled = true;
                chkStartMenu.Checked = true;
                chkStartMenu.Enabled = true;
                chkRegister.Checked = true;
                chkRegister.Enabled = true;
                btnInstall.Text = "Установить";
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
            // Rule 4: At start, Install is disabled, Cancel stays enabled
            btnInstall.Enabled = false;
            btnCancel.Enabled = true;
            btnBrowse.Enabled = false;

            try
            {
                string targetDir = txtInstallPath.Text.Trim();
                if (string.IsNullOrEmpty(targetDir))
                {
                    targetDir = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "Programs", AppFolderName);
                }

                Directory.CreateDirectory(targetDir);

                lblStatus.Text = "Завершение предыдущих процессов программы...";
                progressBar.Value = 15;
                await Task.Delay(100);

                KillRunningProcesses();

                string targetExe = Path.Combine(targetDir, ExeName);
                string targetBat = Path.Combine(targetDir, BatName);
                string targetIco = Path.Combine(targetDir, IcoName);
                string targetLogo = Path.Combine(targetDir, "logo.png");

                lblStatus.Text = $"Распаковка пакета {AppDisplayName} (v{AppVersion})...";
                progressBar.Value = 45;
                await Task.Delay(100);

                ExtractResource(ExeName, targetExe);
                try { ExtractResource(BatName, targetBat); } catch { }
                ExtractResource(IcoName, targetIco);
                try { ExtractResource("logo.png", targetLogo); } catch { }

                progressBar.Value = 75;
                lblStatus.Text = "Оптимизация безопасности файлов...";
                await Task.Delay(100);

                UnblockFile(targetExe);
                UnblockFile(targetBat);
                UnblockFile(targetIco);
                UnblockFile(targetLogo);

                if (rbStandard.Checked)
                {
                    lblStatus.Text = "Создание системных ярлыков и регистрация в Windows...";
                    progressBar.Value = 90;
                    await Task.Delay(100);

                    CreateShortcuts(targetDir, targetExe, targetIco, chkDesktop.Checked, chkStartMenu.Checked);

                    if (chkRegister.Checked)
                    {
                        RegisterUninstall(targetDir, targetExe, targetIco);
                    }
                }

                // Rule 4: At 100%, both buttons disabled, installer closes automatically
                progressBar.Value = 100;
                btnInstall.Enabled = false;
                btnCancel.Enabled = false;
                lblStatus.Text = rbPortable.Checked ? "Портативная версия успешно распакована!" : "Установка успешно завершена!";
                lblStatus.ForeColor = Color.FromArgb(16, 185, 129);
                await Task.Delay(400);

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
                    Process.Start(new ProcessStartInfo
                    {
                        FileName = directExePath,
                        WorkingDirectory = workingDir,
                        UseShellExecute = true
                    });
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

        private static void KillRunningProcesses()
        {
            string[] procNames = { "STORM DSi Decryptor", "STORM_DSi_Decryptor" };
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
                    p?.WaitForExit(1500);
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
                string uninstScript = Path.Combine(targetDir, "uninstall.cmd");
                string scriptContent = $@"@echo off
taskkill /F /IM ""STORM DSi Decryptor.exe"" /T >nul 2>&1
powershell.exe -NoProfile -ExecutionPolicy Bypass -Command ""Get-ChildItem '$env:APPDATA\Microsoft\Windows\Start Menu\Programs\*STORM DSi Decryptor*' | Remove-Item -Force -ErrorAction SilentlyContinue; Get-ChildItem '$env:USERPROFILE\Desktop\*STORM DSi Decryptor*' | Remove-Item -Force -ErrorAction SilentlyContinue; Remove-Item -Path 'HKCU:\Software\Microsoft\Windows\CurrentVersion\Uninstall\StormDsiDecryptor' -Recurse -Force -ErrorAction SilentlyContinue"" >nul 2>&1
start /b cmd /c ""ping 127.0.0.1 -n 2 >nul & rmdir /s /q \""{targetDir}\""""
exit
";
                try { File.WriteAllText(uninstScript, scriptContent); } catch { }

                using var key = Registry.CurrentUser.CreateSubKey(@"Software\Microsoft\Windows\CurrentVersion\Uninstall\StormDsiDecryptor");
                if (key != null)
                {
                    key.SetValue("DisplayName", AppDisplayName);
                    key.SetValue("DisplayVersion", AppVersion);
                    key.SetValue("Publisher", "STORM SOFT");
                    key.SetValue("DisplayIcon", File.Exists(targetIco) ? targetIco : targetExe);
                    key.SetValue("InstallLocation", targetDir);
                    string uninstallCmd = $"cmd.exe /c \"\"{uninstScript}\"\"";
                    key.SetValue("UninstallString", uninstallCmd);
                    key.SetValue("QuietUninstallString", uninstallCmd);
                    key.SetValue("EstimatedSize", 75000, RegistryValueKind.DWord);
                }
            }
            catch { }
        }

        private const string InstallerMutexName = @"Global\STORM_DSI_DECRYPTOR_INSTALLER_SingleInstanceMutex";

        [DllImport("user32.dll")]
        private static extern bool SetForegroundWindow(IntPtr hWnd);

        [DllImport("user32.dll")]
        private static extern bool ShowWindow(IntPtr hWnd, int nCmdShow);

        [DllImport("user32.dll")]
        private static extern IntPtr FindWindow(string? lpClassName, string lpWindowName);

        [STAThread]
        public static void Main(string[] args)
        {
            bool createdNew;
            using var mutex = new Mutex(true, InstallerMutexName, out createdNew);
            if (!createdNew)
            {
                IntPtr hWnd = FindWindow(null, $"{AppDisplayName} — STORM INSTALLER");
                if (hWnd != IntPtr.Zero)
                {
                    ShowWindow(hWnd, 9);
                    SetForegroundWindow(hWnd);
                }
                MessageBox.Show(
                    "Программа установки уже запущена.",
                    AppDisplayName,
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Information);
                return;
            }

            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new InstallerForm());
        }
    }
}
