package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ec3  reason: default package */
/* loaded from: classes.dex */
public final class ec3 implements Executor {
    public static volatile ec3 L;
    public final /* synthetic */ int A;
    public final Object B;

    public ec3() {
        this.A = 0;
        this.B = Executors.newFixedThreadPool(2, new ff0(2));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((ExecutorService) obj).execute(runnable);
                return;
            default:
                ((ow7) obj).c.post(runnable);
                return;
        }
    }

    public ec3(ow7 ow7Var) {
        this.A = 1;
        this.B = ow7Var;
    }
}
