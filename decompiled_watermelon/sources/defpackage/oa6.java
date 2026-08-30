package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oa6  reason: default package */
/* loaded from: classes.dex */
public final class oa6 extends se6 {
    public float c;

    public oa6(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.se6
    public final void a(se6 se6Var) {
        se6Var.getClass();
        this.c = ((oa6) se6Var).c;
    }

    @Override // defpackage.se6
    public final se6 b(long j) {
        return new oa6(this.c, j);
    }
}
