package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n54  reason: default package */
/* loaded from: classes.dex */
public final class n54 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n54(int i, int i2, j11 j11Var) {
        super(i, j11Var);
        this.X = i2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((n54) t((j11) obj2, (w92) obj)).v(o27Var);
            default:
                return ((n54) t((j11) obj2, (o31) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                n54 n54Var = new n54(2, 0, j11Var);
                n54Var.Z = obj;
                return n54Var;
            default:
                n54 n54Var2 = new n54(2, 1, j11Var);
                n54Var2.Z = obj;
                return n54Var2;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        o31 o31Var;
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                w92 w92Var = (w92) this.Z;
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
                this.Z = null;
                this.Y = 1;
                if (w92Var.b(o27Var, this) == p31Var) {
                    return p31Var;
                }
                return o27Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        o31Var = (o31) this.Z;
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    o31Var = (o31) this.Z;
                }
                while (ln2.G(o31Var.w())) {
                    gi3 gi3Var = new gi3(11);
                    this.Z = o31Var;
                    this.Y = 1;
                    e31 e31Var = this.B;
                    e31Var.getClass();
                    if (io2.F(e31Var).a(gi3Var, this) == p31Var2) {
                        return p31Var2;
                    }
                }
                return o27Var;
        }
    }
}
