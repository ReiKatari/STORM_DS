package defpackage;

import android.os.Bundle;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pc4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pc4 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ dh5 B;

    public /* synthetic */ pc4(int i, dh5 dh5Var) {
        this.A = i;
        this.B = dh5Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        boolean z;
        int i = this.A;
        dh5 dh5Var = this.B;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Object obj2 = dh5Var.A;
                if (obj2 == null || !((Bundle) obj2).containsKey(str)) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ub7 ub7Var = (ub7) obj;
                ub7Var.getClass();
                pq3 pq3Var = ((wb7) ub7Var).k0;
                List list = (List) dh5Var.A;
                if (list != null) {
                    list.add(pq3Var);
                } else {
                    list = hf.d0(pq3Var);
                }
                dh5Var.A = list;
                return tb7.SkipSubtreeAndContinueTraversal;
        }
    }
}
