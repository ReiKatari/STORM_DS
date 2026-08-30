package b7;

import a7.f0;
import a7.l0;
import a7.m0;
import cd.q1;
import cd.y0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n2.f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@l0("composable")
/* loaded from: classes.dex */
public final class i extends m0 {

    /* renamed from: c  reason: collision with root package name */
    public final f1 f2090c = n2.s.w(Boolean.FALSE);

    @Override // a7.m0
    public final a7.x a() {
        return new h(this, c.f2085a);
    }

    @Override // a7.m0
    public final void d(List list, f0 f0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a7.i iVar = (a7.i) it.next();
            a7.m b10 = b();
            y0 y0Var = b10.f599e;
            iVar.getClass();
            q1 q1Var = b10.f597c;
            Iterable iterable = (Iterable) q1Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((a7.i) it2.next()) == iVar) {
                        Iterable<a7.i> iterable2 = (Iterable) y0Var.A.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            for (a7.i iVar2 : iterable2) {
                                if (iVar2 == iVar) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            a7.i iVar3 = (a7.i) zb.l.a0((List) y0Var.A.getValue());
            if (iVar3 != null) {
                q1Var.k(null, p7.j.C((Set) q1Var.getValue(), iVar3));
            }
            q1Var.k(null, p7.j.C((Set) q1Var.getValue(), iVar));
            b10.f(iVar);
        }
        this.f2090c.setValue(Boolean.FALSE);
    }

    @Override // a7.m0
    public final void e(a7.i iVar, boolean z10) {
        b().e(iVar, z10);
        this.f2090c.setValue(Boolean.TRUE);
    }

    public final void g(a7.i iVar) {
        a7.m b10 = b();
        iVar.getClass();
        q1 q1Var = b10.f597c;
        q1Var.k(null, p7.j.C((Set) q1Var.getValue(), iVar));
        d7.f fVar = b10.f602h.f552b;
        fVar.getClass();
        if (fVar.f3926f.contains(iVar)) {
            iVar.b(androidx.lifecycle.q.STARTED);
        } else {
            a0.j.p("Cannot transition entry that is not in the back stack");
        }
    }
}
