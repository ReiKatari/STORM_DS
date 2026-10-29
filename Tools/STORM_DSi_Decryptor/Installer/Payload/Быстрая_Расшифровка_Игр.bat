@echo off
chcp 65001 >nul
title STORM DSI DECRYPTOR - Быстрая Расшифровка Игр
setlocal enabledelayedexpansion

cd /d "%~dp0"

if "%~1"=="" (
    echo ============================================================
    echo   STORM DSI DECRYPTOR 1.1.8 (STORM SOFT)
    echo ============================================================
    echo.
    echo Перетащите файлы .nds, .dsi, .app или папку на этот файл,
    echo либо нажмите любую клавишу для запуска графического интерфейса.
    echo.
    echo ============================================================
    pause >nul
    start "" "STORM DSI DECRYPTOR.exe"
    exit /b
)

echo ============================================================
echo   STORM DSI DECRYPTOR 1.1.8 (STORM SOFT)
echo   Сверхбыстрая расшифровка образов Nintendo DSi и DSiWare
echo ============================================================
echo.

"STORM DSI DECRYPTOR.exe" %*

echo.
echo ============================================================
echo Обработка завершена. Нажмите любую клавишу для выхода...
pause >nul
