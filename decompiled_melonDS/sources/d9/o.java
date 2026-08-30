package d9;

import fj.a0;
import fj.x;
import java.io.Closeable;
import k7.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends p {
    public final x A;
    public final fj.k B;
    public final String L;
    public final Closeable R;
    public boolean X;
    public a0 Y;

    public o(x xVar, fj.k kVar, String str, Closeable closeable) {
        this.A = xVar;
        this.B = kVar;
        this.L = str;
        this.R = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.X = true;
            a0 a0Var = this.Y;
            if (a0Var != null) {
                q9.g.a(a0Var);
            }
            Closeable closeable = this.R;
            if (closeable != null) {
                q9.g.a(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // d9.p
    public final w d() {
        return null;
    }

    @Override // d9.p
    public final synchronized fj.g i() {
        if (!this.X) {
            a0 a0Var = this.Y;
            if (a0Var != null) {
                return a0Var;
            }
            a0 x9 = ij.a.x(this.B.J(this.A));
            this.Y = x9;
            return x9;
        }
        throw new IllegalStateException("closed");
    }
}
