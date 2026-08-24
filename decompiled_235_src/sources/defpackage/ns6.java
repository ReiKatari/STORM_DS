package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ns6  reason: default package */
/* loaded from: classes.dex */
public class ns6 extends u0 {
    public final String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns6(String str, td3 td3Var) {
        super(td3Var);
        str.getClass();
        this.Z = str;
    }

    @Override // defpackage.u0
    public boolean d() {
        int i = this.B;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.Z;
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.B = i;
                    return u0.t(charAt);
                }
                i++;
            } else {
                this.B = i;
                return false;
            }
        }
    }

    @Override // defpackage.u0
    public final String f() {
        String str;
        i('\"');
        int i = this.B;
        String str2 = this.Z;
        int s0 = qs6.s0('\"', i, 4, str2);
        if (s0 == -1) {
            m();
            int i2 = this.B;
            if (i2 != str2.length() && i2 >= 0) {
                str = String.valueOf(str2.charAt(i2));
            } else {
                str = "EOF";
            }
            u0.q(this, lb1.A("Expected quotation mark '\"', but had '", str, "' instead"), i2, null, 4);
            throw null;
        }
        for (int i3 = i; i3 < s0; i3++) {
            if (str2.charAt(i3) == '\\') {
                return l(str2, this.B, i3);
            }
        }
        this.B = s0 + 1;
        return str2.substring(i, s0);
    }

    @Override // defpackage.u0
    public byte g() {
        String str;
        int i = this.B;
        while (true) {
            str = this.Z;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.B = i2;
                return l.n(charAt);
            }
            i = i2;
        }
        this.B = str.length();
        return (byte) 10;
    }

    @Override // defpackage.u0
    public void i(char c) {
        int i = this.B;
        if (i == -1) {
            B(c);
            throw null;
        }
        while (true) {
            String str = this.Z;
            if (i < str.length()) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.B = i2;
                    if (charAt == c) {
                        return;
                    }
                    B(c);
                    throw null;
                }
                i = i2;
            } else {
                this.B = -1;
                B(c);
                throw null;
            }
        }
    }

    @Override // defpackage.u0
    public final CharSequence s() {
        return this.Z;
    }

    @Override // defpackage.u0
    public final String u(String str) {
        str.getClass();
        int i = this.B;
        try {
            if (g() == 6 && nb3.k(w(), str)) {
                this.X = null;
                if (g() == 5) {
                    return w();
                }
            }
            return null;
        } finally {
            this.B = i;
            this.X = null;
        }
    }

    @Override // defpackage.u0
    public final int x(int i) {
        if (i < this.Z.length()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.u0
    public int y() {
        char charAt;
        int i = this.B;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.Z;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i++;
        }
        this.B = i;
        return i;
    }
}
