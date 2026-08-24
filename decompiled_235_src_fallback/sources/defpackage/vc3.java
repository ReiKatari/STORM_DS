package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vc3  reason: default package */
/* loaded from: classes.dex */
public abstract class vc3 {
    public static final java.lang.String a = null;

    static {
            java.lang.String r0 = "SystemJobScheduler"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.vc3.a = r0
            return
    }

    public static final android.app.job.JobScheduler a(android.content.Context r2) {
            r2.getClass()
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r2 = r2.getSystemService(r0)
            r2.getClass()
            android.app.job.JobScheduler r2 = (android.app.job.JobScheduler) r2
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L1b
            android.app.job.JobScheduler r2 = defpackage.rv2.e(r2)
            r2.getClass()
        L1b:
            return r2
    }
}
