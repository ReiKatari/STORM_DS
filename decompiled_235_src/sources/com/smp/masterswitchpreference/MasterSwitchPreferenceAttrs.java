package com.smp.masterswitchpreference;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MasterSwitchPreferenceAttrs implements Parcelable {
    public static final dz7 CREATOR = new Object();
    private final boolean defaultValue;
    private final Integer excludedPrefScreen;
    private final Integer explanationIcon;
    private final boolean hideExplanation;
    private final Integer includedPrefScreen;
    private final String key;
    private final boolean showStatus;
    private final int switchOffBackgroundColor;
    private final String switchOffExplanationText;
    private final String switchOffText;
    private final int switchOnBackgroundColor;
    private final String switchOnExplanationText;
    private final String switchOnText;
    private final int switchTextColor;
    private final int switchThumbColor;
    private final int switchTrackColor;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MasterSwitchPreferenceAttrs(int i, int i2, int i3, int i4, int i5, String str, String str2, Integer num, Integer num2, String str3, String str4, boolean z, String str5, boolean z2, Integer num3, boolean z3, int i6, id1 id1Var) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r9, r35);
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str6;
        Integer num4;
        Integer num5;
        String str7;
        String str8;
        boolean z4;
        String str9;
        boolean z5;
        Integer num6;
        boolean z6;
        if ((i6 & 1) != 0) {
            i7 = -1;
        } else {
            i7 = i;
        }
        if ((i6 & 2) != 0) {
            i8 = 1879048191;
        } else {
            i8 = i2;
        }
        if ((i6 & 4) != 0) {
            i9 = -65536;
        } else {
            i9 = i3;
        }
        if ((i6 & 8) != 0) {
            i10 = -3355444;
        } else {
            i10 = i4;
        }
        if ((i6 & 16) != 0) {
            i11 = -16777216;
        } else {
            i11 = i5;
        }
        if ((i6 & 32) != 0) {
            str6 = "";
        } else {
            str6 = str;
        }
        String str10 = (i6 & 64) == 0 ? str2 : "";
        if ((i6 & 128) != 0) {
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i6 & 256) != 0) {
            num5 = null;
        } else {
            num5 = num2;
        }
        if ((i6 & 512) != 0) {
            str7 = "On";
        } else {
            str7 = str3;
        }
        if ((i6 & 1024) != 0) {
            str8 = "Off";
        } else {
            str8 = str4;
        }
        if ((i6 & 2048) != 0) {
            z4 = true;
        } else {
            z4 = z;
        }
        if ((i6 & 4096) != 0) {
            str9 = "master_switch_key";
        } else {
            str9 = str5;
        }
        if ((i6 & 8192) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i6 & 16384) != 0) {
            num6 = null;
        } else {
            num6 = num3;
        }
        if ((i6 & 32768) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean getDefaultValue() {
        return this.defaultValue;
    }

    public final Integer getExcludedPrefScreen() {
        return this.excludedPrefScreen;
    }

    public final Integer getExplanationIcon() {
        return this.explanationIcon;
    }

    public final boolean getHideExplanation() {
        return this.hideExplanation;
    }

    public final Integer getIncludedPrefScreen() {
        return this.includedPrefScreen;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean getShowStatus() {
        return this.showStatus;
    }

    public final int getSwitchOffBackgroundColor() {
        return this.switchOffBackgroundColor;
    }

    public final String getSwitchOffExplanationText() {
        return this.switchOffExplanationText;
    }

    public final String getSwitchOffText() {
        return this.switchOffText;
    }

    public final int getSwitchOnBackgroundColor() {
        return this.switchOnBackgroundColor;
    }

    public final String getSwitchOnExplanationText() {
        return this.switchOnExplanationText;
    }

    public final String getSwitchOnText() {
        return this.switchOnText;
    }

    public final int getSwitchTextColor() {
        return this.switchTextColor;
    }

    public final int getSwitchThumbColor() {
        return this.switchThumbColor;
    }

    public final int getSwitchTrackColor() {
        return this.switchTrackColor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.switchThumbColor);
        parcel.writeInt(this.switchTrackColor);
        parcel.writeInt(this.switchOnBackgroundColor);
        parcel.writeInt(this.switchOffBackgroundColor);
        parcel.writeInt(this.switchTextColor);
        parcel.writeString(this.switchOffExplanationText);
        parcel.writeString(this.switchOnExplanationText);
        parcel.writeValue(this.includedPrefScreen);
        parcel.writeValue(this.excludedPrefScreen);
        parcel.writeString(this.switchOnText);
        parcel.writeString(this.switchOffText);
        parcel.writeByte(this.hideExplanation ? (byte) 1 : (byte) 0);
        parcel.writeString(this.key);
        parcel.writeByte(this.defaultValue ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.explanationIcon);
        parcel.writeByte(this.showStatus ? (byte) 1 : (byte) 0);
    }

    public MasterSwitchPreferenceAttrs(int i, int i2, int i3, int i4, int i5, String str, String str2, Integer num, Integer num2, String str3, String str4, boolean z, String str5, boolean z2, Integer num3, boolean z3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.switchThumbColor = i;
        this.switchTrackColor = i2;
        this.switchOnBackgroundColor = i3;
        this.switchOffBackgroundColor = i4;
        this.switchTextColor = i5;
        this.switchOffExplanationText = str;
        this.switchOnExplanationText = str2;
        this.includedPrefScreen = num;
        this.excludedPrefScreen = num2;
        this.switchOnText = str3;
        this.switchOffText = str4;
        this.hideExplanation = z;
        this.key = str5;
        this.defaultValue = z2;
        this.explanationIcon = num3;
        this.showStatus = z3;
    }

    public MasterSwitchPreferenceAttrs() {
        this(0, 0, 0, 0, 0, null, null, null, null, null, null, false, null, false, null, false, 65535, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MasterSwitchPreferenceAttrs(Parcel parcel) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r13, r12, r17, r14, r11 instanceof Integer ? (Integer) r11 : null, parcel.readByte() != 0);
        Class cls;
        Integer num;
        Integer num2;
        String str;
        boolean z;
        Class cls2;
        boolean z2;
        parcel.getClass();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        String readString = parcel.readString();
        readString = readString == null ? "" : readString;
        String readString2 = parcel.readString();
        String str2 = readString2 != null ? readString2 : "";
        Class cls3 = Integer.TYPE;
        Object readValue = parcel.readValue(cls3.getClassLoader());
        Integer num3 = readValue instanceof Integer ? (Integer) readValue : null;
        Object readValue2 = parcel.readValue(cls3.getClassLoader());
        Integer num4 = readValue2 instanceof Integer ? (Integer) readValue2 : null;
        String readString3 = parcel.readString();
        readString3 = readString3 == null ? "On" : readString3;
        String readString4 = parcel.readString();
        readString4 = readString4 == null ? "Off" : readString4;
        if (parcel.readByte() != 0) {
            cls = cls3;
            num = num3;
            num2 = num4;
            str = readString3;
            z = true;
        } else {
            cls = cls3;
            num = num3;
            num2 = num4;
            str = readString3;
            z = false;
        }
        String readString5 = parcel.readString();
        readString5 = readString5 == null ? "master_switch_key" : readString5;
        if (parcel.readByte() != 0) {
            cls2 = cls;
            z2 = true;
        } else {
            cls2 = cls;
            z2 = false;
        }
        Object readValue3 = parcel.readValue(cls2.getClassLoader());
    }
}
