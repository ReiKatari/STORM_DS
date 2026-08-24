package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yd4  reason: default package */
/* loaded from: classes.dex */
public final class yd4 extends vl6 {
    public final qn2 e;
    public final vl6 f;

    public yd4(long j, zl6 zl6Var, qn2 qn2Var, vl6 vl6Var) {
        super(j, zl6Var);
        this.e = qn2Var;
        this.f = vl6Var;
        vl6Var.k();
    }

    @Override // defpackage.vl6
    public final void c() {
        vl6 vl6Var = this.f;
        if (!this.c) {
            if (this.b != vl6Var.g()) {
                a();
            }
            vl6Var.l();
            this.c = true;
            synchronized (bm6.c) {
                o();
            }
        }
    }

    @Override // defpackage.vl6
    public final qn2 e() {
        return this.e;
    }

    @Override // defpackage.vl6
    public final boolean f() {
        return true;
    }

    @Override // defpackage.vl6
    public final qn2 i() {
        return null;
    }

    @Override // defpackage.vl6
    public final void k() {
        ak7.K0();
        throw null;
    }

    @Override // defpackage.vl6
    public final void l() {
        ak7.K0();
        throw null;
    }

    @Override // defpackage.vl6
    public final void n(eq6 eq6Var) {
        r76 r76Var = bm6.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.vl6
    public final vl6 u(qn2 qn2Var) {
        return new yd4(this.b, this.a, bm6.k(qn2Var, this.e, true), this.f);
    }

    @Override // defpackage.vl6
    public final void m() {
    }
}
