package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y0  reason: default package */
/* loaded from: classes.dex */
public final class y0 extends defpackage.z0 implements java.util.RandomAccess {
    public final defpackage.z0 A;
    public final int B;
    public final int L;

    public y0(defpackage.z0 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            int r1 = r1.a()
            defpackage.hf.E(r2, r3, r1)
            int r3 = r3 - r2
            r0.L = r3
            return
    }

    @Override // defpackage.l0
    public final int a() {
            r0 = this;
            int r0 = r0.L
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.L
            if (r3 < 0) goto L10
            if (r3 >= r0) goto L10
            int r0 = r2.B
            int r0 = r0 + r3
            z0 r2 = r2.A
            java.lang.Object r2 = r2.get(r0)
            return r2
        L10:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = defpackage.lb1.j(r2, r3, r0, r1)
            defpackage.e41.q(r2)
            r2 = 0
            return r2
    }

    @Override // defpackage.z0, java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            int r0 = r2.L
            defpackage.hf.E(r3, r4, r0)
            y0 r0 = new y0
            int r1 = r2.B
            int r3 = r3 + r1
            int r1 = r1 + r4
            z0 r2 = r2.A
            r0.<init>(r2, r3, r1)
            return r0
    }
}
