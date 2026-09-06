# Send STORM DS 4.2.9 Announcement and APK to Telegram
$announcement = @'
🚀 Релиз STORM DS 4.2.9 доступен!

Продвинутый эмулятор двухэкранных консолей Nintendo DS и Nintendo DSi для Android с Vulkan, шейдерами librashader, интеллектуальной защитой сохранений и расширенной аппаратной поддержкой DSiWare.

🌟 Ключевые изменения и улучшения версии 4.2.9:

🔤 Автопатчинг шрифтов AlphaBounce:
• В ядро RomDecryptor интегрирован интеллектуальный механизм сигнатурного анализа и in-memory патчинга для игр AlphaBounce (код KAL*).
• Системный путь nand:/sys/TWLFontTable.dat автоматически перенаправляется на внутренний ресурс rom:/Arial.NFTR, а вызовы аварийного завершения OS_Terminate нейтрализуются NOP-инструкциями.
• Игра запускается и корректно отображает игровой текст без сторонней модификации ROM или дампов системных шрифтов.

📷 Виртуальный видеопоток DSi Camera:
• В PhysicalDSiCameraSource интегрирован генератор синтетических тестовых видеокадров YUV422.
• При недоступности физической камеры устройства или возврате пустых буферов эмулятор отдаёт валидный видеопоток, предотвращая зависания в American PopStar, Faceez, Photo Dojo.

⚡ Исправление шейдера Vulkan:
• В шейдере VulkanSurfacePresenterCompatibility.frag объявлены недостающие константы разрешения экрана (kPackedScreenWidth = 256u и kPackedScreenHeight = 192u).
• Устранены ошибки валидации SPIR-V через glslangValidator.

🛡️ Оптимизация CI/CD и безопасность секретов:
• Управление токенами переведено на защищённые переменные окружения и локальные конфигурации.
• Обновлены воркфлоу GitHub Actions для стабильной автоматической компиляции и исключения дублирования релизов.

📦 Релизный файл: STORM_DS_4.2.9.apk
'@

$apkPath = "E:\STORM DS\Files\STORM_DS_4.2.9.apk"
$caption = "STORM_DS_4.2.9 (Release • Nintendo DS and DSi Emulator)"

& pwsh -ExecutionPolicy Bypass -File (Join-Path $PSScriptRoot "send_telegram_release.ps1") `
    -ApkPath $apkPath `
    -Caption $caption `
    -Announcement $announcement
