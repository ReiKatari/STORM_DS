package androidx.lifecycle;

import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements v {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ e(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // androidx.lifecycle.v
    public final void d(x xVar, p pVar) {
        switch (this.A) {
            case 0:
                new HashMap();
                j[] jVarArr = (j[]) this.B;
                if (jVarArr.length <= 0) {
                    if (jVarArr.length <= 0) {
                        return;
                    }
                    j jVar = jVarArr[0];
                    throw null;
                }
                j jVar2 = jVarArr[0];
                throw null;
            default:
                if (pVar == p.ON_CREATE) {
                    xVar.getLifecycle().c(this);
                    ((t0) this.B).b();
                    return;
                }
                m9.o.u(pVar, "Next event must be ON_CREATE, it was ");
                return;
        }
    }
}
