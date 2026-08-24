package defpackage;

import android.content.Context;
import android.util.Log;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x34  reason: default package */
/* loaded from: classes.dex */
public final class x34 implements v93 {
    public final String a;
    public final String b;
    public final String c;

    public x34(Context context) {
        Object em5Var;
        this.a = context.getPackageName();
        try {
            em5Var = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        String str = (String) (em5Var instanceof em5 ? null : em5Var);
        str = str == null ? "" : str;
        this.b = qs6.v0(str) ? "unknown" : str;
        this.c = "melonDualDS-android/0.7.0";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [em5] */
    public static String b(String str) {
        String em5Var;
        try {
            em5Var = URLDecoder.decode(str, StandardCharsets.UTF_8.toString());
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (!(em5Var instanceof em5)) {
            str = em5Var;
        }
        return str;
    }

    public static String c(pa paVar, kw3 kw3Var) {
        Object obj;
        String str;
        ListIterator listIterator = kw3Var.listIterator(kw3Var.a());
        while (true) {
            xx2 xx2Var = (xx2) listIterator;
            if (xx2Var.hasPrevious()) {
                obj = xx2Var.previous();
                if (nb3.k(((w34) obj).a, "r")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        w34 w34Var = (w34) obj;
        if (w34Var != null && (str = w34Var.b) != null) {
            return str;
        }
        return ((i03) paVar.B).b();
    }

    public static List d(String str) {
        String str2;
        String str3;
        if (str != null && !qs6.v0(str)) {
            List K0 = qs6.K0(str, new String[]{"&"}, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : K0) {
                if (!qs6.v0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                String str4 = (String) obj2;
                int s0 = qs6.s0('=', 0, 6, str4);
                if (s0 >= 0) {
                    str2 = str4.substring(0, s0);
                } else {
                    str2 = str4;
                }
                if (s0 >= 0) {
                    str3 = str4.substring(s0 + 1);
                } else {
                    str3 = "";
                }
                arrayList2.add(new w34(b(str2), b(str3)));
            }
            return arrayList2;
        }
        return yt1.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [mk5] */
    /* JADX WARN: Type inference failed for: r4v0, types: [em5] */
    /* JADX WARN: Type inference failed for: r4v2, types: [y80, k80, java.lang.Object] */
    @Override // defpackage.v93
    public final wl5 a(dp3 dp3Var) {
        String em5Var;
        String P0;
        pa paVar = (pa) dp3Var.i;
        kw3 I = hf.I();
        I.addAll(d(((i03) paVar.B).d()));
        ?? r0 = (mk5) paVar.X;
        String str = null;
        if (r0 != 0) {
            try {
                ?? obj = new Object();
                r0.d(obj);
                em5Var = obj.c0();
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (!(em5Var instanceof em5)) {
                str = em5Var;
            }
            str = str;
        }
        I.addAll(d(str));
        kw3 A = hf.A(I);
        String c = c(paVar, A);
        String str2 = this.c;
        StringBuilder u = i61.u("source=kotlin_http action=", c, " user_agent=", str2, " package=");
        u.append(this.a);
        u.append(" version=");
        u.append(this.b);
        Log.i("RAIdentity", u.toString());
        String c2 = c(paVar, A);
        String str3 = (String) paVar.L;
        if (A.isEmpty()) {
            P0 = "<none>";
        } else {
            P0 = gt0.P0(A, "&", null, null, new v83(24), 30);
        }
        StringBuilder u2 = i61.u("source=kotlin_http action=", c2, " method=", str3, " params=");
        u2.append(P0);
        Log.i("RARequest", u2.toString());
        s9 o = paVar.o();
        str2.getClass();
        ((ww2) o.c).b("User-Agent", str2);
        return dp3Var.f(new pa(o));
    }
}
