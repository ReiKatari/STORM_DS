package b7;

import a7.f0;
import a7.l0;
import a7.m0;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@l0("dialog")
/* loaded from: classes.dex */
public final class r extends m0 {
    @Override // a7.m0
    public final a7.x a() {
        v2.c cVar = e.f2089a;
        return new q(this);
    }

    @Override // a7.m0
    public final void d(List list, f0 f0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((a7.i) it.next());
        }
    }

    @Override // a7.m0
    public final void e(a7.i iVar, boolean z10) {
        b().e(iVar, z10);
        int U = zb.l.U((Iterable) b().f600f.A.getValue(), iVar);
        int i2 = 0;
        for (Object obj : (Iterable) b().f600f.A.getValue()) {
            int i10 = i2 + 1;
            if (i2 >= 0) {
                a7.i iVar2 = (a7.i) obj;
                if (i2 > U) {
                    b().c(iVar2);
                }
                i2 = i10;
            } else {
                p7.t.F();
                throw null;
            }
        }
    }
}
