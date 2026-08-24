package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q0  reason: default package */
/* loaded from: classes.dex */
public abstract class q0 extends defpackage.ed3 implements defpackage.r41, defpackage.w61 {
    public final defpackage.l61 X;

    public q0(defpackage.l61 r1, boolean r2) {
            r0 = this;
            r0.<init>(r2)
            vs0 r2 = defpackage.vs0.h0
            j61 r2 = r1.Z(r2)
            rc3 r2 = (defpackage.rc3) r2
            r0.T(r2)
            l61 r1 = r1.N(r0)
            r0.X = r1
            return
    }

    @Override // defpackage.w61
    public final defpackage.l61 A() {
            r0 = this;
            l61 r0 = r0.X
            return r0
    }

    @Override // defpackage.ed3
    public final java.lang.String C() {
            r1 = this;
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r0 = " was cancelled"
            java.lang.String r1 = r1.concat(r0)
            return r1
    }

    @Override // defpackage.ed3
    public final void S(defpackage.ug r1) {
            r0 = this;
            l61 r0 = r0.X
            defpackage.f04.H(r0, r1)
            return
    }

    @Override // defpackage.r41
    public final defpackage.l61 b() {
            r0 = this;
            l61 r0 = r0.X
            return r0
    }

    @Override // defpackage.r41
    public final void i(java.lang.Object r3) {
            r2 = this;
            java.lang.Throwable r0 = defpackage.hm5.a(r3)
            if (r0 != 0) goto L7
            goto Ld
        L7:
            av0 r3 = new av0
            r1 = 0
            r3.<init>(r0, r1)
        Ld:
            java.lang.Object r3 = r2.d0(r3)
            gr1 r0 = defpackage.fd3.b
            if (r3 != r0) goto L16
            return
        L16:
            r2.g(r3)
            return
    }

    @Override // defpackage.ed3
    public final void i0(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.av0
            if (r0 == 0) goto L17
            av0 r3 = (defpackage.av0) r3
            java.lang.Throwable r0 = r3.a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.av0.b
            int r3 = r1.get(r3)
            r1 = 1
            if (r3 != r1) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            r2.u0(r0, r1)
            return
        L17:
            r2.v0(r3)
            return
    }

    public void u0(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            return
    }

    public void v0(java.lang.Object r1) {
            r0 = this;
            return
    }
}
