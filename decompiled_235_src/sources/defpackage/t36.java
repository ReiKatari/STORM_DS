package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t36  reason: default package */
/* loaded from: classes.dex */
public final class t36 implements Runnable {
    public final /* synthetic */ int A;
    public final Runnable B;

    public /* synthetic */ t36(Runnable runnable, int i) {
        this.A = i;
        this.B = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        Runnable runnable = this.B;
        switch (i) {
            case 0:
                try {
                    runnable.run();
                    return;
                } catch (Exception e) {
                    Log.e("TransportRuntime.".concat("Executor"), "Background execution failure.", e);
                    return;
                }
            default:
                runnable.run();
                return;
        }
    }
}
