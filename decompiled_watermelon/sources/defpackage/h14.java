package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h14  reason: default package */
/* loaded from: classes.dex */
public final class h14 {
    public long[] a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public h14(int i) {
        this.a = wu5.a;
        int[] iArr = h33.a;
        this.b = iArr;
        this.c = iArr;
        if (i >= 0) {
            e(wu5.d(i));
        } else {
            i.i("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
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
        this.f = wu5.a(this.d) - this.e;
    }

    public final int b(int i) {
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

    public final int c(int i) {
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int d(int i) {
        int c = c(i);
        if (c >= 0) {
            return this.c[c];
        }
        return -1;
    }

    public final void e(int i) {
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
        this.c = new int[i2];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h14)) {
            return false;
        }
        h14 h14Var = (h14) obj;
        if (h14Var.e != this.e) {
            return false;
        }
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            int i6 = iArr2[i4];
                            int c = h14Var.c(i5);
                            if (c < 0 || i6 != h14Var.c[c]) {
                                break loop0;
                            }
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
            return false;
        }
        return true;
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
        if (r37.f != 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
        if (((r37.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
        r2 = r37.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
        if (r2 <= 8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
        if (java.lang.Long.compare((r37.e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c6, code lost:
        r2 = r37.a;
        r3 = r37.d;
        r5 = r37.b;
        r6 = r37.c;
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
        r7 = defpackage.nu.t0(r2);
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
        r37.f = defpackage.wu5.a(r37.d) - r37.e;
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
        r2 = defpackage.wu5.b(r37.d);
        r3 = r37.a;
        r5 = r37.b;
        r6 = r37.c;
        r7 = r37.d;
        e(r2);
        r2 = r37.a;
        r8 = r37.b;
        r9 = r37.c;
        r10 = r37.d;
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
        r37.e++;
        r1 = r37.f;
        r3 = r37.a;
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
        r37.f = r1 - r32;
        r1 = r37.d;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h14.f(int, int):void");
    }

    public final int hashCode() {
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        int i6 = iArr[i5];
                        i2 += Integer.hashCode(iArr2[i5]) ^ Integer.hashCode(i6);
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i != length) {
                i++;
            } else {
                return i2;
            }
        }
    }

    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            int i7 = iArr2[i5];
                            sb.append(i6);
                            sb.append("=");
                            sb.append(i7);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
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
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ h14() {
        this(6);
    }
}
