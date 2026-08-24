package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f26  reason: default package */
/* loaded from: classes.dex */
public final class f26 extends defpackage.vy7 {
    public final defpackage.gg3 h0;
    public final java.util.LinkedHashMap i0;
    public final defpackage.jd1 j0;
    public final java.util.LinkedHashMap k0;
    public int l0;

    public f26(defpackage.gg3 r1, java.util.LinkedHashMap r2) {
            r0 = this;
            r0.<init>()
            r0.h0 = r1
            r0.i0 = r2
            jd1 r1 = defpackage.ic6.a
            r0.j0 = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.k0 = r1
            r1 = -1
            r0.l0 = r1
            return
    }

    @Override // defpackage.vy7
    public final void Z(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            r0.l0 = r2
            return
    }

    @Override // defpackage.x32
    public final defpackage.jd1 b() {
            r0 = this;
            jd1 r0 = r0.j0
            return r0
    }

    @Override // defpackage.vy7
    public final void b0(java.lang.Object r1) {
            r0 = this;
            r1.getClass()
            r0.s0(r1)
            return
    }

    @Override // defpackage.x32
    public final void f() {
            r1 = this;
            r0 = 0
            r1.s0(r0)
            return
    }

    @Override // defpackage.x32
    public final void j(defpackage.gg3 r1, java.lang.Object r2) {
            r0 = this;
            r1.getClass()
            r0.s0(r2)
            return
    }

    @Override // defpackage.vy7, defpackage.x32
    public final defpackage.x32 s(defpackage.wb6 r1) {
            r0 = this;
            r1.getClass()
            boolean r1 = defpackage.np2.X(r1)
            if (r1 == 0) goto Lc
            r1 = 0
            r0.l0 = r1
        Lc:
            return r0
    }

    public final void s0(java.lang.Object r4) {
            r3 = this;
            gg3 r0 = r3.h0
            wb6 r0 = r0.e()
            int r1 = r3.l0
            java.lang.String r0 = r0.g(r1)
            java.util.LinkedHashMap r1 = r3.i0
            java.lang.Object r1 = r1.get(r0)
            fd4 r1 = (defpackage.fd4) r1
            if (r1 == 0) goto L2f
            boolean r2 = r1 instanceof defpackage.dt0
            if (r2 == 0) goto L21
            dt0 r1 = (defpackage.dt0) r1
            java.util.List r4 = r1.h(r4)
            goto L29
        L21:
            java.lang.String r4 = r1.f(r4)
            java.util.List r4 = defpackage.hf.b0(r4)
        L29:
            java.util.LinkedHashMap r3 = r3.k0
            r3.put(r0, r4)
            return
        L2f:
            java.lang.String r3 = "Cannot find NavType for argument "
            java.lang.String r4 = ". Please provide NavType through typeMap."
            java.lang.String r3 = defpackage.lb1.A(r3, r0, r4)
            defpackage.u34.f(r3)
            return
    }
}
