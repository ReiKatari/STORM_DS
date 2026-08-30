package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z90  reason: default package */
/* loaded from: classes.dex */
public final class z90 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ ca0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z90(ca0 ca0Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = ca0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((z90) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((z90) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((z90) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        ca0 ca0Var = this.Z;
        switch (i) {
            case 0:
                return new z90(ca0Var, j11Var, 0);
            case 1:
                return new z90(ca0Var, j11Var, 1);
            default:
                return new z90(ca0Var, j11Var, 2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, n75] */
    @Override // defpackage.m00
    public final Object v(Object obj) {
        nc7 nc7Var;
        qi0 qi0Var;
        Object obj2;
        switch (this.X) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i = this.Y;
                if (i != 0) {
                    if (i != 1) {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    me2.a0(obj);
                } else {
                    me2.a0(obj);
                    ca0 ca0Var = this.Z;
                    q45 q45Var = ca0Var.g.Z;
                    y90 y90Var = new y90(ca0Var, 0);
                    this.Y = 1;
                    if (q45Var.A.a(y90Var, this) == p31Var) {
                        return p31Var;
                    }
                }
                f81.c();
                return null;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    me2.a0(obj);
                } else {
                    me2.a0(obj);
                    ca0 ca0Var2 = this.Z;
                    o45 o45Var = ca0Var2.g.d0;
                    y90 y90Var2 = new y90(ca0Var2, 1);
                    this.Y = 1;
                    if (o45Var.A.a(y90Var2, this) == p31Var2) {
                        return p31Var2;
                    }
                }
                f81.c();
                return null;
            default:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
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
                    ca0 ca0Var3 = this.Z;
                    this.Y = 1;
                    ?? obj3 = new Object();
                    synchronized (ca0Var3.q) {
                        nc7Var = ca0Var3.y;
                        qi0Var = ca0Var3.z;
                        obj3.A = qi0Var;
                    }
                    if (nc7Var != null && qi0Var != null) {
                        obj2 = nc7Var.i.a(new r90(1, obj3, ca0Var3), this);
                        if (obj2 != p31Var3) {
                            obj2 = o27.a;
                        }
                    } else {
                        obj2 = o27.a;
                    }
                    if (obj2 == p31Var3) {
                        return p31Var3;
                    }
                }
                return o27.a;
        }
    }
}
