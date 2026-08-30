package uc;

import a6.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.s0;
import mc.l;
import p7.m;
import p7.t;
import zb.q;
/* loaded from: classes.dex */
public abstract class h extends m {
    public static f I(Iterator it) {
        it.getClass();
        return new a(new a1(1, it));
    }

    public static f J(Object obj, l lVar) {
        if (obj == null) {
            return e.f13544a;
        }
        return new jc.h(3, new s0(16, obj), lVar);
    }

    public static String K(f fVar, String str) {
        fVar.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : fVar) {
            i2++;
            if (i2 > 1) {
                sb2.append((CharSequence) str);
            }
            m.d(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static List L(f fVar) {
        Iterator it = fVar.iterator();
        if (!it.hasNext()) {
            return q.A;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return t.x(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
