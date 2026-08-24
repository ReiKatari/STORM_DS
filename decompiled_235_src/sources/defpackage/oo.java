package defpackage;

import android.view.Choreographer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class oo implements Choreographer.FrameCallback {
    public final /* synthetic */ int A;
    public final /* synthetic */ Runnable B;

    public /* synthetic */ oo(Runnable runnable, int i) {
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
