package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oj0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class oj0 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ lw7 B;

    public /* synthetic */ oj0(lw7 lw7Var, int i) {
        this.A = i;
        this.B = lw7Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        lw7 lw7Var = this.B;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = lw7Var.c;
                workDatabase.getClass();
                workDatabase.o(new er2(new v(workDatabase, "retroarch-shader-install", lw7Var, 7), 26));
                h66.b(lw7Var.b, workDatabase, lw7Var.e);
                return jg7Var;
            default:
                WorkDatabase workDatabase2 = lw7Var.c;
                Context context = lw7Var.a;
                String str = ux6.Y;
                if (Build.VERSION.SDK_INT >= 34) {
                    vc3.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList b = ux6.b(context, jobScheduler);
                if (b != null && !b.isEmpty()) {
                    int size = b.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = b.get(i2);
                        i2++;
                        ux6.a(jobScheduler, ((JobInfo) obj).getId());
                    }
                }
                ((Number) hv.Q(workDatabase2.w().a, false, true, new rk7(21))).intValue();
                h66.b(lw7Var.b, workDatabase2, lw7Var.e);
                return jg7Var;
        }
    }
}
