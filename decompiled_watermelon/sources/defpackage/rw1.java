package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rw1  reason: default package */
/* loaded from: classes.dex */
public final class rw1 extends nk6 implements bj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw1(q03 q03Var, aj2 aj2Var, j11 j11Var) {
        super(3, j11Var);
        this.X = 2;
        this.Z = q03Var;
        this.c0 = aj2Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        o27 o27Var = o27.a;
        Object obj4 = this.c0;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj2;
                rw1 rw1Var = new rw1(0, (j11) obj3, (hv1) obj4);
                rw1Var.Z = (w92) obj;
                return rw1Var.v(o27Var);
            case 1:
                Throwable th2 = (Throwable) obj2;
                rw1 rw1Var2 = new rw1(1, (j11) obj3, (hv1) obj4);
                rw1Var2.Z = (w92) obj;
                return rw1Var2.v(o27Var);
            default:
                nc ncVar = (nc) obj;
                pt3 pt3Var = (pt3) obj2;
                return new rw1((q03) this.Z, (aj2) obj4, (j11) obj3).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        Object obj2 = this.c0;
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
                a7 e = ((hv1) obj2).q.e(nd3.h);
                this.Z = null;
                this.Y = 1;
                if (se.s(w92Var, e, this) == p31Var) {
                    return p31Var;
                }
                return o27Var;
            case 1:
                w92 w92Var2 = (w92) this.Z;
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
                tj0 t = hv1.t((hv1) obj2);
                this.Z = null;
                this.Y = 1;
                if (se.s(w92Var2, t, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
            default:
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
                aj2 aj2Var = (aj2) obj2;
                this.Y = 1;
                if (aj2Var.j((oc) ((q03) this.Z).B, this) == p31Var3) {
                    return p31Var3;
                }
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rw1(int i, j11 j11Var, hv1 hv1Var) {
        super(3, j11Var);
        this.X = i;
        this.c0 = hv1Var;
    }
}
