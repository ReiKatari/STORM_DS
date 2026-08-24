package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bn6  reason: default package */
/* loaded from: classes.dex */
public final class bn6 extends s35 {
    public View B;

    @Override // defpackage.s35
    public final void E() {
        WindowInsetsController windowInsetsController;
        int ime;
        View view = this.B;
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
        super.E();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [an6] */
    @Override // defpackage.s35
    public final void z() {
        WindowInsetsController windowInsetsController;
        int ime;
        View view = this.B;
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r3 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: an6
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    boolean z;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if ((i & 8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    atomicBoolean2.set(z);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r3);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r3);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
            return;
        }
        super.z();
    }
}
