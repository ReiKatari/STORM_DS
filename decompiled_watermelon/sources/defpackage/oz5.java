package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oz5  reason: default package */
/* loaded from: classes.dex */
public final class oz5 extends ic3 implements aj2 {
    public static final oz5 L = new oz5(2, 0);
    public static final oz5 R = new oz5(2, 1);
    public static final oz5 X = new oz5(2, 2);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oz5(int i, int i2) {
        super(i);
        this.B = i2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        String str;
        wi2 wi2Var;
        switch (this.B) {
            case 0:
                w1 w1Var = (w1) obj;
                w1 w1Var2 = (w1) obj2;
                if (w1Var == null || (str = w1Var.a) == null) {
                    str = w1Var2.a;
                }
                if (w1Var == null || (wi2Var = w1Var.b) == null) {
                    wi2Var = w1Var2.b;
                }
                return new w1(str, wi2Var);
            case 1:
                if (obj == null) {
                    return obj2;
                }
                return obj;
            default:
                iz5 iz5Var = (iz5) obj2;
                Float valueOf = Float.valueOf((float) RecyclerView.A1);
                ez5 ez5Var = ((iz5) obj).d;
                qz5 qz5Var = mz5.u;
                Object g = ez5Var.A.g(qz5Var);
                if (g == null) {
                    g = valueOf;
                }
                float floatValue = ((Number) g).floatValue();
                Object g2 = iz5Var.d.A.g(qz5Var);
                if (g2 != null) {
                    valueOf = g2;
                }
                return Integer.valueOf(Float.compare(floatValue, valueOf.floatValue()));
        }
    }
}
