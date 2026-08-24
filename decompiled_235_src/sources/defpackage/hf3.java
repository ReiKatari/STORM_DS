package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hf3  reason: default package */
/* loaded from: classes.dex */
public class hf3 implements Closeable {
    public final Reader A;
    public long f0;
    public int g0;
    public String h0;
    public int[] i0;
    public String[] k0;
    public int[] l0;
    public ls6 B = ls6.LEGACY_STRICT;
    public final int L = 255;
    public final char[] R = new char[1024];
    public int X = 0;
    public int Y = 0;
    public int Z = 0;
    public int d0 = 0;
    public int e0 = 0;
    public int j0 = 1;

    static {
        x31.B = new x31(12);
    }

    public hf3(Reader reader) {
        int[] iArr = new int[32];
        this.i0 = iArr;
        iArr[0] = 6;
        this.k0 = new String[32];
        this.l0 = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.A = reader;
    }

    public final String A(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.j0;
            if (i < i2) {
                int i3 = this.i0[i];
                switch (i3) {
                    case 1:
                    case 2:
                        int i4 = this.l0[i];
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
                        String str = this.k0[i];
                        if (str == null) {
                            break;
                        } else {
                            sb.append(str);
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError(lb1.g(i3, "Unknown scope value: "));
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    public String D() {
        return A(true);
    }

    public boolean F() {
        int i = this.e0;
        if (i == 0) {
            i = n();
        }
        if (i != 2 && i != 4 && i != 17) {
            return true;
        }
        return false;
    }

    public final boolean J(char c) {
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
            k();
            return false;
        }
        return false;
    }

    final String N() {
        StringBuilder q = i61.q(this.Z + 1, (this.X - this.d0) + 1, " at line ", " column ", " path ");
        q.append(x());
        return q.toString();
    }

    public boolean U() {
        int i = this.e0;
        if (i == 0) {
            i = n();
        }
        if (i == 5) {
            this.e0 = 0;
            int[] iArr = this.l0;
            int i2 = this.j0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.e0 = 0;
            int[] iArr2 = this.l0;
            int i3 = this.j0 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw w0("a boolean");
        }
    }

    public double X() {
        char c;
        int i = this.e0;
        if (i == 0) {
            i = n();
        }
        if (i == 15) {
            this.e0 = 0;
            int[] iArr = this.l0;
            int i2 = this.j0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f0;
        }
        if (i == 16) {
            this.h0 = new String(this.R, this.X, this.g0);
            this.X += this.g0;
        } else if (i != 8 && i != 9) {
            if (i == 10) {
                this.h0 = m0();
            } else if (i != 11) {
                throw w0("a double");
            }
        } else {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.h0 = k0(c);
        }
        this.e0 = 11;
        double parseDouble = Double.parseDouble(this.h0);
        if (this.B != ls6.LENIENT && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            v0("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.h0 = null;
        this.e0 = 0;
        int[] iArr2 = this.l0;
        int i3 = this.j0 - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public int Z() {
        char c;
        int i = this.e0;
        if (i == 0) {
            i = n();
        }
        if (i == 15) {
            long j = this.f0;
            int i2 = (int) j;
            if (j == i2) {
                this.e0 = 0;
                int[] iArr = this.l0;
                int i3 = this.j0 - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f0 + N());
        }
        if (i == 16) {
            this.h0 = new String(this.R, this.X, this.g0);
            this.X += this.g0;
        } else if (i != 8 && i != 9 && i != 10) {
            throw w0("an int");
        } else {
            if (i == 10) {
                this.h0 = m0();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.h0 = k0(c);
            }
            x0(this.h0);
            try {
                int parseInt = Integer.parseInt(this.h0);
                this.e0 = 0;
                int[] iArr2 = this.l0;
                int i4 = this.j0 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.e0 = 11;
        double parseDouble = Double.parseDouble(this.h0);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.h0 = null;
            this.e0 = 0;
            int[] iArr3 = this.l0;
            int i6 = this.j0 - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.h0 + N());
    }

    public long a0() {
        char c;
        int i = this.e0;
        if (i == 0) {
            i = n();
        }
        if (i == 15) {
            this.e0 = 0;
            int[] iArr = this.l0;
            int i2 = this.j0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f0;
        }
        if (i == 16) {
            this.h0 = new String(this.R, this.X, this.g0);
            this.X += this.g0;
        } else if (i != 8 && i != 9 && i != 10) {
            throw w0("a long");
        } else {
            if (i == 10) {
                this.h0 = m0();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.h0 = k0(c);
            }
            x0(this.h0);
            try {
                long parseLong = Long.parseLong(this.h0);
                this.e0 = 0;
                int[] iArr2 = this.l0;
                int i3 = this.j0 - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.e0 = 11;
        double parseDouble = Double.parseDouble(this.h0);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.h0 = null;
            this.e0 = 0;
            int[] iArr3 = this.l0;
            int i4 = this.j0 - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.h0 + N());
    }

    public String c0() {
        String k0;
        int i = this.e0;
        if (i == 0) {
            i = n();
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
        this.e0 = 0;
        this.k0[this.j0 - 1] = k0;
        return k0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.e0 = 0;
        this.i0[0] = 8;
        this.j0 = 1;
        this.A.close();
    }

    public void e() {
        int i = this.e0;
        if (i == 0) {
            i = n();
        }
        if (i == 3) {
            o0(1);
            this.l0[this.j0 - 1] = 0;
            this.e0 = 0;
            return;
        }
        throw w0("BEGIN_ARRAY");
    }

    public final int e0(boolean z) {
        char c;
        int i = this.X;
        int i2 = this.Y;
        while (true) {
            if (i == i2) {
                this.X = i;
                if (!v(1)) {
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
                this.d0 = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.X = i3;
                    if (i3 == i2) {
                        this.X = i;
                        boolean v = v(2);
                        this.X++;
                        if (!v) {
                            break;
                        }
                    }
                    k();
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
                            if (this.X + 2 > this.Y && !v(2)) {
                                v0("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.X;
                            if (cArr[i5] == '\n') {
                                this.Z++;
                                this.d0 = i5 + 1;
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
                    k();
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

    public void h() {
        int i = this.e0;
        if (i == 0) {
            i = n();
        }
        if (i == 1) {
            o0(3);
            this.e0 = 0;
            return;
        }
        throw w0("BEGIN_OBJECT");
    }

    public void j0() {
        int i = this.e0;
        if (i == 0) {
            i = n();
        }
        if (i == 7) {
            this.e0 = 0;
            int[] iArr = this.l0;
            int i2 = this.j0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw w0("null");
    }

    public final void k() {
        if (this.B == ls6.LENIENT) {
            return;
        }
        v0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
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
    */
    public final String k0(char c) {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.X;
            int i3 = this.Y;
            while (true) {
                int i4 = i3;
                int i5 = i2;
                while (true) {
                    cArr = this.R;
                    if (i2 >= i4) {
                        break;
                    }
                    int i6 = i2 + 1;
                    char c2 = cArr[i2];
                    if (this.B == ls6.STRICT && c2 < ' ') {
                        v0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        throw null;
                    } else if (c2 == c) {
                        this.X = i6;
                        int i7 = (i6 - i5) - 1;
                        if (sb == null) {
                            return new String(cArr, i5, i7);
                        }
                        sb.append(cArr, i5, i7);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.Z++;
                            this.d0 = i6;
                        }
                        i2 = i6;
                    }
                }
                sb.append(cArr, i5, i);
                sb.append(p0());
                i2 = this.X;
                i3 = this.Y;
            }
        } while (v(1));
        v0("Unterminated string");
        throw null;
    }

    public String l0() {
        String str;
        int i = this.e0;
        if (i == 0) {
            i = n();
        }
        if (i == 10) {
            str = m0();
        } else if (i == 8) {
            str = k0('\'');
        } else if (i == 9) {
            str = k0('\"');
        } else if (i == 11) {
            str = this.h0;
            this.h0 = null;
        } else if (i == 15) {
            str = Long.toString(this.f0);
        } else if (i == 16) {
            str = new String(this.R, this.X, this.g0);
            this.X += this.g0;
        } else {
            throw w0("a string");
        }
        this.e0 = 0;
        int[] iArr = this.l0;
        int i2 = this.j0 - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        k();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m0() {
        char[] cArr;
        String sb;
        StringBuilder sb2 = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.X;
                int i4 = i3 + i2;
                int i5 = this.Y;
                cArr = this.R;
                if (i4 < i5) {
                    char c = cArr[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 < cArr.length) {
                    if (v(i2 + 1)) {
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(cArr, this.X, i2);
                    this.X += i2;
                }
            }
            i = i2;
            if (sb2 != null) {
                sb = new String(cArr, this.X, i);
            } else {
                sb2.append(cArr, this.X, i);
                sb = sb2.toString();
            }
            this.X += i;
            return sb;
        } while (v(1));
        if (sb2 != null) {
        }
        this.X += i;
        return sb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01aa, code lost:
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01d1, code lost:
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0226, code lost:
        if (J(r14) != false) goto L67;
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
        r26.f0 = r4;
        r26.X += r2;
        r9 = 15;
        r26.e0 = 15;
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
        r26.g0 = r2;
        r9 = 16;
        r26.e0 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0282 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n() {
        int e0;
        int i;
        String str;
        String str2;
        int i2;
        boolean z;
        int i3;
        char c;
        boolean z2;
        int i4;
        int[] iArr = this.i0;
        char c2 = 1;
        int i5 = this.j0 - 1;
        int i6 = iArr[i5];
        char[] cArr = this.R;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int e02 = e0(true);
            if (e02 != 44) {
                if (e02 != 59) {
                    if (e02 == 93) {
                        this.e0 = 4;
                        return 4;
                    }
                    v0("Unterminated array");
                    throw null;
                }
                k();
            }
        } else if (i6 != 3 && i6 != 5) {
            if (i6 == 4) {
                iArr[i5] = 5;
                int e03 = e0(true);
                if (e03 != 58) {
                    if (e03 == 61) {
                        k();
                        if (this.X < this.Y || v(1)) {
                            int i7 = this.X;
                            if (cArr[i7] == '>') {
                                this.X = i7 + 1;
                            }
                        }
                    } else {
                        v0("Expected ':'");
                        throw null;
                    }
                }
            } else if (i6 == 6) {
                if (this.B == ls6.LENIENT) {
                    e0(true);
                    int i8 = this.X;
                    this.X = i8 - 1;
                    if (i8 + 4 <= this.Y || v(5)) {
                        int i9 = this.X;
                        if (cArr[i9] == ')' && cArr[i9 + 1] == ']' && cArr[i9 + 2] == '}' && cArr[i9 + 3] == '\'' && cArr[i9 + 4] == '\n') {
                            this.X = i9 + 5;
                        }
                    }
                }
                this.i0[this.j0 - 1] = 7;
            } else if (i6 == 7) {
                if (e0(false) == -1) {
                    this.e0 = 17;
                    return 17;
                }
                k();
                this.X--;
            } else if (i6 == 8) {
                i.m("JsonReader is closed");
                return 0;
            }
        } else {
            iArr[i5] = 4;
            if (i6 == 5 && (e0 = e0(true)) != 44) {
                if (e0 != 59) {
                    if (e0 == 125) {
                        this.e0 = 2;
                        return 2;
                    }
                    v0("Unterminated object");
                    throw null;
                }
                k();
            }
            int e04 = e0(true);
            if (e04 != 34) {
                if (e04 != 39) {
                    if (e04 != 125) {
                        k();
                        this.X--;
                        if (J((char) e04)) {
                            this.e0 = 14;
                            return 14;
                        }
                        v0("Expected name");
                        throw null;
                    } else if (i6 != 5) {
                        this.e0 = 2;
                        return 2;
                    } else {
                        v0("Expected name");
                        throw null;
                    }
                }
                k();
                this.e0 = 12;
                return 12;
            }
            this.e0 = 13;
            return 13;
        }
        int e05 = e0(true);
        if (e05 != 34) {
            if (e05 != 39) {
                if (e05 != 44 && e05 != 59) {
                    if (e05 != 91) {
                        if (e05 != 93) {
                            if (e05 != 123) {
                                int i10 = this.X - 1;
                                this.X = i10;
                                char c3 = cArr[i10];
                                if (c3 != 't' && c3 != 'T') {
                                    if (c3 != 'f' && c3 != 'F') {
                                        if (c3 == 'n' || c3 == 'N') {
                                            str = "null";
                                            str2 = "NULL";
                                            i2 = 7;
                                        }
                                        i3 = 0;
                                        if (i3 == 0) {
                                            return i3;
                                        }
                                        int i11 = this.X;
                                        int i12 = this.Y;
                                        boolean z3 = true;
                                        int i13 = 0;
                                        long j = 0;
                                        boolean z4 = false;
                                        char c4 = 0;
                                        while (true) {
                                            if (i11 + i13 == i12) {
                                                if (i13 == cArr.length) {
                                                    break;
                                                } else if (!v(i13 + 1)) {
                                                    long j2 = j;
                                                    break;
                                                } else {
                                                    i11 = this.X;
                                                    i12 = this.Y;
                                                }
                                            }
                                            char c5 = cArr[i11 + i13];
                                            if (c5 != '+') {
                                                if (c5 != 'E' && c5 != 'e') {
                                                    if (c5 != '-') {
                                                        if (c5 != '.') {
                                                            if (c5 < '0' || c5 > '9') {
                                                                break;
                                                            }
                                                            if (c4 != c2 && c4 != 0) {
                                                                if (c4 == 2) {
                                                                    if (j == 0) {
                                                                        break;
                                                                    }
                                                                    long j3 = j;
                                                                    long j4 = (10 * j) - (c5 - '0');
                                                                    int i14 = (j3 > (-922337203685477580L) ? 1 : (j3 == (-922337203685477580L) ? 0 : -1));
                                                                    if (i14 <= 0 && (i14 != 0 || j4 >= j3)) {
                                                                        z2 = false;
                                                                    } else {
                                                                        z2 = true;
                                                                    }
                                                                    z3 &= z2;
                                                                    j = j4;
                                                                } else {
                                                                    long j5 = j;
                                                                    if (c4 == 3) {
                                                                        j = j5;
                                                                        c4 = 4;
                                                                    } else if (c4 != 5 && c4 != 6) {
                                                                        j = j5;
                                                                    } else {
                                                                        j = j5;
                                                                        c4 = 7;
                                                                    }
                                                                }
                                                            } else {
                                                                j = -(c5 - '0');
                                                                c4 = 2;
                                                            }
                                                            i13++;
                                                            c2 = 1;
                                                        } else if (c4 != 2) {
                                                            break;
                                                        } else {
                                                            c4 = 3;
                                                            i13++;
                                                            c2 = 1;
                                                        }
                                                    } else if (c4 == 0) {
                                                        z4 = true;
                                                        c4 = 1;
                                                        i13++;
                                                        c2 = 1;
                                                    } else {
                                                        if (c4 != 5) {
                                                            break;
                                                        }
                                                        c4 = 6;
                                                        i13++;
                                                        c2 = 1;
                                                    }
                                                } else if (c4 != 2 && c4 != 4) {
                                                    break;
                                                } else {
                                                    c4 = 5;
                                                    i13++;
                                                    c2 = 1;
                                                }
                                                if (i4 == 0) {
                                                    return i4;
                                                }
                                                if (J(cArr[this.X])) {
                                                    k();
                                                    this.e0 = 10;
                                                    return 10;
                                                }
                                                v0("Expected value");
                                                throw null;
                                            }
                                            if (c4 != 5) {
                                                break;
                                            }
                                            c4 = 6;
                                            i13++;
                                            c2 = 1;
                                        }
                                        i4 = 0;
                                        if (i4 == 0) {
                                        }
                                    } else {
                                        str = "false";
                                        str2 = "FALSE";
                                        i2 = 6;
                                    }
                                } else {
                                    str = "true";
                                    str2 = "TRUE";
                                    i2 = 5;
                                }
                                if (this.B != ls6.STRICT) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                int length = str.length();
                                int i15 = 0;
                                while (true) {
                                    int i16 = this.X;
                                    int i17 = this.Y;
                                    if (i15 < length) {
                                        if ((i16 + i15 >= i17 && !v(i15 + 1)) || ((c = cArr[this.X + i15]) != str.charAt(i15) && (!z || c != str2.charAt(i15)))) {
                                            break;
                                        }
                                        i15++;
                                    } else if ((i16 + length >= i17 && !v(length + 1)) || !J(cArr[this.X + length])) {
                                        this.X += length;
                                        this.e0 = i2;
                                        i3 = i2;
                                    }
                                }
                                i3 = 0;
                                if (i3 == 0) {
                                }
                            } else {
                                this.e0 = 1;
                                return 1;
                            }
                        } else {
                            i = 1;
                            if (i6 == 1) {
                                this.e0 = 4;
                                return 4;
                            }
                        }
                    } else {
                        this.e0 = 3;
                        return 3;
                    }
                } else {
                    i = 1;
                }
                if (i6 != i && i6 != 2) {
                    v0("Unexpected value");
                    throw null;
                }
                k();
                this.X -= i;
                this.e0 = 7;
                return 7;
            }
            k();
            this.e0 = 8;
            return 8;
        }
        this.e0 = 9;
        return 9;
    }

    public jf3 n0() {
        int i = this.e0;
        if (i == 0) {
            i = n();
        }
        switch (i) {
            case 1:
                return jf3.BEGIN_OBJECT;
            case 2:
                return jf3.END_OBJECT;
            case 3:
                return jf3.BEGIN_ARRAY;
            case 4:
                return jf3.END_ARRAY;
            case 5:
            case 6:
                return jf3.BOOLEAN;
            case 7:
                return jf3.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return jf3.STRING;
            case 12:
            case 13:
            case 14:
                return jf3.NAME;
            case 15:
            case 16:
                return jf3.NUMBER;
            case 17:
                return jf3.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void o0(int i) {
        int i2 = this.j0;
        int i3 = i2 - 1;
        int i4 = this.L;
        if (i3 < i4) {
            int[] iArr = this.i0;
            if (i2 == iArr.length) {
                int i5 = i2 * 2;
                this.i0 = Arrays.copyOf(iArr, i5);
                this.l0 = Arrays.copyOf(this.l0, i5);
                this.k0 = (String[]) Arrays.copyOf(this.k0, i5);
            }
            int[] iArr2 = this.i0;
            int i6 = this.j0;
            this.j0 = i6 + 1;
            iArr2[i6] = i;
            return;
        }
        StringBuilder t = xg6.t("Nesting limit ", i4, " reached");
        t.append(N());
        throw new IOException(t.toString());
    }

    public final char p0() {
        int i;
        if (this.X == this.Y && !v(1)) {
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
                                            if (i2 + 5 > this.Y && !v(4)) {
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
        } else if (this.B != ls6.STRICT) {
            this.Z++;
            this.d0 = i3;
        } else {
            v0("Cannot escape a newline character in strict mode");
            throw null;
        }
        if (this.B == ls6.STRICT) {
            v0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public final void q0(ls6 ls6Var) {
        Objects.requireNonNull(ls6Var);
        this.B = ls6Var;
    }

    public void r() {
        int i = this.e0;
        if (i == 0) {
            i = n();
        }
        if (i == 4) {
            int i2 = this.j0;
            this.j0 = i2 - 1;
            int[] iArr = this.l0;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.e0 = 0;
            return;
        }
        throw w0("END_ARRAY");
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
                        this.d0 = i3;
                    }
                    i = i3;
                }
            }
            this.X = i;
        } while (v(1));
        v0("Unterminated string");
        throw null;
    }

    public final void s0() {
        char c;
        do {
            if (this.X < this.Y || v(1)) {
                int i = this.X;
                int i2 = i + 1;
                this.X = i2;
                c = this.R[i];
                if (c == '\n') {
                    this.Z++;
                    this.d0 = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0() {
        do {
            int i = 0;
            while (true) {
                int i2 = this.X;
                if (i2 + i < this.Y) {
                    char c = this.R[i2 + i];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.X = i2 + i;
                }
            }
            this.X += i;
            return;
        } while (v(1));
    }

    public String toString() {
        return getClass().getSimpleName().concat(N());
    }

    public void u() {
        int i = this.e0;
        if (i == 0) {
            i = n();
        }
        if (i == 2) {
            int i2 = this.j0;
            int i3 = i2 - 1;
            this.j0 = i3;
            this.k0[i3] = null;
            int[] iArr = this.l0;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.e0 = 0;
            return;
        }
        throw w0("END_OBJECT");
    }

    public void u0() {
        int i = 0;
        do {
            int i2 = this.e0;
            if (i2 == 0) {
                i2 = n();
            }
            switch (i2) {
                case 1:
                    o0(3);
                    i++;
                    break;
                case 2:
                    if (i == 0) {
                        this.k0[this.j0 - 1] = null;
                    }
                    this.j0--;
                    i--;
                    break;
                case 3:
                    o0(1);
                    i++;
                    break;
                case 4:
                    this.j0--;
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
                case 12:
                    r0('\'');
                    if (i == 0) {
                        this.k0[this.j0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 13:
                    r0('\"');
                    if (i == 0) {
                        this.k0[this.j0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 14:
                    t0();
                    if (i == 0) {
                        this.k0[this.j0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 16:
                    this.X += this.g0;
                    break;
                case 17:
                    return;
            }
            this.e0 = 0;
        } while (i > 0);
        int[] iArr = this.l0;
        int i3 = this.j0 - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final boolean v(int i) {
        int i2;
        int i3;
        int i4 = this.d0;
        int i5 = this.X;
        this.d0 = i4 - i5;
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
            if (this.Z == 0 && (i3 = this.d0) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.X++;
                this.d0 = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    public final void v0(String str) {
        StringBuilder s = lb1.s(str);
        s.append(N());
        s.append("\nSee ");
        s.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new IOException(s.toString());
    }

    public final IllegalStateException w0(String str) {
        String str2;
        if (n0() == jf3.NULL) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        StringBuilder t = i61.t("Expected ", str, " but was ");
        t.append(n0());
        t.append(N());
        t.append("\nSee ");
        t.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(t.toString());
    }

    public String x() {
        return A(false);
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
