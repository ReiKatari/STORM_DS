package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qy4  reason: default package */
/* loaded from: classes.dex */
public final class qy4 extends java.util.concurrent.CancellationException {
    public qy4(long r3) {
            r2 = this;
            java.lang.String r0 = "Timed out waiting for "
            java.lang.String r1 = " ms"
            java.lang.String r3 = defpackage.lb1.i(r3, r0, r1)
            r2.<init>(r3)
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
            r1 = this;
            java.lang.StackTraceElement[] r0 = defpackage.hf.p
            r1.setStackTrace(r0)
            return r1
    }
}
