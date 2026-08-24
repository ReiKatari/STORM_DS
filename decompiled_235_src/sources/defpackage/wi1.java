package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wi1  reason: default package */
/* loaded from: classes.dex */
public abstract class wi1 {
    public static final String a = ga0.h("DiagnosticsWrkr");

    public static final String a(qw7 qw7Var, fx7 fx7Var, px6 px6Var, List list) {
        Integer num;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yw7 yw7Var = (yw7) it.next();
            gw7 a2 = rr7.a(yw7Var);
            String str = yw7Var.a;
            px6Var.getClass();
            String str2 = a2.a;
            int i = a2.b;
            str2.getClass();
            nx6 nx6Var = (nx6) hv.Q(px6Var.a, true, false, new ox6(str2, i, 0));
            if (nx6Var != null) {
                num = Integer.valueOf(nx6Var.c);
            } else {
                num = null;
            }
            qw7Var.getClass();
            str.getClass();
            String P0 = gt0.P0((List) hv.Q(qw7Var.a, true, false, new c70(str, 19)), ",", null, null, null, 62);
            fx7Var.getClass();
            String P02 = gt0.P0((List) hv.Q(fx7Var.a, true, false, new cx7(str, 1)), ",", null, null, null, 62);
            StringBuilder t = i61.t("\n", str, "\t ");
            t.append(yw7Var.c);
            t.append("\t ");
            t.append(num);
            t.append("\t ");
            t.append(yw7Var.b.name());
            t.append("\t ");
            t.append(P0);
            t.append("\t ");
            t.append(P02);
            t.append('\t');
            sb.append(t.toString());
        }
        return sb.toString();
    }
}
