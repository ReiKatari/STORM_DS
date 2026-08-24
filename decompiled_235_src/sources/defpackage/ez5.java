package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ez5  reason: default package */
/* loaded from: classes.dex */
public final class ez5 extends hw6 implements fo2 {
    public int X;
    public /* synthetic */ ne2 Y;
    public /* synthetic */ Object[] Z;
    public final /* synthetic */ tz5 d0;
    public ne2 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez5(r41 r41Var, tz5 tz5Var) {
        super(3, r41Var);
        this.d0 = tz5Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        ez5 ez5Var = new ez5((r41) obj3, this.d0);
        ez5Var.Y = (ne2) obj;
        ez5Var.Z = (Object[]) obj2;
        return ez5Var.s(jg7.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008a, code lost:
        if (r4 == r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0099, code lost:
        if (r2.a(r4, r20) == r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
        return r1;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        ne2 ne2Var;
        Object d0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    oi2.Y(obj);
                    return jg7.a;
                }
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ne2Var = this.e0;
            oi2.Y(obj);
            d0 = obj;
        } else {
            oi2.Y(obj);
            ne2Var = this.Y;
            Object[] objArr = this.Z;
            Object obj2 = objArr[0];
            obj2.getClass();
            vr4 vr4Var = (vr4) obj2;
            List list = (List) vr4Var.A;
            Object obj3 = objArr[1];
            obj3.getClass();
            String str = (String) obj3;
            Object obj4 = objArr[2];
            obj4.getClass();
            List list2 = (List) obj4;
            Object obj5 = objArr[3];
            obj5.getClass();
            List list3 = (List) obj5;
            gn6 gn6Var = (gn6) vr4Var.B;
            tz5 tz5Var = this.d0;
            hn6 hn6Var = (hn6) tz5Var.q.getValue();
            Object obj6 = objArr[4];
            obj6.getClass();
            Object obj7 = objArr[5];
            obj7.getClass();
            this.Y = null;
            this.Z = null;
            this.e0 = ne2Var;
            this.X = 1;
            d0 = hv.d0(xk1.a, new nz5(list, list3, str, (n06) obj7, (qw5) obj6, gn6Var, hn6Var, tz5Var, list2, null), this);
        }
        this.Y = null;
        this.Z = null;
        this.e0 = null;
        this.X = 2;
    }
}
