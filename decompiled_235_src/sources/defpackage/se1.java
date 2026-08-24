package defpackage;

import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: se1  reason: default package */
/* loaded from: classes.dex */
public final class se1 implements fu3 {
    public final /* synthetic */ int A = 2;
    public final Object B;
    public final Object L;

    public se1(gu3 gu3Var) {
        this.B = gu3Var;
        fr0 fr0Var = fr0.c;
        Class<?> cls = gu3Var.getClass();
        dr0 dr0Var = (dr0) fr0Var.a.get(cls);
        this.L = dr0Var == null ? fr0Var.a(cls, null) : dr0Var;
    }

    @Override // defpackage.fu3
    public final void h(hu3 hu3Var, st3 st3Var) {
        int i = this.A;
        Object obj = this.B;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                qe1 qe1Var = (qe1) obj;
                switch (re1.a[st3Var.ordinal()]) {
                    case 1:
                        qe1Var.getClass();
                        break;
                    case 2:
                        qe1Var.onStart(hu3Var);
                        break;
                    case 3:
                        qe1Var.onResume(hu3Var);
                        break;
                    case 4:
                        qe1Var.getClass();
                        break;
                    case 5:
                        qe1Var.onStop(hu3Var);
                        break;
                    case 6:
                        qe1Var.onDestroy(hu3Var);
                        break;
                    case 7:
                        i.h("ON_ANY must not been send by anybody");
                        return;
                    default:
                        i.d();
                        return;
                }
                fu3 fu3Var = (fu3) obj2;
                if (fu3Var != null) {
                    fu3Var.h(hu3Var, st3Var);
                    return;
                }
                return;
            case 1:
                if (st3Var == st3.ON_START) {
                    ((ut3) obj).c(this);
                    ((d56) obj2).d();
                    return;
                }
                return;
            case 2:
                cl4 cl4Var = (cl4) obj;
                int i2 = hl4.a[st3Var.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            cl4Var.e();
                            ((ut3) obj2).c(this);
                            return;
                        }
                        return;
                    }
                    cl4Var.g(false);
                    return;
                }
                cl4Var.g(true);
                return;
            default:
                HashMap hashMap = ((dr0) obj2).a;
                dr0.a((List) hashMap.get(st3Var), hu3Var, st3Var, obj);
                dr0.a((List) hashMap.get(st3.ON_ANY), hu3Var, st3Var, obj);
                return;
        }
    }

    public se1(qe1 qe1Var, fu3 fu3Var) {
        qe1Var.getClass();
        this.B = qe1Var;
        this.L = fu3Var;
    }

    public se1(ut3 ut3Var, d56 d56Var) {
        this.B = ut3Var;
        this.L = d56Var;
    }

    public se1(cl4 cl4Var, il4 il4Var, ut3 ut3Var) {
        this.B = cl4Var;
        this.L = ut3Var;
    }
}
