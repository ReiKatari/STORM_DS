package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f60  reason: default package */
/* loaded from: classes.dex */
public final class f60 implements u60, t60, Cloneable, ByteChannel {
    public cy5 A;
    public long B;

    public final void B(f60 f60Var, long j, long j2) {
        f60Var.getClass();
        long j3 = j;
        a53.q(this.B, j3, j2);
        if (j2 != 0) {
            f60Var.B += j2;
            cy5 cy5Var = this.A;
            while (true) {
                cy5Var.getClass();
                long j4 = cy5Var.c - cy5Var.b;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                cy5Var = cy5Var.f;
            }
            long j5 = j2;
            while (j5 > 0) {
                cy5Var.getClass();
                cy5 c = cy5Var.c();
                int i = c.b + ((int) j3);
                c.b = i;
                c.c = Math.min(i + ((int) j5), c.c);
                cy5 cy5Var2 = f60Var.A;
                if (cy5Var2 == null) {
                    c.g = c;
                    c.f = c;
                    f60Var.A = c;
                } else {
                    cy5 cy5Var3 = cy5Var2.g;
                    cy5Var3.getClass();
                    cy5Var3.b(c);
                }
                j5 -= c.c - c.b;
                cy5Var = cy5Var.f;
                j3 = 0;
            }
        }
    }

    public final boolean C() {
        if (this.B == 0) {
            return true;
        }
        return false;
    }

