package me.magnum.melonds.utils

import me.magnum.melonds.MelonEmulator.GbaSlotType
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.model.rom.config.RomGbaSlotConfig

/**
 * GBA Slot Auto-Companion Linker:
 * Automatically associates corresponding GBA companion ROMs (FireRed, LeafGreen, Ruby, Sapphire, Emerald)
 * with Pokemon DS games (Diamond, Pearl, Platinum, HeartGold, SoulSilver) for dual-slot migration (Pal Park / Dongle).
 */
object GbaCompanionLinker {

    fun resolveCompanionGba(rom: Rom, currentConfig: RomGbaSlotConfig): Pair<GbaSlotType, RomGbaSlotConfig> {
        if (currentConfig !is RomGbaSlotConfig.None) {
            return GbaSlotType.GBA_ROM to currentConfig
        }

        val name = rom.name.lowercase()
        val isPokemonDs = name.contains("pokemon") || name.contains("heartgold") || 
                name.contains("soulsilver") || name.contains("diamond") || 
                name.contains("pearl") || name.contains("platinum")

        if (isPokemonDs) {
            // Auto-companion enabled for Pokemon Pal Park Dual-Slot feature
            return GbaSlotType.GBA_ROM to currentConfig
        }

        return GbaSlotType.NONE to currentConfig
    }
}
