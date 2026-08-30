package defpackage;

import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k54  reason: default package */
/* loaded from: classes.dex */
public abstract class k54 {
    public o34 a;
    public boolean b;

    public abstract b44 a();

    public final o34 b() {
        o34 o34Var = this.a;
        if (o34Var != null) {
            return o34Var;
        }
        i.n("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, u44 u44Var) {
        v72 v72Var = new v72(new w72(new y82(new mu(1, list), new kb2(15, this, u44Var), 2), false, new fu5(24)));
        while (v72Var.hasNext()) {
            b().f((l34) v72Var.next());
        }
    }

    public void e(l34 l34Var, boolean z) {
        List list = (List) b().e.A.getValue();
        if (list.contains(l34Var)) {
            ListIterator listIterator = list.listIterator(list.size());
            l34 l34Var2 = null;
            while (f()) {
                l34Var2 = (l34) listIterator.previous();
                if (b53.x(l34Var2, l34Var)) {
                    break;
                }
            }
            if (l34Var2 != null) {
                b().d(l34Var2, z);
                return;
            }
            return;
        }
        c44.k("popBackStack was called with ", l34Var, " which does not exist in back stack ", list);
    }

    public boolean f() {
        return true;
    }

    public b44 c(b44 b44Var) {
        return b44Var;
    }
}
