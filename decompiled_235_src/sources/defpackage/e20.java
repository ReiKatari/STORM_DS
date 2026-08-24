package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e20  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e20 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;

    public /* synthetic */ e20(String str, int i) {
        this.A = i;
        this.B = str;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        boolean z = false;
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
                    String upperCase = this.B.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    x37.b(upperCase, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 131070);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                m26 m26Var = (m26) obj;
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z)) {
                    x37.b(this.B, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 0, 0, 131070);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
