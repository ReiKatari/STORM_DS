package ih;

import android.os.HandlerThread;
import androidx.preference.v;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends HandlerThread {
    public v A;
    public volatile boolean B;
    public final h L;
    public final a0.g R;
    public final /* synthetic */ x0 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [ih.h, java.lang.Object] */
    public g(x0 x0Var) {
        super("FrameRenderThread");
        this.X = x0Var;
        this.B = true;
        this.L = new Object();
        this.R = new a0.g(24, x0Var, this);
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        this.A = new v(1, getLooper(), this);
    }
}
