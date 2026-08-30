package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gp6  reason: default package */
/* loaded from: classes.dex */
public final class gp6 implements bj2 {
    public final /* synthetic */ yb1 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ l14 R;

    public gp6(yb1 yb1Var, boolean z, boolean z2, l14 l14Var) {
        this.A = yb1Var;
        this.B = z;
        this.L = z2;
        this.R = l14Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z;
        long j;
        v03 v03Var = (v03) obj;
        ((Number) obj3).intValue();
        sk2 sk2Var = (sk2) ((tu0) obj2);
        sk2Var.X(1423138213);
        if (v03Var == v03.UnfocusedEmpty) {
            z = false;
        } else {
            z = this.L;
        }
        sk2Var.X(-1749156593);
        k24 a = bh7.a(this.R, sk2Var, 0);
        yb1 yb1Var = this.A;
        if (!this.B) {
            j = yb1Var.s;
        } else if (z) {
            j = yb1Var.t;
        } else if (((Boolean) a.getValue()).booleanValue()) {
            j = yb1Var.q;
        } else {
            j = yb1Var.r;
        }
        long j2 = ((xq0) b31.g(j, sk2Var, false).getValue()).a;
        sk2Var.p(false);
        return new xq0(j2);
    }
}
