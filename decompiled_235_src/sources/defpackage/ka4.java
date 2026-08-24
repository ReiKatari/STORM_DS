package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ka4  reason: default package */
/* loaded from: classes.dex */
public final class ka4 {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;

    public ka4(int i) {
        this.a = b66.a;
        this.b = g04.i;
        if (i >= 0) {
            f(b66.d(i));
        } else {
            i.h("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.d;
        this.b[d(obj)] = obj;
        if (this.d != i) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != b66.a) {
            fv.A0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        fv.z0(0, this.c, null, this.b);
        this.e = b66.a(this.c) - this.d;
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
        int i6 = this.c;
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
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        int i5;
        Object[] objArr;
        int i6;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i7 = -862048943;
        int i8 = i * (-862048943);
        int i9 = i8 ^ (i8 << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.c;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j4 = ((jArr3[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr3[i15] >>> i16);
            long j5 = i11;
            int i17 = i11;
            int i18 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j7) >> 3)) & i12;
                int i19 = i7;
                if (nb3.k(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i7 = i19;
            }
            int i20 = i7;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int e = e(i10);
                long j8 = 255;
                if (this.e != 0 || ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i21 = this.c;
                    if (i21 > 8) {
                        int i22 = 8;
                        if (Long.compare((this.d * 32) ^ Long.MIN_VALUE, (i21 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            int i23 = this.c;
                            Object[] objArr2 = this.b;
                            int i24 = (i23 + 7) >> 3;
                            int i25 = 0;
                            j3 = 128;
                            while (i25 < i24) {
                                long j9 = j8;
                                long j10 = jArr4[i25] & (-9187201950435737472L);
                                jArr4[i25] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i25++;
                                i22 = i22;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i26 = i22;
                            int H0 = fv.H0(jArr4);
                            int i27 = H0 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i27] = (jArr4[i27] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[H0] = jArr4[0];
                            int i28 = 0;
                            while (i28 != i23) {
                                int i29 = i28 >> 3;
                                int i30 = (i28 & 7) << 3;
                                long j12 = (jArr4[i29] >> i30) & j;
                                if (j12 == 128 || j12 != 254) {
                                    i28++;
                                } else {
                                    Object obj2 = objArr2[i28];
                                    if (obj2 != null) {
                                        i3 = obj2.hashCode();
                                    } else {
                                        i3 = 0;
                                    }
                                    int i31 = i3 * i20;
                                    int i32 = (i31 ^ (i31 << 16)) >>> 7;
                                    int e2 = e(i32);
                                    int i33 = i32 & i23;
                                    if (((e2 - i33) & i23) / i26 == ((i28 - i33) & i23) / i26) {
                                        long j13 = j11;
                                        jArr4[i29] = ((i4 & 127) << i30) | ((~(j << i30)) & jArr4[i29]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i28++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i34 = e2 >> 3;
                                        long j15 = jArr4[i34];
                                        int i35 = (e2 & 7) << 3;
                                        if (((j15 >> i35) & j) == 128) {
                                            i6 = i26;
                                            i5 = i23;
                                            objArr = objArr2;
                                            jArr4[i34] = ((~(j << i35)) & j15) | ((i4 & 127) << i35);
                                            jArr4[i29] = (jArr4[i29] & (~(j << i30))) | (128 << i30);
                                            objArr[e2] = objArr[i28];
                                            objArr[i28] = null;
                                        } else {
                                            i5 = i23;
                                            objArr = objArr2;
                                            i6 = i26;
                                            jArr4[i34] = ((i4 & 127) << i35) | ((~(j << i35)) & j15);
                                            Object obj3 = objArr[e2];
                                            objArr[e2] = objArr[i28];
                                            objArr[i28] = obj3;
                                            i28--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i28++;
                                        j11 = j14;
                                        i26 = i6;
                                        i23 = i5;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            this.e = b66.a(this.c) - this.d;
                            e = e(i10);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int b = b66.b(this.c);
                    long[] jArr5 = this.a;
                    Object[] objArr3 = this.b;
                    int i36 = this.c;
                    f(b);
                    long[] jArr6 = this.a;
                    Object[] objArr4 = this.b;
                    int i37 = this.c;
                    int i38 = 0;
                    while (i38 < i36) {
                        if (((jArr5[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i38];
                            if (obj4 != null) {
                                i2 = obj4.hashCode();
                            } else {
                                i2 = 0;
                            }
                            int i39 = i2 * i20;
                            int i40 = i39 ^ (i39 << 16);
                            int e3 = e(i40 >>> 7);
                            long j16 = i40 & 127;
                            int i41 = e3 >> 3;
                            int i42 = (e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i41] & (~(255 << i42))) | (j16 << i42);
                            jArr[i41] = j17;
                            jArr[(((e3 - 7) & i37) + (i37 & 7)) >> 3] = j17;
                            objArr4[e3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i38++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e = e(i10);
                }
                this.d++;
                int i43 = this.e;
                long[] jArr7 = this.a;
                int i44 = e >> 3;
                long j18 = jArr7[i44];
                int i45 = (e & 7) << 3;
                if (((j18 >> i45) & j) == j3) {
                    i18 = 1;
                }
                this.e = i43 - i18;
                int i46 = this.c;
                long j19 = (j18 & (~(j << i45))) | (j2 << i45);
                jArr7[i44] = j19;
                jArr7[(((e - 7) & i46) + (i46 & 7)) >> 3] = j19;
                return e;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
            i7 = i20;
        }
    }

    public final int e(int i) {
        int i2 = this.c;
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
        if (!(obj instanceof ka4)) {
            return false;
        }
        ka4 ka4Var = (ka4) obj;
        if (ka4Var.d != this.d) {
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
                        if ((255 & j) < 128 && !ka4Var.c(objArr[(i << 3) + i3])) {
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
        if (i > 0) {
            i2 = Math.max(7, b66.c(i));
        } else {
            i2 = 0;
        }
        this.c = i2;
        if (i2 == 0) {
            jArr = b66.a;
        } else {
            int i3 = ((i2 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i3];
            Arrays.fill(jArr2, 0, i3, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j)) | j;
        this.e = b66.a(this.c) - this.d;
        if (i2 == 0) {
            objArr = g04.i;
        } else {
            objArr = new Object[i2];
        }
        this.b = objArr;
    }

    public final boolean g() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.d != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (this.c * 31) + this.d;
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * (-862048943);
        int i5 = i4 ^ (i4 << 16);
        int i6 = i5 & 127;
        int i7 = this.c;
        int i8 = i5 >>> 7;
        loop0: while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j2 = (i6 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i9) & i7;
                if (nb3.k(this.b[i2], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i3 += 8;
            i8 = i9 + i3;
        }
        if (i2 >= 0) {
            m(i2);
        }
    }

    public final void j(ka4 ka4Var) {
        ka4Var.getClass();
        Object[] objArr = ka4Var.b;
        long[] jArr = ka4Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            k(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k(Object obj) {
        this.b[d(obj)] = obj;
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
    public final boolean l(Object obj) {
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
        int i6 = this.c;
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
            m(i2);
        }
        return z;
    }

    public final void m(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
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
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ ka4() {
        this(6);
    }
}
