package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rk1  reason: default package */
/* loaded from: classes.dex */
public final class rk1 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ android.os.Message B;

    public /* synthetic */ rk1(android.os.Message r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.A
            android.os.Message r3 = r3.B
            switch(r0) {
                case 0: goto L1d;
                default: goto L7;
            }
        L7:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unhandled stats message."
            r1.<init>(r2)
            int r3 = r3.what
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L1d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown handler message received: "
            r1.<init>(r2)
            int r3 = r3.what
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
