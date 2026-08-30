package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: re1  reason: default package */
/* loaded from: classes.dex */
public final class re1 extends RuntimeException {
    public final transient e31 A;

    public re1(e31 e31Var) {
        this.A = e31Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.A);
    }
}
