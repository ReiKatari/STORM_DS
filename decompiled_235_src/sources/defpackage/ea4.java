package defpackage;

import java.util.Arrays;
import java.util.Collection;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ea4  reason: default package */
/* loaded from: classes.dex */
public final class ea4 {
    public long[] a = b66.a;
    public Object[] b = g04.i;
    public long[] c = n16.p;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f;
    public int g;
    public int h;

    public ea4(int i) {
        if (i >= 0) {
            f(b66.d(i));
        } else {
            i.h("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.g;
        int d = d(obj);
        this.b[d] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[d] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((d & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.d = d;
        if (this.e == Integer.MAX_VALUE) {
            this.e = d;
        }
        if (this.g != i) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.g = 0;
        long[] jArr = this.a;
        if (jArr != b66.a) {
            fv.A0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        fv.z0(0, this.f, null, this.b);
        fv.A0(this.c, 4611686018427387903L);
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.h = b66.a(this.f) - this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Object obj) {
        int i;
        int i2;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this.f;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (i5 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                if (nb3.k(this.b[i2], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        if (i2 < 0) {
            return false;
        }
        return true;
    }

    public final int d(Object obj) {
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        char c;
        int i3;
        int i4;
        long[] jArr;
        long[] jArr2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j4;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i10 = -862048943;
        int i11 = i * (-862048943);
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j5 = ((jArr3[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr3[i18] >>> i19);
            long j6 = i14;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i16) & i15;
                int i20 = i10;
                if (nb3.k(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i10 = i20;
            }
            int i21 = i10;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int e = e(i13);
                long j9 = 255;
                if (this.h != 0 || ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    i2 = 0;
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i22 = this.f;
                    if (i22 > 8) {
                        c = 31;
                        j3 = 128;
                        if (Long.compare((this.g * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            if (jArr4 == null) {
                                i2 = 0;
                                j = j6;
                                j2 = 255;
                            } else {
                                int i23 = this.f;
                                Object[] objArr = this.b;
                                long[] jArr5 = this.c;
                                long[] jArr6 = new long[i23];
                                Arrays.fill(jArr6, 0, i23, 9223372034707292159L);
                                i2 = 0;
                                int i24 = (i23 + 7) >> 3;
                                int i25 = 0;
                                while (i25 < i24) {
                                    long j10 = j9;
                                    long j11 = jArr4[i25] & (-9187201950435737472L);
                                    int i26 = i25;
                                    jArr4[i26] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                    i25 = i26 + 1;
                                    j9 = j10;
                                }
                                j2 = j9;
                                int length = jArr4.length;
                                int i27 = length - 1;
                                int i28 = length - 2;
                                jArr4[i28] = (jArr4[i28] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i27] = jArr4[0];
                                int i29 = 0;
                                while (i29 != i23) {
                                    int i30 = i29 >> 3;
                                    int i31 = (i29 & 7) << 3;
                                    long j12 = (jArr4[i30] >> i31) & j2;
                                    if (j12 == 128 || j12 != 254) {
                                        i29++;
                                    } else {
                                        Object obj2 = objArr[i29];
                                        if (obj2 != null) {
                                            i8 = obj2.hashCode();
                                        } else {
                                            i8 = 0;
                                        }
                                        int i32 = i8 * i21;
                                        int i33 = (i32 ^ (i32 << 16)) >>> 7;
                                        int e2 = e(i33);
                                        int i34 = i33 & i23;
                                        if (((e2 - i34) & i23) / 8 == ((i29 - i34) & i23) / 8) {
                                            int i35 = i23;
                                            Object[] objArr2 = objArr;
                                            jArr4[i30] = (jArr4[i30] & (~(j2 << i31))) | ((i9 & 127) << i31);
                                            if (jArr6[i29] == 9223372034707292159L) {
                                                long j13 = i29;
                                                jArr6[i29] = j13 | (j13 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i29++;
                                            i23 = i35;
                                            objArr = objArr2;
                                        } else {
                                            int i36 = i23;
                                            Object[] objArr3 = objArr;
                                            int i37 = e2 >> 3;
                                            long j14 = jArr4[i37];
                                            int i38 = (e2 & 7) << 3;
                                            if (((j14 >> i38) & j2) == 128) {
                                                jArr4[i37] = (j14 & (~(j2 << i38))) | ((i9 & 127) << i38);
                                                jArr4[i30] = (jArr4[i30] & (~(j2 << i31))) | (128 << i31);
                                                objArr3[e2] = objArr3[i29];
                                                objArr3[i29] = null;
                                                jArr5[e2] = jArr5[i29];
                                                jArr5[i29] = 4611686018427387903L;
                                                int i39 = (int) ((jArr6[i29] >> 32) & 4294967295L);
                                                if (i39 != Integer.MAX_VALUE) {
                                                    j4 = j6;
                                                    jArr6[i39] = e2 | (jArr6[i39] & (-4294967296L));
                                                    jArr6[i29] = (jArr6[i29] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    j4 = j6;
                                                    jArr6[i29] = 9223372032559808512L | e2;
                                                }
                                                jArr6[e2] = (i29 << 32) | 2147483647L;
                                            } else {
                                                j4 = j6;
                                                jArr4[i37] = ((i9 & 127) << i38) | (j14 & (~(j2 << i38)));
                                                Object obj3 = objArr3[e2];
                                                objArr3[e2] = objArr3[i29];
                                                objArr3[i29] = obj3;
                                                long j15 = jArr5[e2];
                                                jArr5[e2] = jArr5[i29];
                                                jArr5[i29] = j15;
                                                int i40 = (int) ((jArr6[i29] >> 32) & 4294967295L);
                                                if (i40 != Integer.MAX_VALUE) {
                                                    long j16 = e2;
                                                    jArr6[i40] = (jArr6[i40] & (-4294967296L)) | j16;
                                                    jArr6[i29] = (jArr6[i29] & 4294967295L) | (j16 << 32);
                                                } else {
                                                    long j17 = e2;
                                                    jArr6[i29] = j17 | (j17 << 32);
                                                    i40 = i29;
                                                }
                                                jArr6[e2] = (i40 << 32) | i29;
                                                i29--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i29++;
                                            i23 = i36;
                                            objArr = objArr3;
                                            j6 = j4;
                                        }
                                    }
                                }
                                j = j6;
                                this.h = b66.a(this.f) - this.g;
                                long[] jArr7 = this.c;
                                int length2 = jArr7.length;
                                for (int i41 = 0; i41 < length2; i41++) {
                                    long j18 = jArr7[i41];
                                    int i42 = (int) ((j18 >> 31) & 2147483647L);
                                    int i43 = (int) (j18 & 2147483647L);
                                    long j19 = j18 & (-4611686018427387904L);
                                    if (i42 == Integer.MAX_VALUE) {
                                        i6 = Integer.MAX_VALUE;
                                    } else {
                                        i6 = (int) (jArr6[i42] & 4294967295L);
                                    }
                                    long j20 = (j19 | i6) << 31;
                                    if (i43 == Integer.MAX_VALUE) {
                                        i7 = Integer.MAX_VALUE;
                                    } else {
                                        i7 = (int) (jArr6[i43] & 4294967295L);
                                    }
                                    jArr7[i41] = j20 | i7;
                                }
                                int i44 = this.d;
                                if (i44 != Integer.MAX_VALUE) {
                                    this.d = (int) (jArr6[i44] & 4294967295L);
                                }
                                int i45 = this.e;
                                if (i45 != Integer.MAX_VALUE) {
                                    this.e = (int) (jArr6[i45] & 4294967295L);
                                }
                            }
                            e = e(i13);
                        }
                    } else {
                        c = 31;
                        j3 = 128;
                    }
                    i2 = 0;
                    j = j6;
                    j2 = 255;
                    int b = b66.b(this.f);
                    long[] jArr8 = this.a;
                    Object[] objArr4 = this.b;
                    long[] jArr9 = this.c;
                    int i46 = this.f;
                    int[] iArr = new int[i46];
                    f(b);
                    long[] jArr10 = this.a;
                    Object[] objArr5 = this.b;
                    long[] jArr11 = this.c;
                    int i47 = this.f;
                    int i48 = 0;
                    while (i48 < i46) {
                        if (((jArr8[i48 >> 3] >> ((i48 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr4[i48];
                            if (obj4 != null) {
                                i5 = obj4.hashCode();
                            } else {
                                i5 = 0;
                            }
                            int i49 = i5 * i21;
                            int i50 = i49 ^ (i49 << 16);
                            int e3 = e(i50 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j21 = i50 & 127;
                            int i51 = e3 >> 3;
                            int i52 = (e3 & 7) << 3;
                            long j22 = (jArr[i51] & (~(255 << i52))) | (j21 << i52);
                            jArr[i51] = j22;
                            jArr[(((e3 - 7) & i47) + (i47 & 7)) >> 3] = j22;
                            objArr5[e3] = obj4;
                            jArr11[e3] = jArr9[i48];
                            iArr[i48] = e3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i48++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.c;
                    int length3 = jArr12.length;
                    for (int i53 = 0; i53 < length3; i53++) {
                        long j23 = jArr12[i53];
                        int i54 = (int) ((j23 >> c) & 2147483647L);
                        int i55 = (int) (j23 & 2147483647L);
                        long j24 = j23 & (-4611686018427387904L);
                        if (i54 == Integer.MAX_VALUE) {
                            i3 = Integer.MAX_VALUE;
                        } else {
                            i3 = iArr[i54];
                        }
                        long j25 = (j24 | i3) << c;
                        if (i55 == Integer.MAX_VALUE) {
                            i4 = Integer.MAX_VALUE;
                        } else {
                            i4 = iArr[i55];
                        }
                        jArr12[i53] = j25 | i4;
                    }
                    int i56 = this.d;
                    if (i56 != Integer.MAX_VALUE) {
                        this.d = iArr[i56];
                    }
                    int i57 = this.e;
                    if (i57 != Integer.MAX_VALUE) {
                        this.e = iArr[i57];
                    }
                    e = e(i13);
                }
                this.g++;
                int i58 = this.h;
                long[] jArr13 = this.a;
                int i59 = e >> 3;
                long j26 = jArr13[i59];
                int i60 = (e & 7) << 3;
                if (((j26 >> i60) & j2) == j3) {
                    i2 = 1;
                }
                this.h = i58 - i2;
                int i61 = this.f;
                long j27 = (j26 & (~(j2 << i60))) | (j << i60);
                jArr13[i59] = j27;
                jArr13[(((e - 7) & i61) + (i61 & 7)) >> 3] = j27;
                return e;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i10 = i21;
        }
    }

    public final int e(int i) {
        int i2 = this.f;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ea4)) {
            return false;
        }
        ea4 ea4Var = (ea4) obj;
        if (ea4Var.g != this.g) {
            return false;
        }
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !ea4Var.c(objArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final void f(int i) {
        int i2;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        if (i > 0) {
            i2 = Math.max(7, b66.c(i));
        } else {
            i2 = 0;
        }
        this.f = i2;
        if (i2 == 0) {
            jArr = b66.a;
        } else {
            int i3 = ((i2 + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i3];
            Arrays.fill(jArr3, 0, i3, -9187201950435737472L);
            jArr = jArr3;
        }
        this.a = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j)) | j;
        this.h = b66.a(this.f) - this.g;
        if (i2 == 0) {
            objArr = g04.i;
        } else {
            objArr = new Object[i2];
        }
        this.b = objArr;
        if (i2 == 0) {
            jArr2 = n16.p;
        } else {
            long[] jArr4 = new long[i2];
            Arrays.fill(jArr4, 0, i2, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Object obj) {
        int i;
        int i2;
        boolean z = false;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this.f;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (i5 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                if (nb3.k(this.b[i2], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        if (i2 >= 0) {
            z = true;
        }
        if (z) {
            h(i2);
        }
        return z;
    }

    public final void h(int i) {
        this.g--;
        long[] jArr = this.a;
        int i2 = this.f;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (i6 & 2147483647L);
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((i5 & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f * 31) + this.g;
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i3 << 3) + i5];
                            if (!nb3.k(obj, this)) {
                                if (obj != null) {
                                    i = obj.hashCode();
                                } else {
                                    i = 0;
                                }
                                i2 += i;
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i2;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    public final boolean i(Collection collection) {
        collection.getClass();
        Object[] objArr = this.b;
        int i = this.g;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!gt0.C0(collection, objArr[i5])) {
                                h(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        if (i == this.g) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.b;
        long[] jArr = this.c;
        int i = this.e;
        int i2 = 0;
        while (true) {
            if (i != Integer.MAX_VALUE) {
                int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
                Object obj = objArr[i];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                if (obj == this) {
                    valueOf = "(this)";
                } else {
                    valueOf = String.valueOf(obj);
                }
                sb.append((CharSequence) valueOf);
                i2++;
                i = i3;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }
}
