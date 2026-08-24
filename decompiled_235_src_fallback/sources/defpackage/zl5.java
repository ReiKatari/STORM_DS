package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: zl5  reason: default package */
/* loaded from: classes.dex */
public final class zl5 {
    public static final defpackage.zl5.b Companion = null;
    public final defpackage.qd5 a;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: zl5$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.zl5.a a = null;
        private static final defpackage.wb6 descriptor = null;

        static {
                zl5$a r0 = new zl5$a
                r0.<init>()
                defpackage.zl5.a.a = r0
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.rcheevosapi.dto.ResponseDto"
                r3 = 1
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "RankInfo"
                r2 = 0
                r1.l(r0, r2)
                defpackage.zl5.a.descriptor = r1
                return
        }

        @Override // defpackage.qr2
        public final defpackage.gg3[] b() {
                r2 = this;
                r2 = 1
                gg3[] r2 = new defpackage.gg3[r2]
                qd5$a r0 = defpackage.qd5.a.a
                r1 = 0
                r2[r1] = r0
                return r2
        }

        @Override // defpackage.gg3
        public final java.lang.Object c(defpackage.sc1 r8) {
                r7 = this;
                wb6 r7 = defpackage.zl5.a.descriptor
                ux0 r8 = r8.c(r7)
                r8.getClass()
                r0 = 1
                r1 = 0
                r2 = 0
                r3 = r0
                r4 = r1
            Le:
                if (r3 == 0) goto L2b
                int r5 = r8.q(r7)
                r6 = -1
                if (r5 == r6) goto L29
                if (r5 != 0) goto L23
                qd5$a r4 = defpackage.qd5.a.a
                java.lang.Object r2 = r8.G(r7, r1, r4, r2)
                qd5 r2 = (defpackage.qd5) r2
                r4 = r0
                goto Le
            L23:
                lg7 r7 = new lg7
                r7.<init>(r5)
                throw r7
            L29:
                r3 = r1
                goto Le
            L2b:
                r8.a(r7)
                zl5 r7 = new zl5
                r7.<init>(r4, r2)
                return r7
        }

        @Override // defpackage.gg3
        public final void d(defpackage.x32 r3, java.lang.Object r4) {
                r2 = this;
                zl5 r4 = (defpackage.zl5) r4
                r4.getClass()
                wb6 r2 = defpackage.zl5.a.descriptor
                vx0 r3 = r3.c(r2)
                qd5$a r0 = defpackage.qd5.a.a
                qd5 r4 = r4.a
                r1 = 0
                r3.w(r2, r1, r0, r4)
                r3.a(r2)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.zl5.a.descriptor
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: zl5$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final defpackage.gg3 serializer() {
                r0 = this;
                zl5$a r0 = defpackage.zl5.a.a
                return r0
        }
    }

    static {
            zl5$b r0 = new zl5$b
            r0.<init>()
            defpackage.zl5.Companion = r0
            return
    }

    public /* synthetic */ zl5(int r3, defpackage.qd5 r4) {
            r2 = this;
            r0 = r3 & 1
            r1 = 1
            if (r1 != r0) goto Lb
            r2.<init>()
            r2.a = r4
            return
        Lb:
            zl5$a r2 = defpackage.zl5.a.a
            wb6 r2 = r2.e()
            defpackage.ii2.S(r3, r1, r2)
            r2 = 0
            throw r2
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.zl5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            zl5 r4 = (defpackage.zl5) r4
            qd5 r3 = r3.a
            qd5 r4 = r4.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            qd5 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ResponseDto(rankInfo="
            r0.<init>(r1)
            qd5 r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
