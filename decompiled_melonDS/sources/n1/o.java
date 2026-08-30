package n1;

import java.util.ArrayList;
import java.util.List;
import n2.w0;
import y3.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ w0 B;
    public final /* synthetic */ ArrayList L;
    public final /* synthetic */ Object R;

    public /* synthetic */ o(w0 w0Var, ArrayList arrayList, List list, boolean z10, int i2) {
        this.A = i2;
        this.B = w0Var;
        this.L = arrayList;
        this.R = list;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // mc.l
    public final Object k(Object obj) {
        h1 h1Var = (h1) obj;
        switch (this.A) {
            case 0:
                h1Var.A = true;
                ArrayList arrayList = this.L;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((q) arrayList.get(i2)).j(h1Var);
                }
                ?? r02 = this.R;
                int size2 = r02.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((q) r02.get(i10)).j(h1Var);
                }
                h1Var.A = false;
                this.B.getValue();
                break;
            default:
                h1Var.A = true;
                ArrayList arrayList2 = this.L;
                int size3 = arrayList2.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    ((o1.o) arrayList2.get(i11)).j(h1Var);
                }
                ?? r03 = this.R;
                int size4 = r03.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    ((o1.o) r03.get(i12)).j(h1Var);
                }
                h1Var.A = false;
                this.B.getValue();
                break;
        }
        return yb.y.f14813a;
    }
}
