package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k05  reason: default package */
/* loaded from: classes.dex */
public final class k05 {
    @defpackage.gc6("rect")
    private final defpackage.pf5 a;
    @defpackage.gc6("component")
    private final java.lang.String b;
    @defpackage.gc6("alpha")
    private final java.lang.Float c;
    @defpackage.gc6("onTop")
    private final java.lang.Boolean d;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: k05$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public k05(defpackage.pf5 r1, java.lang.String r2, java.lang.Float r3, java.lang.Boolean r4) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final defpackage.j05 a() {
            r4 = this;
            j05 r0 = new j05
            pf5 r1 = r4.a
            me.magnum.melonds.domain.model.Rect r1 = r1.a()
            java.lang.String r2 = r4.b
            nj3[] r3 = defpackage.nj3.values()
            java.lang.Enum r2 = defpackage.jw2.o(r2, r3)
            nj3 r2 = (defpackage.nj3) r2
            java.lang.Float r3 = r4.c
            if (r3 == 0) goto L1d
            float r3 = r3.floatValue()
            goto L1f
        L1d:
            r3 = 1065353216(0x3f800000, float:1.0)
        L1f:
            java.lang.Boolean r4 = r4.d
            if (r4 == 0) goto L28
            boolean r4 = r4.booleanValue()
            goto L29
        L28:
            r4 = 0
        L29:
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.k05
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k05 r5 = (defpackage.k05) r5
            pf5 r1 = r4.a
            pf5 r3 = r5.a
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
            java.lang.Float r1 = r4.c
            java.lang.Float r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Boolean r4 = r4.d
            java.lang.Boolean r5 = r5.d
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            pf5 r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.Float r2 = r4.c
            r3 = 0
            if (r2 != 0) goto L16
            r2 = r3
            goto L1a
        L16:
            int r2 = r2.hashCode()
        L1a:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.Boolean r4 = r4.d
            if (r4 != 0) goto L21
            goto L25
        L21:
            int r3 = r4.hashCode()
        L25:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            pf5 r0 = r5.a
            java.lang.String r1 = r5.b
            java.lang.Float r2 = r5.c
            java.lang.Boolean r5 = r5.d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "PositionedLayoutComponentDto(rect="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", component="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ", alpha="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ", onTop="
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = ")"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            return r5
    }
}
