package y6;

import cc.g;
import zc.u;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements AutoCloseable, u {
    public final g A;

    public a(g gVar) {
        gVar.getClass();
        this.A = gVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        x.e(this.A, null);
    }

    @Override // zc.u
    public final g v() {
        return this.A;
    }
}
