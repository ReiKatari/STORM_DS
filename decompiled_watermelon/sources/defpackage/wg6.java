package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wg6  reason: default package */
/* loaded from: classes.dex */
public class wg6 extends t0 {
    public final String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg6(String str, e73 e73Var) {
        super(e73Var);
        str.getClass();
        this.Z = str;
    }

    @Override // defpackage.t0
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
                    return t0.t(charAt);
                }
                i++;
            } else {
                this.B = i;
                return false;
            }
        }
    }

    @Override // defpackage.t0
    public final String f() {
        String str;
        i('\"');
        int i = this.B;
        String str2 = this.Z;
        int y0 = zg6.y0('\"', i, 4, str2);
        if (y0 == -1) {
            m();
            int i2 = this.B;
            if (i2 != str2.length() && i2 >= 0) {
                str = String.valueOf(str2.charAt(i2));
            } else {
                str = "EOF";
            }
            t0.q(this, wh1.A("Expected quotation mark '\"', but had '", str, "' instead"), i2, null, 4);
            throw null;
        }
        for (int i3 = i; i3 < y0; i3++) {
            if (str2.charAt(i3) == '\\') {
                return l(str2, this.B, i3);
            }
        }
        this.B = y0 + 1;
        return str2.substring(i, y0);
    }

    @Override // defpackage.t0
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
                return jv3.n(charAt);
            }
            i = i2;
        }
        this.B = str.length();
        return (byte) 10;
    }

    @Override // defpackage.t0
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

    @Override // defpackage.t0
    public final CharSequence s() {
        return this.Z;
    }

    @Override // defpackage.t0
    public final String u(String str) {
        str.getClass();
        int i = this.B;
        try {
            if (g() == 6 && b53.x(w(), str)) {
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

    @Override // defpackage.t0
    public final int x(int i) {
        if (i < this.Z.length()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.t0
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
