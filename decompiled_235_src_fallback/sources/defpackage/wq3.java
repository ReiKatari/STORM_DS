package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wq3  reason: default package */
/* loaded from: classes.dex */
final class wq3 extends defpackage.e74 {
    public final defpackage.on2 a;
    public final defpackage.tq3 b;
    public final defpackage.lo4 c;
    public final boolean d;

    public wq3(defpackage.on2 r1, defpackage.tq3 r2, defpackage.lo4 r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r4 = this;
            zq3 r0 = new zq3
            lo4 r1 = r4.c
            boolean r2 = r4.d
            on2 r3 = r4.a
            tq3 r4 = r4.b
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.wq3
            if (r1 != 0) goto L9
            goto L2a
        L9:
            wq3 r4 = (defpackage.wq3) r4
            on2 r1 = r4.a
            on2 r2 = r3.a
            if (r2 == r1) goto L12
            goto L2a
        L12:
            tq3 r1 = r3.b
            tq3 r2 = r4.b
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L1d
            goto L2a
        L1d:
            lo4 r1 = r3.c
            lo4 r2 = r4.c
            if (r1 == r2) goto L24
            goto L2a
        L24:
            boolean r3 = r3.d
            boolean r4 = r4.d
            if (r3 == r4) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r3) {
            r2 = this;
            zq3 r3 = (defpackage.zq3) r3
            on2 r0 = r2.a
            r3.k0 = r0
            tq3 r0 = r2.b
            r3.l0 = r0
            lo4 r0 = r3.m0
            lo4 r1 = r2.c
            if (r0 == r1) goto L15
            r3.m0 = r1
            defpackage.bl2.G(r3)
        L15:
            boolean r0 = r3.n0
            boolean r2 = r2.d
            if (r0 != r2) goto L1c
            return
        L1c:
            r3.n0 = r2
            r3.R0()
            defpackage.bl2.G(r3)
            return
    }

    public final int hashCode() {
            r3 = this;
            on2 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            tq3 r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            lo4 r0 = r3.c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r3 = r3.d
            int r3 = defpackage.xg6.e(r0, r3, r1)
            r0 = 0
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r3
            return r0
    }
}
