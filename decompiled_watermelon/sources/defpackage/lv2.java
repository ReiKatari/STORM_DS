package defpackage;

import android.util.Size;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lv2  reason: default package */
/* loaded from: classes.dex */
public final class lv2 {
    public static final rv2 a;

    static {
        Object size = new Size(640, 480);
        Object mb5Var = new mb5(sn1.B, new nb5(1, x76.b));
        bb0 bb0Var = new bb0(3);
        uw uwVar = jw2.t;
        x14 x14Var = bb0Var.B;
        x14Var.r(uwVar, size);
        x14Var.r(b57.J, 1);
        x14Var.r(jw2.o, 0);
        x14Var.r(jw2.w, mb5Var);
        sm1 sm1Var = sm1.d;
        if (sm1Var.equals(sm1Var)) {
            x14Var.r(fw2.n, sm1Var);
            a = new rv2(ef4.b(x14Var));
            return;
        }
        vd6.i("ImageAnalysis currently only supports SDR");
    }
}
