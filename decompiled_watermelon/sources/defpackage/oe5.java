package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oe5  reason: default package */
/* loaded from: classes.dex */
public final class oe5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ se5 c0;
    public final /* synthetic */ rg5 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe5(se5 se5Var, rg5 rg5Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.c0 = se5Var;
        this.d0 = rg5Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((oe5) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((oe5) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((oe5) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        rg5 rg5Var = this.d0;
        se5 se5Var = this.c0;
        switch (i) {
            case 0:
                oe5 oe5Var = new oe5(se5Var, rg5Var, j11Var, 0);
                oe5Var.Z = obj;
                return oe5Var;
            case 1:
                oe5 oe5Var2 = new oe5(se5Var, rg5Var, j11Var, 1);
                oe5Var2.Z = obj;
                return oe5Var2;
            default:
                oe5 oe5Var3 = new oe5(se5Var, rg5Var, j11Var, 2);
                oe5Var3.Z = obj;
                return oe5Var3;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object kc5Var;
        Object kc5Var2;
        Object kc5Var3;
        int i = this.X;
        Object obj2 = qp1.A;
        se5 se5Var = this.c0;
        switch (i) {
            case 0:
                o31 o31Var = (o31) this.Z;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            me2.a0(obj);
                        } else {
                            i.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        me2.a0(obj);
                        rg5 rg5Var = this.d0;
                        this.Z = null;
                        this.Y = 1;
                        obj = se5Var.g(rg5Var, this);
                        if (obj == p31Var) {
                            return p31Var;
                        }
                    }
                    kc5Var = (Set) obj;
                } catch (Throwable th) {
                    kc5Var = new kc5(th);
                }
                if (nc5.a(kc5Var) == null) {
                    return kc5Var;
                }
                return up1.A;
            case 1:
                o31 o31Var2 = (o31) this.Z;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            me2.a0(obj);
                        } else {
                            i.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        me2.a0(obj);
                        this.Z = null;
                        this.Y = 1;
                        obj = se5Var.i(this);
                        if (obj == p31Var2) {
                            return p31Var2;
                        }
                    }
                    kc5Var2 = (Map) obj;
                } catch (Throwable th2) {
                    kc5Var2 = new kc5(th2);
                }
                if (nc5.a(kc5Var2) == null) {
                    obj2 = kc5Var2;
                }
                return obj2;
            default:
                o31 o31Var3 = (o31) this.Z;
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            me2.a0(obj);
                        } else {
                            i.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        me2.a0(obj);
                        this.Z = null;
                        this.Y = 1;
                        obj = se5Var.j(this);
                        if (obj == p31Var3) {
                            return p31Var3;
                        }
                    }
                    kc5Var3 = (Map) obj;
                } catch (Throwable th3) {
                    kc5Var3 = new kc5(th3);
                }
                if (nc5.a(kc5Var3) == null) {
                    obj2 = kc5Var3;
                }
                return obj2;
        }
    }
}
