package defpackage;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yp0  reason: default package */
/* loaded from: classes.dex */
public final class yp0 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public yp0(xp0 xp0Var) {
        this.a = 0;
        this.d = 0;
        Charset charset = s33.a;
        this.e = xp0Var;
        xp0Var.b = this;
    }

    public static void W(int i) {
        if ((i & 3) == 0) {
            return;
        }
        throw i53.d();
    }

    public static void X(int i) {
        if ((i & 7) == 0) {
            return;
        }
        throw i53.d();
    }

    public void A(List list) {
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        boolean z = list instanceof s23;
        int i = this.b;
        if (z) {
            s23 s23Var = (s23) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = xp0Var.c() + xp0Var.i();
                    do {
                        s23Var.c(xp0Var.i());
                    } while (xp0Var.c() < c);
                    U(c);
                    return;
                }
                throw i53.b();
            }
            do {
                s23Var.c(xp0Var.i());
                if (!xp0Var.d()) {
                    l2 = xp0Var.l();
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
                int c2 = xp0Var.c() + xp0Var.i();
                do {
                    list.add(Integer.valueOf(xp0Var.i()));
                } while (xp0Var.c() < c2);
                U(c2);
                return;
            }
            throw i53.b();
        }
        do {
            list.add(Integer.valueOf(xp0Var.i()));
            if (xp0Var.d()) {
                return;
            }
            l = xp0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public long B() {
        V(0);
        return ((xp0) this.e).j();
    }

    public void C(List list) {
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        boolean z = list instanceof pr3;
        int i = this.b;
        if (z) {
            pr3 pr3Var = (pr3) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = xp0Var.c() + xp0Var.i();
                    do {
                        pr3Var.c(xp0Var.j());
                    } while (xp0Var.c() < c);
                    U(c);
                    return;
                }
                throw i53.b();
            }
            do {
                pr3Var.c(xp0Var.j());
                if (!xp0Var.d()) {
                    l2 = xp0Var.l();
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
                int c2 = xp0Var.c() + xp0Var.i();
                do {
                    list.add(Long.valueOf(xp0Var.j()));
                } while (xp0Var.c() < c2);
                U(c2);
                return;
            }
            throw i53.b();
        }
        do {
            list.add(Long.valueOf(xp0Var.j()));
            if (xp0Var.d()) {
                return;
            }
            l = xp0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public Object D(cv5 cv5Var, o32 o32Var) {
        xp0 xp0Var = (xp0) this.e;
        int i = xp0Var.i();
        if (xp0Var.a < 100) {
            int e = xp0Var.e(i);
            Object j = cv5Var.j();
            xp0Var.a++;
            cv5Var.i(j, this, o32Var);
            cv5Var.d(j);
            if (xp0Var.h == 0) {
                xp0Var.a--;
                xp0Var.i = e;
                xp0Var.m();
                return j;
            }
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public Object E(cv5 cv5Var, o32 o32Var) {
        V(2);
        return D(cv5Var, o32Var);
    }

    public int F() {
        V(5);
        return ((xp0) this.e).g();
    }

    public void G(List list) {
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        boolean z = list instanceof s23;
        int i = this.b;
        if (z) {
            s23 s23Var = (s23) list;
            int i2 = i & 7;
            if (i2 != 2) {
                if (i2 == 5) {
                    do {
                        s23Var.c(xp0Var.g());
                        if (!xp0Var.d()) {
                            l2 = xp0Var.l();
                        } else {
                            return;
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                throw i53.b();
            }
            int i3 = xp0Var.i();
            W(i3);
            int c = xp0Var.c() + i3;
            do {
                s23Var.c(xp0Var.g());
            } while (xp0Var.c() < c);
            return;
        }
        int i4 = i & 7;
        if (i4 != 2) {
            if (i4 == 5) {
                do {
                    list.add(Integer.valueOf(xp0Var.g()));
                    if (!xp0Var.d()) {
                        l = xp0Var.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            throw i53.b();
        }
        int i5 = xp0Var.i();
        W(i5);
        int c2 = xp0Var.c() + i5;
        do {
            list.add(Integer.valueOf(xp0Var.g()));
        } while (xp0Var.c() < c2);
    }

    public long H() {
        V(1);
        return ((xp0) this.e).h();
    }

    public void I(List list) {
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        boolean z = list instanceof pr3;
        int i = this.b;
        if (z) {
            pr3 pr3Var = (pr3) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = xp0Var.i();
                    X(i3);
                    int c = xp0Var.c() + i3;
                    do {
                        pr3Var.c(xp0Var.h());
                    } while (xp0Var.c() < c);
                    return;
                }
                throw i53.b();
            }
            do {
                pr3Var.c(xp0Var.h());
                if (!xp0Var.d()) {
                    l2 = xp0Var.l();
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
                int i5 = xp0Var.i();
                X(i5);
                int c2 = xp0Var.c() + i5;
                do {
                    list.add(Long.valueOf(xp0Var.h()));
                } while (xp0Var.c() < c2);
                return;
            }
            throw i53.b();
        }
        do {
            list.add(Long.valueOf(xp0Var.h()));
            if (xp0Var.d()) {
                return;
            }
            l = xp0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public int J() {
        V(0);
        return xp0.a(((xp0) this.e).i());
    }

    public void K(List list) {
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        boolean z = list instanceof s23;
        int i = this.b;
        if (z) {
            s23 s23Var = (s23) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = xp0Var.c() + xp0Var.i();
                    do {
                        s23Var.c(xp0.a(xp0Var.i()));
                    } while (xp0Var.c() < c);
                    U(c);
                    return;
                }
                throw i53.b();
            }
            do {
                s23Var.c(xp0.a(xp0Var.i()));
                if (!xp0Var.d()) {
                    l2 = xp0Var.l();
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
                int c2 = xp0Var.c() + xp0Var.i();
                do {
                    list.add(Integer.valueOf(xp0.a(xp0Var.i())));
                } while (xp0Var.c() < c2);
                U(c2);
                return;
            }
            throw i53.b();
        }
        do {
            list.add(Integer.valueOf(xp0.a(xp0Var.i())));
            if (xp0Var.d()) {
                return;
            }
            l = xp0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public long L() {
        V(0);
        return xp0.b(((xp0) this.e).j());
    }

    public void M(List list) {
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        boolean z = list instanceof pr3;
        int i = this.b;
        if (z) {
            pr3 pr3Var = (pr3) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = xp0Var.c() + xp0Var.i();
                    do {
                        pr3Var.c(xp0.b(xp0Var.j()));
                    } while (xp0Var.c() < c);
                    U(c);
                    return;
                }
                throw i53.b();
            }
            do {
                pr3Var.c(xp0.b(xp0Var.j()));
                if (!xp0Var.d()) {
                    l2 = xp0Var.l();
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
                int c2 = xp0Var.c() + xp0Var.i();
                do {
                    list.add(Long.valueOf(xp0.b(xp0Var.j())));
                } while (xp0Var.c() < c2);
                U(c2);
                return;
            }
            throw i53.b();
        }
        do {
            list.add(Long.valueOf(xp0.b(xp0Var.j())));
            if (xp0Var.d()) {
                return;
            }
            l = xp0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public String N() {
        V(2);
        xp0 xp0Var = (xp0) this.e;
        int i = xp0Var.i();
        if (i > 0) {
            int i2 = xp0Var.d;
            int i3 = xp0Var.f;
            if (i <= i2 - i3) {
                String str = new String(xp0Var.c, i3, i, s33.a);
                xp0Var.f += i;
                return str;
            }
        }
        if (i == 0) {
            return "";
        }
        if (i < 0) {
            throw i53.c();
        }
        throw i53.e();
    }

    public void O(List list, boolean z) {
        String N;
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        if ((this.b & 7) == 2) {
            if ((list instanceof vk3) && !z) {
                vk3 vk3Var = (vk3) list;
                do {
                    vk3Var.a(k());
                    if (!xp0Var.d()) {
                        l2 = xp0Var.l();
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
                if (xp0Var.d()) {
                    return;
                }
                l = xp0Var.l();
            } while (l == this.b);
            this.d = l;
            return;
        }
        throw i53.b();
    }

    public String P() {
        V(2);
        xp0 xp0Var = (xp0) this.e;
        int i = xp0Var.i();
        if (i > 0) {
            int i2 = xp0Var.d;
            int i3 = xp0Var.f;
            if (i <= i2 - i3) {
                String j = c67.a.j(xp0Var.c, i3, i);
                xp0Var.f += i;
                return j;
            }
        }
        if (i == 0) {
            return "";
        }
        if (i <= 0) {
            throw i53.c();
        }
        throw i53.e();
    }

    public int Q() {
        V(0);
        return ((xp0) this.e).i();
    }

    public void R(List list) {
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        boolean z = list instanceof s23;
        int i = this.b;
        if (z) {
            s23 s23Var = (s23) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = xp0Var.c() + xp0Var.i();
                    do {
                        s23Var.c(xp0Var.i());
                    } while (xp0Var.c() < c);
                    U(c);
                    return;
                }
                throw i53.b();
            }
            do {
                s23Var.c(xp0Var.i());
                if (!xp0Var.d()) {
                    l2 = xp0Var.l();
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
                int c2 = xp0Var.c() + xp0Var.i();
                do {
                    list.add(Integer.valueOf(xp0Var.i()));
                } while (xp0Var.c() < c2);
                U(c2);
                return;
            }
            throw i53.b();
        }
        do {
            list.add(Integer.valueOf(xp0Var.i()));
            if (xp0Var.d()) {
                return;
            }
            l = xp0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public long S() {
        V(0);
        return ((xp0) this.e).j();
    }

    public void T(List list) {
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        boolean z = list instanceof pr3;
        int i = this.b;
        if (z) {
            pr3 pr3Var = (pr3) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = xp0Var.c() + xp0Var.i();
                    do {
                        pr3Var.c(xp0Var.j());
                    } while (xp0Var.c() < c);
                    U(c);
                    return;
                }
                throw i53.b();
            }
            do {
                pr3Var.c(xp0Var.j());
                if (!xp0Var.d()) {
                    l2 = xp0Var.l();
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
                int c2 = xp0Var.c() + xp0Var.i();
                do {
                    list.add(Long.valueOf(xp0Var.j()));
                } while (xp0Var.c() < c2);
                U(c2);
                return;
            }
            throw i53.b();
        }
        do {
            list.add(Long.valueOf(xp0Var.j()));
            if (xp0Var.d()) {
                return;
            }
            l = xp0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public void U(int i) {
        if (((xp0) this.e).c() == i) {
            return;
        }
        throw i53.e();
    }

    public void V(int i) {
        if ((this.b & 7) == i) {
            return;
        }
        throw i53.b();
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
            i.i("Pixel distance must be non-negative");
            return;
        }
        i.i("Layout positions must be non-negative");
    }

    public qy5 b(int i) {
        return new qy5(hk2.F((lr6) this.e, i), i, 1L);
    }

    public void c(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = (int[]) this.e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        q65 q65Var = recyclerView.l0;
        if (recyclerView.k0 != null && q65Var != null && q65Var.i) {
            if (z) {
                if (!recyclerView.c0.j()) {
                    q65Var.i(recyclerView.k0.a(), this);
                }
            } else if (!recyclerView.P()) {
                q65Var.h(this.b, this.c, recyclerView.c1, this);
            }
            int i = this.d;
            if (i > q65Var.j) {
                q65Var.j = i;
                q65Var.k = z;
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
            this.b = ((xp0) this.e).l();
        }
        int i2 = this.b;
        if (i2 != 0 && i2 != this.c) {
            return i2 >>> 3;
        }
        return Preference.DEFAULT_ORDER;
    }

    public int f(int i) {
        return ((bf4) this.e).e0[this.c + i];
    }

    public Object g(int i) {
        return ((bf4) this.e).g0[this.d + i];
    }

    public int h() {
        return this.b;
    }

    public boolean i() {
        V(0);
        return ((xp0) this.e).f();
    }

    public void j(List list) {
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        boolean z = list instanceof u30;
        int i = this.b;
        if (z) {
            u30 u30Var = (u30) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = xp0Var.c() + xp0Var.i();
                    do {
                        u30Var.c(xp0Var.f());
                    } while (xp0Var.c() < c);
                    U(c);
                    return;
                }
                throw i53.b();
            }
            do {
                u30Var.c(xp0Var.f());
                if (!xp0Var.d()) {
                    l2 = xp0Var.l();
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
                int c2 = xp0Var.c() + xp0Var.i();
                do {
                    list.add(Boolean.valueOf(xp0Var.f()));
                } while (xp0Var.c() < c2);
                U(c2);
                return;
            }
            throw i53.b();
        }
        do {
            list.add(Boolean.valueOf(xp0Var.f()));
            if (xp0Var.d()) {
                return;
            }
            l = xp0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public v70 k() {
        byte[] bArr;
        V(2);
        xp0 xp0Var = (xp0) this.e;
        byte[] bArr2 = xp0Var.c;
        int i = xp0Var.i();
        if (i > 0) {
            int i2 = xp0Var.d;
            int i3 = xp0Var.f;
            if (i <= i2 - i3) {
                v70 d = x70.d(bArr2, i3, i);
                xp0Var.f += i;
                return d;
            }
        }
        if (i == 0) {
            return x70.B;
        }
        if (i > 0) {
            int i4 = xp0Var.d;
            int i5 = xp0Var.f;
            if (i <= i4 - i5) {
                int i6 = i + i5;
                xp0Var.f = i6;
                bArr = Arrays.copyOfRange(bArr2, i5, i6);
                v70 v70Var = x70.B;
                return new v70(bArr);
            }
        }
        if (i <= 0) {
            if (i == 0) {
                bArr = s33.b;
                v70 v70Var2 = x70.B;
                return new v70(bArr);
            }
            throw i53.c();
        }
        throw i53.e();
    }

    public void l(List list) {
        int l;
        xp0 xp0Var = (xp0) this.e;
        if ((this.b & 7) == 2) {
            do {
                list.add(k());
                if (xp0Var.d()) {
                    return;
                }
                l = xp0Var.l();
            } while (l == this.b);
            this.d = l;
            return;
        }
        throw i53.b();
    }

    public double m() {
        V(1);
        return Double.longBitsToDouble(((xp0) this.e).h());
    }

    public void n(List list) {
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        boolean z = list instanceof yh1;
        int i = this.b;
        if (z) {
            yh1 yh1Var = (yh1) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = xp0Var.i();
                    X(i3);
                    int c = xp0Var.c() + i3;
                    do {
                        yh1Var.c(Double.longBitsToDouble(xp0Var.h()));
                    } while (xp0Var.c() < c);
                    return;
                }
                throw i53.b();
            }
            do {
                yh1Var.c(Double.longBitsToDouble(xp0Var.h()));
                if (!xp0Var.d()) {
                    l2 = xp0Var.l();
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
                int i5 = xp0Var.i();
                X(i5);
                int c2 = xp0Var.c() + i5;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(xp0Var.h())));
                } while (xp0Var.c() < c2);
                return;
            }
            throw i53.b();
        }
        do {
            list.add(Double.valueOf(Double.longBitsToDouble(xp0Var.h())));
            if (xp0Var.d()) {
                return;
            }
            l = xp0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public int o() {
        V(0);
        return ((xp0) this.e).i();
    }

    public void p(List list) {
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        boolean z = list instanceof s23;
        int i = this.b;
        if (z) {
            s23 s23Var = (s23) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int c = xp0Var.c() + xp0Var.i();
                    do {
                        s23Var.c(xp0Var.i());
                    } while (xp0Var.c() < c);
                    U(c);
                    return;
                }
                throw i53.b();
            }
            do {
                s23Var.c(xp0Var.i());
                if (!xp0Var.d()) {
                    l2 = xp0Var.l();
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
                int c2 = xp0Var.c() + xp0Var.i();
                do {
                    list.add(Integer.valueOf(xp0Var.i()));
                } while (xp0Var.c() < c2);
                U(c2);
                return;
            }
            throw i53.b();
        }
        do {
            list.add(Integer.valueOf(xp0Var.i()));
            if (xp0Var.d()) {
                return;
            }
            l = xp0Var.l();
        } while (l == this.b);
        this.d = l;
    }

    public int q() {
        V(5);
        return ((xp0) this.e).g();
    }

    public void r(List list) {
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        boolean z = list instanceof s23;
        int i = this.b;
        if (z) {
            s23 s23Var = (s23) list;
            int i2 = i & 7;
            if (i2 != 2) {
                if (i2 == 5) {
                    do {
                        s23Var.c(xp0Var.g());
                        if (!xp0Var.d()) {
                            l2 = xp0Var.l();
                        } else {
                            return;
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                throw i53.b();
            }
            int i3 = xp0Var.i();
            W(i3);
            int c = xp0Var.c() + i3;
            do {
                s23Var.c(xp0Var.g());
            } while (xp0Var.c() < c);
            return;
        }
        int i4 = i & 7;
        if (i4 != 2) {
            if (i4 == 5) {
                do {
                    list.add(Integer.valueOf(xp0Var.g()));
                    if (!xp0Var.d()) {
                        l = xp0Var.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            throw i53.b();
        }
        int i5 = xp0Var.i();
        W(i5);
        int c2 = xp0Var.c() + i5;
        do {
            list.add(Integer.valueOf(xp0Var.g()));
        } while (xp0Var.c() < c2);
    }

    public long s() {
        V(1);
        return ((xp0) this.e).h();
    }

    public void t(List list) {
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        boolean z = list instanceof pr3;
        int i = this.b;
        if (z) {
            pr3 pr3Var = (pr3) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = xp0Var.i();
                    X(i3);
                    int c = xp0Var.c() + i3;
                    do {
                        pr3Var.c(xp0Var.h());
                    } while (xp0Var.c() < c);
                    return;
                }
                throw i53.b();
            }
            do {
                pr3Var.c(xp0Var.h());
                if (!xp0Var.d()) {
                    l2 = xp0Var.l();
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
                int i5 = xp0Var.i();
                X(i5);
                int c2 = xp0Var.c() + i5;
                do {
                    list.add(Long.valueOf(xp0Var.h()));
                } while (xp0Var.c() < c2);
                return;
            }
            throw i53.b();
        }
        do {
            list.add(Long.valueOf(xp0Var.h()));
            if (xp0Var.d()) {
                return;
            }
            l = xp0Var.l();
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
                lr6 lr6Var = (lr6) this.e;
                sb.append(hk2.F(lr6Var, i));
                sb.append(',');
                int i2 = this.c;
                sb.append(i2);
                sb.append('-');
                sb.append(hk2.F(lr6Var, i2));
                sb.append("), prevOffset=");
                return ej6.g(sb, this.d, ')');
            default:
                return super.toString();
        }
    }

    public float u() {
        V(5);
        return Float.intBitsToFloat(((xp0) this.e).g());
    }

    public void v(List list) {
        int l;
        int l2;
        xp0 xp0Var = (xp0) this.e;
        boolean z = list instanceof h92;
        int i = this.b;
        if (z) {
            h92 h92Var = (h92) list;
            int i2 = i & 7;
            if (i2 != 2) {
                if (i2 == 5) {
                    do {
                        h92Var.c(Float.intBitsToFloat(xp0Var.g()));
                        if (!xp0Var.d()) {
                            l2 = xp0Var.l();
                        } else {
                            return;
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                throw i53.b();
            }
            int i3 = xp0Var.i();
            W(i3);
            int c = xp0Var.c() + i3;
            do {
                h92Var.c(Float.intBitsToFloat(xp0Var.g()));
            } while (xp0Var.c() < c);
            return;
        }
        int i4 = i & 7;
        if (i4 != 2) {
            if (i4 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(xp0Var.g())));
                    if (!xp0Var.d()) {
                        l = xp0Var.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            throw i53.b();
        }
        int i5 = xp0Var.i();
        W(i5);
        int c2 = xp0Var.c() + i5;
        do {
            list.add(Float.valueOf(Float.intBitsToFloat(xp0Var.g())));
        } while (xp0Var.c() < c2);
    }

    public Object w(cv5 cv5Var, o32 o32Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object j = cv5Var.j();
            cv5Var.i(j, this, o32Var);
            cv5Var.d(j);
            if (this.b == this.c) {
                return j;
            }
            throw i53.d();
        } finally {
            this.c = i;
        }
    }

    public Object x(cv5 cv5Var, o32 o32Var) {
        V(3);
        return w(cv5Var, o32Var);
    }

    public void y(List list, cv5 cv5Var, o32 o32Var) {
        int l;
        xp0 xp0Var = (xp0) this.e;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                list.add(w(cv5Var, o32Var));
                if (!xp0Var.d() && this.d == 0) {
                    l = xp0Var.l();
                } else {
                    return;
                }
            } while (l == i);
            this.d = l;
            return;
        }
        throw i53.b();
    }

    public int z() {
        V(0);
        return ((xp0) this.e).i();
    }

    public /* synthetic */ yp0(int i) {
        this.a = i;
    }

    public yp0(bf4 bf4Var) {
        this.a = 3;
        this.e = bf4Var;
    }

    public yp0(int i, int i2, int i3, lr6 lr6Var) {
        this.a = 4;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = lr6Var;
    }
}
