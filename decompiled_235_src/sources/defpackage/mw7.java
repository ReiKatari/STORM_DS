package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mw7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mw7 extends po2 implements io2 {
    public static final mw7 d0 = new po2(6, nw7.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // defpackage.io2
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        az0 az0Var = (az0) obj2;
        ow7 ow7Var = (ow7) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        w87 w87Var = (w87) obj5;
        o35 o35Var = (o35) obj6;
        context.getClass();
        az0Var.getClass();
        ow7Var.getClass();
        workDatabase.getClass();
        w87Var.getClass();
        String str = h66.a;
        ux6 ux6Var = new ux6(context, workDatabase, az0Var);
        fq4.a(context, SystemJobService.class, true);
        ga0.f().b(h66.a, "Created SystemJobScheduler and enabled SystemJobService");
        return hf.c0(ux6Var, new fu2(context, az0Var, w87Var, o35Var, new rr6(o35Var, ow7Var), ow7Var));
    }
}
