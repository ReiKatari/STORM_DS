package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@j54("composable")
/* renamed from: yt0  reason: default package */
/* loaded from: classes.dex */
public final class yt0 extends k54 {
    public final tj4 c = me2.G(Boolean.FALSE);

    @Override // defpackage.k54
    public final b44 a() {
        return new xt0(this, it0.a);
    }

    @Override // defpackage.k54
    public final void d(List list, u44 u44Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l34 l34Var = (l34) it.next();
            o34 b = b();
            q45 q45Var = b.e;
            l34Var.getClass();
            ee6 ee6Var = b.c;
            Iterable iterable = (Iterable) ee6Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((l34) it2.next()) == l34Var) {
                        Iterable<l34> iterable2 = (Iterable) q45Var.A.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            for (l34 l34Var2 : iterable2) {
                                if (l34Var2 == l34Var) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            l34 l34Var3 = (l34) tq0.U0((List) q45Var.A.getValue());
            if (l34Var3 != null) {
                ee6Var.l(null, hi2.P((Set) ee6Var.getValue(), l34Var3));
            }
            ee6Var.l(null, hi2.P((Set) ee6Var.getValue(), l34Var));
            b.f(l34Var);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // defpackage.k54
    public final void e(l34 l34Var, boolean z) {
        b().e(l34Var, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void g(l34 l34Var) {
        o34 b = b();
        l34Var.getClass();
        ee6 ee6Var = b.c;
        ee6Var.l(null, hi2.P((Set) ee6Var.getValue(), l34Var));
        s34 s34Var = b.h.b;
        s34Var.getClass();
        if (s34Var.f.contains(l34Var)) {
            l34Var.a(qm3.STARTED);
        } else {
            i.n("Cannot transition entry that is not in the back stack");
        }
    }
}
