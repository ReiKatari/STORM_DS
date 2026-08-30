package f2;

import u1.k1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x0 implements u1.v0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b1 f4807a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f4808b;

    public x0(b1 b1Var, boolean z10) {
        this.f4807a = b1Var;
        this.f4808b = z10;
    }

    @Override // u1.v0
    public final void b() {
        b1 b1Var = this.f4807a;
        b1Var.f4722r.setValue(null);
        b1Var.f4723s.setValue(null);
        b1Var.t(true);
    }

    @Override // u1.v0
    public final void c() {
        b1 b1Var = this.f4807a;
        b1Var.f4722r.setValue(null);
        b1Var.f4723s.setValue(null);
        b1Var.t(true);
    }

    @Override // u1.v0
    public final void d() {
        u1.c0 c0Var;
        k1 d4;
        boolean z10 = this.f4808b;
        if (z10) {
            c0Var = u1.c0.SelectionStart;
        } else {
            c0Var = u1.c0.SelectionEnd;
        }
        b1 b1Var = this.f4807a;
        b1Var.f4722r.setValue(c0Var);
        long a10 = i0.a(b1Var.l(z10));
        u1.p0 p0Var = b1Var.f4709d;
        if (p0Var != null && (d4 = p0Var.d()) != null) {
            long e6 = d4.e(a10);
            b1Var.f4719o = e6;
            b1Var.f4723s.setValue(new h3.b(e6));
            b1Var.f4721q = 0L;
            b1Var.f4724t = -1;
            u1.p0 p0Var2 = b1Var.f4709d;
            if (p0Var2 != null) {
                p0Var2.f13394q.setValue(Boolean.TRUE);
            }
            b1Var.t(false);
        }
    }

    @Override // u1.v0
    public final void e(long j2) {
        b1 b1Var = this.f4807a;
        long e6 = h3.b.e(b1Var.f4721q, j2);
        b1Var.f4721q = e6;
        b1Var.f4723s.setValue(new h3.b(h3.b.e(b1Var.f4719o, e6)));
        q4.x n10 = b1Var.n();
        h3.b i2 = b1Var.i();
        i2.getClass();
        b1.c(b1Var, n10, i2.f6050a, false, this.f4808b, w.f4804g, true);
        b1Var.t(false);
    }

    @Override // u1.v0
    public final void onCancel() {
    }

    @Override // u1.v0
    public final void a(long j2, a0.j jVar) {
    }
}
