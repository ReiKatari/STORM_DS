> 💡 **Релиз 4.4.11** — *Высокопроизводительный эмулятор Nintendo DS и DSi с аппаратным ускорением Vulkan, апскейлом и расширенной кастомизацией*

---

### 🚀 Ключевые изменения и улучшения
- 🌟 **[Позиционирование курсора и маркеров выделения]**: Полностью устранено смещение и отрыв капель курсора и маркеров выделения текста в диалогах редактирования макета и параметров компонентов.
- 🌟 **[Оконная архитектура диалогов]**: Все диалоговые окна переведены на стандартный Jetpack Compose `Dialog` с прямым доступом к контексту `DialogWindowProvider`.

<details>
<summary><b>📋 Полный список изменений (нажмите, чтобы развернуть)</b></summary>

- 🔹 **[Оконная привязка маркеров]**: Замена кастомного слоя `DetachedDialog` на стандартный Compose `Dialog` обеспечила корректную регистрацию собственного дескриптора окна `Window` в системе. Всплывающие маркеры ввода текста (`CursorHandle`, `SelectionHandle`) теперь используют единую 1:1 систему координат родительского окна без вертикального сдвига на высоту системных панелей.
- 🔹 **[Диалог ввода текста]**: В `BaseDialog` реализовано адаптивное ограничение ширины карточки (`widthIn(max = 450.dp).fillMaxWidth(0.85f)`), гарантирующее безупречный вид и удобный ввод как в портретной, так и в полноэкранной альбомной ориентации.
- 🔹 **[Настройки и переключатели]**: В `SingleChoicePreference` диалог выбора опций также переведён на стандартный Compose `Dialog` для единообразия и стабильности оконного контекста.
- 🔹 **[Стабильность DSi-Enhanced]**: Сохранены все исправления ядра и логики запуска DSi-Enhanced игр (*Alice in Wonderland*, *Prince of Persia*, *Mario vs Donkey Kong*), подтверждённые в версии 4.4.10.

</details>

<details>
<summary><b>🌐 English Changelog (click to expand)</b></summary>

- 🔸 **[Cursor and Selection Handles Alignment]**: Completely eliminated vertical offset of text insertion teardrop handles and selection handles in layout name and property input dialogs.
- 🔸 **[Native Dialog Architecture]**: Migrated `BaseDialog` and `SingleChoicePreference` to standard Jetpack Compose `Dialog`, providing true `DialogWindowProvider` backing for exact 1:1 coordinate matching of Compose text popups.
- 🔸 **[Responsive Dialog Layout]**: Implemented `widthIn(max = 450.dp).fillMaxWidth(0.85f)` for consistent, balanced dialog sizing across both portrait and landscape screen orientations.
- 🔸 **[DSi-Enhanced Stability]**: Retained full compatibility and responsive touchscreen support for all DSi-Enhanced cartridges from 4.4.10.

</details>

<details>
<summary><b>📦 Файлы и вложения к релизу (нажмите, чтобы развернуть)</b></summary>

- 📁 **Прикреплённые файлы**: Исполняемые файлы, инсталляторы и архивы доступны в секции **Assets** ниже.
- 🛡️ **Контроль целостности**: Все бинарные файлы собраны из официального исходного кода и проверены перед публикацией.
- 💻 **Установка**: Скачайте соответствующий архив/инсталлятор из списка Assets и следуйте стандартным инструкциям.

</details>
