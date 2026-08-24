package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: qd5  reason: default package */
/* loaded from: classes.dex */
public final class qd5 {
    public static final defpackage.qd5.b Companion = null;
    public final int a;
    public final int b;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: qd5$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.qd5.a a = null;
        private static final defpackage.wb6 descriptor = null;

        static {
                qd5$a r0 = new qd5$a
                r0.<init>()
                defpackage.qd5.a.a = r0
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.rcheevosapi.dto.RankInfoDto"
                r3 = 2
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "NumEntries"
                r2 = 0
                r1.l(r0, r2)
                java.lang.String r0 = "Rank"
                r1.l(r0, r2)
                defpackage.qd5.a.descriptor = r1
                return
        }

        @Override // defpackage.qr2
        public final defpackage.gg3[] b() {
                r2 = this;
                r2 = 2
                gg3[] r2 = new defpackage.gg3[r2]
                o93 r0 = defpackage.o93.a
                r1 = 0
                r2[r1] = r0
                r1 = 1
                r2[r1] = r0
                return r2
        }

        @Override // defpackage.gg3
        public final java.lang.Object c(defpackage.sc1 r9) {
                r8 = this;
                wb6 r8 = defpackage.qd5.a.descriptor
                ux0 r9 = r9.c(r8)
                r9.getClass()
                r0 = 1
                r1 = 0
                r2 = r0
                r3 = r1
                r4 = r3
                r5 = r4
            Lf:
                if (r2 == 0) goto L32
                int r6 = r9.q(r8)
                r7 = -1
                if (r6 == r7) goto L30
                if (r6 == 0) goto L29
                if (r6 != r0) goto L23
                int r5 = r9.H(r8, r0)
                r3 = r3 | 2
                goto Lf
            L23:
                lg7 r8 = new lg7
                r8.<init>(r6)
                throw r8
            L29:
                int r4 = r9.H(r8, r1)
                r3 = r3 | 1
                goto Lf
            L30:
                r2 = r1
                goto Lf
            L32:
                r9.a(r8)
                qd5 r8 = new qd5
                r8.<init>(r3, r4, r5)
                return r8
        }

        @Override // defpackage.gg3
        public final void d(defpackage.x32 r3, java.lang.Object r4) {
                r2 = this;
                qd5 r4 = (defpackage.qd5) r4
                r4.getClass()
                wb6 r2 = defpackage.qd5.a.descriptor
                vx0 r3 = r3.c(r2)
                r0 = 0
                int r1 = r4.a
                r3.O(r0, r1, r2)
                r0 = 1
                int r4 = r4.b
                r3.O(r0, r4, r2)
                r3.a(r2)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.qd5.a.descriptor
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: qd5$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final defpackage.gg3 serializer() {
                r0 = this;
                qd5$a r0 = defpackage.qd5.a.a
                return r0
        }
    }

    static {
            qd5$b r0 = new qd5$b
            r0.<init>()
            defpackage.qd5.Companion = r0
            return
    }

    public /* synthetic */ qd5(int r3, int r4, int r5) {
            r2 = this;
            r0 = r3 & 3
            r1 = 3
            if (r1 != r0) goto Ld
            r2.<init>()
            r2.a = r4
            r2.b = r5
            return
        Ld:
            qd5$a r2 = defpackage.qd5.a.a
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
            boolean r1 = r5 instanceof defpackage.qd5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qd5 r5 = (defpackage.qd5) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            int r1 = r1.b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = ", rank="
            java.lang.String r1 = ")"
            int r2 = r4.a
            int r4 = r4.b
            java.lang.String r3 = "RankInfoDto(numEntries="
            java.lang.String r4 = defpackage.xg6.m(r2, r4, r3, r0, r1)
            return r4
    }
}
