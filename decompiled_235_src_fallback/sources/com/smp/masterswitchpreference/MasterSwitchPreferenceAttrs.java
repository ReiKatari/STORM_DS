package com.smp.masterswitchpreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MasterSwitchPreferenceAttrs implements android.os.Parcelable {
    public static final defpackage.dz7 CREATOR = null;
    private final boolean defaultValue;
    private final java.lang.Integer excludedPrefScreen;
    private final java.lang.Integer explanationIcon;
    private final boolean hideExplanation;
    private final java.lang.Integer includedPrefScreen;
    private final java.lang.String key;
    private final boolean showStatus;
    private final int switchOffBackgroundColor;
    private final java.lang.String switchOffExplanationText;
    private final java.lang.String switchOffText;
    private final int switchOnBackgroundColor;
    private final java.lang.String switchOnExplanationText;
    private final java.lang.String switchOnText;
    private final int switchTextColor;
    private final int switchThumbColor;
    private final int switchTrackColor;

    static {
            dz7 r0 = new dz7
            r0.<init>()
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs.CREATOR = r0
            return
    }

    public MasterSwitchPreferenceAttrs() {
            r19 = this;
            r17 = 65535(0xffff, float:9.1834E-41)
            r18 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r0 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
    }

    public MasterSwitchPreferenceAttrs(int r1, int r2, int r3, int r4, int r5, java.lang.String r6, java.lang.String r7, java.lang.Integer r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, boolean r12, java.lang.String r13, boolean r14, java.lang.Integer r15, boolean r16) {
            r0 = this;
            r6.getClass()
            r7.getClass()
            r10.getClass()
            r11.getClass()
            r13.getClass()
            r0.<init>()
            r0.switchThumbColor = r1
            r0.switchTrackColor = r2
            r0.switchOnBackgroundColor = r3
            r0.switchOffBackgroundColor = r4
            r0.switchTextColor = r5
            r0.switchOffExplanationText = r6
            r0.switchOnExplanationText = r7
            r0.includedPrefScreen = r8
            r0.excludedPrefScreen = r9
            r0.switchOnText = r10
            r0.switchOffText = r11
            r0.hideExplanation = r12
            r0.key = r13
            r0.defaultValue = r14
            r0.explanationIcon = r15
            r1 = r16
            r0.showStatus = r1
            return
    }

    public /* synthetic */ MasterSwitchPreferenceAttrs(int r19, int r20, int r21, int r22, int r23, java.lang.String r24, java.lang.String r25, java.lang.Integer r26, java.lang.Integer r27, java.lang.String r28, java.lang.String r29, boolean r30, java.lang.String r31, boolean r32, java.lang.Integer r33, boolean r34, int r35, defpackage.id1 r36) {
            r18 = this;
            r0 = r35
            r1 = r0 & 1
            if (r1 == 0) goto L8
            r1 = -1
            goto La
        L8:
            r1 = r19
        La:
            r2 = r0 & 2
            if (r2 == 0) goto L12
            r2 = 1879048191(0x6fffffff, float:1.5845632E29)
            goto L14
        L12:
            r2 = r20
        L14:
            r3 = r0 & 4
            if (r3 == 0) goto L1b
            r3 = -65536(0xffffffffffff0000, float:NaN)
            goto L1d
        L1b:
            r3 = r21
        L1d:
            r4 = r0 & 8
            if (r4 == 0) goto L25
            r4 = -3355444(0xffffffffffcccccc, float:NaN)
            goto L27
        L25:
            r4 = r22
        L27:
            r5 = r0 & 16
            if (r5 == 0) goto L2e
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L30
        L2e:
            r5 = r23
        L30:
            r6 = r0 & 32
            java.lang.String r7 = ""
            if (r6 == 0) goto L38
            r6 = r7
            goto L3a
        L38:
            r6 = r24
        L3a:
            r8 = r0 & 64
            if (r8 == 0) goto L3f
            goto L41
        L3f:
            r7 = r25
        L41:
            r8 = r0 & 128(0x80, float:1.8E-43)
            if (r8 == 0) goto L47
            r8 = 0
            goto L49
        L47:
            r8 = r26
        L49:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L4f
            r10 = 0
            goto L51
        L4f:
            r10 = r27
        L51:
            r11 = r0 & 512(0x200, float:7.17E-43)
            if (r11 == 0) goto L58
            java.lang.String r11 = "On"
            goto L5a
        L58:
            r11 = r28
        L5a:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L61
            java.lang.String r12 = "Off"
            goto L63
        L61:
            r12 = r29
        L63:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L69
            r13 = 1
            goto L6b
        L69:
            r13 = r30
        L6b:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L72
            java.lang.String r14 = "master_switch_key"
            goto L74
        L72:
            r14 = r31
        L74:
            r15 = r0 & 8192(0x2000, float:1.148E-41)
            r16 = 0
            if (r15 == 0) goto L7d
            r15 = r16
            goto L7f
        L7d:
            r15 = r32
        L7f:
            r9 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L85
            r9 = 0
            goto L87
        L85:
            r9 = r33
        L87:
            r17 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r17
            if (r0 == 0) goto Lb1
            r35 = r16
        L90:
            r19 = r18
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r8
            r34 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            goto Lb4
        Lb1:
            r35 = r34
            goto L90
        Lb4:
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return
    }

    public MasterSwitchPreferenceAttrs(android.os.Parcel r20) {
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
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final boolean getDefaultValue() {
            r0 = this;
            boolean r0 = r0.defaultValue
            return r0
    }

    public final java.lang.Integer getExcludedPrefScreen() {
            r0 = this;
            java.lang.Integer r0 = r0.excludedPrefScreen
            return r0
    }

    public final java.lang.Integer getExplanationIcon() {
            r0 = this;
            java.lang.Integer r0 = r0.explanationIcon
            return r0
    }

    public final boolean getHideExplanation() {
            r0 = this;
            boolean r0 = r0.hideExplanation
            return r0
    }

    public final java.lang.Integer getIncludedPrefScreen() {
            r0 = this;
            java.lang.Integer r0 = r0.includedPrefScreen
            return r0
    }

    public final java.lang.String getKey() {
            r0 = this;
            java.lang.String r0 = r0.key
            return r0
    }

    public final boolean getShowStatus() {
            r0 = this;
            boolean r0 = r0.showStatus
            return r0
    }

    public final int getSwitchOffBackgroundColor() {
            r0 = this;
            int r0 = r0.switchOffBackgroundColor
            return r0
    }

    public final java.lang.String getSwitchOffExplanationText() {
            r0 = this;
            java.lang.String r0 = r0.switchOffExplanationText
            return r0
    }

    public final java.lang.String getSwitchOffText() {
            r0 = this;
            java.lang.String r0 = r0.switchOffText
            return r0
    }

    public final int getSwitchOnBackgroundColor() {
            r0 = this;
            int r0 = r0.switchOnBackgroundColor
            return r0
    }

    public final java.lang.String getSwitchOnExplanationText() {
            r0 = this;
            java.lang.String r0 = r0.switchOnExplanationText
            return r0
    }

    public final java.lang.String getSwitchOnText() {
            r0 = this;
            java.lang.String r0 = r0.switchOnText
            return r0
    }

    public final int getSwitchTextColor() {
            r0 = this;
            int r0 = r0.switchTextColor
            return r0
    }

    public final int getSwitchThumbColor() {
            r0 = this;
            int r0 = r0.switchThumbColor
            return r0
    }

    public final int getSwitchTrackColor() {
            r0 = this;
            int r0 = r0.switchTrackColor
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            r1.getClass()
            int r2 = r0.switchThumbColor
            r1.writeInt(r2)
            int r2 = r0.switchTrackColor
            r1.writeInt(r2)
            int r2 = r0.switchOnBackgroundColor
            r1.writeInt(r2)
            int r2 = r0.switchOffBackgroundColor
            r1.writeInt(r2)
            int r2 = r0.switchTextColor
            r1.writeInt(r2)
            java.lang.String r2 = r0.switchOffExplanationText
            r1.writeString(r2)
            java.lang.String r2 = r0.switchOnExplanationText
            r1.writeString(r2)
            java.lang.Integer r2 = r0.includedPrefScreen
            r1.writeValue(r2)
            java.lang.Integer r2 = r0.excludedPrefScreen
            r1.writeValue(r2)
            java.lang.String r2 = r0.switchOnText
            r1.writeString(r2)
            java.lang.String r2 = r0.switchOffText
            r1.writeString(r2)
            boolean r2 = r0.hideExplanation
            r1.writeByte(r2)
            java.lang.String r2 = r0.key
            r1.writeString(r2)
            boolean r2 = r0.defaultValue
            r1.writeByte(r2)
            java.lang.Integer r2 = r0.explanationIcon
            r1.writeValue(r2)
            boolean r0 = r0.showStatus
            r1.writeByte(r0)
            return
    }
}
