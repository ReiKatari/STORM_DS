package l6;

import android.view.Choreographer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Choreographer.FrameCallback {
    public final /* synthetic */ int A;
    public final /* synthetic */ Runnable B;

    public /* synthetic */ b(Runnable runnable, int i2) {
        this.A = i2;
        this.B = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        switch (this.A) {
            case 0:
                this.B.run();
                return;
            default:
                this.B.run();
                return;
        }
    }
}
