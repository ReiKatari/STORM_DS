package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pw5  reason: default package */
/* loaded from: classes.dex */
public final class pw5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ rw5 Z;
    public /* synthetic */ long c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw5(rw5 rw5Var, long j, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = rw5Var;
        this.c0 = j;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((pw5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 1:
                return ((pw5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 2:
                return ((pw5) t((j11) obj2, (o31) obj)).v(o27Var);
            default:
                long j = ((mb4) obj).a;
                pw5 pw5Var = new pw5(this.Z, (j11) obj2);
                pw5Var.c0 = j;
                return pw5Var.v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new pw5(this.Z, this.c0, j11Var, 0);
            case 1:
                return new pw5(this.Z, this.c0, j11Var, 1);
            case 2:
                return new pw5(this.Z, this.c0, j11Var, 2);
            default:
                pw5 pw5Var = new pw5(this.Z, j11Var);
                pw5Var.c0 = ((mb4) obj).a;
                return pw5Var;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        rw5 rw5Var = this.Z;
        switch (i) {
            case 0:
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
                ax5 ax5Var = rw5Var.I0;
                r24 r24Var = r24.UserInput;
                ow5 ow5Var = new ow5(this.c0, null);
                this.Y = 1;
                if (ax5Var.f(r24Var, ow5Var, this) == p31Var) {
                    return p31Var;
                }
                return o27Var;
            case 1:
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
                ax5 ax5Var2 = rw5Var.I0;
                long j = this.c0;
                this.Y = 1;
                if (ax5Var2.b(j, false, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                ax5 ax5Var3 = rw5Var.I0;
                long j2 = this.c0;
                this.Y = 1;
                if (ax5Var3.b(j2, true, this) == p31Var3) {
                    return p31Var3;
                }
                return o27Var;
            default:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                long j3 = this.c0;
                ax5 ax5Var4 = rw5Var.I0;
                this.Y = 1;
                Object a = lw5.a(ax5Var4, j3, this);
                if (a == p31Var4) {
                    return p31Var4;
                }
                return a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw5(rw5 rw5Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 3;
        this.Z = rw5Var;
    }
}
