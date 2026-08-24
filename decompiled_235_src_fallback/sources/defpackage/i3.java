package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: i3  reason: default package */
/* loaded from: classes.dex */
public final class i3 {
    public static final defpackage.i3.b Companion = null;
    public final long a;
    public final java.lang.Integer b;
    public final java.lang.Integer c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final int f;
    public final int g;
    public final java.lang.String h;
    public final java.lang.String i;
    public final java.lang.String j;
    public final java.lang.String k;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.di1
    /* renamed from: i3$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements defpackage.qr2 {
        public static final defpackage.i3.a a = null;
        private static final defpackage.wb6 descriptor = null;

        static {
                i3$a r0 = new i3$a
                r0.<init>()
                defpackage.i3.a.a = r0
                ly4 r1 = new ly4
                java.lang.String r2 = "me.magnum.rcheevosapi.dto.AchievementDto"
                r3 = 11
                r1.<init>(r2, r0, r3)
                java.lang.String r0 = "ID"
                r2 = 0
                r1.l(r0, r2)
                java.lang.String r0 = "NumAwarded"
                r1.l(r0, r2)
                java.lang.String r0 = "NumAwardedHardcore"
                r1.l(r0, r2)
                java.lang.String r0 = "Title"
                r1.l(r0, r2)
                java.lang.String r0 = "Description"
                r1.l(r0, r2)
                java.lang.String r0 = "Points"
                r1.l(r0, r2)
                java.lang.String r0 = "Flags"
                r1.l(r0, r2)
                java.lang.String r0 = "BadgeURL"
                r1.l(r0, r2)
                java.lang.String r0 = "BadgeLockedURL"
                r1.l(r0, r2)
                java.lang.String r0 = "DisplayOrder"
                r1.l(r0, r2)
                java.lang.String r0 = "MemAddr"
                r1.l(r0, r2)
                defpackage.i3.a.descriptor = r1
                return
        }

        @Override // defpackage.qr2
        public final defpackage.gg3[] b() {
                r7 = this;
                o93 r7 = defpackage.o93.a
                gg3 r0 = defpackage.q60.I(r7)
                gg3 r1 = defpackage.q60.I(r7)
                ps6 r2 = defpackage.ps6.a
                gg3 r3 = defpackage.q60.I(r2)
                r4 = 11
                gg3[] r4 = new defpackage.gg3[r4]
                fz3 r5 = defpackage.fz3.a
                r6 = 0
                r4[r6] = r5
                r5 = 1
                r4[r5] = r0
                r0 = 2
                r4[r0] = r1
                r0 = 3
                r4[r0] = r2
                r0 = 4
                r4[r0] = r2
                r0 = 5
                r4[r0] = r7
                r0 = 6
                r4[r0] = r7
                r7 = 7
                r4[r7] = r2
                r7 = 8
                r4[r7] = r2
                r7 = 9
                r4[r7] = r3
                r7 = 10
                r4[r7] = r2
                return r4
        }

        @Override // defpackage.gg3
        public final java.lang.Object c(defpackage.sc1 r22) {
                r21 = this;
                wb6 r0 = defpackage.i3.a.descriptor
                r1 = r22
                ux0 r1 = r1.c(r0)
                r1.getClass()
                r2 = 1
                r3 = 0
                r4 = 0
                r6 = 0
                r8 = r3
                r15 = r8
                r16 = r15
                r9 = r4
                r11 = r6
                r12 = r11
                r13 = r12
                r14 = r13
                r17 = r14
                r18 = r17
                r20 = r18
                r4 = r2
            L20:
                if (r4 == 0) goto L99
                int r5 = r1.q(r0)
                switch(r5) {
                    case -1: goto L97;
                    case 0: goto L90;
                    case 1: goto L84;
                    case 2: goto L77;
                    case 3: goto L6f;
                    case 4: goto L67;
                    case 5: goto L5f;
                    case 6: goto L57;
                    case 7: goto L4f;
                    case 8: goto L46;
                    case 9: goto L38;
                    case 10: goto L2f;
                    default: goto L29;
                }
            L29:
                lg7 r0 = new lg7
                r0.<init>(r5)
                throw r0
            L2f:
                r5 = 10
                java.lang.String r20 = r1.A(r0, r5)
                r8 = r8 | 1024(0x400, float:1.435E-42)
                goto L20
            L38:
                r5 = 9
                ps6 r7 = defpackage.ps6.a
                java.lang.Object r5 = r1.P(r0, r5, r7, r6)
                r6 = r5
                java.lang.String r6 = (java.lang.String) r6
                r8 = r8 | 512(0x200, float:7.17E-43)
                goto L20
            L46:
                r5 = 8
                java.lang.String r18 = r1.A(r0, r5)
                r8 = r8 | 256(0x100, float:3.59E-43)
                goto L20
            L4f:
                r5 = 7
                java.lang.String r17 = r1.A(r0, r5)
                r8 = r8 | 128(0x80, float:1.8E-43)
                goto L20
            L57:
                r5 = 6
                int r16 = r1.H(r0, r5)
                r8 = r8 | 64
                goto L20
            L5f:
                r5 = 5
                int r15 = r1.H(r0, r5)
                r8 = r8 | 32
                goto L20
            L67:
                r5 = 4
                java.lang.String r14 = r1.A(r0, r5)
                r8 = r8 | 16
                goto L20
            L6f:
                r5 = 3
                java.lang.String r13 = r1.A(r0, r5)
                r8 = r8 | 8
                goto L20
            L77:
                o93 r5 = defpackage.o93.a
                r7 = 2
                java.lang.Object r5 = r1.P(r0, r7, r5, r12)
                r12 = r5
                java.lang.Integer r12 = (java.lang.Integer) r12
                r8 = r8 | 4
                goto L20
            L84:
                o93 r5 = defpackage.o93.a
                java.lang.Object r5 = r1.P(r0, r2, r5, r11)
                r11 = r5
                java.lang.Integer r11 = (java.lang.Integer) r11
                r8 = r8 | 2
                goto L20
            L90:
                long r9 = r1.c0(r0, r3)
                r8 = r8 | 1
                goto L20
            L97:
                r4 = r3
                goto L20
            L99:
                r1.a(r0)
                i3 r7 = new i3
                r19 = r6
                r7.<init>(r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return r7
        }

        @Override // defpackage.gg3
        public final void d(defpackage.x32 r4, java.lang.Object r5) {
                r3 = this;
                i3 r5 = (defpackage.i3) r5
                r5.getClass()
                wb6 r3 = defpackage.i3.a.descriptor
                vx0 r4 = r4.c(r3)
                r0 = 0
                long r1 = r5.a
                r4.n(r3, r0, r1)
                o93 r0 = defpackage.o93.a
                java.lang.Integer r1 = r5.b
                r2 = 1
                r4.V(r3, r2, r0, r1)
                r1 = 2
                java.lang.Integer r2 = r5.c
                r4.V(r3, r1, r0, r2)
                r0 = 3
                java.lang.String r1 = r5.d
                r4.Q(r3, r0, r1)
                r0 = 4
                java.lang.String r1 = r5.e
                r4.Q(r3, r0, r1)
                r0 = 5
                int r1 = r5.f
                r4.O(r0, r1, r3)
                r0 = 6
                int r1 = r5.g
                r4.O(r0, r1, r3)
                r0 = 7
                java.lang.String r1 = r5.h
                r4.Q(r3, r0, r1)
                r0 = 8
                java.lang.String r1 = r5.i
                r4.Q(r3, r0, r1)
                ps6 r0 = defpackage.ps6.a
                java.lang.String r1 = r5.j
                r2 = 9
                r4.V(r3, r2, r0, r1)
                r0 = 10
                java.lang.String r5 = r5.k
                r4.Q(r3, r0, r5)
                r4.a(r3)
                return
        }

        @Override // defpackage.gg3
        public final defpackage.wb6 e() {
                r0 = this;
                wb6 r0 = defpackage.i3.a.descriptor
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: i3$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final defpackage.gg3 serializer() {
                r0 = this;
                i3$a r0 = defpackage.i3.a.a
                return r0
        }
    }

    static {
            i3$b r0 = new i3$b
            r0.<init>()
            defpackage.i3.Companion = r0
            return
    }

    public /* synthetic */ i3(int r3, long r4, java.lang.Integer r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9, int r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            r2 = this;
            r0 = r3 & 2047(0x7ff, float:2.868E-42)
            r1 = 2047(0x7ff, float:2.868E-42)
            if (r1 != r0) goto L20
            r2.<init>()
            r2.a = r4
            r2.b = r6
            r2.c = r7
            r2.d = r8
            r2.e = r9
            r2.f = r10
            r2.g = r11
            r2.h = r12
            r2.i = r13
            r2.j = r14
            r2.k = r15
            return
        L20:
            i3$a r2 = defpackage.i3.a.a
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
            boolean r1 = r8 instanceof defpackage.i3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i3 r8 = (defpackage.i3) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.Integer r1 = r7.b
            java.lang.Integer r3 = r8.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            java.lang.Integer r1 = r7.c
            java.lang.Integer r3 = r8.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
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
            int r1 = r7.f
            int r3 = r8.f
            if (r1 == r3) goto L48
            return r2
        L48:
            int r1 = r7.g
            int r3 = r8.g
            if (r1 == r3) goto L4f
            return r2
        L4f:
            java.lang.String r1 = r7.h
            java.lang.String r3 = r8.h
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L5a
            return r2
        L5a:
            java.lang.String r1 = r7.i
            java.lang.String r3 = r8.i
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L65
            return r2
        L65:
            java.lang.String r1 = r7.j
            java.lang.String r3 = r8.j
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L70
            return r2
        L70:
            java.lang.String r7 = r7.k
            java.lang.String r8 = r8.k
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L7b
            return r2
        L7b:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.Integer r3 = r4.b
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.c
            if (r3 != 0) goto L1c
            r3 = r2
            goto L20
        L1c:
            int r3 = r3.hashCode()
        L20:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.d
            int r0 = defpackage.xg6.d(r0, r1, r3)
            java.lang.String r3 = r4.e
            int r0 = defpackage.xg6.d(r0, r1, r3)
            int r3 = r4.f
            int r0 = defpackage.lb1.a(r3, r0, r1)
            int r3 = r4.g
            int r0 = defpackage.lb1.a(r3, r0, r1)
            java.lang.String r3 = r4.h
            int r0 = defpackage.xg6.d(r0, r1, r3)
            java.lang.String r3 = r4.i
            int r0 = defpackage.xg6.d(r0, r1, r3)
            java.lang.String r3 = r4.j
            if (r3 != 0) goto L4b
            goto L4f
        L4b:
            int r2 = r3.hashCode()
        L4f:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r4 = r4.k
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AchievementDto(id="
            r0.<init>(r1)
            long r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", numAwarded="
            r0.append(r1)
            java.lang.Integer r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", numAwardedHardcore="
            r0.append(r1)
            java.lang.Integer r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", description="
            r0.append(r1)
            java.lang.String r1 = r5.e
            r0.append(r1)
            java.lang.String r1 = ", points="
            r0.append(r1)
            int r1 = r5.f
            r0.append(r1)
            java.lang.String r1 = ", flags="
            r0.append(r1)
            int r1 = r5.g
            r0.append(r1)
            java.lang.String r1 = ", badgeUrl="
            r0.append(r1)
            java.lang.String r1 = r5.h
            r0.append(r1)
            java.lang.String r1 = ", badgeUrlLocked="
            java.lang.String r2 = ", displayOrder="
            java.lang.String r3 = r5.i
            java.lang.String r4 = r5.j
            defpackage.i61.B(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", memoryAddress="
            r0.append(r1)
            java.lang.String r5 = r5.k
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
