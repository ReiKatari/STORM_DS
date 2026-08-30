package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h  reason: default package */
/* loaded from: classes.dex */
public abstract class h {
    public static final ab1 a;

    static {
        bb1 bb1Var = tg1.a;
        ip2 ip2Var = bt3.a.Y;
        ha1 ha1Var = ha1.L;
        kr4 kr4Var = kr4.AUTOMATIC;
        Bitmap.Config config = k.b;
        j80 j80Var = j80.ENABLED;
        a = new ab1(ip2Var, ha1Var, ha1Var, ha1Var, bx6.a, kr4Var, config, true, false, null, null, null, j80Var, j80Var, j80Var);
    }

    public static final boolean a(vw2 vw2Var) {
        int i = g.a[vw2Var.g.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (vw2Var.A.a != null || !(vw2Var.x instanceof zg1)) {
                    }
                } else {
                    i.c();
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
