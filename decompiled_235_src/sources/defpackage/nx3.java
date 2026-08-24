package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nx3  reason: default package */
/* loaded from: classes.dex */
public abstract class nx3 {
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public nx3(Context context, WorkerParameters workerParameters) {
        this.a = context;
        this.b = workerParameters;
    }

    public abstract tb0 a();

    public final gx3 b(wj2 wj2Var) {
        WorkerParameters workerParameters = this.b;
        fw7 fw7Var = workerParameters.h;
        return yh2.p(fw7Var.a.a, "setForegroundAsync", new hf0(fw7Var, workerParameters.a, wj2Var, this.a));
    }

    public final void c(xb1 xb1Var) {
        WorkerParameters workerParameters = this.b;
        tw7 tw7Var = workerParameters.g;
        yh2.p(tw7Var.b.a, "updateProgress", new u6(tw7Var, workerParameters.a, xb1Var, 22));
    }

    public abstract tb0 d();
}
