package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tm1  reason: default package */
/* loaded from: classes.dex */
public abstract class tm1 {
    public static final LinkedHashMap a;
    public static final LinkedHashMap b;

    static {
        sm1 sm1Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        b = linkedHashMap2;
        sm1 sm1Var2 = sm1.d;
        linkedHashMap.put(1L, sm1Var2);
        linkedHashMap2.put(sm1Var2, l07.b0(1L));
        linkedHashMap.put(2L, sm1.e);
        linkedHashMap2.put(linkedHashMap.get(2L), l07.b0(2L));
        sm1 sm1Var3 = sm1.f;
        linkedHashMap.put(4L, sm1Var3);
        linkedHashMap2.put(sm1Var3, l07.b0(4L));
        sm1 sm1Var4 = sm1.g;
        linkedHashMap.put(8L, sm1Var4);
        linkedHashMap2.put(sm1Var4, l07.b0(8L));
        List c0 = l07.c0(64L, 128L, 16L, 32L);
        Iterator it = c0.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            sm1Var = sm1.h;
            if (!hasNext) {
                break;
            }
            a.put(Long.valueOf(((Number) it.next()).longValue()), sm1Var);
        }
        b.put(sm1Var, c0);
        List c02 = l07.c0(1024L, 2048L, 256L, 512L);
        Iterator it2 = c02.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            sm1 sm1Var5 = sm1.i;
            if (hasNext2) {
                a.put(Long.valueOf(((Number) it2.next()).longValue()), sm1Var5);
            } else {
                b.put(sm1Var5, c02);
                return;
            }
        }
    }

    public static Long a(sm1 sm1Var, DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        sm1Var.getClass();
        dynamicRangeProfiles.getClass();
        List<Number> list = (List) b.get(sm1Var);
        if (list != null) {
            supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
            supportedProfiles.getClass();
            for (Number number : list) {
                long longValue = number.longValue();
                if (supportedProfiles.contains(Long.valueOf(longValue))) {
                    return Long.valueOf(longValue);
                }
            }
            return null;
        }
        return null;
    }
}
