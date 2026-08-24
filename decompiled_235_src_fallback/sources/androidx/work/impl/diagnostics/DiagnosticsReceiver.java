package androidx.work.impl.diagnostics;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends android.content.BroadcastReceiver {
    public static final java.lang.String a = null;

    static {
            java.lang.String r0 = "DiagnosticsRcvr"
            java.lang.String r0 = defpackage.ga0.h(r0)
            androidx.work.impl.diagnostics.DiagnosticsReceiver.a = r0
            return
    }

    public DiagnosticsReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            ga0 r3 = defpackage.ga0.f()
            java.lang.String r5 = "Requesting diagnostics"
            java.lang.String r0 = androidx.work.impl.diagnostics.DiagnosticsReceiver.a
            r3.b(r0, r5)
            r4.getClass()     // Catch: java.lang.IllegalStateException -> L41
            lw7 r3 = defpackage.lw7.b(r4)     // Catch: java.lang.IllegalStateException -> L41
            r3.getClass()     // Catch: java.lang.IllegalStateException -> L41
            java.lang.Class<androidx.work.impl.workers.DiagnosticsWorker> r4 = androidx.work.impl.workers.DiagnosticsWorker.class
            bk1 r5 = new bk1     // Catch: java.lang.IllegalStateException -> L41
            r5.<init>(r4)     // Catch: java.lang.IllegalStateException -> L41
            gm4 r4 = r5.c()     // Catch: java.lang.IllegalStateException -> L41
            java.util.List r4 = defpackage.hf.b0(r4)     // Catch: java.lang.IllegalStateException -> L41
            boolean r5 = r4.isEmpty()     // Catch: java.lang.IllegalStateException -> L41
            if (r5 != 0) goto L39
            aw7 r5 = new aw7     // Catch: java.lang.IllegalStateException -> L41
            y72 r1 = defpackage.y72.KEEP     // Catch: java.lang.IllegalStateException -> L41
            r2 = 0
            r5.<init>(r3, r2, r1, r4)     // Catch: java.lang.IllegalStateException -> L41
            r5.a()     // Catch: java.lang.IllegalStateException -> L41
            return
        L39:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalStateException -> L41
            java.lang.String r4 = "enqueue needs at least one WorkRequest."
            r3.<init>(r4)     // Catch: java.lang.IllegalStateException -> L41
            throw r3     // Catch: java.lang.IllegalStateException -> L41
        L41:
            r3 = move-exception
            ga0 r4 = defpackage.ga0.f()
            java.lang.String r5 = "WorkManager is not initialized"
            r4.e(r0, r5, r3)
            return
    }
}
