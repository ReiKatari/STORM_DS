using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Globalization;
using System.IO;
using System.IO.Compression;
using System.Reflection;
using System.Runtime.InteropServices;
using System.Security.Cryptography.X509Certificates;
using System.Threading.Tasks;
using System.Windows.Forms;
using Microsoft.Win32;

namespace StormUniversal.Installer
{
    public sealed class VolumetricButton : Button
    {
        public Color PrimaryColor { get; set; } = Color.FromArgb(139, 92, 246);
        public Color SecondaryColor { get; set; } = Color.FromArgb(6, 182, 212);
        public bool IsPrimary { get; set; } = false;
        private bool _hover = false;
        private bool _pressed = false;

        public VolumetricButton()
        {
            SetStyle(ControlStyles.AllPaintingInWmPaint | ControlStyles.OptimizedDoubleBuffer | ControlStyles.ResizeRedraw | ControlStyles.UserPaint, true);
            FlatStyle = FlatStyle.Flat;
            FlatAppearance.BorderSize = 0;
            UseMnemonic = false;
            Cursor = Cursors.Hand;
        }

        protected override void OnMouseEnter(EventArgs e) { _hover = true; Invalidate(); base.OnMouseEnter(e); }
        protected override void OnMouseLeave(EventArgs e) { _hover = false; _pressed = false; Invalidate(); base.OnMouseLeave(e); }
        protected override void OnMouseDown(MouseEventArgs mevent) { _pressed = true; Invalidate(); base.OnMouseDown(mevent); }
        protected override void OnMouseUp(MouseEventArgs mevent) { _pressed = false; Invalidate(); base.OnMouseUp(mevent); }

        protected override void OnPaint(PaintEventArgs pevent)
        {
            var g = pevent.Graphics;
            g.SmoothingMode = SmoothingMode.AntiAlias;
            g.Clear(Parent?.BackColor ?? Color.FromArgb(13, 11, 24));

            int offset = _pressed ? 2 : (_hover ? -1 : 0);
            Rectangle rect = new Rectangle(1, 2 + Math.Max(0, offset), Width - 3, Height - 5);
            using var path = InstallerForm.GetRoundedRectPath(rect, 9);

            // 3D Bottom Bevel Shadow
            if (!_pressed)
            {
                Rectangle shadowRect = new Rectangle(1, 4, Width - 3, Height - 5);
                using var shadowPath = InstallerForm.GetRoundedRectPath(shadowRect, 9);
                using var shadowBrush = new SolidBrush(Color.FromArgb(140, 0, 0, 0));
                g.FillPath(shadowBrush, shadowPath);
            }

            // 3D Surface Gradient
            Color c1 = IsPrimary ? PrimaryColor : Color.FromArgb(_hover ? 46 : 34, _hover ? 38 : 28, _hover ? 82 : 62);
            Color c2 = IsPrimary ? SecondaryColor : Color.FromArgb(23, 19, 43);
            using (var grad = new LinearGradientBrush(rect, c1, c2, 135f))
            {
                g.FillPath(grad, path);
            }

            // Top Specular Highlight
            using (var topPen = new Pen(Color.FromArgb(_hover ? 140 : 90, 255, 255, 255), 1.2f))
            {
                g.DrawPath(topPen, path);
            }

            TextRenderer.DrawText(g, Text, Font, rect, ForeColor, TextFormatFlags.HorizontalCenter | TextFormatFlags.VerticalCenter | TextFormatFlags.NoPrefix);
        }
    }

    public sealed class InstallerForm : Form
    {
        private const string AppDisplayName = "STORM DSI DECRYPTOR";
        private const string AppVersion = "1.1.9";
        private const string AppFolderName = "STORM DSI DECRYPTOR";
        private const string ExeName = "STORM DSI DECRYPTOR.exe";
        private const string IcoName = "AppIcon.ico";
        private const string BatName = "Быстрая_Расшифровка_Игр.bat";

        private Panel headerPanel = null!;
        private Panel bodyPanel = null!;
        private Panel bottomPanel = null!;
        private Label lblTitle = null!;
        private Label lblSubtitle = null!;
        private Label lblModeTitle = null!;
        private RadioButton rbStandard = null!;
        private RadioButton rbPortable = null!;
        private Label lblPathTitle = null!;
        private TextBox txtInstallPath = null!;
        private VolumetricButton btnBrowse = null!;
        private Label lblDropHint = null!;
        private Label lblOptionsTitle = null!;

        private CheckBox chkDesktop = null!;
        private CheckBox chkStartMenu = null!;
        private CheckBox chkFirewall = null!;
        private CheckBox chkInstallCert = null!;
        private CheckBox chkRunAfter = null!;

        private ComboBox cmbLang = null!;
        private ComboBox cmbTheme = null!;
        private ComboBox cmbAccent = null!;

        private ProgressBar progressBar = null!;
        private Label lblStatus = null!;
        private VolumetricButton btnCancel = null!;
        private VolumetricButton btnInstall = null!;

        private bool isInstalling = false;
        private Color currentAccent = Color.FromArgb(139, 92, 246);
        private string currentLang = "ru";

        [DllImport("shell32.dll", CharSet = CharSet.Unicode, SetLastError = true)]
        private static extern int SetCurrentProcessExplicitAppUserModelID(string appID);

        [DllImport("dwmapi.dll", PreserveSig = true)]
        private static extern int DwmSetWindowAttribute(IntPtr hwnd, int attr, ref int attrValue, int attrSize);

        [DllImport("shell32.dll")]
        private static extern void DragAcceptFiles(IntPtr hwnd, bool fAccept);

        [DllImport("shell32.dll", CharSet = CharSet.Unicode)]
        private static extern uint DragQueryFile(IntPtr hDrop, uint iFile, System.Text.StringBuilder? lpszFile, int cch);

        [DllImport("shell32.dll")]
        private static extern void DragFinish(IntPtr hDrop);

        [DllImport("user32.dll", SetLastError = true)]
        private static extern bool ChangeWindowMessageFilterEx(IntPtr hWnd, uint message, uint action, IntPtr pChangeFilterStruct);

        [DllImport("user32.dll", SetLastError = true)]
        private static extern bool ChangeWindowMessageFilter(uint message, uint action);

        [DllImport("shell32.dll")]
        private static extern void SHChangeNotify(int wEventId, int uFlags, IntPtr dwItem1, IntPtr dwItem2);

