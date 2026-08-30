package androidx.camera.core.internal.compat.quirk;

import d0.f1;
import d0.s0;
import d0.v1;
import j0.k1;
import j0.l2;
import j0.n2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements k1 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet f1064a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean b(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (it.hasNext()) {
                v1 v1Var = (v1) it.next();
                if (v1Var instanceof f1) {
                    z10 = true;
                } else if (v1Var instanceof s0) {
                    z12 = true;
                } else if (v1Var.f3474g.e(l2.N)) {
                    if (v1Var.f3474g.r() == n2.VIDEO_CAPTURE) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
            }
            if (z10 && z11 && z12) {
                return true;
            }
        }
        return false;
    }
}
