> 💡 **Релиз 4.8.0** — *Высокопроизводительный эмулятор Nintendo DS и DSi с аппаратным ускорением Vulkan, апскейлом и расширенной кастомизацией*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[Оверлей загрузки]**: Устранен бесконечный спиннер ожидания при старте эмулятора благодаря внедрению интеллектуального сторожевого таймера (Watchdog) и отслеживанию первого отрисованного кадра.
- 🌟 **[Библиотека игр]**: Исправлено позиционирование списка игр при запуске приложения и обновлении библиотеки — список всегда стабильно начинается с первой игры без паразитного смещения.
- 🌟 **[Совместимость DSiWare]**: Восстановлен безупречный запуск всех частей линейки Anonymous Notes 1–4 в режиме прямого запуска (Direct Boot).
- 🌟 **[Сохранения The Legend of Zelda]**: Полностью устранена ошибка повреждения данных («Save data has become corrupted») при запуске The Legend of Zelda: Four Swords Anniversary Edition.

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **[Интеллектуальный сторожевой таймер оверлея]**: В `EmulatorActivity.kt` реализован механизм Boot Watchdog. Оверлей загрузки теперь автоматически и безусловно скрывается при получении первого сформированного видеокадра от ядра либо по безопасному таймауту (1500 мс), полностью исключая зависание анимации загрузки при задержках системных колбэков.
- 🔹 **[Фиксация позиции списка ROM]**: В `RomListFragment.kt` и `RomBrowserComposables.kt` доработана логика инициализации состояния прокрутки `LazyListState`. При холодном старте эмулятора и при ручном обновлении библиотеки (Pull-to-Refresh) позиция фокусировки и прокрутки принудительно центрируется на индексе 0 (первая игра в списке).
- 🔹 **[Прямой запуск Anonymous Notes 1–4]**: В модулях инициализации DSi/TWL окружения ядра melonDS устранены сбои при загрузке заголовков и таблиц прямого запуска для серии игр Anonymous Notes (Chapter 1, Chapter 2, Chapter 3, Chapter 4), обеспечив 100% стабильный запуск без сбоев.
- 🔹 **[Целостность сохранений Zelda Four Swords]**: Скорректирована структура предварительной инициализации данных сохранений DSiWare для The Legend of Zelda: Four Swords Anniversary Edition. Файл сохранения корректно валидируется внутренней проверкой игры, предотвращая ложные предупреждения об инициализации поврежденных данных.
- 🔹 **[Обновление версии]**: Номер версии приложения повышен до 4.8.0 (`versionCode = 480`), синхронизированы конфигурационные манифесты и документация README.

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **[Boot Overlay Watchdog]**: Fixed infinite loading spinner on emulator launch by implementing a smart watchdog timer in `EmulatorActivity.kt` that dismisses the loading overlay upon receiving the first rendered frame or after a safe timeout.
- 🔸 **[Library List Anchoring]**: Resolved list offset issues on startup and refresh in `RomListFragment.kt`. The game collection now reliably and smoothly anchors to the first title (index 0).
- 🔸 **[DSiWare Direct Boot Compatibility]**: Fixed boot crashes across the entire Anonymous Notes series (Chapters 1 through 4), ensuring smooth direct boot execution without NAND errors.
- 🔸 **[Zelda Four Swords Save Fix]**: Addressed save data corruption warnings on startup for The Legend of Zelda: Four Swords Anniversary Edition by ensuring correct DSiWare save header layout and checksum handling.
- 🔸 **[Version Bump]**: Promoted application version to 4.8.0 (`versionCode = 480`).

</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>

- 📁 **Прикреплённые файлы**: Исполняемые файлы, инсталляторы и архивы доступны в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте соответствующий архив/инсталлятор из списка Assets и следуйте стандартным инструкциям.

</details>
