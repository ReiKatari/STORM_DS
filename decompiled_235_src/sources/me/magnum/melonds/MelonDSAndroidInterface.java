package me.magnum.melonds;

import me.magnum.melonds.common.UriFileHandler;
import me.magnum.melonds.domain.model.VulkanPipelineProfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MelonDSAndroidInterface {
    public static final MelonDSAndroidInterface a = new Object();

    private final native boolean canInitializeVulkanRendererForProfileNative(boolean z);

    private final native void configureVulkanDriverNative(boolean z, String str, String str2, String str3, String str4, String str5);

    private final native void setupNative(UriFileHandler uriFileHandler, boolean z, String str, String str2, String str3, String str4, String str5);

    public final boolean a(VulkanPipelineProfile vulkanPipelineProfile) {
        Object em5Var;
        vulkanPipelineProfile.getClass();
        try {
            em5Var = Boolean.valueOf(canInitializeVulkanRendererForProfileNative(vulkanPipelineProfile.getUsesFastPath()));
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        Object obj = Boolean.FALSE;
        if (em5Var instanceof em5) {
            em5Var = obj;
        }
        return ((Boolean) em5Var).booleanValue();
    }

    public final void b(yq7 yq7Var) {
        boolean z;
        if (yq7Var.a == sr7.CUSTOM) {
            z = true;
        } else {
            z = false;
        }
        configureVulkanDriverNative(z, yq7Var.b, yq7Var.c, yq7Var.d, yq7Var.e, yq7Var.f);
    }

    public final boolean c() {
        Object em5Var;
        boolean z;
        try {
            if ((getRendererCapabilities() & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            em5Var = Boolean.valueOf(z);
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        Object obj = Boolean.FALSE;
        if (em5Var instanceof em5) {
            em5Var = obj;
        }
        return ((Boolean) em5Var).booleanValue();
    }

    public final native void cleanup();

    public final void d(UriFileHandler uriFileHandler, yq7 yq7Var) {
        boolean z;
        if (yq7Var.a == sr7.CUSTOM) {
            z = true;
        } else {
            z = false;
        }
        setupNative(uriFileHandler, z, yq7Var.b, yq7Var.c, yq7Var.d, yq7Var.e, yq7Var.f);
    }

    public final native long getEmulatorGlContext();

    public final native int getRendererCapabilities();
}
