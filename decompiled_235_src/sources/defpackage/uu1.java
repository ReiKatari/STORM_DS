package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uu1 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ nj5 L;
    public final /* synthetic */ EmulatorActivity R;

    public /* synthetic */ uu1(boolean z, nj5 nj5Var, EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = z;
        this.L = nj5Var;
        this.R = emulatorActivity;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        EmulatorActivity emulatorActivity = this.R;
        nj5 nj5Var = this.L;
        boolean z = this.B;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                int i2 = EmulatorActivity.Z1;
                if (z) {
                    nj5Var.c = intValue;
                } else {
                    nj5Var.d = intValue;
                }
                emulatorActivity.L(nj5Var);
                return jg7Var;
            case 1:
                int i3 = EmulatorActivity.Z1;
                if (z) {
                    nj5Var.e = intValue;
                } else {
                    nj5Var.f = intValue;
                }
                emulatorActivity.L(nj5Var);
                return jg7Var;
            case 2:
                int i4 = EmulatorActivity.Z1;
                if (z) {
                    nj5Var.a = intValue;
                } else {
                    nj5Var.b = intValue;
                }
                emulatorActivity.L(nj5Var);
                return jg7Var;
            case 3:
                int i5 = EmulatorActivity.Z1;
                if (z) {
                    nj5Var.g = intValue;
                } else {
                    nj5Var.h = intValue;
                }
                emulatorActivity.L(nj5Var);
                return jg7Var;
            case 4:
                int i6 = EmulatorActivity.Z1;
                if (z) {
                    nj5Var.i = intValue;
                } else {
                    nj5Var.j = intValue;
                }
                emulatorActivity.L(nj5Var);
                return jg7Var;
            default:
                int i7 = EmulatorActivity.Z1;
                if (z) {
                    nj5Var.k = intValue;
                } else {
                    nj5Var.l = intValue;
                }
                emulatorActivity.L(nj5Var);
                return jg7Var;
        }
    }
}
