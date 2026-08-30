package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dx4  reason: default package */
/* loaded from: classes.dex */
public final class dx4 extends nk6 implements mi2 {
    public int X;
    public final /* synthetic */ ex4 Y;
    public final /* synthetic */ float Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx4(ex4 ex4Var, float f, j11 j11Var) {
        super(1, j11Var);
        this.Y = ex4Var;
        this.Z = f;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        return new dx4(this.Y, this.Z, (j11) obj).v(o27.a);
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
            ex4 ex4Var = this.Y;
            float h = ex4Var.e.h();
            z5 z5Var = new z5(21, ex4Var);
            this.X = 1;
            if (gk2.r(h, this.Z, null, z5Var, this, 12) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }
}
