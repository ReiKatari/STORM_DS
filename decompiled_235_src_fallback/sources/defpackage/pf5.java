package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pf5  reason: default package */
/* loaded from: classes.dex */
public final class pf5 {
    @defpackage.gc6("x")
    private final int a;
    @defpackage.gc6("y")
    private final int b;
    @defpackage.gc6("width")
    private final int c;
    @defpackage.gc6("height")
    private final int d;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: pf5$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public pf5(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final me.magnum.melonds.domain.model.Rect a() {
            r4 = this;
            me.magnum.melonds.domain.model.Rect r0 = new me.magnum.melonds.domain.model.Rect
            int r1 = r4.a
            int r2 = r4.b
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
            boolean r1 = r5 instanceof defpackage.pf5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pf5 r5 = (defpackage.pf5) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L21
            return r2
        L21:
            int r4 = r4.d
            int r5 = r5.d
            if (r4 == r5) goto L28
            return r2
        L28:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.d
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r6 = this;
            int r0 = r6.a
            int r1 = r6.b
            int r2 = r6.c
            int r6 = r6.d
            java.lang.String r3 = ", y="
            java.lang.String r4 = ", width="
            java.lang.String r5 = "RectDto(x="
            java.lang.StringBuilder r0 = defpackage.i61.q(r0, r1, r5, r3, r4)
            r0.append(r2)
            java.lang.String r1 = ", height="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ")"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }
}
