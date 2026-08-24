package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: sb6  reason: default package */
/* loaded from: classes.dex */
public abstract class sb6 extends qo2 {
    public static qb6 Y(Iterator it) {
        it.getClass();
        return new f11(new ev(it, 3));
    }

    public static qb6 Z(Object obj, qn2 qn2Var) {
        if (obj == null) {
            return cu1.a;
        }
        return new qd2(new t46(obj, 5), qn2Var, 3);
    }

    public static String a0(qb6 qb6Var, String str) {
        qb6Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : qb6Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            hi2.s(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static pc2 b0(qb6 qb6Var, qn2 qn2Var) {
        return new pc2(new qd2(qb6Var, qn2Var, 2), false, new r76(5));
    }

    public static List c0(qb6 qb6Var) {
        qb6Var.getClass();
        Iterator it = qb6Var.iterator();
        if (!it.hasNext()) {
            return yt1.A;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return hf.b0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
