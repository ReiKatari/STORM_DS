package defpackage;

import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: an0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class an0 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ pn0 B;

    public /* synthetic */ an0(pn0 pn0Var, int i) {
        this.A = i;
        this.B = pn0Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        yj2 yj2Var;
        int i = this.A;
        pn0 pn0Var = this.B;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                Cheat cheat = (Cheat) obj;
                cheat.getClass();
                pn0Var.e(cheat);
                return o27Var;
            case 1:
                sk0 sk0Var = (sk0) obj;
                sk0Var.getClass();
                pn0Var.getClass();
                pn0Var.c.c(a53.F(sk0Var), "selected_folder");
                pn0Var.p.c(new qd4(sk0Var.b));
                return o27Var;
            case 2:
                String str = (String) obj;
                str.getClass();
                pn0 pn0Var2 = this.B;
                pn0Var2.getClass();
                if (!zg6.B0(str)) {
                    kk2 kk2Var = (kk2) pn0Var2.c.a("selected_game");
                    if (kk2Var != null) {
                        yj2Var = kk2Var.a();
                    } else {
                        yj2Var = null;
                    }
                    tq5.w(ua7.a(pn0Var2), null, null, new m5(yj2Var, pn0Var2, str, (j11) null, 5), 3);
                }
                return o27Var;
            case 3:
                ul0 ul0Var = (ul0) obj;
                ul0Var.getClass();
                pn0Var.e(ul0Var.a);
                return o27Var;
            default:
                yj2 yj2Var2 = (yj2) obj;
                yj2Var2.getClass();
                pn0Var.getClass();
                pt5 pt5Var = pn0Var.c;
                Long l = yj2Var2.a;
                String str2 = yj2Var2.b;
                String str3 = yj2Var2.c;
                String str4 = yj2Var2.d;
                List<sk0> list = yj2Var2.e;
                ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
                for (sk0 sk0Var2 : list) {
                    arrayList.add(a53.F(sk0Var2));
                }
                pt5Var.c(new kk2(l, str2, str3, str4, arrayList), "selected_game");
                pn0Var.n.c(new qd4(yj2Var2.b));
                return o27Var;
        }
    }
}
