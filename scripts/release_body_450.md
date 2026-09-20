> 💡 **Релиз 4.5.0** — *Высокопроизводительный эмулятор Nintendo DS и DSi с аппаратным ускорением Vulkan, апскейлом и расширенной кастомизацией*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[Эмуляция картриджа]**: Реализована поддержка расширенных команд Page Write (0x0A) и Fast Read (0x0B) памяти EEPROM в ядре эмулятора, обеспечившая успешный запуск и сохранение игры Dragon Quest Wars.
- 🌟 **[Отображение иконок и бэйджей]**: Восстановлено 100% отображение аутентичных картриджных иконок для всех игр библиотеки благодаря интеграции общего каталога иконок и устранению фиктивных плейсхолдеров.
- 🌟 **[Стабильность R8 и ProGuard]**: Внедрены строгие правила защиты метаданных ROM, DTO-моделей и фабрик загрузчика Coil от обфускации и усечения.

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **[Запуск Dragon Quest Wars]**: В модуле `melonDS-android-lib/src/NDSCart.cpp` добавлены недостающие обработчики опкодов `0x0A` (Page Write) и `0x0B` (Fast Read) для EEPROM-чипов картриджей. Игра корректно создаёт и обновляет файл сохранения 32 КБ, успешно проходит проверку целостности данных и выходит на титульный экран и геймплей.
- 🔹 **[Каталог иконок STORM DS]**: В `RomIconProvider.kt` добавлено сканирование общей системной директории `/sdcard/STORM DS/icons/` с поддержкой поиска по имени файла, хешу имени, коду игры (`gameCode`, `code_<ID>`) и маске суффикса. Все извлекаемые иконки автоматически кэшируются и сохраняются в общий каталог.
- 🔹 **[Фильтрация плейсхолдеров RetroAchievements]**: В `WatermelonRomArt.kt` и `AndroidRetroAchievementsRepository.kt` внедрена фильтрация стандартных служебных плейсхолдеров серверов RetroAchievements (`000001.png`), что исключило подмену оригинальных картриджных иконок карточек на универсальные изображения геймпадов.
- 🔹 **[Целостность данных и Coil]**: В `app/proguard-rules.pro` зафиксированы правила сохранения `@SerializedName`, полей DTO и моделей `Rom`, а в `CoilModule.kt` добавлена строгая типизация фабрик компонентов `Rom::class.java` и `Background::class.java`.
- 🔹 **[Обновление версии]**: Номер версии приложения повышен до 4.5.0 (`versionCode = 452`), синхронизированы манифесты сборки и документация проекта.

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **[Dragon Quest Wars Emulation]**: Added support for EEPROM Page Write (`0x0A`) and Fast Read (`0x0B`) opcodes in `NDSCart.cpp`, allowing Dragon Quest Wars to initialize, save progress, and boot to title and gameplay.
- 🔸 **[Cartridge Icons and Badges Restored]**: Restored 100% icon coverage across the ROM library by integrating the shared `/sdcard/STORM DS/icons/` repository with robust candidate key lookups and prefix/suffix matching.
- 🔸 **[RetroAchievements Placeholder Filtering]**: Suppressed RA default fallback gamepad images (`000001.png`), ensuring original DS cartridge art is always prioritized.
- 🔸 **[R8 and ProGuard Hardening]**: Preserved all Rom DTO fields, `@SerializedName` annotations, and Coil fetcher factory registrations under release minification.
- 🔸 **[Version Bump]**: Promoted project release to 4.5.0 (`versionCode = 452`).

</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>

- 📁 **Прикреплённые файлы**: Исполняемые файлы, инсталляторы и архивы доступны в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте соответствующий архив/инсталлятор из списка Assets и следуйте стандартным инструкциям.

</details>
