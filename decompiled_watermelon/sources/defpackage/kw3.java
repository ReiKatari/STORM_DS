package defpackage;

import android.content.Context;
import android.util.Log;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kw3  reason: default package */
/* loaded from: classes.dex */
public final class kw3 implements n33 {
    public final String a;
    public final String b;
    public final String c;

    public kw3(Context context) {
        Object kc5Var;
        this.a = context.getPackageName();
        try {
            kc5Var = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        String str = (String) (kc5Var instanceof kc5 ? null : kc5Var);
        str = str == null ? "" : str;
        this.b = zg6.B0(str) ? "unknown" : str;
        this.c = "melonDualDS-android/0.7.0";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kc5] */
    public static String b(String str) {
        String kc5Var;
        try {
            kc5Var = URLDecoder.decode(str, StandardCharsets.UTF_8.toString());
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        if (!(kc5Var instanceof kc5)) {
            str = kc5Var;
        }
        return str;
    }

    public static String c(ka kaVar, ip3 ip3Var) {
        Object obj;
        String str;
        ListIterator listIterator = ip3Var.listIterator(ip3Var.b());
        while (true) {
            wr2 wr2Var = (wr2) listIterator;
            if (wr2Var.hasPrevious()) {
                obj = wr2Var.previous();
                if (b53.x(((jw3) obj).a, "r")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        jw3 jw3Var = (jw3) obj;
        if (jw3Var != null && (str = jw3Var.b) != null) {
            return str;
        }
        return ((hu2) kaVar.B).b();
    }

    public static List d(String str) {
        String str2;
        String str3;
        if (str != null && !zg6.B0(str)) {
            List Q0 = zg6.Q0(str, new String[]{"&"});
            ArrayList arrayList = new ArrayList();
            for (Object obj : Q0) {
                if (!zg6.B0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                String str4 = (String) obj2;
                int y0 = zg6.y0('=', 0, 6, str4);
                if (y0 >= 0) {
                    str2 = str4.substring(0, y0);
                } else {
                    str2 = str4;
                }
                if (y0 >= 0) {
                    str3 = str4.substring(y0 + 1);
                } else {
                    str3 = "";
                }
                arrayList2.add(new jw3(b(str2), b(str3)));
            }
            return arrayList2;
        }
        return pp1.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [ua5] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kc5] */
    /* JADX WARN: Type inference failed for: r4v2, types: [f60, java.lang.Object, t60] */
    @Override // defpackage.n33
    public final ec5 a(fi3 fi3Var) {
        String kc5Var;
        String S0;
        ka kaVar = (ka) fi3Var.i;
        ip3 C = l07.C();
        C.addAll(d(((hu2) kaVar.B).d()));
        ?? r0 = (ua5) kaVar.X;
        String str = null;
        if (r0 != 0) {
            try {
                ?? obj = new Object();
                r0.d(obj);
                kc5Var = obj.V();
            } catch (Throwable th) {
                kc5Var = new kc5(th);
            }
            if (!(kc5Var instanceof kc5)) {
                str = kc5Var;
            }
            str = str;
        }
        C.addAll(d(str));
        ip3 t = l07.t(C);
        String c = c(kaVar, t);
        String str2 = this.c;
        StringBuilder v = b31.v("source=kotlin_http action=", c, " user_agent=", str2, " package=");
        v.append(this.a);
        v.append(" version=");
        v.append(this.b);
        Log.i("RAIdentity", v.toString());
        String c2 = c(kaVar, t);
        String str3 = (String) kaVar.L;
        if (t.isEmpty()) {
            S0 = "<none>";
        } else {
            S0 = tq0.S0(t, "&", null, null, new gi3(12), 30);
        }
        StringBuilder v2 = b31.v("source=kotlin_http action=", c2, " method=", str3, " params=");
        v2.append(S0);
        Log.i("RARequest", v2.toString());
        r9 m = kaVar.m();
        str2.getClass();
        ((vq2) m.c).b("User-Agent", str2);
        return fi3Var.f(new ka(m));
    }
}
