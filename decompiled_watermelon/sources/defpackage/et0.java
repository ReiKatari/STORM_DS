package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: et0  reason: default package */
/* loaded from: classes.dex */
public final class et0 implements aj2, bj2, cj2, dj2, ej2, fj2, gj2, hj2, li2, ni2, pi2, qi2, ri2, si2, ti2, ui2, vi2, xi2, yi2 {
    public final int A;
    public final boolean B;
    public wi2 L;
    public m55 R;
    public ArrayList X;

    public et0(int i, boolean z, wi2 wi2Var) {
        this.A = i;
        this.B = z;
        this.L = wi2Var;
    }

    public final Object a(tu0 tu0Var, int i) {
        int G;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(this.A);
        m(sk2Var);
        if (sk2Var.f(this)) {
            G = ct3.G(2, 0);
        } else {
            G = ct3.G(1, 0);
        }
        int i2 = i | G;
        wi2 wi2Var = this.L;
        l07.q(2, wi2Var);
        Object j = ((aj2) wi2Var).j(sk2Var, Integer.valueOf(i2));
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new dt0(2, this, et0.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return j;
    }

    public final Object b(Object obj, tu0 tu0Var, int i) {
        int G;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(this.A);
        m(sk2Var);
        if (sk2Var.f(this)) {
            G = ct3.G(2, 1);
        } else {
            G = ct3.G(1, 1);
        }
        wi2 wi2Var = this.L;
        l07.q(3, wi2Var);
        Object i2 = ((bj2) wi2Var).i(obj, sk2Var, Integer.valueOf(G | i));
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new vo(i, 2, this, obj);
        }
        return i2;
    }

    public final Object d(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, tu0 tu0Var, int i) {
        int G;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(this.A);
        m(sk2Var);
        if (sk2Var.f(this)) {
            G = ct3.G(2, 6);
        } else {
            G = ct3.G(1, 6);
        }
        wi2 wi2Var = this.L;
        l07.q(8, wi2Var);
        Object e = ((gj2) wi2Var).e(obj, bool, obj2, obj3, obj4, sk2Var, Integer.valueOf(i | G));
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new f5(this, obj, bool, obj2, obj3, obj4, i);
        }
        return e;
    }

    @Override // defpackage.gj2
    public final /* bridge */ /* synthetic */ Object e(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, sk2 sk2Var, Integer num) {
        return d(obj, bool, obj2, obj3, obj4, sk2Var, num.intValue());
    }

    public final Object g(Object obj, Object obj2, tu0 tu0Var, int i) {
        int G;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(this.A);
        m(sk2Var);
        if (sk2Var.f(this)) {
            G = ct3.G(2, 2);
        } else {
            G = ct3.G(1, 2);
        }
        wi2 wi2Var = this.L;
        l07.q(4, wi2Var);
        Object q = ((cj2) wi2Var).q(obj, obj2, sk2Var, Integer.valueOf(G | i));
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(this, obj, obj2, i);
        }
        return q;
    }

    @Override // defpackage.ej2
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return l(obj, obj2, obj3, obj4, (tu0) obj5, ((Number) obj6).intValue());
    }

    @Override // defpackage.bj2
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3) {
        return b(obj, (tu0) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.aj2
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2) {
        return a((tu0) obj, ((Number) obj2).intValue());
    }

    public final Object k(Object obj, Object obj2, Object obj3, tu0 tu0Var, int i) {
        int G;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(this.A);
        m(sk2Var);
        if (sk2Var.f(this)) {
            G = ct3.G(2, 3);
        } else {
            G = ct3.G(1, 3);
        }
        wi2 wi2Var = this.L;
        l07.q(5, wi2Var);
        Object o = ((dj2) wi2Var).o(obj, obj2, obj3, sk2Var, Integer.valueOf(G | i));
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new rz(this, obj, obj2, obj3, i, 2);
        }
        return o;
    }

    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, tu0 tu0Var, int i) {
        int G;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(this.A);
        m(sk2Var);
        if (sk2Var.f(this)) {
            G = ct3.G(2, 4);
        } else {
            G = ct3.G(1, 4);
        }
        wi2 wi2Var = this.L;
        l07.q(6, wi2Var);
        Object h = ((ej2) wi2Var).h(obj, obj2, obj3, obj4, sk2Var, Integer.valueOf(i | G));
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new r4(this, obj, obj2, obj3, obj4, i, 2);
        }
        return h;
    }

    public final void m(tu0 tu0Var) {
        m55 x;
        if (this.B && (x = ((sk2) tu0Var).x()) != null) {
            x.b |= 1;
            m55 m55Var = this.R;
            if (m55Var != null && m55Var.a() && m55Var != x && !b53.x(m55Var.c, x.c)) {
                ArrayList arrayList = this.X;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.X = arrayList2;
                    arrayList2.add(x);
                    return;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    m55 m55Var2 = (m55) arrayList.get(i);
                    if (m55Var2 == null || !m55Var2.a() || m55Var2 == x || b53.x(m55Var2.c, x.c)) {
                        arrayList.set(i, x);
                        return;
                    }
                }
                arrayList.add(x);
                return;
            }
            this.R = x;
        }
    }

    @Override // defpackage.dj2
    public final /* bridge */ /* synthetic */ Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return k(obj, obj2, obj3, (tu0) obj4, ((Number) obj5).intValue());
    }

    @Override // defpackage.cj2
    public final /* bridge */ /* synthetic */ Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        return g(obj, obj2, (tu0) obj3, ((Number) obj4).intValue());
    }
}
