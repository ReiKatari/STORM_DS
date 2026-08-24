package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gk3  reason: default package */
/* loaded from: classes.dex */
public final class gk3 {
    @defpackage.gc6("id")
    private final java.lang.String a;
    @defpackage.gc6("name")
    private final java.lang.String b;
    @defpackage.gc6("type")
    private final java.lang.String c;
    @defpackage.gc6("orientation")
    private final java.lang.String d;
    @defpackage.gc6("useCustomOpacity")
    private final boolean e;
    @defpackage.gc6("opacity")
    private final int f;
    @defpackage.gc6("layoutVariants")
    private final java.util.List<defpackage.gk3.b> g;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: gk3$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static defpackage.gk3 a(defpackage.fk3 r24) {
                r0 = r24
                r0.getClass()
                java.util.UUID r1 = r0.a
                if (r1 == 0) goto Lf
                java.lang.String r1 = r1.toString()
                r4 = r1
                goto L10
            Lf:
                r4 = 0
            L10:
                java.lang.String r5 = r0.b
                dk3 r1 = r0.c
                java.lang.String r6 = r1.name()
                ck3 r1 = r0.d
                java.lang.String r7 = r1.name()
                boolean r8 = r0.e
                int r9 = r0.f
                java.util.Map r0 = r0.g
                java.util.ArrayList r10 = new java.util.ArrayList
                int r1 = r0.size()
                r10.<init>(r1)
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L35:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L14b
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                gk3$b r3 = new gk3$b
                java.lang.Object r11 = r1.getKey()
                jf7 r11 = (defpackage.jf7) r11
                r11.getClass()
                my4 r12 = r11.a
                r12.getClass()
                ny4 r14 = new ny4
                int r13 = r12.a
                int r12 = r12.b
                r14.<init>(r13, r12)
                d83 r12 = r11.b
                r12.getClass()
                i83 r15 = new i83
                int r13 = r12.a
                int r2 = r12.b
                r24 = r0
                int r0 = r12.c
                int r12 = r12.d
                r15.<init>(r13, r2, r0, r12)
                ko4 r0 = r11.c
                java.lang.String r16 = r0.name()
                java.util.List r0 = r11.d
                java.util.ArrayList r2 = new java.util.ArrayList
                r12 = 10
                int r12 = defpackage.ht0.v0(r0, r12)
                r2.<init>(r12)
                java.util.Iterator r0 = r0.iterator()
            L85:
                boolean r12 = r0.hasNext()
                if (r12 == 0) goto Ld8
                java.lang.Object r12 = r0.next()
                x66 r12 = (defpackage.x66) r12
                r12.getClass()
                y66 r13 = new y66
                r17 = r0
                ko4 r0 = r12.a
                java.lang.String r0 = r0.name()
                r19 = r1
                w66 r1 = r12.b
                java.lang.String r1 = r1.name()
                me.magnum.melonds.domain.model.Rect r12 = r12.c
                r20 = r4
                pf5 r4 = new pf5
                r21 = r5
                int r5 = r12.getX()
                r22 = r6
                int r6 = r12.getY()
                r23 = r7
                int r7 = r12.getWidth()
                int r12 = r12.getHeight()
                r4.<init>(r5, r6, r7, r12)
                r13.<init>(r0, r1, r4)
                r2.add(r13)
                r0 = r17
                r1 = r19
                r4 = r20
                r5 = r21
                r6 = r22
                r7 = r23
                goto L85
            Ld8:
                r19 = r1
                r20 = r4
                r21 = r5
                r22 = r6
                r23 = r7
                ok3 r0 = r11.e
                mk3 r1 = r0.a
                r1.getClass()
                nk3 r4 = new nk3
                int r5 = r1.a
                lk3 r6 = r1.b
                java.lang.String r6 = r6.name()
                int r7 = r1.c
                int r1 = r1.d
                r4.<init>(r5, r7, r1, r6)
                mk3 r0 = r0.b
                if (r0 == 0) goto L110
                nk3 r1 = new nk3
                int r5 = r0.a
                lk3 r6 = r0.b
                java.lang.String r6 = r6.name()
                int r7 = r0.c
                int r0 = r0.d
                r1.<init>(r5, r7, r0, r6)
                goto L111
            L110:
                r1 = 0
            L111:
                pk3 r0 = new pk3
                r0.<init>(r4, r1)
                kf7 r13 = new kf7
                r18 = r0
                r17 = r2
                r13.<init>(r14, r15, r16, r17, r18)
                java.lang.Object r0 = r19.getValue()
                ff7 r0 = (defpackage.ff7) r0
                r0.getClass()
                gf7 r1 = new gf7
                z66 r2 = r0.a
                b76 r2 = defpackage.b76.a.a(r2)
                z66 r0 = r0.b
                b76 r0 = defpackage.b76.a.a(r0)
                r1.<init>(r2, r0)
                r3.<init>(r13, r1)
                r10.add(r3)
                r0 = r24
                r4 = r20
                r5 = r21
                r6 = r22
                r7 = r23
                goto L35
            L14b:
                r20 = r4
                r21 = r5
                r22 = r6
                r23 = r7
                gk3 r3 = new gk3
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return r3
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: gk3$b */
    /* loaded from: classes.dex */
    public static final class b {
        @defpackage.gc6("variant")
        private final defpackage.kf7 a;
        @defpackage.gc6("layout")
        private final defpackage.gf7 b;

        public b(defpackage.kf7 r1, defpackage.gf7 r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public final defpackage.gf7 a() {
                r0 = this;
                gf7 r0 = r0.b
                return r0
        }

        public final defpackage.kf7 b() {
                r0 = this;
                kf7 r0 = r0.a
                return r0
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof defpackage.gk3.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                gk3$b r5 = (defpackage.gk3.b) r5
                kf7 r1 = r4.a
                kf7 r3 = r5.a
                boolean r1 = defpackage.nb3.k(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                gf7 r4 = r4.b
                gf7 r5 = r5.b
                boolean r4 = defpackage.nb3.k(r4, r5)
                if (r4 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final int hashCode() {
                r1 = this;
                kf7 r0 = r1.a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                gf7 r1 = r1.b
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r3 = this;
                kf7 r0 = r3.a
                gf7 r3 = r3.b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "LayoutEntryDto(variant="
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = ", layout="
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = ")"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                return r3
        }
    }

    public gk3(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5, int r6, java.util.ArrayList r7) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    public final defpackage.fk3 a() {
            r9 = this;
            java.lang.String r0 = r9.a
            if (r0 == 0) goto La
            java.util.UUID r0 = java.util.UUID.fromString(r0)
        L8:
            r2 = r0
            goto Lc
        La:
            r0 = 0
            goto L8
        Lc:
            java.lang.String r3 = r9.b
            java.lang.String r0 = r9.c
            dk3[] r1 = defpackage.dk3.values()
            java.lang.Enum r0 = defpackage.jw2.o(r0, r1)
            r4 = r0
            dk3 r4 = (defpackage.dk3) r4
            java.lang.String r0 = r9.d
            ck3[] r1 = defpackage.ck3.values()
            java.lang.Enum r0 = defpackage.jw2.o(r0, r1)
            r5 = r0
            ck3 r5 = (defpackage.ck3) r5
            boolean r6 = r9.e
            int r7 = r9.f
            java.util.List<gk3$b> r9 = r9.g
            r0 = 10
            int r0 = defpackage.ht0.v0(r9, r0)
            int r0 = defpackage.c14.k0(r0)
            r1 = 16
            if (r0 >= r1) goto L3d
            r0 = r1
        L3d:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r0)
            java.util.Iterator r9 = r9.iterator()
        L46:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r9.next()
            gk3$b r0 = (defpackage.gk3.b) r0
            kf7 r1 = r0.b()
            jf7 r1 = r1.a()
            gf7 r0 = r0.a()
            ff7 r0 = r0.a()
            r8.put(r1, r0)
            goto L46
        L66:
            fk3 r1 = new fk3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.gk3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gk3 r5 = (defpackage.gk3) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.d
            java.lang.String r3 = r5.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L3f
            return r2
        L3f:
            int r1 = r4.f
            int r3 = r5.f
            if (r1 == r3) goto L46
            return r2
        L46:
            java.util.List<gk3$b> r4 = r4.g
            java.util.List<gk3$b> r5 = r5.g
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L51
            return r2
        L51:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            r2 = 31
            int r0 = r0 * r2
            java.lang.String r3 = r4.b
            if (r3 != 0) goto L13
            goto L17
        L13:
            int r1 = r3.hashCode()
        L17:
            int r0 = r0 + r1
            int r0 = r0 * r2
            java.lang.String r1 = r4.c
            int r0 = defpackage.xg6.d(r0, r2, r1)
            java.lang.String r1 = r4.d
            int r0 = defpackage.xg6.d(r0, r2, r1)
            boolean r1 = r4.e
            int r0 = defpackage.xg6.e(r0, r1, r2)
            int r1 = r4.f
            int r0 = defpackage.lb1.a(r1, r0, r2)
            java.util.List<gk3$b> r4 = r4.g
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r9 = this;
            java.lang.String r0 = r9.a
            java.lang.String r1 = r9.b
            java.lang.String r2 = r9.c
            java.lang.String r3 = r9.d
            boolean r4 = r9.e
            int r5 = r9.f
            java.util.List<gk3$b> r9 = r9.g
            java.lang.String r6 = ", name="
            java.lang.String r7 = ", type="
            java.lang.String r8 = "LayoutConfigurationDto(id="
            java.lang.StringBuilder r0 = defpackage.i61.u(r8, r0, r6, r1, r7)
            java.lang.String r1 = ", orientation="
            java.lang.String r6 = ", useCustomOpacity="
            defpackage.i61.B(r0, r2, r1, r3, r6)
            r0.append(r4)
            java.lang.String r1 = ", opacity="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", layoutVariants="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = ")"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
    }
}
