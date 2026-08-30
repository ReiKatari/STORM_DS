package pd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class i0 extends a {

    /* renamed from: e  reason: collision with root package name */
    public final String f11588e;

    public i0(String str) {
        str.getClass();
        this.f11588e = str;
    }

    @Override // pd.a
    public boolean c() {
        int i2 = this.f11551a;
        if (i2 == -1) {
            return false;
        }
        while (true) {
            String str = this.f11588e;
            if (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f11551a = i2;
                    return a.s(charAt);
                }
                i2++;
            } else {
                this.f11551a = i2;
                return false;
            }
        }
    }

    @Override // pd.a
    public final String e() {
        String str;
        h('\"');
        int i2 = this.f11551a;
        String str2 = this.f11588e;
        int g02 = vc.h.g0('\"', i2, 4, str2);
        if (g02 == -1) {
            l();
            int i10 = this.f11551a;
            if (i10 != str2.length() && i10 >= 0) {
                str = String.valueOf(str2.charAt(i10));
            } else {
                str = "EOF";
            }
            a.p(this, kc.a.g("Expected quotation mark '\"', but had '", str, "' instead"), i10, null, 4);
            throw null;
        }
        for (int i11 = i2; i11 < g02; i11++) {
            if (str2.charAt(i11) == '\\') {
                return k(str2, this.f11551a, i11);
            }
        }
        this.f11551a = g02 + 1;
        return str2.substring(i2, g02);
    }

    @Override // pd.a
    public byte f() {
        String str;
        int i2 = this.f11551a;
        while (true) {
            str = this.f11588e;
            if (i2 == -1 || i2 >= str.length()) {
                break;
            }
            int i10 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f11551a = i10;
                return t.g(charAt);
            }
            i2 = i10;
        }
        this.f11551a = str.length();
        return (byte) 10;
    }

    @Override // pd.a
    public void h(char c4) {
        int i2 = this.f11551a;
        if (i2 == -1) {
            A(c4);
            throw null;
        }
        while (true) {
            String str = this.f11588e;
            if (i2 < str.length()) {
                int i10 = i2 + 1;
                char charAt = str.charAt(i2);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f11551a = i10;
                    if (charAt == c4) {
                        return;
                    }
                    A(c4);
                    throw null;
                }
                i2 = i10;
            } else {
                this.f11551a = -1;
                A(c4);
                throw null;
            }
        }
    }

    @Override // pd.a
    public final CharSequence r() {
        return this.f11588e;
    }

    @Override // pd.a
    public final String t(String str) {
        str.getClass();
        int i2 = this.f11551a;
        try {
            if (f() == 6 && nc.k.a(v(), str)) {
                this.f11553c = null;
                if (f() == 5) {
                    return v();
                }
            }
            return null;
        } finally {
            this.f11551a = i2;
            this.f11553c = null;
        }
    }

    @Override // pd.a
    public final int w(int i2) {
        if (i2 < this.f11588e.length()) {
            return i2;
        }
        return -1;
    }

    @Override // pd.a
    public int x() {
        char charAt;
        int i2 = this.f11551a;
        if (i2 == -1) {
            return i2;
        }
        while (true) {
            String str = this.f11588e;
            if (i2 >= str.length() || !((charAt = str.charAt(i2)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i2++;
        }
        this.f11551a = i2;
        return i2;
    }
}
