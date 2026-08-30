package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hm3  reason: default package */
/* loaded from: classes.dex */
public final class hm3 {
    public final tj4 A;
    public final tj4 B;
    public so6 a;
    public final m55 b;
    public final ib6 c;
    public final k91 d;
    public er6 e;
    public final tj4 f;
    public final tj4 g;
    public rd3 h;
    public final tj4 i;
    public to j;
    public final tj4 k;
    public final tj4 l;
    public final tj4 m;
    public final tj4 n;
    public final tj4 o;
    public boolean p;
    public final tj4 q;
    public final cb3 r;
    public final tj4 s;
    public final tj4 t;
    public mi2 u;
    public final o21 v;
    public final o21 w;
    public final o21 x;
    public final oi y;
    public long z;

    /* JADX WARN: Type inference failed for: r8v1, types: [k91, java.lang.Object] */
    public hm3(so6 so6Var, m55 m55Var, ib6 ib6Var) {
        this.a = so6Var;
        this.b = m55Var;
        this.c = ib6Var;
        ?? obj = new Object();
        to toVar = uo.a;
        long j = vr6.b;
        oq6 oq6Var = new oq6(toVar, j, (vr6) null);
        obj.A = oq6Var;
        obj.B = new xn1(toVar, oq6Var.b);
        this.d = obj;
        Boolean bool = Boolean.FALSE;
        this.f = me2.G(bool);
        this.g = me2.G(new ji1(RecyclerView.A1));
        this.i = me2.G(null);
        this.k = me2.G(gp2.None);
        this.l = me2.G(bool);
        this.m = me2.G(bool);
        this.n = me2.G(bool);
        this.o = me2.G(bool);
        this.p = true;
        this.q = me2.G(Boolean.TRUE);
        this.r = new cb3(ib6Var);
        this.s = me2.G(bool);
        this.t = me2.G(bool);
        this.u = new gi3(5);
        this.v = new o21(this, 1);
        this.w = new o21(this, 2);
        this.x = new o21(this, 3);
        this.y = dk7.e();
        this.z = xq0.h;
        this.A = me2.G(new vr6(j));
        this.B = me2.G(new vr6(j));
    }

    public final gp2 a() {
        return (gp2) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final rd3 c() {
        rd3 rd3Var = this.h;
        if (rd3Var != null && rd3Var.c0()) {
            return rd3Var;
        }
        return null;
    }

    public final mr6 d() {
        return (mr6) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new vr6(j));
    }

    public final void f(long j) {
        this.A.setValue(new vr6(j));
    }
}
