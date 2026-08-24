package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xr1  reason: default package */
/* loaded from: classes.dex */
public class xr1 extends wr1 {
    @Override // defpackage.vr1, defpackage.bs1
    public void b(ix6 ix6Var, ix6 ix6Var2, Window window, View view, boolean z, boolean z2) {
        bv7 wu7Var;
        ix6Var.getClass();
        ix6Var2.getClass();
        window.getClass();
        view.getClass();
        boolean z3 = false;
        kt7.a(window, false);
        window.setStatusBarColor(ix6Var.a(z));
        window.setNavigationBarColor(ix6Var2.a(z2));
        window.setStatusBarContrastEnforced(false);
        if (ix6Var2.c == 0) {
            z3 = true;
        }
        window.setNavigationBarContrastEnforced(z3);
        s35 s35Var = new s35(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            wu7Var = new zu7(window, s35Var);
        } else if (i >= 30) {
            wu7Var = new zu7(window, s35Var);
        } else if (i >= 26) {
            wu7Var = new wu7(window, s35Var);
        } else {
            wu7Var = new wu7(window, s35Var);
        }
        wu7Var.d(!z);
        wu7Var.c(!z2);
    }
}
