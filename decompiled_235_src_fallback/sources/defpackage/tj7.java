package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: tj7  reason: default package */
/* loaded from: classes.dex */
public final class tj7 {
    public static final defpackage.tj7.b Companion = null;
    public static final defpackage.go3[] b = null;
    public final java.util.List a;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: tj7$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.tj7.a a = null;
        private static final defpackage.wb6 descriptor = null;

        static {
                tj7$a r0 = new tj7$a
                r0.<init>()
                defpackage.tj7.a.a = r0
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.rcheevosapi.dto.UserUnlocksDto"
                r3 = 1
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "UserUnlocks"
                r2 = 0
                r1.l(r0, r2)
                defpackage.tj7.a.descriptor = r1
                return
        }

        @Override // defpackage.qr2
        public final defpackage.gg3[] b() {
                r2 = this;
                go3[] r2 = defpackage.tj7.b
                r0 = 1
                gg3[] r0 = new defpackage.gg3[r0]
                r1 = 0
                r2 = r2[r1]
                java.lang.Object r2 = r2.getValue()
                r0[r1] = r2
                return r0
        }

        @Override // defpackage.gg3
        public final java.lang.Object c(defpackage.sc1 r9) {
                r8 = this;
                wb6 r8 = defpackage.tj7.a.descriptor
                ux0 r9 = r9.c(r8)
                go3[] r0 = defpackage.tj7.b
                r9.getClass()
                r1 = 1
                r2 = 0
                r3 = 0
                r4 = r1
                r5 = r2
            L10:
                if (r4 == 0) goto L33
                int r6 = r9.q(r8)
                r7 = -1
                if (r6 == r7) goto L31
                if (r6 != 0) goto L2b
                r5 = r0[r2]
                java.lang.Object r5 = r5.getValue()
                gg3 r5 = (defpackage.gg3) r5
                java.lang.Object r3 = r9.G(r8, r2, r5, r3)
                java.util.List r3 = (java.util.List) r3
                r5 = r1
                goto L10
            L2b:
                lg7 r8 = new lg7
                r8.<init>(r6)
                throw r8
            L31:
                r4 = r2
                goto L10
            L33:
                r9.a(r8)
                tj7 r8 = new tj7
                r8.<init>(r5, r3)
                return r8
        }

        @Override // defpackage.gg3
        public final void d(defpackage.x32 r3, java.lang.Object r4) {
                r2 = this;
                tj7 r4 = (defpackage.tj7) r4
                r4.getClass()
                wb6 r2 = defpackage.tj7.a.descriptor
                vx0 r3 = r3.c(r2)
                go3[] r0 = defpackage.tj7.b
                r1 = 0
                r0 = r0[r1]
                java.lang.Object r0 = r0.getValue()
                gg3 r0 = (defpackage.gg3) r0
                java.util.List r4 = r4.a
                r3.w(r2, r1, r0, r4)
                r3.a(r2)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.tj7.a.descriptor
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: tj7$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final defpackage.gg3 serializer() {
                r0 = this;
                tj7$a r0 = defpackage.tj7.a.a
                return r0
        }
    }

    static {
            tj7$b r0 = new tj7$b
            r0.<init>()
            defpackage.tj7.Companion = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            kt5 r1 = new kt5
            r2 = 18
            r1.<init>(r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            r1 = 1
            go3[] r1 = new defpackage.go3[r1]
            r2 = 0
            r1[r2] = r0
            defpackage.tj7.b = r1
            return
    }

    public /* synthetic */ tj7(int r3, java.util.List r4) {
            r2 = this;
            r0 = r3 & 1
            r1 = 1
            if (r1 != r0) goto Lb
            r2.<init>()
            r2.a = r4
            return
        Lb:
            tj7$a r2 = defpackage.tj7.a.a
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
            boolean r1 = r4 instanceof defpackage.tj7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            tj7 r4 = (defpackage.tj7) r4
            java.util.List r3 = r3.a
            java.util.List r4 = r4.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.util.List r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UserUnlocksDto(userUnlocks="
            r0.<init>(r1)
            java.util.List r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
