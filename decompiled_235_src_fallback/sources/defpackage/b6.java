package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: b6  reason: default package */
/* loaded from: classes.dex */
public final class b6 {
    public static final defpackage.b6.b Companion = null;
    public static final defpackage.go3[] h = null;
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;
    public final long d;
    public final java.lang.String e;
    public final java.util.List f;
    public final java.util.List g;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: b6$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.b6.a a = null;
        private static final defpackage.wb6 descriptor = null;

        static {
                b6$a r0 = new b6$a
                r0.<init>()
                defpackage.b6.a.a = r0
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.rcheevosapi.dto.AchievementSetDto"
                r3 = 7
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "Title"
                r2 = 0
                r1.l(r0, r2)
                java.lang.String r0 = "Type"
                r1.l(r0, r2)
                java.lang.String r0 = "AchievementSetId"
                r1.l(r0, r2)
                java.lang.String r0 = "GameId"
                r1.l(r0, r2)
                java.lang.String r0 = "ImageIconUrl"
                r1.l(r0, r2)
                java.lang.String r0 = "Achievements"
                r1.l(r0, r2)
                java.lang.String r0 = "Leaderboards"
                r1.l(r0, r2)
                defpackage.b6.a.descriptor = r1
                return
        }

        @Override // defpackage.qr2
        public final defpackage.gg3[] b() {
                r4 = this;
                go3[] r4 = defpackage.b6.h
                r0 = 7
                gg3[] r0 = new defpackage.gg3[r0]
                ps6 r1 = defpackage.ps6.a
                gg3 r2 = defpackage.q60.I(r1)
                r3 = 0
                r0[r3] = r2
                r2 = 1
                r0[r2] = r1
                fz3 r2 = defpackage.fz3.a
                r3 = 2
                r0[r3] = r2
                r3 = 3
                r0[r3] = r2
                r2 = 4
                r0[r2] = r1
                r1 = 5
                r2 = r4[r1]
                java.lang.Object r2 = r2.getValue()
                r0[r1] = r2
                r1 = 6
                r4 = r4[r1]
                java.lang.Object r4 = r4.getValue()
                r0[r1] = r4
                return r0
        }

        @Override // defpackage.gg3
        public final java.lang.Object c(defpackage.sc1 r20) {
                r19 = this;
                wb6 r0 = defpackage.b6.a.descriptor
                r1 = r20
                ux0 r1 = r1.c(r0)
                go3[] r2 = defpackage.b6.h
                r1.getClass()
                r3 = 1
                r5 = 0
                r6 = 0
                r14 = r5
                r15 = r14
                r16 = r15
                r10 = r6
                r12 = r10
                r9 = 0
                r7 = r3
                r6 = r16
            L1b:
                if (r7 == 0) goto L81
                int r8 = r1.q(r0)
                switch(r8) {
                    case -1: goto L7e;
                    case 0: goto L71;
                    case 1: goto L6a;
                    case 2: goto L62;
                    case 3: goto L5a;
                    case 4: goto L52;
                    case 5: goto L3f;
                    case 6: goto L2a;
                    default: goto L24;
                }
            L24:
                lg7 r0 = new lg7
                r0.<init>(r8)
                throw r0
            L2a:
                r8 = 6
                r17 = r2[r8]
                java.lang.Object r17 = r17.getValue()
                r4 = r17
                gg3 r4 = (defpackage.gg3) r4
                java.lang.Object r4 = r1.G(r0, r8, r4, r6)
                r6 = r4
                java.util.List r6 = (java.util.List) r6
                r9 = r9 | 64
                goto L1b
            L3f:
                r4 = 5
                r8 = r2[r4]
                java.lang.Object r8 = r8.getValue()
                gg3 r8 = (defpackage.gg3) r8
                java.lang.Object r4 = r1.G(r0, r4, r8, r5)
                r5 = r4
                java.util.List r5 = (java.util.List) r5
                r9 = r9 | 32
                goto L1b
            L52:
                r4 = 4
                java.lang.String r16 = r1.A(r0, r4)
                r9 = r9 | 16
                goto L1b
            L5a:
                r4 = 3
                long r12 = r1.c0(r0, r4)
                r9 = r9 | 8
                goto L1b
            L62:
                r4 = 2
                long r10 = r1.c0(r0, r4)
                r9 = r9 | 4
                goto L1b
            L6a:
                java.lang.String r15 = r1.A(r0, r3)
                r9 = r9 | 2
                goto L1b
            L71:
                ps6 r4 = defpackage.ps6.a
                r8 = 0
                java.lang.Object r4 = r1.P(r0, r8, r4, r14)
                r14 = r4
                java.lang.String r14 = (java.lang.String) r14
                r9 = r9 | 1
                goto L1b
            L7e:
                r8 = 0
                r7 = r8
                goto L1b
            L81:
                r1.a(r0)
                b6 r8 = new b6
                r17 = r5
                r18 = r6
                r8.<init>(r9, r10, r12, r14, r15, r16, r17, r18)
                return r8
        }

