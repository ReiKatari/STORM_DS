> 💡 **Релиз 4.3.0** — *Универсальный эмулятор Nintendo DS и Nintendo DSi для Android на базе melonDS с аппаратным ускорением Vulkan*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[DSiWare / Совместимость]**: Комплексное решение проблемы запуска AlphaBounce (KAL*) — внедрён динамический автопатчинг инструкций прямо в оперативной памяти (RAM) и образе ROM: обход сбоя загрузки шрифта `0x020ba014 -> 0x020ba058`, нейтрализация вызовов аварийного завершения `OS_Terminate` (`0x020050d4`, `0x020e4548`, `0x020f5c50`, `0x020f5f0c`), перенаправление системного шрифта `nand:/sys/TWLFontTable.dat` на внутренний ресурс `rom:/Arial.NFTR` и полное обезвреживание точки входа `OS_Terminate` (`0x02026768 -> bx lr`).
- 🌟 **[Производительность и плавность]**: Приоритет рабочего потока эмуляции (`EmulatorThread`) повышен до класса наивысшей производительности (`nice -8`) для всех режимов рендеринга (Vulkan, OpenGL ES, Software), что устраняет микрозадержки и просадки кадров при фоновой активности Android.
- 🌟 **[Frame Pacing / Кадровая синхронизация]**: Внедрён высокоточный таймер с микросекундным spin-yield завершением, исключающий дрожание времени кадра на экранах с частотой 60 Гц, 90 Гц, 120 Гц и 144 Гц.
- 🌟 **[CI / GitHub Actions]**: Исправлены сборочные воркфлоу (`main.yaml` и `release.yaml`) — добавлен параметр `submodules: recursive` для надёжного автоматического клонирования всех зависимостей ядра эмулятора (`oboe`, `faad2`, `enet`).

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>


- 🔹 **[Ядро DSi и NDS]**: В `DSi.cpp` и `NDS.cpp` (`SetupDirectBoot`) реализовано автоматическое сканирование и модификация памяти при запуске игр DSiWare серии `KAL*` (AlphaBounce). Все вызовы `OS_Terminate` заменяются инструкциями `NOP`, а также нейтрализуется сама точка входа `OS_Terminate`, предотвращая вывод системного сообщения об ошибке Nintendo DSi.
- 🔹 **[RomDecryptor]**: Устранена ошибка расчёта смещений ARM9 в буфере ROM — смещения теперь рассчитываются строго относительно базового адреса заголовка ARM9 (`arm9Off`). Применение патчей совместимости выполняется безусловно перед распаковкой Modcrypt.
- 🔹 **[MelonInstance и CartLoader]**: Внедрён прямой вызов `ApplyCompatibilityPatches` при загрузке картриджей и ROM-файлов.
- 🔹 **[Стабильность таймингов]**: Модернизирован цикл `emulate` в `MelonDSAndroidJNI.cpp` — переход на гибридное наносекундное усыпление с последующим процессорным yield обеспечивает сверхточную выдержку целевого фреймрейта без вытеснения потока ядром ОС.
- 🔹 **[Типографика и интерфейс]**: Все диагностические сообщения и логи приведены к строгому стандарту оформления без использования символа амперсанда.


</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>


- 🔸 **[DSiWare Compatibility]**: Fixed AlphaBounce (KAL*) fatal system error on startup via dynamic in-memory and ROM auto-patching: font verification branch bypass (`0x020ba014 -> 0x020ba058`), `OS_Terminate` call sites NOPed (`0x020050d4`, `0x020e4548`, `0x020f5c50`, `0x020f5f0c`), font path redirected from `nand:/sys/TWLFontTable.dat` to `rom:/Arial.NFTR`, and `OS_Terminate` entrypoint disarmed (`0x02026768 -> bx lr`).
- 🔸 **[Performance and Smoothness]**: Emulation thread priority elevated to real-time audio/video class (`nice -8`) across all renderers (Vulkan, OpenGL ES, Software), eliminating stutter caused by OS background migrations.
- 🔸 **[Frame Pacing]**: High-precision frame pacer with sub-millisecond spin-yield for perfectly smooth 60/90/120/144 Hz display output.
- 🔸 **[CI / GitHub Actions]**: Added `submodules: recursive` to checkout actions in `main.yaml` and `release.yaml`.


</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>


- 📁 **Прикреплённые файлы**: Исполняемые файлы, инсталляторы и архивы доступны в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте соответствующий архив/инсталлятор из списка Assets и следуйте стандартным инструкциям.


</details>
