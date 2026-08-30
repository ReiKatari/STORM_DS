package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fh0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fh0 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ kh7 B;

    public /* synthetic */ fh0(kh7 kh7Var, int i) {
        this.A = i;
        this.B = kh7Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        o27 o27Var = o27.a;
        kh7 kh7Var = this.B;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = kh7Var.c;
                workDatabase.getClass();
                workDatabase.o(new bz2(19, new u(workDatabase, "retroarch-shader-install", kh7Var, 6)));
                bv5.b(kh7Var.b, workDatabase, kh7Var.e);
                return o27Var;
            default:
                WorkDatabase workDatabase2 = kh7Var.c;
                Context context = kh7Var.a;
                String str = yl6.Y;
                if (Build.VERSION.SDK_INT >= 34) {
                    g63.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList d = yl6.d(context, jobScheduler);
                if (d != null && !d.isEmpty()) {
                    int size = d.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = d.get(i2);
                        i2++;
                        yl6.b(jobScheduler, ((JobInfo) obj).getId());
                    }
                }
                ((Number) mh7.X(workDatabase2.w().a, false, true, new ci7(3))).intValue();
                bv5.b(kh7Var.b, workDatabase2, kh7Var.e);
                return o27Var;
        }
    }
}
