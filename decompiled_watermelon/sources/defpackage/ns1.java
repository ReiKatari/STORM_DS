package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ns1  reason: default package */
/* loaded from: classes.dex */
public final class ns1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ r9 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ns1(r9 r9Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = r9Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((ns1) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((ns1) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        r9 r9Var = this.Z;
        switch (i) {
            case 0:
                return new ns1(r9Var, j11Var, 0);
            default:
                return new ns1(r9Var, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        r9 r9Var = this.Z;
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
                o45 o45Var = r9Var.A().e;
                x6 x6Var = new x6(6, r9Var);
                this.Y = 1;
                if (o45Var.A.a(x6Var, this) == p31Var) {
                    return p31Var;
                }
                return o27Var;
            default:
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
                in3 in3Var = ((xp) r9Var.a).A;
                qm3 qm3Var = qm3.CREATED;
                ns1 ns1Var = new ns1(r9Var, null, 0);
                this.Y = 1;
                if (nl2.Q(in3Var, qm3Var, ns1Var, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
        }
    }
}
