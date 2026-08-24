package defpackage;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e70  reason: default package */
/* loaded from: classes.dex */
public final class e70 {
    public final o41 a;
    public final File b;
    public final File c;
    public final hb4 d;
    public final ConcurrentHashMap e;
    public List f;
    public boolean g;
    public boolean h;

    public e70(Context context) {
        gu6 c = oi2.c();
        xe1 xe1Var = xk1.a;
        o41 i = g04.i(jw2.y(c, de1.L));
        this.a = i;
        File file = new File(context.getFilesDir(), "boxart");
        file.mkdirs();
        this.b = new File(file, "named_boxarts_index_v3.txt");
        this.c = new File(file, "matches_v3.json");
        this.d = new hb4();
        this.e = new ConcurrentHashMap();
        hv.L(i, null, null, new y3(this, (r41) null, 4), 3);
    }

    public static final d70 a(e70 e70Var, ArrayList arrayList, List list) {
        d70 d70Var;
        Set o1;
        int size = arrayList.size();
        char c = 0;
        int i = 0;
        while (true) {
            Object obj = null;
            if (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                String str = (String) obj2;
                String Q0 = qs6.Q0(str, " (");
                if (!qs6.v0(Q0)) {
                    str = Q0;
                }
                String f = f(str);
                if (!qs6.v0(f)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((d70) next).b.equals(f)) {
                            obj = next;
                            break;
                        }
                    }
                    d70 d70Var2 = (d70) obj;
                    if (d70Var2 != null) {
                        return d70Var2;
                    }
                }
            } else {
                int size2 = arrayList.size();
                int i2 = 0;
                d70 d70Var3 = null;
                double d = 0.0d;
                while (i2 < size2) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    String f2 = f((String) obj3);
                    char[] cArr = new char[1];
                    cArr[c] = ' ';
                    List J0 = qs6.J0(f2, cArr, 6);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : J0) {
                        if (((String) obj4).length() > 0) {
                            arrayList2.add(obj4);
                        }
                    }
                    Set p1 = gt0.p1(arrayList2);
                    if (!p1.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            d70 d70Var4 = (d70) it2.next();
                            Set set = d70Var4.c;
                            if (!set.isEmpty()) {
                                Set set2 = p1;
                                Set set3 = set;
                                d70Var = d70Var3;
                                double size3 = gt0.M0(set2, set3).size();
                                if (size3 != 0.0d) {
                                    gt0.A0(gt0.o1(set2), set3);
                                    double size4 = size3 / o1.size();
                                    if (size4 > d) {
                                        d = size4;
                                        d70Var3 = d70Var4;
                                        c = 0;
                                    }
                                }
                            } else {
                                d70Var = d70Var3;
                            }
                            d70Var3 = d70Var;
                            c = 0;
                        }
                    }
                }
                if (d < 0.7d) {
                    return null;
                }
                return d70Var3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.CharSequence, java.lang.String] */
    public static final List b(e70 e70Var) {
        em5 em5Var;
        String str;
        Object em5Var2;
        Object em5Var3;
        File file = e70Var.b;
        List list = e70Var.f;
        if (list != null) {
            return list;
        }
        if (file.isFile() && System.currentTimeMillis() - file.lastModified() < 2592000000L) {
            try {
                em5Var3 = jc2.B0(file);
            } catch (Throwable th) {
                em5Var3 = new em5(th);
            }
            if (em5Var3 instanceof em5) {
                em5Var3 = null;
            }
            str = (String) em5Var3;
        } else {
            try {
                ?? P0 = gt0.P0(gt0.V0(d("https://thumbnails.libretro.com/Nintendo%20-%20Nintendo%20DS/Named_Boxarts/", "DS"), d("https://thumbnails.libretro.com/Nintendo%20-%20Nintendo%20DSi/Named_Boxarts/", "DSI")), "\n", null, null, null, 62);
                boolean v0 = qs6.v0(P0);
                em5Var = P0;
                if (v0) {
                    em5Var = null;
                }
            } catch (Throwable th2) {
                em5Var = new em5(th2);
            }
            boolean z = em5Var instanceof em5;
            em5 em5Var4 = em5Var;
            if (z) {
                em5Var4 = null;
            }
            str = (String) em5Var4;
            if (str != null) {
                try {
                    jc2.F0(file, str);
                } catch (Throwable unused) {
                }
            } else {
                try {
                    if (!file.isFile()) {
                        file = null;
                    }
                    if (file != null) {
                        em5Var2 = jc2.B0(file);
                    } else {
                        em5Var2 = null;
                    }
                } catch (Throwable th3) {
                    em5Var2 = new em5(th3);
                }
                if (em5Var2 instanceof em5) {
                    em5Var2 = null;
                }
                str = (String) em5Var2;
            }
        }
        if (str == null) {
            return null;
        }
        List c0 = sb6.c0(sb6.b0(new pc2(new ev(str, 4), true, new k4(21)), new k4(e70Var)));
        e70Var.f = c0;
        return c0;
    }

    public static final void c(e70 e70Var) {
        File file = e70Var.c;
        if (e70Var.g) {
            return;
        }
        try {
            if (file.isFile()) {
                JSONObject jSONObject = new JSONObject(jc2.B0(file));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    e70Var.e.put(next, jSONObject.optString(next, "-"));
                }
            }
        } catch (Throwable unused) {
        }
        e70Var.g = true;
    }

    public static List d(String str, String str2) {
        Object em5Var;
        try {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setRequestProperty("User-Agent", "melonDS-android-boxart");
            InputStream inputStream = httpURLConnection.getInputStream();
            inputStream.getClass();
            em5Var = sb6.c0(new pc2(new qd2(xh5.a(new xh5("href=\"([^\"]+\\.png)\""), yh2.E(new BufferedReader(new InputStreamReader(inputStream, qm0.a), 8192))), new c70(str2, 0), 2), true, new k4(23)));
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (hm5.a(em5Var) != null) {
            em5Var = yt1.A;
        }
        return (List) em5Var;
    }

    public static String f(String str) {
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        normalize.getClass();
        Pattern compile = Pattern.compile("\\p{M}+");
        compile.getClass();
        String replaceAll = compile.matcher(normalize).replaceAll("");
        replaceAll.getClass();
        String lowerCase = replaceAll.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Pattern compile2 = Pattern.compile("\\(.*?\\)|\\[.*?]");
        compile2.getClass();
        String replaceAll2 = compile2.matcher(lowerCase).replaceAll(" ");
        replaceAll2.getClass();
        Pattern compile3 = Pattern.compile("[^a-z0-9]+");
        compile3.getClass();
        String replaceAll3 = compile3.matcher(replaceAll2).replaceAll(" ");
        replaceAll3.getClass();
        String obj = qs6.T0(replaceAll3).toString();
        Pattern compile4 = Pattern.compile("\\s+");
        compile4.getClass();
        obj.getClass();
        String replaceAll4 = compile4.matcher(obj).replaceAll(" ");
        replaceAll4.getClass();
        return replaceAll4;
    }

    public final Object e(pq5 pq5Var, hw6 hw6Var) {
        xe1 xe1Var = xk1.a;
        return hv.d0(de1.L, new hn(pq5Var, this, (r41) null, 2), hw6Var);
    }
}
