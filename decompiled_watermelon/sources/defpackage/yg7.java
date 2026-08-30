package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yg7  reason: default package */
/* loaded from: classes.dex */
public abstract class yg7 {
    public static final wb2 a(sq5 sq5Var, boolean z, String[] strArr, mi2 mi2Var) {
        ti4 ti4Var;
        m53 g = sq5Var.g();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        sy6 sy6Var = g.b;
        sy6Var.getClass();
        m16 m16Var = new m16();
        int i = 0;
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = sy6Var.c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                m16Var.addAll(set);
            } else {
                m16Var.add(str);
            }
        }
        String[] strArr3 = (String[]) hi2.e(m16Var).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        while (true) {
            if (i < length) {
                String str2 = strArr3[i];
                LinkedHashMap linkedHashMap2 = sy6Var.f;
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                Integer num = (Integer) linkedHashMap2.get(lowerCase2);
                if (num != null) {
                    iArr[i] = num.intValue();
                    i++;
                } else {
                    i.i("There is no table with name ".concat(str2));
                    ti4Var = null;
                    break;
                }
            } else {
                ti4Var = new ti4(strArr3, iArr);
                break;
            }
        }
        String[] strArr4 = (String[]) ti4Var.A;
        int[] iArr2 = (int[]) ti4Var.B;
        strArr4.getClass();
        iArr2.getClass();
        return new wb2(se.j(new bz0(6, new qk5(sy6Var, iArr2, strArr4, (j11) null, 6)), -1), sq5Var, z, mi2Var);
    }

    public static boolean b(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }
}
