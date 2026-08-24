package defpackage;

import android.view.Display;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: le1  reason: default package */
/* loaded from: classes.dex */
public final class le1 extends pi1 {
    @Override // defpackage.pi1
    public final ok3 b(Display display, Display display2) {
        lk3 lk3Var;
        mk3 mk3Var;
        lk3 lk3Var2;
        if (nb3.k(display.getName(), "Built-in Screen")) {
            lk3Var = lk3.BUILT_IN;
        } else {
            lk3Var = lk3.EXTERNAL;
        }
        mk3 a = a(display, lk3Var);
        if (display2 != null) {
            if (nb3.k(display2.getName(), "Built-in Screen")) {
                lk3Var2 = lk3.BUILT_IN;
            } else {
                lk3Var2 = lk3.EXTERNAL;
            }
            mk3Var = a(display2, lk3Var2);
        } else {
            mk3Var = null;
        }
        return new ok3(a, mk3Var);
    }
}
