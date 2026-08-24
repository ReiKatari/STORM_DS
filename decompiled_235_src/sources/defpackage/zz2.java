package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zz2  reason: default package */
/* loaded from: classes.dex */
public abstract class zz2 {
    static {
        da0 da0Var = da0.R;
        xd5.o("\"\\");
        xd5.o("\t ,=");
    }

    public static final boolean a(wl5 wl5Var) {
        if (!nb3.k((String) wl5Var.A.L, "HEAD")) {
            int i = wl5Var.R;
            if (((i >= 100 && i < 200) || i == 204 || i == 304) && az7.e(wl5Var) == -1) {
                String a = wl5Var.Y.a("Transfer-Encoding");
                if (a == null) {
                    a = null;
                }
                if (!"chunked".equalsIgnoreCase(a)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cd, code lost:
        if (defpackage.wy7.a.d(r0) == false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(vs0 vs0Var, i03 i03Var, yw2 yw2Var) {
        List list;
        c51 c51Var;
        i03 i03Var2;
        c51 c51Var2;
        String str;
        vs0Var.getClass();
        i03Var.getClass();
        yw2Var.getClass();
        if (vs0Var == vs0.e0) {
            return;
        }
        Pattern pattern = c51.k;
        List f = yw2Var.f("Set-Cookie");
        int size = f.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            String str2 = (String) f.get(i);
            str2.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            char c = ';';
            int g = yy7.g(str2, ';', 0, 0, 6);
            char c2 = '=';
            int g2 = yy7.g(str2, '=', 0, g, 2);
            if (g2 != g) {
                int j = yy7.j(0, g2, str2);
                String substring = str2.substring(j, yy7.k(j, g2, str2));
                if (substring.length() != 0 && yy7.i(substring) == -1) {
                    int j2 = yy7.j(g2 + 1, g, str2);
                    String substring2 = str2.substring(j2, yy7.k(j2, g, str2));
                    if (yy7.i(substring2) == -1) {
                        int i2 = g + 1;
                        int length = str2.length();
                        long j3 = 253402300799999L;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long j4 = 253402300799999L;
                        String str3 = null;
                        String str4 = null;
                        long j5 = -1;
                        boolean z4 = true;
                        String str5 = null;
                        while (true) {
                            long j6 = Long.MAX_VALUE;
                            if (i2 < length) {
                                int e = yy7.e(str2, c, i2, length);
                                int e2 = yy7.e(str2, c2, i2, e);
                                int j7 = yy7.j(i2, e2, str2);
                                String substring3 = str2.substring(j7, yy7.k(j7, e2, str2));
                                if (e2 < e) {
                                    int j8 = yy7.j(e2 + 1, e, str2);
                                    str = str2.substring(j8, yy7.k(j8, e, str2));
                                } else {
                                    str = "";
                                }
                                if (substring3.equalsIgnoreCase("expires")) {
                                    try {
                                        j4 = l.H(str.length(), str);
                                        z3 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i2 = e + 1;
                                    c = ';';
                                    c2 = '=';
                                } else if (substring3.equalsIgnoreCase("max-age")) {
                                    try {
                                        j5 = Long.parseLong(str);
                                        if (j5 <= 0) {
                                            j5 = Long.MIN_VALUE;
                                        }
                                    } catch (NumberFormatException e3) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        compile.getClass();
                                        if (compile.matcher(str).matches()) {
                                            if (xs6.g0(str, "-", false)) {
                                                j6 = Long.MIN_VALUE;
                                            }
                                            j5 = j6;
                                        } else {
                                            throw e3;
                                        }
                                    }
                                    z3 = true;
                                    i2 = e + 1;
                                    c = ';';
                                    c2 = '=';
                                } else {
                                    if (substring3.equalsIgnoreCase("domain")) {
                                        if (!xs6.Y(str, ".", false)) {
                                            String b = wy7.b(qs6.D0(str, "."));
                                            if (b != null) {
                                                str3 = b;
                                                z4 = false;
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                    } else if (substring3.equalsIgnoreCase("path")) {
                                        str4 = str;
                                    } else if (substring3.equalsIgnoreCase("secure")) {
                                        z = true;
                                    } else if (substring3.equalsIgnoreCase("httponly")) {
                                        z2 = true;
                                    } else if (substring3.equalsIgnoreCase("samesite")) {
                                        str5 = str;
                                    }
                                    i2 = e + 1;
                                    c = ';';
                                    c2 = '=';
                                }
                            } else {
                                if (j5 == Long.MIN_VALUE) {
                                    i03Var2 = i03Var;
                                    j3 = Long.MIN_VALUE;
                                } else if (j5 != -1) {
                                    if (j5 <= 9223372036854775L) {
                                        j6 = j5 * 1000;
                                    }
                                    long j9 = currentTimeMillis + j6;
                                    if (j9 >= currentTimeMillis && j9 <= 253402300799999L) {
                                        i03Var2 = i03Var;
                                        j3 = j9;
                                    } else {
                                        i03Var2 = i03Var;
                                    }
                                } else {
                                    i03Var2 = i03Var;
                                    j3 = j4;
                                }
                                String str6 = i03Var2.d;
                                if (str3 == null) {
                                    str3 = str6;
                                } else if (!nb3.k(str6, str3)) {
                                    if (xs6.Y(str6, str3, false)) {
                                        if (str6.charAt((str6.length() - str3.length()) - 1) == '.') {
                                        }
                                    }
                                    c51Var2 = null;
                                    c51Var = c51Var2;
                                }
                                if (str6.length() == str3.length() || f65.d.a(str3) != null) {
                                    String str7 = "/";
                                    if (str4 == null || !xs6.g0(str4, "/", false)) {
                                        String b2 = i03Var2.b();
                                        int x0 = qs6.x0('/', 0, 6, b2);
                                        if (x0 != 0) {
                                            str7 = b2.substring(0, x0);
                                        }
                                        str4 = str7;
                                    }
                                    c51Var2 = new c51(substring, substring2, j3, str3, str4, z, z2, z3, z4, str5);
                                    c51Var = c51Var2;
                                }
                                c51Var2 = null;
                                c51Var = c51Var2;
                            }
                        }
                    }
                }
            }
            c51Var = null;
            if (c51Var != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c51Var);
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            list.getClass();
        } else {
            list = null;
        }
        if (list == null) {
            list = yt1.A;
        }
        list.isEmpty();
    }
}
