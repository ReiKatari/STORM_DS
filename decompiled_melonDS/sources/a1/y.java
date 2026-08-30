package a1;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public long[] f114a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f115b;

    /* renamed from: c  reason: collision with root package name */
    public int f116c;

    /* renamed from: d  reason: collision with root package name */
    public int f117d;

    /* renamed from: e  reason: collision with root package name */
    public int f118e;

    public y(int i2) {
        boolean z10;
        this.f114a = u0.f103a;
        this.f115b = n.f73a;
        if (i2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            d(u0.d(i2));
        } else {
            a0.j.h("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
        r22 = r4;
        r4 = (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) > 0 ? 1 : (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0 ? 0 : -1));
        r8 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
        if (r4 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
        r3 = c(r5);
        r12 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:
        if (r37.f118e != 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
        if (((r37.f114a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
        r27 = 255;
        r31 = true;
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
        r3 = r37.f116c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
        if (r3 <= 8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
        if (java.lang.Long.compare((r37.f117d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
        r3 = r37.f114a;
        r4 = r37.f116c;
        r6 = r37.f115b;
        r7 = (r4 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d3, code lost:
        if (r14 >= r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
        r29 = r8;
        r8 = r3[r14] & (-9187201950435737472L);
        r3[r14] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r14 = r14 + 1;
        r12 = r12;
        r8 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f2, code lost:
        r27 = r12;
        r7 = zb.k.y(r3);
        r8 = r7 - 1;
        r3[r8] = (r3[r8] & 72057594037927935L) | (-72057594037927936L);
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0113, code lost:
        if (r7 == r4) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0115, code lost:
        r8 = r7 >> 3;
        r9 = (r7 & 7) << 3;
        r12 = (r3[r8] >> r9) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0122, code lost:
        if (r12 != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0124, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0129, code lost:
        if (r12 == 254) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012c, code lost:
        r12 = java.lang.Integer.hashCode(r6[r7]) * r22;
        r13 = (r12 ^ (r12 << 16)) >>> 7;
        r14 = c(r13);
        r13 = r13 & r4;
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014b, code lost:
        if ((((r14 - r13) & r4) / 8) != (((r7 - r13) & r4) / 8)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014d, code lost:
        r30 = r6;
        r3[r8] = ((~(r27 << r9)) & r3[r8]) | ((r12 & 127) << r9);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016b, code lost:
        r6 = r30;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0170, code lost:
        r30 = r6;
        r32 = r7;
        r6 = r14 >> 3;
        r33 = r3[r6];
        r7 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0182, code lost:
        if (((r33 >> r7) & r27) != 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0184, code lost:
        r3[r6] = (r33 & (~(r27 << r7))) | ((r12 & 127) << r7);
        r3[r8] = (r3[r8] & (~(r27 << r9))) | (128 << r9);
        r30[r14] = r30[r32];
        r30[r32] = 0;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a8, code lost:
        r3[r6] = ((r12 & 127) << r7) | (r33 & (~(r27 << r7)));
        r6 = r30[r14];
        r30[r14] = r30[r32];
        r30[r32] = r6;
        r7 = r32 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01c2, code lost:
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d0, code lost:
        r31 = r15;
        r37.f118e = a1.u0.a(r37.f116c) - r37.f117d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01df, code lost:
        r27 = 255;
        r31 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e6, code lost:
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e9, code lost:
        r3 = a1.u0.b(r37.f116c);
        r4 = r37.f114a;
        r6 = r37.f115b;
        r7 = r37.f116c;
        d(r3);
        r3 = r37.f114a;
        r8 = r37.f115b;
        r9 = r37.f116c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0200, code lost:
        if (r12 >= r7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x020f, code lost:
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r20) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0211, code lost:
        r13 = r6[r12];
        r14 = java.lang.Integer.hashCode(r13) * r22;
        r14 = r14 ^ (r14 << 16);
        r15 = c(r14 >>> 7);
        r19 = r3;
        r18 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r3 = (r19[r14] & (~(255 << r23))) | (r3 << r23);
        r19[r14] = r3;
        r19[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024c, code lost:
        r19 = r3;
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0250, code lost:
        r12 = r12 + 1;
        r4 = r18;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0257, code lost:
        r3 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x025b, code lost:
        r14 = r3;
        r37.f117d++;
        r3 = r37.f118e;
        r4 = r37.f114a;
        r5 = r14 >> 3;
        r6 = r4[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0274, code lost:
        if (((r6 >> r8) & r27) != r20) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0276, code lost:
        r9 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0279, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x027b, code lost:
        r37.f118e = r3 - r9;
        r3 = r37.f116c;
        r6 = (r6 & (~(r27 << r8))) | (r10 << r8);
        r4[r5] = r6;
        r4[(((r14 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r38) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.y.a(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f116c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f114a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.f115b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L59
            goto L6a
        L59:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L42
        L60:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6e
            r10 = -1
        L6a:
            if (r10 < 0) goto L6d
            return r11
        L6d:
            return r4
        L6e:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.y.b(int):boolean");
    }

    public final int c(int i2) {
        int i10 = this.f116c;
        int i11 = i2 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f114a;
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

    public final void d(int i2) {
        int i10;
        long[] jArr;
        if (i2 > 0) {
            i10 = Math.max(7, u0.c(i2));
        } else {
            i10 = 0;
        }
        this.f116c = i10;
        if (i10 == 0) {
            jArr = u0.f103a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i11];
            Arrays.fill(jArr2, 0, i11, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f114a = jArr;
        int i12 = i10 >> 3;
        long j2 = 255 << ((i10 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j2)) | j2;
        this.f118e = u0.a(this.f116c) - this.f117d;
        this.f115b = new int[i10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f116c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f114a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.f115b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L59
            goto L6a
        L59:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L42
        L60:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L73
            r10 = -1
        L6a:
            if (r10 < 0) goto L6d
            r4 = r11
        L6d:
            if (r4 == 0) goto L72
            r0.f(r10)
        L72:
            return r4
        L73:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.y.e(int):boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (yVar.f117d != this.f117d) {
            return false;
        }
        int[] iArr = this.f115b;
        long[] jArr = this.f114a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128 && !yVar.b(iArr[(i2 << 3) + i11])) {
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
        this.f117d--;
        long[] jArr = this.f114a;
        int i10 = this.f116c;
        int i11 = i2 >> 3;
        int i12 = (i2 & 7) << 3;
        long j2 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j2;
        jArr[(((i2 - 7) & i10) + (i10 & 7)) >> 3] = j2;
    }

    public final int hashCode() {
        int[] iArr = this.f115b;
        long[] jArr = this.f114a;
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
                        i10 = Integer.hashCode(iArr[(i2 << 3) + i12]) + i10;
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f115b;
        long[] jArr = this.f114a;
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
                            int i13 = iArr[(i2 << 3) + i12];
                            if (i10 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append(i13);
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

    public /* synthetic */ y() {
        this(6);
    }
}
