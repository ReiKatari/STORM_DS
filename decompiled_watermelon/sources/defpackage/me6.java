package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: me6  reason: default package */
/* loaded from: classes.dex */
public final class me6 extends se6 {
    public g1 c;
    public int d;
    public int e;

    public me6(long j, g1 g1Var) {
        super(j);
        this.c = g1Var;
    }

    @Override // defpackage.se6
    public final void a(se6 se6Var) {
        synchronized (b53.d) {
            se6Var.getClass();
            this.c = ((me6) se6Var).c;
            this.d = ((me6) se6Var).d;
            this.e = ((me6) se6Var).e;
        }
    }

    @Override // defpackage.se6
    public final se6 b(long j) {
        return new me6(j, this.c);
    }
}
