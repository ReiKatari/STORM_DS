package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: qj7  reason: default package */
/* loaded from: classes.dex */
public final class qj7 {
    public static final defpackage.qj7.b Companion = null;
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;
    public final long d;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: qj7$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.qj7.a a = null;
        private static final defpackage.wb6 descriptor = null;

        static {
                qj7$a r0 = new qj7$a
                r0.<init>()
                defpackage.qj7.a.a = r0
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.rcheevosapi.dto.UserLoginDto"
                r3 = 4
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "User"
                r2 = 0
                r1.l(r0, r2)
                java.lang.String r0 = "Token"
                r1.l(r0, r2)
                java.lang.String r0 = "Score"
                r1.l(r0, r2)
                java.lang.String r0 = "SoftcoreScore"
                r1.l(r0, r2)
                defpackage.qj7.a.descriptor = r1
                return
        }

        @Override // defpackage.qr2
        public final defpackage.gg3[] b() {
                r2 = this;
                r2 = 4
                gg3[] r2 = new defpackage.gg3[r2]
                ps6 r0 = defpackage.ps6.a
                r1 = 0
                r2[r1] = r0
                r1 = 1
                r2[r1] = r0
                fz3 r0 = defpackage.fz3.a
                r1 = 2
                r2[r1] = r0
                r1 = 3
                r2[r1] = r0
                return r2
        }

        @Override // defpackage.gg3
        public final java.lang.Object c(defpackage.sc1 r14) {
                r13 = this;
                wb6 r13 = defpackage.qj7.a.descriptor
                ux0 r14 = r14.c(r13)
                r14.getClass()
                r0 = 1
                r1 = 0
                r2 = 0
                r3 = 0
                r6 = r1
                r7 = r2
                r8 = r7
                r9 = r3
                r11 = r9
                r2 = r0
            L14:
                if (r2 == 0) goto L4b
                int r3 = r14.q(r13)
                r4 = -1
                if (r3 == r4) goto L49
                if (r3 == 0) goto L42
                if (r3 == r0) goto L3b
                r4 = 2
                if (r3 == r4) goto L34
                r4 = 3
                if (r3 != r4) goto L2e
                long r11 = r14.c0(r13, r4)
                r6 = r6 | 8
                goto L14
            L2e:
                lg7 r13 = new lg7
                r13.<init>(r3)
                throw r13
            L34:
                long r9 = r14.c0(r13, r4)
                r6 = r6 | 4
                goto L14
            L3b:
                java.lang.String r8 = r14.A(r13, r0)
                r6 = r6 | 2
                goto L14
            L42:
                java.lang.String r7 = r14.A(r13, r1)
                r6 = r6 | 1
                goto L14
            L49:
                r2 = r1
                goto L14
            L4b:
                r14.a(r13)
                qj7 r5 = new qj7
                r5.<init>(r6, r7, r8, r9, r11)
                return r5
        }

        @Override // defpackage.gg3
        public final void d(defpackage.x32 r4, java.lang.Object r5) {
                r3 = this;
                qj7 r5 = (defpackage.qj7) r5
                r5.getClass()
                wb6 r3 = defpackage.qj7.a.descriptor
                vx0 r4 = r4.c(r3)
                r0 = 0
                java.lang.String r1 = r5.a
                r4.Q(r3, r0, r1)
                r0 = 1
                java.lang.String r1 = r5.b
                r4.Q(r3, r0, r1)
                r0 = 2
                long r1 = r5.c
                r4.n(r3, r0, r1)
                r0 = 3
                long r1 = r5.d
                r4.n(r3, r0, r1)
                r4.a(r3)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.qj7.a.descriptor
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: qj7$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final defpackage.gg3 serializer() {
                r0 = this;
                qj7$a r0 = defpackage.qj7.a.a
                return r0
        }
    }

    static {
            qj7$b r0 = new qj7$b
            r0.<init>()
            defpackage.qj7.Companion = r0
            return
    }

    public /* synthetic */ qj7(int r3, java.lang.String r4, java.lang.String r5, long r6, long r8) {
            r2 = this;
            r0 = r3 & 15
            r1 = 15
            if (r1 != r0) goto L12
            r2.<init>()
            r2.a = r4
            r2.b = r5
            r2.c = r6
            r2.d = r8
            return
        L12:
            qj7$a r2 = defpackage.qj7.a.a
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
            boolean r1 = r8 instanceof defpackage.qj7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qj7 r8 = (defpackage.qj7) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            long r3 = r7.c
            long r5 = r8.c
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L2b
            return r2
        L2b:
            long r3 = r7.d
            long r7 = r8.d
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L34
            return r2
        L34:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r1 = r4.d
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", token="
            java.lang.String r1 = ", score="
            java.lang.String r2 = "UserLoginDto(user="
            java.lang.String r3 = r5.a
            java.lang.String r4 = r5.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r2, r3, r0, r4, r1)
            long r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", softcoreScore="
            java.lang.String r2 = ")"
            long r3 = r5.d
            java.lang.String r5 = defpackage.lb1.r(r0, r1, r3, r2)
            return r5
    }
}
