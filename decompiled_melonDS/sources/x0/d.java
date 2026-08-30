package x0;

import androidx.lifecycle.h0;
import androidx.lifecycle.p;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements w {
    public final e A;
    public final x B;

    public d(x xVar, e eVar) {
        this.B = xVar;
        this.A = eVar;
    }

    @h0(p.ON_DESTROY)
    public void onDestroy(x xVar) {
        this.A.k(xVar);
    }

    @h0(p.ON_START)
    public void onStart(x xVar) {
        this.A.f(xVar);
    }

    @h0(p.ON_STOP)
    public void onStop(x xVar) {
        this.A.g(xVar);
    }
}
