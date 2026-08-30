package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tg7  reason: default package */
/* loaded from: classes.dex */
public final class tg7 implements dn3 {
    public final /* synthetic */ g11 A;
    public final /* synthetic */ im B;
    public final /* synthetic */ s55 L;
    public final /* synthetic */ n75 R;

    public tg7(g11 g11Var, im imVar, s55 s55Var, n75 n75Var) {
        this.A = g11Var;
        this.B = imVar;
        this.L = s55Var;
        this.R = n75Var;
    }

    @Override // defpackage.dn3
    public final void d(fn3 fn3Var, pm3 pm3Var) {
        boolean z;
        hh0 hh0Var = null;
        switch (sg7.a[pm3Var.ordinal()]) {
            case 1:
                tq5.w(this.A, null, s31.UNDISPATCHED, new qk5(this.R, this.L, fn3Var, this, null, 8), 1);
                return;
            case 2:
                im imVar = this.B;
                if (imVar != null) {
                    xf1 xf1Var = (xf1) imVar.L;
                    synchronized (xf1Var.L) {
                        try {
                            synchronized (xf1Var.L) {
                                z = xf1Var.A;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) xf1Var.B;
                                xf1Var.B = (ArrayList) xf1Var.R;
                                xf1Var.R = arrayList;
                                xf1Var.A = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((j11) arrayList.get(i)).k(o27.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                s55 s55Var = this.L;
                synchronized (s55Var.c) {
                    if (s55Var.t) {
                        s55Var.t = false;
                        hh0Var = s55Var.y();
                    }
                }
                if (hh0Var != null) {
                    ((ih0) hh0Var).k(o27.a);
                    return;
                }
                return;
            case 3:
                s55 s55Var2 = this.L;
                synchronized (s55Var2.c) {
                    s55Var2.t = true;
                }
                return;
            case 4:
                this.L.x();
                return;
            case 5:
            case ig7.b /* 6 */:
            case 7:
                return;
            default:
                i.c();
                return;
        }
    }
}
