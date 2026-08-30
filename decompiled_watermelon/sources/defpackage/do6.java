package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: do6  reason: default package */
/* loaded from: classes.dex */
public final class do6 implements ao6 {
    public final long A;
    public final /* synthetic */ eo6 B;

    public do6(eo6 eo6Var, long j) {
        this.B = eo6Var;
        this.A = j;
    }

    @Override // defpackage.ao6
    public final zn6 B0() {
        return cg2.v(this.B);
    }

    @Override // defpackage.ao6
    public final long k(rd3 rd3Var) {
        rd3 rd3Var2 = (rd3) this.B.m0.getValue();
        if (rd3Var2 != null) {
            return rd3Var.y(rd3Var2, this.A);
        }
        pz2.d("Tried to open context menu before the anchor was placed.");
        f81.c();
        return 0L;
    }

    @Override // defpackage.ao6
    public final y55 p(rd3 rd3Var) {
        return yf2.b(k(rd3Var), 0L);
    }
}
