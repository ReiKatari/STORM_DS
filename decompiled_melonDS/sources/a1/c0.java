package a1;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public long[] f26a = u0.f103a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f27b = b1.a.f1741c;

    /* renamed from: c  reason: collision with root package name */
    public float[] f28c = i.f47a;

    /* renamed from: d  reason: collision with root package name */
    public int f29d;

    /* renamed from: e  reason: collision with root package name */
    public int f30e;

    /* renamed from: f  reason: collision with root package name */
    public int f31f;

    public c0(int i2) {
        if (i2 >= 0) {
            c(u0.d(i2));
        } else {
            a0.j.h("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i2) {
        int i10 = this.f29d;
        int i11 = i2 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f26a;
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

    public final int b(Object obj) {
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
        int i14 = this.f29d;
        int i15 = i12 >>> 7;
        while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.f26a;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j2 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j10 = (i13 * 72340172838076673L) ^ j2;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i16) & i14;
                if (nc.k.a(this.f27b[numberOfTrailingZeros], obj)) {
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

    public final void c(int i2) {
        int i10;
        long[] jArr;
        if (i2 > 0) {
            i10 = Math.max(7, u0.c(i2));
        } else {
            i10 = 0;
        }
        this.f29d = i10;
        if (i10 == 0) {
            jArr = u0.f103a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i11];
            Arrays.fill(jArr2, 0, i11, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f26a = jArr;
        int i12 = i10 >> 3;
        long j2 = 255 << ((i10 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j2)) | j2;
        this.f31f = u0.a(this.f29d) - this.f30e;
        this.f27b = new Object[i10];
        this.f28c = new float[i10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
        r2 = a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
        if (r37.f31f != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
        if (((r37.f26a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
        r25 = 255;
        r29 = r11;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
        r2 = r37.f29d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
        if (r2 <= 8) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
        if (java.lang.Long.compare((r37.f30e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cd, code lost:
        r2 = r37.f26a;
        r3 = r37.f29d;
        r4 = r37.f27b;
        r6 = r37.f28c;
        r7 = (r3 + 7) >> 3;
        r25 = 255;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dc, code lost:
        if (r8 >= r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00de, code lost:
        r10 = r2[r8] & r13;
        r2[r8] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
        r8 = r8 + 1;
        r11 = r11;
        r13 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fa, code lost:
        r29 = r11;
        r9 = 7;
        r7 = zb.k.y(r2);
        r8 = r7 - 1;
        r12 = 72057594037927935L;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0116, code lost:
        if (r7 == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0118, code lost:
        r8 = r7 >> 3;
        r14 = (r7 & 7) << 3;
        r10 = (r2[r8] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
        if (r10 != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0127, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012c, code lost:
        if (r10 == 254) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012f, code lost:
        r10 = r4[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0131, code lost:
        if (r10 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0133, code lost:
        r10 = r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0138, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0139, code lost:
        r10 = r10 * r20;
        r11 = (r10 ^ (r10 << 16)) >>> 7;
        r27 = a(r11);
        r11 = r11 & r3;
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0152, code lost:
        if ((((r27 - r11) & r3) / 8) != (((r7 - r11) & r3) / 8)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0154, code lost:
        r32 = r12;
        r2[r8] = ((r10 & 127) << r14) | (r2[r8] & (~(255 << r14)));
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r9 = r31;
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0176, code lost:
        r32 = r12;
        r9 = r27 >> 3;
        r11 = r2[r9];
        r13 = (r27 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0186, code lost:
        if (((r11 >> r13) & 255) != 128) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0188, code lost:
        r28 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | ((r10 & 127) << r13);
        r2[r8] = (r2[r8] & (~(255 << r14))) | (128 << r14);
        r34[r27] = r34[r7];
        r34[r7] = null;
        r6[r27] = r6[r7];
        r6[r7] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b4, code lost:
        r28 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | ((r10 & 127) << r13);
        r3 = r34[r27];
        r34[r27] = r34[r7];
        r34[r7] = r3;
        r3 = r6[r27];
        r6[r27] = r6[r7];
        r6[r7] = r3;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d8, code lost:
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r3 = r28;
        r9 = r31;
        r12 = r32;
        r4 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ef, code lost:
        r37.f31f = a1.u0.a(r37.f29d) - r37.f30e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01fe, code lost:
        r25 = 255;
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0205, code lost:
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0208, code lost:
        r2 = a1.u0.b(r37.f29d);
        r3 = r37.f26a;
        r4 = r37.f27b;
        r6 = r37.f28c;
        r7 = r37.f29d;
        c(r2);
        r2 = r37.f26a;
        r8 = r37.f27b;
        r9 = r37.f28c;
        r10 = r37.f29d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0222, code lost:
        if (r11 >= r7) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0231, code lost:
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r18) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0233, code lost:
        r12 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0235, code lost:
        if (r12 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0237, code lost:
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x023c, code lost:
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x023d, code lost:
        r13 = r13 * r20;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r17 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r21 = (r14 & 7) << 3;
        r1 = (r17[r13] & (~(255 << r21))) | (r1 << r21);
        r17[r13] = r1;
        r17[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0274, code lost:
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0276, code lost:
        r11 = r11 + 1;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027d, code lost:
        r2 = a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0281, code lost:
        r37.f30e++;
        r1 = r37.f31f;
        r3 = r37.f26a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0299, code lost:
        if (((r5 >> r7) & r25) != r18) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x029b, code lost:
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x029d, code lost:
        r37.f31f = r1 - r15;
        r1 = r37.f29d;
        r5 = (r5 & (~(r25 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r38, float r39) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.c0.d(java.lang.String, float):void");
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (c0Var.f30e != this.f30e) {
            return false;
        }
        Object[] objArr = this.f27b;
        float[] fArr = this.f28c;
        long[] jArr = this.f26a;
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
                        float f8 = fArr[i12];
                        int b10 = c0Var.b(obj2);
                        if (b10 < 0) {
                            break loop0;
                        }
                        z11 = z12;
                        if (f8 != c0Var.f28c[b10]) {
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

    public final int hashCode() {
        int i2;
        Object[] objArr = this.f27b;
        float[] fArr = this.f28c;
        long[] jArr = this.f26a;
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
                        float f8 = fArr[i14];
                        if (obj != null) {
                            i2 = obj.hashCode();
                        } else {
                            i2 = 0;
                        }
                        i11 += Float.hashCode(f8) ^ i2;
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
        if (this.f30e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f27b;
        float[] fArr = this.f28c;
        long[] jArr = this.f26a;
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
                            float f8 = fArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(f8);
                            i10++;
                            if (i10 < this.f30e) {
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
}
