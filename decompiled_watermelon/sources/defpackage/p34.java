package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p34  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class p34 implements dn3 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ p34(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.dn3
    public final void d(fn3 fn3Var, pm3 pm3Var) {
        int i = this.A;
        int i2 = 0;
        Object obj = this.B;
        switch (i) {
            case 0:
                s34 s34Var = (s34) obj;
                s34Var.q = pm3Var.getTargetState();
                if (s34Var.c != null) {
                    ArrayList p1 = tq0.p1(s34Var.f);
                    int size = p1.size();
                    while (i2 < size) {
                        Object obj2 = p1.get(i2);
                        i2++;
                        l34 l34Var = (l34) obj2;
                        l34Var.getClass();
                        qg1 qg1Var = l34Var.c0;
                        qg1Var.getClass();
                        qm3 targetState = pm3Var.getTargetState();
                        targetState.getClass();
                        ((l34) qg1Var.c).R = targetState;
                        qg1Var.f = pm3Var.getTargetState();
                        qg1Var.f();
                    }
                    return;
                }
                return;
            case 1:
                zt5 zt5Var = (zt5) obj;
                if (pm3Var == pm3.ON_START) {
                    zt5Var.h = true;
                    return;
                } else if (pm3Var == pm3.ON_STOP) {
                    zt5Var.h = false;
                    return;
                } else {
                    return;
                }
            default:
                o0 o0Var = (o0) obj;
                if (pm3Var == pm3.ON_DESTROY) {
                    o0Var.e();
                    return;
                }
                return;
        }
    }
}
