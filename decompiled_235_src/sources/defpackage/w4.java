package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w4 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qa4 B;
    public final /* synthetic */ qa4 L;

    public /* synthetic */ w4(qa4 qa4Var, qa4 qa4Var2, int i) {
        this.A = i;
        this.B = qa4Var;
        this.L = qa4Var2;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        qa4 qa4Var = this.L;
        qa4 qa4Var2 = this.B;
        switch (i) {
            case 0:
                h3 h3Var = (h3) obj;
                h3Var.getClass();
                List list = h3Var.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    o6 o6Var = (o6) obj2;
                    if (((l6) qa4Var2.getValue()).matches(o6Var.a().m) && (!((Boolean) qa4Var.getValue()).booleanValue() || o6Var.a().b())) {
                        arrayList.add(obj2);
                    }
                }
                g3 g3Var = h3Var.a;
                h3Var.getClass();
                g3Var.getClass();
                return new h3(g3Var, arrayList);
            default:
                pq5 pq5Var = (pq5) obj;
                pq5Var.getClass();
                qa4Var2.setValue(pq5Var);
                qa4Var.setValue(xc1.CONFIRM);
                return jg7.a;
        }
    }
}
