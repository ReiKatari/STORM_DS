package q8;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class q extends nc.i implements mc.t {

    /* renamed from: b0  reason: collision with root package name */
    public static final q f12381b0 = new nc.i(6, r.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // mc.t
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        p8.b bVar = (p8.b) obj2;
        z8.a aVar = (z8.a) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        v8.j jVar = (v8.j) obj5;
        d dVar = (d) obj6;
        context.getClass();
        bVar.getClass();
        aVar.getClass();
        workDatabase.getClass();
        jVar.getClass();
        String str = i.f12354a;
        s8.d dVar2 = new s8.d(context, workDatabase, bVar);
        y8.h.a(context, SystemJobService.class, true);
        p8.v.e().a(i.f12354a, "Created SystemJobScheduler and enabled SystemJobService");
        return p7.t.y(dVar2, new r8.c(context, bVar, jVar, dVar, new p1.a0(dVar, aVar), aVar));
    }
}
