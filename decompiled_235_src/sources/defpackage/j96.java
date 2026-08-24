package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j96  reason: default package */
/* loaded from: classes.dex */
public final class j96 extends hw6 implements eo2 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ n96 e0;
    public final /* synthetic */ ga7 f0;
    public final /* synthetic */ float g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j96(Object obj, Object obj2, n96 n96Var, ga7 ga7Var, float f, r41 r41Var) {
        super(2, r41Var);
        this.Z = obj;
        this.d0 = obj2;
        this.e0 = n96Var;
        this.f0 = ga7Var;
        this.g0 = f;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((j96) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        j96 j96Var = new j96(this.Z, this.d0, this.e0, this.f0, this.g0, r41Var);
        j96Var.Y = obj;
        return j96Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        n96 n96Var = this.e0;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            w61 w61Var = (w61) this.Y;
            Object obj2 = this.Z;
            Object obj3 = this.d0;
            if (!nb3.k(obj2, obj3)) {
                n96.o(n96Var);
            } else {
                n96Var.o = null;
                if (nb3.k(n96Var.c.getValue(), obj2)) {
                    return jg7Var;
                }
            }
            boolean k = nb3.k(obj2, obj3);
            float f = this.g0;
            if (!k) {
                ga7 ga7Var = this.f0;
                ga7Var.p(obj2);
                ga7Var.n(0L);
                n96Var.b.setValue(obj2);
                ga7Var.j(f);
            }
            n96Var.x(f);
            if (n96Var.n.i()) {
                hv.L(w61Var, null, null, new ns3(n96Var, null, 10), 3);
            } else {
                n96Var.m = Long.MIN_VALUE;
            }
            this.X = 1;
            if (n96.r(n96Var, this) == x61Var) {
                return x61Var;
            }
        }
        n96Var.w();
        return jg7Var;
    }
}
