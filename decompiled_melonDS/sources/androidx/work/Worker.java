package androidx.work;

import a.a;
import android.content.Context;
import b5.l;
import bi.h;
import java.util.concurrent.ExecutorService;
import kf.s0;
import od.n;
import p8.s;
import p8.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class Worker extends u {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // p8.u
    public final l a() {
        ExecutorService executorService = this.f11504b.f1716c;
        executorService.getClass();
        return a.A(new h(9, executorService, new n(7, this)));
    }

    @Override // p8.u
    public final l b() {
        ExecutorService executorService = this.f11504b.f1716c;
        executorService.getClass();
        return a.A(new h(9, executorService, new s0(6, this)));
    }

    public abstract s c();
}
