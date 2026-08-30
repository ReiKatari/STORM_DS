package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: et3  reason: default package */
/* loaded from: classes.dex */
public final class et3 implements cr4 {
    public final b11 a;
    public i33 b;
    public sd3 c;
    public i33 d;
    public a33 e;

    public et3(b11 b11Var) {
        this.a = b11Var;
    }

    @Override // defpackage.cr4
    public final long a(e33 e33Var, long j, sd3 sd3Var, long j2) {
        boolean b;
        a33 a33Var = this.e;
        if (a33Var != null) {
            i33 i33Var = this.b;
            boolean z = false;
            if (i33Var == null) {
                b = false;
            } else {
                b = i33.b(i33Var.a, j);
            }
            if (b && this.c == sd3Var) {
                i33 i33Var2 = this.d;
                if (i33Var2 != null) {
                    z = i33.b(i33Var2.a, j2);
                }
                if (z) {
                    return a33Var.a;
                }
            }
        }
        long a = this.a.a(e33Var, j, sd3Var, j2);
        this.b = new i33(j);
        this.c = sd3Var;
        this.d = new i33(j2);
        this.e = new a33(a);
        return a;
    }
}
