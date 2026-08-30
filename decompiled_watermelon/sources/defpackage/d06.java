package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: d06  reason: default package */
/* loaded from: classes.dex */
public abstract class d06 extends io2 {
    public static List A0(b06 b06Var) {
        b06Var.getClass();
        Iterator it = b06Var.iterator();
        if (!it.hasNext()) {
            return pp1.A;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return l07.b0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static b06 w0(Iterator it) {
        it.getClass();
        return new ay0(new mu(3, it));
    }

    public static b06 x0(Object obj, mi2 mi2Var) {
        if (obj == null) {
            return tp1.a;
        }
        return new o72(new bz2(28, obj), mi2Var);
    }

    public static String y0(b06 b06Var, String str) {
        b06Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : b06Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            yf2.i(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static w72 z0(b06 b06Var, mi2 mi2Var) {
        return new w72(new y82(b06Var, mi2Var, 2), false, new fu5(24));
    }
}
