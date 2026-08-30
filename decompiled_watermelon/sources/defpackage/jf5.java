package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jf5  reason: default package */
/* loaded from: classes.dex */
public abstract class jf5 {
    public static final h85 a;
    public static final h85 b;
    public static final h85 c;
    public static final h85 d;
    public static final h85 e;
    public static final h85 f;
    public static final h85 g;
    public static final h85 h;

    static {
        i85 i85Var = i85.IGNORE_CASE;
        a = new h85("shader\\d+", i85Var);
        i85 i85Var2 = i85.MULTILINE;
        b = new h85("^\\s*#\\s*include\\s+\"([^\"]+)\"", hi2.X(i85Var2));
        c = new h85("^\\s*#\\s*reference\\s+\"?([^\"\\r\\n]+)\"?", hi2.X(i85Var2));
        d = new h85("sourcesize\\.(?:xy|x|y)\\s*[^;\\n]*outputsize\\.zw|outputsize\\.zw\\s*[^;\\n]*sourcesize\\.(?:xy|x|y)", i85Var);
        e = new h85("originalsize\\.(?:xy|x|y)\\s*[^;\\n]*outputsize\\.zw|outputsize\\.zw\\s*[^;\\n]*originalsize\\.(?:xy|x|y)", i85Var);
        f = new h85("outputsize\\.xy\\s*[^;\\n]*(?:sourcesize|originalsize)\\.zw|(?:sourcesize|originalsize)\\.zw\\s*[^;\\n]*outputsize\\.xy", i85Var);
        g = new h85("(?:fract|floor)\\s*\\([^;\\n]*sourcesize\\.xy|sourcesize\\.xy\\s*[^;\\n]*(?:fract|floor)", i85Var);
        h = new h85("(?:fract|floor|sin|modf)\\s*\\([^;\\n]*originalsize\\.xy|originalsize\\.xy\\s*[^;\\n]*(?:fract|floor|sin|modf)", i85Var);
    }

    public static List a(String str) {
        return d06.A0(new w72(d06.z0(h85.a(b, str), new vu4(21)), true, new vu4(22)));
    }

