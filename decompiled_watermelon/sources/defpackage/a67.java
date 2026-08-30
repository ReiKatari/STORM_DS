package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a67  reason: default package */
/* loaded from: classes.dex */
public final class a67 extends hi2 {
    public final /* synthetic */ int d;

    public /* synthetic */ a67(int i) {
        this.d = i;
    }

    public static int a0(long j, byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return c67.d(i, l37.f(bArr, j), l37.f(bArr, j + 1));
                }
                throw new AssertionError();
            }
            return c67.c(i, l37.f(bArr, j));
        }
        hi2 hi2Var = c67.a;
        if (i > -12) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.hi2
    public final int N(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        int i4 = i;
        switch (this.d) {
            case 0:
                break;
            default:
                if ((i4 | i2 | (bArr.length - i2)) >= 0) {
                    long j2 = i4;
                    int i5 = (int) (i2 - j2);
                    if (i5 < 16) {
                        j = 1;
                        i3 = 0;
                    } else {
                        long j3 = j2;
                        j = 1;
                        i3 = 0;
                        while (true) {
                            if (i3 < i5) {
                                long j4 = j3 + 1;
                                if (l37.f(bArr, j3) >= 0) {
                                    i3++;
                                    j3 = j4;
                                }
                            } else {
                                i3 = i5;
                            }
                        }
                    }
                    int i6 = i5 - i3;
                    long j5 = j2 + i3;
                    while (true) {
                        byte b = 0;
                        while (true) {
                            if (i6 > 0) {
                                long j6 = j5 + j;
                                byte f = l37.f(bArr, j5);
                                if (f >= 0) {
                                    i6--;
                                    b = f;
                                    j5 = j6;
                                } else {
                                    b = f;
                                    j5 = j6;
                                }
                            }
                        }
                        if (i6 == 0) {
                            return 0;
                        }
                        int i7 = i6 - 1;
                        if (b < -32) {
                            if (i7 == 0) {
                                return b;
                            }
                            i6 -= 2;
                            if (b < -62) {
                                break;
                            } else {
                                long j7 = j5 + j;
                                if (l37.f(bArr, j5) > -65) {
                                    break;
                                } else {
                                    j5 = j7;
                                }
                            }
                        } else if (b < -16) {
                            if (i7 < 2) {
                                return a0(j5, bArr, b, i7);
                            }
                            i6 -= 3;
                            long j8 = j5 + j;
                            byte f2 = l37.f(bArr, j5);
                            if (f2 <= -65 && ((b != -32 || f2 >= -96) && (b != -19 || f2 < -96))) {
                                j5 += 2;
                                if (l37.f(bArr, j8) > -65) {
                                    break;
                                }
                            }
                        } else if (i7 < 3) {
                            return a0(j5, bArr, b, i7);
                        } else {
                            i6 -= 4;
                            long j9 = j5 + j;
                            byte f3 = l37.f(bArr, j5);
                            if (f3 > -65) {
                                break;
                            } else {
                                if ((((f3 + 112) + (b << 28)) >> 30) != 0) {
                                    break;
                                } else {
                                    long j10 = j5 + 2;
                                    if (l37.f(bArr, j9) > -65) {
                                        break;
                                    } else {
                                        j5 += 3;
                                        if (l37.f(bArr, j10) > -65) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i2)));
                }
                break;
        }
        while (i4 < i2 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 < i2) {
            while (i4 < i2) {
                int i8 = i4 + 1;
                byte b2 = bArr[i4];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i8 >= i2) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i4 += 2;
                            if (bArr[i8] > -65) {
                            }
                        }
                        return -1;
                    } else if (b2 < -16) {
                        if (i8 >= i2 - 1) {
                            return c67.a(bArr, i8, i2);
                        }
                        int i9 = i4 + 2;
                        byte b3 = bArr[i8];
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            i4 += 3;
                            if (bArr[i9] > -65) {
                            }
                        }
                        return -1;
                    } else if (i8 >= i2 - 2) {
                        return c67.a(bArr, i8, i2);
                    } else {
                        int i10 = i4 + 2;
                        byte b4 = bArr[i8];
                        if (b4 <= -65) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                                int i11 = i4 + 3;
                                if (bArr[i10] <= -65) {
                                    i4 += 4;
                                    if (bArr[i11] > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                }
                i4 = i8;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    @Override // defpackage.hi2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String j(byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a67.j(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    @Override // defpackage.hi2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(int r25, int r26, java.lang.String r27, byte[] r28) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a67.k(int, int, java.lang.String, byte[]):int");
    }
}
