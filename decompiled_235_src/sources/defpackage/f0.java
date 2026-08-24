package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f0  reason: default package */
/* loaded from: classes.dex */
public final class f0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ h0 Z;
    public final /* synthetic */ l25 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(h0 h0Var, l25 l25Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = h0Var;
        this.d0 = l25Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((f0) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((f0) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((f0) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((f0) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        l25 l25Var = this.d0;
        h0 h0Var = this.Z;
        switch (i) {
            case 0:
                return new f0(h0Var, l25Var, r41Var, 0);
            case 1:
                return new f0(h0Var, l25Var, r41Var, 1);
            case 2:
                return new f0(h0Var, l25Var, r41Var, 2);
            default:
                return new f0(h0Var, l25Var, r41Var, 3);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        l25 l25Var = this.d0;
        h0 h0Var = this.Z;
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
                r94 r94Var = h0Var.m0;
                if (r94Var != null) {
                    k25 k25Var = new k25(l25Var);
                    this.Y = 1;
                    if (r94Var.a(k25Var, this) == x61Var) {
                        return x61Var;
                    }
                    return jg7Var;
                }
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                r94 r94Var2 = h0Var.m0;
                if (r94Var2 != null) {
                    k25 k25Var2 = new k25(l25Var);
                    this.Y = 1;
                    if (r94Var2.a(k25Var2, this) == x61Var2) {
                        return x61Var2;
                    }
                    return jg7Var;
                }
                return jg7Var;
            case 2:
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
                r94 r94Var3 = h0Var.m0;
                if (r94Var3 != null) {
                    this.Y = 1;
                    if (r94Var3.a(l25Var, this) == x61Var3) {
                        return x61Var3;
                    }
                    return jg7Var;
                }
                return jg7Var;
            default:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                r94 r94Var4 = h0Var.m0;
                if (r94Var4 != null) {
                    m25 m25Var = new m25(l25Var);
                    this.Y = 1;
                    if (r94Var4.a(m25Var, this) == x61Var4) {
                        return x61Var4;
                    }
                    return jg7Var;
                }
                return jg7Var;
        }
    }
}
