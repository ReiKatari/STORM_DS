package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kv2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kv2 implements Choreographer.FrameCallback {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ Object B;

    public /* synthetic */ kv2(rj0 rj0Var) {
        this.B = rj0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Handler handler;
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                xe1 xe1Var = xk1.a;
                ((rj0) obj).I(e04.a, Long.valueOf(j));
                return;
            default:
                Context context = (Context) obj;
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = Handler.createAsync(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new qq(context, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
        }
    }
}
