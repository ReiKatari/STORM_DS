package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements u65 {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
        if (r0.equalsIgnoreCase("Sony") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
        if (r0.equalsIgnoreCase("Samsung") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r2.equalsIgnoreCase("Xiaomi") != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    static {
        boolean z;
        List<String> c0;
        boolean z2;
        String str;
        int i;
        String str2 = Build.HARDWARE;
        a = nb3.k(str2, "samsungexynos7570");
        b = nb3.k(str2, "samsungexynos7870");
        String str3 = Build.MANUFACTURER;
        str3.getClass();
        boolean z3 = false;
        if (!str3.equalsIgnoreCase("Xiaomi")) {
            String str4 = Build.BRAND;
            str4.getClass();
        }
        String str5 = Build.DEVICE;
        str5.getClass();
        String lowerCase = str5.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (fv.o0(new String[]{"aurora", "houji"}, lowerCase)) {
            z = true;
            c = z;
            str3.getClass();
            if (!str3.equalsIgnoreCase("Sony")) {
                String str6 = Build.BRAND;
                str6.getClass();
            }
            c0 = hf.c0("XQ-DQ", "SO", "A301SO");
            if (!c0.isEmpty()) {
                for (String str7 : c0) {
                    String str8 = Build.DEVICE;
                    str8.getClass();
                    if (xs6.g0(str8, str7, true)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            d = z2;
            str = Build.MANUFACTURER;
            str.getClass();
            if (!str.equalsIgnoreCase("Samsung")) {
                String str9 = Build.BRAND;
                str9.getClass();
            }
            i = Build.VERSION.SDK_INT;
            if (i >= 31 && i <= 34) {
                z3 = true;
            }
            e = z3;
        }
        z = false;
        c = z;
        str3.getClass();
        if (!str3.equalsIgnoreCase("Sony")) {
        }
        c0 = hf.c0("XQ-DQ", "SO", "A301SO");
        if (!c0.isEmpty()) {
        }
        z2 = false;
        d = z2;
        str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
        }
        i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            z3 = true;
        }
        e = z3;
    }
}
