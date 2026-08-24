package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.mlkit.vision.common.InputImage;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i54  reason: default package */
/* loaded from: classes.dex */
public final class i54 implements j66 {
    public static final int[] o = new int[0];
    public static final Unsafe p = gh7.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final c1 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final mf4 k;
    public final ow3 l;
    public final ng7 m;
    public final y04 n;

    public i54(int[] iArr, Object[] objArr, int i, int i2, c1 c1Var, boolean z, int[] iArr2, int i3, int i4, mf4 mf4Var, ow3 ow3Var, ng7 ng7Var, i82 i82Var, y04 y04Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = c1Var instanceof pr2;
        this.g = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = mf4Var;
        this.l = ow3Var;
        this.m = ng7Var;
        this.e = c1Var;
        this.n = y04Var;
    }

    public static long A(int i) {
        return i & 1048575;
    }

    public static int B(long j, Object obj) {
        return ((Integer) gh7.d.i(j, obj)).intValue();
    }

    public static long C(long j, Object obj) {
        return ((Long) gh7.d.i(j, obj)).longValue();
    }

    public static Field K(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder t = i61.t("Field ", str, " for ");
            t.append(cls.getName());
            t.append(" not found. Known fields are ");
            t.append(Arrays.toString(declaredFields));
            throw new RuntimeException(t.toString());
        }
    }

    public static int O(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void R(int i, Object obj, os0 os0Var) {
        if (obj instanceof String) {
            String str = (String) obj;
            ms0 ms0Var = (ms0) os0Var.B;
            ms0Var.r(i, 2);
            int i2 = ms0Var.c;
            byte[] bArr = ms0Var.b;
            int i3 = ms0Var.d;
            try {
                int i4 = ms0.i(str.length() * 3);
                int i5 = ms0.i(str.length());
                if (i5 == i4) {
                    int i6 = i3 + i5;
                    ms0Var.d = i6;
                    int n = xj7.a.n(str, bArr, i6, i2 - i6);
                    ms0Var.d = i3;
                    ms0Var.s((n - i3) - i5);
                    ms0Var.d = n;
                    return;
                }
                ms0Var.s(xj7.b(str));
                int i7 = ms0Var.d;
                ms0Var.d = xj7.a.n(str, bArr, i7, i2 - i7);
                return;
            } catch (IndexOutOfBoundsException e) {
                throw new ns0(e);
            } catch (wj7 e2) {
                ms0Var.d = i3;
                ms0.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                byte[] bytes = str.getBytes(aa3.a);
                try {
                    ms0Var.s(bytes.length);
                    ms0Var.l(bytes, 0, bytes.length);
                    return;
                } catch (IndexOutOfBoundsException e3) {
                    throw new ns0(e3);
                } catch (ns0 e4) {
                    throw e4;
                }
            }
        }
        os0Var.i0(i, (ea0) obj);
    }

    public static mg7 p(Object obj) {
        pr2 pr2Var = (pr2) obj;
        mg7 mg7Var = pr2Var.unknownFields;
        if (mg7Var == mg7.f) {
            mg7 b = mg7.b();
            pr2Var.unknownFields = b;
            return b;
        }
        return mg7Var;
    }

    public static List u(long j, Object obj) {
        return (List) gh7.d.i(j, obj);
    }

    public static i54 y(wd5 wd5Var, mf4 mf4Var, ow3 ow3Var, ng7 ng7Var, i82 i82Var, y04 y04Var) {
        if (wd5Var instanceof wd5) {
            return z(wd5Var, mf4Var, ow3Var, ng7Var, i82Var, y04Var);
        }
        u34.a();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i54 z(wd5 wd5Var, mf4 mf4Var, ow3 ow3Var, ng7 ng7Var, i82 i82Var, y04 y04Var) {
        u45 u45Var;
        boolean z;
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int[] iArr2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field K;
        char charAt11;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field K2;
        Object obj2;
        Field K3;
        int i29;
        char charAt12;
        int i30;
        char charAt13;
        int i31;
        int i32;
        char charAt14;
        int i33;
        char charAt15;
        char charAt16;
        if ((wd5Var.d & 1) == 1) {
            u45Var = u45.PROTO2;
        } else {
            u45Var = u45.PROTO3;
        }
        int i34 = 0;
        if (u45Var == u45.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        String str = wd5Var.b;
        int length = str.length();
        int charAt17 = str.charAt(0);
        if (charAt17 >= 55296) {
            int i35 = charAt17 & 8191;
            int i36 = 1;
            int i37 = 13;
            while (true) {
                i = i36 + 1;
                charAt16 = str.charAt(i36);
                if (charAt16 < 55296) {
                    break;
                }
                i35 |= (charAt16 & 8191) << i37;
                i37 += 13;
                i36 = i;
            }
            charAt17 = i35 | (charAt16 << i37);
        } else {
            i = 1;
        }
        int i38 = i + 1;
        int charAt18 = str.charAt(i);
        if (charAt18 >= 55296) {
            int i39 = charAt18 & 8191;
            int i40 = 13;
            while (true) {
                i33 = i38 + 1;
                charAt15 = str.charAt(i38);
                if (charAt15 < 55296) {
                    break;
                }
                i39 |= (charAt15 & 8191) << i40;
                i40 += 13;
                i38 = i33;
            }
            charAt18 = i39 | (charAt15 << i40);
            i38 = i33;
        }
        if (charAt18 == 0) {
            i5 = 0;
            charAt = 0;
            i6 = 0;
            charAt2 = 0;
            i3 = 0;
            iArr = o;
            i4 = 0;
        } else {
            int i41 = i38 + 1;
            int charAt19 = str.charAt(i38);
            if (charAt19 >= 55296) {
                int i42 = charAt19 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    charAt10 = str.charAt(i41);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i42 |= (charAt10 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                charAt19 = i42 | (charAt10 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int charAt20 = str.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    charAt9 = str.charAt(i44);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i45 |= (charAt9 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                charAt20 = i45 | (charAt9 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            charAt = str.charAt(i44);
            if (charAt >= 55296) {
                int i48 = charAt & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    charAt8 = str.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                charAt = i48 | (charAt8 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            int charAt21 = str.charAt(i47);
            if (charAt21 >= 55296) {
                int i51 = charAt21 & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    charAt7 = str.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                charAt21 = i51 | (charAt7 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int charAt22 = str.charAt(i50);
            if (charAt22 >= 55296) {
                int i54 = charAt22 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    charAt6 = str.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                charAt22 = i54 | (charAt6 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            charAt2 = str.charAt(i53);
            if (charAt2 >= 55296) {
                int i57 = charAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    charAt5 = str.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                charAt2 = i57 | (charAt5 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int charAt23 = str.charAt(i56);
            if (charAt23 >= 55296) {
                int i60 = charAt23 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i8 = i61 + 1;
                    charAt4 = str.charAt(i61);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i61 = i8;
                }
                charAt23 = i60 | (charAt4 << i62);
                i2 = i8;
            } else {
                i2 = i59;
            }
            int i63 = i2 + 1;
            int charAt24 = str.charAt(i2);
            if (charAt24 >= 55296) {
                int i64 = charAt24 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i7 = i65 + 1;
                    charAt3 = str.charAt(i65);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i64 |= (charAt3 & 8191) << i66;
                    i66 += 13;
                    i65 = i7;
                }
                charAt24 = i64 | (charAt3 << i66);
                i63 = i7;
            }
            i3 = (charAt19 * 2) + charAt20;
            i4 = charAt21;
            iArr = new int[charAt24 + charAt2 + charAt23];
            i5 = charAt22;
            i6 = charAt24;
            i34 = charAt19;
            i38 = i63;
        }
        Unsafe unsafe = p;
        Object[] objArr = wd5Var.c;
        int i67 = i34;
        Class<?> cls = wd5Var.a.getClass();
        int i68 = charAt17;
        int[] iArr3 = new int[i5 * 3];
        Object[] objArr2 = new Object[i5 * 2];
        int i69 = charAt2 + i6;
        int i70 = i6;
        int i71 = i69;
        int i72 = 0;
        int i73 = 0;
        while (i38 < length) {
            int i74 = i38 + 1;
            int charAt25 = str.charAt(i38);
            int i75 = length;
            if (charAt25 >= 55296) {
                int i76 = charAt25 & 8191;
                int i77 = i74;
                int i78 = 13;
                while (true) {
                    i32 = i77 + 1;
                    charAt14 = str.charAt(i77);
                    iArr2 = iArr3;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i76 |= (charAt14 & 8191) << i78;
                    i78 += 13;
                    i77 = i32;
                    iArr3 = iArr2;
                }
                charAt25 = i76 | (charAt14 << i78);
                i15 = i32;
            } else {
                iArr2 = iArr3;
                i15 = i74;
            }
            int i79 = i15 + 1;
            int charAt26 = str.charAt(i15);
            if (charAt26 >= 55296) {
                int i80 = charAt26 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i30 = i81 + 1;
                    charAt13 = str.charAt(i81);
                    i31 = i80;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i80 = i31 | ((charAt13 & 8191) << i82);
                    i82 += 13;
                    i81 = i30;
                }
                charAt26 = i31 | (charAt13 << i82);
                i16 = i30;
            } else {
                i16 = i79;
            }
            Object[] objArr3 = objArr2;
            int i83 = charAt26 & 255;
            Object[] objArr4 = objArr;
            if ((charAt26 & 1024) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int i84 = charAt25;
            if (i83 >= 51) {
                int i85 = i16 + 1;
                int charAt27 = str.charAt(i16);
                char c = 55296;
                if (charAt27 >= 55296) {
                    int i86 = charAt27 & 8191;
                    int i87 = 13;
                    while (true) {
                        i29 = i85 + 1;
                        charAt12 = str.charAt(i85);
                        if (charAt12 < c) {
                            break;
                        }
                        i86 |= (charAt12 & 8191) << i87;
                        i87 += 13;
                        i85 = i29;
                        c = 55296;
                    }
                    charAt27 = i86 | (charAt12 << i87);
                    i85 = i29;
                }
                int i88 = i83 - 51;
                int i89 = charAt27;
                if (i88 != 9 && i88 != 17) {
                    if (i88 == 12 && (i68 & 1) == 1) {
                        i28 = i3 + 1;
                        objArr3[((i73 / 3) * 2) + 1] = objArr4[i3];
                    }
                    int i90 = i89 * 2;
                    obj = objArr4[i90];
                    if (!(obj instanceof Field)) {
                        K2 = (Field) obj;
                    } else {
                        K2 = K(cls, (String) obj);
                        objArr4[i90] = K2;
                    }
                    int i91 = i85;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(K2);
                    int i92 = i90 + 1;
                    obj2 = objArr4[i92];
                    if (!(obj2 instanceof Field)) {
                        K3 = (Field) obj2;
                    } else {
                        K3 = K(cls, (String) obj2);
                        objArr4[i92] = K3;
                    }
                    int i93 = i3;
                    i18 = charAt;
                    i23 = i93;
                    i38 = i91;
                    i24 = objectFieldOffset2;
                    i17 = i4;
                    i22 = (int) unsafe.objectFieldOffset(K3);
                    i21 = 0;
                } else {
                    i28 = i3 + 1;
                    objArr3[((i73 / 3) * 2) + 1] = objArr4[i3];
                }
                i3 = i28;
                int i902 = i89 * 2;
                obj = objArr4[i902];
                if (!(obj instanceof Field)) {
                }
                int i912 = i85;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(K2);
                int i922 = i902 + 1;
                obj2 = objArr4[i922];
                if (!(obj2 instanceof Field)) {
                }
                int i932 = i3;
                i18 = charAt;
                i23 = i932;
                i38 = i912;
                i24 = objectFieldOffset22;
                i17 = i4;
                i22 = (int) unsafe.objectFieldOffset(K3);
                i21 = 0;
            } else {
                int i94 = i3 + 1;
                Field K4 = K(cls, (String) objArr4[i3]);
                if (i83 == 9 || i83 == 17) {
                    i17 = i4;
                    objArr3[((i73 / 3) * 2) + 1] = K4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i17 = i4;
                        i25 = i3 + 2;
                        objArr3[((i73 / 3) * 2) + 1] = objArr4[i94];
                    } else if (i83 != 12 && i83 != 30 && i83 != 44) {
                        if (i83 == 50) {
                            int i95 = i70 + 1;
                            iArr[i70] = i73;
                            int i96 = (i73 / 3) * 2;
                            int i97 = i3 + 2;
                            objArr3[i96] = objArr4[i94];
                            if ((charAt26 & 2048) != 0) {
                                i19 = i3 + 3;
                                objArr3[i96 + 1] = objArr4[i97];
                                i17 = i4;
                                i18 = charAt;
                                i70 = i95;
                            } else {
                                i18 = charAt;
                                i19 = i97;
                                i70 = i95;
                                i17 = i4;
                            }
                            objectFieldOffset = (int) unsafe.objectFieldOffset(K4);
                            if ((i68 & 1) != 1 && i83 <= 17) {
                                int i98 = i16 + 1;
                                int charAt28 = str.charAt(i16);
                                if (charAt28 >= 55296) {
                                    int i99 = charAt28 & 8191;
                                    int i100 = 13;
                                    while (true) {
                                        i20 = i98 + 1;
                                        charAt11 = str.charAt(i98);
                                        if (charAt11 < 55296) {
                                            break;
                                        }
                                        i99 |= (charAt11 & 8191) << i100;
                                        i100 += 13;
                                        i98 = i20;
                                    }
                                    charAt28 = i99 | (charAt11 << i100);
                                } else {
                                    i20 = i98;
                                }
                                int i101 = (charAt28 / 32) + (i67 * 2);
                                Object obj3 = objArr4[i101];
                                if (obj3 instanceof Field) {
                                    K = (Field) obj3;
                                } else {
                                    K = K(cls, (String) obj3);
                                    objArr4[i101] = K;
                                }
                                i22 = (int) unsafe.objectFieldOffset(K);
                                i21 = charAt28 % 32;
                            } else {
                                i20 = i16;
                                i21 = 0;
                                i22 = 0;
                            }
                            if (i83 >= 18 && i83 <= 49) {
                                iArr[i71] = objectFieldOffset;
                                i71++;
                            }
                            i23 = i19;
                            i24 = objectFieldOffset;
                            i38 = i20;
                        } else {
                            i17 = i4;
                        }
                    } else {
                        i17 = i4;
                        if ((i68 & 1) == 1) {
                            i25 = i3 + 2;
                            objArr3[((i73 / 3) * 2) + 1] = objArr4[i94];
                        }
                    }
                    i19 = i25;
                    i18 = charAt;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(K4);
                    if ((i68 & 1) != 1) {
                    }
                    i20 = i16;
                    i21 = 0;
                    i22 = 0;
                    if (i83 >= 18) {
                        iArr[i71] = objectFieldOffset;
                        i71++;
                    }
                    i23 = i19;
                    i24 = objectFieldOffset;
                    i38 = i20;
                }
                i18 = charAt;
                i19 = i94;
                objectFieldOffset = (int) unsafe.objectFieldOffset(K4);
                if ((i68 & 1) != 1) {
                }
                i20 = i16;
                i21 = 0;
                i22 = 0;
                if (i83 >= 18) {
                }
                i23 = i19;
                i24 = objectFieldOffset;
                i38 = i20;
            }
            int i102 = i73 + 1;
            iArr2[i73] = i84;
            int i103 = i73 + 2;
            String str2 = str;
            if ((charAt26 & 512) != 0) {
                i26 = 536870912;
            } else {
                i26 = 0;
            }
            if ((charAt26 & 256) != 0) {
                i27 = 268435456;
            } else {
                i27 = 0;
            }
            iArr2[i102] = i26 | i27 | (i83 << 20) | i24;
            i73 += 3;
            iArr2[i103] = (i21 << 20) | i22;
            int i104 = i18;
            i3 = i23;
            charAt = i104;
            objArr2 = objArr3;
            length = i75;
            objArr = objArr4;
            iArr3 = iArr2;
            i4 = i17;
            str = str2;
        }
        return new i54(iArr3, objArr2, charAt, i4, wd5Var.a, z, iArr, i6, i69, mf4Var, ow3Var, ng7Var, i82Var, y04Var);
    }

    public final void D(Object obj, long j, int i) {
        Unsafe unsafe = p;
        Object n = n(i);
        Object object = unsafe.getObject(obj, j);
        this.n.getClass();
        if (!((x04) object).A) {
            x04 c = x04.B.c();
            y04.b(c, object);
            unsafe.putObject(obj, j, c);
        }
        xg6.A(n);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int E(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ou ouVar) {
        Unsafe unsafe = p;
        long j2 = this.a[i8 + 2] & 1048575;
        Object obj2 = null;
        boolean z = true;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(hv.o(bArr, i))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(hv.n(bArr, i))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int y = hv.y(bArr, i, ouVar);
                unsafe.putObject(obj, j, Long.valueOf(ouVar.b));
                unsafe.putInt(obj, j2, i4);
                return y;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int w = hv.w(bArr, i, ouVar);
                unsafe.putObject(obj, j, Integer.valueOf(ouVar.a));
                unsafe.putInt(obj, j2, i4);
                return w;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(hv.o(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(hv.n(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int y2 = hv.y(bArr, i, ouVar);
                if (ouVar.b == 0) {
                    z = false;
                }
                unsafe.putObject(obj, j, Boolean.valueOf(z));
                unsafe.putInt(obj, j2, i4);
                return y2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int w2 = hv.w(bArr, i, ouVar);
                int i13 = ouVar.a;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!xj7.a.z(bArr, w2, w2 + i13)) {
                            throw ub3.a();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, w2, i13, aa3.a));
                    w2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return w2;
            case Compress.DC /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                int q = hv.q(o(i8), bArr, i, i2, ouVar);
                if (unsafe.getInt(obj, j2) == i4) {
                    obj2 = unsafe.getObject(obj, j);
                }
                Object obj3 = ouVar.c;
                if (obj2 == null) {
                    unsafe.putObject(obj, j, obj3);
                } else {
                    unsafe.putObject(obj, j, aa3.c(obj2, obj3));
                }
                unsafe.putInt(obj, j2, i4);
                return q;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int m = hv.m(bArr, i, ouVar);
                unsafe.putObject(obj, j, ouVar.c);
                unsafe.putInt(obj, j2, i4);
                return m;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int w3 = hv.w(bArr, i, ouVar);
                int i14 = ouVar.a;
                y93 m2 = m(i8);
                if (m2 != null && !m2.a(i14)) {
                    p(obj).c(i3, Long.valueOf(i14));
                    return w3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return w3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int w4 = hv.w(bArr, i, ouVar);
                unsafe.putObject(obj, j, Integer.valueOf(ks0.a(ouVar.a)));
                unsafe.putInt(obj, j2, i4);
                return w4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int y3 = hv.y(bArr, i, ouVar);
                unsafe.putObject(obj, j, Long.valueOf(ks0.b(ouVar.b)));
                unsafe.putInt(obj, j2, i4);
                return y3;
            case 68:
                if (i5 == 3) {
                    int p2 = hv.p(o(i8), bArr, i, i2, (i3 & (-8)) | 4, ouVar);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    }
                    Object obj4 = ouVar.c;
                    if (obj2 == null) {
                        unsafe.putObject(obj, j, obj4);
                    } else {
                        unsafe.putObject(obj, j, aa3.c(obj2, obj4));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return p2;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x046b, code lost:
        if (r8 == r15) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x046d, code lost:
        r24.putInt(r10, r8, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0473, code lost:
        r0 = r9.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0477, code lost:
        if (r0 >= r9.j) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0479, code lost:
        r9.l(r9.h[r0], r10, r30);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0485, code lost:
        if (r11 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0487, code lost:
        if (r3 != r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x048e, code lost:
        throw defpackage.ub3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x048f, code lost:
        if (r3 > r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0491, code lost:
        if (r7 != r11) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0493, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0498, code lost:
        throw defpackage.ub3.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F(Object obj, byte[] bArr, int i, int i2, int i3, ou ouVar) {
        int i4;
        Object obj2;
        Unsafe unsafe;
        Object obj3;
        int i5;
        i54 i54Var;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Unsafe unsafe2;
        int i14;
        int i15;
        int i16;
        Object obj4;
        int i17;
        byte[] bArr2;
        int i18;
        boolean z;
        int t;
        Unsafe unsafe3;
        Unsafe unsafe4;
        byte[] bArr3;
        int i19;
        int i20;
        int i21;
        Object obj5;
        int E;
        int i22;
        i54 i54Var2 = this;
        Object obj6 = obj;
        byte[] bArr4 = bArr;
        int i23 = i2;
        ou ouVar2 = ouVar;
        Unsafe unsafe5 = p;
        int i24 = i;
        int i25 = -1;
        int i26 = 0;
        int i27 = 0;
        int i28 = -1;
        int i29 = 0;
        while (true) {
            if (i24 < i23) {
                int i30 = i24 + 1;
                int i31 = bArr4[i24];
                if (i31 < 0) {
                    i30 = hv.v(i31, bArr4, i30, ouVar2);
                    i31 = ouVar2.a;
                }
                int i32 = i30;
                int i33 = i31;
                i24 = i32;
                int i34 = i33 >>> 3;
                int i35 = i33 & 7;
                int i36 = i54Var2.d;
                int i37 = i54Var2.c;
                if (i34 > i25) {
                    int i38 = i26 / 3;
                    if (i34 >= i37 && i34 <= i36) {
                        i7 = i54Var2.N(i34, i38);
                    } else {
                        i7 = -1;
                    }
                    i6 = 0;
                } else if (i34 >= i37 && i34 <= i36) {
                    i6 = 0;
                    i7 = i54Var2.N(i34, 0);
                } else {
                    i6 = 0;
                    i7 = -1;
                }
                int i39 = i7;
                if (i39 == -1) {
                    i4 = i3;
                    i5 = -1;
                    unsafe = unsafe5;
                    int i40 = i6;
                    i8 = i34;
                    obj3 = null;
                    i54Var = i54Var2;
                    obj2 = obj6;
                    i9 = i33;
                    i10 = i28;
                    i11 = i40;
                } else {
                    int[] iArr = i54Var2.a;
                    int i41 = iArr[i39 + 1];
                    int O = O(i41);
                    long j = i41 & 1048575;
                    if (O <= 17) {
                        int i42 = iArr[i39 + 2];
                        int i43 = 1 << (i42 >>> 20);
                        int i44 = i42 & 1048575;
                        if (i44 != i28) {
                            if (i28 != -1) {
                                unsafe5.putInt(obj6, i28, i29);
                            }
                            i13 = i44;
                            i12 = unsafe5.getInt(obj6, i44);
                        } else {
                            i12 = i29;
                            i13 = i28;
                        }
                        switch (O) {
                            case 0:
                                unsafe3 = unsafe5;
                                i14 = i33;
                                i16 = i24;
                                ouVar2 = ouVar;
                                i15 = -1;
                                if (i35 != 1) {
                                    obj4 = obj6;
                                    i24 = i16;
                                    unsafe = unsafe3;
                                    i11 = i39;
                                    i9 = i14;
                                    i5 = i15;
                                    i8 = i34;
                                    obj3 = null;
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj4;
                                    i10 = i13;
                                    i29 = i12;
                                    break;
                                } else {
                                    gh7.d.m(obj6, j, Double.longBitsToDouble(hv.o(bArr, i16)));
                                    i24 = i16 + 8;
                                    obj6 = obj6;
                                    bArr4 = bArr;
                                    i28 = i13;
                                    i29 = i12 | i43;
                                    i23 = i2;
                                    unsafe5 = unsafe3;
                                    i26 = i39;
                                    i27 = i14;
                                    i25 = i34;
                                    break;
                                }
                            case 1:
                                unsafe3 = unsafe5;
                                i14 = i33;
                                i16 = i24;
                                ouVar2 = ouVar;
                                i15 = -1;
                                if (i35 != 5) {
                                    obj4 = obj6;
                                    i24 = i16;
                                    unsafe = unsafe3;
                                    i11 = i39;
                                    i9 = i14;
                                    i5 = i15;
                                    i8 = i34;
                                    obj3 = null;
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj4;
                                    i10 = i13;
                                    i29 = i12;
                                    break;
                                } else {
                                    gh7.d.n(obj6, j, Float.intBitsToFloat(hv.n(bArr, i16)));
                                    i24 = i16 + 4;
                                    int i45 = i13;
                                    i29 = i12 | i43;
                                    bArr4 = bArr;
                                    i28 = i45;
                                    i23 = i2;
                                    unsafe5 = unsafe3;
                                    i26 = i39;
                                    i27 = i14;
                                    i25 = i34;
                                    break;
                                }
                            case 2:
                            case 3:
                                unsafe4 = unsafe5;
                                i14 = i33;
                                i16 = i24;
                                ouVar2 = ouVar;
                                i15 = -1;
                                if (i35 != 0) {
                                    unsafe3 = unsafe4;
                                    obj4 = obj6;
                                    i24 = i16;
                                    unsafe = unsafe3;
                                    i11 = i39;
                                    i9 = i14;
                                    i5 = i15;
                                    i8 = i34;
                                    obj3 = null;
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj4;
                                    i10 = i13;
                                    i29 = i12;
                                    break;
                                } else {
                                    int y = hv.y(bArr, i16, ouVar2);
                                    unsafe4.putLong(obj6, j, ouVar2.b);
                                    unsafe3 = unsafe4;
                                    int i46 = i13;
                                    i29 = i12 | i43;
                                    bArr4 = bArr;
                                    i28 = i46;
                                    i23 = i2;
                                    i24 = y;
                                    unsafe5 = unsafe3;
                                    i26 = i39;
                                    i27 = i14;
                                    i25 = i34;
                                    break;
                                }
                            case 4:
                            case 11:
                                unsafe4 = unsafe5;
                                i14 = i33;
                                i16 = i24;
                                ouVar2 = ouVar;
                                i15 = -1;
                                if (i35 == 0) {
                                    int w = hv.w(bArr, i16, ouVar2);
                                    unsafe4.putInt(obj6, j, ouVar2.a);
                                    i23 = i2;
                                    unsafe5 = unsafe4;
                                    bArr4 = bArr;
                                    i26 = i39;
                                    i28 = i13;
                                    i27 = i14;
                                    i29 = i12 | i43;
                                    i24 = w;
                                    i25 = i34;
                                    break;
                                } else {
                                    unsafe3 = unsafe4;
                                    obj4 = obj6;
                                    i24 = i16;
                                    unsafe = unsafe3;
                                    i11 = i39;
                                    i9 = i14;
                                    i5 = i15;
                                    i8 = i34;
                                    obj3 = null;
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj4;
                                    i10 = i13;
                                    i29 = i12;
                                    break;
                                }
                            case 5:
                            case 14:
                                unsafe2 = unsafe5;
                                i14 = i33;
                                ouVar2 = ouVar;
                                i15 = -1;
                                if (i35 == 1) {
                                    unsafe2.putLong(obj6, j, hv.o(bArr, i24));
                                    i24 += 8;
                                    i17 = i12 | i43;
                                    unsafe5 = unsafe2;
                                    bArr4 = bArr;
                                    i26 = i39;
                                    i28 = i13;
                                    i27 = i14;
                                    i25 = i34;
                                    i29 = i17;
                                    i23 = i2;
                                    break;
                                } else {
                                    i16 = i24;
                                    obj4 = obj6;
                                    unsafe3 = unsafe2;
                                    i24 = i16;
                                    unsafe = unsafe3;
                                    i11 = i39;
                                    i9 = i14;
                                    i5 = i15;
                                    i8 = i34;
                                    obj3 = null;
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj4;
                                    i10 = i13;
                                    i29 = i12;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                unsafe2 = unsafe5;
                                i14 = i33;
                                i18 = i24;
                                ouVar2 = ouVar;
                                i15 = -1;
                                if (i35 != 5) {
                                    obj4 = obj6;
                                    i16 = i18;
                                    unsafe3 = unsafe2;
                                    i24 = i16;
                                    unsafe = unsafe3;
                                    i11 = i39;
                                    i9 = i14;
                                    i5 = i15;
                                    i8 = i34;
                                    obj3 = null;
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj4;
                                    i10 = i13;
                                    i29 = i12;
                                    break;
                                } else {
                                    unsafe2.putInt(obj6, j, hv.n(bArr2, i18));
                                    i24 = i18 + 4;
                                    int i47 = i13;
                                    i29 = i12 | i43;
                                    bArr4 = bArr2;
                                    i28 = i47;
                                    unsafe5 = unsafe2;
                                    i26 = i39;
                                    i27 = i14;
                                    i25 = i34;
                                    i23 = i2;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                unsafe2 = unsafe5;
                                i14 = i33;
                                i18 = i24;
                                ouVar2 = ouVar;
                                i15 = -1;
                                if (i35 != 0) {
                                    obj4 = obj6;
                                    i16 = i18;
                                    unsafe3 = unsafe2;
                                    i24 = i16;
                                    unsafe = unsafe3;
                                    i11 = i39;
                                    i9 = i14;
                                    i5 = i15;
                                    i8 = i34;
                                    obj3 = null;
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj4;
                                    i10 = i13;
                                    i29 = i12;
                                    break;
                                } else {
                                    i24 = hv.y(bArr2, i18, ouVar2);
                                    if (ouVar2.b != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    gh7.d.k(obj6, j, z);
                                    int i472 = i13;
                                    i29 = i12 | i43;
                                    bArr4 = bArr2;
                                    i28 = i472;
                                    unsafe5 = unsafe2;
                                    i26 = i39;
                                    i27 = i14;
                                    i25 = i34;
                                    i23 = i2;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                unsafe2 = unsafe5;
                                i14 = i33;
                                i18 = i24;
                                ouVar2 = ouVar;
                                i15 = -1;
                                if (i35 == 2) {
                                    if ((536870912 & i41) == 0) {
                                        t = hv.s(bArr2, i18, ouVar2);
                                    } else {
                                        t = hv.t(bArr2, i18, ouVar2);
                                    }
                                    i24 = t;
                                    unsafe2.putObject(obj6, j, ouVar2.c);
                                    int i4722 = i13;
                                    i29 = i12 | i43;
                                    bArr4 = bArr2;
                                    i28 = i4722;
                                    unsafe5 = unsafe2;
                                    i26 = i39;
                                    i27 = i14;
                                    i25 = i34;
                                    i23 = i2;
                                    break;
                                } else {
                                    obj4 = obj6;
                                    i16 = i18;
                                    unsafe3 = unsafe2;
                                    i24 = i16;
                                    unsafe = unsafe3;
                                    i11 = i39;
                                    i9 = i14;
                                    i5 = i15;
                                    i8 = i34;
                                    obj3 = null;
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj4;
                                    i10 = i13;
                                    i29 = i12;
                                    break;
                                }
                            case 9:
                                bArr3 = bArr;
                                unsafe2 = unsafe5;
                                i19 = i33;
                                i20 = i24;
                                i21 = i2;
                                i15 = -1;
                                ouVar2 = ouVar;
                                if (i35 != 2) {
                                    obj4 = obj6;
                                    i16 = i20;
                                    i14 = i19;
                                    unsafe3 = unsafe2;
                                    i24 = i16;
                                    unsafe = unsafe3;
                                    i11 = i39;
                                    i9 = i14;
                                    i5 = i15;
                                    i8 = i34;
                                    obj3 = null;
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj4;
                                    i10 = i13;
                                    i29 = i12;
                                    break;
                                } else {
                                    i24 = hv.q(i54Var2.o(i39), bArr3, i20, i21, ouVar2);
                                    if ((i12 & i43) == 0) {
                                        unsafe2.putObject(obj6, j, ouVar2.c);
                                    } else {
                                        unsafe2.putObject(obj6, j, aa3.c(unsafe2.getObject(obj6, j), ouVar2.c));
                                    }
                                    int i48 = i13;
                                    i29 = i12 | i43;
                                    bArr4 = bArr3;
                                    i28 = i48;
                                    int i49 = i21;
                                    unsafe5 = unsafe2;
                                    i23 = i49;
                                    i27 = i19;
                                    i26 = i39;
                                    i25 = i34;
                                    break;
                                }
                            case 10:
                                bArr3 = bArr;
                                unsafe2 = unsafe5;
                                i19 = i33;
                                i20 = i24;
                                i21 = i2;
                                i15 = -1;
                                ouVar2 = ouVar;
                                if (i35 != 2) {
                                    obj4 = obj6;
                                    i16 = i20;
                                    i14 = i19;
                                    unsafe3 = unsafe2;
                                    i24 = i16;
                                    unsafe = unsafe3;
                                    i11 = i39;
                                    i9 = i14;
                                    i5 = i15;
                                    i8 = i34;
                                    obj3 = null;
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj4;
                                    i10 = i13;
                                    i29 = i12;
                                    break;
                                } else {
                                    i24 = hv.m(bArr3, i20, ouVar2);
                                    unsafe2.putObject(obj6, j, ouVar2.c);
                                    int i482 = i13;
                                    i29 = i12 | i43;
                                    bArr4 = bArr3;
                                    i28 = i482;
                                    int i492 = i21;
                                    unsafe5 = unsafe2;
                                    i23 = i492;
                                    i27 = i19;
                                    i26 = i39;
                                    i25 = i34;
                                    break;
                                }
                            case 12:
                                bArr3 = bArr;
                                unsafe2 = unsafe5;
                                i19 = i33;
                                i20 = i24;
                                i21 = i2;
                                i15 = -1;
                                ouVar2 = ouVar;
                                if (i35 != 0) {
                                    obj4 = obj6;
                                    i16 = i20;
                                    i14 = i19;
                                    unsafe3 = unsafe2;
                                    i24 = i16;
                                    unsafe = unsafe3;
                                    i11 = i39;
                                    i9 = i14;
                                    i5 = i15;
                                    i8 = i34;
                                    obj3 = null;
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj4;
                                    i10 = i13;
                                    i29 = i12;
                                    break;
                                } else {
                                    i24 = hv.w(bArr3, i20, ouVar2);
                                    int i50 = ouVar2.a;
                                    y93 m = i54Var2.m(i39);
                                    if (m != null && !m.a(i50)) {
                                        p(obj6).c(i19, Long.valueOf(i50));
                                        unsafe5 = unsafe2;
                                        i23 = i21;
                                        bArr4 = bArr3;
                                        i27 = i19;
                                        i26 = i39;
                                        i28 = i13;
                                        i29 = i12;
                                        i25 = i34;
                                    } else {
                                        unsafe2.putInt(obj6, j, i50);
                                        int i4822 = i13;
                                        i29 = i12 | i43;
                                        bArr4 = bArr3;
                                        i28 = i4822;
                                        int i4922 = i21;
                                        unsafe5 = unsafe2;
                                        i23 = i4922;
                                        i27 = i19;
                                        i26 = i39;
                                        i25 = i34;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                bArr3 = bArr;
                                unsafe2 = unsafe5;
                                i19 = i33;
                                i20 = i24;
                                i21 = i2;
                                i15 = -1;
                                ouVar2 = ouVar;
                                if (i35 != 0) {
                                    obj4 = obj6;
                                    i16 = i20;
                                    i14 = i19;
                                    unsafe3 = unsafe2;
                                    i24 = i16;
                                    unsafe = unsafe3;
                                    i11 = i39;
                                    i9 = i14;
                                    i5 = i15;
                                    i8 = i34;
                                    obj3 = null;
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj4;
                                    i10 = i13;
                                    i29 = i12;
                                    break;
                                } else {
                                    i24 = hv.w(bArr3, i20, ouVar2);
                                    unsafe2.putInt(obj6, j, ks0.a(ouVar2.a));
                                    int i48222 = i13;
                                    i29 = i12 | i43;
                                    bArr4 = bArr3;
                                    i28 = i48222;
                                    int i49222 = i21;
                                    unsafe5 = unsafe2;
                                    i23 = i49222;
                                    i27 = i19;
                                    i26 = i39;
                                    i25 = i34;
                                    break;
                                }
                            case 16:
                                i19 = i33;
                                i20 = i24;
                                i15 = -1;
                                if (i35 == 0) {
                                    int y2 = hv.y(bArr, i20, ouVar);
                                    ouVar2 = ouVar;
                                    Unsafe unsafe6 = unsafe5;
                                    unsafe6.putLong(obj6, j, ks0.b(ouVar.b));
                                    int i51 = i13;
                                    i29 = i12 | i43;
                                    bArr4 = bArr;
                                    i28 = i51;
                                    unsafe5 = unsafe6;
                                    i23 = i2;
                                    i24 = y2;
                                    i27 = i19;
                                    i26 = i39;
                                    i25 = i34;
                                    break;
                                } else {
                                    unsafe2 = unsafe5;
                                    obj4 = obj6;
                                    i16 = i20;
                                    i14 = i19;
                                    unsafe3 = unsafe2;
                                    i24 = i16;
                                    unsafe = unsafe3;
                                    i11 = i39;
                                    i9 = i14;
                                    i5 = i15;
                                    i8 = i34;
                                    obj3 = null;
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj4;
                                    i10 = i13;
                                    i29 = i12;
                                    break;
                                }
                            case 17:
                                if (i35 == 3) {
                                    i24 = hv.p(i54Var2.o(i39), bArr, i24, i2, (i34 << 3) | 4, ouVar);
                                    if ((i12 & i43) == 0) {
                                        unsafe5.putObject(obj6, j, ouVar.c);
                                    } else {
                                        unsafe5.putObject(obj6, j, aa3.c(unsafe5.getObject(obj6, j), ouVar.c));
                                    }
                                    i17 = i12 | i43;
                                    ouVar2 = ouVar;
                                    bArr4 = bArr;
                                    i27 = i33;
                                    i26 = i39;
                                    i28 = i13;
                                    i25 = i34;
                                    i29 = i17;
                                    i23 = i2;
                                    break;
                                } else {
                                    i15 = -1;
                                    obj4 = obj6;
                                    i14 = i33;
                                    unsafe3 = unsafe5;
                                    i16 = i24;
                                    i24 = i16;
                                    unsafe = unsafe3;
                                    i11 = i39;
                                    i9 = i14;
                                    i5 = i15;
                                    i8 = i34;
                                    obj3 = null;
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj4;
                                    i10 = i13;
                                    i29 = i12;
                                    break;
                                }
                            default:
                                obj4 = obj6;
                                unsafe3 = unsafe5;
                                i14 = i33;
                                i16 = i24;
                                i15 = -1;
                                i24 = i16;
                                unsafe = unsafe3;
                                i11 = i39;
                                i9 = i14;
                                i5 = i15;
                                i8 = i34;
                                obj3 = null;
                                i4 = i3;
                                i54Var = i54Var2;
                                obj2 = obj4;
                                i10 = i13;
                                i29 = i12;
                                break;
                        }
                    } else {
                        Object obj7 = obj6;
                        i9 = i33;
                        Unsafe unsafe7 = unsafe5;
                        if (O == 27) {
                            if (i35 == 2) {
                                z93 z93Var = (z93) unsafe7.getObject(obj7, j);
                                if (!((j1) z93Var).A) {
                                    int size = z93Var.size();
                                    if (size == 0) {
                                        i22 = 10;
                                    } else {
                                        i22 = size * 2;
                                    }
                                    z93Var = z93Var.k(i22);
                                    unsafe7.putObject(obj7, j, z93Var);
                                }
                                i23 = i2;
                                ouVar2 = ouVar;
                                i24 = hv.r(i54Var2.o(i39), i9, bArr, i24, i2, z93Var, ouVar);
                                i27 = i9;
                                i26 = i39;
                                unsafe5 = unsafe7;
                                i25 = i34;
                                obj6 = obj;
                                bArr4 = bArr;
                            } else {
                                obj5 = obj;
                                i24 = i24;
                                i12 = i29;
                                unsafe = unsafe7;
                                i5 = -1;
                                i8 = i34;
                                obj3 = null;
                                i10 = i28;
                                i11 = i39;
                                i4 = i3;
                                i54Var = i54Var2;
                                obj2 = obj5;
                                i29 = i12;
                            }
                        } else {
                            if (O <= 49) {
                                int i52 = i28;
                                i11 = i39;
                                i12 = i29;
                                unsafe = unsafe7;
                                i5 = -1;
                                i8 = i34;
                                obj3 = null;
                                i10 = i52;
                                E = i54Var2.H(obj, bArr, i24, i2, i9, i8, i35, i11, i41, O, j, ouVar);
                                i9 = i9;
                                if (E != i24) {
                                    i23 = i2;
                                    ouVar2 = ouVar;
                                    i25 = i8;
                                    i24 = E;
                                    i26 = i11;
                                    i28 = i10;
                                    i29 = i12;
                                    unsafe5 = unsafe;
                                    i27 = i9;
                                    obj6 = obj;
                                    bArr4 = bArr;
                                } else {
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj;
                                }
                            } else {
                                obj5 = obj;
                                i12 = i29;
                                unsafe = unsafe7;
                                i5 = -1;
                                i8 = i34;
                                obj3 = null;
                                i10 = i28;
                                i11 = i39;
                                i24 = i24;
                                if (O == 50) {
                                    if (i35 == 2) {
                                        i54Var2.D(obj5, j, i11);
                                        throw null;
                                    }
                                    i4 = i3;
                                    i54Var = i54Var2;
                                    obj2 = obj5;
                                    i29 = i12;
                                } else {
                                    E = i54Var2.E(obj5, bArr, i24, i2, i9, i8, i35, i41, O, j, i11, ouVar);
                                    i54Var = i54Var2;
                                    obj2 = obj5;
                                    i9 = i9;
                                    i11 = i11;
                                    if (E != i24) {
                                        bArr4 = bArr;
                                        i23 = i2;
                                        ouVar2 = ouVar;
                                        i25 = i8;
                                        i24 = E;
                                        i26 = i11;
                                        i54Var2 = i54Var;
                                        i28 = i10;
                                        i29 = i12;
                                        unsafe5 = unsafe;
                                        i27 = i9;
                                        obj6 = obj2;
                                    } else {
                                        i4 = i3;
                                    }
                                }
                            }
                            i24 = E;
                            i29 = i12;
                        }
                    }
                }
                if (i9 == i4 && i4 != 0) {
                    i23 = i2;
                    i27 = i9;
                    i28 = i10;
                } else {
                    bArr4 = bArr;
                    int i53 = i9;
                    int u = hv.u(i53, bArr4, i24, i2, p(obj2), ouVar);
                    ouVar2 = ouVar;
                    i23 = i2;
                    i27 = i53;
                    i25 = i8;
                    i26 = i11;
                    i54Var2 = i54Var;
                    i28 = i10;
                    unsafe5 = unsafe;
                    i24 = u;
                    obj6 = obj2;
                }
            } else {
                i4 = i3;
                obj2 = obj6;
                unsafe = unsafe5;
                obj3 = null;
                i5 = -1;
                i54Var = i54Var2;
            }
        }
    }

    public final void G(Object obj, byte[] bArr, int i, int i2, ou ouVar) {
        int N;
        Unsafe unsafe;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Unsafe unsafe2;
        int i8;
        int i9;
        int E;
        i54 i54Var = this;
        byte[] bArr2 = bArr;
        int i10 = i2;
        ou ouVar2 = ouVar;
        Unsafe unsafe3 = p;
        int i11 = -1;
        int i12 = 0;
        int i13 = i;
        int i14 = 0;
        int i15 = -1;
        while (i13 < i10) {
            int i16 = i13 + 1;
            int i17 = bArr2[i13];
            if (i17 < 0) {
                i16 = hv.v(i17, bArr2, i16, ouVar2);
                i17 = ouVar2.a;
            }
            int i18 = i16;
            int i19 = i17;
            int i20 = i19 >>> 3;
            int i21 = i19 & 7;
            int i22 = i54Var.d;
            int i23 = i54Var.c;
            if (i20 > i15) {
                int i24 = i14 / 3;
                if (i20 >= i23 && i20 <= i22) {
                    N = i54Var.N(i20, i24);
                }
                N = i11;
            } else {
                if (i20 >= i23 && i20 <= i22) {
                    N = i54Var.N(i20, i12);
                }
                N = i11;
            }
            int i25 = N;
            if (i25 == i11) {
                unsafe = unsafe3;
                i25 = i12;
                i3 = i25;
                i4 = i18;
                i5 = i20;
            } else {
                int i26 = i54Var.a[i25 + 1];
                i5 = i20;
                int O = O(i26);
                long j = 1048575 & i26;
                if (O <= 17) {
                    boolean z = true;
                    switch (O) {
                        case 0:
                            i6 = i18;
                            i7 = i19;
                            unsafe2 = unsafe3;
                            if (i21 == 1) {
                                gh7.d.m(obj, j, Double.longBitsToDouble(hv.o(bArr2, i6)));
                                i13 = i6 + 8;
                                unsafe3 = unsafe2;
                                i14 = i25;
                                i15 = i5;
                                i12 = 0;
                                i11 = -1;
                                break;
                            }
                            i19 = i7;
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i4 = i8;
                            break;
                        case 1:
                            i6 = i18;
                            i7 = i19;
                            unsafe2 = unsafe3;
                            if (i21 == 5) {
                                gh7.d.n(obj, j, Float.intBitsToFloat(hv.n(bArr2, i6)));
                                i13 = i6 + 4;
                                unsafe3 = unsafe2;
                                i14 = i25;
                                i15 = i5;
                                i12 = 0;
                                i11 = -1;
                                break;
                            }
                            i19 = i7;
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i4 = i8;
                            break;
                        case 2:
                        case 3:
                            i6 = i18;
                            i7 = i19;
                            unsafe2 = unsafe3;
                            if (i21 == 0) {
                                int y = hv.y(bArr2, i6, ouVar2);
                                unsafe2.putLong(obj, j, ouVar2.b);
                                unsafe3 = unsafe2;
                                i13 = y;
                                i14 = i25;
                                i15 = i5;
                                i12 = 0;
                                i11 = -1;
                                break;
                            }
                            i19 = i7;
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i4 = i8;
                            break;
                        case 4:
                        case 11:
                            i6 = i18;
                            i7 = i19;
                            unsafe2 = unsafe3;
                            if (i21 == 0) {
                                i13 = hv.w(bArr2, i6, ouVar2);
                                unsafe2.putInt(obj, j, ouVar2.a);
                                unsafe3 = unsafe2;
                                i14 = i25;
                                i15 = i5;
                                i12 = 0;
                                i11 = -1;
                                break;
                            }
                            i19 = i7;
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i4 = i8;
                            break;
                        case 5:
                        case 14:
                            i6 = i18;
                            i7 = i19;
                            unsafe2 = unsafe3;
                            if (i21 == 1) {
                                unsafe2.putLong(obj, j, hv.o(bArr2, i6));
                                i13 = i6 + 8;
                                unsafe3 = unsafe2;
                                i14 = i25;
                                i15 = i5;
                                i12 = 0;
                                i11 = -1;
                                break;
                            }
                            i19 = i7;
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i4 = i8;
                            break;
                        case 6:
                        case 13:
                            i6 = i18;
                            i7 = i19;
                            unsafe2 = unsafe3;
                            if (i21 == 5) {
                                unsafe2.putInt(obj, j, hv.n(bArr2, i6));
                                i13 = i6 + 4;
                                unsafe3 = unsafe2;
                                i14 = i25;
                                i15 = i5;
                                i12 = 0;
                                i11 = -1;
                                break;
                            }
                            i19 = i7;
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i4 = i8;
                            break;
                        case 7:
                            i6 = i18;
                            i7 = i19;
                            unsafe2 = unsafe3;
                            if (i21 == 0) {
                                i13 = hv.y(bArr2, i6, ouVar2);
                                if (ouVar2.b == 0) {
                                    z = false;
                                }
                                gh7.d.k(obj, j, z);
                                unsafe3 = unsafe2;
                                i14 = i25;
                                i15 = i5;
                                i12 = 0;
                                i11 = -1;
                                break;
                            }
                            i19 = i7;
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i4 = i8;
                            break;
                        case 8:
                            i6 = i18;
                            i7 = i19;
                            unsafe2 = unsafe3;
                            if (i21 == 2) {
                                if ((536870912 & i26) == 0) {
                                    i13 = hv.s(bArr2, i6, ouVar2);
                                } else {
                                    i13 = hv.t(bArr2, i6, ouVar2);
                                }
                                unsafe2.putObject(obj, j, ouVar2.c);
                                unsafe3 = unsafe2;
                                i14 = i25;
                                i15 = i5;
                                i12 = 0;
                                i11 = -1;
                                break;
                            }
                            i19 = i7;
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i4 = i8;
                            break;
                        case 9:
                            i6 = i18;
                            unsafe2 = unsafe3;
                            if (i21 == 2) {
                                i13 = hv.q(i54Var.o(i25), bArr2, i6, i10, ouVar2);
                                Object object = unsafe2.getObject(obj, j);
                                Object obj2 = ouVar2.c;
                                if (object == null) {
                                    unsafe2.putObject(obj, j, obj2);
                                } else {
                                    unsafe2.putObject(obj, j, aa3.c(object, obj2));
                                }
                                unsafe3 = unsafe2;
                                i14 = i25;
                                i15 = i5;
                                i12 = 0;
                                i11 = -1;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i4 = i8;
                            break;
                        case 10:
                            i6 = i18;
                            unsafe2 = unsafe3;
                            if (i21 == 2) {
                                i13 = hv.m(bArr2, i6, ouVar2);
                                unsafe2.putObject(obj, j, ouVar2.c);
                                unsafe3 = unsafe2;
                                i14 = i25;
                                i15 = i5;
                                i12 = 0;
                                i11 = -1;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i4 = i8;
                            break;
                        case 12:
                            i6 = i18;
                            unsafe2 = unsafe3;
                            if (i21 == 0) {
                                i13 = hv.w(bArr2, i6, ouVar2);
                                unsafe2.putInt(obj, j, ouVar2.a);
                                unsafe3 = unsafe2;
                                i14 = i25;
                                i15 = i5;
                                i12 = 0;
                                i11 = -1;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i4 = i8;
                            break;
                        case 15:
                            i6 = i18;
                            unsafe2 = unsafe3;
                            if (i21 == 0) {
                                i13 = hv.w(bArr2, i6, ouVar2);
                                unsafe2.putInt(obj, j, ks0.a(ouVar2.a));
                                unsafe3 = unsafe2;
                                i14 = i25;
                                i15 = i5;
                                i12 = 0;
                                i11 = -1;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i4 = i8;
                            break;
                        case 16:
                            if (i21 == 0) {
                                int y2 = hv.y(bArr2, i18, ouVar2);
                                unsafe3.putLong(obj, j, ks0.b(ouVar2.b));
                                unsafe3 = unsafe3;
                                i13 = y2;
                                i14 = i25;
                                i15 = i5;
                                i12 = 0;
                                i11 = -1;
                                break;
                            }
                            i8 = i18;
                            unsafe = unsafe3;
                            i3 = 0;
                            i4 = i8;
                            break;
                        default:
                            i8 = i18;
                            unsafe = unsafe3;
                            i3 = 0;
                            i4 = i8;
                            break;
                    }
                } else {
                    i8 = i18;
                    unsafe2 = unsafe3;
                    if (O == 27) {
                        if (i21 == 2) {
                            z93 z93Var = (z93) unsafe2.getObject(obj, j);
                            if (!((j1) z93Var).A) {
                                int size = z93Var.size();
                                if (size == 0) {
                                    i9 = 10;
                                } else {
                                    i9 = size * 2;
                                }
                                z93Var = z93Var.k(i9);
                                unsafe2.putObject(obj, j, z93Var);
                            }
                            i13 = hv.r(i54Var.o(i25), i19, bArr2, i8, i10, z93Var, ouVar2);
                            bArr2 = bArr;
                            i10 = i2;
                            ouVar2 = ouVar;
                            unsafe3 = unsafe2;
                            i14 = i25;
                            i15 = i5;
                            i12 = 0;
                            i11 = -1;
                        } else {
                            i19 = i19;
                            unsafe = unsafe2;
                            i3 = 0;
                            i4 = i8;
                        }
                    } else {
                        i19 = i19;
                        if (O <= 49) {
                            unsafe = unsafe2;
                            i3 = 0;
                            E = i54Var.H(obj, bArr, i8, i2, i19, i5, i21, i25, i26, O, j, ouVar);
                            i5 = i5;
                            i25 = i25;
                            if (E != i8) {
                                i10 = i2;
                                ouVar2 = ouVar;
                                i13 = E;
                                i14 = i25;
                                i15 = i5;
                                unsafe3 = unsafe;
                                i12 = i3;
                                i11 = -1;
                                bArr2 = bArr;
                            } else {
                                i4 = E;
                            }
                        } else {
                            unsafe = unsafe2;
                            i3 = 0;
                            if (O == 50) {
                                if (i21 == 2) {
                                    i54Var.D(obj, j, i25);
                                    throw null;
                                }
                                i4 = i8;
                            } else {
                                E = i54Var.E(obj, bArr, i8, i2, i19, i5, i21, i26, O, j, i25, ouVar);
                                if (E == i8) {
                                    i4 = E;
                                } else {
                                    i54Var = this;
                                    i10 = i2;
                                    ouVar2 = ouVar;
                                    i13 = E;
                                    i14 = i25;
                                    i15 = i5;
                                    unsafe3 = unsafe;
                                    i12 = i3;
                                    i11 = -1;
                                    bArr2 = bArr;
                                }
                            }
                        }
                        i11 = -1;
                    }
                }
            }
            i13 = hv.u(i19, bArr, i4, i2, p(obj), ouVar);
            i54Var = this;
            bArr2 = bArr;
            ouVar2 = ouVar;
            i10 = i2;
            i14 = i25;
            i15 = i5;
            unsafe3 = unsafe;
            i12 = i3;
            i11 = -1;
        }
        if (i13 == i10) {
            return;
        }
        throw ub3.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x020a -> B:117:0x020b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x025c -> B:139:0x025d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0189 -> B:83:0x018a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int H(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, ou ouVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int i8;
        int x;
        int i9;
        Unsafe unsafe = p;
        z93 z93Var = (z93) unsafe.getObject(obj, j2);
        if (!((j1) z93Var).A) {
            int size = z93Var.size();
            if (size == 0) {
                i9 = 10;
            } else {
                i9 = size * 2;
            }
            z93Var = z93Var.k(i9);
            unsafe.putObject(obj, j2, z93Var);
        }
        z93 z93Var2 = z93Var;
        switch (i7) {
            case 18:
            case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                if (i5 == 2) {
                    cm1 cm1Var = (cm1) z93Var2;
                    int w = hv.w(bArr, i, ouVar);
                    int i10 = ouVar.a + w;
                    while (w < i10) {
                        cm1Var.b(Double.longBitsToDouble(hv.o(bArr, w)));
                        w += 8;
                    }
                    if (w == i10) {
                        return w;
                    }
                    throw ub3.e();
                } else if (i5 == 1) {
                    cm1 cm1Var2 = (cm1) z93Var2;
                    cm1Var2.b(Double.longBitsToDouble(hv.o(bArr, i)));
                    int i11 = i + 8;
                    while (i11 < i2) {
                        int w2 = hv.w(bArr, i11, ouVar);
                        if (i3 == ouVar.a) {
                            cm1Var2.b(Double.longBitsToDouble(hv.o(bArr, w2)));
                            i11 = w2 + 8;
                        } else {
                            return i11;
                        }
                    }
                    return i11;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    zd2 zd2Var = (zd2) z93Var2;
                    int w3 = hv.w(bArr, i, ouVar);
                    int i12 = ouVar.a + w3;
                    while (w3 < i12) {
                        zd2Var.b(Float.intBitsToFloat(hv.n(bArr, w3)));
                        w3 += 4;
                    }
                    if (w3 == i12) {
                        return w3;
                    }
                    throw ub3.e();
                } else if (i5 == 5) {
                    zd2 zd2Var2 = (zd2) z93Var2;
                    zd2Var2.b(Float.intBitsToFloat(hv.n(bArr, i)));
                    int i13 = i + 4;
                    while (i13 < i2) {
                        int w4 = hv.w(bArr, i13, ouVar);
                        if (i3 == ouVar.a) {
                            zd2Var2.b(Float.intBitsToFloat(hv.n(bArr, w4)));
                            i13 = w4 + 4;
                        } else {
                            return i13;
                        }
                    }
                    return i13;
                }
                break;
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 37:
            case SubAllocator.N_INDEXES /* 38 */:
                if (i5 == 2) {
                    uy3 uy3Var = (uy3) z93Var2;
                    int w5 = hv.w(bArr, i, ouVar);
                    int i14 = ouVar.a + w5;
                    while (w5 < i14) {
                        w5 = hv.y(bArr, w5, ouVar);
                        uy3Var.b(ouVar.b);
                    }
                    if (w5 == i14) {
                        return w5;
                    }
                    throw ub3.e();
                } else if (i5 == 0) {
                    uy3 uy3Var2 = (uy3) z93Var2;
                    int y = hv.y(bArr, i, ouVar);
                    uy3Var2.b(ouVar.b);
                    while (y < i2) {
                        int w6 = hv.w(bArr, y, ouVar);
                        if (i3 == ouVar.a) {
                            y = hv.y(bArr, w6, ouVar);
                            uy3Var2.b(ouVar.b);
                        } else {
                            return y;
                        }
                    }
                    return y;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    a93 a93Var = (a93) z93Var2;
                    int w7 = hv.w(bArr, i, ouVar);
                    int i15 = ouVar.a + w7;
                    while (w7 < i15) {
                        w7 = hv.w(bArr, w7, ouVar);
                        a93Var.b(ouVar.a);
                    }
                    if (w7 == i15) {
                        return w7;
                    }
                    throw ub3.e();
                } else if (i5 == 0) {
                    return hv.x(i3, bArr, i, i2, z93Var2, ouVar);
                }
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    uy3 uy3Var3 = (uy3) z93Var2;
                    int w8 = hv.w(bArr, i, ouVar);
                    int i16 = ouVar.a + w8;
                    while (w8 < i16) {
                        uy3Var3.b(hv.o(bArr, w8));
                        w8 += 8;
                    }
                    if (w8 == i16) {
                        return w8;
                    }
                    throw ub3.e();
                } else if (i5 == 1) {
                    uy3 uy3Var4 = (uy3) z93Var2;
                    uy3Var4.b(hv.o(bArr, i));
                    int i17 = i + 8;
                    while (i17 < i2) {
                        int w9 = hv.w(bArr, i17, ouVar);
                        if (i3 == ouVar.a) {
                            uy3Var4.b(hv.o(bArr, w9));
                            i17 = w9 + 8;
                        } else {
                            return i17;
                        }
                    }
                    return i17;
                }
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    a93 a93Var2 = (a93) z93Var2;
                    int w10 = hv.w(bArr, i, ouVar);
                    int i18 = ouVar.a + w10;
                    while (w10 < i18) {
                        a93Var2.b(hv.n(bArr, w10));
                        w10 += 4;
                    }
                    if (w10 == i18) {
                        return w10;
                    }
                    throw ub3.e();
                } else if (i5 == 5) {
                    a93 a93Var3 = (a93) z93Var2;
                    a93Var3.b(hv.n(bArr, i));
                    int i19 = i + 4;
                    while (i19 < i2) {
                        int w11 = hv.w(bArr, i19, ouVar);
                        if (i3 == ouVar.a) {
                            a93Var3.b(hv.n(bArr, w11));
                            i19 = w11 + 4;
                        } else {
                            return i19;
                        }
                    }
                    return i19;
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    s50 s50Var = (s50) z93Var2;
                    int w12 = hv.w(bArr, i, ouVar);
                    int i20 = ouVar.a + w12;
                    while (w12 < i20) {
                        w12 = hv.y(bArr, w12, ouVar);
                        if (ouVar.b != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        s50Var.b(z3);
                    }
                    if (w12 == i20) {
                        return w12;
                    }
                    throw ub3.e();
                } else if (i5 == 0) {
                    s50 s50Var2 = (s50) z93Var2;
                    int y2 = hv.y(bArr, i, ouVar);
                    if (ouVar.b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    s50Var2.b(z);
                    while (y2 < i2) {
                        int w13 = hv.w(bArr, y2, ouVar);
                        if (i3 == ouVar.a) {
                            y2 = hv.y(bArr, w13, ouVar);
                            if (ouVar.b != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            s50Var2.b(z2);
                        } else {
                            return y2;
                        }
                    }
                    return y2;
                }
                break;
            case SubAllocator.N4 /* 26 */:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int w14 = hv.w(bArr, i, ouVar);
                        int i21 = ouVar.a;
                        if (i21 >= 0) {
                            if (i21 == 0) {
                                z93Var2.add("");
                                while (w14 < i2) {
                                    int w15 = hv.w(bArr, w14, ouVar);
                                    if (i3 == ouVar.a) {
                                        w14 = hv.w(bArr, w15, ouVar);
                                        i21 = ouVar.a;
                                        if (i21 >= 0) {
                                            if (i21 == 0) {
                                                z93Var2.add("");
                                            } else {
                                                z93Var2.add(new String(bArr, w14, i21, aa3.a));
                                                w14 += i21;
                                                while (w14 < i2) {
                                                }
                                            }
                                        } else {
                                            throw ub3.c();
                                        }
                                    } else {
                                        return w14;
                                    }
                                }
                                return w14;
                            }
                            z93Var2.add(new String(bArr, w14, i21, aa3.a));
                            w14 += i21;
                            while (w14 < i2) {
                            }
                            return w14;
                        }
                        throw ub3.c();
                    }
                    int w16 = hv.w(bArr, i, ouVar);
                    int i22 = ouVar.a;
                    if (i22 >= 0) {
                        if (i22 == 0) {
                            z93Var2.add("");
                            while (w16 < i2) {
                                int w17 = hv.w(bArr, w16, ouVar);
                                if (i3 == ouVar.a) {
                                    w16 = hv.w(bArr, w17, ouVar);
                                    int i23 = ouVar.a;
                                    if (i23 >= 0) {
                                        if (i23 == 0) {
                                            z93Var2.add("");
                                        } else {
                                            i8 = w16 + i23;
                                            if (xj7.a.z(bArr, w16, i8)) {
                                                z93Var2.add(new String(bArr, w16, i23, aa3.a));
                                                w16 = i8;
                                                while (w16 < i2) {
                                                }
                                            } else {
                                                throw ub3.a();
                                            }
                                        }
                                    } else {
                                        throw ub3.c();
                                    }
                                } else {
                                    return w16;
                                }
                            }
                            return w16;
                        }
                        i8 = w16 + i22;
                        if (xj7.a.z(bArr, w16, i8)) {
                            z93Var2.add(new String(bArr, w16, i22, aa3.a));
                            w16 = i8;
                            while (w16 < i2) {
                            }
                            return w16;
                        }
                        throw ub3.a();
                    }
                    throw ub3.c();
                }
                break;
            case 27:
                if (i5 == 2) {
                    return hv.r(o(i6), i3, bArr, i, i2, z93Var2, ouVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int w18 = hv.w(bArr, i, ouVar);
                    int i24 = ouVar.a;
                    if (i24 >= 0) {
                        if (i24 <= bArr.length - w18) {
                            if (i24 == 0) {
                                z93Var2.add(ea0.B);
                                while (w18 < i2) {
                                    int w19 = hv.w(bArr, w18, ouVar);
                                    if (i3 == ouVar.a) {
                                        w18 = hv.w(bArr, w19, ouVar);
                                        i24 = ouVar.a;
                                        if (i24 >= 0) {
                                            if (i24 <= bArr.length - w18) {
                                                if (i24 == 0) {
                                                    z93Var2.add(ea0.B);
                                                } else {
                                                    z93Var2.add(ea0.c(bArr, w18, i24));
                                                    w18 += i24;
                                                    while (w18 < i2) {
                                                    }
                                                }
                                            } else {
                                                throw ub3.e();
                                            }
                                        } else {
                                            throw ub3.c();
                                        }
                                    } else {
                                        return w18;
                                    }
                                }
                                return w18;
                            }
                            z93Var2.add(ea0.c(bArr, w18, i24));
                            w18 += i24;
                            while (w18 < i2) {
                            }
                            return w18;
                        }
                        throw ub3.e();
                    }
                    throw ub3.c();
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    a93 a93Var4 = (a93) z93Var2;
                    x = hv.w(bArr, i, ouVar);
                    int i25 = ouVar.a + x;
                    while (x < i25) {
                        x = hv.w(bArr, x, ouVar);
                        a93Var4.b(ouVar.a);
                    }
                    if (x != i25) {
                        throw ub3.e();
                    }
                } else if (i5 == 0) {
                    x = hv.x(i3, bArr, i, i2, z93Var2, ouVar);
                }
                pr2 pr2Var = (pr2) obj;
                mg7 mg7Var = pr2Var.unknownFields;
                if (mg7Var == mg7.f) {
                    mg7Var = null;
                }
                mg7 mg7Var2 = (mg7) m66.v(i4, z93Var2, m(i6), mg7Var, this.m);
                if (mg7Var2 != null) {
                    pr2Var.unknownFields = mg7Var2;
                }
                return x;
            case 33:
            case 47:
                if (i5 == 2) {
                    a93 a93Var5 = (a93) z93Var2;
                    int w20 = hv.w(bArr, i, ouVar);
                    int i26 = ouVar.a + w20;
                    while (w20 < i26) {
                        w20 = hv.w(bArr, w20, ouVar);
                        a93Var5.b(ks0.a(ouVar.a));
                    }
                    if (w20 == i26) {
                        return w20;
                    }
                    throw ub3.e();
                } else if (i5 == 0) {
                    a93 a93Var6 = (a93) z93Var2;
                    int w21 = hv.w(bArr, i, ouVar);
                    a93Var6.b(ks0.a(ouVar.a));
                    while (w21 < i2) {
                        int w22 = hv.w(bArr, w21, ouVar);
                        if (i3 == ouVar.a) {
                            w21 = hv.w(bArr, w22, ouVar);
                            a93Var6.b(ks0.a(ouVar.a));
                        } else {
                            return w21;
                        }
                    }
                    return w21;
                }
                break;
            case 34:
            case Compress.DC20 /* 48 */:
                if (i5 == 2) {
                    uy3 uy3Var5 = (uy3) z93Var2;
                    int w23 = hv.w(bArr, i, ouVar);
                    int i27 = ouVar.a + w23;
                    while (w23 < i27) {
                        w23 = hv.y(bArr, w23, ouVar);
                        uy3Var5.b(ks0.b(ouVar.b));
                    }
                    if (w23 == i27) {
                        return w23;
                    }
                    throw ub3.e();
                } else if (i5 == 0) {
                    uy3 uy3Var6 = (uy3) z93Var2;
                    int y3 = hv.y(bArr, i, ouVar);
                    uy3Var6.b(ks0.b(ouVar.b));
                    while (y3 < i2) {
                        int w24 = hv.w(bArr, y3, ouVar);
                        if (i3 == ouVar.a) {
                            y3 = hv.y(bArr, w24, ouVar);
                            uy3Var6.b(ks0.b(ouVar.b));
                        } else {
                            return y3;
                        }
                    }
                    return y3;
                }
                break;
            case 49:
                if (i5 == 3) {
                    j66 o2 = o(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int p2 = hv.p(o2, bArr, i, i2, i28, ouVar);
                    int i29 = i28;
                    z93Var2.add(ouVar.c);
                    while (p2 < i2) {
                        int w25 = hv.w(bArr, p2, ouVar);
                        if (i3 == ouVar.a) {
                            int i30 = i29;
                            p2 = hv.p(o2, bArr, w25, i2, i30, ouVar);
                            z93Var2.add(ouVar.c);
                            i29 = i30;
                        } else {
                            return p2;
                        }
                    }
                    return p2;
                }
                break;
        }
        return i;
    }

    public final void I(Object obj, int i, ls0 ls0Var, j66 j66Var, g82 g82Var) {
        int l;
        List c = this.l.c(i & 1048575, obj);
        ks0 ks0Var = (ks0) ls0Var.e;
        int i2 = ls0Var.b;
        if ((i2 & 7) == 2) {
            do {
                c.add(ls0Var.D(j66Var, g82Var));
                if (!ks0Var.d() && ls0Var.d == 0) {
                    l = ks0Var.l();
                } else {
                    return;
                }
            } while (l == i2);
            ls0Var.d = l;
            return;
        }
        throw ub3.b();
    }

    public final void J(Object obj, int i, ls0 ls0Var) {
        if ((536870912 & i) != 0) {
            gh7.o(obj, i & 1048575, ls0Var.P());
        } else if (this.f) {
            gh7.o(obj, i & 1048575, ls0Var.N());
        } else {
            gh7.o(obj, i & 1048575, ls0Var.k());
        }
    }

    public final void L(int i, Object obj) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        gh7.m(obj, j, gh7.d.g(j, obj) | (1 << (i2 >>> 20)));
    }

    public final void M(Object obj, int i, int i2) {
        gh7.m(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final int N(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
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

    public final int P(int i) {
        return this.a[i + 1];
    }

    public final void Q(Object obj, os0 os0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int[] iArr = this.a;
        int length = iArr.length;
        Unsafe unsafe = p;
        int i5 = -1;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 = i4 + 3) {
            int P = P(i7);
            int i8 = iArr[i7];
            int O = O(P);
            if (!this.g && O <= 17) {
                int i9 = iArr[i7 + 2];
                i2 = 1048575;
                int i10 = i9 & 1048575;
                i = i7;
                if (i10 != i5) {
                    i6 = unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i7;
                i2 = 1048575;
                i3 = 0;
            }
            long j = P & i2;
            switch (O) {
                case 0:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.j0(i8, gh7.d.e(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.n0(i8, gh7.d.f(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.q0(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.x0(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.p0(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.m0(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.l0(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.h0(i8, gh7.d.c(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        R(i8, unsafe.getObject(obj, j), os0Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.r0(i8, unsafe.getObject(obj, j), o(i4));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.i0(i8, (ea0) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.w0(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.k0(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.s0(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.t0(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.u0(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.v0(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        os0Var.o0(i8, unsafe.getObject(obj, j), o(i4));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i4 = i;
                    m66.C(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, false);
                    break;
                case 19:
                    i4 = i;
                    m66.G(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, false);
                    break;
                case 20:
                    i4 = i;
                    m66.J(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, false);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    i4 = i;
                    m66.R(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, false);
                    break;
                case 22:
                    i4 = i;
                    m66.I(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, false);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    i4 = i;
                    m66.F(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, false);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    i4 = i;
                    m66.E(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, false);
                    break;
                case 25:
                    i4 = i;
                    m66.A(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, false);
                    break;
                case SubAllocator.N4 /* 26 */:
                    i4 = i;
                    m66.P(iArr[i4], (List) unsafe.getObject(obj, j), os0Var);
                    break;
                case 27:
                    i4 = i;
                    m66.K(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, o(i4));
                    break;
                case 28:
                    i4 = i;
                    m66.B(iArr[i4], (List) unsafe.getObject(obj, j), os0Var);
                    break;
                case 29:
                    i4 = i;
                    z = false;
                    m66.Q(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, false);
                    break;
                case 30:
                    i4 = i;
                    z = false;
                    m66.D(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, false);
                    break;
                case 31:
                    i4 = i;
                    z = false;
                    m66.L(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, false);
                    break;
                case 32:
                    i4 = i;
                    z = false;
                    m66.M(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, false);
                    break;
                case 33:
                    i4 = i;
                    z = false;
                    m66.N(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, false);
                    break;
                case 34:
                    i4 = i;
                    z = false;
                    m66.O(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, false);
                    break;
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                    i4 = i;
                    m66.C(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, true);
                    break;
                case 36:
                    i4 = i;
                    m66.G(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, true);
                    break;
                case 37:
                    i4 = i;
                    m66.J(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, true);
                    break;
                case SubAllocator.N_INDEXES /* 38 */:
                    i4 = i;
                    m66.R(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, true);
                    break;
                case 39:
                    i4 = i;
                    m66.I(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, true);
                    break;
                case 40:
                    i4 = i;
                    m66.F(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, true);
                    break;
                case 41:
                    i4 = i;
                    m66.E(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, true);
                    break;
                case 42:
                    i4 = i;
                    m66.A(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, true);
                    break;
                case 43:
                    i4 = i;
                    m66.Q(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, true);
                    break;
                case 44:
                    i4 = i;
                    m66.D(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, true);
                    break;
                case 45:
                    i4 = i;
                    m66.L(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, true);
                    break;
                case 46:
                    i4 = i;
                    m66.M(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, true);
                    break;
                case 47:
                    i4 = i;
                    m66.N(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, true);
                    break;
                case Compress.DC20 /* 48 */:
                    i4 = i;
                    m66.O(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, true);
                    break;
                case 49:
                    i4 = i;
                    m66.H(iArr[i4], (List) unsafe.getObject(obj, j), os0Var, o(i4));
                    break;
                case 50:
                    i4 = i;
                    if (unsafe.getObject(obj, j) != null) {
                        Object n = n(i4);
                        this.n.getClass();
                        xg6.A(n);
                        throw null;
                    }
                    break;
                case 51:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.j0(i8, ((Double) gh7.d.i(j, obj)).doubleValue());
                    }
                    break;
                case 52:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.n0(i8, ((Float) gh7.d.i(j, obj)).floatValue());
                    }
                    break;
                case 53:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.q0(i8, C(j, obj));
                    }
                    break;
                case 54:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.x0(i8, C(j, obj));
                    }
                    break;
                case 55:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.p0(i8, B(j, obj));
                    }
                    break;
                case 56:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.m0(i8, C(j, obj));
                    }
                    break;
                case 57:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.l0(i8, B(j, obj));
                    }
                    break;
                case 58:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.h0(i8, ((Boolean) gh7.d.i(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        R(i8, unsafe.getObject(obj, j), os0Var);
                    }
                    break;
                case Compress.DC /* 60 */:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.r0(i8, unsafe.getObject(obj, j), o(i4));
                    }
                    break;
                case 61:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.i0(i8, (ea0) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.w0(i8, B(j, obj));
                    }
                    break;
                case 63:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.k0(i8, B(j, obj));
                    }
                    break;
                case 64:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.s0(i8, B(j, obj));
                    }
                    break;
                case 65:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.t0(i8, C(j, obj));
                    }
                    break;
                case 66:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.u0(i8, B(j, obj));
                    }
                    break;
                case 67:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.v0(i8, C(j, obj));
                    }
                    break;
                case 68:
                    i4 = i;
                    if (t(obj, i8, i4)) {
                        os0Var.o0(i8, unsafe.getObject(obj, j), o(i4));
                    }
                    break;
                default:
                    i4 = i;
                    break;
            }
        }
        this.m.getClass();
        ((pr2) obj).unknownFields.d(os0Var);
    }

    @Override // defpackage.j66
    public final void a(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.i;
        while (true) {
            iArr = this.h;
            i = this.j;
            if (i2 >= i) {
                break;
            }
            long P = P(iArr[i2]) & 1048575;
            Object i3 = gh7.d.i(P, obj);
            if (i3 != null) {
                this.n.getClass();
                ((x04) i3).A = false;
                gh7.o(obj, P, i3);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.l.a(iArr[i], obj);
            i++;
        }
        this.m.getClass();
        ((pr2) obj).unknownFields.e = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f2, code lost:
        return false;
     */
    @Override // defpackage.j66
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj) {
        int i;
        boolean z;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            boolean z2 = true;
            if (i3 >= this.i) {
                return true;
            }
            int i5 = this.h[i3];
            int[] iArr = this.a;
            int i6 = iArr[i5];
            int P = P(i5);
            boolean z3 = this.g;
            if (!z3) {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = p.getInt(obj, i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            if ((268435456 & P) != 0) {
                if (z3) {
                    z = s(i5, obj);
                } else if ((i4 & i) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    break;
                }
            }
            int O = O(P);
            if (O != 9 && O != 17) {
                if (O != 27) {
                    if (O != 60 && O != 68) {
                        if (O != 49) {
                            if (O != 50) {
                                continue;
                            } else {
                                Object i9 = gh7.d.i(P & 1048575, obj);
                                this.n.getClass();
                                if (!((x04) i9).isEmpty()) {
                                    xg6.A(n(i5));
                                    throw null;
                                }
                            }
                        }
                    } else if (t(obj, i6, i5)) {
                        if (!o(i5).b(gh7.d.i(P & 1048575, obj))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i3++;
                }
                List list = (List) gh7.d.i(P & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    j66 o2 = o(i5);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!o2.b(list.get(i10))) {
                            break loop0;
                        }
                    }
                    continue;
                }
                i3++;
            } else {
                if (z3) {
                    z2 = s(i5, obj);
                } else if ((i & i4) == 0) {
                    z2 = false;
                }
                if (z2) {
                    if (!o(i5).b(gh7.d.i(P & 1048575, obj))) {
                        break;
                    }
                } else {
                    continue;
                }
                i3++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
        if (java.lang.Double.doubleToLongBits(r5.e(r7, r12)) == java.lang.Double.doubleToLongBits(r5.e(r7, r13))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (defpackage.m66.y(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (defpackage.m66.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        if (defpackage.m66.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
        if (defpackage.m66.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (defpackage.m66.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0176, code lost:
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018a, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b4, code lost:
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cf, code lost:
        if (java.lang.Float.floatToIntBits(r5.f(r7, r12)) == java.lang.Float.floatToIntBits(r5.f(r7, r13))) goto L85;
     */
    @Override // defpackage.j66
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(pr2 pr2Var, pr2 pr2Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int P = P(i);
                long j = P & 1048575;
                switch (O(P)) {
                    case 0:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var2 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var3 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var4 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var5 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var6 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var7 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var8 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var9 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var10 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var11 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var12 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var13 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var14 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var15 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var16 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var17 = gh7.d;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (k(pr2Var, pr2Var2, i)) {
                            fh7 fh7Var18 = gh7.d;
                            break;
                        }
                        z = false;
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
                        fh7 fh7Var19 = gh7.d;
                        z = m66.y(fh7Var19.i(j, pr2Var), fh7Var19.i(j, pr2Var2));
                        break;
                    case 50:
                        fh7 fh7Var20 = gh7.d;
                        z = m66.y(fh7Var20.i(j, pr2Var), fh7Var20.i(j, pr2Var2));
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
                        long j2 = iArr[i + 2] & 1048575;
                        fh7 fh7Var21 = gh7.d;
                        if (fh7Var21.g(j2, pr2Var) == fh7Var21.g(j2, pr2Var2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                this.m.getClass();
                if (pr2Var.unknownFields.equals(pr2Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x06e4 A[Catch: all -> 0x0430, TryCatch #7 {all -> 0x0430, blocks: (B:176:0x06df, B:178:0x06e4, B:180:0x06eb, B:182:0x06f2, B:118:0x0407, B:119:0x0410, B:120:0x041c, B:123:0x0433, B:124:0x0447, B:125:0x045b, B:126:0x046f, B:127:0x0483, B:128:0x0497, B:129:0x04ab, B:130:0x04bf, B:132:0x04cc, B:133:0x04eb, B:134:0x04ff, B:135:0x0516, B:136:0x052d, B:137:0x0544, B:138:0x055b, B:140:0x056c, B:143:0x0573, B:144:0x0579, B:145:0x0585, B:146:0x059c, B:147:0x05b3, B:149:0x05c0, B:150:0x05df, B:151:0x05f3, B:152:0x0602, B:153:0x061b, B:154:0x0632, B:155:0x0649, B:156:0x0660, B:157:0x0676, B:158:0x068c, B:159:0x06a4, B:165:0x06bc), top: B:202:0x06df }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0717 A[LOOP:3: B:193:0x0715->B:194:0x0717, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06f8 A[SYNTHETIC] */
    @Override // defpackage.j66
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, ls0 ls0Var, g82 g82Var) {
        i54 i54Var;
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        g82 g82Var2;
        ls0 ls0Var2;
        boolean z;
        i54 i54Var2 = this;
        Object obj2 = obj;
        ls0 ls0Var3 = ls0Var;
        g82 g82Var3 = g82Var;
        g82Var3.getClass();
        ng7 ng7Var = i54Var2.m;
        int[] iArr2 = i54Var2.h;
        int i5 = i54Var2.j;
        int i6 = i54Var2.i;
        Object obj3 = null;
        while (true) {
            try {
                int e = ls0Var3.e();
                if (e >= i54Var2.c && e <= i54Var2.d) {
                    i3 = i54Var2.N(e, 0);
                } else {
                    i3 = -1;
                }
                int i7 = i3;
                mg7 mg7Var = mg7.f;
                if (i7 < 0) {
                    if (e == Integer.MAX_VALUE) {
                        while (i6 < i5) {
                            i54Var2.l(iArr2[i6], obj2, obj3);
                            i6++;
                        }
                        if (obj3 != null) {
                            ng7Var.getClass();
                        } else {
                            return;
                        }
                    } else {
                        ng7Var.getClass();
                        if (obj3 == null) {
                            pr2 pr2Var = (pr2) obj2;
                            mg7 mg7Var2 = pr2Var.unknownFields;
                            if (mg7Var2 == mg7Var) {
                                mg7Var2 = mg7.b();
                                pr2Var.unknownFields = mg7Var2;
                            }
                            obj3 = mg7Var2;
                        }
                        if (!ng7.a(obj3, ls0Var3)) {
                            while (i6 < i5) {
                                i54Var2.l(iArr2[i6], obj2, obj3);
                                i6++;
                            }
                            if (obj3 == null) {
                                return;
                            }
                        }
                    }
                } else {
                    int P = i54Var2.P(i7);
                    try {
                        int O = O(P);
                        ow3 ow3Var = i54Var2.l;
                        switch (O) {
                            case 0:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                try {
                                    try {
                                        gh7.d.m(obj, A(P), ls0Var2.m());
                                        obj2 = obj;
                                        i54Var.L(i7, obj2);
                                    } catch (tb3 unused) {
                                        obj2 = obj;
                                        try {
                                            ng7Var.getClass();
                                            if (obj3 == null) {
                                            }
                                            if (!ng7.a(obj3, ls0Var2)) {
                                            }
                                            g82 g82Var4 = g82Var2;
                                            i5 = i4;
                                            i54Var2 = i54Var;
                                            g82Var3 = g82Var4;
                                            ls0Var3 = ls0Var2;
                                            iArr2 = iArr;
                                            i6 = i2;
                                        } catch (Throwable th) {
                                            th = th;
                                            i = i4;
                                            while (i2 < i) {
                                                i54Var.l(iArr[i2], obj2, obj3);
                                                i2++;
                                            }
                                            if (obj3 != null) {
                                                ng7Var.getClass();
                                                ((pr2) obj2).unknownFields = (mg7) obj3;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj2 = obj;
                                        i = i4;
                                        while (i2 < i) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (tb3 unused2) {
                                    obj2 = obj;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj;
                                }
                                break;
                            case 1:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                gh7.d.n(obj2, A(P), ls0Var2.u());
                                i54Var.L(i7, obj2);
                                break;
                            case 2:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                gh7.n(obj2, A(P), ls0Var2.B());
                                i54Var.L(i7, obj2);
                                break;
                            case 3:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                gh7.n(obj2, A(P), ls0Var2.S());
                                i54Var.L(i7, obj2);
                                break;
                            case 4:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                gh7.m(obj2, A(P), ls0Var2.z());
                                i54Var.L(i7, obj2);
                                break;
                            case 5:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                gh7.n(obj2, A(P), ls0Var2.s());
                                i54Var.L(i7, obj2);
                                break;
                            case 6:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                gh7.m(obj2, A(P), ls0Var2.q());
                                i54Var.L(i7, obj2);
                                break;
                            case 7:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                gh7.d.k(obj2, A(P), ls0Var2.i());
                                i54Var.L(i7, obj2);
                                break;
                            case 8:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                i54Var.J(obj2, P, ls0Var2);
                                i54Var.L(i7, obj2);
                                break;
                            case 9:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                if (i54Var.s(i7, obj2)) {
                                    gh7.o(obj2, A(P), aa3.c(gh7.d.i(A(P), obj2), ls0Var2.E(i54Var.o(i7), g82Var2)));
                                    break;
                                } else {
                                    gh7.o(obj2, A(P), ls0Var2.E(i54Var.o(i7), g82Var2));
                                    i54Var.L(i7, obj2);
                                    break;
                                }
                            case 10:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                gh7.o(obj2, A(P), ls0Var2.k());
                                i54Var.L(i7, obj2);
                                break;
                            case 11:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                gh7.m(obj2, A(P), ls0Var2.Q());
                                i54Var.L(i7, obj2);
                                break;
                            case 12:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                int o2 = ls0Var2.o();
                                y93 m = i54Var.m(i7);
                                if (m != null && !m.a(o2)) {
                                    obj3 = m66.z(e, o2, obj3, ng7Var);
                                    break;
                                }
                                gh7.m(obj2, A(P), o2);
                                i54Var.L(i7, obj2);
                                break;
                            case 13:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                gh7.m(obj2, A(P), ls0Var2.F());
                                i54Var.L(i7, obj2);
                                break;
                            case 14:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                gh7.n(obj2, A(P), ls0Var2.H());
                                i54Var.L(i7, obj2);
                                break;
                            case 15:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                gh7.m(obj2, A(P), ls0Var2.J());
                                i54Var.L(i7, obj2);
                                break;
                            case 16:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                gh7.n(obj2, A(P), ls0Var2.L());
                                i54Var.L(i7, obj2);
                                break;
                            case 17:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                if (i54Var.s(i7, obj2)) {
                                    gh7.o(obj2, A(P), aa3.c(gh7.d.i(A(P), obj2), ls0Var2.x(i54Var.o(i7), g82Var2)));
                                    break;
                                } else {
                                    gh7.o(obj2, A(P), ls0Var2.x(i54Var.o(i7), g82Var2));
                                    i54Var.L(i7, obj2);
                                    break;
                                }
                            case 18:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                ls0Var2.n(ow3Var.c(A(P), obj2));
                                break;
                            case 19:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                ls0Var2.v(ow3Var.c(A(P), obj2));
                                break;
                            case 20:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                ls0Var2.C(ow3Var.c(A(P), obj2));
                                break;
                            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                ls0Var2.T(ow3Var.c(A(P), obj2));
                                break;
                            case 22:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                ls0Var2.A(ow3Var.c(A(P), obj2));
                                break;
                            case ConnectionResult.API_DISABLED /* 23 */:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                ls0Var2.t(ow3Var.c(A(P), obj2));
                                break;
                            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                ls0Var2.r(ow3Var.c(A(P), obj2));
                                break;
                            case 25:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                ls0Var2.j(ow3Var.c(A(P), obj2));
                                break;
                            case SubAllocator.N4 /* 26 */:
                                i4 = i5;
                                i2 = i6;
                                g82Var2 = g82Var3;
                                iArr = iArr2;
                                i54Var = i54Var2;
                                ls0Var2 = ls0Var3;
                                if ((536870912 & P) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    try {
                                        ls0Var2.O(ow3Var.c(P & 1048575, obj2), true);
                                    } catch (tb3 unused3) {
                                        ng7Var.getClass();
                                        if (obj3 == null) {
                                            pr2 pr2Var2 = (pr2) obj2;
                                            mg7 mg7Var3 = pr2Var2.unknownFields;
                                            if (mg7Var3 == mg7Var) {
                                                mg7Var3 = mg7.b();
                                                pr2Var2.unknownFields = mg7Var3;
                                            }
                                            obj3 = mg7Var3;
                                        }
                                        if (!ng7.a(obj3, ls0Var2)) {
                                            int i8 = i4;
                                            while (i2 < i8) {
                                                i54Var.l(iArr[i2], obj2, obj3);
                                                i2++;
                                            }
                                            if (obj3 == null) {
                                                return;
                                            }
                                            ((pr2) obj2).unknownFields = (mg7) obj3;
                                            return;
                                        }
                                        g82 g82Var42 = g82Var2;
                                        i5 = i4;
                                        i54Var2 = i54Var;
                                        g82Var3 = g82Var42;
                                        ls0Var3 = ls0Var2;
                                        iArr2 = iArr;
                                        i6 = i2;
                                    }
                                } else {
                                    ls0Var2.O(ow3Var.c(P & 1048575, obj2), false);
                                }
                            case 27:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                i54Var2.I(obj2, P, ls0Var3, i54Var2.o(i7), g82Var3);
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 28:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.l(ow3Var.c(A(P), obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 29:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.R(ow3Var.c(A(P), obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 30:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                List c = ow3Var.c(A(P), obj2);
                                ls0Var3.p(c);
                                obj3 = m66.v(e, c, i54Var2.m(i7), obj3, ng7Var);
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 31:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.G(ow3Var.c(A(P), obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 32:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.I(ow3Var.c(A(P), obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 33:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.K(ow3Var.c(A(P), obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 34:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.M(ow3Var.c(A(P), obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.n(ow3Var.c(A(P), obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 36:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.v(ow3Var.c(A(P), obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 37:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.C(ow3Var.c(A(P), obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case SubAllocator.N_INDEXES /* 38 */:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.T(ow3Var.c(P & 1048575, obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 39:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.A(ow3Var.c(P & 1048575, obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 40:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.t(ow3Var.c(P & 1048575, obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 41:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.r(ow3Var.c(P & 1048575, obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 42:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.j(ow3Var.c(P & 1048575, obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 43:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.R(ow3Var.c(P & 1048575, obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 44:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                List c2 = ow3Var.c(P & 1048575, obj2);
                                ls0Var3.p(c2);
                                obj3 = m66.v(e, c2, i54Var2.m(i7), obj3, ng7Var);
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 45:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.G(ow3Var.c(P & 1048575, obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 46:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.I(ow3Var.c(P & 1048575, obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 47:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.K(ow3Var.c(P & 1048575, obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case Compress.DC20 /* 48 */:
                                i4 = i5;
                                i2 = i6;
                                iArr = iArr2;
                                ls0Var3.M(ow3Var.c(P & 1048575, obj2));
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 49:
                                i2 = i6;
                                iArr = iArr2;
                                i4 = i5;
                                try {
                                    ls0Var3.y(ow3Var.c(P & 1048575, obj2), i54Var2.o(i7), g82Var3);
                                    ls0Var2 = ls0Var3;
                                    g82Var2 = g82Var3;
                                    i54Var = i54Var2;
                                } catch (tb3 unused4) {
                                    ls0Var2 = ls0Var3;
                                    g82Var2 = g82Var3;
                                    i54Var = i54Var2;
                                    ng7Var.getClass();
                                    if (obj3 == null) {
                                    }
                                    if (!ng7.a(obj3, ls0Var2)) {
                                    }
                                    g82 g82Var422 = g82Var2;
                                    i5 = i4;
                                    i54Var2 = i54Var;
                                    g82Var3 = g82Var422;
                                    ls0Var3 = ls0Var2;
                                    iArr2 = iArr;
                                    i6 = i2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    i54Var = i54Var2;
                                    i = i4;
                                    while (i2 < i) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                break;
                            case 50:
                                i2 = i6;
                                i54Var2.v(i7, obj2, i54Var2.n(i7));
                                throw null;
                                break;
                            case 51:
                                i2 = i6;
                                gh7.o(obj2, P & 1048575, Double.valueOf(ls0Var3.m()));
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 52:
                                i2 = i6;
                                gh7.o(obj2, P & 1048575, Float.valueOf(ls0Var3.u()));
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 53:
                                i2 = i6;
                                gh7.o(obj2, P & 1048575, Long.valueOf(ls0Var3.B()));
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 54:
                                i2 = i6;
                                gh7.o(obj2, P & 1048575, Long.valueOf(ls0Var3.S()));
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 55:
                                i2 = i6;
                                gh7.o(obj2, P & 1048575, Integer.valueOf(ls0Var3.z()));
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 56:
                                i2 = i6;
                                gh7.o(obj2, P & 1048575, Long.valueOf(ls0Var3.s()));
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 57:
                                i2 = i6;
                                gh7.o(obj2, P & 1048575, Integer.valueOf(ls0Var3.q()));
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 58:
                                i2 = i6;
                                gh7.o(obj2, P & 1048575, Boolean.valueOf(ls0Var3.i()));
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 59:
                                i2 = i6;
                                i54Var2.J(obj2, P, ls0Var3);
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case Compress.DC /* 60 */:
                                i2 = i6;
                                if (i54Var2.t(obj2, e, i7)) {
                                    long j = P & 1048575;
                                    gh7.o(obj2, j, aa3.c(gh7.d.i(j, obj2), ls0Var3.E(i54Var2.o(i7), g82Var3)));
                                } else {
                                    gh7.o(obj2, P & 1048575, ls0Var3.E(i54Var2.o(i7), g82Var3));
                                    i54Var2.L(i7, obj2);
                                }
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 61:
                                i2 = i6;
                                gh7.o(obj2, P & 1048575, ls0Var3.k());
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 62:
                                i2 = i6;
                                gh7.o(obj2, P & 1048575, Integer.valueOf(ls0Var3.Q()));
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 63:
                                i2 = i6;
                                int o3 = ls0Var3.o();
                                y93 m2 = i54Var2.m(i7);
                                if (m2 != null && !m2.a(o3)) {
                                    obj3 = m66.z(e, o3, obj3, ng7Var);
                                    iArr = iArr2;
                                    i4 = i5;
                                    ls0Var2 = ls0Var3;
                                    g82Var2 = g82Var3;
                                    i54Var = i54Var2;
                                    break;
                                }
                                gh7.o(obj2, P & 1048575, Integer.valueOf(o3));
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 64:
                                i2 = i6;
                                gh7.o(obj2, P & 1048575, Integer.valueOf(ls0Var3.F()));
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 65:
                                i2 = i6;
                                gh7.o(obj2, P & 1048575, Long.valueOf(ls0Var3.H()));
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 66:
                                i2 = i6;
                                gh7.o(obj2, P & 1048575, Integer.valueOf(ls0Var3.J()));
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 67:
                                i2 = i6;
                                gh7.o(obj2, P & 1048575, Long.valueOf(ls0Var3.L()));
                                i54Var2.M(obj2, e, i7);
                                iArr = iArr2;
                                i4 = i5;
                                ls0Var2 = ls0Var3;
                                g82Var2 = g82Var3;
                                i54Var = i54Var2;
                                break;
                            case 68:
                                i2 = i6;
                                try {
                                    gh7.o(obj2, P & 1048575, ls0Var3.x(i54Var2.o(i7), g82Var3));
                                    i54Var2.M(obj2, e, i7);
                                    iArr = iArr2;
                                    i4 = i5;
                                    ls0Var2 = ls0Var3;
                                    g82Var2 = g82Var3;
                                    i54Var = i54Var2;
                                } catch (tb3 unused5) {
                                    iArr = iArr2;
                                    i4 = i5;
                                    ls0Var2 = ls0Var3;
                                    g82Var2 = g82Var3;
                                    i54Var = i54Var2;
                                    ng7Var.getClass();
                                    if (obj3 == null) {
                                    }
                                    if (!ng7.a(obj3, ls0Var2)) {
                                    }
                                    g82 g82Var4222 = g82Var2;
                                    i5 = i4;
                                    i54Var2 = i54Var;
                                    g82Var3 = g82Var4222;
                                    ls0Var3 = ls0Var2;
                                    iArr2 = iArr;
                                    i6 = i2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    i54Var = i54Var2;
                                    iArr = iArr2;
                                    i = i5;
                                    while (i2 < i) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                break;
                            default:
                                if (obj3 == null) {
                                    try {
                                        ng7Var.getClass();
                                        obj3 = mg7.b();
                                    } catch (tb3 unused6) {
                                        i4 = i5;
                                        i2 = i6;
                                        g82Var2 = g82Var3;
                                        iArr = iArr2;
                                        i54Var = i54Var2;
                                        ls0Var2 = ls0Var3;
                                        ng7Var.getClass();
                                        if (obj3 == null) {
                                        }
                                        if (!ng7.a(obj3, ls0Var2)) {
                                        }
                                        g82 g82Var42222 = g82Var2;
                                        i5 = i4;
                                        i54Var2 = i54Var;
                                        g82Var3 = g82Var42222;
                                        ls0Var3 = ls0Var2;
                                        iArr2 = iArr;
                                        i6 = i2;
                                    }
                                }
                                ng7Var.getClass();
                                if (!ng7.a(obj3, ls0Var3)) {
                                    while (i6 < i5) {
                                        i54Var2.l(iArr2[i6], obj2, obj3);
                                        i6++;
                                    }
                                    break;
                                } else {
                                    i4 = i5;
                                    i2 = i6;
                                    g82Var2 = g82Var3;
                                    iArr = iArr2;
                                    i54Var = i54Var2;
                                    ls0Var2 = ls0Var3;
                                }
                                break;
                        }
                    } catch (tb3 unused7) {
                        i4 = i5;
                        i2 = i6;
                    } catch (Throwable th6) {
                        th = th6;
                        i54Var = i54Var2;
                        i4 = i5;
                        i2 = i6;
                        iArr = iArr2;
                    }
                    g82 g82Var422222 = g82Var2;
                    i5 = i4;
                    i54Var2 = i54Var;
                    g82Var3 = g82Var422222;
                    ls0Var3 = ls0Var2;
                    iArr2 = iArr;
                    i6 = i2;
                }
            } catch (Throwable th7) {
                th = th7;
                i54Var = i54Var2;
                i = i5;
                i2 = i6;
                iArr = iArr2;
            }
        }
    }

    @Override // defpackage.j66
    public final void e(Object obj, os0 os0Var) {
        os0Var.getClass();
        cy7 cy7Var = cy7.ASCENDING;
        cy7 cy7Var2 = cy7.DESCENDING;
        y04 y04Var = this.n;
        int[] iArr = this.a;
        ng7 ng7Var = this.m;
        if (cy7Var == cy7Var2) {
            ng7Var.getClass();
            ((pr2) obj).unknownFields.d(os0Var);
            for (int length = iArr.length - 3; length >= 0; length -= 3) {
                int P = P(length);
                int i = iArr[length];
                switch (O(P)) {
                    case 0:
                        if (s(length, obj)) {
                            os0Var.j0(i, gh7.d.e(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (s(length, obj)) {
                            os0Var.n0(i, gh7.d.f(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (s(length, obj)) {
                            os0Var.q0(i, gh7.d.h(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (s(length, obj)) {
                            os0Var.x0(i, gh7.d.h(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (s(length, obj)) {
                            os0Var.p0(i, gh7.d.g(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (s(length, obj)) {
                            os0Var.m0(i, gh7.d.h(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (s(length, obj)) {
                            os0Var.l0(i, gh7.d.g(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (s(length, obj)) {
                            os0Var.h0(i, gh7.d.c(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (s(length, obj)) {
                            R(i, gh7.d.i(P & 1048575, obj), os0Var);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (s(length, obj)) {
                            os0Var.r0(i, gh7.d.i(P & 1048575, obj), o(length));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (s(length, obj)) {
                            os0Var.i0(i, (ea0) gh7.d.i(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (s(length, obj)) {
                            os0Var.w0(i, gh7.d.g(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (s(length, obj)) {
                            os0Var.k0(i, gh7.d.g(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (s(length, obj)) {
                            os0Var.s0(i, gh7.d.g(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (s(length, obj)) {
                            os0Var.t0(i, gh7.d.h(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (s(length, obj)) {
                            os0Var.u0(i, gh7.d.g(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (s(length, obj)) {
                            os0Var.v0(i, gh7.d.h(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (s(length, obj)) {
                            os0Var.o0(i, gh7.d.i(P & 1048575, obj), o(length));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        m66.C(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, false);
                        break;
                    case 19:
                        m66.G(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, false);
                        break;
                    case 20:
                        m66.J(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, false);
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        m66.R(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, false);
                        break;
                    case 22:
                        m66.I(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, false);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        m66.F(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, false);
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        m66.E(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, false);
                        break;
                    case 25:
                        m66.A(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, false);
                        break;
                    case SubAllocator.N4 /* 26 */:
                        m66.P(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var);
                        break;
                    case 27:
                        m66.K(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, o(length));
                        break;
                    case 28:
                        m66.B(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var);
                        break;
                    case 29:
                        m66.Q(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, false);
                        break;
                    case 30:
                        m66.D(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, false);
                        break;
                    case 31:
                        m66.L(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, false);
                        break;
                    case 32:
                        m66.M(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, false);
                        break;
                    case 33:
                        m66.N(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, false);
                        break;
                    case 34:
                        m66.O(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, false);
                        break;
                    case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                        m66.C(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, true);
                        break;
                    case 36:
                        m66.G(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, true);
                        break;
                    case 37:
                        m66.J(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, true);
                        break;
                    case SubAllocator.N_INDEXES /* 38 */:
                        m66.R(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, true);
                        break;
                    case 39:
                        m66.I(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, true);
                        break;
                    case 40:
                        m66.F(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, true);
                        break;
                    case 41:
                        m66.E(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, true);
                        break;
                    case 42:
                        m66.A(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, true);
                        break;
                    case 43:
                        m66.Q(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, true);
                        break;
                    case 44:
                        m66.D(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, true);
                        break;
                    case 45:
                        m66.L(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, true);
                        break;
                    case 46:
                        m66.M(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, true);
                        break;
                    case 47:
                        m66.N(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, true);
                        break;
                    case Compress.DC20 /* 48 */:
                        m66.O(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, true);
                        break;
                    case 49:
                        m66.H(iArr[length], (List) gh7.d.i(P & 1048575, obj), os0Var, o(length));
                        break;
                    case 50:
                        if (gh7.d.i(P & 1048575, obj) != null) {
                            Object n = n(length);
                            y04Var.getClass();
                            xg6.A(n);
                            throw null;
                        }
                        break;
                    case 51:
                        if (t(obj, i, length)) {
                            os0Var.j0(i, ((Double) gh7.d.i(P & 1048575, obj)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (t(obj, i, length)) {
                            os0Var.n0(i, ((Float) gh7.d.i(P & 1048575, obj)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (t(obj, i, length)) {
                            os0Var.q0(i, C(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (t(obj, i, length)) {
                            os0Var.x0(i, C(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (t(obj, i, length)) {
                            os0Var.p0(i, B(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (t(obj, i, length)) {
                            os0Var.m0(i, C(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (t(obj, i, length)) {
                            os0Var.l0(i, B(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (t(obj, i, length)) {
                            os0Var.h0(i, ((Boolean) gh7.d.i(P & 1048575, obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (t(obj, i, length)) {
                            R(i, gh7.d.i(P & 1048575, obj), os0Var);
                            break;
                        } else {
                            break;
                        }
                    case Compress.DC /* 60 */:
                        if (t(obj, i, length)) {
                            os0Var.r0(i, gh7.d.i(P & 1048575, obj), o(length));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (t(obj, i, length)) {
                            os0Var.i0(i, (ea0) gh7.d.i(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (t(obj, i, length)) {
                            os0Var.w0(i, B(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (t(obj, i, length)) {
                            os0Var.k0(i, B(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (t(obj, i, length)) {
                            os0Var.s0(i, B(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (t(obj, i, length)) {
                            os0Var.t0(i, C(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (t(obj, i, length)) {
                            os0Var.u0(i, B(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (t(obj, i, length)) {
                            os0Var.v0(i, C(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (t(obj, i, length)) {
                            os0Var.o0(i, gh7.d.i(P & 1048575, obj), o(length));
                            break;
                        } else {
                            break;
                        }
                }
            }
        } else if (this.g) {
            int length2 = iArr.length;
            for (int i2 = 0; i2 < length2; i2 += 3) {
                int P2 = P(i2);
                int i3 = iArr[i2];
                switch (O(P2)) {
                    case 0:
                        if (s(i2, obj)) {
                            os0Var.j0(i3, gh7.d.e(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (s(i2, obj)) {
                            os0Var.n0(i3, gh7.d.f(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (s(i2, obj)) {
                            os0Var.q0(i3, gh7.d.h(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (s(i2, obj)) {
                            os0Var.x0(i3, gh7.d.h(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (s(i2, obj)) {
                            os0Var.p0(i3, gh7.d.g(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (s(i2, obj)) {
                            os0Var.m0(i3, gh7.d.h(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (s(i2, obj)) {
                            os0Var.l0(i3, gh7.d.g(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (s(i2, obj)) {
                            os0Var.h0(i3, gh7.d.c(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (s(i2, obj)) {
                            R(i3, gh7.d.i(P2 & 1048575, obj), os0Var);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (s(i2, obj)) {
                            os0Var.r0(i3, gh7.d.i(P2 & 1048575, obj), o(i2));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (s(i2, obj)) {
                            os0Var.i0(i3, (ea0) gh7.d.i(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (s(i2, obj)) {
                            os0Var.w0(i3, gh7.d.g(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (s(i2, obj)) {
                            os0Var.k0(i3, gh7.d.g(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (s(i2, obj)) {
                            os0Var.s0(i3, gh7.d.g(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (s(i2, obj)) {
                            os0Var.t0(i3, gh7.d.h(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (s(i2, obj)) {
                            os0Var.u0(i3, gh7.d.g(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (s(i2, obj)) {
                            os0Var.v0(i3, gh7.d.h(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (s(i2, obj)) {
                            os0Var.o0(i3, gh7.d.i(P2 & 1048575, obj), o(i2));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        m66.C(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, false);
                        break;
                    case 19:
                        m66.G(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, false);
                        break;
                    case 20:
                        m66.J(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, false);
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        m66.R(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, false);
                        break;
                    case 22:
                        m66.I(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, false);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        m66.F(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, false);
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        m66.E(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, false);
                        break;
                    case 25:
                        m66.A(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, false);
                        break;
                    case SubAllocator.N4 /* 26 */:
                        m66.P(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var);
                        break;
                    case 27:
                        m66.K(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, o(i2));
                        break;
                    case 28:
                        m66.B(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var);
                        break;
                    case 29:
                        m66.Q(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, false);
                        break;
                    case 30:
                        m66.D(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, false);
                        break;
                    case 31:
                        m66.L(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, false);
                        break;
                    case 32:
                        m66.M(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, false);
                        break;
                    case 33:
                        m66.N(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, false);
                        break;
                    case 34:
                        m66.O(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, false);
                        break;
                    case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                        m66.C(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, true);
                        break;
                    case 36:
                        m66.G(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, true);
                        break;
                    case 37:
                        m66.J(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, true);
                        break;
                    case SubAllocator.N_INDEXES /* 38 */:
                        m66.R(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, true);
                        break;
                    case 39:
                        m66.I(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, true);
                        break;
                    case 40:
                        m66.F(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, true);
                        break;
                    case 41:
                        m66.E(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, true);
                        break;
                    case 42:
                        m66.A(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, true);
                        break;
                    case 43:
                        m66.Q(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, true);
                        break;
                    case 44:
                        m66.D(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, true);
                        break;
                    case 45:
                        m66.L(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, true);
                        break;
                    case 46:
                        m66.M(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, true);
                        break;
                    case 47:
                        m66.N(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, true);
                        break;
                    case Compress.DC20 /* 48 */:
                        m66.O(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, true);
                        break;
                    case 49:
                        m66.H(iArr[i2], (List) gh7.d.i(P2 & 1048575, obj), os0Var, o(i2));
                        break;
                    case 50:
                        if (gh7.d.i(P2 & 1048575, obj) != null) {
                            Object n2 = n(i2);
                            y04Var.getClass();
                            xg6.A(n2);
                            throw null;
                        }
                        break;
                    case 51:
                        if (t(obj, i3, i2)) {
                            os0Var.j0(i3, ((Double) gh7.d.i(P2 & 1048575, obj)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (t(obj, i3, i2)) {
                            os0Var.n0(i3, ((Float) gh7.d.i(P2 & 1048575, obj)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (t(obj, i3, i2)) {
                            os0Var.q0(i3, C(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (t(obj, i3, i2)) {
                            os0Var.x0(i3, C(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (t(obj, i3, i2)) {
                            os0Var.p0(i3, B(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (t(obj, i3, i2)) {
                            os0Var.m0(i3, C(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (t(obj, i3, i2)) {
                            os0Var.l0(i3, B(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (t(obj, i3, i2)) {
                            os0Var.h0(i3, ((Boolean) gh7.d.i(P2 & 1048575, obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (t(obj, i3, i2)) {
                            R(i3, gh7.d.i(P2 & 1048575, obj), os0Var);
                            break;
                        } else {
                            break;
                        }
                    case Compress.DC /* 60 */:
                        if (t(obj, i3, i2)) {
                            os0Var.r0(i3, gh7.d.i(P2 & 1048575, obj), o(i2));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (t(obj, i3, i2)) {
                            os0Var.i0(i3, (ea0) gh7.d.i(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (t(obj, i3, i2)) {
                            os0Var.w0(i3, B(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (t(obj, i3, i2)) {
                            os0Var.k0(i3, B(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (t(obj, i3, i2)) {
                            os0Var.s0(i3, B(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (t(obj, i3, i2)) {
                            os0Var.t0(i3, C(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (t(obj, i3, i2)) {
                            os0Var.u0(i3, B(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (t(obj, i3, i2)) {
                            os0Var.v0(i3, C(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (t(obj, i3, i2)) {
                            os0Var.o0(i3, gh7.d.i(P2 & 1048575, obj), o(i2));
                            break;
                        } else {
                            break;
                        }
                }
            }
            ng7Var.getClass();
            ((pr2) obj).unknownFields.d(os0Var);
        } else {
            Q(obj, os0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
        if (r4 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0216, code lost:
        if (r4 != false) goto L52;
     */
    @Override // defpackage.j66
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(pr2 pr2Var) {
        int i;
        int b;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int P = P(i4);
            int i5 = iArr[i4];
            long j = 1048575 & P;
            int i6 = 1237;
            int i7 = 37;
            switch (O(P)) {
                case 0:
                    i = i3 * 53;
                    b = aa3.b(Double.doubleToLongBits(gh7.d.e(j, pr2Var)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(gh7.d.f(j, pr2Var));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = aa3.b(gh7.d.h(j, pr2Var));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = aa3.b(gh7.d.h(j, pr2Var));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = gh7.d.g(j, pr2Var);
                    i3 = b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    b = aa3.b(gh7.d.h(j, pr2Var));
                    i3 = b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    b = gh7.d.g(j, pr2Var);
                    i3 = b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean c = gh7.d.c(j, pr2Var);
                    Charset charset = aa3.a;
                    break;
                case 8:
                    i = i3 * 53;
                    b = ((String) gh7.d.i(j, pr2Var)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object i8 = gh7.d.i(j, pr2Var);
                    if (i8 != null) {
                        i7 = i8.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    b = gh7.d.i(j, pr2Var).hashCode();
                    i3 = b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    b = gh7.d.g(j, pr2Var);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = gh7.d.g(j, pr2Var);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = gh7.d.g(j, pr2Var);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = aa3.b(gh7.d.h(j, pr2Var));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = gh7.d.g(j, pr2Var);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = aa3.b(gh7.d.h(j, pr2Var));
                    i3 = b + i;
                    break;
                case 17:
                    Object i9 = gh7.d.i(j, pr2Var);
                    if (i9 != null) {
                        i7 = i9.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
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
                    i = i3 * 53;
                    b = gh7.d.i(j, pr2Var).hashCode();
                    i3 = b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    b = gh7.d.i(j, pr2Var).hashCode();
                    i3 = b + i;
                    break;
                case 51:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = aa3.b(Double.doubleToLongBits(((Double) gh7.d.i(j, pr2Var)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) gh7.d.i(j, pr2Var)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = aa3.b(C(j, pr2Var));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = aa3.b(C(j, pr2Var));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = B(j, pr2Var);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = aa3.b(C(j, pr2Var));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = B(j, pr2Var);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (t(pr2Var, i5, i4)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) gh7.d.i(j, pr2Var)).booleanValue();
                        Charset charset2 = aa3.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = ((String) gh7.d.i(j, pr2Var)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case Compress.DC /* 60 */:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = gh7.d.i(j, pr2Var).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = gh7.d.i(j, pr2Var).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = B(j, pr2Var);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = B(j, pr2Var);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = B(j, pr2Var);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = aa3.b(C(j, pr2Var));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = B(j, pr2Var);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = aa3.b(C(j, pr2Var));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (t(pr2Var, i5, i4)) {
                        i = i3 * 53;
                        b = gh7.d.i(j, pr2Var).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.m.getClass();
        return pr2Var.unknownFields.hashCode() + (i3 * 53);
    }

    @Override // defpackage.j66
    public final void g(pr2 pr2Var, pr2 pr2Var2) {
        pr2 pr2Var3;
        pr2Var2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int P = P(i);
                long j = 1048575 & P;
                int i2 = iArr[i];
                switch (O(P)) {
                    case 0:
                        if (s(i, pr2Var2)) {
                            fh7 fh7Var = gh7.d;
                            pr2Var3 = pr2Var;
                            fh7Var.m(pr2Var3, j, fh7Var.e(j, pr2Var2));
                            L(i, pr2Var3);
                            continue;
                            i += 3;
                            pr2Var = pr2Var3;
                        }
                        break;
                    case 1:
                        if (s(i, pr2Var2)) {
                            fh7 fh7Var2 = gh7.d;
                            fh7Var2.n(pr2Var, j, fh7Var2.f(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 2:
                        if (s(i, pr2Var2)) {
                            gh7.n(pr2Var, j, gh7.d.h(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 3:
                        if (s(i, pr2Var2)) {
                            gh7.n(pr2Var, j, gh7.d.h(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 4:
                        if (s(i, pr2Var2)) {
                            gh7.m(pr2Var, j, gh7.d.g(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 5:
                        if (s(i, pr2Var2)) {
                            gh7.n(pr2Var, j, gh7.d.h(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 6:
                        if (s(i, pr2Var2)) {
                            gh7.m(pr2Var, j, gh7.d.g(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 7:
                        if (s(i, pr2Var2)) {
                            fh7 fh7Var3 = gh7.d;
                            fh7Var3.k(pr2Var, j, fh7Var3.c(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 8:
                        if (s(i, pr2Var2)) {
                            gh7.o(pr2Var, j, gh7.d.i(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 9:
                        w(i, pr2Var, pr2Var2);
                        break;
                    case 10:
                        if (s(i, pr2Var2)) {
                            gh7.o(pr2Var, j, gh7.d.i(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 11:
                        if (s(i, pr2Var2)) {
                            gh7.m(pr2Var, j, gh7.d.g(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 12:
                        if (s(i, pr2Var2)) {
                            gh7.m(pr2Var, j, gh7.d.g(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 13:
                        if (s(i, pr2Var2)) {
                            gh7.m(pr2Var, j, gh7.d.g(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 14:
                        if (s(i, pr2Var2)) {
                            gh7.n(pr2Var, j, gh7.d.h(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 15:
                        if (s(i, pr2Var2)) {
                            gh7.m(pr2Var, j, gh7.d.g(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 16:
                        if (s(i, pr2Var2)) {
                            gh7.n(pr2Var, j, gh7.d.h(j, pr2Var2));
                            L(i, pr2Var);
                            break;
                        }
                        break;
                    case 17:
                        w(i, pr2Var, pr2Var2);
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
                        this.l.b(pr2Var, j, pr2Var2);
                        break;
                    case 50:
                        Class cls = m66.a;
                        fh7 fh7Var4 = gh7.d;
                        Object i3 = fh7Var4.i(j, pr2Var);
                        Object i4 = fh7Var4.i(j, pr2Var2);
                        this.n.getClass();
                        gh7.o(pr2Var, j, y04.b(i3, i4));
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
                        if (t(pr2Var2, i2, i)) {
                            gh7.o(pr2Var, j, gh7.d.i(j, pr2Var2));
                            M(pr2Var, i2, i);
                            break;
                        }
                        break;
                    case Compress.DC /* 60 */:
                        x(i, pr2Var, pr2Var2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (t(pr2Var2, i2, i)) {
                            gh7.o(pr2Var, j, gh7.d.i(j, pr2Var2));
                            M(pr2Var, i2, i);
                            break;
                        }
                        break;
                    case 68:
                        x(i, pr2Var, pr2Var2);
                        break;
                }
                pr2Var3 = pr2Var;
                i += 3;
                pr2Var = pr2Var3;
            } else {
                m66.x(this.m, pr2Var, pr2Var2);
                return;
            }
        }
    }

    @Override // defpackage.j66
    public final void h(Object obj, byte[] bArr, int i, int i2, ou ouVar) {
        if (this.g) {
            G(obj, bArr, i, i2, ouVar);
        } else {
            F(obj, bArr, i, i2, 0, ouVar);
        }
    }

    @Override // defpackage.j66
    public final int i(c1 c1Var) {
        if (this.g) {
            return r(c1Var);
        }
        return q(c1Var);
    }

    @Override // defpackage.j66
    public final Object j() {
        this.k.getClass();
        return ((pr2) this.e).f(or2.NEW_MUTABLE_INSTANCE);
    }

    public final boolean k(pr2 pr2Var, Object obj, int i) {
        if (s(i, pr2Var) == s(i, obj)) {
            return true;
        }
        return false;
    }

    public final void l(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        Object i3 = gh7.d.i(P(i) & 1048575, obj);
        if (i3 == null || m(i) == null) {
            return;
        }
        this.n.getClass();
        x04 x04Var = (x04) i3;
        xg6.A(n(i));
        throw null;
    }

    public final y93 m(int i) {
        return (y93) this.b[((i / 3) * 2) + 1];
    }

    public final Object n(int i) {
        return this.b[(i / 3) * 2];
    }

    public final j66 o(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        j66 j66Var = (j66) objArr[i2];
        if (j66Var != null) {
            return j66Var;
        }
        j66 a = y45.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final int q(Object obj) {
        int i;
        int h;
        int j;
        int h2;
        int f;
        int d;
        int h3;
        int g;
        int b;
        int h4;
        int i2;
        Unsafe unsafe = p;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 < iArr.length) {
                int P = P(i4);
                int i7 = iArr[i4];
                int O = O(P);
                if (O <= 17) {
                    int i8 = iArr[i4 + 2];
                    int i9 = i8 & 1048575;
                    i = 1 << (i8 >>> 20);
                    if (i9 != i3) {
                        i6 = unsafe.getInt(obj, i9);
                        i3 = i9;
                    }
                } else {
                    i = 0;
                }
                long j2 = P & 1048575;
                switch (O) {
                    case 0:
                        if ((i6 & i) != 0) {
                            i5 = lb1.y(i7, 8, i5);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if ((i & i6) != 0) {
                            i5 = lb1.y(i7, 4, i5);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if ((i6 & i) != 0) {
                            long j3 = unsafe.getLong(obj, j2);
                            h = ms0.h(i7);
                            j = ms0.j(j3);
                            h4 = j + h;
                            i5 += h4;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if ((i6 & i) != 0) {
                            long j4 = unsafe.getLong(obj, j2);
                            h = ms0.h(i7);
                            j = ms0.j(j4);
                            h4 = j + h;
                            i5 += h4;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if ((i6 & i) != 0) {
                            int i10 = unsafe.getInt(obj, j2);
                            h2 = ms0.h(i7);
                            f = ms0.f(i10);
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if ((i6 & i) != 0) {
                            d = ms0.d(i7);
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if ((i6 & i) != 0) {
                            d = ms0.c(i7);
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if ((i6 & i) != 0) {
                            i5 = lb1.y(i7, 1, i5);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if ((i6 & i) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(obj, j2);
                            if (object instanceof ea0) {
                                int h5 = ms0.h(i7);
                                int size = ((ea0) object).size();
                                b = lb1.b(size, size, h5, i5);
                                i5 = b;
                                break;
                            } else {
                                h3 = ms0.h(i7);
                                g = ms0.g((String) object);
                                b = g + h3 + i5;
                                i5 = b;
                            }
                        }
                    case 9:
                        if ((i6 & i) != 0) {
                            Object object2 = unsafe.getObject(obj, j2);
                            j66 o2 = o(i4);
                            Class cls = m66.a;
                            c1 c1Var = (c1) object2;
                            int h6 = ms0.h(i7);
                            c1Var.getClass();
                            pr2 pr2Var = (pr2) c1Var;
                            int i11 = pr2Var.memoizedSerializedSize;
                            if (i11 == -1) {
                                i11 = o2.i(c1Var);
                                pr2Var.memoizedSerializedSize = i11;
                            }
                            i5 = lb1.b(i11, i11, h6, i5);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if ((i6 & i) != 0) {
                            d = ms0.a(i7, (ea0) unsafe.getObject(obj, j2));
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if ((i6 & i) != 0) {
                            int i12 = unsafe.getInt(obj, j2);
                            h2 = ms0.h(i7);
                            f = ms0.i(i12);
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if ((i6 & i) != 0) {
                            int i13 = unsafe.getInt(obj, j2);
                            h2 = ms0.h(i7);
                            f = ms0.f(i13);
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if ((i & i6) != 0) {
                            i5 = lb1.y(i7, 4, i5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if ((i6 & i) != 0) {
                            i5 = lb1.y(i7, 8, i5);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if ((i6 & i) != 0) {
                            int i14 = unsafe.getInt(obj, j2);
                            h2 = ms0.h(i7);
                            f = ms0.i((i14 >> 31) ^ (i14 << 1));
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if ((i6 & i) != 0) {
                            long j5 = unsafe.getLong(obj, j2);
                            h = ms0.h(i7);
                            j = ms0.j((j5 >> 63) ^ (j5 << 1));
                            h4 = j + h;
                            i5 += h4;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if ((i6 & i) != 0) {
                            d = ms0.e(i7, (c1) unsafe.getObject(obj, j2), o(i4));
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        d = m66.f(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 19:
                        d = m66.d(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 20:
                        d = m66.j(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        d = m66.t(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 22:
                        d = m66.h(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        d = m66.f(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        d = m66.d(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 25:
                        Class cls2 = m66.a;
                        int size2 = ((List) unsafe.getObject(obj, j2)).size();
                        if (size2 == 0) {
                            h4 = 0;
                        } else {
                            h4 = (ms0.h(i7) + 1) * size2;
                        }
                        i5 += h4;
                        break;
                    case SubAllocator.N4 /* 26 */:
                        d = m66.q(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 27:
                        d = m66.l(i7, (List) unsafe.getObject(obj, j2), o(i4));
                        i5 += d;
                        break;
                    case 28:
                        d = m66.a(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 29:
                        d = m66.r(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 30:
                        d = m66.b(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 31:
                        d = m66.d(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 32:
                        d = m66.f(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 33:
                        d = m66.m(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 34:
                        d = m66.o(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                        int g2 = m66.g((List) unsafe.getObject(obj, j2));
                        if (g2 > 0) {
                            i5 = lb1.b(g2, ms0.h(i7), g2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int e = m66.e((List) unsafe.getObject(obj, j2));
                        if (e > 0) {
                            i5 = lb1.b(e, ms0.h(i7), e, i5);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int k = m66.k((List) unsafe.getObject(obj, j2));
                        if (k > 0) {
                            i5 = lb1.b(k, ms0.h(i7), k, i5);
                            break;
                        } else {
                            break;
                        }
                    case SubAllocator.N_INDEXES /* 38 */:
                        int u = m66.u((List) unsafe.getObject(obj, j2));
                        if (u > 0) {
                            i5 = lb1.b(u, ms0.h(i7), u, i5);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int i15 = m66.i((List) unsafe.getObject(obj, j2));
                        if (i15 > 0) {
                            i5 = lb1.b(i15, ms0.h(i7), i15, i5);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int g3 = m66.g((List) unsafe.getObject(obj, j2));
                        if (g3 > 0) {
                            i5 = lb1.b(g3, ms0.h(i7), g3, i5);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int e2 = m66.e((List) unsafe.getObject(obj, j2));
                        if (e2 > 0) {
                            i5 = lb1.b(e2, ms0.h(i7), e2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls3 = m66.a;
                        int size3 = ((List) unsafe.getObject(obj, j2)).size();
                        if (size3 > 0) {
                            i5 = lb1.b(size3, ms0.h(i7), size3, i5);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int s = m66.s((List) unsafe.getObject(obj, j2));
                        if (s > 0) {
                            i5 = lb1.b(s, ms0.h(i7), s, i5);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int c = m66.c((List) unsafe.getObject(obj, j2));
                        if (c > 0) {
                            i5 = lb1.b(c, ms0.h(i7), c, i5);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int e3 = m66.e((List) unsafe.getObject(obj, j2));
                        if (e3 > 0) {
                            i5 = lb1.b(e3, ms0.h(i7), e3, i5);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int g4 = m66.g((List) unsafe.getObject(obj, j2));
                        if (g4 > 0) {
                            i5 = lb1.b(g4, ms0.h(i7), g4, i5);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int n = m66.n((List) unsafe.getObject(obj, j2));
                        if (n > 0) {
                            i5 = lb1.b(n, ms0.h(i7), n, i5);
                            break;
                        } else {
                            break;
                        }
                    case Compress.DC20 /* 48 */:
                        int p2 = m66.p((List) unsafe.getObject(obj, j2));
                        if (p2 > 0) {
                            i5 = lb1.b(p2, ms0.h(i7), p2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list = (List) unsafe.getObject(obj, j2);
                        j66 o3 = o(i4);
                        Class cls4 = m66.a;
                        int size4 = list.size();
                        if (size4 == 0) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                            for (int i16 = 0; i16 < size4; i16++) {
                                i2 += ms0.e(i7, (c1) list.get(i16), o3);
                            }
                        }
                        i5 += i2;
                        break;
                    case 50:
                        Object object3 = unsafe.getObject(obj, j2);
                        Object n2 = n(i4);
                        this.n.getClass();
                        y04.a(object3, n2);
                        break;
                    case 51:
                        if (t(obj, i7, i4)) {
                            i5 = lb1.y(i7, 8, i5);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (t(obj, i7, i4)) {
                            i5 = lb1.y(i7, 4, i5);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (t(obj, i7, i4)) {
                            long C = C(j2, obj);
                            h = ms0.h(i7);
                            j = ms0.j(C);
                            h4 = j + h;
                            i5 += h4;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (t(obj, i7, i4)) {
                            long C2 = C(j2, obj);
                            h = ms0.h(i7);
                            j = ms0.j(C2);
                            h4 = j + h;
                            i5 += h4;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (t(obj, i7, i4)) {
                            int B = B(j2, obj);
                            h2 = ms0.h(i7);
                            f = ms0.f(B);
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (t(obj, i7, i4)) {
                            d = ms0.d(i7);
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (t(obj, i7, i4)) {
                            d = ms0.c(i7);
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (t(obj, i7, i4)) {
                            i5 = lb1.y(i7, 1, i5);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!t(obj, i7, i4)) {
                            break;
                        } else {
                            Object object4 = unsafe.getObject(obj, j2);
                            if (object4 instanceof ea0) {
                                int h7 = ms0.h(i7);
                                int size5 = ((ea0) object4).size();
                                b = lb1.b(size5, size5, h7, i5);
                                i5 = b;
                                break;
                            } else {
                                h3 = ms0.h(i7);
                                g = ms0.g((String) object4);
                                b = g + h3 + i5;
                                i5 = b;
                            }
                        }
                    case Compress.DC /* 60 */:
                        if (t(obj, i7, i4)) {
                            Object object5 = unsafe.getObject(obj, j2);
                            j66 o4 = o(i4);
                            Class cls5 = m66.a;
                            c1 c1Var2 = (c1) object5;
                            int h8 = ms0.h(i7);
                            c1Var2.getClass();
                            pr2 pr2Var2 = (pr2) c1Var2;
                            int i17 = pr2Var2.memoizedSerializedSize;
                            if (i17 == -1) {
                                i17 = o4.i(c1Var2);
                                pr2Var2.memoizedSerializedSize = i17;
                            }
                            i5 = lb1.b(i17, i17, h8, i5);
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (t(obj, i7, i4)) {
                            d = ms0.a(i7, (ea0) unsafe.getObject(obj, j2));
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (t(obj, i7, i4)) {
                            int B2 = B(j2, obj);
                            h2 = ms0.h(i7);
                            f = ms0.i(B2);
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (t(obj, i7, i4)) {
                            int B3 = B(j2, obj);
                            h2 = ms0.h(i7);
                            f = ms0.f(B3);
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (t(obj, i7, i4)) {
                            i5 = lb1.y(i7, 4, i5);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (t(obj, i7, i4)) {
                            i5 = lb1.y(i7, 8, i5);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (t(obj, i7, i4)) {
                            int B4 = B(j2, obj);
                            h2 = ms0.h(i7);
                            f = ms0.i((B4 >> 31) ^ (B4 << 1));
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (t(obj, i7, i4)) {
                            long C3 = C(j2, obj);
                            h = ms0.h(i7);
                            j = ms0.j((C3 >> 63) ^ (C3 << 1));
                            h4 = j + h;
                            i5 += h4;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (t(obj, i7, i4)) {
                            d = ms0.e(i7, (c1) unsafe.getObject(obj, j2), o(i4));
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                }
                i4 += 3;
            } else {
                this.m.getClass();
                return ((pr2) obj).unknownFields.a() + i5;
            }
        }
    }

    public final int r(Object obj) {
        int h;
        int j;
        int h2;
        int f;
        int d;
        int h3;
        int g;
        int h4;
        int j2;
        int h5;
        int i;
        Unsafe unsafe = p;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int P = P(i2);
                int O = O(P);
                int i4 = iArr[i2];
                long j3 = P & 1048575;
                if (O >= sa2.DOUBLE_LIST_PACKED.id() && O <= sa2.SINT64_LIST_PACKED.id()) {
                    int i5 = iArr[i2 + 2];
                }
                switch (O) {
                    case 0:
                        if (s(i2, obj)) {
                            i3 = lb1.y(i4, 8, i3);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (s(i2, obj)) {
                            i3 = lb1.y(i4, 4, i3);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (s(i2, obj)) {
                            long h6 = gh7.d.h(j3, obj);
                            h = ms0.h(i4);
                            j = ms0.j(h6);
                            d = j + h;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (s(i2, obj)) {
                            long h7 = gh7.d.h(j3, obj);
                            h = ms0.h(i4);
                            j = ms0.j(h7);
                            d = j + h;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (s(i2, obj)) {
                            int g2 = gh7.d.g(j3, obj);
                            h2 = ms0.h(i4);
                            f = ms0.f(g2);
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (s(i2, obj)) {
                            d = ms0.d(i4);
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (s(i2, obj)) {
                            d = ms0.c(i4);
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (s(i2, obj)) {
                            i3 = lb1.y(i4, 1, i3);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (s(i2, obj)) {
                            Object i6 = gh7.d.i(j3, obj);
                            if (i6 instanceof ea0) {
                                int h8 = ms0.h(i4);
                                int size = ((ea0) i6).size();
                                i3 = lb1.b(size, size, h8, i3);
                                break;
                            } else {
                                h3 = ms0.h(i4);
                                g = ms0.g((String) i6);
                                i3 = g + h3 + i3;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (s(i2, obj)) {
                            Object i7 = gh7.d.i(j3, obj);
                            j66 o2 = o(i2);
                            Class cls = m66.a;
                            c1 c1Var = (c1) i7;
                            int h9 = ms0.h(i4);
                            c1Var.getClass();
                            pr2 pr2Var = (pr2) c1Var;
                            int i8 = pr2Var.memoizedSerializedSize;
                            if (i8 == -1) {
                                i8 = o2.i(c1Var);
                                pr2Var.memoizedSerializedSize = i8;
                            }
                            i3 = lb1.b(i8, i8, h9, i3);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (s(i2, obj)) {
                            d = ms0.a(i4, (ea0) gh7.d.i(j3, obj));
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (s(i2, obj)) {
                            int g3 = gh7.d.g(j3, obj);
                            h2 = ms0.h(i4);
                            f = ms0.i(g3);
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (s(i2, obj)) {
                            int g4 = gh7.d.g(j3, obj);
                            h2 = ms0.h(i4);
                            f = ms0.f(g4);
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (s(i2, obj)) {
                            i3 = lb1.y(i4, 4, i3);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (s(i2, obj)) {
                            i3 = lb1.y(i4, 8, i3);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (s(i2, obj)) {
                            int g5 = gh7.d.g(j3, obj);
                            h2 = ms0.h(i4);
                            f = ms0.i((g5 >> 31) ^ (g5 << 1));
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (s(i2, obj)) {
                            long h10 = gh7.d.h(j3, obj);
                            h4 = ms0.h(i4);
                            j2 = ms0.j((h10 << 1) ^ (h10 >> 63));
                            h5 = j2 + h4;
                            i3 += h5;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (s(i2, obj)) {
                            d = ms0.e(i4, (c1) gh7.d.i(j3, obj), o(i2));
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        d = m66.f(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 19:
                        d = m66.d(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 20:
                        d = m66.j(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        d = m66.t(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 22:
                        d = m66.h(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        d = m66.f(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        d = m66.d(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 25:
                        List u = u(j3, obj);
                        Class cls2 = m66.a;
                        int size2 = u.size();
                        if (size2 == 0) {
                            h5 = 0;
                        } else {
                            h5 = (ms0.h(i4) + 1) * size2;
                        }
                        i3 += h5;
                        break;
                    case SubAllocator.N4 /* 26 */:
                        d = m66.q(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 27:
                        d = m66.l(i4, u(j3, obj), o(i2));
                        i3 += d;
                        break;
                    case 28:
                        d = m66.a(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 29:
                        d = m66.r(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 30:
                        d = m66.b(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 31:
                        d = m66.d(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 32:
                        d = m66.f(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 33:
                        d = m66.m(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 34:
                        d = m66.o(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                        int g6 = m66.g((List) unsafe.getObject(obj, j3));
                        if (g6 > 0) {
                            i3 = lb1.b(g6, ms0.h(i4), g6, i3);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int e = m66.e((List) unsafe.getObject(obj, j3));
                        if (e > 0) {
                            i3 = lb1.b(e, ms0.h(i4), e, i3);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int k = m66.k((List) unsafe.getObject(obj, j3));
                        if (k > 0) {
                            i3 = lb1.b(k, ms0.h(i4), k, i3);
                            break;
                        } else {
                            break;
                        }
                    case SubAllocator.N_INDEXES /* 38 */:
                        int u2 = m66.u((List) unsafe.getObject(obj, j3));
                        if (u2 > 0) {
                            i3 = lb1.b(u2, ms0.h(i4), u2, i3);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int i9 = m66.i((List) unsafe.getObject(obj, j3));
                        if (i9 > 0) {
                            i3 = lb1.b(i9, ms0.h(i4), i9, i3);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int g7 = m66.g((List) unsafe.getObject(obj, j3));
                        if (g7 > 0) {
                            i3 = lb1.b(g7, ms0.h(i4), g7, i3);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int e2 = m66.e((List) unsafe.getObject(obj, j3));
                        if (e2 > 0) {
                            i3 = lb1.b(e2, ms0.h(i4), e2, i3);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls3 = m66.a;
                        int size3 = ((List) unsafe.getObject(obj, j3)).size();
                        if (size3 > 0) {
                            i3 = lb1.b(size3, ms0.h(i4), size3, i3);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int s = m66.s((List) unsafe.getObject(obj, j3));
                        if (s > 0) {
                            i3 = lb1.b(s, ms0.h(i4), s, i3);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int c = m66.c((List) unsafe.getObject(obj, j3));
                        if (c > 0) {
                            i3 = lb1.b(c, ms0.h(i4), c, i3);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int e3 = m66.e((List) unsafe.getObject(obj, j3));
                        if (e3 > 0) {
                            i3 = lb1.b(e3, ms0.h(i4), e3, i3);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int g8 = m66.g((List) unsafe.getObject(obj, j3));
                        if (g8 > 0) {
                            i3 = lb1.b(g8, ms0.h(i4), g8, i3);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int n = m66.n((List) unsafe.getObject(obj, j3));
                        if (n > 0) {
                            i3 = lb1.b(n, ms0.h(i4), n, i3);
                            break;
                        } else {
                            break;
                        }
                    case Compress.DC20 /* 48 */:
                        int p2 = m66.p((List) unsafe.getObject(obj, j3));
                        if (p2 > 0) {
                            i3 = lb1.b(p2, ms0.h(i4), p2, i3);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List u3 = u(j3, obj);
                        j66 o3 = o(i2);
                        Class cls4 = m66.a;
                        int size4 = u3.size();
                        if (size4 == 0) {
                            i = 0;
                        } else {
                            i = 0;
                            for (int i10 = 0; i10 < size4; i10++) {
                                i += ms0.e(i4, (c1) u3.get(i10), o3);
                            }
                        }
                        i3 += i;
                        break;
                    case 50:
                        Object i11 = gh7.d.i(j3, obj);
                        Object n2 = n(i2);
                        this.n.getClass();
                        y04.a(i11, n2);
                        break;
                    case 51:
                        if (t(obj, i4, i2)) {
                            i3 = lb1.y(i4, 8, i3);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (t(obj, i4, i2)) {
                            i3 = lb1.y(i4, 4, i3);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (t(obj, i4, i2)) {
                            long C = C(j3, obj);
                            h = ms0.h(i4);
                            j = ms0.j(C);
                            d = j + h;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (t(obj, i4, i2)) {
                            long C2 = C(j3, obj);
                            h = ms0.h(i4);
                            j = ms0.j(C2);
                            d = j + h;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (t(obj, i4, i2)) {
                            int B = B(j3, obj);
                            h2 = ms0.h(i4);
                            f = ms0.f(B);
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (t(obj, i4, i2)) {
                            d = ms0.d(i4);
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (t(obj, i4, i2)) {
                            d = ms0.c(i4);
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (t(obj, i4, i2)) {
                            i3 = lb1.y(i4, 1, i3);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (t(obj, i4, i2)) {
                            Object i12 = gh7.d.i(j3, obj);
                            if (i12 instanceof ea0) {
                                int h11 = ms0.h(i4);
                                int size5 = ((ea0) i12).size();
                                i3 = lb1.b(size5, size5, h11, i3);
                                break;
                            } else {
                                h3 = ms0.h(i4);
                                g = ms0.g((String) i12);
                                i3 = g + h3 + i3;
                                break;
                            }
                        } else {
                            break;
                        }
                    case Compress.DC /* 60 */:
                        if (t(obj, i4, i2)) {
                            Object i13 = gh7.d.i(j3, obj);
                            j66 o4 = o(i2);
                            Class cls5 = m66.a;
                            c1 c1Var2 = (c1) i13;
                            int h12 = ms0.h(i4);
                            c1Var2.getClass();
                            pr2 pr2Var2 = (pr2) c1Var2;
                            int i14 = pr2Var2.memoizedSerializedSize;
                            if (i14 == -1) {
                                i14 = o4.i(c1Var2);
                                pr2Var2.memoizedSerializedSize = i14;
                            }
                            i3 = lb1.b(i14, i14, h12, i3);
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (t(obj, i4, i2)) {
                            d = ms0.a(i4, (ea0) gh7.d.i(j3, obj));
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (t(obj, i4, i2)) {
                            int B2 = B(j3, obj);
                            h2 = ms0.h(i4);
                            f = ms0.i(B2);
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (t(obj, i4, i2)) {
                            int B3 = B(j3, obj);
                            h2 = ms0.h(i4);
                            f = ms0.f(B3);
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (t(obj, i4, i2)) {
                            i3 = lb1.y(i4, 4, i3);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (t(obj, i4, i2)) {
                            i3 = lb1.y(i4, 8, i3);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (t(obj, i4, i2)) {
                            int B4 = B(j3, obj);
                            h2 = ms0.h(i4);
                            f = ms0.i((B4 >> 31) ^ (B4 << 1));
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (t(obj, i4, i2)) {
                            long C3 = C(j3, obj);
                            h4 = ms0.h(i4);
                            j2 = ms0.j((C3 << 1) ^ (C3 >> 63));
                            h5 = j2 + h4;
                            i3 += h5;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (t(obj, i4, i2)) {
                            d = ms0.e(i4, (c1) gh7.d.i(j3, obj), o(i2));
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                }
                i2 += 3;
            } else {
                this.m.getClass();
                return ((pr2) obj).unknownFields.a() + i3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(int i, Object obj) {
        int i2;
        if (this.g) {
            int P = P(i);
            long j = P & 1048575;
            switch (O(P)) {
                case 0:
                    if (gh7.d.e(j, obj) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (gh7.d.f(j, obj) != RecyclerView.B1) {
                    }
                    break;
                case 2:
                    if (gh7.d.h(j, obj) != 0) {
                    }
                    break;
                case 3:
                    if (gh7.d.h(j, obj) != 0) {
                    }
                    break;
                case 4:
                    if (gh7.d.g(j, obj) != 0) {
                    }
                    break;
                case 5:
                    if (gh7.d.h(j, obj) != 0) {
                    }
                    break;
                case 6:
                    if (gh7.d.g(j, obj) != 0) {
                    }
                    break;
                case 7:
                    return gh7.d.c(j, obj);
                case 8:
                    Object i3 = gh7.d.i(j, obj);
                    if (i3 instanceof String) {
                        return !((String) i3).isEmpty();
                    }
                    if (i3 instanceof ea0) {
                        return !ea0.B.equals(i3);
                    }
                    u34.t();
                    return false;
                case 9:
                    if (gh7.d.i(j, obj) != null) {
                    }
                    break;
                case 10:
                    return !ea0.B.equals(gh7.d.i(j, obj));
                case 11:
                    if (gh7.d.g(j, obj) != 0) {
                    }
                    break;
                case 12:
                    if (gh7.d.g(j, obj) != 0) {
                    }
                    break;
                case 13:
                    if (gh7.d.g(j, obj) != 0) {
                    }
                    break;
                case 14:
                    if (gh7.d.h(j, obj) != 0) {
                    }
                    break;
                case 15:
                    if (gh7.d.g(j, obj) != 0) {
                    }
                    break;
                case 16:
                    if (gh7.d.h(j, obj) != 0) {
                    }
                    break;
                case 17:
                    if (gh7.d.i(j, obj) != null) {
                    }
                    break;
                default:
                    u34.t();
                    return false;
            }
        } else {
            if ((gh7.d.g(i2 & 1048575, obj) & (1 << (this.a[i + 2] >>> 20))) != 0) {
            }
        }
    }

    public final boolean t(Object obj, int i, int i2) {
        if (gh7.d.g(this.a[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    public final void v(int i, Object obj, Object obj2) {
        long P = P(i) & 1048575;
        Object i2 = gh7.d.i(P, obj);
        y04 y04Var = this.n;
        if (i2 != null) {
            y04Var.getClass();
            if (!((x04) i2).A) {
                x04 c = x04.B.c();
                y04.b(c, i2);
                gh7.o(obj, P, c);
                i2 = c;
            }
        } else {
            y04Var.getClass();
            i2 = x04.B.c();
            gh7.o(obj, P, i2);
        }
        y04Var.getClass();
        x04 x04Var = (x04) i2;
        xg6.A(obj2);
        throw null;
    }

    public final void w(int i, Object obj, Object obj2) {
        long P = P(i) & 1048575;
        if (s(i, obj2)) {
            fh7 fh7Var = gh7.d;
            Object i2 = fh7Var.i(P, obj);
            Object i3 = fh7Var.i(P, obj2);
            if (i2 != null && i3 != null) {
                gh7.o(obj, P, aa3.c(i2, i3));
                L(i, obj);
            } else if (i3 != null) {
                gh7.o(obj, P, i3);
                L(i, obj);
            }
        }
    }

    public final void x(int i, Object obj, Object obj2) {
        int P = P(i);
        int i2 = this.a[i];
        long j = P & 1048575;
        if (t(obj2, i2, i)) {
            fh7 fh7Var = gh7.d;
            Object i3 = fh7Var.i(j, obj);
            Object i4 = fh7Var.i(j, obj2);
            if (i3 != null && i4 != null) {
                gh7.o(obj, j, aa3.c(i3, i4));
                M(obj, i2, i);
            } else if (i4 != null) {
                gh7.o(obj, j, i4);
                M(obj, i2, i);
            }
        }
    }
}
