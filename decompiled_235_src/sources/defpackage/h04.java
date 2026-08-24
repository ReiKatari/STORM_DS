package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h04  reason: default package */
/* loaded from: classes.dex */
public final class h04 implements f05 {
    public final j41 a;
    public q93 b;
    public kk3 c;
    public q93 d;
    public i93 e;

    public h04(j41 j41Var) {
        this.a = j41Var;
    }

    @Override // defpackage.f05
    public final long a(m93 m93Var, long j, kk3 kk3Var, long j2) {
        boolean b;
        i93 i93Var = this.e;
        if (i93Var != null) {
            q93 q93Var = this.b;
            boolean z = false;
            if (q93Var == null) {
                b = false;
            } else {
                b = q93.b(q93Var.a, j);
            }
            if (b && this.c == kk3Var) {
                q93 q93Var2 = this.d;
                if (q93Var2 != null) {
                    z = q93.b(q93Var2.a, j2);
                }
                if (z) {
                    return i93Var.a;
                }
            }
        }
        long a = this.a.a(m93Var, j, kk3Var, j2);
        this.b = new q93(j);
        this.c = kk3Var;
        this.d = new q93(j2);
        this.e = new i93(a);
        return a;
    }
}
