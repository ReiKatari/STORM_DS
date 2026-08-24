package defpackage;

import android.view.Display;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yz  reason: default package */
/* loaded from: classes.dex */
public final class yz extends pi1 {
    public static final List b = hf.c0("Built-in Screen", "Screen-2");

    @Override // defpackage.pi1
    public final ok3 b(Display display, Display display2) {
        lk3 lk3Var;
        mk3 mk3Var;
        lk3 lk3Var2;
        String name = display.getName();
        List list = b;
        if (list.contains(name)) {
            lk3Var = lk3.BUILT_IN;
        } else {
            lk3Var = lk3.EXTERNAL;
        }
        mk3 a = a(display, lk3Var);
        if (display2 != null) {
            if (list.contains(display2.getName())) {
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
