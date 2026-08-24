package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vj7  reason: default package */
/* loaded from: classes.dex */
public final class vj7 extends nj2 {
    public final /* synthetic */ int i;

    public /* synthetic */ vj7(int i) {
        this.i = i;
    }

    public static int H(long j, byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return xj7.d(i, gh7.f(bArr, j), gh7.f(bArr, j + 1));
                }
                throw new AssertionError();
            }
            return xj7.c(i, gh7.f(bArr, j));
        }
        nj2 nj2Var = xj7.a;
        if (i > -12) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.nj2
    public final int A(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        int i4 = i;
        switch (this.i) {
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
                                if (gh7.f(bArr, j3) >= 0) {
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
                                byte f = gh7.f(bArr, j5);
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
                                if (gh7.f(bArr, j5) > -65) {
                                    break;
                                } else {
                                    j5 = j7;
                                }
                            }
                        } else if (b < -16) {
                            if (i7 < 2) {
                                return H(j5, bArr, b, i7);
                            }
                            i6 -= 3;
                            long j8 = j5 + j;
                            byte f2 = gh7.f(bArr, j5);
                            if (f2 <= -65 && ((b != -32 || f2 >= -96) && (b != -19 || f2 < -96))) {
                                j5 += 2;
                                if (gh7.f(bArr, j8) > -65) {
                                    break;
                                }
                            }
                        } else if (i7 < 3) {
                            return H(j5, bArr, b, i7);
                        } else {
                            i6 -= 4;
                            long j9 = j5 + j;
                            byte f3 = gh7.f(bArr, j5);
                            if (f3 > -65) {
                                break;
                            } else {
                                if ((((f3 + 112) + (b << 28)) >> 30) != 0) {
                                    break;
                                } else {
                                    long j10 = j5 + 2;
                                    if (gh7.f(bArr, j9) > -65) {
                                        break;
                                    } else {
                                        j5 += 3;
                                        if (gh7.f(bArr, j10) > -65) {
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
                            return xj7.a(bArr, i8, i2);
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
                        return xj7.a(bArr, i8, i2);
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
    @Override // defpackage.nj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m(byte[] bArr, int i, int i2) {
        switch (this.i) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                    int i3 = i + i2;
                    char[] cArr = new char[i2];
                    int i4 = 0;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b >= 0) {
                            i++;
                            cArr[i4] = (char) b;
                            i4++;
                        } else {
                            int i5 = i4;
                            while (i < i3) {
                                int i6 = i + 1;
                                byte b2 = bArr[i];
                                if (b2 >= 0) {
                                    int i7 = i5 + 1;
                                    cArr[i5] = (char) b2;
                                    while (i6 < i3) {
                                        byte b3 = bArr[i6];
                                        if (b3 >= 0) {
                                            i6++;
                                            cArr[i7] = (char) b3;
                                            i7++;
                                        } else {
                                            i5 = i7;
                                            i = i6;
                                        }
                                    }
                                    i5 = i7;
                                    i = i6;
                                } else if (b2 < -32) {
                                    if (i6 < i3) {
                                        i += 2;
                                        kj2.e(b2, bArr[i6], cArr, i5);
                                        i5++;
                                    } else {
                                        throw ub3.a();
                                    }
                                } else if (b2 < -16) {
                                    if (i6 < i3 - 1) {
                                        int i8 = i + 2;
                                        i += 3;
                                        kj2.f(b2, bArr[i6], bArr[i8], cArr, i5);
                                        i5++;
                                    } else {
                                        throw ub3.a();
                                    }
                                } else if (i6 < i3 - 2) {
                                    byte b4 = bArr[i6];
                                    int i9 = i + 3;
                                    i += 4;
                                    kj2.d(b2, b4, bArr[i + 2], bArr[i9], cArr, i5);
                                    i5 += 2;
                                } else {
                                    throw ub3.a();
                                }
                            }
                            return new String(cArr, 0, i5);
                        }
                    }
                    int i52 = i4;
                    while (i < i3) {
                    }
                    return new String(cArr, 0, i52);
                }
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            default:
                if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                    int i10 = i + i2;
                    char[] cArr2 = new char[i2];
                    int i11 = 0;
                    while (i < i10) {
                        byte f = gh7.f(bArr, i);
                        if (f >= 0) {
                            i++;
                            cArr2[i11] = (char) f;
                            i11++;
                        } else {
                            int i12 = i11;
                            while (i < i10) {
                                int i13 = i + 1;
                                byte f2 = gh7.f(bArr, i);
                                if (f2 >= 0) {
                                    int i14 = i12 + 1;
                                    cArr2[i12] = (char) f2;
                                    while (i13 < i10) {
                                        byte f3 = gh7.f(bArr, i13);
                                        if (f3 >= 0) {
                                            i13++;
                                            cArr2[i14] = (char) f3;
                                            i14++;
                                        } else {
                                            i12 = i14;
                                            i = i13;
                                        }
                                    }
                                    i12 = i14;
                                    i = i13;
                                } else if (f2 < -32) {
                                    if (i13 < i10) {
                                        i += 2;
                                        kj2.e(f2, gh7.f(bArr, i13), cArr2, i12);
                                        i12++;
                                    } else {
                                        throw ub3.a();
                                    }
                                } else if (f2 < -16) {
                                    if (i13 < i10 - 1) {
                                        int i15 = i + 2;
                                        i += 3;
                                        kj2.f(f2, gh7.f(bArr, i13), gh7.f(bArr, i15), cArr2, i12);
                                        i12++;
                                    } else {
                                        throw ub3.a();
                                    }
                                } else if (i13 < i10 - 2) {
                                    int i16 = i + 3;
                                    i += 4;
                                    kj2.d(f2, gh7.f(bArr, i13), gh7.f(bArr, i + 2), gh7.f(bArr, i16), cArr2, i12);
                                    i12 += 2;
                                } else {
                                    throw ub3.a();
                                }
                            }
                            return new String(cArr2, 0, i12);
                        }
                    }
                    int i122 = i11;
                    while (i < i10) {
                    }
                    return new String(cArr2, 0, i122);
                }
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0184  */
    @Override // defpackage.nj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(String str, byte[] bArr, int i, int i2) {
        int i3;
        char charAt;
        int i4;
        char charAt2;
        char c = 2048;
        char c2 = 55296;
        switch (this.i) {
            case 0:
                int length = str.length();
                int i5 = i2 + i;
                int i6 = 0;
                while (i6 < length) {
                    int i7 = i6 + i;
                    if (i7 < i5 && (charAt = str.charAt(i6)) < 128) {
                        bArr[i7] = (byte) charAt;
                        i6++;
                    }
                    if (i6 != length) {
                        return i + length;
                    }
                    int i8 = i + i6;
                    while (i6 < length) {
                        char charAt3 = str.charAt(i6);
                        if (charAt3 < 128 && i8 < i5) {
                            bArr[i8] = (byte) charAt3;
                            i8++;
                        } else if (charAt3 < 2048 && i8 <= i5 - 2) {
                            int i9 = i8 + 1;
                            bArr[i8] = (byte) ((charAt3 >>> 6) | 960);
                            i8 += 2;
                            bArr[i9] = (byte) ((charAt3 & '?') | 128);
                        } else if ((charAt3 < 55296 || 57343 < charAt3) && i8 <= i5 - 3) {
                            bArr[i8] = (byte) ((charAt3 >>> '\f') | 480);
                            int i10 = i8 + 2;
                            bArr[i8 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                            i8 += 3;
                            bArr[i10] = (byte) ((charAt3 & '?') | 128);
                        } else if (i8 <= i5 - 4) {
                            int i11 = i6 + 1;
                            if (i11 != str.length()) {
                                char charAt4 = str.charAt(i11);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i12 = i8 + 3;
                                    bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 += 4;
                                    bArr[i12] = (byte) ((codePoint & 63) | 128);
                                    i6 = i11;
                                } else {
                                    i6 = i11;
                                }
                            }
                            throw new wj7(i6 - 1, length);
                        } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i3)))) {
                            throw new wj7(i6, length);
                        } else {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i8);
                        }
                        i6++;
                    }
                    return i8;
                }
                if (i6 != length) {
                }
                break;
            default:
                long j = i;
                long j2 = i2 + j;
                int length2 = str.length();
                if (length2 <= i2 && bArr.length - i2 >= i) {
                    int i13 = 0;
                    while (i13 < length2 && (charAt2 = str.charAt(i13)) < 128) {
                        gh7.j(bArr, j, (byte) charAt2);
                        i13++;
                        j++;
                    }
                    if (i13 != length2) {
                        while (i13 < length2) {
                            char charAt5 = str.charAt(i13);
                            if (charAt5 < 128 && j < j2) {
                                gh7.j(bArr, j, (byte) charAt5);
                                j++;
                            } else if (charAt5 < c && j <= j2 - 2) {
                                long j3 = j + 1;
                                gh7.j(bArr, j, (byte) ((charAt5 >>> 6) | 960));
                                j += 2;
                                gh7.j(bArr, j3, (byte) ((charAt5 & '?') | 128));
                                i13 = i13;
                            } else {
                                int i14 = i13;
                                if ((charAt5 < c2 || 57343 < charAt5) && j <= j2 - 3) {
                                    gh7.j(bArr, j, (byte) ((charAt5 >>> '\f') | 480));
                                    long j4 = j + 2;
                                    gh7.j(bArr, j + 1, (byte) (((charAt5 >>> 6) & 63) | 128));
                                    j += 3;
                                    gh7.j(bArr, j4, (byte) ((charAt5 & '?') | 128));
                                    i13 = i14;
                                } else if (j <= j2 - 4) {
                                    i13 = i14 + 1;
                                    if (i13 != length2) {
                                        char charAt6 = str.charAt(i13);
                                        if (Character.isSurrogatePair(charAt5, charAt6)) {
                                            int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                            gh7.j(bArr, j, (byte) ((codePoint2 >>> 18) | 240));
                                            gh7.j(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                            long j5 = j + 3;
                                            gh7.j(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                            j += 4;
                                            gh7.j(bArr, j5, (byte) ((codePoint2 & 63) | 128));
                                        }
                                    } else {
                                        i13 = i14;
                                    }
                                    throw new wj7(i13 - 1, length2);
                                } else if (55296 <= charAt5 && charAt5 <= 57343 && ((i4 = i14 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i4)))) {
                                    throw new wj7(i14, length2);
                                } else {
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j);
                                }
                            }
                            i13++;
                            c = 2048;
                            c2 = 55296;
                        }
                    }
                    return (int) j;
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
        }
    }
}
