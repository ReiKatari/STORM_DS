package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k80  reason: default package */
/* loaded from: classes.dex */
public final class k80 implements z80, y80, Cloneable, ByteChannel {
    public o96 A;
    public long B;

    public final long A(byte b, long j, long j2) {
        o96 o96Var;
        long j3 = 0;
        if (0 <= j && j <= j2) {
            long j4 = this.B;
            if (j2 > j4) {
                j2 = j4;
            }
            if (j != j2 && (o96Var = this.A) != null) {
                if (j4 - j < j) {
                    while (j4 > j) {
                        o96Var = o96Var.g;
                        o96Var.getClass();
                        j4 -= o96Var.c - o96Var.b;
                    }
                    while (j4 < j2) {
                        byte[] bArr = o96Var.a;
                        int min = (int) Math.min(o96Var.c, (o96Var.b + j2) - j4);
                        for (int i = (int) ((o96Var.b + j) - j4); i < min; i++) {
                            if (bArr[i] == b) {
                                return (i - o96Var.b) + j4;
                            }
                        }
                        j4 += o96Var.c - o96Var.b;
                        o96Var = o96Var.f;
                        o96Var.getClass();
                        j = j4;
                    }
                    return -1L;
                }
                while (true) {
                    long j5 = (o96Var.c - o96Var.b) + j3;
                    if (j5 > j) {
                        break;
                    }
                    o96Var = o96Var.f;
                    o96Var.getClass();
                    j3 = j5;
                }
                while (j3 < j2) {
                    byte[] bArr2 = o96Var.a;
                    int min2 = (int) Math.min(o96Var.c, (o96Var.b + j2) - j3);
                    for (int i2 = (int) ((o96Var.b + j) - j3); i2 < min2; i2++) {
                        if (bArr2[i2] == b) {
                            return (i2 - o96Var.b) + j3;
                        }
                    }
                    j3 += o96Var.c - o96Var.b;
                    o96Var = o96Var.f;
                    o96Var.getClass();
                    j = j3;
                }
                return -1L;
            }
            return -1L;
        }
        StringBuilder sb = new StringBuilder("size=");
        sb.append(this.B);
        xg6.B(sb, " fromIndex=", j, " toIndex=");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // defpackage.y80
    public final /* bridge */ /* synthetic */ y80 B(byte[] bArr, int i) {
        l0(bArr, i);
        return this;
    }

    @Override // defpackage.z80
    public final long C(y80 y80Var) {
        long j = this.B;
        if (j > 0) {
            y80Var.O(this, j);
        }
        return j;
    }

    public final long D(da0 da0Var) {
        int i;
        int i2;
        da0Var.getClass();
        o96 o96Var = this.A;
        if (o96Var != null) {
            long j = this.B;
            long j2 = 0;
            if (j < 0) {
                while (j > 0) {
                    o96Var = o96Var.g;
                    o96Var.getClass();
                    j -= o96Var.c - o96Var.b;
                }
                if (da0Var.d() == 2) {
                    byte i3 = da0Var.i(0);
                    byte i4 = da0Var.i(1);
                    while (j < this.B) {
                        byte[] bArr = o96Var.a;
                        i = (int) ((o96Var.b + j2) - j);
                        int i5 = o96Var.c;
                        while (i < i5) {
                            byte b = bArr[i];
                            if (b != i3 && b != i4) {
                                i++;
                            }
                            i2 = o96Var.b;
                        }
                        j2 = (o96Var.c - o96Var.b) + j;
                        o96Var = o96Var.f;
                        o96Var.getClass();
                        j = j2;
                    }
                    return -1L;
                }
                byte[] h = da0Var.h();
                while (j < this.B) {
                    byte[] bArr2 = o96Var.a;
                    i = (int) ((o96Var.b + j2) - j);
                    int i6 = o96Var.c;
                    while (i < i6) {
                        byte b2 = bArr2[i];
                        for (byte b3 : h) {
                            if (b2 == b3) {
                                i2 = o96Var.b;
                            }
                        }
                        i++;
                    }
                    j2 = (o96Var.c - o96Var.b) + j;
                    o96Var = o96Var.f;
                    o96Var.getClass();
                    j = j2;
                }
                return -1L;
            }
            j = 0;
            while (true) {
                long j3 = (o96Var.c - o96Var.b) + j;
                if (j3 > 0) {
                    break;
                }
                o96Var = o96Var.f;
                o96Var.getClass();
                j = j3;
            }
            if (da0Var.d() == 2) {
                byte i7 = da0Var.i(0);
                byte i8 = da0Var.i(1);
                while (j < this.B) {
                    byte[] bArr3 = o96Var.a;
                    i = (int) ((o96Var.b + j2) - j);
                    int i9 = o96Var.c;
                    while (i < i9) {
                        byte b4 = bArr3[i];
                        if (b4 != i7 && b4 != i8) {
                            i++;
                        }
                        i2 = o96Var.b;
                    }
                    j2 = (o96Var.c - o96Var.b) + j;
                    o96Var = o96Var.f;
                    o96Var.getClass();
                    j = j2;
                }
                return -1L;
            }
            byte[] h2 = da0Var.h();
            while (j < this.B) {
                byte[] bArr4 = o96Var.a;
                i = (int) ((o96Var.b + j2) - j);
                int i10 = o96Var.c;
                while (i < i10) {
                    byte b5 = bArr4[i];
                    for (byte b6 : h2) {
                        if (b5 == b6) {
                            i2 = o96Var.b;
                        }
                    }
                    i++;
                }
                j2 = (o96Var.c - o96Var.b) + j;
                o96Var = o96Var.f;
                o96Var.getClass();
                j = j2;
            }
            return -1L;
            return (i - i2) + j;
        }
        return -1L;
    }

    public final boolean F(int i, long j, da0 da0Var) {
        da0Var.getClass();
        if (i >= 0 && j >= 0 && i + j <= this.B && i <= da0Var.d()) {
            if (i == 0 || b.a(this, da0Var, j, j + 1, i) != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.y80
    public final /* bridge */ /* synthetic */ y80 H(String str) {
        t0(str);
        return this;
    }

    public final i80 J(i80 i80Var) {
        i80Var.getClass();
        byte[] bArr = b.a;
        if (i80Var == hf.a) {
            i80Var = new i80();
        }
        if (i80Var.A == null) {
            i80Var.A = this;
            i80Var.B = true;
            return i80Var;
        }
        i.m("already attached to a buffer");
        return null;
    }

    @Override // defpackage.z80
    public final void K(k80 k80Var, long j) {
        long j2 = this.B;
        if (j2 >= j) {
            k80Var.O(this, j);
            return;
        }
        k80Var.O(this, j2);
        i.n();
    }

    @Override // defpackage.z80
    public final String M(Charset charset) {
        charset.getClass();
        return a0(this.B, charset);
    }

    public final byte[] N(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.B >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            i.n();
            return null;
        }
        i.f(lb1.h(j, "byteCount: "));
        return null;
    }

    @Override // defpackage.ui6
    public final void O(k80 k80Var, long j) {
        o96 o96Var;
        o96 o96Var2;
        o96 b;
        int i;
        k80Var.getClass();
        if (k80Var != this) {
            hf.D(k80Var.B, 0L, j);
            while (j > 0) {
                o96 o96Var3 = k80Var.A;
                o96Var3.getClass();
                int i2 = o96Var3.c;
                k80Var.A.getClass();
                int i3 = (j > (i2 - o96Var.b) ? 1 : (j == (i2 - o96Var.b) ? 0 : -1));
                int i4 = 0;
                if (i3 < 0) {
                    o96 o96Var4 = this.A;
                    if (o96Var4 != null) {
                        o96Var2 = o96Var4.g;
                    } else {
                        o96Var2 = null;
                    }
                    if (o96Var2 != null && o96Var2.e) {
                        long j2 = o96Var2.c + j;
                        if (o96Var2.d) {
                            i = 0;
                        } else {
                            i = o96Var2.b;
                        }
                        if (j2 - i <= 8192) {
                            o96 o96Var5 = k80Var.A;
                            o96Var5.getClass();
                            o96Var5.d(o96Var2, (int) j);
                            k80Var.B -= j;
                            this.B += j;
                            return;
                        }
                    }
                    o96 o96Var6 = k80Var.A;
                    o96Var6.getClass();
                    int i5 = (int) j;
                    if (i5 > 0 && i5 <= o96Var6.c - o96Var6.b) {
                        if (i5 >= 1024) {
                            b = o96Var6.c();
                        } else {
                            b = r96.b();
                            byte[] bArr = o96Var6.a;
                            byte[] bArr2 = b.a;
                            int i6 = o96Var6.b;
                            fv.u0(i6, i6 + i5, 2, bArr, bArr2);
                        }
                        b.c = b.b + i5;
                        o96Var6.b += i5;
                        o96 o96Var7 = o96Var6.g;
                        o96Var7.getClass();
                        o96Var7.b(b);
                        k80Var.A = b;
                    } else {
                        i.h("byteCount out of range");
                        return;
                    }
                }
                o96 o96Var8 = k80Var.A;
                o96Var8.getClass();
                long j3 = o96Var8.c - o96Var8.b;
                k80Var.A = o96Var8.a();
                o96 o96Var9 = this.A;
                if (o96Var9 == null) {
                    this.A = o96Var8;
                    o96Var8.g = o96Var8;
                    o96Var8.f = o96Var8;
                } else {
                    o96 o96Var10 = o96Var9.g;
                    o96Var10.getClass();
                    o96Var10.b(o96Var8);
                    o96 o96Var11 = o96Var8.g;
                    if (o96Var11 != o96Var8) {
                        o96Var11.getClass();
                        if (o96Var11.e) {
                            int i7 = o96Var8.c - o96Var8.b;
                            o96 o96Var12 = o96Var8.g;
                            o96Var12.getClass();
                            int i8 = 8192 - o96Var12.c;
                            o96 o96Var13 = o96Var8.g;
                            o96Var13.getClass();
                            if (!o96Var13.d) {
                                o96 o96Var14 = o96Var8.g;
                                o96Var14.getClass();
                                i4 = o96Var14.b;
                            }
                            if (i7 <= i8 + i4) {
                                o96 o96Var15 = o96Var8.g;
                                o96Var15.getClass();
                                o96Var8.d(o96Var15, i7);
                                o96Var8.a();
                                r96.a(o96Var8);
                            }
                        }
                    } else {
                        i.m("cannot compact");
                        return;
                    }
                }
                k80Var.B -= j3;
                this.B += j3;
                j -= j3;
            }
            return;
        }
        i.h("source == this");
    }

    @Override // defpackage.y80
    public final /* bridge */ /* synthetic */ y80 P(da0 da0Var) {
        k0(da0Var);
        return this;
    }

    @Override // defpackage.z80
    public final boolean T(long j) {
        if (this.B >= j) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
        r3 = r19.B - r1;
        r19.B = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
        if (r2 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
        if (r1 >= r14) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a2, code lost:
        if (r3 == r17) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
        if (r2 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a6, code lost:
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
        r1 = defpackage.i61.r(r1, " but was 0x");
        r1.append(defpackage.hf.s0(v(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
        r3 = r17;
        defpackage.i.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cd, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ce, code lost:
        if (r2 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d0, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d2, code lost:
        return -r8;
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [k80, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long U() {
        long j;
        byte b;
        long j2 = 0;
        if (this.B != 0) {
            int i = 0;
            boolean z = false;
            long j3 = 0;
            long j4 = -7;
            boolean z2 = false;
            loop0: while (true) {
                o96 o96Var = this.A;
                o96Var.getClass();
                byte[] bArr = o96Var.a;
                int i2 = o96Var.b;
                int i3 = o96Var.c;
                while (i2 < i3) {
                    b = bArr[i2];
                    if (b >= 48 && b <= 57) {
                        int i4 = 48 - b;
                        int i5 = (j3 > (-922337203685477580L) ? 1 : (j3 == (-922337203685477580L) ? 0 : -1));
                        if (i5 < 0) {
                            break loop0;
                        }
                        j = j2;
                        if (i5 == 0 && i4 < j4) {
                            break loop0;
                        }
                        j3 = (j3 * 10) + i4;
                    } else {
                        j = j2;
                        if (b == 45 && i == 0) {
                            j4--;
                            z = true;
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    i2++;
                    i++;
                    j2 = j;
                }
                j = j2;
                if (i2 == i3) {
                    this.A = o96Var.a();
                    r96.a(o96Var);
                } else {
                    o96Var.b = i2;
                }
                if (z2 || this.A == null) {
                    break;
                }
                j2 = j;
            }
            ?? obj = new Object();
            obj.o0(j3);
            obj.n0(b);
            if (!z) {
                obj.readByte();
            }
            throw new NumberFormatException("Number too large: ".concat(obj.c0()));
        }
        i.n();
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[EDGE_INSN: B:41:0x008d->B:37:0x008d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v2, types: [k80, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long X() {
        int i;
        if (this.B != 0) {
            int i2 = 0;
            boolean z = false;
            long j = 0;
            do {
                o96 o96Var = this.A;
                o96Var.getClass();
                byte[] bArr = o96Var.a;
                int i3 = o96Var.b;
                int i4 = o96Var.c;
                while (i3 < i4) {
                    byte b = bArr[i3];
                    if (b >= 48 && b <= 57) {
                        i = b - 48;
                    } else if (b >= 97 && b <= 102) {
                        i = b - 87;
                    } else if (b >= 65 && b <= 70) {
                        i = b - 55;
                    } else if (i2 != 0) {
                        z = true;
                        if (i3 != i4) {
                            this.A = o96Var.a();
                            r96.a(o96Var);
                        } else {
                            o96Var.b = i3;
                        }
                        if (!z) {
                            break;
                        }
                    } else {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(hf.s0(b)));
                    }
                    if (((-1152921504606846976L) & j) == 0) {
                        j = (j << 4) | i;
                        i3++;
                        i2++;
                    } else {
                        ?? obj = new Object();
                        obj.p0(j);
                        obj.n0(b);
                        throw new NumberFormatException("Number too large: ".concat(obj.c0()));
                    }
                }
                if (i3 != i4) {
                }
                if (!z) {
                }
            } while (this.A != null);
            this.B -= i2;
            return j;
        }
        i.n();
        return 0L;
    }

    public final short Z() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public final String a0(long j, Charset charset) {
        charset.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= 2147483647L) {
            if (this.B >= j) {
                if (i == 0) {
                    return "";
                }
                o96 o96Var = this.A;
                o96Var.getClass();
                int i2 = o96Var.b;
                if (i2 + j > o96Var.c) {
                    return new String(N(j), charset);
                }
                int i3 = (int) j;
                String str = new String(o96Var.a, i2, i3, charset);
                int i4 = o96Var.b + i3;
                o96Var.b = i4;
                this.B -= j;
                if (i4 == o96Var.c) {
                    this.A = o96Var.a();
                    r96.a(o96Var);
                }
                return str;
            }
            i.n();
            return null;
        }
        i.f(lb1.h(j, "byteCount: "));
        return null;
    }

    @Override // defpackage.in6
    public final b67 b() {
        return b67.d;
    }

    @Override // defpackage.in6
    public final long b0(k80 k80Var, long j) {
        k80Var.getClass();
        if (j >= 0) {
            long j2 = this.B;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            k80Var.O(this, j);
            return j;
        }
        i.f(lb1.h(j, "byteCount < 0: "));
        return 0L;
    }

    public final String c0() {
        return a0(this.B, qm0.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k80, java.lang.Object] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.B == 0) {
            return obj;
        }
        o96 o96Var = this.A;
        o96Var.getClass();
        o96 c = o96Var.c();
        obj.A = c;
        c.g = c;
        c.f = c;
        for (o96 o96Var2 = o96Var.f; o96Var2 != o96Var; o96Var2 = o96Var2.f) {
            o96 o96Var3 = c.g;
            o96Var3.getClass();
            o96Var2.getClass();
            o96Var3.b(o96Var2.c());
        }
        obj.B = this.B;
        return obj;
    }

    public final void e() {
        skip(this.B);
    }

    public final da0 e0(int i) {
        if (i == 0) {
            return da0.R;
        }
        hf.D(this.B, 0L, i);
        o96 o96Var = this.A;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            o96Var.getClass();
            int i5 = o96Var.c;
            int i6 = o96Var.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                o96Var = o96Var.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        o96 o96Var2 = this.A;
        int i7 = 0;
        while (i2 < i) {
            o96Var2.getClass();
            bArr[i7] = o96Var2.a;
            i2 += o96Var2.c - o96Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = o96Var2.b;
            o96Var2.d = true;
            i7++;
            o96Var2 = o96Var2.f;
        }
        return new s96(bArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k80)) {
            return false;
        }
        long j = this.B;
        k80 k80Var = (k80) obj;
        if (j != k80Var.B) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        o96 o96Var = this.A;
        o96Var.getClass();
        o96 o96Var2 = k80Var.A;
        o96Var2.getClass();
        int i = o96Var.b;
        int i2 = o96Var2.b;
        long j2 = 0;
        while (j2 < this.B) {
            long min = Math.min(o96Var.c - i, o96Var2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (o96Var.a[i] != o96Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == o96Var.c) {
                o96Var = o96Var.f;
                o96Var.getClass();
                i = o96Var.b;
            }
            if (i2 == o96Var2.c) {
                o96Var2 = o96Var2.f;
                o96Var2.getClass();
                i2 = o96Var2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // defpackage.z80
    public final void g0(long j) {
        if (this.B >= j) {
            return;
        }
        i.n();
    }

    @Override // defpackage.y80
    public final /* bridge */ /* synthetic */ y80 h0(long j) {
        o0(j);
        return this;
    }

    public final int hashCode() {
        o96 o96Var = this.A;
        if (o96Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = o96Var.c;
            for (int i3 = o96Var.b; i3 < i2; i3++) {
                i = (i * 31) + o96Var.a[i3];
            }
            o96Var = o96Var.f;
            o96Var.getClass();
        } while (o96Var != this.A);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final o96 j0(int i) {
        if (i >= 1 && i <= 8192) {
            o96 o96Var = this.A;
            if (o96Var == null) {
                o96 b = r96.b();
                this.A = b;
                b.g = b;
                b.f = b;
                return b;
            }
            o96 o96Var2 = o96Var.g;
            o96Var2.getClass();
            if (o96Var2.c + i <= 8192 && o96Var2.e) {
                return o96Var2;
            }
            o96 b2 = r96.b();
            o96Var2.b(b2);
            return b2;
        }
        i.h("unexpected capacity");
        return null;
    }

    public final long k() {
        long j = this.B;
        if (j == 0) {
            return 0L;
        }
        o96 o96Var = this.A;
        o96Var.getClass();
        o96 o96Var2 = o96Var.g;
        o96Var2.getClass();
        int i = o96Var2.c;
        if (i < 8192 && o96Var2.e) {
            return j - (i - o96Var2.b);
        }
        return j;
    }

    public final void k0(da0 da0Var) {
        da0Var.getClass();
        da0Var.t(this, da0Var.d());
    }

    @Override // defpackage.z80
    public final da0 l(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.B >= j) {
                if (j >= 4096) {
                    da0 e0 = e0((int) j);
                    skip(j);
                    return e0;
                }
                return new da0(N(j));
            }
            i.n();
            return null;
        }
        i.f(lb1.h(j, "byteCount: "));
        return null;
    }

    public final void l0(byte[] bArr, int i) {
        bArr.getClass();
        long j = i;
        hf.D(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            o96 j0 = j0(1);
            int min = Math.min(i - i2, 8192 - j0.c);
            int i3 = i2 + min;
            fv.q0(j0.c, i2, i3, bArr, j0.a);
            j0.c += min;
            i2 = i3;
        }
        this.B += j;
    }

    public final void m0(in6 in6Var) {
        in6Var.getClass();
        do {
        } while (in6Var.b0(this, 8192L) != -1);
    }

    public final void n(k80 k80Var, long j, long j2) {
        k80Var.getClass();
        long j3 = j;
        hf.D(this.B, j3, j2);
        if (j2 != 0) {
            k80Var.B += j2;
            o96 o96Var = this.A;
            while (true) {
                o96Var.getClass();
                long j4 = o96Var.c - o96Var.b;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                o96Var = o96Var.f;
            }
            long j5 = j2;
            while (j5 > 0) {
                o96Var.getClass();
                o96 c = o96Var.c();
                int i = c.b + ((int) j3);
                c.b = i;
                c.c = Math.min(i + ((int) j5), c.c);
                o96 o96Var2 = k80Var.A;
                if (o96Var2 == null) {
                    c.g = c;
                    c.f = c;
                    k80Var.A = c;
                } else {
                    o96 o96Var3 = o96Var2.g;
                    o96Var3.getClass();
                    o96Var3.b(c);
                }
                j5 -= c.c - c.b;
                o96Var = o96Var.f;
                j3 = 0;
            }
        }
    }

    public final void n0(int i) {
        o96 j0 = j0(1);
        byte[] bArr = j0.a;
        int i2 = j0.c;
        j0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.B++;
    }

    public final void o0(long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            n0(48);
            return;
        }
        int i2 = 0;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                t0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        if (j > b.b[numberOfLeadingZeros]) {
            i2 = 1;
        }
        int i3 = numberOfLeadingZeros + i2;
        if (z) {
            i3++;
        }
        o96 j0 = j0(i3);
        byte[] bArr2 = j0.a;
        int i4 = j0.c + i3;
        while (j != 0) {
            i4--;
            bArr2[i4] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i4 - 1] = 45;
        }
        j0.c += i3;
        this.B += i3;
    }

    public final void p0(long j) {
        if (j == 0) {
            n0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        o96 j0 = j0(i);
        byte[] bArr = j0.a;
        int i2 = j0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        j0.c += i;
        this.B += i;
    }

    @Override // defpackage.z80
    public final byte[] q() {
        return N(this.B);
    }

    public final void q0(int i) {
        o96 j0 = j0(4);
        byte[] bArr = j0.a;
        int i2 = j0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        j0.c = i2 + 4;
        this.B += 4;
    }

    public final void r0(int i) {
        o96 j0 = j0(2);
        byte[] bArr = j0.a;
        int i2 = j0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        j0.c = i2 + 2;
        this.B += 2;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        hf.D(bArr.length, i, i2);
        o96 o96Var = this.A;
        if (o96Var == null) {
            return -1;
        }
        int min = Math.min(i2, o96Var.c - o96Var.b);
        byte[] bArr2 = o96Var.a;
        int i3 = o96Var.b;
        fv.q0(i, i3, i3 + min, bArr2, bArr);
        int i4 = o96Var.b + min;
        o96Var.b = i4;
        this.B -= min;
        if (i4 == o96Var.c) {
            this.A = o96Var.a();
            r96.a(o96Var);
        }
        return min;
    }

    @Override // defpackage.z80
    public final byte readByte() {
        if (this.B != 0) {
            o96 o96Var = this.A;
            o96Var.getClass();
            int i = o96Var.b;
            int i2 = o96Var.c;
            int i3 = i + 1;
            byte b = o96Var.a[i];
            this.B--;
            if (i3 == i2) {
                this.A = o96Var.a();
                r96.a(o96Var);
                return b;
            }
            o96Var.b = i3;
            return b;
        }
        i.n();
        return (byte) 0;
    }

    @Override // defpackage.z80
    public final void readFully(byte[] bArr) {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                i.n();
                return;
            }
        }
    }

    @Override // defpackage.z80
    public final int readInt() {
        if (this.B >= 4) {
            o96 o96Var = this.A;
            o96Var.getClass();
            int i = o96Var.b;
            int i2 = o96Var.c;
            if (i2 - i < 4) {
                return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
            }
            byte[] bArr = o96Var.a;
            int i3 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i4 = i + 3;
            int i5 = i + 4;
            int i6 = (bArr[i4] & 255) | i3 | ((bArr[i + 2] & 255) << 8);
            this.B -= 4;
            if (i5 == i2) {
                this.A = o96Var.a();
                r96.a(o96Var);
                return i6;
            }
            o96Var.b = i5;
            return i6;
        }
        i.n();
        return 0;
    }

    @Override // defpackage.z80
    public final long readLong() {
        if (this.B >= 8) {
            o96 o96Var = this.A;
            o96Var.getClass();
            int i = o96Var.b;
            int i2 = o96Var.c;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = o96Var.a;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40);
            int i3 = i + 7;
            int i4 = i + 8;
            long j2 = j | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i3] & 255);
            this.B -= 8;
            if (i4 == i2) {
                this.A = o96Var.a();
                r96.a(o96Var);
                return j2;
            }
            o96Var.b = i4;
            return j2;
        }
        i.n();
        return 0L;
    }

    @Override // defpackage.z80
    public final short readShort() {
        if (this.B >= 2) {
            o96 o96Var = this.A;
            o96Var.getClass();
            int i = o96Var.b;
            int i2 = o96Var.c;
            if (i2 - i < 2) {
                return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
            }
            byte[] bArr = o96Var.a;
            int i3 = i + 1;
            int i4 = i + 2;
            int i5 = (bArr[i3] & 255) | ((bArr[i] & 255) << 8);
            this.B -= 2;
            if (i4 == i2) {
                this.A = o96Var.a();
                r96.a(o96Var);
            } else {
                o96Var.b = i4;
            }
            return (short) i5;
        }
        i.n();
        return (short) 0;
    }

    public final void s0(int i, int i2, String str) {
        char charAt;
        char c;
        str.getClass();
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            o96 j0 = j0(1);
                            byte[] bArr = j0.a;
                            int i3 = j0.c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = j0.c;
                            int i6 = (i3 + i) - i5;
                            j0.c = i5 + i6;
                            this.B += i6;
                        } else {
                            if (charAt2 < 2048) {
                                o96 j02 = j0(2);
                                byte[] bArr2 = j02.a;
                                int i7 = j02.c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                j02.c = i7 + 2;
                                this.B += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = str.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c && c < 57344) {
                                    int i9 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                                    o96 j03 = j0(4);
                                    byte[] bArr3 = j03.a;
                                    int i10 = j03.c;
                                    bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                    bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                    bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                    j03.c = i10 + 4;
                                    this.B += 4;
                                    i += 2;
                                } else {
                                    n0(63);
                                    i = i8;
                                }
                            } else {
                                o96 j04 = j0(3);
                                byte[] bArr4 = j04.a;
                                int i11 = j04.c;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                j04.c = i11 + 3;
                                this.B += 3;
                            }
                            i++;
                        }
                    }
                    return;
                }
                StringBuilder t = xg6.t("endIndex > string.length: ", i2, " > ");
                t.append(str.length());
                throw new IllegalArgumentException(t.toString().toString());
            }
            i.f(lb1.j("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        i.f(lb1.g(i, "beginIndex < 0: "));
    }

    @Override // defpackage.z80
    public final void skip(long j) {
        while (j > 0) {
            o96 o96Var = this.A;
            if (o96Var != null) {
                int min = (int) Math.min(j, o96Var.c - o96Var.b);
                long j2 = min;
                this.B -= j2;
                j -= j2;
                int i = o96Var.b + min;
                o96Var.b = i;
                if (i == o96Var.c) {
                    this.A = o96Var.a();
                    r96.a(o96Var);
                }
            } else {
                i.n();
                return;
            }
        }
    }

    @Override // defpackage.z80
    public final int t(eo4 eo4Var) {
        eo4Var.getClass();
        int d = b.d(this, eo4Var, false);
        if (d == -1) {
            return -1;
        }
        skip(eo4Var.A[d].d());
        return d;
    }

    public final void t0(String str) {
        str.getClass();
        s0(0, str.length(), str);
    }

    public final String toString() {
        long j = this.B;
        if (j <= 2147483647L) {
            return e0((int) j).toString();
        }
        long j2 = this.B;
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + j2).toString());
    }

    public final boolean u() {
        if (this.B == 0) {
            return true;
        }
        return false;
    }

    public final void u0(int i) {
        if (i < 128) {
            n0(i);
        } else if (i < 2048) {
            o96 j0 = j0(2);
            byte[] bArr = j0.a;
            int i2 = j0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            j0.c = i2 + 2;
            this.B += 2;
        } else if (55296 <= i && i < 57344) {
            n0(63);
        } else if (i < 65536) {
            o96 j02 = j0(3);
            byte[] bArr2 = j02.a;
            int i3 = j02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            j02.c = i3 + 3;
            this.B += 3;
        } else if (i <= 1114111) {
            o96 j03 = j0(4);
            byte[] bArr3 = j03.a;
            int i4 = j03.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            j03.c = i4 + 4;
            this.B += 4;
        } else {
            i.h("Unexpected code point: 0x".concat(hf.t0(i)));
        }
    }

    public final byte v(long j) {
        hf.D(this.B, j, 1L);
        o96 o96Var = this.A;
        o96Var.getClass();
        long j2 = this.B;
        if (j2 - j < j) {
            while (j2 > j) {
                o96Var = o96Var.g;
                o96Var.getClass();
                j2 -= o96Var.c - o96Var.b;
            }
            return o96Var.a[(int) ((o96Var.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = o96Var.c;
            int i2 = o96Var.b;
            long j4 = (i - i2) + j3;
            if (j4 <= j) {
                o96Var = o96Var.f;
                o96Var.getClass();
                j3 = j4;
            } else {
                return o96Var.a[(int) ((i2 + j) - j3)];
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            o96 j0 = j0(1);
            int min = Math.min(i, 8192 - j0.c);
            byteBuffer.get(j0.a, j0.c, min);
            i -= min;
            j0.c += min;
        }
        this.B += remaining;
        return remaining;
    }

    @Override // defpackage.y80
    public final /* bridge */ /* synthetic */ y80 writeByte(int i) {
        n0(i);
        return this;
    }

    @Override // defpackage.y80
    public final /* bridge */ /* synthetic */ y80 writeInt(int i) {
        q0(i);
        return this;
    }

    @Override // defpackage.y80
    public final /* bridge */ /* synthetic */ y80 writeShort(int i) {
        r0(i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [k80, java.lang.Object] */
    @Override // defpackage.z80
    public final String y(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long j3 = j2;
            long A = A((byte) 10, 0L, j3);
            if (A != -1) {
                return b.c(this, A);
            }
            if (j3 < this.B && v(j3 - 1) == 13 && v(j3) == 10) {
                return b.c(this, j3);
            }
            ?? obj = new Object();
            n(obj, 0L, Math.min(32L, this.B));
            long min = Math.min(this.B, j);
            String e = obj.l(obj.B).e();
            throw new EOFException("\\n not found: limit=" + min + " content=" + e + (char) 8230);
        }
        i.f(lb1.h(j, "limit < 0: "));
        return null;
    }

    @Override // defpackage.z80
    public final k80 a() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.ui6
    public final void close() {
    }

    @Override // defpackage.y80, defpackage.ui6, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.y80
    public final y80 write(byte[] bArr) {
        bArr.getClass();
        l0(bArr, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        o96 o96Var = this.A;
        if (o96Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), o96Var.c - o96Var.b);
        byteBuffer.put(o96Var.a, o96Var.b, min);
        int i = o96Var.b + min;
        o96Var.b = i;
        this.B -= min;
        if (i == o96Var.c) {
            this.A = o96Var.a();
            r96.a(o96Var);
        }
        return min;
    }
}
