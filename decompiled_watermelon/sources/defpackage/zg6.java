package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* renamed from: zg6 */
/* loaded from: classes.dex */
public abstract class zg6 extends gh6 {
    public static final int A0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(nu.A0(cArr), i);
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
                if (iq2.m(c, charAt, z)) {
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

    public static boolean B0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!iq2.v(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char C0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        vd6.e("Char sequence is empty.");
        return (char) 0;
    }

    public static int D0(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = v0(charSequence);
        }
        charSequence.getClass();
        if (!(charSequence instanceof String)) {
            char[] cArr = {c};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(nu.A0(cArr), i);
            }
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            while (-1 < i) {
                if (iq2.m(cArr[0], charSequence.charAt(i), false)) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static int E0(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = v0(charSequence);
        }
        int i3 = i;
        charSequence.getClass();
        str.getClass();
        if (!(charSequence instanceof String)) {
            return x0(charSequence, str, i3, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, i3);
    }

    public static List F0(String str) {
        io3 io3Var = new io3(str);
        if (!io3Var.hasNext()) {
            return pp1.A;
        }
        Object next = io3Var.next();
        if (!io3Var.hasNext()) {
            return l07.b0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (io3Var.hasNext()) {
            arrayList.add(io3Var.next());
        }
        return arrayList;
    }

    public static String G0(int i, String str) {
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
        i.i(wh1.j("Desired length ", i, " is less than zero."));
        return null;
    }

    public static String H0(int i, String str) {
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
        i.i(wh1.j("Desired length ", i, " is less than zero."));
        return null;
    }

    public static final boolean I0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!iq2.m(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String J0(String str, String str2) {
        if (gh6.n0(str, str2, false)) {
            return str.substring(str2.length());
        }
        return str;
    }

    public static String K0(String str, String str2) {
        str.getClass();
        if (s0(str, str2)) {
            return str.substring(0, str.length() - str2.length());
        }
        return str;
    }

    public static String L0(String str, String str2, String str3) {
        str.getClass();
        int D0 = D0('.', 0, 6, str);
        if (D0 == -1) {
            return str3;
        }
        return M0(str, D0 + 1, str.length(), str2).toString();
    }

    public static StringBuilder M0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        vd6.c(i2, i, ") is less than start index (", "End index (");
        return null;
    }

    public static final void N0(int i) {
        if (i >= 0) {
            return;
        }
        i.g(wh1.g(i, "Limit must be non-negative, but was "));
    }

    public static final List O0(CharSequence charSequence, String str, int i) {
        boolean z;
        N0(i);
        int w0 = w0(charSequence, str, 0, false);
        if (w0 != -1 && i != 1) {
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
                arrayList.add(charSequence.subSequence(i3, w0).toString());
                i3 = str.length() + w0;
                if (z && arrayList.size() == i - 1) {
                    break;
                }
                w0 = w0(charSequence, str, i3, false);
            } while (w0 != -1);
            arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            return arrayList;
        }
        return l07.b0(charSequence.toString());
    }

    public static List P0(CharSequence charSequence, char[] cArr, int i) {
        int i2;
        if ((i & 4) != 0) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        charSequence.getClass();
        if (cArr.length == 1) {
            return O0(charSequence, String.valueOf(cArr[0]), i2);
        }
        N0(i2);
        lu luVar = new lu(3, new jd1(charSequence, i2, new bt5(8, cArr)));
        ArrayList arrayList = new ArrayList(uq0.y0(luVar, 10));
        Iterator it = luVar.iterator();
        while (true) {
            id1 id1Var = (id1) it;
            if (id1Var.hasNext()) {
                d33 d33Var = (d33) id1Var.next();
                d33Var.getClass();
                arrayList.add(charSequence.subSequence(d33Var.A, d33Var.B + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static List Q0(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return O0(charSequence, str, 0);
            }
        }
        N0(0);
        List asList = Arrays.asList(strArr);
        asList.getClass();
        lu luVar = new lu(3, new jd1(charSequence, 0, new bt5(7, asList)));
        ArrayList arrayList = new ArrayList(uq0.y0(luVar, 10));
        Iterator it = luVar.iterator();
        while (true) {
            id1 id1Var = (id1) it;
            if (id1Var.hasNext()) {
                d33 d33Var = (d33) id1Var.next();
                d33Var.getClass();
                arrayList.add(charSequence.subSequence(d33Var.A, d33Var.B + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static boolean R0(String str, char c) {
        str.getClass();
        if (str.length() <= 0 || !iq2.m(str.charAt(0), c, false)) {
            return false;
        }
        return true;
    }

    public static String S0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int y0 = y0(c, 0, 6, str);
        if (y0 == -1) {
            return str2;
        }
        return str.substring(y0 + 1, str.length());
    }

    public static String T0(String str, String str2, String str3) {
        str.getClass();
        int z0 = z0(str, str2, 0, false, 6);
        if (z0 == -1) {
            return str3;
        }
        return str.substring(str2.length() + z0, str.length());
    }

    public static String U0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int D0 = D0(c, 0, 6, str);
        if (D0 == -1) {
            return str2;
        }
        return str.substring(D0 + 1, str.length());
    }

    public static String V0(String str, char c) {
        int y0 = y0(c, 0, 6, str);
        if (y0 == -1) {
            return str;
        }
        return str.substring(0, y0);
    }

    public static String W0(String str, String str2) {
        str.getClass();
        str.getClass();
        int z0 = z0(str, str2, 0, false, 6);
        if (z0 == -1) {
            return str;
        }
        return str.substring(0, z0);
    }

    public static String X0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int D0 = D0(c, 0, 6, str);
        if (D0 == -1) {
            return str2;
        }
        return str.substring(0, D0);
    }

    public static String Y0(int i, String str) {
        str.getClass();
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        i.g(wh1.j("Requested character count ", i, " is less than zero."));
        return null;
    }

    public static CharSequence Z0(CharSequence charSequence) {
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
            boolean v = iq2.v(charSequence.charAt(i));
            if (!z) {
                if (!v) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!v) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static boolean q0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (z0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (x0(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean r0(CharSequence charSequence, char c) {
        charSequence.getClass();
        if (y0(c, 0, 2, charSequence) < 0) {
            return false;
        }
        return true;
    }

    public static boolean s0(CharSequence charSequence, String str) {
        charSequence.getClass();
        if (charSequence instanceof String) {
            return gh6.f0((String) charSequence, str, false);
        }
        return I0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean t0(String str, char c) {
        if (str.length() <= 0 || !iq2.m(str.charAt(str.length() - 1), c, false)) {
            return false;
        }
        return true;
    }

    public static final ti4 u0(CharSequence charSequence, Collection collection, int i) {
        CharSequence charSequence2;
        Object obj;
        Object obj2;
        Object obj3;
        if (collection.size() == 1) {
            Collection collection2 = collection;
            if (collection2 instanceof List) {
                obj3 = tq0.e1((List) collection2);
            } else {
                Iterator it = collection2.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (!it.hasNext()) {
                        obj3 = next;
                    } else {
                        i.i("Collection has more than one element.");
                        return null;
                    }
                } else {
                    vd6.e("Collection is empty.");
                    return null;
                }
            }
            String str = (String) obj3;
            int z0 = z0(charSequence, str, i, false, 4);
            if (z0 >= 0) {
                return new ti4(Integer.valueOf(z0), str);
            }
        } else {
            if (i < 0) {
                i = 0;
            }
            b33 b33Var = new b33(i, charSequence.length(), 1);
            boolean z = charSequence instanceof String;
            int i2 = b33Var.L;
            int i3 = b33Var.B;
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
                            return new ti4(Integer.valueOf(i), str3);
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
                            if (I0(str4, 0, charSequence2, i4, str4.length(), false)) {
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
                        return new ti4(Integer.valueOf(i4), str5);
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

    public static int v0(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static final int w0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return x0(charSequence, str, i, charSequence.length(), z, false);
    }

    public static final int x0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        b33 b33Var;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            b33Var = new b33(i, i2, 1);
        } else {
            int v0 = v0(charSequence);
            if (i > v0) {
                i = v0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            b33Var = new b33(i, i2, -1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = b33Var.L;
        int i4 = b33Var.B;
        int i5 = b33Var.A;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                int i6 = i5;
                while (true) {
                    String str = (String) charSequence2;
                    boolean z4 = z;
                    if (gh6.i0(0, i6, str.length(), str, (String) charSequence, z4)) {
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
                    if (I0(charSequence4, 0, charSequence3, i5, charSequence2.length(), z6)) {
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

    public static int y0(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (!(charSequence instanceof String)) {
            return A0(charSequence, new char[]{c}, i, false);
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int z0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return w0(charSequence, str, i, z);
    }
}
