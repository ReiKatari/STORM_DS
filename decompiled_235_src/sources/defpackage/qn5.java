package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qn5  reason: default package */
/* loaded from: classes.dex */
public final class qn5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ sn5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qn5(sn5 sn5Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = sn5Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((qn5) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((qn5) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((qn5) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        sn5 sn5Var = this.Z;
        switch (i) {
            case 0:
                return new qn5(sn5Var, r41Var, 0);
            case 1:
                return new qn5(sn5Var, r41Var, 1);
            default:
                return new qn5(sn5Var, r41Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r9 == r0) goto L31;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        sn5 sn5Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                if (sn5.e(sn5Var, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    pn5 pn5Var = sn5Var.b;
                    this.Y = 1;
                    obj = ((pl) pn5Var).w(this);
                    break;
                }
                if (((Boolean) obj).booleanValue()) {
                    tp6 tp6Var = sn5Var.c;
                    om5 om5Var = om5.a;
                    tp6Var.getClass();
                    tp6Var.m(null, om5Var);
                    return jg7Var;
                }
                this.Y = 2;
                if (sn5.e(sn5Var, this) != x61Var2) {
                    return jg7Var;
                }
                return x61Var2;
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                pn5 pn5Var2 = sn5Var.b;
                this.Y = 1;
                if (((pl) pn5Var2).y(this) == x61Var3) {
                    return x61Var3;
                }
                return jg7Var;
        }
    }
}
