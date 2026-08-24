package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sq4  reason: default package */
/* loaded from: classes.dex */
public final class sq4 implements tp3 {
    public final ue1 a;

    public sq4(ue1 ue1Var) {
        this.a = ue1Var;
    }

    @Override // defpackage.tp3
    public final int a() {
        return this.a.n();
    }

    @Override // defpackage.tp3
    public final int b() {
        ue1 ue1Var = this.a;
        return Math.min(ue1Var.n() - 1, ((i34) gt0.Q0(ue1Var.m().a)).a);
    }

    @Override // defpackage.tp3
    public final int c() {
        int i;
        ue1 ue1Var = this.a;
        if (ue1Var.m().a.size() == 0) {
            return 0;
        }
        int G = gi2.G(ue1Var.m());
        int i2 = ue1Var.m().b + ue1Var.m().c;
        if (i2 == 0 || (i = G / i2) < 1) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.tp3
    public final boolean d() {
        return !this.a.m().a.isEmpty();
    }

    @Override // defpackage.tp3
    public final int e() {
        return Math.max(0, this.a.e);
    }
}