        [DllImport("kernel32.dll", CharSet = CharSet.Unicode, SetLastError = true)]
        [return: MarshalAs(UnmanagedType.Bool)]
        private static extern bool DeleteFile(string name);

        private const uint MSGFLT_ALLOW = 1;
        private const uint WM_DROPFILES = 0x0233;
        private const uint WM_COPYDATA = 0x004A;
        private const uint WM_COPYGLOBALDATA = 0x0049;
        private const int SHCNE_ASSOCCHANGED = 0x08000000;
        private const int SHCNF_IDLIST = 0x0000;

        private static readonly Dictionary<string, string[]> Loc = new()
        {
            ["ru"] = new[] {
                $"Мастер установки • Версия {AppVersion}",
                "Режим установки:",
                $"📦 Стандартная установка в C:\\Program Files\\{AppFolderName}",
                "🚀 Портативная установка (Portable Mode - все данные внутри папки)",
                "Папка установки (поддерживается Drag-and-Drop):",
                "📂 Обзор...",
                "✨ Перетащите любую папку из Проводника сюда для выбора пути",
                "Параметры интеграции:",
                "🖥️ Создать ярлык на Рабочем столе",
                "📌 Добавить в меню «Пуск» и список приложений Windows",
                "🛡️ Добавить в исключения Брандмауэра Windows (Inbound & Outbound)",
                "🔐 Установить единый сертификат доверия STORM SERTIFICATE (SIGNATURE)",
                $"⚡ Запустить {AppDisplayName} сразу после завершения установки",
                "✖ Отмена",
                "⚡ Установить"
            },
            ["en"] = new[] {
                $"Setup Wizard • Version {AppVersion}",
                "Installation Mode:",
                $"📦 Standard installation to C:\\Program Files\\{AppFolderName}",
                "🚀 Portable installation (Portable Mode - all data in folder)",
                "Installation Folder (Drag-and-Drop supported):",
                "📂 Browse...",
                "✨ Drag and drop any folder from Explorer here to select path",
                "Integration Options:",
                "🖥️ Create shortcut on Desktop",
                "📌 Add to Start Menu and Windows Applications",
                "🛡️ Add Windows Firewall exceptions (Inbound & Outbound)",
                "🔐 Install unified trust certificate STORM SERTIFICATE (SIGNATURE)",
                $"⚡ Launch {AppDisplayName} immediately after installation",
                "✖ Cancel",
                "⚡ Install"
            },
            ["de"] = new[] {
                $"Installations-Assistent • Version {AppVersion}",
                "Installationsmodus:",
                $"📦 Standardinstallation unter C:\\Program Files\\{AppFolderName}",
                "🚀 Portable Installation (Portable Mode - alle Daten im Ordner)",
                "Zielordner (Drag-and-Drop unterstützt):",
                "📂 Durchsuchen...",
                "✨ Ziehen Sie einen beliebigen Ordner hierher, um den Pfad zu wählen",
                "Integrationsoptionen:",
                "🖥️ Desktop-Verknüpfung erstellen",
                "📌 Zum Startmenü und Windows-App-Verzeichnis hinzufügen",
                "🛡️ Windows-Firewall-Ausnahmen hinzufügen (Inbound & Outbound)",
                "🔐 Einheitliches Zertifikat STORM SERTIFICATE (SIGNATURE) installieren",
                $"⚡ {AppDisplayName} nach Abschluss direkt starten",
                "✖ Abbrechen",
                "⚡ Installieren"
            },
            ["fr"] = new[] {
                $"Assistant d'installation • Version {AppVersion}",
                "Mode d'installation :",
                $"📦 Installation standard dans C:\\Program Files\\{AppFolderName}",
                "🚀 Installation portable (Portable Mode - données dans le dossier)",
                "Dossier d'installation (Glisser-déposer supporté) :",
                "📂 Parcourir...",
                "✨ Glissez n'importe quel dossier ici pour sélectionner le chemin",
                "Options d'intégration :",
                "🖥️ Créer un raccourci sur le Bureau",
                "📌 Ajouter au menu Démarrer et aux applications Windows",
                "🛡️ Ajouter aux exceptions du Pare-feu Windows (Inbound & Outbound)",
                "🔐 Installer le certificat de confiance STORM SERTIFICATE (SIGNATURE)",
                $"⚡ Lancer {AppDisplayName} dès la fin de l'installation",
                "✖ Annuler",
                "⚡ Installer"
            },
            ["zh"] = new[] {
                $"安装向导 • 版本 {AppVersion}",
                "安装模式：",
                $"📦 标准安装至 C:\\Program Files\\{AppFolderName}",
                "🚀 便携模式 (Portable Mode - 所有数据保存在该文件夹)",
                "安装目录 (支持文件夹拖拽 Drag-and-Drop)：",
                "📂 浏览...",
                "✨ 直接将文件夹拖入此窗口即可设定目标路径",
                "系统集成选项：",
                "🖥️ 创建桌面快捷方式",
                "📌 添加到开始菜单与 Windows 应用程序列表",
                "🛡️ 添加 Windows 防火墙出入站规则 (Inbound & Outbound)",
                "🔐 安装统一信任证书 STORM SERTIFICATE (SIGNATURE)",
                $"⚡ 安装完成后立即运行 {AppDisplayName}",
                "✖ 取消",
                "⚡ 安装"
            },
            ["ko"] = new[] {
                $"설치 마법사 • 버전 {AppVersion}",
                "설치 모드:",
                $"📦 표준 설치 (C:\\Program Files\\{AppFolderName})",
                "🚀 포터블 설치 (Portable Mode - 모든 데이터 폴더 내 저장)",
                "설치 경로 (폴더 드래그 앤 드롭 지원):",
                "📂 찾아보기...",
                "✨ 탐색기에서 원하는 폴더를 끌어다 놓으세요",
                "통합 옵션:",
                "🖥️ 바탕화면에 바로가기 생성",
                "📌 시작 메뉴 및 Windows 앱 목록에 등록",
                "🛡️ Windows 방화벽 인바운드/아웃바운드 허용 규칙 추가",
                "🔐 통합 인증서 STORM SERTIFICATE (SIGNATURE) 등록",
                $"⚡ 설치 완료 후 {AppDisplayName} 바로 실행",
                "✖ 취소",
                "⚡ 설치"
            },
            ["ja"] = new[] {
                $"セットアップウィザード • バージョン {AppVersion}",
                "インストールモード:",
                $"📦 標準インストール (C:\\Program Files\\{AppFolderName})",
                "🚀 ポータブルインストール (Portable Mode - 全データをフォルダ内保持)",
                "インストール先 (ドラッグ＆ドロップ対応):",
                "📂 参照...",
                "✨ エクスプローラーからフォルダをドロップして選択できます",
                "統合オプション:",
                "🖥️ デスクトップにショートカットを作成",
                "📌 スタートメニューと Windows アプリ一覧に登録",
                "🛡️ Windows ファイアウォール例外を追加 (Inbound & Outbound)",
                "🔐 統一証明書 STORM SERTIFICATE (SIGNATURE) を登録",
                $"⚡ インストール完了後に {AppDisplayName} を起動",
                "✖ キャンセル",
                "⚡ インストール"
            },
            ["es"] = new[] {
                $"Asistente de instalación • Versión {AppVersion}",
                "Modo de instalación:",
                $"📦 Instalación estándar en C:\\Program Files\\{AppFolderName}",
                "🚀 Instalación portátil (Portable Mode - datos dentro de carpeta)",
                "Carpeta de instalación (Soporta Drag-and-Drop):",
                "📂 Examinar...",
                "✨ Arrastre cualquier carpeta del Explorador aquí para cambiar la ruta",
                "Opciones de integración:",
                "🖥️ Crear acceso directo en el Escritorio",
                "📌 Añadir al menú Inicio y lista de aplicaciones de Windows",
                "🛡️ Añadir reglas en Firewall de Windows (Inbound & Outbound)",
                "🔐 Instalar certificado de confianza STORM SERTIFICATE (SIGNATURE)",
                $"⚡ Iniciar {AppDisplayName} al finalizar la instalación",
                "✖ Cancelar",
                "⚡ Instalar"
            },
            ["it"] = new[] {
                $"Installazione guidata • Versione {AppVersion}",
                "Modalità di installazione:",
                $"📦 Installazione standard in C:\\Program Files\\{AppFolderName}",
                "🚀 Installazione portatile (Portable Mode - dati nella cartella)",
                "Cartella di destinazione (Supporta Drag-and-Drop):",
                "📂 Sfoglia...",
                "✨ Trascina qui qualsiasi cartella da Esplora file",
                "Opzioni di integrazione:",
                "🖥️ Crea collegamento sul Desktop",
                "📌 Aggiungi al menu Start e alle app di Windows",
                "🛡️ Aggiungi regole a Windows Firewall (Inbound & Outbound)",
                "🔐 Installa certificato di attendibilità STORM SERTIFICATE (SIGNATURE)",
                $"⚡ Avvia {AppDisplayName} al termine dell'installazione",
                "✖ Annulla",
                "⚡ Installa"
            },
            ["pt"] = new[] {
                $"Assistente de Instalação • Versão {AppVersion}",
                "Modo de instalação:",
                $"📦 Instalação padrão em C:\\Program Files\\{AppFolderName}",
                "🚀 Instalação portátil (Portable Mode - todos os dados na pasta)",
                "Pasta de destino (Suporta arrastar e soltar):",
                "📂 Procurar...",
                "✨ Arraste qualquer pasta do Explorador de Arquivos para cá",
                "Opções de integração:",
                "🖥️ Criar atalho na Área de Trabalho",
                "📌 Adicionar ao menu Iniciar e aplicativos do Windows",
                "🛡️ Adicionar exceções no Firewall do Windows (Inbound & Outbound)",
                "🔐 Instalar certificado de confiança STORM SERTIFICATE (SIGNATURE)",
                $"⚡ Iniciar {AppDisplayName} imediatamente após a instalação",
                "✖ Cancelar",
                "⚡ Instalar"
            },
            ["hi"] = new[] {
                $"इंस्टॉलेशन विज़ार्ड • संस्करण {AppVersion}",
                "इंस्टॉलेशन मोड:",
                $"📦 मानक इंस्टॉलेशन (C:\\Program Files\\{AppFolderName})",
                "🚀 पोर्टेबल इंस्टॉलेशन (Portable Mode - सभी डेटा फ़ोल्डर में)",
                "स्थापना फ़ोल्डर (ड्रैग-एंड-ड्रॉप समर्थित):",
                "📂 ब्राउज़ करें...",
                "✨ एक्सप्लोरर से किसी भी फ़ोल्डर को यहाँ खींचें",
                "सिस्टम एकीकरण विकल्प:",
                "🖥️ डेस्कटॉप शॉर्टकट बनाएँ",
                "📌 स्टार्ट मेनू और विंडोज एप्लिकेशन सूची में जोड़ें",
                "🛡️ Windows फ़ायरवॉल अपवाद जोड़ें (Inbound & Outbound)",
                "🔐 एकीकृत ट्रस्ट प्रमाणपत्र STORM SERTIFICATE (SIGNATURE) जोड़ें",
                $"⚡ स्थापना के तुरंत बाद {AppDisplayName} चलाएँ",
                "✖ रद्द करें",
                "⚡ इंस्टॉल"
            }
        };

