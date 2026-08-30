package defpackage;

import android.view.WindowInsetsController;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ag7  reason: default package */
/* loaded from: classes.dex */
public final class ag7 extends zf7 {
    @Override // defpackage.zf7, defpackage.bg7
    public final boolean c() {
        int systemBarsAppearance;
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zf7, defpackage.bg7
    public final void d(boolean z) {
        int i;
        WindowInsetsController windowInsetsController = this.a;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        windowInsetsController.setSystemBarsAppearance(i, 16);
    }

    @Override // defpackage.zf7, defpackage.bg7
    public final void e(boolean z) {
        int i;
        WindowInsetsController windowInsetsController = this.a;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        windowInsetsController.setSystemBarsAppearance(i, 8);
    }

    @Override // defpackage.zf7, defpackage.bg7
    public final void f() {
        this.a.setSystemBarsBehavior(2);
    }
}
