package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vy1  reason: default package */
/* loaded from: classes.dex */
public final class vy1 extends nk6 implements bj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ nd3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vy1(int i, int i2, j11 j11Var) {
        super(i, j11Var);
        this.X = i2;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        o27 o27Var = o27.a;
        nd3 nd3Var = (nd3) obj;
        o27 o27Var2 = (o27) obj2;
        j11 j11Var = (j11) obj3;
        switch (i) {
            case 0:
                vy1 vy1Var = new vy1(3, 0, j11Var);
                vy1Var.Y = nd3Var;
                return vy1Var.v(o27Var);
            default:
                vy1 vy1Var2 = new vy1(3, 1, j11Var);
                vy1Var2.Y = nd3Var;
                return vy1Var2.v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        nd3 nd3Var = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return nd3Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return nd3Var;
        }
    }
}
