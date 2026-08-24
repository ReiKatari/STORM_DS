package defpackage;

import android.view.WindowInsetsController;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av7  reason: default package */
/* loaded from: classes.dex */
public final class av7 extends zu7 {
    @Override // defpackage.zu7, defpackage.bv7
    public final boolean b() {
        int systemBarsAppearance;
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zu7, defpackage.bv7
    public final void c(boolean z) {
        int i;
        WindowInsetsController windowInsetsController = this.a;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        windowInsetsController.setSystemBarsAppearance(i, 16);
    }

    @Override // defpackage.zu7, defpackage.bv7
    public final void d(boolean z) {
        int i;
        WindowInsetsController windowInsetsController = this.a;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        windowInsetsController.setSystemBarsAppearance(i, 8);
    }

    @Override // defpackage.zu7, defpackage.bv7
    public final void e() {
        this.a.setSystemBarsBehavior(2);
    }
}
