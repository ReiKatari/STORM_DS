package defpackage;

import java.util.List;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yq1 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;
    public final /* synthetic */ dr1 L;

    public /* synthetic */ yq1(EmulatorActivity emulatorActivity, dr1 dr1Var, int i) {
        this.A = i;
        this.B = emulatorActivity;
        this.L = dr1Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        st1 st1Var;
        int i = this.A;
        o27 o27Var = o27.a;
        dr1 dr1Var = this.L;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                ft5 ft5Var = (ft5) obj;
                int i2 = EmulatorActivity.P1;
                ft5Var.getClass();
                emulatorActivity.Q();
                dr1Var.c.n(ft5Var);
                return o27Var;
            case 1:
                ft5 ft5Var2 = (ft5) obj;
                int i3 = EmulatorActivity.P1;
                ft5Var2.getClass();
                hv1 U = emulatorActivity.U();
                yq1 yq1Var = new yq1(emulatorActivity, dr1Var, 2);
                U.getClass();
                Object value = U.p0.getValue();
                if (value instanceof st1) {
                    st1Var = (st1) value;
                } else {
                    st1Var = null;
                }
                if (st1Var != null) {
                    tq5.w(U.z, null, null, new m5(yq1Var, U, st1Var, ft5Var2, null, 9), 3);
                }
                return o27Var;
            default:
                List list = (List) obj;
                int i4 = EmulatorActivity.P1;
                list.getClass();
                emulatorActivity.H1.setValue(new dr1(list, dr1Var.b, dr1Var.c));
                return o27Var;
        }
    }
}
