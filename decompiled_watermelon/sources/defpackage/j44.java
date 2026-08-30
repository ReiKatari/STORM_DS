package defpackage;

import android.os.Bundle;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j44  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j44 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ n75 B;

    public /* synthetic */ j44(int i, n75 n75Var) {
        this.A = i;
        this.B = n75Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        boolean z;
        int i = this.A;
        n75 n75Var = this.B;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Object obj2 = n75Var.A;
                if (obj2 == null || !((Bundle) obj2).containsKey(str)) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                zx6 zx6Var = (zx6) obj;
                zx6Var.getClass();
                qj3 qj3Var = ((by6) zx6Var).j0;
                List list = (List) n75Var.A;
                if (list != null) {
                    list.add(qj3Var);
                } else {
                    list = l07.f0(qj3Var);
                }
                n75Var.A = list;
                return yx6.SkipSubtreeAndContinueTraversal;
        }
    }
}
