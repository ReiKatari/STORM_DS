> 💡 **Релиз 4.2.9** — *Продвинутый эмулятор двухэкранных консолей Nintendo DS и Nintendo DSi для Android с аппаратным ускорением Vulkan, шейдерами librashader, интеллектуальной защитой сохранений и расширенной аппаратной поддержкой DSiWare.*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[Автопатчинг шрифтов AlphaBounce]**: В ядро эмулятора (RomDecryptor) встроен интеллектуальный механизм сигнатурного анализа и in-memory патчинга для AlphaBounce (код KAL*). Путь к системному файлу шрифтов автоматически перенаправляется с недоступного nand:/sys/TWLFontTable.dat на встроенный rom:/Arial.NFTR, а вызовы аварийного завершения OS_Terminate нейтрализуются NOP-инструкциями. Игра запускается и отображает текст без сторонней модификации ROM.
- 🌟 **[Виртуальный видеопоток DSi Camera]**: В PhysicalDSiCameraSource интегрирован генератор синтетических видеокадров YUV422. Если физическая камера устройства недоступна, возвращает пустые кадры или не поддерживается оборудованием, эмулятор отдаёт корректный тестовый видеопоток, предотвращая зависания и сбои в играх с обязательным использованием камеры (American PopStar, Faceez, Photo Dojo).
- 🌟 **[Исправление Vulkan-шейдера]**: В шейдере VulkanSurfacePresenterCompatibility.frag объявлены недостающие константы упакованного разрешения экрана (kPackedScreenWidth = 256u и kPackedScreenHeight = 192u). Устранены ошибки валидации SPIR-V через glslangValidator.
- 🌟 **[Оптимизация CI/CD и безопасность]**: Полностью изолирована работа с токенами оповещений через защищённые переменные окружения и конфигурации. Скорректированы воркфлоу GitHub Actions для устранения дублирования релизов и гарантии стабильной автоматической компиляции.

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **[Ядро эмулятора (RomDecryptor)]**: Реализована функция ApplyCompatibilityPatches, применяющая in-memory модификации при загрузке зашифрованных и расшифрованных ROM-образов формата DSi.
- 🔹 **[Совместимость DSiWare]**: Для всех версий AlphaBounce (KALV, KALE, KALP) реализована замена строкового пути шрифта на внутренний ресурс ROM и замена инструкций вызова OS_Terminate на NOP (0xE1A00000).
- 🔹 **[Подсистема камеры Android]**: Метод PhysicalDSiCameraSource дополнен генератором градиентных YUV422 тестовых кадров fillMockCameraFrame и детектором пустых буферов isBufferAllZeros.
- 🔹 **[Графический пайплайн Vulkan]**: Исправлена компиляция шейдеров в VulkanSurfacePresenterCompatibility.frag, обеспечена 100% совместимость со всеми версиями компилятора glslangValidator.
- 🔹 **[Автоматизация GitHub Actions]**: В workflow main.yaml зафиксировано авторство ReiKatari, в release.yaml отключена генерация дублирующих релизов.
- 🔹 **[Пакет установки]**: Сборка оптимизированного релизного пакета STORM_DS_4.2.9.apk.

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **[AlphaBounce Font Auto-Patching]**: Built-in signature scanning and in-memory compatibility patching for AlphaBounce (KAL* titles) directly in the emulator core (RomDecryptor). Redirects missing system font path nand:/sys/TWLFontTable.dat to rom:/Arial.NFTR and neutralizes OS_Terminate calls with NOPs, enabling out-of-the-box gameplay with text rendering.
- 🔸 **[Virtual DSi Camera Fallback]**: Added a synthetic YUV422 test pattern generator in PhysicalDSiCameraSource. If the device camera is unavailable, returns empty frames, or fails to open, the emulator feeds a valid frame stream, preventing deadlocks in camera-reliant titles such as American PopStar and Photo Dojo.
- 🔸 **[Vulkan Compatibility Shader Fix]**: Declared missing screen resolution constants (kPackedScreenWidth = 256u and kPackedScreenHeight = 192u) in VulkanSurfacePresenterCompatibility.frag, eliminating glslangValidator SPIR-V compilation errors.
- 🔸 **[CI/CD and Security Enhancements]**: Secret management upgraded to environment variables and ignored local configurations. Fixed GitHub Actions workflows to ensure seamless automated builds and eliminate duplicate releases.

</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>

- 📁 **Прикреплённые файлы**: Исполняемые файлы, инсталляторы и архивы доступны в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте соответствующий архив/инсталлятор из списка Assets и следуйте стандартным инструкциям.

</details>
