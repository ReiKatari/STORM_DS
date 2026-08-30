package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
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

    public FirmwareConfiguration(String str, String str2, int i, int i2, int i3, int i4, boolean z, String str3) {
        str.getClass();
        str2.getClass();
        this.nickname = str;
        this.message = str2;
        this.language = i;
        this.favouriteColour = i2;
        this.birthdayMonth = i3;
        this.birthdayDay = i4;
        this.randomizeMacAddress = z;
        this.internalMacAddress = str3;
    }

    public static /* synthetic */ FirmwareConfiguration copy$default(FirmwareConfiguration firmwareConfiguration, String str, String str2, int i, int i2, int i3, int i4, boolean z, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = firmwareConfiguration.nickname;
        }
        if ((i5 & 2) != 0) {
            str2 = firmwareConfiguration.message;
        }
        if ((i5 & 4) != 0) {
            i = firmwareConfiguration.language;
        }
        if ((i5 & 8) != 0) {
            i2 = firmwareConfiguration.favouriteColour;
        }
        if ((i5 & 16) != 0) {
            i3 = firmwareConfiguration.birthdayMonth;
        }
        if ((i5 & 32) != 0) {
            i4 = firmwareConfiguration.birthdayDay;
        }
        if ((i5 & 64) != 0) {
            z = firmwareConfiguration.randomizeMacAddress;
        }
        if ((i5 & 128) != 0) {
            str3 = firmwareConfiguration.internalMacAddress;
        }
        boolean z2 = z;
        String str4 = str3;
        int i6 = i3;
        int i7 = i4;
        return firmwareConfiguration.copy(str, str2, i, i2, i6, i7, z2, str4);
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

    public final FirmwareConfiguration copy(String str, String str2, int i, int i2, int i3, int i4, boolean z, String str3) {
        str.getClass();
        str2.getClass();
        return new FirmwareConfiguration(str, str2, i, i2, i3, i4, z, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirmwareConfiguration)) {
            return false;
        }
        FirmwareConfiguration firmwareConfiguration = (FirmwareConfiguration) obj;
        if (b53.x(this.nickname, firmwareConfiguration.nickname) && b53.x(this.message, firmwareConfiguration.message) && this.language == firmwareConfiguration.language && this.favouriteColour == firmwareConfiguration.favouriteColour && this.birthdayMonth == firmwareConfiguration.birthdayMonth && this.birthdayDay == firmwareConfiguration.birthdayDay && this.randomizeMacAddress == firmwareConfiguration.randomizeMacAddress && b53.x(this.internalMacAddress, firmwareConfiguration.internalMacAddress)) {
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
        int c = ej6.c(wh1.a(this.birthdayDay, wh1.a(this.birthdayMonth, wh1.a(this.favouriteColour, wh1.a(this.language, ej6.b(this.nickname.hashCode() * 31, 31, this.message), 31), 31), 31), 31), this.randomizeMacAddress, 31);
        String str = this.internalMacAddress;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c + hashCode;
    }

    public String toString() {
        String str = this.nickname;
        String str2 = this.message;
        int i = this.language;
        int i2 = this.favouriteColour;
        int i3 = this.birthdayMonth;
        int i4 = this.birthdayDay;
        boolean z = this.randomizeMacAddress;
        String str3 = this.internalMacAddress;
        StringBuilder v = b31.v("FirmwareConfiguration(nickname=", str, ", message=", str2, ", language=");
        b31.A(v, i, ", favouriteColour=", i2, ", birthdayMonth=");
        b31.A(v, i3, ", birthdayDay=", i4, ", randomizeMacAddress=");
        v.append(z);
        v.append(", internalMacAddress=");
        v.append(str3);
        v.append(")");
        return v.toString();
    }
}
