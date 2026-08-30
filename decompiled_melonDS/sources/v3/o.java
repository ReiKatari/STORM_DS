package v3;

import b4.j0;
import b4.q1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends f {
    @Override // v3.f
    public final void P0(q qVar) {
        r rVar = (r) a4.l.h(this, q1.f1931u);
        if (rVar != null) {
            b4.t tVar = (b4.t) rVar;
            if (qVar == null) {
                q.f13686a.getClass();
                qVar = s.f13687a;
            }
            j0.f1865a.a(tVar.f1946b, qVar);
        }
    }

    @Override // v3.f
    public final boolean R0(int i2) {
        if (i2 == 3 || i2 == 4) {
            return false;
        }
        return true;
    }

    @Override // a4.q2
    public final /* bridge */ /* synthetic */ Object k() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
