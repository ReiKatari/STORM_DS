> 💡 **Релиз 4.8.1** — *Высокопроизводительный эмулятор Nintendo DS и DSi с аппаратным ускорением Vulkan, апскейлом и расширенной кастомизацией*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[Хранилище и миграция данных]**: Полный перенос базы данных SQLite (Room DB), системных директорий ядра, кэша обложек и резервных копий настроек в общедоступное хранилище `/storage/emulated/0/STORM DS/`.
- 🌟 **[Бесшовное обновление поверх]**: Внедрен постоянный релизный ключ подписи (Release Keystore), гарантирующий 100% совместимость и установку будущих обновлений поверх установленной версии без конфликтов сертификатов.
- 🌟 **[Встроенные обновления GitHub]**: Исправлен механизм проверки обновлений и загрузки APK из репозитория — устранены нестыковки идентификатора пакета, обновлен провайдер файлов (FileProvider) и обеспечена безопасная передача APK в системный инсталлятор Android.
- 🌟 **[Автоматическая синхронизация настроек]**: Реализовано сохранение и восстановление профилей управления и параметров эмулятора непосредственно из каталога `/storage/emulated/0/STORM DS/settings/`.

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **[Перенос базы данных в общее хранилище]**: Модуль `DatabaseModule.kt` перенаправлен на использование пути `/storage/emulated/0/STORM DS/database/melon-database`. Реализована автоматическая однократная миграция существующей базы данных и журналов WAL/SHM из внутренней памяти устройства.
- 🔹 **[Единый релизный ключ подписи]**: В конфигурацию сборки `build.gradle.kts` интегрирован постоянный релизный ключ `storm_release.keystore`, устраняющий ошибку `INSTALL_FAILED_UPDATE_INCOMPATIBLE` при обновлении пакета `com.stormds.emulator`.
- 🔹 **[Валидация обновлений GitHub]**: В `UpdateApkValidationPolicy.kt` исправлена проверка пакетов и сигнатур обновлений под целевой ID `com.stormds.emulator`.
- 🔹 **[Провайдер безопасных URI для установки]**: Класс `UpdateContentProvider.kt` приведен к стандарту `androidx.core.content.FileProvider` с поддержкой безопасных `content://` ссылок для Android PackageInstaller.
- 🔹 **[Оптимизация интервала проверки]**: Интервал периодической проверки новых релизов в `GitHubProdUpdatesRepository.kt` оптимизирован для оперативного информирования пользователя о выходе свежих сборок.
- 🔹 **[Изоляция кэша Coil и обложек]**: Кэш изображений библиотеки и кастомных обложек вынесен в подкаталог `/storage/emulated/0/STORM DS/cache/image_cache` и `/storage/emulated/0/STORM DS/covers/`.

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **[Storage Relocation to External Storage]**: Relocated SQLite Room database, native emulator directories, image caches, and settings mirrors to accessible external directory `/storage/emulated/0/STORM DS/`.
- 🔸 **[Seamless In-Place Updates]**: Integrated a permanent release keystore into the build system, eliminating certificate mismatch errors and allowing smooth updates over previous versions.
- 🔸 **[In-App GitHub Updates Fix]**: Corrected package validation policy, migrated `UpdateContentProvider` to standard `FileProvider`, and ensured robust APK installation via Android PackageInstaller.
- 🔸 **[Settings and Controller Profiles Mirroring]**: Enabled direct configuration backup and loading from `/storage/emulated/0/STORM DS/settings/`.
- 🔸 **[Version Bump]**: Promoted application version to 4.8.1 (`versionCode = 481`).

</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>

- 📁 **Прикреплённые файлы**: Исполняемые файлы, инсталляторы и архивы доступны в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте соответствующий архив/инсталлятор из списка Assets и следуйте стандартным инструкциям.

</details>
