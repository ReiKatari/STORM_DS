# Privacy Policy - STORM DS

Last updated: 2026-11-28

This Privacy Policy applies to **STORM DS** (Android and Windows editions, package ID `com.stormds.emulator`, repository `https://github.com/ReiKatari/STORM_DS`).

---

## 1. General Overview and Monetization Disclosure

- **STORM DS is 100% free and open-source software** licensed under **GPL-3.0**.
- **No monetization, no in-app purchases, no paid tiers, no subscriptions, and no advertisements** exist anywhere in STORM DS.
- STORM DS does **not** operate its own telemetry, analytics, crash-tracking, or advertising servers and does **not** sell or share user data with third-party advertisers.

## 2. Local Data Storage and Retention

All user settings, ROM library index, save files (`.sav`, `.dsv`), save states (`.mln`), cheat databases (`usrcheat.dat`), BIOS/NAND files, and per-game configurations are stored **locally on your device**:
- **Android**: app internal storage (`filesDir` / `cacheDir`) and the user-selected ROM/STORM DS directory (`/storage/emulated/0/STORM DS/`). Retained until you delete the files or uninstall the app.
- **Windows**: `%APPDATA%\STORM DS\` (or portable directory `config/`, `saves/`, `states/`). Retained until you delete the files.

### RetroAchievements Credentials & Offline Cache
- When you log in to RetroAchievements, your password is sent once over HTTPS to `retroachievements.org` (`r=login2`) and is **never stored**.
- Only your **username** and **session token** are stored locally (`SharedPreferences` on Android / `%APPDATA%\STORM DS\config\config.json` on Windows) so you remain signed in across launches. They are deleted immediately when you log out or uninstall STORM DS.
- Offline achievements cache (Casual/Softcore ledger and pending sync entries) is stored locally and cleared upon successful sync, reset, or uninstall.

## 3. Optional Third-Party Network Services & Server Locations

Network requests are initiated **only** when you actively use the corresponding optional feature:

1. **RetroAchievements (`retroachievements.org` / `media.retroachievements.org`)**
   - **Purpose**: account sign-in, game identification (ROM MD5 hash), achievements & leaderboards sync, Rich Presence pings, badge icons.
   - **Data sent**: username, token, ROM MD5 hash, active session/Rich Presence status, `User-Agent` (`STORM_DS/<version> (...) melonDS/1.0`).
   - **Infrastructure / Location**: United States (Cloudflare CDN / US servers).
2. **GitHub Releases (`github.com` / `api.github.com`)**
   - **Purpose**: checking app updates and downloading optional shader packs, Adreno Vulkan drivers, cheat database mirrors, or open-source FreeBIOS definitions when requested by the user.
   - **Infrastructure / Location**: United States (GitHub, Inc. / Microsoft Azure).
3. **STORM GAMES WORLD Mirror (`stormgamesworld.ru`)**
   - **Purpose**: optional secondary update check mirror and optional cloud save backup (`STORM SAVE SYNC` when explicitly triggered by the user).
   - **Infrastructure / Location**: Russian Federation.
4. **Libretro Thumbnails (`thumbnails.libretro.com`) & GameTDB**
   - **Purpose**: fetching optional box art covers when cover Art download is enabled.
   - **Infrastructure / Location**: Global CDN (Europe / United States).
5. **Screen AI Translation Providers (Optional, user-triggered)**
   - **Google ML Kit** (on-device neural OCR and offline translation models; models downloaded once from Google CDN, United States).
   - **MyMemory / LibreTranslate / Ollama / OpenAI / DeepL**: used only if explicitly selected by the user; sends only the extracted on-screen dialogue text to the chosen endpoint (United States / EU or user-configured local host).
6. **Nintendo WFC Community Servers (Wiimmfi / Kaeru WFC / AltWFC)**
   - **Purpose**: optional online multiplayer DS Wi-Fi Connection emulation.
   - **Infrastructure / Location**: Germany / European Union / community-hosted servers configured by the user.

## 4. GDPR & User Rights

For users in the EEA / UK / Switzerland (and globally):
- You can inspect, clear, or disable any optional network feature (RetroAchievements login, update checks, cover downloads, AI translator, WFC) at any time in **Settings**.
- Because STORM DS operates no central user database or analytics server, uninstalling the application or clearing its data folder permanently erases all locally stored tokens, caches, and logs.
- For privacy inquiries, open an issue at `https://github.com/ReiKatari/STORM_DS/issues` or contact the maintainer (`ReiKatari`).

---

# Политика конфиденциальности - STORM DS

Последнее обновление: 2026-11-28

1. **Отсутствие монетизации и рекламы**: STORM DS полностью бесплатен и распространяется по лицензии **GPL-3.0** без подписок, встроенных покупок, платных функций, рекламы и сторонней аналитики.
2. **Локальное хранение и сроки**: настройки, сохранения, чит-коды, токены входа (`ra_username` и `ra_token`, без сохранения пароля) и кэш оффлайн-достижений хранятся исключительно локально на устройстве пользователя (Android internal/SAF storage или `%APPDATA%\STORM DS\` на Windows) до выхода из аккаунта, ручной очистки или удаления программы.
3. **Сетевые сервисы и расположение серверов**: сетевые обращения выполняются только по запросу пользователя к **RetroAchievements** (США / Cloudflare), **GitHub** (США), **STORM GAMES WORLD** (РФ, резервное зеркало обновлений и ручная синхронизация сохранений), **Libretro Thumbnails / GameTDB** (CDN ЕС/США), выбранным движкам перевода (**Google ML Kit** локально / **MyMemory** / **LibreTranslate** / локальный **Ollama**) и выбранным серверам **Nintendo WFC** (Wiimmfi / Kaeru / AltWFC, ЕС).
4. **GDPR и права пользователя**: пользователь вправе в любой момент выйти из учётных записей, отключить любые сетевые функции в настройках и полностью удалить локальные данные с устройства. Контакт для обращений: `https://github.com/ReiKatari/STORM_DS/issues`.
