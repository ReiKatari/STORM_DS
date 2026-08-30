package defpackage;

import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fi2  reason: default package */
/* loaded from: classes.dex */
public abstract class fi2 implements qu2 {
    @Override // defpackage.qu2
    public final void a(ip4 ip4Var) {
        ip4Var.getClass();
    }

    @Override // defpackage.qu2
    public final void b(yz2 yz2Var) {
        yz2Var.getClass();
        if (ei2.a[yz2Var.ordinal()] == 3) {
            fr1 fr1Var = (fr1) this;
            if (fr1Var.B) {
                fr1Var.B = false;
                fr1Var.d();
            }
        }
    }

    @Override // defpackage.qu2
    public final void c(yz2 yz2Var) {
        RuntimeLayoutView runtimeLayoutView;
        RuntimeLayoutView runtimeLayoutView2;
        RuntimeLayoutView runtimeLayoutView3;
        yz2Var.getClass();
        switch (ei2.a[yz2Var.ordinal()]) {
            case 1:
                int i = EmulatorActivity.P1;
                ((fr1) this).R.U().O0(true);
                return;
            case 2:
                fr1 fr1Var = (fr1) this;
                int i2 = EmulatorActivity.P1;
                EmulatorActivity emulatorActivity = fr1Var.R;
                emulatorActivity.U().getClass();
                boolean z = !fr1Var.A;
                fr1Var.A = z;
                r8 r8Var = emulatorActivity.A0;
                if (r8Var != null) {
                    vc3 vc3Var = vc3.BUTTON_FAST_FORWARD_TOGGLE;
                    ((RuntimeLayoutView) r8Var.k).g(vc3Var, z);
                    k42 k42Var = emulatorActivity.J0;
                    if (k42Var != null && (runtimeLayoutView = k42Var.L) != null) {
                        runtimeLayoutView.g(vc3Var, fr1Var.A);
                    }
                    fr1Var.d();
                    return;
                }
                b53.g0("binding");
                throw null;
            case 3:
                fr1 fr1Var2 = (fr1) this;
                if (!fr1Var2.B) {
                    int i3 = EmulatorActivity.P1;
                    fr1Var2.R.U().getClass();
                    fr1Var2.B = true;
                    fr1Var2.d();
                    return;
                }
                return;
            case 4:
                fr1 fr1Var3 = (fr1) this;
                boolean z2 = !fr1Var3.L;
                fr1Var3.L = z2;
                EmulatorActivity emulatorActivity2 = fr1Var3.R;
                r8 r8Var2 = emulatorActivity2.A0;
                if (r8Var2 != null) {
                    vc3 vc3Var2 = vc3.BUTTON_MICROPHONE_TOGGLE;
                    ((RuntimeLayoutView) r8Var2.k).g(vc3Var2, z2);
                    k42 k42Var2 = emulatorActivity2.J0;
                    if (k42Var2 != null && (runtimeLayoutView2 = k42Var2.L) != null) {
                        runtimeLayoutView2.g(vc3Var2, fr1Var3.L);
                    }
                    MelonEmulator.a.setMicrophoneEnabled(fr1Var3.L);
                    return;
                }
                b53.g0("binding");
                throw null;
            case 5:
                EmulatorActivity emulatorActivity3 = ((fr1) this).R;
                r8 r8Var3 = emulatorActivity3.A0;
                if (r8Var3 != null) {
                    RuntimeLayoutView runtimeLayoutView4 = (RuntimeLayoutView) r8Var3.k;
                    boolean z3 = !runtimeLayoutView4.h0;
                    runtimeLayoutView4.h0 = z3;
                    vc3 vc3Var3 = vc3.BUTTON_TOGGLE_SOFT_INPUT;
                    runtimeLayoutView4.g(vc3Var3, z3);
                    runtimeLayoutView4.j();
                    k42 k42Var3 = emulatorActivity3.J0;
                    if (k42Var3 != null && (runtimeLayoutView3 = k42Var3.L) != null) {
                        boolean z4 = !runtimeLayoutView3.h0;
                        runtimeLayoutView3.h0 = z4;
                        runtimeLayoutView3.g(vc3Var3, z4);
                        runtimeLayoutView3.j();
                        return;
                    }
                    return;
                }
                b53.g0("binding");
                throw null;
            case ig7.b /* 6 */:
                int i4 = EmulatorActivity.P1;
                ((fr1) this).R.U().U0();
                return;
            case 7:
                EmulatorActivity emulatorActivity4 = ((fr1) this).R;
                r8 r8Var4 = emulatorActivity4.A0;
                if (r8Var4 != null) {
                    RuntimeLayoutView runtimeLayoutView5 = (RuntimeLayoutView) r8Var4.k;
                    runtimeLayoutView5.i0 = !runtimeLayoutView5.i0;
                    runtimeLayoutView5.i();
                    k42 k42Var4 = emulatorActivity4.J0;
                    if (k42Var4 != null) {
                        RuntimeLayoutView runtimeLayoutView6 = k42Var4.L;
                        runtimeLayoutView6.i0 = !runtimeLayoutView6.i0;
                        runtimeLayoutView6.i();
                        k42Var4.b();
                    }
                    emulatorActivity4.Q0();
                    emulatorActivity4.m0();
                    return;
                }
                b53.g0("binding");
                throw null;
            case 8:
                int i5 = EmulatorActivity.P1;
                hv1 U = ((fr1) this).R.U();
                wt1 wt1Var = (wt1) U.p0.getValue();
                if (wt1Var instanceof st1) {
                    tq5.w(U.z, null, null, new ew1(U, (st1) wt1Var, null, 1), 3);
                    return;
                } else if (wt1Var instanceof rt1) {
                    U.J0.p(au6.a);
                    return;
                } else {
                    return;
                }
            case 9:
                int i6 = EmulatorActivity.P1;
                hv1 U2 = ((fr1) this).R.U();
                c46 c46Var = U2.J0;
                wt1 wt1Var2 = (wt1) U2.p0.getValue();
                if (wt1Var2 instanceof st1) {
                    if (U2.w.b()) {
                        tq5.w(U2.z, null, null, new ew1(U2, (st1) wt1Var2, null, 0), 3);
                        return;
                    } else {
                        c46Var.p(yt6.a);
                        return;
                    }
                } else if (wt1Var2 instanceof rt1) {
                    c46Var.p(zt6.a);
                    return;
                } else {
                    return;
                }
            case 10:
                int i7 = EmulatorActivity.P1;
                hv1 U3 = ((fr1) this).R.U();
                c46 c46Var2 = U3.J0;
                if (!((b56) U3.c).b.getBoolean("enable_rewind", false)) {
                    c46Var2.p(cv6.a);
                    return;
                } else if (!U3.w.b()) {
                    c46Var2.p(bv6.a);
                    return;
                } else {
                    tq5.w(U3.z, null, null, new wu1(13, null, U3), 3);
                    return;
                }
            default:
                return;
        }
    }
}
