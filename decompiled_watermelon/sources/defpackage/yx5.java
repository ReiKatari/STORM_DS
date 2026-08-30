package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yx5  reason: default package */
/* loaded from: classes.dex */
public final class yx5 extends nk6 implements mi2 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ by5 c0;
    public final /* synthetic */ kx6 d0;
    public final /* synthetic */ float e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx5(Object obj, Object obj2, by5 by5Var, kx6 kx6Var, float f, j11 j11Var) {
        super(1, j11Var);
        this.Y = obj;
        this.Z = obj2;
        this.c0 = by5Var;
        this.d0 = kx6Var;
        this.e0 = f;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        kx6 kx6Var = this.d0;
        float f = this.e0;
        return new yx5(this.Y, this.Z, this.c0, kx6Var, f, (j11) obj).v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            xx5 xx5Var = new xx5(this.Y, this.Z, this.c0, this.d0, this.e0, null);
            this.X = 1;
            if (iq2.k(xx5Var, this) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }
}
