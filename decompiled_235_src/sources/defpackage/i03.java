package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i03  reason: default package */
/* loaded from: classes.dex */
public final class i03 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    public i03(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
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
        return str.substring(qs6.s0(':', this.a.length() + 3, 4, str) + 1, qs6.s0('@', 0, 6, str));
    }

    public final String b() {
        String str = this.i;
        int s0 = qs6.s0('/', this.a.length() + 3, 4, str);
        return str.substring(s0, yy7.f(str, s0, str.length(), "?#"));
    }

    public final ArrayList c() {
        String str = this.i;
        int s0 = qs6.s0('/', this.a.length() + 3, 4, str);
        int f = yy7.f(str, s0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (s0 < f) {
            int i = s0 + 1;
            int e = yy7.e(str, '/', i, f);
            arrayList.add(str.substring(i, e));
            s0 = e;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int s0 = qs6.s0('?', 0, 6, str) + 1;
        return str.substring(s0, yy7.e(str, '#', s0, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, yy7.f(str, length, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof i03) && ((i03) obj).i.equals(this.i)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return nb3.k(this.a, "https");
    }

    public final String g() {
        h03 h03Var;
        try {
            h03Var = new h03(0);
            h03Var.e(this, "/...");
        } catch (IllegalArgumentException unused) {
            h03Var = null;
        }
        h03Var.getClass();
        h03Var.d = jw2.m("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        h03Var.e = jw2.m("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return h03Var.b().i;
    }

    public final URI h() {
        int i;
        ArrayList arrayList;
        String substring;
        String str;
        String str2;
        h03 h03Var = new h03(0);
        ArrayList arrayList2 = (ArrayList) h03Var.h;
        String str3 = this.a;
        h03Var.c = str3;
        h03Var.d = e();
        h03Var.e = a();
        h03Var.f = this.d;
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
        h03Var.b = i2;
        arrayList2.clear();
        arrayList2.addAll(c());
        String d = d();
        String str4 = null;
        if (d != null) {
            arrayList = h03.f(jw2.m(d, 0, 0, " \"'<>#", 83));
        } else {
            arrayList = null;
        }
        h03Var.i = arrayList;
        if (this.h == null) {
            substring = null;
        } else {
            String str5 = this.i;
            substring = str5.substring(qs6.s0('#', 0, 6, str5) + 1);
        }
        h03Var.g = substring;
        String str6 = (String) h03Var.f;
        if (str6 != null) {
            str = lb1.z("[\"<>^`{|}]", str6, "");
        } else {
            str = null;
        }
        h03Var.f = str;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.set(i4, jw2.m((String) arrayList2.get(i4), 0, 0, "[]", 99));
        }
        ArrayList arrayList3 = (ArrayList) h03Var.i;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i5 = 0; i5 < size2; i5++) {
                String str7 = (String) arrayList3.get(i5);
                if (str7 != null) {
                    str2 = jw2.m(str7, 0, 0, "\\^`{|}", 67);
                } else {
                    str2 = null;
                }
                arrayList3.set(i5, str2);
            }
        }
        String str8 = (String) h03Var.g;
        if (str8 != null) {
            str4 = jw2.m(str8, 0, 0, " \"#<>\\^`{|}", 35);
        }
        h03Var.g = str4;
        String h03Var2 = h03Var.toString();
        try {
            return new URI(h03Var2);
        } catch (URISyntaxException e) {
            try {
                Pattern compile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                compile.getClass();
                String replaceAll = compile.matcher(h03Var2).replaceAll("");
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