        public InstallerForm()
        {
            try { SetCurrentProcessExplicitAppUserModelID("STORM.DSI.DECRYPTOR.INSTALLER"); } catch { }
            LoadEmbeddedIcon();
            InitializeComponent();
            DetectAndApplyDefaultLanguage();
        }

        protected override void OnHandleCreated(EventArgs e)
        {
            base.OnHandleCreated(e);
            try
            {
                int dark = 1;
                DwmSetWindowAttribute(this.Handle, 20, ref dark, sizeof(int));

                // Mandatory UAC UIPI Drag-and-Drop bypass per STORM Unified UI Standard
                DragAcceptFiles(this.Handle, true);
                ChangeWindowMessageFilterEx(this.Handle, WM_DROPFILES, MSGFLT_ALLOW, IntPtr.Zero);
                ChangeWindowMessageFilterEx(this.Handle, WM_COPYDATA, MSGFLT_ALLOW, IntPtr.Zero);
                ChangeWindowMessageFilterEx(this.Handle, WM_COPYGLOBALDATA, MSGFLT_ALLOW, IntPtr.Zero);
                ChangeWindowMessageFilter(WM_DROPFILES, MSGFLT_ALLOW);
                ChangeWindowMessageFilter(WM_COPYDATA, MSGFLT_ALLOW);
                ChangeWindowMessageFilter(WM_COPYGLOBALDATA, MSGFLT_ALLOW);
            }
            catch { }
        }

