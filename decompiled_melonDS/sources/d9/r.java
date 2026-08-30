package d9;

import fj.t;
import k7.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends p {
    public final w A;
    public boolean B;
    public final fj.g L;

    public r(fj.g gVar, w wVar) {
        this.A = wVar;
        this.L = gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.B = true;
        fj.g gVar = this.L;
        if (gVar != null) {
            q9.g.a(gVar);
        }
    }

    @Override // d9.p
    public final w d() {
        return this.A;
    }

    @Override // d9.p
    public final synchronized fj.g i() {
        fj.g gVar;
        try {
            if (!this.B) {
                gVar = this.L;
                if (gVar == null) {
                    t tVar = fj.k.A;
                    throw null;
                }
            } else {
                throw new IllegalStateException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return gVar;
    }
}
