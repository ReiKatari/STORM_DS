package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu7  reason: default package */
/* loaded from: classes.dex */
public class zu7 extends bv7 {
    public final WindowInsetsController a;
    public final s35 b;
    public final Window c;

    public zu7(Window window, s35 s35Var) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.a = insetsController;
        this.b = s35Var;
        this.c = window;
    }

    @Override // defpackage.bv7
    public final void a(int i) {
        this.a.hide(i & (-9));
    }

    @Override // defpackage.bv7
    public boolean b() {
        int systemBarsAppearance;
        Window window = this.c;
        if (window == null) {
            this.a.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.a.getSystemBarsAppearance();
            if ((systemBarsAppearance & 8) != 0) {
                return true;
            }
            return false;
        } else if ((window.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override // defpackage.bv7
    public void c(boolean z) {
        Window window = this.c;
        if (window != null) {
            if (z) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
            h(16);
            return;
        }
        WindowInsetsController windowInsetsController = this.a;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.bv7
    public void d(boolean z) {
        Window window = this.c;
        if (window != null) {
            if (z) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
            h(8192);
            return;
        }
        WindowInsetsController windowInsetsController = this.a;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.bv7
    public void e() {
        Window window = this.c;
        if (window == null) {
            this.a.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        h(2048);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4096);
    }

    @Override // defpackage.bv7
    public final void f(int i) {
        if ((i & 8) != 0) {
            ((s35) this.b.A).E();
        }
        this.a.show(i & (-9));
    }

    public final void h(int i) {
        View decorView = this.c.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
