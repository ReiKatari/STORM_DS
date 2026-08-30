package c1;

import java.util.ListIterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q1 implements n2.x1 {
    public final n2.f1 A = n2.s.w(Boolean.FALSE);
    public final n2.b1 B = new n2.b1(0.0f);
    public final n2.f1 L;
    public final n2.f1 R;
    public final n2.f1 X;
    public final n2.f1 Y;
    public final n2.f1 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final n2.f1 f2507b0;

    /* renamed from: c0  reason: collision with root package name */
    public final n2.f1 f2508c0;

    /* renamed from: d0  reason: collision with root package name */
    public i3.h f2509d0;

    /* renamed from: e0  reason: collision with root package name */
    public q1 f2510e0;

    /* renamed from: f0  reason: collision with root package name */
    public l1 f2511f0;

    /* renamed from: g0  reason: collision with root package name */
    public final n2.f1 f2512g0;

    public q1(p1 p1Var, i0 i0Var, z1 z1Var, w1 w1Var) {
        Boolean bool = Boolean.TRUE;
        this.L = n2.s.w(bool);
        this.R = n2.s.w(p1Var);
        this.X = n2.s.w(i0Var);
        this.Y = n2.s.w(t1.f2526b);
        this.Z = n2.s.w(bool);
        this.f2507b0 = n2.s.w(z1Var);
        this.f2508c0 = n2.s.w(w1Var);
        this.f2512g0 = n2.s.w(null);
    }

    @Override // n2.x1
    public final void a() {
        y1 y1Var = e().f2495b;
        y1Var.getClass();
        p1 e6 = e();
        e6.f2500g.add(this);
        e6.b();
        y1Var.f();
        z2.p pVar = y1Var.Z;
        ListIterator listIterator = pVar.listIterator();
        int i2 = 0;
        while (true) {
            a4.r rVar = (a4.r) listIterator;
            if (rVar.hasNext()) {
                q1 q1Var = (q1) rVar.next();
                p1 p1Var = null;
                if (q1Var == null) {
                    q1Var = null;
                }
                if (q1Var != null) {
                    p1Var = q1Var.e();
                }
                if (nc.k.a(p1Var, e())) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != pVar.size() - 1 && i2 != -1) {
            pVar.add(i2 + 1, this);
        } else {
            pVar.add(this);
        }
        e().f2496c.f();
    }

    @Override // n2.x1
    public final void c() {
        y1 y1Var = e().f2495b;
        y1Var.getClass();
        p1 e6 = e();
        e6.f2500g.remove(this);
        e6.f2501h.remove(this);
        e6.b();
        y1Var.f();
        y1Var.Z.remove(this);
        if (e6.f2500g.isEmpty()) {
            zc.x.v(e6.f2495b.B, null, null, new ah.u0(e6, this, null, 5), 3);
        }
        e().f2496c.f();
    }

    public final i0 d() {
        return (i0) this.X.getValue();
    }

    public final p1 e() {
        return (p1) this.R.getValue();
    }

    public final boolean f() {
        if (!d().b()) {
            if ((!e().f2496c.d().d() || e().f2496c.d().b()) && ((Boolean) this.Z.getValue()).booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean g() {
        if (f() && e().f2496c.d().d() && h() && ((Boolean) this.L.getValue()).booleanValue() && e().f2495b.b()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        w1 w1Var = (w1) this.f2508c0.getValue();
        if (((Boolean) this.A.getValue()).booleanValue()) {
            ((s1) w1Var.f2544b.getValue()).getClass();
            return true;
        }
        return false;
    }

    @Override // n2.x1
    public final void b() {
    }
}
