package f1;

import androidx.preference.Preference;
import h1.j2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w1 implements j2 {

    /* renamed from: j  reason: collision with root package name */
    public static final p1.a0 f4668j = new p1.a0(28, new ai.l(14), new d1.x1(17));

    /* renamed from: a  reason: collision with root package name */
    public final n2.c1 f4669a;

    /* renamed from: f  reason: collision with root package name */
    public float f4674f;

    /* renamed from: b  reason: collision with root package name */
    public final n2.c1 f4670b = new n2.c1(0);

    /* renamed from: c  reason: collision with root package name */
    public final n2.c1 f4671c = new n2.c1(0);

    /* renamed from: d  reason: collision with root package name */
    public final j1.i f4672d = new j1.i();

    /* renamed from: e  reason: collision with root package name */
    public final n2.c1 f4673e = new n2.c1(Preference.DEFAULT_ORDER);

    /* renamed from: g  reason: collision with root package name */
    public final h1.n f4675g = new h1.n(new a2.c(14, this));

    /* renamed from: h  reason: collision with root package name */
    public final n2.e0 f4676h = n2.s.q(new mc.a(this) { // from class: f1.v1
        public final /* synthetic */ w1 B;

        {
            this.B = this;
        }

        @Override // mc.a
        public final Object b() {
            boolean z10;
            boolean z11;
            switch (r2) {
                case 0:
                    w1 w1Var = this.B;
                    if (w1Var.f4669a.g() < w1Var.f4673e.g()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                default:
                    if (this.B.f4669a.g() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return Boolean.valueOf(z11);
            }
        }
    });

    /* renamed from: i  reason: collision with root package name */
    public final n2.e0 f4677i = n2.s.q(new mc.a(this) { // from class: f1.v1
        public final /* synthetic */ w1 B;

        {
            this.B = this;
        }

        @Override // mc.a
        public final Object b() {
            boolean z10;
            boolean z11;
            switch (r2) {
                case 0:
                    w1 w1Var = this.B;
                    if (w1Var.f4669a.g() < w1Var.f4673e.g()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                default:
                    if (this.B.f4669a.g() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return Boolean.valueOf(z11);
            }
        }
    });

    public w1(int i2) {
        this.f4669a = new n2.c1(i2);
    }

    @Override // h1.j2
    public final boolean a() {
        return ((Boolean) this.f4677i.getValue()).booleanValue();
    }

    @Override // h1.j2
    public final boolean b() {
        return this.f4675g.b();
    }

    @Override // h1.j2
    public final Object c(f1 f1Var, mc.p pVar, cc.c cVar) {
        Object c4 = this.f4675g.c(f1Var, pVar, cVar);
        if (c4 == dc.a.COROUTINE_SUSPENDED) {
            return c4;
        }
        return yb.y.f14813a;
    }

    @Override // h1.j2
    public final boolean d() {
        return ((Boolean) this.f4676h.getValue()).booleanValue();
    }

    @Override // h1.j2
    public final float e(float f8) {
        return this.f4675g.e(f8);
    }
}
