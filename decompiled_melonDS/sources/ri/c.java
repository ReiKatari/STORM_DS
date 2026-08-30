package ri;

import fj.g0;
import fj.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends n {
    public boolean B;
    public final /* synthetic */ h L;
    public final /* synthetic */ d R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g0 g0Var, h hVar, d dVar) {
        super(g0Var);
        this.L = hVar;
        this.R = dVar;
    }

    @Override // fj.n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (!this.B) {
            this.B = true;
            h hVar = this.L;
            d dVar = this.R;
            synchronized (hVar) {
                int i2 = dVar.f12756h - 1;
                dVar.f12756h = i2;
                if (i2 == 0 && dVar.f12754f) {
                    hVar.H(dVar);
                }
            }
        }
    }
}
