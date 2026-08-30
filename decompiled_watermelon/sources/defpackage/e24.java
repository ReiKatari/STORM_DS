package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e24  reason: default package */
/* loaded from: classes.dex */
public final class e24 {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;

    public e24(int i) {
        this.a = wu5.a;
        this.b = pu.g;
        if (i >= 0) {
            f(wu5.d(i));
        } else {
            i.i("Capacity must be a positive value.");
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
        if (jArr != wu5.a) {
            nu.m0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        nu.l0(0, this.c, null, this.b);
        this.e = wu5.a(this.c) - this.d;
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
            int r5 = r0.c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
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
            java.lang.Object[] r15 = r0.b
            r15 = r15[r11]
            boolean r15 = defpackage.b53.x(r15, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e24.c(java.lang.Object):boolean");
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
                if (b53.x(this.b[numberOfTrailingZeros], obj)) {
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
                            int t0 = nu.t0(jArr4);
                            int i27 = t0 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i27] = (jArr4[i27] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[t0] = jArr4[0];
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
                            this.e = wu5.a(this.c) - this.d;
                            e = e(i10);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int b = wu5.b(this.c);
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
        if (!(obj instanceof e24)) {
            return false;
        }
        e24 e24Var = (e24) obj;
        if (e24Var.d != this.d) {
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
                        if ((255 & j) < 128 && !e24Var.c(objArr[(i << 3) + i3])) {
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
            i2 = Math.max(7, wu5.c(i));
        } else {
            i2 = 0;
        }
        this.c = i2;
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
        this.e = wu5.a(this.c) - this.d;
        if (i2 == 0) {
            objArr = pu.g;
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
                            if (!b53.x(obj, this)) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r14) {
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
            int r3 = r13.c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.a
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
            java.lang.Object[] r11 = r13.b
            r11 = r11[r10]
            boolean r11 = defpackage.b53.x(r11, r14)
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
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.m(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e24.i(java.lang.Object):void");
    }

    public final void j(e24 e24Var) {
        e24Var.getClass();
        Object[] objArr = e24Var.b;
        long[] jArr = e24Var.a;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.Object r18) {
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
            int r5 = r0.c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
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
            java.lang.Object[] r15 = r0.b
            r15 = r15[r11]
            boolean r15 = defpackage.b53.x(r15, r1)
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
            r0.m(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e24.l(java.lang.Object):boolean");
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

    public /* synthetic */ e24() {
        this(6);
    }
}
