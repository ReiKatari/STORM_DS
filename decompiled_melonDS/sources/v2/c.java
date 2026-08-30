package v2;

import ai.y0;
import d1.r1;
import g2.o3;
import h1.e2;
import java.util.ArrayList;
import mc.m;
import mc.n;
import mc.p;
import mc.q;
import mc.r;
import mc.s;
import mc.t;
import mc.u;
import mc.v;
import mc.w;
import n2.p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements p, q, r, s, t, u, v, w, mc.b, mc.c, mc.e, mc.f, mc.g, mc.h, mc.i, mc.j, mc.k, m, n {
    public final int A;
    public final boolean B;
    public yb.d L;
    public p1 R;
    public ArrayList X;

    public c(int i2, boolean z10, yb.d dVar) {
        this.A = i2;
        this.B = z10;
        this.L = dVar;
    }

    public final Object a(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, n2.m mVar, int i2) {
        int a10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(this.A);
        n(rVar);
        if (rVar.f(this)) {
            a10 = h.a(2, 6);
        } else {
            a10 = h.a(1, 6);
        }
        yb.d dVar = this.L;
        nc.w.b(8, dVar);
        Object q10 = ((v) dVar).q(obj, bool, obj2, obj3, obj4, rVar, Integer.valueOf(i2 | a10));
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new o3(this, obj, bool, obj2, obj3, obj4, i2);
        }
        return q10;
    }

    @Override // mc.t
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return e(obj, obj2, obj3, obj4, (n2.m) obj5, ((Number) obj6).intValue());
    }

    public final Object e(Object obj, Object obj2, Object obj3, Object obj4, n2.m mVar, int i2) {
        int a10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(this.A);
        n(rVar);
        if (rVar.f(this)) {
            a10 = h.a(2, 4);
        } else {
            a10 = h.a(1, 4);
        }
        yb.d dVar = this.L;
        nc.w.b(6, dVar);
        Object d4 = ((t) dVar).d(obj, obj2, obj3, obj4, rVar, Integer.valueOf(a10 | i2));
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new r1(this, obj, obj2, obj3, obj4, i2);
        }
        return d4;
    }

    public final Object f(Object obj, Object obj2, Object obj3, n2.m mVar, int i2) {
        int a10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(this.A);
        n(rVar);
        if (rVar.f(this)) {
            a10 = h.a(2, 3);
        } else {
            a10 = h.a(1, 3);
        }
        yb.d dVar = this.L;
        nc.w.b(5, dVar);
        Object l10 = ((s) dVar).l(obj, obj2, obj3, rVar, Integer.valueOf(a10 | i2));
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new y0(this, obj, obj2, obj3, i2, 6);
        }
        return l10;
    }

    public final Object g(Object obj, Object obj2, n2.m mVar, int i2) {
        int a10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(this.A);
        n(rVar);
        if (rVar.f(this)) {
            a10 = h.a(2, 2);
        } else {
            a10 = h.a(1, 2);
        }
        yb.d dVar = this.L;
        nc.w.b(4, dVar);
        Object r5 = ((r) dVar).r(obj, obj2, rVar, Integer.valueOf(a10 | i2));
        p1 r10 = rVar.r();
        if (r10 != null) {
            r10.f9983d = new b2.f(this, obj, obj2, i2);
        }
        return r5;
    }

    public final Object h(Object obj, n2.m mVar, int i2) {
        int a10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(this.A);
        n(rVar);
        if (rVar.f(this)) {
            a10 = h.a(2, 1);
        } else {
            a10 = h.a(1, 1);
        }
        yb.d dVar = this.L;
        nc.w.b(3, dVar);
        Object i10 = ((q) dVar).i(obj, rVar, Integer.valueOf(a10 | i2));
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.r(this, obj, i2, 13);
        }
        return i10;
    }

    @Override // mc.q
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3) {
        return h(obj, (n2.m) obj2, ((Number) obj3).intValue());
    }

    @Override // mc.p
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2) {
        return m((n2.m) obj, ((Number) obj2).intValue());
    }

    @Override // mc.s
    public final /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return f(obj, obj2, obj3, (n2.m) obj4, ((Number) obj5).intValue());
    }

    public final Object m(n2.m mVar, int i2) {
        int a10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(this.A);
        n(rVar);
        if (rVar.f(this)) {
            a10 = h.a(2, 0);
        } else {
            a10 = h.a(1, 0);
        }
        int i10 = i2 | a10;
        yb.d dVar = this.L;
        nc.w.b(2, dVar);
        Object j2 = ((p) dVar).j(rVar, Integer.valueOf(i10));
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new e2(2, this, c.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 1);
        }
        return j2;
    }

    public final void n(n2.m mVar) {
        n2.r rVar;
        p1 x9;
        if (this.B && (x9 = (rVar = (n2.r) mVar).x()) != null) {
            rVar.getClass();
            x9.f9981b |= 1;
            if (h.d(this.R, x9)) {
                this.R = x9;
                return;
            }
            ArrayList arrayList = this.X;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                this.X = arrayList2;
                arrayList2.add(x9);
                return;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (h.d((p1) arrayList.get(i2), x9)) {
                    arrayList.set(i2, x9);
                    return;
                }
            }
            arrayList.add(x9);
        }
    }

    @Override // mc.v
    public final /* bridge */ /* synthetic */ Object q(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, n2.r rVar, Integer num) {
        return a(obj, bool, obj2, obj3, obj4, rVar, num.intValue());
    }

    @Override // mc.r
    public final /* bridge */ /* synthetic */ Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        return g(obj, obj2, (n2.m) obj3, ((Number) obj4).intValue());
    }
}
