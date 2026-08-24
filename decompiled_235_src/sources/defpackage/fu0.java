package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fu0  reason: default package */
/* loaded from: classes.dex */
public final class fu0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ gu0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu0(gu0 gu0Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = gu0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((fu0) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((fu0) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((fu0) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        gu0 gu0Var = this.Z;
        switch (i) {
            case 0:
                return new fu0(gu0Var, r41Var, 0);
            case 1:
                return new fu0(gu0Var, r41Var, 1);
            default:
                return new fu0(gu0Var, r41Var, 2);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        gu0 gu0Var = this.Z;
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
                    long b = ((fo7) hf.K(gu0Var, ky0.t)).b();
                    this.Y = 1;
                    if (q60.t(b, this) == x61Var) {
                        return x61Var;
                    }
                }
                on2 on2Var = gu0Var.H0;
                if (on2Var != null) {
                    on2Var.c();
                }
                if (gu0Var.I0) {
                    ((lx4) ((tv2) hf.K(gu0Var, ky0.l))).a(0);
                }
                gu0Var.P0 = true;
                ap6 ap6Var = gu0Var.N0;
                if (ap6Var != null) {
                    ap6Var.h(null);
                }
                gu0Var.N0 = null;
                gu0Var.M0 = null;
                return jg7Var;
            case 1:
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
                    long b2 = ((fo7) hf.K(gu0Var, ky0.t)).b();
                    this.Y = 1;
                    if (q60.t(b2, this) == x61Var2) {
                        return x61Var2;
                    }
                }
                on2 on2Var2 = gu0Var.H0;
                if (on2Var2 != null) {
                    on2Var2.c();
                }
                if (gu0Var.I0) {
                    ((lx4) ((tv2) hf.K(gu0Var, ky0.l))).a(0);
                }
                gu0Var.W0 = true;
                ap6 ap6Var2 = gu0Var.U0;
                if (ap6Var2 != null) {
                    ap6Var2.h(null);
                }
                gu0Var.U0 = null;
                gu0Var.T0 = null;
                return jg7Var;
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    long b3 = ((fo7) hf.K(gu0Var, ky0.t)).b();
                    this.Y = 1;
                    if (q60.t(b3, this) == x61Var3) {
                        return x61Var3;
                    }
                }
                on2 on2Var3 = gu0Var.H0;
                if (on2Var3 != null) {
                    on2Var3.c();
                    return jg7Var;
                }
                return jg7Var;
        }
    }
}
