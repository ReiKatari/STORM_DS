package defpackage;

import java.util.List;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hu1 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;
    public final /* synthetic */ pv1 L;

    public /* synthetic */ hu1(EmulatorActivity emulatorActivity, pv1 pv1Var, int i) {
        this.A = i;
        this.B = emulatorActivity;
        this.L = pv1Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        dy1 dy1Var;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        pv1 pv1Var = this.L;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                List list = (List) obj;
                int i2 = EmulatorActivity.Z1;
                list.getClass();
                emulatorActivity.N1.setValue(pv1.a(pv1Var, list));
                return jg7Var;
            case 1:
                List list2 = (List) obj;
                int i3 = EmulatorActivity.Z1;
                list2.getClass();
                emulatorActivity.N1.setValue(pv1.a(pv1Var, list2));
                return jg7Var;
            case 2:
                List list3 = (List) obj;
                int i4 = EmulatorActivity.Z1;
                list3.getClass();
                emulatorActivity.N1.setValue(pv1.a(pv1Var, list3));
                return jg7Var;
            case 3:
                c46 c46Var = (c46) obj;
                int i5 = EmulatorActivity.Z1;
                c46Var.getClass();
                emulatorActivity.Q();
                pv1Var.c.g(c46Var);
                return jg7Var;
            default:
                c46 c46Var2 = (c46) obj;
                int i6 = EmulatorActivity.Z1;
                c46Var2.getClass();
                sz1 W = emulatorActivity.W();
                hu1 hu1Var = new hu1(emulatorActivity, pv1Var, 0);
                W.getClass();
                Object value = W.p0.getValue();
                if (value instanceof dy1) {
                    dy1Var = (dy1) value;
                } else {
                    dy1Var = null;
                }
                if (dy1Var != null) {
                    hv.L(W.z, null, null, new l5(hu1Var, W, dy1Var, c46Var2, null, 8), 3);
                }
                return jg7Var;
        }
    }
}
