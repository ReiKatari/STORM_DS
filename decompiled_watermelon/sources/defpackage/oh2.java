package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oh2  reason: default package */
/* loaded from: classes.dex */
public interface oh2 {
    void a(Long l);

    void b(EmulatorSurfaceView emulatorSurfaceView);

    default long c(int i, int i2) {
        return 0L;
    }

    void d(EmulatorSurfaceView emulatorSurfaceView, VulkanPresentationConfig vulkanPresentationConfig, bs5 bs5Var);

    void e(EmulatorSurfaceView emulatorSurfaceView);

    void stop();
}
