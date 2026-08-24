package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qj  reason: default package */
/* loaded from: classes.dex */
public final class qj extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qj(int i, Object obj, Object obj2) {
        super(1);
        this.B = i;
        this.R = obj;
        this.L = obj2;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        lf5 lf5Var;
        switch (this.B) {
            case 0:
                w61 w61Var = (w61) obj;
                return new v63((kt3) this.R, new pj((rj) this.L, 0));
            case 1:
                Throwable th = (Throwable) obj;
                v63 v63Var = (v63) this.R;
                synchronized (v63Var.c) {
                    try {
                        v63Var.e = true;
                        ua4 ua4Var = v63Var.d;
                        Object[] objArr = ua4Var.A;
                        int i = ua4Var.L;
                        for (int i2 = 0; i2 < i; i2++) {
                            gh4 gh4Var = (gh4) ((ss7) objArr[i2]).get();
                            if (gh4Var != null && (lf5Var = gh4Var.b) != null) {
                                lf5Var.closeConnection();
                                gh4Var.b = null;
                            }
                        }
                        v63Var.d.g();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                o37 o37Var = ((rj) this.L).B;
                o37Var.b.set(null);
                o37Var.a.c();
                return jg7.a;
            case 2:
                gl1 gl1Var = (gl1) obj;
                c05 c05Var = (c05) this.R;
                c05Var.setPositionProvider((f05) this.L);
                c05Var.q();
                return new vj(0);
            case 3:
                Throwable th3 = (Throwable) obj;
                sm smVar = (sm) this.R;
                tm tmVar = (tm) this.L;
                synchronized (smVar.X) {
                    smVar.Z.remove(tmVar);
                }
                return jg7.a;
            case 4:
                Throwable th4 = (Throwable) obj;
                ((Choreographer) ((um) this.R).B).removeFrameCallback((tm) this.L);
                return jg7.a;
            case 5:
                cx4 cx4Var = (cx4) obj;
                dx4 dx4Var = (dx4) this.R;
                float h = ((b41) this.L).c.h();
                cx4Var.getClass();
                cx4.b(cx4Var, dx4Var);
                dx4Var.h0(i93.c(0L, dx4Var.X), h, null);
                return jg7.a;
            case 6:
                cx4.o((cx4) obj, (dx4) this.R, 0, 0, ((d50) this.L).k0, 4);
                return jg7.a;
            case 7:
                cx4.o((cx4) obj, (dx4) this.R, 0, 0, ((ei6) this.L).w0, 4);
                return jg7.a;
            default:
                mx0 mx0Var = (mx0) obj;
                eo2 eo2Var = (eo2) this.L;
                xx7 xx7Var = (xx7) this.R;
                if (!xx7Var.L) {
                    hu3 hu3Var = mx0Var.c;
                    View view = mx0Var.a;
                    ut3 lifecycle = hu3Var.getLifecycle();
                    xx7Var.X = eo2Var;
                    if (xx7Var.R == null) {
                        if (!nb3.k(Looper.myLooper(), view.getHandler().getLooper())) {
                            view.post(new q64(14, xx7Var, lifecycle));
                        } else {
                            xx7Var.R = lifecycle;
                            lifecycle.a(xx7Var);
                        }
                    } else if (lifecycle.b().isAtLeast(tt3.CREATED)) {
                        xx7Var.B.A(new zv0(-1723985096, true, new jy0(xx7Var, mx0Var, eo2Var)));
                    }
                }
                return jg7.a;
        }
    }
}
