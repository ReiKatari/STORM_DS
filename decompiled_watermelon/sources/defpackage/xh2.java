package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xh2  reason: default package */
/* loaded from: classes.dex */
public final class xh2 extends RuntimeException {
    public final yh2 A;
    public final Throwable B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh2(yh2 yh2Var, Throwable th) {
        super(th);
        yh2Var.getClass();
        this.A = yh2Var;
        this.B = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.B;
    }
}
