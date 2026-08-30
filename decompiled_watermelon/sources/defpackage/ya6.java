package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ya6  reason: default package */
/* loaded from: classes.dex */
public final class ya6 extends se6 {
    public tm4 c;
    public int d;

    public ya6(long j, tm4 tm4Var) {
        super(j);
        this.c = tm4Var;
    }

    @Override // defpackage.se6
    public final void a(se6 se6Var) {
        se6Var.getClass();
        ya6 ya6Var = (ya6) se6Var;
        synchronized (ct3.j0) {
            this.c = ya6Var.c;
            this.d = ya6Var.d;
        }
    }

    @Override // defpackage.se6
    public final se6 b(long j) {
        return new ya6(j, this.c);
    }
}
