package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wb4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wb4 implements fu3 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ wb4(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.fu3
    public final void h(hu3 hu3Var, st3 st3Var) {
        int i = this.A;
        int i2 = 0;
        Object obj = this.B;
        switch (i) {
            case 0:
                zb4 zb4Var = (zb4) obj;
                zb4Var.q = st3Var.getTargetState();
                if (zb4Var.c != null) {
                    ArrayList m1 = gt0.m1(zb4Var.f);
                    int size = m1.size();
                    while (i2 < size) {
                        Object obj2 = m1.get(i2);
                        i2++;
                        sb4 sb4Var = (sb4) obj2;
                        sb4Var.getClass();
                        uk1 uk1Var = sb4Var.d0;
                        uk1Var.getClass();
                        tt3 targetState = st3Var.getTargetState();
                        targetState.getClass();
                        ((sb4) uk1Var.c).R = targetState;
                        uk1Var.f = st3Var.getTargetState();
                        uk1Var.f();
                    }
                    return;
                }
                return;
            case 1:
                f56 f56Var = (f56) obj;
                if (st3Var == st3.ON_START) {
                    f56Var.h = true;
                    return;
                } else if (st3Var == st3.ON_STOP) {
                    f56Var.h = false;
                    return;
                } else {
                    return;
                }
            default:
                p0 p0Var = (p0) obj;
                if (st3Var == st3.ON_DESTROY) {
                    p0Var.e();
                    return;
                }
                return;
        }
    }
}
