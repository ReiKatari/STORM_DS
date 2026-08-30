package vi;

import a0.j;
import pi.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends a {
    public boolean X;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.L) {
            return;
        }
        if (!this.X) {
            d(g.f13837f);
        }
        this.L = true;
    }

    @Override // vi.a, fj.g0
    public final long k(fj.e eVar, long j2) {
        eVar.getClass();
        if (j2 >= 0) {
            if (!this.L) {
                if (this.X) {
                    return -1L;
                }
                long k10 = super.k(eVar, j2);
                if (k10 == -1) {
                    this.X = true;
                    d(q.B);
                    return -1L;
                }
                return k10;
            }
            j.p("closed");
            return 0L;
        }
        j.e(kc.a.e(j2, "byteCount < 0: "));
        return 0L;
    }
}
