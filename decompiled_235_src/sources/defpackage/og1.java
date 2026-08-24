package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: og1  reason: default package */
/* loaded from: classes.dex */
public final class og1 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ qg1 Z;
    public final /* synthetic */ Map d0;
    public final /* synthetic */ ki7 e0;
    public final /* synthetic */ xy0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og1(qg1 qg1Var, r41 r41Var, Map map, ki7 ki7Var, xy0 xy0Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = qg1Var;
        this.d0 = map;
        this.e0 = ki7Var;
        this.f0 = xy0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((og1) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((og1) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new og1(this.Z, r41Var, this.d0, this.e0, this.f0, 0);
            default:
                return new og1(this.Z, r41Var, this.d0, this.e0, this.f0, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        xy0 xy0Var = this.f0;
        ki7 ki7Var = this.e0;
        Map map = this.d0;
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
                jg1 i3 = qg1.k(qg1Var).i(map, ki7Var, xy0Var);
                this.Y = 1;
                Object q = ((tu0) i3).q(this);
                if (q == x61Var) {
                    return x61Var;
                }
                return q;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
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
                jg1 h = qg1.k(qg1Var).h(map, ki7Var, xy0Var);
                this.Y = 1;
                Object X = h.X(this);
                if (X == x61Var2) {
                    return x61Var2;
                }
                return X;
        }
    }
}
