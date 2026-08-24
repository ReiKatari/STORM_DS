package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pi  reason: default package */
/* loaded from: classes.dex */
public final class pi implements Executor {
    public final /* synthetic */ int A;
    public final Handler B;

    public pi() {
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
                    e41.e(handler);
                    return;
                }
                return;
        }
    }

    public pi(Handler handler) {
        this.A = 1;
        handler.getClass();
        this.B = handler;
    }
}
