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
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a50  reason: default package */
/* loaded from: classes.dex */
public final class a50 {
    public final File a;
    public final File b;
    public final b34 c;
    public List d;
    public JSONObject e;

    public a50(Context context) {
        File file = new File(context.getFilesDir(), "boxart");
        file.mkdirs();
        this.a = new File(file, "named_boxarts_index.txt");
        this.b = new File(file, "matches.json");
        this.c = new b34();
    }

    public static final z40 a(a50 a50Var, ArrayList arrayList, List list) {
        z40 z40Var;
        Set r1;
        int size = arrayList.size();
        char c = 0;
        int i = 0;
        while (true) {
            Object obj = null;
            if (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                String str = (String) obj2;
                String W0 = zg6.W0(str, " (");
                if (!zg6.B0(W0)) {
                    str = W0;
                }
                String e = e(str);
                if (!zg6.B0(e)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((z40) next).b.equals(e)) {
                            obj = next;
                            break;
                        }
                    }
                    z40 z40Var2 = (z40) obj;
                    if (z40Var2 != null) {
                        return z40Var2;
                    }
                }
            } else {
                int size2 = arrayList.size();
                int i2 = 0;
                z40 z40Var3 = null;
                double d = 0.0d;
                while (i2 < size2) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    String e2 = e((String) obj3);
                    char[] cArr = new char[1];
                    cArr[c] = ' ';
                    List P0 = zg6.P0(e2, cArr, 6);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : P0) {
                        if (((String) obj4).length() > 0) {
                            arrayList2.add(obj4);
                        }
                    }
                    Set s1 = tq0.s1(arrayList2);
                    if (!s1.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            z40 z40Var4 = (z40) it2.next();
                            Set set = z40Var4.c;
                            if (!set.isEmpty()) {
                                Set set2 = s1;
                                Set set3 = set;
                                z40Var = z40Var3;
                                double size3 = tq0.P0(set2, set3).size();
                                if (size3 != 0.0d) {
                                    tq0.D0(tq0.r1(set2), set3);
                                    double size4 = size3 / r1.size();
                                    if (size4 > d) {
                                        d = size4;
                                        z40Var3 = z40Var4;
                                        c = 0;
                                    }
                                }
                            } else {
                                z40Var = z40Var3;
                            }
                            z40Var3 = z40Var;
                            c = 0;
                        }
                    }
                }
                if (d < 0.65d) {
                    return null;
                }
                return z40Var3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.CharSequence, java.lang.String] */
    public static final List b(a50 a50Var) {
        kc5 kc5Var;
        String str;
        Object kc5Var2;
        Object kc5Var3;
        File file = a50Var.a;
        List list = a50Var.d;
        if (list != null) {
            return list;
        }
        if (file.isFile() && System.currentTimeMillis() - file.lastModified() < 2592000000L) {
            try {
                kc5Var3 = q72.L(file);
            } catch (Throwable th) {
                kc5Var3 = new kc5(th);
            }
            if (kc5Var3 instanceof kc5) {
                kc5Var3 = null;
            }
            str = (String) kc5Var3;
        } else {
            try {
                URLConnection openConnection = new URL("https://thumbnails.libretro.com/Nintendo%20-%20Nintendo%20DS/Named_Boxarts/").openConnection();
                openConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setRequestProperty("User-Agent", "melonDS-android-boxart");
                InputStream inputStream = httpURLConnection.getInputStream();
                inputStream.getClass();
                ?? y0 = d06.y0(new w72(new y82(h85.a(new h85("href=\"([^\"]+\\.png)\""), yf2.R(new BufferedReader(new InputStreamReader(inputStream, hk0.a), 8192))), new k4(23), 2), true, new k4(24)), "\n");
                boolean B0 = zg6.B0(y0);
                kc5 kc5Var4 = y0;
                if (B0) {
                    kc5Var4 = null;
                }
                httpURLConnection.disconnect();
                kc5Var = kc5Var4;
            } catch (Throwable th2) {
                kc5Var = new kc5(th2);
            }
            boolean z = kc5Var instanceof kc5;
            kc5 kc5Var5 = kc5Var;
            if (z) {
                kc5Var5 = null;
            }
            String str2 = (String) kc5Var5;
            if (str2 != null) {
                try {
                    q72.O(file, str2);
                } catch (Throwable unused) {
                }
                str = str2;
            } else {
                try {
                    if (!file.isFile()) {
                        file = null;
                    }
                    if (file != null) {
                        kc5Var2 = q72.L(file);
                    } else {
                        kc5Var2 = null;
                    }
                } catch (Throwable th3) {
                    kc5Var2 = new kc5(th3);
                }
                if (kc5Var2 instanceof kc5) {
                    kc5Var2 = null;
                }
                str = (String) kc5Var2;
            }
        }
        if (str == null) {
            return null;
        }
        List A0 = d06.A0(new y82(new w72(new mu(4, str), true, new k4(21)), new k4(a50Var), 2));
        a50Var.d = A0;
        return A0;
    }

    public static final JSONObject c(a50 a50Var) {
        Object kc5Var;
        File file = a50Var.b;
        JSONObject jSONObject = a50Var.e;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            if (file.isFile()) {
                kc5Var = new JSONObject(q72.L(file));
            } else {
                kc5Var = new JSONObject();
            }
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        Object jSONObject2 = new JSONObject();
        if (kc5Var instanceof kc5) {
            kc5Var = jSONObject2;
        }
        JSONObject jSONObject3 = (JSONObject) kc5Var;
        a50Var.e = jSONObject3;
        return jSONObject3;
    }

    public static String e(String str) {
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
        String obj = zg6.Z0(replaceAll3).toString();
        Pattern compile4 = Pattern.compile("\\s+");
        compile4.getClass();
        obj.getClass();
        String replaceAll4 = compile4.matcher(obj).replaceAll(" ");
        replaceAll4.getClass();
        return replaceAll4;
    }

    public final Object d(rg5 rg5Var, nk6 nk6Var) {
        bb1 bb1Var = tg1.a;
        return tq5.G(ha1.L, new vm(rg5Var, this, (j11) null, 1), nk6Var);
    }
}
