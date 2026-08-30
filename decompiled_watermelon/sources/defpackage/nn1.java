package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nn1  reason: default package */
/* loaded from: classes.dex */
public class nn1 extends mn1 {
    @Override // defpackage.ln1, defpackage.rn1
    public void b(ml6 ml6Var, ml6 ml6Var2, Window window, View view, boolean z, boolean z2) {
        bg7 wf7Var;
        ml6Var.getClass();
        ml6Var2.getClass();
        window.getClass();
        view.getClass();
        boolean z3 = false;
        ie7.d(window, false);
        window.setStatusBarColor(ml6Var.a(z));
        window.setNavigationBarColor(ml6Var2.a(z2));
        window.setStatusBarContrastEnforced(false);
        if (ml6Var2.c == 0) {
            z3 = true;
        }
        window.setNavigationBarContrastEnforced(z3);
        dz4 dz4Var = new dz4(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            wf7Var = new zf7(window, dz4Var);
        } else if (i >= 30) {
            wf7Var = new zf7(window, dz4Var);
        } else if (i >= 26) {
            wf7Var = new wf7(window, dz4Var);
        } else {
            wf7Var = new wf7(window, dz4Var);
        }
        wf7Var.e(!z);
        wf7Var.d(!z2);
    }
}
