package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rz5  reason: default package */
/* loaded from: classes.dex */
public final class rz5 extends hw6 implements ho2 {
    public int X;
    public /* synthetic */ List Y;
    public /* synthetic */ List Z;
    public /* synthetic */ gn6 d0;
    public /* synthetic */ hn6 e0;
    public final /* synthetic */ tz5 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz5(r41 r41Var, tz5 tz5Var) {
        super(5, r41Var);
        this.f0 = tz5Var;
    }

    @Override // defpackage.ho2
    public final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        rz5 rz5Var = new rz5((r41) obj5, this.f0);
        rz5Var.Y = (List) obj;
        rz5Var.Z = (List) obj2;
        rz5Var.d0 = (gn6) obj3;
        rz5Var.e0 = (hn6) obj4;
        return rz5Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        List list = this.Y;
        List list2 = this.Z;
        gn6 gn6Var = this.d0;
        hn6 hn6Var = this.e0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
                return obj;
            }
            i.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oi2.Y(obj);
        xe1 xe1Var = xk1.a;
        v70 v70Var = new v70(list, list2, this.f0, gn6Var, hn6Var, (r41) null);
        this.Y = null;
        this.Z = null;
        this.d0 = null;
        this.e0 = null;
        this.X = 1;
        Object d0 = hv.d0(xe1Var, v70Var, this);
        if (d0 == x61Var) {
            return x61Var;
        }
        return d0;
    }
}
