package defpackage;

import android.util.Size;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p13  reason: default package */
/* loaded from: classes.dex */
public final class p13 {
    public static final v13 a;

    static {
        Object size = new Size(640, 480);
        Object el5Var = new el5(cs1.B, new fl5(1, mj6.b));
        jd0 jd0Var = new jd0(3);
        xx xxVar = n23.t;
        da4 da4Var = jd0Var.B;
        da4Var.m(xxVar, size);
        da4Var.m(zi7.K, 1);
        da4Var.m(n23.o, 0);
        da4Var.m(n23.w, el5Var);
        yq1 yq1Var = yq1.d;
        if (yq1Var.equals(yq1Var)) {
            da4Var.m(j23.n, yq1Var);
            a = new v13(go4.a(da4Var));
            return;
        }
        fa6.h("ImageAnalysis currently only supports SDR");
    }
}
