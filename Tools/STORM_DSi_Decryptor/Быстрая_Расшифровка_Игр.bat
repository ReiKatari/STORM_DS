@echo off
chcp 65001 >nul
title STORM DS DECRYPTOR - Быстрая Расшифровка Игр
setlocal enabledelayedexpansion

cd /d "%~dp0"

if "%~1"=="" (
    echo ============================================================
    echo   STORM DS DECRYPTOR (STORM TEAM)
    echo ============================================================
    echo.
    echo Перетащите файлы .nds, .dsi, .srl, .app, .cia, .tad или папку на этот файл,
    echo либо нажмите любую клавишу для запуска графического интерфейса.
    echo.
    echo ============================================================
    pause >nul
    start "" "STORM DS DECRYPTOR.exe"
    exit /b
)

echo ============================================================
echo   STORM DS DECRYPTOR (STORM TEAM)
echo   Многопоточная расшифровка образов Nintendo DS / DSi / DSiWare
echo ============================================================
echo.

"STORM DS DECRYPTOR.exe" --cli %*

echo.
echo ============================================================
echo Обработка завершена. Нажмите любую клавишу для выхода...
pause >nul
