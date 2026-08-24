package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qr1  reason: default package */
/* loaded from: classes.dex */
public final class qr1 {
    public static final qr1 a = new Object();
    public static final nr1 b = new nr1(8388608, 0);
    public static final xk4 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [qr1, java.lang.Object] */
    static {
        wk4 wk4Var = new wk4();
        wk4Var.a(5L);
        wk4Var.b(8L);
        TimeUnit.SECONDS.getClass();
        wk4Var.z = az7.b(8L);
        wk4Var.f = true;
        c = new xk4(wk4Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:1|(2:3|(6:5|6|7|(1:(1:10)(2:157|158))(2:159|(2:161|162)(2:163|8c))|11|(18:25|26|27|(1:29)(2:137|(1:139)(2:140|(1:142)(2:143|(1:145)(2:146|(1:148)(2:149|(1:151)(2:152|(1:154)(1:155)))))))|30|31|32|33|(2:37|(7:50|51|52|(1:54)(2:113|(1:115)(2:116|(1:118)(2:119|(1:121)(2:122|(1:124)(2:125|(1:127)(2:128|(1:130)(1:131)))))))|55|(4:57|(1:61)|76|77)(11:78|(1:80)|81|82|(4:85|(1:92)(1:88)|89|90)|94|(3:96|(3:101|102|103)|104)|107|108|(1:110)|77)|(1:74)(3:65|338|70))(3:41|1d5|46))|134|(1:39)|50|51|52|(0)(0)|55|(0)(0)|(2:63|74)(1:75))(3:15|bf|20)))|178|6|7|(0)(0)|11|(1:13)|25|26|27|(0)(0)|30|31|32|33|(10:35|37|(0)|50|51|52|(0)(0)|55|(0)(0)|(0)(0))|134|(0)|50|51|52|(0)(0)|55|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0181, code lost:
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024c A[Catch: all -> 0x028e, TryCatch #6 {all -> 0x028e, blocks: (B:89:0x01ed, B:111:0x023c, B:113:0x024c, B:115:0x0282, B:117:0x0286, B:119:0x0292, B:122:0x029d, B:92:0x01f8, B:95:0x0203, B:98:0x020e, B:101:0x0219, B:104:0x0224, B:107:0x022f), top: B:176:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0292 A[Catch: all -> 0x028e, TryCatch #6 {all -> 0x028e, blocks: (B:89:0x01ed, B:111:0x023c, B:113:0x024c, B:115:0x0282, B:117:0x0286, B:119:0x0292, B:122:0x029d, B:92:0x01f8, B:95:0x0203, B:98:0x020e, B:101:0x0219, B:104:0x0224, B:107:0x022f), top: B:176:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103 A[Catch: all -> 0x01cc, TryCatch #4 {all -> 0x01cc, blocks: (B:43:0x00d0, B:65:0x0147, B:66:0x017c, B:69:0x0182, B:71:0x01c3, B:73:0x01c7, B:46:0x0103, B:49:0x010e, B:52:0x0119, B:55:0x0124, B:58:0x012f, B:61:0x013a), top: B:172:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f8 A[Catch: all -> 0x028e, TryCatch #6 {all -> 0x028e, blocks: (B:89:0x01ed, B:111:0x023c, B:113:0x024c, B:115:0x0282, B:117:0x0286, B:119:0x0292, B:122:0x029d, B:92:0x01f8, B:95:0x0203, B:98:0x020e, B:101:0x0219, B:104:0x0224, B:107:0x022f), top: B:176:0x01ed }] */
    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v7, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, String str2, String str3, String str4, String str5, s41 s41Var) {
        or1 or1Var;
        qr1 qr1Var;
        int i;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        ?? r0;
        ?? r02;
        Serializable serializable;
        ?? r03;
        String str11;
        String obj;
        yl5 yl5Var;
        int i2;
        yl5 yl5Var2;
        String str12;
        wl5 e;
        yl5 yl5Var3;
        if (s41Var instanceof or1) {
            or1Var = (or1) s41Var;
            int i3 = or1Var.g0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                or1Var.g0 = i3 - Integer.MIN_VALUE;
                qr1Var = this;
                or1 or1Var2 = or1Var;
                Object obj2 = or1Var2.e0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = or1Var2.g0;
                Serializable serializable2 = null;
                int i4 = 1;
                if (i == 0) {
                    if (i == 1) {
                        str10 = or1Var2.d0;
                        str9 = or1Var2.Z;
                        str8 = or1Var2.Y;
                        str7 = or1Var2.X;
                        str6 = or1Var2.R;
                        oi2.Y(obj2);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj2);
                    String obj3 = qs6.T0(str).toString();
                    if (qs6.v0(obj3)) {
                        return null;
                    }
                    String str13 = str2 + "|" + str3 + "|" + str4 + "|" + str5 + "|" + obj3;
                    nr1 nr1Var = b;
                    synchronized (nr1Var) {
                        ?? r04 = (byte[]) nr1Var.get(str13);
                        if (r04 != 0) {
                            return r04;
                        }
                        or1Var2.R = str2;
                        or1Var2.X = str3;
                        or1Var2.Y = str4;
                        or1Var2.Z = obj3;
                        or1Var2.d0 = str13;
                        or1Var2.g0 = 1;
                        obj2 = qr1Var.b(obj3, str2, str3, str4, str5, or1Var2);
                        if (obj2 == x61Var) {
                            return x61Var;
                        }
                        str6 = str2;
                        str7 = str3;
                        str8 = str4;
                        str9 = obj3;
                        str10 = str13;
                    }
                }
                r0 = (byte[]) obj2;
                if (r0 == 0 && r0.length != 0) {
                    nr1 nr1Var2 = b;
                    synchronized (nr1Var2) {
                        byte[] bArr = (byte[]) nr1Var2.put(str10, r0);
                    }
                    return r0;
                }
                String e0 = xs6.e0(xs6.e0(xs6.e0(xs6.e0(xs6.e0(str9, "&", "&amp;"), "<", "&lt;"), ">", "&gt;"), "\"", "&quot;"), "'", "&apos;");
                if (!xs6.g0(str6, "ru-", false)) {
                    str12 = "ru-RU";
                } else if (xs6.g0(str6, "ja-", false)) {
                    str12 = "ja-JP";
                } else if (xs6.g0(str6, "zh-", false)) {
                    str12 = "zh-CN";
                } else if (xs6.g0(str6, "de-", false)) {
                    str12 = "de-DE";
                } else if (xs6.g0(str6, "fr-", false)) {
                    str12 = "fr-FR";
                } else if (xs6.g0(str6, "es-", false)) {
                    str12 = "es-ES";
                } else if (xs6.g0(str6, "it-", false)) {
                    str12 = "it-IT";
                } else {
                    str12 = "en-US";
                }
                String str14 = "<speak version='1.0' xmlns='http://www.w3.org/2001/10/synthesis' xml:lang='" + str12 + "'><voice name='" + str6 + "'><prosody pitch='" + str7 + "' rate='" + str8 + "'>" + e0 + "</prosody></voice></speak>";
                xh5 xh5Var = n34.d;
                n34 n34Var = xk2.k("application/ssml+xml; charset=utf-8");
                int i5 = mk5.a;
                lk5 q = jx2.q(str14, n34Var);
                s9 s9Var = new s9(13);
                s9Var.I("https://eastus.tts.speech.microsoft.com/cognitiveservices/v1");
                s9Var.B("X-Microsoft-OutputFormat", "audio-24khz-48kbitrate-mono-mp3");
                s9Var.B("Content-Type", "application/ssml+xml");
                s9Var.B("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
                s9Var.D("POST", q);
                pa paVar = new pa(s9Var);
                xk4 xk4Var = c;
                xk4Var.getClass();
                e = new je5(xk4Var, paVar, false).e();
                if (e.m0 && (yl5Var3 = e.Z) != null) {
                    r02 = yl5Var3.e();
                    if (r02 == 0 && r02.length != 0) {
                        nr1 nr1Var3 = b;
                        synchronized (nr1Var3) {
                            byte[] bArr2 = (byte[]) nr1Var3.put(str10, r02);
                        }
                        return r02;
                    }
                    xk4 xk4Var2 = c;
                    if (!xs6.g0(str6, "ru-", false)) {
                        str11 = "ru";
                    } else if (xs6.g0(str6, "ja-", false)) {
                        str11 = "ja";
                    } else if (xs6.g0(str6, "zh-", false)) {
                        str11 = "zh";
                    } else if (xs6.g0(str6, "de-", false)) {
                        str11 = "de";
                    } else if (xs6.g0(str6, "fr-", false)) {
                        str11 = "fr";
                    } else if (xs6.g0(str6, "es-", false)) {
                        str11 = "es";
                    } else if (xs6.g0(str6, "it-", false)) {
                        str11 = "it";
                    } else {
                        str11 = "en";
                    }
                    obj = qs6.T0(str9).toString();
                    if (obj.length() > 180) {
                        String str15 = "https://translate.google.com/translate_tts?ie=UTF-8&client=tw-ob&tl=" + str11 + "&q=" + URLEncoder.encode(obj, "UTF-8");
                        s9 s9Var2 = new s9(13);
                        s9Var2.I(str15);
                        s9Var2.B("User-Agent", "Mozilla/5.0 (Linux; Android 14; Mobile)");
                        pa paVar2 = new pa(s9Var2);
                        xk4Var2.getClass();
                        wl5 e2 = new je5(xk4Var2, paVar2, false).e();
                        if (e2.m0 && (yl5Var2 = e2.Z) != null) {
                            serializable = null;
                            r03 = yl5Var2.e();
                        }
                        serializable = null;
                        r03 = serializable;
                    } else {
                        int length = obj.length();
                        int i6 = length / 150;
                        if (length % 150 == 0) {
                            i4 = 0;
                        }
                        ArrayList arrayList = new ArrayList(i6 + i4);
                        int i7 = 0;
                        while (i7 >= 0 && i7 < length) {
                            int i8 = i7 + 150;
                            if (i8 >= 0 && i8 <= length) {
                                serializable = serializable2;
                                i2 = i8;
                            } else {
                                serializable = serializable2;
                                i2 = length;
                            }
                            try {
                                CharSequence subSequence = obj.subSequence(i7, i2);
                                subSequence.getClass();
                                arrayList.add(subSequence.toString());
                                serializable2 = serializable;
                                i7 = i8;
                            } catch (Throwable unused) {
                            }
                        }
                        serializable = serializable2;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        int size = arrayList.size();
                        int i9 = 0;
                        while (i9 < size) {
                            Object obj4 = arrayList.get(i9);
                            i9++;
                            s9 s9Var3 = new s9(13);
                            s9Var3.I("https://translate.google.com/translate_tts?ie=UTF-8&client=tw-ob&tl=" + str11 + "&q=" + URLEncoder.encode((String) obj4, "UTF-8"));
                            s9Var3.B("User-Agent", "Mozilla/5.0 (Linux; Android 14; Mobile)");
                            pa paVar3 = new pa(s9Var3);
                            xk4Var2.getClass();
                            wl5 e3 = new je5(xk4Var2, paVar3, false).e();
                            if (e3.m0 && (yl5Var = e3.Z) != null) {
                                byteArrayOutputStream.write(yl5Var.e());
                            }
                        }
                        if (byteArrayOutputStream.size() > 0) {
                            r03 = byteArrayOutputStream.toByteArray();
                        }
                        r03 = serializable;
                    }
                    if (r03 == 0 && r03.length != 0) {
                        nr1 nr1Var4 = b;
                        synchronized (nr1Var4) {
                            byte[] bArr3 = (byte[]) nr1Var4.put(str10, r03);
                        }
                        return r03;
                    }
                }
                r02 = 0;
                if (r02 == 0) {
                }
                xk4 xk4Var22 = c;
                if (!xs6.g0(str6, "ru-", false)) {
                }
                obj = qs6.T0(str9).toString();
                if (obj.length() > 180) {
                }
                return r03 == 0 ? serializable : serializable;
            }
        }
        qr1Var = this;
        or1Var = new or1(qr1Var, s41Var);
        or1 or1Var22 = or1Var;
        Object obj22 = or1Var22.e0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = or1Var22.g0;
        Serializable serializable22 = null;
        int i42 = 1;
        if (i == 0) {
        }
        r0 = (byte[]) obj22;
        if (r0 == 0) {
        }
        String e02 = xs6.e0(xs6.e0(xs6.e0(xs6.e0(xs6.e0(str9, "&", "&amp;"), "<", "&lt;"), ">", "&gt;"), "\"", "&quot;"), "'", "&apos;");
        if (!xs6.g0(str6, "ru-", false)) {
        }
        String str142 = "<speak version='1.0' xmlns='http://www.w3.org/2001/10/synthesis' xml:lang='" + str12 + "'><voice name='" + str6 + "'><prosody pitch='" + str7 + "' rate='" + str8 + "'>" + e02 + "</prosody></voice></speak>";
        xh5 xh5Var2 = n34.d;
        n34 n34Var2 = xk2.k("application/ssml+xml; charset=utf-8");
        int i52 = mk5.a;
        lk5 q2 = jx2.q(str142, n34Var2);
        s9 s9Var4 = new s9(13);
        s9Var4.I("https://eastus.tts.speech.microsoft.com/cognitiveservices/v1");
        s9Var4.B("X-Microsoft-OutputFormat", "audio-24khz-48kbitrate-mono-mp3");
        s9Var4.B("Content-Type", "application/ssml+xml");
        s9Var4.B("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
        s9Var4.D("POST", q2);
        pa paVar4 = new pa(s9Var4);
        xk4 xk4Var3 = c;
        xk4Var3.getClass();
        e = new je5(xk4Var3, paVar4, false).e();
        if (e.m0) {
            r02 = yl5Var3.e();
            if (r02 == 0) {
            }
            xk4 xk4Var222 = c;
            if (!xs6.g0(str6, "ru-", false)) {
            }
            obj = qs6.T0(str9).toString();
            if (obj.length() > 180) {
            }
            if (r03 == 0) {
            }
        }
        r02 = 0;
        if (r02 == 0) {
        }
        xk4 xk4Var2222 = c;
        if (!xs6.g0(str6, "ru-", false)) {
        }
        obj = qs6.T0(str9).toString();
        if (obj.length() > 180) {
        }
        if (r03 == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|(1:(3:9|10|11)(2:46|47))(4:48|49|50|(1:52)(1:53))|12|13|14|(1:16)|18|19))|57|6|(0)(0)|12|13|14|(0)|18|19|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #3 {all -> 0x006c, blocks: (B:24:0x005e, B:26:0x0064), top: B:50:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {all -> 0x0094, blocks: (B:31:0x0086, B:33:0x008c), top: B:44:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v13, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v0, types: [dh5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, String str2, String str3, String str4, String str5, s41 s41Var) {
        pr1 pr1Var;
        int i;
        Throwable th;
        dh5 dh5Var;
        af5 af5Var;
        af5 af5Var2;
        if (s41Var instanceof pr1) {
            pr1Var = (pr1) s41Var;
            int i2 = pr1Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pr1Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = pr1Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = pr1Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        dh5Var = pr1Var.R;
                        try {
                            oi2.Y(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                String message = th.getMessage();
                                Log.w("EdgeNeuralTtsClient", "Edge WebSocket synthesis exception: " + message);
                                try {
                                    af5Var = (af5) dh5Var.A;
                                    if (af5Var != null) {
                                    }
                                } catch (Throwable unused) {
                                    return null;
                                }
                            } catch (Throwable th3) {
                                try {
                                    af5 af5Var3 = (af5) dh5Var.A;
                                    if (af5Var3 != null) {
                                        je5 je5Var = af5Var3.h;
                                        je5Var.getClass();
                                        je5Var.cancel();
                                    }
                                } catch (Throwable unused2) {
                                }
                                throw th3;
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ?? obj2 = new Object();
                    try {
                        hn hnVar = new hn((dh5) obj2, str, str2, str3, str4, str5, (r41) null);
                        pr1Var.R = obj2;
                        pr1Var.Z = 1;
                        obj = xk2.N(6500L, hnVar, pr1Var);
                        if (obj == x61Var) {
                            return x61Var;
                        }
                        dh5Var = obj2;
                    } catch (Throwable th4) {
                        th = th4;
                        dh5Var = obj2;
                        String message2 = th.getMessage();
                        Log.w("EdgeNeuralTtsClient", "Edge WebSocket synthesis exception: " + message2);
                        af5Var = (af5) dh5Var.A;
                        if (af5Var != null) {
                            return null;
                        }
                        je5 je5Var2 = af5Var.h;
                        je5Var2.getClass();
                        je5Var2.cancel();
                        return null;
                    }
                }
                ?? r14 = (byte[]) obj;
                af5Var2 = (af5) dh5Var.A;
                if (af5Var2 != null) {
                    je5 je5Var3 = af5Var2.h;
                    je5Var3.getClass();
                    je5Var3.cancel();
                }
                return r14;
            }
        }
        pr1Var = new pr1(this, s41Var);
        Object obj3 = pr1Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = pr1Var.Z;
        if (i == 0) {
        }
        ?? r142 = (byte[]) obj3;
        af5Var2 = (af5) dh5Var.A;
        if (af5Var2 != null) {
        }
        return r142;
    }
}
