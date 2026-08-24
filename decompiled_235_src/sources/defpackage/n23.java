package defpackage;

import android.util.Size;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n23  reason: default package */
/* loaded from: classes.dex */
public interface n23 extends yd5 {
    public static final xx o = new xx("camerax.core.imageOutput.targetAspectRatio", hv.class, null);
    public static final xx p;
    public static final xx q;
    public static final xx r;
    public static final xx s;
    public static final xx t;
    public static final xx u;
    public static final xx v;
    public static final xx w;
    public static final xx x;

    static {
        Class cls = Integer.TYPE;
        p = new xx("camerax.core.imageOutput.targetRotation", cls, null);
        q = new xx("camerax.core.imageOutput.appTargetRotation", cls, null);
        r = new xx("camerax.core.imageOutput.mirrorMode", cls, null);
        s = new xx("camerax.core.imageOutput.targetResolution", Size.class, null);
        t = new xx("camerax.core.imageOutput.defaultResolution", Size.class, null);
        u = new xx("camerax.core.imageOutput.maxResolution", Size.class, null);
        v = new xx("camerax.core.imageOutput.supportedResolutions", List.class, null);
        w = new xx("camerax.core.imageOutput.resolutionSelector", el5.class, null);
        x = new xx("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void J(n23 n23Var) {
        boolean z;
        boolean i = n23Var.i(o);
        if (((Size) n23Var.b(s, null)) != null) {
            z = true;
        } else {
            z = false;
        }
        if (i && z) {
            i.h("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((el5) n23Var.b(w, null)) != null) {
            if (i || z) {
                i.h("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int K(int i) {
        return ((Integer) b(p, Integer.valueOf(i))).intValue();
    }
}
