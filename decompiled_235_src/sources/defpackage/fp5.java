package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fp5  reason: default package */
/* loaded from: classes.dex */
public abstract class fp5 {
    public static final xh5 a;
    public static final xh5 b;
    public static final xh5 c;
    public static final xh5 d;
    public static final xh5 e;
    public static final xh5 f;
    public static final xh5 g;
    public static final xh5 h;

    static {
        yh5 yh5Var = yh5.IGNORE_CASE;
        a = new xh5("shader\\d+", yh5Var);
        yh5 yh5Var2 = yh5.MULTILINE;
        b = new xh5("^\\s*#\\s*include\\s+\"([^\"]+)\"", ii2.R(yh5Var2));
        c = new xh5("^\\s*#\\s*reference\\s+\"?([^\"\\r\\n]+)\"?", ii2.R(yh5Var2));
        d = new xh5("sourcesize\\.(?:xy|x|y)\\s*[^;\\n]*outputsize\\.zw|outputsize\\.zw\\s*[^;\\n]*sourcesize\\.(?:xy|x|y)", yh5Var);
        e = new xh5("originalsize\\.(?:xy|x|y)\\s*[^;\\n]*outputsize\\.zw|outputsize\\.zw\\s*[^;\\n]*originalsize\\.(?:xy|x|y)", yh5Var);
        f = new xh5("outputsize\\.xy\\s*[^;\\n]*(?:sourcesize|originalsize)\\.zw|(?:sourcesize|originalsize)\\.zw\\s*[^;\\n]*outputsize\\.xy", yh5Var);
        g = new xh5("(?:fract|floor)\\s*\\([^;\\n]*sourcesize\\.xy|sourcesize\\.xy\\s*[^;\\n]*(?:fract|floor)", yh5Var);
        h = new xh5("(?:fract|floor|sin|modf)\\s*\\([^;\\n]*originalsize\\.xy|originalsize\\.xy\\s*[^;\\n]*(?:fract|floor|sin|modf)", yh5Var);
    }

    public static List a(String str) {
        return sb6.c0(new pc2(sb6.b0(xh5.a(b, str), new gn5(3)), true, new gn5(4)));
    }

