package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uq5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uq5 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ qn2 L;
    public final /* synthetic */ Map R;
    public final /* synthetic */ Map X;
    public final /* synthetic */ qn2 Y;
    public final /* synthetic */ qn2 Z;
    public final /* synthetic */ qn2 d0;

    public /* synthetic */ uq5(List list, qn2 qn2Var, Map map, Map map2, qn2 qn2Var2, qn2 qn2Var3, qn2 qn2Var4, int i) {
        this.A = i;
        this.B = list;
        this.L = qn2Var;
        this.R = map;
        this.X = map2;
        this.Y = qn2Var2;
        this.Z = qn2Var3;
        this.d0 = qn2Var4;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                er3 er3Var = (er3) obj;
                er3Var.getClass();
                gn5 gn5Var = new gn5(10);
                List list = this.B;
                er3Var.h0(list.size(), new r5(20, gn5Var, list), new j5(17, list), new zv0(802480018, true, new hr5(list, this.L, this.R, this.X, this.Y, this.Z, this.d0, 0)));
                return jg7Var;
            default:
                er3 er3Var2 = (er3) obj;
                er3Var2.getClass();
                gn5 gn5Var2 = new gn5(11);
                List list2 = this.B;
                er3Var2.h0(list2.size(), new r5(21, gn5Var2, list2), new j5(18, list2), new zv0(802480018, true, new hr5(list2, this.L, this.R, this.X, this.Y, this.Z, this.d0, 1)));
                return jg7Var;
        }
    }
}
