package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c86  reason: default package */
/* loaded from: classes.dex */
public final class c86 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ e86 Z;
    public /* synthetic */ long d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c86(e86 e86Var, long j, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = e86Var;
        this.d0 = j;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((c86) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((c86) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                return ((c86) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                long j = ((jk4) obj).a;
                c86 c86Var = new c86(this.Z, (r41) obj2);
                c86Var.d0 = j;
                return c86Var.s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new c86(this.Z, this.d0, r41Var, 0);
            case 1:
                return new c86(this.Z, this.d0, r41Var, 1);
            case 2:
                return new c86(this.Z, this.d0, r41Var, 2);
            default:
                c86 c86Var = new c86(this.Z, r41Var);
                c86Var.d0 = ((jk4) obj).a;
                return c86Var;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        e86 e86Var = this.Z;
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
                m86 m86Var = e86Var.J0;
                xa4 xa4Var = xa4.UserInput;
                b86 b86Var = new b86(this.d0, null);
                this.Y = 1;
                if (m86Var.f(xa4Var, b86Var, this) == x61Var) {
                    return x61Var;
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
                m86 m86Var2 = e86Var.J0;
                long j = this.d0;
                this.Y = 1;
                if (m86Var2.b(j, false, this) == x61Var2) {
                    return x61Var2;
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
                m86 m86Var3 = e86Var.J0;
                long j2 = this.d0;
                this.Y = 1;
                if (m86Var3.b(j2, true, this) == x61Var3) {
                    return x61Var3;
                }
                return jg7Var;
            default:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
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
                long j3 = this.d0;
                m86 m86Var4 = e86Var.J0;
                this.Y = 1;
                Object a = y76.a(m86Var4, j3, this);
                if (a == x61Var4) {
                    return x61Var4;
                }
                return a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c86(e86 e86Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 3;
        this.Z = e86Var;
    }
}
