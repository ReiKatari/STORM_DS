package me.magnum.melonds.domain.model;

import kc.a;
import nc.k;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class FirmwareConfiguration {
    public static final int $stable = 0;
    private final int birthdayDay;
    private final int birthdayMonth;
    private final int favouriteColour;
    private final String internalMacAddress;
    private final int language;
    private final String message;
    private final String nickname;
    private final boolean randomizeMacAddress;

    public FirmwareConfiguration(String str, String str2, int i2, int i10, int i11, int i12, boolean z10, String str3) {
        str.getClass();
        str2.getClass();
        this.nickname = str;
        this.message = str2;
        this.language = i2;
        this.favouriteColour = i10;
        this.birthdayMonth = i11;
        this.birthdayDay = i12;
        this.randomizeMacAddress = z10;
        this.internalMacAddress = str3;
    }

    public static /* synthetic */ FirmwareConfiguration copy$default(FirmwareConfiguration firmwareConfiguration, String str, String str2, int i2, int i10, int i11, int i12, boolean z10, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = firmwareConfiguration.nickname;
        }
        if ((i13 & 2) != 0) {
            str2 = firmwareConfiguration.message;
        }
        if ((i13 & 4) != 0) {
            i2 = firmwareConfiguration.language;
        }
        if ((i13 & 8) != 0) {
            i10 = firmwareConfiguration.favouriteColour;
        }
        if ((i13 & 16) != 0) {
            i11 = firmwareConfiguration.birthdayMonth;
        }
        if ((i13 & 32) != 0) {
            i12 = firmwareConfiguration.birthdayDay;
        }
        if ((i13 & 64) != 0) {
            z10 = firmwareConfiguration.randomizeMacAddress;
        }
        if ((i13 & 128) != 0) {
            str3 = firmwareConfiguration.internalMacAddress;
        }
        boolean z11 = z10;
        String str4 = str3;
        int i14 = i11;
        int i15 = i12;
        return firmwareConfiguration.copy(str, str2, i2, i10, i14, i15, z11, str4);
    }

    public final String component1() {
        return this.nickname;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.language;
    }

    public final int component4() {
        return this.favouriteColour;
    }

    public final int component5() {
        return this.birthdayMonth;
    }

    public final int component6() {
        return this.birthdayDay;
    }

    public final boolean component7() {
        return this.randomizeMacAddress;
    }

    public final String component8() {
        return this.internalMacAddress;
    }

    public final FirmwareConfiguration copy(String str, String str2, int i2, int i10, int i11, int i12, boolean z10, String str3) {
        str.getClass();
        str2.getClass();
        return new FirmwareConfiguration(str, str2, i2, i10, i11, i12, z10, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirmwareConfiguration)) {
            return false;
        }
        FirmwareConfiguration firmwareConfiguration = (FirmwareConfiguration) obj;
        if (k.a(this.nickname, firmwareConfiguration.nickname) && k.a(this.message, firmwareConfiguration.message) && this.language == firmwareConfiguration.language && this.favouriteColour == firmwareConfiguration.favouriteColour && this.birthdayMonth == firmwareConfiguration.birthdayMonth && this.birthdayDay == firmwareConfiguration.birthdayDay && this.randomizeMacAddress == firmwareConfiguration.randomizeMacAddress && k.a(this.internalMacAddress, firmwareConfiguration.internalMacAddress)) {
            return true;
        }
        return false;
    }

    public final int getBirthdayDay() {
        return this.birthdayDay;
    }

    public final int getBirthdayMonth() {
        return this.birthdayMonth;
    }

    public final int getFavouriteColour() {
        return this.favouriteColour;
    }

    public final String getInternalMacAddress() {
        return this.internalMacAddress;
    }

    public final int getLanguage() {
        return this.language;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final boolean getRandomizeMacAddress() {
        return this.randomizeMacAddress;
    }

    public int hashCode() {
        int hashCode;
        int e6 = d.e(d.c(this.birthdayDay, d.c(this.birthdayMonth, d.c(this.favouriteColour, d.c(this.language, d.d(this.nickname.hashCode() * 31, 31, this.message), 31), 31), 31), 31), this.randomizeMacAddress, 31);
        String str = this.internalMacAddress;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e6 + hashCode;
    }

    public String toString() {
        String str = this.nickname;
        String str2 = this.message;
        int i2 = this.language;
        int i10 = this.favouriteColour;
        int i11 = this.birthdayMonth;
        int i12 = this.birthdayDay;
        boolean z10 = this.randomizeMacAddress;
        String str3 = this.internalMacAddress;
        StringBuilder k10 = a.k("FirmwareConfiguration(nickname=", str, ", message=", str2, ", language=");
        k10.append(i2);
        k10.append(", favouriteColour=");
        k10.append(i10);
        k10.append(", birthdayMonth=");
        k10.append(i11);
        k10.append(", birthdayDay=");
        k10.append(i12);
        k10.append(", randomizeMacAddress=");
        k10.append(z10);
        k10.append(", internalMacAddress=");
        k10.append(str3);
        k10.append(")");
        return k10.toString();
    }
}
