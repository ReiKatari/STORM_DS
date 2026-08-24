package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: wz  reason: default package */
/* loaded from: classes.dex */
public final class wz {
    public static final defpackage.wz.b Companion = null;
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: wz$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.wz.a a = null;
        private static final defpackage.wb6 descriptor = null;

        static {
                wz$a r0 = new wz$a
                r0.<init>()
                defpackage.wz.a.a = r0
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.rcheevosapi.dto.AwardAchievementResponseDto"
                r3 = 5
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "Success"
                r2 = 0
                r1.l(r0, r2)
                java.lang.String r0 = "AchievementsRemaining"
                r1.l(r0, r2)
                java.lang.String r0 = "Score"
                r1.l(r0, r2)
                java.lang.String r0 = "SoftcoreScore"
                r1.l(r0, r2)
                java.lang.String r0 = "AchievementID"
                r1.l(r0, r2)
                defpackage.wz.a.descriptor = r1
                return
        }

        @Override // defpackage.qr2
        public final defpackage.gg3[] b() {
                r2 = this;
                r2 = 5
                gg3[] r2 = new defpackage.gg3[r2]
                u50 r0 = defpackage.u50.a
                r1 = 0
                r2[r1] = r0
                o93 r0 = defpackage.o93.a
                r1 = 1
                r2[r1] = r0
                r1 = 2
                r2[r1] = r0
                r1 = 3
                r2[r1] = r0
                r1 = 4
                r2[r1] = r0
                return r2
        }

        @Override // defpackage.gg3
        public final java.lang.Object c(defpackage.sc1 r12) {
                r11 = this;
                wb6 r11 = defpackage.wz.a.descriptor
                ux0 r12 = r12.c(r11)
                r12.getClass()
                r0 = 1
                r1 = 0
                r2 = r0
                r4 = r1
                r5 = r4
                r6 = r5
                r7 = r6
                r8 = r7
                r9 = r8
            L12:
                if (r2 == 0) goto L53
                int r3 = r12.q(r11)
                r10 = -1
                if (r3 == r10) goto L51
                if (r3 == 0) goto L4a
                if (r3 == r0) goto L43
                r10 = 2
                if (r3 == r10) goto L3c
                r10 = 3
                if (r3 == r10) goto L35
                r9 = 4
                if (r3 != r9) goto L2f
                int r9 = r12.H(r11, r9)
                r4 = r4 | 16
                goto L12
            L2f:
                lg7 r11 = new lg7
                r11.<init>(r3)
                throw r11
            L35:
                int r8 = r12.H(r11, r10)
                r4 = r4 | 8
                goto L12
            L3c:
                int r7 = r12.H(r11, r10)
                r4 = r4 | 4
                goto L12
            L43:
                int r6 = r12.H(r11, r0)
                r4 = r4 | 2
                goto L12
            L4a:
                boolean r5 = r12.W(r11, r1)
                r4 = r4 | 1
                goto L12
            L51:
                r2 = r1
                goto L12
            L53:
                r12.a(r11)
                wz r3 = new wz
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return r3
        }

        @Override // defpackage.gg3
        public final void d(defpackage.x32 r3, java.lang.Object r4) {
                r2 = this;
                wz r4 = (defpackage.wz) r4
                r4.getClass()
                wb6 r2 = defpackage.wz.a.descriptor
                vx0 r3 = r3.c(r2)
                r0 = 0
                boolean r1 = r4.a
                r3.u(r2, r0, r1)
                r0 = 1
                int r1 = r4.b
                r3.O(r0, r1, r2)
                r0 = 2
                int r1 = r4.c
                r3.O(r0, r1, r2)
                r0 = 3
                int r1 = r4.d
                r3.O(r0, r1, r2)
                r0 = 4
                int r4 = r4.e
                r3.O(r0, r4, r2)
                r3.a(r2)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.wz.a.descriptor
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: wz$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final defpackage.gg3 serializer() {
                r0 = this;
                wz$a r0 = defpackage.wz.a.a
                return r0
        }
    }

    static {
            wz$b r0 = new wz$b
            r0.<init>()
            defpackage.wz.Companion = r0
            return
    }

    public /* synthetic */ wz(int r3, boolean r4, int r5, int r6, int r7, int r8) {
            r2 = this;
            r0 = r3 & 31
            r1 = 31
            if (r1 != r0) goto L14
            r2.<init>()
            r2.a = r4
            r2.b = r5
            r2.c = r6
            r2.d = r7
            r2.e = r8
            return
        L14:
            wz$a r2 = defpackage.wz.a.a
            wb6 r2 = r2.e()
            defpackage.ii2.S(r3, r1, r2)
            r2 = 0
            throw r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.wz
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wz r5 = (defpackage.wz) r5
            boolean r1 = r4.a
            boolean r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L21
            return r2
        L21:
            int r1 = r4.d
            int r3 = r5.d
            if (r1 == r3) goto L28
            return r2
        L28:
            int r4 = r4.e
            int r5 = r5.e
            if (r4 == r5) goto L2f
            return r2
        L2f:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.d
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.e
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AwardAchievementResponseDto(success="
            r0.<init>(r1)
            boolean r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", achievementsRemaining="
            r0.append(r1)
            int r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", score="
            r0.append(r1)
            java.lang.String r1 = ", softcoreScore="
            java.lang.String r2 = ", achievementId="
            int r3 = r5.c
            int r4 = r5.d
            defpackage.lb1.x(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            int r5 = r5.e
            java.lang.String r5 = defpackage.lb1.o(r0, r5, r1)
            return r5
    }
}
