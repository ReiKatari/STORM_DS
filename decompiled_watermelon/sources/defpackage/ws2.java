package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ws2  reason: default package */
/* loaded from: classes.dex */
public abstract class ws2 {
    public static final tq2[] a;
    public static final Map b;

    static {
        tq2 tq2Var = new tq2(tq2.i, "");
        w70 w70Var = tq2.f;
        tq2 tq2Var2 = new tq2(w70Var, "GET");
        tq2 tq2Var3 = new tq2(w70Var, "POST");
        w70 w70Var2 = tq2.g;
        tq2 tq2Var4 = new tq2(w70Var2, "/");
        tq2 tq2Var5 = new tq2(w70Var2, "/index.html");
        w70 w70Var3 = tq2.h;
        tq2 tq2Var6 = new tq2(w70Var3, "http");
        tq2 tq2Var7 = new tq2(w70Var3, "https");
        w70 w70Var4 = tq2.e;
        tq2[] tq2VarArr = {tq2Var, tq2Var2, tq2Var3, tq2Var4, tq2Var5, tq2Var6, tq2Var7, new tq2(w70Var4, "200"), new tq2(w70Var4, "204"), new tq2(w70Var4, "206"), new tq2(w70Var4, "304"), new tq2(w70Var4, "400"), new tq2(w70Var4, "404"), new tq2(w70Var4, "500"), new tq2("accept-charset", ""), new tq2("accept-encoding", "gzip, deflate"), new tq2("accept-language", ""), new tq2("accept-ranges", ""), new tq2("accept", ""), new tq2("access-control-allow-origin", ""), new tq2("age", ""), new tq2("allow", ""), new tq2("authorization", ""), new tq2("cache-control", ""), new tq2("content-disposition", ""), new tq2("content-encoding", ""), new tq2("content-language", ""), new tq2("content-length", ""), new tq2("content-location", ""), new tq2("content-range", ""), new tq2("content-type", ""), new tq2("cookie", ""), new tq2("date", ""), new tq2("etag", ""), new tq2("expect", ""), new tq2("expires", ""), new tq2("from", ""), new tq2("host", ""), new tq2("if-match", ""), new tq2("if-modified-since", ""), new tq2("if-none-match", ""), new tq2("if-range", ""), new tq2("if-unmodified-since", ""), new tq2("last-modified", ""), new tq2("link", ""), new tq2("location", ""), new tq2("max-forwards", ""), new tq2("proxy-authenticate", ""), new tq2("proxy-authorization", ""), new tq2("range", ""), new tq2("referer", ""), new tq2("refresh", ""), new tq2("retry-after", ""), new tq2("server", ""), new tq2("set-cookie", ""), new tq2("strict-transport-security", ""), new tq2("transfer-encoding", ""), new tq2("user-agent", ""), new tq2("vary", ""), new tq2("via", ""), new tq2("www-authenticate", "")};
        a = tq2VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(tq2VarArr[i].a)) {
                linkedHashMap.put(tq2VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(w70 w70Var) {
        w70Var.getClass();
        int d = w70Var.d();
        for (int i = 0; i < d; i++) {
            byte i2 = w70Var.i(i);
            if (65 <= i2 && i2 < 91) {
                f81.j("PROTOCOL_ERROR response malformed: mixed case name: ".concat(w70Var.r()));
                return;
            }
        }
    }
}
