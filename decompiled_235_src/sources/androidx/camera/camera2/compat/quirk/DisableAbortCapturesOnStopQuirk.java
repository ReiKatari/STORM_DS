package androidx.camera.camera2.compat.quirk;

import android.os.Build;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DisableAbortCapturesOnStopQuirk implements u65 {
    public static final boolean a;
    public static final boolean b;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r0.equalsIgnoreCase("Poco") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    static {
        boolean z;
        String str = Build.MANUFACTURER;
        str.getClass();
        boolean z2 = false;
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
        }
        if ("d2q".equalsIgnoreCase(Build.DEVICE)) {
            z = true;
            a = z;
            str.getClass();
            if (!str.equalsIgnoreCase("Poco")) {
                String str3 = Build.BRAND;
                str3.getClass();
            }
            if ("M2102J20SG".equalsIgnoreCase(Build.MODEL)) {
                z2 = true;
            }
            b = z2;
        }
        z = false;
        a = z;
        str.getClass();
        if (!str.equalsIgnoreCase("Poco")) {
        }
        if ("M2102J20SG".equalsIgnoreCase(Build.MODEL)) {
        }
        b = z2;
    }
}
