package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j14  reason: default package */
/* loaded from: classes.dex */
public final class j14 extends y23 {
    public int f;

    public j14(int i) {
        boolean z;
        this.a = wu5.a;
        this.b = h33.a;
        this.c = pu.g;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f(wu5.d(i));
        } else {
            i.i("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != wu5.a) {
            nu.m0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        nu.l0(0, this.d, null, this.c);
        this.f = wu5.a(this.d) - this.e;
    }

    public final int d(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i3;
        int[] iArr;
        Object[] objArr;
        int i4;
        int i5 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.d;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            long j4 = ((jArr3[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr3[i12] >>> i13);
            long j5 = i8;
            int i15 = i11;
            int i16 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j7) >> 3)) & i9;
                int i17 = i5;
                int i18 = i16;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i5 = i17;
                i16 = i18;
            }
            int i19 = i5;
            int i20 = i16;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int e = e(i7);
                long j8 = 255;
                if (this.f != 0 || ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i21 = this.d;
                    if (i21 > 8) {
                        j3 = 128;
                        if (Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i21 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            int i22 = this.d;
                            int[] iArr2 = this.b;
                            Object[] objArr2 = this.c;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = i20;
                            while (i24 < i23) {
                                long j9 = j8;
                                long j10 = jArr4[i24] & (-9187201950435737472L);
                                jArr4[i24] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i24++;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int t0 = nu.t0(jArr4);
                            int i25 = t0 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i25] = (jArr4[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[t0] = jArr4[i20];
                            int i26 = i20;
                            while (i26 != i22) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j12 = (jArr4[i27] >> i28) & j;
                                if (j12 == 128 || j12 != 254) {
                                    i26++;
                                } else {
                                    int hashCode2 = Integer.hashCode(iArr2[i26]) * i19;
                                    int i29 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e2 = e(i29);
                                    int i30 = i29 & i22;
                                    if (((e2 - i30) & i22) / 8 == ((i26 - i30) & i22) / 8) {
                                        long j13 = j11;
                                        jArr4[i27] = ((i3 & 127) << i28) | ((~(j << i28)) & jArr4[i27]);
                                        jArr4[jArr4.length - i14] = (jArr4[i20] & j13) | Long.MIN_VALUE;
                                        i26++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i31 = e2 >> 3;
                                        long j15 = jArr4[i31];
                                        int i32 = (e2 & 7) << 3;
                                        if (((j15 >> i32) & j) == 128) {
                                            i4 = i14;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i31] = ((~(j << i32)) & j15) | ((i3 & 127) << i32);
                                            jArr4[i27] = (jArr4[i27] & (~(j << i28))) | (128 << i28);
                                            iArr[e2] = iArr[i26];
                                            iArr[i26] = i20;
                                            objArr[e2] = objArr[i26];
                                            objArr[i26] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i4 = i14;
                                            jArr4[i31] = ((i3 & 127) << i32) | ((~(j << i32)) & j15);
                                            int i33 = iArr[e2];
                                            iArr[e2] = iArr[i26];
                                            iArr[i26] = i33;
                                            Object obj = objArr[e2];
                                            objArr[e2] = objArr[i26];
                                            objArr[i26] = obj;
                                            i26--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i20] & j14) | Long.MIN_VALUE;
                                        i26++;
                                        j11 = j14;
                                        i14 = i4;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            i2 = i14;
                            this.f = wu5.a(this.d) - this.e;
                            e = e(i7);
                        }
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int b = wu5.b(this.d);
                    long[] jArr5 = this.a;
                    int[] iArr3 = this.b;
                    Object[] objArr3 = this.c;
                    int i34 = this.d;
                    f(b);
                    long[] jArr6 = this.a;
                    int[] iArr4 = this.b;
                    Object[] objArr4 = this.c;
                    int i35 = this.d;
                    int i36 = i20;
                    while (i36 < i34) {
                        if (((jArr5[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            int i37 = iArr3[i36];
                            int hashCode3 = Integer.hashCode(i37) * i19;
                            int i38 = hashCode3 ^ (hashCode3 << 16);
                            int e3 = e(i38 >>> 7);
                            long j16 = i38 & 127;
                            int i39 = e3 >> 3;
                            int i40 = (e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i39] & (~(255 << i40))) | (j16 << i40);
                            jArr[i39] = j17;
                            jArr[(((e3 - 7) & i35) + (i35 & 7)) >> 3] = j17;
                            iArr4[e3] = i37;
                            objArr4[e3] = objArr3[i36];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i36++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e = e(i7);
                }
                this.e++;
                int i41 = this.f;
                long[] jArr7 = this.a;
                int i42 = e >> 3;
                long j18 = jArr7[i42];
                int i43 = (e & 7) << 3;
                if (((j18 >> i43) & j) != j3) {
                    i2 = i20;
                }
                this.f = i41 - i2;
                int i44 = this.d;
                long j19 = (j18 & (~(j << i43))) | (j2 << i43);
                jArr7[i42] = j19;
                jArr7[(((e - 7) & i44) + (i44 & 7)) >> 3] = j19;
                return e;
            }
            i11 = i15 + 8;
            i10 = (i10 + i11) & i9;
            i5 = i19;
        }
    }

    public final int e(int i) {
        int i2 = this.d;
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

    public final void f(int i) {
        int i2;
        long[] jArr;
        if (i > 0) {
            i2 = Math.max(7, wu5.c(i));
        } else {
            i2 = 0;
        }
        this.d = i2;
        if (i2 == 0) {
            jArr = wu5.a;
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
        this.f = wu5.a(this.d) - this.e;
        this.b = new int[i2];
        this.c = new Object[i2];
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
            int r2 = r13.d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.a
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
            int[] r11 = r13.b
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
            java.lang.Object r13 = r13.h(r10)
            return r13
        L6b:
            r13 = 0
            return r13
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j14.g(int):java.lang.Object");
    }

    public final Object h(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void i(int i, Object obj) {
        int d = d(i);
        this.b[d] = i;
        this.c[d] = obj;
    }

    public /* synthetic */ j14() {
        this(6);
    }
}
