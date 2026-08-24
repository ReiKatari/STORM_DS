package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: re2  reason: default package */
/* loaded from: classes.dex */
public final class re2 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ le2 Z;
    public final /* synthetic */ q35 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re2(le2 le2Var, q35 q35Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = le2Var;
        this.d0 = q35Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((re2) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((re2) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new re2(this.Z, this.d0, r41Var, 0);
            default:
                return new re2(this.Z, this.d0, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        q35 q35Var = this.d0;
        le2 le2Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    return jg7Var;
                }
                oi2.Y(obj);
                qe2 qe2Var = new qe2(q35Var, 0);
                this.Y = 1;
                if (le2Var.b(qe2Var, this) == x61Var) {
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
                qe2 qe2Var2 = new qe2(q35Var, 2);
                this.Y = 1;
                if (le2Var.b(qe2Var2, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
        }
    }
}
