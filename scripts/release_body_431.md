> 💡 **Релиз 4.3.1** — *Эмулятор двухэкранной портативной игровой консоли Nintendo DS и Nintendo DSi для Android на базе WatermelonDS и melonDS Core*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **Мгновенное отображение обложек и иконок**: Постоянный кэш иконок перенесён в защищённое внутреннее хранилище приложения с мульти-ключевой индексацией, устранена повторная загрузка данных при каждом запуске и убраны блокирующие индикаторы загрузки на карточках игр.
- 🌟 **Стабильность бэйджей RetroAchievements**: Синхронизирована проверка статуса аутентификации прямо из локального хранилища конфигурации, благодаря чему индикаторы достижений отрисовываются с первого кадра без задержек и мерцания.
- 🌟 **Совместимость Dragon Quest Wars (KDQE)**: Устранена аппаратная блокировка шины картриджа в контроллере слота — регистр управления `AUXSPICNT` инициализируется в активном состоянии с автоматической активацией при обращении к ROM, что устраняет зависание игры на цикле опроса `ROMCTRL`.
- 🌟 **Совместимость AlphaBounce (KAL*)**: Исправлена адресация и логика патчинга ARM9 в C++ ядре — реализован обход проверки системного шрифта на адрес `0x020ba058`, нейтрализованы аварийные точки вызова `OS_Terminate` и цикл ожидания `OS_Halt`, а также расширен подбор ключей дешифрования Modcrypt с эвристическим анализом кода инструкций ARM.

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **Ядро эмуляции (NDSCart)**: В методе `NDSCartSlot::ResetCart()` флаг активности шины `SPICnt` инициализируется значением `0x8000` (шина слота картриджа активна по умолчанию).
- 🔹 **Ядро эмуляции (NDSCart)**: В `NDSCartSlot::WriteROMCnt` добавлена автоактивация бита 15 шины картриджа при старте передачи `xferstart`, предотвращая сброс команд ROM при прямом запуске DSiWare.
- 🔹 **Ядро эмуляции (DSi и NDS)**: Вызовы `NDSCartSlot.WriteSPICnt(0x8000)` интегрированы в процедуры прямой загрузки `SetupDirectBoot`.
- 🔹 **Совместимость AlphaBounce**: Прямое перенаправление перехода по адресу `0x020ba014` на метку успешной инициализации шрифта `0x020ba058` (`0xea00000f`) в памяти ARM9 и файле ROM.
- 🔹 **Безопасность выполнения**: Нейтрализация обработчиков аварийного завершения `OS_Terminate` (`0x02026768`, `0x020050d4`, `0x020e4548`, `0x020f5c50`, `0x020f5f0c`) и инструкций `OS_Halt` (`0x02026800`, `0x02026804`, `0x02026808`) инструкциями NOP и возврата `bx lr`.
- 🔹 **Криптографический модуль (DSi Modcrypt)**: Добавлены все 9 хэш-кандидатов из заголовка TWL для деривации ключей AES (включая `HeaderBinariesHash`, `ARM9OverlayHash`, `DSiARM9NoSecureHash`), внедрён эвристический скоринг по кодам условий ARM (`0xE`) и байтам нулей.
- 🔹 **Кэширование иконок (RomIconProvider)**: Директория кэша перенесена из `externalCacheDir` во внутренний каталог `filesDir/rom_icons`, защищённый от очистки сторонними утилитами ОС.
- 🔹 **Миграция кэша**: Автоматический перенос существующих иконок из внешнего кэша во внутренний при первом обращении.
- 🔹 **Быстрая загрузка UI (RomListViewModel)**: Список сопоставлений обложек `_boxArtByUri` теперь предварительно инициализируется всеми сохранёнными записями из `matches_v3.json` без ожидания фонового сканирования.
- 🔹 **Рендеринг карточек (WatermelonRomArt)**: Картриджная иконка игры выводится мгновенно в качестве базового слоя, устраняя показ спиннера поверх пустой карточки во время подгрузки высокого разрешения.

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **Instant Icons and Badges Loading**: Rom icons cache relocated to persistent internal storage with multi-key indexing, eliminating reloads and progress spinners on every app start.
- 🔸 **RetroAchievements UI Stability**: Synchronous authentication check against local preferences ensures achievement badges render immediately without pop-in effect.
- 🔸 **Dragon Quest Wars (KDQE) Fix**: Resolved card slot bus lockup in `NDSCartSlot` by defaulting `AUXSPICNT` to enabled (`0x8000`) and ensuring transfer starts automatically activate the bus.
- 🔸 **AlphaBounce (KAL*) Compatibility**: Fixed ARM9 memory patching addresses to properly redirect missing font verification to `0x020ba058`, neutralized `OS_Terminate` and `OS_Halt` loops, and improved Modcrypt AES key derivation with ARM instruction condition scoring.

</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>

- 📁 **Прикреплённые файлы**: Исполняемый пакет `STORM_DS_4.3.1.apk` доступен в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте APK файл из списка Assets и установите поверх предыдущей версии эмулятора.

</details>