package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fp3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fp3 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    public /* synthetic */ fp3(int i, Collection collection) {
        this.A = 3;
        this.B = i;
        this.L = collection;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        qn2 qn2Var;
        int i = this.A;
        int i2 = 2;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.L;
        int i3 = this.B;
        switch (i) {
            case 0:
                nq3 nq3Var = (nq3) obj;
                oe1 oe1Var = ((ip3) obj2).a;
                vl6 t = ln2.t();
                if (t != null) {
                    qn2Var = t.e();
                } else {
                    qn2Var = null;
                }
                ln2.V(t, ln2.N(t), qn2Var);
                oe1Var.getClass();
                int i4 = nq3Var.a;
                if (i4 != -1) {
                    i2 = i4;
                }
                for (int i5 = 0; i5 < i2; i5++) {
                    nq3Var.a(i3 + i5);
                }
                return jg7Var;
            case 1:
                cx4.j((cx4) obj, (dx4) obj2, 0, -i3);
                return jg7Var;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                cx4 cx4Var = (cx4) obj;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    dx4 dx4Var = (dx4) arrayList.get(i6);
                    cx4.l(cx4Var, dx4Var, 0, (i3 - dx4Var.B) / 2);
                }
                return jg7Var;
            default:
                return Boolean.valueOf(((List) obj).addAll(i3, (Collection) obj2));
        }
    }

    public /* synthetic */ fp3(Object obj, int i, int i2) {
        this.A = i2;
        this.L = obj;
        this.B = i;
    }
}
