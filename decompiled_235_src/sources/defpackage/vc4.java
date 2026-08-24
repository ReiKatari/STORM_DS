package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vc4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vc4 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ pp6 B;

    public /* synthetic */ vc4(pp6 pp6Var, int i) {
        this.A = i;
        this.B = pp6Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        pp6 pp6Var = this.B;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) pp6Var.getValue()) {
                    if (nb3.k(((sb4) obj).B.A, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                return new jk4(((jk4) pp6Var.getValue()).a);
            default:
                xo xoVar = qa6.a;
                return new jk4(((jk4) pp6Var.getValue()).a);
        }
    }
}
