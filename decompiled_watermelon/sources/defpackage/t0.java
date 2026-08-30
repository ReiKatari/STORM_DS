package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t0 */
/* loaded from: classes.dex */
public abstract class t0 {
    public final /* synthetic */ int A;
    public int B;
    public final Object L;
    public final Object R;
    public Object X;
    public Object Y;

    public t0(e73 e73Var) {
        this.A = 0;
        this.L = e73Var;
        this.R = new oi(e73Var);
        this.Y = new StringBuilder();
    }

    public static /* synthetic */ void q(t0 t0Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = t0Var.B;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        t0Var.p(str, i, str2);
        throw null;
    }

    public static boolean t(char c) {
        if (c != ',' && c != ':' && c != ']' && c != '}') {
            return true;
        }
        return false;
    }

    public boolean A() {
        int y = y();
        CharSequence s = s();
        if (y < s.length() && y != -1 && s.charAt(y) == ',') {
            this.B++;
            return true;
        }
        return false;
    }

    public void B(char c) {
        int i;
        String str;
        int i2 = this.B;
        if (i2 > 0 && c == '\"') {
            try {
                this.B = i2 - 1;
                String m = m();
                this.B = i2;
                if (b53.x(m, "null")) {
                    p("Expected string literal but 'null' literal was found", this.B - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.B = i2;
                throw th;
            }
        }
        String d0 = jv3.d0(jv3.n(c));
        int i3 = this.B;
        if (i3 > 0) {
            i = i3 - 1;
        } else {
            i = i3;
        }
        if (i3 != s().length() && i >= 0) {
            str = String.valueOf(s().charAt(i));
        } else {
            str = "EOF";
        }
        q(this, "Expected " + d0 + ", but had '" + str + "' instead", i, null, 4);
        throw null;
    }

    public void a() {
        Map.Entry entry;
        this.X = (Map.Entry) this.Y;
        Iterator it = (Iterator) this.R;
        if (it.hasNext()) {
            entry = (Map.Entry) it.next();
        } else {
            entry = null;
        }
        this.Y = entry;
    }

    public int b(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.B = i;
            n();
            if (this.B + 4 < charSequence.length()) {
                return b(this.B, charSequence);
            }
            q(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw null;
        }
        ((StringBuilder) this.Y).append((char) (r(i + 3, charSequence) + (r(i, charSequence) << 12) + (r(i + 1, charSequence) << 8) + (r(i + 2, charSequence) << 4)));
        return i2;
    }

    public void c(int i, int i2) {
        ((StringBuilder) this.Y).append(s(), i, i2);
    }

    public abstract boolean d();

    public void e(int i, String str) {
        if (s().length() - i >= str.length()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != (s().charAt(i + i2) | ' ')) {
                    q(this, "Expected valid boolean literal prefix, but had '" + m() + '\'', 0, null, 6);
                    throw null;
                }
            }
            this.B = str.length() + i;
            return;
        }
        q(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }

    public abstract String f();

    public abstract byte g();

    public byte h(byte b) {
        int i;
        String str;
        byte g = g();
        if (g != b) {
            String d0 = jv3.d0(b);
            int i2 = this.B;
            if (i2 > 0) {
                i = i2 - 1;
            } else {
                i = i2;
            }
            if (i2 != s().length() && i >= 0) {
                str = String.valueOf(s().charAt(i));
            } else {
                str = "EOF";
            }
            q(this, "Expected " + d0 + ", but had '" + str + "' instead", i, null, 4);
            throw null;
        }
        return g;
    }

    public boolean hasNext() {
        if (((Map.Entry) this.Y) != null) {
            return true;
        }
        return false;
    }

    public abstract void i(char c);

    /* JADX WARN: Code restructure failed: missing block: B:210:0x0137, code lost:
        if (r11 == r1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0139, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x013b, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x013c, code lost:
        if (r1 == r11) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x013e, code lost:
        if (r21 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0142, code lost:
        if (r1 == (r11 - 1)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0148, code lost:
        if (r19 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x014a, code lost:
        if (r2 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0156, code lost:
        if (s().charAt(r11) != '\"') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0158, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x015b, code lost:
        q(r22, "Expected closing quotation mark", r11, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0162, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0163, code lost:
        q(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0169, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x016a, code lost:
        r22.B = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x016c, code lost:
        if (r20 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x016e, code lost:
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0171, code lost:
        if (r8 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0173, code lost:
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x017b, code lost:
        if (r8 != true) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x017d, code lost:
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0182, code lost:
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0187, code lost:
        if (r1 > 9.223372036854776E18d) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x018d, code lost:
        if (r1 < (-9.223372036854776E18d)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0195, code lost:
        if (java.lang.Math.floor(r1) != r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0197, code lost:
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x019a, code lost:
        q(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01b3, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01b4, code lost:
        q(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01ba, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01bb, code lost:
        defpackage.i.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01be, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01bf, code lost:
        if (r21 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01c1, code lost:
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01c6, code lost:
        if (r14 == Long.MIN_VALUE) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01c9, code lost:
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01ca, code lost:
        q(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01cf, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x01d0, code lost:
        q(r22, "Expected numeric literal", r11, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x01d6, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long j() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t0.j():long");
    }

    public String k() {
        String str = (String) this.X;
        if (str != null) {
            str.getClass();
            this.X = null;
            return str;
        }
        return f();
    }

    public String l(CharSequence charSequence, int i, int i2) {
        String sb;
        char c;
        StringBuilder sb2 = (StringBuilder) this.Y;
        charSequence.getClass();
        char charAt = charSequence.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                c(i, i2);
                int x = x(i2 + 1);
                if (x != -1) {
                    int i3 = x + 1;
                    char charAt2 = s().charAt(x);
                    if (charAt2 == 'u') {
                        i3 = b(i3, s());
                    } else {
                        if (charAt2 < 'u') {
                            c = dk0.a[charAt2];
                        } else {
                            c = 0;
                        }
                        if (c != 0) {
                            sb2.append(c);
                        } else {
                            q(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                            throw null;
                        }
                    }
                    i = x(i3);
                    if (i == -1) {
                        q(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    q(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    c(i, i2);
                    i = x(i2);
                    if (i == -1) {
                        q(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            charAt = charSequence.charAt(i2);
        }
        if (!z) {
            sb = z(i, i2);
        } else {
            c(i, i2);
            sb = sb2.toString();
            sb2.setLength(0);
        }
        this.B = i2 + 1;
        return sb;
    }

    public String m() {
        String str;
        StringBuilder sb = (StringBuilder) this.Y;
        String str2 = (String) this.X;
        if (str2 != null) {
            str2.getClass();
            this.X = null;
            return str2;
        }
        int y = y();
        if (y < s().length() && y != -1) {
            byte n = jv3.n(s().charAt(y));
            if (n == 1) {
                return k();
            }
            if (n == 0) {
                boolean z = false;
                while (jv3.n(s().charAt(y)) == 0) {
                    y++;
                    if (y >= s().length()) {
                        c(this.B, y);
                        int x = x(y);
                        if (x == -1) {
                            this.B = y;
                            c(0, 0);
                            String sb2 = sb.toString();
                            sb.setLength(0);
                            return sb2;
                        }
                        y = x;
                        z = true;
                    }
                }
                int i = this.B;
                if (!z) {
                    str = z(i, y);
                } else {
                    c(i, y);
                    String sb3 = sb.toString();
                    sb.setLength(0);
                    str = sb3;
                }
                this.B = y;
                return str;
            }
            q(this, "Expected beginning of the string, but got " + s().charAt(y), 0, null, 6);
            throw null;
        }
        q(this, "EOF", y, null, 4);
        throw null;
    }

    public void o() {
        if (g() == 10) {
            return;
        }
        q(this, "Expected EOF after parsing, but had " + s().charAt(this.B - 1) + " instead", 0, null, 6);
        throw null;
    }

    public void p(String str, int i, String str2) {
        String str3;
        String d = ((oi) this.R).d();
        CharSequence s = s();
        s.getClass();
        if (((e73) this.L).g) {
            str3 = io2.Z(i, s).toString();
        } else {
            str3 = null;
        }
        throw new t73(io2.u(str, d, i, str2, str3));
    }

    public int r(int i, CharSequence charSequence) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        q(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public void remove() {
        za6 za6Var = (za6) this.L;
        if (za6Var.e().d == this.B) {
            Map.Entry entry = (Map.Entry) this.X;
            if (entry != null) {
                za6Var.remove(entry.getKey());
                this.X = null;
                this.B = za6Var.e().d;
                return;
            }
            f81.o();
            return;
        }
        throw new ConcurrentModificationException();
    }

    public abstract CharSequence s();

    public String toString() {
        switch (this.A) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) s());
                sb.append("', currentPosition=");
                return ej6.g(sb, this.B, ')');
            default:
                return super.toString();
        }
    }

    public abstract String u(String str);

    public byte v() {
        CharSequence s = s();
        int i = this.B;
        while (true) {
            int x = x(i);
            if (x != -1) {
                char charAt = s.charAt(x);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    this.B = x;
                    return jv3.n(charAt);
                }
                i = x + 1;
            } else {
                this.B = x;
                return (byte) 10;
            }
        }
    }

    public String w() {
        if (v() != 1) {
            return null;
        }
        String k = k();
        this.X = k;
        return k;
    }

    public abstract int x(int i);

    public abstract int y();

    public String z(int i, int i2) {
        return s().subSequence(i, i2).toString();
    }

    public t0(za6 za6Var, Iterator it) {
        this.A = 1;
        this.L = za6Var;
        this.R = it;
        this.B = za6Var.e().d;
        a();
    }

    public void n() {
    }
}
