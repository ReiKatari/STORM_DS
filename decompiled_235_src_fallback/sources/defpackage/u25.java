package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u25  reason: default package */
/* loaded from: classes.dex */
public abstract class u25 extends defpackage.ct0 {
    public final defpackage.t25 b;

    public u25(defpackage.gg3 r2) {
            r1 = this;
            r2.getClass()
            r1.<init>(r2)
            t25 r0 = new t25
            wb6 r2 = r2.e()
            r0.<init>(r2)
            r1.b = r0
            return
    }

    @Override // defpackage.m0, defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r1 = r1.j(r2, r0)
            return r1
    }

    @Override // defpackage.ct0, defpackage.gg3
    public final void d(defpackage.x32 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.i(r4)
            t25 r1 = r2.b
            vx0 r3 = r3.g0(r1, r0)
            r2.p(r3, r4, r0)
            r3.a(r1)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            t25 r0 = r0.b
            return r0
    }

    @Override // defpackage.m0
    public final java.lang.Object f() {
            r1 = this;
            java.lang.Object r0 = r1.o()
            java.lang.Object r1 = r1.l(r0)
            s25 r1 = (defpackage.s25) r1
            return r1
    }

    @Override // defpackage.m0
    public final int g(java.lang.Object r1) {
            r0 = this;
            s25 r1 = (defpackage.s25) r1
            r1.getClass()
            int r0 = r1.d()
            return r0
    }

    @Override // defpackage.m0
    public final java.util.Iterator h(java.lang.Object r1) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This method lead to boxing and must not be used, use writeContents instead"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.m0
    public final java.lang.Object m(java.lang.Object r1) {
            r0 = this;
            s25 r1 = (defpackage.s25) r1
            r1.getClass()
            java.lang.Object r0 = r1.a()
            return r0
    }

    @Override // defpackage.ct0
    public final void n(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            s25 r2 = (defpackage.s25) r2
            r2.getClass()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This method lead to boxing and must not be used, use Builder.append instead"
            r0.<init>(r1)
            throw r0
    }

    public abstract java.lang.Object o();

    public abstract void p(defpackage.vx0 r1, java.lang.Object r2, int r3);
}
