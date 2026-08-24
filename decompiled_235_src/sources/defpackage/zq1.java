package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zq1  reason: default package */
/* loaded from: classes.dex */
public abstract class zq1 {
    public static final LinkedHashMap a;
    public static final LinkedHashMap b;

    static {
        yq1 yq1Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        b = linkedHashMap2;
        yq1 yq1Var2 = yq1.d;
        linkedHashMap.put(1L, yq1Var2);
        linkedHashMap2.put(yq1Var2, hf.b0(1L));
        linkedHashMap.put(2L, yq1.e);
        linkedHashMap2.put(linkedHashMap.get(2L), hf.b0(2L));
        yq1 yq1Var3 = yq1.f;
        linkedHashMap.put(4L, yq1Var3);
        linkedHashMap2.put(yq1Var3, hf.b0(4L));
        yq1 yq1Var4 = yq1.g;
        linkedHashMap.put(8L, yq1Var4);
        linkedHashMap2.put(yq1Var4, hf.b0(8L));
        List c0 = hf.c0(64L, 128L, 16L, 32L);
        Iterator it = c0.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            yq1Var = yq1.h;
            if (!hasNext) {
                break;
            }
            a.put(Long.valueOf(((Number) it.next()).longValue()), yq1Var);
        }
        b.put(yq1Var, c0);
        List c02 = hf.c0(1024L, 2048L, 256L, 512L);
        Iterator it2 = c02.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            yq1 yq1Var5 = yq1.i;
            if (hasNext2) {
                a.put(Long.valueOf(((Number) it2.next()).longValue()), yq1Var5);
            } else {
                b.put(yq1Var5, c02);
                return;
            }
        }
    }

    public static Long a(yq1 yq1Var, DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        yq1Var.getClass();
        dynamicRangeProfiles.getClass();
        List<Number> list = (List) b.get(yq1Var);
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
