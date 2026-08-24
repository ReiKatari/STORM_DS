package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zv0  reason: default package */
/* loaded from: classes.dex */
public final class zv0 implements eo2, fo2, go2, ho2, io2, jo2, ko2, lo2, pn2, rn2, tn2, un2, vn2, wn2, xn2, yn2, zn2, bo2, co2 {
    public final int A;
    public final boolean B;
    public ao2 L;
    public cf5 R;
    public ArrayList X;

    public zv0(int i, boolean z, ao2 ao2Var) {
        this.A = i;
        this.B = z;
        this.L = ao2Var;
    }

    public final Object a(px0 px0Var, int i) {
        int n;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(this.A);
        k(xq2Var);
        if (xq2Var.f(this)) {
            n = n16.n(2, 0);
        } else {
            n = n16.n(1, 0);
        }
        int i2 = i | n;
        ao2 ao2Var = this.L;
        ge7.p(2, ao2Var);
        Object o = ((eo2) ao2Var).o(xq2Var, Integer.valueOf(i2));
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new yv0(2, this, zv0.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return o;
    }

    public final Object b(Object obj, px0 px0Var, int i) {
        int n;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(this.A);
        k(xq2Var);
        if (xq2Var.f(this)) {
            n = n16.n(2, 1);
        } else {
            n = n16.n(1, 1);
        }
        ao2 ao2Var = this.L;
        ge7.p(3, ao2Var);
        Object e = ((fo2) ao2Var).e(obj, xq2Var, Integer.valueOf(n | i));
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new hp(this, i, 2, obj);
        }
        return e;
    }

    @Override // defpackage.fo2
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
        return b(obj, (px0) obj2, ((Number) obj3).intValue());
    }

    public final Object f(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, px0 px0Var, int i) {
        int n;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(this.A);
        k(xq2Var);
        if (xq2Var.f(this)) {
            n = n16.n(2, 6);
        } else {
            n = n16.n(1, 6);
        }
        ao2 ao2Var = this.L;
        ge7.p(8, ao2Var);
        Object m = ((ko2) ao2Var).m(obj, bool, obj2, obj3, obj4, xq2Var, Integer.valueOf(i | n));
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new e5(this, obj, bool, obj2, obj3, obj4, i);
        }
        return m;
    }

    public final Object h(Object obj, Object obj2, px0 px0Var, int i) {
        int n;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(this.A);
        k(xq2Var);
        if (xq2Var.f(this)) {
            n = n16.n(2, 2);
        } else {
            n = n16.n(1, 2);
        }
        ao2 ao2Var = this.L;
        ge7.p(4, ao2Var);
        Object l = ((go2) ao2Var).l(obj, obj2, xq2Var, Integer.valueOf(n | i));
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(this, obj, obj2, i);
        }
        return l;
    }

    public final Object i(Object obj, Object obj2, Object obj3, px0 px0Var, int i) {
        int n;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(this.A);
        k(xq2Var);
        if (xq2Var.f(this)) {
            n = n16.n(2, 3);
        } else {
            n = n16.n(1, 3);
        }
        ao2 ao2Var = this.L;
        ge7.p(5, ao2Var);
        Object p = ((ho2) ao2Var).p(obj, obj2, obj3, xq2Var, Integer.valueOf(n | i));
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new i10(this, obj, obj2, obj3, i, 2);
        }
        return p;
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, px0 px0Var, int i) {
        int n;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(this.A);
        k(xq2Var);
        if (xq2Var.f(this)) {
            n = n16.n(2, 4);
        } else {
            n = n16.n(1, 4);
        }
        ao2 ao2Var = this.L;
        ge7.p(6, ao2Var);
        Object n2 = ((io2) ao2Var).n(obj, obj2, obj3, obj4, xq2Var, Integer.valueOf(i | n));
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new r4(this, obj, obj2, obj3, obj4, i, 2);
        }
        return n2;
    }

    public final void k(px0 px0Var) {
        cf5 A;
        if (this.B && (A = ((xq2) px0Var).A()) != null) {
            A.b |= 1;
            cf5 cf5Var = this.R;
            if (cf5Var != null && cf5Var.a() && cf5Var != A && !nb3.k(cf5Var.c, A.c)) {
                ArrayList arrayList = this.X;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.X = arrayList2;
                    arrayList2.add(A);
                    return;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    cf5 cf5Var2 = (cf5) arrayList.get(i);
                    if (cf5Var2 == null || !cf5Var2.a() || cf5Var2 == A || nb3.k(cf5Var2.c, A.c)) {
                        arrayList.set(i, A);
                        return;
                    }
                }
                arrayList.add(A);
                return;
            }
            this.R = A;
        }
    }

    @Override // defpackage.go2
    public final /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        return h(obj, obj2, (px0) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.ko2
    public final /* bridge */ /* synthetic */ Object m(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, xq2 xq2Var, Integer num) {
        return f(obj, bool, obj2, obj3, obj4, xq2Var, num.intValue());
    }

    @Override // defpackage.io2
    public final /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return j(obj, obj2, obj3, obj4, (px0) obj5, ((Number) obj6).intValue());
    }

    @Override // defpackage.eo2
    public final /* bridge */ /* synthetic */ Object o(Object obj, Object obj2) {
        return a((px0) obj, ((Number) obj2).intValue());
    }

    @Override // defpackage.ho2
    public final /* bridge */ /* synthetic */ Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return i(obj, obj2, obj3, (px0) obj4, ((Number) obj5).intValue());
    }
}
