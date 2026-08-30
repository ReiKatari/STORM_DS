package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w70 */
/* loaded from: classes.dex */
public class w70 implements Serializable, Comparable {
    public static final w70 R = new w70(new byte[0]);
    public final byte[] A;
    public transient int B;
    public transient String L;

    public w70(byte[] bArr) {
        bArr.getClass();
        this.A = bArr;
    }

    public static int g(w70 w70Var, w70 w70Var2) {
        w70Var.getClass();
        w70Var2.getClass();
        return w70Var.f(0, w70Var2.h());
    }

    public static int k(w70 w70Var, w70 w70Var2) {
        w70Var.getClass();
        w70Var2.getClass();
        return w70Var.j(w70Var2.h());
    }

    public static /* synthetic */ w70 p(w70 w70Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return w70Var.o(i, i2);
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
        return new String(bArr3, hk0.a);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(w70 w70Var) {
        w70Var.getClass();
        int d = d();
        int d2 = w70Var.d();
        int min = Math.min(d, d2);
        for (int i = 0; i < min; i++) {
            int i2 = i(i) & 255;
            int i3 = w70Var.i(i) & 255;
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

    public w70 c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.A, 0, d());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new w70(digest);
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
            if (obj instanceof w70) {
                w70 w70Var = (w70) obj;
                int d = w70Var.d();
                byte[] bArr = this.A;
                if (d == bArr.length && w70Var.l(0, 0, bArr.length, bArr)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int f(int i, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.A;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!a53.m(max, 0, bArr.length, bArr2, bArr)) {
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
            if (a53.m(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i >= 0) {
            byte[] bArr2 = this.A;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && a53.m(i, i2, i3, bArr2, bArr)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean m(int i, w70 w70Var, int i2) {
        w70Var.getClass();
        return w70Var.l(0, i, i2, this.A);
    }

    public String n(Charset charset) {
        charset.getClass();
        return new String(this.A, charset);
    }

    public w70 o(int i, int i2) {
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
                    return new w70(nu.j0(bArr, i, i2));
                }
                i.i("endIndex < beginIndex");
                return null;
            }
            i.g(ej6.g(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        i.i("beginIndex < 0");
        return null;
    }

    public w70 q() {
        int i = 0;
        while (true) {
            byte[] bArr = this.A;
            if (i < bArr.length) {
                byte b = bArr[i];
                if (b >= 65 && b <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    copyOf[i] = (byte) (b + 32);
                    for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                        byte b2 = copyOf[i2];
                        if (b2 >= 65 && b2 <= 90) {
                            copyOf[i2] = (byte) (b2 + 32);
                        }
                    }
                    return new w70(copyOf);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public final String r() {
        String str = this.L;
        if (str == null) {
            byte[] h = h();
            h.getClass();
            String str2 = new String(h, hk0.a);
            this.L = str2;
            return str2;
        }
        return str;
    }

    public void s(f60 f60Var, int i) {
        f60Var.j0(i, this.A);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w70.toString():java.lang.String");
    }
}
