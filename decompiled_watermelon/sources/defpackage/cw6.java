package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cw6  reason: default package */
/* loaded from: classes.dex */
public final class cw6 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Serializable g;

    public static ph1 b(uh1 uh1Var) {
        mh1 mh1Var;
        long j;
        if (uh1Var.k()) {
            mh1Var = mh1.DIRECTORY;
        } else {
            mh1Var = mh1.FILE;
        }
        long m = uh1Var.m();
        if (m < 0) {
            m = 0;
        }
        if (uh1Var.l()) {
            j = uh1Var.n();
        } else {
            j = -1;
        }
        return new ph1(mh1Var, m, j);
    }

    public static ph1 c(File file) {
        mh1 mh1Var;
        long j;
        if (file.isDirectory()) {
            mh1Var = mh1.DIRECTORY;
        } else {
            mh1Var = mh1.FILE;
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
        return new ph1(mh1Var, lastModified, j);
    }

    public static LinkedHashMap d(c76 c76Var, File file) {
        Map h = h(file);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g(c76Var, "", linkedHashMap);
        List f1 = tq0.f1(hi2.O(h.keySet(), linkedHashMap.keySet()));
        int j0 = zt3.j0(uq0.y0(f1, 10));
        if (j0 < 16) {
            j0 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(j0);
        for (Object obj : f1) {
            String str = (String) obj;
            ph1 ph1Var = (ph1) h.get(str);
            if (ph1Var != null) {
                ph1 ph1Var2 = (ph1) linkedHashMap.get(str);
                if (ph1Var2 != null) {
                    linkedHashMap2.put(obj, new nh1(ph1Var.a, ph1Var.b, ph1Var.c, ph1Var2.b, ph1Var2.c));
                } else {
                    f81.p(str, "Missing document snapshot state for ");
                    return null;
                }
            } else {
                f81.p(str, "Missing local snapshot state for ");
                return null;
            }
        }
        return linkedHashMap2;
    }

    public static String e(String str, String str2) {
        if (str.length() == 0) {
            return str2;
        }
        return wh1.l(str, "/", str2);
    }

    public static qh1 f(boolean z, boolean z2, ph1 ph1Var, ph1 ph1Var2, qh1 qh1Var) {
        if (z && !z2) {
            return qh1.LOCAL;
        }
        if (z2 && !z) {
            return qh1.DOCUMENT;
        }
        long j = ph1Var.b;
        long j2 = 0;
        if (j < 0) {
            j = 0;
        }
        long j3 = ph1Var2.b;
        if (j3 >= 0) {
            j2 = j3;
        }
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i != 0) {
            if (i > 0) {
                return qh1.LOCAL;
            }
            return qh1.DOCUMENT;
        }
        return qh1Var;
    }

    public static void g(uh1 uh1Var, String str, LinkedHashMap linkedHashMap) {
        uh1[] o = uh1Var.o();
        o.getClass();
        for (uh1 uh1Var2 : o) {
            String i = uh1Var2.i();
            if (i != null) {
                String e = e(str, i);
                linkedHashMap.put(e, b(uh1Var2));
                if (uh1Var2.k()) {
                    g(uh1Var2, e, linkedHashMap);
                }
            }
        }
    }

    public static Map h(File file) {
        if (!file.exists()) {
            return qp1.A;
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

    public static boolean l(uh1 uh1Var) {
        if (uh1Var.k()) {
            uh1[] o = uh1Var.o();
            o.getClass();
            for (uh1 uh1Var2 : o) {
                uh1Var2.getClass();
                if (!l(uh1Var2)) {
                    return false;
                }
            }
        }
        return uh1Var.d();
    }

    public static void m(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!q72.H(file)) {
                    c44.y(file.getAbsolutePath(), "Could not replace local DLDI file ");
                    return;
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            c44.y(file.getAbsolutePath(), "Could not create ");
        }
    }

    public static boolean n(String str, qh1 qh1Var, ph1 ph1Var, Map map) {
        ph1 ph1Var2;
        nh1 nh1Var = (nh1) map.get(str);
        if (nh1Var == null) {
            if (ph1Var == null) {
                return false;
            }
            return true;
        } else if (ph1Var == null) {
            return true;
        } else {
            int i = rh1.a[qh1Var.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ph1Var2 = new ph1(nh1Var.a, nh1Var.d, nh1Var.e);
                } else {
                    i.c();
                    return false;
                }
            } else {
                ph1Var2 = new ph1(nh1Var.a, nh1Var.b, nh1Var.c);
            }
            return !ph1Var.equals(ph1Var2);
        }
    }

    public static boolean o(String str, qh1 qh1Var, Map map, Map map2) {
        String concat;
        if (!map2.isEmpty()) {
            if (str.length() == 0) {
                concat = "";
            } else {
                concat = str.concat("/");
            }
            m16 m16Var = new m16();
            for (String str2 : map2.keySet()) {
                if (b53.x(str2, str) || gh6.n0(str2, concat, false)) {
                    m16Var.add(str2);
                }
            }
            for (String str3 : map.keySet()) {
                if (b53.x(str3, str) || gh6.n0(str3, concat, false)) {
                    m16Var.add(str3);
                }
            }
            m16 e = hi2.e(m16Var);
            if (e == null || !e.A.isEmpty()) {
                Iterator it = e.iterator();
                while (((lt3) it).hasNext()) {
                    String str4 = (String) ((jt3) it).next();
                    if (n(str4, qh1Var, (ph1) map2.get(str4), map)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public jx a() {
        String str;
        if (((Size) this.a) == null) {
            str = " resolution";
        } else {
            str = "";
        }
        if (((Size) this.b) == null) {
            str = str.concat(" originalConfiguredResolution");
        }
        if (((sm1) this.c) == null) {
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
            return new jx((Size) this.a, (Size) this.b, (sm1) this.c, ((Integer) this.d).intValue(), (Range) this.e, (cw0) this.f, ((Boolean) this.g).booleanValue());
        }
        i.n("Missing required properties:".concat(str));
        return null;
    }

    public void j(uh1 uh1Var, File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            m(parentFile);
        }
        if (file.exists() && file.isDirectory() && !q72.H(file)) {
            c44.y(file.getAbsolutePath(), "Could not replace local DLDI directory ");
            return;
        }
        InputStream openInputStream = ((Context) this.a).getContentResolver().openInputStream(uh1Var.j());
        if (openInputStream != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                pu.o(openInputStream, fileOutputStream);
                fileOutputStream.close();
                openInputStream.close();
                long m = uh1Var.m();
                if (m > 0) {
                    file.setLastModified(m);
                    return;
                }
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dt3.W(openInputStream, th);
                    throw th2;
                }
            }
        }
        c44.y(uh1Var.j(), "Could not open ");
    }

    public void k(uh1 uh1Var, File file) {
        OutputStream openOutputStream = ((Context) this.a).getContentResolver().openOutputStream(uh1Var.j(), "wt");
        if (openOutputStream != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                pu.o(fileInputStream, openOutputStream);
                fileInputStream.close();
                openOutputStream.close();
            } finally {
            }
        } else {
            Uri j = uh1Var.j();
            throw new IllegalStateException(("Could not open " + j + " for write").toString());
        }
    }

    public oh1 p(Uri uri) {
        Object kc5Var;
        JSONObject jSONObject;
        String optString;
        File file = (File) this.g;
        boolean isFile = file.isFile();
        qp1 qp1Var = qp1.A;
        if (!isFile) {
            String uri2 = uri.toString();
            uri2.getClass();
            return new oh1(uri2, qp1Var);
        }
        try {
            jSONObject = new JSONObject(q72.L(file));
            optString = jSONObject.optString("documentTreeUri");
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        if (!b53.x(optString, uri.toString())) {
            String uri3 = uri.toString();
            uri3.getClass();
            return new oh1(uri3, qp1Var);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("entries");
        if (optJSONObject == null) {
            String uri4 = uri.toString();
            uri4.getClass();
            return new oh1(uri4, qp1Var);
        }
        mt3 mt3Var = new mt3();
        Iterator<String> keys = optJSONObject.keys();
        keys.getClass();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
            if (optJSONObject2 != null) {
                String string = optJSONObject2.getString("kind");
                string.getClass();
                mt3Var.put(next, new nh1(mh1.valueOf(string), optJSONObject2.optLong("localLastModified", 0L), optJSONObject2.optLong("localLength", -1L), optJSONObject2.optLong("documentLastModified", 0L), optJSONObject2.optLong("documentLength", -1L)));
            }
        }
        kc5Var = new oh1(optString, mt3Var.b());
        Throwable a = nc5.a(kc5Var);
        if (a != null) {
            Log.w("DldiFolderSync", "Could not read DLDI snapshot state", a);
            String uri5 = uri.toString();
            uri5.getClass();
            kc5Var = new oh1(uri5, qp1Var);
        }
        return (oh1) kc5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.e
            r3 = r0
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r13.c
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.Object r1 = r13.a
            android.content.Context r1 = (android.content.Context) r1
            c76 r2 = defpackage.uh1.h(r1, r0)
            boolean r1 = r2.e()
            r9 = 0
            java.lang.String r10 = "DldiFolderSync"
            if (r1 == 0) goto La1
            boolean r1 = r2.k()
            if (r1 == 0) goto La1
            android.content.Context r1 = r2.b
            android.net.Uri r4 = r2.c
            r5 = 2
            int r6 = r1.checkCallingOrSelfUriPermission(r4, r5)
            if (r6 == 0) goto L30
            goto La1
        L30:
            java.lang.String r6 = "mime_type"
            java.lang.String r6 = defpackage.mh7.b0(r1, r4, r6)
            java.lang.String r7 = "flags"
            r11 = 0
            long r7 = defpackage.mh7.a0(r1, r4, r7, r11)
            int r1 = (int) r7
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L46
            goto La1
        L46:
            r4 = r1 & 4
            if (r4 == 0) goto L4b
            goto L61
        L4b:
            java.lang.String r4 = "vnd.android.document/directory"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L58
            r4 = r1 & 8
            if (r4 == 0) goto L58
            goto L61
        L58:
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 != 0) goto La1
            r1 = r1 & r5
            if (r1 == 0) goto La1
        L61:
            oh1 r1 = r13.p(r0)
            java.util.Map r6 = r1.b
            java.util.Map r7 = h(r3)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.lang.String r1 = ""
            g(r2, r1, r8)
            qh1 r4 = defpackage.qh1.LOCAL     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = ""
            r1 = r13
            r1.r(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L87
            java.util.LinkedHashMap r13 = d(r2, r3)     // Catch: java.lang.Throwable -> L87
            r1.u(r0, r13)     // Catch: java.lang.Throwable -> L87
            o27 r13 = defpackage.o27.a     // Catch: java.lang.Throwable -> L87
            goto L93
        L87:
            r0 = move-exception
        L88:
            r13 = r0
            goto L8d
        L8a:
            r0 = move-exception
            r1 = r13
            goto L88
        L8d:
            kc5 r0 = new kc5
            r0.<init>(r13)
            r13 = r0
        L93:
            java.lang.Throwable r13 = defpackage.nc5.a(r13)
            if (r13 == 0) goto L9e
            java.lang.String r0 = "Could not sync DLDI folder after emulation"
            android.util.Log.w(r10, r0, r13)
        L9e:
            r1.c = r9
            return
        La1:
            r1 = r13
            java.lang.String r13 = "Skipping DLDI sync-back because the selected folder is not writable"
            android.util.Log.w(r10, r13)
            r1.c = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw6.q():void");
    }

    public void r(uh1 uh1Var, File file, qh1 qh1Var, String str, Map map, Map map2, Map map3) {
        LinkedHashMap linkedHashMap;
        qp1 qp1Var;
        qp1 qp1Var2;
        m(file);
        uh1[] o = uh1Var.o();
        o.getClass();
        ArrayList arrayList = new ArrayList();
        int length = o.length;
        int i = 0;
        while (true) {
            linkedHashMap = null;
            ti4 ti4Var = null;
            if (i >= length) {
                break;
            }
            uh1 uh1Var2 = o[i];
            String i2 = uh1Var2.i();
            if (i2 != null) {
                ti4Var = new ti4(i2, uh1Var2);
            }
            if (ti4Var != null) {
                arrayList.add(ti4Var);
            }
            i++;
        }
        Map q0 = zt3.q0(arrayList);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int j0 = zt3.j0(listFiles.length);
            if (j0 < 16) {
                j0 = 16;
            }
            linkedHashMap = new LinkedHashMap(j0);
            for (File file2 : listFiles) {
                linkedHashMap.put(file2.getName(), file2);
            }
        }
        qp1 qp1Var3 = qp1.A;
        if (linkedHashMap == null) {
            qp1Var = qp1Var3;
        } else {
            qp1Var = linkedHashMap;
        }
        for (String str2 : tq0.f1(hi2.O(q0.keySet(), qp1Var.keySet()))) {
            uh1 uh1Var3 = (uh1) q0.get(str2);
            File file3 = (File) qp1Var.get(str2);
            str2.getClass();
            String e = e(str, str2);
            if (uh1Var3 != null || file3 != null) {
                if (uh1Var3 == null && file3 != null) {
                    t(qh1Var, uh1Var, file3, e, map, map2);
                } else if (uh1Var3 != null && file3 == null) {
                    s(qh1Var, uh1Var3, new File(file, str2), e, map, map3);
                    qp1Var2 = qp1Var3;
                    qp1Var3 = qp1Var2;
                } else {
                    uh1Var3.getClass();
                    if (uh1Var3.k()) {
                        file3.getClass();
                        if (file3.isDirectory()) {
                            r(uh1Var3, file3, qh1Var, e, map, map2, map3);
                            qp1Var2 = qp1Var3;
                            qp1Var3 = qp1Var2;
                        }
                    }
                    if (uh1Var3.l()) {
                        file3.getClass();
                        if (file3.isFile()) {
                            ph1 c = c(file3);
                            ph1 b = b(uh1Var3);
                            if (!c.equals(b)) {
                                int i3 = rh1.a[f(n(e, qh1.LOCAL, c, map), n(e, qh1.DOCUMENT, b, map), c, b, qh1Var).ordinal()];
                                if (i3 != 1) {
                                    if (i3 == 2) {
                                        j(uh1Var3, file3);
                                    } else {
                                        i.c();
                                        return;
                                    }
                                } else {
                                    k(uh1Var3, file3);
                                }
                            }
                            qp1Var2 = qp1Var3;
                            qp1Var3 = qp1Var2;
                        }
                    }
                    file3.getClass();
                    int i4 = rh1.a[f(o(e, qh1.LOCAL, map, map2), o(e, qh1.DOCUMENT, map, map3), c(file3), b(uh1Var3), qh1Var).ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            if (file3.exists() && !q72.H(file3)) {
                                c44.y(file3.getAbsolutePath(), "Could not replace local DLDI entry ");
                                return;
                            } else {
                                qp1Var2 = qp1Var3;
                                s(qh1Var, uh1Var3, file3, e, qp1Var2, qp1Var3);
                            }
                        } else {
                            i.c();
                            return;
                        }
                    } else {
                        qp1Var2 = qp1Var3;
                        if (l(uh1Var3)) {
                            t(qh1Var, uh1Var, file3, e, qp1Var2, qp1Var2);
                        } else {
                            c44.y(uh1Var3.j(), "Could not replace DLDI document entry ");
                            return;
                        }
                    }
                    qp1Var3 = qp1Var2;
                }
            }
            qp1Var2 = qp1Var3;
            qp1Var3 = qp1Var2;
        }
    }

    public void s(qh1 qh1Var, uh1 uh1Var, File file, String str, Map map, Map map2) {
        nh1 nh1Var = (nh1) map.get(str);
        boolean o = o(str, qh1.DOCUMENT, map, map2);
        if (nh1Var != null && !o) {
            if (!l(uh1Var)) {
                c44.y(uh1Var.j(), "Could not propagate DLDI delete for ");
            }
        } else if (uh1Var.k()) {
            m(file);
            r(uh1Var, file, qh1Var, str, map, qp1.A, map2);
        } else if (uh1Var.l()) {
            j(uh1Var, file);
        }
    }

    public void t(qh1 qh1Var, uh1 uh1Var, File file, String str, Map map, Map map2) {
        nh1 nh1Var = (nh1) map.get(str);
        boolean o = o(str, qh1.LOCAL, map, map2);
        if (nh1Var != null && !o) {
            if (!q72.H(file)) {
                c44.y(file.getAbsolutePath(), "Could not propagate DLDI delete for ");
            }
        } else if (file.isDirectory()) {
            String name = file.getName();
            name.getClass();
            uh1 f = uh1Var.f(name);
            if (f != null) {
                if (!f.k()) {
                    int i = rh1.a[qh1Var.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            i.c();
                            return;
                        } else {
                            c44.y(f.j(), "Cannot replace DLDI file with directory at ");
                            return;
                        }
                    } else if (!l(f)) {
                        c44.y(f.j(), "Could not replace DLDI file ");
                        return;
                    }
                }
                r(f, file, qh1Var, str, map, map2, qp1.A);
            }
            f = uh1Var.b(name);
            if (f == null) {
                throw new IllegalStateException("Could not create DLDI directory ".concat(name).toString());
            }
            r(f, file, qh1Var, str, map, map2, qp1.A);
        } else if (file.isFile()) {
            String name2 = file.getName();
            name2.getClass();
            uh1 f2 = uh1Var.f(name2);
            if (f2 != null) {
                if (!f2.l()) {
                    int i2 = rh1.a[qh1Var.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            i.c();
                            return;
                        } else {
                            c44.y(f2.j(), "Cannot replace DLDI directory with file at ");
                            return;
                        }
                    } else if (!l(f2)) {
                        c44.y(f2.j(), "Could not replace DLDI directory ");
                        return;
                    }
                }
                k(f2, file);
            }
            f2 = uh1Var.c("application/octet-stream", name2);
            if (f2 == null) {
                throw new IllegalStateException("Could not create DLDI file ".concat(name2).toString());
            }
            k(f2, file);
        }
    }

    public void u(Uri uri, LinkedHashMap linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : new TreeMap(linkedHashMap).entrySet()) {
            nh1 nh1Var = (nh1) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("kind", nh1Var.a.name());
            jSONObject2.put("localLastModified", nh1Var.b);
            jSONObject2.put("localLength", nh1Var.c);
            jSONObject2.put("documentLastModified", nh1Var.d);
            jSONObject2.put("documentLength", nh1Var.e);
            jSONObject.put((String) entry.getKey(), jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("documentTreeUri", uri.toString());
        jSONObject3.put("entries", jSONObject);
        String jSONObject4 = jSONObject3.toString();
        jSONObject4.getClass();
        q72.O((File) this.g, jSONObject4);
    }
}
