> 💡 **Релиз 4.4.10** — *Высокопроизводительный эмулятор Nintendo DS и DSi с аппаратным ускорением Vulkan, апскейлом и расширенной кастомизацией*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[DSi-Enhanced игры]**: Полностью восстановлен запуск и работа сенсорного экрана во всех играх с расширенными функциями DSi (*Alice in Wonderland*, *Prince of Persia: The Forgotten Sands*, *Mario vs Donkey Kong: Mini-Land Mayhem!* и др.).
- 🌟 **[Позиционирование курсора и маркеров]**: Исправлено отображение маркеров курсора и капель выделения текста в диалоге редактирования названия макета и параметрах компонентов.

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **[Ядро DSi]**: Восстановлена корректная обработка аппаратного бита EXTKEYIN на DSi и удалена перезапись NAND UserData, предотвращающая падения при проверке подлинности оборудования на старте игр.
- 🔹 **[Тачскрин DSi-Enhanced]**: Картриджи с DSi-улучшениями теперь по умолчанию запускаются в режиме DS с идеальной калибровкой сенсора, сохраняя при этом возможность ручного переключения в DSi при необходимости.
- 🔹 **[Оконная система диалогов]**: В `DetachedDialog` удален флаг `FLAG_LAYOUT_IN_SCREEN` и добавлен `SOFT_INPUT_ADJUST_RESIZE`, что синхронизировало систему координат всплывающих маркеров Compose с окном диалога.
- 🔹 **[Диалоги ввода текста]**: В диалогах `TextInputDialog`, `LayoutComponentPropertyValueDialog` и `LayoutComponentPositionDialog` отключен избыточный скроллинг (`allowContentScroll = false`), устраняющий переворачивание и прижатие маркеров к потолку текстового поля.
- 🔹 **[Конфигурация активности]**: Для `LayoutEditorActivity` в манифесте задан режим `android:windowSoftInputMode="adjustResize"`.

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **[DSi-Enhanced Games Boot and Touch]**: Resolved crash/hang on boot and restored 100% touchscreen responsiveness in all DSi-Enhanced games (*Alice in Wonderland*, *Prince of Persia: The Forgotten Sands*, *Mario vs Donkey Kong*).
- 🔸 **[C++ Core Reversion]**: Reverted DSi EXTKEYIN tampering and direct NAND userdata overwriting to keep genuine DSi hardware checks functional.
- 🔸 **[Cursor and Selection Handles]**: Fixed displaced and upside-down text selection teardrop handles and cursor indicators in layout name dialog.
- 🔸 **[Dialog Window Management]**: Removed `FLAG_LAYOUT_IN_SCREEN` and enabled `SOFT_INPUT_ADJUST_RESIZE` in `DetachedDialog` and `LayoutEditorActivity`.

</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>

- 📁 **Прикреплённые файлы**: Исполняемые файлы, инсталляторы и архивы доступны в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте соответствующий архив/инсталлятор из списка Assets и следуйте стандартным инструкциям.

</details>