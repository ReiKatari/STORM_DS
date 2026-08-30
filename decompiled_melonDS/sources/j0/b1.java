package j0;

import android.util.Size;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface b1 extends p1 {

    /* renamed from: q  reason: collision with root package name */
    public static final g f7153q = new g("camerax.core.imageOutput.targetAspectRatio", d0.d.class, null);

    /* renamed from: r  reason: collision with root package name */
    public static final g f7154r;

    /* renamed from: s  reason: collision with root package name */
    public static final g f7155s;

    /* renamed from: t  reason: collision with root package name */
    public static final g f7156t;

    /* renamed from: u  reason: collision with root package name */
    public static final g f7157u;

    /* renamed from: v  reason: collision with root package name */
    public static final g f7158v;

    /* renamed from: w  reason: collision with root package name */
    public static final g f7159w;

    /* renamed from: x  reason: collision with root package name */
    public static final g f7160x;

    /* renamed from: y  reason: collision with root package name */
    public static final g f7161y;

    /* renamed from: z  reason: collision with root package name */
    public static final g f7162z;

    static {
        Class cls = Integer.TYPE;
        f7154r = new g("camerax.core.imageOutput.targetRotation", cls, null);
        f7155s = new g("camerax.core.imageOutput.appTargetRotation", cls, null);
        f7156t = new g("camerax.core.imageOutput.mirrorMode", cls, null);
        f7157u = new g("camerax.core.imageOutput.targetResolution", Size.class, null);
        f7158v = new g("camerax.core.imageOutput.defaultResolution", Size.class, null);
        f7159w = new g("camerax.core.imageOutput.maxResolution", Size.class, null);
        f7160x = new g("camerax.core.imageOutput.supportedResolutions", List.class, null);
        f7161y = new g("camerax.core.imageOutput.resolutionSelector", u0.b.class, null);
        f7162z = new g("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void C(b1 b1Var) {
        boolean z10;
        boolean e6 = b1Var.e(f7153q);
        if (((Size) b1Var.h(f7157u, null)) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (e6 && z10) {
            a0.j.h("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((u0.b) b1Var.h(f7161y, null)) != null) {
            if (e6 || z10) {
                a0.j.h("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int p() {
        return ((Integer) h(f7154r, 0)).intValue();
    }
}
