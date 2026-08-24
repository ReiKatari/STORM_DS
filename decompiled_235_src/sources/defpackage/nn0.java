package defpackage;

import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nn0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nn0 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ xn0 B;

    public /* synthetic */ nn0(xn0 xn0Var, int i) {
        this.A = i;
        this.B = xn0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4 = this.A;
        jg7 jg7Var = jg7.a;
        xn0 xn0Var = this.B;
        switch (i4) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    wn0 wn0Var = (wn0) xn0Var.f.getValue();
                    if (wn0Var == null) {
                        i = -1;
                    } else {
                        i = un0.a[wn0Var.ordinal()];
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq2Var.b0(761692536);
                            xq2Var.p(false);
                        } else {
                            xq2Var.b0(761689740);
                            x37.b(yh2.O(xq2Var, R.string.error_code_invalid_format), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 131070);
                            xq2Var.p(false);
                        }
                    } else {
                        xq2Var.b0(761685389);
                        x37.b(yh2.O(xq2Var, R.string.error_code_cannot_be_empty), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 131070);
                        xq2Var.p(false);
                    }
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(1 & intValue2, z2)) {
                    if (xn0Var.a) {
                        i2 = 2108218989;
                        i3 = R.string.new_cheat;
                    } else {
                        i2 = 2108220270;
                        i3 = R.string.edit_cheat;
                    }
                    x37.b(i61.l(xq2Var2, i2, i3, xq2Var2, false), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 0, 0, 131070);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
