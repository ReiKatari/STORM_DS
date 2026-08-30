package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jq1 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ v95 L;

    public /* synthetic */ jq1(boolean z, v95 v95Var, int i) {
        this.A = i;
        this.B = z;
        this.L = v95Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.A;
        v95 v95Var = this.L;
        boolean z = this.B;
        switch (i5) {
            case 0:
                int i6 = EmulatorActivity.P1;
                if (z) {
                    i = v95Var.e;
                } else {
                    i = v95Var.f;
                }
                return Integer.valueOf(i);
            case 1:
                int i7 = EmulatorActivity.P1;
                if (z) {
                    i2 = v95Var.g;
                } else {
                    i2 = v95Var.h;
                }
                return Integer.valueOf(i2);
            case 2:
                int i8 = EmulatorActivity.P1;
                if (z) {
                    i3 = v95Var.i;
                } else {
                    i3 = v95Var.j;
                }
                return Integer.valueOf(i3);
            default:
                int i9 = EmulatorActivity.P1;
                if (z) {
                    i4 = v95Var.k;
                } else {
                    i4 = v95Var.l;
                }
                return Integer.valueOf(i4);
        }
    }
}
