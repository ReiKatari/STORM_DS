package me.magnum.melonds.ui.emulator;

import android.os.Handler;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ EmulatorActivity A;

    public b(EmulatorActivity emulatorActivity) {
        this.A = emulatorActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EmulatorActivity emulatorActivity = this.A;
        if (!emulatorActivity.isDestroyed() && emulatorActivity.b1 == EmulatorActivity.a.VULKAN) {
            emulatorActivity.Q0();
            k42 k42Var = emulatorActivity.J0;
            if (k42Var != null) {
                k42Var.b();
            }
            int i = emulatorActivity.d1 + 1;
            emulatorActivity.d1 = i;
            if (i < 24) {
                Handler handler = emulatorActivity.K0;
                if (handler != null) {
                    handler.postDelayed(this, 100L);
                    return;
                } else {
                    b53.g0("handler");
                    throw null;
                }
            }
            emulatorActivity.c1 = null;
            return;
        }
        emulatorActivity.c1 = null;
    }
}
