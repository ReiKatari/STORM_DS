package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m45  reason: default package */
/* loaded from: classes.dex */
public class m45 extends t0 {
    public final t71 Z;
    public final char[] c0;
    public int d0;
    public final tt e0;

    public m45(t71 t71Var, char[] cArr, e73 e73Var) {
        super(e73Var);
        this.Z = t71Var;
        this.c0 = cArr;
        this.d0 = 128;
        this.e0 = new tt(cArr);
        C(0);
    }

    public final void C(int i) {
        tt ttVar = this.e0;
        char[] cArr = ttVar.A;
        if (i != 0) {
            int i2 = this.B;
            System.arraycopy(cArr, i2, cArr, 0, (i2 + i) - i2);
        }
        int i3 = ttVar.B;
        while (true) {
            if (i == i3) {
                break;
            }
            t71 t71Var = this.Z;
            t71Var.getClass();
            int a = ((gk0) t71Var.B).a(cArr, i, i3 - i);
            if (a == -1) {
                ttVar.B = Math.min(ttVar.A.length, i);
                this.d0 = -1;
                break;
            }
            i += a;
        }
        this.B = 0;
    }

    public final void D() {
        bk0 bk0Var = bk0.c;
        bk0Var.getClass();
        char[] cArr = this.c0;
        cArr.getClass();
        if (cArr.length == 16384) {
            bk0Var.b(cArr);
            return;
        }
        int length = cArr.length;
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + length).toString());
    }

    @Override // defpackage.t0
    public final void c(int i, int i2) {
        ((StringBuilder) this.Y).append(this.e0.A, i, i2 - i);
    }

    @Override // defpackage.t0
    public boolean d() {
        n();
        int i = this.B;
        while (true) {
            int x = x(i);
            if (x != -1) {
                char c = this.e0.A[x];
                if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                    this.B = x;
                    return t0.t(c);
                }
                i = x + 1;
            } else {
                this.B = x;
                return false;
            }
        }
    }

    @Override // defpackage.t0
    public final String f() {
        String str;
        i('\"');
        int i = this.B;
        tt ttVar = this.e0;
        int i2 = ttVar.B;
        char[] cArr = ttVar.A;
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
                if (i4 != ttVar.B && i5 >= 0) {
                    str = String.valueOf(ttVar.A[i5]);
                } else {
                    str = "EOF";
                }
                t0.q(this, wh1.A("Expected quotation mark '\"', but had '", str, "' instead"), i5, null, 4);
                throw null;
            }
            return l(ttVar, i4, x);
        }
        for (int i6 = i; i6 < i3; i6++) {
            if (cArr[i6] == '\\') {
                return l(ttVar, this.B, i6);
            }
        }
        this.B = i3 + 1;
        return gh6.c0(cArr, i, Math.min(i3, ttVar.B));
    }

    @Override // defpackage.t0
    public byte g() {
        n();
        int i = this.B;
        while (true) {
            int x = x(i);
            if (x != -1) {
                int i2 = x + 1;
                byte n = jv3.n(this.e0.A[x]);
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

    @Override // defpackage.t0
    public void i(char c) {
        n();
        int i = this.B;
        while (true) {
            int x = x(i);
            if (x != -1) {
                int i2 = x + 1;
                char c2 = this.e0.A[x];
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

    @Override // defpackage.t0
    public final void n() {
        int i = this.e0.B - this.B;
        if (i > this.d0) {
            return;
        }
        C(i);
    }

    @Override // defpackage.t0
    public final CharSequence s() {
        return this.e0;
    }

    @Override // defpackage.t0
    public final String u(String str) {
        str.getClass();
        return null;
    }

    @Override // defpackage.t0
    public final int x(int i) {
        tt ttVar = this.e0;
        if (i < ttVar.B) {
            return i;
        }
        this.B = i;
        n();
        if (this.B == 0 && ttVar.length() != 0) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.t0
    public int y() {
        int x;
        char c;
        int i = this.B;
        while (true) {
            x = x(i);
            if (x == -1 || !((c = this.e0.A[x]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = x + 1;
        }
        this.B = x;
        return x;
    }

    @Override // defpackage.t0
    public final String z(int i, int i2) {
        tt ttVar = this.e0;
        return gh6.c0(ttVar.A, i, Math.min(i2, ttVar.B));
    }
}
