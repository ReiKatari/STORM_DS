package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ph4  reason: default package */
/* loaded from: classes.dex */
public final class ph4 implements vi3 {
    public final ya1 a;

    public ph4(ya1 ya1Var) {
        this.a = ya1Var;
    }

    @Override // defpackage.vi3
    public final int a() {
        return this.a.n();
    }

    @Override // defpackage.vi3
    public final int b() {
        ya1 ya1Var = this.a;
        return Math.min(ya1Var.n() - 1, ((xv3) tq0.T0(ya1Var.m().a)).a);
    }

    @Override // defpackage.vi3
    public final boolean c() {
        return !this.a.m().a.isEmpty();
    }

    @Override // defpackage.vi3
    public final int d() {
        int i;
        ya1 ya1Var = this.a;
        if (ya1Var.m().a.size() == 0) {
            return 0;
        }
        int z = sn2.z(ya1Var.m());
        int i2 = ya1Var.m().b + ya1Var.m().c;
        if (i2 == 0 || (i = z / i2) < 1) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.vi3
    public final int e() {
        return Math.max(0, this.a.e);
    }
}
