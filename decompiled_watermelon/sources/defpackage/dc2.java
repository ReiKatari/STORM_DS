package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dc2  reason: default package */
/* loaded from: classes.dex */
public final class dc2 implements w92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ArrayList B;
    public final /* synthetic */ k24 L;

    public /* synthetic */ dc2(ArrayList arrayList, k24 k24Var, int i) {
        this.A = i;
        this.B = arrayList;
        this.L = k24Var;
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        int i = this.A;
        o27 o27Var = o27.a;
        k24 k24Var = this.L;
        ArrayList arrayList = this.B;
        switch (i) {
            case 0:
                l33 l33Var = (l33) obj;
                if (l33Var instanceof bc2) {
                    arrayList.add(l33Var);
                } else if (l33Var instanceof cc2) {
                    arrayList.remove(((cc2) l33Var).a);
                }
                k24Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return o27Var;
            default:
                l33 l33Var2 = (l33) obj;
                if (l33Var2 instanceof jt4) {
                    arrayList.add(l33Var2);
                } else if (l33Var2 instanceof kt4) {
                    arrayList.remove(((kt4) l33Var2).a);
                } else if (l33Var2 instanceof it4) {
                    arrayList.remove(((it4) l33Var2).a);
                }
                k24Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return o27Var;
        }
    }
}
