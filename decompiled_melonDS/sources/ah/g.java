package ah;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ g(EmulatorActivity emulatorActivity, int i2) {
        this.A = i2;
        this.B = emulatorActivity;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        int i2 = this.A;
        yb.y yVar = yb.y.f14813a;
        EmulatorActivity emulatorActivity = this.B;
        n2.m mVar = (n2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                int i10 = EmulatorActivity.f9503a1;
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    ij.a.u(false, v2.h.c(338501151, new g(emulatorActivity, 1), rVar), rVar, 48, 1);
                } else {
                    rVar.R();
                }
                return yVar;
            default:
                int i11 = EmulatorActivity.f9503a1;
                if ((intValue & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar;
                if (rVar2.O(intValue & 1, z11)) {
                    nc.e a10 = nc.u.a(e0.class);
                    b9.e eVar = new b9.e(emulatorActivity.getViewModelStore(), emulatorActivity.getDefaultViewModelProviderFactory(), emulatorActivity.getDefaultViewModelCreationExtras());
                    String b10 = a10.b();
                    if (b10 != null) {
                        e0 e0Var = (e0) eVar.B("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), a10);
                        boolean h2 = rVar2.h(emulatorActivity) | rVar2.h(e0Var);
                        Object L = rVar2.L();
                        n2.e eVar2 = n2.l.f9953a;
                        if (h2 || L == eVar2) {
                            L = new a5.o(emulatorActivity, e0Var, null, 1);
                            rVar2.h0(L);
                        }
                        n2.s.g(yVar, (mc.p) L, rVar2);
                        mh.g0.c(emulatorActivity.C(), rVar2, 0);
                        if (((Boolean) emulatorActivity.X0.getValue()).booleanValue()) {
                            rVar2.X(-294976901);
                            boolean h10 = rVar2.h(emulatorActivity);
                            Object L2 = rVar2.L();
                            if (h10 || L2 == eVar2) {
                                L2 = new c(emulatorActivity, 1);
                                rVar2.h0(L2);
                            }
                            mh.g0.a(e0Var, (mc.a) L2, rVar2, 0);
                            rVar2.p(false);
                        } else {
                            rVar2.X(-294569437);
                            rVar2.p(false);
                        }
                        if (((Boolean) emulatorActivity.Y0.getValue()).booleanValue()) {
                            rVar2.X(-294494665);
                            l0 l0Var = emulatorActivity.C().N;
                            boolean h11 = rVar2.h(emulatorActivity);
                            Object L3 = rVar2.L();
                            if (h11 || L3 == eVar2) {
                                L3 = new c(emulatorActivity, 2);
                                rVar2.h0(L3);
                            }
                            mc.a aVar = (mc.a) L3;
                            boolean h12 = rVar2.h(emulatorActivity);
                            Object L4 = rVar2.L();
                            if (h12 || L4 == eVar2) {
                                L4 = new c(emulatorActivity, 3);
                                rVar2.h0(L4);
                            }
                            mh.g0.g(l0Var, aVar, (mc.a) L4, rVar2, 0);
                            rVar2.p(false);
                            return yVar;
                        }
                        rVar2.X(-293960349);
                        rVar2.p(false);
                        return yVar;
                    }
                    a0.j.h("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                rVar2.R();
                return yVar;
        }
    }
}
