package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b  reason: default package */
/* loaded from: classes.dex */
public abstract class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(hk0.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(f60 f60Var, w70 w70Var, long j, long j2, int i) {
        cy5 cy5Var;
        long j3 = j;
        long j4 = j2;
        w70Var.getClass();
        long j5 = i;
        a53.q(w70Var.d(), 0L, j5);
        if (i > 0) {
            if (j3 >= 0) {
                if (j3 <= j4) {
                    long j6 = f60Var.B;
                    if (j4 > j6) {
                        j4 = j6;
                    }
                    if (j3 != j4 && (cy5Var = f60Var.A) != null) {
                        long j7 = 0;
                        if (j6 - j3 < j3) {
                            while (j6 > j3) {
                                cy5Var = cy5Var.g;
                                cy5Var.getClass();
                                j6 -= cy5Var.c - cy5Var.b;
                            }
                            byte[] h = w70Var.h();
                            byte b2 = h[0];
                            long min = Math.min(j4, (f60Var.B - j5) + 1);
                            while (j6 < min) {
                                byte[] bArr = cy5Var.a;
                                int min2 = (int) Math.min(cy5Var.c, (cy5Var.b + min) - j6);
                                for (int i2 = (int) ((cy5Var.b + j3) - j6); i2 < min2; i2++) {
                                    if (bArr[i2] == b2 && b(cy5Var, i2 + 1, h, 1, i)) {
                                        return (i2 - cy5Var.b) + j6;
                                    }
                                }
                                j6 += cy5Var.c - cy5Var.b;
                                cy5Var = cy5Var.f;
                                cy5Var.getClass();
                                j3 = j6;
                            }
                            return -1L;
                        }
                        while (true) {
                            long j8 = j7 + (cy5Var.c - cy5Var.b);
                            if (j8 > j3) {
                                break;
                            }
                            cy5Var = cy5Var.f;
                            cy5Var.getClass();
                            j7 = j8;
                        }
                        byte[] h2 = w70Var.h();
                        byte b3 = h2[0];
                        long min3 = Math.min(j4, (f60Var.B - j5) + 1);
                        while (j7 < min3) {
                            byte[] bArr2 = cy5Var.a;
                            int min4 = (int) Math.min(cy5Var.c, (cy5Var.b + min3) - j7);
                            for (int i3 = (int) ((cy5Var.b + j3) - j7); i3 < min4; i3++) {
                                if (bArr2[i3] == b3 && b(cy5Var, i3 + 1, h2, 1, i)) {
                                    return (i3 - cy5Var.b) + j7;
                                }
                            }
                            j7 += cy5Var.c - cy5Var.b;
                            cy5Var = cy5Var.f;
                            cy5Var.getClass();
                            j3 = j7;
                        }
                        return -1L;
                    }
                    return -1L;
                }
                StringBuilder q = wh1.q(j3, "fromIndex > toIndex: ", " > ");
                q.append(j4);
                throw new IllegalArgumentException(q.toString().toString());
            }
            i.g(wh1.h(j3, "fromIndex < 0: "));
            return 0L;
        }
        i.i("byteCount == 0");
        return 0L;
    }

    public static final boolean b(cy5 cy5Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = cy5Var.c;
        byte[] bArr2 = cy5Var.a;
        while (i2 < i3) {
            if (i == i4) {
                cy5Var = cy5Var.f;
                cy5Var.getClass();
                byte[] bArr3 = cy5Var.a;
                bArr2 = bArr3;
                i = cy5Var.b;
                i4 = cy5Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(f60 f60Var, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (f60Var.D(j2) == 13) {
                String T = f60Var.T(j2, hk0.a);
                f60Var.skip(2L);
                return T;
            }
        }
        String T2 = f60Var.T(j, hk0.a);
        f60Var.skip(1L);
        return T2;
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
    public static final int d(defpackage.f60 r16, defpackage.cf4 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.d(f60, cf4, boolean):int");
    }
}
