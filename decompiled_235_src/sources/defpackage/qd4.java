package defpackage;

import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qd4  reason: default package */
/* loaded from: classes.dex */
public abstract class qd4 {
    public vb4 a;
    public boolean b;

    public abstract ic4 a();

    public final vb4 b() {
        vb4 vb4Var = this.a;
        if (vb4Var != null) {
            return vb4Var;
        }
        i.m("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, ad4 ad4Var) {
        oc2 oc2Var = new oc2(new pc2(new qd2(new ev(list, 1), new bg2(14, this, ad4Var), 2), false, new r76(5)));
        while (oc2Var.hasNext()) {
            b().f((sb4) oc2Var.next());
        }
    }

    public void e(sb4 sb4Var, boolean z) {
        List list = (List) b().e.A.getValue();
        if (list.contains(sb4Var)) {
            ListIterator listIterator = list.listIterator(list.size());
            sb4 sb4Var2 = null;
            while (f()) {
                sb4Var2 = (sb4) listIterator.previous();
                if (nb3.k(sb4Var2, sb4Var)) {
                    break;
                }
            }
            if (sb4Var2 != null) {
                b().d(sb4Var2, z);
                return;
            }
            return;
        }
        u34.l("popBackStack was called with ", sb4Var, " which does not exist in back stack ", list);
    }

    public boolean f() {
        return true;
    }

    public ic4 c(ic4 ic4Var) {
        return ic4Var;
    }
}
