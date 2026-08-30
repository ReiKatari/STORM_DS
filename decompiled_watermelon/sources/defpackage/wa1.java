package defpackage;

import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wa1  reason: default package */
/* loaded from: classes.dex */
public final class wa1 implements dn3 {
    public final /* synthetic */ int A = 2;
    public final Object B;
    public final Object L;

    public wa1(en3 en3Var) {
        this.B = en3Var;
        vo0 vo0Var = vo0.c;
        Class<?> cls = en3Var.getClass();
        to0 to0Var = (to0) vo0Var.a.get(cls);
        this.L = to0Var == null ? vo0Var.a(cls, null) : to0Var;
    }

    @Override // defpackage.dn3
    public final void d(fn3 fn3Var, pm3 pm3Var) {
        int i = this.A;
        Object obj = this.B;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                ua1 ua1Var = (ua1) obj;
                switch (va1.a[pm3Var.ordinal()]) {
                    case 1:
                        ua1Var.getClass();
                        break;
                    case 2:
                        ua1Var.onStart(fn3Var);
                        break;
                    case 3:
                        ua1Var.onResume(fn3Var);
                        break;
                    case 4:
                        ua1Var.getClass();
                        break;
                    case 5:
                        ua1Var.onStop(fn3Var);
                        break;
                    case ig7.b /* 6 */:
                        ua1Var.onDestroy(fn3Var);
                        break;
                    case 7:
                        i.i("ON_ANY must not been send by anybody");
                        return;
                    default:
                        i.c();
                        return;
                }
                dn3 dn3Var = (dn3) obj2;
                if (dn3Var != null) {
                    dn3Var.d(fn3Var, pm3Var);
                    return;
                }
                return;
            case 1:
                if (pm3Var == pm3.ON_START) {
                    ((rm3) obj).c(this);
                    ((xt5) obj2).d();
                    return;
                }
                return;
            case 2:
                ec4 ec4Var = (ec4) obj;
                int i2 = jc4.a[pm3Var.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ec4Var.e();
                            ((rm3) obj2).c(this);
                            return;
                        }
                        return;
                    }
                    ec4Var.g(false);
                    return;
                }
                ec4Var.g(true);
                return;
            default:
                HashMap hashMap = ((to0) obj2).a;
                to0.a((List) hashMap.get(pm3Var), fn3Var, pm3Var, obj);
                to0.a((List) hashMap.get(pm3.ON_ANY), fn3Var, pm3Var, obj);
                return;
        }
    }

    public wa1(ua1 ua1Var, dn3 dn3Var) {
        ua1Var.getClass();
        this.B = ua1Var;
        this.L = dn3Var;
    }

    public wa1(rm3 rm3Var, xt5 xt5Var) {
        this.B = rm3Var;
        this.L = xt5Var;
    }

    public wa1(ec4 ec4Var, kc4 kc4Var, rm3 rm3Var) {
        this.B = ec4Var;
        this.L = rm3Var;
    }
}
