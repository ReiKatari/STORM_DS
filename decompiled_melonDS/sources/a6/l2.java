package a6;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class l2 extends aj.g {

    /* renamed from: l  reason: collision with root package name */
    public final WindowInsetsController f487l;
    public final a0.b m;

    /* renamed from: n  reason: collision with root package name */
    public final Window f488n;

    public l2(Window window, a0.b bVar) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f487l = insetsController;
        this.m = bVar;
        this.f488n = window;
    }

    public final void C0(int i2) {
        View decorView = this.f488n.getDecorView();
        decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
    }

    public final void D0(int i2) {
        View decorView = this.f488n.getDecorView();
        decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
    }

    @Override // aj.g
    public final void H(int i2) {
        this.f487l.hide(i2 & (-9));
    }

    @Override // aj.g
    public boolean K() {
        int systemBarsAppearance;
        this.f487l.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.f487l.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // aj.g
    public final void d0(boolean z10) {
        Window window = this.f488n;
        if (z10) {
            if (window != null) {
                C0(16);
            }
            this.f487l.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            D0(16);
        }
        this.f487l.setSystemBarsAppearance(0, 16);
    }

    @Override // aj.g
    public final void e0(boolean z10) {
        Window window = this.f488n;
        if (z10) {
            if (window != null) {
                C0(8192);
            }
            this.f487l.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            D0(8192);
        }
        this.f487l.setSystemBarsAppearance(0, 8);
    }

    @Override // aj.g
    public void n0() {
        Window window = this.f488n;
        if (window == null) {
            this.f487l.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        D0(2048);
        C0(4096);
    }

    @Override // aj.g
    public final void q0(int i2) {
        if ((i2 & 8) != 0) {
            ((a0.b) this.m.B).Y();
        }
        this.f487l.show(i2 & (-9));
    }
}
