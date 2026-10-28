package me.magnum.melonds.github

const val APK_CONTENT_TYPE = "application/vnd.android.package-archive"

const val PREF_KEY_GITHUB_CHECK_FOR_UPDATES = "github_check_for_updates"
const val PREF_KEY_GITHUB_UPDATE_CHANNEL = "github_update_channel"

const val GITHUB_REPOSITORY = "ReiKatari/STORM_DS"
const val GITHUB_RELEASE_URL_PREFIX = "https://github.com/$GITHUB_REPOSITORY/releases/"
const val GITHUB_API_RELEASES_URL = "https://api.github.com/repos/$GITHUB_REPOSITORY/releases?per_page=30"
const val GITHUB_LATEST_REDIRECT_URL = "https://github.com/$GITHUB_REPOSITORY/releases/latest"

const val STORM_GAMES_WORLD_REPO = "STORM_DS"
const val STORM_GAMES_WORLD_API_URL = "https://stormgamesworld.ru/api/programs?repo=$STORM_GAMES_WORLD_REPO"
const val STORM_GAMES_WORLD_ALT_API_URL = "https://storm-games.world/api/programs?repo=$STORM_GAMES_WORLD_REPO"
const val STORM_GAMES_WORLD_RELEASE_URL_PREFIX = "https://stormgamesworld.ru/programs?repo=$STORM_GAMES_WORLD_REPO"
const val STORM_GAMES_WORLD_ALT_RELEASE_URL_PREFIX = "https://storm-games.world/programs?repo=$STORM_GAMES_WORLD_REPO"
const val STORM_GAMES_WORLD_DOWNLOAD_URL_PREFIX = "https://stormgamesworld.ru/uploads/programs/$STORM_GAMES_WORLD_REPO/"
const val STORM_GAMES_WORLD_ALT_DOWNLOAD_URL_PREFIX = "https://storm-games.world/uploads/programs/$STORM_GAMES_WORLD_REPO/"

enum class GitHubUpdateChannel(val preferenceValue: String) {
    STABLE("stable"),
    STABLE_AND_PRERELEASE("stable_and_prerelease");

    companion object {
        fun fromPreference(value: String?): GitHubUpdateChannel {
            return entries.firstOrNull { it.preferenceValue == value } ?: STABLE
        }
    }
}
