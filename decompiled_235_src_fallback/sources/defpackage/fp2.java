package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: fp2  reason: default package */
/* loaded from: classes.dex */
public final class fp2 {
    public static final defpackage.fp2.b Companion = null;
    public static final defpackage.go3[] g = null;
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.Long d;
    public final java.lang.String e;
    public final java.util.List f;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: fp2$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.fp2.a a = null;
        private static final defpackage.wb6 descriptor = null;

        static {
                fp2$a r0 = new fp2$a
                r0.<init>()
                defpackage.fp2.a.a = r0
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.rcheevosapi.dto.GameAchievementSetsDto"
                r3 = 6
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "GameId"
                r2 = 0
                r1.l(r0, r2)
                java.lang.String r0 = "Title"
                r1.l(r0, r2)
                java.lang.String r0 = "ImageIconUrl"
                r1.l(r0, r2)
                java.lang.String r0 = "RichPresenceGameId"
                r1.l(r0, r2)
                java.lang.String r0 = "RichPresencePatch"
                r1.l(r0, r2)
                java.lang.String r0 = "Sets"
                r1.l(r0, r2)
                defpackage.fp2.a.descriptor = r1
                return
        }

        @Override // defpackage.qr2
        public final defpackage.gg3[] b() {
                r7 = this;
                go3[] r7 = defpackage.fp2.g
                fz3 r0 = defpackage.fz3.a
                ps6 r1 = defpackage.ps6.a
                gg3 r2 = defpackage.q60.I(r0)
                gg3 r3 = defpackage.q60.I(r1)
                r4 = 5
                r7 = r7[r4]
                java.lang.Object r7 = r7.getValue()
                gg3 r7 = (defpackage.gg3) r7
                gg3 r7 = defpackage.q60.I(r7)
                r5 = 6
                gg3[] r5 = new defpackage.gg3[r5]
                r6 = 0
                r5[r6] = r0
                r0 = 1
                r5[r0] = r1
                r0 = 2
                r5[r0] = r1
                r0 = 3
                r5[r0] = r2
                r0 = 4
                r5[r0] = r3
                r5[r4] = r7
                return r5
        }

        @Override // defpackage.gg3
        public final java.lang.Object c(defpackage.sc1 r18) {
                r17 = this;
                wb6 r0 = defpackage.fp2.a.descriptor
                r1 = r18
                ux0 r1 = r1.c(r0)
                go3[] r2 = defpackage.fp2.g
                r1.getClass()
                r3 = 1
                r4 = 0
                r5 = 0
                r7 = 0
                r9 = r4
                r10 = r5
                r12 = r7
                r13 = r12
                r14 = r13
                r15 = r14
                r5 = r3
            L19:
                if (r5 == 0) goto L6d
                int r6 = r1.q(r0)
                switch(r6) {
                    case -1: goto L6b;
                    case 0: goto L64;
                    case 1: goto L5d;
                    case 2: goto L55;
                    case 3: goto L48;
                    case 4: goto L3b;
                    case 5: goto L28;
                    default: goto L22;
                }
            L22:
                lg7 r0 = new lg7
                r0.<init>(r6)
                throw r0
            L28:
                r6 = 5
                r8 = r2[r6]
                java.lang.Object r8 = r8.getValue()
                gg3 r8 = (defpackage.gg3) r8
                java.lang.Object r6 = r1.P(r0, r6, r8, r7)
                r7 = r6
                java.util.List r7 = (java.util.List) r7
                r9 = r9 | 32
                goto L19
            L3b:
                ps6 r6 = defpackage.ps6.a
                r8 = 4
                java.lang.Object r6 = r1.P(r0, r8, r6, r15)
                r15 = r6
                java.lang.String r15 = (java.lang.String) r15
                r9 = r9 | 16
                goto L19
            L48:
                r6 = 3
                fz3 r8 = defpackage.fz3.a
                java.lang.Object r6 = r1.P(r0, r6, r8, r14)
                r14 = r6
                java.lang.Long r14 = (java.lang.Long) r14
                r9 = r9 | 8
                goto L19
            L55:
                r6 = 2
                java.lang.String r13 = r1.A(r0, r6)
                r9 = r9 | 4
                goto L19
            L5d:
                java.lang.String r12 = r1.A(r0, r3)
                r9 = r9 | 2
                goto L19
            L64:
                long r10 = r1.c0(r0, r4)
                r9 = r9 | 1
                goto L19
            L6b:
                r5 = r4
                goto L19
            L6d:
                r1.a(r0)
                fp2 r8 = new fp2
                r16 = r7
                r8.<init>(r9, r10, r12, r13, r14, r15, r16)
                return r8
        }

