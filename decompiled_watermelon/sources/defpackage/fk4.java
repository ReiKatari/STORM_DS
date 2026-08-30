package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fk4  reason: default package */
/* loaded from: classes.dex */
public final class fk4 implements tw0 {
    public final ms5 A;
    public final String B;
    public final aj2 L;
    public final il6 R = new il6(new bz2(8, this));

    public fk4(ms5 ms5Var, String str, aj2 aj2Var) {
        this.A = ms5Var;
        this.B = str;
        this.L = aj2Var;
    }

    @Override // defpackage.tw0
    public final Object E(boolean z, aj2 aj2Var, k11 k11Var) {
        dk4 dk4Var;
        ek4 ek4Var = (ek4) k11Var.a().I(ek4.B);
        if (ek4Var != null) {
            dk4Var = ek4Var.A;
        } else {
            dk4Var = null;
        }
        if (dk4Var != null) {
            return aj2Var.j(dk4Var, k11Var);
        }
        dk4 dk4Var2 = new dk4(this.L, (ls5) this.R.getValue());
        return tq5.G(new ek4(dk4Var2), new v74(aj2Var, dk4Var2, (j11) null), k11Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        il6 il6Var = this.R;
        if (il6Var.a()) {
            ((ls5) il6Var.getValue()).close();
        }
    }
}
