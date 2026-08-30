package a1;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public long[] f74a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f75b;

    /* renamed from: c  reason: collision with root package name */
    public int f76c;

    /* renamed from: d  reason: collision with root package name */
    public int f77d;

    /* renamed from: e  reason: collision with root package name */
    public int f78e;

    public n0(int i2) {
        this.f74a = u0.f103a;
        this.f75b = b1.a.f1741c;
        if (i2 >= 0) {
            f(u0.d(i2));
        } else {
            a0.j.h("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i2 = this.f77d;
        this.f75b[d(obj)] = obj;
        if (this.f77d != i2) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.f77d = 0;
        long[] jArr = this.f74a;
        if (jArr != u0.f103a) {
            zb.k.t(jArr, -9187201950435737472L);
            long[] jArr2 = this.f74a;
            int i2 = this.f76c;
            int i10 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j2)) | j2;
        }
        zb.k.s(0, this.f76c, null, this.f75b);
        this.f78e = u0.a(this.f76c) - this.f77d;
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
            int r5 = r0.f76c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f74a
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
            java.lang.Object[] r15 = r0.f75b
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
        throw new UnsupportedOperationException("Method not decompiled: a1.n0.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
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
        int i14;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = -862048943;
        int i16 = i2 * (-862048943);
        int i17 = i16 ^ (i16 << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        int i20 = this.f76c;
        int i21 = i18 & i20;
        int i22 = 0;
        while (true) {
            long[] jArr3 = this.f74a;
            int i23 = i21 >> 3;
            int i24 = (i21 & 7) << 3;
            long j12 = ((jArr3[i23 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr3[i23] >>> i24);
            long j13 = i19;
            int i25 = i19;
            int i26 = 0;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int numberOfTrailingZeros = (i21 + (Long.numberOfTrailingZeros(j15) >> 3)) & i20;
                int i27 = i15;
                if (nc.k.a(this.f75b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i15 = i27;
            }
            int i28 = i15;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int e6 = e(i18);
                long j16 = 255;
                if (this.f78e != 0 || ((this.f74a[e6 >> 3] >> ((e6 & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i29 = this.f76c;
                    if (i29 > 8) {
                        int i30 = 8;
                        if (Long.compare((this.f77d * 32) ^ Long.MIN_VALUE, (i29 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f74a;
                            int i31 = this.f76c;
                            Object[] objArr2 = this.f75b;
                            int i32 = (i31 + 7) >> 3;
                            int i33 = 0;
                            j11 = 128;
                            while (i33 < i32) {
                                long j17 = j16;
                                long j18 = jArr4[i33] & (-9187201950435737472L);
                                jArr4[i33] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i33++;
                                i30 = i30;
                                j13 = j13;
                                j16 = j17;
                            }
                            j2 = j16;
                            j10 = j13;
                            int i34 = i30;
                            int y10 = zb.k.y(jArr4);
                            int i35 = y10 - 1;
                            long j19 = 72057594037927935L;
                            jArr4[i35] = (jArr4[i35] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[y10] = jArr4[0];
                            int i36 = 0;
                            while (i36 != i31) {
                                int i37 = i36 >> 3;
                                int i38 = (i36 & 7) << 3;
                                long j20 = (jArr4[i37] >> i38) & j2;
                                if (j20 == 128 || j20 != 254) {
                                    i36++;
                                } else {
                                    Object obj2 = objArr2[i36];
                                    if (obj2 != null) {
                                        i11 = obj2.hashCode();
                                    } else {
                                        i11 = 0;
                                    }
                                    int i39 = i11 * i28;
                                    int i40 = (i39 ^ (i39 << 16)) >>> 7;
                                    int e10 = e(i40);
                                    int i41 = i40 & i31;
                                    if (((e10 - i41) & i31) / i34 == ((i36 - i41) & i31) / i34) {
                                        long j21 = j19;
                                        jArr4[i37] = ((i12 & 127) << i38) | ((~(j2 << i38)) & jArr4[i37]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j21) | Long.MIN_VALUE;
                                        i36++;
                                        j19 = j21;
                                    } else {
                                        long j22 = j19;
                                        int i42 = e10 >> 3;
                                        long j23 = jArr4[i42];
                                        int i43 = (e10 & 7) << 3;
                                        if (((j23 >> i43) & j2) == 128) {
                                            i14 = i34;
                                            i13 = i31;
                                            objArr = objArr2;
                                            jArr4[i42] = ((~(j2 << i43)) & j23) | ((i12 & 127) << i43);
                                            jArr4[i37] = (jArr4[i37] & (~(j2 << i38))) | (128 << i38);
                                            objArr[e10] = objArr[i36];
                                            objArr[i36] = null;
                                        } else {
                                            i13 = i31;
                                            objArr = objArr2;
                                            i14 = i34;
                                            jArr4[i42] = ((i12 & 127) << i43) | ((~(j2 << i43)) & j23);
                                            Object obj3 = objArr[e10];
                                            objArr[e10] = objArr[i36];
                                            objArr[i36] = obj3;
                                            i36--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j22) | Long.MIN_VALUE;
                                        i36++;
                                        j19 = j22;
                                        i34 = i14;
                                        i31 = i13;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            this.f78e = u0.a(this.f76c) - this.f77d;
                            e6 = e(i18);
                        }
                    }
                    j2 = 255;
                    j10 = j13;
                    j11 = 128;
                    int b10 = u0.b(this.f76c);
                    long[] jArr5 = this.f74a;
                    Object[] objArr3 = this.f75b;
                    int i44 = this.f76c;
                    f(b10);
                    long[] jArr6 = this.f74a;
                    Object[] objArr4 = this.f75b;
                    int i45 = this.f76c;
                    int i46 = 0;
                    while (i46 < i44) {
                        if (((jArr5[i46 >> 3] >> ((i46 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i46];
                            if (obj4 != null) {
                                i10 = obj4.hashCode();
                            } else {
                                i10 = 0;
                            }
                            int i47 = i10 * i28;
                            int i48 = i47 ^ (i47 << 16);
                            int e11 = e(i48 >>> 7);
                            long j24 = i48 & 127;
                            int i49 = e11 >> 3;
                            int i50 = (e11 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j25 = (jArr6[i49] & (~(255 << i50))) | (j24 << i50);
                            jArr[i49] = j25;
                            jArr[(((e11 - 7) & i45) + (i45 & 7)) >> 3] = j25;
                            objArr4[e11] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i46++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e6 = e(i18);
                }
                this.f77d++;
                int i51 = this.f78e;
                long[] jArr7 = this.f74a;
                int i52 = e6 >> 3;
                long j26 = jArr7[i52];
                int i53 = (e6 & 7) << 3;
                if (((j26 >> i53) & j2) == j11) {
                    i26 = 1;
                }
                this.f78e = i51 - i26;
                int i54 = this.f76c;
                long j27 = (j26 & (~(j2 << i53))) | (j10 << i53);
                jArr7[i52] = j27;
                jArr7[(((e6 - 7) & i54) + (i54 & 7)) >> 3] = j27;
                return e6;
            }
            i22 += 8;
            i21 = (i21 + i22) & i20;
            i19 = i25;
            i15 = i28;
        }
    }

    public final int e(int i2) {
        int i10 = this.f76c;
        int i11 = i2 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f74a;
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
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (n0Var.f77d != this.f77d) {
            return false;
        }
        Object[] objArr = this.f75b;
        long[] jArr = this.f74a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128 && !n0Var.c(objArr[(i2 << 3) + i11])) {
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
        if (i2 > 0) {
            i10 = Math.max(7, u0.c(i2));
        } else {
            i10 = 0;
        }
        this.f76c = i10;
        if (i10 == 0) {
            jArr = u0.f103a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i11];
            Arrays.fill(jArr2, 0, i11, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f74a = jArr;
        int i12 = i10 >> 3;
        long j2 = 255 << ((i10 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j2)) | j2;
        this.f78e = u0.a(this.f76c) - this.f77d;
        if (i10 == 0) {
            objArr = b1.a.f1741c;
        } else {
            objArr = new Object[i10];
        }
        this.f75b = objArr;
    }

    public final boolean g() {
        if (this.f77d == 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.f77d != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i10 = (this.f76c * 31) + this.f77d;
        Object[] objArr = this.f75b;
        long[] jArr = this.f74a;
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
            int r3 = r13.f76c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f74a
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
            java.lang.Object[] r11 = r13.f75b
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
        throw new UnsupportedOperationException("Method not decompiled: a1.n0.i(java.lang.Object):void");
    }

    public final void j(n0 n0Var) {
        n0Var.getClass();
        Object[] objArr = n0Var.f75b;
        long[] jArr = n0Var.f74a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128) {
                            k(objArr[(i2 << 3) + i11]);
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k(Object obj) {
        this.f75b[d(obj)] = obj;
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
            int r5 = r0.f76c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f74a
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
            java.lang.Object[] r15 = r0.f75b
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
            r0.m(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.n0.l(java.lang.Object):boolean");
    }

    public final void m(int i2) {
        this.f77d--;
        long[] jArr = this.f74a;
        int i10 = this.f76c;
        int i11 = i2 >> 3;
        int i12 = (i2 & 7) << 3;
        long j2 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j2;
        jArr[(((i2 - 7) & i10) + (i10 & 7)) >> 3] = j2;
        this.f75b[i2] = null;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        Object[] objArr = this.f75b;
        long[] jArr = this.f74a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j2) < 128) {
                            Object obj = objArr[(i2 << 3) + i12];
                            if (i10 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
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
        sb2.append((CharSequence) "]");
        return sb2.toString();
    }

    public /* synthetic */ n0() {
        this(6);
    }
}
