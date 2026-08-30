package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: re5  reason: default package */
/* loaded from: classes.dex */
public final class re5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ al5 Z;
    public final /* synthetic */ String c0;
    public final /* synthetic */ String d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re5(al5 al5Var, String str, String str2, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = al5Var;
        this.c0 = str;
        this.d0 = str2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((re5) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((re5) t(j11Var, o31Var)).v(o27Var);
            case 2:
                return ((re5) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((re5) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new re5(this.Z, this.c0, this.d0, j11Var, 0);
            case 1:
                return new re5(this.Z, this.c0, this.d0, j11Var, 1);
            case 2:
                return new re5(this.Z, this.c0, this.d0, j11Var, 2);
            default:
                return new re5(this.Z, this.c0, this.d0, j11Var, 3);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object v;
        Object e;
        int i = this.X;
        String str = this.d0;
        String str2 = this.c0;
        al5 al5Var = this.Z;
        boolean z = true;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        v = ((nc5) obj).A;
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    ud5 ud5Var = al5Var.b;
                    this.Y = 1;
                    v = ((dl) ud5Var).v(str2, str, this);
                    if (v == p31Var) {
                        return p31Var;
                    }
                }
                if (!(v instanceof kc5)) {
                    al5Var.m();
                } else {
                    ee6 ee6Var = al5Var.d;
                    ee6Var.getClass();
                    ee6Var.l(null, np5.a);
                }
                return o27.a;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                boolean z2 = false;
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
                        fb4 fb4Var = al5Var.k;
                        this.Y = 1;
                        obj = fb4Var.b(str2, str, this);
                        if (obj == p31Var2) {
                            return p31Var2;
                        }
                    }
                    if (obj == null) {
                        z = false;
                    }
                    z2 = z;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception unused) {
                }
                return Boolean.valueOf(z2);
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                ra4 ra4Var = al5Var.j;
                this.Y = 1;
                Object g = ra4Var.g(str2, str, this);
                if (g == p31Var3) {
                    return p31Var3;
                }
                return g;
            default:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        me2.a0(obj);
                        e = ((nc5) obj).A;
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    g96 g96Var = al5Var.l;
                    this.Y = 1;
                    e = g96Var.e(str2, str, this);
                    if (e == p31Var4) {
                        return p31Var4;
                    }
                }
                return new nc5(e);
        }
    }
}
