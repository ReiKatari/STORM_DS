package a1;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public long[] f67a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f68b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f69c;

    /* renamed from: d  reason: collision with root package name */
    public int f70d;

    /* renamed from: e  reason: collision with root package name */
    public int f71e;

    /* renamed from: f  reason: collision with root package name */
    public int f72f;

    public m0(int i2) {
        boolean z10;
        this.f67a = u0.f103a;
        Object[] objArr = b1.a.f1741c;
        this.f68b = objArr;
        this.f69c = objArr;
        if (i2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            h(u0.d(i2));
        } else {
            a0.j.h("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f71e = 0;
        long[] jArr = this.f67a;
        if (jArr != u0.f103a) {
            zb.k.t(jArr, -9187201950435737472L);
            long[] jArr2 = this.f67a;
            int i2 = this.f70d;
            int i10 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j2)) | j2;
        }
        zb.k.s(0, this.f70d, null, this.f69c);
        zb.k.s(0, this.f70d, null, this.f68b);
        this.f72f = u0.a(this.f70d) - this.f71e;
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
    public final boolean b(java.lang.Object r18) {
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
            int r5 = r0.f70d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f67a
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
            java.lang.Object[] r15 = r0.f68b
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
        throw new UnsupportedOperationException("Method not decompiled: a1.m0.b(java.lang.Object):boolean");
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
            int r5 = r0.f70d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f67a
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
            java.lang.Object[] r15 = r0.f68b
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
        throw new UnsupportedOperationException("Method not decompiled: a1.m0.c(java.lang.Object):boolean");
    }

    public final boolean d(Object obj) {
        Object[] objArr = this.f69c;
        long[] jArr = this.f67a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128 && nc.k.a(obj, objArr[(i2 << 3) + i11])) {
                            return true;
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
        return false;
    }

    public final int e(int i2) {
        int i10 = this.f70d;
        int i11 = i2 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f67a;
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
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (m0Var.f71e != this.f71e) {
            return false;
        }
        Object[] objArr = this.f68b;
        Object[] objArr2 = this.f69c;
        long[] jArr = this.f67a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            loop0: while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128) {
                            int i12 = (i2 << 3) + i11;
                            Object obj2 = objArr[i12];
                            Object obj3 = objArr2[i12];
                            if (obj3 == null) {
                                if (m0Var.g(obj2) != null || !m0Var.c(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(m0Var.g(obj2))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    public final int f(Object obj) {
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
        int i19 = this.f70d;
        int i20 = i17 & i19;
        int i21 = 0;
        while (true) {
            long[] jArr3 = this.f67a;
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
                if (nc.k.a(this.f68b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i14 = i26;
            }
            int i27 = i14;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int e6 = e(i17);
                long j16 = 255;
                if (this.f72f != 0 || ((this.f67a[e6 >> 3] >> ((e6 & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i28 = this.f70d;
                    if (i28 > 8) {
                        int i29 = 8;
                        if (Long.compare((this.f71e * 32) ^ Long.MIN_VALUE, (i28 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f67a;
                            int i30 = this.f70d;
                            Object[] objArr2 = this.f68b;
                            Object[] objArr3 = this.f69c;
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
                            jArr4[i34] = (jArr4[i34] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[y10] = jArr4[0];
                            int i35 = 0;
                            while (i35 != i30) {
                                int i36 = i35 >> 3;
                                int i37 = (i35 & 7) << 3;
                                long j19 = (jArr4[i36] >> i37) & j2;
                                if (j19 == 128 || j19 != 254) {
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
                                    int e10 = e(i39);
                                    int i40 = i39 & i30;
                                    if (((e10 - i40) & i30) / i33 == ((i35 - i40) & i30) / i33) {
                                        jArr4[i36] = ((i12 & 127) << i37) | (jArr4[i36] & (~(j2 << i37)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i35++;
                                        i33 = i33;
                                    } else {
                                        int i41 = i33;
                                        int i42 = e10 >> 3;
                                        long j20 = jArr4[i42];
                                        int i43 = (e10 & 7) << 3;
                                        if (((j20 >> i43) & j2) == 128) {
                                            i13 = i30;
                                            objArr = objArr2;
                                            jArr4[i42] = ((~(j2 << i43)) & j20) | ((i12 & 127) << i43);
                                            jArr4[i36] = (jArr4[i36] & (~(j2 << i37))) | (128 << i37);
                                            objArr[e10] = objArr[i35];
                                            objArr[i35] = null;
                                            objArr3[e10] = objArr3[i35];
                                            objArr3[i35] = null;
                                        } else {
                                            i13 = i30;
                                            objArr = objArr2;
                                            jArr4[i42] = ((i12 & 127) << i43) | ((~(j2 << i43)) & j20);
                                            Object obj3 = objArr[e10];
                                            objArr[e10] = objArr[i35];
                                            objArr[i35] = obj3;
                                            Object obj4 = objArr3[e10];
                                            objArr3[e10] = objArr3[i35];
                                            objArr3[i35] = obj4;
                                            i35--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i35++;
                                        i33 = i41;
                                        i30 = i13;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            this.f72f = u0.a(this.f70d) - this.f71e;
                            e6 = e(i17);
                        }
                    }
                    j2 = 255;
                    j10 = j13;
                    j11 = 128;
                    int b10 = u0.b(this.f70d);
                    long[] jArr5 = this.f67a;
                    Object[] objArr4 = this.f68b;
                    Object[] objArr5 = this.f69c;
                    int i44 = this.f70d;
                    h(b10);
                    long[] jArr6 = this.f67a;
                    Object[] objArr6 = this.f68b;
                    Object[] objArr7 = this.f69c;
                    int i45 = this.f70d;
                    int i46 = 0;
                    while (i46 < i44) {
                        if (((jArr5[i46 >> 3] >> ((i46 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i46];
                            if (obj5 != null) {
                                i10 = obj5.hashCode();
                            } else {
                                i10 = 0;
                            }
                            int i47 = i10 * i27;
                            int i48 = i47 ^ (i47 << 16);
                            int e11 = e(i48 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j21 = i48 & 127;
                            int i49 = e11 >> 3;
                            int i50 = (e11 & 7) << 3;
                            long j22 = (jArr[i49] & (~(255 << i50))) | (j21 << i50);
                            jArr[i49] = j22;
                            jArr[(((e11 - 7) & i45) + (i45 & 7)) >> 3] = j22;
                            objArr6[e11] = obj5;
                            objArr7[e11] = objArr5[i46];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i46++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e6 = e(i17);
                }
                this.f71e++;
                int i51 = this.f72f;
                long[] jArr7 = this.f67a;
                int i52 = e6 >> 3;
                long j23 = jArr7[i52];
                int i53 = (e6 & 7) << 3;
                if (((j23 >> i53) & j2) == j11) {
                    i25 = 1;
                }
                this.f72f = i51 - i25;
                int i54 = this.f70d;
                long j24 = (j23 & (~(j2 << i53))) | (j10 << i53);
                jArr7[i52] = j24;
                jArr7[(((e6 - 7) & i54) + (i54 & 7)) >> 3] = j24;
                return ~e6;
            }
            i21 += 8;
            i20 = (i20 + i21) & i19;
            i18 = i24;
            i14 = i27;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f70d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f67a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f68b
            r11 = r11[r10]
            boolean r11 = nc.k.a(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object[] r14 = r13.f69c
            r14 = r14[r10]
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.m0.g(java.lang.Object):java.lang.Object");
    }

    public final void h(int i2) {
        int i10;
        long[] jArr;
        Object[] objArr;
        if (i2 > 0) {
            i10 = Math.max(7, u0.c(i2));
        } else {
            i10 = 0;
        }
        this.f70d = i10;
        if (i10 == 0) {
            jArr = u0.f103a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i11];
            Arrays.fill(jArr2, 0, i11, -9187201950435737472L);
            int i12 = i10 >> 3;
            long j2 = 255 << ((i10 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j2)) | j2;
            jArr = jArr2;
        }
        this.f67a = jArr;
        this.f72f = u0.a(this.f70d) - this.f71e;
        Object[] objArr2 = b1.a.f1741c;
        if (i10 == 0) {
            objArr = objArr2;
        } else {
            objArr = new Object[i10];
        }
        this.f68b = objArr;
        if (i10 != 0) {
            objArr2 = new Object[i10];
        }
        this.f69c = objArr2;
    }

    public final int hashCode() {
        int i2;
        int i10;
        Object[] objArr = this.f68b;
        Object[] objArr2 = this.f69c;
        long[] jArr = this.f67a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            long j2 = jArr[i11];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j2) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr[i15];
                        Object obj2 = objArr2[i15];
                        if (obj != null) {
                            i2 = obj.hashCode();
                        } else {
                            i2 = 0;
                        }
                        if (obj2 != null) {
                            i10 = obj2.hashCode();
                        } else {
                            i10 = 0;
                        }
                        i12 += i10 ^ i2;
                    }
                    j2 >>= 8;
                }
                if (i13 != 8) {
                    return i12;
                }
            }
            if (i11 != length) {
                i11++;
            } else {
                return i12;
            }
        }
    }

    public final boolean i() {
        if (this.f71e == 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.f71e != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f70d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f67a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f68b
            r11 = r11[r10]
            boolean r11 = nc.k.a(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.l(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.m0.k(java.lang.Object):java.lang.Object");
    }

    public final Object l(int i2) {
        this.f71e--;
        long[] jArr = this.f67a;
        int i10 = this.f70d;
        int i11 = i2 >> 3;
        int i12 = (i2 & 7) << 3;
        long j2 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j2;
        jArr[(((i2 - 7) & i10) + (i10 & 7)) >> 3] = j2;
        this.f68b[i2] = null;
        Object[] objArr = this.f69c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void m(Object obj, Object obj2) {
        int f8 = f(obj);
        if (f8 < 0) {
            f8 = ~f8;
        }
        this.f68b[f8] = obj;
        this.f69c[f8] = obj2;
    }

    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f68b;
        Object[] objArr2 = this.f69c;
        long[] jArr = this.f67a;
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
                            Object obj2 = objArr2[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb2.append(obj2);
                            i10++;
                            if (i10 < this.f71e) {
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

    public /* synthetic */ m0() {
        this(6);
    }
}
