package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jp2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jp2 implements Choreographer.FrameCallback {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ Object B;

    public /* synthetic */ jp2(ih0 ih0Var) {
        this.B = ih0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Handler handler;
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                bb1 bb1Var = tg1.a;
                ((ih0) obj).H(bt3.a, Long.valueOf(j));
                return;
            default:
                Context context = (Context) obj;
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = Handler.createAsync(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new eq(context, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
        }
    }
}
