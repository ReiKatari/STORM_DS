package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e55  reason: default package */
/* loaded from: classes.dex */
public final class e55 {
    public final r90 a;
    public int b = -1;
    public x45 c = x45.INVALID;
    public boolean d;
    public int e;

    public e55(r90 r90Var) {
        this.a = r90Var;
    }

    public static void a(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(lb1.g(i, "Unexpected negative length: "), null);
    }

    public final int b(q45 q45Var) {
        int i = d55.b[q45Var.ordinal()];
        r90 r90Var = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return h();
                }
                i.d();
                return 0;
            }
            int i2 = r90Var.B;
            int i3 = r90Var.A;
            if (i2 != i3) {
                byte[] bArr = (byte[]) r90Var.L;
                int i4 = i2 + 1;
                int i5 = bArr[i2];
                if (i5 >= 0) {
                    r90Var.B = i4;
                } else {
                    if (i3 - i2 > 1) {
                        int i6 = i2 + 2;
                        int i7 = (bArr[i4] << 7) ^ i5;
                        if (i7 < 0) {
                            r90Var.B = i6;
                            i5 = i7 ^ (-128);
                        }
                    }
                    int i8 = 0;
                    for (int i9 = 0; i9 < 32; i9 += 7) {
                        int u = r90Var.u();
                        i8 |= (u & 127) << i9;
                        if ((u & 128) == 0) {
                            i5 = i8;
                        }
                    }
                    throw new IllegalArgumentException("Input stream is malformed: Varint too long (exceeded 32 bits)");
                }
                return ((((i5 << 31) >> 31) ^ i5) >> 1) ^ (Integer.MIN_VALUE & i5);
            }
            throw new IllegalArgumentException("Unexpected EOF");
        }
        return (int) r90Var.v(false);
    }

    public final long c(q45 q45Var) {
        int i = d55.b[q45Var.ordinal()];
        r90 r90Var = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return j();
                }
                i.d();
                return 0L;
            }
            long v = r90Var.v(false);
            return (v & Long.MIN_VALUE) ^ ((((v << 63) >> 63) ^ v) >> 1);
        }
        return r90Var.v(false);
    }

    public final r90 d() {
        x45 x45Var = x45.SIZE_DELIMITED;
        if (this.c == x45Var) {
            return e();
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(x45Var);
        u34.z(sb, this.c);
        return null;
    }

    public final r90 e() {
        int b = b(q45.DEFAULT);
        a(b);
        r90 r90Var = this.a;
        r90Var.t(b);
        r90 r90Var2 = new r90((byte[]) r90Var.L, r90Var.B + b);
        r90Var2.B = r90Var.B;
        r90Var.B += b;
        return r90Var2;
    }

    public final byte[] f() {
        int b = b(q45.DEFAULT);
        a(b);
        r90 r90Var = this.a;
        r90Var.t(b);
        byte[] bArr = new byte[b];
        int i = r90Var.A;
        int i2 = r90Var.B;
        int i3 = i - i2;
        if (i3 < b) {
            b = i3;
        }
        fv.q0(0, i2, i2 + b, (byte[]) r90Var.L, bArr);
        r90Var.B += b;
        return bArr;
    }

    public final int g(q45 q45Var) {
        x45 x45Var;
        q45Var.getClass();
        if (q45Var == q45.FIXED) {
            x45Var = x45.i32;
        } else {
            x45Var = x45.VARINT;
        }
        if (this.c == x45Var) {
            return b(q45Var);
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(x45Var);
        u34.z(sb, this.c);
        return 0;
    }

    public final int h() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i |= (this.a.u() & 255) << (i2 * 8);
        }
        return i;
    }

    public final long i(q45 q45Var) {
        x45 x45Var;
        q45Var.getClass();
        if (q45Var == q45.FIXED) {
            x45Var = x45.i64;
        } else {
            x45Var = x45.VARINT;
        }
        if (this.c == x45Var) {
            return c(q45Var);
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(x45Var);
        u34.z(sb, this.c);
        return 0L;
    }

    public final long j() {
        long j = 0;
        for (int i = 0; i < 8; i++) {
            j |= (this.a.u() & 255) << (i * 8);
        }
        return j;
    }

    public final String k() {
        x45 x45Var = x45.SIZE_DELIMITED;
        if (this.c == x45Var) {
            int b = b(q45.DEFAULT);
            a(b);
            r90 r90Var = this.a;
            int i = r90Var.B;
            String W = xs6.W(i, (byte[]) r90Var.L, i + b, 4);
            r90Var.B += b;
            return W;
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(x45Var);
        u34.z(sb, this.c);
        return null;
    }

    public final int l() {
        if (this.d) {
            this.d = false;
            int typeId = (this.b << 3) | this.c.getTypeId();
            int n = n(this.e);
            this.e = typeId;
            return n;
        }
        this.e = (this.b << 3) | this.c.getTypeId();
        return n((int) this.a.v(true));
    }

    public final void m() {
        int i = d55.a[this.c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        g(q45.FIXED);
                        return;
                    }
                    throw new IllegalArgumentException("Unsupported start group or end group wire type: " + this.c, null);
                }
                x45 x45Var = x45.SIZE_DELIMITED;
                if (this.c == x45Var) {
                    int b = b(q45.DEFAULT);
                    a(b);
                    r90 r90Var = this.a;
                    r90Var.t(b);
                    r90Var.B += b;
                    return;
                }
                StringBuilder sb = new StringBuilder("Expected wire type ");
                sb.append(x45Var);
                u34.z(sb, this.c);
                return;
            }
            i(q45.FIXED);
            return;
        }
        g(q45.DEFAULT);
    }

    public final int n(int i) {
        x45[] x45VarArr;
        if (i == -1) {
            this.b = -1;
            this.c = x45.INVALID;
            return -1;
        }
        this.b = i >>> 3;
        x45.Companion.getClass();
        x45VarArr = x45.entryArray;
        this.c = x45VarArr[i & 7];
        return this.b;
    }
}
