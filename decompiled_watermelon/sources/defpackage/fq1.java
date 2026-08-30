package defpackage;

import android.view.View;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fq1 implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ fq1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.A;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                int i2 = EmulatorActivity.P1;
                emulatorActivity.K0();
                return;
            case 1:
                int i3 = EmulatorActivity.P1;
                emulatorActivity.N();
                return;
            default:
                int i4 = EmulatorActivity.P1;
                emulatorActivity.K0();
                return;
        }
    }
}
