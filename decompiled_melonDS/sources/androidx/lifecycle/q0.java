package androidx.lifecycle;

import b4.v1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q0 implements v, AutoCloseable {
    public final String A;
    public final p0 B;
    public boolean L;

    public q0(String str, p0 p0Var) {
        this.A = str;
        this.B = p0Var;
    }

    @Override // androidx.lifecycle.v
    public final void d(x xVar, p pVar) {
        if (pVar == p.ON_DESTROY) {
            this.L = false;
            xVar.getLifecycle().c(this);
        }
    }

    public final void i(r rVar, q7.d dVar) {
        dVar.getClass();
        rVar.getClass();
        if (!this.L) {
            this.L = true;
            rVar.a(this);
            dVar.c(this.A, (v1) this.B.f1480b.X);
            return;
        }
        a0.j.p("Already attached to lifecycleOwner");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
