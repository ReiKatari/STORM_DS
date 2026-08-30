package androidx.work;

import android.content.Context;
import java.util.concurrent.ExecutorService;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public abstract class Worker extends mq3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.mq3
    public final l90 a() {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return ct3.k0(new hi0(11, executorService, new zv5(16, this)));
    }

    @Override // defpackage.mq3
    public final l90 d() {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return ct3.k0(new hi0(11, executorService, new t06(17, this)));
    }

    public abstract kq3 e();
}
