package defpackage;

import android.view.Choreographer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bo implements Choreographer.FrameCallback {
    public final /* synthetic */ int A;
    public final /* synthetic */ Runnable B;

    public /* synthetic */ bo(int i, Runnable runnable) {
        this.A = i;
        this.B = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.A;
        Runnable runnable = this.B;
        switch (i) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