        protected override void WndProc(ref Message m)
        {
            if (m.Msg == (int)WM_DROPFILES)
            {
                IntPtr hDrop = m.WParam;
                uint count = DragQueryFile(hDrop, 0xFFFFFFFF, null, 0);
                if (count > 0)
                {
                    var sb = new System.Text.StringBuilder(1024);
                    DragQueryFile(hDrop, 0, sb, sb.Capacity);
                    string droppedPath = sb.ToString();
                    if (!string.IsNullOrEmpty(droppedPath))
                    {
                        if (File.Exists(droppedPath))
                            droppedPath = Path.GetDirectoryName(droppedPath) ?? droppedPath;
                        txtInstallPath.Text = Path.Combine(droppedPath, AppFolderName);
                    }
                }
                DragFinish(hDrop);
                return;
            }
            base.WndProc(ref m);
        }

        private void LoadEmbeddedIcon()
        {
            try
            {
                var asm = Assembly.GetExecutingAssembly();
                foreach (var name in asm.GetManifestResourceNames())
                {
                    if (name.EndsWith(IcoName, StringComparison.OrdinalIgnoreCase) || name.EndsWith("app.ico", StringComparison.OrdinalIgnoreCase))
                    {
                        using var s = asm.GetManifestResourceStream(name);
                        if (s != null) { this.Icon = new Icon(s, 256, 256); break; }
                    }
                }
                if (this.Icon == null && File.Exists(Application.ExecutablePath))
                {
                    this.Icon = Icon.ExtractAssociatedIcon(Application.ExecutablePath);
                }
            }
            catch { }
        }

        public static GraphicsPath GetRoundedRectPath(Rectangle rect, int radius)
        {
            var path = new GraphicsPath();
            int d = radius * 2;
            path.AddArc(rect.X, rect.Y, d, d, 180, 90);
            path.AddArc(rect.Right - d, rect.Y, d, d, 270, 90);
            path.AddArc(rect.Right - d, rect.Bottom - d, d, d, 0, 90);
            path.AddArc(rect.X, rect.Bottom - d, d, d, 90, 90);
            path.CloseFigure();
            return path;
        }

