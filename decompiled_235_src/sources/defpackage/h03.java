package defpackage;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h03  reason: default package */
/* loaded from: classes.dex */
public final class h03 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public h03(int i) {
        this.a = i;
        switch (i) {
            case 1:
                return;
            default:
                this.d = "";
                this.e = "";
                this.b = -1;
                this.h = hf.d0("");
                return;
        }
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int s0 = qs6.s0('&', i, 4, str);
            if (s0 == -1) {
                s0 = str.length();
            }
            int s02 = qs6.s0('=', i, 4, str);
            if (s02 != -1 && s02 <= s0) {
                arrayList.add(str.substring(i, s02));
                arrayList.add(str.substring(s02 + 1, s0));
            } else {
                arrayList.add(str.substring(i, s0));
                arrayList.add(null);
            }
            i = s0 + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, me6[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.lang.Object, java.io.Serializable] */
    public void a(int[] iArr, me6 me6Var) {
        int i = this.b;
        if (i == 0 || iArr.length == 0) {
            this.c = me6Var;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.d = r3;
            ?? r1 = new me6[i2];
            System.arraycopy((me6[]) this.e, 0, r1, 0, i);
            this.e = r1;
        }
        int i3 = this.b;
        ((int[][]) this.d)[i3] = iArr;
        ((me6[]) this.e)[i3] = me6Var;
        this.b = i3 + 1;
    }

    public i03 b() {
        ArrayList arrayList;
        String str;
        String str2 = (String) this.c;
        String str3 = null;
        if (str2 != null) {
            String x = jw2.x(0, 0, 7, (String) this.d);
            String x2 = jw2.x(0, 0, 7, (String) this.e);
            String str4 = (String) this.f;
            if (str4 != null) {
                int c = c();
                ArrayList arrayList2 = (ArrayList) this.h;
                ArrayList arrayList3 = new ArrayList(ht0.v0(arrayList2, 10));
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    arrayList3.add(jw2.x(0, 0, 7, (String) obj));
                }
                ArrayList arrayList4 = (ArrayList) this.i;
                if (arrayList4 != null) {
                    ArrayList arrayList5 = new ArrayList(ht0.v0(arrayList4, 10));
                    int size2 = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList4.get(i2);
                        i2++;
                        String str5 = (String) obj2;
                        if (str5 != null) {
                            str = jw2.x(0, 0, 3, str5);
                        } else {
                            str = null;
                        }
                        arrayList5.add(str);
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                String str6 = (String) this.g;
                if (str6 != null) {
                    str3 = jw2.x(0, 0, 7, str6);
                }
                return new i03(str2, x, x2, str4, c, arrayList3, arrayList, str3, toString());
            }
            i.m("host == null");
            return null;
        }
        i.m("scheme == null");
        return null;
    }

