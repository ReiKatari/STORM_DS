package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ah6  reason: default package */
/* loaded from: classes.dex */
public abstract class ah6 extends yf2 {
    public static String X(String str) {
        return d06.y0(new y82(new mu(4, str), new ok0("    ", 10), 2), "\n");
    }

    public static String Y(String str) {
        Comparable comparable;
        int i;
        String str2;
        List F0 = zg6.F0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : F0) {
            if (!zg6.B0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            String str3 = (String) obj2;
            int length = str3.length();
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    if (!iq2.v(str3.charAt(i4))) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 == -1) {
                i4 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i4));
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
            i = num.intValue();
        } else {
            i = 0;
        }
        int length2 = str.length();
        F0.size();
        int size2 = F0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : F0) {
            int i5 = i2 + 1;
            if (i2 >= 0) {
                String str4 = (String) obj3;
                if ((i2 == 0 || i2 == size2) && zg6.B0(str4)) {
                    str2 = null;
                } else {
                    str4.getClass();
                    if (i >= 0) {
                        int length3 = str4.length();
                        if (i <= length3) {
                            length3 = i;
                        }
                        str2 = str4.substring(length3);
                    } else {
                        i.g(wh1.j("Requested character count ", i, " is less than zero."));
                        return null;
                    }
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
                i2 = i5;
            } else {
                l07.v0();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length2);
        tq0.R0(arrayList3, sb, "\n", null, 124);
        return sb.toString();
    }

    public static String Z(String str) {
        String substring;
        if (!zg6.B0("|")) {
            List F0 = zg6.F0(str);
            int length = str.length();
            F0.size();
            int size = F0.size() - 1;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : F0) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = (String) obj;
                    if ((i == 0 || i == size) && zg6.B0(str2)) {
                        str2 = null;
                    } else {
                        int length2 = str2.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 < length2) {
                                if (!iq2.v(str2.charAt(i3))) {
                                    break;
                                }
                                i3++;
                            } else {
                                i3 = -1;
                                break;
                            }
                        }
                        if (i3 == -1 || !gh6.m0(str2, "|", i3, false)) {
                            substring = null;
                        } else {
                            substring = str2.substring("|".length() + i3);
                        }
                        if (substring != null) {
                            str2 = substring;
                        }
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i = i2;
                } else {
                    l07.v0();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            tq0.R0(arrayList, sb, "\n", null, 124);
            return sb.toString();
        }
        i.i("marginPrefix must be non-blank string.");
        return null;
    }
}
