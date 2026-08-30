package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rx3  reason: default package */
/* loaded from: classes.dex */
public final class rx3 implements cv5 {
    public static final int[] o = new int[0];
    public static final Unsafe p = l37.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final b1 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final x64 k;
    public final mp3 l;
    public final s27 m;
    public final vt3 n;

    public rx3(int[] iArr, Object[] objArr, int i, int i2, b1 b1Var, boolean z, int[] iArr2, int i3, int i4, x64 x64Var, mp3 mp3Var, s27 s27Var, q32 q32Var, vt3 vt3Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = b1Var instanceof jl2;
        this.g = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = x64Var;
        this.l = mp3Var;
        this.m = s27Var;
        this.e = b1Var;
        this.n = vt3Var;
    }

    public static long A(int i) {
        return i & 1048575;
    }

    public static int B(long j, Object obj) {
        return ((Integer) l37.d.i(j, obj)).intValue();
    }

    public static long C(long j, Object obj) {
        return ((Long) l37.d.i(j, obj)).longValue();
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
            StringBuilder u = b31.u("Field ", str, " for ");
            u.append(cls.getName());
            u.append(" not found. Known fields are ");
            u.append(Arrays.toString(declaredFields));
            throw new RuntimeException(u.toString());
        }
    }

    public static int O(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void R(int i, Object obj, bq0 bq0Var) {
        if (obj instanceof String) {
            String str = (String) obj;
            zp0 zp0Var = (zp0) bq0Var.B;
            zp0Var.r(i, 2);
            int i2 = zp0Var.c;
            byte[] bArr = zp0Var.b;
            int i3 = zp0Var.d;
            try {
                int i4 = zp0.i(str.length() * 3);
                int i5 = zp0.i(str.length());
                if (i5 == i4) {
                    int i6 = i3 + i5;
                    zp0Var.d = i6;
                    int k = c67.a.k(i6, i2 - i6, str, bArr);
                    zp0Var.d = i3;
                    zp0Var.s((k - i3) - i5);
                    zp0Var.d = k;
                    return;
                }
                zp0Var.s(c67.b(str));
                int i7 = zp0Var.d;
                zp0Var.d = c67.a.k(i7, i2 - i7, str, bArr);
                return;
            } catch (b67 e) {
                zp0Var.d = i3;
                zp0.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                byte[] bytes = str.getBytes(s33.a);
                try {
                    zp0Var.s(bytes.length);
                    zp0Var.l(bytes, 0, bytes.length);
                    return;
                } catch (aq0 e2) {
                    throw e2;
                } catch (IndexOutOfBoundsException e3) {
                    throw new aq0(e3);
                }
            } catch (IndexOutOfBoundsException e4) {
                throw new aq0(e4);
            }
        }
        bq0Var.g0(i, (x70) obj);
    }

    public static r27 p(Object obj) {
        jl2 jl2Var = (jl2) obj;
        r27 r27Var = jl2Var.unknownFields;
        if (r27Var == r27.f) {
            r27 b = r27.b();
            jl2Var.unknownFields = b;
            return b;
        }
        return r27Var;
    }

    public static List u(long j, Object obj) {
        return (List) l37.d.i(j, obj);
    }

    public static rx3 y(j45 j45Var, x64 x64Var, mp3 mp3Var, s27 s27Var, q32 q32Var, vt3 vt3Var) {
        if (j45Var instanceof j45) {
            return z(j45Var, x64Var, mp3Var, s27Var, q32Var, vt3Var);
        }
        c44.b();
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.rx3 z(defpackage.j45 r35, defpackage.x64 r36, defpackage.mp3 r37, defpackage.s27 r38, defpackage.q32 r39, defpackage.vt3 r40) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx3.z(j45, x64, mp3, s27, q32, vt3):rx3");
    }

    public final void D(int i, long j, Object obj) {
        Unsafe unsafe = p;
        Object n = n(i);
        Object object = unsafe.getObject(obj, j);
        this.n.getClass();
        if (!((ut3) object).A) {
            ut3 c = ut3.B.c();
            vt3.b(c, object);
            unsafe.putObject(obj, j, c);
        }
        ej6.j(n);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int E(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, wt wtVar) {
        Unsafe unsafe = p;
        long j2 = this.a[i8 + 2] & 1048575;
        Object obj2 = null;
        boolean z = true;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(mh7.w(i, bArr))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(mh7.v(i, bArr))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int G = mh7.G(bArr, i, wtVar);
                unsafe.putObject(obj, j, Long.valueOf(wtVar.b));
                unsafe.putInt(obj, j2, i4);
                return G;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int E = mh7.E(bArr, i, wtVar);
                unsafe.putObject(obj, j, Integer.valueOf(wtVar.a));
                unsafe.putInt(obj, j2, i4);
                return E;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(mh7.w(i, bArr)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(mh7.v(i, bArr)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int G2 = mh7.G(bArr, i, wtVar);
                if (wtVar.b == 0) {
                    z = false;
                }
                unsafe.putObject(obj, j, Boolean.valueOf(z));
                unsafe.putInt(obj, j2, i4);
                return G2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int E2 = mh7.E(bArr, i, wtVar);
                int i13 = wtVar.a;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!c67.a.G(bArr, E2, E2 + i13)) {
                            throw i53.a();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, E2, i13, s33.a));
                    E2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return E2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int y = mh7.y(o(i8), bArr, i, i2, wtVar);
                if (unsafe.getInt(obj, j2) == i4) {
                    obj2 = unsafe.getObject(obj, j);
                }
                Object obj3 = wtVar.c;
                if (obj2 == null) {
                    unsafe.putObject(obj, j, obj3);
                } else {
                    unsafe.putObject(obj, j, s33.c(obj2, obj3));
                }
                unsafe.putInt(obj, j2, i4);
                return y;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int u = mh7.u(bArr, i, wtVar);
                unsafe.putObject(obj, j, wtVar.c);
                unsafe.putInt(obj, j2, i4);
                return u;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int E3 = mh7.E(bArr, i, wtVar);
                int i14 = wtVar.a;
                q33 m = m(i8);
                if (m != null && !m.a(i14)) {
                    p(obj).c(i3, Long.valueOf(i14));
                    return E3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return E3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int E4 = mh7.E(bArr, i, wtVar);
                unsafe.putObject(obj, j, Integer.valueOf(xp0.a(wtVar.a)));
                unsafe.putInt(obj, j2, i4);
                return E4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int G3 = mh7.G(bArr, i, wtVar);
                unsafe.putObject(obj, j, Long.valueOf(xp0.b(wtVar.b)));
                unsafe.putInt(obj, j2, i4);
                return G3;
            case 68:
                if (i5 == 3) {
                    int x = mh7.x(o(i8), bArr, i, i2, (i3 & (-8)) | 4, wtVar);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    }
                    Object obj4 = wtVar.c;
                    if (obj2 == null) {
                        unsafe.putObject(obj, j, obj4);
                    } else {
                        unsafe.putObject(obj, j, s33.c(obj2, obj4));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return x;
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
        throw defpackage.i53.d();
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
        throw defpackage.i53.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int F(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, defpackage.wt r33) {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx3.F(java.lang.Object, byte[], int, int, int, wt):int");
    }

    public final void G(Object obj, byte[] bArr, int i, int i2, wt wtVar) {
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
        rx3 rx3Var = this;
        byte[] bArr2 = bArr;
        int i10 = i2;
        wt wtVar2 = wtVar;
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
                i16 = mh7.D(i17, bArr2, i16, wtVar2);
                i17 = wtVar2.a;
            }
            int i18 = i16;
            int i19 = i17;
            int i20 = i19 >>> 3;
            int i21 = i19 & 7;
            int i22 = rx3Var.d;
            int i23 = rx3Var.c;
            if (i20 > i15) {
                int i24 = i14 / 3;
                if (i20 >= i23 && i20 <= i22) {
                    N = rx3Var.N(i20, i24);
                }
                N = i11;
            } else {
                if (i20 >= i23 && i20 <= i22) {
                    N = rx3Var.N(i20, i12);
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
                int i26 = rx3Var.a[i25 + 1];
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
                                l37.d.m(obj, j, Double.longBitsToDouble(mh7.w(i6, bArr2)));
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
                                l37.d.n(obj, j, Float.intBitsToFloat(mh7.v(i6, bArr2)));
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
                                int G = mh7.G(bArr2, i6, wtVar2);
                                unsafe2.putLong(obj, j, wtVar2.b);
                                unsafe3 = unsafe2;
                                i13 = G;
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
                                i13 = mh7.E(bArr2, i6, wtVar2);
                                unsafe2.putInt(obj, j, wtVar2.a);
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
                                unsafe2.putLong(obj, j, mh7.w(i6, bArr2));
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
                        case ig7.b /* 6 */:
                        case 13:
                            i6 = i18;
                            i7 = i19;
                            unsafe2 = unsafe3;
                            if (i21 == 5) {
                                unsafe2.putInt(obj, j, mh7.v(i6, bArr2));
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
                                i13 = mh7.G(bArr2, i6, wtVar2);
                                if (wtVar2.b == 0) {
                                    z = false;
                                }
                                l37.d.k(obj, j, z);
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
                                    i13 = mh7.A(bArr2, i6, wtVar2);
                                } else {
                                    i13 = mh7.B(bArr2, i6, wtVar2);
                                }
                                unsafe2.putObject(obj, j, wtVar2.c);
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
                                i13 = mh7.y(rx3Var.o(i25), bArr2, i6, i10, wtVar2);
                                Object object = unsafe2.getObject(obj, j);
                                Object obj2 = wtVar2.c;
                                if (object == null) {
                                    unsafe2.putObject(obj, j, obj2);
                                } else {
                                    unsafe2.putObject(obj, j, s33.c(object, obj2));
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
                                i13 = mh7.u(bArr2, i6, wtVar2);
                                unsafe2.putObject(obj, j, wtVar2.c);
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
                        case mj2.L /* 12 */:
                            i6 = i18;
                            unsafe2 = unsafe3;
                            if (i21 == 0) {
                                i13 = mh7.E(bArr2, i6, wtVar2);
                                unsafe2.putInt(obj, j, wtVar2.a);
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
                        case ig7.e /* 15 */:
                            i6 = i18;
                            unsafe2 = unsafe3;
                            if (i21 == 0) {
                                i13 = mh7.E(bArr2, i6, wtVar2);
                                unsafe2.putInt(obj, j, xp0.a(wtVar2.a));
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
                                int G2 = mh7.G(bArr2, i18, wtVar2);
                                unsafe3.putLong(obj, j, xp0.b(wtVar2.b));
                                unsafe3 = unsafe3;
                                i13 = G2;
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
                            r33 r33Var = (r33) unsafe2.getObject(obj, j);
                            if (!((i1) r33Var).A) {
                                int size = r33Var.size();
                                if (size == 0) {
                                    i9 = 10;
                                } else {
                                    i9 = size * 2;
                                }
                                r33Var = r33Var.e(i9);
                                unsafe2.putObject(obj, j, r33Var);
                            }
                            i13 = mh7.z(rx3Var.o(i25), i19, bArr2, i8, i10, r33Var, wtVar2);
                            bArr2 = bArr;
                            i10 = i2;
                            wtVar2 = wtVar;
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
                            E = rx3Var.H(obj, bArr, i8, i2, i19, i5, i21, i25, i26, O, j, wtVar);
                            i5 = i5;
                            i25 = i25;
                            if (E != i8) {
                                i10 = i2;
                                wtVar2 = wtVar;
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
                                    rx3Var.D(i25, j, obj);
                                    throw null;
                                }
                                i4 = i8;
                            } else {
                                E = rx3Var.E(obj, bArr, i8, i2, i19, i5, i21, i26, O, j, i25, wtVar);
                                if (E == i8) {
                                    i4 = E;
                                } else {
                                    rx3Var = this;
                                    i10 = i2;
                                    wtVar2 = wtVar;
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
            i13 = mh7.C(i19, bArr, i4, i2, p(obj), wtVar);
            rx3Var = this;
            bArr2 = bArr;
            wtVar2 = wtVar;
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
        throw i53.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x020a -> B:117:0x020b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x025c -> B:139:0x025d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0189 -> B:83:0x018a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int H(java.lang.Object r12, byte[] r13, int r14, int r15, int r16, int r17, int r18, int r19, long r20, int r22, long r23, defpackage.wt r25) {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx3.H(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, wt):int");
    }

    public final void I(Object obj, int i, yp0 yp0Var, cv5 cv5Var, o32 o32Var) {
        int l;
        List c = this.l.c(i & 1048575, obj);
        xp0 xp0Var = (xp0) yp0Var.e;
        int i2 = yp0Var.b;
        if ((i2 & 7) == 2) {
            do {
                c.add(yp0Var.D(cv5Var, o32Var));
                if (!xp0Var.d() && yp0Var.d == 0) {
                    l = xp0Var.l();
                } else {
                    return;
                }
            } while (l == i2);
            yp0Var.d = l;
            return;
        }
        throw i53.b();
    }

    public final void J(Object obj, int i, yp0 yp0Var) {
        if ((536870912 & i) != 0) {
            l37.o(i & 1048575, obj, yp0Var.P());
        } else if (this.f) {
            l37.o(i & 1048575, obj, yp0Var.N());
        } else {
            l37.o(i & 1048575, obj, yp0Var.k());
        }
    }

    public final void L(int i, Object obj) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        l37.m(l37.d.g(j, obj) | (1 << (i2 >>> 20)), j, obj);
    }

    public final void M(int i, int i2, Object obj) {
        l37.m(i, this.a[i2 + 2] & 1048575, obj);
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

    public final void Q(Object obj, bq0 bq0Var) {
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
                        bq0Var.h0(l37.d.e(j, obj), i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.l0(i8, l37.d.f(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.o0(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.v0(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.n0(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.k0(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ig7.b /* 6 */:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.j0(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.f0(i8, l37.d.c(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        R(i8, unsafe.getObject(obj, j), bq0Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.p0(i8, unsafe.getObject(obj, j), o(i4));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.g0(i8, (x70) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.u0(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case mj2.L /* 12 */:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.i0(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.q0(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.r0(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ig7.e /* 15 */:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.s0(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.t0(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i4 = i;
                    if ((i3 & i6) != 0) {
                        bq0Var.m0(i8, unsafe.getObject(obj, j), o(i4));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i4 = i;
                    dv5.C(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, false);
                    break;
                case 19:
                    i4 = i;
                    dv5.G(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, false);
                    break;
                case 20:
                    i4 = i;
                    dv5.J(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, false);
                    break;
                case 21:
                    i4 = i;
                    dv5.R(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, false);
                    break;
                case 22:
                    i4 = i;
                    dv5.I(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, false);
                    break;
                case 23:
                    i4 = i;
                    dv5.F(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, false);
                    break;
                case 24:
                    i4 = i;
                    dv5.E(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, false);
                    break;
                case 25:
                    i4 = i;
                    dv5.A(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, false);
                    break;
                case 26:
                    i4 = i;
                    dv5.P(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var);
                    break;
                case 27:
                    i4 = i;
                    dv5.K(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, o(i4));
                    break;
                case 28:
                    i4 = i;
                    dv5.B(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var);
                    break;
                case 29:
                    i4 = i;
                    z = false;
                    dv5.Q(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, false);
                    break;
                case 30:
                    i4 = i;
                    z = false;
                    dv5.D(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, false);
                    break;
                case 31:
                    i4 = i;
                    z = false;
                    dv5.L(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, false);
                    break;
                case 32:
                    i4 = i;
                    z = false;
                    dv5.M(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, false);
                    break;
                case 33:
                    i4 = i;
                    z = false;
                    dv5.N(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, false);
                    break;
                case 34:
                    i4 = i;
                    z = false;
                    dv5.O(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, false);
                    break;
                case 35:
                    i4 = i;
                    dv5.C(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, true);
                    break;
                case 36:
                    i4 = i;
                    dv5.G(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, true);
                    break;
                case 37:
                    i4 = i;
                    dv5.J(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, true);
                    break;
                case 38:
                    i4 = i;
                    dv5.R(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, true);
                    break;
                case 39:
                    i4 = i;
                    dv5.I(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, true);
                    break;
                case 40:
                    i4 = i;
                    dv5.F(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, true);
                    break;
                case 41:
                    i4 = i;
                    dv5.E(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, true);
                    break;
                case 42:
                    i4 = i;
                    dv5.A(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, true);
                    break;
                case 43:
                    i4 = i;
                    dv5.Q(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, true);
                    break;
                case 44:
                    i4 = i;
                    dv5.D(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, true);
                    break;
                case 45:
                    i4 = i;
                    dv5.L(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, true);
                    break;
                case 46:
                    i4 = i;
                    dv5.M(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, true);
                    break;
                case 47:
                    i4 = i;
                    dv5.N(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, true);
                    break;
                case 48:
                    i4 = i;
                    dv5.O(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, true);
                    break;
                case 49:
                    i4 = i;
                    dv5.H(iArr[i4], (List) unsafe.getObject(obj, j), bq0Var, o(i4));
                    break;
                case 50:
                    i4 = i;
                    if (unsafe.getObject(obj, j) != null) {
                        Object n = n(i4);
                        this.n.getClass();
                        ej6.j(n);
                        throw null;
                    }
                    break;
                case 51:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.h0(((Double) l37.d.i(j, obj)).doubleValue(), i8);
                    }
                    break;
                case 52:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.l0(i8, ((Float) l37.d.i(j, obj)).floatValue());
                    }
                    break;
                case 53:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.o0(i8, C(j, obj));
                    }
                    break;
                case 54:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.v0(i8, C(j, obj));
                    }
                    break;
                case 55:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.n0(i8, B(j, obj));
                    }
                    break;
                case 56:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.k0(i8, C(j, obj));
                    }
                    break;
                case 57:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.j0(i8, B(j, obj));
                    }
                    break;
                case 58:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.f0(i8, ((Boolean) l37.d.i(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        R(i8, unsafe.getObject(obj, j), bq0Var);
                    }
                    break;
                case 60:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.p0(i8, unsafe.getObject(obj, j), o(i4));
                    }
                    break;
                case 61:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.g0(i8, (x70) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.u0(i8, B(j, obj));
                    }
                    break;
                case 63:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.i0(i8, B(j, obj));
                    }
                    break;
                case 64:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.q0(i8, B(j, obj));
                    }
                    break;
                case 65:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.r0(i8, C(j, obj));
                    }
                    break;
                case 66:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.s0(i8, B(j, obj));
                    }
                    break;
                case 67:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.t0(i8, C(j, obj));
                    }
                    break;
                case 68:
                    i4 = i;
                    if (t(i8, i4, obj)) {
                        bq0Var.m0(i8, unsafe.getObject(obj, j), o(i4));
                    }
                    break;
                default:
                    i4 = i;
                    break;
            }
        }
        this.m.getClass();
        ((jl2) obj).unknownFields.d(bq0Var);
    }

    @Override // defpackage.cv5
    public final void a(Object obj, bq0 bq0Var) {
        bq0Var.getClass();
        gj7 gj7Var = gj7.ASCENDING;
        gj7 gj7Var2 = gj7.DESCENDING;
        vt3 vt3Var = this.n;
        int[] iArr = this.a;
        s27 s27Var = this.m;
        if (gj7Var == gj7Var2) {
            s27Var.getClass();
            ((jl2) obj).unknownFields.d(bq0Var);
            for (int length = iArr.length - 3; length >= 0; length -= 3) {
                int P = P(length);
                int i = iArr[length];
                switch (O(P)) {
                    case 0:
                        if (s(length, obj)) {
                            bq0Var.h0(l37.d.e(P & 1048575, obj), i);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (s(length, obj)) {
                            bq0Var.l0(i, l37.d.f(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (s(length, obj)) {
                            bq0Var.o0(i, l37.d.h(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (s(length, obj)) {
                            bq0Var.v0(i, l37.d.h(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (s(length, obj)) {
                            bq0Var.n0(i, l37.d.g(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (s(length, obj)) {
                            bq0Var.k0(i, l37.d.h(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case ig7.b /* 6 */:
                        if (s(length, obj)) {
                            bq0Var.j0(i, l37.d.g(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (s(length, obj)) {
                            bq0Var.f0(i, l37.d.c(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (s(length, obj)) {
                            R(i, l37.d.i(P & 1048575, obj), bq0Var);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (s(length, obj)) {
                            bq0Var.p0(i, l37.d.i(P & 1048575, obj), o(length));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (s(length, obj)) {
                            bq0Var.g0(i, (x70) l37.d.i(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (s(length, obj)) {
                            bq0Var.u0(i, l37.d.g(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case mj2.L /* 12 */:
                        if (s(length, obj)) {
                            bq0Var.i0(i, l37.d.g(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (s(length, obj)) {
                            bq0Var.q0(i, l37.d.g(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (s(length, obj)) {
                            bq0Var.r0(i, l37.d.h(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case ig7.e /* 15 */:
                        if (s(length, obj)) {
                            bq0Var.s0(i, l37.d.g(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (s(length, obj)) {
                            bq0Var.t0(i, l37.d.h(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (s(length, obj)) {
                            bq0Var.m0(i, l37.d.i(P & 1048575, obj), o(length));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        dv5.C(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, false);
                        break;
                    case 19:
                        dv5.G(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, false);
                        break;
                    case 20:
                        dv5.J(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, false);
                        break;
                    case 21:
                        dv5.R(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, false);
                        break;
                    case 22:
                        dv5.I(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, false);
                        break;
                    case 23:
                        dv5.F(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, false);
                        break;
                    case 24:
                        dv5.E(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, false);
                        break;
                    case 25:
                        dv5.A(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, false);
                        break;
                    case 26:
                        dv5.P(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var);
                        break;
                    case 27:
                        dv5.K(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, o(length));
                        break;
                    case 28:
                        dv5.B(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var);
                        break;
                    case 29:
                        dv5.Q(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, false);
                        break;
                    case 30:
                        dv5.D(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, false);
                        break;
                    case 31:
                        dv5.L(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, false);
                        break;
                    case 32:
                        dv5.M(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, false);
                        break;
                    case 33:
                        dv5.N(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, false);
                        break;
                    case 34:
                        dv5.O(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, false);
                        break;
                    case 35:
                        dv5.C(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, true);
                        break;
                    case 36:
                        dv5.G(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, true);
                        break;
                    case 37:
                        dv5.J(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, true);
                        break;
                    case 38:
                        dv5.R(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, true);
                        break;
                    case 39:
                        dv5.I(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, true);
                        break;
                    case 40:
                        dv5.F(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, true);
                        break;
                    case 41:
                        dv5.E(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, true);
                        break;
                    case 42:
                        dv5.A(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, true);
                        break;
                    case 43:
                        dv5.Q(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, true);
                        break;
                    case 44:
                        dv5.D(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, true);
                        break;
                    case 45:
                        dv5.L(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, true);
                        break;
                    case 46:
                        dv5.M(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, true);
                        break;
                    case 47:
                        dv5.N(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, true);
                        break;
                    case 48:
                        dv5.O(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, true);
                        break;
                    case 49:
                        dv5.H(iArr[length], (List) l37.d.i(P & 1048575, obj), bq0Var, o(length));
                        break;
                    case 50:
                        if (l37.d.i(P & 1048575, obj) != null) {
                            Object n = n(length);
                            vt3Var.getClass();
                            ej6.j(n);
                            throw null;
                        }
                        break;
                    case 51:
                        if (t(i, length, obj)) {
                            bq0Var.h0(((Double) l37.d.i(P & 1048575, obj)).doubleValue(), i);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (t(i, length, obj)) {
                            bq0Var.l0(i, ((Float) l37.d.i(P & 1048575, obj)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (t(i, length, obj)) {
                            bq0Var.o0(i, C(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (t(i, length, obj)) {
                            bq0Var.v0(i, C(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (t(i, length, obj)) {
                            bq0Var.n0(i, B(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (t(i, length, obj)) {
                            bq0Var.k0(i, C(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (t(i, length, obj)) {
                            bq0Var.j0(i, B(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (t(i, length, obj)) {
                            bq0Var.f0(i, ((Boolean) l37.d.i(P & 1048575, obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (t(i, length, obj)) {
                            R(i, l37.d.i(P & 1048575, obj), bq0Var);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (t(i, length, obj)) {
                            bq0Var.p0(i, l37.d.i(P & 1048575, obj), o(length));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (t(i, length, obj)) {
                            bq0Var.g0(i, (x70) l37.d.i(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (t(i, length, obj)) {
                            bq0Var.u0(i, B(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (t(i, length, obj)) {
                            bq0Var.i0(i, B(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (t(i, length, obj)) {
                            bq0Var.q0(i, B(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (t(i, length, obj)) {
                            bq0Var.r0(i, C(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (t(i, length, obj)) {
                            bq0Var.s0(i, B(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (t(i, length, obj)) {
                            bq0Var.t0(i, C(P & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (t(i, length, obj)) {
                            bq0Var.m0(i, l37.d.i(P & 1048575, obj), o(length));
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
                            bq0Var.h0(l37.d.e(P2 & 1048575, obj), i3);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (s(i2, obj)) {
                            bq0Var.l0(i3, l37.d.f(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (s(i2, obj)) {
                            bq0Var.o0(i3, l37.d.h(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (s(i2, obj)) {
                            bq0Var.v0(i3, l37.d.h(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (s(i2, obj)) {
                            bq0Var.n0(i3, l37.d.g(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (s(i2, obj)) {
                            bq0Var.k0(i3, l37.d.h(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case ig7.b /* 6 */:
                        if (s(i2, obj)) {
                            bq0Var.j0(i3, l37.d.g(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (s(i2, obj)) {
                            bq0Var.f0(i3, l37.d.c(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (s(i2, obj)) {
                            R(i3, l37.d.i(P2 & 1048575, obj), bq0Var);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (s(i2, obj)) {
                            bq0Var.p0(i3, l37.d.i(P2 & 1048575, obj), o(i2));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (s(i2, obj)) {
                            bq0Var.g0(i3, (x70) l37.d.i(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (s(i2, obj)) {
                            bq0Var.u0(i3, l37.d.g(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case mj2.L /* 12 */:
                        if (s(i2, obj)) {
                            bq0Var.i0(i3, l37.d.g(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (s(i2, obj)) {
                            bq0Var.q0(i3, l37.d.g(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (s(i2, obj)) {
                            bq0Var.r0(i3, l37.d.h(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case ig7.e /* 15 */:
                        if (s(i2, obj)) {
                            bq0Var.s0(i3, l37.d.g(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (s(i2, obj)) {
                            bq0Var.t0(i3, l37.d.h(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (s(i2, obj)) {
                            bq0Var.m0(i3, l37.d.i(P2 & 1048575, obj), o(i2));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        dv5.C(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, false);
                        break;
                    case 19:
                        dv5.G(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, false);
                        break;
                    case 20:
                        dv5.J(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, false);
                        break;
                    case 21:
                        dv5.R(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, false);
                        break;
                    case 22:
                        dv5.I(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, false);
                        break;
                    case 23:
                        dv5.F(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, false);
                        break;
                    case 24:
                        dv5.E(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, false);
                        break;
                    case 25:
                        dv5.A(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, false);
                        break;
                    case 26:
                        dv5.P(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var);
                        break;
                    case 27:
                        dv5.K(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, o(i2));
                        break;
                    case 28:
                        dv5.B(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var);
                        break;
                    case 29:
                        dv5.Q(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, false);
                        break;
                    case 30:
                        dv5.D(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, false);
                        break;
                    case 31:
                        dv5.L(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, false);
                        break;
                    case 32:
                        dv5.M(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, false);
                        break;
                    case 33:
                        dv5.N(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, false);
                        break;
                    case 34:
                        dv5.O(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, false);
                        break;
                    case 35:
                        dv5.C(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, true);
                        break;
                    case 36:
                        dv5.G(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, true);
                        break;
                    case 37:
                        dv5.J(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, true);
                        break;
                    case 38:
                        dv5.R(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, true);
                        break;
                    case 39:
                        dv5.I(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, true);
                        break;
                    case 40:
                        dv5.F(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, true);
                        break;
                    case 41:
                        dv5.E(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, true);
                        break;
                    case 42:
                        dv5.A(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, true);
                        break;
                    case 43:
                        dv5.Q(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, true);
                        break;
                    case 44:
                        dv5.D(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, true);
                        break;
                    case 45:
                        dv5.L(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, true);
                        break;
                    case 46:
                        dv5.M(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, true);
                        break;
                    case 47:
                        dv5.N(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, true);
                        break;
                    case 48:
                        dv5.O(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, true);
                        break;
                    case 49:
                        dv5.H(iArr[i2], (List) l37.d.i(P2 & 1048575, obj), bq0Var, o(i2));
                        break;
                    case 50:
                        if (l37.d.i(P2 & 1048575, obj) != null) {
                            Object n2 = n(i2);
                            vt3Var.getClass();
                            ej6.j(n2);
                            throw null;
                        }
                        break;
                    case 51:
                        if (t(i3, i2, obj)) {
                            bq0Var.h0(((Double) l37.d.i(P2 & 1048575, obj)).doubleValue(), i3);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (t(i3, i2, obj)) {
                            bq0Var.l0(i3, ((Float) l37.d.i(P2 & 1048575, obj)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (t(i3, i2, obj)) {
                            bq0Var.o0(i3, C(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (t(i3, i2, obj)) {
                            bq0Var.v0(i3, C(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (t(i3, i2, obj)) {
                            bq0Var.n0(i3, B(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (t(i3, i2, obj)) {
                            bq0Var.k0(i3, C(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (t(i3, i2, obj)) {
                            bq0Var.j0(i3, B(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (t(i3, i2, obj)) {
                            bq0Var.f0(i3, ((Boolean) l37.d.i(P2 & 1048575, obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (t(i3, i2, obj)) {
                            R(i3, l37.d.i(P2 & 1048575, obj), bq0Var);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (t(i3, i2, obj)) {
                            bq0Var.p0(i3, l37.d.i(P2 & 1048575, obj), o(i2));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (t(i3, i2, obj)) {
                            bq0Var.g0(i3, (x70) l37.d.i(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (t(i3, i2, obj)) {
                            bq0Var.u0(i3, B(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (t(i3, i2, obj)) {
                            bq0Var.i0(i3, B(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (t(i3, i2, obj)) {
                            bq0Var.q0(i3, B(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (t(i3, i2, obj)) {
                            bq0Var.r0(i3, C(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (t(i3, i2, obj)) {
                            bq0Var.s0(i3, B(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (t(i3, i2, obj)) {
                            bq0Var.t0(i3, C(P2 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (t(i3, i2, obj)) {
                            bq0Var.m0(i3, l37.d.i(P2 & 1048575, obj), o(i2));
                            break;
                        } else {
                            break;
                        }
                }
            }
            s27Var.getClass();
            ((jl2) obj).unknownFields.d(bq0Var);
        } else {
            Q(obj, bq0Var);
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
    @Override // defpackage.cv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.jl2 r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx3.b(jl2):int");
    }

    @Override // defpackage.cv5
    public final void c(jl2 jl2Var, jl2 jl2Var2) {
        jl2 jl2Var3;
        jl2Var2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int P = P(i);
                long j = 1048575 & P;
                int i2 = iArr[i];
                switch (O(P)) {
                    case 0:
                        if (s(i, jl2Var2)) {
                            k37 k37Var = l37.d;
                            jl2Var3 = jl2Var;
                            k37Var.m(jl2Var3, j, k37Var.e(j, jl2Var2));
                            L(i, jl2Var3);
                            continue;
                            i += 3;
                            jl2Var = jl2Var3;
                        }
                        break;
                    case 1:
                        if (s(i, jl2Var2)) {
                            k37 k37Var2 = l37.d;
                            k37Var2.n(jl2Var, j, k37Var2.f(j, jl2Var2));
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case 2:
                        if (s(i, jl2Var2)) {
                            l37.n(jl2Var, j, l37.d.h(j, jl2Var2));
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case 3:
                        if (s(i, jl2Var2)) {
                            l37.n(jl2Var, j, l37.d.h(j, jl2Var2));
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case 4:
                        if (s(i, jl2Var2)) {
                            l37.m(l37.d.g(j, jl2Var2), j, jl2Var);
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case 5:
                        if (s(i, jl2Var2)) {
                            l37.n(jl2Var, j, l37.d.h(j, jl2Var2));
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case ig7.b /* 6 */:
                        if (s(i, jl2Var2)) {
                            l37.m(l37.d.g(j, jl2Var2), j, jl2Var);
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case 7:
                        if (s(i, jl2Var2)) {
                            k37 k37Var3 = l37.d;
                            k37Var3.k(jl2Var, j, k37Var3.c(j, jl2Var2));
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case 8:
                        if (s(i, jl2Var2)) {
                            l37.o(j, jl2Var, l37.d.i(j, jl2Var2));
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case 9:
                        w(i, jl2Var, jl2Var2);
                        break;
                    case 10:
                        if (s(i, jl2Var2)) {
                            l37.o(j, jl2Var, l37.d.i(j, jl2Var2));
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case 11:
                        if (s(i, jl2Var2)) {
                            l37.m(l37.d.g(j, jl2Var2), j, jl2Var);
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case mj2.L /* 12 */:
                        if (s(i, jl2Var2)) {
                            l37.m(l37.d.g(j, jl2Var2), j, jl2Var);
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case 13:
                        if (s(i, jl2Var2)) {
                            l37.m(l37.d.g(j, jl2Var2), j, jl2Var);
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case 14:
                        if (s(i, jl2Var2)) {
                            l37.n(jl2Var, j, l37.d.h(j, jl2Var2));
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case ig7.e /* 15 */:
                        if (s(i, jl2Var2)) {
                            l37.m(l37.d.g(j, jl2Var2), j, jl2Var);
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case 16:
                        if (s(i, jl2Var2)) {
                            l37.n(jl2Var, j, l37.d.h(j, jl2Var2));
                            L(i, jl2Var);
                            break;
                        }
                        break;
                    case 17:
                        w(i, jl2Var, jl2Var2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.l.b(j, jl2Var, jl2Var2);
                        break;
                    case 50:
                        Class cls = dv5.a;
                        k37 k37Var4 = l37.d;
                        Object i3 = k37Var4.i(j, jl2Var);
                        Object i4 = k37Var4.i(j, jl2Var2);
                        this.n.getClass();
                        l37.o(j, jl2Var, vt3.b(i3, i4));
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
                        if (t(i2, i, jl2Var2)) {
                            l37.o(j, jl2Var, l37.d.i(j, jl2Var2));
                            M(i2, i, jl2Var);
                            break;
                        }
                        break;
                    case 60:
                        x(i, jl2Var, jl2Var2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (t(i2, i, jl2Var2)) {
                            l37.o(j, jl2Var, l37.d.i(j, jl2Var2));
                            M(i2, i, jl2Var);
                            break;
                        }
                        break;
                    case 68:
                        x(i, jl2Var, jl2Var2);
                        break;
                }
                jl2Var3 = jl2Var;
                i += 3;
                jl2Var = jl2Var3;
            } else {
                dv5.x(this.m, jl2Var, jl2Var2);
                return;
            }
        }
    }

    @Override // defpackage.cv5
    public final void d(Object obj) {
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
            Object i3 = l37.d.i(P, obj);
            if (i3 != null) {
                this.n.getClass();
                ((ut3) i3).A = false;
                l37.o(P, obj, i3);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.l.a(iArr[i], obj);
            i++;
        }
        this.m.getClass();
        ((jl2) obj).unknownFields.e = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f2, code lost:
        return false;
     */
    @Override // defpackage.cv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx3.e(java.lang.Object):boolean");
    }

    @Override // defpackage.cv5
    public final void f(Object obj, byte[] bArr, int i, int i2, wt wtVar) {
        if (this.g) {
            G(obj, bArr, i, i2, wtVar);
        } else {
            F(obj, bArr, i, i2, 0, wtVar);
        }
    }

    @Override // defpackage.cv5
    public final int g(b1 b1Var) {
        if (this.g) {
            return r(b1Var);
        }
        return q(b1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
        if (java.lang.Double.doubleToLongBits(r5.e(r7, r12)) == java.lang.Double.doubleToLongBits(r5.e(r7, r13))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (defpackage.dv5.y(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (defpackage.dv5.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L85;
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
        if (defpackage.dv5.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
        if (defpackage.dv5.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (defpackage.dv5.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L85;
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
    @Override // defpackage.cv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.jl2 r12, defpackage.jl2 r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx3.h(jl2, jl2):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x06e4 A[Catch: all -> 0x0430, TryCatch #7 {all -> 0x0430, blocks: (B:176:0x06df, B:178:0x06e4, B:180:0x06eb, B:182:0x06f2, B:118:0x0407, B:119:0x0410, B:120:0x041c, B:123:0x0433, B:124:0x0447, B:125:0x045b, B:126:0x046f, B:127:0x0483, B:128:0x0497, B:129:0x04ab, B:130:0x04bf, B:132:0x04cc, B:133:0x04eb, B:134:0x04ff, B:135:0x0516, B:136:0x052d, B:137:0x0544, B:138:0x055b, B:140:0x056c, B:143:0x0573, B:144:0x0579, B:145:0x0585, B:146:0x059c, B:147:0x05b3, B:149:0x05c0, B:150:0x05df, B:151:0x05f3, B:152:0x0602, B:153:0x061b, B:154:0x0632, B:155:0x0649, B:156:0x0660, B:157:0x0676, B:158:0x068c, B:159:0x06a4, B:165:0x06bc), top: B:202:0x06df }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0717 A[LOOP:3: B:193:0x0715->B:194:0x0717, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06f8 A[SYNTHETIC] */
    @Override // defpackage.cv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r21, defpackage.yp0 r22, defpackage.o32 r23) {
        /*
            Method dump skipped, instructions count: 1978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx3.i(java.lang.Object, yp0, o32):void");
    }

    @Override // defpackage.cv5
    public final Object j() {
        this.k.getClass();
        return ((jl2) this.e).f(il2.NEW_MUTABLE_INSTANCE);
    }

    public final boolean k(jl2 jl2Var, Object obj, int i) {
        if (s(i, jl2Var) == s(i, obj)) {
            return true;
        }
        return false;
    }

    public final void l(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        Object i3 = l37.d.i(P(i) & 1048575, obj);
        if (i3 == null || m(i) == null) {
            return;
        }
        this.n.getClass();
        ut3 ut3Var = (ut3) i3;
        ej6.j(n(i));
        throw null;
    }

    public final q33 m(int i) {
        return (q33) this.b[((i / 3) * 2) + 1];
    }

    public final Object n(int i) {
        return this.b[(i / 3) * 2];
    }

    public final cv5 o(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        cv5 cv5Var = (cv5) objArr[i2];
        if (cv5Var != null) {
            return cv5Var;
        }
        cv5 a = rv4.c.a((Class) objArr[i2 + 1]);
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
                            i5 = wh1.z(i7, 8, i5);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if ((i & i6) != 0) {
                            i5 = wh1.z(i7, 4, i5);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if ((i6 & i) != 0) {
                            long j3 = unsafe.getLong(obj, j2);
                            h = zp0.h(i7);
                            j = zp0.j(j3);
                            h4 = j + h;
                            i5 += h4;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if ((i6 & i) != 0) {
                            long j4 = unsafe.getLong(obj, j2);
                            h = zp0.h(i7);
                            j = zp0.j(j4);
                            h4 = j + h;
                            i5 += h4;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if ((i6 & i) != 0) {
                            int i10 = unsafe.getInt(obj, j2);
                            h2 = zp0.h(i7);
                            f = zp0.f(i10);
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if ((i6 & i) != 0) {
                            d = zp0.d(i7);
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case ig7.b /* 6 */:
                        if ((i6 & i) != 0) {
                            d = zp0.c(i7);
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if ((i6 & i) != 0) {
                            i5 = wh1.z(i7, 1, i5);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if ((i6 & i) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(obj, j2);
                            if (object instanceof x70) {
                                int h5 = zp0.h(i7);
                                int size = ((x70) object).size();
                                b = wh1.b(size, size, h5, i5);
                                i5 = b;
                                break;
                            } else {
                                h3 = zp0.h(i7);
                                g = zp0.g((String) object);
                                b = g + h3 + i5;
                                i5 = b;
                            }
                        }
                    case 9:
                        if ((i6 & i) != 0) {
                            Object object2 = unsafe.getObject(obj, j2);
                            cv5 o2 = o(i4);
                            Class cls = dv5.a;
                            b1 b1Var = (b1) object2;
                            int h6 = zp0.h(i7);
                            b1Var.getClass();
                            jl2 jl2Var = (jl2) b1Var;
                            int i11 = jl2Var.memoizedSerializedSize;
                            if (i11 == -1) {
                                i11 = o2.g(b1Var);
                                jl2Var.memoizedSerializedSize = i11;
                            }
                            i5 = wh1.b(i11, i11, h6, i5);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if ((i6 & i) != 0) {
                            d = zp0.a(i7, (x70) unsafe.getObject(obj, j2));
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if ((i6 & i) != 0) {
                            int i12 = unsafe.getInt(obj, j2);
                            h2 = zp0.h(i7);
                            f = zp0.i(i12);
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case mj2.L /* 12 */:
                        if ((i6 & i) != 0) {
                            int i13 = unsafe.getInt(obj, j2);
                            h2 = zp0.h(i7);
                            f = zp0.f(i13);
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if ((i & i6) != 0) {
                            i5 = wh1.z(i7, 4, i5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if ((i6 & i) != 0) {
                            i5 = wh1.z(i7, 8, i5);
                            break;
                        } else {
                            break;
                        }
                    case ig7.e /* 15 */:
                        if ((i6 & i) != 0) {
                            int i14 = unsafe.getInt(obj, j2);
                            h2 = zp0.h(i7);
                            f = zp0.i((i14 >> 31) ^ (i14 << 1));
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if ((i6 & i) != 0) {
                            long j5 = unsafe.getLong(obj, j2);
                            h = zp0.h(i7);
                            j = zp0.j((j5 >> 63) ^ (j5 << 1));
                            h4 = j + h;
                            i5 += h4;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if ((i6 & i) != 0) {
                            d = zp0.e(i7, (b1) unsafe.getObject(obj, j2), o(i4));
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        d = dv5.f(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 19:
                        d = dv5.d(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 20:
                        d = dv5.j(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 21:
                        d = dv5.t(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 22:
                        d = dv5.h(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 23:
                        d = dv5.f(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 24:
                        d = dv5.d(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 25:
                        Class cls2 = dv5.a;
                        int size2 = ((List) unsafe.getObject(obj, j2)).size();
                        if (size2 == 0) {
                            h4 = 0;
                        } else {
                            h4 = (zp0.h(i7) + 1) * size2;
                        }
                        i5 += h4;
                        break;
                    case 26:
                        d = dv5.q(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 27:
                        d = dv5.l(i7, (List) unsafe.getObject(obj, j2), o(i4));
                        i5 += d;
                        break;
                    case 28:
                        d = dv5.a(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 29:
                        d = dv5.r(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 30:
                        d = dv5.b(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 31:
                        d = dv5.d(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 32:
                        d = dv5.f(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 33:
                        d = dv5.m(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 34:
                        d = dv5.o(i7, (List) unsafe.getObject(obj, j2));
                        i5 += d;
                        break;
                    case 35:
                        int g2 = dv5.g((List) unsafe.getObject(obj, j2));
                        if (g2 > 0) {
                            i5 = wh1.b(g2, zp0.h(i7), g2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int e = dv5.e((List) unsafe.getObject(obj, j2));
                        if (e > 0) {
                            i5 = wh1.b(e, zp0.h(i7), e, i5);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int k = dv5.k((List) unsafe.getObject(obj, j2));
                        if (k > 0) {
                            i5 = wh1.b(k, zp0.h(i7), k, i5);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int u = dv5.u((List) unsafe.getObject(obj, j2));
                        if (u > 0) {
                            i5 = wh1.b(u, zp0.h(i7), u, i5);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int i15 = dv5.i((List) unsafe.getObject(obj, j2));
                        if (i15 > 0) {
                            i5 = wh1.b(i15, zp0.h(i7), i15, i5);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int g3 = dv5.g((List) unsafe.getObject(obj, j2));
                        if (g3 > 0) {
                            i5 = wh1.b(g3, zp0.h(i7), g3, i5);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int e2 = dv5.e((List) unsafe.getObject(obj, j2));
                        if (e2 > 0) {
                            i5 = wh1.b(e2, zp0.h(i7), e2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls3 = dv5.a;
                        int size3 = ((List) unsafe.getObject(obj, j2)).size();
                        if (size3 > 0) {
                            i5 = wh1.b(size3, zp0.h(i7), size3, i5);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int s = dv5.s((List) unsafe.getObject(obj, j2));
                        if (s > 0) {
                            i5 = wh1.b(s, zp0.h(i7), s, i5);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int c = dv5.c((List) unsafe.getObject(obj, j2));
                        if (c > 0) {
                            i5 = wh1.b(c, zp0.h(i7), c, i5);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int e3 = dv5.e((List) unsafe.getObject(obj, j2));
                        if (e3 > 0) {
                            i5 = wh1.b(e3, zp0.h(i7), e3, i5);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int g4 = dv5.g((List) unsafe.getObject(obj, j2));
                        if (g4 > 0) {
                            i5 = wh1.b(g4, zp0.h(i7), g4, i5);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int n = dv5.n((List) unsafe.getObject(obj, j2));
                        if (n > 0) {
                            i5 = wh1.b(n, zp0.h(i7), n, i5);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int p2 = dv5.p((List) unsafe.getObject(obj, j2));
                        if (p2 > 0) {
                            i5 = wh1.b(p2, zp0.h(i7), p2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list = (List) unsafe.getObject(obj, j2);
                        cv5 o3 = o(i4);
                        Class cls4 = dv5.a;
                        int size4 = list.size();
                        if (size4 == 0) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                            for (int i16 = 0; i16 < size4; i16++) {
                                i2 += zp0.e(i7, (b1) list.get(i16), o3);
                            }
                        }
                        i5 += i2;
                        break;
                    case 50:
                        Object object3 = unsafe.getObject(obj, j2);
                        Object n2 = n(i4);
                        this.n.getClass();
                        vt3.a(object3, n2);
                        break;
                    case 51:
                        if (t(i7, i4, obj)) {
                            i5 = wh1.z(i7, 8, i5);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (t(i7, i4, obj)) {
                            i5 = wh1.z(i7, 4, i5);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (t(i7, i4, obj)) {
                            long C = C(j2, obj);
                            h = zp0.h(i7);
                            j = zp0.j(C);
                            h4 = j + h;
                            i5 += h4;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (t(i7, i4, obj)) {
                            long C2 = C(j2, obj);
                            h = zp0.h(i7);
                            j = zp0.j(C2);
                            h4 = j + h;
                            i5 += h4;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (t(i7, i4, obj)) {
                            int B = B(j2, obj);
                            h2 = zp0.h(i7);
                            f = zp0.f(B);
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (t(i7, i4, obj)) {
                            d = zp0.d(i7);
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (t(i7, i4, obj)) {
                            d = zp0.c(i7);
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (t(i7, i4, obj)) {
                            i5 = wh1.z(i7, 1, i5);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!t(i7, i4, obj)) {
                            break;
                        } else {
                            Object object4 = unsafe.getObject(obj, j2);
                            if (object4 instanceof x70) {
                                int h7 = zp0.h(i7);
                                int size5 = ((x70) object4).size();
                                b = wh1.b(size5, size5, h7, i5);
                                i5 = b;
                                break;
                            } else {
                                h3 = zp0.h(i7);
                                g = zp0.g((String) object4);
                                b = g + h3 + i5;
                                i5 = b;
                            }
                        }
                    case 60:
                        if (t(i7, i4, obj)) {
                            Object object5 = unsafe.getObject(obj, j2);
                            cv5 o4 = o(i4);
                            Class cls5 = dv5.a;
                            b1 b1Var2 = (b1) object5;
                            int h8 = zp0.h(i7);
                            b1Var2.getClass();
                            jl2 jl2Var2 = (jl2) b1Var2;
                            int i17 = jl2Var2.memoizedSerializedSize;
                            if (i17 == -1) {
                                i17 = o4.g(b1Var2);
                                jl2Var2.memoizedSerializedSize = i17;
                            }
                            i5 = wh1.b(i17, i17, h8, i5);
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (t(i7, i4, obj)) {
                            d = zp0.a(i7, (x70) unsafe.getObject(obj, j2));
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (t(i7, i4, obj)) {
                            int B2 = B(j2, obj);
                            h2 = zp0.h(i7);
                            f = zp0.i(B2);
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (t(i7, i4, obj)) {
                            int B3 = B(j2, obj);
                            h2 = zp0.h(i7);
                            f = zp0.f(B3);
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (t(i7, i4, obj)) {
                            i5 = wh1.z(i7, 4, i5);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (t(i7, i4, obj)) {
                            i5 = wh1.z(i7, 8, i5);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (t(i7, i4, obj)) {
                            int B4 = B(j2, obj);
                            h2 = zp0.h(i7);
                            f = zp0.i((B4 >> 31) ^ (B4 << 1));
                            d = f + h2;
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (t(i7, i4, obj)) {
                            long C3 = C(j2, obj);
                            h = zp0.h(i7);
                            j = zp0.j((C3 >> 63) ^ (C3 << 1));
                            h4 = j + h;
                            i5 += h4;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (t(i7, i4, obj)) {
                            d = zp0.e(i7, (b1) unsafe.getObject(obj, j2), o(i4));
                            i5 += d;
                            break;
                        } else {
                            break;
                        }
                }
                i4 += 3;
            } else {
                this.m.getClass();
                return ((jl2) obj).unknownFields.a() + i5;
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
                if (O >= y52.DOUBLE_LIST_PACKED.id() && O <= y52.SINT64_LIST_PACKED.id()) {
                    int i5 = iArr[i2 + 2];
                }
                switch (O) {
                    case 0:
                        if (s(i2, obj)) {
                            i3 = wh1.z(i4, 8, i3);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (s(i2, obj)) {
                            i3 = wh1.z(i4, 4, i3);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (s(i2, obj)) {
                            long h6 = l37.d.h(j3, obj);
                            h = zp0.h(i4);
                            j = zp0.j(h6);
                            d = j + h;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (s(i2, obj)) {
                            long h7 = l37.d.h(j3, obj);
                            h = zp0.h(i4);
                            j = zp0.j(h7);
                            d = j + h;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (s(i2, obj)) {
                            int g2 = l37.d.g(j3, obj);
                            h2 = zp0.h(i4);
                            f = zp0.f(g2);
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (s(i2, obj)) {
                            d = zp0.d(i4);
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case ig7.b /* 6 */:
                        if (s(i2, obj)) {
                            d = zp0.c(i4);
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (s(i2, obj)) {
                            i3 = wh1.z(i4, 1, i3);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (s(i2, obj)) {
                            Object i6 = l37.d.i(j3, obj);
                            if (i6 instanceof x70) {
                                int h8 = zp0.h(i4);
                                int size = ((x70) i6).size();
                                i3 = wh1.b(size, size, h8, i3);
                                break;
                            } else {
                                h3 = zp0.h(i4);
                                g = zp0.g((String) i6);
                                i3 = g + h3 + i3;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (s(i2, obj)) {
                            Object i7 = l37.d.i(j3, obj);
                            cv5 o2 = o(i2);
                            Class cls = dv5.a;
                            b1 b1Var = (b1) i7;
                            int h9 = zp0.h(i4);
                            b1Var.getClass();
                            jl2 jl2Var = (jl2) b1Var;
                            int i8 = jl2Var.memoizedSerializedSize;
                            if (i8 == -1) {
                                i8 = o2.g(b1Var);
                                jl2Var.memoizedSerializedSize = i8;
                            }
                            i3 = wh1.b(i8, i8, h9, i3);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (s(i2, obj)) {
                            d = zp0.a(i4, (x70) l37.d.i(j3, obj));
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (s(i2, obj)) {
                            int g3 = l37.d.g(j3, obj);
                            h2 = zp0.h(i4);
                            f = zp0.i(g3);
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case mj2.L /* 12 */:
                        if (s(i2, obj)) {
                            int g4 = l37.d.g(j3, obj);
                            h2 = zp0.h(i4);
                            f = zp0.f(g4);
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (s(i2, obj)) {
                            i3 = wh1.z(i4, 4, i3);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (s(i2, obj)) {
                            i3 = wh1.z(i4, 8, i3);
                            break;
                        } else {
                            break;
                        }
                    case ig7.e /* 15 */:
                        if (s(i2, obj)) {
                            int g5 = l37.d.g(j3, obj);
                            h2 = zp0.h(i4);
                            f = zp0.i((g5 >> 31) ^ (g5 << 1));
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (s(i2, obj)) {
                            long h10 = l37.d.h(j3, obj);
                            h4 = zp0.h(i4);
                            j2 = zp0.j((h10 << 1) ^ (h10 >> 63));
                            h5 = j2 + h4;
                            i3 += h5;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (s(i2, obj)) {
                            d = zp0.e(i4, (b1) l37.d.i(j3, obj), o(i2));
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        d = dv5.f(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 19:
                        d = dv5.d(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 20:
                        d = dv5.j(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 21:
                        d = dv5.t(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 22:
                        d = dv5.h(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 23:
                        d = dv5.f(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 24:
                        d = dv5.d(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 25:
                        List u = u(j3, obj);
                        Class cls2 = dv5.a;
                        int size2 = u.size();
                        if (size2 == 0) {
                            h5 = 0;
                        } else {
                            h5 = (zp0.h(i4) + 1) * size2;
                        }
                        i3 += h5;
                        break;
                    case 26:
                        d = dv5.q(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 27:
                        d = dv5.l(i4, u(j3, obj), o(i2));
                        i3 += d;
                        break;
                    case 28:
                        d = dv5.a(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 29:
                        d = dv5.r(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 30:
                        d = dv5.b(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 31:
                        d = dv5.d(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 32:
                        d = dv5.f(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 33:
                        d = dv5.m(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 34:
                        d = dv5.o(i4, u(j3, obj));
                        i3 += d;
                        break;
                    case 35:
                        int g6 = dv5.g((List) unsafe.getObject(obj, j3));
                        if (g6 > 0) {
                            i3 = wh1.b(g6, zp0.h(i4), g6, i3);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int e = dv5.e((List) unsafe.getObject(obj, j3));
                        if (e > 0) {
                            i3 = wh1.b(e, zp0.h(i4), e, i3);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int k = dv5.k((List) unsafe.getObject(obj, j3));
                        if (k > 0) {
                            i3 = wh1.b(k, zp0.h(i4), k, i3);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int u2 = dv5.u((List) unsafe.getObject(obj, j3));
                        if (u2 > 0) {
                            i3 = wh1.b(u2, zp0.h(i4), u2, i3);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int i9 = dv5.i((List) unsafe.getObject(obj, j3));
                        if (i9 > 0) {
                            i3 = wh1.b(i9, zp0.h(i4), i9, i3);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int g7 = dv5.g((List) unsafe.getObject(obj, j3));
                        if (g7 > 0) {
                            i3 = wh1.b(g7, zp0.h(i4), g7, i3);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int e2 = dv5.e((List) unsafe.getObject(obj, j3));
                        if (e2 > 0) {
                            i3 = wh1.b(e2, zp0.h(i4), e2, i3);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls3 = dv5.a;
                        int size3 = ((List) unsafe.getObject(obj, j3)).size();
                        if (size3 > 0) {
                            i3 = wh1.b(size3, zp0.h(i4), size3, i3);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int s = dv5.s((List) unsafe.getObject(obj, j3));
                        if (s > 0) {
                            i3 = wh1.b(s, zp0.h(i4), s, i3);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int c = dv5.c((List) unsafe.getObject(obj, j3));
                        if (c > 0) {
                            i3 = wh1.b(c, zp0.h(i4), c, i3);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int e3 = dv5.e((List) unsafe.getObject(obj, j3));
                        if (e3 > 0) {
                            i3 = wh1.b(e3, zp0.h(i4), e3, i3);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int g8 = dv5.g((List) unsafe.getObject(obj, j3));
                        if (g8 > 0) {
                            i3 = wh1.b(g8, zp0.h(i4), g8, i3);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int n = dv5.n((List) unsafe.getObject(obj, j3));
                        if (n > 0) {
                            i3 = wh1.b(n, zp0.h(i4), n, i3);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int p2 = dv5.p((List) unsafe.getObject(obj, j3));
                        if (p2 > 0) {
                            i3 = wh1.b(p2, zp0.h(i4), p2, i3);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List u3 = u(j3, obj);
                        cv5 o3 = o(i2);
                        Class cls4 = dv5.a;
                        int size4 = u3.size();
                        if (size4 == 0) {
                            i = 0;
                        } else {
                            i = 0;
                            for (int i10 = 0; i10 < size4; i10++) {
                                i += zp0.e(i4, (b1) u3.get(i10), o3);
                            }
                        }
                        i3 += i;
                        break;
                    case 50:
                        Object i11 = l37.d.i(j3, obj);
                        Object n2 = n(i2);
                        this.n.getClass();
                        vt3.a(i11, n2);
                        break;
                    case 51:
                        if (t(i4, i2, obj)) {
                            i3 = wh1.z(i4, 8, i3);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (t(i4, i2, obj)) {
                            i3 = wh1.z(i4, 4, i3);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (t(i4, i2, obj)) {
                            long C = C(j3, obj);
                            h = zp0.h(i4);
                            j = zp0.j(C);
                            d = j + h;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (t(i4, i2, obj)) {
                            long C2 = C(j3, obj);
                            h = zp0.h(i4);
                            j = zp0.j(C2);
                            d = j + h;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (t(i4, i2, obj)) {
                            int B = B(j3, obj);
                            h2 = zp0.h(i4);
                            f = zp0.f(B);
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (t(i4, i2, obj)) {
                            d = zp0.d(i4);
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (t(i4, i2, obj)) {
                            d = zp0.c(i4);
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (t(i4, i2, obj)) {
                            i3 = wh1.z(i4, 1, i3);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (t(i4, i2, obj)) {
                            Object i12 = l37.d.i(j3, obj);
                            if (i12 instanceof x70) {
                                int h11 = zp0.h(i4);
                                int size5 = ((x70) i12).size();
                                i3 = wh1.b(size5, size5, h11, i3);
                                break;
                            } else {
                                h3 = zp0.h(i4);
                                g = zp0.g((String) i12);
                                i3 = g + h3 + i3;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (t(i4, i2, obj)) {
                            Object i13 = l37.d.i(j3, obj);
                            cv5 o4 = o(i2);
                            Class cls5 = dv5.a;
                            b1 b1Var2 = (b1) i13;
                            int h12 = zp0.h(i4);
                            b1Var2.getClass();
                            jl2 jl2Var2 = (jl2) b1Var2;
                            int i14 = jl2Var2.memoizedSerializedSize;
                            if (i14 == -1) {
                                i14 = o4.g(b1Var2);
                                jl2Var2.memoizedSerializedSize = i14;
                            }
                            i3 = wh1.b(i14, i14, h12, i3);
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (t(i4, i2, obj)) {
                            d = zp0.a(i4, (x70) l37.d.i(j3, obj));
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (t(i4, i2, obj)) {
                            int B2 = B(j3, obj);
                            h2 = zp0.h(i4);
                            f = zp0.i(B2);
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (t(i4, i2, obj)) {
                            int B3 = B(j3, obj);
                            h2 = zp0.h(i4);
                            f = zp0.f(B3);
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (t(i4, i2, obj)) {
                            i3 = wh1.z(i4, 4, i3);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (t(i4, i2, obj)) {
                            i3 = wh1.z(i4, 8, i3);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (t(i4, i2, obj)) {
                            int B4 = B(j3, obj);
                            h2 = zp0.h(i4);
                            f = zp0.i((B4 >> 31) ^ (B4 << 1));
                            d = f + h2;
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (t(i4, i2, obj)) {
                            long C3 = C(j3, obj);
                            h4 = zp0.h(i4);
                            j2 = zp0.j((C3 << 1) ^ (C3 >> 63));
                            h5 = j2 + h4;
                            i3 += h5;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (t(i4, i2, obj)) {
                            d = zp0.e(i4, (b1) l37.d.i(j3, obj), o(i2));
                            i3 += d;
                            break;
                        } else {
                            break;
                        }
                }
                i2 += 3;
            } else {
                this.m.getClass();
                return ((jl2) obj).unknownFields.a() + i3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(int r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx3.s(int, java.lang.Object):boolean");
    }

    public final boolean t(int i, int i2, Object obj) {
        if (l37.d.g(this.a[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    public final void v(int i, Object obj, Object obj2) {
        long P = P(i) & 1048575;
        Object i2 = l37.d.i(P, obj);
        vt3 vt3Var = this.n;
        if (i2 != null) {
            vt3Var.getClass();
            if (!((ut3) i2).A) {
                ut3 c = ut3.B.c();
                vt3.b(c, i2);
                l37.o(P, obj, c);
                i2 = c;
            }
        } else {
            vt3Var.getClass();
            i2 = ut3.B.c();
            l37.o(P, obj, i2);
        }
        vt3Var.getClass();
        ut3 ut3Var = (ut3) i2;
        ej6.j(obj2);
        throw null;
    }

    public final void w(int i, Object obj, Object obj2) {
        long P = P(i) & 1048575;
        if (s(i, obj2)) {
            k37 k37Var = l37.d;
            Object i2 = k37Var.i(P, obj);
            Object i3 = k37Var.i(P, obj2);
            if (i2 != null && i3 != null) {
                l37.o(P, obj, s33.c(i2, i3));
                L(i, obj);
            } else if (i3 != null) {
                l37.o(P, obj, i3);
                L(i, obj);
            }
        }
    }

    public final void x(int i, Object obj, Object obj2) {
        int P = P(i);
        int i2 = this.a[i];
        long j = P & 1048575;
        if (t(i2, i, obj2)) {
            k37 k37Var = l37.d;
            Object i3 = k37Var.i(j, obj);
            Object i4 = k37Var.i(j, obj2);
            if (i3 != null && i4 != null) {
                l37.o(j, obj, s33.c(i3, i4));
                M(i2, i, obj);
            } else if (i4 != null) {
                l37.o(j, obj, i4);
                M(i2, i, obj);
            }
        }
    }
}
