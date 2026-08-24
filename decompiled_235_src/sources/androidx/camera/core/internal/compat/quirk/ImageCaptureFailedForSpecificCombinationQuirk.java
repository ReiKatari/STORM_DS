package androidx.camera.core.internal.compat.quirk;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements u65 {
    public static final HashSet a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean b(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                di7 di7Var = (di7) it.next();
                if (di7Var instanceof p25) {
                    z = true;
                } else if (di7Var instanceof d23) {
                    z3 = true;
                } else if (di7Var.h.i(zi7.T)) {
                    if (di7Var.h.x() == bj7.VIDEO_CAPTURE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            if (z && z2 && z3) {
                return true;
            }
        }
        return false;
    }
}
