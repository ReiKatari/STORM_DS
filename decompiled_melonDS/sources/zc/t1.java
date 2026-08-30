package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t1 extends ed.q {
    public final ThreadLocal X;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t1(cc.c r3, cc.g r4) {
        /*
            r2 = this;
            zc.u1 r0 = zc.u1.A
            cc.e r1 = r4.t(r0)
            if (r1 != 0) goto Ld
            cc.g r0 = r4.H(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.X = r0
            cc.g r3 = r3.g()
            cc.d r0 = cc.d.A
            cc.e r3 = r3.t(r0)
            boolean r3 = r3 instanceof zc.q
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = ed.b.n(r4, r3)
            ed.b.g(r4, r3)
            r2.n0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.t1.<init>(cc.c, cc.g):void");
    }

    @Override // ed.q
    public final void k0() {
        m0();
    }

    public final boolean l0() {
        boolean z10;
        if (this.threadLocalIsSet && this.X.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X.remove();
        return !z10;
    }

    public final void m0() {
        if (this.threadLocalIsSet) {
            yb.j jVar = (yb.j) this.X.get();
            if (jVar != null) {
                ed.b.g((cc.g) jVar.A, jVar.B);
            }
            this.X.remove();
        }
    }

    public final void n0(cc.g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.X.set(new yb.j(gVar, obj));
    }

    @Override // ed.q, zc.f1
    public final void q(Object obj) {
        m0();
        Object x9 = x.x(obj);
        cc.c cVar = this.R;
        cc.g g10 = cVar.g();
        t1 t1Var = null;
        Object n10 = ed.b.n(g10, null);
        if (n10 != ed.b.f4448d) {
            t1Var = x.E(cVar, g10, n10);
        }
        try {
            cVar.h(x9);
            if (t1Var != null && !t1Var.l0()) {
                return;
            }
            ed.b.g(g10, n10);
        } catch (Throwable th2) {
            if (t1Var == null || t1Var.l0()) {
                ed.b.g(g10, n10);
            }
            throw th2;
        }
    }
}
