package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: wa5  reason: default package */
/* loaded from: classes.dex */
public final class wa5 {
    public static final defpackage.wa5.b Companion = null;
    public final java.lang.String a;
    public final int b;
    public final int c;
    public final long d;
    public final java.lang.String e;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: wa5$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.wa5.a a = null;
        private static final defpackage.wb6 descriptor = null;

        static {
                wa5$a r0 = new wa5$a
                r0.<init>()
                defpackage.wa5.a.a = r0
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.rcheevosapi.dto.RALeaderboardEntryDto"
                r3 = 5
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "User"
                r2 = 0
                r1.l(r0, r2)
                java.lang.String r0 = "Rank"
                r1.l(r0, r2)
                java.lang.String r0 = "Score"
                r1.l(r0, r2)
                java.lang.String r0 = "DateSubmitted"
                r1.l(r0, r2)
                java.lang.String r0 = "AvatarUrl"
                r2 = 1
                r1.l(r0, r2)
                defpackage.wa5.a.descriptor = r1
                return
        }

        @Override // defpackage.qr2
        public final defpackage.gg3[] b() {
                r3 = this;
                ps6 r3 = defpackage.ps6.a
                gg3 r0 = defpackage.q60.I(r3)
                r1 = 5
                gg3[] r1 = new defpackage.gg3[r1]
                r2 = 0
                r1[r2] = r3
                o93 r3 = defpackage.o93.a
                r2 = 1
                r1[r2] = r3
                r2 = 2
                r1[r2] = r3
                fz3 r3 = defpackage.fz3.a
                r2 = 3
                r1[r2] = r3
                r3 = 4
                r1[r3] = r0
                return r1
        }

        @Override // defpackage.gg3
        public final java.lang.Object c(defpackage.sc1 r14) {
                r13 = this;
                wb6 r13 = defpackage.wa5.a.descriptor
                ux0 r14 = r14.c(r13)
                r14.getClass()
                r0 = 1
                r1 = 0
                r2 = 0
                r3 = 0
                r6 = r1
                r8 = r6
                r9 = r8
                r7 = r2
                r12 = r7
                r10 = r3
                r2 = r0
            L15:
                if (r2 == 0) goto L5b
                int r3 = r14.q(r13)
                r4 = -1
                if (r3 == r4) goto L59
                if (r3 == 0) goto L52
                if (r3 == r0) goto L4b
                r4 = 2
                if (r3 == r4) goto L44
                r4 = 3
                if (r3 == r4) goto L3d
                r4 = 4
                if (r3 != r4) goto L37
                ps6 r3 = defpackage.ps6.a
                java.lang.Object r3 = r14.P(r13, r4, r3, r12)
                r12 = r3
                java.lang.String r12 = (java.lang.String) r12
                r6 = r6 | 16
                goto L15
            L37:
                lg7 r13 = new lg7
                r13.<init>(r3)
                throw r13
            L3d:
                long r10 = r14.c0(r13, r4)
                r6 = r6 | 8
                goto L15
            L44:
                int r9 = r14.H(r13, r4)
                r6 = r6 | 4
                goto L15
            L4b:
                int r8 = r14.H(r13, r0)
                r6 = r6 | 2
                goto L15
            L52:
                java.lang.String r7 = r14.A(r13, r1)
                r6 = r6 | 1
                goto L15
            L59:
                r2 = r1
                goto L15
            L5b:
                r14.a(r13)
                wa5 r5 = new wa5
                r5.<init>(r6, r7, r8, r9, r10, r12)
                return r5
        }

        @Override // defpackage.gg3
        public final void d(defpackage.x32 r5, java.lang.Object r6) {
                r4 = this;
                wa5 r6 = (defpackage.wa5) r6
                r6.getClass()
                wb6 r4 = defpackage.wa5.a.descriptor
                vx0 r5 = r5.c(r4)
                java.lang.String r0 = r6.a
                java.lang.String r1 = r6.e
                r2 = 0
                r5.Q(r4, r2, r0)
                r0 = 1
                int r2 = r6.b
                r5.O(r0, r2, r4)
                r0 = 2
                int r2 = r6.c
                r5.O(r0, r2, r4)
                r0 = 3
                long r2 = r6.d
                r5.n(r4, r0, r2)
                boolean r6 = r5.i(r4)
                if (r6 == 0) goto L2c
                goto L2e
            L2c:
                if (r1 == 0) goto L34
            L2e:
                ps6 r6 = defpackage.ps6.a
                r0 = 4
                r5.V(r4, r0, r6, r1)
            L34:
                r5.a(r4)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.wa5.a.descriptor
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: wa5$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final defpackage.gg3 serializer() {
                r0 = this;
                wa5$a r0 = defpackage.wa5.a.a
                return r0
        }
    }

    static {
            wa5$b r0 = new wa5$b
            r0.<init>()
            defpackage.wa5.Companion = r0
            return
    }

    public /* synthetic */ wa5(int r4, java.lang.String r5, int r6, int r7, long r8, java.lang.String r10) {
            r3 = this;
            r0 = r4 & 15
            r1 = 0
            r2 = 15
            if (r2 != r0) goto L1c
            r3.<init>()
            r3.a = r5
            r3.b = r6
            r3.c = r7
            r3.d = r8
            r4 = r4 & 16
            if (r4 != 0) goto L19
            r3.e = r1
            return
        L19:
            r3.e = r10
            return
        L1c:
            wa5$a r3 = defpackage.wa5.a.a
            wb6 r3 = r3.e()
            defpackage.ii2.S(r4, r2, r3)
            throw r1
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.wa5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wa5 r8 = (defpackage.wa5) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r7.b
            int r3 = r8.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r7.c
            int r3 = r8.c
            if (r1 == r3) goto L25
            return r2
        L25:
            long r3 = r7.d
            long r5 = r8.d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L2e
            return r2
        L2e:
            java.lang.String r7 = r7.e
            java.lang.String r8 = r8.e
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L39
            return r2
        L39:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r4.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            long r2 = r4.d
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.lang.String r4 = r4.e
            if (r4 != 0) goto L21
            r4 = 0
            goto L25
        L21:
            int r4 = r4.hashCode()
        L25:
            int r0 = r0 + r4
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RALeaderboardEntryDto(user="
            r0.<init>(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", rank="
            r0.append(r1)
            int r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", score="
            r0.append(r1)
            int r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", dateSubmitted="
            r0.append(r1)
            long r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", avatarUrl="
            r0.append(r1)
            java.lang.String r3 = r3.e
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
