package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fc4  reason: default package */
/* loaded from: classes.dex */
public final class fc4 {
    public static final xh5 m = new xh5("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final xh5 n = new xh5("\\{(.+?)\\}");
    public static final xh5 o = new xh5("http[s]?://");
    public static final xh5 p = new xh5(".*");
    public static final xh5 q = new xh5("([^/]*?|)");
    public static final xh5 r = new xh5("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final ex6 d;
    public final ex6 e;
    public final go3 f;
    public boolean g;
    public final go3 h;
    public final go3 i;
    public final go3 j;
    public final ex6 k;
    public final boolean l;

    public fc4(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        boolean z = false;
        this.d = new ex6(new on2(this) { // from class: cc4
            public final /* synthetic */ fc4 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                List list;
                int i = r2;
                fc4 fc4Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = fc4Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new xh5(str2, yh5.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(fc4.r.d(fc4Var.a));
                    case 2:
                        String str3 = fc4Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) fc4Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) gt0.J0(queryParameters);
                                    if (str5 == null) {
                                        fc4Var.g = true;
                                        str5 = str4;
                                    }
                                    xh5 xh5Var = fc4.n;
                                    xh5Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = xh5Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    ec4 ec4Var = new ec4();
                                    for (n14 k = kn2.k(matcher, 0, str5); k != null; k = k.c()) {
                                        k14 b = k.c.b(1);
                                        b.getClass();
                                        ec4Var.b.add(b.a);
                                        if (k.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, k.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = k.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    ec4Var.a = fc4.h(sb.toString());
                                    linkedHashMap.put(str4, ec4Var);
                                } else {
                                    i.f(lb1.n("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = fc4Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        fc4.a(fragment, arrayList2, sb2);
                        return new vr4(arrayList2, sb2.toString());
                    case 4:
                        vr4 vr4Var = (vr4) fc4Var.h.getValue();
                        if (vr4Var == null || (list = (List) vr4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        vr4 vr4Var2 = (vr4) fc4Var.h.getValue();
                        if (vr4Var2 == null) {
                            return null;
                        }
                        return (String) vr4Var2.B;
                    case 6:
                        String str7 = (String) fc4Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new xh5(str7, yh5.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        this.e = new ex6(new on2(this) { // from class: cc4
            public final /* synthetic */ fc4 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                List list;
                int i = r2;
                fc4 fc4Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = fc4Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new xh5(str2, yh5.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(fc4.r.d(fc4Var.a));
                    case 2:
                        String str3 = fc4Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) fc4Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) gt0.J0(queryParameters);
                                    if (str5 == null) {
                                        fc4Var.g = true;
                                        str5 = str4;
                                    }
                                    xh5 xh5Var = fc4.n;
                                    xh5Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = xh5Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    ec4 ec4Var = new ec4();
                                    for (n14 k = kn2.k(matcher, 0, str5); k != null; k = k.c()) {
                                        k14 b = k.c.b(1);
                                        b.getClass();
                                        ec4Var.b.add(b.a);
                                        if (k.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, k.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = k.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    ec4Var.a = fc4.h(sb.toString());
                                    linkedHashMap.put(str4, ec4Var);
                                } else {
                                    i.f(lb1.n("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = fc4Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        fc4.a(fragment, arrayList2, sb2);
                        return new vr4(arrayList2, sb2.toString());
                    case 4:
                        vr4 vr4Var = (vr4) fc4Var.h.getValue();
                        if (vr4Var == null || (list = (List) vr4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        vr4 vr4Var2 = (vr4) fc4Var.h.getValue();
                        if (vr4Var2 == null) {
                            return null;
                        }
                        return (String) vr4Var2.B;
                    case 6:
                        String str7 = (String) fc4Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new xh5(str7, yh5.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        xr3 xr3Var = xr3.NONE;
        this.f = kj2.M(xr3Var, new on2(this) { // from class: cc4
            public final /* synthetic */ fc4 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                List list;
                int i = r2;
                fc4 fc4Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = fc4Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new xh5(str2, yh5.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(fc4.r.d(fc4Var.a));
                    case 2:
                        String str3 = fc4Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) fc4Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) gt0.J0(queryParameters);
                                    if (str5 == null) {
                                        fc4Var.g = true;
                                        str5 = str4;
                                    }
                                    xh5 xh5Var = fc4.n;
                                    xh5Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = xh5Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    ec4 ec4Var = new ec4();
                                    for (n14 k = kn2.k(matcher, 0, str5); k != null; k = k.c()) {
                                        k14 b = k.c.b(1);
                                        b.getClass();
                                        ec4Var.b.add(b.a);
                                        if (k.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, k.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = k.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    ec4Var.a = fc4.h(sb.toString());
                                    linkedHashMap.put(str4, ec4Var);
                                } else {
                                    i.f(lb1.n("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = fc4Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        fc4.a(fragment, arrayList2, sb2);
                        return new vr4(arrayList2, sb2.toString());
                    case 4:
                        vr4 vr4Var = (vr4) fc4Var.h.getValue();
                        if (vr4Var == null || (list = (List) vr4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        vr4 vr4Var2 = (vr4) fc4Var.h.getValue();
                        if (vr4Var2 == null) {
                            return null;
                        }
                        return (String) vr4Var2.B;
                    case 6:
                        String str7 = (String) fc4Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new xh5(str7, yh5.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        this.h = kj2.M(xr3Var, new on2(this) { // from class: cc4
            public final /* synthetic */ fc4 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                List list;
                int i = r2;
                fc4 fc4Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = fc4Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new xh5(str2, yh5.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(fc4.r.d(fc4Var.a));
                    case 2:
                        String str3 = fc4Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) fc4Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) gt0.J0(queryParameters);
                                    if (str5 == null) {
                                        fc4Var.g = true;
                                        str5 = str4;
                                    }
                                    xh5 xh5Var = fc4.n;
                                    xh5Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = xh5Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    ec4 ec4Var = new ec4();
                                    for (n14 k = kn2.k(matcher, 0, str5); k != null; k = k.c()) {
                                        k14 b = k.c.b(1);
                                        b.getClass();
                                        ec4Var.b.add(b.a);
                                        if (k.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, k.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = k.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    ec4Var.a = fc4.h(sb.toString());
                                    linkedHashMap.put(str4, ec4Var);
                                } else {
                                    i.f(lb1.n("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = fc4Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        fc4.a(fragment, arrayList2, sb2);
                        return new vr4(arrayList2, sb2.toString());
                    case 4:
                        vr4 vr4Var = (vr4) fc4Var.h.getValue();
                        if (vr4Var == null || (list = (List) vr4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        vr4 vr4Var2 = (vr4) fc4Var.h.getValue();
                        if (vr4Var2 == null) {
                            return null;
                        }
                        return (String) vr4Var2.B;
                    case 6:
                        String str7 = (String) fc4Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new xh5(str7, yh5.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        this.i = kj2.M(xr3Var, new on2(this) { // from class: cc4
            public final /* synthetic */ fc4 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                List list;
                int i = r2;
                fc4 fc4Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = fc4Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new xh5(str2, yh5.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(fc4.r.d(fc4Var.a));
                    case 2:
                        String str3 = fc4Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) fc4Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) gt0.J0(queryParameters);
                                    if (str5 == null) {
                                        fc4Var.g = true;
                                        str5 = str4;
                                    }
                                    xh5 xh5Var = fc4.n;
                                    xh5Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = xh5Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    ec4 ec4Var = new ec4();
                                    for (n14 k = kn2.k(matcher, 0, str5); k != null; k = k.c()) {
                                        k14 b = k.c.b(1);
                                        b.getClass();
                                        ec4Var.b.add(b.a);
                                        if (k.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, k.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = k.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    ec4Var.a = fc4.h(sb.toString());
                                    linkedHashMap.put(str4, ec4Var);
                                } else {
                                    i.f(lb1.n("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = fc4Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        fc4.a(fragment, arrayList2, sb2);
                        return new vr4(arrayList2, sb2.toString());
                    case 4:
                        vr4 vr4Var = (vr4) fc4Var.h.getValue();
                        if (vr4Var == null || (list = (List) vr4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        vr4 vr4Var2 = (vr4) fc4Var.h.getValue();
                        if (vr4Var2 == null) {
                            return null;
                        }
                        return (String) vr4Var2.B;
                    case 6:
                        String str7 = (String) fc4Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new xh5(str7, yh5.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        this.j = kj2.M(xr3Var, new on2(this) { // from class: cc4
            public final /* synthetic */ fc4 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                List list;
                int i = r2;
                fc4 fc4Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = fc4Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new xh5(str2, yh5.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(fc4.r.d(fc4Var.a));
                    case 2:
                        String str3 = fc4Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) fc4Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) gt0.J0(queryParameters);
                                    if (str5 == null) {
                                        fc4Var.g = true;
                                        str5 = str4;
                                    }
                                    xh5 xh5Var = fc4.n;
                                    xh5Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = xh5Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    ec4 ec4Var = new ec4();
                                    for (n14 k = kn2.k(matcher, 0, str5); k != null; k = k.c()) {
                                        k14 b = k.c.b(1);
                                        b.getClass();
                                        ec4Var.b.add(b.a);
                                        if (k.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, k.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = k.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    ec4Var.a = fc4.h(sb.toString());
                                    linkedHashMap.put(str4, ec4Var);
                                } else {
                                    i.f(lb1.n("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = fc4Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        fc4.a(fragment, arrayList2, sb2);
                        return new vr4(arrayList2, sb2.toString());
                    case 4:
                        vr4 vr4Var = (vr4) fc4Var.h.getValue();
                        if (vr4Var == null || (list = (List) vr4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        vr4 vr4Var2 = (vr4) fc4Var.h.getValue();
                        if (vr4Var2 == null) {
                            return null;
                        }
                        return (String) vr4Var2.B;
                    case 6:
                        String str7 = (String) fc4Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new xh5(str7, yh5.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        this.k = new ex6(new on2(this) { // from class: cc4
            public final /* synthetic */ fc4 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                List list;
                int i = r2;
                fc4 fc4Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = fc4Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new xh5(str2, yh5.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(fc4.r.d(fc4Var.a));
                    case 2:
                        String str3 = fc4Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) fc4Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) gt0.J0(queryParameters);
                                    if (str5 == null) {
                                        fc4Var.g = true;
                                        str5 = str4;
                                    }
                                    xh5 xh5Var = fc4.n;
                                    xh5Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = xh5Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    ec4 ec4Var = new ec4();
                                    for (n14 k = kn2.k(matcher, 0, str5); k != null; k = k.c()) {
                                        k14 b = k.c.b(1);
                                        b.getClass();
                                        ec4Var.b.add(b.a);
                                        if (k.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, k.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = k.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    ec4Var.a = fc4.h(sb.toString());
                                    linkedHashMap.put(str4, ec4Var);
                                } else {
                                    i.f(lb1.n("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = fc4Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        fc4.a(fragment, arrayList2, sb2);
                        return new vr4(arrayList2, sb2.toString());
                    case 4:
                        vr4 vr4Var = (vr4) fc4Var.h.getValue();
                        if (vr4Var == null || (list = (List) vr4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        vr4 vr4Var2 = (vr4) fc4Var.h.getValue();
                        if (vr4Var2 == null) {
                            return null;
                        }
                        return (String) vr4Var2.B;
                    case 6:
                        String str7 = (String) fc4Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new xh5(str7, yh5.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        new ex6(new on2(this) { // from class: cc4
            public final /* synthetic */ fc4 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                List list;
                int i = r2;
                fc4 fc4Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = fc4Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new xh5(str2, yh5.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(fc4.r.d(fc4Var.a));
                    case 2:
                        String str3 = fc4Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) fc4Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) gt0.J0(queryParameters);
                                    if (str5 == null) {
                                        fc4Var.g = true;
                                        str5 = str4;
                                    }
                                    xh5 xh5Var = fc4.n;
                                    xh5Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = xh5Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    ec4 ec4Var = new ec4();
                                    for (n14 k = kn2.k(matcher, 0, str5); k != null; k = k.c()) {
                                        k14 b = k.c.b(1);
                                        b.getClass();
                                        ec4Var.b.add(b.a);
                                        if (k.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, k.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = k.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    ec4Var.a = fc4.h(sb.toString());
                                    linkedHashMap.put(str4, ec4Var);
                                } else {
                                    i.f(lb1.n("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = fc4Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        fc4.a(fragment, arrayList2, sb2);
                        return new vr4(arrayList2, sb2.toString());
                    case 4:
                        vr4 vr4Var = (vr4) fc4Var.h.getValue();
                        if (vr4Var == null || (list = (List) vr4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        vr4 vr4Var2 = (vr4) fc4Var.h.getValue();
                        if (vr4Var2 == null) {
                            return null;
                        }
                        return (String) vr4Var2.B;
                    case 6:
                        String str7 = (String) fc4Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new xh5(str7, yh5.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!m.A.matcher(str).find()) {
            String pattern = o.A.pattern();
            pattern.getClass();
            sb.append(pattern);
        }
        Pattern compile = Pattern.compile("(\\?|#|$)");
        compile.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        n14 k = kn2.k(matcher, 0, str);
        if (k != null) {
            a(str.substring(0, k.b().A), arrayList, sb);
            if (!p.A.matcher(sb).find() && !q.A.matcher(sb).find()) {
                z = true;
            }
            this.l = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.c = h(sb.toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        xh5 xh5Var = n;
        xh5Var.getClass();
        Matcher matcher = xh5Var.A.matcher(str);
        matcher.getClass();
        int i = 0;
        for (n14 k = kn2.k(matcher, 0, str); k != null; k = k.c()) {
            k14 b = k.c.b(1);
            b.getClass();
            arrayList.add(b.a);
            if (k.b().A > i) {
                String quote = Pattern.quote(str.substring(i, k.b().A));
                quote.getClass();
                sb.append(quote);
            }
            String pattern = q.A.pattern();
            pattern.getClass();
            sb.append(pattern);
            i = k.b().B + 1;
        }
        if (i < str.length()) {
            String quote2 = Pattern.quote(str.substring(i));
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, rb4 rb4Var) {
        if (rb4Var != null) {
            fd4 fd4Var = rb4Var.a;
            str.getClass();
            fd4Var.e(bundle, str, fd4Var.d(str2));
            return;
        }
        str.getClass();
        bundle.putString(str, str2);
    }

    public static String h(String str) {
        if (qs6.j0(str, "\\Q", false) && qs6.j0(str, "\\E", false)) {
            return xs6.e0(str, ".*", "\\E.*\\Q");
        }
        if (qs6.j0(str, "\\.\\*", false)) {
            return xs6.e0(str, "\\.\\*", ".*");
        }
        return str;
    }

    public final int b(Uri uri) {
        if (uri != null) {
            List<String> pathSegments = uri.getPathSegments();
            Uri parse = Uri.parse(this.a);
            parse.getClass();
            return gt0.M0(pathSegments, parse.getPathSegments()).size();
        }
        return 0;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (ec4 ec4Var : ((Map) this.f.getValue()).values()) {
            gt0.A0(arrayList, ec4Var.b);
        }
        return gt0.V0(gt0.V0(this.b, arrayList), (List) this.i.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        n14 c;
        n14 c2;
        String str;
        uri.getClass();
        linkedHashMap.getClass();
        xh5 xh5Var = (xh5) this.d.getValue();
        if (xh5Var != null && (c = xh5Var.c(uri.toString())) != null) {
            Bundle l = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
            if (e(c, l, linkedHashMap) && (!((Boolean) this.e.getValue()).booleanValue() || f(uri, l, linkedHashMap))) {
                String fragment = uri.getFragment();
                xh5 xh5Var2 = (xh5) this.k.getValue();
                if (xh5Var2 != null && (c2 = xh5Var2.c(String.valueOf(fragment))) != null) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            String str2 = (String) obj;
                            k14 b = c2.c.b(i2);
                            if (b != null) {
                                str = Uri.decode(b.a);
                                str.getClass();
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            try {
                                g(l, str2, str, (rb4) linkedHashMap.get(str2));
                                arrayList.add(jg7.a);
                                i = i2;
                            } catch (IllegalArgumentException unused) {
                            }
                        } else {
                            hf.q0();
                            throw null;
                        }
                    }
                }
                if (xk2.C(linkedHashMap, new dc4(0, l)).isEmpty()) {
                    return l;
                }
            }
        }
        return null;
    }

    public final boolean e(n14 n14Var, Bundle bundle, Map map) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String str = null;
            if (i >= 0) {
                String str2 = (String) obj;
                k14 b = n14Var.c.b(i3);
                if (b != null) {
                    str = Uri.decode(b.a);
                    str.getClass();
                }
                if (str == null) {
                    str = "";
                }
                try {
                    g(bundle, str2, str, (rb4) map.get(str2));
                    arrayList2.add(jg7.a);
                    i = i3;
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                hf.q0();
                throw null;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fc4)) {
            if (this.a.equals(((fc4) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(Uri uri, Bundle bundle, Map map) {
        n14 n14Var;
        String str;
        Object obj;
        boolean z;
        fd4 fd4Var;
        String query;
        fc4 fc4Var = this;
        Map map2 = map;
        loop0: for (Map.Entry entry : ((Map) fc4Var.f.getValue()).entrySet()) {
            ec4 ec4Var = (ec4) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters((String) entry.getKey());
            if (fc4Var.g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = hf.b0(query);
            }
            jg7 jg7Var = jg7.a;
            boolean z2 = false;
            Bundle l = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
            ArrayList arrayList = ec4Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                String str2 = (String) obj2;
                rb4 rb4Var = (rb4) map2.get(str2);
                if (rb4Var != null) {
                    fd4Var = rb4Var.a;
                } else {
                    fd4Var = null;
                }
                if ((fd4Var instanceof dt0) && !rb4Var.c) {
                    dt0 dt0Var = (dt0) fd4Var;
                    dt0Var.e(l, str2, dt0Var.g());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = ec4Var.a;
                if (str4 != null) {
                    Pattern compile = Pattern.compile(str4);
                    compile.getClass();
                    str3.getClass();
                    Matcher matcher = compile.matcher(str3);
                    matcher.getClass();
                    if (matcher.matches()) {
                        n14Var = new n14(matcher, str3);
                        if (n14Var != null) {
                            return z2;
                        }
                        ArrayList arrayList2 = ec4Var.b;
                        ArrayList arrayList3 = new ArrayList(ht0.v0(arrayList2, 10));
                        int size2 = arrayList2.size();
                        boolean z3 = z2;
                        int i2 = z3 ? 1 : 0;
                        int i3 = z3;
                        while (i2 < size2) {
                            Object obj3 = arrayList2.get(i2);
                            i2++;
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                String str5 = (String) obj3;
                                k14 b = n14Var.c.b(i4);
                                if (b != null) {
                                    str = b.a;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str = "";
                                }
                                rb4 rb4Var2 = (rb4) map2.get(str5);
                                try {
                                    str5.getClass();
                                } catch (IllegalArgumentException unused) {
                                }
                                if (!l.containsKey(str5)) {
                                    g(l, str5, str, rb4Var2);
                                    obj = jg7Var;
                                    arrayList3.add(obj);
                                    map2 = map;
                                    i3 = i4;
                                    z2 = false;
                                } else {
                                    if (!l.containsKey(str5)) {
                                        z = true;
                                    } else {
                                        if (rb4Var2 != null) {
                                            fd4 fd4Var2 = rb4Var2.a;
                                            Object a = fd4Var2.a(l, str5);
                                            if (l.containsKey(str5)) {
                                                fd4Var2.e(l, str5, fd4Var2.c(a, str));
                                            } else {
                                                throw new IllegalArgumentException("There is no previous value in this savedState.");
                                                break loop0;
                                            }
                                        }
                                        z = false;
                                    }
                                    obj = Boolean.valueOf(z);
                                    arrayList3.add(obj);
                                    map2 = map;
                                    i3 = i4;
                                    z2 = false;
                                }
                            } else {
                                hf.q0();
                                throw null;
                            }
                        }
                        map2 = map;
                    }
                }
                n14Var = null;
                if (n14Var != null) {
                }
            }
            bundle.putAll(l);
            fc4Var = this;
            map2 = map;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
