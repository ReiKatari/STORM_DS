<h1 align="center">STORM DS</h1>

## **О проекте**
STORM DS — эмулятор двухэкранной портативной игровой консоли Nintendo DS и Nintendo DSi для Android. Проект является форком эмулятора **WatermelonDS** (на базе портов **melonDS Android** от Yopolo и оригинального ядра **melonDS** от Arisotura). **WatermelonDS является фундаментальной основой этого форка!** Эмулятор включает расширенный набор визуальных шейдеров, встроенную интеграцию с RetroAchievements, поддержку чит-кодов, управление сенсорным экраном со стилусом и гироскопом, настраиваемые оверлеи экранов, автопереводчик текста и многопоточный рендеринг.

## **Технологический стек**
- **Языки программирования**: Kotlin, Java, C++, C, Rust
- **Графические интерфейсы и бэкенды**: Jetpack Compose, Android Views, Vulkan, OpenGL ES 3.0+, Software Renderer
- **Аудиосистема**: Google Oboe (AAudio и OpenSL ES)
- **Эмуляционные ядра**: melonDS Core, ARM7 и ARM9 JIT Recompiler
- **Шейдерный конвейер**: librashader (шейдеры формата Slang)
- **Драйверы GPU**: libadrenotools (пользовательские драйверы Qualcomm Adreno и Turnip)
- **Интеграции**: RetroAchievements API (rcheevos), FastLZ, ML Kit Translation

## **Ключевые возможности**
- **Двухэкранные режимы отображения**: Горизонтальное, вертикальное, гибридное и раздельное расположение экранов с гибкой настройкой масштаба и позиционирования.
- **Шейдеры и апскейлинг**: Поддержка xBRZ, CRT, LCD Grid, FXAA и библиотека шейдеров librashader.
- **Аппаратное ускорение Vulkan Fastpath**: Высокая производительность и низкая задержка вывода кадров.
- **Интеграция с RetroAchievements**: Получение достижений, таблицы лидеров и режим хардкора в играх.
- **Управление микрофоном, гироскопом и сенсором**: Эмуляция шума микрофона, калибровка гироскопа и точный ввод координат сенсорного экрана.
- **Сетевая игра (Local Wi-Fi и DWC)**: Локальный мультиплеер и подключение к серверам Nintendo Wi-Fi Connection.

## **Сборка из исходного кода**

### **Требования к окружению**
- **JDK**: OpenJDK 21 или новее
- **Android SDK**: API Level 36 (Android 16)
- **Android NDK**: Версия `28.0.13004108`
- **CMake**: Версия 3.22.1 или новее
- **Rust Toolchain**: С установленными таргетами Android ABI (`aarch64-linux-android`, `armv7-linux-androideabi`, `x86_64-linux-android`) для сборки библиотеки `librashader`

### **Команды сборки**
```bash
# Клонирование репозитория вместе с субмодулями
git clone --recurse-submodules https://github.com/ReiKatari/STORM_DS.git

# Переход в каталог проекта
cd STORM_DS

# Сборка релизного пакета APK
./gradlew assembleGitHubProdRelease
```

После завершения сборки исполняемый пакет APK будет сформирован по пути:
`app/build/outputs/apk/gitHubProd/release/STORM_DS_4.1.4.apk`

## **Благодарности**
- **SapphireRhodonite (автор WatermelonDS)** — за создание эмулятора WatermelonDS, послужившего основой форка, разработку высокопроизводительного порта на Android, аппаратный рендерер Vulkan, внедрение шейдерного конвейера librashader и инновационный интерфейс.
- **rafaelvcaetano** — за развитие WatermelonDS, оптимизацию сенсорного управления, эргономику раскладок экранов и вклад в Android-эмуляцию.
- **Arisotura (StapleButter) и MelonDS Team** — за выдающийся эмулятор melonDS и безупречную эмуляцию архитектуры Nintendo DS и Nintendo DSi.
- **RSDuck, Nadia, GenericHeroGuy** — за фундаментальный вклад в развитие ядра melonDS, поддержку DSi и JIT-компилятор.
- **Yopolo и Guillaume** — за разработку оригинального порта melonDS Android.
- **JesseTG и команда melonDS DS (Libretro)** — за исследования структуры автозагрузки DSiWare и оптимизацию архитектуры.
- **Команда DeSmuME (Yabause, Zeromus, rogerman)** — за фундаментальные исследования архитектуры ARM9 и ARM7 консоли Nintendo DS.
- **Команда RetroAchievements** — за открытую платформу достижений и таблиц рекордов в классических играх.
- **Google Oboe Team** — за создание высокопроизводительной аудиобиблиотеки с поддержкой AAudio и OpenSL ES.
- **Zenju** — за алгоритм высококачественного масштабирования текстур xBRZ.
- **SnowflakePowered (librashader)** — за конвейер шейдеров RetroArch Slang.
- **bylaws (libadrenotools)** — за библиотеку загрузки кастомных видеодрайверов Qualcomm Adreno и Turnip.
