package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jt3  reason: default package */
/* loaded from: classes.dex */
public final class jt3 {
    public final vs4 A;
    public final vs4 B;
    public d17 a;
    public final cf5 b;
    public final xm6 c;
    public final yc1 d;
    public t37 e;
    public final vs4 f;
    public final vs4 g;
    public jk3 h;
    public final vs4 i;
    public fp j;
    public final vs4 k;
    public final vs4 l;
    public final vs4 m;
    public final vs4 n;
    public final vs4 o;
    public boolean p;
    public final vs4 q;
    public final uh3 r;
    public final vs4 s;
    public final vs4 t;
    public qn2 u;
    public final w51 v;
    public final w51 w;
    public final w51 x;
    public final aj y;
    public long z;

    /* JADX WARN: Type inference failed for: r8v1, types: [yc1, java.lang.Object] */
    public jt3(d17 d17Var, cf5 cf5Var, xm6 xm6Var) {
        this.a = d17Var;
        this.b = cf5Var;
        this.c = xm6Var;
        ?? obj = new Object();
        fp fpVar = gp.a;
        long j = k47.b;
        c37 c37Var = new c37(fpVar, j, (k47) null);
        obj.A = c37Var;
        obj.B = new gs1(fpVar, c37Var.b);
        this.d = obj;
        Boolean bool = Boolean.FALSE;
        this.f = np2.Y(bool);
        this.g = np2.Y(new om1(RecyclerView.B1));
        this.i = np2.Y(null);
        this.k = np2.Y(hv2.None);
        this.l = np2.Y(bool);
        this.m = np2.Y(bool);
        this.n = np2.Y(bool);
        this.o = np2.Y(bool);
        this.p = true;
        this.q = np2.Y(Boolean.TRUE);
        this.r = new uh3(xm6Var);
        this.s = np2.Y(bool);
        this.t = np2.Y(bool);
        this.u = new v83(17);
        this.v = new w51(this, 1);
        this.w = new w51(this, 2);
        this.x = new w51(this, 3);
        this.y = nc1.t();
        this.z = kt0.h;
        this.A = np2.Y(new k47(j));
        this.B = np2.Y(new k47(j));
    }

    public final hv2 a() {
        return (hv2) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final jk3 c() {
        jk3 jk3Var = this.h;
        if (jk3Var != null && jk3Var.t()) {
            return jk3Var;
        }
        return null;
    }

    public final b47 d() {
        return (b47) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new k47(j));
    }

    public final void f(long j) {
        this.A.setValue(new k47(j));
    }
}
