package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h96  reason: default package */
/* loaded from: classes.dex */
public final class h96 extends hw6 implements qn2 {
    public final /* synthetic */ int X = 0;
    public int Y;
    public final /* synthetic */ n96 Z;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ ga7 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h96(ga7 ga7Var, n96 n96Var, Object obj, r41 r41Var) {
        super(1, r41Var);
        this.e0 = ga7Var;
        this.Z = n96Var;
        this.d0 = obj;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        ga7 ga7Var = this.e0;
        Object obj2 = this.d0;
        n96 n96Var = this.Z;
        r41 r41Var = (r41) obj;
        switch (i) {
            case 0:
                return new h96(ga7Var, n96Var, obj2, r41Var).s(jg7Var);
            default:
                return new h96(n96Var, obj2, ga7Var, r41Var).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        float f;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        n96 n96Var = this.Z;
        Object obj2 = this.d0;
        ga7 ga7Var = this.e0;
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
                    ji jiVar = new ji(n96Var, obj2, ga7Var, (r41) null);
                    this.Y = 1;
                    if (g04.C(jiVar, this) == x61Var) {
                        return x61Var;
                    }
                }
                ga7Var.i();
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
                    n96Var.t();
                    vs4 vs4Var = n96Var.b;
                    n96Var.m = Long.MIN_VALUE;
                    n96Var.x(RecyclerView.B1);
                    if (obj2.equals(n96Var.c.getValue())) {
                        f = -4.0f;
                    } else if (obj2.equals(vs4Var.getValue())) {
                        f = -5.0f;
                    } else {
                        f = -3.0f;
                    }
                    ga7Var.p(obj2);
                    ga7Var.n(0L);
                    vs4Var.setValue(obj2);
                    n96Var.x(RecyclerView.B1);
                    n96Var.l(obj2);
                    ga7Var.j(f);
                    if (f == -3.0f) {
                        this.Y = 1;
                        if (n96.r(n96Var, this) == x61Var2) {
                            return x61Var2;
                        }
                    }
                }
                ga7Var.i();
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h96(n96 n96Var, Object obj, ga7 ga7Var, r41 r41Var) {
        super(1, r41Var);
        this.Z = n96Var;
        this.d0 = obj;
        this.e0 = ga7Var;
    }
}
