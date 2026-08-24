package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: so0  reason: default package */
/* loaded from: classes.dex */
public final class so0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ uo0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so0(uo0 uo0Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = uo0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((so0) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((so0) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        uo0 uo0Var = this.Z;
        switch (i) {
            case 0:
                return new so0(uo0Var, r41Var, 0);
            default:
                return new so0(uo0Var, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        uo0 uo0Var = this.Z;
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
                lw7 b = lw7.b(((h16) ((gp0) uo0Var.Y.getValue()).b).a);
                b.getClass();
                le2 c = b.c("cheat_import_worker");
                y6 y6Var = new y6(uo0Var, 4);
                this.Y = 1;
                Object b2 = c.b(new a7(y6Var, 27), this);
                if (b2 != x61Var) {
                    b2 = jg7Var;
                }
                if (b2 == x61Var) {
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
                tt3 tt3Var = tt3.STARTED;
                so0 so0Var = new so0(uo0Var, null, 0);
                this.Y = 1;
                if (np2.d0(uo0Var, tt3Var, so0Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
        }
    }
}
