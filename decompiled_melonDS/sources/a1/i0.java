package a1;

import androidx.preference.Preference;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public long[] f48a = u0.f103a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f49b = b1.a.f1741c;

    /* renamed from: c  reason: collision with root package name */
    public long[] f50c = r.f90b;

    /* renamed from: d  reason: collision with root package name */
    public int f51d = Preference.DEFAULT_ORDER;

    /* renamed from: e  reason: collision with root package name */
    public int f52e = Preference.DEFAULT_ORDER;

    /* renamed from: f  reason: collision with root package name */
    public int f53f;

    /* renamed from: g  reason: collision with root package name */
    public int f54g;

    /* renamed from: h  reason: collision with root package name */
    public int f55h;

    public i0(int i2) {
        if (i2 >= 0) {
            f(u0.d(i2));
        } else {
            a0.j.h("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i2 = this.f54g;
        int d4 = d(obj);
        this.f49b[d4] = obj;
        long[] jArr = this.f50c;
        int i10 = this.f51d;
        jArr[d4] = (i10 & 2147483647L) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((d4 & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
        }
        this.f51d = d4;
        if (this.f52e == Integer.MAX_VALUE) {
            this.f52e = d4;
        }
        if (this.f54g != i2) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.f54g = 0;
        long[] jArr = this.f48a;
        if (jArr != u0.f103a) {
            zb.k.t(jArr, -9187201950435737472L);
            long[] jArr2 = this.f48a;
            int i2 = this.f53f;
            int i10 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j2)) | j2;
        }
        zb.k.s(0, this.f53f, null, this.f49b);
        zb.k.t(this.f50c, 4611686018427387903L);
        this.f51d = Preference.DEFAULT_ORDER;
        this.f52e = Preference.DEFAULT_ORDER;
        this.f55h = u0.a(this.f53f) - this.f54g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f53f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f48a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f49b
            r15 = r15[r11]
            boolean r15 = nc.k.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.i0.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        int i2;
        int i10;
        long j2;
        long j10;
        long j11;
        char c4;
        int i11;
        int i12;
        long[] jArr;
        long[] jArr2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j12;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i18 = -862048943;
        int i19 = i2 * (-862048943);
        int i20 = i19 ^ (i19 << 16);
        int i21 = i20 >>> 7;
        int i22 = i20 & 127;
        int i23 = this.f53f;
        int i24 = i21 & i23;
        int i25 = 0;
        while (true) {
            long[] jArr3 = this.f48a;
            int i26 = i24 >> 3;
            int i27 = (i24 & 7) << 3;
            long j13 = ((jArr3[i26 + 1] << (64 - i27)) & ((-i27) >> 63)) | (jArr3[i26] >>> i27);
            long j14 = i22;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (j15 - 72340172838076673L) & (~j15) & (-9187201950435737472L);
            while (j16 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i24) & i23;
                int i28 = i18;
                if (nc.k.a(this.f49b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i18 = i28;
            }
            int i29 = i18;
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                int e6 = e(i21);
                long j17 = 255;
                if (this.f55h != 0 || ((this.f48a[e6 >> 3] >> ((e6 & 7) << 3)) & 255) == 254) {
                    i10 = 0;
                    j2 = j14;
                    j10 = 255;
                    j11 = 128;
                } else {
                    int i30 = this.f53f;
                    if (i30 > 8) {
                        c4 = 31;
                        j11 = 128;
                        if (Long.compare((this.f54g * 32) ^ Long.MIN_VALUE, (i30 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f48a;
                            if (jArr4 == null) {
                                i10 = 0;
                                j2 = j14;
                                j10 = 255;
                            } else {
                                int i31 = this.f53f;
                                Object[] objArr = this.f49b;
                                long[] jArr5 = this.f50c;
                                long[] jArr6 = new long[i31];
                                Arrays.fill(jArr6, 0, i31, 9223372034707292159L);
                                i10 = 0;
                                int i32 = (i31 + 7) >> 3;
                                int i33 = 0;
                                while (i33 < i32) {
                                    long j18 = j17;
                                    long j19 = jArr4[i33] & (-9187201950435737472L);
                                    int i34 = i33;
                                    jArr4[i34] = ((~j19) + (j19 >>> 7)) & (-72340172838076674L);
                                    i33 = i34 + 1;
                                    j17 = j18;
                                }
                                j10 = j17;
                                int length = jArr4.length;
                                int i35 = length - 1;
                                int i36 = length - 2;
                                jArr4[i36] = (jArr4[i36] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i35] = jArr4[0];
                                int i37 = 0;
                                while (i37 != i31) {
                                    int i38 = i37 >> 3;
                                    int i39 = (i37 & 7) << 3;
                                    long j20 = (jArr4[i38] >> i39) & j10;
                                    if (j20 == 128 || j20 != 254) {
                                        i37++;
                                    } else {
                                        Object obj2 = objArr[i37];
                                        if (obj2 != null) {
                                            i16 = obj2.hashCode();
                                        } else {
                                            i16 = 0;
                                        }
                                        int i40 = i16 * i29;
                                        int i41 = (i40 ^ (i40 << 16)) >>> 7;
                                        int e10 = e(i41);
                                        int i42 = i41 & i31;
                                        if (((e10 - i42) & i31) / 8 == ((i37 - i42) & i31) / 8) {
                                            int i43 = i31;
                                            Object[] objArr2 = objArr;
                                            jArr4[i38] = (jArr4[i38] & (~(j10 << i39))) | ((i17 & 127) << i39);
                                            if (jArr6[i37] == 9223372034707292159L) {
                                                long j21 = i37;
                                                jArr6[i37] = j21 | (j21 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i37++;
                                            i31 = i43;
                                            objArr = objArr2;
                                        } else {
                                            int i44 = i31;
                                            Object[] objArr3 = objArr;
                                            int i45 = e10 >> 3;
                                            long j22 = jArr4[i45];
                                            int i46 = (e10 & 7) << 3;
                                            if (((j22 >> i46) & j10) == 128) {
                                                jArr4[i45] = (j22 & (~(j10 << i46))) | ((i17 & 127) << i46);
                                                jArr4[i38] = (jArr4[i38] & (~(j10 << i39))) | (128 << i39);
                                                objArr3[e10] = objArr3[i37];
                                                objArr3[i37] = null;
                                                jArr5[e10] = jArr5[i37];
                                                jArr5[i37] = 4611686018427387903L;
                                                int i47 = (int) ((jArr6[i37] >> 32) & 4294967295L);
                                                int i48 = Preference.DEFAULT_ORDER;
                                                if (i47 != Integer.MAX_VALUE) {
                                                    j12 = j14;
                                                    jArr6[i47] = e10 | (jArr6[i47] & (-4294967296L));
                                                    jArr6[i37] = (jArr6[i37] & 4294967295L) | (-4294967296L);
                                                    i48 = Preference.DEFAULT_ORDER;
                                                } else {
                                                    j12 = j14;
                                                    jArr6[i37] = (((long) Preference.DEFAULT_ORDER) << 32) | e10;
                                                }
                                                jArr6[e10] = (i37 << 32) | i48;
                                            } else {
                                                j12 = j14;
                                                jArr4[i45] = ((i17 & 127) << i46) | (j22 & (~(j10 << i46)));
                                                Object obj3 = objArr3[e10];
                                                objArr3[e10] = objArr3[i37];
                                                objArr3[i37] = obj3;
                                                long j23 = jArr5[e10];
                                                jArr5[e10] = jArr5[i37];
                                                jArr5[i37] = j23;
                                                int i49 = (int) ((jArr6[i37] >> 32) & 4294967295L);
                                                if (i49 != Integer.MAX_VALUE) {
                                                    long j24 = e10;
                                                    jArr6[i49] = (jArr6[i49] & (-4294967296L)) | j24;
                                                    jArr6[i37] = (jArr6[i37] & 4294967295L) | (j24 << 32);
                                                } else {
                                                    long j25 = e10;
                                                    jArr6[i37] = j25 | (j25 << 32);
                                                    i49 = i37;
                                                }
                                                jArr6[e10] = (i49 << 32) | i37;
                                                i37--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i37++;
                                            i31 = i44;
                                            objArr = objArr3;
                                            j14 = j12;
                                        }
                                    }
                                }
                                j2 = j14;
                                this.f55h = u0.a(this.f53f) - this.f54g;
                                long[] jArr7 = this.f50c;
                                int length2 = jArr7.length;
                                for (int i50 = 0; i50 < length2; i50++) {
                                    long j26 = jArr7[i50];
                                    int i51 = (int) ((j26 >> 31) & 2147483647L);
                                    int i52 = (int) (j26 & 2147483647L);
                                    long j27 = j26 & (-4611686018427387904L);
                                    if (i51 == Integer.MAX_VALUE) {
                                        i14 = Integer.MAX_VALUE;
                                    } else {
                                        i14 = (int) (jArr6[i51] & 4294967295L);
                                    }
                                    long j28 = (j27 | i14) << 31;
                                    if (i52 == Integer.MAX_VALUE) {
                                        i15 = Preference.DEFAULT_ORDER;
                                    } else {
                                        i15 = (int) (jArr6[i52] & 4294967295L);
                                    }
                                    jArr7[i50] = j28 | i15;
                                }
                                int i53 = this.f51d;
                                if (i53 != Integer.MAX_VALUE) {
                                    this.f51d = (int) (jArr6[i53] & 4294967295L);
                                }
                                int i54 = this.f52e;
                                if (i54 != Integer.MAX_VALUE) {
                                    this.f52e = (int) (jArr6[i54] & 4294967295L);
                                }
                            }
                            e6 = e(i21);
                        }
                    } else {
                        c4 = 31;
                        j11 = 128;
                    }
                    i10 = 0;
                    j2 = j14;
                    j10 = 255;
                    int b10 = u0.b(this.f53f);
                    long[] jArr8 = this.f48a;
                    Object[] objArr4 = this.f49b;
                    long[] jArr9 = this.f50c;
                    int i55 = this.f53f;
                    int[] iArr = new int[i55];
                    f(b10);
                    long[] jArr10 = this.f48a;
                    Object[] objArr5 = this.f49b;
                    long[] jArr11 = this.f50c;
                    int i56 = this.f53f;
                    int i57 = 0;
                    while (i57 < i55) {
                        if (((jArr8[i57 >> 3] >> ((i57 & 7) << 3)) & 255) < j11) {
                            Object obj4 = objArr4[i57];
                            if (obj4 != null) {
                                i13 = obj4.hashCode();
                            } else {
                                i13 = 0;
                            }
                            int i58 = i13 * i29;
                            int i59 = i58 ^ (i58 << 16);
                            int e11 = e(i59 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j29 = i59 & 127;
                            int i60 = e11 >> 3;
                            int i61 = (e11 & 7) << 3;
                            long j30 = (jArr[i60] & (~(255 << i61))) | (j29 << i61);
                            jArr[i60] = j30;
                            jArr[(((e11 - 7) & i56) + (i56 & 7)) >> 3] = j30;
                            objArr5[e11] = obj4;
                            jArr11[e11] = jArr9[i57];
                            iArr[i57] = e11;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i57++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f50c;
                    int length3 = jArr12.length;
                    for (int i62 = 0; i62 < length3; i62++) {
                        long j31 = jArr12[i62];
                        int i63 = (int) ((j31 >> c4) & 2147483647L);
                        int i64 = (int) (j31 & 2147483647L);
                        long j32 = j31 & (-4611686018427387904L);
                        if (i63 == Integer.MAX_VALUE) {
                            i11 = Integer.MAX_VALUE;
                        } else {
                            i11 = iArr[i63];
                        }
                        long j33 = (j32 | i11) << c4;
                        if (i64 == Integer.MAX_VALUE) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = iArr[i64];
                        }
                        jArr12[i62] = j33 | i12;
                    }
                    int i65 = this.f51d;
                    if (i65 != Integer.MAX_VALUE) {
                        this.f51d = iArr[i65];
                    }
                    int i66 = this.f52e;
                    if (i66 != Integer.MAX_VALUE) {
                        this.f52e = iArr[i66];
                    }
                    e6 = e(i21);
                }
                this.f54g++;
                int i67 = this.f55h;
                long[] jArr13 = this.f48a;
                int i68 = e6 >> 3;
                long j34 = jArr13[i68];
                int i69 = (e6 & 7) << 3;
                if (((j34 >> i69) & j10) == j11) {
                    i10 = 1;
                }
                this.f55h = i67 - i10;
                int i70 = this.f53f;
                long j35 = (j34 & (~(j10 << i69))) | (j2 << i69);
                jArr13[i68] = j35;
                jArr13[(((e6 - 7) & i70) + (i70 & 7)) >> 3] = j35;
                return e6;
            }
            i25 += 8;
            i24 = (i24 + i25) & i23;
            i18 = i29;
        }
    }

    public final int e(int i2) {
        int i10 = this.f53f;
        int i11 = i2 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f48a;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (i0Var.f54g != this.f54g) {
            return false;
        }
        Object[] objArr = this.f49b;
        long[] jArr = this.f48a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128 && !i0Var.c(objArr[(i2 << 3) + i11])) {
                            return false;
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    public final void f(int i2) {
        int i10;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        if (i2 > 0) {
            i10 = Math.max(7, u0.c(i2));
        } else {
            i10 = 0;
        }
        this.f53f = i10;
        if (i10 == 0) {
            jArr = u0.f103a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i11];
            Arrays.fill(jArr3, 0, i11, -9187201950435737472L);
            jArr = jArr3;
        }
        this.f48a = jArr;
        int i12 = i10 >> 3;
        long j2 = 255 << ((i10 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j2)) | j2;
        this.f55h = u0.a(this.f53f) - this.f54g;
        if (i10 == 0) {
            objArr = b1.a.f1741c;
        } else {
            objArr = new Object[i10];
        }
        this.f49b = objArr;
        if (i10 == 0) {
            jArr2 = r.f90b;
        } else {
            long[] jArr4 = new long[i10];
            Arrays.fill(jArr4, 0, i10, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.f50c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f53f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f48a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f49b
            r15 = r15[r11]
            boolean r15 = nc.k.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.h(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.i0.g(java.lang.Object):boolean");
    }

    public final void h(int i2) {
        this.f54g--;
        long[] jArr = this.f48a;
        int i10 = this.f53f;
        int i11 = i2 >> 3;
        int i12 = (i2 & 7) << 3;
        long j2 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j2;
        jArr[(((i2 - 7) & i10) + (i10 & 7)) >> 3] = j2;
        this.f49b[i2] = null;
        long[] jArr2 = this.f50c;
        long j10 = jArr2[i2];
        int i13 = (int) ((j10 >> 31) & 2147483647L);
        int i14 = (int) (j10 & 2147483647L);
        if (i13 != Integer.MAX_VALUE) {
            jArr2[i13] = (jArr2[i13] & (-2147483648L)) | (i14 & 2147483647L);
        } else {
            this.f51d = i14;
        }
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = ((i13 & 2147483647L) << 31) | (jArr2[i14] & (-4611686016279904257L));
        } else {
            this.f52e = i13;
        }
        jArr2[i2] = 4611686018427387903L;
    }

    public final int hashCode() {
        int i2;
        int i10 = (this.f53f * 31) + this.f54g;
        Object[] objArr = this.f49b;
        long[] jArr = this.f48a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j2 = jArr[i11];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j2) < 128) {
                            Object obj = objArr[(i11 << 3) + i13];
                            if (!nc.k.a(obj, this)) {
                                if (obj != null) {
                                    i2 = obj.hashCode();
                                } else {
                                    i2 = 0;
                                }
                                i10 += i2;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i12 != 8) {
                        return i10;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    public final boolean i(Collection collection) {
        collection.getClass();
        Object[] objArr = this.f49b;
        int i2 = this.f54g;
        long[] jArr = this.f48a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j2 = jArr[i10];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j2) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!zb.l.N(collection, objArr[i13])) {
                                h(i13);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        if (i2 == this.f54g) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        Object[] objArr = this.f49b;
        long[] jArr = this.f50c;
        int i2 = this.f52e;
        int i10 = 0;
        while (true) {
            if (i2 != Integer.MAX_VALUE) {
                int i11 = (int) ((jArr[i2] >> 31) & 2147483647L);
                Object obj = objArr[i2];
                if (i10 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                if (obj == this) {
                    valueOf = "(this)";
                } else {
                    valueOf = String.valueOf(obj);
                }
                sb2.append((CharSequence) valueOf);
                i10++;
                i2 = i11;
            } else {
                sb2.append((CharSequence) "]");
                break;
            }
        }
        return sb2.toString();
    }
}
