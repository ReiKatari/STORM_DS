package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import j0.d2;
import j0.k1;
import java.util.HashMap;
import java.util.Locale;
import z.b;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ExtraCroppingQuirk implements k1 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f1034a;

    static {
        HashMap hashMap = new HashMap();
        f1034a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    public static Size b(d2 d2Var) {
        if (c()) {
            int i2 = b.f14848a[d2Var.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
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

    public static boolean c() {
        if ("samsung".equalsIgnoreCase(Build.BRAND)) {
            String str = Build.MODEL;
            Locale locale = Locale.US;
            String upperCase = str.toUpperCase(locale);
            HashMap hashMap = f1034a;
            if (hashMap.containsKey(upperCase)) {
                Range range = (Range) hashMap.get(str.toUpperCase(locale));
                if (range == null) {
                    return true;
                }
                return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
            }
            return false;
        }
        return false;
    }
}
