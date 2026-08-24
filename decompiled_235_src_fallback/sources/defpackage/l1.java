package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l1  reason: default package */
/* loaded from: classes.dex */
public final class l1 extends java.lang.Throwable {
    public final /* synthetic */ int A;

    public /* synthetic */ l1(java.lang.String r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.<init>(r1)
            return
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable fillInStackTrace() {
            r1 = this;
            int r0 = r1.A
            monitor-enter(r1)
            switch(r0) {
                case 0: goto L8;
                default: goto L6;
            }
        L6:
            monitor-exit(r1)
            return r1
        L8:
            monitor-exit(r1)
            return r1
    }
}
