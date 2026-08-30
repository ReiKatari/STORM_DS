package q8;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import u1.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12354a = p8.v.g("Schedulers");

    public static void a(x8.u uVar, p8.x xVar, List list) {
        if (list.size() > 0) {
            xVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                uVar.e(currentTimeMillis, ((x8.p) it.next()).f14420a);
            }
        }
    }

    public static void b(p8.b bVar, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            x8.u w10 = workDatabase.w();
            workDatabase.b();
            try {
                k7.t tVar = w10.f14444a;
                k7.t tVar2 = w10.f14444a;
                List list2 = (List) r.K(tVar, true, false, new h1(18));
                a(w10, bVar.f11455d, list2);
                List list3 = (List) r.K(tVar2, true, false, new n1.t(bVar.f11462k));
                a(w10, bVar.f11455d, list3);
                list3.addAll(list2);
                List list4 = (List) r.K(tVar2, true, false, new h1(21));
                workDatabase.p();
                workDatabase.f();
                if (list3.size() > 0) {
                    x8.p[] pVarArr = (x8.p[]) list3.toArray(new x8.p[list3.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        f fVar = (f) it.next();
                        if (fVar.e()) {
                            fVar.c(pVarArr);
                        }
                    }
                }
                if (list4.size() > 0) {
                    x8.p[] pVarArr2 = (x8.p[]) list4.toArray(new x8.p[list4.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        f fVar2 = (f) it2.next();
                        if (!fVar2.e()) {
                            fVar2.c(pVarArr2);
                        }
                    }
                }
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            }
        }
    }
}
