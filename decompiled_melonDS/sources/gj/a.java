package gj;

import fj.b0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f5681a;

    /* renamed from: b  reason: collision with root package name */
    public static final long[] f5682b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(vc.a.f13781a);
        bytes.getClass();
        f5681a = bytes;
        f5682b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(fj.e eVar, fj.h hVar, long j2, long j10, int i2) {
        b0 b0Var;
        byte[] bArr;
        long j11 = j2;
        long j12 = j10;
        hVar.getClass();
        long j13 = i2;
        d0.d.K(hVar.d(), 0, j13);
        if (i2 > 0) {
            long j14 = 0;
            if (j11 >= 0) {
                if (j11 <= j12) {
                    long j15 = eVar.B;
                    if (j12 > j15) {
                        j12 = j15;
                    }
                    if (j11 != j12 && (b0Var = eVar.A) != null) {
                        if (j15 - j11 < j11) {
                            while (j15 > j11) {
                                b0Var = b0Var.f4982g;
                                b0Var.getClass();
                                j15 -= b0Var.f4978c - b0Var.f4977b;
                            }
                            byte[] h2 = hVar.h();
                            byte b10 = h2[0];
                            byte[] bArr2 = h2;
                            long min = Math.min(j12, (eVar.B - j13) + 1);
                            while (j15 < min) {
                                byte[] bArr3 = b0Var.f4976a;
                                int min2 = (int) Math.min(b0Var.f4978c, (b0Var.f4977b + min) - j15);
                                int i10 = (int) ((b0Var.f4977b + j11) - j15);
                                while (i10 < min2) {
                                    if (bArr3[i10] == b10) {
                                        bArr = bArr2;
                                        if (b(b0Var, i10 + 1, bArr, 1, i2)) {
                                            return (i10 - b0Var.f4977b) + j15;
                                        }
                                    } else {
                                        bArr = bArr2;
                                    }
                                    i10++;
                                    bArr2 = bArr;
                                }
                                j15 += b0Var.f4978c - b0Var.f4977b;
                                b0Var = b0Var.f4981f;
                                b0Var.getClass();
                                j11 = j15;
                            }
                            return -1L;
                        }
                        while (true) {
                            long j16 = (b0Var.f4978c - b0Var.f4977b) + j14;
                            if (j16 > j11) {
                                break;
                            }
                            b0Var = b0Var.f4981f;
                            b0Var.getClass();
                            j14 = j16;
                        }
                        byte[] h10 = hVar.h();
                        byte b11 = h10[0];
                        long min3 = Math.min(j12, (eVar.B - j13) + 1);
                        long j17 = j14;
                        while (j17 < min3) {
                            byte[] bArr4 = b0Var.f4976a;
                            int min4 = (int) Math.min(b0Var.f4978c, (b0Var.f4977b + min3) - j17);
                            for (int i11 = (int) ((b0Var.f4977b + j11) - j17); i11 < min4; i11++) {
                                if (bArr4[i11] == b11 && b(b0Var, i11 + 1, h10, 1, i2)) {
                                    return (i11 - b0Var.f4977b) + j17;
                                }
                            }
                            j17 += b0Var.f4978c - b0Var.f4977b;
                            b0Var = b0Var.f4981f;
                            b0Var.getClass();
                            j11 = j17;
                        }
                        return -1L;
                    }
                    return -1L;
                }
                throw new IllegalArgumentException(("fromIndex > toIndex: " + j11 + " > " + j12).toString());
            }
            a0.j.e(kc.a.e(j11, "fromIndex < 0: "));
            return 0L;
        }
        a0.j.h("byteCount == 0");
        return 0L;
    }

    public static final boolean b(b0 b0Var, int i2, byte[] bArr, int i10, int i11) {
        int i12 = b0Var.f4978c;
        byte[] bArr2 = b0Var.f4976a;
        while (i10 < i11) {
            if (i2 == i12) {
                b0Var = b0Var.f4981f;
                b0Var.getClass();
                byte[] bArr3 = b0Var.f4976a;
                bArr2 = bArr3;
                i2 = b0Var.f4977b;
                i12 = b0Var.f4978c;
            }
            if (bArr2[i2] != bArr[i10]) {
                return false;
            }
            i2++;
            i10++;
        }
        return true;
    }

    public static final String c(fj.e eVar, long j2) {
        if (j2 > 0) {
            long j10 = j2 - 1;
            if (eVar.B(j10) == 13) {
                String X = eVar.X(j10, vc.a.f13781a);
                eVar.skip(2L);
                return X;
            }
        }
        String X2 = eVar.X(j2, vc.a.f13781a);
        eVar.skip(1L);
        return X2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        if (r18 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(fj.e r16, fj.v r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.a.d(fj.e, fj.v, boolean):int");
    }
}
