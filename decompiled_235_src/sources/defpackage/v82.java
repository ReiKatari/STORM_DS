package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v82  reason: default package */
/* loaded from: classes.dex */
public final class v82 {
    public final mv0 a;
    public x82 b;
    public zv0 c;
    public final zk1 d = new zk1(this, 2);

    public v82(mv0 mv0Var) {
        this.a = mv0Var;
    }

    public final void a() {
        Object systemService = this.a.getSystemService("display");
        systemService.getClass();
        ((DisplayManager) systemService).unregisterDisplayListener(this.d);
        x82 x82Var = this.b;
        if (x82Var != null) {
            x82Var.dismiss();
        }
        this.b = null;
    }

    public final void b() {
        Display display;
        mv0 mv0Var = this.a;
        Object systemService = mv0Var.getSystemService("display");
        systemService.getClass();
        Display[] displays = ((DisplayManager) systemService).getDisplays("android.hardware.display.category.PRESENTATION");
        displays.getClass();
        Display display2 = (Display) fv.E0(displays);
        x82 x82Var = this.b;
        if (display2 == null) {
            if (x82Var != null) {
                x82Var.dismiss();
            }
            this.b = null;
        } else if (x82Var != null && (display = x82Var.getDisplay()) != null && display.getDisplayId() == display2.getDisplayId()) {
        } else {
            x82 x82Var2 = this.b;
            if (x82Var2 != null) {
                x82Var2.dismiss();
            }
            x82 x82Var3 = new x82(mv0Var, display2);
            x82Var3.B.setValue(this.c);
            try {
                x82Var3.show();
            } catch (Throwable unused) {
            }
            this.b = x82Var3;
        }
    }
}
