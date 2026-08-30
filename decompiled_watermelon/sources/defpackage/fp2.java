package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fp2  reason: default package */
/* loaded from: classes.dex */
public final class fp2 implements cr4 {
    public final ub a;
    public final rb4 b;
    public long c = 0;

    public fp2(ub ubVar, rb4 rb4Var) {
        this.a = ubVar;
        this.b = rb4Var;
    }

    @Override // defpackage.cr4
    public final long a(e33 e33Var, long j, sd3 sd3Var, long j2) {
        long a = this.b.a();
        if ((9223372034707292159L & a) == 9205357640488583168L) {
            a = this.c;
        }
        this.c = a;
        return a33.c(a33.c(e33Var.b(), mj2.P(a)), this.a.a(j2, 0L, sd3Var));
    }
}
