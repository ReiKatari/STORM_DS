package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yl2  reason: default package */
/* loaded from: classes.dex */
public final class yl2 {
    public static final yl2 a = new Object();

    public final xl2 a(List list, c87 c87Var, am2 am2Var, c87 c87Var2) {
        Object next;
        list.getClass();
        c87Var.getClass();
        am2Var.getClass();
        v72 v72Var = new v72(d06.z0(new w72(new w72(new w72(new mu(1, list), true, new z(1, this, yl2.class, "belongsToConfiguredRepository", "belongsToConfiguredRepository(Lme/magnum/melonds/github/dtos/ReleaseDto;)Z", 0, 0, 15)), false, new qu1(9)), true, new kb2(2, am2Var)), new gi2(3, c87Var, c87Var2)));
        if (!v72Var.hasNext()) {
            next = null;
        } else {
            next = v72Var.next();
            while (v72Var.hasNext()) {
                Object next2 = v72Var.next();
                xl2 xl2Var = (xl2) next;
                xl2 xl2Var2 = (xl2) next2;
                int i = iq2.i(xl2Var.c, xl2Var2.c);
                if (i == 0) {
                    i = iq2.i(xl2Var.d, xl2Var2.d);
                }
                if (i < 0) {
                    next = next2;
                }
            }
        }
        return (xl2) next;
    }
}
