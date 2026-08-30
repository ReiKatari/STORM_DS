package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ma5  reason: default package */
/* loaded from: classes.dex */
public final class ma5 extends tv4 {
    public int f0;
    public final long g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma5(hv4 hv4Var, xv4 xv4Var, long j, h06 h06Var) {
        super(hv4Var, xv4Var, h06Var);
        h06Var.getClass();
        this.f0 = -1;
        if (j == 19500) {
            int b = xv4Var.b(jv4.DEFAULT);
            if (b >= 0) {
                j = -b;
            } else {
                c44.j("Expected positive length for ", h06Var, ", but got ", b);
                throw null;
            }
        }
        this.g0 = j;
    }

    @Override // defpackage.tv4, defpackage.yu0
    public final int v(h06 h06Var) {
        int l;
        h06Var.getClass();
        long j = this.g0;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.f0;
        xv4 xv4Var = this.R;
        if (i > 0) {
            if (i2 == -1) {
                l = xv4Var.b;
            } else {
                l = xv4Var.l();
            }
            if (l == ((int) (j & 2147483647L))) {
                int i3 = this.f0 + 1;
                this.f0 = i3;
                return i3;
            }
            xv4Var.d = true;
            int typeId = (xv4Var.b << 3) | xv4Var.c.getTypeId();
            xv4Var.n(xv4Var.e);
            xv4Var.e = typeId;
            return -1;
        }
        int i4 = i2 + 1;
        this.f0 = i4;
        if (i4 == (-j)) {
            return -1;
        }
        if (!xv4Var.d) {
            k70 k70Var = xv4Var.a;
            if (k70Var.A - k70Var.B == 0) {
                return -1;
            }
        }
        return i4;
    }

    @Override // defpackage.tv4
    public final long x0(h06 h06Var, int i) {
        h06Var.getClass();
        long j = this.g0;
        if (j > 0) {
            return j;
        }
        return 19500L;
    }
}
