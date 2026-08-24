package defpackage;

import android.net.Uri;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bv5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bv5 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ RomDetailsActivity B;

    public /* synthetic */ bv5(RomDetailsActivity romDetailsActivity, int i) {
        this.A = i;
        this.B = romDetailsActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        vr4 vr4Var = null;
        jg7 jg7Var = jg7.a;
        RomDetailsActivity romDetailsActivity = this.B;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                int i2 = RomDetailsActivity.J0;
                str.getClass();
                str2.getClass();
                qv5 A = romDetailsActivity.A();
                tp6 tp6Var = A.d;
                tp6Var.getClass();
                tp6Var.m(null, f06.a);
                hv.L(to7.a(A), null, null, new mo5(A, str, str2, null, 0), 3);
                return jg7Var;
            case 1:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = RomDetailsActivity.J0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    pq5 pq5Var = (pq5) np2.C(((hw5) romDetailsActivity.C0.getValue()).g, xq2Var).getValue();
                    o6 o6Var = (o6) np2.C(romDetailsActivity.H0, xq2Var).getValue();
                    vr4 vr4Var2 = (vr4) np2.C(romDetailsActivity.I0, xq2Var).getValue();
                    if (o6Var != null) {
                        xq2Var.b0(408364574);
                        g04.j(o6Var, xq2Var, 0);
                        xq2Var.p(false);
                    } else if (vr4Var2 != null) {
                        xq2Var.b0(408368096);
                        g04.q(null, (String) vr4Var2.A, (String) vr4Var2.B, pq5Var.a, xq2Var, 6);
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(-225227596);
                        Uri uri = pq5Var.d;
                        boolean h = xq2Var.h(romDetailsActivity) | xq2Var.h(pq5Var);
                        Object P = xq2Var.P();
                        if (h || P == ox0.a) {
                            P = new kp5(romDetailsActivity, pq5Var, null, 3);
                            xq2Var.l0(P);
                        }
                        g04.n(pq5Var, (String) np2.a0(uri, (eo2) P, xq2Var).getValue(), null, xq2Var, 0, 4);
                        xq2Var.p(false);
                    }
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                tp6 tp6Var2 = romDetailsActivity.I0;
                if (str3 != null) {
                    vr4Var = new vr4(str3, str4);
                }
                tp6Var2.l(vr4Var);
                return jg7Var;
        }
    }
}
