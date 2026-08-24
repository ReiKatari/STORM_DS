package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n22  reason: default package */
/* loaded from: classes.dex */
public final class n22 extends hw6 implements qn2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n22(Object obj, Object obj2, Object obj3, Object obj4, r41 r41Var, int i) {
        super(1, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
        this.e0 = obj3;
        this.f0 = obj4;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.f0;
        Object obj3 = this.e0;
        Object obj4 = this.d0;
        Object obj5 = this.Z;
        switch (i) {
            case 0:
                return new n22((sz1) obj5, (String) obj4, (String) obj3, (String) obj2, (r41) obj, 0).s(jg7Var);
            default:
                return new n22((ri7) obj5, (ki7) obj4, (Map) obj3, (xy0) obj2, (r41) obj, 1).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        Object obj2 = this.f0;
        Object obj3 = this.e0;
        Object obj4 = this.d0;
        Object obj5 = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                pn5 pn5Var = ((sz1) obj5).g;
                this.Y = 1;
                Object e = ((pl) pn5Var).e((String) obj4, (String) obj3, (String) obj2, this);
                if (e == x61Var) {
                    return x61Var;
                }
                return e;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object k = ri7.k((ri7) obj5, (ki7) obj4, (Map) obj3, (xy0) obj2, this);
                if (k == x61Var2) {
                    return x61Var2;
                }
                return k;
        }
    }
}
