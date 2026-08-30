package gk;

import java.io.IOException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends pi.g0 {
    public final pi.g0 L;
    public final fj.a0 R;
    public IOException X;

    public y(pi.g0 g0Var) {
        this.L = g0Var;
        this.R = new fj.a0(new d9.b(this, g0Var.m()));
    }

    @Override // pi.g0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.L.close();
    }

    @Override // pi.g0
    public final long d() {
        return this.L.d();
    }

    @Override // pi.g0
    public final pi.t i() {
        return this.L.i();
    }

    @Override // pi.g0
    public final fj.g m() {
        return this.R;
    }
}
