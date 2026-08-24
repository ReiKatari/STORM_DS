package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g46  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g46 implements eo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ String L;
    public final /* synthetic */ on2 R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ ao2 Z;
    public final /* synthetic */ ao2 d0;
    public final /* synthetic */ ao2 e0;

    public /* synthetic */ g46(c46 c46Var, boolean z, String str, nh2 nh2Var, on2 on2Var, on2 on2Var2, on2 on2Var3, on2 on2Var4, int i) {
        this.X = c46Var;
        this.B = z;
        this.L = str;
        this.Y = nh2Var;
        this.R = on2Var;
        this.Z = on2Var2;
        this.d0 = on2Var3;
        this.e0 = on2Var4;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        ao2 ao2Var = this.e0;
        ao2 ao2Var2 = this.d0;
        ao2 ao2Var3 = this.Z;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int a0 = ii2.a0(1);
                nc1.x((c46) obj4, this.B, this.L, (nh2) obj3, this.R, (on2) ao2Var3, (on2) ao2Var2, (on2) ao2Var, (px0) obj, a0);
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                int a02 = ii2.a0(1);
                nc1.y((List) obj4, this.B, this.L, (qn2) obj3, (qn2) ao2Var3, (eo2) ao2Var2, (eo2) ao2Var, this.R, (px0) obj, a02);
                return jg7Var;
        }
    }

    public /* synthetic */ g46(List list, boolean z, String str, qn2 qn2Var, qn2 qn2Var2, eo2 eo2Var, eo2 eo2Var2, on2 on2Var, int i) {
        this.X = list;
        this.B = z;
        this.L = str;
        this.Y = qn2Var;
        this.Z = qn2Var2;
        this.d0 = eo2Var;
        this.e0 = eo2Var2;
        this.R = on2Var;
    }
}