        @Override // defpackage.gg3
        public final void d(defpackage.x32 r5, java.lang.Object r6) {
                r4 = this;
                fp2 r6 = (defpackage.fp2) r6
                r6.getClass()
                wb6 r4 = defpackage.fp2.a.descriptor
                vx0 r5 = r5.c(r4)
                go3[] r0 = defpackage.fp2.g
                r1 = 0
                long r2 = r6.a
                r5.n(r4, r1, r2)
                r1 = 1
                java.lang.String r2 = r6.b
                r5.Q(r4, r1, r2)
                r1 = 2
                java.lang.String r2 = r6.c
                r5.Q(r4, r1, r2)
                fz3 r1 = defpackage.fz3.a
                java.lang.Long r2 = r6.d
                r3 = 3
                r5.V(r4, r3, r1, r2)
                ps6 r1 = defpackage.ps6.a
                java.lang.String r2 = r6.e
                r3 = 4
                r5.V(r4, r3, r1, r2)
                r1 = 5
                r0 = r0[r1]
                java.lang.Object r0 = r0.getValue()
                gg3 r0 = (defpackage.gg3) r0
                java.util.List r6 = r6.f
                r5.V(r4, r1, r0, r6)
                r5.a(r4)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.fp2.a.descriptor
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: fp2$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final defpackage.gg3 serializer() {
                r0 = this;
                fp2$a r0 = defpackage.fp2.a.a
                return r0
        }
    }

    static {
            fp2$b r0 = new fp2$b
            r0.<init>()
            defpackage.fp2.Companion = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            ns1 r1 = new ns1
            r2 = 5
            r1.<init>(r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            r1 = 6
            go3[] r1 = new defpackage.go3[r1]
            r3 = 0
            r4 = 0
            r1[r3] = r4
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r4
            r3 = 3
            r1[r3] = r4
            r3 = 4
            r1[r3] = r4
            r1[r2] = r0
            defpackage.fp2.g = r1
            return
    }

    public /* synthetic */ fp2(int r3, long r4, java.lang.String r6, java.lang.String r7, java.lang.Long r8, java.lang.String r9, java.util.List r10) {
            r2 = this;
            r0 = r3 & 63
            r1 = 63
            if (r1 != r0) goto L16
            r2.<init>()
            r2.a = r4
            r2.b = r6
            r2.c = r7
            r2.d = r8
            r2.e = r9
            r2.f = r10
            return
        L16:
            fp2$a r2 = defpackage.fp2.a.a
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
            boolean r1 = r8 instanceof defpackage.fp2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fp2 r8 = (defpackage.fp2) r8
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
            java.lang.Long r1 = r7.d
            java.lang.Long r3 = r8.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L36
            return r2
        L36:
            java.lang.String r1 = r7.e
            java.lang.String r3 = r8.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L41
            return r2
        L41:
            java.util.List r7 = r7.f
            java.util.List r8 = r8.f
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L4c
            return r2
        L4c:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            r2 = 0
            java.lang.Long r3 = r4.d
            if (r3 != 0) goto L1c
            r3 = r2
            goto L20
        L1c:
            int r3 = r3.hashCode()
        L20:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.e
            if (r3 != 0) goto L28
            r3 = r2
            goto L2c
        L28:
            int r3 = r3.hashCode()
        L2c:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.util.List r4 = r4.f
            if (r4 != 0) goto L33
            goto L37
        L33:
            int r2 = r4.hashCode()
        L37:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GameAchievementSetsDto(id="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", iconUrl="
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", richPresenceGameId="
            r0.append(r1)
            java.lang.Long r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", richPresencePatch="
            r0.append(r1)
            java.lang.String r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", sets="
            r0.append(r1)
            java.util.List r3 = r3.f
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
