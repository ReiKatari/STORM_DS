package a6;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends a0.b {
    public View L;

    /* JADX WARN: Type inference failed for: r4v0, types: [a6.d0] */
    @Override // a0.b
    public final void S() {
        WindowInsetsController windowInsetsController;
        int ime;
        View view = this.L;
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: a6.d0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i2) {
                    boolean z10;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if ((i2 & 8) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    atomicBoolean2.set(z10);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r42);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r42);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
            return;
        }
        super.S();
    }

    @Override // a0.b
    public final void Y() {
        WindowInsetsController windowInsetsController;
        int ime;
        View view = this.L;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        }
        super.Y();
    }
}
