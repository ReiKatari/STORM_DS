package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class FirmwareConfiguration {
    public static final int $stable = 0;
    private final int birthdayDay;
    private final int birthdayMonth;
    private final int favouriteColour;
    private final java.lang.String internalMacAddress;
    private final int language;
    private final java.lang.String message;
    private final java.lang.String nickname;
    private final boolean randomizeMacAddress;

    public FirmwareConfiguration(java.lang.String r1, java.lang.String r2, int r3, int r4, int r5, int r6, boolean r7, java.lang.String r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.nickname = r1
            r0.message = r2
            r0.language = r3
            r0.favouriteColour = r4
            r0.birthdayMonth = r5
            r0.birthdayDay = r6
            r0.randomizeMacAddress = r7
            r0.internalMacAddress = r8
            return
    }

    public static /* synthetic */ me.magnum.melonds.domain.model.FirmwareConfiguration copy$default(me.magnum.melonds.domain.model.FirmwareConfiguration r0, java.lang.String r1, java.lang.String r2, int r3, int r4, int r5, int r6, boolean r7, java.lang.String r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r1 = r0.nickname
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.lang.String r2 = r0.message
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L12
            int r3 = r0.language
        L12:
            r10 = r9 & 8
            if (r10 == 0) goto L18
            int r4 = r0.favouriteColour
        L18:
            r10 = r9 & 16
            if (r10 == 0) goto L1e
            int r5 = r0.birthdayMonth
        L1e:
            r10 = r9 & 32
            if (r10 == 0) goto L24
            int r6 = r0.birthdayDay
        L24:
            r10 = r9 & 64
            if (r10 == 0) goto L2a
            boolean r7 = r0.randomizeMacAddress
        L2a:
            r9 = r9 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L30
            java.lang.String r8 = r0.internalMacAddress
        L30:
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            me.magnum.melonds.domain.model.FirmwareConfiguration r0 = r2.copy(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public final java.lang.String component1() {
            r0 = this;
            java.lang.String r0 = r0.nickname
            return r0
    }

    public final java.lang.String component2() {
            r0 = this;
            java.lang.String r0 = r0.message
            return r0
    }

    public final int component3() {
            r0 = this;
            int r0 = r0.language
            return r0
    }

    public final int component4() {
            r0 = this;
            int r0 = r0.favouriteColour
            return r0
    }

    public final int component5() {
            r0 = this;
            int r0 = r0.birthdayMonth
            return r0
    }

    public final int component6() {
            r0 = this;
            int r0 = r0.birthdayDay
            return r0
    }

    public final boolean component7() {
            r0 = this;
            boolean r0 = r0.randomizeMacAddress
            return r0
    }

    public final java.lang.String component8() {
            r0 = this;
            java.lang.String r0 = r0.internalMacAddress
            return r0
    }

    public final me.magnum.melonds.domain.model.FirmwareConfiguration copy(java.lang.String r1, java.lang.String r2, int r3, int r4, int r5, int r6, boolean r7, java.lang.String r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            me.magnum.melonds.domain.model.FirmwareConfiguration r0 = new me.magnum.melonds.domain.model.FirmwareConfiguration
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof me.magnum.melonds.domain.model.FirmwareConfiguration
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.magnum.melonds.domain.model.FirmwareConfiguration r5 = (me.magnum.melonds.domain.model.FirmwareConfiguration) r5
            java.lang.String r1 = r4.nickname
            java.lang.String r3 = r5.nickname
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.message
            java.lang.String r3 = r5.message
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r4.language
            int r3 = r5.language
            if (r1 == r3) goto L29
            return r2
        L29:
            int r1 = r4.favouriteColour
            int r3 = r5.favouriteColour
            if (r1 == r3) goto L30
            return r2
        L30:
            int r1 = r4.birthdayMonth
            int r3 = r5.birthdayMonth
            if (r1 == r3) goto L37
            return r2
        L37:
            int r1 = r4.birthdayDay
            int r3 = r5.birthdayDay
            if (r1 == r3) goto L3e
            return r2
        L3e:
            boolean r1 = r4.randomizeMacAddress
            boolean r3 = r5.randomizeMacAddress
            if (r1 == r3) goto L45
            return r2
        L45:
            java.lang.String r4 = r4.internalMacAddress
            java.lang.String r5 = r5.internalMacAddress
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L50
            return r2
        L50:
            return r0
    }

    public final int getBirthdayDay() {
            r0 = this;
            int r0 = r0.birthdayDay
            return r0
    }

    public final int getBirthdayMonth() {
            r0 = this;
            int r0 = r0.birthdayMonth
            return r0
    }

    public final int getFavouriteColour() {
            r0 = this;
            int r0 = r0.favouriteColour
            return r0
    }

    public final java.lang.String getInternalMacAddress() {
            r0 = this;
            java.lang.String r0 = r0.internalMacAddress
            return r0
    }

    public final int getLanguage() {
            r0 = this;
            int r0 = r0.language
            return r0
    }

    public final java.lang.String getMessage() {
            r0 = this;
            java.lang.String r0 = r0.message
            return r0
    }

    public final java.lang.String getNickname() {
            r0 = this;
            java.lang.String r0 = r0.nickname
            return r0
    }

    public final boolean getRandomizeMacAddress() {
            r0 = this;
            boolean r0 = r0.randomizeMacAddress
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.nickname
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.message
            int r0 = defpackage.xg6.d(r0, r1, r2)
            int r2 = r3.language
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.favouriteColour
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.birthdayMonth
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.birthdayDay
            int r0 = defpackage.lb1.a(r2, r0, r1)
            boolean r2 = r3.randomizeMacAddress
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.String r3 = r3.internalMacAddress
            if (r3 != 0) goto L33
            r3 = 0
            goto L37
        L33:
            int r3 = r3.hashCode()
        L37:
            int r0 = r0 + r3
            return r0
    }

    public java.lang.String toString() {
            r10 = this;
            java.lang.String r0 = r10.nickname
            java.lang.String r1 = r10.message
            int r2 = r10.language
            int r3 = r10.favouriteColour
            int r4 = r10.birthdayMonth
            int r5 = r10.birthdayDay
            boolean r6 = r10.randomizeMacAddress
            java.lang.String r10 = r10.internalMacAddress
            java.lang.String r7 = ", message="
            java.lang.String r8 = ", language="
            java.lang.String r9 = "FirmwareConfiguration(nickname="
            java.lang.StringBuilder r0 = defpackage.i61.u(r9, r0, r7, r1, r8)
            java.lang.String r1 = ", favouriteColour="
            java.lang.String r7 = ", birthdayMonth="
            defpackage.lb1.x(r0, r2, r1, r3, r7)
            java.lang.String r1 = ", birthdayDay="
            java.lang.String r2 = ", randomizeMacAddress="
            defpackage.lb1.x(r0, r4, r1, r5, r2)
            r0.append(r6)
            java.lang.String r1 = ", internalMacAddress="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = ")"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
    }
}
