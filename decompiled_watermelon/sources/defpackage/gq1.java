package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gq1 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ v95 L;
    public final /* synthetic */ EmulatorActivity R;

    public /* synthetic */ gq1(boolean z, v95 v95Var, EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = z;
        this.L = v95Var;
        this.R = emulatorActivity;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        o27 o27Var = o27.a;
        EmulatorActivity emulatorActivity = this.R;
        v95 v95Var = this.L;
        boolean z = this.B;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                int i2 = EmulatorActivity.P1;
                if (z) {
                    v95Var.c = intValue;
                } else {
                    v95Var.d = intValue;
                }
                emulatorActivity.L(v95Var);
                return o27Var;
            case 1:
                int i3 = EmulatorActivity.P1;
                if (z) {
                    v95Var.e = intValue;
                } else {
                    v95Var.f = intValue;
                }
                emulatorActivity.L(v95Var);
                return o27Var;
            case 2:
                int i4 = EmulatorActivity.P1;
                if (z) {
                    v95Var.a = intValue;
                } else {
                    v95Var.b = intValue;
                }
                emulatorActivity.L(v95Var);
                return o27Var;
            case 3:
                int i5 = EmulatorActivity.P1;
                if (z) {
                    v95Var.g = intValue;
                } else {
                    v95Var.h = intValue;
                }
                emulatorActivity.L(v95Var);
                return o27Var;
            case 4:
                int i6 = EmulatorActivity.P1;
                if (z) {
                    v95Var.i = intValue;
                } else {
                    v95Var.j = intValue;
                }
                emulatorActivity.L(v95Var);
                return o27Var;
            default:
                int i7 = EmulatorActivity.P1;
                if (z) {
                    v95Var.k = intValue;
                } else {
                    v95Var.l = intValue;
                }
                emulatorActivity.L(v95Var);
                return o27Var;
        }
    }
}
