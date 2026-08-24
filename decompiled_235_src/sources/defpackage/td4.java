package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td4  reason: default package */
/* loaded from: classes.dex */
public final class td4 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td4(int i, r41 r41Var, int i2) {
        super(i, r41Var);
        this.X = i2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((td4) q((r41) obj2, (ne2) obj)).s(jg7Var);
            default:
                return ((td4) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                td4 td4Var = new td4(2, r41Var, 0);
                td4Var.Z = obj;
                return td4Var;
            default:
                td4 td4Var2 = new td4(2, r41Var, 1);
                td4Var2.Z = obj;
                return td4Var2;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        w61 w61Var;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                ne2 ne2Var = (ne2) this.Z;
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
                this.Z = null;
                this.Y = 1;
                if (ne2Var.a(jg7Var, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        w61Var = (w61) this.Z;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    w61Var = (w61) this.Z;
                }
                while (yh2.z(w61Var.A())) {
                    v83 v83Var = new v83(23);
                    this.Z = w61Var;
                    this.Y = 1;
                    l61 l61Var = this.B;
                    l61Var.getClass();
                    if (ii2.x(l61Var).a(v83Var, this) == x61Var2) {
                        return x61Var2;
                    }
                }
                return jg7Var;
        }
    }
}
