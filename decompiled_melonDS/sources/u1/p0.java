package u1;

import b4.r2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 {
    public final n2.f1 A;
    public final n2.f1 B;

    /* renamed from: a  reason: collision with root package name */
    public u0 f13379a;

    /* renamed from: b  reason: collision with root package name */
    public final n2.p1 f13380b;

    /* renamed from: c  reason: collision with root package name */
    public final r2 f13381c;

    /* renamed from: d  reason: collision with root package name */
    public final p1.a0 f13382d;

    /* renamed from: e  reason: collision with root package name */
    public q4.d0 f13383e;

    /* renamed from: f  reason: collision with root package name */
    public final n2.f1 f13384f;

    /* renamed from: g  reason: collision with root package name */
    public final n2.f1 f13385g;

    /* renamed from: h  reason: collision with root package name */
    public y3.z f13386h;

    /* renamed from: i  reason: collision with root package name */
    public final n2.f1 f13387i;

    /* renamed from: j  reason: collision with root package name */
    public l4.h f13388j;

    /* renamed from: k  reason: collision with root package name */
    public final n2.f1 f13389k;

    /* renamed from: l  reason: collision with root package name */
    public final n2.f1 f13390l;
    public final n2.f1 m;

    /* renamed from: n  reason: collision with root package name */
    public final n2.f1 f13391n;

    /* renamed from: o  reason: collision with root package name */
    public final n2.f1 f13392o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f13393p;

    /* renamed from: q  reason: collision with root package name */
    public final n2.f1 f13394q;

    /* renamed from: r  reason: collision with root package name */
    public final m0 f13395r;

    /* renamed from: s  reason: collision with root package name */
    public final n2.f1 f13396s;

    /* renamed from: t  reason: collision with root package name */
    public final n2.f1 f13397t;

    /* renamed from: u  reason: collision with root package name */
    public mc.l f13398u;

    /* renamed from: v  reason: collision with root package name */
    public final s f13399v;

    /* renamed from: w  reason: collision with root package name */
    public final s f13400w;

    /* renamed from: x  reason: collision with root package name */
    public final s f13401x;

    /* renamed from: y  reason: collision with root package name */
    public final cd.h1 f13402y;

    /* renamed from: z  reason: collision with root package name */
    public long f13403z;

    public p0(u0 u0Var, n2.p1 p1Var, r2 r2Var) {
        this.f13379a = u0Var;
        this.f13380b = p1Var;
        this.f13381c = r2Var;
        p1.a0 a0Var = new p1.a0(4);
        l4.h hVar = l4.j.f8826a;
        long j2 = l4.q0.f8883b;
        q4.x xVar = new q4.x(hVar, j2, (l4.q0) null);
        a0Var.B = xVar;
        a0Var.L = new com.google.android.material.datepicker.n(hVar, xVar.f12277b);
        this.f13382d = a0Var;
        Boolean bool = Boolean.FALSE;
        this.f13384f = n2.s.w(bool);
        this.f13385g = n2.s.w(new x4.f(0));
        this.f13387i = n2.s.w(null);
        this.f13389k = n2.s.w(d0.None);
        this.f13390l = n2.s.w(bool);
        this.m = n2.s.w(bool);
        this.f13391n = n2.s.w(bool);
        this.f13392o = n2.s.w(bool);
        this.f13393p = true;
        this.f13394q = n2.s.w(Boolean.TRUE);
        this.f13395r = new m0(r2Var);
        this.f13396s = n2.s.w(bool);
        this.f13397t = n2.s.w(bool);
        this.f13398u = new od.x(23);
        this.f13399v = new s(this, 2);
        this.f13400w = new s(this, 3);
        this.f13401x = new s(this, 4);
        this.f13402y = i3.z.f();
        this.f13403z = i3.s.f6687h;
        this.A = n2.s.w(new l4.q0(j2));
        this.B = n2.s.w(new l4.q0(j2));
    }

    public final d0 a() {
        return (d0) this.f13389k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f13384f.getValue()).booleanValue();
    }

    public final y3.z c() {
        y3.z zVar = this.f13386h;
        if (zVar != null && zVar.U()) {
            return zVar;
        }
        return null;
    }

    public final k1 d() {
        return (k1) this.f13387i.getValue();
    }

    public final void e(long j2) {
        this.B.setValue(new l4.q0(j2));
    }

    public final void f(long j2) {
        this.A.setValue(new l4.q0(j2));
    }
}
