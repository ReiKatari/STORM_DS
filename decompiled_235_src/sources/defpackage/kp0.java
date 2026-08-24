package defpackage;

import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kp0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kp0 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ aq0 B;

    public /* synthetic */ kp0(aq0 aq0Var, int i) {
        this.A = i;
        this.B = aq0Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        cp2 cp2Var;
        int i = this.A;
        aq0 aq0Var = this.B;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                Cheat cheat = (Cheat) obj;
                cheat.getClass();
                aq0Var.e(cheat);
                return jg7Var;
            case 1:
                an0 an0Var = (an0) obj;
                an0Var.getClass();
                aq0Var.getClass();
                aq0Var.c.c(u24.m(an0Var), "selected_folder");
                aq0Var.p.c(new rm4(an0Var.b));
                return jg7Var;
            case 2:
                String str = (String) obj;
                str.getClass();
                aq0 aq0Var2 = this.B;
                aq0Var2.getClass();
                if (!qs6.v0(str)) {
                    pp2 pp2Var = (pp2) aq0Var2.c.a("selected_game");
                    if (pp2Var != null) {
                        cp2Var = pp2Var.a();
                    } else {
                        cp2Var = null;
                    }
                    hv.L(to7.a(aq0Var2), null, null, new l5(cp2Var, aq0Var2, str, (r41) null, 4), 3);
                }
                return jg7Var;
            case 3:
                co0 co0Var = (co0) obj;
                co0Var.getClass();
                aq0Var.e(co0Var.a);
                return jg7Var;
            default:
                cp2 cp2Var2 = (cp2) obj;
                cp2Var2.getClass();
                aq0Var.getClass();
                v46 v46Var = aq0Var.c;
                Long l = cp2Var2.a;
                String str2 = cp2Var2.b;
                String str3 = cp2Var2.c;
                String str4 = cp2Var2.d;
                List<an0> list = cp2Var2.e;
                ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
                for (an0 an0Var2 : list) {
                    arrayList.add(u24.m(an0Var2));
                }
                v46Var.c(new pp2(l, str2, str3, str4, arrayList), "selected_game");
                aq0Var.n.c(new rm4(cp2Var2.b));
                return jg7Var;
        }
    }
}
