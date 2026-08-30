package com.smp.masterswitchpreference;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class MasterSwitchPreferenceAttrs implements Parcelable {
    public static final lk7 CREATOR = new Object();
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
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MasterSwitchPreferenceAttrs(int r19, int r20, int r21, int r22, int r23, java.lang.String r24, java.lang.String r25, java.lang.Integer r26, java.lang.Integer r27, java.lang.String r28, java.lang.String r29, boolean r30, java.lang.String r31, boolean r32, java.lang.Integer r33, boolean r34, int r35, defpackage.n91 r36) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs.<init>(int, int, int, int, int, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.Integer, boolean, int, n91):void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public MasterSwitchPreferenceAttrs(android.os.Parcel r20) {
        /*
            r19 = this;
            r0 = r20
            r0.getClass()
            int r1 = r0.readInt()
            int r2 = r0.readInt()
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            int r5 = r0.readInt()
            java.lang.String r6 = r0.readString()
            java.lang.String r7 = ""
            if (r6 != 0) goto L22
            r6 = r7
        L22:
            java.lang.String r8 = r0.readString()
            if (r8 != 0) goto L29
            goto L2a
        L29:
            r7 = r8
        L2a:
            java.lang.Class r8 = java.lang.Integer.TYPE
            java.lang.ClassLoader r9 = r8.getClassLoader()
            java.lang.Object r9 = r0.readValue(r9)
            boolean r10 = r9 instanceof java.lang.Integer
            if (r10 == 0) goto L3b
            java.lang.Integer r9 = (java.lang.Integer) r9
            goto L3c
        L3b:
            r9 = 0
        L3c:
            java.lang.ClassLoader r10 = r8.getClassLoader()
            java.lang.Object r10 = r0.readValue(r10)
            boolean r12 = r10 instanceof java.lang.Integer
            if (r12 == 0) goto L4b
            java.lang.Integer r10 = (java.lang.Integer) r10
            goto L4c
        L4b:
            r10 = 0
        L4c:
            java.lang.String r12 = r0.readString()
            if (r12 != 0) goto L54
            java.lang.String r12 = "On"
        L54:
            java.lang.String r13 = r0.readString()
            if (r13 != 0) goto L5c
            java.lang.String r13 = "Off"
        L5c:
            byte r14 = r0.readByte()
            r16 = 1
            if (r14 == 0) goto L6b
            r14 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            r12 = r16
            goto L70
        L6b:
            r14 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            r12 = 0
        L70:
            java.lang.String r17 = r0.readString()
            if (r17 != 0) goto L78
            java.lang.String r17 = "master_switch_key"
        L78:
            byte r18 = r0.readByte()
            if (r18 == 0) goto L83
            r18 = r14
            r14 = r16
            goto L86
        L83:
            r18 = r14
            r14 = 0
        L86:
            java.lang.ClassLoader r11 = r18.getClassLoader()
            java.lang.Object r11 = r0.readValue(r11)
            boolean r15 = r11 instanceof java.lang.Integer
            if (r15 == 0) goto L96
            java.lang.Integer r11 = (java.lang.Integer) r11
            r15 = r11
            goto L97
        L96:
            r15 = 0
        L97:
            byte r0 = r0.readByte()
            if (r0 == 0) goto La3
        L9d:
            r0 = r19
            r11 = r13
            r13 = r17
            goto La6
        La3:
            r16 = 0
            goto L9d
        La6:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs.<init>(android.os.Parcel):void");
    }
}
