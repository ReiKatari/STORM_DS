package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xu1 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ nj5 L;

    public /* synthetic */ xu1(boolean z, nj5 nj5Var, int i) {
        this.A = i;
        this.B = z;
        this.L = nj5Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.A;
        nj5 nj5Var = this.L;
        boolean z = this.B;
        switch (i5) {
            case 0:
                int i6 = EmulatorActivity.Z1;
                if (z) {
                    i = nj5Var.e;
                } else {
                    i = nj5Var.f;
                }
                return Integer.valueOf(i);
            case 1:
                int i7 = EmulatorActivity.Z1;
                if (z) {
                    i2 = nj5Var.g;
                } else {
                    i2 = nj5Var.h;
                }
                return Integer.valueOf(i2);
            case 2:
                int i8 = EmulatorActivity.Z1;
                if (z) {
                    i3 = nj5Var.i;
                } else {
                    i3 = nj5Var.j;
                }
                return Integer.valueOf(i3);
            default:
                int i9 = EmulatorActivity.Z1;
                if (z) {
                    i4 = nj5Var.k;
                } else {
                    i4 = nj5Var.l;
                }
                return Integer.valueOf(i4);
        }
    }
}
