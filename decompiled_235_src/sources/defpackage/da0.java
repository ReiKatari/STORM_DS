package defpackage;

import com.github.junrar.unpack.vm.VMCmdFlags;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: da0 */
/* loaded from: classes.dex */
public class da0 implements Serializable, Comparable {
    public static final da0 R = new da0(new byte[0]);
    public final byte[] A;
    public transient int B;
    public transient String L;

    public da0(byte[] bArr) {
        bArr.getClass();
        this.A = bArr;
    }

    public static int g(da0 da0Var, da0 da0Var2) {
        da0Var.getClass();
        da0Var2.getClass();
        return da0Var.f(da0Var2.h(), 0);
    }

    public static int k(da0 da0Var, da0 da0Var2) {
        da0Var.getClass();
        da0Var2.getClass();
        return da0Var.j(da0Var2.h());
    }

    public static /* synthetic */ da0 p(da0 da0Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return da0Var.o(i, i2);
    }

    public String a() {
        byte[] bArr = a.a;
        byte[] bArr2 = this.A;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i5 = i + 1;
                byte b4 = bArr2[i];
                byte b5 = bArr2[i5];
                bArr3[i2] = bArr[(b4 & 255) >> 2];
                bArr3[i2 + 1] = bArr[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
                bArr3[i2 + 2] = bArr[(b5 & 15) << 2];
                bArr3[i2 + 3] = 61;
            }
        } else {
            byte b6 = bArr2[i];
            bArr3[i2] = bArr[(b6 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b6 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, qm0.a);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(da0 da0Var) {
        da0Var.getClass();
        int d = d();
        int d2 = da0Var.d();
        int min = Math.min(d, d2);
        for (int i = 0; i < min; i++) {
            int i2 = i(i) & 255;
            int i3 = da0Var.i(i) & 255;
            if (i2 != i3) {
                if (i2 < i3) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (d == d2) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        return 1;
    }

    public da0 c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.A, 0, d());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new da0(digest);
    }

    public int d() {
        return this.A.length;
    }

    public String e() {
        byte[] bArr = this.A;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = l.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof da0) {
                da0 da0Var = (da0) obj;
                int d = da0Var.d();
                byte[] bArr = this.A;
                if (d == bArr.length && da0Var.m(0, bArr, 0, bArr.length)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int f(byte[] bArr, int i) {
        bArr.getClass();
        byte[] bArr2 = this.A;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!hf.x(max, 0, bArr.length, bArr2, bArr)) {
                if (max != length) {
                    max++;
                } else {
                    return -1;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] h() {
        return this.A;
    }

    public int hashCode() {
        int i = this.B;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.A);
        this.B = hashCode;
        return hashCode;
    }

    public byte i(int i) {
        return this.A[i];
    }

    public int j(byte[] bArr) {
        bArr.getClass();
        int d = d();
        byte[] bArr2 = this.A;
        for (int min = Math.min(d, bArr2.length - bArr.length); -1 < min; min--) {
            if (hf.x(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i, da0 da0Var, int i2) {
        da0Var.getClass();
        return da0Var.m(0, this.A, i, i2);
    }

    public boolean m(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0) {
            byte[] bArr2 = this.A;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && hf.x(i, i2, i3, bArr2, bArr)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String n(Charset charset) {
        charset.getClass();
        return new String(this.A, charset);
    }

    public da0 o(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = d();
        }
        if (i >= 0) {
            byte[] bArr = this.A;
            if (i2 <= bArr.length) {
                if (i2 - i >= 0) {
                    if (i == 0 && i2 == bArr.length) {
                        return this;
                    }
                    return new da0(fv.x0(bArr, i, i2));
                }
                i.h("endIndex < beginIndex");
                return null;
            }
            i.f(xg6.q(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        i.h("beginIndex < 0");
        return null;
    }

    public da0 q() {
        int i = 0;
        while (true) {
            byte[] bArr = this.A;
            if (i < bArr.length) {
                byte b = bArr[i];
                if (b >= 65 && b <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    copyOf[i] = (byte) (b + VMCmdFlags.VMCF_USEFLAGS);
                    for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                        byte b2 = copyOf[i2];
                        if (b2 >= 65 && b2 <= 90) {
                            copyOf[i2] = (byte) (b2 + VMCmdFlags.VMCF_USEFLAGS);
                        }
                    }
                    return new da0(copyOf);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public byte[] r() {
        byte[] bArr = this.A;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final String s() {
        String str = this.L;
        if (str == null) {
            byte[] h = h();
            h.getClass();
            String str2 = new String(h, qm0.a);
            this.L = str2;
            return str2;
        }
        return str;
    }

    public void t(k80 k80Var, int i) {
        k80Var.l0(this.A, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:300:0x0085, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0096, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00c4, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x00d6, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x00f6, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x00fe, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0130, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0134, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0140, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x016c, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0173, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x017a, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01aa, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x01ad, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x01b0, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x01b3, code lost:
        if (r6 == 64) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        int i;
        byte b;
        int i2;
        int i3;
        da0 da0Var = this;
        byte[] bArr = da0Var.A;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            if (i4 >= length) {
                break;
            }
            byte b2 = bArr[i4];
            int i7 = 2;
            if (b2 >= 0) {
                int i8 = i6 + 1;
                if (i6 == 64) {
                    break;
                } else if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                } else {
                    if (b2 < 65536) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    i5 += i;
                    i4++;
                    while (true) {
                        i6 = i8;
                        if (i4 < length && (b = bArr[i4]) >= 0) {
                            i4++;
                            i8 = i6 + 1;
                            if (i6 == 64) {
                                break loop0;
                            } else if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                                break loop0;
                            } else {
                                if (b < 65536) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                i5 += i2;
                            }
                        }
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i9 = i4 + 1;
                if (length > i9) {
                    byte b3 = bArr[i9];
                    if ((b3 & 192) == 128) {
                        int i10 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i10 >= 128) {
                            i3 = i6 + 1;
                            if (i6 == 64) {
                                break;
                            } else if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                break;
                            } else {
                                if (i10 < 65536) {
                                    i7 = 1;
                                }
                                i5 += i7;
                                i4 += 2;
                                i6 = i3;
                            }
                        }
                    }
                }
            } else if ((b2 >> 4) == -2) {
                int i11 = i4 + 2;
                if (length > i11) {
                    byte b4 = bArr[i4 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i11];
                        if ((b5 & 192) == 128) {
                            int i12 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i12 >= 2048) {
                                if (55296 > i12 || i12 >= 57344) {
                                    i3 = i6 + 1;
                                    if (i6 == 64) {
                                        break;
                                    } else if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                        break;
                                    } else {
                                        if (i12 < 65536) {
                                            i7 = 1;
                                        }
                                        i5 += i7;
                                        i4 += 3;
                                        i6 = i3;
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((b2 >> 3) == -2) {
                int i13 = i4 + 3;
                if (length > i13) {
                    byte b6 = bArr[i4 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i4 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i13];
                            if ((b8 & 192) == 128) {
                                int i14 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i14 <= 1114111) {
                                    if (55296 > i14 || i14 >= 57344) {
                                        if (i14 >= 65536) {
                                            i3 = i6 + 1;
                                            if (i6 == 64) {
                                                break;
                                            } else if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                                break;
                                            } else {
                                                if (i14 < 65536) {
                                                    i7 = 1;
                                                }
                                                i5 += i7;
                                                i4 += 4;
                                                i6 = i3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i5 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + da0Var.e() + ']';
            }
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(bArr.length);
            sb.append(" hex=");
            if (64 <= bArr.length) {
                if (64 != bArr.length) {
                    da0Var = new da0(fv.x0(bArr, 0, 64));
                }
                sb.append(da0Var.e());
                sb.append("…]");
                return sb.toString();
            }
            i.f(xg6.q(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        String s = da0Var.s();
        String e0 = xs6.e0(xs6.e0(xs6.e0(s.substring(0, i5), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i5 < s.length()) {
            return "[size=" + bArr.length + " text=" + e0 + "…]";
        }
        return i61.k(']', "[text=", e0);
    }
}
