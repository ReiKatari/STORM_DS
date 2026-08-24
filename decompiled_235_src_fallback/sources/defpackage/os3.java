package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: os3  reason: default package */
/* loaded from: classes.dex */
public final class os3 {
    public static final defpackage.os3.b Companion = null;
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final boolean g;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: os3$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.os3.a a = null;
        private static final defpackage.wb6 descriptor = null;

        static {
                os3$a r0 = new os3$a
                r0.<init>()
                defpackage.os3.a.a = r0
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.rcheevosapi.dto.LeaderboardDto"
                r3 = 7
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "ID"
                r2 = 0
                r1.l(r0, r2)
                java.lang.String r0 = "Mem"
                r1.l(r0, r2)
                java.lang.String r0 = "Format"
                r1.l(r0, r2)
                java.lang.String r0 = "LowerIsBetter"
                r1.l(r0, r2)
                java.lang.String r0 = "Title"
                r1.l(r0, r2)
                java.lang.String r0 = "Description"
                r1.l(r0, r2)
                java.lang.String r0 = "Hidden"
                r1.l(r0, r2)
                defpackage.os3.a.descriptor = r1
                return
        }

        @Override // defpackage.qr2
        public final defpackage.gg3[] b() {
                r3 = this;
                r3 = 7
                gg3[] r3 = new defpackage.gg3[r3]
                fz3 r0 = defpackage.fz3.a
                r1 = 0
                r3[r1] = r0
                ps6 r0 = defpackage.ps6.a
                r1 = 1
                r3[r1] = r0
                r1 = 2
                r3[r1] = r0
                u50 r1 = defpackage.u50.a
                r2 = 3
                r3[r2] = r1
                r2 = 4
                r3[r2] = r0
                r2 = 5
                r3[r2] = r0
                r0 = 6
                r3[r0] = r1
                return r3
        }

        @Override // defpackage.gg3
        public final java.lang.Object c(defpackage.sc1 r18) {
                r17 = this;
                wb6 r0 = defpackage.os3.a.descriptor
                r1 = r18
                ux0 r1 = r1.c(r0)
                r1.getClass()
                r2 = 1
                r3 = 0
                r4 = 0
                r6 = 0
                r8 = r3
                r13 = r8
                r16 = r13
                r9 = r4
                r11 = r6
                r12 = r11
                r14 = r12
                r15 = r14
                r4 = r2
            L1a:
                if (r4 == 0) goto L61
                int r5 = r1.q(r0)
                switch(r5) {
                    case -1: goto L5f;
                    case 0: goto L58;
                    case 1: goto L51;
                    case 2: goto L49;
                    case 3: goto L41;
                    case 4: goto L39;
                    case 5: goto L31;
                    case 6: goto L29;
                    default: goto L23;
                }
            L23:
                lg7 r0 = new lg7
                r0.<init>(r5)
                throw r0
            L29:
                r5 = 6
                boolean r16 = r1.W(r0, r5)
                r8 = r8 | 64
                goto L1a
            L31:
                r5 = 5
                java.lang.String r15 = r1.A(r0, r5)
                r8 = r8 | 32
                goto L1a
            L39:
                r5 = 4
                java.lang.String r14 = r1.A(r0, r5)
                r8 = r8 | 16
                goto L1a
            L41:
                r5 = 3
                boolean r13 = r1.W(r0, r5)
                r8 = r8 | 8
                goto L1a
            L49:
                r5 = 2
                java.lang.String r12 = r1.A(r0, r5)
                r8 = r8 | 4
                goto L1a
            L51:
                java.lang.String r11 = r1.A(r0, r2)
                r8 = r8 | 2
                goto L1a
            L58:
                long r9 = r1.c0(r0, r3)
                r8 = r8 | 1
                goto L1a
            L5f:
                r4 = r3
                goto L1a
            L61:
                r1.a(r0)
                os3 r7 = new os3
                r7.<init>(r8, r9, r11, r12, r13, r14, r15, r16)
                return r7
        }

        @Override // defpackage.gg3
        public final void d(defpackage.x32 r4, java.lang.Object r5) {
                r3 = this;
                os3 r5 = (defpackage.os3) r5
                r5.getClass()
                wb6 r3 = defpackage.os3.a.descriptor
                vx0 r4 = r4.c(r3)
                r0 = 0
                long r1 = r5.a
                r4.n(r3, r0, r1)
                r0 = 1
                java.lang.String r1 = r5.b
                r4.Q(r3, r0, r1)
                r0 = 2
                java.lang.String r1 = r5.c
                r4.Q(r3, r0, r1)
                r0 = 3
                boolean r1 = r5.d
                r4.u(r3, r0, r1)
                r0 = 4
                java.lang.String r1 = r5.e
                r4.Q(r3, r0, r1)
                r0 = 5
                java.lang.String r1 = r5.f
                r4.Q(r3, r0, r1)
                r0 = 6
                boolean r5 = r5.g
                r4.u(r3, r0, r5)
                r4.a(r3)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.os3.a.descriptor
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: os3$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final defpackage.gg3 serializer() {
                r0 = this;
                os3$a r0 = defpackage.os3.a.a
                return r0
        }
    }

    static {
            os3$b r0 = new os3$b
            r0.<init>()
            defpackage.os3.Companion = r0
            return
    }

    public /* synthetic */ os3(int r3, long r4, java.lang.String r6, java.lang.String r7, boolean r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r2 = this;
            r0 = r3 & 127(0x7f, float:1.78E-43)
            r1 = 127(0x7f, float:1.78E-43)
            if (r1 != r0) goto L18
            r2.<init>()
            r2.a = r4
            r2.b = r6
            r2.c = r7
            r2.d = r8
            r2.e = r9
            r2.f = r10
            r2.g = r11
            return
        L18:
            os3$a r2 = defpackage.os3.a.a
            wb6 r2 = r2.e()
            defpackage.ii2.S(r3, r1, r2)
            r2 = 0
            throw r2
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.os3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            os3 r8 = (defpackage.os3) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            java.lang.String r1 = r7.c
            java.lang.String r3 = r8.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            boolean r1 = r7.d
            boolean r3 = r8.d
            if (r1 == r3) goto L32
            return r2
        L32:
            java.lang.String r1 = r7.e
            java.lang.String r3 = r8.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L3d
            return r2
        L3d:
            java.lang.String r1 = r7.f
            java.lang.String r3 = r8.f
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L48
            return r2
        L48:
            boolean r7 = r7.g
            boolean r8 = r8.g
            if (r7 == r8) goto L4f
            return r2
        L4f:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r2 = r3.d
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.String r2 = r3.e
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.f
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r3 = r3.g
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LeaderboardDto(id="
            r0.<init>(r1)
            long r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", mem="
            r0.append(r1)
            java.lang.String r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", format="
            r0.append(r1)
            java.lang.String r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", lowerIsBetter="
            r0.append(r1)
            boolean r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", title="
            java.lang.String r2 = ", description="
            java.lang.String r3 = r5.e
            java.lang.String r4 = r5.f
            defpackage.i61.B(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", hidden="
            r0.append(r1)
            boolean r5 = r5.g
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
