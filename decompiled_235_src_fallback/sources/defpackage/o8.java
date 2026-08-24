package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o8  reason: default package */
/* loaded from: classes.dex */
public final class o8 extends defpackage.zg6 {
    public final defpackage.eb a;
    public final defpackage.vs4 b;
    public final defpackage.vs4 c;

    public o8(defpackage.eb r1, defpackage.cf6 r2, defpackage.of5 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            vs4 r1 = defpackage.np2.Y(r2)
            r0.b = r1
            vs4 r1 = defpackage.np2.Y(r3)
            r0.c = r1
            return
    }

    @Override // defpackage.zg6
    public final defpackage.zg6 a(defpackage.gf6 r10, defpackage.cf6 r11, long r12, long r14, long r16) {
            r9 = this;
            vs4 r10 = r9.b
            java.lang.Object r0 = r10.getValue()
            cf6 r0 = (defpackage.cf6) r0
            boolean r0 = defpackage.nb3.k(r0, r11)
            r8 = r0 ^ 1
            eb r1 = r9.a
            r2 = r12
            r4 = r14
            r6 = r16
            defpackage.kn2.q(r1, r2, r4, r6, r8)
            r10.setValue(r11)
            return r9
    }

    @Override // defpackage.zg6
    public final defpackage.of5 c() {
            r0 = this;
            vs4 r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            of5 r0 = (defpackage.of5) r0
            return r0
    }

    @Override // defpackage.zg6
    public final boolean d() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.zg6
    public final defpackage.eb e() {
            r0 = this;
            eb r0 = r0.a
            return r0
    }

    @Override // defpackage.zg6
    public final defpackage.zg6 g(defpackage.cf6 r1) {
            r0 = this;
            return r0
    }

    @Override // defpackage.zg6
    public final defpackage.zg6 h() {
            r5 = this;
            eb r0 = r5.a
            java.lang.Object r1 = r0.X
            vs4 r1 = (defpackage.vs4) r1
            java.lang.Object r1 = r1.getValue()
            jk4 r1 = (defpackage.jk4) r1
            long r1 = r1.a
            java.lang.Object r3 = r0.R
            vs4 r3 = (defpackage.vs4) r3
            java.lang.Object r3 = r3.getValue()
            jk4 r3 = (defpackage.jk4) r3
            long r3 = r3.a
            long r1 = defpackage.jk4.f(r1, r3)
            java.lang.Object r0 = r0.B
            vs4 r0 = (defpackage.vs4) r0
            java.lang.Object r0 = r0.getValue()
            xi6 r0 = (defpackage.xi6) r0
            long r3 = r0.a
            defpackage.kj2.b(r1, r3)
            vs4 r5 = r5.b
            java.lang.Object r5 = r5.getValue()
            cf6 r5 = (defpackage.cf6) r5
            if6 r5 = r5.m0
            vs4 r0 = r5.e0
            java.lang.Object r1 = r0.getValue()
            rg6 r1 = (defpackage.rg6) r1
            vs4 r1 = r1.b
            java.lang.Object r1 = r1.getValue()
            og6 r1 = (defpackage.og6) r1
            java.lang.Object r0 = r0.getValue()
            rg6 r0 = (defpackage.rg6) r0
            gf6 r5 = r5.e()
            sg6 r5 = r5.b
            jk3 r5 = r5.Y
            if (r5 == 0) goto L64
            long r2 = r5.m()
            defpackage.qo2.S(r2)
            r1.getClass()
            rf4 r5 = defpackage.rf4.a
            return r5
        L64:
            java.lang.String r5 = "Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead."
            defpackage.i.h(r5)
            r5 = 0
            return r5
    }

    @Override // defpackage.zg6
    public final void i(defpackage.of5 r1) {
            r0 = this;
            vs4 r0 = r0.c
            r0.setValue(r1)
            return
    }
}
