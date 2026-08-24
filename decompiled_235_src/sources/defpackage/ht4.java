package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ht4  reason: default package */
/* loaded from: classes.dex */
public final class ht4 implements qz0 {
    public final f36 A;
    public final String B;
    public final eo2 L;
    public final ex6 R = new ex6(new er2(this, 12));

    public ht4(f36 f36Var, String str, eo2 eo2Var) {
        this.A = f36Var;
        this.B = str;
        this.L = eo2Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ex6 ex6Var = this.R;
        if (ex6Var.a()) {
            ((e36) ex6Var.getValue()).close();
        }
    }

    @Override // defpackage.qz0
    public final Object s(boolean z, eo2 eo2Var, s41 s41Var) {
        ft4 ft4Var;
        gt4 gt4Var = (gt4) s41Var.b().Z(gt4.B);
        if (gt4Var != null) {
            ft4Var = gt4Var.A;
        } else {
            ft4Var = null;
        }
        if (ft4Var != null) {
            return eo2Var.o(ft4Var, s41Var);
        }
        ft4 ft4Var2 = new ft4(this.L, (e36) this.R.getValue());
        return hv.d0(new gt4(ft4Var2), new bf4(eo2Var, ft4Var2, null, 3), s41Var);
    }
}
