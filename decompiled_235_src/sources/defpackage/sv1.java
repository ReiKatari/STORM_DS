package defpackage;

import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sv1  reason: default package */
/* loaded from: classes.dex */
public final class sv1 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ sv1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        RuntimeLayoutView runtimeLayoutView;
        x66 x66Var;
        ko4 ko4Var;
        w66 w66Var;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                emulatorActivity.u1.a(new String[]{(String) obj});
                return jg7Var;
            case 1:
                u41 u41Var = (u41) obj;
                q33 q33Var = emulatorActivity.V0;
                if (q33Var != null) {
                    emulatorActivity.W0 = new e73(u41Var, q33Var, emulatorActivity.m1);
                    lz0 lz0Var = emulatorActivity.P0;
                    lz0Var.getClass();
                    tp6 tp6Var = lz0Var.b;
                    tp6Var.getClass();
                    tp6Var.m(null, u41Var);
                    return jg7Var;
                }
                nb3.a0("melonTouchHandler");
                throw null;
            case 2:
                oz0 oz0Var = (oz0) obj;
                s8 s8Var = emulatorActivity.B0;
                if (s8Var != null) {
                    s8Var.m.setConnectedControllersState(oz0Var);
                    c92 c92Var = emulatorActivity.K0;
                    if (c92Var != null && (runtimeLayoutView = c92Var.L) != null) {
                        runtimeLayoutView.setConnectedControllersState(oz0Var);
                    }
                    return jg7Var;
                }
                nb3.a0("binding");
                throw null;
            case 3:
                r26 r26Var = (r26) obj;
                if (r26Var instanceof p26) {
                    bt btVar = emulatorActivity.R0;
                    if (btVar != null) {
                        ((of6) ((bt) btVar.L).R).k(Boolean.TRUE);
                        return jg7Var;
                    }
                    nb3.a0("emulatorRumbleManager");
                    throw null;
                } else if (nb3.k(r26Var, q26.a)) {
                    bt btVar2 = emulatorActivity.R0;
                    if (btVar2 != null) {
                        ((of6) ((bt) btVar2.L).R).k(Boolean.FALSE);
                        return jg7Var;
                    }
                    nb3.a0("emulatorRumbleManager");
                    throw null;
                } else {
                    i.d();
                    return null;
                }
            case 4:
                List<lw2> list = ((kv7) obj).a;
                ArrayList arrayList = new ArrayList();
                for (lw2 lw2Var : list) {
                    if (lw2Var instanceof lw2) {
                        w60 w60Var = lw2Var.a;
                        if (lw2Var.a() != gr1.d0) {
                            ko4Var = ko4.PORTRAIT;
                        } else {
                            ko4Var = ko4.LANDSCAPE;
                        }
                        if (lw2Var.b()) {
                            w66Var = w66.SEAMLESS;
                        } else {
                            w66Var = w66.GAP;
                        }
                        x66Var = new x66(ko4Var, w66Var, new Rect(w60Var.c().left, w60Var.c().top, w60Var.c().width(), w60Var.c().height()));
                    } else {
                        x66Var = null;
                    }
                    if (x66Var != null) {
                        arrayList.add(x66Var);
                    }
                }
                int i2 = EmulatorActivity.Z1;
                sz1 W = emulatorActivity.W();
                W.getClass();
                W.u.n(arrayList);
                return jg7Var;
            default:
                jg7 jg7Var2 = (jg7) obj;
                c92 c92Var2 = emulatorActivity.K0;
                if (c92Var2 != null) {
                    c92Var2.dismiss();
                }
                emulatorActivity.K0 = null;
                sz1 W2 = emulatorActivity.W();
                hv.L(W2.z, null, null, new p02(W2, null), 3);
                return jg7Var;
        }
    }
}
