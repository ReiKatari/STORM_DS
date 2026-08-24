package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r35  reason: default package */
/* loaded from: classes.dex */
public final class r35 extends defpackage.q0 implements defpackage.ul0, defpackage.ob6 {
    public final defpackage.v80 Y;

    public r35(defpackage.l61 r2, defpackage.v80 r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            r1.Y = r3
            return
    }

    @Override // defpackage.ob6
    public final java.lang.Object a(defpackage.r41 r1, java.lang.Object r2) {
            r0 = this;
            v80 r0 = r0.Y
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
    }

    @Override // defpackage.ob6
    public final java.lang.Object c(java.lang.Object r1) {
            r0 = this;
            v80 r0 = r0.Y
            java.lang.Object r0 = r0.c(r1)
            return r0
    }

    @Override // defpackage.ed3, defpackage.rc3
    public final void h(java.util.concurrent.CancellationException r3) {
            r2 = this;
            boolean r0 = r2.isCancelled()
            if (r0 == 0) goto L7
            return
        L7:
            if (r3 != 0) goto L13
            sc3 r3 = new sc3
            java.lang.String r0 = r2.C()
            r1 = 0
            r3.<init>(r0, r1, r2)
        L13:
            r2.z(r3)
            return
    }

    @Override // defpackage.ul0
    public final defpackage.n80 iterator() {
            r1 = this;
            v80 r1 = r1.Y
            r1.getClass()
            n80 r0 = new n80
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.ul0
    public final defpackage.eb l() {
            r0 = this;
            v80 r0 = r0.Y
            eb r0 = r0.l()
            return r0
    }

    @Override // defpackage.ul0
    public final java.lang.Object m() {
            r0 = this;
            v80 r0 = r0.Y
            java.lang.Object r0 = r0.m()
            return r0
    }

    @Override // defpackage.ul0
    public final java.lang.Object o(defpackage.hw6 r1) {
            r0 = this;
            v80 r0 = r0.Y
            r0.getClass()
            java.lang.Object r0 = defpackage.v80.L(r0, r1)
            return r0
    }

    @Override // defpackage.ul0
    public final java.lang.Object p(defpackage.cu0 r1) {
            r0 = this;
            v80 r0 = r0.Y
            r0.getClass()
            java.lang.Object r0 = defpackage.v80.M(r0, r1)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            return r0
    }

    @Override // defpackage.q0
    public final void u0(java.lang.Throwable r3, boolean r4) {
            r2 = this;
            v80 r0 = r2.Y
            r1 = 0
            boolean r0 = r0.k(r3, r1)
            if (r0 != 0) goto L10
            if (r4 != 0) goto L10
            l61 r2 = r2.X
            defpackage.f04.H(r2, r3)
        L10:
            return
    }

    @Override // defpackage.q0
    public final void v0(java.lang.Object r1) {
            r0 = this;
            jg7 r1 = (defpackage.jg7) r1
            v80 r0 = r0.Y
            r1 = 0
            r0.i(r1)
            return
    }

    public final boolean w0(java.lang.Throwable r2) {
            r1 = this;
            v80 r1 = r1.Y
            r0 = 0
            boolean r1 = r1.k(r2, r0)
            return r1
    }

    @Override // defpackage.ed3
    public final void z(java.lang.Throwable r3) {
            r2 = this;
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
            v80 r0 = r2.Y
            r1 = 1
            r0.k(r3, r1)
            r2.s(r3)
            return
    }
}
