package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x94  reason: default package */
/* loaded from: classes.dex */
public final class x94 {
    public long[] a = b66.a;
    public Object[] b = g04.i;
    public float[] c = ce2.a;
    public int d;
    public int e;
    public int f;

    public x94(int i) {
        if (i >= 0) {
            c(b66.d(i));
        } else {
            i.h("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
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

    public final int b(Object obj) {
        int i;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this.d;
        int i7 = i4 >>> 7;
        while (true) {
            int i8 = i7 & i6;
            long[] jArr = this.a;
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (i5 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i8) & i6;
                if (nb3.k(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i7 = i8 + i2;
        }
    }

    public final void c(int i) {
        int i2;
        long[] jArr;
        if (i > 0) {
            i2 = Math.max(7, b66.c(i));
        } else {
            i2 = 0;
        }
        this.d = i2;
        if (i2 == 0) {
            jArr = b66.a;
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
        this.f = b66.a(this.d) - this.e;
        this.b = new Object[i2];
        this.c = new float[i2];
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
        if (r37.f != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
        if (((r37.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
        r25 = 255;
        r29 = r11;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
        r2 = r37.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
        if (r2 <= 8) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
        if (java.lang.Long.compare((r37.e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cd, code lost:
        r2 = r37.a;
        r3 = r37.d;
        r4 = r37.b;
        r6 = r37.c;
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
        r7 = defpackage.fv.H0(r2);
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
        r37.f = defpackage.b66.a(r37.d) - r37.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01fe, code lost:
        r25 = 255;
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0205, code lost:
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0208, code lost:
        r2 = defpackage.b66.b(r37.d);
        r3 = r37.a;
        r4 = r37.b;
        r6 = r37.c;
        r7 = r37.d;
        c(r2);
        r2 = r37.a;
        r8 = r37.b;
        r9 = r37.c;
        r10 = r37.d;
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
        r37.e++;
        r1 = r37.f;
        r3 = r37.a;
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
        r37.f = r1 - r15;
        r1 = r37.d;
        r5 = (r5 & (~(r25 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(String str, float f) {
        int i;
        int i2;
        int i3;
        String str2 = str;
        if (str2 != null) {
            i = str2.hashCode();
        } else {
            i = 0;
        }
        int i4 = -862048943;
        int i5 = i * (-862048943);
        int i6 = i5 ^ (i5 << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.d;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j2 = i8;
            int i14 = i8;
            int i15 = 0;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = -9187201950435737472L;
            long j5 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j5) >> 3)) & i9;
                int i16 = i4;
                if (nb3.k(this.b[numberOfTrailingZeros], str2)) {
                    i3 = numberOfTrailingZeros;
                    break loop0;
                } else {
                    j5 &= j5 - 1;
                    i4 = i16;
                }
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
            str2 = str;
            i8 = i14;
            i4 = i2;
        }
        if (i3 < 0) {
            i3 = ~i3;
        }
        this.b[i3] = str;
        this.c[i3] = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x94)) {
            return false;
        }
        x94 x94Var = (x94) obj;
        if (x94Var.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        float[] fArr = this.c;
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
                            Object obj2 = objArr[i4];
                            float f = fArr[i4];
                            int b = x94Var.b(obj2);
                            if (b < 0 || f != x94Var.c[b]) {
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

    public final int hashCode() {
        int i;
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = objArr[i6];
                        float f = fArr[i6];
                        if (obj != null) {
                            i = obj.hashCode();
                        } else {
                            i = 0;
                        }
                        i3 += Float.hashCode(f) ^ i;
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return i3;
                }
            }
            if (i2 != length) {
                i2++;
            } else {
                return i3;
            }
        }
    }

    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        float[] fArr = this.c;
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
                            Object obj = objArr[i5];
                            float f = fArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f);
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
}
