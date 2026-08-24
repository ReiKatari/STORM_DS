package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wx7  reason: default package */
/* loaded from: classes.dex */
public final class wx7 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ xx7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx7(xx7 xx7Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = xx7Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((wx7) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((wx7) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        xx7 xx7Var = this.Z;
        switch (i) {
            case 0:
                return new wx7(xx7Var, r41Var, 0);
            default:
                return new wx7(xx7Var, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        xx7 xx7Var = this.Z;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    te teVar = xx7Var.A;
                    this.Y = 1;
                    Object l = teVar.y0.l(this);
                    if (l != x61Var) {
                        l = jg7Var;
                    }
                    if (l == x61Var) {
                        return x61Var;
                    }
                }
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    te teVar2 = xx7Var.A;
                    this.Y = 1;
                    Object a = teVar2.z0.a(this);
                    if (a != x61Var2) {
                        a = jg7Var;
                    }
                    if (a == x61Var2) {
                        return x61Var2;
                    }
                }
                return jg7Var;
        }
    }
}
