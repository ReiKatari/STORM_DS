package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s91  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s91 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ a74 B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ qn2 X;
    public final /* synthetic */ qn2 Y;
    public final /* synthetic */ eo2 Z;
    public final /* synthetic */ eo2 d0;
    public final /* synthetic */ ao2 e0;
    public final /* synthetic */ int f0;

    public /* synthetic */ s91(a74 a74Var, j06 j06Var, eo2 eo2Var, qn2 qn2Var, eo2 eo2Var2, on2 on2Var, on2 on2Var2, qn2 qn2Var2, int i) {
        this.A = 2;
        this.B = a74Var;
        this.L = j06Var;
        this.Z = eo2Var;
        this.X = qn2Var;
        this.d0 = eo2Var2;
        this.R = on2Var;
        this.e0 = on2Var2;
        this.Y = qn2Var2;
        this.f0 = i;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        int i2 = this.f0;
        ao2 ao2Var = this.e0;
        Object obj3 = this.R;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int a0 = ii2.a0(i2 | 1);
                ak7.B(this.B, (lq4) obj4, (List) obj3, this.X, this.Y, this.Z, this.d0, (qn2) ao2Var, (px0) obj, a0);
                return jg7Var;
            case 1:
                ((Integer) obj2).intValue();
                int a02 = ii2.a0(i2 | 1);
                ak7.r(this.B, (lq4) obj4, (List) obj3, this.X, this.Y, this.Z, this.d0, (qn2) ao2Var, (px0) obj, a02);
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                int a03 = ii2.a0(i2 | 1);
                nc1.a(this.B, (j06) obj4, this.Z, this.X, this.d0, (on2) obj3, (on2) ao2Var, this.Y, (px0) obj, a03);
                return jg7Var;
        }
    }

    public /* synthetic */ s91(a74 a74Var, lq4 lq4Var, List list, qn2 qn2Var, qn2 qn2Var2, eo2 eo2Var, eo2 eo2Var2, qn2 qn2Var3, int i, int i2) {
        this.A = i2;
        this.B = a74Var;
        this.L = lq4Var;
        this.R = list;
        this.X = qn2Var;
        this.Y = qn2Var2;
        this.Z = eo2Var;
        this.d0 = eo2Var2;
        this.e0 = qn2Var3;
        this.f0 = i;
    }
}
