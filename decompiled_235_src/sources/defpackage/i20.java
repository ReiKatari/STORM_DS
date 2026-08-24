package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i20  reason: default package */
/* loaded from: classes.dex */
public final class i20 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 1;
    public int Y;
    public final /* synthetic */ fk3 Z;
    public final /* synthetic */ m20 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i20(m20 m20Var, fk3 fk3Var, r41 r41Var) {
        super(2, r41Var);
        this.d0 = m20Var;
        this.Z = fk3Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((i20) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((i20) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new i20(this.d0, this.Z, r41Var);
            default:
                return new i20(this.Z, this.d0, r41Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        m20 m20Var = this.d0;
        fk3 fk3Var = this.Z;
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
                wa3 wa3Var = m20Var.b;
                this.Y = 1;
                if (wa3Var.f(fk3Var, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            default:
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
                if (nb3.k(fk3Var.a, m20Var.f().A.getValue())) {
                    m20Var.e();
                }
                wa3 wa3Var2 = m20Var.b;
                this.Y = 1;
                if (wa3Var2.b(fk3Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i20(fk3 fk3Var, m20 m20Var, r41 r41Var) {
        super(2, r41Var);
        this.Z = fk3Var;
        this.d0 = m20Var;
    }
}
