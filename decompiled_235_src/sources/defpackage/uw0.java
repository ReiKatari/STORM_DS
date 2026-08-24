package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@pd4("composable")
/* renamed from: uw0  reason: default package */
/* loaded from: classes.dex */
public final class uw0 extends qd4 {
    public final vs4 c = np2.Y(Boolean.FALSE);

    @Override // defpackage.qd4
    public final ic4 a() {
        return new tw0(this, dw0.a);
    }

    @Override // defpackage.qd4
    public final void d(List list, ad4 ad4Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb4 sb4Var = (sb4) it.next();
            vb4 b = b();
            de5 de5Var = b.e;
            sb4Var.getClass();
            tp6 tp6Var = b.c;
            Iterable iterable = (Iterable) tp6Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((sb4) it2.next()) == sb4Var) {
                        Iterable<sb4> iterable2 = (Iterable) de5Var.A.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            for (sb4 sb4Var2 : iterable2) {
                                if (sb4Var2 == sb4Var) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            sb4 sb4Var3 = (sb4) gt0.R0((List) de5Var.A.getValue());
            if (sb4Var3 != null) {
                tp6Var.m(null, ii2.L((Set) tp6Var.getValue(), sb4Var3));
            }
            tp6Var.m(null, ii2.L((Set) tp6Var.getValue(), sb4Var));
            b.f(sb4Var);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // defpackage.qd4
    public final void e(sb4 sb4Var, boolean z) {
        b().e(sb4Var, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void g(sb4 sb4Var) {
        vb4 b = b();
        sb4Var.getClass();
        tp6 tp6Var = b.c;
        tp6Var.m(null, ii2.L((Set) tp6Var.getValue(), sb4Var));
        zb4 zb4Var = b.h.b;
        zb4Var.getClass();
        if (zb4Var.f.contains(sb4Var)) {
            sb4Var.a(tt3.STARTED);
        } else {
            i.m("Cannot transition entry that is not in the back stack");
        }
    }
}
