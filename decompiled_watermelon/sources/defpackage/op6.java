package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: op6  reason: default package */
/* loaded from: classes.dex */
public final class op6 extends nk6 implements bj2 {
    public int X;
    public /* synthetic */ ht4 Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ o31 c0;
    public final /* synthetic */ k24 d0;
    public final /* synthetic */ l14 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op6(o31 o31Var, k24 k24Var, l14 l14Var, j11 j11Var) {
        super(3, j11Var);
        this.c0 = o31Var;
        this.d0 = k24Var;
        this.e0 = l14Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        long j = ((mb4) obj2).a;
        k24 k24Var = this.d0;
        l14 l14Var = this.e0;
        op6 op6Var = new op6(this.c0, k24Var, l14Var, (j11) obj3);
        op6Var.Y = (ht4) obj;
        op6Var.Z = j;
        return op6Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        o31 o31Var = this.c0;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            ht4 ht4Var = this.Y;
            tq5.w(o31Var, null, null, new b0(5, this.Z, (j11) null, this.d0, this.e0), 3);
            this.X = 1;
            obj = ht4Var.h(this);
            if (obj == p31Var) {
                return p31Var;
            }
        }
        tq5.w(o31Var, null, null, new uw1(this.d0, ((Boolean) obj).booleanValue(), this.e0, (j11) null), 3);
        return o27.a;
    }
}
