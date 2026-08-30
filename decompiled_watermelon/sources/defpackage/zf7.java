package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zf7  reason: default package */
/* loaded from: classes.dex */
public class zf7 extends bg7 {
    public final WindowInsetsController a;
    public final dz4 b;
    public final Window c;

    public zf7(Window window, dz4 dz4Var) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.a = insetsController;
        this.b = dz4Var;
        this.c = window;
    }

    @Override // defpackage.bg7
    public final void b(int i) {
        this.a.hide(i & (-9));
    }

    @Override // defpackage.bg7
    public boolean c() {
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

    @Override // defpackage.bg7
    public void d(boolean z) {
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

    @Override // defpackage.bg7
    public void e(boolean z) {
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

    @Override // defpackage.bg7
    public void f() {
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

    @Override // defpackage.bg7
    public final void g(int i) {
        if ((i & 8) != 0) {
            ((dz4) this.b.A).A();
        }
        this.a.show(i & (-9));
    }

    public final void h(int i) {
        View decorView = this.c.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
