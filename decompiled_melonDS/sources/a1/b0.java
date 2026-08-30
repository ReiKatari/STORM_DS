package a1;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public long[] f21a = u0.f103a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f22b = p.f87a;

    /* renamed from: c  reason: collision with root package name */
    public int f23c;

    /* renamed from: d  reason: collision with root package name */
    public int f24d;

    /* renamed from: e  reason: collision with root package name */
    public int f25e;

    public b0(int i2) {
        if (i2 >= 0) {
            c(u0.d(i2));
        } else {
            a0.j.h("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f23c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f21a
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
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f22b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            return r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.b0.a(long):boolean");
    }

    public final int b(int i2) {
        int i10 = this.f23c;
        int i11 = i2 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f21a;
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

    public final void c(int i2) {
        int i10;
        long[] jArr;
        if (i2 > 0) {
            i10 = Math.max(7, u0.c(i2));
        } else {
            i10 = 0;
        }
        this.f23c = i10;
        if (i10 == 0) {
            jArr = u0.f103a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i11];
            Arrays.fill(jArr2, 0, i11, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f21a = jArr;
        int i12 = i10 >> 3;
        long j2 = 255 << ((i10 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j2)) | j2;
        this.f25e = u0.a(this.f23c) - this.f24d;
        this.f22b = new long[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (b0Var.f24d != this.f24d) {
            return false;
        }
        long[] jArr = this.f22b;
        long[] jArr2 = this.f21a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128 && !b0Var.a(jArr[(i2 << 3) + i11])) {
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

    public final int hashCode() {
        long[] jArr = this.f22b;
        long[] jArr2 = this.f21a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i10 = 0;
        while (true) {
            long j2 = jArr2[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i2 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j2) < 128) {
                        i10 = Long.hashCode(jArr[(i2 << 3) + i12]) + i10;
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
        long[] jArr = this.f22b;
        long[] jArr2 = this.f21a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j2) < 128) {
                            long j10 = jArr[(i2 << 3) + i12];
                            if (i10 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append(j10);
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
}
