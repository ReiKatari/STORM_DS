package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final y1 f2437a;

    /* renamed from: b  reason: collision with root package name */
    public final d1.q1 f2438b;

    /* renamed from: c  reason: collision with root package name */
    public final mc.a f2439c;

    /* renamed from: d  reason: collision with root package name */
    public final n2.f1 f2440d;

    /* renamed from: e  reason: collision with root package name */
    public final n2.f1 f2441e = n2.s.w(e0.f2414a);

    /* renamed from: f  reason: collision with root package name */
    public d1.x f2442f = j0.f2447a;

    /* renamed from: g  reason: collision with root package name */
    public final n2.f1 f2443g = n2.s.w(null);

    public i0(y1 y1Var, d1.q1 q1Var, d1.k1 k1Var, mc.a aVar) {
        this.f2437a = y1Var;
        this.f2438b = q1Var;
        this.f2439c = aVar;
        this.f2440d = n2.s.w(k1Var);
    }

    public final void a(h3.c cVar, h3.c cVar2, j1 j1Var) {
        d1.a1 q10;
        if (this.f2437a.b()) {
            n2.f1 f1Var = this.f2443g;
            if (((n2.s2) f1Var.getValue()) == null) {
                if (j1Var == null) {
                    j1Var = (j1) this.f2441e.getValue();
                }
                switch (j1Var.f2448a) {
                    case 0:
                        q10 = d1.d.q(3, d1.h2.f3584a);
                        break;
                    default:
                        q10 = c2.f2398a;
                        break;
                }
                this.f2442f = q10;
            }
            f1Var.setValue(((d1.k1) this.f2440d.getValue()).a(new g(2, this), new a4.q0(this, cVar2, cVar, 2)));
        }
    }

    public final boolean b() {
        return ((Boolean) this.f2438b.f3652d.getValue()).booleanValue();
    }

    public final h3.c c() {
        n2.s2 s2Var;
        h3.c cVar;
        if (this.f2437a.b() && (s2Var = (n2.s2) this.f2443g.getValue()) != null && (cVar = (h3.c) s2Var.getValue()) != null) {
            long j2 = ((h3.b) this.f2439c.b()).f6050a;
            if (!h3.b.b(j2, 0L)) {
                return cVar.i(j2);
            }
            return cVar;
        }
        return null;
    }
}
