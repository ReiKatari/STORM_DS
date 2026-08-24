package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cm4  reason: default package */
/* loaded from: classes.dex */
public final class cm4 extends a55 {
    public boolean g0;

    @Override // defpackage.a55, defpackage.sc1
    public final ux0 c(wb6 wb6Var) {
        wb6Var.getClass();
        np2 e = wb6Var.e();
        if (!nb3.k(e, bt6.e) && !nb3.k(e, bt6.h) && !(e instanceof dz4)) {
            np2 e2 = wb6Var.e();
            throw new IllegalArgumentException("Type " + e2 + " cannot be directly child of oneof element");
        }
        long h0 = h0();
        if (h0 == 19500 && nb3.k(this.X, wb6Var)) {
            return this;
        }
        if (!mp2.N(h0)) {
            return new a55(this.L, uj2.k(this.R, h0), wb6Var);
        }
        throw new IllegalArgumentException("An oneof element cannot be directly child of another oneof element");
    }

    @Override // defpackage.a55, defpackage.ux0
    public final int q(wb6 wb6Var) {
        wb6Var.getClass();
        if (this.g0) {
            return -1;
        }
        this.g0 = true;
        return 0;
    }
}
