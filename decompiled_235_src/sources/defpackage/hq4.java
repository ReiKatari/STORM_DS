package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hq4  reason: default package */
/* loaded from: classes.dex */
public final class hq4 extends a55 {
    public int g0;

    @Override // defpackage.a55, defpackage.sc1
    public final ux0 c(wb6 wb6Var) {
        wb6Var.getClass();
        throw new IllegalArgumentException("Packing only supports primitive number types. The input type however was a struct: " + wb6Var);
    }

    @Override // defpackage.a55, defpackage.ux0
    public final int q(wb6 wb6Var) {
        wb6Var.getClass();
        e55 e55Var = this.R;
        if (!e55Var.d) {
            r90 r90Var = e55Var.a;
            if (r90Var.A - r90Var.B == 0) {
                return -1;
            }
        }
        int i = this.g0;
        this.g0 = i + 1;
        return i;
    }

    @Override // defpackage.a55
    public final String u0(long j) {
        throw new IllegalArgumentException("Packing only supports primitive number types. The actual reading is for string.");
    }

    @Override // defpackage.a55
    public final long x0(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return 19500L;
    }
}
