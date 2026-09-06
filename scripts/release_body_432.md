> 💡 **Релиз 4.3.2** — *Эмулятор двухэкранной портативной игровой консоли Nintendo DS и Nintendo DSi для Android на базе WatermelonDS и melonDS Core*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **Совместимость AlphaBounce (KALE и KALP)**: Нативная интеграция таблицы шрифтов `TWLFontTable.dat` в файловую систему NAND (`0:/sys/TWLFontTable.dat`), устранение белого экрана и полная корректная отрисовка игрового текста без деструктивных модификаций памяти.
- 🌟 **Совместимость Dragon Quest Wars (KDQE)**: Автоматическая инициализация и подготовка структуры сохранений DSiWare на NAND (`public.sav`, `private.sav`, тикеты и метаданные) для прямого и байт-реверсивного Title ID, устранение системной ошибки запуска при монтировании тома `dataPub`.
- 🌟 **Стабильность библиотеки игр и значков**: Устранено мигание и запоздалое появление иконок и бэйджей при запуске за счёт мгновенной загрузки кэша ROM без блокирующих дисковых фильтров SAF на Android 11+.
- 🌟 **Поддержка сжатых ROM с DSi-улучшениями**: Восстановлена передача флага `isDsiEnhanced` в обработчике сжатых архивов для корректного отображения DSi-бэйджа.
- 🌟 **Дисковое кэширование иконок DSiWare**: Сохранение извлечённых иконок установленных тайтлов DSiWare в локальное дисковое хранилище для мгновенного повторного рендеринга.

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **Ядро DSi (SetupDirectBoot)**: Реализовано автоматическое создание файловой структуры директорий, тикетов, метаданных и форматированных FAT-образов `public.sav` и `private.sav` на NAND через `DSi_NAND::NANDMount`.
- 🔹 **Ядро DSi (SetupDirectBoot)**: Добавлена регистрация обоих вариантов Title ID (прямой `idNormal` и байт-реверсивный `idSwapped`) в таблице установленных заголовков по адресу `0x02FFD800` для гарантированного прохождения проверок TWL-SDK.
- 🔹 **Ядро DSi (SetupDirectBoot)**: Интегрирован автоматический импорт `TWLFontTable.dat` в `0:/sys/TWLFontTable.dat` на NAND при первом запуске DSi-режима.
- 🔹 **Ядро эмуляции**: Удалены деструктивные патчи ARM9 памяти для заголовков `KAL*`, вызывавшие сбой адресации и аварийное завершение `OS_Panic` на 84 кадре.
- 🔹 **Системный шрифт TWL**: Добавлен файл `app/src/main/assets/bios/dsi/TWLFontTable.dat` и автоматическая синхронизация через `MelonDSNandJNI` и `AndroidDSiNandManager`.
- 🔹 **Репозиторий ROM (FileSystemRomsRepository)**: Исключена синхронная отбрасывающая фильтрация `doesRomFileExist` при холодном старте `loadCachedRoms()`, обеспечивая отображение всех добавленных игр с первого кадра.
- 🔹 **Синхронизация метаданных**: В DTO зеркала кэша `RomMetadataMirrorDto` добавлено сохранение кода игры `gameCode` с многоуровневым сопоставлением.
- 🔹 **Обработка сжатых ROM (CompressedRomFileProcessor)**: Флаг `isDsiEnhanced` теперь корректно передаётся из метаданных заголовка в объект `Rom`.
- 🔹 **Кэширование иконок (RomIconProvider)**: Иконки `installedDsiWareIcon` автоматически сохраняются в дисковый кэш при первом обращении.

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **AlphaBounce (KALE and KALP) Compatibility**: Native integration of `TWLFontTable.dat` into NAND filesystem (`0:/sys/TWLFontTable.dat`), fixing the white screen freeze and restoring in-game text rendering without destructive memory hacks.
- 🔸 **Dragon Quest Wars (KDQE) Compatibility**: Automatic NAND structure and FAT save provisioning (`public.sav`, `private.sav`, tickets, and TMD) for both normal and byte-swapped Title IDs, fixing the system error on `dataPub` volume mount.
- 🔸 **Library and Badge Display Stability**: Fixed icons and badges popping in on startup by loading cached ROMs immediately without blocking SAF storage checks on Android 11+.
- 🔸 **Compressed DSi-Enhanced ROMs Support**: Fixed propagation of `isDsiEnhanced` flag in `CompressedRomFileProcessor` so DSi badges render properly on compressed games.
- 🔸 **DSiWare Icon Disk Caching**: Extracted `installedDsiWareIcon` bitmaps are now cached to persistent internal disk storage for instant library rendering.

</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>

- 📁 **Прикреплённые файлы**: Исполняемый пакет `STORM_DS_4.3.2.apk` доступен в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте APK файл из списка Assets и установите поверх предыдущей версии эмулятора.

</details>
