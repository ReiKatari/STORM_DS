package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bv5  reason: default package */
/* loaded from: classes.dex */
public abstract class bv5 {
    public static final String a = y70.h("Schedulers");

    public static void a(di7 di7Var, hm1 hm1Var, List list) {
        if (list.size() > 0) {
            hm1Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                di7Var.e(currentTimeMillis, ((xh7) it.next()).a);
            }
        }
    }

    public static void b(ew0 ew0Var, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            di7 w = workDatabase.w();
            workDatabase.b();
            try {
                sq5 sq5Var = w.a;
                sq5 sq5Var2 = w.a;
                List list2 = (List) mh7.X(sq5Var, true, false, new s67(29));
                a(w, ew0Var.d, list2);
                List list3 = (List) mh7.X(sq5Var2, true, false, new mk3(ew0Var.k));
                a(w, ew0Var.d, list3);
                list3.addAll(list2);
                List list4 = (List) mh7.X(sq5Var2, true, false, new ci7(2));
                workDatabase.p();
                workDatabase.f();
                if (list3.size() > 0) {
                    xh7[] xh7VarArr = (xh7[]) list3.toArray(new xh7[list3.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        zu5 zu5Var = (zu5) it.next();
                        if (zu5Var.e()) {
                            zu5Var.c(xh7VarArr);
                        }
                    }
                }
                if (list4.size() > 0) {
                    xh7[] xh7VarArr2 = (xh7[]) list4.toArray(new xh7[list4.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        zu5 zu5Var2 = (zu5) it2.next();
                        if (!zu5Var2.e()) {
                            zu5Var2.c(xh7VarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }
}
