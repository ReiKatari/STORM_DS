package androidx.camera.camera2.compat.quirk;

import java.util.Locale;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class FlashAvailabilityBufferUnderflowQuirk implements u65 {
    public static final Set a;

    static {
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = "sprd".toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = "lemp".toLowerCase(locale);
        lowerCase2.getClass();
        md2 md2Var = new md2(lowerCase, lowerCase2);
        locale.getClass();
        String lowerCase3 = "sprd".toLowerCase(locale);
        lowerCase3.getClass();
        String lowerCase4 = "DM20C".toLowerCase(locale);
        lowerCase4.getClass();
        a = fv.V0(new md2[]{md2Var, new md2(lowerCase3, lowerCase4)});
    }
}
