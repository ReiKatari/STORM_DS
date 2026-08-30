package androidx.work.impl.workers;

import a9.m;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import k7.t;
import p8.s;
import p8.v;
import q8.p;
import q8.r;
import u1.h1;
import x8.h;
import x8.k;
import x8.u;
import x8.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final s c() {
        p a10 = p.a(this.f11503a);
        a10.getClass();
        WorkDatabase workDatabase = a10.f12373c;
        workDatabase.getClass();
        u w10 = workDatabase.w();
        k u4 = workDatabase.u();
        w x9 = workDatabase.x();
        h t5 = workDatabase.t();
        a10.f12372b.f11455d.getClass();
        List list = (List) r.K(w10.f14444a, true, false, new cd.k(16, System.currentTimeMillis() - 86400000));
        t tVar = w10.f14444a;
        List list2 = (List) r.K(tVar, true, false, new h1(17));
        List list3 = (List) r.K(tVar, true, false, new h1(21));
        if (!list.isEmpty()) {
            v e6 = v.e();
            String str = m.f676a;
            e6.f(str, "Recently completed work:\n\n");
            v.e().f(str, m.a(u4, x9, t5, list));
        }
        if (!list2.isEmpty()) {
            v e10 = v.e();
            String str2 = m.f676a;
            e10.f(str2, "Running work:\n\n");
            v.e().f(str2, m.a(u4, x9, t5, list2));
        }
        if (!list3.isEmpty()) {
            v e11 = v.e();
            String str3 = m.f676a;
            e11.f(str3, "Enqueued work:\n\n");
            v.e().f(str3, m.a(u4, x9, t5, list3));
        }
        return new s();
    }
}
