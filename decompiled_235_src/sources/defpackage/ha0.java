package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ha0  reason: default package */
/* loaded from: classes.dex */
public final class ha0 extends yl5 {
    public final fk1 B;
    public final String L;
    public final String R;
    public final fe5 X;

    public ha0(fk1 fk1Var, String str, String str2) {
        this.B = fk1Var;
        this.L = str;
        this.R = str2;
        this.X = new fe5(new p40((in6) fk1Var.L.get(1), this));
    }

    @Override // defpackage.yl5
    public final long h() {
        String str = this.R;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = yy7.a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // defpackage.yl5
    public final n34 k() {
        String str = this.L;
        if (str != null) {
            xh5 xh5Var = n34.d;
            try {
                return xk2.k(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.yl5
    public final z80 n() {
        return this.X;
    }
}
