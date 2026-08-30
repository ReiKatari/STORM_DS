package vc;

import ai.s0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n2.q2;
import p7.t;
import zb.q;
/* loaded from: classes.dex */
public abstract class h extends o {
    public static String A0(String str, char c4) {
        str.getClass();
        str.getClass();
        int l02 = l0(c4, 0, 6, str);
        if (l02 == -1) {
            return str;
        }
        return str.substring(0, l02);
    }

    public static String B0(int i2, String str) {
        str.getClass();
        if (i2 >= 0) {
            int length = str.length();
            if (i2 > length) {
                i2 = length;
            }
            return str.substring(0, i2);
        }
        a0.j.e(w.d.m("Requested character count ", i2, " is less than zero."));
        return null;
    }

    public static CharSequence C0(CharSequence charSequence) {
        int i2;
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            if (!z10) {
                i2 = i10;
            } else {
                i2 = length;
            }
            boolean s10 = p7.k.s(charSequence.charAt(i2));
            if (!z10) {
                if (!s10) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!s10) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static boolean Y(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (h0(charSequence, (String) charSequence2, 0, z10, 2) >= 0) {
                return true;
            }
        } else if (f0(charSequence, charSequence2, 0, charSequence.length(), z10, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean Z(CharSequence charSequence, char c4) {
        charSequence.getClass();
        if (g0(c4, 0, 2, charSequence) < 0) {
            return false;
        }
        return true;
    }

    public static boolean a0(CharSequence charSequence, String str) {
        charSequence.getClass();
        if (charSequence instanceof String) {
            return o.O((String) charSequence, str, false);
        }
        return p0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean b0(String str, char c4) {
        if (str.length() <= 0 || !p7.k.j(str.charAt(str.length() - 1), c4, false)) {
            return false;
        }
        return true;
    }

    public static final yb.j c0(CharSequence charSequence, Collection collection, int i2) {
        CharSequence charSequence2;
        Object obj;
        Object obj2;
        Object obj3;
        if (collection.size() == 1) {
            Collection collection2 = collection;
            if (collection2 instanceof List) {
                List list = (List) collection2;
                int size = list.size();
                if (size != 0) {
                    if (size == 1) {
                        obj3 = list.get(0);
                    } else {
                        a0.j.h("List has more than one element.");
                        return null;
                    }
                } else {
                    m9.o.x("List is empty.");
                    return null;
                }
            } else {
                Iterator it = collection2.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (!it.hasNext()) {
                        obj3 = next;
                    } else {
                        a0.j.h("Collection has more than one element.");
                        return null;
                    }
                } else {
                    m9.o.x("Collection is empty.");
                    return null;
                }
            }
            String str = (String) obj3;
            int h02 = h0(charSequence, str, i2, false, 4);
            if (h02 >= 0) {
                return new yb.j(Integer.valueOf(h02), str);
            }
        } else {
            if (i2 < 0) {
                i2 = 0;
            }
            sc.b bVar = new sc.b(i2, charSequence.length(), 1);
            boolean z10 = charSequence instanceof String;
            int i10 = bVar.L;
            int i11 = bVar.B;
            if (z10) {
                if ((i10 > 0 && i2 <= i11) || (i10 < 0 && i11 <= i2)) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                String str2 = (String) obj2;
                                if (str2.regionMatches(0, (String) charSequence, i2, str2.length())) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        String str3 = (String) obj2;
                        if (str3 != null) {
                            return new yb.j(Integer.valueOf(i2), str3);
                        }
                        if (i2 == i11) {
                            break;
                        }
                        i2 += i10;
                    }
                }
            } else if ((i10 > 0 && i2 <= i11) || (i10 < 0 && i11 <= i2)) {
                int i12 = i2;
                while (true) {
                    Iterator it3 = collection.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj = it3.next();
                            String str4 = (String) obj;
                            charSequence2 = charSequence;
                            if (p0(str4, 0, charSequence2, i12, str4.length(), false)) {
                                break;
                            }
                            charSequence = charSequence2;
                        } else {
                            charSequence2 = charSequence;
                            obj = null;
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 != null) {
                        return new yb.j(Integer.valueOf(i12), str5);
                    }
                    if (i12 == i11) {
                        break;
                    }
                    i12 += i10;
                    charSequence = charSequence2;
                }
            }
        }
        return null;
    }

