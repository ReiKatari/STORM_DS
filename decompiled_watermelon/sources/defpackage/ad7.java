package defpackage;

import android.view.Surface;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ad7  reason: default package */
/* loaded from: classes.dex */
public final class ad7 {
    public int a;
    public VulkanPresentationConfig b;
    public bs5 c;
    public int d;
    public Surface e;

    public ad7(int i, VulkanPresentationConfig vulkanPresentationConfig, bs5 bs5Var, int i2, Surface surface) {
        bs5Var.getClass();
        this.a = i;
        this.b = vulkanPresentationConfig;
        this.c = bs5Var;
        this.d = i2;
        this.e = surface;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad7)) {
            return false;
        }
        ad7 ad7Var = (ad7) obj;
        if (this.a == ad7Var.a && b53.x(this.b, ad7Var.b) && b53.x(this.c, ad7Var.c) && this.d == ad7Var.d && b53.x(this.e, ad7Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        VulkanPresentationConfig vulkanPresentationConfig = this.b;
        int i = 0;
        if (vulkanPresentationConfig == null) {
            hashCode = 0;
        } else {
            hashCode = vulkanPresentationConfig.hashCode();
        }
        int a = wh1.a(this.d, (this.c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31, 31);
        Surface surface = this.e;
        if (surface != null) {
            i = surface.hashCode();
        }
        return a + i;
    }

    public final String toString() {
        int i = this.a;
        VulkanPresentationConfig vulkanPresentationConfig = this.b;
        bs5 bs5Var = this.c;
        int i2 = this.d;
        Surface surface = this.e;
        return "ManagedSurface(surfaceId=" + i + ", config=" + vulkanPresentationConfig + ", background=" + bs5Var + ", generation=" + i2 + ", pendingSurface=" + surface + ")";
    }

    public ad7() {
        this(0, null, bs5.c, 0, null);
    }
}
