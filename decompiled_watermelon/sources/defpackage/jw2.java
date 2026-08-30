package defpackage;

import android.util.Size;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jw2  reason: default package */
/* loaded from: classes.dex */
public interface jw2 extends l45 {
    public static final uw o = new uw("camerax.core.imageOutput.targetAspectRatio", pu.class, null);
    public static final uw p;
    public static final uw q;
    public static final uw r;
    public static final uw s;
    public static final uw t;
    public static final uw u;
    public static final uw v;
    public static final uw w;
    public static final uw x;

    static {
        Class cls = Integer.TYPE;
        p = new uw("camerax.core.imageOutput.targetRotation", cls, null);
        q = new uw("camerax.core.imageOutput.appTargetRotation", cls, null);
        r = new uw("camerax.core.imageOutput.mirrorMode", cls, null);
        s = new uw("camerax.core.imageOutput.targetResolution", Size.class, null);
        t = new uw("camerax.core.imageOutput.defaultResolution", Size.class, null);
        u = new uw("camerax.core.imageOutput.maxResolution", Size.class, null);
        v = new uw("camerax.core.imageOutput.supportedResolutions", List.class, null);
        w = new uw("camerax.core.imageOutput.resolutionSelector", mb5.class, null);
        x = new uw("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void H(jw2 jw2Var) {
        boolean z;
        boolean a = jw2Var.a(o);
        if (((Size) jw2Var.d(s, null)) != null) {
            z = true;
        } else {
            z = false;
        }
        if (a && z) {
            i.i("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((mb5) jw2Var.d(w, null)) != null) {
            if (a || z) {
                i.i("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int I(int i) {
        return ((Integer) d(p, Integer.valueOf(i))).intValue();
    }
}
