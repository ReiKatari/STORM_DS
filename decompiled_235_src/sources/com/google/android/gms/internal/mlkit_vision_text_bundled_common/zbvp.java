package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.mlkit.vision.common.InputImage;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbvp<T> implements zbvx<T> {
    private static final int[] zba = new int[0];
    private static final Unsafe zbb = zbws.zbg();
    private final int[] zbc;
    private final Object[] zbd;
    private final int zbe;
    private final int zbf;
    private final zbvm zbg;
    private final boolean zbh;
    private final int[] zbi;
    private final int zbj;
    private final int zbk;
    private final zbwl zbl;
    private final zbtq zbm;

    private zbvp(int[] iArr, Object[] objArr, int i, int i2, zbvm zbvmVar, boolean z, int[] iArr2, int i3, int i4, zbvs zbvsVar, zbuy zbuyVar, zbwl zbwlVar, zbtq zbtqVar, zbvh zbvhVar) {
        this.zbc = iArr;
        this.zbd = objArr;
        this.zbe = i;
        this.zbf = i2;
        boolean z2 = false;
        if (zbtqVar != null && (zbvmVar instanceof zbub)) {
            z2 = true;
        }
        this.zbh = z2;
        this.zbi = iArr2;
        this.zbj = i3;
        this.zbk = i4;
        this.zbl = zbwlVar;
        this.zbm = zbtqVar;
        this.zbg = zbvmVar;
    }

    private static void zbA(Object obj) {
        if (zbL(obj)) {
            return;
        }
        i.h("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zbB(Object obj, Object obj2, int i) {
        if (!zbI(obj2, i)) {
            return;
        }
        Unsafe unsafe = zbb;
        long zbs = zbs(i) & 1048575;
        Object object = unsafe.getObject(obj2, zbs);
        if (object != null) {
            zbvx zbv = zbv(i);
            if (!zbI(obj, i)) {
                if (!zbL(object)) {
                    unsafe.putObject(obj, zbs, object);
                } else {
                    Object zbe = zbv.zbe();
                    zbv.zbg(zbe, object);
                    unsafe.putObject(obj, zbs, zbe);
                }
                zbD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zbs);
            if (!zbL(object2)) {
                Object zbe2 = zbv.zbe();
                zbv.zbg(zbe2, object2);
                unsafe.putObject(obj, zbs, zbe2);
                object2 = zbe2;
            }
            zbv.zbg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zbc[i] + " is present but null: " + obj2.toString());
    }

    private final void zbC(Object obj, Object obj2, int i) {
        int i2 = this.zbc[i];
        if (!zbM(obj2, i2, i)) {
            return;
        }
        Unsafe unsafe = zbb;
        long zbs = zbs(i) & 1048575;
        Object object = unsafe.getObject(obj2, zbs);
        if (object != null) {
            zbvx zbv = zbv(i);
            if (!zbM(obj, i2, i)) {
                if (!zbL(object)) {
                    unsafe.putObject(obj, zbs, object);
                } else {
                    Object zbe = zbv.zbe();
                    zbv.zbg(zbe, object);
                    unsafe.putObject(obj, zbs, zbe);
                }
                zbE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zbs);
            if (!zbL(object2)) {
                Object zbe2 = zbv.zbe();
                zbv.zbg(zbe2, object2);
                unsafe.putObject(obj, zbs, zbe2);
                object2 = zbe2;
            }
            zbv.zbg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zbc[i] + " is present but null: " + obj2.toString());
    }

    private final void zbD(Object obj, int i) {
        int zbp = zbp(i);
        long j = 1048575 & zbp;
        if (j == 1048575) {
            return;
        }
        zbws.zbq(obj, j, (1 << (zbp >>> 20)) | zbws.zbc(obj, j));
    }

    private final void zbE(Object obj, int i, int i2) {
        zbws.zbq(obj, zbp(i2) & 1048575, i);
    }

    private final void zbF(Object obj, int i, Object obj2) {
        zbb.putObject(obj, zbs(i) & 1048575, obj2);
        zbD(obj, i);
    }

    private final void zbG(Object obj, int i, int i2, Object obj2) {
        zbb.putObject(obj, zbs(i2) & 1048575, obj2);
        zbE(obj, i, i2);
    }

    private final boolean zbH(Object obj, Object obj2, int i) {
        if (zbI(obj, i) == zbI(obj2, i)) {
            return true;
        }
        return false;
    }

    private final boolean zbI(Object obj, int i) {
        int zbp = zbp(i);
        long j = zbp & 1048575;
        if (j == 1048575) {
            int zbs = zbs(i);
            long j2 = zbs & 1048575;
            switch (zbr(zbs)) {
                case 0:
                    if (Double.doubleToRawLongBits(zbws.zba(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zbws.zbb(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zbws.zbd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zbws.zbd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zbws.zbc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zbws.zbd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zbws.zbc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zbws.zbw(obj, j2);
                case 8:
                    Object zbf = zbws.zbf(obj, j2);
                    if (zbf instanceof String) {
                        if (((String) zbf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zbf instanceof zbtc) {
                        if (zbtc.zbb.equals(zbf)) {
                            return false;
                        }
                        return true;
                    } else {
                        u34.t();
                        return false;
                    }
                case 9:
                    if (zbws.zbf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zbtc.zbb.equals(zbws.zbf(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zbws.zbc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zbws.zbc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zbws.zbc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zbws.zbd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zbws.zbc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zbws.zbd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zbws.zbf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    u34.t();
                    return false;
            }
        } else if (((1 << (zbp >>> 20)) & zbws.zbc(obj, j)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    private final boolean zbJ(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zbI(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zbK(Object obj, int i, zbvx zbvxVar) {
        return zbvxVar.zbk(zbws.zbf(obj, i & 1048575));
    }

    private static boolean zbL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zbuf) {
            return ((zbuf) obj).zbG();
        }
        return true;
    }

    private final boolean zbM(Object obj, int i, int i2) {
        if (zbws.zbc(obj, zbp(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean zbN(Object obj, long j) {
        return ((Boolean) zbws.zbf(obj, j)).booleanValue();
    }

    private static final int zbO(byte[] bArr, int i, int i2, zbww zbwwVar, Class cls, zbsq zbsqVar) {
        zbww zbwwVar2 = zbww.zba;
        boolean z = false;
        switch (zbwwVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                zbsqVar.zbc = Double.valueOf(Double.longBitsToDouble(zbsr.zbr(bArr, i)));
                return i3;
            case 1:
                int i4 = i + 4;
                zbsqVar.zbc = Float.valueOf(Float.intBitsToFloat(zbsr.zbc(bArr, i)));
                return i4;
            case 2:
            case 3:
                int zbn = zbsr.zbn(bArr, i, zbsqVar);
                zbsqVar.zbc = Long.valueOf(zbsqVar.zbb);
                return zbn;
            case 4:
            case 12:
            case 13:
                int zbk = zbsr.zbk(bArr, i, zbsqVar);
                zbsqVar.zbc = Integer.valueOf(zbsqVar.zba);
                return zbk;
            case 5:
            case 15:
                int i5 = i + 8;
                zbsqVar.zbc = Long.valueOf(zbsr.zbr(bArr, i));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                zbsqVar.zbc = Integer.valueOf(zbsr.zbc(bArr, i));
                return i6;
            case 7:
                int zbn2 = zbsr.zbn(bArr, i, zbsqVar);
                if (zbsqVar.zbb != 0) {
                    z = true;
                }
                zbsqVar.zbc = Boolean.valueOf(z);
                return zbn2;
            case 8:
                return zbsr.zbi(bArr, i, zbsqVar);
            case 9:
            default:
                u34.j("unsupported field type.");
                return 0;
            case 10:
                return zbsr.zbe(zbvu.zba().zbb(cls), bArr, i, i2, zbsqVar);
            case 11:
                return zbsr.zba(bArr, i, zbsqVar);
            case 16:
                int zbk2 = zbsr.zbk(bArr, i, zbsqVar);
                zbsqVar.zbc = Integer.valueOf(zbtg.zbb(zbsqVar.zba));
                return zbk2;
            case 17:
                int zbn3 = zbsr.zbn(bArr, i, zbsqVar);
                zbsqVar.zbc = Long.valueOf(zbtg.zbc(zbsqVar.zbb));
                return zbn3;
        }
    }

    private static final void zbP(int i, Object obj, zbwy zbwyVar) {
        if (obj instanceof String) {
            zbwyVar.zbH(i, (String) obj);
        } else {
            zbwyVar.zbd(i, (zbtc) obj);
        }
    }

    public static zbwm zbd(Object obj) {
        zbuf zbufVar = (zbuf) obj;
        zbwm zbwmVar = zbufVar.zbc;
        if (zbwmVar == zbwm.zbc()) {
            zbwm zbf = zbwm.zbf();
            zbufVar.zbc = zbf;
            return zbf;
        }
        return zbwmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zbvp zbl(Class cls, zbvj zbvjVar, zbvs zbvsVar, zbuy zbuyVar, zbwl zbwlVar, zbtq zbtqVar, zbvh zbvhVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String str;
        int objectFieldOffset;
        char c;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zbz;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field zbz2;
        Object obj2;
        Field zbz3;
        int i33;
        char charAt11;
        int i34;
        char charAt12;
        int i35;
        char charAt13;
        int i36;
        char charAt14;
        if (zbvjVar instanceof zbvw) {
            zbvw zbvwVar = (zbvw) zbvjVar;
            String zbd = zbvwVar.zbd();
            int length = zbd.length();
            char c2 = 55296;
            if (zbd.charAt(0) >= 55296) {
                int i37 = 1;
                while (true) {
                    i = i37 + 1;
                    if (zbd.charAt(i37) < 55296) {
                        break;
                    }
                    i37 = i;
                }
            } else {
                i = 1;
            }
            int i38 = i + 1;
            int charAt15 = zbd.charAt(i);
            if (charAt15 >= 55296) {
                int i39 = charAt15 & 8191;
                int i40 = 13;
                while (true) {
                    i36 = i38 + 1;
                    charAt14 = zbd.charAt(i38);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i39 |= (charAt14 & 8191) << i40;
                    i40 += 13;
                    i38 = i36;
                }
                charAt15 = i39 | (charAt14 << i40);
                i38 = i36;
            }
            if (charAt15 == 0) {
                i3 = 0;
                i6 = 0;
                charAt = 0;
                i2 = 0;
                i4 = 0;
                i5 = 0;
                iArr = zba;
                i7 = 0;
            } else {
                int i41 = i38 + 1;
                int charAt16 = zbd.charAt(i38);
                if (charAt16 >= 55296) {
                    int i42 = charAt16 & 8191;
                    int i43 = 13;
                    while (true) {
                        i15 = i41 + 1;
                        charAt9 = zbd.charAt(i41);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i42 |= (charAt9 & 8191) << i43;
                        i43 += 13;
                        i41 = i15;
                    }
                    charAt16 = i42 | (charAt9 << i43);
                    i41 = i15;
                }
                int i44 = i41 + 1;
                int charAt17 = zbd.charAt(i41);
                if (charAt17 >= 55296) {
                    int i45 = charAt17 & 8191;
                    int i46 = 13;
                    while (true) {
                        i14 = i44 + 1;
                        charAt8 = zbd.charAt(i44);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i45 |= (charAt8 & 8191) << i46;
                        i46 += 13;
                        i44 = i14;
                    }
                    charAt17 = i45 | (charAt8 << i46);
                    i44 = i14;
                }
                int i47 = i44 + 1;
                int charAt18 = zbd.charAt(i44);
                if (charAt18 >= 55296) {
                    int i48 = charAt18 & 8191;
                    int i49 = 13;
                    while (true) {
                        i13 = i47 + 1;
                        charAt7 = zbd.charAt(i47);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i48 |= (charAt7 & 8191) << i49;
                        i49 += 13;
                        i47 = i13;
                    }
                    charAt18 = i48 | (charAt7 << i49);
                    i47 = i13;
                }
                int i50 = i47 + 1;
                int charAt19 = zbd.charAt(i47);
                if (charAt19 >= 55296) {
                    int i51 = charAt19 & 8191;
                    int i52 = 13;
                    while (true) {
                        i12 = i50 + 1;
                        charAt6 = zbd.charAt(i50);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i51 |= (charAt6 & 8191) << i52;
                        i52 += 13;
                        i50 = i12;
                    }
                    charAt19 = i51 | (charAt6 << i52);
                    i50 = i12;
                }
                int i53 = i50 + 1;
                charAt = zbd.charAt(i50);
                if (charAt >= 55296) {
                    int i54 = charAt & 8191;
                    int i55 = 13;
                    while (true) {
                        i11 = i53 + 1;
                        charAt5 = zbd.charAt(i53);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i54 |= (charAt5 & 8191) << i55;
                        i55 += 13;
                        i53 = i11;
                    }
                    charAt = i54 | (charAt5 << i55);
                    i53 = i11;
                }
                int i56 = i53 + 1;
                int charAt20 = zbd.charAt(i53);
                if (charAt20 >= 55296) {
                    int i57 = charAt20 & 8191;
                    int i58 = 13;
                    while (true) {
                        i10 = i56 + 1;
                        charAt4 = zbd.charAt(i56);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i57 |= (charAt4 & 8191) << i58;
                        i58 += 13;
                        i56 = i10;
                    }
                    charAt20 = i57 | (charAt4 << i58);
                    i56 = i10;
                }
                int i59 = i56 + 1;
                int charAt21 = zbd.charAt(i56);
                if (charAt21 >= 55296) {
                    int i60 = charAt21 & 8191;
                    int i61 = 13;
                    while (true) {
                        i9 = i59 + 1;
                        charAt3 = zbd.charAt(i59);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i60 |= (charAt3 & 8191) << i61;
                        i61 += 13;
                        i59 = i9;
                    }
                    charAt21 = i60 | (charAt3 << i61);
                    i59 = i9;
                }
                int i62 = i59 + 1;
                int charAt22 = zbd.charAt(i59);
                if (charAt22 >= 55296) {
                    int i63 = charAt22 & 8191;
                    int i64 = 13;
                    while (true) {
                        i8 = i62 + 1;
                        charAt2 = zbd.charAt(i62);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i63 |= (charAt2 & 8191) << i64;
                        i64 += 13;
                        i62 = i8;
                    }
                    charAt22 = i63 | (charAt2 << i64);
                    i62 = i8;
                }
                int i65 = charAt16 + charAt16 + charAt17;
                int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
                int i66 = charAt20;
                i2 = charAt18;
                i3 = i66;
                i4 = charAt19;
                i5 = charAt22;
                i6 = i65;
                iArr = iArr2;
                i7 = charAt16;
                i38 = i62;
            }
            Unsafe unsafe = zbb;
            Object[] zbe = zbvwVar.zbe();
            Class<?> cls2 = zbvwVar.zba().getClass();
            int i67 = i5 + i3;
            int i68 = charAt + charAt;
            int[] iArr3 = new int[charAt * 3];
            Object[] objArr = new Object[i68];
            int i69 = i5;
            int i70 = i67;
            int i71 = 0;
            int i72 = 0;
            while (i38 < length) {
                int i73 = i38 + 1;
                int charAt23 = zbd.charAt(i38);
                if (charAt23 >= c2) {
                    int i74 = charAt23 & 8191;
                    int i75 = i73;
                    int i76 = 13;
                    while (true) {
                        i35 = i75 + 1;
                        charAt13 = zbd.charAt(i75);
                        if (charAt13 < c2) {
                            break;
                        }
                        i74 |= (charAt13 & 8191) << i76;
                        i76 += 13;
                        i75 = i35;
                    }
                    charAt23 = i74 | (charAt13 << i76);
                    i16 = i35;
                } else {
                    i16 = i73;
                }
                int i77 = i16 + 1;
                int charAt24 = zbd.charAt(i16);
                if (charAt24 >= c2) {
                    int i78 = charAt24 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i34 = i79 + 1;
                        charAt12 = zbd.charAt(i79);
                        if (charAt12 < c2) {
                            break;
                        }
                        i78 |= (charAt12 & 8191) << i80;
                        i80 += 13;
                        i79 = i34;
                    }
                    charAt24 = i78 | (charAt12 << i80);
                    i17 = i34;
                } else {
                    i17 = i77;
                }
                if ((charAt24 & 1024) != 0) {
                    iArr[i71] = i72;
                    i71++;
                }
                int i81 = charAt24 & 255;
                zbvw zbvwVar2 = zbvwVar;
                int i82 = charAt24 & 2048;
                if (i81 >= 51) {
                    int i83 = i17 + 1;
                    int charAt25 = zbd.charAt(i17);
                    char c3 = 55296;
                    if (charAt25 >= 55296) {
                        int i84 = charAt25 & 8191;
                        int i85 = i83;
                        int i86 = 13;
                        while (true) {
                            i33 = i85 + 1;
                            charAt11 = zbd.charAt(i85);
                            if (charAt11 < c3) {
                                break;
                            }
                            i84 |= (charAt11 & 8191) << i86;
                            i86 += 13;
                            i85 = i33;
                            c3 = 55296;
                        }
                        charAt25 = i84 | (charAt11 << i86);
                        i30 = i33;
                    } else {
                        i30 = i83;
                    }
                    int i87 = i30;
                    int i88 = i81 - 51;
                    i18 = length;
                    if (i88 != 9 && i88 != 17) {
                        if (i88 == 12) {
                            if (zbvwVar2.zbc() != 1 && i82 == 0) {
                                i32 = 0;
                                int i89 = charAt25 + charAt25;
                                obj = zbe[i89];
                                int i90 = i32;
                                if (obj instanceof Field) {
                                    zbz2 = (Field) obj;
                                } else {
                                    zbz2 = zbz(cls2, (String) obj);
                                    zbe[i89] = zbz2;
                                }
                                int i91 = i7;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(zbz2);
                                int i92 = i89 + 1;
                                obj2 = zbe[i92];
                                i19 = i91;
                                if (obj2 instanceof Field) {
                                    zbz3 = (Field) obj2;
                                } else {
                                    zbz3 = zbz(cls2, (String) obj2);
                                    zbe[i92] = zbz3;
                                }
                                i21 = (int) unsafe.objectFieldOffset(zbz3);
                                str = zbd;
                                i23 = i90;
                                i17 = i87;
                                i22 = 0;
                                c = 55296;
                            } else {
                                i31 = i6 + 1;
                                int i93 = i72 / 3;
                                objArr[i93 + i93 + 1] = zbe[i6];
                            }
                        }
                        i32 = i82;
                        int i892 = charAt25 + charAt25;
                        obj = zbe[i892];
                        int i902 = i32;
                        if (obj instanceof Field) {
                        }
                        int i912 = i7;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zbz2);
                        int i922 = i892 + 1;
                        obj2 = zbe[i922];
                        i19 = i912;
                        if (obj2 instanceof Field) {
                        }
                        i21 = (int) unsafe.objectFieldOffset(zbz3);
                        str = zbd;
                        i23 = i902;
                        i17 = i87;
                        i22 = 0;
                        c = 55296;
                    } else {
                        i31 = i6 + 1;
                        int i94 = i72 / 3;
                        objArr[i94 + i94 + 1] = zbe[i6];
                    }
                    i6 = i31;
                    i32 = i82;
                    int i8922 = charAt25 + charAt25;
                    obj = zbe[i8922];
                    int i9022 = i32;
                    if (obj instanceof Field) {
                    }
                    int i9122 = i7;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zbz2);
                    int i9222 = i8922 + 1;
                    obj2 = zbe[i9222];
                    i19 = i9122;
                    if (obj2 instanceof Field) {
                    }
                    i21 = (int) unsafe.objectFieldOffset(zbz3);
                    str = zbd;
                    i23 = i9022;
                    i17 = i87;
                    i22 = 0;
                    c = 55296;
                } else {
                    i18 = length;
                    i19 = i7;
                    int i95 = i6 + 1;
                    Field zbz4 = zbz(cls2, (String) zbe[i6]);
                    if (i81 == 9 || i81 == 17) {
                        i20 = i95;
                        int i96 = i72 / 3;
                        objArr[i96 + i96 + 1] = zbz4.getType();
                    } else {
                        if (i81 != 27) {
                            if (i81 == 49) {
                                i6 += 2;
                                i25 = i95;
                                i26 = 1;
                            } else if (i81 != 12 && i81 != 30 && i81 != 44) {
                                if (i81 == 50) {
                                    int i97 = i6 + 2;
                                    int i98 = i69 + 1;
                                    iArr[i69] = i72;
                                    int i99 = i72 / 3;
                                    int i100 = i99 + i99;
                                    objArr[i100] = zbe[i95];
                                    if (i82 != 0) {
                                        objArr[i100 + 1] = zbe[i97];
                                        i6 += 3;
                                        str = zbd;
                                        i69 = i98;
                                        objectFieldOffset = (int) unsafe.objectFieldOffset(zbz4);
                                        if ((charAt24 & 4096) == 0) {
                                        }
                                        c = 55296;
                                        i21 = 1048575;
                                        i22 = 0;
                                        if (i81 >= 18) {
                                        }
                                        i23 = i82;
                                    } else {
                                        i6 = i97;
                                        i69 = i98;
                                        i82 = 0;
                                        str = zbd;
                                        objectFieldOffset = (int) unsafe.objectFieldOffset(zbz4);
                                        if ((charAt24 & 4096) == 0) {
                                        }
                                        c = 55296;
                                        i21 = 1048575;
                                        i22 = 0;
                                        if (i81 >= 18) {
                                        }
                                        i23 = i82;
                                    }
                                } else {
                                    i20 = i95;
                                }
                            } else if (zbvwVar2.zbc() != 1 && i82 == 0) {
                                str = zbd;
                                i6 = i95;
                                i82 = 0;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(zbz4);
                                if ((charAt24 & 4096) == 0) {
                                }
                                c = 55296;
                                i21 = 1048575;
                                i22 = 0;
                                if (i81 >= 18) {
                                    iArr[i70] = objectFieldOffset;
                                    i70++;
                                }
                                i23 = i82;
                            } else {
                                i6 += 2;
                                int i101 = i72 / 3;
                                objArr[i101 + i101 + 1] = zbe[i95];
                                str = zbd;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(zbz4);
                                if ((charAt24 & 4096) == 0 && i81 <= 17) {
                                    int i102 = i17 + 1;
                                    int charAt26 = str.charAt(i17);
                                    if (charAt26 >= 55296) {
                                        int i103 = charAt26 & 8191;
                                        int i104 = 13;
                                        while (true) {
                                            i24 = i102 + 1;
                                            charAt10 = str.charAt(i102);
                                            if (charAt10 < 55296) {
                                                break;
                                            }
                                            i103 |= (charAt10 & 8191) << i104;
                                            i104 += 13;
                                            i102 = i24;
                                        }
                                        charAt26 = i103 | (charAt10 << i104);
                                    } else {
                                        i24 = i102;
                                    }
                                    int i105 = (charAt26 / 32) + i19 + i19;
                                    Object obj3 = zbe[i105];
                                    if (obj3 instanceof Field) {
                                        zbz = (Field) obj3;
                                    } else {
                                        zbz = zbz(cls2, (String) obj3);
                                        zbe[i105] = zbz;
                                    }
                                    i22 = charAt26 % 32;
                                    i17 = i24;
                                    c = 55296;
                                    i21 = (int) unsafe.objectFieldOffset(zbz);
                                } else {
                                    c = 55296;
                                    i21 = 1048575;
                                    i22 = 0;
                                }
                                if (i81 >= 18 && i81 <= 49) {
                                    iArr[i70] = objectFieldOffset;
                                    i70++;
                                }
                                i23 = i82;
                            }
                        } else {
                            i25 = i95;
                            i26 = 1;
                            i6 += 2;
                        }
                        int i106 = i72 / 3;
                        objArr[i106 + i106 + i26] = zbe[i25];
                        str = zbd;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zbz4);
                        if ((charAt24 & 4096) == 0) {
                        }
                        c = 55296;
                        i21 = 1048575;
                        i22 = 0;
                        if (i81 >= 18) {
                        }
                        i23 = i82;
                    }
                    str = zbd;
                    i6 = i20;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zbz4);
                    if ((charAt24 & 4096) == 0) {
                    }
                    c = 55296;
                    i21 = 1048575;
                    i22 = 0;
                    if (i81 >= 18) {
                    }
                    i23 = i82;
                }
                int i107 = i72 + 1;
                iArr3[i72] = charAt23;
                int i108 = i72 + 2;
                int i109 = i23;
                if ((charAt24 & 512) != 0) {
                    i27 = 536870912;
                } else {
                    i27 = 0;
                }
                if ((charAt24 & 256) != 0) {
                    i28 = 268435456;
                } else {
                    i28 = 0;
                }
                if (i109 != 0) {
                    i29 = Integer.MIN_VALUE;
                } else {
                    i29 = 0;
                }
                iArr3[i107] = i27 | i28 | i29 | (i81 << 20) | objectFieldOffset;
                i72 += 3;
                iArr3[i108] = (i22 << 20) | i21;
                i38 = i17;
                zbd = str;
                c2 = c;
                zbvwVar = zbvwVar2;
                length = i18;
                i7 = i19;
            }
            return new zbvp(iArr3, objArr, i2, i4, zbvwVar.zba(), false, iArr, i5, i67, zbvsVar, zbuyVar, zbwlVar, zbtqVar, zbvhVar);
        }
        zbwi zbwiVar = (zbwi) zbvjVar;
        throw null;
    }

    private static double zbm(Object obj, long j) {
        return ((Double) zbws.zbf(obj, j)).doubleValue();
    }

    private static float zbn(Object obj, long j) {
        return ((Float) zbws.zbf(obj, j)).floatValue();
    }

    private static int zbo(Object obj, long j) {
        return ((Integer) zbws.zbf(obj, j)).intValue();
    }

    private final int zbp(int i) {
        return this.zbc[i + 2];
    }

    private final int zbq(int i, int i2) {
        int length = (this.zbc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zbc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zbr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zbs(int i) {
        return this.zbc[i + 1];
    }

    private static long zbt(Object obj, long j) {
        return ((Long) zbws.zbf(obj, j)).longValue();
    }

    private final zbuj zbu(int i) {
        int i2 = i / 3;
        return (zbuj) this.zbd[i2 + i2 + 1];
    }

    private final zbvx zbv(int i) {
        Object[] objArr = this.zbd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zbvx zbvxVar = (zbvx) objArr[i3];
        if (zbvxVar != null) {
            return zbvxVar;
        }
        zbvx zbb2 = zbvu.zba().zbb((Class) objArr[i3 + 1]);
        this.zbd[i3] = zbb2;
        return zbb2;
    }

    private final Object zbw(int i) {
        int i2 = i / 3;
        return this.zbd[i2 + i2];
    }

    private final Object zbx(Object obj, int i) {
        zbvx zbv = zbv(i);
        int zbs = zbs(i) & 1048575;
        if (!zbI(obj, i)) {
            return zbv.zbe();
        }
        Object object = zbb.getObject(obj, zbs);
        if (zbL(object)) {
            return object;
        }
        Object zbe = zbv.zbe();
        if (object != null) {
            zbv.zbg(zbe, object);
        }
        return zbe;
    }

    private final Object zby(Object obj, int i, int i2) {
        zbvx zbv = zbv(i2);
        if (!zbM(obj, i, i2)) {
            return zbv.zbe();
        }
        Object object = zbb.getObject(obj, zbs(i2) & 1048575);
        if (zbL(object)) {
            return object;
        }
        Object zbe = zbv.zbe();
        if (object != null) {
            zbv.zbg(zbe, object);
        }
        return zbe;
    }

    private static Field zbz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder u = i61.u("Field ", str, " for ", name, " not found. Known fields are ");
            u.append(arrays);
            throw new RuntimeException(u.toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zba(Object obj) {
        int i;
        int zbD;
        int zbE;
        int zbD2;
        int zbd;
        int zbD3;
        int zbh;
        int zbD4;
        int size;
        int zbl;
        int zbD5;
        int zbd2;
        boolean z;
        int zbb2;
        int i2;
        int zbD6;
        int zbD7;
        int size2;
        int zbk;
        int zbD8;
        int size3;
        int zbi;
        int zbD9;
        int i3;
        int zbe;
        int zbD10;
        int zbD11;
        int zbD12;
        int zbE2;
        zbvp<T> zbvpVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zbb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < zbvpVar.zbc.length) {
            int zbs = zbvpVar.zbs(i6);
            int zbr = zbr(zbs);
            int[] iArr = zbvpVar.zbc;
            int i9 = iArr[i6];
            int i10 = iArr[i6 + 2];
            int i11 = i10 & i4;
            if (zbr <= 17) {
                if (i11 != i5) {
                    if (i11 == i4) {
                        i7 = 0;
                    } else {
                        i7 = unsafe.getInt(obj2, i11);
                    }
                    i5 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = zbs & i4;
            if (zbr >= zbtv.zbJ.zba()) {
                zbtv.zbW.zba();
            }
            long j = i12;
            switch (zbr) {
                case 0:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        i8 = xg6.b(i9 << 3, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        i8 = xg6.b(i9 << 3, 4, i8);
                    }
                    zbvpVar = this;
                    break;
                case 2:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zbD = zbtk.zbD(i9 << 3);
                        zbE = zbtk.zbE(j2);
                        i8 += zbE + zbD;
                    }
                    zbvpVar = this;
                    break;
                case 3:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zbD = zbtk.zbD(i9 << 3);
                        zbE = zbtk.zbE(j3);
                        i8 += zbE + zbD;
                    }
                    zbvpVar = this;
                    break;
                case 4:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        zbD = zbtk.zbD(i9 << 3);
                        zbE = zbtk.zbE(unsafe.getInt(obj2, j));
                        i8 += zbE + zbD;
                    }
                    zbvpVar = this;
                    break;
                case 5:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        i8 = xg6.b(i9 << 3, 8, i8);
                    }
                    zbvpVar = this;
                    break;
                case 6:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        i8 = xg6.b(i9 << 3, 4, i8);
                    }
                    zbvpVar = this;
                    break;
                case 7:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        i8 = xg6.b(i9 << 3, 1, i8);
                    }
                    zbvpVar = this;
                    break;
                case 8:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zbtc) {
                            zbD2 = zbtk.zbD(i13);
                            zbd = ((zbtc) object).zbd();
                            zbD3 = zbtk.zbD(zbd);
                            i8 += zbD3 + zbd + zbD2;
                        } else {
                            zbD = zbtk.zbD(i13);
                            zbE = zbtk.zbC((String) object);
                            i8 += zbE + zbD;
                        }
                    }
                    zbvpVar = this;
                    break;
                case 9:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        zbh = zbvz.zbh(i9, unsafe.getObject(obj2, j), zbvpVar.zbv(i6));
                        i8 += zbh;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        zbD2 = zbtk.zbD(i9 << 3);
                        zbd = ((zbtc) unsafe.getObject(obj2, j)).zbd();
                        zbD3 = zbtk.zbD(zbd);
                        i8 += zbD3 + zbd + zbD2;
                    }
                    zbvpVar = this;
                    break;
                case 11:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        i8 = xg6.b(unsafe.getInt(obj2, j), zbtk.zbD(i9 << 3), i8);
                    }
                    zbvpVar = this;
                    break;
                case 12:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        zbD = zbtk.zbD(i9 << 3);
                        zbE = zbtk.zbE(unsafe.getInt(obj2, j));
                        i8 += zbE + zbD;
                    }
                    zbvpVar = this;
                    break;
                case 13:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        i8 = xg6.b(i9 << 3, 4, i8);
                    }
                    zbvpVar = this;
                    break;
                case 14:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        i8 = xg6.b(i9 << 3, 8, i8);
                    }
                    zbvpVar = this;
                    break;
                case 15:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        int i14 = unsafe.getInt(obj2, j);
                        i8 = xg6.b((i14 >> 31) ^ (i14 + i14), zbtk.zbD(i9 << 3), i8);
                    }
                    zbvpVar = this;
                    break;
                case 16:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        long j4 = unsafe.getLong(obj2, j);
                        zbD = zbtk.zbD(i9 << 3);
                        zbE = zbtk.zbE((j4 >> 63) ^ (j4 + j4));
                        i8 += zbE + zbD;
                    }
                    zbvpVar = this;
                    break;
                case 17:
                    if (zbvpVar.zbJ(obj2, i6, i5, i7, i)) {
                        i8 += zbtk.zbz(i9, (zbvm) unsafe.getObject(obj2, j), zbvpVar.zbv(i6));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zbh = zbvz.zbd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zbh;
                    break;
                case 19:
                    zbh = zbvz.zbb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zbh;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i15 = zbvz.zba;
                    if (list.size() != 0) {
                        zbD4 = (zbtk.zbD(i9 << 3) * list.size()) + zbvz.zbg(list);
                        i8 += zbD4;
                        break;
                    }
                    zbD4 = 0;
                    i8 += zbD4;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i16 = zbvz.zba;
                    size = list2.size();
                    if (size != 0) {
                        zbl = zbvz.zbl(list2);
                        zbD5 = zbtk.zbD(i9 << 3);
                        zbD4 = (zbD5 * size) + zbl;
                        i8 += zbD4;
                        break;
                    }
                    zbD4 = 0;
                    i8 += zbD4;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i17 = zbvz.zba;
                    size = list3.size();
                    if (size != 0) {
                        zbl = zbvz.zbf(list3);
                        zbD5 = zbtk.zbD(i9 << 3);
                        zbD4 = (zbD5 * size) + zbl;
                        i8 += zbD4;
                        break;
                    }
                    zbD4 = 0;
                    i8 += zbD4;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zbd2 = zbvz.zbd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zbd2;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    z = false;
                    zbb2 = zbvz.zbb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zbb2;
                    break;
                case 25:
                    int i18 = zbvz.zba;
                    int size4 = ((List) unsafe.getObject(obj2, j)).size();
                    if (size4 != 0) {
                        zbd2 = size4 * (zbtk.zbD(i9 << 3) + 1);
                        i8 += zbd2;
                        break;
                    }
                    zbd2 = 0;
                    i8 += zbd2;
                case SubAllocator.N4 /* 26 */:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i19 = zbvz.zba;
                    int size5 = list4.size();
                    if (size5 == 0) {
                        i2 = 0;
                    } else {
                        int zbD13 = zbtk.zbD(i9 << 3) * size5;
                        if (list4 instanceof zbux) {
                            zbux zbuxVar = (zbux) list4;
                            i2 = zbD13;
                            for (int i20 = 0; i20 < size5; i20++) {
                                Object zba2 = zbuxVar.zba();
                                if (zba2 instanceof zbtc) {
                                    int zbd3 = ((zbtc) zba2).zbd();
                                    i2 = xg6.b(zbd3, zbd3, i2);
                                } else {
                                    i2 = zbtk.zbC((String) zba2) + i2;
                                }
                            }
                        } else {
                            i2 = zbD13;
                            for (int i21 = 0; i21 < size5; i21++) {
                                Object obj3 = list4.get(i21);
                                if (obj3 instanceof zbtc) {
                                    int zbd4 = ((zbtc) obj3).zbd();
                                    i2 = xg6.b(zbd4, zbd4, i2);
                                } else {
                                    i2 = zbtk.zbC((String) obj3) + i2;
                                }
                            }
                        }
                    }
                    i8 += i2;
                    break;
                case 27:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    zbvx zbv = zbvpVar.zbv(i6);
                    int i22 = zbvz.zba;
                    int size6 = list5.size();
                    if (size6 == 0) {
                        zbD6 = 0;
                    } else {
                        zbD6 = zbtk.zbD(i9 << 3) * size6;
                        for (int i23 = 0; i23 < size6; i23++) {
                            Object obj4 = list5.get(i23);
                            if (obj4 instanceof zbuw) {
                                int zba3 = ((zbuw) obj4).zba();
                                zbD6 = xg6.b(zba3, zba3, zbD6);
                            } else {
                                zbD6 = zbtk.zbB((zbvm) obj4, zbv) + zbD6;
                            }
                        }
                    }
                    i8 += zbD6;
                    break;
                case 28:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    int i24 = zbvz.zba;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        zbD7 = 0;
                    } else {
                        zbD7 = zbtk.zbD(i9 << 3) * size7;
                        for (int i25 = 0; i25 < list6.size(); i25++) {
                            int zbd5 = ((zbtc) list6.get(i25)).zbd();
                            zbD7 = xg6.b(zbd5, zbd5, zbD7);
                        }
                    }
                    i8 += zbD7;
                    break;
                case 29:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i26 = zbvz.zba;
                    size2 = list7.size();
                    if (size2 != 0) {
                        zbk = zbvz.zbk(list7);
                        zbD8 = zbtk.zbD(i9 << 3);
                        zbd2 = zbk + (zbD8 * size2);
                        i8 += zbd2;
                        break;
                    }
                    zbd2 = 0;
                    i8 += zbd2;
                case 30:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i27 = zbvz.zba;
                    size2 = list8.size();
                    if (size2 != 0) {
                        zbk = zbvz.zba(list8);
                        zbD8 = zbtk.zbD(i9 << 3);
                        zbd2 = zbk + (zbD8 * size2);
                        i8 += zbd2;
                        break;
                    }
                    zbd2 = 0;
                    i8 += zbd2;
                case 31:
                    zbd2 = zbvz.zbb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zbd2;
                    break;
                case 32:
                    z = false;
                    zbb2 = zbvz.zbd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zbb2;
                    break;
                case 33:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i28 = zbvz.zba;
                    size3 = list9.size();
                    if (size3 != 0) {
                        zbi = zbvz.zbi(list9);
                        zbD9 = zbtk.zbD(i9 << 3);
                        i3 = (zbD9 * size3) + zbi;
                        i8 += i3;
                        break;
                    }
                    i3 = 0;
                    i8 += i3;
                case 34:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i29 = zbvz.zba;
                    size3 = list10.size();
                    if (size3 != 0) {
                        zbi = zbvz.zbj(list10);
                        zbD9 = zbtk.zbD(i9 << 3);
                        i3 = (zbD9 * size3) + zbi;
                        i8 += i3;
                        break;
                    }
                    i3 = 0;
                    i8 += i3;
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                    zbe = zbvz.zbe((List) unsafe.getObject(obj2, j));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i9 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 36:
                    zbe = zbvz.zbc((List) unsafe.getObject(obj2, j));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i9 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 37:
                    zbe = zbvz.zbg((List) unsafe.getObject(obj2, j));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i9 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case SubAllocator.N_INDEXES /* 38 */:
                    zbe = zbvz.zbl((List) unsafe.getObject(obj2, j));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i9 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 39:
                    zbe = zbvz.zbf((List) unsafe.getObject(obj2, j));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i9 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 40:
                    zbe = zbvz.zbe((List) unsafe.getObject(obj2, j));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i9 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 41:
                    zbe = zbvz.zbc((List) unsafe.getObject(obj2, j));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i9 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 42:
                    int i30 = zbvz.zba;
                    zbe = ((List) unsafe.getObject(obj2, j)).size();
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i9 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 43:
                    zbe = zbvz.zbk((List) unsafe.getObject(obj2, j));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i9 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 44:
                    zbe = zbvz.zba((List) unsafe.getObject(obj2, j));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i9 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 45:
                    zbe = zbvz.zbc((List) unsafe.getObject(obj2, j));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i9 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 46:
                    zbe = zbvz.zbe((List) unsafe.getObject(obj2, j));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i9 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 47:
                    zbe = zbvz.zbi((List) unsafe.getObject(obj2, j));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i9 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case Compress.DC20 /* 48 */:
                    zbe = zbvz.zbj((List) unsafe.getObject(obj2, j));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i9 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 49:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    zbvx zbv2 = zbvpVar.zbv(i6);
                    int i31 = zbvz.zba;
                    int size8 = list11.size();
                    if (size8 != 0) {
                        int i32 = 0;
                        for (int i33 = 0; i33 < size8; i33++) {
                            i32 += zbtk.zbz(i9, (zbvm) list11.get(i33), zbv2);
                        }
                        i3 = i32;
                        i8 += i3;
                        break;
                    }
                    i3 = 0;
                    i8 += i3;
                case 50:
                    zbvg zbvgVar = (zbvg) unsafe.getObject(obj2, j);
                    zbvf zbvfVar = (zbvf) zbvpVar.zbw(i6);
                    if (!zbvgVar.isEmpty()) {
                        i3 = 0;
                        for (Map.Entry entry : zbvgVar.entrySet()) {
                            i3 += zbvfVar.zba(i9, entry.getKey(), entry.getValue());
                        }
                        i8 += i3;
                        break;
                    }
                    i3 = 0;
                    i8 += i3;
                case 51:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        i8 = xg6.b(i9 << 3, 8, i8);
                    }
                    break;
                case 52:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        i8 = xg6.b(i9 << 3, 4, i8);
                    }
                    break;
                case 53:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        long zbt = zbt(obj2, j);
                        zbD12 = zbtk.zbD(i9 << 3);
                        zbE2 = zbtk.zbE(zbt);
                        i8 += zbE2 + zbD12;
                    }
                    break;
                case 54:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        long zbt2 = zbt(obj2, j);
                        zbD12 = zbtk.zbD(i9 << 3);
                        zbE2 = zbtk.zbE(zbt2);
                        i8 += zbE2 + zbD12;
                    }
                    break;
                case 55:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        zbD12 = zbtk.zbD(i9 << 3);
                        zbE2 = zbtk.zbE(zbo(obj2, j));
                        i8 += zbE2 + zbD12;
                    }
                    break;
                case 56:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        i8 = xg6.b(i9 << 3, 8, i8);
                    }
                    break;
                case 57:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        i8 = xg6.b(i9 << 3, 4, i8);
                    }
                    break;
                case 58:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        i8 = xg6.b(i9 << 3, 1, i8);
                    }
                    break;
                case 59:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        int i34 = i9 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zbtc) {
                            zbe = zbtk.zbD(i34);
                            zbD10 = ((zbtc) object2).zbd();
                            zbD11 = zbtk.zbD(zbD10);
                            i8 += zbD11 + zbD10 + zbe;
                        } else {
                            zbD12 = zbtk.zbD(i34);
                            zbE2 = zbtk.zbC((String) object2);
                            i8 += zbE2 + zbD12;
                        }
                    }
                    break;
                case Compress.DC /* 60 */:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        zbd2 = zbvz.zbh(i9, unsafe.getObject(obj2, j), zbvpVar.zbv(i6));
                        i8 += zbd2;
                    }
                    break;
                case 61:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        zbe = zbtk.zbD(i9 << 3);
                        zbD10 = ((zbtc) unsafe.getObject(obj2, j)).zbd();
                        zbD11 = zbtk.zbD(zbD10);
                        i8 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 62:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        i8 = xg6.b(zbo(obj2, j), zbtk.zbD(i9 << 3), i8);
                    }
                    break;
                case 63:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        zbD12 = zbtk.zbD(i9 << 3);
                        zbE2 = zbtk.zbE(zbo(obj2, j));
                        i8 += zbE2 + zbD12;
                    }
                    break;
                case 64:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        i8 = xg6.b(i9 << 3, 4, i8);
                    }
                    break;
                case 65:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        i8 = xg6.b(i9 << 3, 8, i8);
                    }
                    break;
                case 66:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        int zbo = zbo(obj2, j);
                        i8 = xg6.b((zbo >> 31) ^ (zbo + zbo), zbtk.zbD(i9 << 3), i8);
                    }
                    break;
                case 67:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        long zbt3 = zbt(obj2, j);
                        zbD12 = zbtk.zbD(i9 << 3);
                        zbE2 = zbtk.zbE((zbt3 >> 63) ^ (zbt3 + zbt3));
                        i8 += zbE2 + zbD12;
                    }
                    break;
                case 68:
                    if (zbvpVar.zbM(obj2, i9, i6)) {
                        i8 += zbtk.zbz(i9, (zbvm) unsafe.getObject(obj2, j), zbvpVar.zbv(i6));
                    }
                    break;
            }
            i6 += 3;
            obj2 = obj;
            i4 = 1048575;
        }
        int i35 = 0;
        int zba4 = ((zbuf) obj).zbc.zba() + i8;
        if (zbvpVar.zbh) {
            zbtu zbtuVar = ((zbub) obj).zbb;
            int zbc = zbtuVar.zba.zbc();
            int i36 = 0;
            while (true) {
                zbwh zbwhVar = zbtuVar.zba;
                if (i36 < zbc) {
                    Map.Entry zbg = zbwhVar.zbg(i36);
                    i35 += zbtu.zbb((zbtt) ((zbwb) zbg).zba(), zbg.getValue());
                    i36++;
                } else {
                    for (Map.Entry entry2 : zbwhVar.zbd()) {
                        i35 += zbtu.zbb((zbtt) entry2.getKey(), entry2.getValue());
                    }
                    return zba4 + i35;
                }
            }
        } else {
            return zba4;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zbb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int zbc;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zbc.length; i5 += 3) {
            int zbs = zbs(i5);
            int[] iArr = this.zbc;
            int i6 = 1048575 & zbs;
            int zbr = zbr(zbs);
            int i7 = iArr[i5];
            long j = i6;
            int i8 = 37;
            switch (zbr) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zbws.zba(obj, j));
                    byte[] bArr = zbuo.zbb;
                    zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zbc;
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zbws.zbb(obj, j));
                    i4 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zbws.zbd(obj, j);
                    byte[] bArr2 = zbuo.zbb;
                    zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zbc;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zbws.zbd(obj, j);
                    byte[] bArr3 = zbuo.zbb;
                    zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zbc;
                    break;
                case 4:
                    i = i4 * 53;
                    zbc = zbws.zbc(obj, j);
                    i4 = i + zbc;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zbws.zbd(obj, j);
                    byte[] bArr4 = zbuo.zbb;
                    zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zbc;
                    break;
                case 6:
                    i = i4 * 53;
                    zbc = zbws.zbc(obj, j);
                    i4 = i + zbc;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zbuo.zba(zbws.zbw(obj, j));
                    i4 = floatToIntBits + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zbws.zbf(obj, j)).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object zbf = zbws.zbf(obj, j);
                    if (zbf != null) {
                        i8 = zbf.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zbws.zbf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 11:
                    i = i4 * 53;
                    zbc = zbws.zbc(obj, j);
                    i4 = i + zbc;
                    break;
                case 12:
                    i = i4 * 53;
                    zbc = zbws.zbc(obj, j);
                    i4 = i + zbc;
                    break;
                case 13:
                    i = i4 * 53;
                    zbc = zbws.zbc(obj, j);
                    i4 = i + zbc;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zbws.zbd(obj, j);
                    byte[] bArr5 = zbuo.zbb;
                    zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zbc;
                    break;
                case 15:
                    i = i4 * 53;
                    zbc = zbws.zbc(obj, j);
                    i4 = i + zbc;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zbws.zbd(obj, j);
                    byte[] bArr6 = zbuo.zbb;
                    zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zbc;
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object zbf2 = zbws.zbf(obj, j);
                    if (zbf2 != null) {
                        i8 = zbf2.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 18:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case SubAllocator.N4 /* 26 */:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                case 36:
                case 37:
                case SubAllocator.N_INDEXES /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case Compress.DC20 /* 48 */:
                case 49:
                    i2 = i4 * 53;
                    floatToIntBits = zbws.zbf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    floatToIntBits = zbws.zbf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 51:
                    if (zbM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zbm(obj, j));
                        byte[] bArr7 = zbuo.zbb;
                        zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zbc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zbM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zbn(obj, j));
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zbM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zbt(obj, j);
                        byte[] bArr8 = zbuo.zbb;
                        zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zbc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zbM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zbt(obj, j);
                        byte[] bArr9 = zbuo.zbb;
                        zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zbc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zbM(obj, i7, i5)) {
                        i = i4 * 53;
                        zbc = zbo(obj, j);
                        i4 = i + zbc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zbM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zbt(obj, j);
                        byte[] bArr10 = zbuo.zbb;
                        zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zbc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zbM(obj, i7, i5)) {
                        i = i4 * 53;
                        zbc = zbo(obj, j);
                        i4 = i + zbc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zbM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zbuo.zba(zbN(obj, j));
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zbM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zbws.zbf(obj, j)).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case Compress.DC /* 60 */:
                    if (zbM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zbws.zbf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zbM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zbws.zbf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zbM(obj, i7, i5)) {
                        i = i4 * 53;
                        zbc = zbo(obj, j);
                        i4 = i + zbc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zbM(obj, i7, i5)) {
                        i = i4 * 53;
                        zbc = zbo(obj, j);
                        i4 = i + zbc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zbM(obj, i7, i5)) {
                        i = i4 * 53;
                        zbc = zbo(obj, j);
                        i4 = i + zbc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zbM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zbt(obj, j);
                        byte[] bArr11 = zbuo.zbb;
                        zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zbc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zbM(obj, i7, i5)) {
                        i = i4 * 53;
                        zbc = zbo(obj, j);
                        i4 = i + zbc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zbM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zbt(obj, j);
                        byte[] bArr12 = zbuo.zbb;
                        zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zbc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zbM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zbws.zbf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zbuf) obj).zbc.hashCode() + (i4 * 53);
        if (this.zbh) {
            return (hashCode * 53) + ((zbub) obj).zbb.zba.hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:461:0x0b04, code lost:
        defpackage.fa6.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0b07, code lost:
        return r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0dd9, code lost:
        if (r9 == 1048575) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0ddb, code lost:
        r28.putInt(r2, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0de1, code lost:
        r1 = r0.zbj;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0de7, code lost:
        if (r1 >= r0.zbk) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0de9, code lost:
        r6 = r0.zbi;
        r7 = r0.zbl;
        r8 = r0.zbc;
        r6 = r6[r1];
        r8 = r8[r6];
        r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r2, r0.zbs(r6) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0e01, code lost:
        if (r9 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0e03, code lost:
        r11 = r0.zbu(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0e07, code lost:
        if (r11 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0e09, code lost:
        r6 = ((com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf) r0.zbw(r6)).zbc();
        r9 = ((com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg) r9).entrySet().iterator();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0e21, code lost:
        if (r9.hasNext() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0e23, code lost:
        r12 = (java.util.Map.Entry) r9.next();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0e37, code lost:
        if (r11.zba(((java.lang.Integer) r12.getValue()).intValue()) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0e39, code lost:
        if (r3 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0e3b, code lost:
        r3 = r7.zba(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0e3f, code lost:
        r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf.zbb(r6, r12.getKey(), r12.getValue());
        r14 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbb;
        r14 = new byte[r13];
        r17 = r1;
        r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbth(r14, r20, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0e58, code lost:
        com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf.zbe(r0, r6, r12.getKey(), r12.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0e63, code lost:
        r3.zbj((r8 << 3) | 2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsy.zba(r0, r14));
        r9.remove();
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0e7b, code lost:
        r20 = 0;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0e7e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0e84, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0e8a, code lost:
        r1 = r1 + 1;
        r20 = 0;
        r0 = r34;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0e9a, code lost:
        if (r3 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0e9c, code lost:
        ((com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r2).zbc = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0ea1, code lost:
        if (r10 != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0ea3, code lost:
        if (r5 != r4) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0ea6, code lost:
        defpackage.fa6.j("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0eab, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0eae, code lost:
        if (r5 > r4) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0eb0, code lost:
        if (r15 != r10) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0eb2, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0eb3, code lost:
        defpackage.fa6.j("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0eb6, code lost:
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0d76  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:225:0x0647 -> B:226:0x0648). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:261:0x06f9 -> B:262:0x06fa). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zbc(Object obj, byte[] bArr, int i, int i2, int i3, zbsq zbsqVar) {
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        int zbq;
        byte[] bArr2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zbsq zbsqVar2;
        Object obj2;
        int i12;
        int i13;
        int zbj;
        int i14;
        int i15;
        int i16;
        byte[] bArr3;
        int i17;
        int i18;
        int i19;
        int i20;
        Unsafe unsafe2;
        Object obj3;
        zbsq zbsqVar3;
        Unsafe unsafe3;
        zbsq zbsqVar4;
        Unsafe unsafe4;
        Object obj4;
        byte[] bArr4;
        int i21;
        int zbn;
        boolean z;
        Object obj5;
        int i22;
        zbsq zbsqVar5;
        zbsq zbsqVar6;
        int i23;
        byte[] bArr5;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z2;
        byte[] bArr6;
        zbsq zbsqVar7;
        int i28;
        int zba2;
        Unsafe unsafe5;
        byte[] bArr7;
        Object obj6;
        zbsq zbsqVar8;
        int i29;
        int i30;
        long j;
        byte[] bArr8;
        zbsq zbsqVar9;
        int i31;
        int i32;
        int i33;
        int zbk;
        byte[] bArr9;
        zbsq zbsqVar10;
        int i34;
        int i35;
        int zbg;
        boolean z3;
        boolean z4;
        boolean z5;
        int zbk2;
        String str;
        zbsq zbsqVar11;
        int i36;
        zbun zbunVar;
        int zbm;
        int i37;
        int i38;
        int zbk3;
        zbvp<T> zbvpVar = this;
        Object obj7 = obj;
        byte[] bArr10 = bArr;
        int i39 = i2;
        zbsq zbsqVar12 = zbsqVar;
        zbA(obj7);
        Unsafe unsafe6 = zbb;
        int i40 = 0;
        int i41 = -1;
        int i42 = i;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = -1;
        int i47 = 1048575;
        while (true) {
            if (i42 < i39) {
                int i48 = i42 + 1;
                int i49 = bArr10[i42];
                if (i49 < 0) {
                    i48 = zbsr.zbl(i49, bArr10, i48, zbsqVar12);
                    i49 = zbsqVar12.zba;
                }
                int i50 = i48;
                i45 = i49;
                int i51 = i45 >>> 3;
                int i52 = zbvpVar.zbe;
                if (i51 > i46) {
                    int i53 = i43 / 3;
                    if (i51 >= i52 && i51 <= zbvpVar.zbf) {
                        zbq = zbvpVar.zbq(i51, i53);
                    } else {
                        zbq = i41;
                    }
                } else if (i51 >= i52 && i51 <= zbvpVar.zbf) {
                    zbq = zbvpVar.zbq(i51, i40);
                } else {
                    i6 = i41;
                    if (i6 != i41) {
                        i4 = i3;
                        unsafe = unsafe6;
                        bArr2 = bArr10;
                        i7 = i50;
                        i8 = i47;
                        i9 = i40;
                        i5 = i9;
                        i10 = i44;
                        i11 = i45;
                        zbsqVar2 = zbsqVar;
                        obj2 = obj7;
                        i12 = i51;
                    } else {
                        int i54 = i45 & 7;
                        int[] iArr = zbvpVar.zbc;
                        int i55 = iArr[i6 + 1];
                        i5 = i40;
                        int zbr = zbr(i55);
                        long j2 = i55 & 1048575;
                        if (zbr <= 17) {
                            int i56 = iArr[i6 + 2];
                            int i57 = 1 << (i56 >>> 20);
                            int i58 = i56 & 1048575;
                            if (i58 != i47) {
                                int i59 = 1048575;
                                i14 = i51;
                                if (i47 != 1048575) {
                                    unsafe6.putInt(obj7, i47, i44);
                                    i59 = 1048575;
                                }
                                if (i58 == i59) {
                                    i15 = i5;
                                } else {
                                    i15 = unsafe6.getInt(obj7, i58);
                                }
                                i16 = i58;
                            } else {
                                i14 = i51;
                                i15 = i44;
                                i16 = i47;
                            }
                            switch (zbr) {
                                case 0:
                                    bArr3 = bArr;
                                    zbsqVar3 = zbsqVar;
                                    unsafe2 = unsafe6;
                                    obj3 = obj7;
                                    i17 = i50;
                                    i18 = i15;
                                    i19 = i16;
                                    i20 = i14;
                                    if (i54 == 1) {
                                        int i60 = i17 + 8;
                                        int i61 = i18 | i57;
                                        zbws.zbo(obj3, j2, Double.longBitsToDouble(zbsr.zbr(bArr3, i17)));
                                        obj7 = obj3;
                                        unsafe6 = unsafe2;
                                        i42 = i60;
                                        bArr10 = bArr3;
                                        zbsqVar12 = zbsqVar3;
                                        i43 = i6;
                                        i46 = i20;
                                        i40 = i5;
                                        i47 = i19;
                                        i41 = -1;
                                        i44 = i61;
                                        i39 = i2;
                                        break;
                                    } else {
                                        int i62 = i20;
                                        zbsqVar2 = zbsqVar3;
                                        i12 = i62;
                                        int i63 = i18;
                                        i8 = i19;
                                        i10 = i63;
                                        i4 = i3;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i9 = i6;
                                        i11 = i45;
                                        obj2 = obj3;
                                        i7 = i17;
                                        break;
                                    }
                                case 1:
                                    bArr3 = bArr;
                                    zbsqVar3 = zbsqVar;
                                    unsafe2 = unsafe6;
                                    obj3 = obj7;
                                    i17 = i50;
                                    i18 = i15;
                                    i19 = i16;
                                    i20 = i14;
                                    if (i54 == 5) {
                                        int i64 = i17 + 4;
                                        zbws.zbp(obj3, j2, Float.intBitsToFloat(zbsr.zbc(bArr3, i17)));
                                        i44 = i18 | i57;
                                        i46 = i20;
                                        obj7 = obj3;
                                        unsafe6 = unsafe2;
                                        i42 = i64;
                                        bArr10 = bArr3;
                                        zbsqVar12 = zbsqVar3;
                                        i43 = i6;
                                        i40 = i5;
                                        i47 = i19;
                                        i41 = -1;
                                        i39 = i2;
                                        break;
                                    } else {
                                        int i622 = i20;
                                        zbsqVar2 = zbsqVar3;
                                        i12 = i622;
                                        int i632 = i18;
                                        i8 = i19;
                                        i10 = i632;
                                        i4 = i3;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i9 = i6;
                                        i11 = i45;
                                        obj2 = obj3;
                                        i7 = i17;
                                        break;
                                    }
                                case 2:
                                case 3:
                                    int i65 = i15;
                                    unsafe3 = unsafe6;
                                    obj3 = obj7;
                                    i17 = i50;
                                    i18 = i65;
                                    bArr3 = bArr;
                                    zbsqVar3 = zbsqVar;
                                    i19 = i16;
                                    i20 = i14;
                                    if (i54 != 0) {
                                        unsafe2 = unsafe3;
                                        int i6222 = i20;
                                        zbsqVar2 = zbsqVar3;
                                        i12 = i6222;
                                        int i6322 = i18;
                                        i8 = i19;
                                        i10 = i6322;
                                        i4 = i3;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i9 = i6;
                                        i11 = i45;
                                        obj2 = obj3;
                                        i7 = i17;
                                        break;
                                    } else {
                                        int i66 = i18 | i57;
                                        int zbn2 = zbsr.zbn(bArr3, i17, zbsqVar3);
                                        unsafe6 = unsafe3;
                                        obj7 = obj;
                                        unsafe6.putLong(obj7, j2, zbsqVar3.zbb);
                                        i44 = i66;
                                        i46 = i20;
                                        i39 = i2;
                                        i42 = zbn2;
                                        bArr10 = bArr3;
                                        zbsqVar12 = zbsqVar3;
                                        i43 = i6;
                                        i40 = i5;
                                        i47 = i19;
                                        i41 = -1;
                                        break;
                                    }
                                case 4:
                                case 11:
                                    int i67 = i15;
                                    unsafe3 = unsafe6;
                                    obj3 = obj7;
                                    i17 = i50;
                                    i18 = i67;
                                    bArr3 = bArr;
                                    zbsqVar3 = zbsqVar;
                                    i19 = i16;
                                    i20 = i14;
                                    if (i54 != 0) {
                                        unsafe2 = unsafe3;
                                        int i62222 = i20;
                                        zbsqVar2 = zbsqVar3;
                                        i12 = i62222;
                                        int i63222 = i18;
                                        i8 = i19;
                                        i10 = i63222;
                                        i4 = i3;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i9 = i6;
                                        i11 = i45;
                                        obj2 = obj3;
                                        i7 = i17;
                                        break;
                                    } else {
                                        int i68 = i18 | i57;
                                        int zbk4 = zbsr.zbk(bArr3, i17, zbsqVar3);
                                        unsafe3.putInt(obj3, j2, zbsqVar3.zba);
                                        i42 = zbk4;
                                        zbsqVar12 = zbsqVar3;
                                        i43 = i6;
                                        i46 = i20;
                                        i40 = i5;
                                        i41 = -1;
                                        obj7 = obj3;
                                        i44 = i68;
                                        unsafe6 = unsafe3;
                                        bArr10 = bArr3;
                                        i47 = i19;
                                        i39 = i2;
                                        break;
                                    }
                                case 5:
                                case 14:
                                    Unsafe unsafe7 = unsafe6;
                                    Object obj8 = obj7;
                                    i17 = i50;
                                    i18 = i15;
                                    i19 = i16;
                                    i20 = i14;
                                    if (i54 == 1) {
                                        int i69 = i17 + 8;
                                        long zbr2 = zbsr.zbr(bArr, i17);
                                        unsafe6 = unsafe7;
                                        obj7 = obj8;
                                        unsafe6.putLong(obj7, j2, zbr2);
                                        i39 = i2;
                                        i42 = i69;
                                        bArr10 = bArr;
                                        zbsqVar12 = zbsqVar;
                                        i46 = i20;
                                        i40 = i5;
                                        i47 = i19;
                                        i41 = -1;
                                        i44 = i18 | i57;
                                        i43 = i6;
                                        break;
                                    } else {
                                        unsafe3 = unsafe7;
                                        bArr3 = bArr;
                                        obj3 = obj8;
                                        zbsqVar3 = zbsqVar;
                                        unsafe2 = unsafe3;
                                        int i622222 = i20;
                                        zbsqVar2 = zbsqVar3;
                                        i12 = i622222;
                                        int i632222 = i18;
                                        i8 = i19;
                                        i10 = i632222;
                                        i4 = i3;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i9 = i6;
                                        i11 = i45;
                                        obj2 = obj3;
                                        i7 = i17;
                                        break;
                                    }
                                case 6:
                                case 13:
                                    zbsqVar4 = zbsqVar;
                                    unsafe4 = unsafe6;
                                    obj4 = obj7;
                                    i17 = i50;
                                    bArr4 = bArr;
                                    i18 = i15;
                                    i19 = i16;
                                    i20 = i14;
                                    if (i54 != 5) {
                                        Unsafe unsafe8 = unsafe4;
                                        bArr3 = bArr4;
                                        obj3 = obj4;
                                        zbsqVar3 = zbsqVar4;
                                        unsafe2 = unsafe8;
                                        int i6222222 = i20;
                                        zbsqVar2 = zbsqVar3;
                                        i12 = i6222222;
                                        int i6322222 = i18;
                                        i8 = i19;
                                        i10 = i6322222;
                                        i4 = i3;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i9 = i6;
                                        i11 = i45;
                                        obj2 = obj3;
                                        i7 = i17;
                                        break;
                                    } else {
                                        unsafe4.putInt(obj4, j2, zbsr.zbc(bArr4, i17));
                                        i44 = i18 | i57;
                                        i46 = i20;
                                        zbsqVar12 = zbsqVar4;
                                        i42 = i17 + 4;
                                        obj7 = obj4;
                                        i43 = i6;
                                        i40 = i5;
                                        i41 = -1;
                                        i39 = i2;
                                        bArr10 = bArr4;
                                        unsafe6 = unsafe4;
                                        i47 = i19;
                                        break;
                                    }
                                case 7:
                                    zbsqVar4 = zbsqVar;
                                    unsafe4 = unsafe6;
                                    obj4 = obj7;
                                    i17 = i50;
                                    bArr4 = bArr;
                                    i18 = i15;
                                    i19 = i16;
                                    i20 = i14;
                                    if (i54 != 0) {
                                        Unsafe unsafe82 = unsafe4;
                                        bArr3 = bArr4;
                                        obj3 = obj4;
                                        zbsqVar3 = zbsqVar4;
                                        unsafe2 = unsafe82;
                                        int i62222222 = i20;
                                        zbsqVar2 = zbsqVar3;
                                        i12 = i62222222;
                                        int i63222222 = i18;
                                        i8 = i19;
                                        i10 = i63222222;
                                        i4 = i3;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i9 = i6;
                                        i11 = i45;
                                        obj2 = obj3;
                                        i7 = i17;
                                        break;
                                    } else {
                                        i21 = i18 | i57;
                                        zbn = zbsr.zbn(bArr4, i17, zbsqVar4);
                                        if (zbsqVar4.zbb != 0) {
                                            z = 1;
                                        } else {
                                            z = i5;
                                        }
                                        zbws.zbm(obj4, j2, z);
                                        i42 = zbn;
                                        zbsqVar12 = zbsqVar4;
                                        obj7 = obj4;
                                        i43 = i6;
                                        i46 = i20;
                                        i40 = i5;
                                        i41 = -1;
                                        bArr10 = bArr4;
                                        i44 = i21;
                                        unsafe6 = unsafe4;
                                        i47 = i19;
                                        i39 = i2;
                                        break;
                                    }
                                case 8:
                                    zbsqVar4 = zbsqVar;
                                    unsafe4 = unsafe6;
                                    obj4 = obj7;
                                    i17 = i50;
                                    bArr4 = bArr;
                                    i18 = i15;
                                    i19 = i16;
                                    i20 = i14;
                                    if (i54 == 2) {
                                        i21 = i18 | i57;
                                        if ((i55 & 536870912) != 0) {
                                            zbn = zbsr.zbi(bArr4, i17, zbsqVar4);
                                        } else {
                                            zbn = zbsr.zbh(bArr4, i17, zbsqVar4);
                                        }
                                        unsafe4.putObject(obj4, j2, zbsqVar4.zbc);
                                        i42 = zbn;
                                        zbsqVar12 = zbsqVar4;
                                        obj7 = obj4;
                                        i43 = i6;
                                        i46 = i20;
                                        i40 = i5;
                                        i41 = -1;
                                        bArr10 = bArr4;
                                        i44 = i21;
                                        unsafe6 = unsafe4;
                                        i47 = i19;
                                        i39 = i2;
                                        break;
                                    } else {
                                        Unsafe unsafe822 = unsafe4;
                                        bArr3 = bArr4;
                                        obj3 = obj4;
                                        zbsqVar3 = zbsqVar4;
                                        unsafe2 = unsafe822;
                                        int i622222222 = i20;
                                        zbsqVar2 = zbsqVar3;
                                        i12 = i622222222;
                                        int i632222222 = i18;
                                        i8 = i19;
                                        i10 = i632222222;
                                        i4 = i3;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i9 = i6;
                                        i11 = i45;
                                        obj2 = obj3;
                                        i7 = i17;
                                        break;
                                    }
                                case 9:
                                    Object obj9 = obj7;
                                    i19 = i16;
                                    i20 = i14;
                                    if (i54 == 2) {
                                        int i70 = i15 | i57;
                                        Unsafe unsafe9 = unsafe6;
                                        Object zbx = zbvpVar.zbx(obj9, i6);
                                        unsafe4 = unsafe9;
                                        zbsqVar12 = zbsqVar;
                                        int zbp = zbsr.zbp(zbx, zbvpVar.zbv(i6), bArr, i50, i2, zbsqVar12);
                                        bArr4 = bArr;
                                        zbvpVar.zbF(obj9, i6, zbx);
                                        i44 = i70;
                                        i46 = i20;
                                        i39 = i2;
                                        i42 = zbp;
                                        obj7 = obj9;
                                        i43 = i6;
                                        i40 = i5;
                                        i41 = -1;
                                        bArr10 = bArr4;
                                        unsafe6 = unsafe4;
                                        i47 = i19;
                                        break;
                                    } else {
                                        Unsafe unsafe10 = unsafe6;
                                        i17 = i50;
                                        bArr3 = bArr;
                                        obj3 = obj9;
                                        zbsqVar3 = zbsqVar;
                                        unsafe2 = unsafe10;
                                        i18 = i15;
                                        int i6222222222 = i20;
                                        zbsqVar2 = zbsqVar3;
                                        i12 = i6222222222;
                                        int i6322222222 = i18;
                                        i8 = i19;
                                        i10 = i6322222222;
                                        i4 = i3;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i9 = i6;
                                        i11 = i45;
                                        obj2 = obj3;
                                        i7 = i17;
                                        break;
                                    }
                                case 10:
                                    bArr3 = bArr;
                                    obj5 = obj7;
                                    i22 = i50;
                                    zbsqVar5 = zbsqVar;
                                    i19 = i16;
                                    i20 = i14;
                                    if (i54 != 2) {
                                        int i71 = i22;
                                        unsafe2 = unsafe6;
                                        obj3 = obj5;
                                        zbsqVar3 = zbsqVar5;
                                        i17 = i71;
                                        i18 = i15;
                                        int i62222222222 = i20;
                                        zbsqVar2 = zbsqVar3;
                                        i12 = i62222222222;
                                        int i63222222222 = i18;
                                        i8 = i19;
                                        i10 = i63222222222;
                                        i4 = i3;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i9 = i6;
                                        i11 = i45;
                                        obj2 = obj3;
                                        i7 = i17;
                                        break;
                                    } else {
                                        i15 |= i57;
                                        int zba3 = zbsr.zba(bArr3, i22, zbsqVar5);
                                        unsafe6.putObject(obj5, j2, zbsqVar5.zbc);
                                        zbsqVar12 = zbsqVar5;
                                        i42 = zba3;
                                        bArr10 = bArr3;
                                        obj7 = obj5;
                                        i43 = i6;
                                        i46 = i20;
                                        i40 = i5;
                                        i47 = i19;
                                        i41 = -1;
                                        i44 = i15;
                                        i39 = i2;
                                        break;
                                    }
                                case 12:
                                    bArr3 = bArr;
                                    obj5 = obj7;
                                    i22 = i50;
                                    zbsqVar5 = zbsqVar;
                                    i19 = i16;
                                    i20 = i14;
                                    if (i54 == 0) {
                                        int zbk5 = zbsr.zbk(bArr3, i22, zbsqVar5);
                                        int i72 = zbsqVar5.zba;
                                        zbuj zbu = zbvpVar.zbu(i6);
                                        if ((i55 & Integer.MIN_VALUE) != 0 && zbu != null && !zbu.zba(i72)) {
                                            zbd(obj5).zbj(i45, Long.valueOf(i72));
                                            i42 = zbk5;
                                            zbsqVar12 = zbsqVar5;
                                            bArr10 = bArr3;
                                            obj7 = obj5;
                                            i43 = i6;
                                            i46 = i20;
                                            i40 = i5;
                                            i47 = i19;
                                            i41 = -1;
                                            i44 = i15;
                                            i39 = i2;
                                            break;
                                        } else {
                                            int i73 = i15 | i57;
                                            unsafe6.putInt(obj5, j2, i72);
                                            i42 = zbk5;
                                            i39 = i2;
                                            zbsqVar12 = zbsqVar5;
                                            obj7 = obj5;
                                            i43 = i6;
                                            i46 = i20;
                                            i40 = i5;
                                            i41 = -1;
                                            i44 = i73;
                                            bArr10 = bArr3;
                                            i47 = i19;
                                            break;
                                        }
                                    } else {
                                        int i712 = i22;
                                        unsafe2 = unsafe6;
                                        obj3 = obj5;
                                        zbsqVar3 = zbsqVar5;
                                        i17 = i712;
                                        i18 = i15;
                                        int i622222222222 = i20;
                                        zbsqVar2 = zbsqVar3;
                                        i12 = i622222222222;
                                        int i632222222222 = i18;
                                        i8 = i19;
                                        i10 = i632222222222;
                                        i4 = i3;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i9 = i6;
                                        i11 = i45;
                                        obj2 = obj3;
                                        i7 = i17;
                                        break;
                                    }
                                    break;
                                case 15:
                                    bArr3 = bArr;
                                    Object obj10 = obj7;
                                    if (i54 == 0) {
                                        int i74 = i15 | i57;
                                        int zbk6 = zbsr.zbk(bArr3, i50, zbsqVar);
                                        unsafe6.putInt(obj10, j2, zbtg.zbb(zbsqVar.zba));
                                        i39 = i2;
                                        i42 = zbk6;
                                        bArr10 = bArr3;
                                        zbsqVar12 = zbsqVar;
                                        i43 = i6;
                                        i47 = i16;
                                        i46 = i14;
                                        i41 = -1;
                                        i44 = i74;
                                        obj7 = obj10;
                                        i40 = i5;
                                        break;
                                    } else {
                                        i17 = i50;
                                        i18 = i15;
                                        i19 = i16;
                                        i20 = i14;
                                        unsafe2 = unsafe6;
                                        obj3 = obj10;
                                        zbsqVar3 = zbsqVar;
                                        int i6222222222222 = i20;
                                        zbsqVar2 = zbsqVar3;
                                        i12 = i6222222222222;
                                        int i6322222222222 = i18;
                                        i8 = i19;
                                        i10 = i6322222222222;
                                        i4 = i3;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i9 = i6;
                                        i11 = i45;
                                        obj2 = obj3;
                                        i7 = i17;
                                        break;
                                    }
                                case 16:
                                    bArr3 = bArr;
                                    if (i54 == 0) {
                                        int i75 = i15 | i57;
                                        int zbn3 = zbsr.zbn(bArr3, i50, zbsqVar);
                                        unsafe6.putLong(obj7, j2, zbtg.zbc(zbsqVar.zbb));
                                        i39 = i2;
                                        i42 = zbn3;
                                        bArr10 = bArr3;
                                        zbsqVar12 = zbsqVar;
                                        i43 = i6;
                                        i47 = i16;
                                        i40 = i5;
                                        i41 = -1;
                                        i44 = i75;
                                        i46 = i14;
                                        break;
                                    } else {
                                        unsafe2 = unsafe6;
                                        obj3 = obj7;
                                        i17 = i50;
                                        i18 = i15;
                                        zbsqVar3 = zbsqVar;
                                        i19 = i16;
                                        i20 = i14;
                                        int i62222222222222 = i20;
                                        zbsqVar2 = zbsqVar3;
                                        i12 = i62222222222222;
                                        int i63222222222222 = i18;
                                        i8 = i19;
                                        i10 = i63222222222222;
                                        i4 = i3;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i9 = i6;
                                        i11 = i45;
                                        obj2 = obj3;
                                        i7 = i17;
                                        break;
                                    }
                                default:
                                    if (i54 == 3) {
                                        int i76 = i15 | i57;
                                        Object zbx2 = zbvpVar.zbx(obj7, i6);
                                        int zbo = zbsr.zbo(zbx2, zbvpVar.zbv(i6), bArr, i50, i2, (i14 << 3) | 4, zbsqVar);
                                        zbvpVar.zbF(obj7, i6, zbx2);
                                        i42 = zbo;
                                        bArr10 = bArr;
                                        zbsqVar12 = zbsqVar;
                                        i43 = i6;
                                        i47 = i16;
                                        i46 = i14;
                                        i41 = -1;
                                        i39 = i2;
                                        i44 = i76;
                                        i40 = i5;
                                        break;
                                    } else {
                                        bArr3 = bArr;
                                        zbsqVar3 = zbsqVar;
                                        unsafe2 = unsafe6;
                                        obj3 = obj7;
                                        i18 = i15;
                                        i17 = i50;
                                        i19 = i16;
                                        i20 = i14;
                                        int i622222222222222 = i20;
                                        zbsqVar2 = zbsqVar3;
                                        i12 = i622222222222222;
                                        int i632222222222222 = i18;
                                        i8 = i19;
                                        i10 = i632222222222222;
                                        i4 = i3;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i9 = i6;
                                        i11 = i45;
                                        obj2 = obj3;
                                        i7 = i17;
                                        break;
                                    }
                            }
                        } else {
                            Unsafe unsafe11 = unsafe6;
                            Object obj11 = obj7;
                            int i77 = i44;
                            int i78 = i51;
                            i10 = i77;
                            int i79 = 10;
                            if (zbr == 27) {
                                if (i54 == 2) {
                                    zbun zbunVar2 = (zbun) unsafe11.getObject(obj11, j2);
                                    if (!zbunVar2.zbc()) {
                                        int size = zbunVar2.size();
                                        if (size != 0) {
                                            i79 = size + size;
                                        }
                                        zbunVar2 = zbunVar2.zbd(i79);
                                        unsafe11.putObject(obj11, j2, zbunVar2);
                                    }
                                    int zbf = zbsr.zbf(zbvpVar.zbv(i6), i45, bArr, i50, i2, zbunVar2, zbsqVar);
                                    i45 = i45;
                                    obj7 = obj;
                                    bArr10 = bArr;
                                    i39 = i2;
                                    zbsqVar12 = zbsqVar;
                                    i42 = zbf;
                                    unsafe6 = unsafe11;
                                    i43 = i6;
                                    i46 = i78;
                                    i40 = i5;
                                    i44 = i10;
                                    i41 = -1;
                                } else {
                                    obj2 = obj11;
                                    zbsqVar6 = zbsqVar;
                                    unsafe = unsafe11;
                                    i8 = i47;
                                    i9 = i6;
                                    i23 = i78;
                                    bArr5 = bArr;
                                    i11 = i45;
                                    i24 = i50;
                                }
                            } else {
                                obj2 = obj11;
                                unsafe = unsafe11;
                                if (zbr <= 49) {
                                    long j3 = i55;
                                    Unsafe unsafe12 = zbb;
                                    zbun zbunVar3 = (zbun) unsafe12.getObject(obj2, j2);
                                    if (!zbunVar3.zbc()) {
                                        int size2 = zbunVar3.size();
                                        if (size2 != 0) {
                                            i79 = size2 + size2;
                                        }
                                        j = j3;
                                        zbunVar3 = zbunVar3.zbd(i79);
                                        unsafe12.putObject(obj2, j2, zbunVar3);
                                    } else {
                                        j = j3;
                                    }
                                    switch (zbr) {
                                        case 18:
                                        case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                                            bArr8 = bArr;
                                            zbsqVar9 = zbsqVar;
                                            i8 = i47;
                                            zbun zbunVar4 = zbunVar3;
                                            i9 = i6;
                                            i31 = i78;
                                            i11 = i45;
                                            i32 = i50;
                                            i39 = i2;
                                            if (i54 == 2) {
                                                zbtm zbtmVar = (zbtm) zbunVar4;
                                                zbk = zbsr.zbk(bArr8, i32, zbsqVar9);
                                                int i80 = zbsqVar9.zba + zbk;
                                                while (zbk < i80) {
                                                    zbtmVar.zbf(Double.longBitsToDouble(zbsr.zbr(bArr8, zbk)));
                                                    zbk += 8;
                                                }
                                                if (zbk != i80) {
                                                    fa6.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                                i42 = zbk;
                                                break;
                                            } else {
                                                if (i54 == 1) {
                                                    i33 = i32 + 8;
                                                    zbtm zbtmVar2 = (zbtm) zbunVar4;
                                                    zbtmVar2.zbf(Double.longBitsToDouble(zbsr.zbr(bArr8, i32)));
                                                    while (i33 < i39) {
                                                        int zbk7 = zbsr.zbk(bArr8, i33, zbsqVar9);
                                                        if (i11 != zbsqVar9.zba) {
                                                            i42 = i33;
                                                            break;
                                                        } else {
                                                            zbtmVar2.zbf(Double.longBitsToDouble(zbsr.zbr(bArr8, zbk7)));
                                                            i33 = zbk7 + 8;
                                                        }
                                                    }
                                                    i42 = i33;
                                                }
                                                i42 = i32;
                                                break;
                                            }
                                        case 19:
                                        case 36:
                                            bArr8 = bArr;
                                            zbsqVar9 = zbsqVar;
                                            i8 = i47;
                                            zbun zbunVar5 = zbunVar3;
                                            i9 = i6;
                                            i31 = i78;
                                            i11 = i45;
                                            i32 = i50;
                                            i39 = i2;
                                            if (i54 == 2) {
                                                zbtw zbtwVar = (zbtw) zbunVar5;
                                                zbk = zbsr.zbk(bArr8, i32, zbsqVar9);
                                                int i81 = zbsqVar9.zba + zbk;
                                                while (zbk < i81) {
                                                    zbtwVar.zbg(Float.intBitsToFloat(zbsr.zbc(bArr8, zbk)));
                                                    zbk += 4;
                                                }
                                                if (zbk != i81) {
                                                    fa6.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                                i42 = zbk;
                                                break;
                                            } else {
                                                if (i54 == 5) {
                                                    i33 = i32 + 4;
                                                    zbtw zbtwVar2 = (zbtw) zbunVar5;
                                                    zbtwVar2.zbg(Float.intBitsToFloat(zbsr.zbc(bArr8, i32)));
                                                    while (i33 < i39) {
                                                        int zbk8 = zbsr.zbk(bArr8, i33, zbsqVar9);
                                                        if (i11 == zbsqVar9.zba) {
                                                            zbtwVar2.zbg(Float.intBitsToFloat(zbsr.zbc(bArr8, zbk8)));
                                                            i33 = zbk8 + 4;
                                                        } else {
                                                            i42 = i33;
                                                            break;
                                                        }
                                                    }
                                                    i42 = i33;
                                                }
                                                i42 = i32;
                                                break;
                                            }
                                        case 20:
                                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                        case 37:
                                        case SubAllocator.N_INDEXES /* 38 */:
                                            bArr8 = bArr;
                                            zbsqVar9 = zbsqVar;
                                            i8 = i47;
                                            zbun zbunVar6 = zbunVar3;
                                            i9 = i6;
                                            i31 = i78;
                                            i11 = i45;
                                            i32 = i50;
                                            i39 = i2;
                                            if (i54 == 2) {
                                                zbva zbvaVar = (zbva) zbunVar6;
                                                zbk = zbsr.zbk(bArr8, i32, zbsqVar9);
                                                int i82 = zbsqVar9.zba + zbk;
                                                while (zbk < i82) {
                                                    zbk = zbsr.zbn(bArr8, zbk, zbsqVar9);
                                                    zbvaVar.zbg(zbsqVar9.zbb);
                                                }
                                                if (zbk != i82) {
                                                    fa6.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                            } else {
                                                if (i54 == 0) {
                                                    zbva zbvaVar2 = (zbva) zbunVar6;
                                                    zbk = zbsr.zbn(bArr8, i32, zbsqVar9);
                                                    zbvaVar2.zbg(zbsqVar9.zbb);
                                                    while (zbk < i39) {
                                                        int zbk9 = zbsr.zbk(bArr8, zbk, zbsqVar9);
                                                        if (i11 == zbsqVar9.zba) {
                                                            zbk = zbsr.zbn(bArr8, zbk9, zbsqVar9);
                                                            zbvaVar2.zbg(zbsqVar9.zbb);
                                                        }
                                                    }
                                                }
                                                i42 = i32;
                                                break;
                                            }
                                            i42 = zbk;
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            bArr9 = bArr;
                                            zbsqVar10 = zbsqVar;
                                            i34 = i50;
                                            i8 = i47;
                                            zbun zbunVar7 = zbunVar3;
                                            i9 = i6;
                                            i31 = i78;
                                            i35 = i45;
                                            i39 = i2;
                                            if (i54 == 2) {
                                                zbg = zbsr.zbg(bArr9, i34, zbunVar7, zbsqVar10);
                                                i42 = zbg;
                                                bArr8 = bArr9;
                                                zbsqVar9 = zbsqVar10;
                                                i11 = i35;
                                                i32 = i34;
                                                break;
                                            } else {
                                                if (i54 == 0) {
                                                    bArr8 = bArr9;
                                                    i42 = zbsr.zbm(i35, bArr8, i34, i39, zbunVar7, zbsqVar10);
                                                    i11 = i35;
                                                    i32 = i34;
                                                    zbsqVar9 = zbsqVar10;
                                                    break;
                                                }
                                                bArr8 = bArr9;
                                                zbsqVar9 = zbsqVar10;
                                                i11 = i35;
                                                i32 = i34;
                                                i42 = i32;
                                                break;
                                            }
                                        case ConnectionResult.API_DISABLED /* 23 */:
                                        case 32:
                                        case 40:
                                        case 46:
                                            bArr9 = bArr;
                                            zbsqVar10 = zbsqVar;
                                            i34 = i50;
                                            i8 = i47;
                                            zbun zbunVar8 = zbunVar3;
                                            i9 = i6;
                                            i31 = i78;
                                            i35 = i45;
                                            i39 = i2;
                                            if (i54 == 2) {
                                                zbva zbvaVar3 = (zbva) zbunVar8;
                                                zbg = zbsr.zbk(bArr9, i34, zbsqVar10);
                                                int i83 = zbsqVar10.zba + zbg;
                                                while (zbg < i83) {
                                                    zbvaVar3.zbg(zbsr.zbr(bArr9, zbg));
                                                    zbg += 8;
                                                }
                                                if (zbg != i83) {
                                                    fa6.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                            } else {
                                                if (i54 == 1) {
                                                    zbg = i34 + 8;
                                                    zbva zbvaVar4 = (zbva) zbunVar8;
                                                    zbvaVar4.zbg(zbsr.zbr(bArr9, i34));
                                                    while (zbg < i39) {
                                                        int zbk10 = zbsr.zbk(bArr9, zbg, zbsqVar10);
                                                        if (i35 == zbsqVar10.zba) {
                                                            zbvaVar4.zbg(zbsr.zbr(bArr9, zbk10));
                                                            zbg = zbk10 + 8;
                                                        }
                                                    }
                                                }
                                                bArr8 = bArr9;
                                                zbsqVar9 = zbsqVar10;
                                                i11 = i35;
                                                i32 = i34;
                                                i42 = i32;
                                                break;
                                            }
                                            i42 = zbg;
                                            bArr8 = bArr9;
                                            zbsqVar9 = zbsqVar10;
                                            i11 = i35;
                                            i32 = i34;
                                            break;
                                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                        case 31:
                                        case 41:
                                        case 45:
                                            bArr9 = bArr;
                                            zbsqVar10 = zbsqVar;
                                            i34 = i50;
                                            i8 = i47;
                                            zbun zbunVar9 = zbunVar3;
                                            i9 = i6;
                                            i31 = i78;
                                            i35 = i45;
                                            i39 = i2;
                                            if (i54 == 2) {
                                                zbug zbugVar = (zbug) zbunVar9;
                                                zbg = zbsr.zbk(bArr9, i34, zbsqVar10);
                                                int i84 = zbsqVar10.zba + zbg;
                                                while (zbg < i84) {
                                                    zbugVar.zbg(zbsr.zbc(bArr9, zbg));
                                                    zbg += 4;
                                                }
                                                if (zbg != i84) {
                                                    fa6.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                            } else {
                                                if (i54 == 5) {
                                                    zbg = i34 + 4;
                                                    zbug zbugVar2 = (zbug) zbunVar9;
                                                    zbugVar2.zbg(zbsr.zbc(bArr9, i34));
                                                    while (zbg < i39) {
                                                        int zbk11 = zbsr.zbk(bArr9, zbg, zbsqVar10);
                                                        if (i35 == zbsqVar10.zba) {
                                                            zbugVar2.zbg(zbsr.zbc(bArr9, zbk11));
                                                            zbg = zbk11 + 4;
                                                        }
                                                    }
                                                }
                                                bArr8 = bArr9;
                                                zbsqVar9 = zbsqVar10;
                                                i11 = i35;
                                                i32 = i34;
                                                i42 = i32;
                                                break;
                                            }
                                            i42 = zbg;
                                            bArr8 = bArr9;
                                            zbsqVar9 = zbsqVar10;
                                            i11 = i35;
                                            i32 = i34;
                                            break;
                                        case 25:
                                        case 42:
                                            bArr9 = bArr;
                                            zbsqVar10 = zbsqVar;
                                            i34 = i50;
                                            i8 = i47;
                                            zbun zbunVar10 = zbunVar3;
                                            i9 = i6;
                                            i35 = i45;
                                            i39 = i2;
                                            if (i54 == 2) {
                                                zbss zbssVar = (zbss) zbunVar10;
                                                zbg = zbsr.zbk(bArr9, i34, zbsqVar10);
                                                int i85 = zbsqVar10.zba + zbg;
                                                while (zbg < i85) {
                                                    zbg = zbsr.zbn(bArr9, zbg, zbsqVar10);
                                                    int i86 = i78;
                                                    if (zbsqVar10.zbb != 0) {
                                                        z5 = 1;
                                                    } else {
                                                        z5 = i5;
                                                    }
                                                    zbssVar.zbe(z5);
                                                    i78 = i86;
                                                }
                                                i31 = i78;
                                                if (zbg != i85) {
                                                    fa6.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                            } else {
                                                i31 = i78;
                                                if (i54 == 0) {
                                                    zbss zbssVar2 = (zbss) zbunVar10;
                                                    zbg = zbsr.zbn(bArr9, i34, zbsqVar10);
                                                    if (zbsqVar10.zbb != 0) {
                                                        z3 = 1;
                                                    } else {
                                                        z3 = i5;
                                                    }
                                                    zbssVar2.zbe(z3);
                                                    while (zbg < i39) {
                                                        int zbk12 = zbsr.zbk(bArr9, zbg, zbsqVar10);
                                                        if (i35 == zbsqVar10.zba) {
                                                            zbg = zbsr.zbn(bArr9, zbk12, zbsqVar10);
                                                            if (zbsqVar10.zbb != 0) {
                                                                z4 = 1;
                                                            } else {
                                                                z4 = i5;
                                                            }
                                                            zbssVar2.zbe(z4);
                                                        }
                                                    }
                                                }
                                                bArr8 = bArr9;
                                                zbsqVar9 = zbsqVar10;
                                                i11 = i35;
                                                i32 = i34;
                                                i42 = i32;
                                                break;
                                            }
                                            i42 = zbg;
                                            bArr8 = bArr9;
                                            zbsqVar9 = zbsqVar10;
                                            i11 = i35;
                                            i32 = i34;
                                            break;
                                        case SubAllocator.N4 /* 26 */:
                                            i34 = i50;
                                            i8 = i47;
                                            zbun zbunVar11 = zbunVar3;
                                            i9 = i6;
                                            i39 = i2;
                                            if (i54 == 2) {
                                                if ((j & 536870912) == 0) {
                                                    zbk2 = zbsr.zbk(bArr, i34, zbsqVar);
                                                    int i87 = zbsqVar.zba;
                                                    if (i87 >= 0) {
                                                        if (i87 == 0) {
                                                            zbunVar11.add("");
                                                            while (zbk2 < i39) {
                                                                int zbk13 = zbsr.zbk(bArr, zbk2, zbsqVar);
                                                                if (i45 == zbsqVar.zba) {
                                                                    zbk2 = zbsr.zbk(bArr, zbk13, zbsqVar);
                                                                    i87 = zbsqVar.zba;
                                                                    if (i87 >= 0) {
                                                                        if (i87 == 0) {
                                                                            zbunVar11.add("");
                                                                        } else {
                                                                            zbunVar11.add(new String(bArr, zbk2, i87, zbuo.zba));
                                                                            zbk2 += i87;
                                                                            while (zbk2 < i39) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        fa6.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                        return i5;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            zbunVar11.add(new String(bArr, zbk2, i87, zbuo.zba));
                                                            zbk2 += i87;
                                                            while (zbk2 < i39) {
                                                            }
                                                        }
                                                    } else {
                                                        fa6.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return i5;
                                                    }
                                                } else {
                                                    zbk2 = zbsr.zbk(bArr, i34, zbsqVar);
                                                    int i88 = zbsqVar.zba;
                                                    if (i88 >= 0) {
                                                        if (i88 == 0) {
                                                            zbunVar11.add("");
                                                            str = "CodedInputStream encountered an embedded string or message which claimed to have negative size.";
                                                        } else {
                                                            int i89 = zbk2 + i88;
                                                            if (zbwv.zbd(bArr, zbk2, i89)) {
                                                                str = "CodedInputStream encountered an embedded string or message which claimed to have negative size.";
                                                                zbunVar11.add(new String(bArr, zbk2, i88, zbuo.zba));
                                                                zbk2 = i89;
                                                            } else {
                                                                fa6.j("Protocol message had invalid UTF-8.");
                                                                return i5;
                                                            }
                                                        }
                                                        while (zbk2 < i39) {
                                                            int zbk14 = zbsr.zbk(bArr, zbk2, zbsqVar);
                                                            if (i45 == zbsqVar.zba) {
                                                                zbk2 = zbsr.zbk(bArr, zbk14, zbsqVar);
                                                                int i90 = zbsqVar.zba;
                                                                if (i90 >= 0) {
                                                                    if (i90 == 0) {
                                                                        zbunVar11.add("");
                                                                    } else {
                                                                        int i91 = zbk2 + i90;
                                                                        if (zbwv.zbd(bArr, zbk2, i91)) {
                                                                            zbunVar11.add(new String(bArr, zbk2, i90, zbuo.zba));
                                                                            zbk2 = i91;
                                                                        } else {
                                                                            fa6.j("Protocol message had invalid UTF-8.");
                                                                            return i5;
                                                                        }
                                                                    }
                                                                } else {
                                                                    fa6.j(str);
                                                                    return i5;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        fa6.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return i5;
                                                    }
                                                }
                                                bArr8 = bArr;
                                                zbsqVar9 = zbsqVar;
                                                i42 = zbk2;
                                                i11 = i45;
                                                i31 = i78;
                                                i32 = i34;
                                                break;
                                            } else {
                                                bArr8 = bArr;
                                                zbsqVar9 = zbsqVar;
                                                i11 = i45;
                                                i31 = i78;
                                                i32 = i34;
                                                i42 = i32;
                                                break;
                                            }
                                        case 27:
                                            i34 = i50;
                                            i8 = i47;
                                            zbun zbunVar12 = zbunVar3;
                                            i39 = i2;
                                            int i92 = i6;
                                            if (i54 == 2) {
                                                zbvpVar = this;
                                                i9 = i92;
                                                zbk = zbsr.zbf(zbvpVar.zbv(i9), i45, bArr, i34, i39, zbunVar12, zbsqVar);
                                                i11 = i45;
                                                bArr8 = bArr;
                                                zbsqVar9 = zbsqVar;
                                                i31 = i78;
                                                i32 = i34;
                                                i39 = i39;
                                                i42 = zbk;
                                                break;
                                            } else {
                                                zbvpVar = this;
                                                i9 = i92;
                                                i11 = i45;
                                                bArr8 = bArr;
                                                zbsqVar9 = zbsqVar;
                                                i31 = i78;
                                                i32 = i34;
                                                i42 = i32;
                                                break;
                                            }
                                        case 28:
                                            i34 = i50;
                                            i8 = i47;
                                            zbun zbunVar13 = zbunVar3;
                                            i39 = i2;
                                            int i93 = i6;
                                            if (i54 == 2) {
                                                int zbk15 = zbsr.zbk(bArr, i34, zbsqVar);
                                                int i94 = zbsqVar.zba;
                                                if (i94 >= 0) {
                                                    if (i94 <= bArr.length - zbk15) {
                                                        if (i94 == 0) {
                                                            zbunVar13.add(zbtc.zbb);
                                                            while (zbk15 < i39) {
                                                                int zbk16 = zbsr.zbk(bArr, zbk15, zbsqVar);
                                                                if (i45 == zbsqVar.zba) {
                                                                    zbk15 = zbsr.zbk(bArr, zbk16, zbsqVar);
                                                                    i94 = zbsqVar.zba;
                                                                    if (i94 >= 0) {
                                                                        if (i94 <= bArr.length - zbk15) {
                                                                            if (i94 == 0) {
                                                                                zbunVar13.add(zbtc.zbb);
                                                                            } else {
                                                                                zbunVar13.add(zbtc.zbj(bArr, zbk15, i94));
                                                                                zbk15 += i94;
                                                                                while (zbk15 < i39) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            fa6.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                            return i5;
                                                                        }
                                                                    } else {
                                                                        fa6.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                        return i5;
                                                                    }
                                                                } else {
                                                                    i42 = zbk15;
                                                                    i11 = i45;
                                                                    bArr8 = bArr;
                                                                    zbsqVar9 = zbsqVar;
                                                                    i31 = i78;
                                                                    i9 = i93;
                                                                    zbvpVar = this;
                                                                    i32 = i34;
                                                                    break;
                                                                }
                                                            }
                                                            i42 = zbk15;
                                                            i11 = i45;
                                                            bArr8 = bArr;
                                                            zbsqVar9 = zbsqVar;
                                                            i31 = i78;
                                                            i9 = i93;
                                                            zbvpVar = this;
                                                            i32 = i34;
                                                        } else {
                                                            zbunVar13.add(zbtc.zbj(bArr, zbk15, i94));
                                                            zbk15 += i94;
                                                            while (zbk15 < i39) {
                                                            }
                                                            i42 = zbk15;
                                                            i11 = i45;
                                                            bArr8 = bArr;
                                                            zbsqVar9 = zbsqVar;
                                                            i31 = i78;
                                                            i9 = i93;
                                                            zbvpVar = this;
                                                            i32 = i34;
                                                        }
                                                    } else {
                                                        fa6.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return i5;
                                                    }
                                                } else {
                                                    fa6.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return i5;
                                                }
                                            } else {
                                                zbvpVar = this;
                                                i11 = i45;
                                                bArr8 = bArr;
                                                zbsqVar9 = zbsqVar;
                                                i31 = i78;
                                                i9 = i93;
                                                i32 = i34;
                                                i42 = i32;
                                                break;
                                            }
                                        case 30:
                                        case 44:
                                            bArr8 = bArr;
                                            zbsqVar11 = zbsqVar;
                                            i34 = i50;
                                            i8 = i47;
                                            i35 = i45;
                                            i39 = i2;
                                            if (i54 == 2) {
                                                zbm = zbsr.zbg(bArr8, i34, zbunVar3, zbsqVar11);
                                                i36 = i35;
                                                zbunVar = zbunVar3;
                                            } else if (i54 == 0) {
                                                i36 = i35;
                                                zbunVar = zbunVar3;
                                                zbm = zbsr.zbm(i36, bArr8, i34, i39, zbunVar, zbsqVar11);
                                            } else {
                                                zbvpVar = this;
                                                zbsqVar9 = zbsqVar11;
                                                i9 = i6;
                                                i31 = i78;
                                                i11 = i35;
                                                i32 = i34;
                                                i42 = i32;
                                                break;
                                            }
                                            zbuj zbu2 = zbvpVar.zbu(i6);
                                            zbwl zbwlVar = zbvpVar.zbl;
                                            int i95 = zbvz.zba;
                                            if (zbu2 != null) {
                                                if (zbunVar != null) {
                                                    int size3 = zbunVar.size();
                                                    i37 = zbm;
                                                    Object obj12 = null;
                                                    int i96 = i5;
                                                    int i97 = i96;
                                                    while (i96 < size3) {
                                                        Integer num = (Integer) zbunVar.get(i96);
                                                        int i98 = i6;
                                                        int intValue = num.intValue();
                                                        if (zbu2.zba(intValue)) {
                                                            if (i96 != i97) {
                                                                zbunVar.set(i97, num);
                                                            }
                                                            i97++;
                                                        } else {
                                                            obj12 = zbvz.zbn(obj2, i78, intValue, obj12, zbwlVar);
                                                        }
                                                        i96++;
                                                        i6 = i98;
                                                    }
                                                    i38 = i6;
                                                    if (i97 != size3) {
                                                        zbunVar.subList(i97, size3).clear();
                                                    }
                                                } else {
                                                    i37 = zbm;
                                                    i38 = i6;
                                                    Iterator it = zbunVar.iterator();
                                                    Object obj13 = null;
                                                    while (it.hasNext()) {
                                                        int intValue2 = ((Integer) it.next()).intValue();
                                                        if (!zbu2.zba(intValue2)) {
                                                            obj13 = zbvz.zbn(obj2, i78, intValue2, obj13, zbwlVar);
                                                            it.remove();
                                                        }
                                                    }
                                                }
                                            } else {
                                                i37 = zbm;
                                                i38 = i6;
                                            }
                                            zbvpVar = this;
                                            i11 = i36;
                                            bArr8 = bArr8;
                                            zbsqVar9 = zbsqVar11;
                                            i31 = i78;
                                            i42 = i37;
                                            i9 = i38;
                                            i32 = i34;
                                            break;
                                        case 33:
                                        case 47:
                                            bArr8 = bArr;
                                            zbsqVar11 = zbsqVar;
                                            i34 = i50;
                                            i8 = i47;
                                            i35 = i45;
                                            i39 = i2;
                                            if (i54 == 2) {
                                                zbug zbugVar3 = (zbug) zbunVar3;
                                                zbk3 = zbsr.zbk(bArr8, i34, zbsqVar11);
                                                int i99 = zbsqVar11.zba + zbk3;
                                                while (zbk3 < i99) {
                                                    zbk3 = zbsr.zbk(bArr8, zbk3, zbsqVar11);
                                                    zbugVar3.zbg(zbtg.zbb(zbsqVar11.zba));
                                                }
                                                if (zbk3 != i99) {
                                                    fa6.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                            } else {
                                                if (i54 == 0) {
                                                    zbug zbugVar4 = (zbug) zbunVar3;
                                                    zbk3 = zbsr.zbk(bArr8, i34, zbsqVar11);
                                                    zbugVar4.zbg(zbtg.zbb(zbsqVar11.zba));
                                                    while (zbk3 < i39) {
                                                        int zbk17 = zbsr.zbk(bArr8, zbk3, zbsqVar11);
                                                        if (i35 == zbsqVar11.zba) {
                                                            zbk3 = zbsr.zbk(bArr8, zbk17, zbsqVar11);
                                                            zbugVar4.zbg(zbtg.zbb(zbsqVar11.zba));
                                                        }
                                                    }
                                                }
                                                zbsqVar9 = zbsqVar11;
                                                i9 = i6;
                                                i31 = i78;
                                                i11 = i35;
                                                i32 = i34;
                                                i42 = i32;
                                                break;
                                            }
                                            i42 = zbk3;
                                            zbsqVar9 = zbsqVar11;
                                            i9 = i6;
                                            i31 = i78;
                                            i11 = i35;
                                            i32 = i34;
                                            break;
                                        case 34:
                                        case Compress.DC20 /* 48 */:
                                            bArr8 = bArr;
                                            zbsqVar11 = zbsqVar;
                                            i34 = i50;
                                            i35 = i45;
                                            i39 = i2;
                                            if (i54 == 2) {
                                                zbva zbvaVar5 = (zbva) zbunVar3;
                                                zbk3 = zbsr.zbk(bArr8, i34, zbsqVar11);
                                                int i100 = zbsqVar11.zba + zbk3;
                                                while (zbk3 < i100) {
                                                    zbk3 = zbsr.zbn(bArr8, zbk3, zbsqVar11);
                                                    zbvaVar5.zbg(zbtg.zbc(zbsqVar11.zbb));
                                                    i47 = i47;
                                                }
                                                i8 = i47;
                                                if (zbk3 != i100) {
                                                    fa6.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                            } else {
                                                i8 = i47;
                                                if (i54 == 0) {
                                                    zbva zbvaVar6 = (zbva) zbunVar3;
                                                    zbk3 = zbsr.zbn(bArr8, i34, zbsqVar11);
                                                    zbvaVar6.zbg(zbtg.zbc(zbsqVar11.zbb));
                                                    while (zbk3 < i39) {
                                                        int zbk18 = zbsr.zbk(bArr8, zbk3, zbsqVar11);
                                                        if (i35 == zbsqVar11.zba) {
                                                            zbk3 = zbsr.zbn(bArr8, zbk18, zbsqVar11);
                                                            zbvaVar6.zbg(zbtg.zbc(zbsqVar11.zbb));
                                                        }
                                                    }
                                                }
                                                zbsqVar9 = zbsqVar11;
                                                i9 = i6;
                                                i31 = i78;
                                                i11 = i35;
                                                i32 = i34;
                                                i42 = i32;
                                                break;
                                            }
                                            i42 = zbk3;
                                            zbsqVar9 = zbsqVar11;
                                            i9 = i6;
                                            i31 = i78;
                                            i11 = i35;
                                            i32 = i34;
                                            break;
                                        default:
                                            if (i54 == 3) {
                                                int i101 = (i45 & (-8)) | 4;
                                                zbvx zbv = zbvpVar.zbv(i6);
                                                bArr8 = bArr;
                                                i35 = i45;
                                                i39 = i2;
                                                int zbd = zbsr.zbd(zbv, bArr8, i50, i39, i101, zbsqVar);
                                                i34 = i50;
                                                zbunVar3.add(zbsqVar.zbc);
                                                while (zbd < i39) {
                                                    int zbk19 = zbsr.zbk(bArr8, zbd, zbsqVar);
                                                    zbvx zbvxVar = zbv;
                                                    if (i35 == zbsqVar.zba) {
                                                        zbv = zbvxVar;
                                                        zbd = zbsr.zbd(zbv, bArr8, zbk19, i39, i101, zbsqVar);
                                                        zbunVar3.add(zbsqVar.zbc);
                                                    } else {
                                                        zbsqVar9 = zbsqVar;
                                                        i42 = zbd;
                                                        i8 = i47;
                                                        i9 = i6;
                                                        i31 = i78;
                                                        i11 = i35;
                                                        i32 = i34;
                                                        break;
                                                    }
                                                }
                                                zbsqVar9 = zbsqVar;
                                                i42 = zbd;
                                                i8 = i47;
                                                i9 = i6;
                                                i31 = i78;
                                                i11 = i35;
                                                i32 = i34;
                                            } else {
                                                bArr8 = bArr;
                                                zbsqVar9 = zbsqVar;
                                                i8 = i47;
                                                i9 = i6;
                                                i31 = i78;
                                                i11 = i45;
                                                i32 = i50;
                                                i39 = i2;
                                                i42 = i32;
                                                break;
                                            }
                                    }
                                    if (i42 != i32) {
                                        zbsqVar12 = zbsqVar9;
                                        i43 = i9;
                                        i46 = i31;
                                        i40 = i5;
                                        i44 = i10;
                                        i47 = i8;
                                        unsafe6 = unsafe;
                                        i41 = -1;
                                        bArr10 = bArr8;
                                        obj7 = obj2;
                                        i45 = i11;
                                    } else {
                                        bArr2 = bArr8;
                                        zbsqVar2 = zbsqVar9;
                                        i7 = i42;
                                        i12 = i31;
                                        i4 = i3;
                                    }
                                } else {
                                    zbsq zbsqVar13 = zbsqVar;
                                    i8 = i47;
                                    i9 = i6;
                                    i23 = i78;
                                    Unsafe unsafe13 = unsafe;
                                    i11 = i45;
                                    i24 = i50;
                                    byte[] bArr11 = bArr;
                                    if (zbr == 50) {
                                        if (i54 == 2) {
                                            Unsafe unsafe14 = zbb;
                                            Object zbw = zbvpVar.zbw(i9);
                                            Object object = unsafe14.getObject(obj2, j2);
                                            if (!((zbvg) object).zbe()) {
                                                zbvg zbb2 = zbvg.zba().zbb();
                                                zbvh.zba(zbb2, object);
                                                unsafe14.putObject(obj2, j2, zbb2);
                                                object = zbb2;
                                            }
                                            zbve zbc = ((zbvf) zbw).zbc();
                                            zbvg zbvgVar = (zbvg) object;
                                            int zbk20 = zbsr.zbk(bArr11, i24, zbsqVar13);
                                            int i102 = zbsqVar13.zba;
                                            if (i102 >= 0 && i102 <= i2 - zbk20) {
                                                int i103 = zbk20 + i102;
                                                Object obj14 = zbc.zbb;
                                                Object obj15 = zbc.zbd;
                                                Object obj16 = obj14;
                                                while (zbk20 < i103) {
                                                    int i104 = zbk20 + 1;
                                                    int i105 = bArr11[zbk20];
                                                    if (i105 < 0) {
                                                        i104 = zbsr.zbl(i105, bArr11, i104, zbsqVar13);
                                                        i105 = zbsqVar13.zba;
                                                    }
                                                    int i106 = i105 >>> 3;
                                                    int i107 = i105 & 7;
                                                    if (i106 != 1) {
                                                        if (i106 != 2) {
                                                            bArr7 = bArr;
                                                            i29 = i104;
                                                            obj6 = obj15;
                                                            unsafe5 = unsafe13;
                                                        } else if (i107 == zbc.zbc.zba()) {
                                                            int zbO = zbO(bArr, i104, i2, zbc.zbc, zbc.zbd.getClass(), zbsqVar);
                                                            obj15 = zbsqVar.zbc;
                                                            zbk20 = zbO;
                                                            zbsqVar13 = zbsqVar;
                                                            unsafe13 = unsafe13;
                                                            bArr11 = bArr;
                                                        } else {
                                                            unsafe5 = unsafe13;
                                                            bArr7 = bArr;
                                                            i29 = i104;
                                                            obj6 = obj15;
                                                        }
                                                        i30 = i2;
                                                        zbsqVar8 = zbsqVar;
                                                    } else {
                                                        unsafe5 = unsafe13;
                                                        if (i107 == zbc.zba.zba()) {
                                                            int zbO2 = zbO(bArr, i104, i2, zbc.zba, null, zbsqVar);
                                                            obj16 = zbsqVar.zbc;
                                                            zbk20 = zbO2;
                                                            bArr11 = bArr;
                                                            zbsqVar13 = zbsqVar;
                                                            obj15 = obj15;
                                                            unsafe13 = unsafe5;
                                                        } else {
                                                            bArr7 = bArr;
                                                            obj6 = obj15;
                                                            zbsqVar8 = zbsqVar;
                                                            i29 = i104;
                                                            i30 = i2;
                                                        }
                                                    }
                                                    zbk20 = zbsr.zbq(i105, bArr7, i29, i30, zbsqVar8);
                                                    zbsq zbsqVar14 = zbsqVar8;
                                                    obj15 = obj6;
                                                    bArr11 = bArr7;
                                                    zbsqVar13 = zbsqVar14;
                                                    unsafe13 = unsafe5;
                                                }
                                                zbsq zbsqVar15 = zbsqVar13;
                                                bArr10 = bArr11;
                                                Object obj17 = obj15;
                                                i39 = i2;
                                                unsafe = unsafe13;
                                                if (zbk20 == i103) {
                                                    zbvgVar.put(obj16, obj17);
                                                    if (i103 != i24) {
                                                        zbsqVar12 = zbsqVar15;
                                                        i43 = i9;
                                                        i42 = i103;
                                                        obj7 = obj2;
                                                        i40 = i5;
                                                        i44 = i10;
                                                        i47 = i8;
                                                        unsafe6 = unsafe;
                                                        i46 = i23;
                                                        i41 = -1;
                                                        i45 = i11;
                                                    } else {
                                                        i4 = i3;
                                                        bArr2 = bArr10;
                                                        zbsqVar2 = zbsqVar15;
                                                        i7 = i103;
                                                        i12 = i23;
                                                    }
                                                } else {
                                                    fa6.j("Failed to parse the message.");
                                                    return i5;
                                                }
                                            }
                                        } else {
                                            zbsqVar6 = zbsqVar13;
                                            unsafe = unsafe13;
                                            bArr5 = bArr11;
                                        }
                                    } else {
                                        unsafe = unsafe13;
                                        Unsafe unsafe15 = zbb;
                                        long j4 = iArr[i9 + 2] & 1048575;
                                        switch (zbr) {
                                            case 51:
                                                bArr2 = bArr;
                                                i12 = i23;
                                                i25 = i9;
                                                i26 = i24;
                                                zbsqVar2 = zbsqVar;
                                                if (i54 == 1) {
                                                    i27 = i26 + 8;
                                                    unsafe15.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(zbsr.zbr(bArr2, i26))));
                                                    unsafe15.putInt(obj2, j4, i12);
                                                    i42 = i27;
                                                    break;
                                                }
                                                i42 = i26;
                                                break;
                                            case 52:
                                                bArr2 = bArr;
                                                i12 = i23;
                                                i25 = i9;
                                                i26 = i24;
                                                zbsqVar2 = zbsqVar;
                                                if (i54 == 5) {
                                                    i27 = i26 + 4;
                                                    unsafe15.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(zbsr.zbc(bArr2, i26))));
                                                    unsafe15.putInt(obj2, j4, i12);
                                                    i42 = i27;
                                                    break;
                                                }
                                                i42 = i26;
                                                break;
                                            case 53:
                                            case 54:
                                                bArr2 = bArr;
                                                i12 = i23;
                                                i25 = i9;
                                                i26 = i24;
                                                zbsqVar2 = zbsqVar;
                                                if (i54 == 0) {
                                                    i27 = zbsr.zbn(bArr2, i26, zbsqVar2);
                                                    unsafe15.putObject(obj2, j2, Long.valueOf(zbsqVar2.zbb));
                                                    unsafe15.putInt(obj2, j4, i12);
                                                    i42 = i27;
                                                    break;
                                                }
                                                i42 = i26;
                                                break;
                                            case 55:
                                            case 62:
                                                bArr2 = bArr;
                                                i12 = i23;
                                                i25 = i9;
                                                i26 = i24;
                                                zbsqVar2 = zbsqVar;
                                                if (i54 == 0) {
                                                    i27 = zbsr.zbk(bArr2, i26, zbsqVar2);
                                                    unsafe15.putObject(obj2, j2, Integer.valueOf(zbsqVar2.zba));
                                                    unsafe15.putInt(obj2, j4, i12);
                                                    i42 = i27;
                                                    break;
                                                }
                                                i42 = i26;
                                                break;
                                            case 56:
                                            case 65:
                                                bArr2 = bArr;
                                                i12 = i23;
                                                i25 = i9;
                                                i26 = i24;
                                                zbsqVar2 = zbsqVar;
                                                if (i54 == 1) {
                                                    i27 = i26 + 8;
                                                    unsafe15.putObject(obj2, j2, Long.valueOf(zbsr.zbr(bArr2, i26)));
                                                    unsafe15.putInt(obj2, j4, i12);
                                                    i42 = i27;
                                                    break;
                                                }
                                                i42 = i26;
                                                break;
                                            case 57:
                                            case 64:
                                                bArr2 = bArr;
                                                i12 = i23;
                                                i25 = i9;
                                                i26 = i24;
                                                zbsqVar2 = zbsqVar;
                                                if (i54 == 5) {
                                                    i27 = i26 + 4;
                                                    unsafe15.putObject(obj2, j2, Integer.valueOf(zbsr.zbc(bArr2, i26)));
                                                    unsafe15.putInt(obj2, j4, i12);
                                                    i42 = i27;
                                                    break;
                                                }
                                                i42 = i26;
                                                break;
                                            case 58:
                                                bArr2 = bArr;
                                                i12 = i23;
                                                i25 = i9;
                                                i26 = i24;
                                                zbsqVar2 = zbsqVar;
                                                if (i54 == 0) {
                                                    i27 = zbsr.zbn(bArr2, i26, zbsqVar2);
                                                    if (zbsqVar2.zbb != 0) {
                                                        z2 = 1;
                                                    } else {
                                                        z2 = i5;
                                                    }
                                                    unsafe15.putObject(obj2, j2, Boolean.valueOf(z2));
                                                    unsafe15.putInt(obj2, j4, i12);
                                                    i42 = i27;
                                                    break;
                                                }
                                                i42 = i26;
                                                break;
                                            case 59:
                                                bArr2 = bArr;
                                                i12 = i23;
                                                i25 = i9;
                                                i26 = i24;
                                                zbsqVar2 = zbsqVar;
                                                if (i54 == 2) {
                                                    int zbk21 = zbsr.zbk(bArr2, i26, zbsqVar2);
                                                    int i108 = zbsqVar2.zba;
                                                    if (i108 == 0) {
                                                        unsafe15.putObject(obj2, j2, "");
                                                    } else {
                                                        int i109 = i55 & 536870912;
                                                        int i110 = zbk21 + i108;
                                                        if (i109 != 0 && !zbwv.zbd(bArr2, zbk21, i110)) {
                                                            fa6.j("Protocol message had invalid UTF-8.");
                                                            return i5;
                                                        }
                                                        unsafe15.putObject(obj2, j2, new String(bArr2, zbk21, i108, zbuo.zba));
                                                        zbk21 = i110;
                                                    }
                                                    unsafe15.putInt(obj2, j4, i12);
                                                    i42 = zbk21;
                                                    break;
                                                }
                                                i42 = i26;
                                                break;
                                            case Compress.DC /* 60 */:
                                                i12 = i23;
                                                if (i54 == 2) {
                                                    Object zby = zbvpVar.zby(obj2, i12, i9);
                                                    int zbp2 = zbsr.zbp(zby, zbvpVar.zbv(i9), bArr, i24, i2, zbsqVar);
                                                    bArr2 = bArr;
                                                    zbsqVar2 = zbsqVar;
                                                    zbvpVar.zbG(obj2, i12, i9, zby);
                                                    i42 = zbp2;
                                                    i25 = i9;
                                                    i26 = i24;
                                                    break;
                                                } else {
                                                    zbsqVar2 = zbsqVar;
                                                    bArr2 = bArr;
                                                    i25 = i9;
                                                    i26 = i24;
                                                    i42 = i26;
                                                    break;
                                                }
                                            case 61:
                                                bArr6 = bArr;
                                                zbsqVar7 = zbsqVar;
                                                i28 = i24;
                                                i12 = i23;
                                                if (i54 == 2) {
                                                    zba2 = zbsr.zba(bArr6, i28, zbsqVar7);
                                                    unsafe15.putObject(obj2, j2, zbsqVar7.zbc);
                                                    unsafe15.putInt(obj2, j4, i12);
                                                    i42 = zba2;
                                                    i25 = i9;
                                                    zbsqVar2 = zbsqVar7;
                                                    i26 = i28;
                                                    bArr2 = bArr6;
                                                    break;
                                                }
                                                i25 = i9;
                                                zbsqVar2 = zbsqVar7;
                                                i26 = i28;
                                                bArr2 = bArr6;
                                                i42 = i26;
                                                break;
                                            case 63:
                                                bArr6 = bArr;
                                                zbsqVar7 = zbsqVar;
                                                i28 = i24;
                                                i12 = i23;
                                                if (i54 == 0) {
                                                    zba2 = zbsr.zbk(bArr6, i28, zbsqVar7);
                                                    int i111 = zbsqVar7.zba;
                                                    zbuj zbu3 = zbvpVar.zbu(i9);
                                                    if (zbu3 != null && !zbu3.zba(i111)) {
                                                        zbd(obj2).zbj(i11, Long.valueOf(i111));
                                                    } else {
                                                        unsafe15.putObject(obj2, j2, Integer.valueOf(i111));
                                                        unsafe15.putInt(obj2, j4, i12);
                                                    }
                                                    i42 = zba2;
                                                    i25 = i9;
                                                    zbsqVar2 = zbsqVar7;
                                                    i26 = i28;
                                                    bArr2 = bArr6;
                                                    break;
                                                }
                                                i25 = i9;
                                                zbsqVar2 = zbsqVar7;
                                                i26 = i28;
                                                bArr2 = bArr6;
                                                i42 = i26;
                                                break;
                                            case 66:
                                                bArr6 = bArr;
                                                zbsqVar7 = zbsqVar;
                                                i28 = i24;
                                                i12 = i23;
                                                if (i54 == 0) {
                                                    zba2 = zbsr.zbk(bArr6, i28, zbsqVar7);
                                                    unsafe15.putObject(obj2, j2, Integer.valueOf(zbtg.zbb(zbsqVar7.zba)));
                                                    unsafe15.putInt(obj2, j4, i12);
                                                    i42 = zba2;
                                                    i25 = i9;
                                                    zbsqVar2 = zbsqVar7;
                                                    i26 = i28;
                                                    bArr2 = bArr6;
                                                    break;
                                                }
                                                i25 = i9;
                                                zbsqVar2 = zbsqVar7;
                                                i26 = i28;
                                                bArr2 = bArr6;
                                                i42 = i26;
                                                break;
                                            case 67:
                                                bArr6 = bArr;
                                                zbsqVar7 = zbsqVar;
                                                i28 = i24;
                                                i12 = i23;
                                                if (i54 == 0) {
                                                    int zbn4 = zbsr.zbn(bArr6, i28, zbsqVar7);
                                                    unsafe15.putObject(obj2, j2, Long.valueOf(zbtg.zbc(zbsqVar7.zbb)));
                                                    unsafe15.putInt(obj2, j4, i12);
                                                    i25 = i9;
                                                    i42 = zbn4;
                                                    i26 = i28;
                                                    zbsqVar2 = zbsqVar7;
                                                    bArr2 = bArr6;
                                                    break;
                                                }
                                                i25 = i9;
                                                zbsqVar2 = zbsqVar7;
                                                i26 = i28;
                                                bArr2 = bArr6;
                                                i42 = i26;
                                                break;
                                            case 68:
                                                if (i54 == 3) {
                                                    i12 = i23;
                                                    Object zby2 = zbvpVar.zby(obj2, i12, i9);
                                                    i28 = i24;
                                                    int zbo2 = zbsr.zbo(zby2, zbvpVar.zbv(i9), bArr, i28, i2, (i11 & (-8)) | 4, zbsqVar);
                                                    bArr6 = bArr;
                                                    zbsqVar7 = zbsqVar;
                                                    zbvpVar.zbG(obj2, i12, i9, zby2);
                                                    i42 = zbo2;
                                                    i25 = i9;
                                                    zbsqVar2 = zbsqVar7;
                                                    i26 = i28;
                                                    bArr2 = bArr6;
                                                    break;
                                                } else {
                                                    i12 = i23;
                                                    bArr2 = bArr;
                                                    i25 = i9;
                                                    i26 = i24;
                                                    zbsqVar2 = zbsqVar;
                                                    i42 = i26;
                                                    break;
                                                }
                                            default:
                                                bArr2 = bArr;
                                                i12 = i23;
                                                i25 = i9;
                                                i26 = i24;
                                                zbsqVar2 = zbsqVar;
                                                i42 = i26;
                                                break;
                                        }
                                        if (i42 != i26) {
                                            bArr10 = bArr2;
                                            i46 = i12;
                                            zbsqVar12 = zbsqVar2;
                                            obj7 = obj2;
                                            i40 = i5;
                                            i44 = i10;
                                            i47 = i8;
                                            unsafe6 = unsafe;
                                            i43 = i25;
                                            i41 = -1;
                                            i39 = i2;
                                            i45 = i11;
                                        } else {
                                            i4 = i3;
                                            i7 = i42;
                                            i9 = i25;
                                        }
                                    }
                                }
                            }
                            i4 = i3;
                            bArr2 = bArr5;
                            i7 = i24;
                            i12 = i23;
                            zbsqVar2 = zbsqVar6;
                        }
                    }
                    if (i11 != i4 && i4 != 0) {
                        i39 = i2;
                        i42 = i7;
                        obj7 = obj2;
                        i45 = i11;
                        i44 = i10;
                        i47 = i8;
                    } else {
                        if (zbvpVar.zbh) {
                            zbtp zbtpVar = zbsqVar2.zbd;
                            int i112 = zbtp.zbb;
                            int i113 = zbvu.zba;
                            if (zbtpVar != zbtp.zba) {
                                zbvm zbvmVar = zbvpVar.zbg;
                                zbwl zbwlVar2 = zbvpVar.zbl;
                                zbud zbc2 = zbtpVar.zbc(zbvmVar, i12);
                                if (zbc2 == null) {
                                    byte[] bArr12 = bArr2;
                                    i13 = i11;
                                    i39 = i2;
                                    zbj = zbsr.zbj(i13, bArr12, i7, i39, zbd(obj2), zbsqVar2);
                                } else {
                                    i13 = i11;
                                    zbub zbubVar = (zbub) obj2;
                                    zbubVar.zbg();
                                    i39 = i2;
                                    zbj = zbsr.zbb(i13, bArr, i7, i39, zbubVar, zbc2, zbwlVar2, zbsqVar);
                                }
                                i42 = zbj;
                                bArr10 = bArr;
                                zbsqVar12 = zbsqVar;
                                i43 = i9;
                                i46 = i12;
                                obj7 = obj2;
                                i40 = i5;
                                i44 = i10;
                                i47 = i8;
                                i41 = -1;
                                i45 = i13;
                                unsafe6 = unsafe;
                            }
                        }
                        i13 = i11;
                        i39 = i2;
                        zbj = zbsr.zbj(i13, bArr, i7, i39, zbd(obj2), zbsqVar);
                        i42 = zbj;
                        bArr10 = bArr;
                        zbsqVar12 = zbsqVar;
                        i43 = i9;
                        i46 = i12;
                        obj7 = obj2;
                        i40 = i5;
                        i44 = i10;
                        i47 = i8;
                        i41 = -1;
                        i45 = i13;
                        unsafe6 = unsafe;
                    }
                }
                i6 = zbq;
                if (i6 != i41) {
                }
                if (i11 != i4) {
                }
                if (zbvpVar.zbh) {
                }
                i13 = i11;
                i39 = i2;
                zbj = zbsr.zbj(i13, bArr, i7, i39, zbd(obj2), zbsqVar);
                i42 = zbj;
                bArr10 = bArr;
                zbsqVar12 = zbsqVar;
                i43 = i9;
                i46 = i12;
                obj7 = obj2;
                i40 = i5;
                i44 = i10;
                i47 = i8;
                i41 = -1;
                i45 = i13;
                unsafe6 = unsafe;
            } else {
                i4 = i3;
                unsafe = unsafe6;
                i5 = i40;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final Object zbe() {
        return ((zbuf) this.zbg).zbt();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbf(Object obj) {
        if (zbL(obj)) {
            if (obj instanceof zbuf) {
                zbuf zbufVar = (zbuf) obj;
                zbufVar.zbE(Integer.MAX_VALUE);
                zbufVar.zba = 0;
                zbufVar.zbC();
            }
            int[] iArr = this.zbc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zbs = zbs(i);
                int i2 = 1048575 & zbs;
                int zbr = zbr(zbs);
                long j = i2;
                if (zbr != 9) {
                    if (zbr != 60 && zbr != 68) {
                        switch (zbr) {
                            case 18:
                            case 19:
                            case 20:
                            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            case 22:
                            case ConnectionResult.API_DISABLED /* 23 */:
                            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                            case 25:
                            case SubAllocator.N4 /* 26 */:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                            case 36:
                            case 37:
                            case SubAllocator.N_INDEXES /* 38 */:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case Compress.DC20 /* 48 */:
                            case 49:
                                ((zbun) zbws.zbf(obj, j)).zbb();
                                break;
                            case 50:
                                Unsafe unsafe = zbb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zbvg) object).zbc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zbM(obj, this.zbc[i], i)) {
                        zbv(i).zbf(zbb.getObject(obj, j));
                    }
                }
                if (zbI(obj, i)) {
                    zbv(i).zbf(zbb.getObject(obj, j));
                }
            }
            this.zbl.zbb(obj);
            if (this.zbh) {
                this.zbm.zba(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbg(Object obj, Object obj2) {
        zbA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zbc.length; i += 3) {
            int zbs = zbs(i);
            int i2 = 1048575 & zbs;
            int[] iArr = this.zbc;
            int zbr = zbr(zbs);
            int i3 = iArr[i];
            long j = i2;
            switch (zbr) {
                case 0:
                    if (zbI(obj2, i)) {
                        zbws.zbo(obj, j, zbws.zba(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zbI(obj2, i)) {
                        zbws.zbp(obj, j, zbws.zbb(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zbI(obj2, i)) {
                        zbws.zbr(obj, j, zbws.zbd(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zbI(obj2, i)) {
                        zbws.zbr(obj, j, zbws.zbd(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zbI(obj2, i)) {
                        zbws.zbq(obj, j, zbws.zbc(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zbI(obj2, i)) {
                        zbws.zbr(obj, j, zbws.zbd(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zbI(obj2, i)) {
                        zbws.zbq(obj, j, zbws.zbc(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zbI(obj2, i)) {
                        zbws.zbm(obj, j, zbws.zbw(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zbI(obj2, i)) {
                        zbws.zbs(obj, j, zbws.zbf(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zbB(obj, obj2, i);
                    break;
                case 10:
                    if (zbI(obj2, i)) {
                        zbws.zbs(obj, j, zbws.zbf(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zbI(obj2, i)) {
                        zbws.zbq(obj, j, zbws.zbc(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zbI(obj2, i)) {
                        zbws.zbq(obj, j, zbws.zbc(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zbI(obj2, i)) {
                        zbws.zbq(obj, j, zbws.zbc(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zbI(obj2, i)) {
                        zbws.zbr(obj, j, zbws.zbd(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zbI(obj2, i)) {
                        zbws.zbq(obj, j, zbws.zbc(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zbI(obj2, i)) {
                        zbws.zbr(obj, j, zbws.zbd(obj2, j));
                        zbD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zbB(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case SubAllocator.N4 /* 26 */:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                case 36:
                case 37:
                case SubAllocator.N_INDEXES /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case Compress.DC20 /* 48 */:
                case 49:
                    zbun zbunVar = (zbun) zbws.zbf(obj, j);
                    zbun zbunVar2 = (zbun) zbws.zbf(obj2, j);
                    int size = zbunVar.size();
                    int size2 = zbunVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zbunVar.zbc()) {
                            zbunVar = zbunVar.zbd(size2 + size);
                        }
                        zbunVar.addAll(zbunVar2);
                    }
                    if (size > 0) {
                        zbunVar2 = zbunVar;
                    }
                    zbws.zbs(obj, j, zbunVar2);
                    break;
                case 50:
                    int i4 = zbvz.zba;
                    zbws.zbs(obj, j, zbvh.zba(zbws.zbf(obj, j), zbws.zbf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zbM(obj2, i3, i)) {
                        zbws.zbs(obj, j, zbws.zbf(obj2, j));
                        zbE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case Compress.DC /* 60 */:
                    zbC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zbM(obj2, i3, i)) {
                        zbws.zbs(obj, j, zbws.zbf(obj2, j));
                        zbE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zbC(obj, obj2, i);
                    break;
            }
        }
        zbvz.zbp(this.zbl, obj, obj2);
        if (this.zbh) {
            zbvz.zbo(this.zbm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbh(Object obj, byte[] bArr, int i, int i2, zbsq zbsqVar) {
        zbc(obj, bArr, i, i2, 0, zbsqVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0201  */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zbi(Object obj, zbwy zbwyVar) {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        int i4;
        int i5;
        zbvp<T> zbvpVar = this;
        if (zbvpVar.zbh) {
            zbtu zbtuVar = ((zbub) obj).zbb;
            if (!zbtuVar.zba.isEmpty()) {
                Iterator zbg = zbtuVar.zbg();
                entry = (Map.Entry) zbg.next();
                it = zbg;
                iArr = zbvpVar.zbc;
                Unsafe unsafe = zbb;
                i = 0;
                int i6 = 1048575;
                int i7 = 0;
                while (i < iArr.length) {
                    int zbs = zbvpVar.zbs(i);
                    int[] iArr2 = zbvpVar.zbc;
                    int zbr = zbr(zbs);
                    int i8 = iArr2[i];
                    if (zbr <= 17) {
                        int i9 = iArr2[i + 2];
                        int i10 = i9 & 1048575;
                        if (i10 != i6) {
                            i2 = 1;
                            if (i10 == 1048575) {
                                i7 = 0;
                            } else {
                                i7 = unsafe.getInt(obj, i10);
                            }
                            i6 = i10;
                        } else {
                            i2 = 1;
                        }
                        entry2 = entry;
                        i3 = i6;
                        i4 = i7;
                        i5 = i2 << (i9 >>> 20);
                    } else {
                        i2 = 1;
                        entry2 = entry;
                        i3 = i6;
                        i4 = i7;
                        i5 = 0;
                    }
                    while (entry2 != null) {
                        zbuc zbucVar = (zbuc) entry2.getKey();
                        if (i8 >= 32149011) {
                            zbvpVar.zbm.zbb(zbwyVar, entry2);
                            if (it.hasNext()) {
                                entry2 = (Map.Entry) it.next();
                            } else {
                                entry2 = null;
                            }
                        } else {
                            long j = zbs & 1048575;
                            switch (zbr) {
                                case 0:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbf(i8, zbws.zba(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbo(i8, zbws.zbb(obj, j));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 2:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbt(i8, unsafe.getLong(obj, j));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 3:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbL(i8, unsafe.getLong(obj, j));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 4:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbr(i8, unsafe.getInt(obj, j));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 5:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbm(i8, unsafe.getLong(obj, j));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 6:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbk(i8, unsafe.getInt(obj, j));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 7:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbb(i8, zbws.zbw(obj, j));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 8:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbP(i8, unsafe.getObject(obj, j), zbwyVar);
                                    }
                                    zbvpVar = this;
                                    break;
                                case 9:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbw(i8, unsafe.getObject(obj, j), zbvpVar.zbv(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 10:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbd(i8, (zbtc) unsafe.getObject(obj, j));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 11:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbJ(i8, unsafe.getInt(obj, j));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 12:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbi(i8, unsafe.getInt(obj, j));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 13:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zby(i8, unsafe.getInt(obj, j));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 14:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbA(i8, unsafe.getLong(obj, j));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 15:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbC(i8, unsafe.getInt(obj, j));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 16:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbE(i8, unsafe.getLong(obj, j));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 17:
                                    if (zbvpVar.zbJ(obj, i, i3, i4, i5)) {
                                        zbwyVar.zbq(i8, unsafe.getObject(obj, j), zbvpVar.zbv(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 18:
                                    zbvz.zbr(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, false);
                                    break;
                                case 19:
                                    zbvz.zbv(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, false);
                                    break;
                                case 20:
                                    zbvz.zbx(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, false);
                                    break;
                                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                    zbvz.zbD(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, false);
                                    break;
                                case 22:
                                    zbvz.zbw(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, false);
                                    break;
                                case ConnectionResult.API_DISABLED /* 23 */:
                                    zbvz.zbu(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, false);
                                    break;
                                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                    zbvz.zbt(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, false);
                                    break;
                                case 25:
                                    zbvz.zbq(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, false);
                                    break;
                                case SubAllocator.N4 /* 26 */:
                                    int i11 = zbvpVar.zbc[i];
                                    List list = (List) unsafe.getObject(obj, j);
                                    int i12 = zbvz.zba;
                                    if (list != null && !list.isEmpty()) {
                                        zbwyVar.zbI(i11, list);
                                    }
                                    break;
                                case 27:
                                    int i13 = zbvpVar.zbc[i];
                                    List list2 = (List) unsafe.getObject(obj, j);
                                    zbvx zbv = zbvpVar.zbv(i);
                                    int i14 = zbvz.zba;
                                    if (list2 != null && !list2.isEmpty()) {
                                        for (int i15 = 0; i15 < list2.size(); i15++) {
                                            ((zbtl) zbwyVar).zbw(i13, list2.get(i15), zbv);
                                        }
                                    }
                                    break;
                                case 28:
                                    int i16 = zbvpVar.zbc[i];
                                    List list3 = (List) unsafe.getObject(obj, j);
                                    int i17 = zbvz.zba;
                                    if (list3 != null && !list3.isEmpty()) {
                                        zbwyVar.zbe(i16, list3);
                                    }
                                    break;
                                case 29:
                                    zbvz.zbC(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, false);
                                    break;
                                case 30:
                                    zbvz.zbs(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, false);
                                    break;
                                case 31:
                                    zbvz.zby(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, false);
                                    break;
                                case 32:
                                    zbvz.zbz(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, false);
                                    break;
                                case 33:
                                    zbvz.zbA(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, false);
                                    break;
                                case 34:
                                    zbvz.zbB(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, false);
                                    break;
                                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                                    zbvz.zbr(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, i2);
                                    break;
                                case 36:
                                    zbvz.zbv(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, i2);
                                    break;
                                case 37:
                                    zbvz.zbx(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, i2);
                                    break;
                                case SubAllocator.N_INDEXES /* 38 */:
                                    zbvz.zbD(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, i2);
                                    break;
                                case 39:
                                    zbvz.zbw(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, i2);
                                    break;
                                case 40:
                                    zbvz.zbu(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, i2);
                                    break;
                                case 41:
                                    zbvz.zbt(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, i2);
                                    break;
                                case 42:
                                    zbvz.zbq(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, i2);
                                    break;
                                case 43:
                                    zbvz.zbC(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, i2);
                                    break;
                                case 44:
                                    zbvz.zbs(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, i2);
                                    break;
                                case 45:
                                    zbvz.zby(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, i2);
                                    break;
                                case 46:
                                    zbvz.zbz(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, i2);
                                    break;
                                case 47:
                                    zbvz.zbA(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, i2);
                                    break;
                                case Compress.DC20 /* 48 */:
                                    zbvz.zbB(zbvpVar.zbc[i], (List) unsafe.getObject(obj, j), zbwyVar, i2);
                                    break;
                                case 49:
                                    int i18 = zbvpVar.zbc[i];
                                    List list4 = (List) unsafe.getObject(obj, j);
                                    zbvx zbv2 = zbvpVar.zbv(i);
                                    int i19 = zbvz.zba;
                                    if (list4 != null && !list4.isEmpty()) {
                                        for (int i20 = 0; i20 < list4.size(); i20++) {
                                            ((zbtl) zbwyVar).zbq(i18, list4.get(i20), zbv2);
                                        }
                                    }
                                    break;
                                case 50:
                                    Object object = unsafe.getObject(obj, j);
                                    if (object != null) {
                                        zbwyVar.zbv(i8, ((zbvf) zbvpVar.zbw(i)).zbc(), (zbvg) object);
                                    }
                                    break;
                                case 51:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbf(i8, zbm(obj, j));
                                    }
                                    break;
                                case 52:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbo(i8, zbn(obj, j));
                                    }
                                    break;
                                case 53:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbt(i8, zbt(obj, j));
                                    }
                                    break;
                                case 54:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbL(i8, zbt(obj, j));
                                    }
                                    break;
                                case 55:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbr(i8, zbo(obj, j));
                                    }
                                    break;
                                case 56:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbm(i8, zbt(obj, j));
                                    }
                                    break;
                                case 57:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbk(i8, zbo(obj, j));
                                    }
                                    break;
                                case 58:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbb(i8, zbN(obj, j));
                                    }
                                    break;
                                case 59:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbP(i8, unsafe.getObject(obj, j), zbwyVar);
                                    }
                                    break;
                                case Compress.DC /* 60 */:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbw(i8, unsafe.getObject(obj, j), zbvpVar.zbv(i));
                                    }
                                    break;
                                case 61:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbd(i8, (zbtc) unsafe.getObject(obj, j));
                                    }
                                    break;
                                case 62:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbJ(i8, zbo(obj, j));
                                    }
                                    break;
                                case 63:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbi(i8, zbo(obj, j));
                                    }
                                    break;
                                case 64:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zby(i8, zbo(obj, j));
                                    }
                                    break;
                                case 65:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbA(i8, zbt(obj, j));
                                    }
                                    break;
                                case 66:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbC(i8, zbo(obj, j));
                                    }
                                    break;
                                case 67:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbE(i8, zbt(obj, j));
                                    }
                                    break;
                                case 68:
                                    if (zbvpVar.zbM(obj, i8, i)) {
                                        zbwyVar.zbq(i8, unsafe.getObject(obj, j), zbvpVar.zbv(i));
                                    }
                                    break;
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        }
                    }
                    long j2 = zbs & 1048575;
                    switch (zbr) {
                    }
                    i += 3;
                    i7 = i4;
                    i6 = i3;
                    entry = entry2;
                }
                while (entry != null) {
                    zbvpVar.zbm.zbb(zbwyVar, entry);
                    if (it.hasNext()) {
                        entry = (Map.Entry) it.next();
                    } else {
                        entry = null;
                    }
                }
                ((zbuf) obj).zbc.zbl(zbwyVar);
            }
        }
        entry = null;
        it = null;
        iArr = zbvpVar.zbc;
        Unsafe unsafe2 = zbb;
        i = 0;
        int i62 = 1048575;
        int i72 = 0;
        while (i < iArr.length) {
        }
        while (entry != null) {
        }
        ((zbuf) obj).zbc.zbl(zbwyVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbj(Object obj, Object obj2) {
        boolean zbE;
        for (int i = 0; i < this.zbc.length; i += 3) {
            int zbs = zbs(i);
            long j = zbs & 1048575;
            switch (zbr(zbs)) {
                case 0:
                    if (zbH(obj, obj2, i) && Double.doubleToLongBits(zbws.zba(obj, j)) == Double.doubleToLongBits(zbws.zba(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zbH(obj, obj2, i) && Float.floatToIntBits(zbws.zbb(obj, j)) == Float.floatToIntBits(zbws.zbb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zbH(obj, obj2, i) && zbws.zbd(obj, j) == zbws.zbd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zbH(obj, obj2, i) && zbws.zbd(obj, j) == zbws.zbd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zbH(obj, obj2, i) && zbws.zbc(obj, j) == zbws.zbc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zbH(obj, obj2, i) && zbws.zbd(obj, j) == zbws.zbd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zbH(obj, obj2, i) && zbws.zbc(obj, j) == zbws.zbc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zbH(obj, obj2, i) && zbws.zbw(obj, j) == zbws.zbw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zbH(obj, obj2, i) && zbvz.zbE(zbws.zbf(obj, j), zbws.zbf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zbH(obj, obj2, i) && zbvz.zbE(zbws.zbf(obj, j), zbws.zbf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zbH(obj, obj2, i) && zbvz.zbE(zbws.zbf(obj, j), zbws.zbf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zbH(obj, obj2, i) && zbws.zbc(obj, j) == zbws.zbc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zbH(obj, obj2, i) && zbws.zbc(obj, j) == zbws.zbc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zbH(obj, obj2, i) && zbws.zbc(obj, j) == zbws.zbc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zbH(obj, obj2, i) && zbws.zbd(obj, j) == zbws.zbd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zbH(obj, obj2, i) && zbws.zbc(obj, j) == zbws.zbc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zbH(obj, obj2, i) && zbws.zbd(obj, j) == zbws.zbd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zbH(obj, obj2, i) && zbvz.zbE(zbws.zbf(obj, j), zbws.zbf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case SubAllocator.N4 /* 26 */:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                case 36:
                case 37:
                case SubAllocator.N_INDEXES /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case Compress.DC20 /* 48 */:
                case 49:
                    zbE = zbvz.zbE(zbws.zbf(obj, j), zbws.zbf(obj2, j));
                    break;
                case 50:
                    zbE = zbvz.zbE(zbws.zbf(obj, j), zbws.zbf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case Compress.DC /* 60 */:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zbp = zbp(i) & 1048575;
                    if (zbws.zbc(obj, zbp) == zbws.zbc(obj2, zbp) && zbvz.zbE(zbws.zbf(obj, j), zbws.zbf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zbE) {
                return false;
            }
        }
        if (!((zbuf) obj).zbc.equals(((zbuf) obj2).zbc)) {
            return false;
        }
        if (this.zbh) {
            return ((zbub) obj).zbb.equals(((zbub) obj2).zbb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.zbj) {
            int[] iArr = this.zbi;
            int[] iArr2 = this.zbc;
            int i6 = iArr[i3];
            int i7 = iArr2[i6];
            int zbs = this.zbs(i6);
            int i8 = this.zbc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i4 = zbb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i5;
                i2 = i4;
            }
            zbvp<T> zbvpVar = this;
            Object obj2 = obj;
            if ((268435456 & zbs) != 0 && !zbvpVar.zbJ(obj2, i6, i, i2, i10)) {
                return false;
            }
            int zbr = zbr(zbs);
            if (zbr != 9 && zbr != 17) {
                if (zbr != 27) {
                    if (zbr != 60 && zbr != 68) {
                        if (zbr != 49) {
                            if (zbr != 50) {
                                continue;
                            } else {
                                zbvg zbvgVar = (zbvg) zbws.zbf(obj2, zbs & 1048575);
                                if (!zbvgVar.isEmpty() && ((zbvf) zbvpVar.zbw(i6)).zbc().zbc.zbb() == zbwx.MESSAGE) {
                                    zbvx zbvxVar = null;
                                    for (Object obj3 : zbvgVar.values()) {
                                        if (zbvxVar == null) {
                                            zbvxVar = zbvu.zba().zbb(obj3.getClass());
                                        }
                                        if (!zbvxVar.zbk(obj3)) {
                                            return false;
                                        }
                                    }
                                    continue;
                                }
                            }
                        }
                    } else if (zbvpVar.zbM(obj2, i7, i6) && !zbK(obj2, zbs, zbvpVar.zbv(i6))) {
                        return false;
                    }
                }
                List list = (List) zbws.zbf(obj2, zbs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zbvx zbv = zbvpVar.zbv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zbv.zbk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zbvpVar.zbJ(obj2, i6, i, i2, i10) && !zbK(obj2, zbs, zbvpVar.zbv(i6))) {
                return false;
            }
            i3++;
            this = zbvpVar;
            obj = obj2;
            i5 = i;
            i4 = i2;
        }
        Object obj4 = obj;
        if (this.zbh && !((zbub) obj4).zbb.zbm()) {
            return false;
        }
        return true;
    }
}
