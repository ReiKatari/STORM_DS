package wi;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final e[] f14251a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map f14252b;

    static {
        e eVar = new e(e.f14232i, "");
        fj.h hVar = e.f14229f;
        e eVar2 = new e(hVar, "GET");
        e eVar3 = new e(hVar, "POST");
        fj.h hVar2 = e.f14230g;
        e eVar4 = new e(hVar2, "/");
        e eVar5 = new e(hVar2, "/index.html");
        fj.h hVar3 = e.f14231h;
        e eVar6 = new e(hVar3, "http");
        e eVar7 = new e(hVar3, "https");
        fj.h hVar4 = e.f14228e;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, new e(hVar4, "200"), new e(hVar4, "204"), new e(hVar4, "206"), new e(hVar4, "304"), new e(hVar4, "400"), new e(hVar4, "404"), new e(hVar4, "500"), new e("accept-charset", ""), new e("accept-encoding", "gzip, deflate"), new e("accept-language", ""), new e("accept-ranges", ""), new e("accept", ""), new e("access-control-allow-origin", ""), new e("age", ""), new e("allow", ""), new e("authorization", ""), new e("cache-control", ""), new e("content-disposition", ""), new e("content-encoding", ""), new e("content-language", ""), new e("content-length", ""), new e("content-location", ""), new e("content-range", ""), new e("content-type", ""), new e("cookie", ""), new e("date", ""), new e("etag", ""), new e("expect", ""), new e("expires", ""), new e("from", ""), new e("host", ""), new e("if-match", ""), new e("if-modified-since", ""), new e("if-none-match", ""), new e("if-range", ""), new e("if-unmodified-since", ""), new e("last-modified", ""), new e("link", ""), new e("location", ""), new e("max-forwards", ""), new e("proxy-authenticate", ""), new e("proxy-authorization", ""), new e("range", ""), new e("referer", ""), new e("refresh", ""), new e("retry-after", ""), new e("server", ""), new e("set-cookie", ""), new e("strict-transport-security", ""), new e("transfer-encoding", ""), new e("user-agent", ""), new e("vary", ""), new e("via", ""), new e("www-authenticate", "")};
        f14251a = eVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i2 = 0; i2 < 61; i2++) {
            if (!linkedHashMap.containsKey(eVarArr[i2].f14233a)) {
                linkedHashMap.put(eVarArr[i2].f14233a, Integer.valueOf(i2));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        f14252b = unmodifiableMap;
    }

    public static void a(fj.h hVar) {
        hVar.getClass();
        int d4 = hVar.d();
        for (int i2 = 0; i2 < d4; i2++) {
            byte i10 = hVar.i(i2);
            if (65 <= i10 && i10 < 91) {
                fj.j.h("PROTOCOL_ERROR response malformed: mixed case name: ".concat(hVar.r()));
                return;
            }
        }
    }
}
