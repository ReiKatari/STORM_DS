package f2;

import u1.k1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w0 implements u1.v0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b1 f4806a;

    public w0(b1 b1Var) {
        this.f4806a = b1Var;
    }

    @Override // u1.v0
    public final void a(long j2, a0.j jVar) {
        k1 d4;
        b1 b1Var = this.f4806a;
        long a10 = i0.a(b1Var.l(true));
        u1.p0 p0Var = b1Var.f4709d;
        if (p0Var != null && (d4 = p0Var.d()) != null) {
            long e6 = d4.e(a10);
            b1Var.f4719o = e6;
            b1Var.f4723s.setValue(new h3.b(e6));
            b1Var.f4721q = 0L;
            b1Var.f4722r.setValue(u1.c0.Cursor);
            b1Var.t(false);
        }
    }

    @Override // u1.v0
    public final void b() {
        b1 b1Var = this.f4806a;
        b1Var.f4722r.setValue(null);
        b1Var.f4723s.setValue(null);
    }

    @Override // u1.v0
    public final void c() {
        b1 b1Var = this.f4806a;
        b1Var.f4722r.setValue(null);
        b1Var.f4723s.setValue(null);
    }

    @Override // u1.v0
    public final void e(long j2) {
        k1 d4;
        q3.a aVar;
        b1 b1Var = this.f4806a;
        b1Var.f4721q = h3.b.e(b1Var.f4721q, j2);
        u1.p0 p0Var = b1Var.f4709d;
        if (p0Var != null && (d4 = p0Var.d()) != null) {
            b1Var.f4723s.setValue(new h3.b(h3.b.e(b1Var.f4719o, b1Var.f4721q)));
            q4.q qVar = b1Var.f4707b;
            h3.b i2 = b1Var.i();
            i2.getClass();
            int l10 = qVar.l(d4.b(i2.f6050a, true));
            long b10 = l4.i0.b(l10, l10);
            if (!l4.q0.b(b10, b1Var.n().f12277b)) {
                u1.p0 p0Var2 = b1Var.f4709d;
                if ((p0Var2 == null || ((Boolean) p0Var2.f13394q.getValue()).booleanValue()) && (aVar = b1Var.f4716k) != null) {
                    aVar.a(9);
                }
                b1Var.f4708c.k(b1.e(b1Var.n().f12276a, b10));
                b1Var.f4727w = new l4.q0(b10);
            }
        }
    }

    @Override // u1.v0
    public final void d() {
    }

    @Override // u1.v0
    public final void onCancel() {
    }
}
