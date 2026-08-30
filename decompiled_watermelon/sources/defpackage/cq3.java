package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cq3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cq3 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ aj2 B;

    public /* synthetic */ cq3(int i, aj2 aj2Var) {
        this.A = i;
        this.B = aj2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        lt5 lt5Var;
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        aj2 aj2Var = this.B;
        switch (i) {
            case 0:
                it5 it5Var = (it5) obj;
                List list = (List) aj2Var.j(it5Var, obj2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && (lt5Var = it5Var.B) != null && !lt5Var.c(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj3).toString());
                    }
                }
                if (!list.isEmpty()) {
                    return new ArrayList(list);
                }
                return null;
            case 1:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    aj2Var.j(sk2Var, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                String str = (String) obj;
                str.getClass();
                aj2Var.j(str, (String) obj2);
                return o27Var;
        }
    }
}
