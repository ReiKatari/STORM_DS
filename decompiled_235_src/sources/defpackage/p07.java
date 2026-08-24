package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p07  reason: default package */
/* loaded from: classes.dex */
public final class p07 implements m07 {
    public final long A;
    public final /* synthetic */ q07 B;

    public p07(q07 q07Var, long j) {
        this.B = q07Var;
        this.A = j;
    }

    @Override // defpackage.m07
    public final l07 R() {
        return hi2.w(this.B);
    }

    @Override // defpackage.m07
    public final long i(jk3 jk3Var) {
        jk3 jk3Var2 = (jk3) this.B.n0.getValue();
        if (jk3Var2 != null) {
            return jk3Var.J(jk3Var2, this.A);
        }
        s53.d("Tried to open context menu before the anchor was placed.");
        e41.c();
        return 0L;
    }

    @Override // defpackage.m07
    public final of5 l(jk3 jk3Var) {
        return kj2.b(i(jk3Var), 0L);
    }
}
