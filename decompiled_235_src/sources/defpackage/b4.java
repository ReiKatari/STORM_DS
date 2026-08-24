package defpackage;

import android.view.View;
import android.view.ViewParent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements eo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ nx1 B;
    public final /* synthetic */ on2 L;
    public final /* synthetic */ qn2 R;

    public /* synthetic */ b4(nx1 nx1Var, on2 on2Var, qn2 qn2Var) {
        this.B = nx1Var;
        this.L = on2Var;
        this.R = qn2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        px0 px0Var = (px0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    ViewParent parent = ((View) xq2Var.j(kf.f)).getParent();
                    parent.getClass();
                    ((gj1) parent).i0.setDimAmount(0.8f);
                    nx1 nx1Var = this.B;
                    qa4 C = np2.C((rp6) nx1Var.e.getValue(), xq2Var);
                    Object P = xq2Var.P();
                    Object obj3 = ox0.a;
                    if (P == obj3) {
                        P = np2.Y(null);
                        xq2Var.l0(P);
                    }
                    qa4 qa4Var = (qa4) P;
                    boolean h = xq2Var.h(nx1Var);
                    Object P2 = xq2Var.P();
                    if (h || P2 == obj3) {
                        P2 = new y3(nx1Var, (r41) null, 1);
                        xq2Var.l0(P2);
                    }
                    mb3.i(xq2Var, (eo2) P2, jg7Var);
                    bl2.e(true, n16.I(814039041, new ne4(this.L, nx1Var, this.R, C, qa4Var), xq2Var), xq2Var, 54, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                num.getClass();
                g04.a(this.B, this.L, this.R, px0Var, ii2.a0(9));
                return jg7Var;
        }
    }

    public /* synthetic */ b4(nx1 nx1Var, on2 on2Var, qn2 qn2Var, int i) {
        this.B = nx1Var;
        this.L = on2Var;
        this.R = qn2Var;
    }
}
