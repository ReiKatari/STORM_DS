> 💡 **Релиз 4.2.8** — *Продвинутый эмулятор двухэкранных консолей Nintendo DS и Nintendo DSi для Android с аппаратным ускорением Vulkan, шейдерами librashader, интеллектуальной защитой сохранений и эталонной архитектурной поддержкой DSiWare.*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[Аппаратная камера DSi (American PopStar Fix)]**: Устранено критическое падение SIGFPE (деление на ноль при пустом разрешении кадра в Context B) при нажатии кнопки «Подтвердить», а также исправлено аппаратное зависание при нажатии «Отменить» за счёт корректного сброса бита передачи CAM_CNT (0x04004202), отмены незавершённых событий прерываний и безопасного возврата состояния сенсора из режима захвата (7) в режим предпросмотра (3).
- 🌟 **[Оптимизация загрузки обложек]**: По умолчанию полностью отключена фоновая загрузка тяжёлых обложек Scraper Pro (GameTDB) и бейджей с обложками RetroAchievements. Списки и сетки игр открываются мгновенно без сетевых задержек и избыточного расхода мобильного трафика.
- 🌟 **[Редактор макета и поворот экрана]**: Исправлен сброс элементов управления при повороте устройства. Переключение видимости экранных кнопок в книжной ориентации теперь сохраняет корректный профиль и не приводит к исчезновению кнопок при переходе в альбомную ориентацию.
- 🌟 **[Контроль путей BIOS и NAND]**: Устранено нежелательное повторное создание каталога `/storage/emulated/0/STORM DS/bios/` при запуске эмулятора. Если в настройках пользователем указана собственная папка BIOS или NAND, автоматическая распаковка встроенных дампов и перезапись настроек полностью блокируются.
- 🌟 **[Двухэкранный рендеринг (AYN Thor)]**: Исправлено наложение экранов на двухэкранных портативных консолях. Нижний экран больше не рисуется поверх верхнего на основном дисплее, вторичный дисплей корректно отображает нижний экран, а виртуальные экранные кнопки автоматически отключаются при наличии второго физического экрана.
- 🌟 **[Навигация геймпадом в подменю]**: Реализована полноценная навигация аналоговыми стиками и крестовиной D-Pad по пунктам оверлейных подменю (настройки консоли, быстрое меню паузы), кнопки получили фокусное выделение и корректную активацию по нажатию клавиш контроллера.

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **[Ядро DSi Camera]**: Добавлена проверка нулевых габаритов кадра и автоматический фолбек к разрешению предпросмотра (или 640x480), исключающий деление на ноль в `TransferScanline`.
- 🔹 **[События DSi Camera]**: В регистре `0x04004202` обработана очистка 15-го бита — принудительно останавливается активная передача и отменяется запланированное событие прерывания `Event_DSi_CamTransfer`.
- 🔹 **[Стабильность камеры Android]**: JNI-мост `MelonDSAndroidCameraHandler` и `PhysicalDSiCameraSource` защищены проверками указателей, очисткой исключений JVM (`ExceptionClear`) и безопасным вычислением шага строк, предотвращая сбои при любых размерах буферов камеры.
- 🔹 **[Настройки обложек]**: Значения по умолчанию для `rom_gametdb_covers_enabled` и `rom_ra_covers_enabled` переведены в `false` в XML-ресурсах, репозитории настроек и интерфейсных компонентах Compose (`WatermelonRomArt`, `RomBrowserScreen`, `RomBrowserComposables`).
- 🔹 **[LayoutEditorActivity]**: Сброшен флаг модификации пользователем при повороте экрана и сохранении макета, обеспечено пересоздание экранных элементов в новом соотношении сторон.
- 🔹 **[Изоляция путей BIOS]**: `MelonDSApplication`, `SharedPreferencesSettingsRepository`, `BiosDirectoryPickerPreference` и `DsiStorageTitlesScanner` больше не вызывают принудительный `mkdirs()` для системных каталогов по умолчанию при наличии настроенных пользовательских директорий.
- 🔹 **[UILayoutProvider]**: При обнаружении вторичного дисплея компонент `BOTTOM_SCREEN` жёстко исключается из разметки главного экрана, `TOP_SCREEN` исключается из разметки второго экрана, а наэкранные кнопки управления скрываются.
- 🔹 **[AynThorLayoutDisplayMapper]**: Добавлено регистронезависимое распознавание встроенных дисплеев AYN Thor и Odin («Built-in Screen», «Screen-2», «Secondary Screen»).
- 🔹 **[Интерфейс и геймпад]**: Модификатор `bouncingClickable` адаптирован под систему фокуса Jetpack Compose с визуальным масштабированием при наведении, подменю консоли автоматически фокусирует первый элемент при открытии, а `EmulatorActivity` транслирует движения аналогового стика в события D-Pad при открытых меню.
- 🔹 **[Пакет установки]**: Сборка оптимизированного релизного пакета `STORM_DS_4.2.8.apk`.

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **[Hardware DSi Camera & American PopStar Fix]**: Eliminated SIGFPE crash (division by zero caused by empty resolution registers in Context B) when pressing "Confirm", and resolved the infinite hardware loop freeze when pressing "Cancel" by properly handling CAM_CNT (0x04004202) bit 15 clearing, cancelling pending transfer events, and resetting sensor state from capture (7) to preview (3).
- 🔸 **[Cover Art Fetching Default Optimization]**: Scraper Pro (GameTDB) heavy covers and RetroAchievements badges/boxart are now disabled by default across preferences and Compose UI, guaranteeing instant library loading and zero wasted cellular data.
- 🔸 **[Layout Editor Orientation Fix]**: Toggling on-screen button visibility in portrait mode no longer causes control buttons to disappear when switching to landscape orientation.
- 🔸 **[BIOS and NAND Path Preservation]**: Eliminated unwanted re-creation of `/storage/emulated/0/STORM DS/bios/` directory; when custom BIOS/NAND folders are specified, internal asset extraction and preference overwrites are cleanly skipped.
- 🔸 **[Dual-Screen Rendering on Handhelds (AYN Thor)]**: Resolved screen overlap on dual-display handhelds. The bottom screen is strictly filtered from the primary display, the top screen is filtered from the secondary display, and virtual touch controls are suppressed when a physical secondary screen is detected.
- 🔸 **[Submenu Gamepad & D-Pad Navigation]**: Enabled smooth analog stick and D-pad navigation across console settings and pause submenus with autofocus on first items and Compose focus support.

</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>

- 📁 **Прикреплённые файлы**: Исполняемые файлы, инсталляторы и архивы доступны в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте соответствующий архив/инсталлятор из списка Assets и следуйте стандартным инструкциям.

</details>
