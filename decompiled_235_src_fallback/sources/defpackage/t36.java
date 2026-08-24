package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t36  reason: default package */
/* loaded from: classes.dex */
public final class t36 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final java.lang.Runnable B;

    public /* synthetic */ t36(java.lang.Runnable r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.A
            java.lang.Runnable r2 = r2.B
            switch(r0) {
                case 0: goto Lb;
                default: goto L7;
            }
        L7:
            r2.run()
            return
        Lb:
            r2.run()     // Catch: java.lang.Exception -> Lf
            goto L1d
        Lf:
            r2 = move-exception
            java.lang.String r0 = "TransportRuntime."
            java.lang.String r1 = "Executor"
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "Background execution failure."
            android.util.Log.e(r0, r1, r2)
        L1d:
            return
    }
}
