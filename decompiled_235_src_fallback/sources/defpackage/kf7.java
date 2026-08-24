package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kf7  reason: default package */
/* loaded from: classes.dex */
public final class kf7 {
    @defpackage.gc6("uiSize")
    private final defpackage.ny4 a;
    @defpackage.gc6("insets")
    private final defpackage.i83 b;
    @defpackage.gc6("orientation")
    private final java.lang.String c;
    @defpackage.gc6("folds")
    private final java.util.List<defpackage.y66> d;
    @defpackage.gc6("displays")
    private final defpackage.pk3 e;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: kf7$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public kf7(defpackage.ny4 r1, defpackage.i83 r2, java.lang.String r3, java.util.ArrayList r4, defpackage.pk3 r5) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final defpackage.jf7 a() {
            r10 = this;
            ny4 r0 = r10.a
            my4 r2 = r0.a()
            i83 r0 = r10.b
            d83 r3 = r0.a()
            java.lang.String r0 = r10.c
            ko4 r4 = defpackage.ko4.valueOf(r0)
            java.util.List<y66> r0 = r10.d
            java.util.ArrayList r5 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ht0.v0(r0, r1)
            r5.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            y66 r1 = (defpackage.y66) r1
            x66 r6 = new x66
            java.lang.String r7 = r1.a
            ko4[] r8 = defpackage.ko4.values()
            java.lang.Enum r7 = defpackage.jw2.o(r7, r8)
            ko4 r7 = (defpackage.ko4) r7
            java.lang.String r8 = r1.b
            w66[] r9 = defpackage.w66.values()
            java.lang.Enum r8 = defpackage.jw2.o(r8, r9)
            w66 r8 = (defpackage.w66) r8
            pf5 r1 = r1.c
            me.magnum.melonds.domain.model.Rect r1 = r1.a()
            r6.<init>(r7, r8, r1)
            r5.add(r6)
            goto L23
        L56:
            pk3 r10 = r10.e
            ok3 r6 = r10.a()
            jf7 r1 = new jf7
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.kf7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kf7 r5 = (defpackage.kf7) r5
            ny4 r1 = r4.a
            ny4 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            i83 r1 = r4.b
            i83 r3 = r5.b
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
            java.util.List<y66> r1 = r4.d
            java.util.List<y66> r3 = r5.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            pk3 r4 = r4.e
            pk3 r5 = r5.e
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            ny4 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            i83 r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.c
            int r0 = defpackage.xg6.d(r2, r1, r0)
            java.util.List<y66> r2 = r3.d
            int r0 = defpackage.i61.b(r0, r2, r1)
            pk3 r3 = r3.e
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r6 = this;
            ny4 r0 = r6.a
            i83 r1 = r6.b
            java.lang.String r2 = r6.c
            java.util.List<y66> r3 = r6.d
            pk3 r6 = r6.e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "UILayoutVariantDto(uiSize="
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = ", insets="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = ", orientation="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", folds="
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = ", displays="
            r4.append(r0)
            r4.append(r6)
            java.lang.String r6 = ")"
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            return r6
    }
}
