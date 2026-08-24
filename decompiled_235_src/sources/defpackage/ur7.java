package defpackage;

import android.view.Surface;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ur7  reason: default package */
/* loaded from: classes.dex */
public final class ur7 {
    public int a;
    public VulkanPresentationConfig b;
    public t26 c;
    public int d;
    public Surface e;

    public ur7(int i, VulkanPresentationConfig vulkanPresentationConfig, t26 t26Var, int i2, Surface surface) {
        t26Var.getClass();
        this.a = i;
        this.b = vulkanPresentationConfig;
        this.c = t26Var;
        this.d = i2;
        this.e = surface;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur7)) {
            return false;
        }
        ur7 ur7Var = (ur7) obj;
        if (this.a == ur7Var.a && nb3.k(this.b, ur7Var.b) && nb3.k(this.c, ur7Var.c) && this.d == ur7Var.d && nb3.k(this.e, ur7Var.e)) {
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
        int a = lb1.a(this.d, (this.c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31, 31);
        Surface surface = this.e;
        if (surface != null) {
            i = surface.hashCode();
        }
        return a + i;
    }

    public final String toString() {
        int i = this.a;
        VulkanPresentationConfig vulkanPresentationConfig = this.b;
        t26 t26Var = this.c;
        int i2 = this.d;
        Surface surface = this.e;
        return "ManagedSurface(surfaceId=" + i + ", config=" + vulkanPresentationConfig + ", background=" + t26Var + ", generation=" + i2 + ", pendingSurface=" + surface + ")";
    }

    public ur7() {
        this(0, null, t26.c, 0, null);
    }
}
