package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: ua5  reason: default package */
/* loaded from: classes.dex */
public final class ua5 {
    public static final defpackage.ua5.b Companion = null;
    public static final defpackage.go3[] d = null;
    public final java.lang.String a;
    public final java.util.List b;
    public final int c;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: ua5$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.ua5.a a = null;
        private static final defpackage.wb6 descriptor = null;

        static {
                ua5$a r0 = new ua5$a
                r0.<init>()
                defpackage.ua5.a.a = r0
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.rcheevosapi.dto.RALeaderboardDataDto"
                r3 = 3
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "LBFormat"
                r2 = 0
                r1.l(r0, r2)
                java.lang.String r0 = "Entries"
                r1.l(r0, r2)
                java.lang.String r0 = "TotalEntries"
                r1.l(r0, r2)
                defpackage.ua5.a.descriptor = r1
                return
        }

        @Override // defpackage.qr2
        public final defpackage.gg3[] b() {
                r3 = this;
                go3[] r3 = defpackage.ua5.d
                r0 = 3
                gg3[] r0 = new defpackage.gg3[r0]
                r1 = 0
                ps6 r2 = defpackage.ps6.a
                r0[r1] = r2
                r1 = 1
                r3 = r3[r1]
                java.lang.Object r3 = r3.getValue()
                r0[r1] = r3
                r3 = 2
                rd2 r1 = defpackage.rd2.a
                r0[r3] = r1
                return r0
        }

        @Override // defpackage.gg3
        public final java.lang.Object c(defpackage.sc1 r11) {
                r10 = this;
                wb6 r10 = defpackage.ua5.a.descriptor
                ux0 r11 = r11.c(r10)
                go3[] r0 = defpackage.ua5.d
                r11.getClass()
                r1 = 1
                r2 = 0
                r3 = 0
                r5 = r1
                r6 = r2
                r7 = r6
                r4 = r3
            L12:
                if (r5 == 0) goto L55
                int r8 = r11.q(r10)
                r9 = -1
                if (r8 == r9) goto L53
                if (r8 == 0) goto L4c
                if (r8 == r1) goto L3b
                r9 = 2
                if (r8 != r9) goto L35
                rd2 r8 = defpackage.rd2.a
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.Object r7 = r11.G(r10, r9, r8, r7)
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r6 = r6 | 4
                goto L12
            L35:
                lg7 r10 = new lg7
                r10.<init>(r8)
                throw r10
            L3b:
                r8 = r0[r1]
                java.lang.Object r8 = r8.getValue()
                gg3 r8 = (defpackage.gg3) r8
                java.lang.Object r4 = r11.G(r10, r1, r8, r4)
                java.util.List r4 = (java.util.List) r4
                r6 = r6 | 2
                goto L12
            L4c:
                java.lang.String r3 = r11.A(r10, r2)
                r6 = r6 | 1
                goto L12
            L53:
                r5 = r2
                goto L12
            L55:
                r11.a(r10)
                ua5 r10 = new ua5
                r10.<init>(r6, r3, r4, r7)
                return r10
        }

        @Override // defpackage.gg3
        public final void d(defpackage.x32 r4, java.lang.Object r5) {
                r3 = this;
                ua5 r5 = (defpackage.ua5) r5
                r5.getClass()
                wb6 r3 = defpackage.ua5.a.descriptor
                vx0 r4 = r4.c(r3)
                go3[] r0 = defpackage.ua5.d
                r1 = 0
                java.lang.String r2 = r5.a
                r4.Q(r3, r1, r2)
                r1 = 1
                r0 = r0[r1]
                java.lang.Object r0 = r0.getValue()
                gg3 r0 = (defpackage.gg3) r0
                java.util.List r2 = r5.b
                r4.w(r3, r1, r0, r2)
                rd2 r0 = defpackage.rd2.a
                int r5 = r5.c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r1 = 2
                r4.w(r3, r1, r0, r5)
                r4.a(r3)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.ua5.a.descriptor
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ua5$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final defpackage.gg3 serializer() {
                r0 = this;
                ua5$a r0 = defpackage.ua5.a.a
                return r0
        }
    }

    static {
            ua5$b r0 = new ua5$b
            r0.<init>()
            defpackage.ua5.Companion = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            pi3 r1 = new pi3
            r2 = 27
            r1.<init>(r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            r1 = 3
            go3[] r1 = new defpackage.go3[r1]
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r0
            r0 = 2
            r1[r0] = r3
            defpackage.ua5.d = r1
            return
    }

    public /* synthetic */ ua5(int r3, java.lang.String r4, java.util.List r5, int r6) {
            r2 = this;
            r0 = r3 & 7
            r1 = 7
            if (r1 != r0) goto Lf
            r2.<init>()
            r2.a = r4
            r2.b = r5
            r2.c = r6
            return
        Lf:
            ua5$a r2 = defpackage.ua5.a.a
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
            boolean r1 = r5 instanceof defpackage.ua5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ua5 r5 = (defpackage.ua5) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List r1 = r4.b
            java.util.List r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            int r4 = r4.c
            int r5 = r5.c
            if (r4 == r5) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.b
            int r0 = defpackage.i61.b(r0, r2, r1)
            int r3 = r3.c
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RALeaderboardDataDto(format="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", entries="
            r0.append(r1)
            java.util.List r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", totalEntries="
            r0.append(r1)
            java.lang.String r1 = ")"
            int r2 = r2.c
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
    }
}
