package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lf3  reason: default package */
/* loaded from: classes.dex */
public final class lf3 extends v0 {
    public final nd3 Y;
    public final int Z;
    public int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf3(id3 id3Var, nd3 nd3Var) {
        super(id3Var, null);
        id3Var.getClass();
        this.Y = nd3Var;
        this.Z = nd3Var.A.size();
        this.d0 = -1;
    }

    @Override // defpackage.v0
    public final de3 E() {
        return this.Y;
    }

    @Override // defpackage.v0
    public final de3 d(String str) {
        str.getClass();
        return (de3) this.Y.A.get(Integer.parseInt(str));
    }

    @Override // defpackage.ux0
    public final int q(wb6 wb6Var) {
        wb6Var.getClass();
        int i = this.d0;
        if (i < this.Z - 1) {
            int i2 = i + 1;
            this.d0 = i2;
            return i2;
        }
        return -1;
    }

    @Override // defpackage.v0
    public final String x(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return String.valueOf(i);
    }
}
