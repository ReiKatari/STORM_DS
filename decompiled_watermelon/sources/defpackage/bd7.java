package defpackage;

import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bd7  reason: default package */
/* loaded from: classes.dex */
public final class bd7 {
    public final int a;
    public final VulkanPresentationConfig b;

    public bd7(int i, VulkanPresentationConfig vulkanPresentationConfig) {
        this.a = i;
        this.b = vulkanPresentationConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd7)) {
            return false;
        }
        bd7 bd7Var = (bd7) obj;
        if (this.a == bd7Var.a && b53.x(this.b, bd7Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        VulkanPresentationConfig vulkanPresentationConfig = this.b;
        if (vulkanPresentationConfig == null) {
            hashCode = 0;
        } else {
            hashCode = vulkanPresentationConfig.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "PendingSurfaceConfig(generation=" + this.a + ", config=" + this.b + ")";
    }
}
