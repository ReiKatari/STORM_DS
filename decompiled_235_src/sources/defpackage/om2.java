package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: om2  reason: default package */
/* loaded from: classes.dex */
public interface om2 {
    void a(Long l);

    default long b(int i, int i2) {
        return 0L;
    }

    void c(EmulatorSurfaceView emulatorSurfaceView);

    void d(EmulatorSurfaceView emulatorSurfaceView);

    void e(EmulatorSurfaceView emulatorSurfaceView, VulkanPresentationConfig vulkanPresentationConfig, t26 t26Var);

    void stop();
}
