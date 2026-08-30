package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hr0  reason: default package */
/* loaded from: classes.dex */
public final class hr0 {
    public final tj4 a;
    public final tj4 b;
    public final tj4 c;
    public final tj4 d;
    public final tj4 e;
    public final tj4 f;
    public final tj4 g;
    public final tj4 h;
    public final tj4 i;
    public final tj4 j;
    public final tj4 k;
    public final tj4 l;
    public final tj4 m;

    public hr0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        xq0 xq0Var = new xq0(j);
        k45 k45Var = k45.n0;
        this.a = new tj4(xq0Var, k45Var);
        this.b = new tj4(new xq0(j2), k45Var);
        this.c = new tj4(new xq0(j3), k45Var);
        this.d = new tj4(new xq0(j4), k45Var);
        this.e = new tj4(new xq0(j5), k45Var);
        this.f = new tj4(new xq0(j6), k45Var);
        this.g = new tj4(new xq0(j7), k45Var);
        this.h = new tj4(new xq0(j8), k45Var);
        this.i = new tj4(new xq0(j9), k45Var);
        this.j = new tj4(new xq0(j10), k45Var);
        this.k = new tj4(new xq0(j11), k45Var);
        this.l = new tj4(new xq0(j12), k45Var);
        this.m = new tj4(Boolean.valueOf(z), k45Var);
    }

    public final long a() {
        return ((xq0) this.e.getValue()).a;
    }

    public final long b() {
        return ((xq0) this.g.getValue()).a;
    }

    public final long c() {
        return ((xq0) this.j.getValue()).a;
    }

    public final long d() {
        return ((xq0) this.h.getValue()).a;
    }

    public final long e() {
        return ((xq0) this.i.getValue()).a;
    }

    public final long f() {
        return ((xq0) this.k.getValue()).a;
    }

    public final long g() {
        return ((xq0) this.a.getValue()).a;
    }

    public final long h() {
        return ((xq0) this.b.getValue()).a;
    }

    public final long i() {
        return ((xq0) this.c.getValue()).a;
    }

    public final long j() {
        return ((xq0) this.f.getValue()).a;
    }

    public final boolean k() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final String toString() {
        return "Colors(primary=" + ((Object) xq0.i(g())) + ", primaryVariant=" + ((Object) xq0.i(h())) + ", secondary=" + ((Object) xq0.i(i())) + ", secondaryVariant=" + ((Object) xq0.i(((xq0) this.d.getValue()).a)) + ", background=" + ((Object) xq0.i(a())) + ", surface=" + ((Object) xq0.i(j())) + ", error=" + ((Object) xq0.i(b())) + ", onPrimary=" + ((Object) xq0.i(d())) + ", onSecondary=" + ((Object) xq0.i(e())) + ", onBackground=" + ((Object) xq0.i(c())) + ", onSurface=" + ((Object) xq0.i(f())) + ", onError=" + ((Object) xq0.i(((xq0) this.l.getValue()).a)) + ", isLight=" + k() + ')';
    }
}
