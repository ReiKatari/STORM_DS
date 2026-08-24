package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: op0  reason: default package */
/* loaded from: classes.dex */
public final class op0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ aq0 Z;
    public final /* synthetic */ rc4 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op0(aq0 aq0Var, rc4 rc4Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = aq0Var;
        this.d0 = rc4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((op0) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((op0) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((op0) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((op0) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new op0(this.Z, this.d0, r41Var, 0);
            case 1:
                return new op0(this.Z, this.d0, r41Var, 1);
            case 2:
                return new op0(this.Z, this.d0, r41Var, 2);
            default:
                return new op0(this.Z, this.d0, r41Var, 3);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        rc4 rc4Var = this.d0;
        aq0 aq0Var = this.Z;
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
                vl0 vl0Var = aq0Var.m;
                np0 np0Var = new np0(rc4Var, 0);
                this.Y = 1;
                if (vl0Var.b(np0Var, this) == x61Var) {
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
                vl0 vl0Var2 = aq0Var.o;
                np0 np0Var2 = new np0(rc4Var, 1);
                this.Y = 1;
                if (vl0Var2.b(np0Var2, this) == x61Var2) {
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
                vl0 vl0Var3 = aq0Var.q;
                np0 np0Var3 = new np0(rc4Var, 2);
                this.Y = 1;
                if (vl0Var3.b(np0Var3, this) == x61Var3) {
                    return x61Var3;
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
                vl0 vl0Var4 = aq0Var.s;
                np0 np0Var4 = new np0(rc4Var, 3);
                this.Y = 1;
                if (vl0Var4.b(np0Var4, this) == x61Var4) {
                    return x61Var4;
                }
                return jg7Var;
        }
    }
}
