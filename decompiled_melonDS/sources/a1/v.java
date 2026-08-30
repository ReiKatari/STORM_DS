package a1;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public long[] f104a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f105b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f106c;

    /* renamed from: d  reason: collision with root package name */
    public int f107d;

    /* renamed from: e  reason: collision with root package name */
    public int f108e;

    /* renamed from: f  reason: collision with root package name */
    public int f109f;

    public v(int i2) {
        this.f104a = u0.f103a;
        int[] iArr = n.f73a;
        this.f105b = iArr;
        this.f106c = iArr;
        if (i2 >= 0) {
            e(u0.d(i2));
        } else {
            a0.j.h("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f108e = 0;
        long[] jArr = this.f104a;
        if (jArr != u0.f103a) {
            zb.k.t(jArr, -9187201950435737472L);
            long[] jArr2 = this.f104a;
            int i2 = this.f107d;
            int i10 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j2)) | j2;
        }
        this.f109f = u0.a(this.f107d) - this.f108e;
    }

    public final int b(int i2) {
        int i10 = this.f107d;
        int i11 = i2 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f104a;
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

    public final int c(int i2) {
        int hashCode = Integer.hashCode(i2) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f107d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f104a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j2 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (i11 * 72340172838076673L) ^ j2;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (this.f105b[numberOfTrailingZeros] == i2) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final int d(int i2) {
        int c4 = c(i2);
        if (c4 >= 0) {
            return this.f106c[c4];
        }
        return -1;
    }

    public final void e(int i2) {
        int i10;
        long[] jArr;
        if (i2 > 0) {
            i10 = Math.max(7, u0.c(i2));
        } else {
            i10 = 0;
        }
        this.f107d = i10;
        if (i10 == 0) {
            jArr = u0.f103a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i11];
            Arrays.fill(jArr2, 0, i11, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f104a = jArr;
        int i12 = i10 >> 3;
        long j2 = 255 << ((i10 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j2)) | j2;
        this.f109f = u0.a(this.f107d) - this.f108e;
        this.f105b = new int[i10];
        this.f106c = new int[i10];
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (vVar.f108e != this.f108e) {
            return false;
        }
        int[] iArr = this.f105b;
        int[] iArr2 = this.f106c;
        long[] jArr = this.f104a;
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
                        int i13 = iArr[i12];
                        int i14 = iArr2[i12];
                        int c4 = vVar.c(i13);
                        if (c4 < 0) {
                            break loop0;
                        }
                        z11 = z12;
                        if (i14 != vVar.f106c[c4]) {
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
        r2 = b(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
        if (r37.f109f != 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
        if (((r37.f104a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
        r2 = r37.f107d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
        if (r2 <= 8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
        if (java.lang.Long.compare((r37.f108e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c6, code lost:
        r2 = r37.f104a;
        r3 = r37.f107d;
        r5 = r37.f105b;
        r6 = r37.f106c;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d5, code lost:
        if (r7 >= r13) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d7, code lost:
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
        r29 = r9;
        r27 = r11;
        r12 = 7;
        r7 = zb.k.y(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0112, code lost:
        if (r7 == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0114, code lost:
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0121, code lost:
        if (r9 != 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0123, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0128, code lost:
        if (r9 == 254) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
        r9 = java.lang.Integer.hashCode(r5[r7]) * r21;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r13 = b(r10);
        r10 = r10 & r3;
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014a, code lost:
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014c, code lost:
        r32 = r15;
        r2[r8] = ((r9 & 127) << r11) | (r2[r8] & (~(r27 << r11)));
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r31;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0171, code lost:
        r18 = r14;
        r32 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0183, code lost:
        if (((r14 >> r12) & r27) != 128) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0185, code lost:
        r33 = r5;
        r34 = r6;
        r2[r10] = ((~(r27 << r12)) & r14) | ((r9 & 127) << r12);
        r2[r8] = (r2[r8] & (~(r27 << r11))) | (128 << r11);
        r33[r13] = r33[r7];
        r33[r7] = r32;
        r34[r13] = r34[r7];
        r34[r7] = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01af, code lost:
        r33 = r5;
        r34 = r6;
        r2[r10] = ((r9 & 127) << r12) | ((~(r27 << r12)) & r14);
        r5 = r33[r13];
        r33[r13] = r33[r7];
        r33[r7] = r5;
        r5 = r34[r13];
        r34[r13] = r34[r7];
        r34[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d0, code lost:
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r31;
        r15 = r32;
        r5 = r33;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e9, code lost:
        r18 = r14;
        r32 = r15;
        r37.f109f = a1.u0.a(r37.f107d) - r37.f108e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01fc, code lost:
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0207, code lost:
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x020a, code lost:
        r2 = a1.u0.b(r37.f107d);
        r3 = r37.f104a;
        r5 = r37.f105b;
        r6 = r37.f106c;
        r7 = r37.f107d;
        e(r2);
        r2 = r37.f104a;
        r8 = r37.f105b;
        r9 = r37.f106c;
        r10 = r37.f107d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0225, code lost:
        if (r11 >= r7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0234, code lost:
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r19) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0236, code lost:
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = b(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0272, code lost:
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0273, code lost:
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0279, code lost:
        r2 = b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x027d, code lost:
        r37.f108e++;
        r1 = r37.f109f;
        r3 = r37.f104a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0295, code lost:
        if (((r5 >> r7) & r27) != r19) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0297, code lost:
        r32 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0299, code lost:
        r37.f109f = r1 - r32;
        r1 = r37.f107d;
        r5 = (r5 & (~(r27 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.v.f(int, int):void");
    }

    public final int hashCode() {
        int[] iArr = this.f105b;
        int[] iArr2 = this.f106c;
        long[] jArr = this.f104a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i10 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i2 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j2) < 128) {
                        int i13 = (i2 << 3) + i12;
                        int i14 = iArr[i13];
                        i10 += Integer.hashCode(iArr2[i13]) ^ Integer.hashCode(i14);
                    }
                    j2 >>= 8;
                }
                if (i11 != 8) {
                    return i10;
                }
            }
            if (i2 != length) {
                i2++;
            } else {
                return i10;
            }
        }
    }

    public final String toString() {
        if (this.f108e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.f105b;
        int[] iArr2 = this.f106c;
        long[] jArr = this.f104a;
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
                            int i14 = iArr[i13];
                            int i15 = iArr2[i13];
                            sb2.append(i14);
                            sb2.append("=");
                            sb2.append(i15);
                            i10++;
                            if (i10 < this.f108e) {
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

    public /* synthetic */ v() {
        this(6);
    }
}
