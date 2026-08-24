package defpackage;

import android.content.SharedPreferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yp2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yp2 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ hq2 B;
    public final /* synthetic */ o60 L;

    public /* synthetic */ yp2(hq2 hq2Var, o60 o60Var, int i) {
        this.A = i;
        this.B = hq2Var;
        this.L = o60Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        o60 o60Var = this.L;
        hq2 hq2Var = this.B;
        boolean z2 = false;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z2)) {
                    SharedPreferences sharedPreferences = hq2Var.f;
                    boolean h = xq2Var.h(o60Var);
                    Object P = xq2Var.P();
                    vs0 vs0Var = ox0.a;
                    if (h || P == vs0Var) {
                        P = new a5(o60Var, 29);
                        xq2Var.l0(P);
                    }
                    on2 on2Var = (on2) P;
                    boolean h2 = xq2Var.h(hq2Var);
                    Object P2 = xq2Var.P();
                    if (h2 || P2 == vs0Var) {
                        P2 = new xp2(hq2Var, 2);
                        xq2Var.l0(P2);
                    }
                    on2 on2Var2 = (on2) P2;
                    boolean h3 = xq2Var.h(hq2Var);
                    Object P3 = xq2Var.P();
                    if (h3 || P3 == vs0Var) {
                        P3 = new xp2(hq2Var, 3);
                        xq2Var.l0(P3);
                    }
                    on2 on2Var3 = (on2) P3;
                    boolean h4 = xq2Var.h(o60Var) | xq2Var.h(hq2Var);
                    Object P4 = xq2Var.P();
                    if (h4 || P4 == vs0Var) {
                        P4 = new ci2(1, o60Var, hq2Var);
                        xq2Var.l0(P4);
                    }
                    on2 on2Var4 = (on2) P4;
                    boolean h5 = xq2Var.h(hq2Var);
                    Object P5 = xq2Var.P();
                    if (h5 || P5 == vs0Var) {
                        P5 = new xp2(hq2Var, 4);
                        xq2Var.l0(P5);
                    }
                    hi2.p(sharedPreferences, on2Var, on2Var2, on2Var3, on2Var4, (on2) P5, xq2Var, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z)) {
                    bl2.e(false, n16.I(1465585272, new yp2(hq2Var, o60Var, 0), xq2Var2), xq2Var2, 48, 1);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
