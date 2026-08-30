package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rf0  reason: default package */
/* loaded from: classes.dex */
public final class rf0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf0(int i, int i2, j11 j11Var) {
        super(i, j11Var);
        this.X = i2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((rf0) t((j11) obj2, (o31) obj)).v(o27Var);
            default:
                return ((rf0) t((j11) obj2, Integer.valueOf(((Number) obj).intValue()))).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new rf0(2, 0, j11Var);
            default:
                rf0 rf0Var = new rf0(2, 1, j11Var);
                rf0Var.Y = ((Number) obj).intValue();
                return rf0Var;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        boolean z = true;
        switch (this.X) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i = this.Y;
                if (i != 0) {
                    if (i == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    this.Y = 1;
                    if (dk7.q(3000L, this) == p31Var) {
                        return p31Var;
                    }
                }
                return o27.a;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (this.Y <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
