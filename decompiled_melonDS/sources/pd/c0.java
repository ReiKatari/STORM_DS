package pd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class c0 extends a {

    /* renamed from: e  reason: collision with root package name */
    public final l.i0 f11565e;

    /* renamed from: f  reason: collision with root package name */
    public final char[] f11566f;

    /* renamed from: g  reason: collision with root package name */
    public int f11567g = 128;

    /* renamed from: h  reason: collision with root package name */
    public final c f11568h;

    public c0(l.i0 i0Var, char[] cArr) {
        this.f11565e = i0Var;
        this.f11566f = cArr;
        this.f11568h = new c(cArr);
        B(0);
    }

    public final void B(int i2) {
        c cVar = this.f11568h;
        char[] cArr = cVar.A;
        if (i2 != 0) {
            int i10 = this.f11551a;
            System.arraycopy(cArr, i10, cArr, 0, (i10 + i2) - i10);
        }
        int i11 = cVar.B;
        while (true) {
            if (i2 == i11) {
                break;
            }
            l.i0 i0Var = this.f11565e;
            i0Var.getClass();
            int a10 = ((k) i0Var.B).a(cArr, i2, i11 - i2);
            if (a10 == -1) {
                cVar.B = Math.min(cVar.A.length, i2);
                this.f11567g = -1;
                break;
            }
            i2 += a10;
        }
        this.f11551a = 0;
    }

    public final void C() {
        i iVar = i.L;
        iVar.getClass();
        char[] cArr = this.f11566f;
        cArr.getClass();
        if (cArr.length == 16384) {
            iVar.f(cArr);
            return;
        }
        int length = cArr.length;
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + length).toString());
    }

    @Override // pd.a
    public final void b(int i2, int i10) {
        this.f11554d.append(this.f11568h.A, i2, i10 - i2);
    }

    @Override // pd.a
    public boolean c() {
        m();
        int i2 = this.f11551a;
        while (true) {
            int w10 = w(i2);
            if (w10 != -1) {
                char c4 = this.f11568h.A[w10];
                if (c4 != ' ' && c4 != '\n' && c4 != '\r' && c4 != '\t') {
                    this.f11551a = w10;
                    return a.s(c4);
                }
                i2 = w10 + 1;
            } else {
                this.f11551a = w10;
                return false;
            }
        }
    }

    @Override // pd.a
    public final String e() {
        String str;
        h('\"');
        int i2 = this.f11551a;
        c cVar = this.f11568h;
        int i10 = cVar.B;
        char[] cArr = cVar.A;
        int i11 = i2;
        while (true) {
            if (i11 < i10) {
                if (cArr[i11] == '\"') {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 == -1) {
            int w10 = w(i2);
            int i12 = this.f11551a;
            if (w10 == -1) {
                int i13 = i12 - 1;
                if (i12 != cVar.B && i13 >= 0) {
                    str = String.valueOf(cVar.A[i13]);
                } else {
                    str = "EOF";
                }
                a.p(this, kc.a.g("Expected quotation mark '\"', but had '", str, "' instead"), i13, null, 4);
                throw null;
            }
            return k(cVar, i12, w10);
        }
        for (int i14 = i2; i14 < i11; i14++) {
            if (cArr[i14] == '\\') {
                return k(cVar, this.f11551a, i14);
            }
        }
        this.f11551a = i11 + 1;
        return vc.o.M(cArr, i2, Math.min(i11, cVar.B));
    }

    @Override // pd.a
    public byte f() {
        m();
        int i2 = this.f11551a;
        while (true) {
            int w10 = w(i2);
            if (w10 != -1) {
                int i10 = w10 + 1;
                byte g10 = t.g(this.f11568h.A[w10]);
                if (g10 != 3) {
                    this.f11551a = i10;
                    return g10;
                }
                i2 = i10;
            } else {
                this.f11551a = w10;
                return (byte) 10;
            }
        }
    }

    @Override // pd.a
    public void h(char c4) {
        m();
        int i2 = this.f11551a;
        while (true) {
            int w10 = w(i2);
            if (w10 != -1) {
                int i10 = w10 + 1;
                char c10 = this.f11568h.A[w10];
                if (c10 != ' ' && c10 != '\n' && c10 != '\r' && c10 != '\t') {
                    this.f11551a = i10;
                    if (c10 == c4) {
                        return;
                    }
                    A(c4);
                    throw null;
                }
                i2 = i10;
            } else {
                this.f11551a = w10;
                A(c4);
                throw null;
            }
        }
    }

    @Override // pd.a
    public final void m() {
        int i2 = this.f11568h.B - this.f11551a;
        if (i2 > this.f11567g) {
            return;
        }
        B(i2);
    }

    @Override // pd.a
    public final CharSequence r() {
        return this.f11568h;
    }

    @Override // pd.a
    public final String t(String str) {
        str.getClass();
        return null;
    }

    @Override // pd.a
    public final int w(int i2) {
        c cVar = this.f11568h;
        if (i2 < cVar.B) {
            return i2;
        }
        this.f11551a = i2;
        m();
        if (this.f11551a == 0 && cVar.length() != 0) {
            return 0;
        }
        return -1;
    }

    @Override // pd.a
    public int x() {
        int w10;
        char c4;
        int i2 = this.f11551a;
        while (true) {
            w10 = w(i2);
            if (w10 == -1 || !((c4 = this.f11568h.A[w10]) == ' ' || c4 == '\n' || c4 == '\r' || c4 == '\t')) {
                break;
            }
            i2 = w10 + 1;
        }
        this.f11551a = w10;
        return w10;
    }

    @Override // pd.a
    public final String y(int i2, int i10) {
        c cVar = this.f11568h;
        return vc.o.M(cVar.A, i2, Math.min(i10, cVar.B));
    }
}
