> 💡 **Релиз 4.4.9** — *Высокопроизводительный эмулятор Nintendo DS и DSi с аппаратным ускорением Vulkan, апскейлом и расширенной кастомизацией*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[DSi и Сенсорный экран]**: Исправлен отклик тачскрина в DSi-Enhanced играх (включая Alice in Wonderland) — восстановлена обработка прерывания PENIRQ в контроллере DSi TSC и введена аппаратная калибровка 1:1 в NAND.
- 🌟 **[Производительность UI]**: Мгновенный отклик пункта «Настройки игры» в меню быстрой паузы — устранены задержки и блокирующие SAF-обращения к диску, меню теперь открывается без микрофризов.
- 🌟 **[Управление и Макеты]**: Новые и кастомные макеты управления теперь сохраняются и синхронизируются напрямую в `STORM DS/settings/` на внешнем накопителе, включая раздельные `.layout.json` файлы.
- 🌟 **[Интерфейс и Типографика]**: Исправлено позиционирование курсора и маркера выделения в диалоге переименования макетов, а также очищен номер версии во вкладке «О программе».

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **[Сенсорный ввод DSi]**: В `DSi_SPI_TSC` реализовано корректное переключение флага PENIRQ в регистре `NDS.KeyInput` при касании и отпускании сенсорного экрана.
- 🔹 **[Калибровка тача]**: В `DSi::SetupDirectBoot` и `EmulatorArgsBuilder` добавлена нормализация калибровочных данных АЦП (`TouchCalibrationADC1/2`) в NAND-профиле к точному диапазону `{0, 0}` – `{255 << 4, 191 << 4}`, устранившая смещение и слепые зоны по краям экрана.
- 🔹 **[Оптимизация меню паузы]**: Меню «Настройки игры» переведено на прямые синхронные геттеры рендерера, шейдеров и источника микрофона без предварительного глубокого сканирования файловой системы, сократив задержку с ~3 секунд до миллисекунд.
- 🔹 **[Хранение макетов]**: Кастомные макеты сенсорного экрана теперь автоматически дублируются и сохраняются в каталог `[Внешний накопитель]/STORM DS/settings/layouts.json`, а также в виде отдельных файлов конфигурации для каждого макета.
- 🔹 **[Текстовые поля]**: В `TextInputDialog` зафиксированы параметры `singleLine = true`, `maxLines = 1` и отключены лишние вертикальные отступы шрифта (`includeFontPadding = false`), благодаря чему курсор и маркер выделения точно позиционируются на базовой линии текста.
- 🔹 **[О программе]**: Формат отображения версии во вкладке «О программе и благодарности» приведен к чистому виду `4.4.9` без префикса `v` и суффикса `(Build ...)`.

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **[DSi Touchscreen]**: Fixed touchscreen responsiveness in DSi-Enhanced titles (including Alice in Wonderland) by restoring PENIRQ bit updates in DSi TSC and normalizing NAND ADC touch calibration to 1:1.
- 🔸 **[UI Optimization]**: Instant opening of «Game Settings» in the pause menu by removing heavy blocking filesystem/SAF traversals on the UI click path.
- 🔸 **[Layout Storage]**: Custom on-screen controller layouts are now saved and synced directly to `STORM DS/settings/layouts.json` and standalone `.layout.json` files on external storage.
- 🔸 **[Text Field Fix]**: Fixed cursor and selection handle vertical alignment in text input dialogs (`singleLine = true`, `maxLines = 1`, zero font padding).
- 🔸 **[About Screen]**: Version display cleanly formatted as `4.4.9` without `v` prefix and without build number.

</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>

- 📁 **Прикреплённые файлы**: Исполняемые файлы, инсталляторы и архивы доступны в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте соответствующий архив/инсталлятор из списка Assets и следуйте стандартным инструкциям.

</details>
