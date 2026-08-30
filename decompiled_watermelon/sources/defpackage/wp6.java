package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wp6  reason: default package */
/* loaded from: classes.dex */
public final class wp6 extends nk6 implements mi2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ bq6 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp6(bq6 bq6Var, j11 j11Var, int i) {
        super(1, j11Var);
        this.X = i;
        this.Y = bq6Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        bq6 bq6Var = this.Y;
        j11 j11Var = (j11) obj;
        switch (i) {
            case 0:
                new wp6(bq6Var, j11Var, 0).v(o27Var);
                return o27Var;
            case 1:
                new wp6(bq6Var, j11Var, 1).v(o27Var);
                return o27Var;
            case 2:
                new wp6(bq6Var, j11Var, 2).v(o27Var);
                return o27Var;
            default:
                new wp6(bq6Var, j11Var, 3).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        bq6 bq6Var = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                bq6Var.B = false;
                return o27Var;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                bq6Var.f();
                return o27Var;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                bq6Var.d(bq6Var.B);
                return o27Var;
            default:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                bq6Var.p();
                return o27Var;
        }
    }
}