    public int c() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.c;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        if (!str.equals("https")) {
            return -1;
        }
        return 443;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [me6[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void d() {
        this.c = new me6();
        this.d = new int[10];
        this.e = new me6[10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0204, code lost:
        if (r8 < 65536) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r14 == ':') goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(i03 i03Var, String str) {
        int i;
        String str2;
        int i2;
        int i3;
        int i4;
        int f;
        char c;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        ArrayList arrayList;
        char charAt;
        ArrayList arrayList2 = (ArrayList) this.h;
        str.getClass();
        byte[] bArr = yy7.a;
        int j = yy7.j(0, str.length(), str);
        int k = yy7.k(j, str.length(), str);
        char c2 = 65535;
        if (k - j >= 2) {
            char charAt2 = str.charAt(j);
            char c3 = 'a';
            if ((nb3.p(charAt2, 97) >= 0 && nb3.p(charAt2, 122) <= 0) || (nb3.p(charAt2, 65) >= 0 && nb3.p(charAt2, 90) <= 0)) {
                i = j + 1;
                while (true) {
                    if (i >= k) {
                        break;
                    }
                    char charAt3 = str.charAt(i);
                    if ((c3 <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                        i++;
                        c3 = 'a';
                    }
                }
                if (i == -1) {
                    if (xs6.f0(str, "https:", j, true)) {
                        this.c = "https";
                        j += 6;
                    } else if (xs6.f0(str, "http:", j, true)) {
                        this.c = "http";
                        j += 5;
                    } else {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                    }
                } else if (i03Var != null) {
                    this.c = i03Var.a;
                } else {
                    if (str.length() > 6) {
                        str2 = qs6.S0(6, str).concat("...");
                    } else {
                        str2 = str;
                    }
                    i.h("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str2));
                    return;
                }
                i3 = 0;
                for (i2 = j; i2 < k && ((charAt = str.charAt(i2)) == '/' || charAt == '\\'); i2++) {
                    i3++;
                }
                char c4 = '#';
                if (i3 >= 2 && i03Var != null && nb3.k(i03Var.a, (String) this.c)) {
                    this.d = i03Var.e();
                    this.e = i03Var.a();
                    this.f = i03Var.d;
                    this.b = i03Var.e;
                    arrayList2.clear();
                    arrayList2.addAll(i03Var.c());
                    if (j == k || str.charAt(j) == '#') {
                        String d = i03Var.d();
                        if (d != null) {
                            arrayList = f(jw2.m(d, 0, 0, " \"'<>#", 83));
                        } else {
                            arrayList = null;
                        }
                        this.i = arrayList;
                    }
                } else {
                    i4 = j + i3;
                    boolean z2 = false;
                    boolean z3 = false;
                    while (true) {
                        f = yy7.f(str, i4, k, "@/\\?#");
                        if (f == k) {
                            c = str.charAt(f);
                        } else {
                            c = c2;
                        }
                        if (c == c2 || c == c4 || c == '/' || c == '\\' || c == '?') {
                            break;
                        } else if (c == '@') {
                            if (!z2) {
                                int e = yy7.e(str, ':', i4, f);
                                String m = jw2.m(str, i4, e, " \"':;<=>@[]^`{}|/\\?#", 112);
                                if (z3) {
                                    m = ((String) this.d) + "%40" + m;
                                }
                                this.d = m;
                                if (e != f) {
                                    this.e = jw2.m(str, e + 1, f, " \"':;<=>@[]^`{}|/\\?#", 112);
                                    z2 = true;
                                }
                                z3 = true;
                            } else {
                                this.e = ((String) this.e) + "%40" + jw2.m(str, i4, f, " \"':;<=>@[]^`{}|/\\?#", 112);
                            }
                            i4 = f + 1;
                            c2 = 65535;
                            c4 = '#';
                        }
                    }
                    i5 = i4;
                    while (true) {
                        if (i5 < f) {
                            char charAt4 = str.charAt(i5);
                            if (charAt4 == ':') {
                                break;
                            }
                            if (charAt4 == '[') {
                                do {
                                    i5++;
                                    if (i5 < f) {
                                    }
                                } while (str.charAt(i5) != ']');
                            }
                            i5++;
                        } else {
                            i5 = f;
                            break;
                        }
                    }
                    i6 = i5 + 1;
                    if (i6 >= f) {
                        this.f = wy7.b(jw2.x(i4, i5, 4, str));
                        try {
                            i8 = Integer.parseInt(jw2.m(str, i6, f, "", 120));
                            if (1 <= i8) {
                            }
                        } catch (NumberFormatException unused) {
                        }
                        i8 = -1;
                        this.b = i8;
                        if (i8 == -1) {
                            e41.j("Invalid URL port: \"", 34, str.substring(i6, f));
                            return;
                        }
                    } else {
                        this.f = wy7.b(jw2.x(i4, i5, 4, str));
                        String str3 = (String) this.c;
                        str3.getClass();
                        if (str3.equals("http")) {
                            i7 = 80;
                        } else if (str3.equals("https")) {
                            i7 = 443;
                        } else {
                            i7 = -1;
                        }
                        this.b = i7;
                    }
                    if (((String) this.f) == null) {
                        j = f;
                    } else {
                        e41.j("Invalid URL host: \"", 34, str.substring(i4, i5));
                        return;
                    }
                }
                int f2 = yy7.f(str, j, k, "?#");
                if (j != f2) {
                    char charAt5 = str.charAt(j);
                    if (charAt5 != '/' && charAt5 != '\\') {
                        arrayList2.set(arrayList2.size() - 1, "");
                    } else {
                        arrayList2.clear();
                        arrayList2.add("");
                        j++;
                    }
                    while (j < f2) {
                        int f3 = yy7.f(str, j, f2, "/\\");
                        if (f3 < f2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String m2 = jw2.m(str, j, f3, " \"<>^`{}|/\\?#", 112);
                        if (!m2.equals(".") && !m2.equalsIgnoreCase("%2e")) {
                            if (!m2.equals("..") && !m2.equalsIgnoreCase("%2e.") && !m2.equalsIgnoreCase(".%2e") && !m2.equalsIgnoreCase("%2e%2e")) {
                                if (((CharSequence) arrayList2.get(arrayList2.size() - 1)).length() == 0) {
                                    arrayList2.set(arrayList2.size() - 1, m2);
                                } else {
                                    arrayList2.add(m2);
                                }
                                if (z) {
                                    arrayList2.add("");
                                }
                            } else if (((String) arrayList2.remove(arrayList2.size() - 1)).length() == 0 && !arrayList2.isEmpty()) {
                                arrayList2.set(arrayList2.size() - 1, "");
                            } else {
                                arrayList2.add("");
                            }
                        }
                        if (z) {
                            j = f3 + 1;
                        } else {
                            j = f3;
                        }
                    }
                }
                if (f2 < k && str.charAt(f2) == '?') {
                    int e2 = yy7.e(str, '#', f2, k);
                    this.i = f(jw2.m(str, f2 + 1, e2, " \"'<>#", 80));
                    f2 = e2;
                }
                if (f2 < k && str.charAt(f2) == '#') {
                    this.g = jw2.m(str, f2 + 1, k, "", 48);
                    return;
                }
                return;
            }
        }
        i = -1;
        if (i == -1) {
        }
        i3 = 0;
        while (i2 < k) {
            i3++;
        }
        char c42 = '#';
        if (i3 >= 2) {
        }
        i4 = j + i3;
        boolean z22 = false;
        boolean z32 = false;
        while (true) {
            f = yy7.f(str, i4, k, "@/\\?#");
            if (f == k) {
            }
            if (c == c2) {
                break;
            }
            break;
        }
        i5 = i4;
        while (true) {
            if (i5 < f) {
            }
            i5++;
        }
        i6 = i5 + 1;
        if (i6 >= f) {
        }
        if (((String) this.f) == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (r1 != r3) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.c;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.d).length() > 0 || ((String) this.e).length() > 0) {
                    sb.append((String) this.d);
                    if (((String) this.e).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.e);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.f;
                if (str2 != null) {
                    if (qs6.k0(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.f);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f);
                    }
                }
                int i = -1;
                if (this.b != -1 || ((String) this.c) != null) {
                    int c = c();
                    String str3 = (String) this.c;
                    if (str3 != null) {
                        if (str3.equals("http")) {
                            i = 80;
                            break;
                        } else if (str3.equals("https")) {
                            i = 443;
                            break;
                        }
                    }
                    sb.append(':');
                    sb.append(c);
                }
                ArrayList arrayList = (ArrayList) this.h;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (((ArrayList) this.i) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.i;
                    arrayList2.getClass();
                    x31.o(arrayList2, sb);
                }
                if (((String) this.g) != null) {
                    sb.append('#');
                    sb.append((String) this.g);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public h03(me6 me6Var) {
        this.a = 1;
        d();
        a(StateSet.WILD_CARD, me6Var);
    }
}
