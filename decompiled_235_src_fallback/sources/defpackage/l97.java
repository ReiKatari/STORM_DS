package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l97  reason: default package */
/* loaded from: classes.dex */
final class l97 extends defpackage.e74 {
    public final defpackage.ag1 a;
    public final defpackage.h37 b;

    public l97(defpackage.ag1 r1, defpackage.h37 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            o97 r0 = new o97
            ag1 r1 = r2.a
            h37 r2 = r2.b
            r0.<init>(r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            if (r4 != 0) goto L7
            goto L23
        L7:
            java.lang.Class<l97> r1 = defpackage.l97.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L10
            goto L23
        L10:
            l97 r4 = (defpackage.l97) r4
            ag1 r1 = r3.a
            ag1 r2 = r4.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L1d
            goto L23
        L1d:
            h37 r3 = r3.b
            h37 r4 = r4.b
            if (r3 == r4) goto L25
        L23:
            r3 = 0
            return r3
        L25:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r3) {
            r2 = this;
            o97 r3 = (defpackage.o97) r3
            h37 r0 = r2.b
            r3.n0 = r0
            ag1 r0 = r3.m0
            ag1 r2 = r2.a
            boolean r0 = defpackage.nb3.k(r0, r2)
            r1 = 1
            if (r0 == 0) goto L16
            boolean r0 = r3.o0
            if (r0 != r1) goto L16
            return
        L16:
            r3.m0 = r2
            r3.o0 = r1
            ow6 r2 = r3.s0
            r2.T0()
            return
    }

    public final int hashCode() {
            r2 = this;
            ag1 r0 = r2.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            h37 r2 = r2.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            r0 = 0
            int r2 = defpackage.xg6.e(r2, r0, r1)
            r0 = 1
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r2
            return r0
    }
}
