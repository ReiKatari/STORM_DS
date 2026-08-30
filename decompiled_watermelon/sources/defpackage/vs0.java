package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.p;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vs0  reason: default package */
/* loaded from: classes.dex */
public final class vs0 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long A = SystemClock.uptimeMillis() + 10000;
    public Runnable B;
    public boolean L;
    public final /* synthetic */ p R;

    public vs0(p pVar) {
        this.R = pVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.B = runnable;
        View decorView = this.R.getWindow().getDecorView();
        decorView.getClass();
        if (this.L) {
            if (b53.x(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new m0(12, this));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.B;
        if (runnable != null) {
            runnable.run();
            this.B = null;
            ji2 ji2Var = (ji2) this.R.Z.getValue();
            synchronized (ji2Var.b) {
                z = ji2Var.c;
            }
            if (z) {
                this.L = false;
                this.R.getWindow().getDecorView().post(this);
            }
        } else if (SystemClock.uptimeMillis() > this.A) {
            this.L = false;
            this.R.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.R.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
