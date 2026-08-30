package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qd implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ki2 B;

    public /* synthetic */ qd(int i, ki2 ki2Var) {
        this.A = i;
        this.B = ki2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        ki2 ki2Var = this.B;
        switch (i) {
            case 0:
                ki2Var.c();
                return;
            case 1:
                ki2Var.c();
                return;
            case 2:
                ki2Var.c();
                return;
            case 3:
                int i2 = EmulatorActivity.P1;
                ki2Var.c();
                return;
            case 4:
                int i3 = EmulatorActivity.P1;
                ki2Var.c();
                return;
            default:
                ki2Var.c();
                return;
        }
    }
}
