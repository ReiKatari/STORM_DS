package y;

import android.hardware.camera2.params.DynamicRangeProfiles;
import d0.a0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f14631a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f14632b;

    static {
        a0 a0Var;
        HashMap hashMap = new HashMap();
        f14631a = hashMap;
        HashMap hashMap2 = new HashMap();
        f14632b = hashMap2;
        a0 a0Var2 = a0.f3320d;
        hashMap.put(1L, a0Var2);
        hashMap2.put(a0Var2, Collections.singletonList(1L));
        hashMap.put(2L, a0.f3321e);
        hashMap2.put((a0) hashMap.get(2L), Collections.singletonList(2L));
        a0 a0Var3 = a0.f3322f;
        hashMap.put(4L, a0Var3);
        hashMap2.put(a0Var3, Collections.singletonList(4L));
        a0 a0Var4 = a0.f3323g;
        hashMap.put(8L, a0Var4);
        hashMap2.put(a0Var4, Collections.singletonList(8L));
        List asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = asList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            a0Var = a0.f3324h;
            if (!hasNext) {
                break;
            }
            f14631a.put((Long) it.next(), a0Var);
        }
        f14632b.put(a0Var, asList);
        List asList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = asList2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            a0 a0Var5 = a0.f3325i;
            if (hasNext2) {
                f14631a.put((Long) it2.next(), a0Var5);
            } else {
                f14632b.put(a0Var5, asList2);
                return;
            }
        }
    }

    public static Long a(a0 a0Var, DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        List<Long> list = (List) f14632b.get(a0Var);
        if (list != null) {
            supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
            for (Long l10 : list) {
                if (supportedProfiles.contains(l10)) {
                    return l10;
                }
            }
            return null;
        }
        return null;
    }
}
