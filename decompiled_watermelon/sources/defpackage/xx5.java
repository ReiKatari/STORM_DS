package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xx5  reason: default package */
/* loaded from: classes.dex */
public final class xx5 extends nk6 implements aj2 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;
    public final /* synthetic */ by5 d0;
    public final /* synthetic */ kx6 e0;
    public final /* synthetic */ float f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx5(Object obj, Object obj2, by5 by5Var, kx6 kx6Var, float f, j11 j11Var) {
        super(2, j11Var);
        this.Z = obj;
        this.c0 = obj2;
        this.d0 = by5Var;
        this.e0 = kx6Var;
        this.f0 = f;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((xx5) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        xx5 xx5Var = new xx5(this.Z, this.c0, this.d0, this.e0, this.f0, j11Var);
        xx5Var.Y = obj;
        return xx5Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        o27 o27Var = o27.a;
        by5 by5Var = this.d0;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            o31 o31Var = (o31) this.Y;
            Object obj2 = this.Z;
            Object obj3 = this.c0;
            if (!b53.x(obj2, obj3)) {
                by5.o(by5Var);
            } else {
                by5Var.o = null;
                if (b53.x(by5Var.c.getValue(), obj2)) {
                    return o27Var;
                }
            }
            boolean x = b53.x(obj2, obj3);
            float f = this.f0;
            if (!x) {
                kx6 kx6Var = this.e0;
                kx6Var.p(obj2);
                kx6Var.n(0L);
                by5Var.b.setValue(obj2);
                kx6Var.j(f);
            }
            by5Var.x(f);
            if (by5Var.n.i()) {
                tq5.w(o31Var, null, null, new ys3(by5Var, null, 9), 3);
            } else {
                by5Var.m = Long.MIN_VALUE;
            }
            this.X = 1;
            if (by5.r(by5Var, this) == p31Var) {
                return p31Var;
            }
        }
        by5Var.w();
        return o27Var;
    }
}
