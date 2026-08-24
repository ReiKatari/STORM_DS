package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jv0  reason: default package */
/* loaded from: classes.dex */
public final class jv0 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long A = SystemClock.uptimeMillis() + 10000;
    public Runnable B;
    public boolean L;
    public final /* synthetic */ mv0 R;

    public jv0(mv0 mv0Var) {
        this.R = mv0Var;
    }

    public final void a(View view) {
        if (!this.L) {
            this.L = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.B = runnable;
        View decorView = this.R.getWindow().getDecorView();
        decorView.getClass();
        if (this.L) {
            if (nb3.k(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new n0(this, 12));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.B;
        if (runnable != null) {
            runnable.run();
            this.B = null;
            nn2 nn2Var = (nn2) this.R.Z.getValue();
            synchronized (nn2Var.b) {
                z = nn2Var.c;
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
