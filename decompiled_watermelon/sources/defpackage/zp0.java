package defpackage;

import java.util.logging.Logger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zp0  reason: default package */
/* loaded from: classes.dex */
public final class zp0 {
    public static final Logger e = Logger.getLogger(zp0.class.getName());
    public static final boolean f = l37.f;
    public bq0 a;
    public final byte[] b;
    public final int c;
    public int d;

    public zp0(int i, byte[] bArr) {
        if (((bArr.length - i) | i) >= 0) {
            this.b = bArr;
            this.d = 0;
            this.c = i;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
    }

    public static int a(int i, x70 x70Var) {
        return b(x70Var) + h(i);
    }

    public static int b(x70 x70Var) {
        int size = x70Var.size();
        return i(size) + size;
    }

    public static int c(int i) {
        return h(i) + 4;
    }

    public static int d(int i) {
        return h(i) + 8;
    }

    public static int e(int i, b1 b1Var, cv5 cv5Var) {
        int h = h(i) * 2;
        b1Var.getClass();
        jl2 jl2Var = (jl2) b1Var;
        int i2 = jl2Var.memoizedSerializedSize;
        if (i2 == -1) {
            i2 = cv5Var.g(b1Var);
            jl2Var.memoizedSerializedSize = i2;
        }
        return i2 + h;
    }

    public static int f(int i) {
        if (i >= 0) {
            return i(i);
        }
        return 10;
    }

    public static int g(String str) {
        int length;
        try {
            length = c67.b(str);
        } catch (b67 unused) {
            length = str.getBytes(s33.a).length;
        }
        return i(length) + length;
    }

    public static int h(int i) {
        return i(i << 3);
    }

    public static int i(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if ((i & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int j(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & (-16384)) != 0) {
            return i + 1;
        }
        return i;
    }

    public final void k(byte b) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new aq0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void l(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new aq0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)), e2);
        }
    }

    public final void m(int i, int i2) {
        r(i, 5);
        n(i2);
    }

    public final void n(int i) {
        try {
            byte[] bArr = this.b;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.d = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.d = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new aq0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void o(int i, long j) {
        r(i, 1);
        p(j);
    }

    public final void p(long j) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.d = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new aq0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void q(int i) {
        if (i >= 0) {
            s(i);
        } else {
            u(i);
        }
    }

    public final void r(int i, int i2) {
        s((i << 3) | i2);
    }

    public final void s(int i) {
        boolean z = f;
        int i2 = this.c;
        byte[] bArr = this.b;
        if (z && !tc.a()) {
            int i3 = this.d;
            if (i2 - i3 >= 5) {
                if ((i & (-128)) == 0) {
                    this.d = i3 + 1;
                    l37.j(bArr, i3, (byte) i);
                    return;
                }
                this.d = i3 + 1;
                l37.j(bArr, i3, (byte) (i | 128));
                int i4 = i >>> 7;
                int i5 = i4 & (-128);
                int i6 = this.d;
                if (i5 == 0) {
                    this.d = i6 + 1;
                    l37.j(bArr, i6, (byte) i4);
                    return;
                }
                this.d = i6 + 1;
                l37.j(bArr, i6, (byte) (i4 | 128));
                int i7 = i >>> 14;
                int i8 = i7 & (-128);
                int i9 = this.d;
                if (i8 == 0) {
                    this.d = i9 + 1;
                    l37.j(bArr, i9, (byte) i7);
                    return;
                }
                this.d = i9 + 1;
                l37.j(bArr, i9, (byte) (i7 | 128));
                int i10 = i >>> 21;
                int i11 = i10 & (-128);
                int i12 = this.d;
                if (i11 == 0) {
                    this.d = i12 + 1;
                    l37.j(bArr, i12, (byte) i10);
                    return;
                }
                this.d = i12 + 1;
                l37.j(bArr, i12, (byte) (i10 | 128));
                int i13 = this.d;
                this.d = i13 + 1;
                l37.j(bArr, i13, (byte) (i >>> 28));
                return;
            }
        }
        while (true) {
            int i14 = i & (-128);
            int i15 = this.d;
            if (i14 == 0) {
                this.d = i15 + 1;
                bArr[i15] = (byte) i;
                return;
            }
            try {
                this.d = i15 + 1;
                bArr[i15] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new aq0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i2), 1), e2);
            }
            throw new aq0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i2), 1), e2);
        }
    }

    public final void t(int i, long j) {
        r(i, 0);
        u(j);
    }

    public final void u(long j) {
        boolean z = f;
        int i = this.c;
        byte[] bArr = this.b;
        if (!z || i - this.d < 10) {
            while (true) {
                int i2 = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                int i3 = this.d;
                if (i2 == 0) {
                    this.d = i3 + 1;
                    bArr[i3] = (byte) j;
                    return;
                }
                try {
                    this.d = i3 + 1;
                    bArr[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new aq0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2);
                }
                throw new aq0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2);
            }
        }
        while (true) {
            int i4 = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
            int i5 = this.d;
            if (i4 == 0) {
                this.d = i5 + 1;
                l37.j(bArr, i5, (byte) j);
                return;
            }
            this.d = i5 + 1;
            l37.j(bArr, i5, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
    }
}
