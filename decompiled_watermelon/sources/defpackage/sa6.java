package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sa6  reason: default package */
/* loaded from: classes.dex */
public final class sa6 extends se6 {
    public Object c;

    public sa6(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.se6
    public final void a(se6 se6Var) {
        se6Var.getClass();
        this.c = ((sa6) se6Var).c;
    }

    @Override // defpackage.se6
    public final se6 b(long j) {
        return new sa6(ma6.j().g(), this.c);
    }
}
