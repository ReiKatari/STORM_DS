package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ut0  reason: default package */
/* loaded from: classes.dex */
public final class ut0 {
    public final vs4 a;
    public final vs4 b;
    public final vs4 c;
    public final vs4 d;
    public final vs4 e;
    public final vs4 f;
    public final vs4 g;
    public final vs4 h;
    public final vs4 i;
    public final vs4 j;
    public final vs4 k;
    public final vs4 l;
    public final vs4 m;

    public ut0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        kt0 kt0Var = new kt0(j);
        xd5 xd5Var = xd5.s0;
        this.a = new vs4(kt0Var, xd5Var);
        this.b = new vs4(new kt0(j2), xd5Var);
        this.c = new vs4(new kt0(j3), xd5Var);
        this.d = new vs4(new kt0(j4), xd5Var);
        this.e = new vs4(new kt0(j5), xd5Var);
        this.f = new vs4(new kt0(j6), xd5Var);
        this.g = new vs4(new kt0(j7), xd5Var);
        this.h = new vs4(new kt0(j8), xd5Var);
        this.i = new vs4(new kt0(j9), xd5Var);
        this.j = new vs4(new kt0(j10), xd5Var);
        this.k = new vs4(new kt0(j11), xd5Var);
        this.l = new vs4(new kt0(j12), xd5Var);
        this.m = new vs4(Boolean.valueOf(z), xd5Var);
    }

    public final long a() {
        return ((kt0) this.e.getValue()).a;
    }

    public final long b() {
        return ((kt0) this.g.getValue()).a;
    }

    public final long c() {
        return ((kt0) this.j.getValue()).a;
    }

    public final long d() {
        return ((kt0) this.h.getValue()).a;
    }

    public final long e() {
        return ((kt0) this.i.getValue()).a;
    }

    public final long f() {
        return ((kt0) this.k.getValue()).a;
    }

    public final long g() {
        return ((kt0) this.a.getValue()).a;
    }

    public final long h() {
        return ((kt0) this.b.getValue()).a;
    }

    public final long i() {
        return ((kt0) this.c.getValue()).a;
    }

    public final long j() {
        return ((kt0) this.f.getValue()).a;
    }

    public final boolean k() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final String toString() {
        return "Colors(primary=" + ((Object) kt0.j(g())) + ", primaryVariant=" + ((Object) kt0.j(h())) + ", secondary=" + ((Object) kt0.j(i())) + ", secondaryVariant=" + ((Object) kt0.j(((kt0) this.d.getValue()).a)) + ", background=" + ((Object) kt0.j(a())) + ", surface=" + ((Object) kt0.j(j())) + ", error=" + ((Object) kt0.j(b())) + ", onPrimary=" + ((Object) kt0.j(d())) + ", onSecondary=" + ((Object) kt0.j(e())) + ", onBackground=" + ((Object) kt0.j(c())) + ", onSurface=" + ((Object) kt0.j(f())) + ", onError=" + ((Object) kt0.j(((kt0) this.l.getValue()).a)) + ", isLight=" + k() + ')';
    }
}
