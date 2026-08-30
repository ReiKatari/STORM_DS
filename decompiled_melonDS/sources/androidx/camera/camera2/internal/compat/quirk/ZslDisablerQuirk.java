package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import j0.k1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ZslDisablerQuirk implements k1 {

    /* renamed from: a  reason: collision with root package name */
    public static final List f1060a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1");

    /* renamed from: b  reason: collision with root package name */
    public static final List f1061b = Arrays.asList("MI 8");

    public static boolean b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
