package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z51  reason: default package */
/* loaded from: classes.dex */
public final class z51 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ zy4 Z;
    public final /* synthetic */ g17 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z51(zy4 zy4Var, g17 g17Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = zy4Var;
        this.d0 = g17Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((z51) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((z51) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((z51) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new z51(this.Z, this.d0, r41Var, 0);
            case 1:
                return new z51(this.Z, this.d0, r41Var, 1);
            default:
                return new z51(this.Z, this.d0, r41Var, 2);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        g17 g17Var = this.d0;
        zy4 zy4Var = this.Z;
        Object obj2 = jg7.a;
        switch (i) {
            case 0:
                Object obj3 = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return obj2;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object C = g04.C(new ag(zy4Var, g17Var, null, 9), this);
                if (C != obj3) {
                    C = obj2;
                }
                if (C == obj3) {
                    return obj3;
                }
                return obj2;
            case 1:
                Object obj4 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return obj2;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object o = uj2.o(zy4Var, new tj2(g17Var, null, 1), this);
                if (o != obj4) {
                    o = obj2;
                }
                if (o == obj4) {
                    return obj4;
                }
                return obj2;
            default:
                Object obj5 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return obj2;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                cz3 cz3Var = new cz3(g17Var, 0);
                dz3 dz3Var = new dz3(g17Var, 0);
                dz3 dz3Var2 = new dz3(g17Var, 1);
                z5 z5Var = new z5(g17Var, 18);
                float f = sn1.a;
                Object o2 = uj2.o(zy4Var, new on1(new c5(28), new ov4(cz3Var, 6), z5Var, dz3Var2, new k0(dz3Var, 21), (r41) null), this);
                Object obj6 = o2;
                if (o2 != obj5) {
                    obj6 = obj2;
                }
                if (obj6 != obj5) {
                    obj6 = obj2;
                }
                if (obj6 != obj5) {
                    obj6 = obj2;
                }
                if (obj6 == obj5) {
                    return obj5;
                }
                return obj2;
        }
    }
}
