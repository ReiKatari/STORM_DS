package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vi1  reason: default package */
/* loaded from: classes.dex */
public final class vi1 extends java.lang.RuntimeException {
    public final transient defpackage.l61 A;

    public vi1(defpackage.l61 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }

    @Override // java.lang.Throwable
    public final java.lang.String getLocalizedMessage() {
            r0 = this;
            l61 r0 = r0.A
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
