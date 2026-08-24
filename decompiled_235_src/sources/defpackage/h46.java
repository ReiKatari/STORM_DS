package defpackage;

import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h46  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h46 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ es7 B;

    public /* synthetic */ h46(es7 es7Var, int i) {
        this.A = i;
        this.B = es7Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        boolean z = false;
        es7 es7Var = this.B;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    x37.b(yh2.O(xq2Var, R.string.cancel), null, es7Var.h, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 131066);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z)) {
                    x37.b("Очистить", null, es7Var.i, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 6, 0, 131066);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            default:
                px0 px0Var3 = (px0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z = true;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z)) {
                    x37.b(yh2.O(xq2Var3, R.string.cancel), null, es7Var.h, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 0, 0, 131066);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
        }
    }
}
