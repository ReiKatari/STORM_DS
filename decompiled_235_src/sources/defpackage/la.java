package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: la  reason: default package */
/* loaded from: classes.dex */
public final class la extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ la(Object obj, Object obj2, Object obj3, Object obj4, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = obj;
        this.Z = obj2;
        this.d0 = obj3;
        this.e0 = obj4;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((la) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                ((la) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            case 2:
                return ((la) q(r41Var, w61Var)).s(jg7Var);
            case 3:
                return ((la) q(r41Var, w61Var)).s(jg7Var);
            case 4:
                return ((la) q(r41Var, w61Var)).s(jg7Var);
            case 5:
                return ((la) q(r41Var, w61Var)).s(jg7Var);
            case 6:
                return ((la) q(r41Var, w61Var)).s(jg7Var);
            case 7:
                return ((la) q(r41Var, w61Var)).s(jg7Var);
            case 8:
                ((la) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            default:
                return ((la) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.e0;
        Object obj3 = this.d0;
        Object obj4 = this.Z;
        switch (i) {
            case 0:
                la laVar = new la((u63) obj4, (hm4) obj3, (qn2) obj2, r41Var, 0);
                laVar.Y = obj;
                return laVar;
            case 1:
                la laVar2 = new la((zy4) obj4, (g17) obj3, (p27) obj2, r41Var, 1);
                laVar2.Y = obj;
                return laVar2;
            case 2:
                return new la((yc1) this.Y, (String) obj4, (String) obj3, (String) obj2, r41Var, 2);
            case 3:
                return new la((sz1) this.Y, (dy1) obj4, (c46) obj3, (String) obj2, r41Var, 3);
            case 4:
                return new la((String) this.Y, (String) obj4, (String) obj3, (ss2) obj2, r41Var, 4);
            case 5:
                return new la((String) this.Y, (bt) obj4, (String) obj3, (String) obj2, r41Var, 5);
            case 6:
                return new la((String) this.Y, (String) obj4, (ap3) obj3, (String) obj2, r41Var, 6);
            case 7:
                return new la((String) this.Y, (String) obj4, (String) obj3, (ss2) obj2, r41Var, 7);
            case 8:
                return new la((eo2) this.Y, (String) obj4, (String) obj3, (qa4) obj2, r41Var, 8);
            default:
                return new la((String) this.Y, (String) obj4, (String) obj3, (ss2) obj2, r41Var, 9);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object em5Var;
        File file;
        int contentLength;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr;
        int i;
        String str;
        wl5 e;
        yl5 yl5Var;
        String r;
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        yl5 yl5Var2;
        String r2;
        JSONArray optJSONArray2;
        String str2;
        yl5 yl5Var3;
        String r3;
        yl5 yl5Var4;
        String r4;
        yl5 yl5Var5;
        String r5;
        String optString;
        String str3;
        yl5 yl5Var6;
        String r6;
        int i2 = this.X;
        jg7 jg7Var = jg7.a;
        String str4 = "auto";
        Object obj2 = this.e0;
        Object obj3 = this.d0;
        Object obj4 = this.Z;
        switch (i2) {
            case 0:
                w61 w61Var = (w61) this.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                u63 u63Var = (u63) obj4;
                hm4 hm4Var = (hm4) obj3;
                qn2 qn2Var = (qn2) obj2;
                try {
                    file = new File(((Context) u63Var.B).getCacheDir(), "driver_download_" + System.currentTimeMillis() + ".zip");
                    HttpURLConnection B = u63.B(u63Var, hm4Var.g);
                    contentLength = B.getContentLength();
                    inputStream = B.getInputStream();
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        bArr = new byte[16384];
                        i = 0;
                    } finally {
                    }
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                        i += read;
                        if (contentLength > 0) {
                            qn2Var.g(new Integer(gi2.q((int) ((i / contentLength) * 100.0d), 0, 100)));
                        }
                    } else {
                        fileOutputStream.close();
                        inputStream.close();
                        em5Var = u63Var.q(file, hm4Var.b + " (" + hm4Var.c + ")");
                        file.delete();
                        return new hm5(em5Var);
                    }
                }
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                w61 w61Var2 = (w61) this.Y;
                a71 a71Var = a71.UNDISPATCHED;
                zy4 zy4Var = (zy4) obj4;
                hv.L(w61Var2, null, a71Var, new z51(zy4Var, (g17) obj3, null, 0), 1);
                hv.L(w61Var2, null, a71Var, new z(zy4Var, (p27) obj2, null, 26), 1);
                return jg7Var;
            case 2:
                String str5 = (String) obj4;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                yc1 yc1Var = (yc1) this.Y;
                String obj5 = qs6.T0((String) ((xp2) yc1Var.B).c()).toString();
                if (obj5.length() != 0 && !qs6.v0(str5)) {
                    if (xs6.Y(obj5, ":fx", false)) {
                        str = "https://api-free.deepl.com/v2/translate";
                    } else {
                        str = "https://api.deepl.com/v2/translate";
                    }
                    JSONObject jSONObject = new JSONObject();
                    String str6 = (String) obj2;
                    jSONObject.put("text", new JSONArray().put(str5));
                    Locale locale = Locale.ROOT;
                    String upperCase = ((String) obj3).toUpperCase(locale);
                    upperCase.getClass();
                    jSONObject.put("target_lang", upperCase);
                    if (!nb3.k(str6, "auto")) {
                        String upperCase2 = str6.toUpperCase(locale);
                        upperCase2.getClass();
                        jSONObject.put("source_lang", upperCase2);
                    }
                    int i3 = mk5.a;
                    String jSONObject2 = jSONObject.toString();
                    jSONObject2.getClass();
                    xh5 xh5Var = n34.d;
                    lk5 q = jx2.q(jSONObject2, xk2.k("application/json"));
                    s9 s9Var = new s9(13);
                    s9Var.I(str);
                    s9Var.B("Authorization", "DeepL-Auth-Key ".concat(obj5));
                    s9Var.D("POST", q);
                    pa paVar = new pa(s9Var);
                    xk4 xk4Var = (xk4) yc1Var.A;
                    xk4Var.getClass();
                    e = new je5(xk4Var, paVar, false).e();
                    try {
                        if (e.m0 && (yl5Var = e.Z) != null && (r = yl5Var.r()) != null && (optJSONArray = new JSONObject(r).optJSONArray("translations")) != null && (optJSONObject = optJSONArray.optJSONObject(0)) != null) {
                            String optString2 = optJSONObject.optString("text");
                            if (optString2 != null) {
                                str5 = optString2;
                            }
                        }
                        e.close();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return str5;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                yb2 yb2Var = ((sz1) this.Y).s;
                pq5 pq5Var = ((dy1) obj4).a;
                yb2Var.f(pq5Var, ((c46) obj3).a, (String) obj2);
                return yb2Var.c(pq5Var);
            case 4:
                String str7 = (String) obj4;
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                String str8 = (String) this.Y;
                if (!qs6.v0(str8)) {
                    if (!nb3.k(str7, "auto")) {
                        str4 = str7;
                    }
                    String encode = URLEncoder.encode(str8, "UTF-8");
                    encode.getClass();
                    String e0 = xs6.e0(encode, "+", "%20");
                    StringBuilder u = i61.u("https://translate.googleapis.com/translate_a/single?client=gtx&sl=", str4, "&tl=", (String) obj3, "&dt=t&q=");
                    u.append(e0);
                    String sb = u.toString();
                    s9 s9Var2 = new s9(13);
                    s9Var2.I(sb);
                    s9Var2.B("User-Agent", "Mozilla/5.0 (Android; Mobile; rv:128.0) Gecko/128.0 Firefox/128.0");
                    pa paVar2 = new pa(s9Var2);
                    xk4 xk4Var2 = ((ss2) obj2).B;
                    xk4Var2.getClass();
                    e = new je5(xk4Var2, paVar2, false).e();
                    try {
                        if (e.m0 && (yl5Var2 = e.Z) != null && (r2 = yl5Var2.r()) != null && (optJSONArray2 = new JSONArray(r2).optJSONArray(0)) != null) {
                            StringBuilder sb2 = new StringBuilder();
                            int length = optJSONArray2.length();
                            for (int i4 = 0; i4 < length; i4++) {
                                JSONArray optJSONArray3 = optJSONArray2.optJSONArray(i4);
                                if (optJSONArray3 != null) {
                                    str2 = optJSONArray3.optString(0);
                                } else {
                                    str2 = null;
                                }
                                if (str2 != null && str2.length() != 0) {
                                    sb2.append(str2);
                                }
                            }
                            String obj6 = qs6.T0(sb2.toString()).toString();
                            if (obj6.length() > 0) {
                                str8 = obj6;
                            }
                        }
                        e.close();
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } finally {
                        }
                    }
                }
                return str8;
            case 5:
                bt btVar = (bt) obj4;
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                String str9 = (String) this.Y;
                if (!qs6.v0(str9)) {
                    CharSequence charSequence = (CharSequence) ((on2) btVar.L).c();
                    if (qs6.v0(charSequence)) {
                        charSequence = "https://translate.terraprint.co/translate";
                    }
                    String str10 = (String) charSequence;
                    JSONObject jSONObject3 = new JSONObject();
                    String str11 = (String) obj3;
                    String str12 = (String) obj2;
                    jSONObject3.put("q", str9);
                    if (!nb3.k(str11, "auto")) {
                        str4 = str11;
                    }
                    jSONObject3.put("source", str4);
                    jSONObject3.put("target", str12);
                    jSONObject3.put("format", "text");
                    String obj7 = qs6.T0((String) ((on2) btVar.R).c()).toString();
                    if (obj7.length() > 0) {
                        jSONObject3.put("api_key", obj7);
                    }
                    int i5 = mk5.a;
                    String jSONObject4 = jSONObject3.toString();
                    jSONObject4.getClass();
                    xh5 xh5Var2 = n34.d;
                    lk5 q2 = jx2.q(jSONObject4, xk2.k("application/json; charset=utf-8"));
                    s9 s9Var3 = new s9(13);
                    s9Var3.I(str10);
                    s9Var3.B("Content-Type", "application/json; charset=utf-8");
                    s9Var3.D("POST", q2);
                    pa paVar3 = new pa(s9Var3);
                    xk4 xk4Var3 = (xk4) btVar.B;
                    xk4Var3.getClass();
                    e = new je5(xk4Var3, paVar3, false).e();
                    try {
                        if (e.m0 && (yl5Var3 = e.Z) != null && (r3 = yl5Var3.r()) != null) {
                            String optString3 = new JSONObject(r3).optString("translatedText", str9);
                            optString3.getClass();
                            str9 = xs6.e0(optString3, "+", " ");
                        }
                        e.close();
                    } finally {
                        try {
                            throw th2;
                        } finally {
                        }
                    }
                }
                return str9;
            case 6:
                ap3 ap3Var = (ap3) obj3;
                String str13 = (String) obj4;
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                String str14 = (String) this.Y;
                if (!qs6.v0(str14)) {
                    if (!nb3.k(str13, "auto")) {
                        str4 = str13;
                    }
                    String encode2 = URLEncoder.encode(str14, "UTF-8");
                    encode2.getClass();
                    String e02 = xs6.e0(encode2, "+", "%20");
                    for (String str15 : (List) ap3Var.L) {
                        try {
                            String str16 = str15 + "/api/v1/" + str4 + "/" + ((String) obj2) + "/" + e02;
                            s9 s9Var4 = new s9(13);
                            s9Var4.I(str16);
                            s9Var4.B("User-Agent", "Mozilla/5.0 (Android; Mobile; rv:128.0)");
                            pa paVar4 = new pa(s9Var4);
                            xk4 xk4Var4 = (xk4) ap3Var.B;
                            xk4Var4.getClass();
                            wl5 e2 = new je5(xk4Var4, paVar4, false).e();
                            if (e2.m0 && (yl5Var4 = e2.Z) != null && (r4 = yl5Var4.r()) != null) {
                                String optString4 = new JSONObject(r4).optString("translation");
                                optString4.getClass();
                                if (!qs6.v0(optString4)) {
                                    String e03 = xs6.e0(optString4, "+", " ");
                                    e2.close();
                                    str14 = e03;
                                }
                            }
                            e2.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
                return str14;
            case 7:
                String str17 = (String) obj4;
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                String str18 = (String) this.Y;
                if (!qs6.v0(str18)) {
                    if (nb3.k(str17, "auto")) {
                        str17 = "en";
                    }
                    String m = lb1.m(str17, "|", (String) obj3);
                    String encode3 = URLEncoder.encode(str18, "UTF-8");
                    encode3.getClass();
                    String str19 = "https://api.mymemory.translated.net/get?q=" + xs6.e0(encode3, "+", "%20") + "&langpair=" + m;
                    s9 s9Var5 = new s9(13);
                    s9Var5.I(str19);
                    pa paVar5 = new pa(s9Var5);
                    xk4 xk4Var5 = ((ss2) obj2).B;
                    xk4Var5.getClass();
                    e = new je5(xk4Var5, paVar5, false).e();
                    try {
                        if (e.m0 && (yl5Var5 = e.Z) != null && (r5 = yl5Var5.r()) != null) {
                            JSONObject optJSONObject2 = new JSONObject(r5).optJSONObject("responseData");
                            if (optJSONObject2 != null && (optString = optJSONObject2.optString("translatedText")) != null) {
                                str18 = optString;
                            }
                            str18 = xs6.e0(str18, "+", " ");
                        }
                        e.close();
                    } catch (Throwable th22) {
                        try {
                            throw th22;
                        } finally {
                        }
                    }
                }
                return str18;
            case 8:
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                py0 py0Var = lt5.a;
                if (((Boolean) ((qa4) obj2).getValue()).booleanValue()) {
                    ((eo2) this.Y).o((String) obj4, (String) obj3);
                }
                return jg7Var;
            default:
                String str20 = (String) obj4;
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                String str21 = (String) this.Y;
                if (!qs6.v0(str21)) {
                    if (!nb3.k(str20, "auto") && !qs6.v0(str20)) {
                        str3 = str20.concat("-");
                    } else {
                        str3 = "";
                    }
                    String encode4 = URLEncoder.encode(str21, "UTF-8");
                    encode4.getClass();
                    String str22 = "https://translate.yandex.net/api/v1/tr.json/translate?srv=android&lang=" + (str3 + ((String) obj3)) + "&text=" + xs6.e0(encode4, "+", "%20");
                    s9 s9Var6 = new s9(13);
                    s9Var6.I(str22);
                    s9Var6.B("User-Agent", "Mozilla/5.0 (Android; Mobile; rv:128.0) Gecko/128.0 Firefox/128.0");
                    pa paVar6 = new pa(s9Var6);
                    xk4 xk4Var6 = ((ss2) obj2).B;
                    xk4Var6.getClass();
                    e = new je5(xk4Var6, paVar6, false).e();
                    try {
                        if (e.m0 && (yl5Var6 = e.Z) != null && (r6 = yl5Var6.r()) != null) {
                            JSONObject jSONObject5 = new JSONObject(r6);
                            JSONArray optJSONArray4 = jSONObject5.optJSONArray("text");
                            if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                                StringBuilder sb3 = new StringBuilder();
                                int length2 = optJSONArray4.length();
                                for (int i6 = 0; i6 < length2; i6++) {
                                    sb3.append(optJSONArray4.optString(i6));
                                    sb3.append(" ");
                                }
                                String obj8 = qs6.T0(sb3.toString()).toString();
                                if (obj8.length() != 0) {
                                    str21 = obj8;
                                }
                            } else {
                                str21 = jSONObject5.optString("text", str21);
                            }
                            e.close();
                            str21.getClass();
                        }
                        e.close();
                    } finally {
                    }
                }
                return str21;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ la(Object obj, Object obj2, Object obj3, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
        this.e0 = obj3;
    }
}
