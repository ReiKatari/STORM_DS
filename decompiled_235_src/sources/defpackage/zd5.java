package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zd5  reason: default package */
/* loaded from: classes.dex */
public class zd5 extends u0 {
    public final s63 Z;
    public final char[] d0;
    public int e0;
    public final lu f0;

    public zd5(s63 s63Var, char[] cArr, td3 td3Var) {
        super(td3Var);
        this.Z = s63Var;
        this.d0 = cArr;
        this.e0 = 128;
        this.f0 = new lu(cArr);
        C(0);
    }

    public final void C(int i) {
        lu luVar = this.f0;
        char[] cArr = luVar.A;
        if (i != 0) {
            int i2 = this.B;
            System.arraycopy(cArr, i2, cArr, 0, (i2 + i) - i2);
        }
        int i3 = luVar.B;
        while (true) {
            if (i == i3) {
                break;
            }
            s63 s63Var = this.Z;
            s63Var.getClass();
            int a = ((pm0) s63Var.B).a(cArr, i, i3 - i);
            if (a == -1) {
                luVar.B = Math.min(luVar.A.length, i);
                this.e0 = -1;
                break;
            }
            i += a;
        }
        this.B = 0;
    }

    public final void D() {
        km0 km0Var = km0.c;
        km0Var.getClass();
        char[] cArr = this.d0;
        cArr.getClass();
        if (cArr.length == 16384) {
            km0Var.b(cArr);
            return;
        }
        int length = cArr.length;
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + length).toString());
    }

    @Override // defpackage.u0
    public final void c(int i, int i2) {
        ((StringBuilder) this.Y).append(this.f0.A, i, i2 - i);
    }

    @Override // defpackage.u0
    public boolean d() {
        n();
        int i = this.B;
        while (true) {
            int x = x(i);
            if (x != -1) {
                char c = this.f0.A[x];
                if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                    this.B = x;
                    return u0.t(c);
                }
                i = x + 1;
            } else {
                this.B = x;
                return false;
            }
        }
    }

    @Override // defpackage.u0
    public final String f() {
        String str;
        i('\"');
        int i = this.B;
        lu luVar = this.f0;
        int i2 = luVar.B;
        char[] cArr = luVar.A;
        int i3 = i;
        while (true) {
            if (i3 < i2) {
                if (cArr[i3] == '\"') {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 == -1) {
            int x = x(i);
            int i4 = this.B;
            if (x == -1) {
                int i5 = i4 > 0 ? i4 - 1 : i4;
                if (i4 != luVar.B && i5 >= 0) {
                    str = String.valueOf(luVar.A[i5]);
                } else {
                    str = "EOF";
                }
                u0.q(this, lb1.A("Expected quotation mark '\"', but had '", str, "' instead"), i5, null, 4);
                throw null;
            }
            return l(luVar, i4, x);
        }
        for (int i6 = i; i6 < i3; i6++) {
            if (cArr[i6] == '\\') {
                return l(luVar, this.B, i6);
            }
        }
        this.B = i3 + 1;
        return xs6.V(cArr, i, Math.min(i3, luVar.B));
    }

    @Override // defpackage.u0
    public byte g() {
        n();
        int i = this.B;
        while (true) {
            int x = x(i);
            if (x != -1) {
                int i2 = x + 1;
                byte n = l.n(this.f0.A[x]);
                if (n != 3) {
                    this.B = i2;
                    return n;
                }
                i = i2;
            } else {
                this.B = x;
                return (byte) 10;
            }
        }
    }

    @Override // defpackage.u0
    public void i(char c) {
        n();
        int i = this.B;
        while (true) {
            int x = x(i);
            if (x != -1) {
                int i2 = x + 1;
                char c2 = this.f0.A[x];
                if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                    this.B = i2;
                    if (c2 == c) {
                        return;
                    }
                    B(c);
                    throw null;
                }
                i = i2;
            } else {
                this.B = x;
                B(c);
                throw null;
            }
        }
    }

    @Override // defpackage.u0
    public final void n() {
        int i = this.f0.B - this.B;
        if (i > this.e0) {
            return;
        }
        C(i);
    }

    @Override // defpackage.u0
    public final CharSequence s() {
        return this.f0;
    }

    @Override // defpackage.u0
    public final String u(String str) {
        str.getClass();
        return null;
    }

    @Override // defpackage.u0
    public final int x(int i) {
        lu luVar = this.f0;
        if (i < luVar.B) {
            return i;
        }
        this.B = i;
        n();
        if (this.B == 0 && luVar.length() != 0) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.u0
    public int y() {
        int x;
        char c;
        int i = this.B;
        while (true) {
            x = x(i);
            if (x == -1 || !((c = this.f0.A[x]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = x + 1;
        }
        this.B = x;
        return x;
    }

    @Override // defpackage.u0
    public final String z(int i, int i2) {
        lu luVar = this.f0;
        return xs6.V(luVar.A, i, Math.min(i2, luVar.B));
    }
}
