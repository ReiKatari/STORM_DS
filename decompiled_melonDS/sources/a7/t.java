package a7;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t {
    public static final vc.f m = new vc.f("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: n  reason: collision with root package name */
    public static final vc.f f613n = new vc.f("\\{(.+?)\\}");

    /* renamed from: o  reason: collision with root package name */
    public static final vc.f f614o = new vc.f("http[s]?://");

    /* renamed from: p  reason: collision with root package name */
    public static final vc.f f615p = new vc.f(".*");

    /* renamed from: q  reason: collision with root package name */
    public static final vc.f f616q = new vc.f("([^/]*?|)");

    /* renamed from: r  reason: collision with root package name */
    public static final vc.f f617r = new vc.f("^[^?#]+\\?([^#]*).*");

    /* renamed from: a  reason: collision with root package name */
    public final String f618a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f619b;

    /* renamed from: c  reason: collision with root package name */
    public final String f620c;

    /* renamed from: d  reason: collision with root package name */
    public final yb.n f621d;

    /* renamed from: e  reason: collision with root package name */
    public final yb.n f622e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f623f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f624g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f625h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f626i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f627j;

    /* renamed from: k  reason: collision with root package name */
    public final yb.n f628k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f629l;

    public t(String str) {
        this.f618a = str;
        ArrayList arrayList = new ArrayList();
        this.f619b = arrayList;
        this.f621d = new yb.n(new mc.a(this) { // from class: a7.q
            public final /* synthetic */ t B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [yb.f, java.lang.Object] */
            @Override // mc.a
            public final Object b() {
                List list;
                switch (r2) {
                    case 0:
                        String str2 = this.B.f620c;
                        if (str2 != null) {
                            return new vc.f(str2, vc.g.IGNORE_CASE);
                        }
                        return null;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        return Boolean.valueOf(t.f617r.c(this.B.f618a));
                    case 2:
                        t tVar = this.B;
                        String str3 = tVar.f618a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f622e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) zb.l.T(queryParameters);
                                    if (str5 == null) {
                                        tVar.f624g = true;
                                        str5 = str4;
                                    }
                                    vc.f fVar = t.f613n;
                                    fVar.getClass();
                                    str5.getClass();
                                    Matcher matcher = fVar.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    s sVar = new s();
                                    for (b9.e f8 = p7.l.f(matcher, 0, str5); f8 != null; f8 = f8.D()) {
                                        vc.d b10 = ((s2.j) f8.R).b(1);
                                        b10.getClass();
                                        sVar.f612b.add(b10.f13788a);
                                        if (f8.x().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, f8.x().A));
                                            quote.getClass();
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i2 = f8.x().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    sVar.f611a = t.h(sb2.toString());
                                    linkedHashMap.put(str4, sVar);
                                } else {
                                    fj.j.p("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.B.f618a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        t.a(fragment, arrayList2, sb3);
                        return new yb.j(arrayList2, sb3.toString());
                    case 4:
                        yb.j jVar = (yb.j) this.B.f625h.getValue();
                        if (jVar == null || (list = (List) jVar.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case l1.c.f8511g /* 5 */:
                        yb.j jVar2 = (yb.j) this.B.f625h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.B;
                        }
                        return null;
                    case l1.c.f8509e /* 6 */:
                        String str7 = (String) this.B.f627j.getValue();
                        if (str7 != null) {
                            return new vc.f(str7, vc.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        this.f622e = new yb.n(new mc.a(this) { // from class: a7.q
            public final /* synthetic */ t B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [yb.f, java.lang.Object] */
            @Override // mc.a
            public final Object b() {
                List list;
                switch (r2) {
                    case 0:
                        String str2 = this.B.f620c;
                        if (str2 != null) {
                            return new vc.f(str2, vc.g.IGNORE_CASE);
                        }
                        return null;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        return Boolean.valueOf(t.f617r.c(this.B.f618a));
                    case 2:
                        t tVar = this.B;
                        String str3 = tVar.f618a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f622e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) zb.l.T(queryParameters);
                                    if (str5 == null) {
                                        tVar.f624g = true;
                                        str5 = str4;
                                    }
                                    vc.f fVar = t.f613n;
                                    fVar.getClass();
                                    str5.getClass();
                                    Matcher matcher = fVar.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    s sVar = new s();
                                    for (b9.e f8 = p7.l.f(matcher, 0, str5); f8 != null; f8 = f8.D()) {
                                        vc.d b10 = ((s2.j) f8.R).b(1);
                                        b10.getClass();
                                        sVar.f612b.add(b10.f13788a);
                                        if (f8.x().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, f8.x().A));
                                            quote.getClass();
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i2 = f8.x().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    sVar.f611a = t.h(sb2.toString());
                                    linkedHashMap.put(str4, sVar);
                                } else {
                                    fj.j.p("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.B.f618a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        t.a(fragment, arrayList2, sb3);
                        return new yb.j(arrayList2, sb3.toString());
                    case 4:
                        yb.j jVar = (yb.j) this.B.f625h.getValue();
                        if (jVar == null || (list = (List) jVar.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case l1.c.f8511g /* 5 */:
                        yb.j jVar2 = (yb.j) this.B.f625h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.B;
                        }
                        return null;
                    case l1.c.f8509e /* 6 */:
                        String str7 = (String) this.B.f627j.getValue();
                        if (str7 != null) {
                            return new vc.f(str7, vc.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        yb.h hVar = yb.h.NONE;
        this.f623f = p7.a.s(hVar, new mc.a(this) { // from class: a7.q
            public final /* synthetic */ t B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [yb.f, java.lang.Object] */
            @Override // mc.a
            public final Object b() {
                List list;
                switch (r2) {
                    case 0:
                        String str2 = this.B.f620c;
                        if (str2 != null) {
                            return new vc.f(str2, vc.g.IGNORE_CASE);
                        }
                        return null;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        return Boolean.valueOf(t.f617r.c(this.B.f618a));
                    case 2:
                        t tVar = this.B;
                        String str3 = tVar.f618a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f622e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) zb.l.T(queryParameters);
                                    if (str5 == null) {
                                        tVar.f624g = true;
                                        str5 = str4;
                                    }
                                    vc.f fVar = t.f613n;
                                    fVar.getClass();
                                    str5.getClass();
                                    Matcher matcher = fVar.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    s sVar = new s();
                                    for (b9.e f8 = p7.l.f(matcher, 0, str5); f8 != null; f8 = f8.D()) {
                                        vc.d b10 = ((s2.j) f8.R).b(1);
                                        b10.getClass();
                                        sVar.f612b.add(b10.f13788a);
                                        if (f8.x().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, f8.x().A));
                                            quote.getClass();
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i2 = f8.x().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    sVar.f611a = t.h(sb2.toString());
                                    linkedHashMap.put(str4, sVar);
                                } else {
                                    fj.j.p("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.B.f618a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        t.a(fragment, arrayList2, sb3);
                        return new yb.j(arrayList2, sb3.toString());
                    case 4:
                        yb.j jVar = (yb.j) this.B.f625h.getValue();
                        if (jVar == null || (list = (List) jVar.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case l1.c.f8511g /* 5 */:
                        yb.j jVar2 = (yb.j) this.B.f625h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.B;
                        }
                        return null;
                    case l1.c.f8509e /* 6 */:
                        String str7 = (String) this.B.f627j.getValue();
                        if (str7 != null) {
                            return new vc.f(str7, vc.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        this.f625h = p7.a.s(hVar, new mc.a(this) { // from class: a7.q
            public final /* synthetic */ t B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [yb.f, java.lang.Object] */
            @Override // mc.a
            public final Object b() {
                List list;
                switch (r2) {
                    case 0:
                        String str2 = this.B.f620c;
                        if (str2 != null) {
                            return new vc.f(str2, vc.g.IGNORE_CASE);
                        }
                        return null;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        return Boolean.valueOf(t.f617r.c(this.B.f618a));
                    case 2:
                        t tVar = this.B;
                        String str3 = tVar.f618a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f622e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) zb.l.T(queryParameters);
                                    if (str5 == null) {
                                        tVar.f624g = true;
                                        str5 = str4;
                                    }
                                    vc.f fVar = t.f613n;
                                    fVar.getClass();
                                    str5.getClass();
                                    Matcher matcher = fVar.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    s sVar = new s();
                                    for (b9.e f8 = p7.l.f(matcher, 0, str5); f8 != null; f8 = f8.D()) {
                                        vc.d b10 = ((s2.j) f8.R).b(1);
                                        b10.getClass();
                                        sVar.f612b.add(b10.f13788a);
                                        if (f8.x().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, f8.x().A));
                                            quote.getClass();
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i2 = f8.x().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    sVar.f611a = t.h(sb2.toString());
                                    linkedHashMap.put(str4, sVar);
                                } else {
                                    fj.j.p("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.B.f618a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        t.a(fragment, arrayList2, sb3);
                        return new yb.j(arrayList2, sb3.toString());
                    case 4:
                        yb.j jVar = (yb.j) this.B.f625h.getValue();
                        if (jVar == null || (list = (List) jVar.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case l1.c.f8511g /* 5 */:
                        yb.j jVar2 = (yb.j) this.B.f625h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.B;
                        }
                        return null;
                    case l1.c.f8509e /* 6 */:
                        String str7 = (String) this.B.f627j.getValue();
                        if (str7 != null) {
                            return new vc.f(str7, vc.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        this.f626i = p7.a.s(hVar, new mc.a(this) { // from class: a7.q
            public final /* synthetic */ t B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [yb.f, java.lang.Object] */
            @Override // mc.a
            public final Object b() {
                List list;
                switch (r2) {
                    case 0:
                        String str2 = this.B.f620c;
                        if (str2 != null) {
                            return new vc.f(str2, vc.g.IGNORE_CASE);
                        }
                        return null;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        return Boolean.valueOf(t.f617r.c(this.B.f618a));
                    case 2:
                        t tVar = this.B;
                        String str3 = tVar.f618a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f622e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) zb.l.T(queryParameters);
                                    if (str5 == null) {
                                        tVar.f624g = true;
                                        str5 = str4;
                                    }
                                    vc.f fVar = t.f613n;
                                    fVar.getClass();
                                    str5.getClass();
                                    Matcher matcher = fVar.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    s sVar = new s();
                                    for (b9.e f8 = p7.l.f(matcher, 0, str5); f8 != null; f8 = f8.D()) {
                                        vc.d b10 = ((s2.j) f8.R).b(1);
                                        b10.getClass();
                                        sVar.f612b.add(b10.f13788a);
                                        if (f8.x().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, f8.x().A));
                                            quote.getClass();
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i2 = f8.x().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    sVar.f611a = t.h(sb2.toString());
                                    linkedHashMap.put(str4, sVar);
                                } else {
                                    fj.j.p("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.B.f618a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        t.a(fragment, arrayList2, sb3);
                        return new yb.j(arrayList2, sb3.toString());
                    case 4:
                        yb.j jVar = (yb.j) this.B.f625h.getValue();
                        if (jVar == null || (list = (List) jVar.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case l1.c.f8511g /* 5 */:
                        yb.j jVar2 = (yb.j) this.B.f625h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.B;
                        }
                        return null;
                    case l1.c.f8509e /* 6 */:
                        String str7 = (String) this.B.f627j.getValue();
                        if (str7 != null) {
                            return new vc.f(str7, vc.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        this.f627j = p7.a.s(hVar, new mc.a(this) { // from class: a7.q
            public final /* synthetic */ t B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [yb.f, java.lang.Object] */
            @Override // mc.a
            public final Object b() {
                List list;
                switch (r2) {
                    case 0:
                        String str2 = this.B.f620c;
                        if (str2 != null) {
                            return new vc.f(str2, vc.g.IGNORE_CASE);
                        }
                        return null;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        return Boolean.valueOf(t.f617r.c(this.B.f618a));
                    case 2:
                        t tVar = this.B;
                        String str3 = tVar.f618a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f622e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) zb.l.T(queryParameters);
                                    if (str5 == null) {
                                        tVar.f624g = true;
                                        str5 = str4;
                                    }
                                    vc.f fVar = t.f613n;
                                    fVar.getClass();
                                    str5.getClass();
                                    Matcher matcher = fVar.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    s sVar = new s();
                                    for (b9.e f8 = p7.l.f(matcher, 0, str5); f8 != null; f8 = f8.D()) {
                                        vc.d b10 = ((s2.j) f8.R).b(1);
                                        b10.getClass();
                                        sVar.f612b.add(b10.f13788a);
                                        if (f8.x().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, f8.x().A));
                                            quote.getClass();
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i2 = f8.x().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    sVar.f611a = t.h(sb2.toString());
                                    linkedHashMap.put(str4, sVar);
                                } else {
                                    fj.j.p("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.B.f618a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        t.a(fragment, arrayList2, sb3);
                        return new yb.j(arrayList2, sb3.toString());
                    case 4:
                        yb.j jVar = (yb.j) this.B.f625h.getValue();
                        if (jVar == null || (list = (List) jVar.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case l1.c.f8511g /* 5 */:
                        yb.j jVar2 = (yb.j) this.B.f625h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.B;
                        }
                        return null;
                    case l1.c.f8509e /* 6 */:
                        String str7 = (String) this.B.f627j.getValue();
                        if (str7 != null) {
                            return new vc.f(str7, vc.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        this.f628k = new yb.n(new mc.a(this) { // from class: a7.q
            public final /* synthetic */ t B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [yb.f, java.lang.Object] */
            @Override // mc.a
            public final Object b() {
                List list;
                switch (r2) {
                    case 0:
                        String str2 = this.B.f620c;
                        if (str2 != null) {
                            return new vc.f(str2, vc.g.IGNORE_CASE);
                        }
                        return null;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        return Boolean.valueOf(t.f617r.c(this.B.f618a));
                    case 2:
                        t tVar = this.B;
                        String str3 = tVar.f618a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f622e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) zb.l.T(queryParameters);
                                    if (str5 == null) {
                                        tVar.f624g = true;
                                        str5 = str4;
                                    }
                                    vc.f fVar = t.f613n;
                                    fVar.getClass();
                                    str5.getClass();
                                    Matcher matcher = fVar.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    s sVar = new s();
                                    for (b9.e f8 = p7.l.f(matcher, 0, str5); f8 != null; f8 = f8.D()) {
                                        vc.d b10 = ((s2.j) f8.R).b(1);
                                        b10.getClass();
                                        sVar.f612b.add(b10.f13788a);
                                        if (f8.x().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, f8.x().A));
                                            quote.getClass();
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i2 = f8.x().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    sVar.f611a = t.h(sb2.toString());
                                    linkedHashMap.put(str4, sVar);
                                } else {
                                    fj.j.p("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.B.f618a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        t.a(fragment, arrayList2, sb3);
                        return new yb.j(arrayList2, sb3.toString());
                    case 4:
                        yb.j jVar = (yb.j) this.B.f625h.getValue();
                        if (jVar == null || (list = (List) jVar.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case l1.c.f8511g /* 5 */:
                        yb.j jVar2 = (yb.j) this.B.f625h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.B;
                        }
                        return null;
                    case l1.c.f8509e /* 6 */:
                        String str7 = (String) this.B.f627j.getValue();
                        if (str7 != null) {
                            return new vc.f(str7, vc.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        new yb.n(new mc.a(this) { // from class: a7.q
            public final /* synthetic */ t B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [yb.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [yb.f, java.lang.Object] */
            @Override // mc.a
            public final Object b() {
                List list;
                switch (r2) {
                    case 0:
                        String str2 = this.B.f620c;
                        if (str2 != null) {
                            return new vc.f(str2, vc.g.IGNORE_CASE);
                        }
                        return null;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        return Boolean.valueOf(t.f617r.c(this.B.f618a));
                    case 2:
                        t tVar = this.B;
                        String str3 = tVar.f618a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f622e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() <= 1) {
                                    String str5 = (String) zb.l.T(queryParameters);
                                    if (str5 == null) {
                                        tVar.f624g = true;
                                        str5 = str4;
                                    }
                                    vc.f fVar = t.f613n;
                                    fVar.getClass();
                                    str5.getClass();
                                    Matcher matcher = fVar.A.matcher(str5);
                                    matcher.getClass();
                                    int i2 = 0;
                                    s sVar = new s();
                                    for (b9.e f8 = p7.l.f(matcher, 0, str5); f8 != null; f8 = f8.D()) {
                                        vc.d b10 = ((s2.j) f8.R).b(1);
                                        b10.getClass();
                                        sVar.f612b.add(b10.f13788a);
                                        if (f8.x().A > i2) {
                                            String quote = Pattern.quote(str5.substring(i2, f8.x().A));
                                            quote.getClass();
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i2 = f8.x().B + 1;
                                    }
                                    if (i2 < str5.length()) {
                                        String quote2 = Pattern.quote(str5.substring(i2));
                                        quote2.getClass();
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    sVar.f611a = t.h(sb2.toString());
                                    linkedHashMap.put(str4, sVar);
                                } else {
                                    fj.j.p("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                            }
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.B.f618a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        fragment.getClass();
                        t.a(fragment, arrayList2, sb3);
                        return new yb.j(arrayList2, sb3.toString());
                    case 4:
                        yb.j jVar = (yb.j) this.B.f625h.getValue();
                        if (jVar == null || (list = (List) jVar.A) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case l1.c.f8511g /* 5 */:
                        yb.j jVar2 = (yb.j) this.B.f625h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.B;
                        }
                        return null;
                    case l1.c.f8509e /* 6 */:
                        String str7 = (String) this.B.f627j.getValue();
                        if (str7 != null) {
                            return new vc.f(str7, vc.g.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb2 = new StringBuilder("^");
        if (!m.A.matcher(str).find()) {
            String pattern = f614o.A.pattern();
            pattern.getClass();
            sb2.append(pattern);
        }
        Pattern compile = Pattern.compile("(\\?|#|$)");
        compile.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        boolean z10 = false;
        b9.e f8 = p7.l.f(matcher, 0, str);
        if (f8 != null) {
            a(str.substring(0, f8.x().A), arrayList, sb2);
            if (!f615p.A.matcher(sb2).find() && !f616q.A.matcher(sb2).find()) {
                z10 = true;
            }
            this.f629l = z10;
            sb2.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.f620c = h(sb2.toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb2) {
        vc.f fVar = f613n;
        fVar.getClass();
        Matcher matcher = fVar.A.matcher(str);
        matcher.getClass();
        int i2 = 0;
        for (b9.e f8 = p7.l.f(matcher, 0, str); f8 != null; f8 = f8.D()) {
            vc.d b10 = ((s2.j) f8.R).b(1);
            b10.getClass();
            arrayList.add(b10.f13788a);
            if (f8.x().A > i2) {
                String quote = Pattern.quote(str.substring(i2, f8.x().A));
                quote.getClass();
                sb2.append(quote);
            }
            String pattern = f616q.A.pattern();
            pattern.getClass();
            sb2.append(pattern);
            i2 = f8.x().B + 1;
        }
        if (i2 < str.length()) {
            String quote2 = Pattern.quote(str.substring(i2));
            quote2.getClass();
            sb2.append(quote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, h hVar) {
        if (hVar != null) {
            k0 k0Var = hVar.f571a;
            str.getClass();
            k0Var.e(bundle, str, k0Var.d(str2));
            return;
        }
        str.getClass();
        bundle.putString(str, str2);
    }

    public static String h(String str) {
        if (vc.h.Y(str, "\\Q", false) && vc.h.Y(str, "\\E", false)) {
            return vc.o.T(str, ".*", "\\E.*\\Q");
        }
        if (vc.h.Y(str, "\\.\\*", false)) {
            return vc.o.T(str, "\\.\\*", ".*");
        }
        return str;
    }

    public final int b(Uri uri) {
        if (uri != null) {
            List<String> pathSegments = uri.getPathSegments();
            Uri parse = Uri.parse(this.f618a);
            parse.getClass();
            return zb.l.V(pathSegments, parse.getPathSegments()).size();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yb.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [yb.f, java.lang.Object] */
    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (s sVar : ((Map) this.f623f.getValue()).values()) {
            zb.l.L(sVar.f612b, arrayList);
        }
        return zb.l.e0(zb.l.e0(this.f619b, arrayList), (List) this.f626i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [yb.f, java.lang.Object] */
    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        b9.e b10;
        b9.e b11;
        String str;
        uri.getClass();
        linkedHashMap.getClass();
        vc.f fVar = (vc.f) this.f621d.getValue();
        if (fVar != null && (b10 = fVar.b(uri.toString())) != null) {
            int i2 = 0;
            Bundle b12 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
            if (e(b10, b12, linkedHashMap) && (!((Boolean) this.f622e.getValue()).booleanValue() || f(uri, b12, linkedHashMap))) {
                String fragment = uri.getFragment();
                vc.f fVar2 = (vc.f) this.f628k.getValue();
                if (fVar2 != null && (b11 = fVar2.b(String.valueOf(fragment))) != null) {
                    List list = (List) this.f626i.getValue();
                    ArrayList arrayList = new ArrayList(zb.m.G(list, 10));
                    for (Object obj : list) {
                        int i10 = i2 + 1;
                        if (i2 >= 0) {
                            String str2 = (String) obj;
                            vc.d b13 = ((s2.j) b11.R).b(i10);
                            if (b13 != null) {
                                str = Uri.decode(b13.f13788a);
                                str.getClass();
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            try {
                                g(b12, str2, str, (h) linkedHashMap.get(str2));
                                arrayList.add(yb.y.f14813a);
                                i2 = i10;
                            } catch (IllegalArgumentException unused) {
                            }
                        } else {
                            p7.t.F();
                            throw null;
                        }
                    }
                }
                if (d0.d.b0(linkedHashMap, new r(0, b12)).isEmpty()) {
                    return b12;
                }
            }
        }
        return null;
    }

    public final boolean e(b9.e eVar, Bundle bundle, Map map) {
        ArrayList arrayList = this.f619b;
        ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int i11 = i2 + 1;
            String str = null;
            if (i2 >= 0) {
                String str2 = (String) obj;
                vc.d b10 = ((s2.j) eVar.R).b(i11);
                if (b10 != null) {
                    str = Uri.decode(b10.f13788a);
                    str.getClass();
                }
                if (str == null) {
                    str = "";
                }
                try {
                    g(bundle, str2, str, (h) map.get(str2));
                    arrayList2.add(yb.y.f14813a);
                    i2 = i11;
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                p7.t.F();
                throw null;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof t)) {
            if (this.f618a.equals(((t) obj).f618a)) {
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
    /* JADX WARN: Type inference failed for: r2v0, types: [yb.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.net.Uri r20, android.os.Bundle r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.t.f(android.net.Uri, android.os.Bundle, java.util.Map):boolean");
    }

    public final int hashCode() {
        return this.f618a.hashCode() * 961;
    }
}
