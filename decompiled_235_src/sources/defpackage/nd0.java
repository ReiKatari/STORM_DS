package defpackage;

import android.os.Build;
import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nd0  reason: default package */
/* loaded from: classes.dex */
public final class nd0 {
    public static final Map c;
    public static final Map d;
    public final ld0 a;
    public final ks6 b;

    static {
        Map singletonMap = Collections.singletonMap("Google", fv.V0(new String[]{"oriole", "raven", "bluejay", "panther", "cheetah", "lynx"}));
        singletonMap.getClass();
        c = singletonMap;
        d = c14.m0(new vr4("google", fv.V0(new String[]{"pixel 4", "pixel 4 xl"})), new vr4("samsung", ii2.R("sm-g770f")));
    }

    public nd0(ld0 ld0Var, ks6 ks6Var) {
        ld0Var.getClass();
        ks6Var.getClass();
        this.a = ld0Var;
        this.b = ks6Var;
    }

    public final boolean a(String str) {
        boolean z;
        boolean z2;
        str.getClass();
        this.b.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            kg0 kg0Var = lg0.g;
            lg0 d2 = this.a.d(str);
            kg0Var.getClass();
            if (kg0.c(d2)) {
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
