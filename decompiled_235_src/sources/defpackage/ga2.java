package defpackage;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ga2  reason: default package */
/* loaded from: classes.dex */
public abstract class ga2 extends h20 {
    public final boolean B;

    public ga2(s03 s03Var, boolean z, u87 u87Var) {
        s03Var.getClass();
        u87Var.getClass();
        this.A = s03Var;
        this.B = z;
    }

    public final void a(View view, ea2 ea2Var) {
        int i;
        ea2Var.getClass();
        if (this.B) {
            int i2 = fa2.a[ea2Var.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = 4;
                } else {
                    i.d();
                    return;
                }
            } else {
                i = 0;
            }
            view.performHapticFeedback(i);
        }
    }
}
