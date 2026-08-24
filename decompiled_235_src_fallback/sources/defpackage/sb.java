package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sb implements java.lang.Runnable {
    public static final defpackage.sb B = null;
    public final /* synthetic */ int A;

    static {
            sb r0 = new sb
            r1 = 0
            r0.<init>(r1)
            defpackage.sb.B = r0
            return
    }

    public /* synthetic */ sb(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r1 = r1.A
            switch(r1) {
                case 0: goto L26;
                case 1: goto L24;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = "EmojiCompat.EmojiCompatInitializer.run"
            java.lang.reflect.Method r0 = defpackage.v87.b     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> L1d
            boolean r1 = defpackage.ws1.d()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L19
            ws1 r1 = defpackage.ws1.a()     // Catch: java.lang.Throwable -> L1d
            r1.e()     // Catch: java.lang.Throwable -> L1d
        L19:
            android.os.Trace.endSection()
            return
        L1d:
            r1 = move-exception
            java.lang.reflect.Method r0 = defpackage.v87.b
            android.os.Trace.endSection()
            throw r1
        L24:
            r1 = 0
            throw r1
        L26:
            int r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver.a
            return
    }
}
