package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s96  reason: default package */
/* loaded from: classes.dex */
public final class s96 extends da0 {
    public final transient byte[][] X;
    public final transient int[] Y;

    public s96(byte[][] bArr, int[] iArr) {
        super(da0.R.A);
        this.X = bArr;
        this.Y = iArr;
    }

    @Override // defpackage.da0
    public final String a() {
        throw null;
    }

    @Override // defpackage.da0
    public final da0 c(String str) {
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
        return new da0(digest);
    }

    @Override // defpackage.da0
    public final int d() {
        return this.Y[this.X.length - 1];
    }

    @Override // defpackage.da0
    public final String e() {
        return u().e();
    }

    @Override // defpackage.da0
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof da0) {
                da0 da0Var = (da0) obj;
                if (da0Var.d() == d() && l(0, da0Var, d())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.da0
    public final int f(byte[] bArr, int i) {
        bArr.getClass();
        return u().f(bArr, i);
    }

    @Override // defpackage.da0
    public final byte[] h() {
        return r();
    }

    @Override // defpackage.da0
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

    @Override // defpackage.da0
    public final byte i(int i) {
        int i2;
        byte[][] bArr = this.X;
        int[] iArr = this.Y;
        hf.D(iArr[bArr.length - 1], i, 1L);
        int K = n16.K(this, i);
        if (K == 0) {
            i2 = 0;
        } else {
            i2 = iArr[K - 1];
        }
        return bArr[K][(i - i2) + iArr[bArr.length + K]];
    }

    @Override // defpackage.da0
    public final int j(byte[] bArr) {
        bArr.getClass();
        return u().j(bArr);
    }

    @Override // defpackage.da0
    public final boolean l(int i, da0 da0Var, int i2) {
        int i3;
        da0Var.getClass();
        if (i >= 0 && i <= d() - i2) {
            int i4 = i2 + i;
            int K = n16.K(this, i);
            int i5 = 0;
            while (i < i4) {
                int[] iArr = this.Y;
                if (K == 0) {
                    i3 = 0;
                } else {
                    i3 = iArr[K - 1];
                }
                byte[][] bArr = this.X;
                int i6 = iArr[bArr.length + K];
                int min = Math.min(i4, (iArr[K] - i3) + i3) - i;
                if (da0Var.m(i5, bArr[K], (i - i3) + i6, min)) {
                    i5 += min;
                    i += min;
                    K++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.da0
    public final boolean m(int i, byte[] bArr, int i2, int i3) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > d() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int K = n16.K(this, i);
        while (i < i5) {
            int[] iArr = this.Y;
            if (K == 0) {
                i4 = 0;
            } else {
                i4 = iArr[K - 1];
            }
            byte[][] bArr2 = this.X;
            int i6 = iArr[bArr2.length + K];
            int min = Math.min(i5, (iArr[K] - i4) + i4) - i;
            if (!hf.x((i - i4) + i6, i2, min, bArr2[K], bArr)) {
                return false;
            }
            i2 += min;
            i += min;
            K++;
        }
        return true;
    }

    @Override // defpackage.da0
    public final String n(Charset charset) {
        charset.getClass();
        return u().n(charset);
    }

    @Override // defpackage.da0
    public final da0 o(int i, int i2) {
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
                        return da0.R;
                    }
                    int K = n16.K(this, i);
                    int K2 = n16.K(this, i2 - 1);
                    byte[][] bArr = this.X;
                    byte[][] bArr2 = (byte[][]) fv.y0(bArr, K, K2 + 1);
                    int[] iArr = new int[bArr2.length * 2];
                    int i4 = 0;
                    int[] iArr2 = this.Y;
                    if (K <= K2) {
                        int i5 = K;
                        int i6 = 0;
                        while (true) {
                            iArr[i6] = Math.min(iArr2[i5] - i, i3);
                            int i7 = i6 + 1;
                            iArr[i6 + bArr2.length] = iArr2[bArr.length + i5];
                            if (i5 == K2) {
                                break;
                            }
                            i5++;
                            i6 = i7;
                        }
                    }
                    if (K != 0) {
                        i4 = iArr2[K - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i - i4) + iArr[length];
                    return new s96(bArr2, iArr);
                }
                i.f(lb1.j("endIndex=", i2, i, " < beginIndex="));
                return null;
            }
            StringBuilder t = xg6.t("endIndex=", i2, " > length(");
            t.append(d());
            t.append(')');
            throw new IllegalArgumentException(t.toString().toString());
        }
        i.f(lb1.k("beginIndex=", i, " < 0"));
        return null;
    }

    @Override // defpackage.da0
    public final da0 q() {
        return u().q();
    }

    @Override // defpackage.da0
    public final byte[] r() {
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
            fv.q0(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.da0
    public final void t(k80 k80Var, int i) {
        int i2;
        int K = n16.K(this, 0);
        int i3 = 0;
        while (i3 < i) {
            int[] iArr = this.Y;
            if (K == 0) {
                i2 = 0;
            } else {
                i2 = iArr[K - 1];
            }
            byte[][] bArr = this.X;
            int i4 = iArr[bArr.length + K];
            int min = Math.min(i, (iArr[K] - i2) + i2) - i3;
            int i5 = (i3 - i2) + i4;
            o96 o96Var = new o96(bArr[K], i5, i5 + min, true, false);
            o96 o96Var2 = k80Var.A;
            if (o96Var2 == null) {
                o96Var.g = o96Var;
                o96Var.f = o96Var;
                k80Var.A = o96Var;
            } else {
                o96 o96Var3 = o96Var2.g;
                o96Var3.getClass();
                o96Var3.b(o96Var);
            }
            i3 += min;
            K++;
        }
        k80Var.B += i;
    }

    @Override // defpackage.da0
    public final String toString() {
        return u().toString();
    }

    public final da0 u() {
        return new da0(r());
    }
}