    public static LinkedHashMap b(String str) {
        String substring;
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt == '#') {
                int s0 = qs6.s0('\n', i2, 4, str);
                Integer valueOf = Integer.valueOf(s0);
                if (s0 < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i2 = valueOf.intValue();
                } else {
                    i2 = str.length();
                }
            } else if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                i2++;
            } else {
                int i3 = i2;
                while (i3 < str.length() && (Character.isLetterOrDigit(str.charAt(i3)) || str.charAt(i3) == '_')) {
                    i3++;
                }
                String substring2 = str.substring(i2, i3);
                while (i3 < str.length() && g04.J(str.charAt(i3))) {
                    i3++;
                }
                if (i3 < str.length() && str.charAt(i3) == '=') {
                    do {
                        i3++;
                        if (i3 >= str.length()) {
                            break;
                        }
                    } while (g04.J(str.charAt(i3)));
                    if (i3 < str.length() && str.charAt(i3) == '\"') {
                        int i4 = i3 + 1;
                        i = i4;
                        while (i < str.length() && str.charAt(i) != '\"') {
                            i++;
                        }
                        substring = str.substring(i4, i);
                        if (i < str.length() && str.charAt(i) == '\"') {
                            i++;
                        }
                    } else {
                        int i5 = i3;
                        while (i5 < str.length() && !g04.J(str.charAt(i5)) && str.charAt(i5) != '#') {
                            i5++;
                        }
                        substring = str.substring(i3, i5);
                        i = i5;
                    }
                    String obj = qs6.T0(substring).toString();
                    if (!qs6.v0(substring2)) {
                        linkedHashMap.put(substring2, obj);
                    }
                    i2 = i;
                } else {
                    i2 = i3;
                }
            }
        }
        return linkedHashMap;
    }

    public static int c(LinkedHashMap linkedHashMap) {
        Integer h0;
        String str = (String) linkedHashMap.get("shaders");
        if (str != null && (h0 = xs6.h0(str)) != null) {
            int intValue = h0.intValue();
            if (intValue < 0) {
                return 0;
            }
            return intValue;
        }
        return e(linkedHashMap).size();
    }

    public static String d(String str, String str2) {
        str.getClass();
        str2.getClass();
        String replace = str2.replace('\\', '/');
        replace.getClass();
        String U0 = qs6.U0(qs6.T0(replace).toString(), '\"');
        if (!qs6.v0(U0) && !qs6.L0(U0, '/') && !qs6.j0(U0, "://", false)) {
            pu puVar = new pu();
            List J0 = qs6.J0(qs6.R0('/', str, ""), new char[]{'/'}, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : J0) {
                if (!qs6.v0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                puVar.addLast((String) obj2);
            }
            for (String str3 : qs6.J0(U0, new char[]{'/'}, 6)) {
                if (!qs6.v0(str3) && !str3.equals(".")) {
                    if (str3.equals("..")) {
                        if (!puVar.isEmpty()) {
                            puVar.removeLast();
                        } else {
                            return null;
                        }
                    } else {
                        puVar.addLast(str3);
                    }
                }
            }
            return gt0.P0(puVar, "/", null, null, null, 62);
        }
        return null;
    }

    public static ArrayList e(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashMap.entrySet()) {
            if (a.d((CharSequence) ((Map.Entry) obj).getKey())) {
                arrayList.add(obj);
            }
        }
        List<Map.Entry> d1 = gt0.d1(arrayList, new zh2(29));
        ArrayList arrayList2 = new ArrayList(ht0.v0(d1, 10));
        for (Map.Entry entry : d1) {
            arrayList2.add((String) entry.getValue());
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            if (!qs6.v0((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    public static List f(LinkedHashMap linkedHashMap) {
        String str = (String) linkedHashMap.get("textures");
        if (str != null) {
            int i = 0;
            List<String> J0 = qs6.J0(str, new char[]{';'}, 6);
            ArrayList arrayList = new ArrayList(ht0.v0(J0, 10));
            for (String str2 : J0) {
                arrayList.add(qs6.T0(str2).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (!qs6.v0((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                String str3 = (String) linkedHashMap.get((String) obj2);
                if (str3 != null) {
                    arrayList3.add(str3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                if (!qs6.v0((String) obj3)) {
                    arrayList4.add(obj3);
                }
            }
            return arrayList4;
        }
        return yt1.A;
    }

    public static ep5 g(String str, qn2 qn2Var) {
        Integer num;
        List list;
        String str2;
        String str3;
        Integer h0;
        String str4;
        String str5;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        pu puVar = new pu(hf.b0(str));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (!puVar.isEmpty() && arrayList.size() < 16) {
            String str6 = (String) puVar.removeFirst();
            if (linkedHashSet.add(str6) && (str5 = (String) qn2Var.g(str6)) != null) {
                arrayList.add(new dp5(str6, b(str5)));
                for (String str7 : sb6.c0(new pc2(sb6.b0(xh5.a(c, str5), new gn5(5)), true, new gn5(6)))) {
                    String d2 = d(str6, str7);
                    if (d2 != null) {
                        puVar.addLast(d2);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            list = yt1.A;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                dp5 dp5Var = (dp5) obj;
                for (Map.Entry entry : dp5Var.b.entrySet()) {
                    linkedHashMap.putIfAbsent((String) entry.getKey(), new vr4((String) entry.getValue(), dp5Var.a));
                }
            }
            vr4 vr4Var = (vr4) linkedHashMap.get("shaders");
            if (vr4Var != null && (str3 = (String) vr4Var.A) != null && (h0 = xs6.h0(str3)) != null) {
                int intValue = h0.intValue();
                if (intValue >= 0) {
                    i = intValue;
                }
                num = Integer.valueOf(i);
            } else {
                num = null;
            }
            Set keySet = linkedHashMap.keySet();
            keySet.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : keySet) {
                String str8 = (String) obj2;
                str8.getClass();
                if (a.d(str8)) {
                    arrayList2.add(obj2);
                }
            }
            List<String> d1 = gt0.d1(arrayList2, new zh2(28));
            if (num != null) {
                d1 = gt0.e1(d1, num.intValue());
            }
            ArrayList arrayList3 = new ArrayList();
            for (String str9 : d1) {
                vr4 vr4Var2 = (vr4) c14.j0(linkedHashMap, str9);
                String str10 = (String) vr4Var2.A;
                String str11 = (String) vr4Var2.B;
                if (qs6.v0(str10)) {
                    str10 = null;
                }
                if (str10 != null) {
                    str2 = d(str11, str10);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
            }
            list = arrayList3;
        }
        pu puVar2 = new pu(list);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        long j = 0;
        while (!puVar2.isEmpty()) {
            String str12 = (String) puVar2.removeFirst();
            if (linkedHashSet2.add(str12) && (str4 = (String) qn2Var.g(str12)) != null) {
                j += str4.length();
                for (String str13 : a(str4)) {
                    String d3 = d(str12, str13);
                    if (d3 != null) {
                        puVar2.addLast(d3);
                    }
                }
            }
        }
        return new ep5(list.size(), j);
    }
}