    public static LinkedHashMap b(String str) {
        String substring;
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt == '#') {
                int y0 = zg6.y0('\n', i2, 4, str);
                Integer valueOf = Integer.valueOf(y0);
                if (y0 < 0) {
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
                while (i3 < str.length() && iq2.v(str.charAt(i3))) {
                    i3++;
                }
                if (i3 < str.length() && str.charAt(i3) == '=') {
                    do {
                        i3++;
                        if (i3 >= str.length()) {
                            break;
                        }
                    } while (iq2.v(str.charAt(i3)));
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
                        while (i5 < str.length() && !iq2.v(str.charAt(i5)) && str.charAt(i5) != '#') {
                            i5++;
                        }
                        substring = str.substring(i3, i5);
                        i = i5;
                    }
                    String obj = zg6.Z0(substring).toString();
                    if (!zg6.B0(substring2)) {
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
        Integer o0;
        String str = (String) linkedHashMap.get("shaders");
        if (str != null && (o0 = gh6.o0(str)) != null) {
            int intValue = o0.intValue();
            if (intValue < 0) {
                return 0;
            }
            return intValue;
        }
        return e(linkedHashMap).size();
    }

    public static String d(String str, String str2) {
        int i;
        boolean z;
        str.getClass();
        str2.getClass();
        String replace = str2.replace('\\', '/');
        replace.getClass();
        String obj = zg6.Z0(replace).toString();
        char[] cArr = {'\"'};
        obj.getClass();
        int length = obj.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            char charAt = obj.charAt(i);
            int i3 = 0;
            while (true) {
                if (i3 < 1) {
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
        String obj2 = obj.subSequence(i2, length + 1).toString();
        if (!zg6.B0(obj2) && !zg6.R0(obj2, '/') && !zg6.q0(obj2, "://", false)) {
            xt xtVar = new xt();
            List P0 = zg6.P0(zg6.X0('/', str, ""), new char[]{'/'}, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : P0) {
                if (!zg6.B0((String) obj3)) {
                    arrayList.add(obj3);
                }
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj4 = arrayList.get(i4);
                i4++;
                xtVar.addLast((String) obj4);
            }
            for (String str3 : zg6.P0(obj2, new char[]{'/'}, 6)) {
                if (!zg6.B0(str3) && !str3.equals(".")) {
                    if (str3.equals("..")) {
                        if (!xtVar.isEmpty()) {
                            xtVar.removeLast();
                        } else {
                            return null;
                        }
                    } else {
                        xtVar.addLast(str3);
                    }
                }
            }
            return tq0.S0(xtVar, "/", null, null, null, 62);
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
        List<Map.Entry> g1 = tq0.g1(arrayList, new hd2(26));
        ArrayList arrayList2 = new ArrayList(uq0.y0(g1, 10));
        for (Map.Entry entry : g1) {
            arrayList2.add((String) entry.getValue());
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            if (!zg6.B0((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    public static List f(LinkedHashMap linkedHashMap) {
        String str = (String) linkedHashMap.get("textures");
        if (str != null) {
            int i = 0;
            List<String> P0 = zg6.P0(str, new char[]{';'}, 6);
            ArrayList arrayList = new ArrayList(uq0.y0(P0, 10));
            for (String str2 : P0) {
                arrayList.add(zg6.Z0(str2).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (!zg6.B0((String) obj)) {
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
                if (!zg6.B0((String) obj3)) {
                    arrayList4.add(obj3);
                }
            }
            return arrayList4;
        }
        return pp1.A;
    }

    public static if5 g(String str, mi2 mi2Var) {
        Integer num;
        List list;
        String str2;
        String str3;
        Integer o0;
        String str4;
        String str5;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        xt xtVar = new xt(l07.b0(str));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (!xtVar.isEmpty() && arrayList.size() < 16) {
            String str6 = (String) xtVar.removeFirst();
            if (linkedHashSet.add(str6) && (str5 = (String) mi2Var.n(str6)) != null) {
                arrayList.add(new hf5(str6, b(str5)));
                for (String str7 : d06.A0(new w72(d06.z0(h85.a(c, str5), new vu4(23)), true, new vu4(24)))) {
                    String d2 = d(str6, str7);
                    if (d2 != null) {
                        xtVar.addLast(d2);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            list = pp1.A;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                hf5 hf5Var = (hf5) obj;
                for (Map.Entry entry : hf5Var.b.entrySet()) {
                    linkedHashMap.putIfAbsent((String) entry.getKey(), new ti4((String) entry.getValue(), hf5Var.a));
                }
            }
            ti4 ti4Var = (ti4) linkedHashMap.get("shaders");
            if (ti4Var != null && (str3 = (String) ti4Var.A) != null && (o0 = gh6.o0(str3)) != null) {
                int intValue = o0.intValue();
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
            List<String> g1 = tq0.g1(arrayList2, new hd2(25));
            if (num != null) {
                g1 = tq0.h1(num.intValue(), g1);
            }
            ArrayList arrayList3 = new ArrayList();
            for (String str9 : g1) {
                ti4 ti4Var2 = (ti4) zt3.i0(str9, linkedHashMap);
                String str10 = (String) ti4Var2.A;
                String str11 = (String) ti4Var2.B;
                if (zg6.B0(str10)) {
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
        xt xtVar2 = new xt(list);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        long j = 0;
        while (!xtVar2.isEmpty()) {
            String str12 = (String) xtVar2.removeFirst();
            if (linkedHashSet2.add(str12) && (str4 = (String) mi2Var.n(str12)) != null) {
                j += str4.length();
                for (String str13 : a(str4)) {
                    String d3 = d(str12, str13);
                    if (d3 != null) {
                        xtVar2.addLast(d3);
                    }
                }
            }
        }
        return new if5(list.size(), j);
    }
}
