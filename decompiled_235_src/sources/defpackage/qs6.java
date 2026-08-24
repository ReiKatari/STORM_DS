package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* renamed from: qs6 */
/* loaded from: classes.dex */
public abstract class qs6 extends xs6 {
    public static String A0(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                sb.append((CharSequence) str);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append(' ');
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                charSequence = sb;
            }
            return charSequence.toString();
        }
        i.h(lb1.k("Desired length ", i, " is less than zero."));
        return null;
    }

    public static String B0(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append('0');
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                sb.append((CharSequence) str);
                charSequence = sb;
            }
            return charSequence.toString();
        }
        i.h(lb1.k("Desired length ", i, " is less than zero."));
        return null;
    }

    public static final boolean C0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!g04.E(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String D0(String str, String str2) {
        if (xs6.g0(str, str2, false)) {
            return str.substring(str2.length());
        }
        return str;
    }

    public static String E0(String str, String str2) {
        str.getClass();
        if (l0(str, str2)) {
            return str.substring(0, str.length() - str2.length());
        }
        return str;
    }

    public static String F0(String str, String str2, String str3) {
        str.getClass();
        int x0 = x0('.', 0, 6, str);
        if (x0 == -1) {
            return str3;
        }
        return G0(str, x0 + 1, str.length(), str2).toString();
    }

    public static StringBuilder G0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        e41.q(xg6.m(i2, i, "End index (", ") is less than start index (", ")."));
        return null;
    }

    public static final void H0(int i) {
        if (i >= 0) {
            return;
        }
        i.f(lb1.g(i, "Limit must be non-negative, but was "));
    }

    public static final List I0(int i, CharSequence charSequence, String str) {
        boolean z;
        H0(i);
        int q0 = q0(charSequence, str, 0, false);
        if (q0 != -1 && i != 1) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = 10;
            if (z && i <= 10) {
                i2 = i;
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            do {
                arrayList.add(charSequence.subSequence(i3, q0).toString());
                i3 = str.length() + q0;
                if (z && arrayList.size() == i - 1) {
                    break;
                }
                q0 = q0(charSequence, str, i3, false);
            } while (q0 != -1);
            arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            return arrayList;
        }
        return hf.b0(charSequence.toString());
    }

    public static List J0(CharSequence charSequence, char[] cArr, int i) {
        int i2;
        if ((i & 4) != 0) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        charSequence.getClass();
        if (cArr.length == 1) {
            return I0(i2, charSequence, String.valueOf(cArr[0]));
        }
        H0(i2);
        dv dvVar = new dv(new lh1(charSequence, i2, new y36(cArr, 8)), 3);
        ArrayList arrayList = new ArrayList(ht0.v0(dvVar, 10));
        Iterator it = dvVar.iterator();
        while (true) {
            kh1 kh1Var = (kh1) it;
            if (kh1Var.hasNext()) {
                l93 l93Var = (l93) kh1Var.next();
                l93Var.getClass();
                arrayList.add(charSequence.subSequence(l93Var.A, l93Var.B + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static List K0(CharSequence charSequence, String[] strArr, int i) {
        int i2;
        if ((i & 4) != 0) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return I0(i2, charSequence, str);
            }
        }
        H0(i2);
        List asList = Arrays.asList(strArr);
        asList.getClass();
        dv dvVar = new dv(new lh1(charSequence, i2, new y36(asList, 7)), 3);
        ArrayList arrayList = new ArrayList(ht0.v0(dvVar, 10));
        Iterator it = dvVar.iterator();
        while (true) {
            kh1 kh1Var = (kh1) it;
            if (kh1Var.hasNext()) {
                l93 l93Var = (l93) kh1Var.next();
                l93Var.getClass();
                arrayList.add(charSequence.subSequence(l93Var.A, l93Var.B + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static boolean L0(String str, char c) {
        str.getClass();
        if (str.length() <= 0 || !g04.E(str.charAt(0), c, false)) {
            return false;
        }
        return true;
    }

    public static String M0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int s0 = s0(c, 0, 6, str);
        if (s0 == -1) {
            return str2;
        }
        return str.substring(s0 + 1, str.length());
    }

    public static String N0(String str, String str2, String str3) {
        str.getClass();
        int t0 = t0(str, str2, 0, false, 6);
        if (t0 == -1) {
            return str3;
        }
        return str.substring(str2.length() + t0, str.length());
    }

    public static String O0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int x0 = x0(c, 0, 6, str);
        if (x0 == -1) {
            return str2;
        }
        return str.substring(x0 + 1, str.length());
    }

    public static String P0(String str, char c) {
        int s0 = s0(c, 0, 6, str);
        if (s0 == -1) {
            return str;
        }
        return str.substring(0, s0);
    }

    public static String Q0(String str, String str2) {
        str.getClass();
        str.getClass();
        int t0 = t0(str, str2, 0, false, 6);
        if (t0 == -1) {
            return str;
        }
        return str.substring(0, t0);
    }

    public static String R0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int x0 = x0(c, 0, 6, str);
        if (x0 == -1) {
            return str2;
        }
        return str.substring(0, x0);
    }

    public static String S0(int i, String str) {
        str.getClass();
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        i.f(lb1.k("Requested character count ", i, " is less than zero."));
        return null;
    }

    public static CharSequence T0(CharSequence charSequence) {
        int i;
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean J = g04.J(charSequence.charAt(i));
            if (!z) {
                if (!J) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!J) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static String U0(String str, char... cArr) {
        int i;
        boolean z;
        str.getClass();
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            char charAt = str.charAt(i);
            int length2 = cArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length2) {
                    if (charAt == cArr[i3]) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    public static boolean j0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (t0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (r0(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean k0(CharSequence charSequence, char c) {
        charSequence.getClass();
        if (s0(c, 0, 2, charSequence) < 0) {
            return false;
        }
        return true;
    }

    public static boolean l0(CharSequence charSequence, String str) {
        charSequence.getClass();
        if (charSequence instanceof String) {
            return xs6.Y((String) charSequence, str, false);
        }
        return C0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean m0(String str, char c) {
        if (str.length() <= 0 || !g04.E(str.charAt(str.length() - 1), c, false)) {
            return false;
        }
        return true;
    }

    public static final vr4 n0(CharSequence charSequence, Collection collection, int i) {
        CharSequence charSequence2;
        Object obj;
        Object obj2;
        Object obj3;
        if (collection.size() == 1) {
            Collection collection2 = collection;
            if (collection2 instanceof List) {
                obj3 = gt0.b1((List) collection2);
            } else {
                Iterator it = collection2.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (!it.hasNext()) {
                        obj3 = next;
                    } else {
                        i.h("Collection has more than one element.");
                        return null;
                    }
                } else {
                    fa6.e("Collection is empty.");
                    return null;
                }
            }
            String str = (String) obj3;
            int t0 = t0(charSequence, str, i, false, 4);
            if (t0 >= 0) {
                return new vr4(Integer.valueOf(t0), str);
            }
        } else {
            if (i < 0) {
                i = 0;
            }
            j93 j93Var = new j93(i, charSequence.length(), 1);
            boolean z = charSequence instanceof String;
            int i2 = j93Var.L;
            int i3 = j93Var.B;
            if (z) {
                if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                String str2 = (String) obj2;
                                if (str2.regionMatches(0, (String) charSequence, i, str2.length())) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        String str3 = (String) obj2;
                        if (str3 != null) {
                            return new vr4(Integer.valueOf(i), str3);
                        }
                        if (i == i3) {
                            break;
                        }
                        i += i2;
                    }
                }
            } else if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
                int i4 = i;
                while (true) {
                    Iterator it3 = collection.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj = it3.next();
                            String str4 = (String) obj;
                            charSequence2 = charSequence;
                            if (C0(str4, 0, charSequence2, i4, str4.length(), false)) {
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
                        return new vr4(Integer.valueOf(i4), str5);
                    }
                    if (i4 == i3) {
                        break;
                    }
                    i4 += i2;
                    charSequence = charSequence2;
                }
            }
        }
        return null;
    }

    public static int o0(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static Character p0(int i, String str) {
        if (i >= 0 && i < str.length()) {
            return Character.valueOf(str.charAt(i));
        }
        return null;
    }

    public static final int q0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return r0(charSequence, str, i, charSequence.length(), z, false);
    }

    public static final int r0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        j93 j93Var;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            j93Var = new j93(i, i2, 1);
        } else {
            int o0 = o0(charSequence);
            if (i > o0) {
                i = o0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            j93Var = new j93(i, i2, -1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = j93Var.L;
        int i4 = j93Var.B;
        int i5 = j93Var.A;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                int i6 = i5;
                while (true) {
                    String str = (String) charSequence2;
                    boolean z4 = z;
                    if (xs6.b0(0, i6, str.length(), str, (String) charSequence, z4)) {
                        return i6;
                    }
                    if (i6 == i4) {
                        break;
                    }
                    i6 += i3;
                    z = z4;
                }
            }
        } else {
            boolean z5 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z6 = z5;
                    z5 = z6;
                    if (C0(charSequence4, 0, charSequence3, i5, charSequence2.length(), z6)) {
                        return i5;
                    }
                    if (i5 == i4) {
                        break;
                    }
                    i5 += i3;
                    charSequence2 = charSequence4;
                    charSequence = charSequence3;
                }
            }
        }
        return -1;
    }

    public static int s0(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (!(charSequence instanceof String)) {
            return u0(charSequence, new char[]{c}, i, false);
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int t0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return q0(charSequence, str, i, z);
    }

    public static final int u0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(fv.O0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (g04.E(c, charAt, z)) {
                    return i;
                }
            }
            if (i != length) {
                i++;
            } else {
                return -1;
            }
        }
    }

    public static boolean v0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!g04.J(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char w0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        fa6.e("Char sequence is empty.");
        return (char) 0;
    }

    public static int x0(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = o0(charSequence);
        }
        charSequence.getClass();
        if (!(charSequence instanceof String)) {
            char[] cArr = {c};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(fv.O0(cArr), i);
            }
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            while (-1 < i) {
                if (g04.E(cArr[0], charSequence.charAt(i), false)) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static int y0(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = o0(charSequence);
        }
        int i3 = i;
        charSequence.getClass();
        str.getClass();
        if (!(charSequence instanceof String)) {
            return r0(charSequence, str, i3, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, i3);
    }

    public static List z0(CharSequence charSequence) {
        charSequence.getClass();
        kv3 kv3Var = new kv3(charSequence);
        if (!kv3Var.hasNext()) {
            return yt1.A;
        }
        Object next = kv3Var.next();
        if (!kv3Var.hasNext()) {
            return hf.b0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (kv3Var.hasNext()) {
            arrayList.add(kv3Var.next());
        }
        return arrayList;
    }
}
