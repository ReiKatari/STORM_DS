package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mq3  reason: default package */
/* loaded from: classes.dex */
public abstract class mq3 {
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public mq3(Context context, WorkerParameters workerParameters) {
        this.a = context;
        this.b = workerParameters;
    }

    public abstract l90 a();

    public final fq3 b(xe2 xe2Var) {
        WorkerParameters workerParameters = this.b;
        fh7 fh7Var = workerParameters.h;
        return oo2.D(fh7Var.a.a, "setForegroundAsync", new yc0(fh7Var, workerParameters.a, xe2Var, this.a));
    }

    public final void c(g81 g81Var) {
        WorkerParameters workerParameters = this.b;
        sh7 sh7Var = workerParameters.g;
        oo2.D(sh7Var.b.a, "updateProgress", new t6(sh7Var, workerParameters.a, g81Var, 22));
    }

    public abstract l90 d();
}