        private void InitializeComponent()
        {
            this.Text = $"{AppDisplayName} - STORM INSTALLER";
            this.ClientSize = new Size(840, 580);
            this.StartPosition = FormStartPosition.CenterScreen;
            this.FormBorderStyle = FormBorderStyle.FixedDialog;
            this.MaximizeBox = false;
            this.AllowDrop = true;
            this.BackColor = Color.FromArgb(13, 11, 24); // MIDNIGHT #0D0B18
            this.ForeColor = Color.FromArgb(248, 250, 252);
            this.Font = new Font("Segoe UI", 9.5f, FontStyle.Regular);

            this.DragEnter += (s, e) =>
            {
                if (e.Data != null && e.Data.GetDataPresent(DataFormats.FileDrop))
                    e.Effect = DragDropEffects.Copy;
            };
            this.DragDrop += (s, e) =>
            {
                if (e.Data?.GetData(DataFormats.FileDrop) is string[] files && files.Length > 0)
                {
                    string p = files[0];
                    if (File.Exists(p)) p = Path.GetDirectoryName(p) ?? p;
                    txtInstallPath.Text = Path.Combine(p, AppFolderName);
                }
            };

            // 1. DARK HEADER (#141026)
            headerPanel = new Panel
            {
                Dock = DockStyle.Top,
                Height = 92,
                BackColor = Color.FromArgb(20, 16, 38),
                Padding = new Padding(22, 14, 22, 14)
            };
            headerPanel.Paint += (s, e) =>
            {
                using var p = new Pen(currentAccent, 2f);
                e.Graphics.DrawLine(p, 0, headerPanel.Height - 1, headerPanel.Width, headerPanel.Height - 1);
            };

            var picLogo = new PictureBox
            {
                Location = new Point(20, 18),
                Size = new Size(54, 54),
                SizeMode = PictureBoxSizeMode.Zoom,
                BackColor = Color.Transparent
            };

            Image? hiResLogo = null;
            try
            {
                var asm = Assembly.GetExecutingAssembly();
                foreach (var resName in asm.GetManifestResourceNames())
                {
                    if (resName.EndsWith("app_icon.png", StringComparison.OrdinalIgnoreCase) || resName.EndsWith("logo.png", StringComparison.OrdinalIgnoreCase))
                    {
                        using var s = asm.GetManifestResourceStream(resName);
                        if (s != null)
                        {
                            hiResLogo = Image.FromStream(s);
                            break;
                        }
                    }
                }
            }
            catch { }

            picLogo.Paint += (s, e) =>
            {
                var imgToDraw = hiResLogo ?? (this.Icon != null ? this.Icon.ToBitmap() : null);
                if (imgToDraw != null)
                {
                    e.Graphics.InterpolationMode = InterpolationMode.HighQualityBicubic;
                    e.Graphics.SmoothingMode = SmoothingMode.HighQuality;
                    e.Graphics.PixelOffsetMode = PixelOffsetMode.HighQuality;
                    e.Graphics.CompositingQuality = CompositingQuality.HighQuality;
                    e.Graphics.DrawImage(imgToDraw, picLogo.ClientRectangle);
                }
            };
            headerPanel.Controls.Add(picLogo);

            lblTitle = new Label
            {
                Text = AppDisplayName,
                Font = new Font("Segoe UI", 15.5f, FontStyle.Bold),
                ForeColor = Color.White,
                AutoSize = true,
                UseMnemonic = false,
                Location = new Point(88, 18)
            };
            headerPanel.Controls.Add(lblTitle);

            lblSubtitle = new Label
            {
                Text = $"Мастер установки • Версия {AppVersion}",
                Font = new Font("Segoe UI", 9.2f, FontStyle.Regular),
                ForeColor = Color.FromArgb(167, 139, 250),
                AutoSize = true,
                UseMnemonic = false,
                Location = new Point(90, 48)
            };
            headerPanel.Controls.Add(lblSubtitle);

            // Header Selectors shifted right with ample breathing room (X=504, Right=818)
            cmbLang = new ComboBox
            {
                Location = new Point(504, 16),
                Size = new Size(150, 24),
                DropDownStyle = ComboBoxStyle.DropDownList,
                BackColor = Color.FromArgb(30, 24, 56),
                ForeColor = Color.White,
                FlatStyle = FlatStyle.Flat
            };
            cmbLang.Items.AddRange(new object[] { "ru • Русский", "en • English", "de • Deutsch", "fr • Français", "zh • 简体中文", "ko • 한국어", "ja • 日本語", "es • Español", "it • Italiano", "pt • Português", "hi • हिन्दी" });
            cmbLang.SelectedIndexChanged += (s, e) =>
            {
                string code = (cmbLang.SelectedItem?.ToString() ?? "ru").Split(' ')[0];
                ApplyLanguage(code);
            };
            headerPanel.Controls.Add(cmbLang);

            cmbTheme = new ComboBox
            {
                Location = new Point(662, 16),
                Size = new Size(156, 24),
                DropDownStyle = ComboBoxStyle.DropDownList,
                BackColor = Color.FromArgb(30, 24, 56),
                ForeColor = Color.White,
                FlatStyle = FlatStyle.Flat
            };
            cmbTheme.Items.AddRange(new object[] { "MIDNIGHT", "NIGHT", "DARK", "DAY", "FANTASY", "CYBERPUNK", "WARHAMMER 40K", "ELEMENTAL", "STORM" });
            cmbTheme.SelectedIndex = 0;
            cmbTheme.SelectedIndexChanged += (s, e) => ApplyTheme(cmbTheme.SelectedItem?.ToString() ?? "MIDNIGHT");
            headerPanel.Controls.Add(cmbTheme);

            cmbAccent = new ComboBox
            {
                Location = new Point(504, 46),
                Size = new Size(314, 24),
                DropDownStyle = ComboBoxStyle.DropDownList,
                BackColor = Color.FromArgb(30, 24, 56),
                ForeColor = Color.White,
                FlatStyle = FlatStyle.Flat
            };
            cmbAccent.Items.AddRange(new object[]
            {
                "Violet (#8B5CF6)", "Cyan (#06B6D4)", "Electric Blue (#3B82F6)", "Royal Indigo (#6366F1)",
                "Teal Mint (#14B8A6)", "Emerald Green (#10B981)", "Neon Lime (#84CC16)", "Amber Gold (#F59E0B)",
                "Solar Orange (#F97316)", "Crimson Red (#EF4444)", "Rose Pink (#F43F5E)", "Magenta Fuchsia (#EC4899)",
                "Platinum Silver (#E2E8F0)"
            });
            cmbAccent.SelectedIndex = 0;
            cmbAccent.SelectedIndexChanged += (s, e) => ApplyAccent(cmbAccent.SelectedIndex);
            headerPanel.Controls.Add(cmbAccent);

            this.Controls.Add(headerPanel);

            // 2. BODY PANEL (796 x 400)
            bodyPanel = new Panel
            {
                Location = new Point(22, 102),
                Size = new Size(796, 400),
                BackColor = Color.Transparent
            };

            lblModeTitle = new Label
            {
                Text = "Режим установки:",
                Font = new Font("Segoe UI", 9.8f, FontStyle.Bold),
                ForeColor = Color.FromArgb(226, 232, 240),
                Location = new Point(0, 0),
                UseMnemonic = false,
                AutoSize = true
            };
            bodyPanel.Controls.Add(lblModeTitle);

            rbStandard = new RadioButton
            {
                Text = $"📦 Стандартная установка в C:\\Program Files\\{AppFolderName}",
                Checked = true,
                Location = new Point(8, 24),
                UseMnemonic = false,
                AutoSize = true,
                ForeColor = Color.White
            };
            rbStandard.CheckedChanged += Mode_CheckedChanged;
            bodyPanel.Controls.Add(rbStandard);

            rbPortable = new RadioButton
            {
                Text = "🚀 Портативная установка (Portable Mode - все данные внутри папки)",
                Checked = false,
                Location = new Point(8, 49),
                UseMnemonic = false,
                AutoSize = true,
                ForeColor = Color.White
            };
            rbPortable.CheckedChanged += Mode_CheckedChanged;
            bodyPanel.Controls.Add(rbPortable);

            lblPathTitle = new Label
            {
                Text = "Папка установки (поддерживается Drag-and-Drop):",
                Font = new Font("Segoe UI", 9.8f, FontStyle.Bold),
                ForeColor = Color.FromArgb(226, 232, 240),
                Location = new Point(0, 82),
                UseMnemonic = false,
                AutoSize = true
            };
            bodyPanel.Controls.Add(lblPathTitle);

            txtInstallPath = new TextBox
            {
                Text = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.ProgramFiles), AppFolderName),
                Location = new Point(4, 106),
                Size = new Size(656, 28),
                BackColor = Color.FromArgb(22, 18, 42),
                ForeColor = Color.White,
                BorderStyle = BorderStyle.FixedSingle,
                Font = new Font("Consolas", 10f)
            };
            bodyPanel.Controls.Add(txtInstallPath);

            btnBrowse = new VolumetricButton
            {
                Text = "📂 Обзор...",
                Location = new Point(668, 103),
                Size = new Size(124, 32),
                ForeColor = Color.White
            };
            btnBrowse.Click += BtnBrowse_Click;
            bodyPanel.Controls.Add(btnBrowse);

            lblDropHint = new Label
            {
                Text = "✨ Перетащите любую папку из Проводника Windows прямо в это окно (UAC UIPI активен)",
                Font = new Font("Segoe UI", 8.6f, FontStyle.Italic),
                ForeColor = Color.FromArgb(56, 189, 248),
                Location = new Point(4, 136),
                UseMnemonic = false,
                AutoSize = true
            };
            bodyPanel.Controls.Add(lblDropHint);

            lblOptionsTitle = new Label
            {
                Text = "Параметры интеграции (уникальные семантические иконки):",
                Font = new Font("Segoe UI", 9.8f, FontStyle.Bold),
                ForeColor = Color.FromArgb(226, 232, 240),
                Location = new Point(0, 164),
                UseMnemonic = false,
                AutoSize = true
            };
            bodyPanel.Controls.Add(lblOptionsTitle);

            chkDesktop = new CheckBox
            {
                Text = $"🖥️  Создать ярлык на Рабочем столе ({AppDisplayName}.lnk)",
                Checked = true,
                Location = new Point(8, 190),
                UseMnemonic = false,
                AutoSize = true,
                ForeColor = Color.White
            };
            bodyPanel.Controls.Add(chkDesktop);

