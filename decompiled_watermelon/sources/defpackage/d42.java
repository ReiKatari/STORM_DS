package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d42  reason: default package */
/* loaded from: classes.dex */
public final class d42 {
    public final ys0 a;
    public f42 b;
    public et0 c;
    public final vg1 d = new vg1(2, this);

    public d42(ys0 ys0Var) {
        this.a = ys0Var;
    }

    public final void a() {
        Object systemService = this.a.getSystemService("display");
        systemService.getClass();
        ((DisplayManager) systemService).unregisterDisplayListener(this.d);
        f42 f42Var = this.b;
        if (f42Var != null) {
            f42Var.dismiss();
        }
        this.b = null;
    }

    public final void b() {
        Display display;
        ys0 ys0Var = this.a;
        Object systemService = ys0Var.getSystemService("display");
        systemService.getClass();
        Display[] displays = ((DisplayManager) systemService).getDisplays("android.hardware.display.category.PRESENTATION");
        displays.getClass();
        Display display2 = (Display) nu.q0(displays);
        f42 f42Var = this.b;
        if (display2 == null) {
            if (f42Var != null) {
                f42Var.dismiss();
            }
            this.b = null;
        } else if (f42Var != null && (display = f42Var.getDisplay()) != null && display.getDisplayId() == display2.getDisplayId()) {
        } else {
            f42 f42Var2 = this.b;
            if (f42Var2 != null) {
                f42Var2.dismiss();
            }
            f42 f42Var3 = new f42(ys0Var, display2);
            f42Var3.B.setValue(this.c);
            try {
                f42Var3.show();
            } catch (Throwable unused) {
            }
            this.b = f42Var3;
        }
    }
}
