package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ee  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ee implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.te B;

    public /* synthetic */ ee(defpackage.te r1, int r2) {
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
            te r3 = r3.B
            switch(r0) {
                case 0: goto L31;
                case 1: goto L17;
                case 2: goto Lf;
                default: goto L7;
            }
        L7:
            sm3 r3 = r3.getRoot()
            defpackage.te.k(r3)
            return
        Lf:
            sm3 r3 = r3.getRoot()
            defpackage.te.k(r3)
            return
        L17:
            r0 = 0
            r3.z1 = r0
            android.view.MotionEvent r0 = r3.r1
            r0.getClass()
            int r1 = r0.getActionMasked()
            r2 = 10
            if (r1 != r2) goto L2b
            r3.E(r0)
            goto L30
        L2b:
            java.lang.String r3 = "The ACTION_HOVER_EXIT event was not cleared."
            defpackage.i.m(r3)
        L30:
            return
        L31:
            pu r3 = r3.h0
            java.lang.String r0 = "AndroidOwner:outOfFrameExecutor"
            android.os.Trace.beginSection(r0)
        L38:
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L48
            java.lang.Object r0 = r3.removeLast()     // Catch: java.lang.Throwable -> L4c
            on2 r0 = (defpackage.on2) r0     // Catch: java.lang.Throwable -> L4c
            r0.c()     // Catch: java.lang.Throwable -> L4c
            goto L38
        L48:
            android.os.Trace.endSection()
            return
        L4c:
            r3 = move-exception
            android.os.Trace.endSection()
            throw r3
    }
}
