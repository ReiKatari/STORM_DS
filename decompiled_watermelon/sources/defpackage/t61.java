package defpackage;

import android.net.Uri;
import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t61  reason: default package */
/* loaded from: classes.dex */
public final class t61 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ w61 Z;
    public final /* synthetic */ DSiWareTitle c0;
    public final /* synthetic */ m71 d0;
    public final /* synthetic */ Uri e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t61(w61 w61Var, DSiWareTitle dSiWareTitle, m71 m71Var, Uri uri, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = w61Var;
        this.c0 = dSiWareTitle;
        this.d0 = m71Var;
        this.e0 = uri;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((t61) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((t61) t(j11Var, o31Var)).v(o27Var);
            case 2:
                return ((t61) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((t61) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new t61(this.Z, this.c0, this.d0, this.e0, j11Var, 0);
            case 1:
                return new t61(this.Z, this.c0, this.d0, this.e0, j11Var, 1);
            case 2:
                return new t61(this.Z, this.c0, this.d0, this.e0, j11Var, 2);
            default:
                return new t61(this.Z, this.c0, this.d0, this.e0, j11Var, 3);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object g;
        Object j;
        int i = this.X;
        Uri uri = this.e0;
        DSiWareTitle dSiWareTitle = this.c0;
        w61 w61Var = this.Z;
        m71 m71Var = this.d0;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        g = obj;
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    qf qfVar = w61Var.b;
                    this.Y = 1;
                    g = qfVar.g(dSiWareTitle, m71Var, uri, this);
                    if (g == p31Var) {
                        return p31Var;
                    }
                }
                if (((Boolean) g).booleanValue()) {
                    w61Var.k.p(new rx2(m71Var.getFileName()));
                } else {
                    w61Var.k.p(qx2.a);
                }
                ee6 ee6Var = w61Var.g;
                Boolean bool = Boolean.FALSE;
                ee6Var.getClass();
                ee6Var.l(null, bool);
                return o27Var;
            case 1:
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
                bb1 bb1Var = tg1.a;
                t61 t61Var = new t61(this.Z, this.c0, this.d0, this.e0, null, 0);
                this.Y = 1;
                if (tq5.G(bb1Var, t61Var, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        j = obj;
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    qf qfVar2 = w61Var.b;
                    this.Y = 1;
                    j = qfVar2.j(dSiWareTitle, m71Var, uri, this);
                    if (j == p31Var3) {
                        return p31Var3;
                    }
                }
                if (((Boolean) j).booleanValue()) {
                    w61Var.k.p(new tx2(m71Var.getFileName()));
                } else {
                    w61Var.k.p(sx2.a);
                }
                ee6 ee6Var2 = w61Var.g;
                Boolean bool2 = Boolean.FALSE;
                ee6Var2.getClass();
                ee6Var2.l(null, bool2);
                return o27Var;
            default:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                bb1 bb1Var2 = tg1.a;
                t61 t61Var2 = new t61(this.Z, this.c0, this.d0, this.e0, null, 2);
                this.Y = 1;
                if (tq5.G(bb1Var2, t61Var2, this) == p31Var4) {
                    return p31Var4;
                }
                return o27Var;
        }
    }
}
