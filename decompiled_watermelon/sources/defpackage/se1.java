package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: se1  reason: default package */
/* loaded from: classes.dex */
public abstract class se1 {
    public static final String a = y70.h("DiagnosticsWrkr");

    public static final String a(ph7 ph7Var, gi7 gi7Var, tl6 tl6Var, List list) {
        Integer num;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xh7 xh7Var = (xh7) it.next();
            gh7 b = ei7.b(xh7Var);
            String str = xh7Var.a;
            tl6Var.getClass();
            String str2 = b.a;
            int i = b.b;
            str2.getClass();
            rl6 rl6Var = (rl6) mh7.X(tl6Var.a, true, false, new sl6(str2, i, 0));
            if (rl6Var != null) {
                num = Integer.valueOf(rl6Var.c);
            } else {
                num = null;
            }
            ph7Var.getClass();
            str.getClass();
            String S0 = tq0.S0((List) mh7.X(ph7Var.a, true, false, new ok0(str, 14)), ",", null, null, null, 62);
            gi7Var.getClass();
            String S02 = tq0.S0((List) mh7.X(gi7Var.a, true, false, new ok0(str, 26)), ",", null, null, null, 62);
            StringBuilder u = b31.u("\n", str, "\t ");
            u.append(xh7Var.c);
            u.append("\t ");
            u.append(num);
            u.append("\t ");
            u.append(xh7Var.b.name());
            u.append("\t ");
            u.append(S0);
            u.append("\t ");
            u.append(S02);
            u.append('\t');
            sb.append(u.toString());
        }
        return sb.toString();
    }
}
