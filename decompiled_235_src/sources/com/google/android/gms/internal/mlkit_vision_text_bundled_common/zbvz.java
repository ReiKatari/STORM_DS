package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbvz {
    public static final /* synthetic */ int zba = 0;
    private static final zbwl zbb;

    static {
        int i = zbvu.zba;
        zbb = new zbwn();
    }

    public static void zbA(int i, List list, zbwy zbwyVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            zbwyVar.zbD(i, list, z);
        }
    }

    public static void zbB(int i, List list, zbwy zbwyVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            zbwyVar.zbF(i, list, z);
        }
    }

    public static void zbC(int i, List list, zbwy zbwyVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            zbwyVar.zbK(i, list, z);
        }
    }

    public static void zbD(int i, List list, zbwy zbwyVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            zbwyVar.zbM(i, list, z);
        }
    }

    public static boolean zbE(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int zba(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zbug) {
            zbug zbugVar = (zbug) list;
            int i2 = 0;
            while (i < size) {
                i2 += zbtk.zbE(zbugVar.zbe(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zbtk.zbE(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int zbb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zbtk.zbD(i << 3) + 4) * size;
    }

    public static int zbc(List list) {
        return list.size() * 4;
    }

    public static int zbd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zbtk.zbD(i << 3) + 8) * size;
    }

    public static int zbe(List list) {
        return list.size() * 8;
    }

    public static int zbf(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zbug) {
            zbug zbugVar = (zbug) list;
            int i2 = 0;
            while (i < size) {
                i2 += zbtk.zbE(zbugVar.zbe(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zbtk.zbE(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int zbg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zbva) {
            zbva zbvaVar = (zbva) list;
            int i2 = 0;
            while (i < size) {
                i2 += zbtk.zbE(zbvaVar.zbe(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zbtk.zbE(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static int zbh(int i, Object obj, zbvx zbvxVar) {
        int i2 = i << 3;
        if (obj instanceof zbuw) {
            int zbD = zbtk.zbD(i2);
            int zba2 = ((zbuw) obj).zba();
            return xg6.b(zba2, zba2, zbD);
        }
        return zbtk.zbB((zbvm) obj, zbvxVar) + zbtk.zbD(i2);
    }

    public static int zbi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zbug) {
            zbug zbugVar = (zbug) list;
            int i2 = 0;
            while (i < size) {
                int zbe = zbugVar.zbe(i);
                i2 += zbtk.zbD((zbe >> 31) ^ (zbe + zbe));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i3 += zbtk.zbD((intValue >> 31) ^ (intValue + intValue));
            i++;
        }
        return i3;
    }

    public static int zbj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zbva) {
            zbva zbvaVar = (zbva) list;
            int i2 = 0;
            while (i < size) {
                long zbe = zbvaVar.zbe(i);
                i2 += zbtk.zbE((zbe >> 63) ^ (zbe + zbe));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            long longValue = ((Long) list.get(i)).longValue();
            i3 += zbtk.zbE((longValue >> 63) ^ (longValue + longValue));
            i++;
        }
        return i3;
    }

    public static int zbk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zbug) {
            zbug zbugVar = (zbug) list;
            int i2 = 0;
            while (i < size) {
                i2 += zbtk.zbD(zbugVar.zbe(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zbtk.zbD(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int zbl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zbva) {
            zbva zbvaVar = (zbva) list;
            int i2 = 0;
            while (i < size) {
                i2 += zbtk.zbE(zbvaVar.zbe(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zbtk.zbE(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static zbwl zbm() {
        return zbb;
    }

    public static Object zbn(Object obj, int i, int i2, Object obj2, zbwl zbwlVar) {
        if (obj2 == null) {
            obj2 = zbwlVar.zba(obj);
        }
        ((zbwm) obj2).zbj(i << 3, Long.valueOf(i2));
        return obj2;
    }

    public static void zbo(zbtq zbtqVar, Object obj, Object obj2) {
        zbtu zbtuVar = ((zbub) obj2).zbb;
        if (!zbtuVar.zba.isEmpty()) {
            ((zbub) obj).zbg().zbi(zbtuVar);
        }
    }

    public static void zbp(zbwl zbwlVar, Object obj, Object obj2) {
        zbuf zbufVar = (zbuf) obj;
        zbwm zbwmVar = zbufVar.zbc;
        zbwm zbwmVar2 = ((zbuf) obj2).zbc;
        if (!zbwm.zbc().equals(zbwmVar2)) {
            if (zbwm.zbc().equals(zbwmVar)) {
                zbwmVar = zbwm.zbe(zbwmVar, zbwmVar2);
            } else {
                zbwmVar.zbd(zbwmVar2);
            }
        }
        zbufVar.zbc = zbwmVar;
    }

    public static void zbq(int i, List list, zbwy zbwyVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            zbwyVar.zbc(i, list, z);
        }
    }

    public static void zbr(int i, List list, zbwy zbwyVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            zbwyVar.zbg(i, list, z);
        }
    }

    public static void zbs(int i, List list, zbwy zbwyVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            zbwyVar.zbj(i, list, z);
        }
    }

    public static void zbt(int i, List list, zbwy zbwyVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            zbwyVar.zbl(i, list, z);
        }
    }

    public static void zbu(int i, List list, zbwy zbwyVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            zbwyVar.zbn(i, list, z);
        }
    }

    public static void zbv(int i, List list, zbwy zbwyVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            zbwyVar.zbp(i, list, z);
        }
    }

    public static void zbw(int i, List list, zbwy zbwyVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            zbwyVar.zbs(i, list, z);
        }
    }

    public static void zbx(int i, List list, zbwy zbwyVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            zbwyVar.zbu(i, list, z);
        }
    }

    public static void zby(int i, List list, zbwy zbwyVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            zbwyVar.zbz(i, list, z);
        }
    }

    public static void zbz(int i, List list, zbwy zbwyVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            zbwyVar.zbB(i, list, z);
        }
    }
}
