package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class HttpUtils {
    private static final java.util.regex.Pattern zza = null;
    private static final java.util.regex.Pattern zzb = null;
    private static final java.util.regex.Pattern zzc = null;

    static {
            java.lang.String r0 = "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.common.util.HttpUtils.zza = r0
            java.lang.String r0 = "^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.common.util.HttpUtils.zzb = r0
            java.lang.String r0 = "^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.common.util.HttpUtils.zzc = r0
            return
    }

    private HttpUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Map<java.lang.String, java.lang.String> parse(java.net.URI r9, java.lang.String r10) {
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            java.lang.String r9 = r9.getRawQuery()
            if (r9 == 0) goto La5
            int r1 = r9.length()
            if (r1 <= 0) goto La5
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            y28 r1 = new y28
            r2 = 61
            r1.<init>(r2)
            g60 r2 = new g60
            j97 r3 = new j97
            r4 = 17
            r3.<init>(r1, r4)
            r1 = 0
            r2.<init>(r1, r3)
            y28 r3 = new y28
            r5 = 38
            r3.<init>(r5)
            j97 r5 = new j97
            r5.<init>(r3, r4)
            g60 r3 = new g60
            r4 = 1
            r3.<init>(r4, r5)
            z28 r5 = new z28
            java.lang.Object r6 = r3.B
            j97 r6 = (defpackage.j97) r6
            r5.<init>(r6, r3, r9)
        L42:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto La5
            java.lang.Object r9 = r5.next()
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            z28 r3 = new z28
            java.lang.Object r6 = r2.B
            j97 r6 = (defpackage.j97) r6
            r3.<init>(r6, r2, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L5f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L6f
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            r9.add(r6)
            goto L5f
        L6f:
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            boolean r3 = r9.isEmpty()
            r6 = 0
            if (r3 != 0) goto L9f
            int r3 = r9.size()
            r7 = 2
            if (r3 > r7) goto L9f
            java.lang.Object r3 = r9.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = zza(r3, r10)
            int r8 = r9.size()
            if (r8 != r7) goto L9b
            java.lang.Object r9 = r9.get(r4)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r6 = zza(r9, r10)
        L9b:
            r0.put(r3, r6)
            goto L42
        L9f:
            java.lang.String r9 = "bad parameter"
            defpackage.i.h(r9)
            return r6
        La5:
            return r0
    }

    private static java.lang.String zza(java.lang.String r0, java.lang.String r1) {
            if (r1 != 0) goto L4
            java.lang.String r1 = "ISO-8859-1"
        L4:
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }
}
