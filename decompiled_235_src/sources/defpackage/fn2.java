package defpackage;

import android.view.View;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fn2  reason: default package */
/* loaded from: classes.dex */
public abstract class fn2 implements s03 {
    @Override // defpackage.s03
    public final void a(my4 my4Var) {
        my4Var.getClass();
    }

    @Override // defpackage.s03
    public final void b(b63 b63Var) {
        b63Var.getClass();
        if (en2.a[b63Var.ordinal()] == 3) {
            rv1 rv1Var = (rv1) this;
            if (rv1Var.B) {
                rv1Var.B = false;
                rv1Var.g();
            }
        }
    }

    @Override // defpackage.s03
    public final void c(b63 b63Var) {
        RuntimeLayoutView runtimeLayoutView;
        RuntimeLayoutView runtimeLayoutView2;
        b63Var.getClass();
        switch (en2.a[b63Var.ordinal()]) {
            case 1:
                int i = EmulatorActivity.Z1;
                ((rv1) this).R.W().M0(true);
                return;
            case 2:
                d();
                return;
            case 3:
                rv1 rv1Var = (rv1) this;
                if (!rv1Var.B) {
                    int i2 = EmulatorActivity.Z1;
                    rv1Var.R.W().getClass();
                    rv1Var.B = true;
                    rv1Var.g();
                    return;
                }
                return;
            case 4:
                rv1 rv1Var2 = (rv1) this;
                boolean z = !rv1Var2.L;
                rv1Var2.L = z;
                EmulatorActivity emulatorActivity = rv1Var2.R;
                s8 s8Var = emulatorActivity.B0;
                if (s8Var != null) {
                    RuntimeLayoutView runtimeLayoutView3 = s8Var.m;
                    nj3 nj3Var = nj3.BUTTON_MICROPHONE_TOGGLE;
                    runtimeLayoutView3.h(nj3Var, z);
                    c92 c92Var = emulatorActivity.K0;
                    if (c92Var != null && (runtimeLayoutView = c92Var.L) != null) {
                        runtimeLayoutView.h(nj3Var, rv1Var2.L);
                    }
                    MelonEmulator.a.setMicrophoneEnabled(rv1Var2.L);
                    return;
                }
                nb3.a0("binding");
                throw null;
            case 5:
                EmulatorActivity emulatorActivity2 = ((rv1) this).R;
                s8 s8Var2 = emulatorActivity2.B0;
                if (s8Var2 != null) {
                    RuntimeLayoutView runtimeLayoutView4 = s8Var2.m;
                    boolean z2 = !runtimeLayoutView4.i0;
                    runtimeLayoutView4.i0 = z2;
                    nj3 nj3Var2 = nj3.BUTTON_TOGGLE_SOFT_INPUT;
                    runtimeLayoutView4.h(nj3Var2, z2);
                    runtimeLayoutView4.k();
                    c92 c92Var2 = emulatorActivity2.K0;
                    if (c92Var2 != null && (runtimeLayoutView2 = c92Var2.L) != null) {
                        boolean z3 = !runtimeLayoutView2.i0;
                        runtimeLayoutView2.i0 = z3;
                        runtimeLayoutView2.h(nj3Var2, z3);
                        runtimeLayoutView2.k();
                        return;
                    }
                    return;
                }
                nb3.a0("binding");
                throw null;
            case 6:
                int i3 = EmulatorActivity.Z1;
                ((rv1) this).R.W().S0();
                return;
            case 7:
                EmulatorActivity emulatorActivity3 = ((rv1) this).R;
                s8 s8Var3 = emulatorActivity3.B0;
                if (s8Var3 != null) {
                    RuntimeLayoutView runtimeLayoutView5 = s8Var3.m;
                    runtimeLayoutView5.j0 = !runtimeLayoutView5.j0;
                    runtimeLayoutView5.j();
                    c92 c92Var3 = emulatorActivity3.K0;
                    if (c92Var3 != null) {
                        RuntimeLayoutView runtimeLayoutView6 = c92Var3.L;
                        runtimeLayoutView6.j0 = !runtimeLayoutView6.j0;
                        runtimeLayoutView6.j();
                        c92Var3.b();
                    }
                    emulatorActivity3.U0();
                    emulatorActivity3.o0();
                    return;
                }
                nb3.a0("binding");
                throw null;
            case 8:
                e();
                return;
            case 9:
                int i4 = EmulatorActivity.Z1;
                sz1 W = ((rv1) this).R.W();
                of6 of6Var = W.J0;
                hy1 hy1Var = (hy1) W.p0.getValue();
                if (hy1Var instanceof dy1) {
                    if (W.w.b()) {
                        hv.L(W.z, null, null, new p02(W, (dy1) hy1Var, null, 0), 3);
                        return;
                    } else {
                        of6Var.k(p67.a);
                        return;
                    }
                } else if (hy1Var instanceof cy1) {
                    of6Var.k(q67.a);
                    return;
                } else {
                    return;
                }
            case 10:
                f();
                return;
            case 11:
                int i5 = EmulatorActivity.Z1;
                ((rv1) this).R.V().j(false);
                return;
            case 12:
                s8 s8Var4 = ((rv1) this).R.B0;
                if (s8Var4 != null) {
                    RuntimeLayoutView runtimeLayoutView7 = s8Var4.m;
                    runtimeLayoutView7.l0 = !runtimeLayoutView7.l0;
                    for (zj3 zj3Var : runtimeLayoutView7.getLayoutComponentViews()) {
                        nj3 nj3Var3 = zj3Var.b;
                        View view = zj3Var.a;
                        int i6 = 8;
                        if (nj3Var3 == nj3.BUTTON_TRANSLATE) {
                            view.setVisibility(8);
                        } else if (nj3Var3 != nj3.DPAD && nj3Var3 != nj3.BUTTONS && nj3Var3 != nj3.BUTTON_L && nj3Var3 != nj3.BUTTON_R && nj3Var3 != nj3.BUTTON_START && nj3Var3 != nj3.BUTTON_SELECT && nj3Var3 != nj3.BUTTON_TOGGLE_EXTRA_BUTTONS && !nj3Var3.isScreen()) {
                            if (runtimeLayoutView7.l0) {
                                i6 = 0;
                            }
                            view.setVisibility(i6);
                        }
                    }
                    runtimeLayoutView7.h(nj3.BUTTON_TOGGLE_EXTRA_BUTTONS, runtimeLayoutView7.l0);
                    return;
                }
                nb3.a0("binding");
                throw null;
            default:
                return;
        }
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();
}
