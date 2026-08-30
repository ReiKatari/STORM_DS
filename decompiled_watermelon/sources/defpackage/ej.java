package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ej  reason: default package */
/* loaded from: classes.dex */
public final class ej extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ej(int i, Object obj, Object obj2) {
        super(1);
        this.B = i;
        this.R = obj;
        this.L = obj2;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        v55 v55Var;
        switch (this.B) {
            case 0:
                o31 o31Var = (o31) obj;
                return new r03((im3) this.R, new dj(0, (fj) this.L));
            case 1:
                Throwable th = (Throwable) obj;
                r03 r03Var = (r03) this.R;
                synchronized (r03Var.c) {
                    try {
                        r03Var.e = true;
                        o24 o24Var = r03Var.d;
                        Object[] objArr = o24Var.A;
                        int i = o24Var.L;
                        for (int i2 = 0; i2 < i; i2++) {
                            o84 o84Var = (o84) ((vd7) objArr[i2]).get();
                            if (o84Var != null && (v55Var = o84Var.b) != null) {
                                v55Var.closeConnection();
                                o84Var.b = null;
                            }
                        }
                        r03Var.d.h();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                zq6 zq6Var = ((fj) this.L).B;
                zq6Var.b.set(null);
                zq6Var.a.g();
                return o27.a;
            case 2:
                ch1 ch1Var = (ch1) obj;
                yq4 yq4Var = (yq4) this.R;
                yq4Var.setPositionProvider((cr4) this.L);
                yq4Var.q();
                return new jj(0);
            case 3:
                Throwable th3 = (Throwable) obj;
                gm gmVar = (gm) this.R;
                hm hmVar = (hm) this.L;
                synchronized (gmVar.X) {
                    gmVar.Z.remove(hmVar);
                }
                return o27.a;
            case 4:
                Throwable th4 = (Throwable) obj;
                ((Choreographer) ((im) this.R).B).removeFrameCallback((hm) this.L);
                return o27.a;
            case 5:
                xn4 xn4Var = (xn4) obj;
                yn4 yn4Var = (yn4) this.R;
                float h = ((u01) this.L).c.h();
                xn4Var.getClass();
                xn4.a(xn4Var, yn4Var);
                yn4Var.o0(a33.c(0L, yn4Var.X), h, null);
                return o27.a;
            case ig7.b /* 6 */:
                xn4.r((xn4) obj, (yn4) this.R, 0, 0, ((f30) this.L).j0, 4);
                return o27.a;
            case 7:
                xn4.r((xn4) obj, (yn4) this.R, 0, 0, ((o66) this.L).t0, 4);
                return o27.a;
            default:
                qu0 qu0Var = (qu0) obj;
                aj2 aj2Var = (aj2) this.L;
                aj7 aj7Var = (aj7) this.R;
                if (!aj7Var.L) {
                    fn3 fn3Var = qu0Var.c;
                    View view = qu0Var.a;
                    rm3 lifecycle = fn3Var.getLifecycle();
                    aj7Var.X = aj2Var;
                    if (aj7Var.R == null) {
                        if (!b53.x(Looper.myLooper(), view.getHandler().getLooper())) {
                            view.post(new xc4(12, aj7Var, lifecycle));
                        } else {
                            aj7Var.R = lifecycle;
                            lifecycle.a(aj7Var);
                        }
                    } else if (lifecycle.b().isAtLeast(qm3.CREATED)) {
                        aj7Var.B.A(new et0(-1723985096, true, new nv0(aj7Var, qu0Var, aj2Var)));
                    }
                }
                return o27.a;
        }
    }
}
