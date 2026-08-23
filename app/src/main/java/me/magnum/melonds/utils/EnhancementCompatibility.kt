package me.magnum.melonds.utils

object EnhancementCompatibility {
    // 30 FPS 3D titles that benefit from 60 FPS unlocking
    private val KNOWN_30_FPS_3D_CODES = setOf(
        "ASM", // Super Mario 64 DS
        "AZE", // Zelda: Phantom Hourglass
        "BKI", // Zelda: Spirit Tracks
        "AMH", // Metroid Prime Hunters
        "C6H", // Kingdom Hearts 358/2 Days
        "BKT", // Kingdom Hearts Re:coded
        "YDK", // Dragon Quest IX
        "AFF", // Final Fantasy III
        "AF4", // Final Fantasy IV
        "BFP", // Final Fantasy: The 4 Heroes of Light
        "BOK", // Okamiden
        "CPZ", // Phantasy Star Zero
        "ABR", // Resident Evil: Deadly Silence
        "ADM", // Dementium: The Ward
        "BDM", // Dementium II
        "AMN", // Moon
        "BRC", // C.O.P. The Recruit
        "IPK", "VPK", "VPL", // Prince of Persia
        "BEY", // GoldenEye 007
        "YCO", "YCP", // Call of Duty
        "BGS", // Golden Sun: Dark Dawn
        "BOE", "BCO", // Sonic Colors
        "SOL", // Solatorobo
        "AVA", // Avalon Code
        "NOS", // Nostalgia
        "CRO", // Custom Robo Arena
        "TRK", // TrackMania
        "NFS", // Need for Speed
        "NIN", // Ninja Gaiden: Dragon Sword
    )

    // Pure 2D game codes that do NOT support 3D widescreen or 60fps hack
    private val KNOWN_PURE_2D_CODES = setOf(
        "A2D", // New Super Mario Bros (already native 60fps & 2D)
        "ACV", "ARX", "YR3", // Castlevania Dawn of Sorrow, Portrait of Ruin, Order of Ecclesia
        "YCH", // Chrono Trigger
        "AGB", "ABG", "AGY", "A4A", // Phoenix Wright / Apollo Justice / Miles Edgeworth
        "A5T", "CLJ", "C2J", "BLZ", // Professor Layton
        "ARZ", "YX2", // Mega Man ZX / Advent
        "ASR", "CYB", // Sonic Rush / Rush Adventure
        "AWR", "YW2", // Advance Wars Dual Strike / Days of Ruin
        "AW4", "AW5", // WarioWare Touched / DIY
        "AKR", "BKR", "YKU", // Kirby Squeak Squad / Super Star Ultra / Mass Attack
        "AWE", // The World Ends with You
        "CPV", // Plants vs Zombies
        "ATR", // Tetris DS
        "RAD", // Radiant Historia
        "DIS", // Disgaea DS
        "DEV", // Devil Survivor
        "GHO", // Ghost Trick
        "CLU", // Club House Games
        "NOG", // Picross DS
        "POK", "CPU", // Pokemon Dash/Trozei
    )

    fun supports60FpsUnlock(gameCode: String, romName: String): Boolean {
        val code3 = gameCode.take(3).uppercase()
        if (code3 in KNOWN_30_FPS_3D_CODES) return true
        if (code3 in KNOWN_PURE_2D_CODES) return false

        val lowerName = romName.lowercase()
        return lowerName.contains("mario 64") ||
            lowerName.contains("zelda") ||
            lowerName.contains("phantom hourglass") ||
            lowerName.contains("spirit tracks") ||
            lowerName.contains("metroid prime") ||
            lowerName.contains("kingdom hearts") ||
            lowerName.contains("dragon quest ix") ||
            lowerName.contains("final fantasy iii") ||
            lowerName.contains("final fantasy iv") ||
            lowerName.contains("phantasy star zero") ||
            lowerName.contains("okamiden") ||
            lowerName.contains("resident evil") ||
            lowerName.contains("dementium") ||
            lowerName.contains("prince of persia") ||
            lowerName.contains("golden sun") ||
            lowerName.contains("solatorobo") ||
            lowerName.contains("call of duty") ||
            lowerName.contains("sonic colors") ||
            lowerName.contains("lego ") ||
            lowerName.contains("transformers") ||
            lowerName.contains("star wars")
    }

    fun supports3dWidescreen(gameCode: String, romName: String): Boolean {
        val code3 = gameCode.take(3).uppercase()
        if (code3 in KNOWN_PURE_2D_CODES) return false
        if (code3 in KNOWN_30_FPS_3D_CODES) return true

        val lowerName = romName.lowercase()
        if (lowerName.contains("phoenix wright") ||
            lowerName.contains("ace attorney") ||
            lowerName.contains("castlevania") ||
            lowerName.contains("chrono trigger") ||
            lowerName.contains("professor layton") ||
            lowerName.contains("advance wars") ||
            lowerName.contains("mega man zx") ||
            lowerName.contains("sonic rush") ||
            lowerName.contains("world ends with you") ||
            lowerName.contains("plants vs zombies") ||
            lowerName.contains("tetris ds") ||
            lowerName.contains("ghost trick") ||
            lowerName.contains("kirby squeak") ||
            lowerName.contains("kirby super star") ||
            lowerName.contains("new super mario bros")) {
            return false
        }
        return true
    }
}
