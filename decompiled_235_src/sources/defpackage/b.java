package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b  reason: default package */
/* loaded from: classes.dex */
public abstract class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(qm0.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(k80 k80Var, da0 da0Var, long j, long j2, int i) {
        o96 o96Var;
        long j3 = j;
        long j4 = j2;
        da0Var.getClass();
        long j5 = i;
        hf.D(da0Var.d(), 0L, j5);
        if (i > 0) {
            if (j3 >= 0) {
                if (j3 <= j4) {
                    long j6 = k80Var.B;
                    if (j4 > j6) {
                        j4 = j6;
                    }
                    if (j3 != j4 && (o96Var = k80Var.A) != null) {
                        long j7 = 0;
                        if (j6 - j3 < j3) {
                            while (j6 > j3) {
                                o96Var = o96Var.g;
                                o96Var.getClass();
                                j6 -= o96Var.c - o96Var.b;
                            }
                            byte[] h = da0Var.h();
                            byte b2 = h[0];
                            long min = Math.min(j4, (k80Var.B - j5) + 1);
                            while (j6 < min) {
                                byte[] bArr = o96Var.a;
                                int min2 = (int) Math.min(o96Var.c, (o96Var.b + min) - j6);
                                for (int i2 = (int) ((o96Var.b + j3) - j6); i2 < min2; i2++) {
                                    if (bArr[i2] == b2 && b(o96Var, i2 + 1, h, 1, i)) {
                                        return (i2 - o96Var.b) + j6;
                                    }
                                }
                                j6 += o96Var.c - o96Var.b;
                                o96Var = o96Var.f;
                                o96Var.getClass();
                                j3 = j6;
                            }
                            return -1L;
                        }
                        while (true) {
                            long j8 = j7 + (o96Var.c - o96Var.b);
                            if (j8 > j3) {
                                break;
                            }
                            o96Var = o96Var.f;
                            o96Var.getClass();
                            j7 = j8;
                        }
                        byte[] h2 = da0Var.h();
                        byte b3 = h2[0];
                        long min3 = Math.min(j4, (k80Var.B - j5) + 1);
                        while (j7 < min3) {
                            byte[] bArr2 = o96Var.a;
                            int min4 = (int) Math.min(o96Var.c, (o96Var.b + min3) - j7);
                            for (int i3 = (int) ((o96Var.b + j3) - j7); i3 < min4; i3++) {
                                if (bArr2[i3] == b3 && b(o96Var, i3 + 1, h2, 1, i)) {
                                    return (i3 - o96Var.b) + j7;
                                }
                            }
                            j7 += o96Var.c - o96Var.b;
                            o96Var = o96Var.f;
                            o96Var.getClass();
                            j3 = j7;
                        }
                        return -1L;
                    }
                    return -1L;
                }
                StringBuilder s = xg6.s(j3, "fromIndex > toIndex: ", " > ");
                s.append(j4);
                throw new IllegalArgumentException(s.toString().toString());
            }
            i.f(lb1.h(j3, "fromIndex < 0: "));
            return 0L;
        }
        i.h("byteCount == 0");
        return 0L;
    }

    public static final boolean b(o96 o96Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = o96Var.c;
        byte[] bArr2 = o96Var.a;
        while (i2 < i3) {
            if (i == i4) {
                o96Var = o96Var.f;
                o96Var.getClass();
                byte[] bArr3 = o96Var.a;
                bArr2 = bArr3;
                i = o96Var.b;
                i4 = o96Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(k80 k80Var, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (k80Var.v(j2) == 13) {
                String a0 = k80Var.a0(j2, qm0.a);
                k80Var.skip(2L);
                return a0;
            }
        }
        String a02 = k80Var.a0(j, qm0.a);
        k80Var.skip(1L);
        return a02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        if (r18 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int d(k80 k80Var, eo4 eo4Var, boolean z) {
        int i;
        int i2;
        int i3;
        boolean z2;
        o96 o96Var;
        int i4;
        eo4Var.getClass();
        o96 o96Var2 = k80Var.A;
        if (o96Var2 == null) {
            if (!z) {
                return -1;
            }
            return -2;
        }
        byte[] bArr = o96Var2.a;
        int i5 = o96Var2.b;
        int i6 = o96Var2.c;
        int[] iArr = eo4Var.B;
        o96 o96Var3 = o96Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (o96Var3 == null) {
                break;
            } else if (i10 < 0) {
                int i13 = (i10 * (-1)) + i11;
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr[i5] & 255) != iArr[i11]) {
                        break loop0;
                    }
                    if (i15 == i13) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i14 == i6) {
                        o96Var3.getClass();
                        o96 o96Var4 = o96Var3.f;
                        o96Var4.getClass();
                        i3 = o96Var4.b;
                        byte[] bArr2 = o96Var4.a;
                        i4 = o96Var4.c;
                        if (o96Var4 == o96Var2) {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr2;
                            o96Var = null;
                        } else {
                            o96Var = o96Var4;
                            bArr = bArr2;
                        }
                    } else {
                        o96Var = o96Var3;
                        i4 = i6;
                        i3 = i14;
                    }
                    if (z2) {
                        i = iArr[i15];
                        int i16 = i4;
                        o96Var3 = o96Var;
                        i2 = i16;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    o96Var3 = o96Var;
                    i11 = i15;
                }
            } else {
                int i17 = i5 + 1;
                int i18 = bArr[i5] & 255;
                int i19 = i11 + i10;
                while (i11 != i19) {
                    if (i18 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i17 == i6) {
                            o96Var3 = o96Var3.f;
                            o96Var3.getClass();
                            int i20 = o96Var3.b;
                            byte[] bArr3 = o96Var3.a;
                            i2 = o96Var3.c;
                            if (o96Var3 == o96Var2) {
                                i3 = i20;
                                bArr = bArr3;
                                o96Var3 = null;
                            } else {
                                i3 = i20;
                                bArr = bArr3;
                            }
                        } else {
                            i2 = i6;
                            i3 = i17;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i21 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i21;
                    } else {
                        i11++;
                    }
                }
                break loop0;
            }
        }
        return i7;
    }
}
