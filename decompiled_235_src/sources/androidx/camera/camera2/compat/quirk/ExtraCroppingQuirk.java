package androidx.camera.camera2.compat.quirk;

import android.util.Range;
import android.util.Size;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ExtraCroppingQuirk implements u65 {
    public static final LinkedHashMap a = c14.n0(new vr4("SM-T580", null), new vr4("SM-J710MN", new Range(21, 26)), new vr4("SM-A320FL", null), new vr4("SM-G570M", null), new vr4("SM-G610F", null), new vr4("SM-G610M", new Range(21, 26)));

    public static Size b(hv6 hv6Var) {
        hv6Var.getClass();
        if (n16.E()) {
            int i = d92.a[hv6Var.ordinal()];
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
