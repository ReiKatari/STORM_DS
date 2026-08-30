package m9;

import androidx.lifecycle.x;
import zc.y0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements androidx.lifecycle.f {
    public final androidx.lifecycle.r A;
    public final y0 B;

    public a(androidx.lifecycle.r rVar, y0 y0Var) {
        this.A = rVar;
        this.B = y0Var;
    }

    @Override // androidx.lifecycle.f
    public final void onDestroy(x xVar) {
        this.B.i(null);
    }
}
