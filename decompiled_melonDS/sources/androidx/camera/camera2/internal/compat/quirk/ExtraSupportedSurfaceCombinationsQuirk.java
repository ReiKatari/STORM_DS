package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import j0.a2;
import j0.b2;
import j0.d2;
import j0.f2;
import j0.k1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kc.a;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements k1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a2 f1035a;

    /* renamed from: b  reason: collision with root package name */
    public static final a2 f1036b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashSet f1037c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashSet f1038d;

    static {
        a2 a2Var = new a2();
        d2 d2Var = d2.YUV;
        b2 b2Var = b2.VGA;
        a2Var.a(f2.a(d2Var, b2Var));
        d2 d2Var2 = d2.PRIV;
        b2 b2Var2 = b2.PREVIEW;
        a2Var.a(f2.a(d2Var2, b2Var2));
        b2 b2Var3 = b2.MAXIMUM;
        a2Var.a(f2.a(d2Var, b2Var3));
        f1035a = a2Var;
        a2 a2Var2 = new a2();
        a.n(d2Var2, b2Var2, a2Var2, d2Var2, b2Var);
        a2Var2.a(f2.a(d2Var, b2Var3));
        f1036b = a2Var2;
        f1037c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"));
        f1038d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"));
    }

    public static boolean b() {
        if ("samsung".equalsIgnoreCase(Build.BRAND)) {
            String upperCase = Build.MODEL.toUpperCase(Locale.US);
            Iterator it = f1038d.iterator();
            while (it.hasNext()) {
                if (upperCase.startsWith((String) it.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
