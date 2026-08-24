package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j57  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j57 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ gs1 B;
    public final /* synthetic */ zg0 L;

    public /* synthetic */ j57(gs1 gs1Var, zg0 zg0Var, int i) {
        this.A = i;
        this.B = gs1Var;
        this.L = zg0Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        zg0 zg0Var = this.L;
        gs1 gs1Var = this.B;
        switch (i) {
            case 0:
                ((rg0) gs1Var.Y).getClass();
                HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", gs1Var.R);
                handlerThread.start();
                zg0Var.a(wg0.THREAD, new rk3(handlerThread, 18));
                return new Handler(handlerThread.getLooper());
            default:
                Executor executor = ((rg0) gs1Var.Y).a;
                if (executor == null) {
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1, new mm(gs1Var.R, pm.b(pm.b, "CXCP-Camera-E")));
                    newFixedThreadPool.getClass();
                    zg0Var.a(wg0.THREAD, new rk3(newFixedThreadPool, 19));
                    return newFixedThreadPool;
                }
                return executor;
        }
    }
}
