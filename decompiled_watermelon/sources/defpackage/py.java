package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: py  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class py implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;

    public /* synthetic */ py(Object obj, boolean z, int i) {
        this.A = i;
        this.L = obj;
        this.B = z;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z = this.B;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                tt0 tt0Var = (tt0) obj2;
                ((my) tt0Var.a).f(z);
                ((ly) tt0Var.b).f(z);
                return new ry((mn3) obj, tt0Var, 0);
            case 1:
                cg7 cg7Var = (cg7) obj2;
                ((ch1) obj).getClass();
                boolean c = cg7Var.a.c();
                cg7Var.a(!z);
                return new ll0(cg7Var, c);
            case 2:
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj2;
                ft5 ft5Var = (ft5) obj;
                if (z) {
                    int i2 = EmulatorActivity.P1;
                    hv1 U = emulatorActivity.U();
                    U.getClass();
                    ft5Var.getClass();
                    tq5.w(U.z, null, null, new py1(U, ft5Var, null), 3);
                } else {
                    int i3 = EmulatorActivity.P1;
                    hv1 U2 = emulatorActivity.U();
                    c46 c46Var = U2.J0;
                    ft5Var.getClass();
                    if (!U2.w.b()) {
                        c46Var.p(yt6.a);
                    } else if (!ft5Var.b) {
                        c46Var.p(fv6.a);
                    } else {
                        tq5.w(U2.z, null, null, new l7(U2, ft5Var, null), 3);
                    }
                }
                return o27Var;
            case 3:
                wc2 wc2Var = (wc2) obj2;
                oc2 oc2Var = (oc2) obj;
                oc2Var.getClass();
                if (!z) {
                    wc2Var = wc2.b;
                }
                oc2Var.a(wc2Var);
                return o27Var;
            default:
                eu0 eu0Var = (eu0) obj2;
                eu0Var.s(z);
                return new ry((mn3) obj, eu0Var, 1);
        }
    }

    public /* synthetic */ py(boolean z, Object obj, int i) {
        this.A = i;
        this.B = z;
        this.L = obj;
    }
}
