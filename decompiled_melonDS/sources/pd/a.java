package pd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a */
    public int f11551a;

    /* renamed from: b */
    public final c8.c0 f11552b;

    /* renamed from: c */
    public String f11553c;

    /* renamed from: d */
    public final StringBuilder f11554d;

    public a() {
        c8.c0 c0Var = new c8.c0(6);
        c0Var.f2625c = new Object[8];
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = -1;
        }
        c0Var.f2626d = iArr;
        c0Var.f2624b = -1;
        this.f11552b = c0Var;
        this.f11554d = new StringBuilder();
    }

    public static /* synthetic */ void p(a aVar, String str, int i2, String str2, int i10) {
        if ((i10 & 2) != 0) {
            i2 = aVar.f11551a;
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        aVar.o(str, i2, str2);
        throw null;
    }

    public static boolean s(char c4) {
        if (c4 != ',' && c4 != ':' && c4 != ']' && c4 != '}') {
            return true;
        }
        return false;
    }

    public final void A(char c4) {
        String str;
        int i2 = this.f11551a;
        if (i2 > 0 && c4 == '\"') {
            try {
                this.f11551a = i2 - 1;
                String l10 = l();
                this.f11551a = i2;
                if (nc.k.a(l10, "null")) {
                    o("Expected string literal but 'null' literal was found", this.f11551a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f11551a = i2;
                throw th2;
            }
        }
        String s10 = t.s(t.g(c4));
        int i10 = this.f11551a;
        int i11 = i10 - 1;
        if (i10 != r().length() && i11 >= 0) {
            str = String.valueOf(r().charAt(i11));
        } else {
            str = "EOF";
        }
        p(this, "Expected " + s10 + ", but had '" + str + "' instead", i11, null, 4);
        throw null;
    }

    public final int a(int i2, CharSequence charSequence) {
        int i10 = i2 + 4;
        if (i10 >= charSequence.length()) {
            this.f11551a = i2;
            m();
            if (this.f11551a + 4 < charSequence.length()) {
                return a(this.f11551a, charSequence);
            }
            p(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw null;
        }
        int q10 = q(i2 + 3, charSequence);
        this.f11554d.append((char) (q10 + (q(i2, charSequence) << 12) + (q(i2 + 1, charSequence) << 8) + (q(i2 + 2, charSequence) << 4)));
        return i10;
    }

    public void b(int i2, int i10) {
        this.f11554d.append(r(), i2, i10);
    }

    public abstract boolean c();

    public final void d(int i2, String str) {
        if (r().length() - i2 >= str.length()) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (str.charAt(i10) != (r().charAt(i2 + i10) | ' ')) {
                    p(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                    throw null;
                }
            }
            this.f11551a = str.length() + i2;
            return;
        }
        p(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }

    public abstract String e();

    public abstract byte f();

    public final byte g(byte b10) {
        String str;
        byte f8 = f();
        if (f8 != b10) {
            String s10 = t.s(b10);
            int i2 = this.f11551a;
            int i10 = i2 - 1;
            if (i2 != r().length() && i10 >= 0) {
                str = String.valueOf(r().charAt(i10));
            } else {
                str = "EOF";
            }
            p(this, "Expected " + s10 + ", but had '" + str + "' instead", i10, null, 4);
            throw null;
        }
        return f8;
    }

    public abstract void h(char c4);

    /* JADX WARN: Code restructure failed: missing block: B:203:0x010e, code lost:
        p(r21, "Unexpected symbol '" + r7 + "' in numeric literal", r6, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0127, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x012c, code lost:
        if (r11 == r1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x012e, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0130, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0131, code lost:
        if (r1 == r11) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0133, code lost:
        if (r13 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0137, code lost:
        if (r1 == (r11 - 1)) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x013f, code lost:
        if (r19 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0141, code lost:
        if (r2 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x014d, code lost:
        if (r().charAt(r11) != '\"') goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x014f, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0152, code lost:
        p(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x015a, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x015b, code lost:
        p(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0161, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0162, code lost:
        r21.f11551a = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0164, code lost:
        if (r20 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0166, code lost:
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0169, code lost:
        if (r8 != 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x016b, code lost:
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0173, code lost:
        if (r8 != 1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0175, code lost:
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x017a, code lost:
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x017f, code lost:
        if (r1 > 9.223372036854776E18d) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0185, code lost:
        if (r1 < (-9.223372036854776E18d)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x018d, code lost:
        if (java.lang.Math.floor(r1) != r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x018f, code lost:
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0191, code lost:
        p(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01aa, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01ab, code lost:
        p(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01b1, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x01b2, code lost:
        m9.o.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01b7, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01b8, code lost:
        if (r13 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01ba, code lost:
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01bf, code lost:
        if (r14 == Long.MIN_VALUE) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01c2, code lost:
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01c3, code lost:
        p(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01c9, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01ca, code lost:
        p(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01cf, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long i() {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.a.i():long");
    }

    public final String j() {
        String str = this.f11553c;
        if (str != null) {
            str.getClass();
            this.f11553c = null;
            return str;
        }
        return e();
    }

    public final String k(CharSequence charSequence, int i2, int i10) {
        String sb2;
        char c4;
        charSequence.getClass();
        char charAt = charSequence.charAt(i10);
        boolean z10 = false;
        while (true) {
            StringBuilder sb3 = this.f11554d;
            if (charAt != '\"') {
                if (charAt == '\\') {
                    b(i2, i10);
                    int w10 = w(i10 + 1);
                    if (w10 != -1) {
                        int i11 = w10 + 1;
                        char charAt2 = r().charAt(w10);
                        if (charAt2 == 'u') {
                            i11 = a(i11, r());
                        } else {
                            if (charAt2 < 'u') {
                                c4 = j.f11589a[charAt2];
                            } else {
                                c4 = 0;
                            }
                            if (c4 != 0) {
                                sb3.append(c4);
                            } else {
                                p(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                        }
                        i2 = w(i11);
                        if (i2 == -1) {
                            p(this, "Unexpected EOF", i2, null, 4);
                            throw null;
                        }
                    } else {
                        p(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                        throw null;
                    }
                } else {
                    i10++;
                    if (i10 >= charSequence.length()) {
                        b(i2, i10);
                        i2 = w(i10);
                        if (i2 == -1) {
                            p(this, "Unexpected EOF", i2, null, 4);
                            throw null;
                        }
                    } else {
                        continue;
                        charAt = charSequence.charAt(i10);
                    }
                }
                i10 = i2;
                z10 = true;
                charAt = charSequence.charAt(i10);
            } else {
                if (!z10) {
                    sb2 = y(i2, i10);
                } else {
                    b(i2, i10);
                    sb2 = sb3.toString();
                    sb3.setLength(0);
                }
                this.f11551a = i10 + 1;
                return sb2;
            }
        }
    }

    public final String l() {
        String sb2;
        String str = this.f11553c;
        if (str != null) {
            str.getClass();
            this.f11553c = null;
            return str;
        }
        int x9 = x();
        if (x9 < r().length() && x9 != -1) {
            byte g10 = t.g(r().charAt(x9));
            if (g10 == 1) {
                return j();
            }
            if (g10 == 0) {
                boolean z10 = false;
                while (true) {
                    byte g11 = t.g(r().charAt(x9));
                    StringBuilder sb3 = this.f11554d;
                    if (g11 == 0) {
                        x9++;
                        if (x9 >= r().length()) {
                            b(this.f11551a, x9);
                            int w10 = w(x9);
                            if (w10 == -1) {
                                this.f11551a = x9;
                                b(0, 0);
                                String sb4 = sb3.toString();
                                sb3.setLength(0);
                                return sb4;
                            }
                            x9 = w10;
                            z10 = true;
                        }
                    } else {
                        int i2 = this.f11551a;
                        if (!z10) {
                            sb2 = y(i2, x9);
                        } else {
                            b(i2, x9);
                            sb2 = sb3.toString();
                            sb3.setLength(0);
                        }
                        this.f11551a = x9;
                        return sb2;
                    }
                }
            } else {
                p(this, "Expected beginning of the string, but got " + r().charAt(x9), 0, null, 6);
                throw null;
            }
        } else {
            p(this, "EOF", x9, null, 4);
            throw null;
        }
    }

    public final void n() {
        if (f() == 10) {
            return;
        }
        p(this, "Expected EOF after parsing, but had " + r().charAt(this.f11551a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final void o(String str, int i2, String str2) {
        String concat;
        str2.getClass();
        if (str2.length() == 0) {
            concat = "";
        } else {
            concat = "\n".concat(str2);
        }
        throw t.e(i2, str + " at path: " + this.f11552b.g() + concat, r());
    }

    public final int q(int i2, CharSequence charSequence) {
        char charAt = charSequence.charAt(i2);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        p(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract CharSequence r();

    public abstract String t(String str);

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsonReader(source='");
        sb2.append((Object) r());
        sb2.append("', currentPosition=");
        return w.d.p(sb2, this.f11551a, ')');
    }

    public byte u() {
        CharSequence r5 = r();
        int i2 = this.f11551a;
        while (true) {
            int w10 = w(i2);
            if (w10 != -1) {
                char charAt = r5.charAt(w10);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    this.f11551a = w10;
                    return t.g(charAt);
                }
                i2 = w10 + 1;
            } else {
                this.f11551a = w10;
                return (byte) 10;
            }
        }
    }

    public final String v() {
        if (u() != 1) {
            return null;
        }
        String j2 = j();
        this.f11553c = j2;
        return j2;
    }

    public abstract int w(int i2);

    public abstract int x();

    public String y(int i2, int i10) {
        return r().subSequence(i2, i10).toString();
    }

    public final boolean z() {
        int x9 = x();
        CharSequence r5 = r();
        if (x9 < r5.length() && x9 != -1 && r5.charAt(x9) == ',') {
            this.f11551a++;
            return true;
        }
        return false;
    }

    public void m() {
    }
}
