package x8;

import g2.z1;
import java.util.Iterator;
import java.util.List;
import p8.e0;
import u1.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final k7.t f14444a;

    /* renamed from: b  reason: collision with root package name */
    public final he.c f14445b = new he.c(18);

    public u(k7.t tVar) {
        this.f14444a = tVar;
    }

    public final void a(t7.a aVar, a1.e eVar) {
        a1.b bVar = (a1.b) eVar.keySet();
        a1.e eVar2 = bVar.A;
        if (eVar2.isEmpty()) {
            return;
        }
        if (eVar.L > 999) {
            p7.k.w(eVar, new t(this, aVar, 0));
            return;
        }
        StringBuilder t5 = w.d.t("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        p7.o.b(t5, eVar2.L);
        t5.append(")");
        t7.c T = aVar.T(t5.toString());
        Iterator it = bVar.iterator();
        int i2 = 1;
        while (true) {
            a1.a aVar2 = (a1.a) it;
            if (aVar2.hasNext()) {
                T.C(i2, (String) aVar2.next());
                i2++;
            } else {
                try {
                    break;
                } finally {
                    T.close();
                }
            }
        }
        int s10 = p7.m.s(T, "work_spec_id");
        if (s10 == -1) {
            return;
        }
        while (T.N()) {
            List list = (List) eVar.get(T.n(s10));
            if (list != null) {
                byte[] blob = T.getBlob(0);
                p8.h hVar = p8.h.f11493b;
                list.add(p7.j.v(blob));
            }
        }
    }

    public final void b(t7.a aVar, a1.e eVar) {
        a1.b bVar = (a1.b) eVar.keySet();
        a1.e eVar2 = bVar.A;
        if (eVar2.isEmpty()) {
            return;
        }
        if (eVar.L > 999) {
            p7.k.w(eVar, new t(this, aVar, 1));
            return;
        }
        StringBuilder t5 = w.d.t("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        p7.o.b(t5, eVar2.L);
        t5.append(")");
        t7.c T = aVar.T(t5.toString());
        Iterator it = bVar.iterator();
        int i2 = 1;
        while (true) {
            a1.a aVar2 = (a1.a) it;
            if (aVar2.hasNext()) {
                T.C(i2, (String) aVar2.next());
                i2++;
            } else {
                try {
                    break;
                } finally {
                    T.close();
                }
            }
        }
        int s10 = p7.m.s(T, "work_spec_id");
        if (s10 == -1) {
            return;
        }
        while (T.N()) {
            List list = (List) eVar.get(T.n(s10));
            if (list != null) {
                list.add(T.n(0));
            }
        }
    }

    public final e0 c(String str) {
        str.getClass();
        return (e0) q8.r.K(this.f14444a, true, false, new z1(str, 13));
    }

    public final p d(String str) {
        str.getClass();
        return (p) q8.r.K(this.f14444a, true, false, new z1(str, 12));
    }

    public final void e(long j2, String str) {
        str.getClass();
        ((Number) q8.r.K(this.f14444a, false, true, new r(str, 0, j2))).intValue();
    }

    public final void f(int i2, String str) {
        str.getClass();
        q8.r.K(this.f14444a, false, true, new g(str, i2, 1));
    }

    public final void g(long j2, String str) {
        str.getClass();
        q8.r.K(this.f14444a, false, true, new r(str, 1, j2));
    }

    public final void h(e0 e0Var, String str) {
        e0Var.getClass();
        str.getClass();
        ((Number) q8.r.K(this.f14444a, false, true, new l1(9, e0Var, str))).intValue();
    }

    public final void i(int i2, String str) {
        str.getClass();
        q8.r.K(this.f14444a, false, true, new g(i2, str));
    }
}
