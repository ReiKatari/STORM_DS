package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: li  reason: default package */
/* loaded from: classes.dex */
public final class li implements m37 {
    public final OutputConfiguration A;

    public li(OutputConfiguration outputConfiguration) {
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
        c44.e(wh1.j("addSurface is not supported on API ", i, " (requires API 26)"));
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        if (qo0Var.equals(q75.a(OutputConfiguration.class))) {
            return this.A;
        }
        return null;
    }

    public final String toString() {
        return this.A.toString();
    }
}
