package defpackage;

import com.github.junrar.unpack.ppm.ModelPPM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rs6  reason: default package */
/* loaded from: classes.dex */
public abstract class rs6 extends hi2 {
    public static String Q(String str) {
        return sb6.a0(new qd2(new ev(str, 4), new c70("    ", 15), 2), "\n");
    }

    public static String R(String str) {
        Comparable comparable;
        int i;
        String str2;
        List z0 = qs6.z0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : z0) {
            if (!qs6.v0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
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
                    if (!g04.J(str3.charAt(i4))) {
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
        z0.size();
        int size2 = z0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : z0) {
            int i5 = i2 + 1;
            if (i2 >= 0) {
                String str4 = (String) obj3;
                if ((i2 == 0 || i2 == size2) && qs6.v0(str4)) {
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
                        i.f(lb1.k("Requested character count ", i, " is less than zero."));
                        return null;
                    }
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
                i2 = i5;
            } else {
                hf.q0();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length2);
        gt0.O0(arrayList3, sb, "\n", null, ModelPPM.MAX_FREQ);
        return sb.toString();
    }

    public static String S(String str) {
        String substring;
        if (!qs6.v0("|")) {
            List z0 = qs6.z0(str);
            int length = str.length();
            z0.size();
            int size = z0.size() - 1;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : z0) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = (String) obj;
                    if ((i == 0 || i == size) && qs6.v0(str2)) {
                        str2 = null;
                    } else {
                        int length2 = str2.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 < length2) {
                                if (!g04.J(str2.charAt(i3))) {
                                    break;
                                }
                                i3++;
                            } else {
                                i3 = -1;
                                break;
                            }
                        }
                        if (i3 == -1 || !xs6.f0(str2, "|", i3, false)) {
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
                    hf.q0();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            gt0.O0(arrayList, sb, "\n", null, ModelPPM.MAX_FREQ);
            return sb.toString();
        }
        i.h("marginPrefix must be non-blank string.");
        return null;
    }
}
