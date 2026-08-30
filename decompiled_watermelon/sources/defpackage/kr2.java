package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kr2  reason: default package */
/* loaded from: classes.dex */
public final class kr2 implements Executor {
    public static volatile kr2 L;
    public final /* synthetic */ int A;
    public final Object B;

    public kr2() {
        this.A = 0;
        this.B = Executors.newSingleThreadExecutor(new jr2(0));
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
                ((nh7) obj).c.post(runnable);
                return;
        }
    }

    public kr2(nh7 nh7Var) {
        this.A = 1;
        this.B = nh7Var;
    }
}
