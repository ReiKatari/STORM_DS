package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vi1  reason: default package */
/* loaded from: classes.dex */
public final class vi1 extends RuntimeException {
    public final transient l61 A;

    public vi1(l61 l61Var) {
        this.A = l61Var;
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
