package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e46  reason: default package */
/* loaded from: classes.dex */
public final class e46 extends t1 {
    public long a;
    public ih0 b;

    @Override // defpackage.t1
    public final boolean a(s1 s1Var) {
        c46 c46Var = (c46) s1Var;
        if (this.a >= 0) {
            return false;
        }
        long j = c46Var.d0;
        if (j < c46Var.e0) {
            c46Var.e0 = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.t1
    public final j11[] b(s1 s1Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((c46) s1Var).w(j);
    }
}
