package ad;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ed.n;
import java.util.Random;
import zc.g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Choreographer.FrameCallback {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ Object B;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        Handler handler;
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 0:
                gd.f fVar = g0.f15015a;
                ((zc.h) obj).F(n.f4465a, Long.valueOf(j2));
                return;
            default:
                Context context = (Context) obj;
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = Handler.createAsync(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new h7.f(context, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
        }
    }

    public /* synthetic */ f(zc.h hVar) {
        this.B = hVar;
    }
}
