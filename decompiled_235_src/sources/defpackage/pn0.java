package defpackage;

import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pn0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pn0 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ on2 B;
    public final /* synthetic */ on2 L;

    public /* synthetic */ pn0(on2 on2Var, on2 on2Var2, int i) {
        this.A = i;
        this.B = on2Var;
        this.L = on2Var2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        boolean z = false;
        px0 px0Var = (px0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    q60.b(yh2.O(xq2Var, R.string.cancel), false, this.B, xq2Var, 0, 2);
                    q60.b(yh2.O(xq2Var, R.string.save), false, this.L, xq2Var, 0, 2);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z)) {
                    q60.b(yh2.O(xq2Var2, R.string.cancel), false, this.B, xq2Var2, 0, 2);
                    q60.b(yh2.O(xq2Var2, R.string.ok), false, this.L, xq2Var2, 0, 2);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            default:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                xq2 xq2Var3 = (xq2) px0Var;
                if (xq2Var3.S(intValue & 1, z)) {
                    q60.b(yh2.O(xq2Var3, R.string.cancel), false, this.B, xq2Var3, 0, 2);
                    q60.b(yh2.O(xq2Var3, R.string.exit), false, this.L, xq2Var3, 0, 2);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
        }
    }
}
