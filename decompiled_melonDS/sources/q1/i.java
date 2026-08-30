package q1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements p1.q {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f12145a;

    public i(a0 a0Var) {
        this.f12145a = a0Var;
    }

    @Override // p1.q
    public final int a() {
        return this.f12145a.n();
    }

    @Override // p1.q
    public final int b() {
        a0 a0Var = this.f12145a;
        return Math.min(a0Var.n() - 1, ((g) zb.l.Z(a0Var.m().f12173a)).f12133a);
    }

    @Override // p1.q
    public final boolean c() {
        return !this.f12145a.m().f12173a.isEmpty();
    }

    @Override // p1.q
    public final int d() {
        int i2;
        a0 a0Var = this.f12145a;
        if (a0Var.m().f12173a.size() == 0) {
            return 0;
        }
        int o5 = p7.k.o(a0Var.m());
        int i10 = a0Var.m().f12174b + a0Var.m().f12175c;
        if (i10 == 0 || (i2 = o5 / i10) < 1) {
            return 1;
        }
        return i2;
    }

    @Override // p1.q
    public final int e() {
        return Math.max(0, this.f12145a.f12097e);
    }
}
