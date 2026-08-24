package androidx.work.impl.utils;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends android.content.BroadcastReceiver {
    public static final java.lang.String a = null;

    static {
            java.lang.String r0 = "ForceStopRunnable$Rcvr"
            java.lang.String r0 = defpackage.ga0.h(r0)
            androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver.a = r0
            return
    }

    public ForceStopRunnable$BroadcastReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            if (r2 == 0) goto L21
            java.lang.String r0 = r2.getAction()
            java.lang.String r2 = "ACTION_FORCE_STOP_RESCHEDULE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L21
            ga0 r0 = defpackage.ga0.f()
            int r0 = r0.b
            r2 = 2
            if (r0 > r2) goto L1e
            java.lang.String r0 = androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver.a
            java.lang.String r2 = "Rescheduling alarm that keeps track of force-stops."
            android.util.Log.v(r0, r2)
        L1e:
            defpackage.vj2.c(r1)
        L21:
            return
    }
}
