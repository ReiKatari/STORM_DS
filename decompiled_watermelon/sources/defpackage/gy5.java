package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gy5  reason: default package */
/* loaded from: classes.dex */
public final class gy5 extends w70 {
    public final transient byte[][] X;
    public final transient int[] Y;

    public gy5(byte[][] bArr, int[] iArr) {
        super(w70.R.A);
        this.X = bArr;
        this.Y = iArr;
    }

    @Override // defpackage.w70
    public final String a() {
        throw null;
    }

    @Override // defpackage.w70
    public final w70 c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.X;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.Y;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new w70(digest);
    }

    @Override // defpackage.w70
    public final int d() {
        return this.Y[this.X.length - 1];
    }

    @Override // defpackage.w70
    public final String e() {
        return u().e();
    }

    @Override // defpackage.w70
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof w70) {
                w70 w70Var = (w70) obj;
                if (w70Var.d() == d() && m(0, w70Var, d())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.w70
    public final int f(int i, byte[] bArr) {
        bArr.getClass();
        return u().f(i, bArr);
    }

    @Override // defpackage.w70
    public final byte[] h() {
        return t();
    }

    @Override // defpackage.w70
    public final int hashCode() {
        int i = this.B;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.X;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.Y;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.B = i3;
        return i3;
    }

    @Override // defpackage.w70
    public final byte i(int i) {
        int i2;
        byte[][] bArr = this.X;
        int[] iArr = this.Y;
        a53.q(iArr[bArr.length - 1], i, 1L);
        int A = iq2.A(this, i);
        if (A == 0) {
            i2 = 0;
        } else {
            i2 = iArr[A - 1];
        }
        return bArr[A][(i - i2) + iArr[bArr.length + A]];
    }

    @Override // defpackage.w70
    public final int j(byte[] bArr) {
        bArr.getClass();
        return u().j(bArr);
    }

    @Override // defpackage.w70
    public final boolean l(int i, int i2, int i3, byte[] bArr) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > d() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int A = iq2.A(this, i);
        while (i < i5) {
            int[] iArr = this.Y;
            if (A == 0) {
                i4 = 0;
            } else {
                i4 = iArr[A - 1];
            }
            byte[][] bArr2 = this.X;
            int i6 = iArr[bArr2.length + A];
            int min = Math.min(i5, (iArr[A] - i4) + i4) - i;
            if (!a53.m((i - i4) + i6, i2, min, bArr2[A], bArr)) {
                return false;
            }
            i2 += min;
            i += min;
            A++;
        }
        return true;
    }

    @Override // defpackage.w70
    public final boolean m(int i, w70 w70Var, int i2) {
        int i3;
        w70Var.getClass();
        if (i >= 0 && i <= d() - i2) {
            int i4 = i2 + i;
            int A = iq2.A(this, i);
            int i5 = 0;
            while (i < i4) {
                int[] iArr = this.Y;
                if (A == 0) {
                    i3 = 0;
                } else {
                    i3 = iArr[A - 1];
                }
                byte[][] bArr = this.X;
                int i6 = iArr[bArr.length + A];
                int min = Math.min(i4, (iArr[A] - i3) + i3) - i;
                if (w70Var.l(i5, (i - i3) + i6, min, bArr[A])) {
                    i5 += min;
                    i += min;
                    A++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.w70
    public final String n(Charset charset) {
        charset.getClass();
        return u().n(charset);
    }

    @Override // defpackage.w70
    public final w70 o(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = d();
        }
        if (i >= 0) {
            if (i2 <= d()) {
                int i3 = i2 - i;
                if (i3 >= 0) {
                    if (i == 0 && i2 == d()) {
                        return this;
                    }
                    if (i == i2) {
                        return w70.R;
                    }
                    int A = iq2.A(this, i);
                    int A2 = iq2.A(this, i2 - 1);
                    byte[][] bArr = this.X;
                    byte[][] bArr2 = (byte[][]) nu.k0(bArr, A, A2 + 1);
                    int[] iArr = new int[bArr2.length * 2];
                    int i4 = 0;
                    int[] iArr2 = this.Y;
                    if (A <= A2) {
                        int i5 = A;
                        int i6 = 0;
                        while (true) {
                            iArr[i6] = Math.min(iArr2[i5] - i, i3);
                            int i7 = i6 + 1;
                            iArr[i6 + bArr2.length] = iArr2[bArr.length + i5];
                            if (i5 == A2) {
                                break;
                            }
                            i5++;
                            i6 = i7;
                        }
                    }
                    if (A != 0) {
                        i4 = iArr2[A - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i - i4) + iArr[length];
                    return new gy5(bArr2, iArr);
                }
                i.g(wh1.f(i2, i, "endIndex=", " < beginIndex="));
                return null;
            }
            StringBuilder s = wh1.s("endIndex=", i2, " > length(");
            s.append(d());
            s.append(')');
            throw new IllegalArgumentException(s.toString().toString());
        }
        i.g(wh1.j("beginIndex=", i, " < 0"));
        return null;
    }

    @Override // defpackage.w70
    public final w70 q() {
        return u().q();
    }

    @Override // defpackage.w70
    public final void s(f60 f60Var, int i) {
        int i2;
        int A = iq2.A(this, 0);
        int i3 = 0;
        while (i3 < i) {
            int[] iArr = this.Y;
            if (A == 0) {
                i2 = 0;
            } else {
                i2 = iArr[A - 1];
            }
            byte[][] bArr = this.X;
            int i4 = iArr[bArr.length + A];
            int min = Math.min(i, (iArr[A] - i2) + i2) - i3;
            int i5 = (i3 - i2) + i4;
            cy5 cy5Var = new cy5(bArr[A], i5, i5 + min, true);
            cy5 cy5Var2 = f60Var.A;
            if (cy5Var2 == null) {
                cy5Var.g = cy5Var;
                cy5Var.f = cy5Var;
                f60Var.A = cy5Var;
            } else {
                cy5 cy5Var3 = cy5Var2.g;
                cy5Var3.getClass();
                cy5Var3.b(cy5Var);
            }
            i3 += min;
            A++;
        }
        f60Var.B += i;
    }

    public final byte[] t() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.X;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.Y;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            nu.c0(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.w70
    public final String toString() {
        return u().toString();
    }

    public final w70 u() {
        return new w70(t());
    }
}
