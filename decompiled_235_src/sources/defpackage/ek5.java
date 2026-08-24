package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek5  reason: default package */
/* loaded from: classes.dex */
public final class ek5 extends a55 {
    public int g0;
    public final long h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek5(o45 o45Var, e55 e55Var, long j, wb6 wb6Var) {
        super(o45Var, e55Var, wb6Var);
        wb6Var.getClass();
        this.g0 = -1;
        if (j == 19500) {
            int b = e55Var.b(q45.DEFAULT);
            if (b >= 0) {
                j = -b;
            } else {
                u34.k("Expected positive length for ", wb6Var, ", but got ", b);
                throw null;
            }
        }
        this.h0 = j;
    }

    @Override // defpackage.a55, defpackage.ux0
    public final int q(wb6 wb6Var) {
        int l;
        wb6Var.getClass();
        long j = this.h0;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.g0;
        e55 e55Var = this.R;
        if (i > 0) {
            if (i2 == -1) {
                l = e55Var.b;
            } else {
                l = e55Var.l();
            }
            if (l == ((int) (j & 2147483647L))) {
                int i3 = this.g0 + 1;
                this.g0 = i3;
                return i3;
            }
            e55Var.d = true;
            int typeId = (e55Var.b << 3) | e55Var.c.getTypeId();
            e55Var.n(e55Var.e);
            e55Var.e = typeId;
            return -1;
        }
        int i4 = i2 + 1;
        this.g0 = i4;
        if (i4 == (-j)) {
            return -1;
        }
        if (!e55Var.d) {
            r90 r90Var = e55Var.a;
            if (r90Var.A - r90Var.B == 0) {
                return -1;
            }
        }
        return i4;
    }

    @Override // defpackage.a55
    public final long x0(wb6 wb6Var, int i) {
        wb6Var.getClass();
        long j = this.h0;
        if (j > 0) {
            return j;
        }
        return 19500L;
    }
}
