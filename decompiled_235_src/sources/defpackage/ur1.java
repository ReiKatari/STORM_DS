package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ur1  reason: default package */
/* loaded from: classes.dex */
public final class ur1 extends bs1 {
    @Override // defpackage.bs1
    public void b(ix6 ix6Var, ix6 ix6Var2, Window window, View view, boolean z, boolean z2) {
        int i;
        bv7 wu7Var;
        ix6Var.getClass();
        ix6Var2.getClass();
        window.getClass();
        view.getClass();
        kt7.a(window, false);
        if (z) {
            i = ix6Var.b;
        } else {
            i = ix6Var.a;
        }
        window.setStatusBarColor(i);
        window.setNavigationBarColor(ix6Var2.b);
        s35 s35Var = new s35(view);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            wu7Var = new zu7(window, s35Var);
        } else if (i2 >= 30) {
            wu7Var = new zu7(window, s35Var);
        } else if (i2 >= 26) {
            wu7Var = new wu7(window, s35Var);
        } else {
            wu7Var = new wu7(window, s35Var);
        }
        wu7Var.d(!z);
    }
}
