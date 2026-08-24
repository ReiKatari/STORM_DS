package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zl0  reason: default package */
/* loaded from: classes.dex */
public final class zl0 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 0;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ cm0 d0;
    public final /* synthetic */ ne2 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl0(cm0 cm0Var, ne2 ne2Var, Object obj, r41 r41Var) {
        super(2, r41Var);
        this.d0 = cm0Var;
        this.e0 = ne2Var;
        this.Z = obj;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((zl0) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((zl0) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        ne2 ne2Var = this.e0;
        cm0 cm0Var = this.d0;
        switch (i) {
            case 0:
                return new zl0(cm0Var, ne2Var, this.Z, r41Var);
            default:
                zl0 zl0Var = new zl0(cm0Var, ne2Var, r41Var);
                zl0Var.Z = obj;
                return zl0Var;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
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
                fo2 fo2Var = this.d0.X;
                Object obj2 = this.Z;
                this.Y = 1;
                if (fo2Var.e(this.e0, obj2, this) == x61Var) {
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
                w61 w61Var = (w61) this.Z;
                Object obj3 = new Object();
                cm0 cm0Var = this.d0;
                le2 le2Var = cm0Var.R;
                bm0 bm0Var = new bm0(obj3, w61Var, cm0Var, this.e0, 0);
                this.Y = 1;
                if (le2Var.b(bm0Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl0(cm0 cm0Var, ne2 ne2Var, r41 r41Var) {
        super(2, r41Var);
        this.d0 = cm0Var;
        this.e0 = ne2Var;
    }
}
