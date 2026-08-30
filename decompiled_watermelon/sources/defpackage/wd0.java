package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wd0  reason: default package */
/* loaded from: classes.dex */
public final class wd0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ xd0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd0(xd0 xd0Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = xd0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((wd0) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((wd0) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        xd0 xd0Var = this.Z;
        switch (i) {
            case 0:
                return new wd0(xd0Var, j11Var, 0);
            default:
                return new wd0(xd0Var, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i = this.Y;
                if (i != 0) {
                    if (i == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    jf0 jf0Var = this.Z.X;
                    rw rwVar = new rw(8);
                    synchronized (jf0Var.a) {
                        try {
                            if (!jf0Var.g) {
                                if (ve2.D("CXCP")) {
                                    Log.d("CXCP", "Camera is removed, forcing state to CLOSED.");
                                }
                                jf0Var.g = true;
                                ud0 ud0Var = ud0.CLOSED;
                                jf0Var.e = ud0Var;
                                jf0Var.f = rwVar;
                                jf0Var.c(ud0Var, rwVar);
                                jf0Var.d = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j57 j57Var = this.Z.A;
                    this.Y = 1;
                    if (j57Var.e(this) == p31Var) {
                        return p31Var;
                    }
                }
                return o27.a;
            default:
                xd0 xd0Var = this.Z;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
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
                    j57 j57Var2 = xd0Var.A;
                    this.Y = 1;
                    if (j57Var2.e(this) == p31Var2) {
                        return p31Var2;
                    }
                }
                iq2.f(xd0Var.R.a, null);
                return o27.a;
        }
    }
}
