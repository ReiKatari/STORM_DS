package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xj1  reason: default package */
/* loaded from: classes.dex */
public final class xj1 extends nk6 implements bj2 {
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj1(int i, int i2, j11 j11Var) {
        super(i, j11Var);
        this.X = i2;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                o31 o31Var = (o31) obj;
                long j = ((mb4) obj2).a;
                new xj1(3, 0, (j11) obj3).v(o27Var);
                return o27Var;
            case 1:
                o31 o31Var2 = (o31) obj;
                ((Number) obj2).floatValue();
                new xj1(3, 1, (j11) obj3).v(o27Var);
                return o27Var;
            default:
                ht4 ht4Var = (ht4) obj;
                long j2 = ((mb4) obj2).a;
                new xj1(3, 2, (j11) obj3).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return o27Var;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return o27Var;
            default:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return o27Var;
        }
    }
}
