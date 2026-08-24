package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h66  reason: default package */
/* loaded from: classes.dex */
public abstract class h66 {
    public static final String a = ga0.h("Schedulers");

    public static void a(dx7 dx7Var, q61 q61Var, List list) {
        if (list.size() > 0) {
            q61Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dx7Var.e(currentTimeMillis, ((yw7) it.next()).a);
            }
        }
    }

    public static void b(az0 az0Var, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            dx7 w = workDatabase.w();
            workDatabase.b();
            try {
                m16 m16Var = w.a;
                m16 m16Var2 = w.a;
                List list2 = (List) hv.Q(m16Var, true, false, new rk7(17));
                a(w, az0Var.d, list2);
                List list3 = (List) hv.Q(m16Var2, true, false, new mr3(az0Var.k));
                a(w, az0Var.d, list3);
                list3.addAll(list2);
                List list4 = (List) hv.Q(m16Var2, true, false, new rk7(20));
                workDatabase.p();
                workDatabase.f();
                if (list3.size() > 0) {
                    yw7[] yw7VarArr = (yw7[]) list3.toArray(new yw7[list3.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        e66 e66Var = (e66) it.next();
                        if (e66Var.c()) {
                            e66Var.e(yw7VarArr);
                        }
                    }
                }
                if (list4.size() > 0) {
                    yw7[] yw7VarArr2 = (yw7[]) list4.toArray(new yw7[list4.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        e66 e66Var2 = (e66) it2.next();
                        if (!e66Var2.c()) {
                            e66Var2.e(yw7VarArr2);
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
