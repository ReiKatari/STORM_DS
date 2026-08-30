package defpackage;

import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wf7  reason: default package */
/* loaded from: classes.dex */
public class wf7 extends bg7 {
    public final Window a;
    public final dz4 b;

    public wf7(Window window, dz4 dz4Var) {
        this.a = window;
        this.b = dz4Var;
    }

    @Override // defpackage.bg7
    public final void b(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 8) {
                            ((dz4) this.b.A).v();
                        }
                    } else {
                        h(2);
                    }
                } else {
                    h(4);
                }
            }
        }
    }

    @Override // defpackage.bg7
    public final boolean c() {
        if ((this.a.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bg7
    public final void e(boolean z) {
        if (z) {
            Window window = this.a;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            h(8192);
            return;
        }
        i(8192);
    }

    @Override // defpackage.bg7
    public final void f() {
        this.a.getDecorView().setTag(356039078, 2);
        i(2048);
        h(4096);
    }

    @Override // defpackage.bg7
    public final void g(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 8) {
                            ((dz4) this.b.A).A();
                        }
                    } else {
                        i(2);
                    }
                } else {
                    i(4);
                    this.a.clearFlags(1024);
                }
            }
        }
    }

    public final void h(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void i(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
