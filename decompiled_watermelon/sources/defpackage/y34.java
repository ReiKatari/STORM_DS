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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y34  reason: default package */
/* loaded from: classes.dex */
public final class y34 {
    public static final h85 m = new h85("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final h85 n = new h85("\\{(.+?)\\}");
    public static final h85 o = new h85("http[s]?://");
    public static final h85 p = new h85(".*");
    public static final h85 q = new h85("([^/]*?|)");
    public static final h85 r = new h85("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final il6 d;
    public final il6 e;
    public final gh3 f;
    public boolean g;
    public final gh3 h;
    public final gh3 i;
    public final gh3 j;
    public final il6 k;
    public final boolean l;

    public y34(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        boolean z = false;
        this.d = new il6(new ki2(this) { // from class: v34
            public final /* synthetic */ y34 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                List list;
                int i = r2;
                y34 y34Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = y34Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new h85(str2, i85.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(y34.r.d(y34Var.a));
                    case 2:
                        String str3 = y34Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) y34Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) tq0.M0(queryParameters);
                                    if (str5 == null) {
                                        y34Var.g = true;
                                        str5 = str4;
                                    }
                                    h85 h85Var = y34.n;
                                    h85Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = h85Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    x34 x34Var = new x34();
                                    for (ku3 m2 = gk2.m(matcher, 0, str5); m2 != null; m2 = m2.c()) {
                                        hu3 c = m2.c.c(1);
                                        c.getClass();
                                        x34Var.b.add(c.a);
                                        if (m2.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, m2.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = m2.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    x34Var.a = y34.h(sb.toString());
                                    linkedHashMap.put(str4, x34Var);
                                } else {
                                    c44.l("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = y34Var.a;
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
                        y34.a(fragment, arrayList2, sb2);
                        return new ti4(arrayList2, sb2.toString());
                    case 4:
                        ti4 ti4Var = (ti4) y34Var.h.getValue();
                        if (ti4Var == null || (list = (List) ti4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        ti4 ti4Var2 = (ti4) y34Var.h.getValue();
                        if (ti4Var2 == null) {
                            return null;
                        }
                        return (String) ti4Var2.B;
                    case ig7.b /* 6 */:
                        String str7 = (String) y34Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new h85(str7, i85.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        this.e = new il6(new ki2(this) { // from class: v34
            public final /* synthetic */ y34 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                List list;
                int i = r2;
                y34 y34Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = y34Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new h85(str2, i85.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(y34.r.d(y34Var.a));
                    case 2:
                        String str3 = y34Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) y34Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) tq0.M0(queryParameters);
                                    if (str5 == null) {
                                        y34Var.g = true;
                                        str5 = str4;
                                    }
                                    h85 h85Var = y34.n;
                                    h85Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = h85Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    x34 x34Var = new x34();
                                    for (ku3 m2 = gk2.m(matcher, 0, str5); m2 != null; m2 = m2.c()) {
                                        hu3 c = m2.c.c(1);
                                        c.getClass();
                                        x34Var.b.add(c.a);
                                        if (m2.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, m2.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = m2.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    x34Var.a = y34.h(sb.toString());
                                    linkedHashMap.put(str4, x34Var);
                                } else {
                                    c44.l("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = y34Var.a;
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
                        y34.a(fragment, arrayList2, sb2);
                        return new ti4(arrayList2, sb2.toString());
                    case 4:
                        ti4 ti4Var = (ti4) y34Var.h.getValue();
                        if (ti4Var == null || (list = (List) ti4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        ti4 ti4Var2 = (ti4) y34Var.h.getValue();
                        if (ti4Var2 == null) {
                            return null;
                        }
                        return (String) ti4Var2.B;
                    case ig7.b /* 6 */:
                        String str7 = (String) y34Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new h85(str7, i85.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        wk3 wk3Var = wk3.NONE;
        this.f = yf2.H(wk3Var, new ki2(this) { // from class: v34
            public final /* synthetic */ y34 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                List list;
                int i = r2;
                y34 y34Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = y34Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new h85(str2, i85.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(y34.r.d(y34Var.a));
                    case 2:
                        String str3 = y34Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) y34Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) tq0.M0(queryParameters);
                                    if (str5 == null) {
                                        y34Var.g = true;
                                        str5 = str4;
                                    }
                                    h85 h85Var = y34.n;
                                    h85Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = h85Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    x34 x34Var = new x34();
                                    for (ku3 m2 = gk2.m(matcher, 0, str5); m2 != null; m2 = m2.c()) {
                                        hu3 c = m2.c.c(1);
                                        c.getClass();
                                        x34Var.b.add(c.a);
                                        if (m2.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, m2.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = m2.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    x34Var.a = y34.h(sb.toString());
                                    linkedHashMap.put(str4, x34Var);
                                } else {
                                    c44.l("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = y34Var.a;
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
                        y34.a(fragment, arrayList2, sb2);
                        return new ti4(arrayList2, sb2.toString());
                    case 4:
                        ti4 ti4Var = (ti4) y34Var.h.getValue();
                        if (ti4Var == null || (list = (List) ti4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        ti4 ti4Var2 = (ti4) y34Var.h.getValue();
                        if (ti4Var2 == null) {
                            return null;
                        }
                        return (String) ti4Var2.B;
                    case ig7.b /* 6 */:
                        String str7 = (String) y34Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new h85(str7, i85.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        this.h = yf2.H(wk3Var, new ki2(this) { // from class: v34
            public final /* synthetic */ y34 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                List list;
                int i = r2;
                y34 y34Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = y34Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new h85(str2, i85.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(y34.r.d(y34Var.a));
                    case 2:
                        String str3 = y34Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) y34Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) tq0.M0(queryParameters);
                                    if (str5 == null) {
                                        y34Var.g = true;
                                        str5 = str4;
                                    }
                                    h85 h85Var = y34.n;
                                    h85Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = h85Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    x34 x34Var = new x34();
                                    for (ku3 m2 = gk2.m(matcher, 0, str5); m2 != null; m2 = m2.c()) {
                                        hu3 c = m2.c.c(1);
                                        c.getClass();
                                        x34Var.b.add(c.a);
                                        if (m2.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, m2.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = m2.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    x34Var.a = y34.h(sb.toString());
                                    linkedHashMap.put(str4, x34Var);
                                } else {
                                    c44.l("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = y34Var.a;
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
                        y34.a(fragment, arrayList2, sb2);
                        return new ti4(arrayList2, sb2.toString());
                    case 4:
                        ti4 ti4Var = (ti4) y34Var.h.getValue();
                        if (ti4Var == null || (list = (List) ti4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        ti4 ti4Var2 = (ti4) y34Var.h.getValue();
                        if (ti4Var2 == null) {
                            return null;
                        }
                        return (String) ti4Var2.B;
                    case ig7.b /* 6 */:
                        String str7 = (String) y34Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new h85(str7, i85.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        this.i = yf2.H(wk3Var, new ki2(this) { // from class: v34
            public final /* synthetic */ y34 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                List list;
                int i = r2;
                y34 y34Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = y34Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new h85(str2, i85.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(y34.r.d(y34Var.a));
                    case 2:
                        String str3 = y34Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) y34Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) tq0.M0(queryParameters);
                                    if (str5 == null) {
                                        y34Var.g = true;
                                        str5 = str4;
                                    }
                                    h85 h85Var = y34.n;
                                    h85Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = h85Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    x34 x34Var = new x34();
                                    for (ku3 m2 = gk2.m(matcher, 0, str5); m2 != null; m2 = m2.c()) {
                                        hu3 c = m2.c.c(1);
                                        c.getClass();
                                        x34Var.b.add(c.a);
                                        if (m2.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, m2.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = m2.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    x34Var.a = y34.h(sb.toString());
                                    linkedHashMap.put(str4, x34Var);
                                } else {
                                    c44.l("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = y34Var.a;
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
                        y34.a(fragment, arrayList2, sb2);
                        return new ti4(arrayList2, sb2.toString());
                    case 4:
                        ti4 ti4Var = (ti4) y34Var.h.getValue();
                        if (ti4Var == null || (list = (List) ti4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        ti4 ti4Var2 = (ti4) y34Var.h.getValue();
                        if (ti4Var2 == null) {
                            return null;
                        }
                        return (String) ti4Var2.B;
                    case ig7.b /* 6 */:
                        String str7 = (String) y34Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new h85(str7, i85.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        this.j = yf2.H(wk3Var, new ki2(this) { // from class: v34
            public final /* synthetic */ y34 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                List list;
                int i = r2;
                y34 y34Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = y34Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new h85(str2, i85.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(y34.r.d(y34Var.a));
                    case 2:
                        String str3 = y34Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) y34Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) tq0.M0(queryParameters);
                                    if (str5 == null) {
                                        y34Var.g = true;
                                        str5 = str4;
                                    }
                                    h85 h85Var = y34.n;
                                    h85Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = h85Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    x34 x34Var = new x34();
                                    for (ku3 m2 = gk2.m(matcher, 0, str5); m2 != null; m2 = m2.c()) {
                                        hu3 c = m2.c.c(1);
                                        c.getClass();
                                        x34Var.b.add(c.a);
                                        if (m2.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, m2.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = m2.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    x34Var.a = y34.h(sb.toString());
                                    linkedHashMap.put(str4, x34Var);
                                } else {
                                    c44.l("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = y34Var.a;
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
                        y34.a(fragment, arrayList2, sb2);
                        return new ti4(arrayList2, sb2.toString());
                    case 4:
                        ti4 ti4Var = (ti4) y34Var.h.getValue();
                        if (ti4Var == null || (list = (List) ti4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        ti4 ti4Var2 = (ti4) y34Var.h.getValue();
                        if (ti4Var2 == null) {
                            return null;
                        }
                        return (String) ti4Var2.B;
                    case ig7.b /* 6 */:
                        String str7 = (String) y34Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new h85(str7, i85.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        this.k = new il6(new ki2(this) { // from class: v34
            public final /* synthetic */ y34 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                List list;
                int i = r2;
                y34 y34Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = y34Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new h85(str2, i85.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(y34.r.d(y34Var.a));
                    case 2:
                        String str3 = y34Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) y34Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) tq0.M0(queryParameters);
                                    if (str5 == null) {
                                        y34Var.g = true;
                                        str5 = str4;
                                    }
                                    h85 h85Var = y34.n;
                                    h85Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = h85Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    x34 x34Var = new x34();
                                    for (ku3 m2 = gk2.m(matcher, 0, str5); m2 != null; m2 = m2.c()) {
                                        hu3 c = m2.c.c(1);
                                        c.getClass();
                                        x34Var.b.add(c.a);
                                        if (m2.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, m2.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = m2.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    x34Var.a = y34.h(sb.toString());
                                    linkedHashMap.put(str4, x34Var);
                                } else {
                                    c44.l("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = y34Var.a;
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
                        y34.a(fragment, arrayList2, sb2);
                        return new ti4(arrayList2, sb2.toString());
                    case 4:
                        ti4 ti4Var = (ti4) y34Var.h.getValue();
                        if (ti4Var == null || (list = (List) ti4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        ti4 ti4Var2 = (ti4) y34Var.h.getValue();
                        if (ti4Var2 == null) {
                            return null;
                        }
                        return (String) ti4Var2.B;
                    case ig7.b /* 6 */:
                        String str7 = (String) y34Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new h85(str7, i85.IGNORE_CASE);
                    default:
                        return null;
                }
            }
        });
        new il6(new ki2(this) { // from class: v34
            public final /* synthetic */ y34 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                List list;
                int i = r2;
                y34 y34Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = y34Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new h85(str2, i85.IGNORE_CASE);
                    case 1:
                        return Boolean.valueOf(y34.r.d(y34Var.a));
                    case 2:
                        String str3 = y34Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) y34Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) tq0.M0(queryParameters);
                                    if (str5 == null) {
                                        y34Var.g = true;
                                        str5 = str4;
                                    }
                                    h85 h85Var = y34.n;
                                    h85Var.getClass();
                                    str5.getClass();
                                    Matcher matcher = h85Var.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    x34 x34Var = new x34();
                                    for (ku3 m2 = gk2.m(matcher, 0, str5); m2 != null; m2 = m2.c()) {
                                        hu3 c = m2.c.c(1);
                                        c.getClass();
                                        x34Var.b.add(c.a);
                                        if (m2.b().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, m2.b().A));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i2 = m2.b().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    x34Var.a = y34.h(sb.toString());
                                    linkedHashMap.put(str4, x34Var);
                                } else {
                                    c44.l("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = y34Var.a;
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
                        y34.a(fragment, arrayList2, sb2);
                        return new ti4(arrayList2, sb2.toString());
                    case 4:
                        ti4 ti4Var = (ti4) y34Var.h.getValue();
                        if (ti4Var == null || (list = (List) ti4Var.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        ti4 ti4Var2 = (ti4) y34Var.h.getValue();
                        if (ti4Var2 == null) {
                            return null;
                        }
                        return (String) ti4Var2.B;
                    case ig7.b /* 6 */:
                        String str7 = (String) y34Var.j.getValue();
                        if (str7 == null) {
                            return null;
                        }
                        return new h85(str7, i85.IGNORE_CASE);
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
        ku3 m2 = gk2.m(matcher, 0, str);
        if (m2 != null) {
            a(str.substring(0, m2.b().A), arrayList, sb);
            if (!p.A.matcher(sb).find() && !q.A.matcher(sb).find()) {
                z = true;
            }
            this.l = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.c = h(sb.toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        h85 h85Var = n;
        h85Var.getClass();
        Matcher matcher = h85Var.A.matcher(str);
        matcher.getClass();
        int i = 0;
        for (ku3 m2 = gk2.m(matcher, 0, str); m2 != null; m2 = m2.c()) {
            hu3 c = m2.c.c(1);
            c.getClass();
            arrayList.add(c.a);
            if (m2.b().A > i) {
                String quote = Pattern.quote(str.substring(i, m2.b().A));
                quote.getClass();
                sb.append(quote);
            }
            String pattern = q.A.pattern();
            pattern.getClass();
            sb.append(pattern);
            i = m2.b().B + 1;
        }
        if (i < str.length()) {
            String quote2 = Pattern.quote(str.substring(i));
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, k34 k34Var) {
        if (k34Var != null) {
            z44 z44Var = k34Var.a;
            str.getClass();
            z44Var.e(bundle, str, z44Var.d(str2));
            return;
        }
        str.getClass();
        bundle.putString(str, str2);
    }

    public static String h(String str) {
        if (zg6.q0(str, "\\Q", false) && zg6.q0(str, "\\E", false)) {
            return gh6.l0(str, ".*", "\\E.*\\Q");
        }
        if (zg6.q0(str, "\\.\\*", false)) {
            return gh6.l0(str, "\\.\\*", ".*");
        }
        return str;
    }

    public final int b(Uri uri) {
        if (uri != null) {
            List<String> pathSegments = uri.getPathSegments();
            Uri parse = Uri.parse(this.a);
            parse.getClass();
            return tq0.P0(pathSegments, parse.getPathSegments()).size();
        }
        return 0;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (x34 x34Var : ((Map) this.f.getValue()).values()) {
            tq0.D0(arrayList, x34Var.b);
        }
        return tq0.X0(tq0.X0(this.b, arrayList), (List) this.i.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        ku3 c;
        ku3 c2;
        String str;
        uri.getClass();
        linkedHashMap.getClass();
        h85 h85Var = (h85) this.d.getValue();
        if (h85Var != null && (c = h85Var.c(uri.toString())) != null) {
            Bundle k = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
            if (e(c, k, linkedHashMap) && (!((Boolean) this.e.getValue()).booleanValue() || f(uri, k, linkedHashMap))) {
                String fragment = uri.getFragment();
                h85 h85Var2 = (h85) this.k.getValue();
                if (h85Var2 != null && (c2 = h85Var2.c(String.valueOf(fragment))) != null) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            String str2 = (String) obj;
                            hu3 c3 = c2.c.c(i2);
                            if (c3 != null) {
                                str = Uri.decode(c3.a);
                                str.getClass();
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            try {
                                g(k, str2, str, (k34) linkedHashMap.get(str2));
                                arrayList.add(o27.a);
                                i = i2;
                            } catch (IllegalArgumentException unused) {
                            }
                        } else {
                            l07.v0();
                            throw null;
                        }
                    }
                }
                if (cg2.Q(linkedHashMap, new w34(0, k)).isEmpty()) {
                    return k;
                }
            }
        }
        return null;
    }

    public final boolean e(ku3 ku3Var, Bundle bundle, Map map) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
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
                hu3 c = ku3Var.c.c(i3);
                if (c != null) {
                    str = Uri.decode(c.a);
                    str.getClass();
                }
                if (str == null) {
                    str = "";
                }
                try {
                    g(bundle, str2, str, (k34) map.get(str2));
                    arrayList2.add(o27.a);
                    i = i3;
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                l07.v0();
                throw null;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof y34)) {
            if (this.a.equals(((y34) obj).a)) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.net.Uri r20, android.os.Bundle r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y34.f(android.net.Uri, android.os.Bundle, java.util.Map):boolean");
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