    public static int d0(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static final int e0(CharSequence charSequence, String str, int i2, boolean z10) {
        charSequence.getClass();
        str.getClass();
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i2);
        }
        return f0(charSequence, str, i2, charSequence.length(), z10, false);
    }

    public static final int f0(CharSequence charSequence, CharSequence charSequence2, int i2, int i10, boolean z10, boolean z11) {
        sc.b bVar;
        if (!z11) {
            if (i2 < 0) {
                i2 = 0;
            }
            int length = charSequence.length();
            if (i10 > length) {
                i10 = length;
            }
            bVar = new sc.b(i2, i10, 1);
        } else {
            int d02 = d0(charSequence);
            if (i2 > d02) {
                i2 = d02;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            bVar = new sc.b(i2, i10, -1);
        }
        boolean z12 = charSequence instanceof String;
        int i11 = bVar.L;
        int i12 = bVar.B;
        int i13 = bVar.A;
        if (z12 && (charSequence2 instanceof String)) {
            if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
                int i14 = i13;
                while (true) {
                    String str = (String) charSequence2;
                    boolean z13 = z10;
                    if (o.R(0, i14, str.length(), str, (String) charSequence, z13)) {
                        return i14;
                    }
                    if (i14 == i12) {
                        break;
                    }
                    i14 += i11;
                    z10 = z13;
                }
            }
        } else {
            boolean z14 = z10;
            if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z15 = z14;
                    z14 = z15;
                    if (p0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z15)) {
                        return i13;
                    }
                    if (i13 == i12) {
                        break;
                    }
                    i13 += i11;
                    charSequence2 = charSequence4;
                    charSequence = charSequence3;
                }
            }
        }
        return -1;
    }

    public static int g0(char c4, int i2, int i10, CharSequence charSequence) {
        if ((i10 & 2) != 0) {
            i2 = 0;
        }
        charSequence.getClass();
        if (!(charSequence instanceof String)) {
            return i0(charSequence, new char[]{c4}, i2, false);
        }
        return ((String) charSequence).indexOf(c4, i2);
    }

    public static /* synthetic */ int h0(CharSequence charSequence, String str, int i2, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            i2 = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return e0(charSequence, str, i2, z10);
    }

    public static final int i0(CharSequence charSequence, char[] cArr, int i2, boolean z10) {
        charSequence.getClass();
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(zb.k.J(cArr), i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int length = charSequence.length() - 1;
        if (i2 > length) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i2);
            for (char c4 : cArr) {
                if (p7.k.j(c4, charAt, z10)) {
                    return i2;
                }
            }
            if (i2 != length) {
                i2++;
            } else {
                return -1;
            }
        }
    }

    public static boolean j0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (!p7.k.s(charSequence.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static char k0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        m9.o.x("Char sequence is empty.");
        return (char) 0;
    }

    public static int l0(char c4, int i2, int i10, CharSequence charSequence) {
        if ((i10 & 2) != 0) {
            i2 = d0(charSequence);
        }
        charSequence.getClass();
        if (!(charSequence instanceof String)) {
            char[] cArr = {c4};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(zb.k.J(cArr), i2);
            }
            int length = charSequence.length() - 1;
            if (i2 > length) {
                i2 = length;
            }
            while (-1 < i2) {
                if (p7.k.j(cArr[0], charSequence.charAt(i2), false)) {
                    return i2;
                }
                i2--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c4, i2);
    }

    public static int m0(CharSequence charSequence, String str, int i2, int i10) {
        if ((i10 & 2) != 0) {
            i2 = d0(charSequence);
        }
        int i11 = i2;
        charSequence.getClass();
        str.getClass();
        if (!(charSequence instanceof String)) {
            return f0(charSequence, str, i11, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, i11);
    }

    public static List n0(String str) {
        c cVar = new c(str);
        if (!cVar.hasNext()) {
            return q.A;
        }
        Object next = cVar.next();
        if (!cVar.hasNext()) {
            return t.x(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next());
        }
        return arrayList;
    }

    public static String o0(int i2, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i2 >= 0) {
            if (i2 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i2);
                int length = i2 - str.length();
                int i10 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
                sb2.append((CharSequence) str);
                charSequence = sb2;
            }
            return charSequence.toString();
        }
        a0.j.h(w.d.m("Desired length ", i2, " is less than zero."));
        return null;
    }

    public static final boolean p0(CharSequence charSequence, int i2, CharSequence charSequence2, int i10, int i11, boolean z10) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i10 < 0 || i2 < 0 || i2 > charSequence.length() - i11 || i10 > charSequence2.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!p7.k.j(charSequence.charAt(i2 + i12), charSequence2.charAt(i10 + i12), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String q0(String str, String str2) {
        if (o.V(str, str2, false)) {
            return str.substring(str2.length());
        }
        return str;
    }

    public static String r0(String str, String str2) {
        str.getClass();
        if (a0(str, str2)) {
            return str.substring(0, str.length() - str2.length());
        }
        return str;
    }

    public static StringBuilder s0(CharSequence charSequence, int i2, int i10, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i10 >= i2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i2);
            sb2.append(charSequence2);
            sb2.append(charSequence, i10, charSequence.length());
            return sb2;
        }
        m9.o.c(i10, i2, ") is less than start index (", "End index (");
        return null;
    }

    public static final List t0(CharSequence charSequence, String str) {
        int e02 = e0(charSequence, str, 0, false);
        if (e02 != -1) {
            ArrayList arrayList = new ArrayList(10);
            int i2 = 0;
            do {
                arrayList.add(charSequence.subSequence(i2, e02).toString());
                i2 = str.length() + e02;
                e02 = e0(charSequence, str, i2, false);
            } while (e02 != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        return t.x(charSequence.toString());
    }

    public static List u0(CharSequence charSequence, char[] cArr) {
        charSequence.getClass();
        if (cArr.length == 1) {
            return t0(charSequence, String.valueOf(cArr[0]));
        }
        ld.g gVar = new ld.g(1, new jc.h(charSequence, new s0(29, cArr)));
        ArrayList arrayList = new ArrayList(zb.m.G(gVar, 10));
        Iterator it = gVar.iterator();
        while (true) {
            q2 q2Var = (q2) it;
            if (q2Var.hasNext()) {
                sc.d dVar = (sc.d) q2Var.next();
                dVar.getClass();
                arrayList.add(charSequence.subSequence(dVar.A, dVar.B + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static List v0(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return t0(charSequence, str);
            }
        }
        List asList = Arrays.asList(strArr);
        asList.getClass();
        ld.g gVar = new ld.g(1, new jc.h(charSequence, new s0(28, asList)));
        ArrayList arrayList = new ArrayList(zb.m.G(gVar, 10));
        Iterator it = gVar.iterator();
        while (true) {
            q2 q2Var = (q2) it;
            if (q2Var.hasNext()) {
                sc.d dVar = (sc.d) q2Var.next();
                dVar.getClass();
                arrayList.add(charSequence.subSequence(dVar.A, dVar.B + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static String w0(String str, String str2, String str3) {
        int h02 = h0(str, str2, 0, false, 6);
        if (h02 == -1) {
            return str3;
        }
        return str.substring(str2.length() + h02, str.length());
    }

    public static String x0(char c4, String str, String str2) {
        str.getClass();
        str2.getClass();
        int l02 = l0(c4, 0, 6, str);
        if (l02 == -1) {
            return str2;
        }
        return str.substring(l02 + 1, str.length());
    }

    public static String y0(String str) {
        str.getClass();
        str.getClass();
        int h02 = h0(str, "/", 0, false, 6);
        if (h02 == -1) {
            return str;
        }
        return str.substring(0, h02);
    }

    public static String z0(String str, char c4) {
        int g02 = g0(c4, 0, 6, str);
        if (g02 == -1) {
            return str;
        }
        return str.substring(0, g02);
    }
}