    public final byte D(long j) {
        a53.q(this.B, j, 1L);
        cy5 cy5Var = this.A;
        cy5Var.getClass();
        long j2 = this.B;
        if (j2 - j < j) {
            while (j2 > j) {
                cy5Var = cy5Var.g;
                cy5Var.getClass();
                j2 -= cy5Var.c - cy5Var.b;
            }
            return cy5Var.a[(int) ((cy5Var.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = cy5Var.c;
            int i2 = cy5Var.b;
            long j4 = (i - i2) + j3;
            if (j4 <= j) {
                cy5Var = cy5Var.f;
                cy5Var.getClass();
                j3 = j4;
            } else {
                return cy5Var.a[(int) ((i2 + j) - j3)];
            }
        }
    }

    public final long F(byte b, long j, long j2) {
        cy5 cy5Var;
        long j3 = 0;
        if (0 <= j && j <= j2) {
            long j4 = this.B;
            if (j2 > j4) {
                j2 = j4;
            }
            if (j != j2 && (cy5Var = this.A) != null) {
                if (j4 - j < j) {
                    while (j4 > j) {
                        cy5Var = cy5Var.g;
                        cy5Var.getClass();
                        j4 -= cy5Var.c - cy5Var.b;
                    }
                    while (j4 < j2) {
                        byte[] bArr = cy5Var.a;
                        int min = (int) Math.min(cy5Var.c, (cy5Var.b + j2) - j4);
                        for (int i = (int) ((cy5Var.b + j) - j4); i < min; i++) {
                            if (bArr[i] == b) {
                                return (i - cy5Var.b) + j4;
                            }
                        }
                        j4 += cy5Var.c - cy5Var.b;
                        cy5Var = cy5Var.f;
                        cy5Var.getClass();
                        j = j4;
                    }
                    return -1L;
                }
                while (true) {
                    long j5 = (cy5Var.c - cy5Var.b) + j3;
                    if (j5 > j) {
                        break;
                    }
                    cy5Var = cy5Var.f;
                    cy5Var.getClass();
                    j3 = j5;
                }
                while (j3 < j2) {
                    byte[] bArr2 = cy5Var.a;
                    int min2 = (int) Math.min(cy5Var.c, (cy5Var.b + j2) - j3);
                    for (int i2 = (int) ((cy5Var.b + j) - j3); i2 < min2; i2++) {
                        if (bArr2[i2] == b) {
                            return (i2 - cy5Var.b) + j3;
                        }
                    }
                    j3 += cy5Var.c - cy5Var.b;
                    cy5Var = cy5Var.f;
                    cy5Var.getClass();
                    j = j3;
                }
                return -1L;
            }
            return -1L;
        }
        StringBuilder sb = new StringBuilder("size=");
        sb.append(this.B);
        ej6.k(sb, " fromIndex=", j, " toIndex=");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // defpackage.u60
    public final int H(cf4 cf4Var) {
        cf4Var.getClass();
        int d = b.d(this, cf4Var, false);
        if (d == -1) {
            return -1;
        }
        skip(cf4Var.A[d].d());
        return d;
    }

    public final long I(w70 w70Var) {
        int i;
        int i2;
        w70Var.getClass();
        cy5 cy5Var = this.A;
        if (cy5Var != null) {
            long j = this.B;
            long j2 = 0;
            if (j < 0) {
                while (j > 0) {
                    cy5Var = cy5Var.g;
                    cy5Var.getClass();
                    j -= cy5Var.c - cy5Var.b;
                }
                if (w70Var.d() == 2) {
                    byte i3 = w70Var.i(0);
                    byte i4 = w70Var.i(1);
                    while (j < this.B) {
                        byte[] bArr = cy5Var.a;
                        i = (int) ((cy5Var.b + j2) - j);
                        int i5 = cy5Var.c;
                        while (i < i5) {
                            byte b = bArr[i];
                            if (b != i3 && b != i4) {
                                i++;
                            }
                            i2 = cy5Var.b;
                        }
                        j2 = (cy5Var.c - cy5Var.b) + j;
                        cy5Var = cy5Var.f;
                        cy5Var.getClass();
                        j = j2;
                    }
                    return -1L;
                }
                byte[] h = w70Var.h();
                while (j < this.B) {
                    byte[] bArr2 = cy5Var.a;
                    i = (int) ((cy5Var.b + j2) - j);
                    int i6 = cy5Var.c;
                    while (i < i6) {
                        byte b2 = bArr2[i];
                        for (byte b3 : h) {
                            if (b2 == b3) {
                                i2 = cy5Var.b;
                            }
                        }
                        i++;
                    }
                    j2 = (cy5Var.c - cy5Var.b) + j;
                    cy5Var = cy5Var.f;
                    cy5Var.getClass();
                    j = j2;
                }
                return -1L;
            }
            j = 0;
            while (true) {
                long j3 = (cy5Var.c - cy5Var.b) + j;
                if (j3 > 0) {
                    break;
                }
                cy5Var = cy5Var.f;
                cy5Var.getClass();
                j = j3;
            }
            if (w70Var.d() == 2) {
                byte i7 = w70Var.i(0);
                byte i8 = w70Var.i(1);
                while (j < this.B) {
                    byte[] bArr3 = cy5Var.a;
                    i = (int) ((cy5Var.b + j2) - j);
                    int i9 = cy5Var.c;
                    while (i < i9) {
                        byte b4 = bArr3[i];
                        if (b4 != i7 && b4 != i8) {
                            i++;
                        }
                        i2 = cy5Var.b;
                    }
                    j2 = (cy5Var.c - cy5Var.b) + j;
                    cy5Var = cy5Var.f;
                    cy5Var.getClass();
                    j = j2;
                }
                return -1L;
            }
            byte[] h2 = w70Var.h();
            while (j < this.B) {
                byte[] bArr4 = cy5Var.a;
                i = (int) ((cy5Var.b + j2) - j);
                int i10 = cy5Var.c;
                while (i < i10) {
                    byte b5 = bArr4[i];
                    for (byte b6 : h2) {
                        if (b5 == b6) {
                            i2 = cy5Var.b;
                        }
                    }
                    i++;
                }
                j2 = (cy5Var.c - cy5Var.b) + j;
                cy5Var = cy5Var.f;
                cy5Var.getClass();
                j = j2;
            }
            return -1L;
            return (i - i2) + j;
        }
        return -1L;
    }

    public final boolean J(long j, w70 w70Var, int i) {
        w70Var.getClass();
        if (i >= 0 && j >= 0 && i + j <= this.B && i <= w70Var.d()) {
            if (i == 0 || b.a(this, w70Var, j, j + 1, i) != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final byte[] K(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.B >= j) {
                int i = (int) j;
                byte[] bArr = new byte[i];
                int i2 = 0;
                while (i2 < i) {
                    int read = read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        i.l();
                        return null;
                    }
                }
                return bArr;
            }
            i.l();
            return null;
        }
        i.g(wh1.h(j, "byteCount: "));
        return null;
    }

    @Override // defpackage.sb6
    public final long L(f60 f60Var, long j) {
        f60Var.getClass();
        if (j >= 0) {
            long j2 = this.B;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            f60Var.l(this, j);
            return j;
        }
        i.g(wh1.h(j, "byteCount < 0: "));
        return 0L;
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
        r1 = defpackage.b31.t(r1, " but was 0x");
        r1.append(defpackage.a53.S(D(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
        r3 = r17;
        defpackage.i.l();
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
    /* JADX WARN: Type inference failed for: r0v5, types: [f60, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long N() {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f60.N():long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [f60, java.lang.Object] */
    @Override // defpackage.u60
    public final String O(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long j3 = j2;
            long F = F((byte) 10, 0L, j3);
            if (F != -1) {
                return b.c(this, F);
            }
            if (j3 < this.B && D(j3 - 1) == 13 && D(j3) == 10) {
                return b.c(this, j3);
            }
            ?? obj = new Object();
            B(obj, 0L, Math.min(32L, this.B));
            long min = Math.min(this.B, j);
            String e = obj.r(obj.B).e();
            throw new EOFException("\\n not found: limit=" + min + " content=" + e + (char) 8230);
        }
        i.g(wh1.h(j, "limit < 0: "));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[EDGE_INSN: B:41:0x008d->B:37:0x008d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v2, types: [f60, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Q() {
        /*
            r14 = this;
            long r0 = r14.B
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            cy5 r6 = r14.A
            r6.getClass()
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L16:
            if (r8 >= r9) goto L79
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L25
            r11 = 57
            if (r10 > r11) goto L25
            int r11 = r10 + (-48)
            goto L3a
        L25:
            r11 = 97
            if (r10 < r11) goto L30
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L30
            int r11 = r10 + (-87)
            goto L3a
        L30:
            r11 = 65
            if (r10 < r11) goto L65
            r11 = 70
            if (r10 > r11) goto L65
            int r11 = r10 + (-55)
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L4a:
            f60 r14 = new f60
            r14.<init>()
            r14.o0(r4)
            r14.m0(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r14 = r14.V()
            java.lang.String r1 = "Number too large: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.String r0 = defpackage.a53.S(r10)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r14.<init>(r0)
            throw r14
        L79:
            if (r8 != r9) goto L85
            cy5 r7 = r6.a()
            r14.A = r7
            defpackage.fy5.a(r6)
            goto L87
        L85:
            r6.b = r8
        L87:
            if (r1 != 0) goto L8d
            cy5 r6 = r14.A
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r14.B
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.B = r1
            return r4
        L94:
            defpackage.i.l()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f60.Q():long");
    }

    public final short R() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // defpackage.u60
    public final long S(t60 t60Var) {
        long j = this.B;
        if (j > 0) {
            t60Var.l(this, j);
        }
        return j;
    }

    public final String T(long j, Charset charset) {
        charset.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= 2147483647L) {
            if (this.B >= j) {
                if (i == 0) {
                    return "";
                }
                cy5 cy5Var = this.A;
                cy5Var.getClass();
                int i2 = cy5Var.b;
                if (i2 + j > cy5Var.c) {
                    return new String(K(j), charset);
                }
                int i3 = (int) j;
                String str = new String(cy5Var.a, i2, i3, charset);
                int i4 = cy5Var.b + i3;
                cy5Var.b = i4;
                this.B -= j;
                if (i4 == cy5Var.c) {
                    this.A = cy5Var.a();
                    fy5.a(cy5Var);
                }
                return str;
            }
            i.l();
            return null;
        }
        i.g(wh1.h(j, "byteCount: "));
        return null;
    }

    public final String V() {
        return T(this.B, hk0.a);
    }

    @Override // defpackage.t60
    public final /* bridge */ /* synthetic */ t60 Y(int i, byte[] bArr) {
        j0(i, bArr);
        return this;
    }

    public final w70 Z(int i) {
        if (i == 0) {
            return w70.R;
        }
        a53.q(this.B, 0L, i);
        cy5 cy5Var = this.A;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            cy5Var.getClass();
            int i5 = cy5Var.c;
            int i6 = cy5Var.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                cy5Var = cy5Var.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        cy5 cy5Var2 = this.A;
        int i7 = 0;
        while (i2 < i) {
            cy5Var2.getClass();
            bArr[i7] = cy5Var2.a;
            i2 += cy5Var2.c - cy5Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = cy5Var2.b;
            cy5Var2.d = true;
            i7++;
            cy5Var2 = cy5Var2.f;
        }
        return new gy5(bArr, iArr);
    }

    @Override // defpackage.u60
    public final void b0(long j) {
        if (this.B >= j) {
            return;
        }
        i.l();
    }

    @Override // defpackage.t60
    public final /* bridge */ /* synthetic */ t60 c0(String str) {
        s0(str);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f60, java.lang.Object] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.B == 0) {
            return obj;
        }
        cy5 cy5Var = this.A;
        cy5Var.getClass();
        cy5 c = cy5Var.c();
        obj.A = c;
        c.g = c;
        c.f = c;
        for (cy5 cy5Var2 = cy5Var.f; cy5Var2 != cy5Var; cy5Var2 = cy5Var2.f) {
            cy5 cy5Var3 = c.g;
            cy5Var3.getClass();
            cy5Var2.getClass();
            cy5Var3.b(cy5Var2.c());
        }
        obj.B = this.B;
        return obj;
    }

    @Override // defpackage.t60
    public final /* bridge */ /* synthetic */ t60 d0(long j) {
        n0(j);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f60)) {
            return false;
        }
        long j = this.B;
        f60 f60Var = (f60) obj;
        if (j != f60Var.B) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        cy5 cy5Var = this.A;
        cy5Var.getClass();
        cy5 cy5Var2 = f60Var.A;
        cy5Var2.getClass();
        int i = cy5Var.b;
        int i2 = cy5Var2.b;
        long j2 = 0;
        while (j2 < this.B) {
            long min = Math.min(cy5Var.c - i, cy5Var2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (cy5Var.a[i] != cy5Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == cy5Var.c) {
                cy5Var = cy5Var.f;
                cy5Var.getClass();
                i = cy5Var.b;
            }
            if (i2 == cy5Var2.c) {
                cy5Var2 = cy5Var2.f;
                cy5Var2.getClass();
                i2 = cy5Var2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // defpackage.sb6
    public final kt6 f() {
        return kt6.d;
    }

    public final cy5 f0(int i) {
        if (i >= 1 && i <= 8192) {
            cy5 cy5Var = this.A;
            if (cy5Var == null) {
                cy5 b = fy5.b();
                this.A = b;
                b.g = b;
                b.f = b;
                return b;
            }
            cy5 cy5Var2 = cy5Var.g;
            cy5Var2.getClass();
            if (cy5Var2.c + i <= 8192 && cy5Var2.e) {
                return cy5Var2;
            }
            cy5 b2 = fy5.b();
            cy5Var2.b(b2);
            return b2;
        }
        i.i("unexpected capacity");
        return null;
    }

    @Override // defpackage.u60
    public final String h0(Charset charset) {
        charset.getClass();
        return T(this.B, charset);
    }

    public final int hashCode() {
        cy5 cy5Var = this.A;
        if (cy5Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = cy5Var.c;
            for (int i3 = cy5Var.b; i3 < i2; i3++) {
                i = (i * 31) + cy5Var.a[i3];
            }
            cy5Var = cy5Var.f;
            cy5Var.getClass();
        } while (cy5Var != this.A);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j0(int i, byte[] bArr) {
        bArr.getClass();
        long j = i;
        a53.q(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            cy5 f0 = f0(1);
            int min = Math.min(i - i2, 8192 - f0.c);
            int i3 = i2 + min;
            nu.c0(f0.c, i2, i3, bArr, f0.a);
            f0.c += min;
            i2 = i3;
        }
        this.B += j;
    }

    public final void k0(w70 w70Var) {
        w70Var.getClass();
        w70Var.s(this, w70Var.d());
    }

    @Override // defpackage.g76
    public final void l(f60 f60Var, long j) {
        cy5 cy5Var;
        cy5 cy5Var2;
        cy5 b;
        int i;
        f60Var.getClass();
        if (f60Var != this) {
            a53.q(f60Var.B, 0L, j);
            while (j > 0) {
                cy5 cy5Var3 = f60Var.A;
                cy5Var3.getClass();
                int i2 = cy5Var3.c;
                f60Var.A.getClass();
                int i3 = (j > (i2 - cy5Var.b) ? 1 : (j == (i2 - cy5Var.b) ? 0 : -1));
                int i4 = 0;
                if (i3 < 0) {
                    cy5 cy5Var4 = this.A;
                    if (cy5Var4 != null) {
                        cy5Var2 = cy5Var4.g;
                    } else {
                        cy5Var2 = null;
                    }
                    if (cy5Var2 != null && cy5Var2.e) {
                        long j2 = cy5Var2.c + j;
                        if (cy5Var2.d) {
                            i = 0;
                        } else {
                            i = cy5Var2.b;
                        }
                        if (j2 - i <= 8192) {
                            cy5 cy5Var5 = f60Var.A;
                            cy5Var5.getClass();
                            cy5Var5.d(cy5Var2, (int) j);
                            f60Var.B -= j;
                            this.B += j;
                            return;
                        }
                    }
                    cy5 cy5Var6 = f60Var.A;
                    cy5Var6.getClass();
                    int i5 = (int) j;
                    if (i5 > 0 && i5 <= cy5Var6.c - cy5Var6.b) {
                        if (i5 >= 1024) {
                            b = cy5Var6.c();
                        } else {
                            b = fy5.b();
                            byte[] bArr = cy5Var6.a;
                            byte[] bArr2 = b.a;
                            int i6 = cy5Var6.b;
                            nu.g0(i6, i6 + i5, 2, bArr, bArr2);
                        }
                        b.c = b.b + i5;
                        cy5Var6.b += i5;
                        cy5 cy5Var7 = cy5Var6.g;
                        cy5Var7.getClass();
                        cy5Var7.b(b);
                        f60Var.A = b;
                    } else {
                        i.i("byteCount out of range");
                        return;
                    }
                }
                cy5 cy5Var8 = f60Var.A;
                cy5Var8.getClass();
                long j3 = cy5Var8.c - cy5Var8.b;
                f60Var.A = cy5Var8.a();
                cy5 cy5Var9 = this.A;
                if (cy5Var9 == null) {
                    this.A = cy5Var8;
                    cy5Var8.g = cy5Var8;
                    cy5Var8.f = cy5Var8;
                } else {
                    cy5 cy5Var10 = cy5Var9.g;
                    cy5Var10.getClass();
                    cy5Var10.b(cy5Var8);
                    cy5 cy5Var11 = cy5Var8.g;
                    if (cy5Var11 != cy5Var8) {
                        cy5Var11.getClass();
                        if (cy5Var11.e) {
                            int i7 = cy5Var8.c - cy5Var8.b;
                            cy5 cy5Var12 = cy5Var8.g;
                            cy5Var12.getClass();
                            int i8 = 8192 - cy5Var12.c;
                            cy5 cy5Var13 = cy5Var8.g;
                            cy5Var13.getClass();
                            if (!cy5Var13.d) {
                                cy5 cy5Var14 = cy5Var8.g;
                                cy5Var14.getClass();
                                i4 = cy5Var14.b;
                            }
                            if (i7 <= i8 + i4) {
                                cy5 cy5Var15 = cy5Var8.g;
                                cy5Var15.getClass();
                                cy5Var8.d(cy5Var15, i7);
                                cy5Var8.a();
                                fy5.a(cy5Var8);
                            }
                        }
                    } else {
                        i.n("cannot compact");
                        return;
                    }
                }
                f60Var.B -= j3;
                this.B += j3;
                j -= j3;
            }
            return;
        }
        i.i("source == this");
    }

    public final void l0(sb6 sb6Var) {
        sb6Var.getClass();
        do {
        } while (sb6Var.L(this, 8192L) != -1);
    }

    public final void m0(int i) {
        cy5 f0 = f0(1);
        byte[] bArr = f0.a;
        int i2 = f0.c;
        f0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.B++;
    }

    @Override // defpackage.t60
    public final /* bridge */ /* synthetic */ t60 n(w70 w70Var) {
        k0(w70Var);
        return this;
    }

    public final void n0(long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            m0(48);
            return;
        }
        int i2 = 0;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                s0("-9223372036854775808");
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
        cy5 f0 = f0(i3);
        byte[] bArr2 = f0.a;
        int i4 = f0.c + i3;
        while (j != 0) {
            i4--;
            bArr2[i4] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i4 - 1] = 45;
        }
        f0.c += i3;
        this.B += i3;
    }

    public final void o0(long j) {
        if (j == 0) {
            m0(48);
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
        cy5 f0 = f0(i);
        byte[] bArr = f0.a;
        int i2 = f0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        f0.c += i;
        this.B += i;
    }

    public final void p0(int i) {
        cy5 f0 = f0(4);
        byte[] bArr = f0.a;
        int i2 = f0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        f0.c = i2 + 4;
        this.B += 4;
    }

    public final void q0(int i) {
        cy5 f0 = f0(2);
        byte[] bArr = f0.a;
        int i2 = f0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        f0.c = i2 + 2;
        this.B += 2;
    }

    @Override // defpackage.u60
    public final w70 r(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.B >= j) {
                if (j >= 4096) {
                    w70 Z = Z((int) j);
                    skip(j);
                    return Z;
                }
                return new w70(K(j));
            }
            i.l();
            return null;
        }
        i.g(wh1.h(j, "byteCount: "));
        return null;
    }

    public final void r0(int i, int i2, String str) {
        char charAt;
        char c;
        str.getClass();
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            cy5 f0 = f0(1);
                            byte[] bArr = f0.a;
                            int i3 = f0.c - i;
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
                            int i5 = f0.c;
                            int i6 = (i3 + i) - i5;
                            f0.c = i5 + i6;
                            this.B += i6;
                        } else {
                            if (charAt2 < 2048) {
                                cy5 f02 = f0(2);
                                byte[] bArr2 = f02.a;
                                int i7 = f02.c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                f02.c = i7 + 2;
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
                                    cy5 f03 = f0(4);
                                    byte[] bArr3 = f03.a;
                                    int i10 = f03.c;
                                    bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                    bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                    bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                    f03.c = i10 + 4;
                                    this.B += 4;
                                    i += 2;
                                } else {
                                    m0(63);
                                    i = i8;
                                }
                            } else {
                                cy5 f04 = f0(3);
                                byte[] bArr4 = f04.a;
                                int i11 = f04.c;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                f04.c = i11 + 3;
                                this.B += 3;
                            }
                            i++;
                        }
                    }
                    return;
                }
                StringBuilder s = wh1.s("endIndex > string.length: ", i2, " > ");
                s.append(str.length());
                throw new IllegalArgumentException(s.toString().toString());
            }
            i.g(wh1.f(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        i.g(wh1.g(i, "beginIndex < 0: "));
    }

    public final int read(byte[] bArr, int i, int i2) {
        a53.q(bArr.length, i, i2);
        cy5 cy5Var = this.A;
        if (cy5Var == null) {
            return -1;
        }
        int min = Math.min(i2, cy5Var.c - cy5Var.b);
        byte[] bArr2 = cy5Var.a;
        int i3 = cy5Var.b;
        nu.c0(i, i3, i3 + min, bArr2, bArr);
        int i4 = cy5Var.b + min;
        cy5Var.b = i4;
        this.B -= min;
        if (i4 == cy5Var.c) {
            this.A = cy5Var.a();
            fy5.a(cy5Var);
        }
        return min;
    }

    @Override // defpackage.u60
    public final byte readByte() {
        if (this.B != 0) {
            cy5 cy5Var = this.A;
            cy5Var.getClass();
            int i = cy5Var.b;
            int i2 = cy5Var.c;
            int i3 = i + 1;
            byte b = cy5Var.a[i];
            this.B--;
            if (i3 == i2) {
                this.A = cy5Var.a();
                fy5.a(cy5Var);
                return b;
            }
            cy5Var.b = i3;
            return b;
        }
        i.l();
        return (byte) 0;
    }

    @Override // defpackage.u60
    public final int readInt() {
        if (this.B >= 4) {
            cy5 cy5Var = this.A;
            cy5Var.getClass();
            int i = cy5Var.b;
            int i2 = cy5Var.c;
            if (i2 - i < 4) {
                return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
            }
            byte[] bArr = cy5Var.a;
            int i3 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i4 = i + 3;
            int i5 = i + 4;
            int i6 = (bArr[i4] & 255) | i3 | ((bArr[i + 2] & 255) << 8);
            this.B -= 4;
            if (i5 == i2) {
                this.A = cy5Var.a();
                fy5.a(cy5Var);
                return i6;
            }
            cy5Var.b = i5;
            return i6;
        }
        i.l();
        return 0;
    }

    @Override // defpackage.u60
    public final short readShort() {
        if (this.B >= 2) {
            cy5 cy5Var = this.A;
            cy5Var.getClass();
            int i = cy5Var.b;
            int i2 = cy5Var.c;
            if (i2 - i < 2) {
                return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
            }
            byte[] bArr = cy5Var.a;
            int i3 = i + 1;
            int i4 = i + 2;
            int i5 = (bArr[i3] & 255) | ((bArr[i] & 255) << 8);
            this.B -= 2;
            if (i4 == i2) {
                this.A = cy5Var.a();
                fy5.a(cy5Var);
            } else {
                cy5Var.b = i4;
            }
            return (short) i5;
        }
        i.l();
        return (short) 0;
    }

    public final void s0(String str) {
        str.getClass();
        r0(0, str.length(), str);
    }

    @Override // defpackage.u60
    public final void skip(long j) {
        while (j > 0) {
            cy5 cy5Var = this.A;
            if (cy5Var != null) {
                int min = (int) Math.min(j, cy5Var.c - cy5Var.b);
                long j2 = min;
                this.B -= j2;
                j -= j2;
                int i = cy5Var.b + min;
                cy5Var.b = i;
                if (i == cy5Var.c) {
                    this.A = cy5Var.a();
                    fy5.a(cy5Var);
                }
            } else {
                i.l();
                return;
            }
        }
    }

    public final void t0(int i) {
        if (i < 128) {
            m0(i);
        } else if (i < 2048) {
            cy5 f0 = f0(2);
            byte[] bArr = f0.a;
            int i2 = f0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            f0.c = i2 + 2;
            this.B += 2;
        } else if (55296 <= i && i < 57344) {
            m0(63);
        } else if (i < 65536) {
            cy5 f02 = f0(3);
            byte[] bArr2 = f02.a;
            int i3 = f02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            f02.c = i3 + 3;
            this.B += 3;
        } else if (i <= 1114111) {
            cy5 f03 = f0(4);
            byte[] bArr3 = f03.a;
            int i4 = f03.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            f03.c = i4 + 4;
            this.B += 4;
        } else {
            i.i("Unexpected code point: 0x".concat(a53.T(i)));
        }
    }

    public final String toString() {
        long j = this.B;
        if (j <= 2147483647L) {
            return Z((int) j).toString();
        }
        long j2 = this.B;
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + j2).toString());
    }

    @Override // defpackage.u60
    public final boolean u(long j) {
        if (this.B >= j) {
            return true;
        }
        return false;
    }

    public final void w() {
        skip(this.B);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            cy5 f0 = f0(1);
            int min = Math.min(i, 8192 - f0.c);
            byteBuffer.get(f0.a, f0.c, min);
            i -= min;
            f0.c += min;
        }
        this.B += remaining;
        return remaining;
    }

    @Override // defpackage.t60
    public final /* bridge */ /* synthetic */ t60 writeByte(int i) {
        m0(i);
        return this;
    }

    @Override // defpackage.t60
    public final /* bridge */ /* synthetic */ t60 writeInt(int i) {
        p0(i);
        return this;
    }

    @Override // defpackage.t60
    public final /* bridge */ /* synthetic */ t60 writeShort(int i) {
        q0(i);
        return this;
    }

    public final long x() {
        long j = this.B;
        if (j == 0) {
            return 0L;
        }
        cy5 cy5Var = this.A;
        cy5Var.getClass();
        cy5 cy5Var2 = cy5Var.g;
        cy5Var2.getClass();
        int i = cy5Var2.c;
        if (i < 8192 && cy5Var2.e) {
            return j - (i - cy5Var2.b);
        }
        return j;
    }

    @Override // defpackage.u60, defpackage.t60
    public final f60 b() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.g76
    public final void close() {
    }

    @Override // defpackage.t60, defpackage.g76, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.t60
    public final t60 write(byte[] bArr) {
        bArr.getClass();
        j0(bArr.length, bArr);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        cy5 cy5Var = this.A;
        if (cy5Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), cy5Var.c - cy5Var.b);
        byteBuffer.put(cy5Var.a, cy5Var.b, min);
        int i = cy5Var.b + min;
        cy5Var.b = i;
        this.B -= min;
        if (i == cy5Var.c) {
            this.A = cy5Var.a();
            fy5.a(cy5Var);
        }
        return min;
    }
}
