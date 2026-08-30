package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l22  reason: default package */
/* loaded from: classes.dex */
public final class l22 implements Executor {
    public static volatile l22 L;
    public final /* synthetic */ int A;
    public final Object B;

    public l22() {
        this.A = 2;
        this.B = Executors.newFixedThreadPool(2, new wc0(2));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                Handler handler = (Handler) obj;
                runnable.getClass();
                if (!handler.post(runnable)) {
                    f81.f(handler);
                    return;
                }
                return;
            case 1:
                Handler handler2 = (Handler) obj;
                runnable.getClass();
                if (!handler2.post(runnable)) {
                    f81.f(handler2);
                    return;
                }
                return;
            default:
                ((ExecutorService) obj).execute(runnable);
                return;
        }
    }

    public /* synthetic */ l22(Handler handler, int i) {
        this.A = i;
        this.B = handler;
    }
}
