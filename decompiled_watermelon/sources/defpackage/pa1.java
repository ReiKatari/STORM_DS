package defpackage;

import android.view.Display;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pa1  reason: default package */
/* loaded from: classes.dex */
public final class pa1 extends le1 {
    @Override // defpackage.le1
    public final wd3 b(Display display, Display display2) {
        td3 td3Var;
        ud3 ud3Var;
        td3 td3Var2;
        if (b53.x(display.getName(), "Built-in Screen")) {
            td3Var = td3.BUILT_IN;
        } else {
            td3Var = td3.EXTERNAL;
        }
        ud3 a = a(display, td3Var);
        if (display2 != null) {
            if (b53.x(display2.getName(), "Built-in Screen")) {
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
