package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: te5  reason: default package */
/* loaded from: classes.dex */
public final class te5 extends yl5 {
    public final String B;
    public final long L;
    public final fe5 R;

    public te5(String str, long j, fe5 fe5Var) {
        this.B = str;
        this.L = j;
        this.R = fe5Var;
    }

    @Override // defpackage.yl5
    public final long h() {
        return this.L;
    }

    @Override // defpackage.yl5
    public final n34 k() {
        String str = this.B;
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
        return this.R;
    }
}
