package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i46  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i46 implements qn2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ List B;
    public final /* synthetic */ String L;
    public final /* synthetic */ boolean R;
    public final /* synthetic */ qn2 X;
    public final /* synthetic */ qn2 Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    public /* synthetic */ i46(List list, String str, Map map, List list2, boolean z, String str2, qn2 qn2Var, qn2 qn2Var2) {
        this.B = list;
        this.L = str;
        this.Z = map;
        this.d0 = list2;
        this.R = z;
        this.e0 = str2;
        this.X = qn2Var;
        this.Y = qn2Var2;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.e0;
        Object obj3 = this.d0;
        Object obj4 = this.Z;
        switch (i) {
            case 0:
                qa4 qa4Var = (qa4) obj2;
                oo3 oo3Var = (oo3) obj;
                oo3Var.getClass();
                gn5 gn5Var = new gn5(21);
                List list = this.B;
                oo3Var.h0(list.size(), new r5(25, gn5Var, list), new j5(22, list), new zv0(-1117249557, true, new m46(list, this.R, this.L, list, (nh2) obj4, this.X, this.Y, (qa4) obj3, qa4Var)));
                return jg7Var;
            default:
                String str = (String) obj2;
                er3 er3Var = (er3) obj;
                er3Var.getClass();
                rk7 rk7Var = new rk7(3);
                List list2 = this.B;
                er3Var.h0(list2.size(), new r5(28, rk7Var, list2), new j5(25, list2), new zv0(802480018, true, new nr7(list2, this.L, (Map) obj4, (List) obj3, this.R, str, this.X, this.Y)));
                return jg7Var;
        }
    }

    public /* synthetic */ i46(List list, boolean z, String str, nh2 nh2Var, qn2 qn2Var, qn2 qn2Var2, qa4 qa4Var, qa4 qa4Var2) {
        this.B = list;
        this.R = z;
        this.L = str;
        this.Z = nh2Var;
        this.X = qn2Var;
        this.Y = qn2Var2;
        this.d0 = qa4Var;
        this.e0 = qa4Var2;
    }
}
