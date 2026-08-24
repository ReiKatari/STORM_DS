package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g00  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g00 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;

    public /* synthetic */ g00(Object obj, boolean z, int i) {
        this.A = i;
        this.L = obj;
        this.B = z;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        boolean z = this.B;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                pw0 pw0Var = (pw0) obj2;
                ((d00) pw0Var.a).f(z);
                ((c00) pw0Var.b).f(z);
                return new i00((ou3) obj, pw0Var, 0);
            case 1:
                cv7 cv7Var = (cv7) obj2;
                ((gl1) obj).getClass();
                boolean b = cv7Var.a.b();
                cv7Var.a(!z);
                return new tn0(cv7Var, b);
            case 2:
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj2;
                c46 c46Var = (c46) obj;
                if (z) {
                    int i2 = EmulatorActivity.Z1;
                    sz1 W = emulatorActivity.W();
                    W.getClass();
                    c46Var.getClass();
                    hv.L(W.z, null, null, new z22(W, c46Var, null), 3);
                } else {
                    int i3 = EmulatorActivity.Z1;
                    sz1 W2 = emulatorActivity.W();
                    of6 of6Var = W2.J0;
                    c46Var.getClass();
                    if (!W2.w.b()) {
                        of6Var.k(p67.a);
                    } else if (!c46Var.b) {
                        of6Var.k(w77.a);
                    } else {
                        hv.L(W2.z, null, null, new m7(W2, c46Var, (r41) null, 2), 3);
                    }
                }
                return jg7Var;
            case 3:
                nh2 nh2Var = (nh2) obj2;
                fh2 fh2Var = (fh2) obj;
                fh2Var.getClass();
                if (!z) {
                    nh2Var = nh2.b;
                }
                fh2Var.d(nh2Var);
                return jg7Var;
            default:
                ax0 ax0Var = (ax0) obj2;
                ax0Var.s(z);
                return new i00((ou3) obj, ax0Var, 1);
        }
    }

    public /* synthetic */ g00(boolean z, Object obj, int i) {
        this.A = i;
        this.B = z;
        this.L = obj;
    }
}
