package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ug2  reason: default package */
/* loaded from: classes.dex */
public final class ug2 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ArrayList B;
    public final /* synthetic */ qa4 L;

    public /* synthetic */ ug2(ArrayList arrayList, qa4 qa4Var, int i) {
        this.A = i;
        this.B = arrayList;
        this.L = qa4Var;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        qa4 qa4Var = this.L;
        ArrayList arrayList = this.B;
        switch (i) {
            case 0:
                t93 t93Var = (t93) obj;
                if (t93Var instanceof sg2) {
                    arrayList.add(t93Var);
                } else if (t93Var instanceof tg2) {
                    arrayList.remove(((tg2) t93Var).a);
                }
                qa4Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return jg7Var;
            default:
                t93 t93Var2 = (t93) obj;
                if (t93Var2 instanceof l25) {
                    arrayList.add(t93Var2);
                } else if (t93Var2 instanceof m25) {
                    arrayList.remove(((m25) t93Var2).a);
                } else if (t93Var2 instanceof k25) {
                    arrayList.remove(((k25) t93Var2).a);
                }
                qa4Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return jg7Var;
        }
    }
}
