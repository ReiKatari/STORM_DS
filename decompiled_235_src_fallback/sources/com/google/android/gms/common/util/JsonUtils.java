package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class JsonUtils {
    private static final java.util.regex.Pattern zza = null;
    private static final java.util.regex.Pattern zzb = null;

    static {
            java.lang.String r0 = "\\\\."
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.common.util.JsonUtils.zza = r0
            java.lang.String r0 = "[\\\\\"/\b\f\n\r\t]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.common.util.JsonUtils.zzb = r0
            return
    }

    private JsonUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean areJsonValuesEquivalent(java.lang.Object r5, java.lang.Object r6) {
            r0 = 1
            if (r5 != 0) goto L7
            if (r6 == 0) goto L6
            goto L7
        L6:
            return r0
        L7:
            r1 = 0
            if (r5 == 0) goto L85
            if (r6 != 0) goto Le
            goto L85
        Le:
            boolean r2 = r5 instanceof org.json.JSONObject
            if (r2 == 0) goto L4f
            boolean r2 = r6 instanceof org.json.JSONObject
            if (r2 == 0) goto L4f
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            int r2 = r5.length()
            int r3 = r6.length()
            if (r2 == r3) goto L25
            return r1
        L25:
            java.util.Iterator r2 = r5.keys()
        L29:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r6.has(r3)
            if (r4 != 0) goto L3c
            return r1
        L3c:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: org.json.JSONException -> L4d
            java.lang.Object r4 = r5.get(r3)     // Catch: org.json.JSONException -> L4d
            java.lang.Object r3 = r6.get(r3)     // Catch: org.json.JSONException -> L4d
            boolean r3 = areJsonValuesEquivalent(r4, r3)     // Catch: org.json.JSONException -> L4d
            if (r3 != 0) goto L29
        L4d:
            return r1
        L4e:
            return r0
        L4f:
            boolean r2 = r5 instanceof org.json.JSONArray
            if (r2 == 0) goto L80
            boolean r2 = r6 instanceof org.json.JSONArray
            if (r2 == 0) goto L80
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            org.json.JSONArray r6 = (org.json.JSONArray) r6
            int r2 = r5.length()
            int r3 = r6.length()
            if (r2 != r3) goto L7f
            r2 = r1
        L66:
            int r3 = r5.length()
            if (r2 >= r3) goto L7e
            java.lang.Object r3 = r5.get(r2)     // Catch: org.json.JSONException -> L7d
            java.lang.Object r4 = r6.get(r2)     // Catch: org.json.JSONException -> L7d
            boolean r3 = areJsonValuesEquivalent(r3, r4)     // Catch: org.json.JSONException -> L7d
            if (r3 == 0) goto L7d
            int r2 = r2 + 1
            goto L66
        L7d:
            return r1
        L7e:
            return r0
        L7f:
            return r1
        L80:
            boolean r5 = r5.equals(r6)
            return r5
        L85:
            return r1
    }

    public static java.lang.String escapeString(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L75
            java.util.regex.Pattern r0 = com.google.android.gms.common.util.JsonUtils.zzb
            java.util.regex.Matcher r0 = r0.matcher(r4)
            r1 = 0
        Ld:
            boolean r2 = r0.find()
            if (r2 == 0) goto L6b
            if (r1 != 0) goto L1a
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
        L1a:
            java.lang.String r2 = r0.group()
            r3 = 0
            char r2 = r2.charAt(r3)
            r3 = 12
            if (r2 == r3) goto L65
            r3 = 13
            if (r2 == r3) goto L5f
            r3 = 34
            if (r2 == r3) goto L59
            r3 = 47
            if (r2 == r3) goto L53
            r3 = 92
            if (r2 == r3) goto L4d
            switch(r2) {
                case 8: goto L47;
                case 9: goto L41;
                case 10: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto Ld
        L3b:
            java.lang.String r2 = "\\\\n"
            r0.appendReplacement(r1, r2)
            goto Ld
        L41:
            java.lang.String r2 = "\\\\t"
            r0.appendReplacement(r1, r2)
            goto Ld
        L47:
            java.lang.String r2 = "\\\\b"
            r0.appendReplacement(r1, r2)
            goto Ld
        L4d:
            java.lang.String r2 = "\\\\\\\\"
            r0.appendReplacement(r1, r2)
            goto Ld
        L53:
            java.lang.String r2 = "\\\\/"
            r0.appendReplacement(r1, r2)
            goto Ld
        L59:
            java.lang.String r2 = "\\\\\\\""
            r0.appendReplacement(r1, r2)
            goto Ld
        L5f:
            java.lang.String r2 = "\\\\r"
            r0.appendReplacement(r1, r2)
            goto Ld
        L65:
            java.lang.String r2 = "\\\\f"
            r0.appendReplacement(r1, r2)
            goto Ld
        L6b:
            if (r1 != 0) goto L6e
            goto L75
        L6e:
            r0.appendTail(r1)
            java.lang.String r4 = r1.toString()
        L75:
            return r4
    }

    public static java.lang.String unescapeString(java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L88
            java.lang.String r5 = com.google.android.gms.common.util.zzc.zza(r5)
            java.util.regex.Pattern r0 = com.google.android.gms.common.util.JsonUtils.zza
            java.util.regex.Matcher r0 = r0.matcher(r5)
            r1 = 0
            r2 = r1
        L12:
            boolean r3 = r0.find()
            if (r3 == 0) goto L7e
            if (r2 != 0) goto L1f
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
        L1f:
            java.lang.String r3 = r0.group()
            r4 = 1
            char r3 = r3.charAt(r4)
            r4 = 34
            if (r3 == r4) goto L78
            r4 = 47
            if (r3 == r4) goto L72
            r4 = 92
            if (r3 == r4) goto L6c
            r4 = 98
            if (r3 == r4) goto L66
            r4 = 102(0x66, float:1.43E-43)
            if (r3 == r4) goto L60
            r4 = 110(0x6e, float:1.54E-43)
            if (r3 == r4) goto L5a
            r4 = 114(0x72, float:1.6E-43)
            if (r3 == r4) goto L54
            r4 = 116(0x74, float:1.63E-43)
            if (r3 != r4) goto L4e
            java.lang.String r3 = "\t"
            r0.appendReplacement(r2, r3)
            goto L12
        L4e:
            java.lang.String r5 = "Found an escaped character that should never be."
            defpackage.i.m(r5)
            return r1
        L54:
            java.lang.String r3 = "\r"
            r0.appendReplacement(r2, r3)
            goto L12
        L5a:
            java.lang.String r3 = "\n"
            r0.appendReplacement(r2, r3)
            goto L12
        L60:
            java.lang.String r3 = "\f"
            r0.appendReplacement(r2, r3)
            goto L12
        L66:
            java.lang.String r3 = "\b"
            r0.appendReplacement(r2, r3)
            goto L12
        L6c:
            java.lang.String r3 = "\\\\"
            r0.appendReplacement(r2, r3)
            goto L12
        L72:
            java.lang.String r3 = "/"
            r0.appendReplacement(r2, r3)
            goto L12
        L78:
            java.lang.String r3 = "\""
            r0.appendReplacement(r2, r3)
            goto L12
        L7e:
            if (r2 != 0) goto L81
            return r5
        L81:
            r0.appendTail(r2)
            java.lang.String r5 = r2.toString()
        L88:
            return r5
    }
}
