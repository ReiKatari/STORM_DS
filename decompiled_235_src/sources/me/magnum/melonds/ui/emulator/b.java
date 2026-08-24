package me.magnum.melonds.ui.emulator;

import android.os.Handler;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ EmulatorActivity A;

    public b(EmulatorActivity emulatorActivity) {
        this.A = emulatorActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EmulatorActivity emulatorActivity = this.A;
        if (!emulatorActivity.isDestroyed() && emulatorActivity.e1 == EmulatorActivity.a.VULKAN) {
            emulatorActivity.U0();
            c92 c92Var = emulatorActivity.K0;
            if (c92Var != null) {
                c92Var.b();
            }
            int i = emulatorActivity.g1 + 1;
            emulatorActivity.g1 = i;
            if (i < 24) {
                Handler handler = emulatorActivity.N0;
                if (handler != null) {
                    handler.postDelayed(this, 100L);
                    return;
                } else {
                    nb3.a0("handler");
                    throw null;
                }
            }
            emulatorActivity.f1 = null;
            return;
        }
        emulatorActivity.f1 = null;
    }
}
