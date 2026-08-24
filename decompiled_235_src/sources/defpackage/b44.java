package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b44  reason: default package */
/* loaded from: classes.dex */
public final class b44 {
    public final Context a;
    public double b;
    public final boolean c;
    public final boolean d;

    public b44(Context context) {
        this.a = context;
        Bitmap.Config[] configArr = k.a;
        double d = 0.2d;
        try {
            Object systemService = context.getSystemService(ActivityManager.class);
            systemService.getClass();
            if (((ActivityManager) systemService).isLowRamDevice()) {
                d = 0.15d;
            }
        } catch (Exception unused) {
        }
        this.b = d;
        this.c = true;
        this.d = true;
    }

    public final se5 a() {
        rs7 x31Var;
        at6 d51Var;
        int i;
        int i2 = 0;
        if (this.d) {
            x31Var = new zb(12, (byte) 0);
        } else {
            x31Var = new x31(3);
        }
        if (this.c) {
            double d = this.b;
            if (d > 0.0d) {
                Context context = this.a;
                Bitmap.Config[] configArr = k.a;
                try {
                    Object systemService = context.getSystemService(ActivityManager.class);
                    systemService.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService;
                    if ((context.getApplicationInfo().flags & 1048576) != 0) {
                        i = activityManager.getLargeMemoryClass();
                    } else {
                        i = activityManager.getMemoryClass();
                    }
                } catch (Exception unused) {
                    i = 256;
                }
                i2 = (int) (d * i * 1024.0d * 1024.0d);
            }
            if (i2 > 0) {
                d51Var = new ap3(i2, x31Var);
            } else {
                d51Var = new d51(x31Var, 17);
            }
        } else {
            d51Var = new d51(x31Var, 17);
        }
        return new se5(d51Var, x31Var);
    }
}
