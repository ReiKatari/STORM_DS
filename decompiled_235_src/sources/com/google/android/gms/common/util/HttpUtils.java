package com.google.android.gms.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class HttpUtils {
    private static final Pattern zza = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final Pattern zzb = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final Pattern zzc = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private HttpUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap] */
    public static Map<String, String> parse(URI uri, String str) {
        ?? r0 = Collections.EMPTY_MAP;
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            r0 = new HashMap();
            g60 g60Var = new g60(false, (Object) new j97(new y28('='), 17));
            g60 g60Var2 = new g60(true, (Object) new j97(new y28('&'), 17));
            z28 z28Var = new z28((j97) g60Var2.B, g60Var2, rawQuery);
            while (z28Var.hasNext()) {
                String str2 = (String) z28Var.next();
                str2.getClass();
                z28 z28Var2 = new z28((j97) g60Var.B, g60Var, str2);
                ArrayList arrayList = new ArrayList();
                while (z28Var2.hasNext()) {
                    arrayList.add((String) z28Var2.next());
                }
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                String str3 = null;
                if (!unmodifiableList.isEmpty() && unmodifiableList.size() <= 2) {
                    String zza2 = zza((String) unmodifiableList.get(0), str);
                    if (unmodifiableList.size() == 2) {
                        str3 = zza((String) unmodifiableList.get(1), str);
                    }
                    r0.put(zza2, str3);
                } else {
                    i.h("bad parameter");
                    return null;
                }
            }
        }
        return r0;
    }

    private static String zza(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
