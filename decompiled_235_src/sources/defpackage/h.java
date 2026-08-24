package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h  reason: default package */
/* loaded from: classes.dex */
public abstract class h {
    public static final we1 a;

    static {
        xe1 xe1Var = xk1.a;
        jv2 jv2Var = e04.a.Y;
        de1 de1Var = de1.L;
        n05 n05Var = n05.AUTOMATIC;
        Bitmap.Config config = k.b;
        ra0 ra0Var = ra0.ENABLED;
        a = new we1(jv2Var, de1Var, de1Var, de1Var, x97.a, n05Var, config, true, false, null, null, null, ra0Var, ra0Var, ra0Var);
    }

    public static final boolean a(z23 z23Var) {
        int i = g.a[z23Var.g.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (z23Var.A.a != null || !(z23Var.x instanceof dl1)) {
                    }
                } else {
                    i.d();
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
