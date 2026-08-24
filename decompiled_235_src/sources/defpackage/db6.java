package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: db6  reason: default package */
/* loaded from: classes.dex */
public final class db6 extends aj3 implements eo2 {
    public static final db6 L = new db6(2, 0);
    public static final db6 R = new db6(2, 1);
    public static final db6 X = new db6(2, 2);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db6(int i, int i2) {
        super(i);
        this.B = i2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        String str;
        ao2 ao2Var;
        switch (this.B) {
            case 0:
                y1 y1Var = (y1) obj;
                y1 y1Var2 = (y1) obj2;
                if (y1Var == null || (str = y1Var.a) == null) {
                    str = y1Var2.a;
                }
                if (y1Var == null || (ao2Var = y1Var.b) == null) {
                    ao2Var = y1Var2.b;
                }
                return new y1(str, ao2Var);
            case 1:
                if (obj == null) {
                    return obj2;
                }
                return obj;
            default:
                xa6 xa6Var = (xa6) obj2;
                Float valueOf = Float.valueOf((float) RecyclerView.B1);
                ta6 ta6Var = ((xa6) obj).d;
                fb6 fb6Var = bb6.u;
                Object g = ta6Var.A.g(fb6Var);
                if (g == null) {
                    g = valueOf;
                }
                float floatValue = ((Number) g).floatValue();
                Object g2 = xa6Var.d.A.g(fb6Var);
                if (g2 != null) {
                    valueOf = g2;
                }
                return Integer.valueOf(Float.compare(floatValue, valueOf.floatValue()));
        }
    }
}