        @Override // defpackage.gg3
        public final void d(defpackage.x32 r5, java.lang.Object r6) {
                r4 = this;
                b6 r6 = (defpackage.b6) r6
                r6.getClass()
                wb6 r4 = defpackage.b6.a.descriptor
                vx0 r5 = r5.c(r4)
                go3[] r0 = defpackage.b6.h
                ps6 r1 = defpackage.ps6.a
                java.lang.String r2 = r6.a
                r3 = 0
                r5.V(r4, r3, r1, r2)
                r1 = 1
                java.lang.String r2 = r6.b
                r5.Q(r4, r1, r2)
                r1 = 2
                long r2 = r6.c
                r5.n(r4, r1, r2)
                r1 = 3
                long r2 = r6.d
                r5.n(r4, r1, r2)
                r1 = 4
                java.lang.String r2 = r6.e
                r5.Q(r4, r1, r2)
                r1 = 5
                r2 = r0[r1]
                java.lang.Object r2 = r2.getValue()
                gg3 r2 = (defpackage.gg3) r2
                java.util.List r3 = r6.f
                r5.w(r4, r1, r2, r3)
                r1 = 6
                r0 = r0[r1]
                java.lang.Object r0 = r0.getValue()
                gg3 r0 = (defpackage.gg3) r0
                java.util.List r6 = r6.g
                r5.w(r4, r1, r0, r6)
                r5.a(r4)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.b6.a.descriptor
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: b6$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final defpackage.gg3 serializer() {
                r0 = this;
                b6$a r0 = defpackage.b6.a.a
                return r0
        }
    }

    static {
            b6$b r0 = new b6$b
            r0.<init>()
            defpackage.b6.Companion = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            c5 r1 = new c5
            r2 = 3
            r1.<init>(r2)
            go3 r1 = defpackage.kj2.M(r0, r1)
            c5 r3 = new c5
            r4 = 4
            r3.<init>(r4)
            go3 r0 = defpackage.kj2.M(r0, r3)
            r3 = 7
            go3[] r3 = new defpackage.go3[r3]
            r5 = 0
            r6 = 0
            r3[r5] = r6
            r5 = 1
            r3[r5] = r6
            r5 = 2
            r3[r5] = r6
            r3[r2] = r6
            r3[r4] = r6
            r2 = 5
            r3[r2] = r1
            r1 = 6
            r3[r1] = r0
            defpackage.b6.h = r3
            return
    }

    public /* synthetic */ b6(int r3, long r4, long r6, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.List r11, java.util.List r12) {
            r2 = this;
            r0 = r3 & 127(0x7f, float:1.78E-43)
            r1 = 127(0x7f, float:1.78E-43)
            if (r1 != r0) goto L18
            r2.<init>()
            r2.a = r8
            r2.b = r9
            r2.c = r4
            r2.d = r6
            r2.e = r10
            r2.f = r11
            r2.g = r12
            return
        L18:
            b6$a r2 = defpackage.b6.a.a
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
            boolean r1 = r8 instanceof defpackage.b6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            b6 r8 = (defpackage.b6) r8
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
            long r5 = r8.d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L34
            return r2
        L34:
            java.lang.String r1 = r7.e
            java.lang.String r3 = r8.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.util.List r1 = r7.f
            java.util.List r3 = r8.f
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            java.util.List r7 = r7.g
            java.util.List r8 = r8.g
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L55
            return r2
        L55:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.d
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.lang.String r2 = r4.e
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.util.List r2 = r4.f
            int r0 = defpackage.i61.b(r0, r2, r1)
            java.util.List r4 = r4.g
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", type="
            java.lang.String r1 = ", setId="
            java.lang.String r2 = "AchievementSetDto(title="
            java.lang.String r3 = r5.a
            java.lang.String r4 = r5.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r2, r3, r0, r4, r1)
            long r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", gameId="
            java.lang.String r2 = ", iconUrl="
            long r3 = r5.d
            defpackage.xg6.B(r0, r1, r3, r2)
            java.lang.String r1 = r5.e
            r0.append(r1)
            java.lang.String r1 = ", achievements="
            r0.append(r1)
            java.util.List r1 = r5.f
            r0.append(r1)
            java.lang.String r1 = ", leaderboards="
            r0.append(r1)
            java.util.List r5 = r5.g
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
