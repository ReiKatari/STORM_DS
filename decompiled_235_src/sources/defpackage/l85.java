package defpackage;

import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l85  reason: default package */
/* loaded from: classes.dex */
public final class l85 {
    public final xk4 a;
    public final id3 b;
    public final hk c;
    public final jk d;
    public final cn5 e;

    public l85(xk4 xk4Var, id3 id3Var, hk hkVar, jk jkVar, ek ekVar, cn5 cn5Var) {
        this.a = xk4Var;
        this.b = id3Var;
        this.c = hkVar;
        this.d = jkVar;
        this.e = cn5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l85 l85Var, ar0 ar0Var, Map map, qn2 qn2Var, boolean z, s41 s41Var) {
        y75 y75Var;
        int i;
        l85Var.getClass();
        if (s41Var instanceof y75) {
            y75Var = (y75) s41Var;
            int i2 = y75Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y75Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = y75Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = y75Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xe1 xe1Var = xk1.a;
                    de1 de1Var = de1.L;
                    z75 z75Var = new z75(l85Var, map, z, ar0Var, qn2Var, null);
                    y75Var.Y = 1;
                    obj = hv.d0(de1Var, z75Var, y75Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return ((hm5) obj).A;
            }
        }
        y75Var = new y75(l85Var, s41Var);
        Object obj2 = y75Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = y75Var.Y;
        if (i == 0) {
        }
        return ((hm5) obj2).A;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(l85 l85Var, ar0 ar0Var, wl5 wl5Var, qn2 qn2Var) {
        String a;
        String obj;
        boolean z;
        String str;
        String str2;
        l85Var.getClass();
        String r = wl5Var.Z.r();
        if (wl5Var.m0) {
            if (!qs6.v0(r)) {
                try {
                    hd3 hd3Var = id3.d;
                    hd3Var.getClass();
                    ye3 g = fe3.g((de3) hd3Var.a(he3.a, r));
                    de3 de3Var = (de3) g.get("Success");
                    if (de3Var == null) {
                        de3 de3Var2 = (de3) g.get("Error");
                        if (de3Var2 != null) {
                            df3 h = fe3.h(de3Var2);
                            if (!(h instanceof ue3)) {
                                str2 = h.a();
                                if (str2 == null) {
                                    str2 = "RA response missing field: Success";
                                }
                                qn2Var.g(str2);
                            }
                        }
                        str2 = null;
                        if (str2 == null) {
                        }
                        qn2Var.g(str2);
                    } else {
                        df3 h2 = fe3.h(de3Var);
                        Boolean d = fe3.d(h2);
                        if (d != null) {
                            z = d.booleanValue();
                        } else {
                            if (h2 instanceof ue3) {
                                a = null;
                            } else {
                                a = h2.a();
                            }
                            if (a != null && (obj = qs6.T0(a).toString()) != null) {
                                String lowerCase = obj.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                int hashCode = lowerCase.hashCode();
                                if (hashCode == 49 ? !lowerCase.equals("1") : !(hashCode == 3551 ? lowerCase.equals("on") : !(hashCode == 119527 ? !lowerCase.equals("yes") : !(hashCode == 3569038 && lowerCase.equals("true"))))) {
                                    int hashCode2 = lowerCase.hashCode();
                                    if (hashCode2 == 48 ? lowerCase.equals("0") : !(hashCode2 == 3521 ? !lowerCase.equals("no") : hashCode2 == 109935 ? !lowerCase.equals("off") : hashCode2 != 97196323 || !lowerCase.equals("false"))) {
                                        z = false;
                                    } else {
                                        throw new Exception("RA response has invalid Success value: ".concat(lowerCase));
                                    }
                                } else {
                                    z = true;
                                }
                            } else {
                                throw new Exception("RA response value is empty");
                            }
                        }
                        if (!z) {
                            de3 de3Var3 = (de3) g.get("Error");
                            if (de3Var3 != null) {
                                df3 h3 = fe3.h(de3Var3);
                                if (!(h3 instanceof ue3)) {
                                    str = h3.a();
                                    if (str == null) {
                                        str = "Unknown reason";
                                    }
                                    qn2Var.g(str);
                                }
                            }
                            str = null;
                            if (str == null) {
                            }
                            qn2Var.g(str);
                        }
                    }
                    if (nb3.k(ar0Var, gh5.a(jg7.class))) {
                        return jg7.a;
                    }
                    return new kf3(l85Var.b, g, (String) null, 12).k(jx2.K(ar0Var));
                } catch (fc6 unused) {
                    byte[] bytes = r.getBytes(qm0.a);
                    bytes.getClass();
                    throw new Exception(lb1.g(bytes.length, "RA response is not valid JSON; body_bytes="));
                } catch (IllegalArgumentException unused2) {
                    byte[] bytes2 = r.getBytes(qm0.a);
                    bytes2.getClass();
                    throw new Exception(lb1.g(bytes2.length, "RA response is not a JSON object; body_bytes="));
                }
            }
            throw new Exception("RA response body is empty");
        }
        int i = wl5Var.R;
        byte[] bytes3 = r.getBytes(qm0.a);
        bytes3.getClass();
        throw new Exception(lb1.j("HTTP ", i, bytes3.length, "; body_bytes="));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(l85 l85Var, ar0 ar0Var, Map map, up3 up3Var, s41 s41Var) {
        f85 f85Var;
        int i;
        if (s41Var instanceof f85) {
            f85Var = (f85) s41Var;
            int i2 = f85Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f85Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = f85Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = f85Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xe1 xe1Var = xk1.a;
                    de1 de1Var = de1.L;
                    l5 l5Var = new l5(l85Var, map, ar0Var, up3Var, null, 25);
                    f85Var.Y = 1;
                    obj = hv.d0(de1Var, l5Var, f85Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return ((hm5) obj).A;
            }
        }
        f85Var = new f85(l85Var, s41Var);
        Object obj2 = f85Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = f85Var.Y;
        if (i == 0) {
        }
        return ((hm5) obj2).A;
    }

    public static String g(long j) {
        if (j < 0) {
            j = 0;
        }
        return String.format(Locale.US, l(j / 100).concat(".%02d"), Arrays.copyOf(new Object[]{Long.valueOf(j % 100)}, 1));
    }

    public static String h(int i, int i2, int i3) {
        return lb1.m(k(i / i2), ".", qs6.B0(i3, String.valueOf(Math.abs(i % i2))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e3, code lost:
        if (r8.equals("TIMESECS") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01eb, code lost:
        return l(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f2, code lost:
        if (r8.equals("POINTS") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x020e, code lost:
        return java.lang.String.format(java.util.Locale.US, "%06d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(r7)}, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0179, code lost:
        if (r8.equals("SCORE") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0183, code lost:
        if (r8.equals("OTHER") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b3, code lost:
        if (r8.equals("SECS") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String i(int i, String str) {
        Locale locale = Locale.ROOT;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        int hashCode = upperCase.hashCode();
        switch (hashCode) {
            case -1929424669:
                break;
            case -1293819249:
                break;
            case -963536587:
                if (upperCase.equals("THOUSANDS")) {
                    if (i == 0) {
                        return "0";
                    }
                    return k(i * 1000);
                }
                return k(i);
            case -261975517:
                if (upperCase.equals("UNFORMATTED")) {
                    return Long.toString(i & 4294967295L, 10);
                }
                return k(i);
            case 2541122:
                break;
            case 2571254:
                if (upperCase.equals("TENS")) {
                    if (i != 0) {
                        return k(i * 10);
                    }
                    return "0";
                }
                return k(i);
            case 2575053:
                if (upperCase.equals("TIME")) {
                    return g((i * 10) / 6);
                }
                return k(i);
            case 75532016:
                break;
            case 78726770:
                break;
            case 766662389:
                if (upperCase.equals("UNSIGNED")) {
                    return Long.toString(i & 4294967295L, 10);
                }
                return k(i);
            case 799745873:
                if (upperCase.equals("SECS_AS_MINS")) {
                    return j(i / 60);
                }
                return k(i);
            case 1355078661:
                if (upperCase.equals("HUNDREDS")) {
                    if (i != 0) {
                        return k(i * 100);
                    }
                    return "0";
                }
                return k(i);
            case 1782884543:
                if (upperCase.equals("MINUTES")) {
                    return j(i);
                }
                return k(i);
            case 1912639343:
                if (upperCase.equals("MILLISECS")) {
                    return g(i);
                }
                return k(i);
            default:
                switch (hashCode) {
                    case 2074147677:
                        if (upperCase.equals("FIXED1")) {
                            return h(i, 10, 1);
                        }
                        break;
                    case 2074147678:
                        if (upperCase.equals("FIXED2")) {
                            return h(i, 100, 2);
                        }
                        break;
                    case 2074147679:
                        if (upperCase.equals("FIXED3")) {
                            return h(i, 1000, 3);
                        }
                        break;
                    default:
                        switch (hashCode) {
                            case 2076646773:
                                if (upperCase.equals("FLOAT1")) {
                                    return String.format(Locale.US, "%,.1f", Arrays.copyOf(new Object[]{Double.valueOf(i)}, 1));
                                }
                                break;
                            case 2076646774:
                                if (upperCase.equals("FLOAT2")) {
                                    return String.format(Locale.US, "%,.2f", Arrays.copyOf(new Object[]{Double.valueOf(i)}, 1));
                                }
                                break;
                            case 2076646775:
                                if (upperCase.equals("FLOAT3")) {
                                    return String.format(Locale.US, "%,.3f", Arrays.copyOf(new Object[]{Double.valueOf(i)}, 1));
                                }
                                break;
                            case 2076646776:
                                if (upperCase.equals("FLOAT4")) {
                                    return String.format(Locale.US, "%,.4f", Arrays.copyOf(new Object[]{Double.valueOf(i)}, 1));
                                }
                                break;
                            case 2076646777:
                                if (upperCase.equals("FLOAT5")) {
                                    return String.format(Locale.US, "%,.5f", Arrays.copyOf(new Object[]{Double.valueOf(i)}, 1));
                                }
                                break;
                            case 2076646778:
                                if (upperCase.equals("FLOAT6")) {
                                    return String.format(Locale.US, "%,.6f", Arrays.copyOf(new Object[]{Double.valueOf(i)}, 1));
                                }
                                break;
                        }
                }
                return k(i);
        }
    }

    public static String j(long j) {
        if (j < 0) {
            j = 0;
        }
        return String.format(Locale.US, "%dh%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2));
    }

    public static String k(long j) {
        String format = NumberFormat.getIntegerInstance(Locale.US).format(j);
        format.getClass();
        return format;
    }

    public static String l(long j) {
        if (j < 0) {
            j = 0;
        }
        long j2 = j / 60;
        long j3 = j % 60;
        if (j2 < 60) {
            return String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3)}, 2));
        }
        return String.format(Locale.US, "%dh%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60), Long.valueOf(j3)}, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r15 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(long j, boolean z, String str, Long l, s41 s41Var) {
        w75 w75Var;
        Object obj;
        int i;
        hb5 hb5Var;
        if (s41Var instanceof w75) {
            w75Var = (w75) s41Var;
            int i2 = w75Var.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w75Var.f0 = i2 - Integer.MIN_VALUE;
                w75 w75Var2 = w75Var;
                obj = w75Var2.d0;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = w75Var2.f0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return ((hm5) obj).A;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = w75Var2.X;
                    j = w75Var2.R;
                    l = w75Var2.Z;
                    str = w75Var2.Y;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    w75Var2.Y = str;
                    w75Var2.Z = l;
                    w75Var2.R = j;
                    w75Var2.X = z;
                    w75Var2.f0 = 1;
                    obj = this.c.b(w75Var2);
                }
                String str2 = str;
                Long l2 = l;
                if (!(obj instanceof hb5)) {
                    hb5Var = (hb5) obj;
                } else {
                    hb5Var = null;
                }
                if (hb5Var != null) {
                    return new em5(new rj7());
                }
                w75Var2.Y = null;
                w75Var2.Z = null;
                w75Var2.R = j;
                w75Var2.X = z;
                w75Var2.f0 = 2;
                Object e = e(j, z, hb5Var, str2, l2, w75Var2);
                if (e == obj2) {
                    return obj2;
                }
                return e;
            }
        }
        w75Var = new w75(this, s41Var);
        w75 w75Var22 = w75Var;
        obj = w75Var22.d0;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = w75Var22.f0;
        if (i == 0) {
        }
        String str22 = str;
        Long l22 = l;
        if (!(obj instanceof hb5)) {
        }
        if (hb5Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r13.longValue() > 0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(long j, boolean z, hb5 hb5Var, String str, Long l, s41 s41Var) {
        x75 x75Var;
        int i;
        Long l2;
        String str2;
        long j2;
        o85 a;
        boolean z2;
        hb5 hb5Var2;
        long j3;
        if (s41Var instanceof x75) {
            x75Var = (x75) s41Var;
            int i2 = x75Var.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x75Var.f0 = i2 - Integer.MIN_VALUE;
                x75 x75Var2 = x75Var;
                Object obj = x75Var2.d0;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = x75Var2.f0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            Object obj3 = x75Var2.Z;
                            oi2.Y(obj);
                            return obj3;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = x75Var2.X;
                    long j4 = x75Var2.R;
                    l85 l85Var = (l85) x75Var2.Z;
                    hb5Var2 = x75Var2.Y;
                    oi2.Y(obj);
                    a = ((hm5) obj).A;
                    j2 = j4;
                } else {
                    oi2.Y(obj);
                    if (l != null) {
                        l2 = new Long(gi2.s(l.longValue(), 0L, 1209600L));
                    }
                    l2 = null;
                    hb5Var.getClass();
                    String str3 = hb5Var.a;
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    String valueOf = String.valueOf(j);
                    Charset charset = qm0.a;
                    byte[] bytes = valueOf.getBytes(charset);
                    bytes.getClass();
                    messageDigest.update(bytes);
                    byte[] bytes2 = str3.getBytes(charset);
                    bytes2.getClass();
                    messageDigest.update(bytes2);
                    String str4 = "0";
                    if (!z) {
                        str2 = "0";
                    } else {
                        str2 = "1";
                    }
                    byte[] bytes3 = str2.getBytes(charset);
                    bytes3.getClass();
                    messageDigest.update(bytes3);
                    if (l2 != null && l2.longValue() > 0) {
                        byte[] bytes4 = String.valueOf(j).getBytes(charset);
                        bytes4.getClass();
                        messageDigest.update(bytes4);
                        byte[] bytes5 = String.valueOf(l2.longValue()).getBytes(charset);
                        bytes5.getClass();
                        messageDigest.update(bytes5);
                    }
                    String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
                    bigInteger.getClass();
                    String B0 = qs6.B0(32, bigInteger);
                    vr4 vr4Var = new vr4("r", "awardachievement");
                    vr4 vr4Var2 = new vr4("u", str3);
                    vr4 vr4Var3 = new vr4("t", hb5Var.b);
                    vr4 vr4Var4 = new vr4("a", String.valueOf(j));
                    if (z) {
                        str4 = "1";
                    }
                    LinkedHashMap n0 = c14.n0(vr4Var, vr4Var2, vr4Var3, vr4Var4, new vr4("h", str4), new vr4("v", B0));
                    if (str != null && !qs6.v0(str)) {
                        n0.put("m", str);
                    }
                    if (l2 != null) {
                        n0.put("o", String.valueOf(l2.longValue()));
                    }
                    dv4 dv4Var = new dv4(17);
                    ar0 a2 = gh5.a(wz.class);
                    x75Var2.Y = hb5Var;
                    x75Var2.Z = null;
                    j2 = j;
                    x75Var2.R = j2;
                    x75Var2.X = z;
                    x75Var2.f0 = 1;
                    a = a(this, a2, n0, dv4Var, true, x75Var2);
                    if (a != obj2) {
                        z2 = z;
                        hb5Var2 = hb5Var;
                    }
                    return obj2;
                }
                if (a instanceof em5) {
                    wz wzVar = (wz) a;
                    j3 = j2;
                    a = new o85(wzVar.a, wzVar.b, wzVar.c, wzVar.d);
                } else {
                    j3 = j2;
                }
                if (!(a instanceof em5)) {
                    o85 o85Var = (o85) a;
                    String str5 = hb5Var2.a;
                    long j5 = o85Var.c;
                    long j6 = o85Var.d;
                    x75Var2.Y = null;
                    x75Var2.Z = a;
                    x75Var2.R = j3;
                    x75Var2.X = z2;
                    x75Var2.f0 = 2;
                    xe1 xe1Var = xk1.a;
                    Object d0 = hv.d0(de1.L, new ik(this.d, str5, j5, j6, null), x75Var2);
                    if (d0 != obj2) {
                        d0 = jg7.a;
                    }
                    if (d0 == obj2) {
                        return obj2;
                    }
                }
                return a;
            }
        }
        x75Var = new x75(this, s41Var);
        x75 x75Var22 = x75Var;
        Object obj4 = x75Var22.d0;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = x75Var22.f0;
        if (i == 0) {
        }
        if (a instanceof em5) {
        }
        if (!(a instanceof em5)) {
        }
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [bk1, java.lang.Object, nb0] */
    public final Object f(pa paVar, hb5 hb5Var, boolean z, hw6 hw6Var) {
        rj0 rj0Var = new rj0(1, np2.V(hw6Var));
        rj0Var.v();
        je5 je5Var = new je5(this.a, paVar, false);
        ?? obj = new Object();
        obj.L = rj0Var;
        obj.A = z;
        obj.B = hb5Var;
        obj.R = this;
        je5Var.d(obj);
        rj0Var.z(new d80(je5Var, 1));
        Object s = rj0Var.s();
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        return s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r10 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
        if (r8 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, s41 s41Var) {
        a85 a85Var;
        Object obj;
        int i;
        hb5 hb5Var;
        Object a;
        if (s41Var instanceof a85) {
            a85Var = (a85) s41Var;
            int i2 = a85Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a85Var.Z = i2 - Integer.MIN_VALUE;
                a85 a85Var2 = a85Var;
                obj = a85Var2.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = a85Var2.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            a = ((hm5) obj).A;
                            if (!(a instanceof em5)) {
                                try {
                                    oi2.Y(a);
                                    return gp2.a((fp2) a);
                                } catch (Throwable th) {
                                    l61 l61Var = a85Var2.B;
                                    l61Var.getClass();
                                    yh2.o(l61Var);
                                    return new em5(th);
                                }
                            }
                            Throwable a2 = hm5.a(a);
                            a2.getClass();
                            return new em5(a2);
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = a85Var2.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    a85Var2.R = str;
                    a85Var2.Z = 1;
                    obj = this.c.b(a85Var2);
                }
                if (!(obj instanceof hb5)) {
                    hb5Var = (hb5) obj;
                } else {
                    hb5Var = null;
                }
                if (hb5Var != null) {
                    return new em5(new rj7());
                }
                Map m0 = c14.m0(new vr4("r", "achievementsets"), new vr4("u", hb5Var.a), new vr4("t", hb5Var.b), new vr4("m", str));
                up3 up3Var = up3.R;
                ar0 a3 = gh5.a(fp2.class);
                a85Var2.R = null;
                a85Var2.Z = 2;
                a = a(this, a3, m0, up3Var, true, a85Var2);
            }
        }
        a85Var = new a85(this, s41Var);
        a85 a85Var22 = a85Var;
        obj = a85Var22.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = a85Var22.Z;
        if (i == 0) {
        }
        if (!(obj instanceof hb5)) {
        }
        if (hb5Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(s41 s41Var) {
        b85 b85Var;
        int i;
        Object a;
        if (s41Var instanceof b85) {
            b85Var = (b85) s41Var;
            int i2 = b85Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b85Var.Y = i2 - Integer.MIN_VALUE;
                b85 b85Var2 = b85Var;
                Object obj = b85Var2.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = b85Var2.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        a = ((hm5) obj).A;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Map singletonMap = Collections.singletonMap("r", "hashlibrary");
                    singletonMap.getClass();
                    up3 up3Var = up3.R;
                    ar0 a2 = gh5.a(ow2.class);
                    b85Var2.Y = 1;
                    a = a(this, a2, singletonMap, up3Var, true, b85Var2);
                    if (a == x61Var) {
                        return x61Var;
                    }
                }
                if (a instanceof em5) {
                    Map map = ((ow2) a).a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c14.k0(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), new ga5(((Number) entry.getValue()).longValue()));
                    }
                    return linkedHashMap;
                }
                return a;
            }
        }
        b85Var = new b85(this, s41Var);
        b85 b85Var22 = b85Var;
        Object obj2 = b85Var22.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = b85Var22.Y;
        if (i == 0) {
        }
        if (a instanceof em5) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(long j, int i, int i2, s41 s41Var) {
        c85 c85Var;
        l85 l85Var;
        int i3;
        Object a;
        long j2;
        URL url;
        if (s41Var instanceof c85) {
            c85Var = (c85) s41Var;
            int i4 = c85Var.Z;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c85Var.Z = i4 - Integer.MIN_VALUE;
                l85Var = this;
                c85 c85Var2 = c85Var;
                Object obj = c85Var2.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i3 = c85Var2.Z;
                if (i3 == 0) {
                    if (i3 == 1) {
                        j2 = c85Var2.R;
                        oi2.Y(obj);
                        a = ((hm5) obj).A;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    int i5 = i;
                    if (i5 < 1) {
                        i5 = 1;
                    }
                    Map m0 = c14.m0(new vr4("r", "lbinfo"), new vr4("i", String.valueOf(j)), new vr4("o", String.valueOf(i5 - 1)), new vr4("c", String.valueOf(gi2.q(i2, 1, 100))));
                    up3 up3Var = up3.R;
                    ar0 a2 = gh5.a(xa5.class);
                    c85Var2.R = j;
                    c85Var2.Z = 1;
                    a = a(l85Var, a2, m0, up3Var, true, c85Var2);
                    if (a == x61Var) {
                        return x61Var;
                    }
                    j2 = j;
                }
                if (a instanceof em5) {
                    try {
                        oi2.Y(a);
                        ua5 ua5Var = ((xa5) a).a;
                        int i6 = ua5Var.c;
                        List<wa5> list = ua5Var.b;
                        ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
                        for (wa5 wa5Var : list) {
                            String str = wa5Var.a;
                            int i7 = wa5Var.b;
                            int i8 = wa5Var.c;
                            String i9 = i(i8, ua5Var.a);
                            long j3 = wa5Var.d;
                            String str2 = wa5Var.e;
                            if (str2 != null) {
                                if (qs6.v0(str2)) {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    url = new URI(str2).toURL();
                                    arrayList.add(new za5(str, i7, i8, i9, j3, url));
                                }
                            }
                            url = null;
                            arrayList.add(new za5(str, i7, i8, i9, j3, url));
                        }
                        return new ya5(j2, i6, arrayList);
                    } catch (Throwable th) {
                        l61 l61Var = c85Var2.B;
                        l61Var.getClass();
                        yh2.o(l61Var);
                        return new em5(th);
                    }
                }
                Throwable a3 = hm5.a(a);
                a3.getClass();
                return new em5(a3);
            }
        }
        l85Var = this;
        c85Var = new c85(l85Var, s41Var);
        c85 c85Var22 = c85Var;
        Object obj2 = c85Var22.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i3 = c85Var22.Z;
        if (i3 == 0) {
        }
        if (a instanceof em5) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r13 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
        if (r9 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(long j, boolean z, s41 s41Var) {
        d85 d85Var;
        Object obj;
        int i;
        hb5 hb5Var;
        String str;
        Object a;
        if (s41Var instanceof d85) {
            d85Var = (d85) s41Var;
            int i2 = d85Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d85Var.d0 = i2 - Integer.MIN_VALUE;
                d85 d85Var2 = d85Var;
                obj = d85Var2.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = d85Var2.d0;
                hb5Var = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            a = ((hm5) obj).A;
                            if (!(a instanceof em5)) {
                                return ((tj7) a).a;
                            }
                            return a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = d85Var2.X;
                    j = d85Var2.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    d85Var2.R = j;
                    d85Var2.X = z;
                    d85Var2.d0 = 1;
                    obj = this.c.b(d85Var2);
                }
                if (obj instanceof hb5) {
                    hb5Var = (hb5) obj;
                }
                if (hb5Var != null) {
                    return new em5(new rj7());
                }
                vr4 vr4Var = new vr4("r", "unlocks");
                vr4 vr4Var2 = new vr4("u", hb5Var.a);
                vr4 vr4Var3 = new vr4("t", hb5Var.b);
                vr4 vr4Var4 = new vr4("g", String.valueOf(j));
                if (z) {
                    str = "1";
                } else {
                    str = "0";
                }
                Map m0 = c14.m0(vr4Var, vr4Var2, vr4Var3, vr4Var4, new vr4("h", str));
                up3 up3Var = up3.R;
                ar0 a2 = gh5.a(tj7.class);
                d85Var2.R = j;
                d85Var2.X = z;
                d85Var2.d0 = 2;
                a = a(this, a2, m0, up3Var, true, d85Var2);
            }
        }
        d85Var = new d85(this, s41Var);
        d85 d85Var22 = d85Var;
        obj = d85Var22.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = d85Var22.d0;
        hb5Var = null;
        if (i == 0) {
        }
        if (obj instanceof hb5) {
        }
        if (hb5Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r9.a(r5) == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
        if (r0 != r6) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(String str, String str2, s41 s41Var) {
        e85 e85Var;
        e85 e85Var2;
        x61 x61Var;
        int i;
        jk jkVar;
        String str3;
        String str4;
        String str5;
        Object a;
        Object obj;
        qj7 qj7Var;
        Object d0;
        if (s41Var instanceof e85) {
            e85Var = (e85) s41Var;
            int i2 = e85Var.g0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e85Var.g0 = i2 - Integer.MIN_VALUE;
                e85Var2 = e85Var;
                Object obj2 = e85Var2.e0;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = e85Var2.g0;
                jg7 jg7Var = jg7.a;
                jkVar = this.d;
                hk hkVar = this.c;
                int i3 = 0;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        a = e85Var2.Y;
                                        oi2.Y(obj2);
                                        if (!(a instanceof em5)) {
                                            qj7 qj7Var2 = (qj7) a;
                                            return jg7Var;
                                        }
                                        return a;
                                    }
                                    i.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                i3 = e85Var2.d0;
                                qj7Var = e85Var2.Z;
                                obj = e85Var2.Y;
                                oi2.Y(obj2);
                                lb5 lb5Var = new lb5(qj7Var.a, qj7Var.c, qj7Var.d);
                                e85Var2.R = null;
                                e85Var2.X = null;
                                e85Var2.Y = obj;
                                e85Var2.Z = null;
                                e85Var2.d0 = i3;
                                e85Var2.g0 = 5;
                                xe1 xe1Var = xk1.a;
                                d0 = hv.d0(de1.L, new ji(jkVar, lb5Var, (r41) null, 2), e85Var2);
                                if (d0 != x61Var) {
                                    d0 = jg7Var;
                                }
                                if (d0 != x61Var) {
                                    a = obj;
                                    if (!(a instanceof em5)) {
                                    }
                                }
                                return x61Var;
                            }
                            Map map = (Map) e85Var2.Z;
                            l85 l85Var = (l85) e85Var2.Y;
                            oi2.Y(obj2);
                            a = ((hm5) obj2).A;
                            if (!(a instanceof em5)) {
                                qj7 qj7Var3 = (qj7) a;
                                hb5 hb5Var = new hb5(qj7Var3.a, qj7Var3.b);
                                e85Var2.R = null;
                                e85Var2.X = null;
                                e85Var2.Y = a;
                                e85Var2.Z = qj7Var3;
                                e85Var2.d0 = 0;
                                e85Var2.g0 = 4;
                                xe1 xe1Var2 = xk1.a;
                                Object d02 = hv.d0(de1.L, new ji(hkVar, hb5Var, (r41) null, 1), e85Var2);
                                if (d02 != x61Var) {
                                    d02 = jg7Var;
                                }
                                if (d02 != x61Var) {
                                    obj = a;
                                    qj7Var = qj7Var3;
                                    lb5 lb5Var2 = new lb5(qj7Var.a, qj7Var.c, qj7Var.d);
                                    e85Var2.R = null;
                                    e85Var2.X = null;
                                    e85Var2.Y = obj;
                                    e85Var2.Z = null;
                                    e85Var2.d0 = i3;
                                    e85Var2.g0 = 5;
                                    xe1 xe1Var3 = xk1.a;
                                    d0 = hv.d0(de1.L, new ji(jkVar, lb5Var2, (r41) null, 2), e85Var2);
                                    if (d0 != x61Var) {
                                    }
                                    if (d0 != x61Var) {
                                    }
                                }
                                return x61Var;
                            }
                            if (!(a instanceof em5)) {
                            }
                        } else {
                            str4 = e85Var2.X;
                            str5 = e85Var2.R;
                            oi2.Y(obj2);
                            Map m0 = c14.m0(new vr4("r", "login2"), new vr4("u", str5), new vr4("p", str4));
                            up3 up3Var = up3.R;
                            ar0 a2 = gh5.a(qj7.class);
                            e85Var2.R = null;
                            e85Var2.X = null;
                            e85Var2.Y = null;
                            e85Var2.Z = null;
                            e85Var2.d0 = 0;
                            e85Var2.g0 = 3;
                            a = a(this, a2, m0, up3Var, false, e85Var2);
                        }
                    } else {
                        str4 = e85Var2.X;
                        String str6 = e85Var2.R;
                        oi2.Y(obj2);
                        str3 = str6;
                    }
                } else {
                    oi2.Y(obj2);
                    str3 = str;
                    e85Var2.R = str3;
                    str4 = str2;
                    e85Var2.X = str4;
                    e85Var2.g0 = 1;
                }
                e85Var2.R = str3;
                e85Var2.X = str4;
                e85Var2.g0 = 2;
                if (jkVar.b(e85Var2) != x61Var) {
                    str5 = str3;
                    Map m02 = c14.m0(new vr4("r", "login2"), new vr4("u", str5), new vr4("p", str4));
                    up3 up3Var2 = up3.R;
                    ar0 a22 = gh5.a(qj7.class);
                    e85Var2.R = null;
                    e85Var2.X = null;
                    e85Var2.Y = null;
                    e85Var2.Z = null;
                    e85Var2.d0 = 0;
                    e85Var2.g0 = 3;
                    a = a(this, a22, m02, up3Var2, false, e85Var2);
                }
                return x61Var;
            }
        }
        e85Var = new e85(this, s41Var);
        e85Var2 = e85Var;
        Object obj22 = e85Var2.e0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = e85Var2.g0;
        jg7 jg7Var2 = jg7.a;
        jkVar = this.d;
        hk hkVar2 = this.c;
        int i32 = 0;
        if (i == 0) {
        }
        e85Var2.R = str3;
        e85Var2.X = str4;
        e85Var2.g0 = 2;
        if (jkVar.b(e85Var2) != x61Var) {
        }
        return x61Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r1 == r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
        if (r1 == r6) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(s41 s41Var) {
        g85 g85Var;
        Object obj;
        int i;
        hb5 hb5Var;
        lb5 a;
        if (s41Var instanceof g85) {
            g85Var = (g85) s41Var;
            int i2 = g85Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g85Var.Z = i2 - Integer.MIN_VALUE;
                g85 g85Var2 = g85Var;
                obj = g85Var2.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = g85Var2.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                Object obj2 = g85Var2.R;
                                oi2.Y(obj);
                                return obj2;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        l85 l85Var = (l85) g85Var2.R;
                        oi2.Y(obj);
                        a = ((hm5) obj).A;
                        if (!(a instanceof em5)) {
                            qj7 qj7Var = (qj7) a;
                            a = new lb5(qj7Var.a, qj7Var.c, qj7Var.d);
                        }
                        if (!(a instanceof em5)) {
                            g85Var2.R = a;
                            g85Var2.Z = 3;
                            xe1 xe1Var = xk1.a;
                            Object d0 = hv.d0(de1.L, new ji(this.d, (lb5) a, (r41) null, 2), g85Var2);
                            if (d0 != x61Var) {
                                d0 = jg7.a;
                            }
                            if (d0 == x61Var) {
                                return x61Var;
                            }
                        }
                        return a;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    g85Var2.Z = 1;
                    obj = this.c.b(g85Var2);
                }
                if (!(obj instanceof hb5)) {
                    hb5Var = (hb5) obj;
                } else {
                    hb5Var = null;
                }
                if (hb5Var != null) {
                    return new em5(new rj7());
                }
                Map m0 = c14.m0(new vr4("r", "login2"), new vr4("u", hb5Var.a), new vr4("t", hb5Var.b));
                up3 up3Var = up3.R;
                ar0 a2 = gh5.a(qj7.class);
                g85Var2.R = null;
                g85Var2.Z = 2;
                a = a(this, a2, m0, up3Var, false, g85Var2);
            }
        }
        g85Var = new g85(this, s41Var);
        g85 g85Var22 = g85Var;
        obj = g85Var22.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = g85Var22.Z;
        if (i == 0) {
        }
        if (!(obj instanceof hb5)) {
        }
        if (hb5Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(long j, String str, boolean z, String str2, s41 s41Var) {
        h85 h85Var;
        Object obj;
        int i;
        long j2;
        String str3;
        String str4;
        boolean z2;
        hb5 hb5Var;
        String str5;
        if (s41Var instanceof h85) {
            h85Var = (h85) s41Var;
            int i2 = h85Var.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h85Var.f0 = i2 - Integer.MIN_VALUE;
                obj = h85Var.d0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = h85Var.f0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return ((hm5) obj).A;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = h85Var.Z;
                    j2 = h85Var.R;
                    str4 = h85Var.Y;
                    str3 = h85Var.X;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    h85Var.X = str;
                    h85Var.Y = str2;
                    j2 = j;
                    h85Var.R = j2;
                    h85Var.Z = z;
                    h85Var.f0 = 1;
                    Object b = this.c.b(h85Var);
                    if (b != x61Var) {
                        str3 = str;
                        obj = b;
                        str4 = str2;
                        z2 = z;
                    }
                    return x61Var;
                }
                if (!(obj instanceof hb5)) {
                    hb5Var = (hb5) obj;
                } else {
                    hb5Var = null;
                }
                if (hb5Var != null) {
                    return new em5(new rj7());
                }
                vr4 vr4Var = new vr4("r", "ping");
                vr4 vr4Var2 = new vr4("u", hb5Var.a);
                vr4 vr4Var3 = new vr4("t", hb5Var.b);
                vr4 vr4Var4 = new vr4("g", String.valueOf(j2));
                vr4 vr4Var5 = new vr4("x", str3);
                if (z2) {
                    str5 = "1";
                } else {
                    str5 = "0";
                }
                LinkedHashMap n0 = c14.n0(vr4Var, vr4Var2, vr4Var3, vr4Var4, vr4Var5, new vr4("h", str5));
                if (str4 != null) {
                    n0.put("m", str4);
                }
                up3 up3Var = up3.X;
                ar0 a = gh5.a(jg7.class);
                h85Var.X = null;
                h85Var.Y = null;
                h85Var.R = j2;
                h85Var.Z = z2;
                h85Var.f0 = 2;
                Object c = c(this, a, n0, up3Var, h85Var);
                if (c == x61Var) {
                    return x61Var;
                }
                return c;
            }
        }
        h85Var = new h85(this, s41Var);
        obj = h85Var.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = h85Var.f0;
        if (i == 0) {
        }
        if (!(obj instanceof hb5)) {
        }
        if (hb5Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
        if (r6 == r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(long j, s41 s41Var, String str, boolean z) {
        i85 i85Var;
        int i;
        String str2;
        long j2;
        boolean z2;
        Object b;
        hb5 hb5Var;
        String str3;
        if (s41Var instanceof i85) {
            i85Var = (i85) s41Var;
            int i2 = i85Var.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i85Var.e0 = i2 - Integer.MIN_VALUE;
                Object obj = i85Var.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = i85Var.e0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return ((hm5) obj).A;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = i85Var.Y;
                    j2 = i85Var.R;
                    String str4 = i85Var.X;
                    oi2.Y(obj);
                    b = obj;
                    str2 = str4;
                } else {
                    oi2.Y(obj);
                    str2 = str;
                    i85Var.X = str2;
                    j2 = j;
                    i85Var.R = j2;
                    z2 = z;
                    i85Var.Y = z2;
                    i85Var.e0 = 1;
                    b = this.c.b(i85Var);
                }
                if (!(b instanceof hb5)) {
                    hb5Var = (hb5) b;
                } else {
                    hb5Var = null;
                }
                if (hb5Var != null) {
                    return new em5(new rj7());
                }
                vr4 vr4Var = new vr4("r", "startsession");
                vr4 vr4Var2 = new vr4("u", hb5Var.a);
                vr4 vr4Var3 = new vr4("t", hb5Var.b);
                vr4 vr4Var4 = new vr4("g", String.valueOf(j2));
                vr4 vr4Var5 = new vr4("m", str2);
                if (z2) {
                    str3 = "1";
                } else {
                    str3 = "0";
                }
                Map m0 = c14.m0(vr4Var, vr4Var2, vr4Var3, vr4Var4, vr4Var5, new vr4("h", str3), new vr4("l", "12.3.0"));
                up3 up3Var = up3.X;
                ar0 a = gh5.a(jg7.class);
                i85Var.X = null;
                i85Var.R = j2;
                i85Var.Y = z2;
                i85Var.e0 = 2;
                Object c = c(this, a, m0, up3Var, i85Var);
                if (c == x61Var) {
                    return x61Var;
                }
                return c;
            }
        }
        i85Var = new i85(this, s41Var);
        Object obj2 = i85Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = i85Var.e0;
        if (i == 0) {
        }
        if (!(b instanceof hb5)) {
        }
        if (hb5Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r13 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(long j, int i, String str, s41 s41Var) {
        j85 j85Var;
        Object obj;
        int i2;
        hb5 hb5Var;
        if (s41Var instanceof j85) {
            j85Var = (j85) s41Var;
            int i3 = j85Var.e0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j85Var.e0 = i3 - Integer.MIN_VALUE;
                j85 j85Var2 = j85Var;
                obj = j85Var2.Z;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i2 = j85Var2.e0;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oi2.Y(obj);
                            return ((hm5) obj).A;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = j85Var2.X;
                    j = j85Var2.R;
                    str = j85Var2.Y;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    j85Var2.Y = str;
                    j85Var2.R = j;
                    j85Var2.X = i;
                    j85Var2.e0 = 1;
                    obj = this.c.b(j85Var2);
                }
                String str2 = str;
                if (!(obj instanceof hb5)) {
                    hb5Var = (hb5) obj;
                } else {
                    hb5Var = null;
                }
                if (hb5Var != null) {
                    return new em5(new rj7());
                }
                j85Var2.Y = null;
                j85Var2.R = j;
                j85Var2.X = i;
                j85Var2.e0 = 2;
                Object v = v(j, i, hb5Var, str2, j85Var2);
                if (v == obj2) {
                    return obj2;
                }
                return v;
            }
        }
        j85Var = new j85(this, s41Var);
        j85 j85Var22 = j85Var;
        obj = j85Var22.Z;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i2 = j85Var22.e0;
        if (i2 == 0) {
        }
        String str22 = str;
        if (!(obj instanceof hb5)) {
        }
        if (hb5Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0103 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(long j, int i, hb5 hb5Var, String str, s41 s41Var) {
        k85 k85Var;
        int i2;
        Object a;
        if (s41Var instanceof k85) {
            k85Var = (k85) s41Var;
            int i3 = k85Var.Y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k85Var.Y = i3 - Integer.MIN_VALUE;
                Object obj = k85Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = k85Var.Y;
                if (i2 == 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        a = ((hm5) obj).A;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    hb5Var.getClass();
                    String str2 = hb5Var.a;
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    String valueOf = String.valueOf(j);
                    Charset charset = qm0.a;
                    byte[] bytes = valueOf.getBytes(charset);
                    bytes.getClass();
                    messageDigest.update(bytes);
                    byte[] bytes2 = str2.getBytes(charset);
                    bytes2.getClass();
                    messageDigest.update(bytes2);
                    byte[] bytes3 = String.valueOf(i).getBytes(charset);
                    bytes3.getClass();
                    messageDigest.update(bytes3);
                    String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
                    bigInteger.getClass();
                    LinkedHashMap n0 = c14.n0(new vr4("r", "submitlbentry"), new vr4("u", str2), new vr4("t", hb5Var.b), new vr4("i", String.valueOf(j)), new vr4("s", String.valueOf(i)), new vr4("v", qs6.B0(32, bigInteger)));
                    if (str != null && !qs6.v0(str)) {
                        n0.put("m", str);
                    }
                    up3 up3Var = up3.R;
                    ar0 a2 = gh5.a(db5.class);
                    k85Var.Y = 1;
                    a = a(this, a2, n0, up3Var, true, k85Var);
                    if (a == x61Var) {
                        return x61Var;
                    }
                }
                if (a instanceof em5) {
                    qd5 qd5Var = ((db5) a).a.a;
                    return new cb5(qd5Var.b, qd5Var.a);
                }
                return a;
            }
        }
        k85Var = new k85(this, s41Var);
        Object obj2 = k85Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = k85Var.Y;
        if (i2 == 0) {
        }
        if (a instanceof em5) {
        }
    }
}
