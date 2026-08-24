package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gg2  reason: default package */
/* loaded from: classes.dex */
public final class gg2 {
    public final defpackage.cg2 a;
    public defpackage.x24 b;
    public defpackage.dx4 c;
    public defpackage.x24 d;
    public defpackage.dx4 e;
    public defpackage.d93 f;
    public defpackage.d93 g;

    public gg2(defpackage.cg2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final defpackage.d93 a(int r4, boolean r5, int r6) {
            r3 = this;
            int[] r0 = defpackage.fg2.a
            cg2 r1 = r3.a
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2d
            r2 = 2
            if (r0 == r2) goto L2d
            r2 = 3
            if (r0 == r2) goto L28
            r2 = 4
            if (r0 != r2) goto L23
            if (r5 == 0) goto L1b
            d93 r3 = r3.f
            return r3
        L1b:
            int r4 = r4 + r1
            if (r4 < 0) goto L2d
            if (r6 < 0) goto L2d
            d93 r3 = r3.g
            return r3
        L23:
            defpackage.i.d()
            r3 = 0
            return r3
        L28:
            if (r5 == 0) goto L2d
            d93 r3 = r3.f
            return r3
        L2d:
            r3 = 0
            return r3
    }

    public final void b(defpackage.x24 r5, defpackage.x24 r6, long r7) {
            r4 = this;
            hn3 r0 = defpackage.hn3.Horizontal
            long r7 = defpackage.qo2.q(r7, r0)
            r0 = 0
            if (r5 == 0) goto L24
            int r1 = defpackage.q21.g(r7)
            int r1 = r5.n(r1)
            int r2 = r5.V(r1)
            long r1 = defpackage.d93.a(r1, r2)
            d93 r3 = new d93
            r3.<init>(r1)
            r4.f = r3
            r4.b = r5
            r4.c = r0
        L24:
            if (r6 == 0) goto L41
            int r5 = defpackage.q21.g(r7)
            int r5 = r6.n(r5)
            int r7 = r6.V(r5)
            long r7 = defpackage.d93.a(r5, r7)
            d93 r5 = new d93
            r5.<init>(r7)
            r4.g = r5
            r4.d = r6
            r4.e = r0
        L41:
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.gg2
            if (r1 != 0) goto L9
            goto L11
        L9:
            gg2 r3 = (defpackage.gg2) r3
            cg2 r2 = r2.a
            cg2 r3 = r3.a
            if (r2 == r3) goto L13
        L11:
            r2 = 0
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            cg2 r2 = r2.a
            int r2 = r2.hashCode()
            r0 = 31
            int r2 = r2 * r0
            r1 = 0
            int r2 = defpackage.lb1.a(r1, r2, r0)
            int r0 = java.lang.Integer.hashCode(r1)
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FlowLayoutOverflowState(type="
            r0.<init>(r1)
            cg2 r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
