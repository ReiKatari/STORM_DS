package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ls0  reason: default package */
/* loaded from: classes.dex */
public final class ls0 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public ls0(ks0 ks0Var) {
        this.a = 0;
        this.d = 0;
        Charset charset = aa3.a;
        this.e = ks0Var;
        ks0Var.b = this;
    }

    public static void W(int i) {
        if ((i & 3) == 0) {
            return;
        }
        throw ub3.d();
    }

    public static void X(int i) {
        if ((i & 7) == 0) {
            return;
        }
        throw ub3.d();
    }

    public void A(List list) {
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        boolean z = list instanceof a93;
        int i = this.b;
        if (z) {
            a93 a93Var = (a93) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = ks0Var.c() + ks0Var.i();
                    do {
                        a93Var.b(ks0Var.i());
                    } while (ks0Var.c() < c);
                    U(c);
                    return;
                }
                throw ub3.b();
            }
            do {
                a93Var.b(ks0Var.i());
                if (!ks0Var.d()) {
                    l2 = ks0Var.l();
                } else {
                    return;
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int c2 = ks0Var.c() + ks0Var.i();
                do {
                    list.add(Integer.valueOf(ks0Var.i()));
                } while (ks0Var.c() < c2);
                U(c2);
                return;
            }
            throw ub3.b();
        }
        do {
            list.add(Integer.valueOf(ks0Var.i()));
            if (ks0Var.d()) {
                return;
            }
            l = ks0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public long B() {
        V(0);
        return ((ks0) this.e).j();
    }

    public void C(List list) {
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        boolean z = list instanceof uy3;
        int i = this.b;
        if (z) {
            uy3 uy3Var = (uy3) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = ks0Var.c() + ks0Var.i();
                    do {
                        uy3Var.b(ks0Var.j());
                    } while (ks0Var.c() < c);
                    U(c);
                    return;
                }
                throw ub3.b();
            }
            do {
                uy3Var.b(ks0Var.j());
                if (!ks0Var.d()) {
                    l2 = ks0Var.l();
                } else {
                    return;
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int c2 = ks0Var.c() + ks0Var.i();
                do {
                    list.add(Long.valueOf(ks0Var.j()));
                } while (ks0Var.c() < c2);
                U(c2);
                return;
            }
            throw ub3.b();
        }
        do {
            list.add(Long.valueOf(ks0Var.j()));
            if (ks0Var.d()) {
                return;
            }
            l = ks0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public Object D(j66 j66Var, g82 g82Var) {
        ks0 ks0Var = (ks0) this.e;
        int i = ks0Var.i();
        if (ks0Var.a < 100) {
            int e = ks0Var.e(i);
            Object j = j66Var.j();
            ks0Var.a++;
            j66Var.d(j, this, g82Var);
            j66Var.a(j);
            if (ks0Var.h == 0) {
                ks0Var.a--;
                ks0Var.i = e;
                ks0Var.m();
                return j;
            }
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public Object E(j66 j66Var, g82 g82Var) {
        V(2);
        return D(j66Var, g82Var);
    }

    public int F() {
        V(5);
        return ((ks0) this.e).g();
    }

    public void G(List list) {
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        boolean z = list instanceof a93;
        int i = this.b;
        if (z) {
            a93 a93Var = (a93) list;
            int i2 = i & 7;
            if (i2 != 2) {
                if (i2 == 5) {
                    do {
                        a93Var.b(ks0Var.g());
                        if (!ks0Var.d()) {
                            l2 = ks0Var.l();
                        } else {
                            return;
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                throw ub3.b();
            }
            int i3 = ks0Var.i();
            W(i3);
            int c = ks0Var.c() + i3;
            do {
                a93Var.b(ks0Var.g());
            } while (ks0Var.c() < c);
            return;
        }
        int i4 = i & 7;
        if (i4 != 2) {
            if (i4 == 5) {
                do {
                    list.add(Integer.valueOf(ks0Var.g()));
                    if (!ks0Var.d()) {
                        l = ks0Var.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            throw ub3.b();
        }
        int i5 = ks0Var.i();
        W(i5);
        int c2 = ks0Var.c() + i5;
        do {
            list.add(Integer.valueOf(ks0Var.g()));
        } while (ks0Var.c() < c2);
    }

    public long H() {
        V(1);
        return ((ks0) this.e).h();
    }

    public void I(List list) {
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        boolean z = list instanceof uy3;
        int i = this.b;
        if (z) {
            uy3 uy3Var = (uy3) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = ks0Var.i();
                    X(i3);
                    int c = ks0Var.c() + i3;
                    do {
                        uy3Var.b(ks0Var.h());
                    } while (ks0Var.c() < c);
                    return;
                }
                throw ub3.b();
            }
            do {
                uy3Var.b(ks0Var.h());
                if (!ks0Var.d()) {
                    l2 = ks0Var.l();
                } else {
                    return;
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        int i4 = i & 7;
        if (i4 != 1) {
            if (i4 == 2) {
                int i5 = ks0Var.i();
                X(i5);
                int c2 = ks0Var.c() + i5;
                do {
                    list.add(Long.valueOf(ks0Var.h()));
                } while (ks0Var.c() < c2);
                return;
            }
            throw ub3.b();
        }
        do {
            list.add(Long.valueOf(ks0Var.h()));
            if (ks0Var.d()) {
                return;
            }
            l = ks0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public int J() {
        V(0);
        return ks0.a(((ks0) this.e).i());
    }

    public void K(List list) {
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        boolean z = list instanceof a93;
        int i = this.b;
        if (z) {
            a93 a93Var = (a93) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = ks0Var.c() + ks0Var.i();
                    do {
                        a93Var.b(ks0.a(ks0Var.i()));
                    } while (ks0Var.c() < c);
                    U(c);
                    return;
                }
                throw ub3.b();
            }
            do {
                a93Var.b(ks0.a(ks0Var.i()));
                if (!ks0Var.d()) {
                    l2 = ks0Var.l();
                } else {
                    return;
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int c2 = ks0Var.c() + ks0Var.i();
                do {
                    list.add(Integer.valueOf(ks0.a(ks0Var.i())));
                } while (ks0Var.c() < c2);
                U(c2);
                return;
            }
            throw ub3.b();
        }
        do {
            list.add(Integer.valueOf(ks0.a(ks0Var.i())));
            if (ks0Var.d()) {
                return;
            }
            l = ks0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public long L() {
        V(0);
        return ks0.b(((ks0) this.e).j());
    }

    public void M(List list) {
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        boolean z = list instanceof uy3;
        int i = this.b;
        if (z) {
            uy3 uy3Var = (uy3) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = ks0Var.c() + ks0Var.i();
                    do {
                        uy3Var.b(ks0.b(ks0Var.j()));
                    } while (ks0Var.c() < c);
                    U(c);
                    return;
                }
                throw ub3.b();
            }
            do {
                uy3Var.b(ks0.b(ks0Var.j()));
                if (!ks0Var.d()) {
                    l2 = ks0Var.l();
                } else {
                    return;
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int c2 = ks0Var.c() + ks0Var.i();
                do {
                    list.add(Long.valueOf(ks0.b(ks0Var.j())));
                } while (ks0Var.c() < c2);
                U(c2);
                return;
            }
            throw ub3.b();
        }
        do {
            list.add(Long.valueOf(ks0.b(ks0Var.j())));
            if (ks0Var.d()) {
                return;
            }
            l = ks0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public String N() {
        V(2);
        ks0 ks0Var = (ks0) this.e;
        int i = ks0Var.i();
        if (i > 0) {
            int i2 = ks0Var.d;
            int i3 = ks0Var.f;
            if (i <= i2 - i3) {
                String str = new String(ks0Var.c, i3, i, aa3.a);
                ks0Var.f += i;
                return str;
            }
        }
        if (i == 0) {
            return "";
        }
        if (i < 0) {
            throw ub3.c();
        }
        throw ub3.e();
    }

    public void O(List list, boolean z) {
        String N;
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        if ((this.b & 7) == 2) {
            if ((list instanceof wr3) && !z) {
                wr3 wr3Var = (wr3) list;
                do {
                    wr3Var.e(k());
                    if (!ks0Var.d()) {
                        l2 = ks0Var.l();
                    } else {
                        return;
                    }
                } while (l2 == this.b);
                this.d = l2;
                return;
            }
            do {
                if (z) {
                    N = P();
                } else {
                    N = N();
                }
                list.add(N);
                if (ks0Var.d()) {
                    return;
                }
                l = ks0Var.l();
            } while (l == this.b);
            this.d = l;
            return;
        }
        throw ub3.b();
    }

    public String P() {
        V(2);
        ks0 ks0Var = (ks0) this.e;
        int i = ks0Var.i();
        if (i > 0) {
            int i2 = ks0Var.d;
            int i3 = ks0Var.f;
            if (i <= i2 - i3) {
                String m = xj7.a.m(ks0Var.c, i3, i);
                ks0Var.f += i;
                return m;
            }
        }
        if (i == 0) {
            return "";
        }
        if (i <= 0) {
            throw ub3.c();
        }
        throw ub3.e();
    }

    public int Q() {
        V(0);
        return ((ks0) this.e).i();
    }

    public void R(List list) {
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        boolean z = list instanceof a93;
        int i = this.b;
        if (z) {
            a93 a93Var = (a93) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = ks0Var.c() + ks0Var.i();
                    do {
                        a93Var.b(ks0Var.i());
                    } while (ks0Var.c() < c);
                    U(c);
                    return;
                }
                throw ub3.b();
            }
            do {
                a93Var.b(ks0Var.i());
                if (!ks0Var.d()) {
                    l2 = ks0Var.l();
                } else {
                    return;
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int c2 = ks0Var.c() + ks0Var.i();
                do {
                    list.add(Integer.valueOf(ks0Var.i()));
                } while (ks0Var.c() < c2);
                U(c2);
                return;
            }
            throw ub3.b();
        }
        do {
            list.add(Integer.valueOf(ks0Var.i()));
            if (ks0Var.d()) {
                return;
            }
            l = ks0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public long S() {
        V(0);
        return ((ks0) this.e).j();
    }

    public void T(List list) {
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        boolean z = list instanceof uy3;
        int i = this.b;
        if (z) {
            uy3 uy3Var = (uy3) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = ks0Var.c() + ks0Var.i();
                    do {
                        uy3Var.b(ks0Var.j());
                    } while (ks0Var.c() < c);
                    U(c);
                    return;
                }
                throw ub3.b();
            }
            do {
                uy3Var.b(ks0Var.j());
                if (!ks0Var.d()) {
                    l2 = ks0Var.l();
                } else {
                    return;
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int c2 = ks0Var.c() + ks0Var.i();
                do {
                    list.add(Long.valueOf(ks0Var.j()));
                } while (ks0Var.c() < c2);
                U(c2);
                return;
            }
            throw ub3.b();
        }
        do {
            list.add(Long.valueOf(ks0Var.j()));
            if (ks0Var.d()) {
                return;
            }
            l = ks0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public void U(int i) {
        if (((ks0) this.e).c() == i) {
            return;
        }
        throw ub3.e();
    }

    public void V(int i) {
        if ((this.b & 7) == i) {
            return;
        }
        throw ub3.b();
    }

    public void a(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                int i3 = this.d;
                int i4 = i3 * 2;
                int[] iArr = (int[]) this.e;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.e = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i4 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 4];
                    this.e = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = (int[]) this.e;
                iArr4[i4] = i;
                iArr4[i4 + 1] = i2;
                this.d++;
                return;
            }
            i.h("Pixel distance must be non-negative");
            return;
        }
        i.h("Layout positions must be non-negative");
    }

    public da6 b(int i) {
        return new da6(nj2.u((a47) this.e, i), i, 1L);
    }

    public void c(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = (int[]) this.e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        gg5 gg5Var = recyclerView.m0;
        if (recyclerView.l0 != null && gg5Var != null && gg5Var.i) {
            if (z) {
                if (!recyclerView.d0.j()) {
                    gg5Var.i(recyclerView.l0.a(), this);
                }
            } else if (!recyclerView.P()) {
                gg5Var.h(this.b, this.c, recyclerView.d1, this);
            }
            int i = this.d;
            if (i > gg5Var.j) {
                gg5Var.j = i;
                gg5Var.k = z;
                recyclerView.L.q();
            }
        }
    }

    public int d() {
        return this.d - this.c;
    }

    public int e() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = ((ks0) this.e).l();
        }
        int i2 = this.b;
        if (i2 != 0 && i2 != this.c) {
            return i2 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public int f(int i) {
        return ((co4) this.e).e[this.c + i];
    }

    public Object g(int i) {
        return ((co4) this.e).g[this.d + i];
    }

    public int h() {
        return this.b;
    }

    public boolean i() {
        V(0);
        return ((ks0) this.e).f();
    }

    public void j(List list) {
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        boolean z = list instanceof s50;
        int i = this.b;
        if (z) {
            s50 s50Var = (s50) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = ks0Var.c() + ks0Var.i();
                    do {
                        s50Var.b(ks0Var.f());
                    } while (ks0Var.c() < c);
                    U(c);
                    return;
                }
                throw ub3.b();
            }
            do {
                s50Var.b(ks0Var.f());
                if (!ks0Var.d()) {
                    l2 = ks0Var.l();
                } else {
                    return;
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int c2 = ks0Var.c() + ks0Var.i();
                do {
                    list.add(Boolean.valueOf(ks0Var.f()));
                } while (ks0Var.c() < c2);
                U(c2);
                return;
            }
            throw ub3.b();
        }
        do {
            list.add(Boolean.valueOf(ks0Var.f()));
            if (ks0Var.d()) {
                return;
            }
            l = ks0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public ca0 k() {
        byte[] bArr;
        V(2);
        ks0 ks0Var = (ks0) this.e;
        byte[] bArr2 = ks0Var.c;
        int i = ks0Var.i();
        if (i > 0) {
            int i2 = ks0Var.d;
            int i3 = ks0Var.f;
            if (i <= i2 - i3) {
                ca0 c = ea0.c(bArr2, i3, i);
                ks0Var.f += i;
                return c;
            }
        }
        if (i == 0) {
            return ea0.B;
        }
        if (i > 0) {
            int i4 = ks0Var.d;
            int i5 = ks0Var.f;
            if (i <= i4 - i5) {
                int i6 = i + i5;
                ks0Var.f = i6;
                bArr = Arrays.copyOfRange(bArr2, i5, i6);
                ca0 ca0Var = ea0.B;
                return new ca0(bArr);
            }
        }
        if (i <= 0) {
            if (i == 0) {
                bArr = aa3.b;
                ca0 ca0Var2 = ea0.B;
                return new ca0(bArr);
            }
            throw ub3.c();
        }
        throw ub3.e();
    }

    public void l(List list) {
        int l;
        ks0 ks0Var = (ks0) this.e;
        if ((this.b & 7) == 2) {
            do {
                list.add(k());
                if (ks0Var.d()) {
                    return;
                }
                l = ks0Var.l();
            } while (l == this.b);
            this.d = l;
            return;
        }
        throw ub3.b();
    }

    public double m() {
        V(1);
        return Double.longBitsToDouble(((ks0) this.e).h());
    }

    public void n(List list) {
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        boolean z = list instanceof cm1;
        int i = this.b;
        if (z) {
            cm1 cm1Var = (cm1) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = ks0Var.i();
                    X(i3);
                    int c = ks0Var.c() + i3;
                    do {
                        cm1Var.b(Double.longBitsToDouble(ks0Var.h()));
                    } while (ks0Var.c() < c);
                    return;
                }
                throw ub3.b();
            }
            do {
                cm1Var.b(Double.longBitsToDouble(ks0Var.h()));
                if (!ks0Var.d()) {
                    l2 = ks0Var.l();
                } else {
                    return;
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        int i4 = i & 7;
        if (i4 != 1) {
            if (i4 == 2) {
                int i5 = ks0Var.i();
                X(i5);
                int c2 = ks0Var.c() + i5;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(ks0Var.h())));
                } while (ks0Var.c() < c2);
                return;
            }
            throw ub3.b();
        }
        do {
            list.add(Double.valueOf(Double.longBitsToDouble(ks0Var.h())));
            if (ks0Var.d()) {
                return;
            }
            l = ks0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public int o() {
        V(0);
        return ((ks0) this.e).i();
    }

    public void p(List list) {
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        boolean z = list instanceof a93;
        int i = this.b;
        if (z) {
            a93 a93Var = (a93) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = ks0Var.c() + ks0Var.i();
                    do {
                        a93Var.b(ks0Var.i());
                    } while (ks0Var.c() < c);
                    U(c);
                    return;
                }
                throw ub3.b();
            }
            do {
                a93Var.b(ks0Var.i());
                if (!ks0Var.d()) {
                    l2 = ks0Var.l();
                } else {
                    return;
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int c2 = ks0Var.c() + ks0Var.i();
                do {
                    list.add(Integer.valueOf(ks0Var.i()));
                } while (ks0Var.c() < c2);
                U(c2);
                return;
            }
            throw ub3.b();
        }
        do {
            list.add(Integer.valueOf(ks0Var.i()));
            if (ks0Var.d()) {
                return;
            }
            l = ks0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public int q() {
        V(5);
        return ((ks0) this.e).g();
    }

    public void r(List list) {
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        boolean z = list instanceof a93;
        int i = this.b;
        if (z) {
            a93 a93Var = (a93) list;
            int i2 = i & 7;
            if (i2 != 2) {
                if (i2 == 5) {
                    do {
                        a93Var.b(ks0Var.g());
                        if (!ks0Var.d()) {
                            l2 = ks0Var.l();
                        } else {
                            return;
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                throw ub3.b();
            }
            int i3 = ks0Var.i();
            W(i3);
            int c = ks0Var.c() + i3;
            do {
                a93Var.b(ks0Var.g());
            } while (ks0Var.c() < c);
            return;
        }
        int i4 = i & 7;
        if (i4 != 2) {
            if (i4 == 5) {
                do {
                    list.add(Integer.valueOf(ks0Var.g()));
                    if (!ks0Var.d()) {
                        l = ks0Var.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            throw ub3.b();
        }
        int i5 = ks0Var.i();
        W(i5);
        int c2 = ks0Var.c() + i5;
        do {
            list.add(Integer.valueOf(ks0Var.g()));
        } while (ks0Var.c() < c2);
    }

    public long s() {
        V(1);
        return ((ks0) this.e).h();
    }

    public void t(List list) {
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        boolean z = list instanceof uy3;
        int i = this.b;
        if (z) {
            uy3 uy3Var = (uy3) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = ks0Var.i();
                    X(i3);
                    int c = ks0Var.c() + i3;
                    do {
                        uy3Var.b(ks0Var.h());
                    } while (ks0Var.c() < c);
                    return;
                }
                throw ub3.b();
            }
            do {
                uy3Var.b(ks0Var.h());
                if (!ks0Var.d()) {
                    l2 = ks0Var.l();
                } else {
                    return;
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        int i4 = i & 7;
        if (i4 != 1) {
            if (i4 == 2) {
                int i5 = ks0Var.i();
                X(i5);
                int c2 = ks0Var.c() + i5;
                do {
                    list.add(Long.valueOf(ks0Var.h()));
                } while (ks0Var.c() < c2);
                return;
            }
            throw ub3.b();
        }
        do {
            list.add(Long.valueOf(ks0Var.h()));
            if (ks0Var.d()) {
                return;
            }
            l = ks0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "";
            case 4:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.b;
                sb.append(i);
                sb.append('-');
                a47 a47Var = (a47) this.e;
                sb.append(nj2.u(a47Var, i));
                sb.append(',');
                int i2 = this.c;
                sb.append(i2);
                sb.append('-');
                sb.append(nj2.u(a47Var, i2));
                sb.append("), prevOffset=");
                return xg6.q(sb, this.d, ')');
            default:
                return super.toString();
        }
    }

    public float u() {
        V(5);
        return Float.intBitsToFloat(((ks0) this.e).g());
    }

    public void v(List list) {
        int l;
        int l2;
        ks0 ks0Var = (ks0) this.e;
        boolean z = list instanceof zd2;
        int i = this.b;
        if (z) {
            zd2 zd2Var = (zd2) list;
            int i2 = i & 7;
            if (i2 != 2) {
                if (i2 == 5) {
                    do {
                        zd2Var.b(Float.intBitsToFloat(ks0Var.g()));
                        if (!ks0Var.d()) {
                            l2 = ks0Var.l();
                        } else {
                            return;
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                throw ub3.b();
            }
            int i3 = ks0Var.i();
            W(i3);
            int c = ks0Var.c() + i3;
            do {
                zd2Var.b(Float.intBitsToFloat(ks0Var.g()));
            } while (ks0Var.c() < c);
            return;
        }
        int i4 = i & 7;
        if (i4 != 2) {
            if (i4 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(ks0Var.g())));
                    if (!ks0Var.d()) {
                        l = ks0Var.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            throw ub3.b();
        }
        int i5 = ks0Var.i();
        W(i5);
        int c2 = ks0Var.c() + i5;
        do {
            list.add(Float.valueOf(Float.intBitsToFloat(ks0Var.g())));
        } while (ks0Var.c() < c2);
    }

    public Object w(j66 j66Var, g82 g82Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object j = j66Var.j();
            j66Var.d(j, this, g82Var);
            j66Var.a(j);
            if (this.b == this.c) {
                return j;
            }
            throw ub3.d();
        } finally {
            this.c = i;
        }
    }

    public Object x(j66 j66Var, g82 g82Var) {
        V(3);
        return w(j66Var, g82Var);
    }

    public void y(List list, j66 j66Var, g82 g82Var) {
        int l;
        ks0 ks0Var = (ks0) this.e;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                list.add(w(j66Var, g82Var));
                if (!ks0Var.d() && this.d == 0) {
                    l = ks0Var.l();
                } else {
                    return;
                }
            } while (l == i);
            this.d = l;
            return;
        }
        throw ub3.b();
    }

    public int z() {
        V(0);
        return ((ks0) this.e).i();
    }

    public /* synthetic */ ls0(int i) {
        this.a = i;
    }

    public ls0(co4 co4Var) {
        this.a = 3;
        this.e = co4Var;
    }

    public ls0(int i, int i2, int i3, a47 a47Var) {
        this.a = 4;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = a47Var;
    }
}
