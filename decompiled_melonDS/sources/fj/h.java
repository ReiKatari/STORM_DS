package fj;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class h implements Serializable, Comparable {
    public static final h R = new h(new byte[0]);
    public final byte[] A;
    public transient int B;
    public transient String L;

    public h(byte[] bArr) {
        bArr.getClass();
        this.A = bArr;
    }

    public static int g(h hVar, h hVar2) {
        hVar.getClass();
        hVar2.getClass();
        return hVar.f(0, hVar2.h());
    }

    public static int k(h hVar, h hVar2) {
        hVar.getClass();
        hVar2.getClass();
        return hVar.j(hVar2.h());
    }

    public static /* synthetic */ h p(h hVar, int i2, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i2 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = -1234567890;
        }
        return hVar.o(i2, i10);
    }

    public String a() {
        byte[] bArr = a.f4967a;
        byte[] bArr2 = this.A;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i2 = 0;
        int i10 = 0;
        while (i2 < length) {
            byte b10 = bArr2[i2];
            int i11 = i2 + 2;
            byte b11 = bArr2[i2 + 1];
            i2 += 3;
            byte b12 = bArr2[i11];
            bArr3[i10] = bArr[(b10 & 255) >> 2];
            bArr3[i10 + 1] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i12 = i10 + 3;
            bArr3[i10 + 2] = bArr[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i10 += 4;
            bArr3[i12] = bArr[b12 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i13 = i2 + 1;
                byte b13 = bArr2[i2];
                byte b14 = bArr2[i13];
                bArr3[i10] = bArr[(b13 & 255) >> 2];
                bArr3[i10 + 1] = bArr[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
                bArr3[i10 + 2] = bArr[(b14 & 15) << 2];
                bArr3[i10 + 3] = 61;
            }
        } else {
            byte b15 = bArr2[i2];
            bArr3[i10] = bArr[(b15 & 255) >> 2];
            bArr3[i10 + 1] = bArr[(b15 & 3) << 4];
            bArr3[i10 + 2] = 61;
            bArr3[i10 + 3] = 61;
        }
        return new String(bArr3, vc.a.f13781a);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(h hVar) {
        hVar.getClass();
        int d4 = d();
        int d10 = hVar.d();
        int min = Math.min(d4, d10);
        for (int i2 = 0; i2 < min; i2++) {
            int i10 = i(i2) & 255;
            int i11 = hVar.i(i2) & 255;
            if (i10 != i11) {
                if (i10 < i11) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (d4 == d10) {
            return 0;
        }
        if (d4 < d10) {
            return -1;
        }
        return 1;
    }

    public h c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.A, 0, d());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new h(digest);
    }

    public int d() {
        return this.A.length;
    }

    public String e() {
        byte[] bArr = this.A;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b10 : bArr) {
            int i10 = i2 + 1;
            char[] cArr2 = gj.b.f5683a;
            cArr[i2] = cArr2[(b10 >> 4) & 15];
            i2 += 2;
            cArr[i10] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                int d4 = hVar.d();
                byte[] bArr = this.A;
                if (d4 == bArr.length && hVar.m(0, bArr, 0, bArr.length)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int f(int i2, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.A;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i2, 0);
        if (max <= length) {
            while (!d0.d.G(max, 0, bArr.length, bArr2, bArr)) {
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
        int i2 = this.B;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.A);
        this.B = hashCode;
        return hashCode;
    }

    public byte i(int i2) {
        return this.A[i2];
    }

    public int j(byte[] bArr) {
        bArr.getClass();
        int d4 = d();
        byte[] bArr2 = this.A;
        for (int min = Math.min(d4, bArr2.length - bArr.length); -1 < min; min--) {
            if (d0.d.G(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i2, h hVar, int i10) {
        hVar.getClass();
        return hVar.m(0, this.A, i2, i10);
    }

    public boolean m(int i2, byte[] bArr, int i10, int i11) {
        bArr.getClass();
        if (i2 >= 0) {
            byte[] bArr2 = this.A;
            if (i2 <= bArr2.length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && d0.d.G(i2, i10, i11, bArr2, bArr)) {
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

    public h o(int i2, int i10) {
        if (i10 == -1234567890) {
            i10 = d();
        }
        if (i2 >= 0) {
            byte[] bArr = this.A;
            if (i10 <= bArr.length) {
                if (i10 - i2 >= 0) {
                    if (i2 == 0 && i10 == bArr.length) {
                        return this;
                    }
                    return new h(zb.k.m(bArr, i2, i10));
                }
                a0.j.h("endIndex < beginIndex");
                return null;
            }
            a0.j.e(w.d.p(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        a0.j.h("beginIndex < 0");
        return null;
    }

    public h q() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.A;
            if (i2 < bArr.length) {
                byte b10 = bArr[i2];
                if (b10 >= 65 && b10 <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    copyOf[i2] = (byte) (b10 + 32);
                    for (int i10 = i2 + 1; i10 < copyOf.length; i10++) {
                        byte b11 = copyOf[i10];
                        if (b11 >= 65 && b11 <= 90) {
                            copyOf[i10] = (byte) (b11 + 32);
                        }
                    }
                    return new h(copyOf);
                }
                i2++;
            } else {
                return this;
            }
        }
    }

    public final String r() {
        String str = this.L;
        if (str == null) {
            byte[] h2 = h();
            h2.getClass();
            String str2 = new String(h2, vc.a.f13781a);
            this.L = str2;
            return str2;
        }
        return str;
    }

    public void s(e eVar, int i2) {
        eVar.b0(i2, this.A);
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
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fj.h.toString():java.lang.String");
    }
}
