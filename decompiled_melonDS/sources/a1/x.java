package a1;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x extends l {

    /* renamed from: f  reason: collision with root package name */
    public int f113f;

    public x(int i2) {
        boolean z10;
        this.f61a = u0.f103a;
        this.f62b = n.f73a;
        this.f63c = b1.a.f1741c;
        if (i2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f(u0.d(i2));
        } else {
            a0.j.h("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f65e = 0;
        long[] jArr = this.f61a;
        if (jArr != u0.f103a) {
            zb.k.t(jArr, -9187201950435737472L);
            long[] jArr2 = this.f61a;
            int i2 = this.f64d;
            int i10 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j2)) | j2;
        }
        zb.k.s(0, this.f64d, null, this.f63c);
        this.f113f = u0.a(this.f64d) - this.f65e;
    }

    public final int d(int i2) {
        long j2;
        long j10;
        int i10;
        long j11;
        long[] jArr;
        long[] jArr2;
        int i11;
        int[] iArr;
        Object[] objArr;
        int i12;
        int i13 = -862048943;
        int hashCode = Integer.hashCode(i2) * (-862048943);
        int i14 = hashCode ^ (hashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f64d;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr3 = this.f61a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            long j12 = ((jArr3[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr3[i20] >>> i21);
            long j13 = i16;
            int i23 = i19;
            int i24 = 0;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int numberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j15) >> 3)) & i17;
                int i25 = i13;
                int i26 = i24;
                if (this.f62b[numberOfTrailingZeros] == i2) {
                    return numberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i13 = i25;
                i24 = i26;
            }
            int i27 = i13;
            int i28 = i24;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int e6 = e(i15);
                long j16 = 255;
                if (this.f113f != 0 || ((this.f61a[e6 >> 3] >> ((e6 & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j10 = j13;
                    i10 = 1;
                    j11 = 128;
                } else {
                    int i29 = this.f64d;
                    if (i29 > 8) {
                        j11 = 128;
                        if (Long.compare((this.f65e * 32) ^ Long.MIN_VALUE, (i29 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f61a;
                            int i30 = this.f64d;
                            int[] iArr2 = this.f62b;
                            Object[] objArr2 = this.f63c;
                            int i31 = (i30 + 7) >> 3;
                            int i32 = i28;
                            while (i32 < i31) {
                                long j17 = j16;
                                long j18 = jArr4[i32] & (-9187201950435737472L);
                                jArr4[i32] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i32++;
                                j13 = j13;
                                j16 = j17;
                            }
                            j2 = j16;
                            j10 = j13;
                            int y10 = zb.k.y(jArr4);
                            int i33 = y10 - 1;
                            long j19 = 72057594037927935L;
                            jArr4[i33] = (jArr4[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[y10] = jArr4[i28];
                            int i34 = i28;
                            while (i34 != i30) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j20 = (jArr4[i35] >> i36) & j2;
                                if (j20 == 128 || j20 != 254) {
                                    i34++;
                                } else {
                                    int hashCode2 = Integer.hashCode(iArr2[i34]) * i27;
                                    int i37 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e10 = e(i37);
                                    int i38 = i37 & i30;
                                    if (((e10 - i38) & i30) / 8 == ((i34 - i38) & i30) / 8) {
                                        long j21 = j19;
                                        jArr4[i35] = ((i11 & 127) << i36) | ((~(j2 << i36)) & jArr4[i35]);
                                        jArr4[jArr4.length - i22] = (jArr4[i28] & j21) | Long.MIN_VALUE;
                                        i34++;
                                        j19 = j21;
                                    } else {
                                        long j22 = j19;
                                        int i39 = e10 >> 3;
                                        long j23 = jArr4[i39];
                                        int i40 = (e10 & 7) << 3;
                                        if (((j23 >> i40) & j2) == 128) {
                                            i12 = i22;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i39] = ((~(j2 << i40)) & j23) | ((i11 & 127) << i40);
                                            jArr4[i35] = (jArr4[i35] & (~(j2 << i36))) | (128 << i36);
                                            iArr[e10] = iArr[i34];
                                            iArr[i34] = i28;
                                            objArr[e10] = objArr[i34];
                                            objArr[i34] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i12 = i22;
                                            jArr4[i39] = ((i11 & 127) << i40) | ((~(j2 << i40)) & j23);
                                            int i41 = iArr[e10];
                                            iArr[e10] = iArr[i34];
                                            iArr[i34] = i41;
                                            Object obj = objArr[e10];
                                            objArr[e10] = objArr[i34];
                                            objArr[i34] = obj;
                                            i34--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i28] & j22) | Long.MIN_VALUE;
                                        i34++;
                                        j19 = j22;
                                        i22 = i12;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            i10 = i22;
                            this.f113f = u0.a(this.f64d) - this.f65e;
                            e6 = e(i15);
                        }
                    } else {
                        j11 = 128;
                    }
                    j2 = 255;
                    j10 = j13;
                    i10 = 1;
                    int b10 = u0.b(this.f64d);
                    long[] jArr5 = this.f61a;
                    int[] iArr3 = this.f62b;
                    Object[] objArr3 = this.f63c;
                    int i42 = this.f64d;
                    f(b10);
                    long[] jArr6 = this.f61a;
                    int[] iArr4 = this.f62b;
                    Object[] objArr4 = this.f63c;
                    int i43 = this.f64d;
                    int i44 = i28;
                    while (i44 < i42) {
                        if (((jArr5[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j11) {
                            int i45 = iArr3[i44];
                            int hashCode3 = Integer.hashCode(i45) * i27;
                            int i46 = hashCode3 ^ (hashCode3 << 16);
                            int e11 = e(i46 >>> 7);
                            long j24 = i46 & 127;
                            int i47 = e11 >> 3;
                            int i48 = (e11 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j25 = (jArr6[i47] & (~(255 << i48))) | (j24 << i48);
                            jArr[i47] = j25;
                            jArr[(((e11 - 7) & i43) + (i43 & 7)) >> 3] = j25;
                            iArr4[e11] = i45;
                            objArr4[e11] = objArr3[i44];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i44++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e6 = e(i15);
                }
                this.f65e++;
                int i49 = this.f113f;
                long[] jArr7 = this.f61a;
                int i50 = e6 >> 3;
                long j26 = jArr7[i50];
                int i51 = (e6 & 7) << 3;
                if (((j26 >> i51) & j2) != j11) {
                    i10 = i28;
                }
                this.f113f = i49 - i10;
                int i52 = this.f64d;
                long j27 = (j26 & (~(j2 << i51))) | (j10 << i51);
                jArr7[i50] = j27;
                jArr7[(((e6 - 7) & i52) + (i52 & 7)) >> 3] = j27;
                return e6;
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i27;
        }
    }

    public final int e(int i2) {
        int i10 = this.f64d;
        int i11 = i2 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f61a;
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

    public final void f(int i2) {
        int i10;
        long[] jArr;
        if (i2 > 0) {
            i10 = Math.max(7, u0.c(i2));
        } else {
            i10 = 0;
        }
        this.f64d = i10;
        if (i10 == 0) {
            jArr = u0.f103a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i11];
            Arrays.fill(jArr2, 0, i11, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f61a = jArr;
        int i12 = i10 >> 3;
        long j2 = 255 << ((i10 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j2)) | j2;
        this.f113f = u0.a(this.f64d) - this.f65e;
        this.f62b = new int[i10];
        this.f63c = new Object[i10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f64d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f61a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f62b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object r14 = r13.h(r10)
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.x.g(int):java.lang.Object");
    }

    public final Object h(int i2) {
        this.f65e--;
        long[] jArr = this.f61a;
        int i10 = this.f64d;
        int i11 = i2 >> 3;
        int i12 = (i2 & 7) << 3;
        long j2 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j2;
        jArr[(((i2 - 7) & i10) + (i10 & 7)) >> 3] = j2;
        Object[] objArr = this.f63c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void i(int i2, Object obj) {
        int d4 = d(i2);
        this.f62b[d4] = i2;
        this.f63c[d4] = obj;
    }

    public /* synthetic */ x() {
        this(6);
    }
}
