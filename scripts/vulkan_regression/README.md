# Скрипт автоматического визуального регрессионного тестирования Vulkan (Stage 3)

Инструмент `run_regression.py` автоматизирует захват эталонных кадров, выгрузку диагностических отчётов состояния рендера Vulkan (`GPU3D_Vulkan` / `2D-3D Compositor`) с устройства Android по ADB и попиксельное сравнение со скриншотами-эталонами (PSNR и SSIM).

---

## **Основные возможности**

1. **Удалённое управление через Broadcast Intent (`me.magnum.melonds.DEBUG_CAPTURE`)**:
   - Захватывает текущий кадр эмулятора (`frame.png`) и сохраняет полный диагностический дамп регистров и конвейера Vulkan (`MelonEmulator.dumpVulkanDebugReport`) в указанную директорию на устройстве.
   - Позволяет на лету переключать:
     - Режим отладки слоёв (`debug_view_mode`: `0` — Обычный вид, `1` — Только 3D, `2` — Только 2D, `3` — Маска композиции).
     - Режим композиции 2D/3D (`compositor_mode`: `0` — Точный `Precise`, `1` — Быстрый `Legacy`).
     - Утолщённые контуры 3D в высоком разрешении (`thick_edges`: `true` / `false`).
2. **Расчёт метрик PSNR и SSIM**:
   - Вычисляет среднеквадратичную ошибку (MSE), пиковое отношение сигнала к шуму (**PSNR**, дБ), индекс структурного сходства (**SSIM** по блокам `8x8`), максимальное отклонение канала и долю изменившихся пикселей.
   - При наличии библиотеки `Pillow` генерирует тепловую карту расхождений `diff.png`.

---

## **Примеры использования**

### **1. Захват эталонного кадра (Baseline) и отчёта Vulkan с запущенной игры**
```bash
python scripts/vulkan_regression/run_regression.py \
    --out ./baselines/yugioh_wc2008
```

### **2. Захват всех 4 режимов отладки слоёв Vulkan (`Normal`, `Only3D`, `Only2D`, `CompositionMask`)**
```bash
python scripts/vulkan_regression/run_regression.py \
    --all-debug-views \
    --out ./baselines/okamiden_views
```

### **3. Проверка регрессии относительно эталона с порогами PSNR и SSIM**
```bash
python scripts/vulkan_regression/run_regression.py \
    --out ./artifacts/yugioh_wc2008_test \
    --baseline ./baselines/yugioh_wc2008 \
    --psnr-threshold 38.0 \
    --ssim-threshold 0.985
```

### **4. Прямой вызов через ADB без Python-скрипта**
```bash
adb shell am broadcast -a me.magnum.melonds.DEBUG_CAPTURE \
    --es output_dir "/storage/emulated/0/STORM DS/debug/regression" \
    --ei debug_view_mode 0 \
    --ei compositor_mode 0 \
    --ez thick_edges true
```
