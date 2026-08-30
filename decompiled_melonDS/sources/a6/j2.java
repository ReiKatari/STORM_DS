package a6;

import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class j2 extends aj.g {

    /* renamed from: l  reason: collision with root package name */
    public final Window f480l;
    public final a0.b m;

    public j2(Window window, a0.b bVar) {
        this.f480l = window;
        this.m = bVar;
    }

    public final void C0(int i2) {
        View decorView = this.f480l.getDecorView();
        decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
    }

    public final void D0(int i2) {
        View decorView = this.f480l.getDecorView();
        decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
    }

    @Override // aj.g
    public final void H(int i2) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i2 & i10) != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 8) {
                            ((a0.b) this.m.B).S();
                        }
                    } else {
                        C0(2);
                    }
                } else {
                    C0(4);
                }
            }
        }
    }

    @Override // aj.g
    public final boolean K() {
        if ((this.f480l.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    @Override // aj.g
    public final void e0(boolean z10) {
        if (z10) {
            Window window = this.f480l;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            C0(8192);
            return;
        }
        D0(8192);
    }

    @Override // aj.g
    public final void n0() {
        this.f480l.getDecorView().setTag(356039078, 2);
        D0(2048);
        C0(4096);
    }

    @Override // aj.g
    public final void q0(int i2) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i2 & i10) != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 8) {
                            ((a0.b) this.m.B).Y();
                        }
                    } else {
                        D0(2);
                    }
                } else {
                    D0(4);
                    this.f480l.clearFlags(1024);
                }
            }
        }
    }
}
