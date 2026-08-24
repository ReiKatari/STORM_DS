package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vo3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vo3 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qa4 B;
    public final /* synthetic */ ArrayList L;
    public final /* synthetic */ List R;

    public /* synthetic */ vo3(qa4 qa4Var, ArrayList arrayList, List list, boolean z, int i) {
        this.A = i;
        this.B = qa4Var;
        this.L = arrayList;
        this.R = list;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        List list = this.R;
        ArrayList arrayList = this.L;
        qa4 qa4Var = this.B;
        jg7 jg7Var = jg7.a;
        cx4 cx4Var = (cx4) obj;
        switch (i) {
            case 0:
                cx4Var.A = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((xo3) arrayList.get(i2)).j(cx4Var);
                }
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((xo3) list.get(i3)).j(cx4Var);
                }
                cx4Var.A = false;
                qa4Var.getValue();
                return jg7Var;
            default:
                cx4Var.A = true;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((kr3) arrayList.get(i4)).j(cx4Var);
                }
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((kr3) list.get(i5)).j(cx4Var);
                }
                cx4Var.A = false;
                qa4Var.getValue();
                return jg7Var;
        }
    }
}
