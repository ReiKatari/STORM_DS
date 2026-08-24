package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MapUtils {
    public MapUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void writeStringMapToJson(java.lang.StringBuilder r4, java.util.HashMap<java.lang.String, java.lang.String> r5) {
            java.lang.String r0 = "{"
            r4.append(r0)
            java.util.Set r0 = r5.keySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
        Le:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r1 != 0) goto L21
            java.lang.String r1 = ","
            r4.append(r1)
        L21:
            java.lang.Object r1 = r5.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "\""
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = "\":"
            r4.append(r2)
            r2 = 0
            if (r1 != 0) goto L3e
            java.lang.String r1 = "null"
            r4.append(r1)
        L3c:
            r1 = r2
            goto Le
        L3e:
            r4.append(r3)
            r4.append(r1)
            r4.append(r3)
            goto L3c
        L48:
            java.lang.String r5 = "}"
            r4.append(r5)
            return
    }
}
