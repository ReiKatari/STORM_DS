package defpackage;

import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ki6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ki6 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ mi6 B;

    public /* synthetic */ ki6(mi6 mi6Var) {
        this.A = 2;
        this.B = mi6Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        mi6 mi6Var = this.B;
        px0 px0Var = (px0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                jx2.e(mi6Var, px0Var, ii2.a0(1));
                return jg7Var;
            case 1:
                num.getClass();
                jx2.e(mi6Var, px0Var, ii2.a0(1));
                return jg7Var;
            case 2:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    String O = yh2.O(xq2Var, R.string.cancel);
                    boolean f = xq2Var.f(mi6Var);
                    Object P = xq2Var.P();
                    if (f || P == ox0.a) {
                        P = new ji6(mi6Var, 0);
                        xq2Var.l0(P);
                    }
                    q60.b(O, false, (on2) P, xq2Var, 0, 2);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                num.getClass();
                jx2.e(mi6Var, px0Var, ii2.a0(1));
                return jg7Var;
        }
    }

    public /* synthetic */ ki6(mi6 mi6Var, int i, int i2) {
        this.A = i2;
        this.B = mi6Var;
    }
}
