package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pa6  reason: default package */
/* loaded from: classes.dex */
public final class pa6 extends se6 {
    public int c;

    public pa6(int i, long j) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.se6
    public final void a(se6 se6Var) {
        se6Var.getClass();
        this.c = ((pa6) se6Var).c;
    }

    @Override // defpackage.se6
    public final se6 b(long j) {
        return new pa6(this.c, j);
    }
}
