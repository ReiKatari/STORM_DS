package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbtu {
    private static final zbtu zbb = new zbtu(true);
    final zbwh zba = new zbwa();
    private boolean zbc;
    private boolean zbd;

    private zbtu(boolean z) {
        zbh();
        zbh();
    }

    public static int zba(zbww zbwwVar, int i, Object obj) {
        int zbd;
        int zbD;
        int zbD2 = zbtk.zbD(i << 3);
        if (zbwwVar == zbww.zbj) {
            zbuo.zbd((zbvm) obj);
            zbD2 += zbD2;
        }
        zbwx zbwxVar = zbwx.INT;
        int i2 = 4;
        switch (zbwwVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i2 = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                break;
            case 2:
                i2 = zbtk.zbE(((Long) obj).longValue());
                break;
            case 3:
                i2 = zbtk.zbE(((Long) obj).longValue());
                break;
            case 4:
                i2 = zbtk.zbE(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                i2 = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                break;
            case 7:
                ((Boolean) obj).getClass();
                i2 = 1;
                break;
            case 8:
                if (obj instanceof zbtc) {
                    zbd = ((zbtc) obj).zbd();
                    zbD = zbtk.zbD(zbd);
                    i2 = zbD + zbd;
                    break;
                } else {
                    i2 = zbtk.zbC((String) obj);
                    break;
                }
            case 9:
                i2 = ((zbvm) obj).zbo();
                break;
            case 10:
                if (obj instanceof zbuv) {
                    zbd = ((zbuv) obj).zba();
                    zbD = zbtk.zbD(zbd);
                    i2 = zbD + zbd;
                    break;
                } else {
                    i2 = zbtk.zbA((zbvm) obj);
                    break;
                }
            case 11:
                if (obj instanceof zbtc) {
                    zbd = ((zbtc) obj).zbd();
                    zbD = zbtk.zbD(zbd);
                } else {
                    zbd = ((byte[]) obj).length;
                    zbD = zbtk.zbD(zbd);
                }
                i2 = zbD + zbd;
                break;
            case 12:
                i2 = zbtk.zbD(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof zbuh) {
                    i2 = zbtk.zbE(((zbuh) obj).zba());
                    break;
                } else {
                    i2 = zbtk.zbE(((Integer) obj).intValue());
                    break;
                }
            case 14:
                ((Integer) obj).getClass();
                break;
            case 15:
                ((Long) obj).getClass();
                i2 = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i2 = zbtk.zbD((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i2 = zbtk.zbE((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                u34.j("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return zbD2 + i2;
    }

    public static int zbb(zbtt zbttVar, Object obj) {
        zbww zbd = zbttVar.zbd();
        zbttVar.zba();
        zbttVar.zbg();
        return zba(zbd, 32149011, obj);
    }

    public static zbtu zbe() {
        return zbb;
    }

    public static void zbk(zbtk zbtkVar, zbww zbwwVar, int i, Object obj) {
        if (zbwwVar != zbww.zbj) {
            zbtkVar.zbu(i, zbwwVar.zba());
            zbwx zbwxVar = zbwx.INT;
            switch (zbwwVar.ordinal()) {
                case 0:
                    zbtkVar.zbk(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    zbtkVar.zbi(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    zbtkVar.zby(((Long) obj).longValue());
                    return;
                case 3:
                    zbtkVar.zby(((Long) obj).longValue());
                    return;
                case 4:
                    zbtkVar.zbm(((Integer) obj).intValue());
                    return;
                case 5:
                    zbtkVar.zbk(((Long) obj).longValue());
                    return;
                case 6:
                    zbtkVar.zbi(((Integer) obj).intValue());
                    return;
                case 7:
                    zbtkVar.zbb(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof zbtc) {
                        zbtkVar.zbg((zbtc) obj);
                        return;
                    } else {
                        zbtkVar.zbt((String) obj);
                        return;
                    }
                case 9:
                    ((zbvm) obj).zbL(zbtkVar);
                    return;
                case 10:
                    zbtkVar.zbp((zbvm) obj);
                    return;
                case 11:
                    if (obj instanceof zbtc) {
                        zbtkVar.zbg((zbtc) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    zbtkVar.zbe(bArr, 0, bArr.length);
                    return;
                case 12:
                    zbtkVar.zbw(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof zbuh) {
                        zbtkVar.zbm(((zbuh) obj).zba());
                        return;
                    } else {
                        zbtkVar.zbm(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    zbtkVar.zbi(((Integer) obj).intValue());
                    return;
                case 15:
                    zbtkVar.zbk(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    zbtkVar.zbw((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    zbtkVar.zby((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        }
        zbvm zbvmVar = (zbvm) obj;
        zbuo.zbd(zbvmVar);
        zbtkVar.zbu(i, 3);
        zbvmVar.zbL(zbtkVar);
        zbtkVar.zbu(i, 4);
    }

    private static Object zbn(Object obj) {
        if (obj instanceof zbvr) {
            return ((zbvr) obj).zbc();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    private final void zbo(Map.Entry entry) {
        zbvm zbk;
        zbtt zbttVar = (zbtt) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zbuv;
        zbttVar.zbg();
        if (zbttVar.zbe() == zbwx.MESSAGE) {
            Object zbf = zbf(zbttVar);
            if (zbf == null) {
                this.zba.put(zbttVar, zbn(value));
                if (z) {
                    this.zbd = true;
                }
            } else if (!z) {
                if (zbf instanceof zbvr) {
                    zbk = zbttVar.zbc((zbvr) zbf, (zbvr) value);
                } else {
                    zbk = zbttVar.zbb(((zbvm) zbf).zbK(), (zbvm) value).zbk();
                }
                this.zba.put(zbttVar, zbk);
            } else {
                throw null;
            }
        } else if (!z) {
            this.zba.put(zbttVar, zbn(value));
        } else {
            i.m("Lazy fields must be message-valued");
        }
    }

    private static boolean zbp(Map.Entry entry) {
        zbtt zbttVar = (zbtt) entry.getKey();
        if (zbttVar.zbe() != zbwx.MESSAGE) {
            return true;
        }
        zbttVar.zbg();
        Object value = entry.getValue();
        if (value instanceof zbvn) {
            return ((zbvn) value).zbp();
        }
        if (value instanceof zbuv) {
            return true;
        }
        i.h("Wrong object type used with protocol message reflection.");
        return false;
    }

    private static final int zbq(Map.Entry entry) {
        zbtt zbttVar = (zbtt) entry.getKey();
        Object value = entry.getValue();
        if (zbttVar.zbe() == zbwx.MESSAGE) {
            zbttVar.zbg();
            zbttVar.zbf();
            if (value instanceof zbuv) {
                ((zbtt) entry.getKey()).zba();
                int zbD = zbtk.zbD(8);
                int zbD2 = zbtk.zbD(32149011) + zbtk.zbD(16);
                int zbD3 = zbtk.zbD(24);
                int zba = ((zbuv) value).zba();
                return zbD + zbD + zbD2 + xg6.b(zba, zba, zbD3);
            }
            ((zbtt) entry.getKey()).zba();
            int zbD4 = zbtk.zbD(8);
            int zbD5 = zbtk.zbD(32149011) + zbtk.zbD(16);
            return zbD4 + zbD4 + zbD5 + zbtk.zbA((zbvm) value) + zbtk.zbD(24);
        }
        return zbb(zbttVar, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbtu)) {
            return false;
        }
        return this.zba.equals(((zbtu) obj).zba);
    }

    public final int hashCode() {
        return this.zba.hashCode();
    }

    public final int zbc() {
        zbwh zbwhVar;
        int zbc = this.zba.zbc();
        int i = 0;
        int i2 = 0;
        while (true) {
            zbwhVar = this.zba;
            if (i >= zbc) {
                break;
            }
            i2 += zbq(zbwhVar.zbg(i));
            i++;
        }
        for (Map.Entry entry : zbwhVar.zbd()) {
            i2 += zbq(entry);
        }
        return i2;
    }

    /* renamed from: zbd */
    public final zbtu clone() {
        zbwh zbwhVar;
        zbtu zbtuVar = new zbtu();
        int zbc = this.zba.zbc();
        int i = 0;
        while (true) {
            zbwhVar = this.zba;
            if (i >= zbc) {
                break;
            }
            Map.Entry zbg = zbwhVar.zbg(i);
            zbtuVar.zbj((zbtt) ((zbwb) zbg).zba(), zbg.getValue());
            i++;
        }
        for (Map.Entry entry : zbwhVar.zbd()) {
            zbtuVar.zbj((zbtt) entry.getKey(), entry.getValue());
        }
        zbtuVar.zbd = this.zbd;
        return zbtuVar;
    }

    public final Object zbf(zbtt zbttVar) {
        Object obj = this.zba.get(zbttVar);
        if (!(obj instanceof zbuv)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zbg() {
        if (this.zba.isEmpty()) {
            return Collections.emptyIterator();
        }
        boolean z = this.zbd;
        zbwh zbwhVar = this.zba;
        if (z) {
            return new zbuu(zbwhVar.entrySet().iterator());
        }
        return zbwhVar.entrySet().iterator();
    }

    public final void zbh() {
        if (this.zbc) {
            return;
        }
        int zbc = this.zba.zbc();
        int i = 0;
        while (true) {
            zbwh zbwhVar = this.zba;
            if (i < zbc) {
                Map.Entry zbg = zbwhVar.zbg(i);
                if (zbg.getValue() instanceof zbuf) {
                    ((zbuf) zbg.getValue()).zbB();
                }
                i++;
            } else {
                zbwhVar.zba();
                this.zbc = true;
                return;
            }
        }
    }

    public final void zbi(zbtu zbtuVar) {
        zbwh zbwhVar;
        int zbc = zbtuVar.zba.zbc();
        int i = 0;
        while (true) {
            zbwhVar = zbtuVar.zba;
            if (i >= zbc) {
                break;
            }
            zbo(zbwhVar.zbg(i));
            i++;
        }
        for (Map.Entry entry : zbwhVar.zbd()) {
            zbo(entry);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuh) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if ((r4 instanceof byte[]) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuv) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zbj(zbtt zbttVar, Object obj) {
        boolean z;
        zbttVar.zbg();
        zbww zbd = zbttVar.zbd();
        byte[] bArr = zbuo.zbb;
        obj.getClass();
        zbww zbwwVar = zbww.zba;
        zbwx zbwxVar = zbwx.INT;
        switch (zbd.zbb().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if (!(obj instanceof zbtc)) {
                    break;
                }
                if (obj instanceof zbuv) {
                    this.zbd = true;
                }
                this.zba.put(zbttVar, obj);
                return;
            case 7:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof zbuv) {
                }
                this.zba.put(zbttVar, obj);
                return;
            case 8:
                if (!(obj instanceof zbvm)) {
                    break;
                }
                if (obj instanceof zbuv) {
                }
                this.zba.put(zbttVar, obj);
                return;
            default:
                zbttVar.zba();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 32149011, zbttVar.zbd().zbb(), obj.getClass().getName()));
        }
    }

    public final boolean zbl() {
        return this.zbc;
    }

    public final boolean zbm() {
        int zbc = this.zba.zbc();
        int i = 0;
        while (true) {
            zbwh zbwhVar = this.zba;
            if (i < zbc) {
                if (!zbp(zbwhVar.zbg(i))) {
                    return false;
                }
                i++;
            } else {
                for (Map.Entry entry : zbwhVar.zbd()) {
                    if (!zbp(entry)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    private zbtu() {
    }
}
