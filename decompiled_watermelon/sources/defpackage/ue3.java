package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ue3  reason: default package */
/* loaded from: classes.dex */
public final class ue3 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ bf3 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue3(bf3 bf3Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = bf3Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((ue3) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((ue3) t(j11Var, o31Var)).v(o27Var);
            case 2:
                return ((ue3) t(j11Var, o31Var)).v(o27Var);
            case 3:
                return ((ue3) t(j11Var, o31Var)).v(o27Var);
            case 4:
                return ((ue3) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((ue3) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        bf3 bf3Var = this.Z;
        switch (i) {
            case 0:
                return new ue3(bf3Var, j11Var, 0);
            case 1:
                return new ue3(bf3Var, j11Var, 1);
            case 2:
                return new ue3(bf3Var, j11Var, 2);
            case 3:
                return new ue3(bf3Var, j11Var, 3);
            case 4:
                return new ue3(bf3Var, j11Var, 4);
            default:
                return new ue3(bf3Var, j11Var, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        bf3 bf3Var = this.Z;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    ee6 ee6Var = bf3Var.i;
                    te3 te3Var = new te3(bf3Var, 0);
                    this.Y = 1;
                    Object a = ee6Var.a(new z6(te3Var, 16), this);
                    if (a != p31Var) {
                        a = o27Var;
                    }
                    if (a == p31Var) {
                        return p31Var;
                    }
                }
                return o27Var;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    te3 te3Var2 = new te3(bf3Var, 1);
                    this.Y = 1;
                    if (((gb2) bf3Var.d.c0).a(te3Var2, this) == p31Var2) {
                        return p31Var2;
                    }
                }
                return o27Var;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    jh1 k = w81.k(bf3Var.o, new qu1(24));
                    te3 te3Var3 = new te3(bf3Var, 2);
                    this.Y = 1;
                    if (k.a(te3Var3, this) == p31Var3) {
                        return p31Var3;
                    }
                }
                return o27Var;
            case 3:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    jh1 k2 = w81.k(bf3Var.o, new qu1(25));
                    te3 te3Var4 = new te3(bf3Var, 3);
                    this.Y = 1;
                    if (k2.a(te3Var4, this) == p31Var4) {
                        return p31Var4;
                    }
                }
                return o27Var;
            case 4:
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    q45 q45Var = bf3Var.p;
                    ee6 ee6Var2 = bf3Var.q;
                    this.Y = 1;
                    Object a2 = q45Var.A.a(new z6(new z6(ee6Var2, 19), 16), this);
                    if (a2 != p31Var5) {
                        a2 = o27Var;
                    }
                    if (a2 != p31Var5) {
                        a2 = o27Var;
                    }
                    if (a2 == p31Var5) {
                        return p31Var5;
                    }
                }
                return o27Var;
            default:
                p31 p31Var6 = p31.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    q45 q45Var2 = bf3Var.p;
                    ee6 ee6Var3 = bf3Var.s;
                    this.Y = 1;
                    Object a3 = q45Var2.A.a(new z6(new z6(ee6Var3, 20), 16), this);
                    if (a3 != p31Var6) {
                        a3 = o27Var;
                    }
                    if (a3 != p31Var6) {
                        a3 = o27Var;
                    }
                    if (a3 == p31Var6) {
                        return p31Var6;
                    }
                }
                return o27Var;
        }
    }
}
