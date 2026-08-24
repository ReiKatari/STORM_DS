package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ax6  reason: default package */
/* loaded from: classes.dex */
public final class ax6 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 1;
    public int Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax6(p27 p27Var, boolean z, r41 r41Var) {
        super(2, r41Var);
        this.d0 = p27Var;
        this.Z = z;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((ax6) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((ax6) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        boolean z = this.Z;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                return new ax6(z, (dd) obj2, r41Var);
            default:
                return new ax6((p27) obj2, z, r41Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        tr0 tr0Var;
        int i = this.X;
        boolean z = this.Z;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.d0;
        fp fpVar = null;
        switch (i) {
            case 0:
                dd ddVar = (dd) obj2;
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
                if (z != ((Boolean) ddVar.g.getValue()).booleanValue()) {
                    Boolean valueOf = Boolean.valueOf(z);
                    this.Y = 1;
                    if (mb3.r(ddVar, valueOf, ddVar.k.h(), this) == x61Var) {
                        return x61Var;
                    }
                    return jg7Var;
                }
                return jg7Var;
            default:
                p27 p27Var = (p27) obj2;
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
                if (!k47.c(p27Var.n().b) && !(p27Var.f instanceof jt4)) {
                    fpVar = ln2.A(p27Var.n());
                    if (z) {
                        int e = k47.e(p27Var.n().b);
                        p27Var.c.g(p27.e(p27Var.n().a, jx2.f(e, e)));
                        p27Var.q(hv2.None);
                    }
                }
                if (fpVar != null && (tr0Var = p27Var.h) != null) {
                    sr0 I = lb4.I(fpVar);
                    this.Y = 1;
                    ((ce) tr0Var).a(I);
                    if (jg7Var == x61Var2) {
                        return x61Var2;
                    }
                    return jg7Var;
                }
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax6(boolean z, dd ddVar, r41 r41Var) {
        super(2, r41Var);
        this.Z = z;
        this.d0 = ddVar;
    }
}
