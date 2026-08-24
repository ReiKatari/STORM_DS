package defpackage;

import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rv1  reason: default package */
/* loaded from: classes.dex */
public final class rv1 extends fn2 {
    public boolean A;
    public boolean B;
    public boolean L = true;
    public final /* synthetic */ EmulatorActivity R;

    public rv1(EmulatorActivity emulatorActivity) {
        this.R = emulatorActivity;
    }

    @Override // defpackage.fn2
    public final void d() {
        RuntimeLayoutView runtimeLayoutView;
        int i = EmulatorActivity.Z1;
        EmulatorActivity emulatorActivity = this.R;
        emulatorActivity.W().getClass();
        boolean z = !this.A;
        this.A = z;
        s8 s8Var = emulatorActivity.B0;
        if (s8Var != null) {
            RuntimeLayoutView runtimeLayoutView2 = s8Var.m;
            nj3 nj3Var = nj3.BUTTON_FAST_FORWARD_TOGGLE;
            runtimeLayoutView2.h(nj3Var, z);
            c92 c92Var = emulatorActivity.K0;
            if (c92Var != null && (runtimeLayoutView = c92Var.L) != null) {
                runtimeLayoutView.h(nj3Var, this.A);
            }
            g();
            return;
        }
        nb3.a0("binding");
        throw null;
    }

    @Override // defpackage.fn2
    public final void e() {
        int i = EmulatorActivity.Z1;
        sz1 W = this.R.W();
        hy1 hy1Var = (hy1) W.p0.getValue();
        if (hy1Var instanceof dy1) {
            hv.L(W.z, null, null, new p02(W, (dy1) hy1Var, null, 1), 3);
        } else if (hy1Var instanceof cy1) {
            W.J0.k(r67.a);
        }
    }

    @Override // defpackage.fn2
    public final void f() {
        int i = EmulatorActivity.Z1;
        sz1 W = this.R.W();
        of6 of6Var = W.J0;
        if (!((ng6) W.c).b.getBoolean("enable_rewind", false)) {
            of6Var.k(t77.a);
        } else if (!W.w.b()) {
            of6Var.k(s77.a);
        } else {
            hv.L(W.z, null, null, new hz1(14, null, W), 3);
        }
    }

    public final void g() {
        boolean z;
        if (!this.A && !this.B) {
            z = false;
        } else {
            z = true;
        }
        MelonEmulator.a.setFastForwardEnabled(z);
    }
}
