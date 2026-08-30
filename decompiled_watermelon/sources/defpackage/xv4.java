package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xv4  reason: default package */
/* loaded from: classes.dex */
public final class xv4 {
    public final k70 a;
    public int b = -1;
    public qv4 c = qv4.INVALID;
    public boolean d;
    public int e;

    public xv4(k70 k70Var) {
        this.a = k70Var;
    }

    public static void a(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(wh1.g(i, "Unexpected negative length: "), null);
    }

    public final int b(jv4 jv4Var) {
        int i = wv4.b[jv4Var.ordinal()];
        k70 k70Var = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return h();
                }
                i.c();
                return 0;
            }
            int i2 = k70Var.B;
            int i3 = k70Var.A;
            if (i2 != i3) {
                byte[] bArr = (byte[]) k70Var.L;
                int i4 = i2 + 1;
                int i5 = bArr[i2];
                if (i5 >= 0) {
                    k70Var.B = i4;
                } else {
                    if (i3 - i2 > 1) {
                        int i6 = i2 + 2;
                        int i7 = (bArr[i4] << 7) ^ i5;
                        if (i7 < 0) {
                            k70Var.B = i6;
                            i5 = i7 ^ (-128);
                        }
                    }
                    int i8 = 0;
                    for (int i9 = 0; i9 < 32; i9 += 7) {
                        int u = k70Var.u();
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
        return (int) k70Var.v(false);
    }

    public final long c(jv4 jv4Var) {
        int i = wv4.b[jv4Var.ordinal()];
        k70 k70Var = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return j();
                }
                i.c();
                return 0L;
            }
            long v = k70Var.v(false);
            return (v & Long.MIN_VALUE) ^ ((((v << 63) >> 63) ^ v) >> 1);
        }
        return k70Var.v(false);
    }

    public final k70 d() {
        qv4 qv4Var = qv4.SIZE_DELIMITED;
        if (this.c == qv4Var) {
            return e();
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(qv4Var);
        c44.w(sb, this.c);
        return null;
    }

    public final k70 e() {
        int b = b(jv4.DEFAULT);
        a(b);
        k70 k70Var = this.a;
        k70Var.t(b);
        k70 k70Var2 = new k70(k70Var.B + b, (byte[]) k70Var.L);
        k70Var2.B = k70Var.B;
        k70Var.B += b;
        return k70Var2;
    }

    public final byte[] f() {
        int b = b(jv4.DEFAULT);
        a(b);
        k70 k70Var = this.a;
        k70Var.t(b);
        byte[] bArr = new byte[b];
        int i = k70Var.A;
        int i2 = k70Var.B;
        int i3 = i - i2;
        if (i3 < b) {
            b = i3;
        }
        nu.c0(0, i2, i2 + b, (byte[]) k70Var.L, bArr);
        k70Var.B += b;
        return bArr;
    }

    public final int g(jv4 jv4Var) {
        qv4 qv4Var;
        jv4Var.getClass();
        if (jv4Var == jv4.FIXED) {
            qv4Var = qv4.i32;
        } else {
            qv4Var = qv4.VARINT;
        }
        if (this.c == qv4Var) {
            return b(jv4Var);
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(qv4Var);
        c44.w(sb, this.c);
        return 0;
    }

    public final int h() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i |= (this.a.u() & 255) << (i2 * 8);
        }
        return i;
    }

    public final long i(jv4 jv4Var) {
        qv4 qv4Var;
        jv4Var.getClass();
        if (jv4Var == jv4.FIXED) {
            qv4Var = qv4.i64;
        } else {
            qv4Var = qv4.VARINT;
        }
        if (this.c == qv4Var) {
            return c(jv4Var);
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(qv4Var);
        c44.w(sb, this.c);
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
        qv4 qv4Var = qv4.SIZE_DELIMITED;
        if (this.c == qv4Var) {
            int b = b(jv4.DEFAULT);
            a(b);
            k70 k70Var = this.a;
            int i = k70Var.B;
            String d0 = gh6.d0(i, i + b, 4, (byte[]) k70Var.L);
            k70Var.B += b;
            return d0;
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(qv4Var);
        c44.w(sb, this.c);
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
        int i = wv4.a[this.c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        g(jv4.FIXED);
                        return;
                    }
                    throw new IllegalArgumentException("Unsupported start group or end group wire type: " + this.c, null);
                }
                qv4 qv4Var = qv4.SIZE_DELIMITED;
                if (this.c == qv4Var) {
                    int b = b(jv4.DEFAULT);
                    a(b);
                    k70 k70Var = this.a;
                    k70Var.t(b);
                    k70Var.B += b;
                    return;
                }
                StringBuilder sb = new StringBuilder("Expected wire type ");
                sb.append(qv4Var);
                c44.w(sb, this.c);
                return;
            }
            i(jv4.FIXED);
            return;
        }
        g(jv4.DEFAULT);
    }

    public final int n(int i) {
        qv4[] qv4VarArr;
        if (i == -1) {
            this.b = -1;
            this.c = qv4.INVALID;
            return -1;
        }
        this.b = i >>> 3;
        qv4.Companion.getClass();
        qv4VarArr = qv4.entryArray;
        this.c = qv4VarArr[i & 7];
        return this.b;
    }
}
