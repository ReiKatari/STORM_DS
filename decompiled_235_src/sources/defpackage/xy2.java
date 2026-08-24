package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xy2  reason: default package */
/* loaded from: classes.dex */
public abstract class xy2 {
    public static final uw2[] a;
    public static final Map b;

    static {
        uw2 uw2Var = new uw2(uw2.i, "");
        da0 da0Var = uw2.f;
        uw2 uw2Var2 = new uw2(da0Var, "GET");
        uw2 uw2Var3 = new uw2(da0Var, "POST");
        da0 da0Var2 = uw2.g;
        uw2 uw2Var4 = new uw2(da0Var2, "/");
        uw2 uw2Var5 = new uw2(da0Var2, "/index.html");
        da0 da0Var3 = uw2.h;
        uw2 uw2Var6 = new uw2(da0Var3, "http");
        uw2 uw2Var7 = new uw2(da0Var3, "https");
        da0 da0Var4 = uw2.e;
        uw2[] uw2VarArr = {uw2Var, uw2Var2, uw2Var3, uw2Var4, uw2Var5, uw2Var6, uw2Var7, new uw2(da0Var4, "200"), new uw2(da0Var4, "204"), new uw2(da0Var4, "206"), new uw2(da0Var4, "304"), new uw2(da0Var4, "400"), new uw2(da0Var4, "404"), new uw2(da0Var4, "500"), new uw2("accept-charset", ""), new uw2("accept-encoding", "gzip, deflate"), new uw2("accept-language", ""), new uw2("accept-ranges", ""), new uw2("accept", ""), new uw2("access-control-allow-origin", ""), new uw2("age", ""), new uw2("allow", ""), new uw2("authorization", ""), new uw2("cache-control", ""), new uw2("content-disposition", ""), new uw2("content-encoding", ""), new uw2("content-language", ""), new uw2("content-length", ""), new uw2("content-location", ""), new uw2("content-range", ""), new uw2("content-type", ""), new uw2("cookie", ""), new uw2("date", ""), new uw2("etag", ""), new uw2("expect", ""), new uw2("expires", ""), new uw2("from", ""), new uw2("host", ""), new uw2("if-match", ""), new uw2("if-modified-since", ""), new uw2("if-none-match", ""), new uw2("if-range", ""), new uw2("if-unmodified-since", ""), new uw2("last-modified", ""), new uw2("link", ""), new uw2("location", ""), new uw2("max-forwards", ""), new uw2("proxy-authenticate", ""), new uw2("proxy-authorization", ""), new uw2("range", ""), new uw2("referer", ""), new uw2("refresh", ""), new uw2("retry-after", ""), new uw2("server", ""), new uw2("set-cookie", ""), new uw2("strict-transport-security", ""), new uw2("transfer-encoding", ""), new uw2("user-agent", ""), new uw2("vary", ""), new uw2("via", ""), new uw2("www-authenticate", "")};
        a = uw2VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(uw2VarArr[i].a)) {
                linkedHashMap.put(uw2VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(da0 da0Var) {
        da0Var.getClass();
        int d = da0Var.d();
        for (int i = 0; i < d; i++) {
            byte i2 = da0Var.i(i);
            if (65 <= i2 && i2 < 91) {
                e41.i("PROTOCOL_ERROR response malformed: mixed case name: ".concat(da0Var.s()));
                return;
            }
        }
    }
}
