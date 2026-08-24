package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yv7  reason: default package */
/* loaded from: classes.dex */
public abstract class yv7 {
    public static final ng2 a(m16 m16Var, boolean z, String[] strArr, qn2 qn2Var) {
        vr4 vr4Var;
        zb3 g = m16Var.g();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        nc7 nc7Var = g.b;
        nc7Var.getClass();
        ad6 ad6Var = new ad6();
        int i = 0;
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = nc7Var.c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                ad6Var.addAll(set);
            } else {
                ad6Var.add(str);
            }
        }
        String[] strArr3 = (String[]) ii2.p(ad6Var).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        while (true) {
            if (i < length) {
                String str2 = strArr3[i];
                LinkedHashMap linkedHashMap2 = nc7Var.f;
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                Integer num = (Integer) linkedHashMap2.get(lowerCase2);
                if (num != null) {
                    iArr[i] = num.intValue();
                    i++;
                } else {
                    i.h("There is no table with name ".concat(str2));
                    vr4Var = null;
                    break;
                }
            } else {
                vr4Var = new vr4(strArr3, iArr);
                break;
            }
        }
        String[] strArr4 = (String[]) vr4Var.A;
        int[] iArr2 = (int[]) vr4Var.B;
        strArr4.getClass();
        iArr2.getClass();
        return new ng2(f04.o(new g21(new kp5(nc7Var, iArr2, strArr4, null, 8), 7), -1), m16Var, z, qn2Var);
    }

    public static boolean b(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }
}
