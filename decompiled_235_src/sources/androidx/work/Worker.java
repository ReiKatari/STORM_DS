package androidx.work;

import android.content.Context;
import java.util.concurrent.ExecutorService;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class Worker extends nx3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.nx3
    public final tb0 a() {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return ak7.W(new pk0(10, executorService, new kt5(this, 22)));
    }

    @Override // defpackage.nx3
    public final tb0 d() {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return ak7.W(new pk0(10, executorService, new t46(this, 25)));
    }

    public abstract lx3 e();
}
