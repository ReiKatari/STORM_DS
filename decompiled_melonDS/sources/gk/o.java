package gk;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements e {
    public final Executor A;
    public final e B;

    public o(Executor executor, e eVar) {
        this.A = executor;
        this.B = eVar;
    }

    @Override // gk.e
    public final void cancel() {
        this.B.cancel();
    }

    @Override // gk.e
    /* renamed from: clone */
    public final e m14clone() {
        return new o(this.A, this.B.clone());
    }

    @Override // gk.e
    public final void d(h hVar) {
        this.B.d(new a0.g(17, this, hVar, false));
    }

    @Override // gk.e
    public final w.x0 i() {
        return this.B.i();
    }

    @Override // gk.e
    public final boolean m() {
        return this.B.m();
    }
}
