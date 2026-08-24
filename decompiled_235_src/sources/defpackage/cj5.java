package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cj5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cj5 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Serializable X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ cj5(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = serializable;
        this.Y = obj4;
        this.Z = obj5;
    }

    @Override // defpackage.on2
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
                n46 n46Var = (n46) obj5;
                j56 j56Var = (j56) obj4;
                q46 q46Var = (q46) obj3;
                String str = (String) serializable;
                Object[] objArr = (Object[]) obj;
                boolean z2 = true;
                if (n46Var.B != q46Var) {
                    n46Var.B = q46Var;
                    z = true;
                } else {
                    z = false;
                }
                if (!nb3.k(n46Var.L, str)) {
                    n46Var.L = str;
                } else {
                    z2 = z;
                }
                n46Var.A = j56Var;
                n46Var.R = obj2;
                n46Var.X = objArr;
                m44 m44Var = n46Var.Y;
                if (m44Var != null && z2) {
                    m44Var.I();
                    n46Var.Y = null;
                    n46Var.d();
                }
                return jg7.a;
            default:
                return Boolean.valueOf(((dv6) obj5).a((bv6) obj4, (ArrayList) obj3, (LinkedHashMap) serializable, (List) obj2, (ArrayList) obj));
        }
    }
}
