package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o83  reason: default package */
/* loaded from: classes.dex */
public class o83 implements Closeable {
    public final Reader A;
    public long e0;
    public int f0;
    public String g0;
    public int[] h0;
    public String[] j0;
    public int[] k0;
    public ug6 B = ug6.LEGACY_STRICT;
    public final int L = 255;
    public final char[] R = new char[1024];
    public int X = 0;
    public int Y = 0;
    public int Z = 0;
    public int c0 = 0;
    public int d0 = 0;
    public int i0 = 1;

    static {
        jo1.B = new jo1(10);
    }

    public o83(Reader reader) {
        int[] iArr = new int[32];
        this.h0 = iArr;
        iArr[0] = 6;
        this.j0 = new String[32];
        this.k0 = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.A = reader;
    }

    public void B() {
        int i = this.d0;
        if (i == 0) {
            i = w();
        }
        if (i == 2) {
            int i2 = this.i0;
            int i3 = i2 - 1;
            this.i0 = i3;
            this.j0[i3] = null;
            int[] iArr = this.k0;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.d0 = 0;
            return;
        }
        throw w0("END_OBJECT");
    }

    public final boolean C(int i) {
        int i2;
        int i3;
        int i4 = this.c0;
        int i5 = this.X;
        this.c0 = i4 - i5;
        int i6 = this.Y;
        char[] cArr = this.R;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.Y = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.Y = 0;
        }
        this.X = 0;
        do {
            int i8 = this.Y;
            int read = this.A.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.Y + read;
            this.Y = i2;
            if (this.Z == 0 && (i3 = this.c0) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.X++;
                this.c0 = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    public String D() {
        return F(false);
    }

    public final String F(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.i0;
            if (i < i2) {
                int i3 = this.h0[i];
                switch (i3) {
                    case 1:
                    case 2:
                        int i4 = this.k0[i];
                        if (z && i4 > 0 && i == i2 - 1) {
                            i4--;
                        }
                        sb.append('[');
                        sb.append(i4);
                        sb.append(']');
                        break;
                    case 3:
                    case 4:
                    case 5:
                        sb.append('.');
                        String str = this.j0[i];
                        if (str == null) {
                            break;
                        } else {
                            sb.append(str);
                            break;
                        }
                    case ig7.b /* 6 */:
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError(wh1.g(i3, "Unknown scope value: "));
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    public String I() {
        return F(true);
    }

    public boolean J() {
        int i = this.d0;
        if (i == 0) {
            i = w();
        }
        if (i != 2 && i != 4 && i != 17) {
            return true;
        }
        return false;
    }

    public final boolean K(char c) {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c != ',') {
                    if (c != '/' && c != '=') {
                        if (c != '{' && c != '}' && c != ':') {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            p();
            return false;
        }
        return false;
    }

    final String N() {
        StringBuilder s = b31.s(this.Z + 1, (this.X - this.c0) + 1, " at line ", " column ", " path ");
        s.append(D());
        return s.toString();
    }

    public boolean Q() {
        int i = this.d0;
        if (i == 0) {
            i = w();
        }
        if (i == 5) {
            this.d0 = 0;
            int[] iArr = this.k0;
            int i2 = this.i0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.d0 = 0;
            int[] iArr2 = this.k0;
            int i3 = this.i0 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw w0("a boolean");
        }
    }

    public double R() {
        char c;
        int i = this.d0;
        if (i == 0) {
            i = w();
        }
        if (i == 15) {
            this.d0 = 0;
            int[] iArr = this.k0;
            int i2 = this.i0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.e0;
        }
        if (i == 16) {
            this.g0 = new String(this.R, this.X, this.f0);
            this.X += this.f0;
        } else if (i != 8 && i != 9) {
            if (i == 10) {
                this.g0 = m0();
            } else if (i != 11) {
                throw w0("a double");
            }
        } else {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.g0 = k0(c);
        }
        this.d0 = 11;
        double parseDouble = Double.parseDouble(this.g0);
        if (this.B != ug6.LENIENT && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            v0("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.g0 = null;
        this.d0 = 0;
        int[] iArr2 = this.k0;
        int i3 = this.i0 - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public int T() {
        char c;
        int i = this.d0;
        if (i == 0) {
            i = w();
        }
        if (i == 15) {
            long j = this.e0;
            int i2 = (int) j;
            if (j == i2) {
                this.d0 = 0;
                int[] iArr = this.k0;
                int i3 = this.i0 - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.e0 + N());
        }
        if (i == 16) {
            this.g0 = new String(this.R, this.X, this.f0);
            this.X += this.f0;
        } else if (i != 8 && i != 9 && i != 10) {
            throw w0("an int");
        } else {
            if (i == 10) {
                this.g0 = m0();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.g0 = k0(c);
            }
            x0(this.g0);
            try {
                int parseInt = Integer.parseInt(this.g0);
                this.d0 = 0;
                int[] iArr2 = this.k0;
                int i4 = this.i0 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.d0 = 11;
        double parseDouble = Double.parseDouble(this.g0);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.g0 = null;
            this.d0 = 0;
            int[] iArr3 = this.k0;
            int i6 = this.i0 - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.g0 + N());
    }

    public long V() {
        char c;
        int i = this.d0;
        if (i == 0) {
            i = w();
        }
        if (i == 15) {
            this.d0 = 0;
            int[] iArr = this.k0;
            int i2 = this.i0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.e0;
        }
        if (i == 16) {
            this.g0 = new String(this.R, this.X, this.f0);
            this.X += this.f0;
        } else if (i != 8 && i != 9 && i != 10) {
            throw w0("a long");
        } else {
            if (i == 10) {
                this.g0 = m0();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.g0 = k0(c);
            }
            x0(this.g0);
            try {
                long parseLong = Long.parseLong(this.g0);
                this.d0 = 0;
                int[] iArr2 = this.k0;
                int i3 = this.i0 - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.d0 = 11;
        double parseDouble = Double.parseDouble(this.g0);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.g0 = null;
            this.d0 = 0;
            int[] iArr3 = this.k0;
            int i4 = this.i0 - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.g0 + N());
    }

    public String Z() {
        String k0;
        int i = this.d0;
        if (i == 0) {
            i = w();
        }
        if (i == 14) {
            k0 = m0();
        } else if (i == 12) {
            k0 = k0('\'');
        } else if (i == 13) {
            k0 = k0('\"');
        } else {
            throw w0("a name");
        }
        this.d0 = 0;
        this.j0[this.i0 - 1] = k0;
        return k0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d0 = 0;
        this.h0[0] = 8;
        this.i0 = 1;
        this.A.close();
    }

    public void d() {
        int i = this.d0;
        if (i == 0) {
            i = w();
        }
        if (i == 3) {
            o0(1);
            this.k0[this.i0 - 1] = 0;
            this.d0 = 0;
            return;
        }
        throw w0("BEGIN_ARRAY");
    }

    public final int f0(boolean z) {
        char c;
        int i = this.X;
        int i2 = this.Y;
        while (true) {
            if (i == i2) {
                this.X = i;
                if (!C(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input".concat(N()));
                }
                i = this.X;
                i2 = this.Y;
            }
            int i3 = i + 1;
            char[] cArr = this.R;
            c = cArr[i];
            if (c == '\n') {
                this.Z++;
                this.c0 = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.X = i3;
                    if (i3 == i2) {
                        this.X = i;
                        boolean C = C(2);
                        this.X++;
                        if (!C) {
                            break;
                        }
                    }
                    p();
                    int i4 = this.X;
                    char c2 = cArr[i4];
                    if (c2 != '*') {
                        if (c2 != '/') {
                            break;
                        }
                        this.X = i4 + 1;
                        s0();
                        i = this.X;
                        i2 = this.Y;
                    } else {
                        this.X = i4 + 1;
                        while (true) {
                            if (this.X + 2 > this.Y && !C(2)) {
                                v0("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.X;
                            if (cArr[i5] == '\n') {
                                this.Z++;
                                this.c0 = i5 + 1;
                            } else {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.X;
                                    if (i6 < 2) {
                                        if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        i = i7 + 2;
                                        i2 = this.Y;
                                        break;
                                    }
                                }
                            }
                            this.X++;
                        }
                    }
                } else if (c == '#') {
                    this.X = i3;
                    p();
                    s0();
                    i = this.X;
                    i2 = this.Y;
                } else {
                    this.X = i3;
                    return c;
                }
            }
            i = i3;
        }
        return c;
    }

    public void i() {
        int i = this.d0;
        if (i == 0) {
            i = w();
        }
        if (i == 1) {
            o0(3);
            this.d0 = 0;
            return;
        }
        throw w0("BEGIN_OBJECT");
    }

    public void j0() {
        int i = this.d0;
        if (i == 0) {
            i = w();
        }
        if (i == 7) {
            this.d0 = 0;
            int[] iArr = this.k0;
            int i2 = this.i0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw w0("null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
        r11.X = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
        r1.append(r7, r3, r2 - r3);
        r11.X = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String k0(char r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.X
            int r3 = r11.Y
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.R
            if (r2 >= r4) goto L6c
            int r8 = r2 + 1
            char r2 = r7[r2]
            ug6 r9 = r11.B
            ug6 r10 = defpackage.ug6.STRICT
            if (r9 != r10) goto L24
            r9 = 32
            if (r2 < r9) goto L1e
            goto L24
        L1e:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.v0(r12)
            throw r0
        L24:
            if (r2 != r12) goto L3a
            r11.X = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L32
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r3, r8)
            return r11
        L32:
            r1.append(r7, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L3a:
            r9 = 92
            if (r2 != r9) goto L5f
            r11.X = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L50
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L50:
            r1.append(r7, r3, r2)
            char r2 = r11.p0()
            r1.append(r2)
            int r2 = r11.X
            int r3 = r11.Y
            goto L6
        L5f:
            r5 = 10
            if (r2 != r5) goto L6a
            int r2 = r11.Z
            int r2 = r2 + r6
            r11.Z = r2
            r11.c0 = r8
        L6a:
            r2 = r8
            goto L8
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.X = r2
            boolean r2 = r11.C(r6)
            if (r2 == 0) goto L8b
            goto L2
        L8b:
            java.lang.String r12 = "Unterminated string"
            r11.v0(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o83.k0(char):java.lang.String");
    }

    public String l0() {
        String str;
        int i = this.d0;
        if (i == 0) {
            i = w();
        }
        if (i == 10) {
            str = m0();
        } else if (i == 8) {
            str = k0('\'');
        } else if (i == 9) {
            str = k0('\"');
        } else if (i == 11) {
            str = this.g0;
            this.g0 = null;
        } else if (i == 15) {
            str = Long.toString(this.e0);
        } else if (i == 16) {
            str = new String(this.R, this.X, this.f0);
            this.X += this.f0;
        } else {
            throw w0("a string");
        }
        this.d0 = 0;
        int[] iArr = this.k0;
        int i2 = this.i0 - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        p();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m0() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.X
            int r4 = r3 + r2
            int r5 = r7.Y
            char[] r6 = r7.R
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.p()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.C(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.X
            r0.append(r6, r3, r2)
            int r3 = r7.X
            int r3 = r3 + r2
            r7.X = r3
            r2 = 1
            boolean r2 = r7.C(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.X
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.X
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.X
            int r2 = r2 + r1
            r7.X = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o83.m0():java.lang.String");
    }

    public q83 n0() {
        int i = this.d0;
        if (i == 0) {
            i = w();
        }
        switch (i) {
            case 1:
                return q83.BEGIN_OBJECT;
            case 2:
                return q83.END_OBJECT;
            case 3:
                return q83.BEGIN_ARRAY;
            case 4:
                return q83.END_ARRAY;
            case 5:
            case ig7.b /* 6 */:
                return q83.BOOLEAN;
            case 7:
                return q83.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return q83.STRING;
            case mj2.L /* 12 */:
            case 13:
            case 14:
                return q83.NAME;
            case ig7.e /* 15 */:
            case 16:
                return q83.NUMBER;
            case 17:
                return q83.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void o0(int i) {
        int i2 = this.i0;
        int i3 = i2 - 1;
        int i4 = this.L;
        if (i3 < i4) {
            int[] iArr = this.h0;
            if (i2 == iArr.length) {
                int i5 = i2 * 2;
                this.h0 = Arrays.copyOf(iArr, i5);
                this.k0 = Arrays.copyOf(this.k0, i5);
                this.j0 = (String[]) Arrays.copyOf(this.j0, i5);
            }
            int[] iArr2 = this.h0;
            int i6 = this.i0;
            this.i0 = i6 + 1;
            iArr2[i6] = i;
            return;
        }
        StringBuilder s = wh1.s("Nesting limit ", i4, " reached");
        s.append(N());
        throw new IOException(s.toString());
    }

    public final void p() {
        if (this.B == ug6.LENIENT) {
            return;
        }
        v0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final char p0() {
        int i;
        if (this.X == this.Y && !C(1)) {
            v0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.X;
        int i3 = i2 + 1;
        this.X = i3;
        char[] cArr = this.R;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c != 'b') {
                            if (c != 'f') {
                                if (c == 'n') {
                                    return '\n';
                                }
                                if (c != 'r') {
                                    if (c != 't') {
                                        if (c == 'u') {
                                            if (i2 + 5 > this.Y && !C(4)) {
                                                v0("Unterminated escape sequence");
                                                throw null;
                                            }
                                            int i4 = this.X;
                                            int i5 = i4 + 4;
                                            int i6 = 0;
                                            while (i4 < i5) {
                                                char c2 = cArr[i4];
                                                int i7 = i6 << 4;
                                                if (c2 >= '0' && c2 <= '9') {
                                                    i = c2 - '0';
                                                } else if (c2 >= 'a' && c2 <= 'f') {
                                                    i = c2 - 'W';
                                                } else if (c2 >= 'A' && c2 <= 'F') {
                                                    i = c2 - '7';
                                                } else {
                                                    v0("Malformed Unicode escape \\u".concat(new String(cArr, this.X, 4)));
                                                    throw null;
                                                }
                                                i6 = i + i7;
                                                i4++;
                                            }
                                            this.X += 4;
                                            return (char) i6;
                                        }
                                        v0("Invalid escape sequence");
                                        throw null;
                                    }
                                    return '\t';
                                }
                                return '\r';
                            }
                            return '\f';
                        }
                        return '\b';
                    }
                }
            }
            return c;
        } else if (this.B != ug6.STRICT) {
            this.Z++;
            this.c0 = i3;
        } else {
            v0("Cannot escape a newline character in strict mode");
            throw null;
        }
        if (this.B == ug6.STRICT) {
            v0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public final void q0(ug6 ug6Var) {
        Objects.requireNonNull(ug6Var);
        this.B = ug6Var;
    }

    public final void r0(char c) {
        do {
            int i = this.X;
            int i2 = this.Y;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.R[i];
                if (c2 == c) {
                    this.X = i3;
                    return;
                } else if (c2 == '\\') {
                    this.X = i3;
                    p0();
                    i = this.X;
                    i2 = this.Y;
                } else {
                    if (c2 == '\n') {
                        this.Z++;
                        this.c0 = i3;
                    }
                    i = i3;
                }
            }
            this.X = i;
        } while (C(1));
        v0("Unterminated string");
        throw null;
    }

    public final void s0() {
        char c;
        do {
            if (this.X < this.Y || C(1)) {
                int i = this.X;
                int i2 = i + 1;
                this.X = i2;
                c = this.R[i];
                if (c == '\n') {
                    this.Z++;
                    this.c0 = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        p();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.X
            int r2 = r1 + r0
            int r3 = r4.Y
            if (r2 >= r3) goto L51
            char[] r2 = r4.R
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.p()
        L4b:
            int r1 = r4.X
            int r1 = r1 + r0
            r4.X = r1
            return
        L51:
            int r1 = r1 + r0
            r4.X = r1
            r0 = 1
            boolean r0 = r4.C(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o83.t0():void");
    }

    public String toString() {
        return getClass().getSimpleName().concat(N());
    }

    public void u0() {
        int i = 0;
        do {
            int i2 = this.d0;
            if (i2 == 0) {
                i2 = w();
            }
            switch (i2) {
                case 1:
                    o0(3);
                    i++;
                    break;
                case 2:
                    if (i == 0) {
                        this.j0[this.i0 - 1] = null;
                    }
                    this.i0--;
                    i--;
                    break;
                case 3:
                    o0(1);
                    i++;
                    break;
                case 4:
                    this.i0--;
                    i--;
                    break;
                case 8:
                    r0('\'');
                    break;
                case 9:
                    r0('\"');
                    break;
                case 10:
                    t0();
                    break;
                case mj2.L /* 12 */:
                    r0('\'');
                    if (i == 0) {
                        this.j0[this.i0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 13:
                    r0('\"');
                    if (i == 0) {
                        this.j0[this.i0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 14:
                    t0();
                    if (i == 0) {
                        this.j0[this.i0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 16:
                    this.X += this.f0;
                    break;
                case 17:
                    return;
            }
            this.d0 = 0;
        } while (i > 0);
        int[] iArr = this.k0;
        int i3 = this.i0 - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final void v0(String str) {
        StringBuilder r = wh1.r(str);
        r.append(N());
        r.append("\nSee ");
        r.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new IOException(r.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01aa, code lost:
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01d1, code lost:
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0226, code lost:
        if (K(r14) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0229, code lost:
        if (r12 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x022b, code lost:
        if (r13 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0231, code lost:
        if (r24 != Long.MIN_VALUE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0233, code lost:
        if (r7 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0236, code lost:
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x023a, code lost:
        if (r24 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x023c, code lost:
        if (r7 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x023e, code lost:
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0240, code lost:
        if (r7 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0243, code lost:
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0244, code lost:
        r26.e0 = r4;
        r26.X += r2;
        r9 = 15;
        r26.d0 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0250, code lost:
        if (r12 == r8) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0253, code lost:
        if (r12 == 4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0256, code lost:
        if (r12 != 7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0258, code lost:
        r26.f0 = r2;
        r9 = 16;
        r26.d0 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0282 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int w() {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o83.w():int");
    }

    public final IllegalStateException w0(String str) {
        String str2;
        if (n0() == q83.NULL) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        StringBuilder u = b31.u("Expected ", str, " but was ");
        u.append(n0());
        u.append(N());
        u.append("\nSee ");
        u.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(u.toString());
    }

    public void x() {
        int i = this.d0;
        if (i == 0) {
            i = w();
        }
        if (i == 4) {
            int i2 = this.i0;
            this.i0 = i2 - 1;
            int[] iArr = this.k0;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.d0 = 0;
            return;
        }
        throw w0("END_ARRAY");
    }

    public final void x0(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                v0("String contains non-ASCII characters: ".concat(str));
                throw null;
            }
        }
    }
}
