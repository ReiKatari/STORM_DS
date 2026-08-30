package defpackage;

import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ir1  reason: default package */
/* loaded from: classes.dex */
public final class ir1 implements w92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ ir1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        RuntimeLayoutView runtimeLayoutView;
        kv5 kv5Var;
        if4 if4Var;
        jv5 jv5Var;
        int i = this.A;
        o27 o27Var = o27.a;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                m11 m11Var = (m11) obj;
                mx2 mx2Var = emulatorActivity.S0;
                if (mx2Var != null) {
                    emulatorActivity.T0 = new a13(m11Var, mx2Var, emulatorActivity.j1);
                    ow0 ow0Var = emulatorActivity.M0;
                    ow0Var.getClass();
                    ee6 ee6Var = ow0Var.b;
                    ee6Var.getClass();
                    ee6Var.l(null, m11Var);
                    return o27Var;
                }
                b53.g0("melonTouchHandler");
                throw null;
            case 1:
                rw0 rw0Var = (rw0) obj;
                r8 r8Var = emulatorActivity.A0;
                if (r8Var != null) {
                    ((RuntimeLayoutView) r8Var.k).setConnectedControllersState(rw0Var);
                    k42 k42Var = emulatorActivity.J0;
                    if (k42Var != null && (runtimeLayoutView = k42Var.L) != null) {
                        runtimeLayoutView.setConnectedControllersState(rw0Var);
                    }
                    return o27Var;
                }
                b53.g0("binding");
                throw null;
            case 2:
                yr5 yr5Var = (yr5) obj;
                if (yr5Var instanceof wr5) {
                    os osVar = emulatorActivity.O0;
                    if (osVar != null) {
                        ((c46) ((os) osVar.L).R).p(Boolean.TRUE);
                    } else {
                        b53.g0("emulatorRumbleManager");
                        throw null;
                    }
                } else if (b53.x(yr5Var, xr5.a)) {
                    os osVar2 = emulatorActivity.O0;
                    if (osVar2 != null) {
                        ((c46) ((os) osVar2.L).R).p(Boolean.FALSE);
                    } else {
                        b53.g0("emulatorRumbleManager");
                        throw null;
                    }
                } else {
                    i.c();
                    return null;
                }
                return o27Var;
            case 3:
                List<kq2> list = ((kg7) obj).a;
                ArrayList arrayList = new ArrayList();
                for (kq2 kq2Var : list) {
                    if (kq2Var instanceof kq2) {
                        t40 t40Var = kq2Var.a;
                        if (kq2Var.a() != an1.c0) {
                            if4Var = if4.PORTRAIT;
                        } else {
                            if4Var = if4.LANDSCAPE;
                        }
                        if (kq2Var.b()) {
                            jv5Var = jv5.SEAMLESS;
                        } else {
                            jv5Var = jv5.GAP;
                        }
                        kv5Var = new kv5(if4Var, jv5Var, new Rect(t40Var.c().left, t40Var.c().top, t40Var.c().width(), t40Var.c().height()));
                    } else {
                        kv5Var = null;
                    }
                    if (kv5Var != null) {
                        arrayList.add(kv5Var);
                    }
                }
                int i2 = EmulatorActivity.P1;
                hv1 U = emulatorActivity.U();
                U.getClass();
                ee6 ee6Var2 = (ee6) U.u.X;
                ee6Var2.getClass();
                ee6Var2.l(null, arrayList);
                return o27Var;
            case 4:
                o27 o27Var2 = (o27) obj;
                k42 k42Var2 = emulatorActivity.J0;
                if (k42Var2 != null) {
                    k42Var2.dismiss();
                }
                emulatorActivity.J0 = null;
                hv1 U2 = emulatorActivity.U();
                tq5.w(U2.z, null, null, new ew1(U2, null), 3);
                return o27Var;
            default:
                emulatorActivity.o1.a(new String[]{(String) obj});
                return o27Var;
        }
    }
}
