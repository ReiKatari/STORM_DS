package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kn1  reason: default package */
/* loaded from: classes.dex */
public final class kn1 extends rn1 {
    @Override // defpackage.rn1
    public void b(ml6 ml6Var, ml6 ml6Var2, Window window, View view, boolean z, boolean z2) {
        int i;
        bg7 wf7Var;
        ml6Var.getClass();
        ml6Var2.getClass();
        window.getClass();
        view.getClass();
        ie7.d(window, false);
        if (z) {
            i = ml6Var.b;
        } else {
            i = ml6Var.a;
        }
        window.setStatusBarColor(i);
        window.setNavigationBarColor(ml6Var2.b);
        dz4 dz4Var = new dz4(view);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            wf7Var = new zf7(window, dz4Var);
        } else if (i2 >= 30) {
            wf7Var = new zf7(window, dz4Var);
        } else if (i2 >= 26) {
            wf7Var = new wf7(window, dz4Var);
        } else {
            wf7Var = new wf7(window, dz4Var);
        }
        wf7Var.e(!z);
    }
}
