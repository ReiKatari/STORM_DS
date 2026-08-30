package eh;

import ah.g0;
import ah.h1;
import ah.j0;
import cd.e1;
import hh.g1;
import hh.j1;
import hh.p1;
import hh.q1;
import kf.d2;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
import oe.a0;
import oe.s;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j implements k {
    @Override // eh.k
    public final void b(a0 a0Var) {
        a0Var.getClass();
    }

    @Override // eh.k
    public final void d(s sVar) {
        sVar.getClass();
    }

    @Override // eh.k
    public final void e(s sVar) {
        RuntimeLayoutView runtimeLayoutView;
        RuntimeLayoutView runtimeLayoutView2;
        RuntimeLayoutView runtimeLayoutView3;
        sVar.getClass();
        int i2 = i.f4491a[sVar.ordinal()];
        MelonEmulator melonEmulator = MelonEmulator.f9466a;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                int i10 = EmulatorActivity.f9503a1;
                ((ah.q) this).f809c.C().q(true);
                return;
            case 2:
                ah.q qVar = (ah.q) this;
                boolean z10 = !qVar.f807a;
                qVar.f807a = z10;
                EmulatorActivity emulatorActivity = qVar.f809c;
                d5.f fVar = emulatorActivity.f9504y0;
                if (fVar != null) {
                    ve.c cVar = ve.c.BUTTON_FAST_FORWARD_TOGGLE;
                    ((RuntimeLayoutView) fVar.f3846h).g(cVar, z10);
                    ih.f fVar2 = emulatorActivity.G0;
                    if (fVar2 != null && (runtimeLayoutView = fVar2.B) != null) {
                        runtimeLayoutView.g(cVar, qVar.f807a);
                    }
                    melonEmulator.setFastForwardEnabled(qVar.f807a);
                    return;
                }
                nc.k.f("binding");
                throw null;
            case 3:
                ah.q qVar2 = (ah.q) this;
                boolean z11 = !qVar2.f808b;
                qVar2.f808b = z11;
                EmulatorActivity emulatorActivity2 = qVar2.f809c;
                d5.f fVar3 = emulatorActivity2.f9504y0;
                if (fVar3 != null) {
                    ve.c cVar2 = ve.c.BUTTON_MICROPHONE_TOGGLE;
                    ((RuntimeLayoutView) fVar3.f3846h).g(cVar2, z11);
                    ih.f fVar4 = emulatorActivity2.G0;
                    if (fVar4 != null && (runtimeLayoutView2 = fVar4.B) != null) {
                        runtimeLayoutView2.g(cVar2, qVar2.f808b);
                    }
                    melonEmulator.setMicrophoneEnabled(qVar2.f808b);
                    return;
                }
                nc.k.f("binding");
                throw null;
            case 4:
                EmulatorActivity emulatorActivity3 = ((ah.q) this).f809c;
                d5.f fVar5 = emulatorActivity3.f9504y0;
                if (fVar5 != null) {
                    RuntimeLayoutView runtimeLayoutView4 = (RuntimeLayoutView) fVar5.f3846h;
                    boolean z12 = !runtimeLayoutView4.f9514g0;
                    runtimeLayoutView4.f9514g0 = z12;
                    ve.c cVar3 = ve.c.BUTTON_TOGGLE_SOFT_INPUT;
                    runtimeLayoutView4.g(cVar3, z12);
                    runtimeLayoutView4.j();
                    ih.f fVar6 = emulatorActivity3.G0;
                    if (fVar6 != null && (runtimeLayoutView3 = fVar6.B) != null) {
                        boolean z13 = !runtimeLayoutView3.f9514g0;
                        runtimeLayoutView3.f9514g0 = z13;
                        runtimeLayoutView3.g(cVar3, z13);
                        runtimeLayoutView3.j();
                        return;
                    }
                    return;
                }
                nc.k.f("binding");
                throw null;
            case l1.c.f8511g /* 5 */:
                int i11 = EmulatorActivity.f9503a1;
                ((ah.q) this).f809c.C().r();
                return;
            case l1.c.f8509e /* 6 */:
                EmulatorActivity emulatorActivity4 = ((ah.q) this).f809c;
                d5.f fVar7 = emulatorActivity4.f9504y0;
                if (fVar7 != null) {
                    RuntimeLayoutView runtimeLayoutView5 = (RuntimeLayoutView) fVar7.f3846h;
                    runtimeLayoutView5.f9515h0 = !runtimeLayoutView5.f9515h0;
                    runtimeLayoutView5.i();
                    ih.f fVar8 = emulatorActivity4.G0;
                    if (fVar8 != null) {
                        RuntimeLayoutView runtimeLayoutView6 = fVar8.B;
                        runtimeLayoutView6.f9515h0 = !runtimeLayoutView6.f9515h0;
                        runtimeLayoutView6.i();
                        fVar8.a();
                    }
                    emulatorActivity4.F();
                    return;
                }
                nc.k.f("binding");
                throw null;
            case 7:
                int i12 = EmulatorActivity.f9503a1;
                h1 C = ((ah.q) this).f809c.C();
                hh.o oVar = (hh.o) C.f777q.getValue();
                if (oVar instanceof hh.k) {
                    x.v(C.f775o, null, null, new j0(C, (hh.k) oVar, null, 1), 3);
                    return;
                } else if (oVar instanceof hh.j) {
                    C.J.p(hh.h1.f6531a);
                    return;
                } else {
                    return;
                }
            case 8:
                int i13 = EmulatorActivity.f9503a1;
                h1 C2 = ((ah.q) this).f809c.C();
                e1 e1Var = C2.J;
                hh.o oVar2 = (hh.o) C2.f777q.getValue();
                if (oVar2 instanceof hh.k) {
                    if (C2.m.a()) {
                        x.v(C2.f775o, null, null, new j0(C2, (hh.k) oVar2, null, 0), 3);
                        return;
                    } else {
                        e1Var.p(j1.f6536a);
                        return;
                    }
                } else if (oVar2 instanceof hh.j) {
                    e1Var.p(g1.f6528a);
                    return;
                } else {
                    return;
                }
            case l1.c.f8508d /* 9 */:
                int i14 = EmulatorActivity.f9503a1;
                h1 C3 = ((ah.q) this).f809c.C();
                e1 e1Var2 = C3.J;
                if (!((d2) C3.f763b).f8181b.getBoolean("enable_rewind", false)) {
                    e1Var2.p(q1.f6564a);
                    return;
                } else if (!C3.m.a()) {
                    e1Var2.p(p1.f6560a);
                    return;
                } else {
                    x.v(C3.f775o, null, null, new g0(C3, null, 1), 3);
                    return;
                }
            default:
                return;
        }
    }
}
