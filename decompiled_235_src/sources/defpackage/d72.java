package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d72  reason: default package */
/* loaded from: classes.dex */
public final class d72 implements Executor {
    public final /* synthetic */ int A;
    public final Handler B;

    public /* synthetic */ d72(Handler handler, int i) {
        this.A = i;
        this.B = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.A;
        Handler handler = this.B;
        switch (i) {
            case 0:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    e41.e(handler);
                    return;
                }
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
}
