package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pz5  reason: default package */
/* loaded from: classes.dex */
public final class pz5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public tp6 Y;
    public int Z;
    public final /* synthetic */ tz5 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pz5(tz5 tz5Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = tz5Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((pz5) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((pz5) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        tz5 tz5Var = this.d0;
        switch (i) {
            case 0:
                return new pz5(tz5Var, r41Var, 0);
            default:
                return new pz5(tz5Var, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        tp6 tp6Var;
        tp6 tp6Var2;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        tz5 tz5Var = this.d0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Z;
                if (i2 != 0) {
                    if (i2 == 1) {
                        tp6Var = this.Y;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    tp6 tp6Var3 = tz5Var.u;
                    pn5 pn5Var = tz5Var.h;
                    this.Y = tp6Var3;
                    this.Z = 1;
                    Object s = ((pl) pn5Var).s(this);
                    if (s == x61Var) {
                        return x61Var;
                    }
                    obj = s;
                    tp6Var = tp6Var3;
                }
                tp6Var.l(obj);
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Z;
                if (i3 != 0) {
                    if (i3 == 1) {
                        tp6Var2 = this.Y;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    tp6 tp6Var4 = tz5Var.E;
                    this.Y = tp6Var4;
                    this.Z = 1;
                    xe1 xe1Var = xk1.a;
                    Object d0 = hv.d0(de1.L, new dz5(tz5Var, null, 2), this);
                    if (d0 == x61Var2) {
                        return x61Var2;
                    }
                    obj = d0;
                    tp6Var2 = tp6Var4;
                }
                tp6Var2.l(obj);
                return jg7Var;
        }
    }
}
