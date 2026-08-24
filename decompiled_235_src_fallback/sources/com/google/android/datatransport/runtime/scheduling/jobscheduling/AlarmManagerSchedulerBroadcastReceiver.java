package com.google.android.datatransport.runtime.scheduling.jobscheduling;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public AlarmManagerSchedulerBroadcastReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            android.net.Uri r3 = r5.getData()
            java.lang.String r0 = "backendName"
            java.lang.String r3 = r3.getQueryParameter(r0)
            android.net.Uri r0 = r5.getData()
            java.lang.String r1 = "extras"
            java.lang.String r0 = r0.getQueryParameter(r1)
            android.net.Uri r1 = r5.getData()
            java.lang.String r2 = "priority"
            java.lang.String r1 = r1.getQueryParameter(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            android.os.Bundle r5 = r5.getExtras()
            java.lang.String r2 = "attemptNumber"
            int r5 = r5.getInt(r2)
            defpackage.sb7.b(r4)
            bt r4 = defpackage.fz.a()
            if (r3 == 0) goto L63
            r4.B = r3
            b35 r3 = defpackage.d35.b(r1)
            r4.R = r3
            if (r0 == 0) goto L4a
            r3 = 0
            byte[] r3 = android.util.Base64.decode(r0, r3)
            r4.L = r3
        L4a:
            sb7 r3 = defpackage.sb7.a()
            p87 r3 = r3.d
            fz r4 = r4.A()
            java.lang.Object r0 = r3.e
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            rh7 r1 = new rh7
            sb r2 = defpackage.sb.B
            r1.<init>(r3, r4, r5, r2)
            r0.execute(r1)
            return
        L63:
            java.lang.String r3 = "Null backendName"
            defpackage.u34.x(r3)
            return
    }
}
