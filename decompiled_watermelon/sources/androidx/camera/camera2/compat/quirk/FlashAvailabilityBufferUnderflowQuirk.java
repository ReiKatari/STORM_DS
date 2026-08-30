package androidx.camera.camera2.compat.quirk;

import java.util.Locale;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class FlashAvailabilityBufferUnderflowQuirk implements kx4 {
    public static final Set a;

    static {
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = "sprd".toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = "lemp".toLowerCase(locale);
        lowerCase2.getClass();
        u82 u82Var = new u82(lowerCase, lowerCase2);
        locale.getClass();
        String lowerCase3 = "sprd".toLowerCase(locale);
        lowerCase3.getClass();
        String lowerCase4 = "DM20C".toLowerCase(locale);
        lowerCase4.getClass();
        a = nu.H0(new u82[]{u82Var, new u82(lowerCase3, lowerCase4)});
    }
}
