package defpackage;

import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wu7  reason: default package */
/* loaded from: classes.dex */
public class wu7 extends bv7 {
    public final Window a;
    public final s35 b;

    public wu7(Window window, s35 s35Var) {
        this.a = window;
        this.b = s35Var;
    }

    @Override // defpackage.bv7
    public final void a(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 8) {
                            ((s35) this.b.A).z();
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

    @Override // defpackage.bv7
    public final boolean b() {
        if ((this.a.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bv7
    public final void d(boolean z) {
        if (z) {
            Window window = this.a;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            h(8192);
            return;
        }
        i(8192);
    }

    @Override // defpackage.bv7
    public final void e() {
        this.a.getDecorView().setTag(356039078, 2);
        i(2048);
        h(4096);
    }

    @Override // defpackage.bv7
    public final void f(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 8) {
                            ((s35) this.b.A).E();
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
