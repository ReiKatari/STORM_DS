package a1;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public long[] f32a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f33b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f34c;

    /* renamed from: d  reason: collision with root package name */
    public int f35d;

    /* renamed from: e  reason: collision with root package name */
    public int f36e;

    /* renamed from: f  reason: collision with root package name */
    public int f37f;

    public d0(int i2) {
        boolean z10;
        this.f32a = u0.f103a;
        this.f33b = b1.a.f1741c;
        this.f34c = n.f73a;
        if (i2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            e(u0.d(i2));
        } else {
            a0.j.h("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f36e = 0;
        long[] jArr = this.f32a;
        if (jArr != u0.f103a) {
            zb.k.t(jArr, -9187201950435737472L);
            long[] jArr2 = this.f32a;
            int i2 = this.f35d;
            int i10 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j2)) | j2;
        }
        zb.k.s(0, this.f35d, null, this.f33b);
        this.f37f = u0.a(this.f35d) - this.f36e;
    }

    public final int b(int i2) {
        int i10 = this.f35d;
        int i11 = i2 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f32a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j2 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j10 = j2 & ((~j2) << 7) & (-9187201950435737472L);
            if (j10 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j10) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    public final int c(Object obj) {
        int i2;
        long j2;
        long j10;
        long j11;
        long[] jArr;
        long[] jArr2;
        int i10;
        int i11;
        int i12;
        int i13;
        Object[] objArr;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = -862048943;
        int i15 = i2 * (-862048943);
        int i16 = i15 ^ (i15 << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = this.f35d;
        int i20 = i17 & i19;
        int i21 = 0;
        while (true) {
            long[] jArr3 = this.f32a;
            int i22 = i20 >> 3;
            int i23 = (i20 & 7) << 3;
            long j12 = ((jArr3[i22 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr3[i22] >>> i23);
            long j13 = i18;
            int i24 = i18;
            int i25 = 0;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int numberOfTrailingZeros = (i20 + (Long.numberOfTrailingZeros(j15) >> 3)) & i19;
                int i26 = i14;
                if (nc.k.a(this.f33b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i14 = i26;
            }
            int i27 = i14;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int b10 = b(i17);
                long j16 = 255;
                if (this.f37f != 0 || ((this.f32a[b10 >> 3] >> ((b10 & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i28 = this.f35d;
                    if (i28 > 8) {
                        int i29 = 8;
                        if (Long.compare((this.f36e * 32) ^ Long.MIN_VALUE, (i28 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f32a;
                            int i30 = this.f35d;
                            Object[] objArr2 = this.f33b;
                            int[] iArr = this.f34c;
                            j11 = 128;
                            int i31 = (i30 + 7) >> 3;
                            int i32 = 0;
                            while (i32 < i31) {
                                long j17 = j16;
                                long j18 = jArr4[i32] & (-9187201950435737472L);
                                jArr4[i32] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i32++;
                                i29 = i29;
                                j13 = j13;
                                j16 = j17;
                            }
                            j2 = j16;
                            j10 = j13;
                            int i33 = i29;
                            int y10 = zb.k.y(jArr4);
                            int i34 = y10 - 1;
                            long j19 = 72057594037927935L;
                            jArr4[i34] = (jArr4[i34] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[y10] = jArr4[0];
                            int i35 = 0;
                            while (i35 != i30) {
                                int i36 = i35 >> 3;
                                int i37 = (i35 & 7) << 3;
                                long j20 = (jArr4[i36] >> i37) & j2;
                                if (j20 == 128 || j20 != 254) {
                                    i35++;
                                } else {
                                    Object obj2 = objArr2[i35];
                                    if (obj2 != null) {
                                        i11 = obj2.hashCode();
                                    } else {
                                        i11 = 0;
                                    }
                                    int i38 = i11 * i27;
                                    int i39 = (i38 ^ (i38 << 16)) >>> 7;
                                    int b11 = b(i39);
                                    int i40 = i39 & i30;
                                    long j21 = j19;
                                    if (((b11 - i40) & i30) / 8 == ((i35 - i40) & i30) / i33) {
                                        jArr4[i36] = ((i12 & 127) << i37) | (jArr4[i36] & (~(j2 << i37)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j21) | Long.MIN_VALUE;
                                        i35++;
                                        j19 = j21;
                                        i33 = i33;
                                    } else {
                                        int i41 = i33;
                                        int i42 = b11 >> 3;
                                        long j22 = jArr4[i42];
                                        int i43 = (b11 & 7) << 3;
                                        if (((j22 >> i43) & j2) == 128) {
                                            i13 = i30;
                                            objArr = objArr2;
                                            jArr4[i42] = ((~(j2 << i43)) & j22) | ((i12 & 127) << i43);
                                            jArr4[i36] = (jArr4[i36] & (~(j2 << i37))) | (128 << i37);
                                            objArr[b11] = objArr[i35];
                                            objArr[i35] = null;
                                            iArr[b11] = iArr[i35];
                                            iArr[i35] = 0;
                                        } else {
                                            i13 = i30;
                                            objArr = objArr2;
                                            jArr4[i42] = ((i12 & 127) << i43) | ((~(j2 << i43)) & j22);
                                            Object obj3 = objArr[b11];
                                            objArr[b11] = objArr[i35];
                                            objArr[i35] = obj3;
                                            int i44 = iArr[b11];
                                            iArr[b11] = iArr[i35];
                                            iArr[i35] = i44;
                                            i35--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j21) | Long.MIN_VALUE;
                                        i35++;
                                        i30 = i13;
                                        j19 = j21;
                                        i33 = i41;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            this.f37f = u0.a(this.f35d) - this.f36e;
                            b10 = b(i17);
                        }
                    }
                    j2 = 255;
                    j10 = j13;
                    j11 = 128;
                    int b12 = u0.b(this.f35d);
                    long[] jArr5 = this.f32a;
                    Object[] objArr3 = this.f33b;
                    int[] iArr2 = this.f34c;
                    int i45 = this.f35d;
                    e(b12);
                    long[] jArr6 = this.f32a;
                    Object[] objArr4 = this.f33b;
                    int[] iArr3 = this.f34c;
                    int i46 = this.f35d;
                    int i47 = 0;
                    while (i47 < i45) {
                        if (((jArr5[i47 >> 3] >> ((i47 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i47];
                            if (obj4 != null) {
                                i10 = obj4.hashCode();
                            } else {
                                i10 = 0;
                            }
                            int i48 = i10 * i27;
                            int i49 = i48 ^ (i48 << 16);
                            int b13 = b(i49 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j23 = i49 & 127;
                            int i50 = b13 >> 3;
                            int i51 = (b13 & 7) << 3;
                            long j24 = (jArr[i50] & (~(255 << i51))) | (j23 << i51);
                            jArr[i50] = j24;
                            jArr[(((b13 - 7) & i46) + (i46 & 7)) >> 3] = j24;
                            objArr4[b13] = obj4;
                            iArr3[b13] = iArr2[i47];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i47++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    b10 = b(i17);
                }
                this.f36e++;
                int i52 = this.f37f;
                long[] jArr7 = this.f32a;
                int i53 = b10 >> 3;
                long j25 = jArr7[i53];
                int i54 = (b10 & 7) << 3;
                if (((j25 >> i54) & j2) == j11) {
                    i25 = 1;
                }
                this.f37f = i52 - i25;
                int i55 = this.f35d;
                long j26 = (j25 & (~(j2 << i54))) | (j10 << i54);
                jArr7[i53] = j26;
                jArr7[(((b10 - 7) & i55) + (i55 & 7)) >> 3] = j26;
                return ~b10;
            }
            i21 += 8;
            i20 = (i20 + i21) & i19;
            i18 = i24;
            i14 = i27;
        }
    }

    public final int d(Object obj) {
        int i2;
        int i10 = 0;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = i2 * (-862048943);
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f35d;
        int i15 = i12 >>> 7;
        while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.f32a;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j2 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j10 = (i13 * 72340172838076673L) ^ j2;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i16) & i14;
                if (nc.k.a(this.f33b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i15 = i16 + i10;
        }
    }

    public final void e(int i2) {
        int i10;
        long[] jArr;
        if (i2 > 0) {
            i10 = Math.max(7, u0.c(i2));
        } else {
            i10 = 0;
        }
        this.f35d = i10;
        if (i10 == 0) {
            jArr = u0.f103a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i11];
            Arrays.fill(jArr2, 0, i11, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f32a = jArr;
        int i12 = i10 >> 3;
        long j2 = 255 << ((i10 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j2)) | j2;
        this.f37f = u0.a(this.f35d) - this.f36e;
        this.f33b = new Object[i10];
        this.f34c = new int[i10];
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (d0Var.f36e != this.f36e) {
            return false;
        }
        Object[] objArr = this.f33b;
        int[] iArr = this.f34c;
        long[] jArr = this.f32a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        loop0: while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i2 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j2) < 128) {
                        int i12 = (i2 << 3) + i11;
                        Object obj2 = objArr[i12];
                        int i13 = iArr[i12];
                        int d4 = d0Var.d(obj2);
                        if (d4 < 0) {
                            break loop0;
                        }
                        z11 = z12;
                        if (i13 != d0Var.f34c[d4]) {
                            break loop0;
                        }
                    } else {
                        z11 = z12;
                    }
                    j2 >>= 8;
                    i11++;
                    z12 = z11;
                }
                z10 = z12;
                if (i10 != 8) {
                    return z10;
                }
            } else {
                z10 = z12;
            }
            if (i2 != length) {
                i2++;
                z12 = z10;
            } else {
                return z10;
            }
        }
        return false;
    }

    public final void f(int i2) {
        this.f36e--;
        long[] jArr = this.f32a;
        int i10 = this.f35d;
        int i11 = i2 >> 3;
        int i12 = (i2 & 7) << 3;
        long j2 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j2;
        jArr[(((i2 - 7) & i10) + (i10 & 7)) >> 3] = j2;
        this.f33b[i2] = null;
    }

    public final void g(int i2, Object obj) {
        int c4 = c(obj);
        if (c4 < 0) {
            c4 = ~c4;
        }
        this.f33b[c4] = obj;
        this.f34c[c4] = i2;
    }

    public final int hashCode() {
        int i2;
        Object[] objArr = this.f33b;
        int[] iArr = this.f34c;
        long[] jArr = this.f32a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j2 = jArr[i10];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j2) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        int i15 = iArr[i14];
                        if (obj != null) {
                            i2 = obj.hashCode();
                        } else {
                            i2 = 0;
                        }
                        i11 += Integer.hashCode(i15) ^ i2;
                    }
                    j2 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 != length) {
                i10++;
            } else {
                return i11;
            }
        }
    }

    public final String toString() {
        if (this.f36e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f33b;
        int[] iArr = this.f34c;
        long[] jArr = this.f32a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i10 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j2) < 128) {
                            int i13 = (i2 << 3) + i12;
                            Object obj = objArr[i13];
                            int i14 = iArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(i14);
                            i10++;
                            if (i10 < this.f36e) {
                                sb2.append(", ");
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public /* synthetic */ d0() {
        this(6);
    }
}
