package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i02  reason: default package */
/* loaded from: classes.dex */
public final class i02 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ sz1 Z;
    public final /* synthetic */ String d0;
    public final /* synthetic */ String e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i02(sz1 sz1Var, String str, String str2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = sz1Var;
        this.d0 = str;
        this.e0 = str2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((i02) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((i02) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((i02) q(r41Var, w61Var)).s(jg7Var);
            case 3:
                return ((i02) q(r41Var, w61Var)).s(jg7Var);
            case 4:
                return ((i02) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((i02) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new i02(this.Z, this.d0, this.e0, r41Var, 0);
            case 1:
                return new i02(this.Z, this.d0, this.e0, r41Var, 1);
            case 2:
                return new i02(this.Z, this.d0, this.e0, r41Var, 2);
            case 3:
                return new i02(this.Z, this.d0, this.e0, r41Var, 3);
            case 4:
                return new i02(this.Z, this.d0, this.e0, r41Var, 4);
            default:
                return new i02(this.Z, this.d0, this.e0, r41Var, 5);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object i;
        int i2 = this.X;
        String str = this.e0;
        String str2 = this.d0;
        sz1 sz1Var = this.Z;
        switch (i2) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
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
                ck4 ck4Var = sz1Var.j;
                this.Y = 1;
                Object b = ck4Var.b(str2, str, this);
                if (b == x61Var) {
                    return x61Var;
                }
                return b;
            case 1:
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
                oj4 oj4Var = sz1Var.i;
                this.Y = 1;
                Object g = oj4Var.g(str2, str, this);
                if (g == x61Var2) {
                    return x61Var2;
                }
                return g;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                oj4 oj4Var2 = sz1Var.i;
                this.Y = 1;
                Object g2 = oj4Var2.g(str2, str, this);
                if (g2 == x61Var3) {
                    return x61Var3;
                }
                return g2;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        oi2.Y(obj);
                        i = ((hm5) obj).A;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    oj4 oj4Var3 = sz1Var.i;
                    this.Y = 1;
                    i = oj4Var3.i(str2, str, this);
                    if (i == x61Var4) {
                        return x61Var4;
                    }
                }
                return new hm5(i);
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                oj4 oj4Var4 = sz1Var.i;
                this.Y = 1;
                Object g3 = oj4Var4.g(str2, str, this);
                if (g3 == x61Var5) {
                    return x61Var5;
                }
                return g3;
            default:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                oj4 oj4Var5 = sz1Var.i;
                this.Y = 1;
                Object g4 = oj4Var5.g(str2, str, this);
                if (g4 == x61Var6) {
                    return x61Var6;
                }
                return g4;
        }
    }
}
