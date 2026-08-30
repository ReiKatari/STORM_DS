package defpackage;

import android.view.Display;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hy  reason: default package */
/* loaded from: classes.dex */
public final class hy extends le1 {
    public static final List b = l07.c0("Built-in Screen", "Screen-2");

    @Override // defpackage.le1
    public final wd3 b(Display display, Display display2) {
        td3 td3Var;
        ud3 ud3Var;
        td3 td3Var2;
        String name = display.getName();
        List list = b;
        if (list.contains(name)) {
            td3Var = td3.BUILT_IN;
        } else {
            td3Var = td3.EXTERNAL;
        }
        ud3 a = a(display, td3Var);
        if (display2 != null) {
            if (list.contains(display2.getName())) {
                td3Var2 = td3.BUILT_IN;
            } else {
                td3Var2 = td3.EXTERNAL;
            }
            ud3Var = a(display2, td3Var2);
        } else {
            ud3Var = null;
        }
        return new wd3(a, ud3Var);
    }
}
