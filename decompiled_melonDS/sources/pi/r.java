package pi;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f11781a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11782b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11783c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11784d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11785e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f11786f;

    /* renamed from: g  reason: collision with root package name */
    public final List f11787g;

    /* renamed from: h  reason: collision with root package name */
    public final String f11788h;

    /* renamed from: i  reason: collision with root package name */
    public final String f11789i;

    public r(String str, String str2, String str3, String str4, int i2, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f11781a = str;
        this.f11782b = str2;
        this.f11783c = str3;
        this.f11784d = str4;
        this.f11785e = i2;
        this.f11786f = arrayList;
        this.f11787g = arrayList2;
        this.f11788h = str5;
        this.f11789i = str6;
    }

    public final String a() {
        if (this.f11783c.length() == 0) {
            return "";
        }
        String str = this.f11789i;
        return str.substring(vc.h.g0(':', this.f11781a.length() + 3, 4, str) + 1, vc.h.g0('@', 0, 6, str));
    }

    public final String b() {
        String str = this.f11789i;
        int g02 = vc.h.g0('/', this.f11781a.length() + 3, 4, str);
        return str.substring(g02, qi.e.e(g02, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        String str = this.f11789i;
        int g02 = vc.h.g0('/', this.f11781a.length() + 3, 4, str);
        int e6 = qi.e.e(g02, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (g02 < e6) {
            int i2 = g02 + 1;
            int f8 = qi.e.f(str, '/', i2, e6);
            arrayList.add(str.substring(i2, f8));
            g02 = f8;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f11787g == null) {
            return null;
        }
        String str = this.f11789i;
        int g02 = vc.h.g0('?', 0, 6, str) + 1;
        return str.substring(g02, qi.e.f(str, '#', g02, str.length()));
    }

    public final String e() {
        if (this.f11782b.length() == 0) {
            return "";
        }
        int length = this.f11781a.length() + 3;
        String str = this.f11789i;
        return str.substring(length, qi.e.e(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof r) && ((r) obj).f11789i.equals(this.f11789i)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return nc.k.a(this.f11781a, "https");
    }

    public final String g() {
        na.a0 a0Var;
        try {
            a0Var = new na.a0(1);
            a0Var.e(this, "/...");
        } catch (IllegalArgumentException unused) {
            a0Var = null;
        }
        a0Var.getClass();
        a0Var.f10120d = ej.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        a0Var.f10121e = ej.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return a0Var.b().f11789i;
    }

    public final URI h() {
        int i2;
        ArrayList arrayList;
        String substring;
        String str;
        String str2;
        na.a0 a0Var = new na.a0(1);
        ArrayList arrayList2 = (ArrayList) a0Var.f10123g;
        String str3 = this.f11781a;
        a0Var.f10119c = str3;
        a0Var.f10120d = e();
        a0Var.f10121e = a();
        a0Var.f10122f = this.f11784d;
        str3.getClass();
        int i10 = -1;
        if (str3.equals("http")) {
            i2 = 80;
        } else if (str3.equals("https")) {
            i2 = 443;
        } else {
            i2 = -1;
        }
        int i11 = this.f11785e;
        if (i11 != i2) {
            i10 = i11;
        }
        a0Var.f10118b = i10;
        arrayList2.clear();
        arrayList2.addAll(c());
        String d4 = d();
        String str4 = null;
        if (d4 != null) {
            arrayList = na.a0.f(ej.a.a(d4, 0, 0, " \"'<>#", 83));
        } else {
            arrayList = null;
        }
        a0Var.f10124h = arrayList;
        if (this.f11788h == null) {
            substring = null;
        } else {
            String str5 = this.f11789i;
            substring = str5.substring(vc.h.g0('#', 0, 6, str5) + 1);
        }
        a0Var.f10125i = substring;
        String str6 = (String) a0Var.f10122f;
        if (str6 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            compile.getClass();
            str = compile.matcher(str6).replaceAll("");
            str.getClass();
        } else {
            str = null;
        }
        a0Var.f10122f = str;
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList2.set(i12, ej.a.a((String) arrayList2.get(i12), 0, 0, "[]", 99));
        }
        ArrayList arrayList3 = (ArrayList) a0Var.f10124h;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i13 = 0; i13 < size2; i13++) {
                String str7 = (String) arrayList3.get(i13);
                if (str7 != null) {
                    str2 = ej.a.a(str7, 0, 0, "\\^`{|}", 67);
                } else {
                    str2 = null;
                }
                arrayList3.set(i13, str2);
            }
        }
        String str8 = (String) a0Var.f10125i;
        if (str8 != null) {
            str4 = ej.a.a(str8, 0, 0, " \"#<>\\^`{|}", 35);
        }
        a0Var.f10125i = str4;
        String a0Var2 = a0Var.toString();
        try {
            return new URI(a0Var2);
        } catch (URISyntaxException e6) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                compile2.getClass();
                String replaceAll = compile2.matcher(a0Var2).replaceAll("");
                replaceAll.getClass();
                URI create = URI.create(replaceAll);
                create.getClass();
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e6);
            }
        }
    }

    public final int hashCode() {
        return this.f11789i.hashCode();
    }

    public final String toString() {
        return this.f11789i;
    }
}
