package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b76  reason: default package */
/* loaded from: classes.dex */
public final class b76 {
    @defpackage.gc6("backgroundId")
    private final java.lang.String a;
    @defpackage.gc6("backgroundMode")
    private final java.lang.String b;
    @defpackage.gc6("components")
    private final java.util.List<defpackage.k05> c;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: b76$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static defpackage.b76 a(defpackage.z66 r10) {
                r10.getClass()
                java.util.UUID r0 = r10.a
                r1 = 0
                if (r0 == 0) goto Ld
                java.lang.String r0 = r0.toString()
                goto Le
            Ld:
                r0 = r1
            Le:
                me.magnum.melonds.domain.model.layout.BackgroundMode r2 = r10.b
                java.lang.String r2 = r2.name()
                java.util.List r10 = r10.c
                if (r10 == 0) goto L6b
                java.util.ArrayList r1 = new java.util.ArrayList
                r3 = 10
                int r3 = defpackage.ht0.v0(r10, r3)
                r1.<init>(r3)
                java.util.Iterator r10 = r10.iterator()
            L27:
                boolean r3 = r10.hasNext()
                if (r3 == 0) goto L6b
                java.lang.Object r3 = r10.next()
                j05 r3 = (defpackage.j05) r3
                r3.getClass()
                k05 r4 = new k05
                me.magnum.melonds.domain.model.Rect r5 = r3.a
                r5.getClass()
                pf5 r6 = new pf5
                int r7 = r5.getX()
                int r8 = r5.getY()
                int r9 = r5.getWidth()
                int r5 = r5.getHeight()
                r6.<init>(r7, r8, r9, r5)
                nj3 r5 = r3.b
                java.lang.String r5 = r5.name()
                float r7 = r3.c
                java.lang.Float r7 = java.lang.Float.valueOf(r7)
                boolean r3 = r3.d
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r4.<init>(r6, r5, r7, r3)
                r1.add(r4)
                goto L27
            L6b:
                b76 r10 = new b76
                r10.<init>(r0, r2, r1)
                return r10
        }
    }

    public b76(java.lang.String r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final defpackage.z66 a() {
            r4 = this;
            java.lang.String r0 = r4.a
            r1 = 0
            if (r0 == 0) goto La
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            goto Lb
        La:
            r0 = r1
        Lb:
            java.lang.String r2 = r4.b
            me.magnum.melonds.domain.model.layout.BackgroundMode[] r3 = me.magnum.melonds.domain.model.layout.BackgroundMode.values()
            java.lang.Enum r2 = defpackage.jw2.o(r2, r3)
            me.magnum.melonds.domain.model.layout.BackgroundMode r2 = (me.magnum.melonds.domain.model.layout.BackgroundMode) r2
            java.util.List<k05> r4 = r4.c
            if (r4 == 0) goto L3e
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.ht0.v0(r4, r3)
            r1.<init>(r3)
            java.util.Iterator r4 = r4.iterator()
        L2a:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r4.next()
            k05 r3 = (defpackage.k05) r3
            j05 r3 = r3.a()
            r1.add(r3)
            goto L2a
        L3e:
            z66 r4 = new z66
            r4.<init>(r0, r2, r1)
            return r4
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.b76
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            b76 r5 = (defpackage.b76) r5
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
            java.util.List<k05> r4 = r4.c
            java.util.List<k05> r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
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
            int r0 = defpackage.xg6.d(r0, r2, r3)
            java.util.List<k05> r4 = r4.c
            if (r4 != 0) goto L19
            goto L1d
        L19:
            int r1 = r4.hashCode()
        L1d:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.a
            java.lang.String r1 = r5.b
            java.util.List<k05> r5 = r5.c
            java.lang.String r2 = ", backgroundMode="
            java.lang.String r3 = ", components="
            java.lang.String r4 = "ScreenLayoutDto(backgroundId="
            java.lang.StringBuilder r0 = defpackage.i61.u(r4, r0, r2, r1, r3)
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
