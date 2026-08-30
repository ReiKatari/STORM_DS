package me.magnum.melonds;

import me.magnum.melonds.common.UriFileHandler;
import me.magnum.melonds.domain.model.VulkanPipelineProfile;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class MelonDSAndroidInterface {
    public static final MelonDSAndroidInterface a = new Object();

    private final native boolean canInitializeVulkanRendererForProfileNative(boolean z);

    private final native void configureVulkanDriverNative(boolean z, String str, String str2, String str3, String str4, String str5);

    private final native void setupNative(UriFileHandler uriFileHandler, boolean z, String str, String str2, String str3, String str4, String str5);

    public final boolean a(VulkanPipelineProfile vulkanPipelineProfile) {
        Object kc5Var;
        vulkanPipelineProfile.getClass();
        try {
            kc5Var = Boolean.valueOf(canInitializeVulkanRendererForProfileNative(vulkanPipelineProfile.getUsesFastPath()));
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        Object obj = Boolean.FALSE;
        if (kc5Var instanceof kc5) {
            kc5Var = obj;
        }
        return ((Boolean) kc5Var).booleanValue();
    }

    public final void b(wc7 wc7Var) {
        boolean z;
        if (wc7Var.a == yc7.CUSTOM) {
            z = true;
        } else {
            z = false;
        }
        configureVulkanDriverNative(z, wc7Var.b, wc7Var.c, wc7Var.d, wc7Var.e, wc7Var.f);
    }

    public final boolean c() {
        Object kc5Var;
        boolean z;
        try {
            if ((getRendererCapabilities() & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            kc5Var = Boolean.valueOf(z);
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        Object obj = Boolean.FALSE;
        if (kc5Var instanceof kc5) {
            kc5Var = obj;
        }
        return ((Boolean) kc5Var).booleanValue();
    }

    public final native void cleanup();

    public final void d(UriFileHandler uriFileHandler, wc7 wc7Var) {
        boolean z;
        if (wc7Var.a == yc7.CUSTOM) {
            z = true;
        } else {
            z = false;
        }
        setupNative(uriFileHandler, z, wc7Var.b, wc7Var.c, wc7Var.d, wc7Var.e, wc7Var.f);
    }

    public final native long getEmulatorGlContext();

    public final native int getRendererCapabilities();
}
