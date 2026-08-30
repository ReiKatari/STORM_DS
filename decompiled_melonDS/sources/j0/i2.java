package j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i2 implements d0.h1 {

    /* renamed from: b  reason: collision with root package name */
    public final long f7220b;

    /* renamed from: c  reason: collision with root package name */
    public final d0.h1 f7221c;

    public i2(long j2, d0.h1 h1Var) {
        boolean z10;
        if (j2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7.m.g("Timeout must be non-negative.", z10);
        this.f7220b = j2;
        this.f7221c = h1Var;
    }

    @Override // d0.h1
    public final long a() {
        return this.f7220b;
    }

    @Override // d0.h1
    public final d0.g1 b(g0 g0Var) {
        d0.g1 b10 = this.f7221c.b(g0Var);
        long j2 = this.f7220b;
        if (j2 > 0 && g0Var.f7204b >= j2 - b10.f3385a) {
            return d0.g1.f3382d;
        }
        return b10;
    }
}
