package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final lx3 e() {
        lw7 b = lw7.b(this.a);
        b.getClass();
        WorkDatabase workDatabase = b.c;
        workDatabase.getClass();
        dx7 w = workDatabase.w();
        qw7 u = workDatabase.u();
        fx7 x = workDatabase.x();
        px6 t = workDatabase.t();
        b.b.d.getClass();
        List list = (List) hv.Q(w.a, true, false, new t4(19, System.currentTimeMillis() - 86400000));
        m16 m16Var = w.a;
        List list2 = (List) hv.Q(m16Var, true, false, new rk7(16));
        List list3 = (List) hv.Q(m16Var, true, false, new rk7(20));
        if (!list.isEmpty()) {
            ga0 f = ga0.f();
            String str = wi1.a;
            f.g(str, "Recently completed work:\n\n");
            ga0.f().g(str, wi1.a(u, x, t, list));
        }
        if (!list2.isEmpty()) {
            ga0 f2 = ga0.f();
            String str2 = wi1.a;
            f2.g(str2, "Running work:\n\n");
            ga0.f().g(str2, wi1.a(u, x, t, list2));
        }
        if (!list3.isEmpty()) {
            ga0 f3 = ga0.f();
            String str3 = wi1.a;
            f3.g(str3, "Enqueued work:\n\n");
            ga0.f().g(str3, wi1.a(u, x, t, list3));
        }
        return new lx3();
    }
}
