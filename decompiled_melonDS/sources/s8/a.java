package s8;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import p8.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12843a = v.g("SystemJobScheduler");

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
