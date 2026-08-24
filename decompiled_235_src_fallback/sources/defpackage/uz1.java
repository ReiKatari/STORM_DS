package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uz1  reason: default package */
/* loaded from: classes.dex */
public final class uz1 {
    public final defpackage.sz1.b a;
    public final defpackage.sz1.d b;
    public final defpackage.ik4 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final java.lang.String h;
    public final long i;

    public /* synthetic */ uz1(defpackage.sz1.b r12, defpackage.sz1.d r13, defpackage.ik4 r14, boolean r15, boolean r16, boolean r17) {
            r11 = this;
            java.lang.String r8 = "https://retroachievements.org"
            r9 = 0
            r7 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public uz1(defpackage.sz1.b r1, defpackage.sz1.d r2, defpackage.ik4 r3, boolean r4, boolean r5, boolean r6, boolean r7, java.lang.String r8, long r9) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            return
    }

    public static defpackage.uz1 a(defpackage.uz1 r11, defpackage.sz1.b r12, defpackage.sz1.d r13, defpackage.ik4 r14, java.lang.String r15, long r16, int r18) {
            r0 = r18
            r1 = r0 & 1
            if (r1 == 0) goto L8
            sz1$b r12 = r11.a
        L8:
            r1 = r12
            r12 = r0 & 2
            if (r12 == 0) goto Lf
            sz1$d r13 = r11.b
        Lf:
            r2 = r13
            r12 = r0 & 4
            if (r12 == 0) goto L18
            ik4 r12 = r11.c
            r3 = r12
            goto L19
        L18:
            r3 = r14
        L19:
            r12 = r0 & 8
            r13 = 0
            if (r12 == 0) goto L22
            boolean r12 = r11.d
            r4 = r12
            goto L23
        L22:
            r4 = r13
        L23:
            r12 = r0 & 16
            if (r12 == 0) goto L29
            boolean r13 = r11.e
        L29:
            r5 = r13
            r12 = r0 & 32
            if (r12 == 0) goto L32
            boolean r12 = r11.f
        L30:
            r6 = r12
            goto L34
        L32:
            r12 = 1
            goto L30
        L34:
            boolean r7 = r11.g
            r12 = r0 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L3e
            java.lang.String r12 = r11.h
            r8 = r12
            goto L3f
        L3e:
            r8 = r15
        L3f:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L47
            long r12 = r11.i
            r9 = r12
            goto L49
        L47:
            r9 = r16
        L49:
            r11.getClass()
            r1.getClass()
            r2.getClass()
            r8.getClass()
            uz1 r0 = new uz1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L50
        L3:
            boolean r0 = r3 instanceof defpackage.uz1
            if (r0 != 0) goto L8
            goto L4e
        L8:
            uz1 r3 = (defpackage.uz1) r3
            sz1$b r0 = r2.a
            sz1$b r1 = r3.a
            if (r0 == r1) goto L11
            goto L4e
        L11:
            sz1$d r0 = r2.b
            sz1$d r1 = r3.b
            if (r0 == r1) goto L18
            goto L4e
        L18:
            ik4 r0 = r2.c
            ik4 r1 = r3.c
            if (r0 == r1) goto L1f
            goto L4e
        L1f:
            boolean r0 = r2.d
            boolean r1 = r3.d
            if (r0 == r1) goto L26
            goto L4e
        L26:
            boolean r0 = r2.e
            boolean r1 = r3.e
            if (r0 == r1) goto L2d
            goto L4e
        L2d:
            boolean r0 = r2.f
            boolean r1 = r3.f
            if (r0 == r1) goto L34
            goto L4e
        L34:
            boolean r0 = r2.g
            boolean r1 = r3.g
            if (r0 == r1) goto L3b
            goto L4e
        L3b:
            java.lang.String r0 = r2.h
            java.lang.String r1 = r3.h
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L46
            goto L4e
        L46:
            long r0 = r2.i
            long r2 = r3.i
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L50
        L4e:
            r2 = 0
            return r2
        L50:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            sz1$b r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            sz1$d r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            ik4 r0 = r3.c
            if (r0 != 0) goto L17
            r0 = 0
            goto L1b
        L17:
            int r0 = r0.hashCode()
        L1b:
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.d
            int r0 = defpackage.xg6.e(r2, r0, r1)
            boolean r2 = r3.e
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.f
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.g
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.String r2 = r3.h
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r1 = r3.i
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RetroAchievementsLaunchDecision(networkMode="
            r0.<init>(r1)
            sz1$b r1 = r4.a
            r0.append(r1)
            java.lang.String r1 = ", sessionMode="
            r0.append(r1)
            sz1$d r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = ", initialOfflineType="
            r0.append(r1)
            ik4 r1 = r4.c
            r0.append(r1)
            java.lang.String r1 = ", isHardcoreEligibleAfterOnlineStart="
            r0.append(r1)
            boolean r1 = r4.d
            r0.append(r1)
            java.lang.String r1 = ", offlineDueToNoInternetAtStart="
            r0.append(r1)
            boolean r1 = r4.e
            r0.append(r1)
            java.lang.String r1 = ", hardcoreOfflineDisabled="
            r0.append(r1)
            boolean r1 = r4.f
            r0.append(r1)
            java.lang.String r1 = ", usesProxyBackend="
            r0.append(r1)
            boolean r1 = r4.g
            r0.append(r1)
            java.lang.String r1 = ", nativeClientHost="
            r0.append(r1)
            java.lang.String r1 = r4.h
            r0.append(r1)
            java.lang.String r1 = ", endpointGeneration="
            r0.append(r1)
            java.lang.String r1 = ")"
            long r2 = r4.i
            java.lang.String r4 = defpackage.lb1.p(r0, r2, r1)
            return r4
    }
}
