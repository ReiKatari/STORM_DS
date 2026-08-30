package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ss6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ss6 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ xn1 B;
    public final /* synthetic */ qe0 L;

    public /* synthetic */ ss6(xn1 xn1Var, qe0 qe0Var, int i) {
        this.A = i;
        this.B = xn1Var;
        this.L = qe0Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        qe0 qe0Var = this.L;
        xn1 xn1Var = this.B;
        switch (i) {
            case 0:
                ((ie0) xn1Var.Y).getClass();
                HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", xn1Var.R);
                handlerThread.start();
                qe0Var.a(ne0.THREAD, new tm3(16, handlerThread));
                return new Handler(handlerThread.getLooper());
            default:
                Executor executor = ((ie0) xn1Var.Y).a;
                if (executor == null) {
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1, new am(xn1Var.R, dm.b(dm.b, "CXCP-Camera-E")));
                    newFixedThreadPool.getClass();
                    qe0Var.a(ne0.THREAD, new tm3(17, newFixedThreadPool));
                    return newFixedThreadPool;
                }
                return executor;
        }
    }
}
