package q4;

import android.view.Choreographer;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Executor {
    public final /* synthetic */ Choreographer A;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A.postFrameCallback(new l6.b(runnable, 1));
    }
}
