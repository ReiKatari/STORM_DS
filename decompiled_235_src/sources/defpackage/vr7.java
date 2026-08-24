package defpackage;

import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vr7  reason: default package */
/* loaded from: classes.dex */
public final class vr7 {
    public final int a;
    public final VulkanPresentationConfig b;

    public vr7(int i, VulkanPresentationConfig vulkanPresentationConfig) {
        this.a = i;
        this.b = vulkanPresentationConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr7)) {
            return false;
        }
        vr7 vr7Var = (vr7) obj;
        if (this.a == vr7Var.a && nb3.k(this.b, vr7Var.b)) {
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
