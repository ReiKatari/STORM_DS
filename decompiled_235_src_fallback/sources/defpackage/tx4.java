package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tx4  reason: default package */
/* loaded from: classes.dex */
public abstract class tx4 extends java.util.concurrent.CancellationException {
    public final /* synthetic */ int A;

    public /* synthetic */ tx4(java.lang.String r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.<init>(r1)
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lb;
                default: goto L5;
            }
        L5:
            java.lang.StackTraceElement[] r0 = defpackage.l.g
            r1.setStackTrace(r0)
            return r1
        Lb:
            java.lang.StackTraceElement[] r0 = defpackage.hv.i
            r1.setStackTrace(r0)
            return r1
        L11:
            java.lang.StackTraceElement[] r0 = defpackage.nw7.Z
            r1.setStackTrace(r0)
            return r1
    }
}
