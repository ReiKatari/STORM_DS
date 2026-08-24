package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p87  reason: default package */
/* loaded from: classes.dex */
public final class p87 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public static ul1 b(zl1 zl1Var) {
        rl1 rl1Var;
        long j;
        if (zl1Var.k()) {
            rl1Var = rl1.DIRECTORY;
        } else {
            rl1Var = rl1.FILE;
        }
        long m = zl1Var.m();
        if (m < 0) {
            m = 0;
        }
        if (zl1Var.l()) {
            j = zl1Var.n();
        } else {
            j = -1;
        }
        return new ul1(rl1Var, m, j);
    }

    public static ul1 c(File file) {
        rl1 rl1Var;
        long j;
        if (file.isDirectory()) {
            rl1Var = rl1.DIRECTORY;
        } else {
            rl1Var = rl1.FILE;
        }
        long lastModified = file.lastModified();
        if (lastModified < 0) {
            lastModified = 0;
        }
        if (file.isFile()) {
            j = file.length();
        } else {
            j = -1;
        }
        return new ul1(rl1Var, lastModified, j);
    }

    public static LinkedHashMap d(qi6 qi6Var, File file) {
        Map h = h(file);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g(qi6Var, "", linkedHashMap);
        List c1 = gt0.c1(ii2.K(h.keySet(), linkedHashMap.keySet()));
        int k0 = c14.k0(ht0.v0(c1, 10));
        if (k0 < 16) {
            k0 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(k0);
        for (Object obj : c1) {
            String str = (String) obj;
            ul1 ul1Var = (ul1) h.get(str);
            if (ul1Var != null) {
                ul1 ul1Var2 = (ul1) linkedHashMap.get(str);
                if (ul1Var2 != null) {
                    linkedHashMap2.put(obj, new sl1(ul1Var.a, ul1Var.b, ul1Var.c, ul1Var2.b, ul1Var2.c));
                } else {
                    e41.h(str, "Missing document snapshot state for ");
                    return null;
                }
            } else {
                e41.h(str, "Missing local snapshot state for ");
                return null;
            }
        }
        return linkedHashMap2;
    }

    public static String e(String str, String str2) {
        if (str.length() == 0) {
            return str2;
        }
        return lb1.m(str, "/", str2);
    }

    public static vl1 f(boolean z, boolean z2, ul1 ul1Var, ul1 ul1Var2, vl1 vl1Var) {
        if (z && !z2) {
            return vl1.LOCAL;
        }
        if (z2 && !z) {
            return vl1.DOCUMENT;
        }
        long j = ul1Var.b;
        long j2 = 0;
        if (j < 0) {
            j = 0;
        }
        long j3 = ul1Var2.b;
        if (j3 >= 0) {
            j2 = j3;
        }
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i != 0) {
            if (i > 0) {
                return vl1.LOCAL;
            }
            return vl1.DOCUMENT;
        }
        return vl1Var;
    }

    public static void g(zl1 zl1Var, String str, LinkedHashMap linkedHashMap) {
        zl1[] o = zl1Var.o();
        o.getClass();
        for (zl1 zl1Var2 : o) {
            String i = zl1Var2.i();
            if (i != null) {
                String e = e(str, i);
                linkedHashMap.put(e, b(zl1Var2));
                if (zl1Var2.k()) {
                    g(zl1Var2, e, linkedHashMap);
                }
            }
        }
    }

    public static Map h(File file) {
        if (!file.exists()) {
            return zt1.A;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i(file, "", linkedHashMap);
        return linkedHashMap;
    }

    public static void i(File file, String str, LinkedHashMap linkedHashMap) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                name.getClass();
                String e = e(str, name);
                linkedHashMap.put(e, c(file2));
                if (file2.isDirectory()) {
                    i(file2, e, linkedHashMap);
                }
            }
        }
    }

    public static boolean l(zl1 zl1Var) {
        if (zl1Var.k()) {
            zl1[] o = zl1Var.o();
            o.getClass();
            for (zl1 zl1Var2 : o) {
                zl1Var2.getClass();
                if (!l(zl1Var2)) {
                    return false;
                }
            }
        }
        return zl1Var.d();
    }

    public static void m(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!jc2.x0(file)) {
                    u34.B(file.getAbsolutePath(), "Could not replace local DLDI file ");
                    return;
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            u34.B(file.getAbsolutePath(), "Could not create ");
        }
    }

    public static boolean n(String str, vl1 vl1Var, ul1 ul1Var, Map map) {
        ul1 ul1Var2;
        sl1 sl1Var = (sl1) map.get(str);
        if (sl1Var == null) {
            if (ul1Var == null) {
                return false;
            }
            return true;
        } else if (ul1Var == null) {
            return true;
        } else {
            int i = wl1.a[vl1Var.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ul1Var2 = new ul1(sl1Var.a, sl1Var.d, sl1Var.e);
                } else {
                    i.d();
                    return false;
                }
            } else {
                ul1Var2 = new ul1(sl1Var.a, sl1Var.b, sl1Var.c);
            }
            return !ul1Var.equals(ul1Var2);
        }
    }

    public static boolean o(String str, vl1 vl1Var, Map map, Map map2) {
        String concat;
        if (!map2.isEmpty()) {
            if (str.length() == 0) {
                concat = "";
            } else {
                concat = str.concat("/");
            }
            ad6 ad6Var = new ad6();
            for (String str2 : map2.keySet()) {
                if (nb3.k(str2, str) || xs6.g0(str2, concat, false)) {
                    ad6Var.add(str2);
                }
            }
            for (String str3 : map.keySet()) {
                if (nb3.k(str3, str) || xs6.g0(str3, concat, false)) {
                    ad6Var.add(str3);
                }
            }
            ad6 p = ii2.p(ad6Var);
            if (p == null || !p.A.isEmpty()) {
                Iterator it = p.iterator();
                while (((o04) it).hasNext()) {
                    String str4 = (String) ((m04) it).next();
                    if (n(str4, vl1Var, (ul1) map2.get(str4), map)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public yy a() {
        String str;
        if (((Size) this.a) == null) {
            str = " resolution";
        } else {
            str = "";
        }
        if (((Size) this.b) == null) {
            str = str.concat(" originalConfiguredResolution");
        }
        if (((yq1) this.c) == null) {
            str = str.concat(" dynamicRange");
        }
        if (((Integer) this.d) == null) {
            str = str.concat(" sessionType");
        }
        if (((Range) this.e) == null) {
            str = str.concat(" expectedFrameRateRange");
        }
        if (((Boolean) this.g) == null) {
            str = str.concat(" zslDisabled");
        }
        if (str.isEmpty()) {
            return new yy((Size) this.a, (Size) this.b, (yq1) this.c, ((Integer) this.d).intValue(), (Range) this.e, (yy0) this.f, ((Boolean) this.g).booleanValue());
        }
        i.m("Missing required properties:".concat(str));
        return null;
    }

    public void j(zl1 zl1Var, File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            m(parentFile);
        }
        if (file.exists() && file.isDirectory() && !jc2.x0(file)) {
            u34.B(file.getAbsolutePath(), "Could not replace local DLDI directory ");
            return;
        }
        InputStream openInputStream = ((Context) this.a).getContentResolver().openInputStream(zl1Var.j());
        if (openInputStream != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                f04.w(openInputStream, fileOutputStream);
                fileOutputStream.close();
                openInputStream.close();
                long m = zl1Var.m();
                if (m > 0) {
                    file.setLastModified(m);
                    return;
                }
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ge7.t(openInputStream, th);
                    throw th2;
                }
            }
        }
        u34.B(zl1Var.j(), "Could not open ");
    }

    public void k(zl1 zl1Var, File file) {
        OutputStream openOutputStream = ((Context) this.a).getContentResolver().openOutputStream(zl1Var.j(), "wt");
        if (openOutputStream != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                f04.w(fileInputStream, openOutputStream);
                fileInputStream.close();
                openOutputStream.close();
            } finally {
            }
        } else {
            Uri j = zl1Var.j();
            throw new IllegalStateException(("Could not open " + j + " for write").toString());
        }
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, p87] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, p87] */
    public void p(fz fzVar, int i) {
        Iterable iterable;
        qx qxVar;
        String str;
        ou O;
        String str2;
        Integer num;
        p87 p87Var;
        long longValue;
        String str3;
        pb7 a = ((m54) this.b).a(fzVar.a);
        i36 i36Var = (i36) this.f;
        Iterable<ty> iterable2 = (Iterable) i36Var.n(new rr6(9, this, fzVar));
        if (!iterable2.iterator().hasNext()) {
            return;
        }
        if (a == null) {
            nj2.l("Uploader", "Unknown backend for %s, deleting event batch for it...", fzVar);
            qxVar = new qx(m00.FATAL_ERROR, -1L);
            iterable = iterable2;
        } else {
            ArrayList arrayList = new ArrayList();
            for (ty tyVar : iterable2) {
                arrayList.add(tyVar.c);
            }
            byte[] bArr = fzVar.b;
            hl0 hl0Var = (hl0) a;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                hy hyVar = (hy) obj;
                String str4 = hyVar.a;
                if (!hashMap.containsKey(str4)) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(hyVar);
                    hashMap.put(str4, arrayList2);
                } else {
                    ((List) hashMap.get(str4)).add(hyVar);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                hy hyVar2 = (hy) ((List) entry.getValue()).get(i2);
                q65 q65Var = q65.DEFAULT;
                long a2 = hl0Var.f.a();
                long a3 = hl0Var.e.a();
                wx wxVar = new wx(qr0.ANDROID_FIREBASE, new ox(Integer.valueOf(hyVar2.b("sdk-version")), hyVar2.a("model"), hyVar2.a("hardware"), hyVar2.a("device"), hyVar2.a("product"), hyVar2.a("os-uild"), hyVar2.a("manufacturer"), hyVar2.a("fingerprint"), hyVar2.a("locale"), hyVar2.a("country"), hyVar2.a("mcc_mnc"), hyVar2.a("application_build")));
                try {
                    num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                    str2 = null;
                } catch (NumberFormatException unused) {
                    str2 = (String) entry.getKey();
                    num = null;
                }
                ArrayList arrayList4 = new ArrayList();
                for (hy hyVar3 : (List) entry.getValue()) {
                    w32 w32Var = hyVar3.c;
                    c42 c42Var = w32Var.a;
                    byte[] bArr2 = w32Var.b;
                    Iterable iterable3 = iterable2;
                    if (c42Var.equals(new c42("proto"))) {
                        ?? obj2 = new Object();
                        obj2.d = bArr2;
                        p87Var = obj2;
                    } else if (c42Var.equals(new c42("json"))) {
                        String str5 = new String(bArr2, Charset.forName("UTF-8"));
                        ?? obj3 = new Object();
                        obj3.e = str5;
                        p87Var = obj3;
                    } else {
                        Log.w("TransportRuntime.".concat("CctTransportBackend"), "Received event of unsupported encoding " + c42Var + ". Skipping...");
                        iterable2 = iterable3;
                    }
                    p87Var.a = Long.valueOf(hyVar3.d);
                    p87Var.c = Long.valueOf(hyVar3.e);
                    String str6 = (String) hyVar3.f.get("tz-offset");
                    if (str6 == null) {
                        longValue = 0;
                    } else {
                        longValue = Long.valueOf(str6).longValue();
                    }
                    p87Var.f = Long.valueOf(longValue);
                    p87Var.g = new qy(se4.forNumber(hyVar3.b("net-type")), re4.forNumber(hyVar3.b("mobile-subtype")));
                    Integer num2 = hyVar3.b;
                    if (num2 != null) {
                        p87Var.b = num2;
                    }
                    if (((Long) p87Var.a) == null) {
                        str3 = " eventTimeMs";
                    } else {
                        str3 = "";
                    }
                    if (((Long) p87Var.c) == null) {
                        str3 = str3.concat(" eventUptimeMs");
                    }
                    if (((Long) p87Var.f) == null) {
                        str3 = str3.concat(" timezoneOffsetSeconds");
                    }
                    if (str3.isEmpty()) {
                        arrayList4.add(new ny(((Long) p87Var.a).longValue(), (Integer) p87Var.b, ((Long) p87Var.c).longValue(), (byte[]) p87Var.d, (String) p87Var.e, ((Long) p87Var.f).longValue(), (qy) p87Var.g));
                        iterable2 = iterable3;
                    } else {
                        i.m("Missing required properties:".concat(str3));
                        return;
                    }
                }
                arrayList3.add(new oy(a2, a3, wxVar, num, str2, arrayList4, q65Var));
                i2 = 0;
            }
            iterable = iterable2;
            rx rxVar = new rx(arrayList3);
            URL url = hl0Var.d;
            if (bArr != null) {
                try {
                    fa0 a4 = fa0.a(bArr);
                    str = a4.b;
                    if (str == null) {
                        str = null;
                    }
                    url = hl0.b(a4.a);
                } catch (IllegalArgumentException unused2) {
                    qxVar = new qx(m00.FATAL_ERROR, -1L);
                }
            } else {
                str = null;
            }
            try {
                bt btVar = new bt(url, rxVar, str, 11);
                os0 os0Var = new os0(hl0Var, 22);
                int i4 = 5;
                do {
                    O = os0Var.O(btVar);
                    URL url2 = (URL) O.c;
                    if (url2 != null) {
                        nj2.l("CctTransportBackend", "Following redirect to: %s", url2);
                        btVar = new bt(url2, (rx) btVar.L, (String) btVar.R, 11);
                    } else {
                        btVar = null;
                    }
                    if (btVar == null) {
                        break;
                    }
                    i4--;
                } while (i4 >= 1);
                int i5 = O.a;
                if (i5 == 200) {
                    qxVar = new qx(m00.OK, O.b);
                } else {
                    if (i5 < 500 && i5 != 404) {
                        qxVar = new qx(m00.FATAL_ERROR, -1L);
                    }
                    qxVar = new qx(m00.TRANSIENT_ERROR, -1L);
                }
            } catch (IOException e) {
                Log.e("TransportRuntime.".concat("CctTransportBackend"), "Could not make request to the backend", e);
                qxVar = new qx(m00.TRANSIENT_ERROR, -1L);
            }
        }
        i36Var.n(new dk0(this, qxVar, iterable, fzVar, i));
    }

    public tl1 q(Uri uri) {
        Object em5Var;
        JSONObject jSONObject;
        String optString;
        File file = (File) this.g;
        boolean isFile = file.isFile();
        zt1 zt1Var = zt1.A;
        if (!isFile) {
            String uri2 = uri.toString();
            uri2.getClass();
            return new tl1(uri2, zt1Var);
        }
        try {
            jSONObject = new JSONObject(jc2.B0(file));
            optString = jSONObject.optString("documentTreeUri");
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (!nb3.k(optString, uri.toString())) {
            String uri3 = uri.toString();
            uri3.getClass();
            return new tl1(uri3, zt1Var);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("entries");
        if (optJSONObject == null) {
            String uri4 = uri.toString();
            uri4.getClass();
            return new tl1(uri4, zt1Var);
        }
        p04 p04Var = new p04();
        Iterator<String> keys = optJSONObject.keys();
        keys.getClass();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
            if (optJSONObject2 != null) {
                String string = optJSONObject2.getString("kind");
                string.getClass();
                p04Var.put(next, new sl1(rl1.valueOf(string), optJSONObject2.optLong("localLastModified", 0L), optJSONObject2.optLong("localLength", -1L), optJSONObject2.optLong("documentLastModified", 0L), optJSONObject2.optLong("documentLength", -1L)));
            }
        }
        em5Var = new tl1(optString, p04Var.b());
        Throwable a = hm5.a(em5Var);
        if (a != null) {
            Log.w("DldiFolderSync", "Could not read DLDI snapshot state", a);
            String uri5 = uri.toString();
            uri5.getClass();
            em5Var = new tl1(uri5, zt1Var);
        }
        return (tl1) em5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        p87 p87Var;
        Object em5Var;
        Throwable a;
        File file = (File) this.e;
        Uri uri = (Uri) this.c;
        if (uri == null) {
            return;
        }
        qi6 h = zl1.h((Context) this.a, uri);
        if (h.e() && h.k()) {
            Context context = h.b;
            Uri uri2 = h.c;
            if (context.checkCallingOrSelfUriPermission(uri2, 2) == 0) {
                String U = hv.U(context, uri2, "mime_type");
                int T = (int) hv.T(context, uri2, "flags", 0L);
                if (!TextUtils.isEmpty(U) && ((T & 4) != 0 || (("vnd.android.document/directory".equals(U) && (T & 8) != 0) || (!TextUtils.isEmpty(U) && (T & 2) != 0)))) {
                    Map map = q(uri).b;
                    Map h2 = h(file);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    g(h, "", linkedHashMap);
                    try {
                        p87Var = this;
                        try {
                            p87Var.s(h, file, vl1.LOCAL, "", map, h2, linkedHashMap);
                            p87Var.v(uri, d(h, file));
                            em5Var = jg7.a;
                        } catch (Throwable th) {
                            th = th;
                            em5Var = new em5(th);
                            a = hm5.a(em5Var);
                            if (a != null) {
                            }
                            p87Var.c = null;
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        p87Var = this;
                    }
                    a = hm5.a(em5Var);
                    if (a != null) {
                        Log.w("DldiFolderSync", "Could not sync DLDI folder after emulation", a);
                    }
                    p87Var.c = null;
                    return;
                }
            }
        }
        Log.w("DldiFolderSync", "Skipping DLDI sync-back because the selected folder is not writable");
        this.c = null;
    }

    public void s(zl1 zl1Var, File file, vl1 vl1Var, String str, Map map, Map map2, Map map3) {
        LinkedHashMap linkedHashMap;
        zt1 zt1Var;
        zt1 zt1Var2;
        m(file);
        zl1[] o = zl1Var.o();
        o.getClass();
        ArrayList arrayList = new ArrayList();
        int length = o.length;
        int i = 0;
        while (true) {
            linkedHashMap = null;
            vr4 vr4Var = null;
            if (i >= length) {
                break;
            }
            zl1 zl1Var2 = o[i];
            String i2 = zl1Var2.i();
            if (i2 != null) {
                vr4Var = new vr4(i2, zl1Var2);
            }
            if (vr4Var != null) {
                arrayList.add(vr4Var);
            }
            i++;
        }
        Map r0 = c14.r0(arrayList);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int k0 = c14.k0(listFiles.length);
            if (k0 < 16) {
                k0 = 16;
            }
            linkedHashMap = new LinkedHashMap(k0);
            for (File file2 : listFiles) {
                linkedHashMap.put(file2.getName(), file2);
            }
        }
        zt1 zt1Var3 = zt1.A;
        if (linkedHashMap == null) {
            zt1Var = zt1Var3;
        } else {
            zt1Var = linkedHashMap;
        }
        for (String str2 : gt0.c1(ii2.K(r0.keySet(), zt1Var.keySet()))) {
            zl1 zl1Var3 = (zl1) r0.get(str2);
            File file3 = (File) zt1Var.get(str2);
            str2.getClass();
            String e = e(str, str2);
            if (zl1Var3 != null || file3 != null) {
                if (zl1Var3 == null && file3 != null) {
                    u(vl1Var, zl1Var, file3, e, map, map2);
                } else if (zl1Var3 != null && file3 == null) {
                    t(vl1Var, zl1Var3, new File(file, str2), e, map, map3);
                    zt1Var2 = zt1Var3;
                    zt1Var3 = zt1Var2;
                } else {
                    zl1Var3.getClass();
                    if (zl1Var3.k()) {
                        file3.getClass();
                        if (file3.isDirectory()) {
                            s(zl1Var3, file3, vl1Var, e, map, map2, map3);
                            zt1Var2 = zt1Var3;
                            zt1Var3 = zt1Var2;
                        }
                    }
                    if (zl1Var3.l()) {
                        file3.getClass();
                        if (file3.isFile()) {
                            ul1 c = c(file3);
                            ul1 b = b(zl1Var3);
                            if (!c.equals(b)) {
                                int i3 = wl1.a[f(n(e, vl1.LOCAL, c, map), n(e, vl1.DOCUMENT, b, map), c, b, vl1Var).ordinal()];
                                if (i3 != 1) {
                                    if (i3 == 2) {
                                        j(zl1Var3, file3);
                                    } else {
                                        i.d();
                                        return;
                                    }
                                } else {
                                    k(zl1Var3, file3);
                                }
                            }
                            zt1Var2 = zt1Var3;
                            zt1Var3 = zt1Var2;
                        }
                    }
                    file3.getClass();
                    int i4 = wl1.a[f(o(e, vl1.LOCAL, map, map2), o(e, vl1.DOCUMENT, map, map3), c(file3), b(zl1Var3), vl1Var).ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            if (file3.exists() && !jc2.x0(file3)) {
                                u34.B(file3.getAbsolutePath(), "Could not replace local DLDI entry ");
                                return;
                            } else {
                                zt1Var2 = zt1Var3;
                                t(vl1Var, zl1Var3, file3, e, zt1Var2, zt1Var3);
                            }
                        } else {
                            i.d();
                            return;
                        }
                    } else {
                        zt1Var2 = zt1Var3;
                        if (l(zl1Var3)) {
                            u(vl1Var, zl1Var, file3, e, zt1Var2, zt1Var2);
                        } else {
                            u34.B(zl1Var3.j(), "Could not replace DLDI document entry ");
                            return;
                        }
                    }
                    zt1Var3 = zt1Var2;
                }
            }
            zt1Var2 = zt1Var3;
            zt1Var3 = zt1Var2;
        }
    }

    public void t(vl1 vl1Var, zl1 zl1Var, File file, String str, Map map, Map map2) {
        sl1 sl1Var = (sl1) map.get(str);
        boolean o = o(str, vl1.DOCUMENT, map, map2);
        if (sl1Var != null && !o) {
            if (!l(zl1Var)) {
                u34.B(zl1Var.j(), "Could not propagate DLDI delete for ");
            }
        } else if (zl1Var.k()) {
            m(file);
            s(zl1Var, file, vl1Var, str, map, zt1.A, map2);
        } else if (zl1Var.l()) {
            j(zl1Var, file);
        }
    }

    public void u(vl1 vl1Var, zl1 zl1Var, File file, String str, Map map, Map map2) {
        sl1 sl1Var = (sl1) map.get(str);
        boolean o = o(str, vl1.LOCAL, map, map2);
        if (sl1Var != null && !o) {
            if (!jc2.x0(file)) {
                u34.B(file.getAbsolutePath(), "Could not propagate DLDI delete for ");
            }
        } else if (file.isDirectory()) {
            String name = file.getName();
            name.getClass();
            zl1 f = zl1Var.f(name);
            if (f != null) {
                if (!f.k()) {
                    int i = wl1.a[vl1Var.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            i.d();
                            return;
                        } else {
                            u34.B(f.j(), "Cannot replace DLDI file with directory at ");
                            return;
                        }
                    } else if (!l(f)) {
                        u34.B(f.j(), "Could not replace DLDI file ");
                        return;
                    }
                }
                s(f, file, vl1Var, str, map, map2, zt1.A);
            }
            f = zl1Var.b(name);
            if (f == null) {
                throw new IllegalStateException("Could not create DLDI directory ".concat(name).toString());
            }
            s(f, file, vl1Var, str, map, map2, zt1.A);
        } else if (file.isFile()) {
            String name2 = file.getName();
            name2.getClass();
            zl1 f2 = zl1Var.f(name2);
            if (f2 != null) {
                if (!f2.l()) {
                    int i2 = wl1.a[vl1Var.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            i.d();
                            return;
                        } else {
                            u34.B(f2.j(), "Cannot replace DLDI directory with file at ");
                            return;
                        }
                    } else if (!l(f2)) {
                        u34.B(f2.j(), "Could not replace DLDI directory ");
                        return;
                    }
                }
                k(f2, file);
            }
            f2 = zl1Var.c("application/octet-stream", name2);
            if (f2 == null) {
                throw new IllegalStateException("Could not create DLDI file ".concat(name2).toString());
            }
            k(f2, file);
        }
    }

    public void v(Uri uri, LinkedHashMap linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : new TreeMap(linkedHashMap).entrySet()) {
            sl1 sl1Var = (sl1) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("kind", sl1Var.a.name());
            jSONObject2.put("localLastModified", sl1Var.b);
            jSONObject2.put("localLength", sl1Var.c);
            jSONObject2.put("documentLastModified", sl1Var.d);
            jSONObject2.put("documentLength", sl1Var.e);
            jSONObject.put((String) entry.getKey(), jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("documentTreeUri", uri.toString());
        jSONObject3.put("entries", jSONObject);
        String jSONObject4 = jSONObject3.toString();
        jSONObject4.getClass();
        jc2.F0((File) this.g, jSONObject4);
    }
}
