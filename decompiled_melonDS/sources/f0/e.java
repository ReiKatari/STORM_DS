package f0;

import d0.f1;
import d0.s0;
import d0.v1;
import j0.l2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {
    public static g a(v1 v1Var) {
        v1Var.getClass();
        if (v1Var instanceof f1) {
            return g.PREVIEW;
        }
        if (v1Var instanceof s0) {
            return g.IMAGE_CAPTURE;
        }
        if (n0.f.B(v1Var)) {
            return g.VIDEO_CAPTURE;
        }
        if (v1Var instanceof v0.d) {
            return g.STREAM_SHARING;
        }
        return g.UNDEFINED;
    }

    public static g b(l2 l2Var) {
        l2Var.getClass();
        int i2 = d.f4516a[l2Var.r().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return g.UNDEFINED;
                    }
                    return g.STREAM_SHARING;
                }
                return g.VIDEO_CAPTURE;
            }
            return g.PREVIEW;
        }
        return g.IMAGE_CAPTURE;
    }
}
