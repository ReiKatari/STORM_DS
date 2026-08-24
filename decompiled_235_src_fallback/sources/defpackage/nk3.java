package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nk3  reason: default package */
/* loaded from: classes.dex */
public final class nk3 {
    @defpackage.gc6("id")
    private final int a;
    @defpackage.gc6("type")
    private final java.lang.String b;
    @defpackage.gc6("width")
    private final int c;
    @defpackage.gc6("height")
    private final int d;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: nk3$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public nk3(int r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r4
            r0.c = r2
            r0.d = r3
            return
    }

    public final defpackage.mk3 a() {
            r4 = this;
            mk3 r0 = new mk3
            int r1 = r4.a
            java.lang.String r2 = r4.b
            lk3[] r3 = defpackage.lk3.values()
            java.lang.Enum r2 = defpackage.jw2.o(r2, r3)
            lk3 r2 = (defpackage.lk3) r2
            int r3 = r4.c
            int r4 = r4.d
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.nk3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nk3 r5 = (defpackage.nk3) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L25
            return r2
        L25:
            int r4 = r4.d
            int r5 = r5.d
            if (r4 == r5) goto L2c
            return r2
        L2c:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.d
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.a
            java.lang.String r1 = r5.b
            int r2 = r5.c
            int r5 = r5.d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "LayoutDisplayDto(id="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", type="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ", width="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ", height="
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = ")"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            return r5
    }
}
