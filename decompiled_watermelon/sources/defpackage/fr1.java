package defpackage;

import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fr1  reason: default package */
/* loaded from: classes.dex */
public final class fr1 extends fi2 {
    public boolean A;
    public boolean B;
    public boolean L = true;
    public final /* synthetic */ EmulatorActivity R;

    public fr1(EmulatorActivity emulatorActivity) {
        this.R = emulatorActivity;
    }

    public final void d() {
        boolean z;
        if (!this.A && !this.B) {
            z = false;
        } else {
            z = true;
        }
        MelonEmulator.a.setFastForwardEnabled(z);
    }
}
