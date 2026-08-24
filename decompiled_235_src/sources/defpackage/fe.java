package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fe  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fe implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ on2 B;

    public /* synthetic */ fe(int i, on2 on2Var) {
        this.A = i;
        this.B = on2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        on2 on2Var = this.B;
        switch (i) {
            case 0:
                on2Var.c();
                return;
            case 1:
                on2Var.c();
                return;
            case 2:
                on2Var.c();
                return;
            case 3:
                int i2 = EmulatorActivity.Z1;
                on2Var.c();
                return;
            case 4:
                int i3 = EmulatorActivity.Z1;
                on2Var.c();
                return;
            default:
                on2Var.c();
                return;
        }
    }
}