            chkStartMenu = new CheckBox
            {
                Text = "📌  Добавить в меню «Пуск» и список приложений Windows",
                Checked = true,
                Location = new Point(8, 217),
                UseMnemonic = false,
                AutoSize = true,
                ForeColor = Color.White
            };
            bodyPanel.Controls.Add(chkStartMenu);

            chkFirewall = new CheckBox
            {
                Text = "🛡️  Добавить в исключения Брандмауэра Windows (Inbound & Outbound)",
                Checked = true,
                Location = new Point(8, 244),
                UseMnemonic = false,
                AutoSize = true,
                ForeColor = Color.FromArgb(56, 189, 248)
            };
            bodyPanel.Controls.Add(chkFirewall);

            chkInstallCert = new CheckBox
            {
                Text = "🔐  Установить единый сертификат доверия STORM SERTIFICATE (SIGNATURE)",
                Checked = true,
                Location = new Point(8, 271),
                UseMnemonic = false,
                AutoSize = true,
                ForeColor = Color.FromArgb(52, 211, 153)
            };
            bodyPanel.Controls.Add(chkInstallCert);

            chkRunAfter = new CheckBox
            {
                Text = $"⚡  Запустить {AppDisplayName} сразу после завершения установки",
                Checked = true,
                Location = new Point(8, 298),
                UseMnemonic = false,
                AutoSize = true,
                ForeColor = Color.FromArgb(250, 204, 21)
            };
            bodyPanel.Controls.Add(chkRunAfter);

            // ИНДИКАТОР УСТАНОВКИ (Standard from f6fab2c8-0fa6-40eb-8634-be3ce267bf0b)
            progressBar = new ProgressBar
            {
                Location = new Point(4, 336),
                Size = new Size(788, 14),
                Style = ProgressBarStyle.Continuous,
                Value = 0,
                Visible = false
            };
            bodyPanel.Controls.Add(progressBar);

            lblStatus = new Label
            {
                Text = "",
                Location = new Point(4, 355),
                Size = new Size(788, 22),
                Font = new Font("Segoe UI", 9f, FontStyle.Bold),
                ForeColor = Color.FromArgb(52, 211, 153),
                UseMnemonic = false,
                Visible = false
            };
            bodyPanel.Controls.Add(lblStatus);

            this.Controls.Add(bodyPanel);

            // 3. BOTTOM PANEL
            bottomPanel = new Panel
            {
                Dock = DockStyle.Bottom,
                Height = 64,
                BackColor = Color.FromArgb(20, 16, 38),
                Padding = new Padding(22, 12, 22, 12)
            };

            btnCancel = new VolumetricButton
            {
                Text = "✖ Отмена",
                Size = new Size(130, 38),
                Location = new Point(516, 13),
                ForeColor = Color.White
            };
            btnCancel.Click += (s, e) => this.Close();
            bottomPanel.Controls.Add(btnCancel);

            btnInstall = new VolumetricButton
            {
                Text = "⚡ Установить",
                Size = new Size(160, 38),
                Location = new Point(658, 13),
                IsPrimary = true,
                ForeColor = Color.White,
                Font = new Font("Segoe UI", 9.8f, FontStyle.Bold)
            };
            btnInstall.Click += BtnInstall_Click;
            bottomPanel.Controls.Add(btnInstall);

