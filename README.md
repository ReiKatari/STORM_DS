<div align="center">

# ⚡ STORM DS

<p align="center">
  <b>Высокопроизводительный форк WatermelonDS / melonDS для Android с Vulkan 3D, поддержкой шейдеров RetroArch, внешними экранами и RetroAchievements.</b>
</p>

[![Release](https://img.shields.io/badge/Release-v3.0.6-00D2FF.svg?style=for-the-badge)](https://github.com/ReiKatari/STORM_DS/releases)
[![Platform](https://img.shields.io/badge/Platform-Android%208.0%2B-0EA5E9.svg?style=for-the-badge)](https://github.com/ReiKatari/STORM_DS)
[![License](https://img.shields.io/badge/License-GPL--3.0-10B981.svg?style=for-the-badge)](https://www.gnu.org/licenses/gpl-3.0.html)
[![Fork](https://img.shields.io/badge/Fork%20of-WatermelonDS%20%7C%20melonDS-FF6B6B.svg?style=for-the-badge)](https://github.com/SapphireRhodonite/WatermelonDS)

</div>

---

## 🌟 О проекте и происхождение (About & Fork Origin)

**STORM DS** — это продвинутый и высокопроизводительный эмулятор Nintendo DS и Nintendo DSi для Android.

Проект является глубоким форком **[WatermelonDS](https://github.com/SapphireRhodonite/WatermelonDS)** (автор *SapphireRhodonite* и контрибьюторы), который в свою очередь создан как современный Android-порт эталонного эмулятора **[melonDS](https://melonds.kuribo64.net/)** (авторы *StapleButter*, *Nadia*, *RSDuck*, *genericretrogeek*, *Arisotura* и команда melonDS).

### Архитектурная родословная:
1. **melonDS** — оригинальное, высокоточное ядро эмуляции Nintendo DS & DSi на C++.
2. **WatermelonDS** — современный порт для платформы Android с аппаратным Vulkan-рендерером, поддержкой шейдеров librashader, Material Design UI и сенсорным управлением.
3. **STORM DS** — расширенный форк с устранением критических ограничений ядра, полноценным прямым запуском Slot-1 Cartridge Boot для DSiWare (включая Castle of Magic), защитой файлов прошивки и NAND от повреждений, оффлайн-достижениями RetroAchievements, двухэкранным выводом на внешние дисплеи (ТВ/мониторы по HDMI/USB-C), мгновенным сканером РОМов, эргономичными пресетами экранов в стиле DraStic, синхронизацией тем и полной русской локализацией.

---

## ⚡ Ключевые возможности STORM DS

### 🎮 Эталонная эмуляция DS & DSi
* **Прямой запуск DSi & DSiWare (Direct Boot)**: Корректная загрузка исполняемых регионов ARM9i/ARM7i в память без необходимости предварительной установки в NAND и без риска повреждения системного файла `dsi_nand.bin`.
* **Защита целостности NAND**: Исключены любые неконтролируемые фоновые модификации образа NAND при сканировании каталогов или запуске игр.
* **JIT-рекомпилятор**: Высокая скорость работы и стабильные 60 FPS даже на устройствах среднего уровня.
* **Nintendo Wi-Fi Connection (libslirp)**: Сетевой мультиплеер и онлайн-сервисы через встроенную эмуляцию сетевого стека.
* **Поддержка микрофона и камеры**: Физические камеры устройства и микрофон Android для интерактивных игр DSi/DS.

### 🚀 Графика и Шейдеры (Vulkan & librashader)
* **Аппаратный Vulkan Fastpath & OpenGL**: Масштабирование внутреннего 3D-разрешения до 4x/8x.
* **Шейдерный конвейер RetroArch (librashader)**: Поддержка популярных пресетов Slang (CRT, LCD-сетки, xBRZ, сглаживание, ScaleFX) в реальном времени.
* **Adrenotools**: Возможность загрузки кастомных GPU-драйверов Turnip / Adreno для устройств на процессорах Snapdragon.
* **Настраиваемый HUD**: Счетчик FPS и индикатор активного разрешения, симметрично расположенные в верхней части экрана.

### 📺 Вывод на телевизоры и внешние дисплеи (Dual Display)
* Полноценная игра на телевизоре или внешнем мониторе через USB-C / HDMI док-станции (Odin 2, планшеты, смартфоны).
* Верхний игровой экран выводится на большой дисплей, а нижний сенсорный экран остается на портативном устройстве с элементами управления.

### 🏆 RetroAchievements & Оффлайн-профиль
* Полная поддержка достижений, бейджей и режима Hardcore.
* **Автономная синхронизация (Offline Play)**: Достижения сохраняются локально при игре без интернета и автоматически отправляются на сервер при подключении сети.

### 🎛️ Эргономика и пресеты экранов (DraStic Style)
* Быстрое меню пресетов экранов: Ровная альбомная, Неровная альбомная (один большой, второй маленький у верхнего края), Ровная портретная, Пропорциональная и Полноэкранная.
* Экранная кнопка быстрой смены экранов (Swap Screens) в верхней панели.
* Полный редизайн всех модальных окон (Перемотка, Сохранение, Загрузка, Меню паузы) с унифицированной кнопкой «Назад» снизу по центру и безопасными отступами от системных вырезов.

### 🎨 Премиальный дизайн и синхронизация тем
* Темы оформления: OLED Cyber Black, Midnight Indigo, Emerald Glass, Sunset, Crimson и светлые темы.
* Полная динамическая синхронизация цвета векторных иконок в настройках с выбранным акцентным цветом темы.

---

## 💖 Благодарности и авторы / Credits & Acknowledgements

STORM DS выражает глубокую признательность авторам и сообществу открытых проектов, сделавших этот эмулятор возможным:

* **[JPeacekeeper](https://4pda.to/forum/index.php?showuser=5768740)** (4PDA):
  * Неоценимый вклад в тестирование, детальные отчеты об ошибках DSi/NAND, стандартизацию фреймрейта и активное развитие проекта STORM DS.
* **[WatermelonDS](https://github.com/SapphireRhodonite/WatermelonDS)** (Форк melonDS для Android):
  * **SapphireRhodonite**, **rafaelvcaetano** и всем контрибьюторам WatermelonDS за разработку мощного порта на Android, высокоскоростной аппаратный рендер Vulkan Fastpath, интеграцию шейдерного движка librashader, улучшенные экранные раскладки и современный сенсорный интерфейс.
* **[melonDS](https://melonds.kuribo64.net/)** (Оригинальное ядро эмулятора Nintendo DS & DSi):
  * **StapleButter**, **Nadia**, **RSDuck**, **genericretrogeek**, **Arisotura** и всей команде разработчиков melonDS за эталонную точность, быстродействие и чистую архитектуру эмуляции Nintendo DS и DSi.
* **[melonDS DS (RetroArch Core)](https://github.com/JesseTG/melonds-ds)** (Ядро эмулятора melonDS для RetroArch / Libretro):
  * **JesseTG** и команде Libretro за передовые наработки по автозагрузке DSiWare, исследования структуры TLNC warmboot и оптимизацию архитектуры ядра.
* **[DraStic & fastDS](https://drastic-ds.com/)**:
  * **Exophase** и создателям эмуляторов DraStic и fastDS за вдохновение в создании удобных пресетов раскладки экранов и эргономики сенсорного управления.
* **Сторонние открытые библиотеки и экосистемы**:
  * **[Google Oboe](https://github.com/google/oboe)** — высокопроизводительная низколатентная аудиосистема с AAudio и OpenSL ES.
  * **[librashader](https://github.com/SnowflakePowered/librashader)** — кроссплатформенный конвейер шейдеров RetroArch (Slang).
  * **[RetroAchievements (rcheevos)](https://github.com/RetroAchievements/rcheevos)** — открытый стандарт интеграции достижений и таблиц рекордов.
  * **[libslirp](https://gitlab.freedesktop.org/slirp/libslirp)** — пользовательский стек сетевой эмуляции Nintendo Wi-Fi Connection.
  * **[libadrenotools](https://github.com/bylaws/libadrenotools)** — интеграция кастомных драйверов Qualcomm Adreno / Turnip.

---

## 📲 Установка / Download

Релизные сборки APK доступны в разделе [Releases](https://github.com/ReiKatari/STORM_DS/releases):

* **`STORM_DS_3.0.6.apk`** — Главная релизная версия с поддержкой Adrenotools, Vulkan 3D и автоматическими обновлениями.

---

## 🕹️ Интеграция с лаунчерами / Frontend Integration

STORM DS поддерживает запуск из популярных Android-оболочек (**Daijishō**, **Beacon Launcher**, **Pegasus**, **EmulationStation-DE**, **LaunchBox**):

* **Package Name**: `me.magnum.melondualds`
* **Activity Name**: `me.magnum.melonds.ui.emulator.EmulatorActivity`
* **Параметры запуска (Intent)**:
  * `Intent data`: URI NDS-файла (`content://...` или `file://...`) с флагом `FLAG_GRANT_READ_URI_PERMISSION`.

---

## 🛠️ Сборка из исходного кода / Building

### Требования
1. **JDK 21**
2. **Android SDK & NDK** (`28.0.13004108`+)
3. **CMake** (3.22.1+)
4. **Rust Toolchain** (`rustup` / `cargo`) для сборки `librashader` под архитектуры Android ABI (`arm64-v8a`, `armeabi-v7a`, `x86_64`).

### Команды сборки
```bash
# Клонирование репозитория вместе с субмодулями
git clone --recurse-submodules https://github.com/ReiKatari/STORM_DS.git
cd STORM_DS

# Сборка релизного APK для GitHub
./gradlew assembleGitHubProdRelease

# Готовый APK будет расположен по пути:
# app/build/outputs/apk/gitHubProd/release/STORM_DS_3.0.6.apk
```

---

## 📜 Лицензия / License

Проект распространяется под лицензией **GPL-3.0 License**.

Основан на разработках [melonDS](https://melonds.kuribo64.net/) и [WatermelonDS](https://github.com/SapphireRhodonite/WatermelonDS) с глубокими модификациями ядра, ускорением ввода/вывода, поддержкой внешних экранов, оффлайн-достижениями и оптимизациями STORM DS.