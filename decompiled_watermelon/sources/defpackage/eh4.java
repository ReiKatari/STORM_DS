package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eh4  reason: default package */
/* loaded from: classes.dex */
public final class eh4 extends tv4 {
    public int f0;

    @Override // defpackage.tv4, defpackage.b91
    public final yu0 c(h06 h06Var) {
        h06Var.getClass();
        throw new IllegalArgumentException("Packing only supports primitive number types. The input type however was a struct: " + h06Var);
    }

    @Override // defpackage.tv4
    public final String u0(long j) {
        throw new IllegalArgumentException("Packing only supports primitive number types. The actual reading is for string.");
    }

    @Override // defpackage.tv4, defpackage.yu0
    public final int v(h06 h06Var) {
        h06Var.getClass();
        xv4 xv4Var = this.R;
        if (!xv4Var.d) {
            k70 k70Var = xv4Var.a;
            if (k70Var.A - k70Var.B == 0) {
                return -1;
            }
        }
        int i = this.f0;
        this.f0 = i + 1;
        return i;
    }

    @Override // defpackage.tv4
    public final long x0(h06 h06Var, int i) {
        h06Var.getClass();
        return 19500L;
    }
}
