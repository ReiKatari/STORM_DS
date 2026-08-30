package defpackage;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n52  reason: default package */
/* loaded from: classes.dex */
public abstract class n52 extends q00 {
    public final boolean B;

    public n52(qu2 qu2Var, boolean z, hw6 hw6Var) {
        qu2Var.getClass();
        hw6Var.getClass();
        this.A = qu2Var;
        this.B = z;
    }

    public final void a(View view, l52 l52Var) {
        int i;
        l52Var.getClass();
        if (this.B) {
            int i2 = m52.a[l52Var.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = 4;
                } else {
                    i.c();
                    return;
                }
            } else {
                i = 0;
            }
            view.performHapticFeedback(i);
        }
    }
}
