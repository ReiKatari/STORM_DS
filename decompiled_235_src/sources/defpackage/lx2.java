package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lx2  reason: default package */
/* loaded from: classes.dex */
public final class lx2 implements Executor {
    public static volatile lx2 L;
    public final /* synthetic */ int A;
    public final Executor B;

    public lx2() {
        this.A = 0;
        this.B = Executors.newSingleThreadExecutor(new kx2(0));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.A) {
            case 0:
                ((ExecutorService) this.B).execute(runnable);
                return;
            default:
                this.B.execute(new t36(runnable, 0));
                return;
        }
    }

    public lx2(ExecutorService executorService) {
        this.A = 1;
        this.B = executorService;
    }
}
