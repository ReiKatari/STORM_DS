package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: di  reason: default package */
/* loaded from: classes.dex */
public final class di implements Executor {
    public final /* synthetic */ int A;
    public final Handler B;

    public di() {
        this.A = 0;
        this.B = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.A;
        Handler handler = this.B;
        switch (i) {
            case 0:
                handler.post(runnable);
                return;
            default:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    f81.f(handler);
                    return;
                }
                return;
        }
    }

    public di(Handler handler) {
        this.A = 1;
        handler.getClass();
        this.B = handler;
    }
}
