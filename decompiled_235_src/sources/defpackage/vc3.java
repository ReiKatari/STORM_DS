package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vc3  reason: default package */
/* loaded from: classes.dex */
public abstract class vc3 {
    public static final String a = ga0.h("SystemJobScheduler");

    public static final JobScheduler a(Context context) {
        JobScheduler forNamespace;
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT >= 34) {
            forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
            forNamespace.getClass();
            return forNamespace;
        }
        return jobScheduler;
    }
}
