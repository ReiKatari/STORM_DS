package androidx.camera.camera2.compat.quirk;

import android.util.Range;
import android.util.Size;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class ExtraCroppingQuirk implements kx4 {
    public static final LinkedHashMap a = zt3.m0(new ti4("SM-T580", null), new ti4("SM-J710MN", new Range(21, 26)), new ti4("SM-A320FL", null), new ti4("SM-G570M", null), new ti4("SM-G610F", null), new ti4("SM-G610M", new Range(21, 26)));

    public static Size b(nj6 nj6Var) {
        nj6Var.getClass();
        if (b53.S()) {
            int i = l42.a[nj6Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return new Size(3264, 1836);
                    }
                    return null;
                }
                return new Size(1280, 720);
            }
            return new Size(1920, 1080);
        }
        return null;
    }
}
