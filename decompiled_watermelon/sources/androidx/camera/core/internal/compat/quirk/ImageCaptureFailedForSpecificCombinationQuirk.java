package androidx.camera.core.internal.compat.quirk;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements kx4 {
    public static final HashSet a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean b(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                f47 f47Var = (f47) it.next();
                if (f47Var instanceof nt4) {
                    z = true;
                } else if (f47Var instanceof zv2) {
                    z3 = true;
                } else if (f47Var.h.a(b57.S)) {
                    if (f47Var.h.n() == d57.VIDEO_CAPTURE) {
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
