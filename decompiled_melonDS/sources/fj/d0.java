package fj;

import java.nio.charset.Charset;
import java.security.MessageDigest;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends h {
    public final transient byte[][] X;
    public final transient int[] Y;

    public d0(byte[][] bArr, int[] iArr) {
        super(h.R.A);
        this.X = bArr;
        this.Y = iArr;
    }

    @Override // fj.h
    public final String a() {
        throw null;
    }

    @Override // fj.h
    public final h c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.X;
        int length = bArr.length;
        int i2 = 0;
        int i10 = 0;
        while (i2 < length) {
            int[] iArr = this.Y;
            int i11 = iArr[length + i2];
            int i12 = iArr[i2];
            messageDigest.update(bArr[i2], i11, i12 - i10);
            i2++;
            i10 = i12;
        }
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new h(digest);
    }

    @Override // fj.h
    public final int d() {
        return this.Y[this.X.length - 1];
    }

    @Override // fj.h
    public final String e() {
        return u().e();
    }

    @Override // fj.h
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (hVar.d() == d() && l(0, hVar, d())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // fj.h
    public final int f(int i2, byte[] bArr) {
        bArr.getClass();
        return u().f(i2, bArr);
    }

    @Override // fj.h
    public final byte[] h() {
        return t();
    }

    @Override // fj.h
    public final int hashCode() {
        int i2 = this.B;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.X;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.Y;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr2 = bArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.B = i11;
        return i11;
    }

    @Override // fj.h
    public final byte i(int i2) {
        int i10;
        byte[][] bArr = this.X;
        int[] iArr = this.Y;
        d0.d.K(iArr[bArr.length - 1], i2, 1L);
        int g10 = gj.b.g(this, i2);
        if (g10 == 0) {
            i10 = 0;
        } else {
            i10 = iArr[g10 - 1];
        }
        return bArr[g10][(i2 - i10) + iArr[bArr.length + g10]];
    }

    @Override // fj.h
    public final int j(byte[] bArr) {
        bArr.getClass();
        return u().j(bArr);
    }

    @Override // fj.h
    public final boolean l(int i2, h hVar, int i10) {
        int i11;
        hVar.getClass();
        if (i2 >= 0 && i2 <= d() - i10) {
            int i12 = i10 + i2;
            int g10 = gj.b.g(this, i2);
            int i13 = 0;
            while (i2 < i12) {
                int[] iArr = this.Y;
                if (g10 == 0) {
                    i11 = 0;
                } else {
                    i11 = iArr[g10 - 1];
                }
                byte[][] bArr = this.X;
                int i14 = iArr[bArr.length + g10];
                int min = Math.min(i12, (iArr[g10] - i11) + i11) - i2;
                if (hVar.m(i13, bArr[g10], (i2 - i11) + i14, min)) {
                    i13 += min;
                    i2 += min;
                    g10++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // fj.h
    public final boolean m(int i2, byte[] bArr, int i10, int i11) {
        int i12;
        bArr.getClass();
        if (i2 < 0 || i2 > d() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int i13 = i11 + i2;
        int g10 = gj.b.g(this, i2);
        while (i2 < i13) {
            int[] iArr = this.Y;
            if (g10 == 0) {
                i12 = 0;
            } else {
                i12 = iArr[g10 - 1];
            }
            byte[][] bArr2 = this.X;
            int i14 = iArr[bArr2.length + g10];
            int min = Math.min(i13, (iArr[g10] - i12) + i12) - i2;
            if (!d0.d.G((i2 - i12) + i14, i10, min, bArr2[g10], bArr)) {
                return false;
            }
            i10 += min;
            i2 += min;
            g10++;
        }
        return true;
    }

    @Override // fj.h
    public final String n(Charset charset) {
        charset.getClass();
        return u().n(charset);
    }

    @Override // fj.h
    public final h o(int i2, int i10) {
        if (i10 == -1234567890) {
            i10 = d();
        }
        if (i2 >= 0) {
            if (i10 <= d()) {
                int i11 = i10 - i2;
                if (i11 >= 0) {
                    if (i2 == 0 && i10 == d()) {
                        return this;
                    }
                    if (i2 == i10) {
                        return h.R;
                    }
                    int g10 = gj.b.g(this, i2);
                    int g11 = gj.b.g(this, i10 - 1);
                    byte[][] bArr = this.X;
                    byte[][] bArr2 = (byte[][]) zb.k.n(bArr, g10, g11 + 1);
                    int[] iArr = new int[bArr2.length * 2];
                    int i12 = 0;
                    int[] iArr2 = this.Y;
                    if (g10 <= g11) {
                        int i13 = g10;
                        int i14 = 0;
                        while (true) {
                            iArr[i14] = Math.min(iArr2[i13] - i2, i11);
                            int i15 = i14 + 1;
                            iArr[i14 + bArr2.length] = iArr2[bArr.length + i13];
                            if (i13 == g11) {
                                break;
                            }
                            i13++;
                            i14 = i15;
                        }
                    }
                    if (g10 != 0) {
                        i12 = iArr2[g10 - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i2 - i12) + iArr[length];
                    return new d0(bArr2, iArr);
                }
                a0.j.e(kc.a.d(i10, i2, "endIndex=", " < beginIndex="));
                return null;
            }
            StringBuilder i16 = kc.a.i("endIndex=", i10, " > length(");
            i16.append(d());
            i16.append(')');
            throw new IllegalArgumentException(i16.toString().toString());
        }
        a0.j.e(w.d.m("beginIndex=", i2, " < 0"));
        return null;
    }

    @Override // fj.h
    public final h q() {
        return u().q();
    }

    @Override // fj.h
    public final void s(e eVar, int i2) {
        int i10;
        int g10 = gj.b.g(this, 0);
        int i11 = 0;
        while (i11 < i2) {
            int[] iArr = this.Y;
            if (g10 == 0) {
                i10 = 0;
            } else {
                i10 = iArr[g10 - 1];
            }
            byte[][] bArr = this.X;
            int i12 = iArr[bArr.length + g10];
            int min = Math.min(i2, (iArr[g10] - i10) + i10) - i11;
            int i13 = (i11 - i10) + i12;
            b0 b0Var = new b0(bArr[g10], i13, i13 + min, true);
            b0 b0Var2 = eVar.A;
            if (b0Var2 == null) {
                b0Var.f4982g = b0Var;
                b0Var.f4981f = b0Var;
                eVar.A = b0Var;
            } else {
                b0 b0Var3 = b0Var2.f4982g;
                b0Var3.getClass();
                b0Var3.b(b0Var);
            }
            i11 += min;
            g10++;
        }
        eVar.B += i2;
    }

    public final byte[] t() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.X;
        int length = bArr2.length;
        int i2 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i2 < length) {
            int[] iArr = this.Y;
            int i12 = iArr[length + i2];
            int i13 = iArr[i2];
            int i14 = i13 - i10;
            zb.k.f(i11, i12, i12 + i14, bArr2[i2], bArr);
            i11 += i14;
            i2++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // fj.h
    public final String toString() {
        return u().toString();
    }

    public final h u() {
        return new h(t());
    }
}
