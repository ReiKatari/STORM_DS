> 💡 **Релиз 4.4.3** — *Эмулятор двухэкранной портативной игровой консоли Nintendo DS и Nintendo DSi для Android*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[Библиотека игр и алфавитный указатель]**: Гарантированное отображение каталога от первой игры и мгновенный скролл к началу по нажатию «#»
- 🌟 **[Эмуляция DSi и DSiWare]**: Оптимизация подсистемы прямого запуска с защитой системных слотов монтирования и эталонной инициализацией crt0
- 🌟 **[Совместимость с играми]**: Безупречный запуск Dark Void Zero на русском языке и тактической стратегии Jagged Alliance
- 🌟 **[Сетевой трафик и обложки]**: Раздельное независимое управление источниками обложек с отключением сетевой загрузки по умолчанию

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **[Библиотека игр и скролл]**: Полностью устранено смещение списка к играм на букву «A» («Advance Wars») при холодном старте и ручном обновлении (pull-to-refresh). Каталог игр отображается строго от первого элемента списка («18th Gate», «3 Heroes - Crystal Soul» и др.).
- 🔹 **[Алфавитная панель]**: Символ «#» в боковой панели навигации строго привязан к позиции (0, 0), обеспечивая мгновенный и надёжный возврат на самую вершину библиотеки.
- 🔹 **[Прямой запуск DSi/DSiWare]**: Настроена динамическая таблица монтирования SD/MMC устройств (devList) для слотов 0–8 с защитой системных слотов 9 и 10 от коллизий SDK.
- 🔹 **[Инициализация crt0]**: Установлен эталонный индикатор загрузки 0x0001 в регистрах 0x027FFC40 и 0x02FFFC40 и корректные криптографические флаги DSi (DSiCryptoFlags |= 0x03).
- 🔹 **[Dark Void Zero]**: Сохранена прямая подмена повреждённого сегмента ARM7i для русской версии игры («KDVE»), устраняющая зависания при запуске.
- 🔹 **[Jagged Alliance]**: Сохранён расширенный эвристический анализ опкодов ARM и Thumb в алгоритме Modcrypt, предотвращающий появление белого экрана.
- 🔹 **[Настройки обложек]**: Реализованы независимые переключатели для Scraper Pro (GameTDB Front), GameTDB 2D, GameTDB 3D и RetroAchievements с отключением фонового расхода сетевого трафика.

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **[Game Library and Alphabet Bar]**: Guaranteed top library alignment from the very first ROM item on launch and pull-to-refresh; instant scroll to top (0, 0) when pressing "#".
- 🔸 **[DSi and DSiWare Emulation]**: Robust direct boot subsystem with dynamic devList table (slots 0–8), protection for system mount slots 9 and 10, and standard 0x0001 crt0 boot indicator.
- 🔸 **[Game Compatibility]**: Reliable execution for Dark Void Zero Russian translation (clean ARM7i injection) and Jagged Alliance (enhanced Modcrypt ARM/Thumb heuristics).
- 🔸 **[Cover Art Settings]**: Independent toggles for Scraper Pro, GameTDB 2D, GameTDB 3D, and RetroAchievements, defaulting to disabled for zero network traffic consumption.

</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>

- 📁 **Прикреплённые файлы**: Исполняемые файлы, инсталляторы и архивы доступны в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте соответствующий архив/инсталлятор из списка Assets и следуйте стандартным инструкциям.

</details>
