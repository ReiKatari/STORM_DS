package defpackage;

import android.os.Build;
import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fb0  reason: default package */
/* loaded from: classes.dex */
public final class fb0 {
    public static final Map c;
    public static final Map d;
    public final db0 a;
    public final tg6 b;

    static {
        Map singletonMap = Collections.singletonMap("Google", nu.H0(new String[]{"oriole", "raven", "bluejay", "panther", "cheetah", "lynx"}));
        singletonMap.getClass();
        c = singletonMap;
        d = zt3.l0(new ti4("google", nu.H0(new String[]{"pixel 4", "pixel 4 xl"})), new ti4("samsung", hi2.X("sm-g770f")));
    }

    public fb0(db0 db0Var, tg6 tg6Var) {
        db0Var.getClass();
        tg6Var.getClass();
        this.a = db0Var;
        this.b = tg6Var;
    }

    public final boolean a(String str) {
        boolean z;
        boolean z2;
        str.getClass();
        this.b.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            be0 be0Var = ce0.g;
            ce0 d2 = this.a.d(str);
            be0Var.getClass();
            if (be0.c(d2)) {
                z = true;
                if (!"motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && str.equals("1")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z || z2) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        if (!"motorola".equalsIgnoreCase(Build.BRAND)) {
        }
        z2 = false;
        if (!z) {
        }
        return true;
    }
}
