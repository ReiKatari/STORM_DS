package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nw3  reason: default package */
/* loaded from: classes.dex */
public final class nw3 {
    public final Context a;
    public double b;
    public final boolean c;
    public final boolean d;

    public nw3(Context context) {
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

    public final f55 a() {
        ud7 jo1Var;
        jh6 t71Var;
        int i;
        int i2 = 0;
        if (this.d) {
            jo1Var = new sb(12, (byte) 0);
        } else {
            jo1Var = new jo1(1);
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
                t71Var = new ci3(i2, jo1Var);
            } else {
                t71Var = new t71(15, jo1Var);
            }
        } else {
            t71Var = new t71(15, jo1Var);
        }
        return new f55(t71Var, jo1Var);
    }
}
