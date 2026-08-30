package d0;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 extends k0 {
    public final Executor p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Object f3431q0 = new Object();

    /* renamed from: r0  reason: collision with root package name */
    public y0 f3432r0;

    /* renamed from: s0  reason: collision with root package name */
    public n0 f3433s0;

    public o0(Executor executor) {
        this.p0 = executor;
    }

    @Override // d0.k0
    public final y0 a(j0.d1 d1Var) {
        return d1Var.e();
    }

    @Override // d0.k0
    public final void d() {
        synchronized (this.f3431q0) {
            try {
                y0 y0Var = this.f3432r0;
                if (y0Var != null) {
                    y0Var.close();
                    this.f3432r0 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // d0.k0
    public final void f(y0 y0Var) {
        synchronized (this.f3431q0) {
            try {
                if (!this.f3427o0) {
                    y0Var.close();
                } else if (this.f3433s0 != null) {
                    if (y0Var.q().c() <= this.f3433s0.B.q().c()) {
                        y0Var.close();
                    } else {
                        y0 y0Var2 = this.f3432r0;
                        if (y0Var2 != null) {
                            y0Var2.close();
                        }
                        this.f3432r0 = y0Var;
                    }
                } else {
                    n0 n0Var = new n0(y0Var, this);
                    this.f3433s0 = n0Var;
                    ta.a b10 = b(n0Var);
                    a0.b bVar = new a0.b(23, n0Var);
                    b10.a(new m0.h(0, b10, bVar), ij.a.D());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