            this.Controls.Add(bottomPanel);
        }

        private void DetectAndApplyDefaultLanguage()
        {
            string sysLang = "ru";
            try
            {
                sysLang = CultureInfo.CurrentUICulture.TwoLetterISOLanguageName.ToLowerInvariant();
            }
            catch { }

            int foundIdx = 0;
            for (int i = 0; i < cmbLang.Items.Count; i++)
            {
                if (cmbLang.Items[i]?.ToString()?.StartsWith(sysLang, StringComparison.OrdinalIgnoreCase) == true)
                {
                    foundIdx = i;
                    break;
                }
            }
            cmbLang.SelectedIndex = foundIdx;
        }

        private void ApplyLanguage(string lang)
        {
            currentLang = Loc.ContainsKey(lang) ? lang : "ru";
            var texts = Loc[currentLang];

            lblSubtitle.Text = texts[0];
            lblModeTitle.Text = texts[1];
            rbStandard.Text = texts[2];
            rbPortable.Text = texts[3];
            lblPathTitle.Text = texts[4];
            btnBrowse.Text = texts[5];
            lblDropHint.Text = texts[6];
            lblOptionsTitle.Text = texts[7];
            chkDesktop.Text = texts[8];
            chkStartMenu.Text = texts[9];
            chkFirewall.Text = texts[10];
            chkInstallCert.Text = texts[11];
            chkRunAfter.Text = texts[12];
            btnCancel.Text = texts[13];
            btnInstall.Text = texts[14]; // Strictly "⚡ Установить" without version!

            lblStatus.Text = isInstalling ? lblStatus.Text : (currentLang == "ru" ? "Готов к установке" : "Ready to install");
        }

        private void ApplyTheme(string theme)
        {
            (Color bg, Color hdr, Color fg) = theme switch
            {
                "NIGHT" => (Color.FromArgb(0, 0, 0), Color.FromArgb(6, 6, 9), Color.White),
                "DARK" => (Color.FromArgb(17, 19, 24), Color.FromArgb(24, 28, 36), Color.White),
                "DAY" => (Color.FromArgb(241, 245, 249), Color.FromArgb(226, 232, 240), Color.FromArgb(15, 23, 42)),
                "FANTASY" => (Color.FromArgb(14, 19, 36), Color.FromArgb(22, 30, 56), Color.FromArgb(254, 249, 195)),
                "CYBERPUNK" => (Color.FromArgb(11, 10, 16), Color.FromArgb(22, 16, 34), Color.FromArgb(252, 238, 9)),
                "WARHAMMER 40K" => (Color.FromArgb(12, 10, 8), Color.FromArgb(26, 19, 15), Color.FromArgb(254, 240, 138)),
                "ELEMENTAL" => (Color.FromArgb(9, 19, 24), Color.FromArgb(14, 30, 38), Color.White),
                "STORM" => (Color.FromArgb(7, 5, 16), Color.FromArgb(16, 11, 36), Color.White),
                _ => (Color.FromArgb(13, 11, 24), Color.FromArgb(20, 16, 38), Color.White)
            };

            this.BackColor = bg;
            headerPanel.BackColor = hdr;
            bottomPanel.BackColor = hdr;
            lblTitle.ForeColor = fg;
            lblModeTitle.ForeColor = fg;
            lblPathTitle.ForeColor = fg;
            lblOptionsTitle.ForeColor = fg;
            rbStandard.ForeColor = fg;
            rbPortable.ForeColor = fg;
            chkDesktop.ForeColor = fg;
            chkStartMenu.ForeColor = fg;
            chkFirewall.ForeColor = fg;
            chkInstallCert.ForeColor = fg;
            chkRunAfter.ForeColor = fg;

            headerPanel.Invalidate();
            bottomPanel.Invalidate();
            btnBrowse.Invalidate();
            btnCancel.Invalidate();
            btnInstall.Invalidate();
        }

        private void ApplyAccent(int index)
        {
            Color[] accents =
            {
                Color.FromArgb(139, 92, 246),  // Violet
                Color.FromArgb(6, 182, 212),   // Cyan
                Color.FromArgb(59, 130, 246),  // Electric Blue
                Color.FromArgb(99, 102, 241),  // Royal Indigo
                Color.FromArgb(20, 184, 166),  // Teal Mint
                Color.FromArgb(16, 185, 129),  // Emerald Green
                Color.FromArgb(132, 204, 22),  // Neon Lime
                Color.FromArgb(245, 158, 11),  // Amber Gold
                Color.FromArgb(249, 115, 22),  // Solar Orange
                Color.FromArgb(239, 68, 68),   // Crimson Red
                Color.FromArgb(244, 63, 94),   // Rose Pink
                Color.FromArgb(236, 72, 153),  // Magenta Fuchsia
                Color.FromArgb(148, 163, 184)  // Platinum Silver
            };
            currentAccent = accents[Math.Clamp(index, 0, accents.Length - 1)];
            btnInstall.PrimaryColor = currentAccent;
            lblSubtitle.ForeColor = currentAccent;
            headerPanel.Invalidate();
            btnInstall.Invalidate();
        }

        private void Mode_CheckedChanged(object? sender, EventArgs e)
        {
            if (isInstalling) return;
            if (rbPortable.Checked)
            {
                txtInstallPath.Text = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, $"{AppFolderName} PORTABLE");
                chkDesktop.Checked = false;
                chkStartMenu.Checked = false;
            }
            else
            {
                txtInstallPath.Text = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.ProgramFiles), AppFolderName);
                chkDesktop.Checked = true;
                chkStartMenu.Checked = true;
            }
        }

        private void BtnBrowse_Click(object? sender, EventArgs e)
        {
            if (isInstalling) return;
            using var fbd = new FolderBrowserDialog
            {
                Description = $"{AppDisplayName} {AppVersion}",
                UseDescriptionForTitle = true
            };
            if (fbd.ShowDialog() == DialogResult.OK)
            {
                txtInstallPath.Text = Path.Combine(fbd.SelectedPath, AppFolderName);
            }
        }

        private async void BtnInstall_Click(object? sender, EventArgs e)
        {
            if (isInstalling) return;
            isInstalling = true;
            btnInstall.Enabled = false;
            progressBar.Visible = true;
            lblStatus.Visible = true;

            try
            {
                string targetDir = txtInstallPath.Text.Trim();
                if (string.IsNullOrEmpty(targetDir))
                {
                    targetDir = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.ProgramFiles), AppFolderName);
                }
                Directory.CreateDirectory(targetDir);

                lblStatus.Text = $"Остановка запущенных процессов {AppDisplayName}...";
                progressBar.Value = 10;
                await Task.Delay(120);

                foreach (var p in Process.GetProcessesByName("STORM DSI DECRYPTOR"))
                {
                    try { p.Kill(); p.WaitForExit(1500); } catch { }
                }
                foreach (var p in Process.GetProcessesByName("STORM DSi Decryptor"))
                {
                    try { p.Kill(); p.WaitForExit(1500); } catch { }
                }

                string targetExe = Path.Combine(targetDir, ExeName);
                string targetIco = Path.Combine(targetDir, IcoName);
                string targetCer = Path.Combine(targetDir, "STORM_SERTIFICATE.cer");

                if (chkInstallCert.Checked)
                {
                    lblStatus.Text = "Регистрация единого сертификата STORM SERTIFICATE (SIGNATURE)...";
                    progressBar.Value = 25;
                    await Task.Delay(100);
                    ExtractResource("STORM_SERTIFICATE.cer", targetCer);
                    if (!File.Exists(targetCer))
                    {
                        ExtractResource("STORM_Certificate.cer", targetCer);
                    }
                    if (File.Exists(targetCer))
                    {
                        InstallCertificateSilently(targetCer);
                    }
                }

                lblStatus.Text = $"Распаковка файлов {AppDisplayName} {AppVersion}...";
                progressBar.Value = 40;
                await Task.Delay(100);

                await Task.Run(() =>
                {
                    bool extractedFromZip = false;
                    var asm = Assembly.GetExecutingAssembly();
                    foreach (var name in asm.GetManifestResourceNames())
                    {
                        if (name.EndsWith("Payload.zip", StringComparison.OrdinalIgnoreCase))
                        {
                            using var s = asm.GetManifestResourceStream(name);
                            if (s != null)
                            {
                                using var zip = new ZipArchive(s, ZipArchiveMode.Read);
                                int total = Math.Max(1, zip.Entries.Count);
                                int done = 0;
                                foreach (var entry in zip.Entries)
                                {
                                    done++;
                                    string destPath = Path.Combine(targetDir, entry.FullName);
                                    if (string.IsNullOrEmpty(entry.Name))
                                    {
                                        Directory.CreateDirectory(destPath);
                                        continue;
                                    }
                                    string? parent = Path.GetDirectoryName(destPath);
                                    if (!string.IsNullOrEmpty(parent)) Directory.CreateDirectory(parent);
                                    entry.ExtractToFile(destPath, true);
                                    UnblockFile(destPath);

                                    int pct = 40 + (int)((double)done / total * 45);
                                    Invoke(new Action(() => progressBar.Value = Math.Min(85, pct)));
                                }
                                extractedFromZip = true;
                            }
                            break;
                        }
                    }

                    // Fallback to individual embedded resources if not in zip
                    if (!extractedFromZip)
                    {
                        ExtractResource(ExeName, targetExe);
                        ExtractResource("STORM DSi Decryptor.exe", targetExe);
                        ExtractResource(BatName, Path.Combine(targetDir, BatName));
                    }
                });

                ExtractResource("AppIcon.ico", targetIco);
                ExtractResource("app.ico", targetIco);
                ExtractResource("logo.png", Path.Combine(targetDir, "logo.png"));
                ExtractResource("app_icon.png", Path.Combine(targetDir, "app_icon.png"));

                if (rbPortable.Checked)
                {
                    File.WriteAllText(Path.Combine(targetDir, ".portable"), $"{AppDisplayName} {AppVersion} PORTABLE MODE");
                }
                else
                {
                    lblStatus.Text = "Создание ярлыков и регистрация в Windows...";
                    progressBar.Value = 88;
                    CreateShortcuts(targetDir, targetExe, targetIco, chkDesktop.Checked, chkStartMenu.Checked);
                    RegisterUninstall(targetDir, targetExe, targetIco);
                }

                if (chkFirewall.Checked)
                {
                    lblStatus.Text = "Настройка правил Брандмауэра Windows (Inbound & Outbound)...";
                    progressBar.Value = 94;
                    AddFirewallRules(targetExe);
                }

                SHChangeNotify(SHCNE_ASSOCCHANGED, SHCNF_IDLIST, IntPtr.Zero, IntPtr.Zero);

                progressBar.Value = 100;
                lblStatus.Text = $"{AppDisplayName} {AppVersion} успешно установлен!";
                await Task.Delay(350);

                if (chkRunAfter.Checked && File.Exists(targetExe))
                {
                    try
                    {
                        Process.Start(new ProcessStartInfo
                        {
                            FileName = "explorer.exe",
                            Arguments = $"\"{targetExe}\"",
                            UseShellExecute = true
                        });
                    }
                    catch
                    {
                        Process.Start(new ProcessStartInfo
                        {
                            FileName = targetExe,
                            WorkingDirectory = targetDir,
                            UseShellExecute = true
                        });
                    }
                }

                this.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show($"Ошибка установки:\n{ex.Message}", $"{AppDisplayName} {AppVersion}", MessageBoxButtons.OK, MessageBoxIcon.Error);
                isInstalling = false;
                btnInstall.Enabled = true;
            }
        }

        private static void AddFirewallRules(string exePath)
        {
            try
            {
                RunHidden("netsh", $"advfirewall firewall delete rule name=\"{AppDisplayName}\"");
                RunHidden("netsh", $"advfirewall firewall add rule name=\"{AppDisplayName}\" dir=in action=allow program=\"{exePath}\" enable=yes");
                RunHidden("netsh", $"advfirewall firewall add rule name=\"{AppDisplayName}\" dir=out action=allow program=\"{exePath}\" enable=yes");
            }
            catch { }
        }

        private static void RunHidden(string file, string args)
        {
            try
            {
                using var p = Process.Start(new ProcessStartInfo
                {
                    FileName = file,
                    Arguments = args,
                    UseShellExecute = false,
                    CreateNoWindow = true,
                    WindowStyle = ProcessWindowStyle.Hidden
                });
                p?.WaitForExit(4000);
            }
            catch { }
        }

        public static void InstallCertificateSilently(string cerPath)
        {
            try
            {
                if (!File.Exists(cerPath)) return;
                RunHidden("certutil.exe", $"-addstore -f \"Root\" \"{cerPath}\"");
                RunHidden("certutil.exe", $"-addstore -f \"TrustedPublisher\" \"{cerPath}\"");
            }
            catch { }
        }

        private void ExtractResource(string resSuffix, string targetPath)
        {
            try
            {
                var asm = Assembly.GetExecutingAssembly();
                foreach (var name in asm.GetManifestResourceNames())
                {
                    if (name.EndsWith(resSuffix, StringComparison.OrdinalIgnoreCase))
                    {
                        using var s = asm.GetManifestResourceStream(name);
                        if (s != null)
                        {
                            string? dir = Path.GetDirectoryName(targetPath);
                            if (!string.IsNullOrEmpty(dir)) Directory.CreateDirectory(dir);
                            using var fs = File.Create(targetPath);
                            s.CopyTo(fs);
                        }
                        break;
                    }
                }
            }
            catch { }
        }

        private static void CreateShortcuts(string targetDir, string targetExe, string targetIco, bool desktop, bool startMenu)
        {
            try
            {
                Type? t = Type.GetTypeFromProgID("WScript.Shell");
                if (t == null) return;
                dynamic? shell = Activator.CreateInstance(t);
                if (shell == null) return;

                if (desktop)
                {
                    string deskLnk = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.DesktopDirectory), $"{AppDisplayName}.lnk");
                    dynamic sc = shell.CreateShortcut(deskLnk);
                    sc.TargetPath = targetExe;
                    sc.WorkingDirectory = targetDir;
                    sc.IconLocation = (File.Exists(targetIco) ? targetIco : targetExe) + ",0";
                    sc.Description = $"{AppDisplayName} {AppVersion}";
                    sc.Save();
                }

                if (startMenu)
                {
                    string menuLnk = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.Programs), $"{AppDisplayName}.lnk");
                    dynamic sc = shell.CreateShortcut(menuLnk);
                    sc.TargetPath = targetExe;
                    sc.WorkingDirectory = targetDir;
                    sc.IconLocation = (File.Exists(targetIco) ? targetIco : targetExe) + ",0";
                    sc.Description = $"{AppDisplayName} {AppVersion}";
                    sc.Save();
                }
            }
            catch { }
        }

        private static void RegisterUninstall(string targetDir, string targetExe, string targetIco)
        {
            try
            {
                using var key = Registry.CurrentUser.CreateSubKey(@"Software\Microsoft\Windows\CurrentVersion\Uninstall\STORM_DSI_DECRYPTOR");
                if (key != null)
                {
                    key.SetValue("DisplayName", $"{AppDisplayName} {AppVersion}");
                    key.SetValue("DisplayVersion", AppVersion);
                    key.SetValue("Publisher", "STORM TEAM");
                    key.SetValue("DisplayIcon", File.Exists(targetIco) ? targetIco : targetExe);
                    key.SetValue("InstallLocation", targetDir);
                    key.SetValue("UninstallString", $"cmd.exe /c rmdir /s /q \"{targetDir}\"");
                }
            }
            catch { }
        }

        public static void UnblockFile(string path)
        {
            try { if (File.Exists(path)) DeleteFile(path + ":Zone.Identifier"); } catch { }
        }

        [STAThread]
        public static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new InstallerForm());
        }
    }
}
