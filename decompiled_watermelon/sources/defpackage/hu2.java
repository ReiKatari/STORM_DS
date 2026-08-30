package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hu2  reason: default package */
/* loaded from: classes.dex */
public final class hu2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    public hu2(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        String str = this.i;
        return str.substring(zg6.y0(':', this.a.length() + 3, 4, str) + 1, zg6.y0('@', 0, 6, str));
    }

    public final String b() {
        String str = this.i;
        int y0 = zg6.y0('/', this.a.length() + 3, 4, str);
        return str.substring(y0, gk7.e(y0, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        String str = this.i;
        int y0 = zg6.y0('/', this.a.length() + 3, 4, str);
        int e = gk7.e(y0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (y0 < e) {
            int i = y0 + 1;
            int f = gk7.f(str, '/', i, e);
            arrayList.add(str.substring(i, f));
            y0 = f;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int y0 = zg6.y0('?', 0, 6, str) + 1;
        return str.substring(y0, gk7.f(str, '#', y0, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, gk7.e(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof hu2) && ((hu2) obj).i.equals(this.i)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return b53.x(this.a, "https");
    }

    public final String g() {
        gu2 gu2Var;
        try {
            gu2Var = new gu2(0);
            gu2Var.e(this, "/...");
        } catch (IllegalArgumentException unused) {
            gu2Var = null;
        }
        gu2Var.getClass();
        gu2Var.d = dk7.m("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        gu2Var.e = dk7.m("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return gu2Var.b().i;
    }

    public final URI h() {
        int i;
        ArrayList arrayList;
        String substring;
        String str;
        String str2;
        gu2 gu2Var = new gu2(0);
        ArrayList arrayList2 = (ArrayList) gu2Var.h;
        String str3 = this.a;
        gu2Var.c = str3;
        gu2Var.d = e();
        gu2Var.e = a();
        gu2Var.f = this.d;
        str3.getClass();
        int i2 = -1;
        if (str3.equals("http")) {
            i = 80;
        } else if (str3.equals("https")) {
            i = 443;
        } else {
            i = -1;
        }
        int i3 = this.e;
        if (i3 != i) {
            i2 = i3;
        }
        gu2Var.b = i2;
        arrayList2.clear();
        arrayList2.addAll(c());
        String d = d();
        String str4 = null;
        if (d != null) {
            arrayList = gu2.f(dk7.m(d, 0, 0, " \"'<>#", 83));
        } else {
            arrayList = null;
        }
        gu2Var.i = arrayList;
        if (this.h == null) {
            substring = null;
        } else {
            String str5 = this.i;
            substring = str5.substring(zg6.y0('#', 0, 6, str5) + 1);
        }
        gu2Var.g = substring;
        String str6 = (String) gu2Var.f;
        if (str6 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            compile.getClass();
            str = compile.matcher(str6).replaceAll("");
            str.getClass();
        } else {
            str = null;
        }
        gu2Var.f = str;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.set(i4, dk7.m((String) arrayList2.get(i4), 0, 0, "[]", 99));
        }
        ArrayList arrayList3 = (ArrayList) gu2Var.i;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i5 = 0; i5 < size2; i5++) {
                String str7 = (String) arrayList3.get(i5);
                if (str7 != null) {
                    str2 = dk7.m(str7, 0, 0, "\\^`{|}", 67);
                } else {
                    str2 = null;
                }
                arrayList3.set(i5, str2);
            }
        }
        String str8 = (String) gu2Var.g;
        if (str8 != null) {
            str4 = dk7.m(str8, 0, 0, " \"#<>\\^`{|}", 35);
        }
        gu2Var.g = str4;
        String gu2Var2 = gu2Var.toString();
        try {
            return new URI(gu2Var2);
        } catch (URISyntaxException e) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                compile2.getClass();
                String replaceAll = compile2.matcher(gu2Var2).replaceAll("");
                replaceAll.getClass();
                URI create = URI.create(replaceAll);
                create.getClass();
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }
}
