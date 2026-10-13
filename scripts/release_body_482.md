> 💡 **Релиз 4.8.2** — *Высокопроизводительный эмулятор Nintendo DS и DSi для Android с аппаратным ускорением Vulkan, шейдерами librashader, встроенным переводчиком и единой открытой структурой хранилища*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[Полная консолидация хранилища в `/storage/emulated/0/STORM DS/`]**: Все конфигурации, кэши обложек, иконки ROM, миниатюры фонов, скриншоты быстрых сохранений, распакованные архивы, шейдеры RetroArch, кэш переводчика, голосовые модели TTS, офлайн-база RetroAchievements, резервные копии NAND и загружаемые обновления APK перенесены в единый каталог `/storage/emulated/0/STORM DS/` с автоматической миграцией и очисткой внутренних папок Android.
- 🌟 **[Устранение рассинхронизации настроек (Split-Brain Fix)]**: Унифицировано чтение, запись и резервное копирование `rom_data.json`, `layouts.json`, `controller_config.json`, `backgrounds.json`, `STORM_DS.opts` и `settings.json` напрямую в `/storage/emulated/0/STORM DS/settings/` с включённым по умолчанию зеркалированием.
- 🌟 **[Запуск архивов и DSi-Enhanced игр]**: Исправлена детекция заголовков для сжатых архивов `.zip` и `.7z` (исключён ложный перевод обычных DS-игр в режим DSiWare), а также корректно разделены картриджи DSi-Enhanced (`'V'` и `'T'`) и полноэкранные тайтлы DSiWare (`0x00030004`).
- 🌟 **[Синхронизация сохранений DSiWare и SAF]**: Защищена выгрузка сохранений DSiWare из NAND при завершении сессии (исключена перезапись новых сохранений старым кэшем) и исправлен MIME-тип создания файлов сохранений через SAF (`application/octet-stream`), предотвращающий добавление лишнего расширения `.bin` на Android 10–14.
- 🌟 **[Менеджер обновлений GitHub и поддержка DLDI SD-карт]**: Загрузка пакетов обновлений `update.apk` переведена на прямое скачивание в `/storage/emulated/0/STORM DS/updates/`, исправлена проверка сертификатов подписи APK и восстановлена поддержка пользовательских образов виртуальных SD-карт DLDI для homebrew-игр.

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **[Единый каталог `/storage/emulated/0/STORM DS/` (`MelonDSApplication.kt`)]**: Расширена процедура стартовой миграции `migrateStorageToRoot()`, переносящая все пользовательские данные и кэши во внешнее хранилище и автоматически удаляющая устаревшие дубликаты из `/data/user/0/com.stormds.emulator/` и `/storage/emulated/0/Android/data/com.stormds.emulator/`.
- 🔹 **[Кэш иконок, обложек и скриншотов (`RomIconProvider.kt`, `SaveStateScreenshotProvider.kt`, `BackgroundThumbnailProvider.kt`)]**: Иконки картриджей перенесены в `STORM DS/icons/`, превью слотов сохранений — в `STORM DS/screenshots/savestates/`, а миниатюры фонов и обложек — в `STORM DS/cache/`.
- 🔹 **[Шейдеры, читы и диагностические логи (`RetroArchShaderLibraryManager.kt`, `RomCheatsUi.kt`, `StormDeviceSystemInfoReporter.kt`)]**: Библиотека шейдеров `retroarch-shaders` размещена в `STORM DS/shaders/retroarch-shaders/`, исключено дублирование базы читов `usrcheat.dat` во внутренней памяти, а журналы диагностики и отчёты о сбоях записываются исключительно в `STORM DS/logs/`.
- 🔹 **[Переводчик, TTS и RetroAchievements (`TranslationCache.kt`, `LocalAiVoiceActorStudio.kt`, `AndroidOfflineLedgerStorage.kt`)]**: Кэш переведённых диалогов, модели локальной озвучки TTS и офлайн-очередь достижений RetroAchievements перенесены в подкаталоги `STORM DS/cache/` и `STORM DS/tts_models/`.
- 🔹 **[Работа со сжатыми ROM и DSiWare (`AndroidEmulatorManager.kt`, `NdsRomCache.kt`, `AndroidDSiNandManager.kt`)]**: Чтение заголовков ROM в `isRealDsiWareTitle()` и `loadDsiWare()` теперь предварительно распаковывает `.zip` и `.7z` архивы через `resolvePlayableRomUri(rom)`, а эталонный бэкап NAND хранится в `STORM DS/bios/dsi/nand_golden_backup.bin`.
- 🔹 **[Надёжность сохранений (`SramProvider.kt`, `AndroidEmulatorManager.kt`)]**: При создании `.sav` и `.srm` файлов через `DocumentFile.createFile()` используется `application/octet-stream` вместо `application/*`. При закрытии DSiWare-игры отслеживается время модификации кэш-файла, что гарантирует сохранность прогресса как при записи в `nand.bin`, так и при прямой записи в `sramUri`.
- 🔹 **[Установщик обновлений (`GitHubUpdateInstallManager.kt`, `provider_paths.xml`)]**: Скачивание обновлений с GitHub выполняется напрямую в `/storage/emulated/0/STORM DS/updates/update.apk` с отображением прогресса и проверкой цифровой подписи APK на всех версиях Android.
- 🔹 **[Оптимизация времени запуска (`AndroidEmulatorManager.kt`)]**: Исключена искусственная задержка `delay(500)` перед снятием стартовой паузы эмулятора при запуске игр.

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **[Unified Storage Consolidation (`/storage/emulated/0/STORM DS/`)]**: Migrated all configuration files, ROM icons, cover caches, save state screenshots, extracted ROM archives, RetroArch shaders, translator caches, TTS voice models, RetroAchievements offline ledgers, DSi NAND golden backups, and downloaded APK updates exclusively into `/storage/emulated/0/STORM DS/`, automatically purging legacy internal and app-scoped external folders on startup.
- 🔸 **[Settings Synchronization Fix (`SettingsBackupManager.kt`, `FileSystemRomsRepository.kt`, `InternalLayoutsRepository.kt`, `InternalBackgroundsRepository.kt`)]**: Eliminated split-brain inconsistencies between `context.filesDir` and `/storage/emulated/0/STORM DS/settings/` by reading and writing `rom_data.json`, `layouts.json`, `controller_config.json`, `backgrounds.json`, `STORM_DS.opts`, and `settings.json` directly in `/storage/emulated/0/STORM DS/settings/` with settings mirroring enabled by default.
- 🔸 **[Archive and DSi-Enhanced Detection Fix (`AndroidEmulatorManager.kt`)]**: Resolved `isRealDsiWareTitle()` and `loadDsiWare()` archive header inspection by extracting `.zip` and `.7z` ROMs via `resolvePlayableRomUri(rom)` before inspecting the NDS/TWL header, and restricted DSiWare classification strictly to `0x00030004` titles so DSi-Enhanced cartridges (`'V'` and `'T'`) launch via the cartridge pipeline.
- 🔸 **[DSiWare Save Sync and SAF MIME Fix (`AndroidEmulatorManager.kt`, `SramProvider.kt`)]**: Tracked modification timestamps on cached DSiWare saves so NAND-written saves are never overwritten by stale pre-launch cache files upon exit, and changed `DocumentFile.createFile()` MIME type from `application/*` to `application/octet-stream` to prevent Android SAF from appending `.bin` to `.sav` and `.srm` files.
- 🔸 **[GitHub Updater and DLDI SD Card Support (`GitHubUpdateInstallManager.kt`, `AndroidEmulatorManager.kt`)]**: Updated the in-app GitHub updater to download `update.apk` directly into `/storage/emulated/0/STORM DS/updates/update.apk` with signature verification across all Android API levels, preserved user DLDI SD card configuration in `withPreparedDldiConfiguration()`, and removed the 500ms artificial post-boot delay.
- 🔸 **[Version Bump]**: Promoted application version to 4.8.2 (`versionCode = 482`).

</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>

- 📁 **Прикреплённые файлы**: Исполняемые файлы, инсталляторы и архивы доступны в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте соответствующий архив/инсталлятор из списка Assets и следуйте стандартным инструкциям.

</details>
