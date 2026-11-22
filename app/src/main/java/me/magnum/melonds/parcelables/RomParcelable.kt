package me.magnum.melonds.parcelables

import android.os.Parcel
import android.os.Parcelable
import androidx.core.net.toUri
import me.magnum.melonds.domain.model.DSiProfile
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.extensions.parcelable
import java.util.*
import kotlin.time.Duration.Companion.milliseconds

class RomParcelable : Parcelable {
    var rom: Rom
        private set

    constructor(rom: Rom) {
        this.rom = rom
    }

    private constructor(parcel: Parcel) {
        val name = parcel.readString()
        val developerName = parcel.readString()!!
        val fileName = parcel.readString()
        val uri = parcel.readString()!!.toUri()
        val parentTreeUri = parcel.readString()?.toUri()
        val lastPlayed = parcel.readLong().let { if (it == (-1).toLong()) null else Date(it) }
        val romConfig = parcel.parcelable<RomConfigParcelable>()
        val isDsiWareTitle = parcel.readInt() == 1
        val retroAchievementsHash = parcel.readString()!!
        val totalPlayTime = parcel.readLong().milliseconds
        val installedDsiWareTitleId = parcel.readLong().takeIf { it != -1L }
        val installedDsiWareIcon = parcel.createByteArray()
        val isDsiEnhanced = parcel.readInt() == 1
        val gameCode = parcel.readString() ?: ""
        val isFavorite = parcel.readInt() == 1
        val resolvedDsiProfile = parcel.parcelable<DSiProfile>()
        rom = Rom(
            name!!,
            developerName,
            fileName!!,
            uri,
            parentTreeUri,
            romConfig!!.romConfig,
            lastPlayed,
            isDsiWareTitle,
            retroAchievementsHash,
            totalPlayTime,
            isFavorite = isFavorite,
            installedDsiWareTitleId = installedDsiWareTitleId,
            installedDsiWareIcon = installedDsiWareIcon,
            isDsiEnhanced = isDsiEnhanced,
            gameCode = gameCode,
            resolvedDsiProfile = resolvedDsiProfile,
        )
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(rom.name)
        dest.writeString(rom.developerName)
        dest.writeString(rom.fileName)
        dest.writeString(rom.uri.toString())
        dest.writeString(rom.parentTreeUri?.toString())
        dest.writeLong(rom.lastPlayed?.time ?: -1)
        dest.writeParcelable(RomConfigParcelable(rom.config), 0)
        dest.writeInt(if (rom.isDsiWareTitle) 1 else 0)
        dest.writeString(rom.retroAchievementsHash)
        dest.writeLong(rom.totalPlayTime.inWholeMilliseconds)
        dest.writeLong(rom.installedDsiWareTitleId ?: -1L)
        dest.writeByteArray(rom.installedDsiWareIcon)
        dest.writeInt(if (rom.isDsiEnhanced) 1 else 0)
        dest.writeString(rom.gameCode)
        dest.writeInt(if (rom.isFavorite) 1 else 0)
        dest.writeParcelable(rom.resolvedDsiProfile, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<RomParcelable> {
        override fun createFromParcel(parcel: Parcel): RomParcelable {
            return RomParcelable(parcel)
        }

        override fun newArray(size: Int): Array<RomParcelable?> {
            return arrayOfNulls(size)
        }
    }
}
