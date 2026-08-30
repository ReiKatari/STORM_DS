package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qa6  reason: default package */
/* loaded from: classes.dex */
public final class qa6 extends se6 {
    public long c;

    public qa6(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.se6
    public final void a(se6 se6Var) {
        se6Var.getClass();
        this.c = ((qa6) se6Var).c;
    }

    @Override // defpackage.se6
    public final se6 b(long j) {
        return new qa6(j, this.c);
    }
}
