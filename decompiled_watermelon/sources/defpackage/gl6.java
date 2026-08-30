package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gl6  reason: default package */
/* loaded from: classes.dex */
public final class gl6 extends nk6 implements aj2 {
    public final /* synthetic */ int X = 1;
    public int Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl6(bq6 bq6Var, boolean z, j11 j11Var) {
        super(2, j11Var);
        this.c0 = bq6Var;
        this.Z = z;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((gl6) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((gl6) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        boolean z = this.Z;
        Object obj2 = this.c0;
        switch (i) {
            case 0:
                return new gl6(z, (pc) obj2, j11Var);
            default:
                return new gl6((bq6) obj2, z, j11Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        hp0 hp0Var;
        int i = this.X;
        boolean z = this.Z;
        o27 o27Var = o27.a;
        Object obj2 = this.c0;
        to toVar = null;
        switch (i) {
            case 0:
                pc pcVar = (pc) obj2;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                if (z != ((Boolean) pcVar.g.getValue()).booleanValue()) {
                    Boolean valueOf = Boolean.valueOf(z);
                    this.Y = 1;
                    if (se.h(pcVar, valueOf, pcVar.k.h(), this) == p31Var) {
                        return p31Var;
                    }
                    return o27Var;
                }
                return o27Var;
            default:
                bq6 bq6Var = (bq6) obj2;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                if (!vr6.c(bq6Var.n().b) && !(bq6Var.f instanceof hk4)) {
                    toVar = io2.J(bq6Var.n());
                    if (z) {
                        int e = vr6.e(bq6Var.n().b);
                        bq6Var.c.n(bq6.e(bq6Var.n().a, ve2.g(e, e)));
                        bq6Var.q(gp2.None);
                    }
                }
                if (toVar != null && (hp0Var = bq6Var.h) != null) {
                    gp0 j0 = b53.j0(toVar);
                    this.Y = 1;
                    ((nd) hp0Var).a(j0);
                    if (o27Var == p31Var2) {
                        return p31Var2;
                    }
                    return o27Var;
                }
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl6(boolean z, pc pcVar, j11 j11Var) {
        super(2, j11Var);
        this.Z = z;
        this.c0 = pcVar;
    }
}
