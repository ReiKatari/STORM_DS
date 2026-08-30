package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m95  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class m95 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Serializable X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ m95(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = serializable;
        this.Y = obj4;
        this.Z = obj5;
    }

    @Override // defpackage.ki2
    public final Object c() {
        boolean z;
        int i = this.A;
        Object obj = this.Z;
        Object obj2 = this.Y;
        Serializable serializable = this.X;
        Object obj3 = this.R;
        Object obj4 = this.L;
        Object obj5 = this.B;
        switch (i) {
            case 0:
                it5 it5Var = (it5) obj5;
                du5 du5Var = (du5) obj4;
                lt5 lt5Var = (lt5) obj3;
                String str = (String) serializable;
                Object[] objArr = (Object[]) obj;
                boolean z2 = true;
                if (it5Var.B != lt5Var) {
                    it5Var.B = lt5Var;
                    z = true;
                } else {
                    z = false;
                }
                if (!b53.x(it5Var.L, str)) {
                    it5Var.L = str;
                } else {
                    z2 = z;
                }
                it5Var.A = du5Var;
                it5Var.R = obj2;
                it5Var.X = objArr;
                n85 n85Var = it5Var.Y;
                if (n85Var != null && z2) {
                    n85Var.x();
                    it5Var.Y = null;
                    it5Var.d();
                }
                return o27.a;
            default:
                return Boolean.valueOf(((jj6) obj5).a((hj6) obj4, (ArrayList) obj3, (LinkedHashMap) serializable, (List) obj2, (ArrayList) obj));
        }
    }
}
