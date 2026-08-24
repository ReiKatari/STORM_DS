package defpackage;

import android.view.ViewConfiguration;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eo6  reason: default package */
/* loaded from: classes.dex */
public abstract class eo6 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final oc1 a(px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        qh1 qh1Var = (qh1) xq2Var.j(ky0.h);
        boolean c = xq2Var.c(qh1Var.a());
        Object P = xq2Var.P();
        if (c || P == ox0.a) {
            P = new oc1(new s35(qh1Var));
            xq2Var.l0(P);
        }
        return (oc1) P;
    }
}
