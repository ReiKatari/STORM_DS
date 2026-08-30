package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final kq3 e() {
        kh7 b = kh7.b(this.a);
        b.getClass();
        WorkDatabase workDatabase = b.c;
        workDatabase.getClass();
        di7 w = workDatabase.w();
        ph7 u = workDatabase.u();
        gi7 x = workDatabase.x();
        tl6 t = workDatabase.t();
        b.b.d.getClass();
        List list = (List) mh7.X(w.a, true, false, new u4(18, System.currentTimeMillis() - 86400000));
        sq5 sq5Var = w.a;
        List list2 = (List) mh7.X(sq5Var, true, false, new s67(28));
        List list3 = (List) mh7.X(sq5Var, true, false, new ci7(2));
        if (!list.isEmpty()) {
            y70 f = y70.f();
            String str = se1.a;
            f.g(str, "Recently completed work:\n\n");
            y70.f().g(str, se1.a(u, x, t, list));
        }
        if (!list2.isEmpty()) {
            y70 f2 = y70.f();
            String str2 = se1.a;
            f2.g(str2, "Running work:\n\n");
            y70.f().g(str2, se1.a(u, x, t, list2));
        }
        if (!list3.isEmpty()) {
            y70 f3 = y70.f();
            String str3 = se1.a;
            f3.g(str3, "Enqueued work:\n\n");
            y70.f().g(str3, se1.a(u, x, t, list3));
        }
        return new kq3();
    }
}
