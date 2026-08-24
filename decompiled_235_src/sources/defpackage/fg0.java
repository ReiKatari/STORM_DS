package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fg0  reason: default package */
/* loaded from: classes.dex */
public final class fg0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ gg0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg0(gg0 gg0Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = gg0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((fg0) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((fg0) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        gg0 gg0Var = this.Z;
        switch (i) {
            case 0:
                return new fg0(gg0Var, r41Var, 0);
            default:
                return new fg0(gg0Var, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        switch (this.X) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i = this.Y;
                if (i != 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    sh0 sh0Var = this.Z.X;
                    tx txVar = new tx(8);
                    synchronized (sh0Var.a) {
                        try {
                            if (!sh0Var.g) {
                                if (kj2.F("CXCP")) {
                                    Log.d("CXCP", "Camera is removed, forcing state to CLOSED.");
                                }
                                sh0Var.g = true;
                                dg0 dg0Var = dg0.CLOSED;
                                sh0Var.e = dg0Var;
                                sh0Var.f = txVar;
                                sh0Var.c(dg0Var, txVar);
                                sh0Var.d = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    gj7 gj7Var = this.Z.A;
                    this.Y = 1;
                    if (gj7Var.e(this) == x61Var) {
                        return x61Var;
                    }
                }
                return jg7.a;
            default:
                gg0 gg0Var = this.Z;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    gj7 gj7Var2 = gg0Var.A;
                    this.Y = 1;
                    if (gj7Var2.e(this) == x61Var2) {
                        return x61Var2;
                    }
                }
                g04.x(gg0Var.R.a, null);
                return jg7.a;
        }
    }
}
