package cb;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import me.magnum.melonds.common.camera.DSiCameraSource;
import ua.q;
import x8.e;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class a implements Closeable {
    public final FileReader A;

    /* renamed from: d0  reason: collision with root package name */
    public long f2802d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f2803e0;

    /* renamed from: f0  reason: collision with root package name */
    public String f2804f0;

    /* renamed from: g0  reason: collision with root package name */
    public int[] f2805g0;

    /* renamed from: i0  reason: collision with root package name */
    public String[] f2807i0;

    /* renamed from: j0  reason: collision with root package name */
    public int[] f2808j0;
    public q B = q.LEGACY_STRICT;
    public final int L = 255;
    public final char[] R = new char[1024];
    public int X = 0;
    public int Y = 0;
    public int Z = 0;

    /* renamed from: b0  reason: collision with root package name */
    public int f2800b0 = 0;

    /* renamed from: c0  reason: collision with root package name */
    public int f2801c0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public int f2806h0 = 1;

    static {
        e.L = new e(10);
    }

    public a(FileReader fileReader) {
        int[] iArr = new int[32];
        this.f2805g0 = iArr;
        iArr[0] = 6;
        this.f2807i0 = new String[32];
        this.f2808j0 = new int[32];
        this.A = fileReader;
    }

    public final String B(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i2 = 0;
        while (true) {
            int i10 = this.f2806h0;
            if (i2 < i10) {
                int i11 = this.f2805g0[i2];
                switch (i11) {
                    case DSiCameraSource.FrontCamera /* 1 */:
                    case 2:
                        int i12 = this.f2808j0[i2];
                        if (z10 && i12 > 0 && i2 == i10 - 1) {
                            i12--;
                        }
                        sb2.append('[');
                        sb2.append(i12);
                        sb2.append(']');
                        break;
                    case 3:
                    case 4:
                    case l1.c.f8511g /* 5 */:
                        sb2.append('.');
                        String str = this.f2807i0[i2];
                        if (str == null) {
                            break;
                        } else {
                            sb2.append(str);
                            break;
                        }
                    case l1.c.f8509e /* 6 */:
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError(w.d.l(i11, "Unknown scope value: "));
                }
                i2++;
            } else {
                return sb2.toString();
            }
        }
    }

    public final boolean F() {
        int i2 = this.f2801c0;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 != 2 && i2 != 4 && i2 != 17) {
            return true;
        }
        return false;
    }

    public final boolean G(char c4) {
        if (c4 != '\t' && c4 != '\n' && c4 != '\f' && c4 != '\r' && c4 != ' ') {
            if (c4 != '#') {
                if (c4 != ',') {
                    if (c4 != '/' && c4 != '=') {
                        if (c4 != '{' && c4 != '}' && c4 != ':') {
                            if (c4 != ';') {
                                switch (c4) {
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
            m();
            return false;
        }
        return false;
    }

    public final String H() {
        StringBuilder j2 = kc.a.j(" at line ", this.Z + 1, " column ", (this.X - this.f2800b0) + 1, " path ");
        j2.append(B(false));
        return j2.toString();
    }

    public final boolean I() {
        int i2 = this.f2801c0;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 5) {
            this.f2801c0 = 0;
            int[] iArr = this.f2808j0;
            int i10 = this.f2806h0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        } else if (i2 == 6) {
            this.f2801c0 = 0;
            int[] iArr2 = this.f2808j0;
            int i11 = this.f2806h0 - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        } else {
            throw m0("a boolean");
        }
    }

    public final double J() {
        char c4;
        int i2 = this.f2801c0;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 15) {
            this.f2801c0 = 0;
            int[] iArr = this.f2808j0;
            int i10 = this.f2806h0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f2802d0;
        }
        if (i2 == 16) {
            this.f2804f0 = new String(this.R, this.X, this.f2803e0);
            this.X += this.f2803e0;
        } else if (i2 != 8 && i2 != 9) {
            if (i2 == 10) {
                this.f2804f0 = c0();
            } else if (i2 != 11) {
                throw m0("a double");
            }
        } else {
            if (i2 == 8) {
                c4 = '\'';
            } else {
                c4 = '\"';
            }
            this.f2804f0 = a0(c4);
        }
        this.f2801c0 = 11;
        double parseDouble = Double.parseDouble(this.f2804f0);
        if (this.B != q.LENIENT && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            l0("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.f2804f0 = null;
        this.f2801c0 = 0;
        int[] iArr2 = this.f2808j0;
        int i11 = this.f2806h0 - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return parseDouble;
    }

    public final int K() {
        char c4;
        int i2 = this.f2801c0;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 15) {
            long j2 = this.f2802d0;
            int i10 = (int) j2;
            if (j2 == i10) {
                this.f2801c0 = 0;
                int[] iArr = this.f2808j0;
                int i11 = this.f2806h0 - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f2802d0 + H());
        }
        if (i2 == 16) {
            this.f2804f0 = new String(this.R, this.X, this.f2803e0);
            this.X += this.f2803e0;
        } else if (i2 != 8 && i2 != 9 && i2 != 10) {
            throw m0("an int");
        } else {
            if (i2 == 10) {
                this.f2804f0 = c0();
            } else {
                if (i2 == 8) {
                    c4 = '\'';
                } else {
                    c4 = '\"';
                }
                this.f2804f0 = a0(c4);
            }
            try {
                int parseInt = Integer.parseInt(this.f2804f0);
                this.f2801c0 = 0;
                int[] iArr2 = this.f2808j0;
                int i12 = this.f2806h0 - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f2801c0 = 11;
        double parseDouble = Double.parseDouble(this.f2804f0);
        int i13 = (int) parseDouble;
        if (i13 == parseDouble) {
            this.f2804f0 = null;
            this.f2801c0 = 0;
            int[] iArr3 = this.f2808j0;
            int i14 = this.f2806h0 - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return i13;
        }
        throw new NumberFormatException("Expected an int but was " + this.f2804f0 + H());
    }

    public final long L() {
        char c4;
        int i2 = this.f2801c0;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 15) {
            this.f2801c0 = 0;
            int[] iArr = this.f2808j0;
            int i10 = this.f2806h0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f2802d0;
        }
        if (i2 == 16) {
            this.f2804f0 = new String(this.R, this.X, this.f2803e0);
            this.X += this.f2803e0;
        } else if (i2 != 8 && i2 != 9 && i2 != 10) {
            throw m0("a long");
        } else {
            if (i2 == 10) {
                this.f2804f0 = c0();
            } else {
                if (i2 == 8) {
                    c4 = '\'';
                } else {
                    c4 = '\"';
                }
                this.f2804f0 = a0(c4);
            }
            try {
                long parseLong = Long.parseLong(this.f2804f0);
                this.f2801c0 = 0;
                int[] iArr2 = this.f2808j0;
                int i11 = this.f2806h0 - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f2801c0 = 11;
        double parseDouble = Double.parseDouble(this.f2804f0);
        long j2 = (long) parseDouble;
        if (j2 == parseDouble) {
            this.f2804f0 = null;
            this.f2801c0 = 0;
            int[] iArr3 = this.f2808j0;
            int i12 = this.f2806h0 - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.f2804f0 + H());
    }

    public final String X() {
        String a02;
        int i2 = this.f2801c0;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 14) {
            a02 = c0();
        } else if (i2 == 12) {
            a02 = a0('\'');
        } else if (i2 == 13) {
            a02 = a0('\"');
        } else {
            throw m0("a name");
        }
        this.f2801c0 = 0;
        this.f2807i0[this.f2806h0 - 1] = a02;
        return a02;
    }

    public final int Y(boolean z10) {
        char c4;
        int i2 = this.X;
        int i10 = this.Y;
        while (true) {
            if (i2 == i10) {
                this.X = i2;
                if (!z(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input".concat(H()));
                }
                i2 = this.X;
                i10 = this.Y;
            }
            int i11 = i2 + 1;
            char[] cArr = this.R;
            c4 = cArr[i2];
            if (c4 == '\n') {
                this.Z++;
                this.f2800b0 = i11;
            } else if (c4 != ' ' && c4 != '\r' && c4 != '\t') {
                if (c4 == '/') {
                    this.X = i11;
                    if (i11 == i10) {
                        this.X = i2;
                        boolean z11 = z(2);
                        this.X++;
                        if (!z11) {
                            break;
                        }
                    }
                    m();
                    int i12 = this.X;
                    char c10 = cArr[i12];
                    if (c10 != '*') {
                        if (c10 != '/') {
                            break;
                        }
                        this.X = i12 + 1;
                        i0();
                        i2 = this.X;
                        i10 = this.Y;
                    } else {
                        this.X = i12 + 1;
                        while (true) {
                            if (this.X + 2 > this.Y && !z(2)) {
                                l0("Unterminated comment");
                                throw null;
                            }
                            int i13 = this.X;
                            if (cArr[i13] == '\n') {
                                this.Z++;
                                this.f2800b0 = i13 + 1;
                            } else {
                                int i14 = 0;
                                while (true) {
                                    int i15 = this.X;
                                    if (i14 < 2) {
                                        if (cArr[i15 + i14] != "*/".charAt(i14)) {
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        i2 = i15 + 2;
                                        i10 = this.Y;
                                        break;
                                    }
                                }
                            }
                            this.X++;
                        }
                    }
                } else if (c4 == '#') {
                    this.X = i11;
                    m();
                    i0();
                    i2 = this.X;
                    i10 = this.Y;
                } else {
                    this.X = i11;
                    return c4;
                }
            }
            i2 = i11;
        }
        return c4;
    }

    public final void Z() {
        int i2 = this.f2801c0;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 7) {
            this.f2801c0 = 0;
            int[] iArr = this.f2808j0;
            int i10 = this.f2806h0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw m0("null");
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
    public final java.lang.String a0(char r12) {
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
            ua.q r9 = r11.B
            ua.q r10 = ua.q.STRICT
            if (r9 != r10) goto L24
            r9 = 32
            if (r2 < r9) goto L1e
            goto L24
        L1e:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.l0(r12)
            throw r0
        L24:
            if (r2 != r12) goto L3a
            r11.X = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L32
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r3, r8)
            return r12
        L32:
            r1.append(r7, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
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
            char r2 = r11.f0()
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
            r11.f2800b0 = r8
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
            boolean r2 = r11.z(r6)
            if (r2 == 0) goto L8b
            goto L2
        L8b:
            java.lang.String r12 = "Unterminated string"
            r11.l0(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.a.a0(char):java.lang.String");
    }

    public final String b0() {
        String str;
        int i2 = this.f2801c0;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 10) {
            str = c0();
        } else if (i2 == 8) {
            str = a0('\'');
        } else if (i2 == 9) {
            str = a0('\"');
        } else if (i2 == 11) {
            str = this.f2804f0;
            this.f2804f0 = null;
        } else if (i2 == 15) {
            str = Long.toString(this.f2802d0);
        } else if (i2 == 16) {
            str = new String(this.R, this.X, this.f2803e0);
            this.X += this.f2803e0;
        } else {
            throw m0("a string");
        }
        this.f2801c0 = 0;
        int[] iArr = this.f2808j0;
        int i10 = this.f2806h0 - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        m();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c0() {
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
            r7.m()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.z(r3)
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
            boolean r2 = r7.z(r2)
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
        throw new UnsupportedOperationException("Method not decompiled: cb.a.c0():java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2801c0 = 0;
        this.f2805g0[0] = 8;
        this.f2806h0 = 1;
        this.A.close();
    }

    public final void d() {
        int i2 = this.f2801c0;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 3) {
            e0(1);
            this.f2808j0[this.f2806h0 - 1] = 0;
            this.f2801c0 = 0;
            return;
        }
        throw m0("BEGIN_ARRAY");
    }

    public final b d0() {
        int i2 = this.f2801c0;
        if (i2 == 0) {
            i2 = t();
        }
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case l1.c.f8511g /* 5 */:
            case l1.c.f8509e /* 6 */:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case l1.c.f8508d /* 9 */:
            case l1.c.f8510f /* 10 */:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case l1.c.f8512h /* 15 */:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void e0(int i2) {
        int i10 = this.f2806h0;
        int i11 = i10 - 1;
        int i12 = this.L;
        if (i11 < i12) {
            int[] iArr = this.f2805g0;
            if (i10 == iArr.length) {
                int i13 = i10 * 2;
                this.f2805g0 = Arrays.copyOf(iArr, i13);
                this.f2808j0 = Arrays.copyOf(this.f2808j0, i13);
                this.f2807i0 = (String[]) Arrays.copyOf(this.f2807i0, i13);
            }
            int[] iArr2 = this.f2805g0;
            int i14 = this.f2806h0;
            this.f2806h0 = i14 + 1;
            iArr2[i14] = i2;
            return;
        }
        StringBuilder i15 = kc.a.i("Nesting limit ", i12, " reached");
        i15.append(H());
        throw new IOException(i15.toString());
    }

    public final char f0() {
        int i2;
        if (this.X == this.Y && !z(1)) {
            l0("Unterminated escape sequence");
            throw null;
        }
        int i10 = this.X;
        int i11 = i10 + 1;
        this.X = i11;
        char[] cArr = this.R;
        char c4 = cArr[i10];
        if (c4 != '\n') {
            if (c4 != '\"') {
                if (c4 != '\'') {
                    if (c4 != '/' && c4 != '\\') {
                        if (c4 != 'b') {
                            if (c4 != 'f') {
                                if (c4 == 'n') {
                                    return '\n';
                                }
                                if (c4 != 'r') {
                                    if (c4 != 't') {
                                        if (c4 == 'u') {
                                            if (i10 + 5 > this.Y && !z(4)) {
                                                l0("Unterminated escape sequence");
                                                throw null;
                                            }
                                            int i12 = this.X;
                                            int i13 = i12 + 4;
                                            int i14 = 0;
                                            while (i12 < i13) {
                                                char c10 = cArr[i12];
                                                int i15 = i14 << 4;
                                                if (c10 >= '0' && c10 <= '9') {
                                                    i2 = c10 - '0';
                                                } else if (c10 >= 'a' && c10 <= 'f') {
                                                    i2 = c10 - 'W';
                                                } else if (c10 >= 'A' && c10 <= 'F') {
                                                    i2 = c10 - '7';
                                                } else {
                                                    l0("Malformed Unicode escape \\u".concat(new String(cArr, this.X, 4)));
                                                    throw null;
                                                }
                                                i14 = i2 + i15;
                                                i12++;
                                            }
                                            this.X += 4;
                                            return (char) i14;
                                        }
                                        l0("Invalid escape sequence");
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
            return c4;
        } else if (this.B != q.STRICT) {
            this.Z++;
            this.f2800b0 = i11;
        } else {
            l0("Cannot escape a newline character in strict mode");
            throw null;
        }
        if (this.B == q.STRICT) {
            l0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c4;
    }

    public final void g0(q qVar) {
        Objects.requireNonNull(qVar);
        this.B = qVar;
    }

    public final void h0(char c4) {
        do {
            int i2 = this.X;
            int i10 = this.Y;
            while (i2 < i10) {
                int i11 = i2 + 1;
                char c10 = this.R[i2];
                if (c10 == c4) {
                    this.X = i11;
                    return;
                } else if (c10 == '\\') {
                    this.X = i11;
                    f0();
                    i2 = this.X;
                    i10 = this.Y;
                } else {
                    if (c10 == '\n') {
                        this.Z++;
                        this.f2800b0 = i11;
                    }
                    i2 = i11;
                }
            }
            this.X = i2;
        } while (z(1));
        l0("Unterminated string");
        throw null;
    }

    public final void i() {
        int i2 = this.f2801c0;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 1) {
            e0(3);
            this.f2801c0 = 0;
            return;
        }
        throw m0("BEGIN_OBJECT");
    }

    public final void i0() {
        char c4;
        do {
            if (this.X < this.Y || z(1)) {
                int i2 = this.X;
                int i10 = i2 + 1;
                this.X = i10;
                c4 = this.R[i2];
                if (c4 == '\n') {
                    this.Z++;
                    this.f2800b0 = i10;
                    return;
                }
            } else {
                return;
            }
        } while (c4 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        m();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0() {
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
            r4.m()
        L4b:
            int r1 = r4.X
            int r1 = r1 + r0
            r4.X = r1
            return
        L51:
            int r1 = r1 + r0
            r4.X = r1
            r0 = 1
            boolean r0 = r4.z(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.a.j0():void");
    }

    public final void k0() {
        int i2 = 0;
        do {
            int i10 = this.f2801c0;
            if (i10 == 0) {
                i10 = t();
            }
            switch (i10) {
                case DSiCameraSource.FrontCamera /* 1 */:
                    e0(3);
                    i2++;
                    break;
                case 2:
                    if (i2 == 0) {
                        this.f2807i0[this.f2806h0 - 1] = null;
                    }
                    this.f2806h0--;
                    i2--;
                    break;
                case 3:
                    e0(1);
                    i2++;
                    break;
                case 4:
                    this.f2806h0--;
                    i2--;
                    break;
                case 8:
                    h0('\'');
                    break;
                case l1.c.f8508d /* 9 */:
                    h0('\"');
                    break;
                case l1.c.f8510f /* 10 */:
                    j0();
                    break;
                case 12:
                    h0('\'');
                    if (i2 == 0) {
                        this.f2807i0[this.f2806h0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 13:
                    h0('\"');
                    if (i2 == 0) {
                        this.f2807i0[this.f2806h0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 14:
                    j0();
                    if (i2 == 0) {
                        this.f2807i0[this.f2806h0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 16:
                    this.X += this.f2803e0;
                    break;
                case 17:
                    return;
            }
            this.f2801c0 = 0;
        } while (i2 > 0);
        int[] iArr = this.f2808j0;
        int i11 = this.f2806h0 - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final void l0(String str) {
        StringBuilder t5 = w.d.t(str);
        t5.append(H());
        t5.append("\nSee ");
        t5.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new IOException(t5.toString());
    }

    public final void m() {
        if (this.B == q.LENIENT) {
            return;
        }
        l0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final IllegalStateException m0(String str) {
        String str2;
        if (d0() == b.NULL) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        StringBuilder u4 = w.d.u("Expected ", str, " but was ");
        u4.append(d0());
        u4.append(H());
        u4.append("\nSee ");
        u4.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(u4.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01a9, code lost:
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0218, code lost:
        if (G(r12) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x021b, code lost:
        if (r5 != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x021d, code lost:
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0223, code lost:
        if (r1 != Long.MIN_VALUE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0225, code lost:
        if (r17 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0228, code lost:
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x022c, code lost:
        if (r1 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x022e, code lost:
        if (r17 != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0230, code lost:
        if (r17 == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0233, code lost:
        r1 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0234, code lost:
        r24.f2802d0 = r1;
        r24.X += r7;
        r9 = 15;
        r24.f2801c0 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0240, code lost:
        if (r5 == r13) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0243, code lost:
        if (r5 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0246, code lost:
        if (r5 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0248, code lost:
        r24.f2803e0 = r7;
        r9 = 16;
        r24.f2801c0 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0270 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t() {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.a.t():int");
    }

    public final String toString() {
        return a.class.getSimpleName().concat(H());
    }

    public final void v() {
        int i2 = this.f2801c0;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 4) {
            int i10 = this.f2806h0;
            this.f2806h0 = i10 - 1;
            int[] iArr = this.f2808j0;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
            this.f2801c0 = 0;
            return;
        }
        throw m0("END_ARRAY");
    }

    public final void w() {
        int i2 = this.f2801c0;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 2) {
            int i10 = this.f2806h0;
            int i11 = i10 - 1;
            this.f2806h0 = i11;
            this.f2807i0[i11] = null;
            int[] iArr = this.f2808j0;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f2801c0 = 0;
            return;
        }
        throw m0("END_OBJECT");
    }

    public final boolean z(int i2) {
        int i10;
        int i11;
        int i12 = this.f2800b0;
        int i13 = this.X;
        this.f2800b0 = i12 - i13;
        int i14 = this.Y;
        char[] cArr = this.R;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.Y = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.Y = 0;
        }
        this.X = 0;
        do {
            int i16 = this.Y;
            int read = this.A.read(cArr, i16, cArr.length - i16);
            if (read == -1) {
                return false;
            }
            i10 = this.Y + read;
            this.Y = i10;
            if (this.Z == 0 && (i11 = this.f2800b0) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.X++;
                this.f2800b0 = i11 + 1;
                i2++;
                continue;
            }
        } while (i10 < i2);
        return true;
    }
}
