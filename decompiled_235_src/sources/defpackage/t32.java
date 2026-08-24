package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t32  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t32 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ qn2 L;

    public /* synthetic */ t32(List list, qn2 qn2Var, int i) {
        this.A = i;
        this.B = list;
        this.L = qn2Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        qn2 qn2Var = this.L;
        List list = this.B;
        er3 er3Var = (er3) obj;
        switch (i) {
            case 0:
                er3Var.getClass();
                er3Var.h0(list.size(), new r5(10, new bz1(4), list), new j5(8, list), new zv0(802480018, true, new v32(list, qn2Var, 0)));
                return jg7Var;
            case 1:
                er3Var.getClass();
                er3Var.h0(list.size(), null, new j5(9, list), new zv0(802480018, true, new v32(list, qn2Var, 1)));
                return jg7Var;
            case 2:
                er3Var.getClass();
                er3Var.h0(list.size(), null, new j5(10, list), new zv0(802480018, true, new v32(list, qn2Var, 2)));
                return jg7Var;
            default:
                er3Var.getClass();
                er3Var.h0(list.size(), null, new j5(14, list), new zv0(802480018, true, new v32(list, qn2Var, 3)));
                return jg7Var;
        }
    }
}
