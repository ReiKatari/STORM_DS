package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lh7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lh7 extends lj2 implements ej2 {
    public static final lh7 c0 = new lj2(6, mh7.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // defpackage.ej2
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        ew0 ew0Var = (ew0) obj2;
        nh7 nh7Var = (nh7) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        jw6 jw6Var = (jw6) obj5;
        ku4 ku4Var = (ku4) obj6;
        context.getClass();
        ew0Var.getClass();
        nh7Var.getClass();
        workDatabase.getClass();
        jw6Var.getClass();
        String str = bv5.a;
        yl6 yl6Var = new yl6(context, workDatabase, ew0Var);
        ch4.a(context, SystemJobService.class, true);
        y70.f().b(bv5.a, "Created SystemJobScheduler and enabled SystemJobService");
        return l07.c0(yl6Var, new bo2(context, ew0Var, jw6Var, ku4Var, new wv6(ku4Var, nh7Var), nh7Var));
    }
}
