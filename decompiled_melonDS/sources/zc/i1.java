package zc;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i1 extends cc.a implements y0 {
    public static final i1 B = new cc.a(r.B);

    @Override // zc.y0
    public final CancellationException B() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // zc.y0
    public final i0 F(boolean z10, boolean z11, a2.g gVar) {
        return j1.A;
    }

    @Override // zc.y0
    public final Object G(ec.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // zc.y0
    public final i0 I(mc.l lVar) {
        return j1.A;
    }

    @Override // zc.y0
    public final boolean d() {
        return true;
    }

    @Override // zc.y0
    public final boolean isCancelled() {
        return false;
    }

    @Override // zc.y0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // zc.y0
    public final k w(f1 f1Var) {
        return j1.A;
    }

    @Override // zc.y0, bd.l
    public final void i(CancellationException cancellationException) {
    }
}
