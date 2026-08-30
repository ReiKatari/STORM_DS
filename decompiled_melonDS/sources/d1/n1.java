package d1;

import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n1 implements s2 {
    public final w1 A;
    public final n2.f1 B;
    public final n2.f1 L;
    public final n2.f1 R;
    public q0 X;
    public h1 Y;
    public final n2.f1 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final n2.b1 f3612b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f3613c0;

    /* renamed from: d0  reason: collision with root package name */
    public final n2.f1 f3614d0;

    /* renamed from: e0  reason: collision with root package name */
    public p f3615e0;

    /* renamed from: f0  reason: collision with root package name */
    public final n2.d1 f3616f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f3617g0;

    /* renamed from: h0  reason: collision with root package name */
    public final a1 f3618h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ q1 f3619i0;

    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Map, java.lang.Object] */
    public n1(q1 q1Var, Object obj, p pVar, w1 w1Var) {
        this.f3619i0 = q1Var;
        this.A = w1Var;
        n2.f1 w10 = n2.s.w(obj);
        this.B = w10;
        Object obj2 = null;
        this.L = n2.s.w(d.q(7, null));
        this.R = n2.s.w(new h1(b(), w1Var, obj, w10.getValue(), pVar));
        this.Z = n2.s.w(Boolean.TRUE);
        this.f3612b0 = new n2.b1(-1.0f);
        this.f3614d0 = n2.s.w(obj);
        this.f3615e0 = pVar;
        this.f3616f0 = new n2.d1(a().c());
        Float f8 = (Float) h2.f3585b.get(w1Var);
        if (f8 != null) {
            float floatValue = f8.floatValue();
            p pVar2 = (p) w1Var.f3690a.k(obj);
            int b10 = pVar2.b();
            for (int i2 = 0; i2 < b10; i2++) {
                pVar2.e(i2, floatValue);
            }
            obj2 = this.A.f3691b.k(pVar2);
        }
        this.f3618h0 = d.q(3, obj2);
    }

    public final h1 a() {
        return (h1) this.R.getValue();
    }

    public final x b() {
        return (x) this.L.getValue();
    }

    public final void c(long j2) {
        if (this.f3612b0.g() == -1.0f) {
            this.f3617g0 = true;
            if (nc.k.a(a().f3577c, a().f3578d)) {
                e(a().f3577c);
                return;
            }
            e(a().b(j2));
            this.f3615e0 = a().f(j2);
        }
    }

    public final void e(Object obj) {
        this.f3614d0.setValue(obj);
    }

    public final void f(boolean z10, Object obj) {
        Object obj2;
        x b10;
        j b1Var;
        h1 h1Var = this.Y;
        if (h1Var != null) {
            obj2 = h1Var.f3577c;
        } else {
            obj2 = null;
        }
        n2.f1 f1Var = this.B;
        boolean a10 = nc.k.a(obj2, f1Var.getValue());
        n2.d1 d1Var = this.f3616f0;
        n2.f1 f1Var2 = this.R;
        if (a10) {
            f1Var2.setValue(new h1(this.f3618h0, this.A, obj, obj, this.f3615e0.c()));
            this.f3613c0 = true;
            d1Var.h(a().c());
            return;
        }
        if (z10 && !this.f3617g0) {
            if (b() instanceof a1) {
                b10 = b();
            } else {
                b10 = this.f3618h0;
            }
        } else {
            b10 = b();
        }
        q1 q1Var = this.f3619i0;
        long e6 = q1Var.e();
        n2.f1 f1Var3 = q1Var.f3656h;
        if (e6 <= 0) {
            b1Var = b10;
        } else {
            b1Var = new b1(b10, q1Var.e());
        }
        f1Var2.setValue(new h1(b1Var, this.A, obj, f1Var.getValue(), this.f3615e0));
        d1Var.h(a().c());
        this.f3613c0 = false;
        f1Var3.setValue(Boolean.TRUE);
        if (q1Var.g()) {
            z2.p pVar = q1Var.f3657i;
            int size = pVar.size();
            long j2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                n1 n1Var = (n1) pVar.get(i2);
                j2 = Math.max(j2, n1Var.f3616f0.g());
                n1Var.c(0L);
            }
            f1Var3.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, x xVar) {
        this.B.setValue(obj2);
        this.L.setValue(xVar);
        if (nc.k.a(a().f3578d, obj) && nc.k.a(a().f3577c, obj2)) {
            return;
        }
        f(false, obj);
    }

    @Override // n2.s2
    public final Object getValue() {
        return this.f3614d0.getValue();
    }

    public final void h(Object obj, x xVar) {
        Object value;
        Object obj2;
        if (this.f3613c0) {
            h1 h1Var = this.Y;
            if (h1Var != null) {
                obj2 = h1Var.f3577c;
            } else {
                obj2 = null;
            }
            if (nc.k.a(obj, obj2)) {
                return;
            }
        }
        n2.f1 f1Var = this.B;
        boolean a10 = nc.k.a(f1Var.getValue(), obj);
        n2.b1 b1Var = this.f3612b0;
        if (a10 && b1Var.g() == -1.0f) {
            return;
        }
        f1Var.setValue(obj);
        this.L.setValue(xVar);
        if (b1Var.g() == -3.0f) {
            value = obj;
        } else {
            value = this.f3614d0.getValue();
        }
        n2.f1 f1Var2 = this.Z;
        boolean z10 = true;
        f(!((Boolean) f1Var2.getValue()).booleanValue(), value);
        if (b1Var.g() != -3.0f) {
            z10 = false;
        }
        f1Var2.setValue(Boolean.valueOf(z10));
        if (b1Var.g() >= 0.0f) {
            long c4 = a().c();
            e(a().b(b1Var.g() * ((float) c4)));
        } else if (b1Var.g() == -3.0f) {
            e(obj);
        }
        this.f3613c0 = false;
        b1Var.h(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.f3614d0.getValue() + ", target: " + this.B.getValue() + ", spec: " + b();
    }
}
