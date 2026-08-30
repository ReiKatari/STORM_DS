package d;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.o0;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long A = SystemClock.uptimeMillis() + 10000;
    public Runnable B;
    public boolean L;
    public final /* synthetic */ o0 R;

    public h(o0 o0Var) {
        this.R = o0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.B = runnable;
        View decorView = this.R.getWindow().getDecorView();
        decorView.getClass();
        if (this.L) {
            if (nc.k.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new a8.f(5, this));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z10;
        Runnable runnable = this.B;
        if (runnable != null) {
            runnable.run();
            this.B = null;
            u uVar = (u) this.R.Z.getValue();
            synchronized (uVar.f3308b) {
                z10 = uVar.f3309c;
            }
            if (z10) {
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
