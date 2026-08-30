package vc;

import a6.a1;
import g2.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i extends p7.m {
    public static String I(String str) {
        return uc.h.K(new uc.j(new a1(2, str), new z1("    ", 4), 1), "\n");
    }

    public static String J(String str) {
        Comparable comparable;
        int i2;
        String str2;
        List n02 = h.n0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : n02) {
            if (!h.j0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            String str3 = (String) obj2;
            int length = str3.length();
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (!p7.k.s(str3.charAt(i12))) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (i12 == -1) {
                i12 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i12));
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        int length2 = str.length();
        n02.size();
        int size2 = n02.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : n02) {
            int i13 = i10 + 1;
            if (i10 >= 0) {
                String str4 = (String) obj3;
                if ((i10 == 0 || i10 == size2) && h.j0(str4)) {
                    str2 = null;
                } else {
                    str4.getClass();
                    if (i2 >= 0) {
                        int length3 = str4.length();
                        if (i2 <= length3) {
                            length3 = i2;
                        }
                        str2 = str4.substring(length3);
                    } else {
                        a0.j.e(w.d.m("Requested character count ", i2, " is less than zero."));
                        return null;
                    }
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
                i10 = i13;
            } else {
                t.F();
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder(length2);
        zb.l.X(arrayList3, sb2, null, 124);
        return sb2.toString();
    }

    public static String K(String str) {
        if (!h.j0("|")) {
            List n02 = h.n0(str);
            int length = str.length();
            n02.size();
            int size = n02.size() - 1;
            ArrayList arrayList = new ArrayList();
            Iterator it = n02.iterator();
            int i2 = 0;
            while (true) {
                String str2 = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i10 = i2 + 1;
                    if (i2 >= 0) {
                        String str3 = (String) next;
                        if ((i2 != 0 && i2 != size) || !h.j0(str3)) {
                            int length2 = str3.length();
                            int i11 = 0;
                            while (true) {
                                if (i11 < length2) {
                                    if (!p7.k.s(str3.charAt(i11))) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    i11 = -1;
                                    break;
                                }
                            }
                            if (i11 != -1 && o.U(str3, "|", i11, false)) {
                                str2 = str3.substring("|".length() + i11);
                            }
                            if (str2 == null) {
                                str2 = str3;
                            }
                        }
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                        i2 = i10;
                    } else {
                        t.F();
                        throw null;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(length);
                    zb.l.X(arrayList, sb2, null, 124);
                    return sb2.toString();
                }
            }
        } else {
            a0.j.h("marginPrefix must be non-blank string.");
            return null;
        }
    }
}
