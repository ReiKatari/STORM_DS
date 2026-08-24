package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ob7  reason: default package */
/* loaded from: classes.dex */
public final class ob7 extends vl6 {
    public final vl6 e;
    public final boolean f;
    public final boolean g;
    public qn2 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob7(vl6 vl6Var, qn2 qn2Var, boolean z, boolean z2) {
        super(0L, zl6.X);
        qn2 qn2Var2;
        r76 r76Var = bm6.a;
        this.e = vl6Var;
        this.f = z;
        this.g = z2;
        this.h = bm6.k(qn2Var, (vl6Var == null || (qn2Var2 = vl6Var.e()) == null) ? bm6.j.e : qn2Var2, z);
        this.i = kj2.s();
    }

    @Override // defpackage.vl6
    public final void c() {
        vl6 vl6Var;
        this.c = true;
        if (this.g && (vl6Var = this.e) != null) {
            vl6Var.c();
        }
    }

    @Override // defpackage.vl6
    public final zl6 d() {
        return v().d();
    }

    @Override // defpackage.vl6
    public final qn2 e() {
        return this.h;
    }

    @Override // defpackage.vl6
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.vl6
    public final long g() {
        return v().g();
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
    public final void m() {
        v().m();
    }

    @Override // defpackage.vl6
    public final void n(eq6 eq6Var) {
        v().n(eq6Var);
    }

    @Override // defpackage.vl6
    public final vl6 u(qn2 qn2Var) {
        qn2 k = bm6.k(qn2Var, this.h, true);
        if (!this.f) {
            return bm6.g(v().u(null), k, true);
        }
        return v().u(k);
    }

    public final vl6 v() {
        vl6 vl6Var = this.e;
        if (vl6Var == null) {
            return bm6.j;
        }
        return vl6Var;
    }
}
