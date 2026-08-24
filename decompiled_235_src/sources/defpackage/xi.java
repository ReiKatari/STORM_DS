package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xi  reason: default package */
/* loaded from: classes.dex */
public final class xi implements hh7 {
    public final OutputConfiguration A;

    public xi(OutputConfiguration outputConfiguration) {
        this.A = outputConfiguration;
        outputConfiguration.getSurface();
    }

    public final void a(Surface surface) {
        surface.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (i >= 26) {
                this.A.addSurface(surface);
                return;
            }
            return;
        }
        u34.f(lb1.k("addSurface is not supported on API ", i, " (requires API 26)"));
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        if (ar0Var.equals(gh5.a(OutputConfiguration.class))) {
            return this.A;
        }
        return null;
    }

    public final String toString() {
        return this.A.toString();
    }
}
