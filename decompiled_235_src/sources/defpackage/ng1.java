package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ng1  reason: default package */
/* loaded from: classes.dex */
public final class ng1 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ qg1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng1(qg1 qg1Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = qg1Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((ng1) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((ng1) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((ng1) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        qg1 qg1Var = this.Z;
        switch (i) {
            case 0:
                return new ng1(qg1Var, r41Var, 0);
            case 1:
                return new ng1(qg1Var, r41Var, 1);
            default:
                return new ng1(qg1Var, r41Var, 2);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        qg1 qg1Var = this.Z;
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
                ri7 k = qg1.k(qg1Var);
                this.Y = 1;
                Object c = k.c(this);
                if (c == x61Var) {
                    return x61Var;
                }
                return c;
            case 1:
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
                jg1 j = qg1.k(qg1Var).j();
                this.Y = 1;
                Object q = ((tu0) j).q(this);
                if (q == x61Var2) {
                    return x61Var2;
                }
                return q;
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                jg1 a = qg1.k(qg1Var).a();
                this.Y = 1;
                Object q2 = ((tu0) a).q(this);
                if (q2 == x61Var3) {
                    return x61Var3;
                }
                return q2;
        }
    }
}
