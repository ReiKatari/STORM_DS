package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pk6  reason: default package */
/* loaded from: classes.dex */
public final class pk6 {
    public final mk6 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public p94 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final r93 p;
    public final r93 q;
    public final r93 r;
    public p94 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public o94 x;

    public pk6(mk6 mk6Var) {
        this.a = mk6Var;
        int[] iArr = mk6Var.A;
        this.b = iArr;
        Object[] objArr = mk6Var.L;
        this.c = objArr;
        this.d = mk6Var.e0;
        this.e = mk6Var.f0;
        this.f = mk6Var.g0;
        int i = mk6Var.B;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = mk6Var.R;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new r93();
        this.q = new r93();
        this.r = new r93();
        this.u = i;
        this.v = -1;
    }

    public static int i(int i, int i2, int i3, int i4) {
        if (i > i2) {
            return -(((i4 - i3) - i) + 1);
        }
        return i;
    }

    public static void z(pk6 pk6Var) {
        int i = pk6Var.v;
        int r = pk6Var.r(i);
        int[] iArr = pk6Var.b;
        int i2 = (r * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) == 0) {
            int i4 = (i3 & (-134217729)) | 134217728;
            iArr[i2] = i4;
            if ((67108864 & i4) != 0) {
                return;
            }
            pk6Var.T(pk6Var.E(iArr, i));
        }
    }

    public final void A(mk6 mk6Var, int i) {
        if (this.n <= 0) {
            tx0.a("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.B == 0) {
            int[] iArr = mk6Var.A;
            int i2 = iArr[(i * 5) + 3];
            int i3 = mk6Var.B;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap hashMap = this.e;
                p94 p94Var = this.f;
                Object[] objArr2 = mk6Var.L;
                int i4 = mk6Var.R;
                HashMap hashMap2 = mk6Var.f0;
                p94 p94Var2 = mk6Var.g0;
                this.b = iArr;
                this.c = objArr2;
                this.d = mk6Var.e0;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = hashMap2;
                this.f = p94Var2;
                mk6Var.A = iArr2;
                mk6Var.B = 0;
                mk6Var.L = objArr;
                mk6Var.R = 0;
                mk6Var.e0 = arrayList;
                mk6Var.f0 = hashMap;
                mk6Var.g0 = p94Var;
                return;
            }
        }
        pk6 d = mk6Var.d();
        try {
            kj2.Q(d, i, this, true, true, false);
            d.e(true);
        } catch (Throwable th) {
            d.e(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        r2 = r8.b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r9 >= r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        defpackage.fv.r0(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        defpackage.fv.r0(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i) {
        int p;
        sq2 sq2Var;
        int i2;
        sq2 sq2Var2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int o = o() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int a = ok6.a(arrayList, i6, o); a < this.d.size() && (i3 = (sq2Var2 = (sq2) this.d.get(a)).a) < 0 && (i4 = i3 + o) < i; a++) {
                        sq2Var2.a = i4;
                    }
                } else {
                    for (int a2 = ok6.a(arrayList, i, o); a2 < this.d.size() && (i2 = (sq2Var = (sq2) this.d.get(a2)).a) >= 0; a2++) {
                        sq2Var.a = -(o - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int o2 = o();
            if (i6 >= o2) {
                tx0.a("Check failed");
            }
            while (i6 < o2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.b[i7];
                if (i8 > -2) {
                    p = i8;
                } else {
                    p = (p() + i8) - (-2);
                }
                if (p >= i) {
                    p = -((p() - p) - (-2));
                }
                if (p != i8) {
                    this.b[i7] = p;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void C(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, p());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int r = r(min);
                int r2 = r(i5);
                int i7 = this.g;
                while (r < r2) {
                    int i8 = (r * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        tx0.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    r++;
                    if (r == i7) {
                        r += this.h;
                    }
                }
            } else {
                int r3 = r(i5);
                int r4 = r(min);
                while (r3 < r4) {
                    int i10 = (r3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        tx0.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    r3++;
                    if (r3 == this.g) {
                        r3 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i;
    }

    public final Object D(int i) {
        int r = r(i);
        int[] iArr = this.b;
        if ((iArr[(r * 5) + 1] & 1073741824) != 0) {
            return this.c[h(g(iArr, r))];
        }
        return null;
    }

    public final int E(int[] iArr, int i) {
        int i2 = iArr[(r(i) * 5) + 2];
        if (i2 > -2) {
            return i2;
        }
        return (p() + i2) - (-2);
    }

    public final Object F(Object obj) {
        if (this.n > 0) {
            x(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.j) {
            tx0.a("Writing to an invalid slot");
        }
        this.c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i;
        int i2;
        o94 o94Var = this.x;
        if (o94Var != null) {
            while (o94Var.b != 0) {
                int X = oi2.X(o94Var);
                int r = r(X);
                int i3 = X + 1;
                int u = u(X) + X;
                while (true) {
                    i = 0;
                    if (i3 < u) {
                        if ((this.b[(r(i3) * 5) + 1] & 201326592) != 0) {
                            i2 = 1;
                            break;
                        }
                        i3 += u(i3);
                    } else {
                        i2 = 0;
                        break;
                    }
                }
                int[] iArr = this.b;
                int i4 = (r * 5) + 1;
                int i5 = iArr[i4];
                if ((67108864 & i5) != 0) {
                    i = 1;
                }
                if (i != i2) {
                    iArr[i4] = (i2 << 26) | ((-67108865) & i5);
                    int E = E(iArr, X);
                    if (E >= 0) {
                        oi2.h(o94Var, E);
                    }
                }
            }
        }
    }

    public final boolean H() {
        if (this.n != 0) {
            tx0.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int g = g(this.b, r(i));
        int L = L();
        O(this.v);
        o94 o94Var = this.x;
        if (o94Var != null) {
            while (true) {
                int i3 = o94Var.b;
                if (i3 == 0) {
                    break;
                } else if (i3 != 0) {
                    if (o94Var.a[0] < i) {
                        break;
                    }
                    oi2.X(o94Var);
                } else {
                    fa6.e("IntList is empty.");
                    return false;
                }
            }
        }
        boolean I = I(i, this.t - i);
        J(g, this.i - g, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= L;
        return I;
    }

    public final boolean I(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            B(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int a = ok6.a(this.d, i3, o() - this.h);
                if (a >= this.d.size()) {
                    a--;
                }
                int i4 = a + 1;
                int i5 = 0;
                while (a >= 0) {
                    sq2 sq2Var = (sq2) this.d.get(a);
                    int c = c(sq2Var);
                    if (c < i) {
                        break;
                    }
                    if (c < i3) {
                        sq2Var.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                            zq2 zq2Var = (zq2) hashMap.remove(sq2Var);
                        }
                        if (i5 == 0) {
                            i5 = a + 1;
                        }
                        i4 = a;
                    }
                    a--;
                }
                if (i4 < i5) {
                    z = true;
                }
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(r(i8) * 5) + 1] & 67108864) != 0) {
                T(i8);
            }
        }
        return z;
    }

    public final void J(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            C(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object K(Object obj, int i, int i2) {
        int N = N(this.b, r(i));
        int g = g(this.b, r(i + 1));
        int i3 = N + i2;
        if (i3 < N || i3 >= g) {
            tx0.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int h = h(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[h];
        objArr[h] = obj;
        return obj2;
    }

    public final int L() {
        int r = r(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = r * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = g(iArr, r(i3));
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void M() {
        int i = this.u;
        this.t = i;
        this.i = g(this.b, r(i));
    }

    public final int N(int[] iArr, int i) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int b = ok6.b(iArr, i);
        int i2 = this.l;
        int length = this.c.length;
        if (b < 0) {
            return (length - i2) + b + 1;
        }
        return b;
    }

    public final zq2 O(int i) {
        sq2 R;
        HashMap hashMap = this.e;
        if (hashMap == null || (R = R(i)) == null) {
            return null;
        }
        return (zq2) hashMap.get(R);
    }

    public final void P() {
        if (this.n != 0) {
            tx0.a("Key must be supplied when inserting");
        }
        vs0 vs0Var = ox0.a;
        Q(0, vs0Var, vs0Var, false);
    }

    public final void Q(int i, Object obj, Object obj2, boolean z) {
        Object[] objArr;
        int i2;
        int i3;
        int i4;
        int i5 = this.v;
        if (this.n > 0) {
            objArr = 1;
        } else {
            objArr = null;
        }
        this.r.c(this.o);
        vs0 vs0Var = ox0.a;
        if (objArr != null) {
            int i6 = this.t;
            int g = g(this.b, r(i6));
            w(1);
            this.i = g;
            this.j = g;
            int r = r(i6);
            if (obj != vs0Var) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (!z && obj2 != vs0Var) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i7 = i(g, this.k, this.l, this.c.length);
            if (i7 >= 0 && this.m < i6) {
                i7 = -(((this.c.length - this.l) - i7) + 1);
            }
            int[] iArr = this.b;
            int i8 = this.v;
            int i9 = r * 5;
            iArr[i9] = i;
            iArr[i9 + 1] = ((z ? 1 : 0) << 30) | (i3 << 29) | (i4 << 28);
            iArr[i9 + 2] = i8;
            iArr[i9 + 3] = 0;
            iArr[i9 + 4] = i7;
            int i10 = (z ? 1 : 0) + i3 + i4;
            if (i10 > 0) {
                x(i10, i6);
                Object[] objArr2 = this.c;
                int i11 = this.i;
                if (z) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                if (i3 != 0) {
                    objArr2[i11] = obj;
                    i11++;
                }
                if (i4 != 0) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                this.i = i11;
            }
            this.o = 0;
            i2 = i6 + 1;
            this.v = i6;
            this.t = i2;
            if (i5 >= 0) {
                O(i5);
            }
        } else {
            this.p.c(i5);
            this.q.c((o() - this.h) - this.u);
            int i12 = this.t;
            int r2 = r(i12);
            if (!nb3.k(obj2, vs0Var)) {
                if (z) {
                    U(this.t, obj2);
                } else {
                    S(obj2);
                }
            }
            this.i = N(this.b, r2);
            this.j = g(this.b, r(this.t + 1));
            int[] iArr2 = this.b;
            int i13 = r2 * 5;
            this.o = iArr2[i13 + 1] & 67108863;
            this.v = i12;
            this.t = i12 + 1;
            i2 = i12 + iArr2[i13 + 3];
        }
        this.u = i2;
    }

    public final sq2 R(int i) {
        ArrayList arrayList;
        int e;
        if (i < 0 || i >= p() || (e = ok6.e((arrayList = this.d), i, p())) < 0) {
            return null;
        }
        return (sq2) arrayList.get(e);
    }

    public final void S(Object obj) {
        int r = r(this.t);
        int i = (r * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            tx0.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(iArr, r))] = obj;
    }

    public final void T(int i) {
        if (i >= 0) {
            o94 o94Var = this.x;
            if (o94Var == null) {
                o94Var = new o94();
                this.x = o94Var;
            }
            oi2.h(o94Var, i);
        }
    }

    public final void U(int i, Object obj) {
        int r = r(i);
        int[] iArr = this.b;
        if (r >= iArr.length || (iArr[(r * 5) + 1] & 1073741824) == 0) {
            tx0.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[h(g(this.b, r))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            tx0.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            r05.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 < this.v || i2 > this.u) {
            tx0.a("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int g = g(this.b, r(i2));
        this.i = g;
        this.j = g;
    }

    public final sq2 b(int i) {
        ArrayList arrayList = this.d;
        int e = ok6.e(arrayList, i, p());
        if (e < 0) {
            if (i > this.g) {
                i = -(p() - i);
            }
            sq2 sq2Var = new sq2(i);
            arrayList.add(-(e + 1), sq2Var);
            return sq2Var;
        }
        return (sq2) arrayList.get(e);
    }

    public final int c(sq2 sq2Var) {
        int i = sq2Var.a;
        if (i < 0) {
            return p() + i;
        }
        return i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((o() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            B(p());
            C(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            G();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        p94 p94Var = this.f;
        mk6 mk6Var = this.a;
        if (!mk6Var.Z) {
            r05.a("Unexpected writer close()");
        }
        mk6Var.Z = false;
        mk6Var.A = iArr;
        mk6Var.B = i2;
        mk6Var.L = objArr;
        mk6Var.R = i3;
        mk6Var.e0 = arrayList;
        mk6Var.f0 = hashMap;
        mk6Var.g0 = p94Var;
    }

    public final int f(int i) {
        return g(this.b, r(i));
    }

    public final int g(int[] iArr, int i) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        int i3 = this.l;
        int length = this.c.length;
        if (i2 < 0) {
            return (length - i3) + i2 + 1;
        }
        return i2;
    }

    public final int h(int i) {
        int i2;
        int i3 = this.l;
        if (i < this.k) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return (i3 * i2) + i;
    }

    public final void j() {
        boolean z;
        boolean z2;
        int i;
        int r;
        ca4 ca4Var;
        int i2 = 0;
        if (this.n > 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = this.t;
        int i4 = this.u;
        int i5 = this.v;
        int r2 = r(i5);
        int i6 = this.o;
        int i7 = i3 - i5;
        int i8 = r2 * 5;
        int i9 = i8 + 1;
        if ((this.b[i9] & 1073741824) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        r93 r93Var = this.r;
        if (z) {
            p94 p94Var = this.s;
            if (p94Var != null && (ca4Var = (ca4) p94Var.b(i5)) != null) {
                Object[] objArr = ca4Var.a;
                int i10 = ca4Var.b;
                for (int i11 = 0; i11 < i10; i11++) {
                    F(objArr[i11]);
                }
                ca4 ca4Var2 = (ca4) p94Var.g(i5);
            }
            int[] iArr = this.b;
            iArr[i8 + 3] = i7;
            ok6.c(r2, i6, iArr);
            int b = r93Var.b();
            if (z2) {
                i6 = 1;
            }
            this.o = b + i6;
            int E = E(this.b, i5);
            this.v = E;
            if (E < 0) {
                r = p();
            } else {
                r = r(E + 1);
            }
            if (r >= 0) {
                i2 = g(this.b, r);
            }
            this.i = i2;
            this.j = i2;
            return;
        }
        if (i3 != i4) {
            tx0.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i12 = i8 + 3;
        int i13 = iArr2[i12];
        int i14 = iArr2[i9] & 67108863;
        iArr2[i12] = i7;
        ok6.c(r2, i6, iArr2);
        int b2 = this.p.b();
        this.u = (o() - this.h) - this.q.b();
        this.v = b2;
        int E2 = E(this.b, i5);
        int b3 = r93Var.b();
        this.o = b3;
        if (E2 == b2) {
            if (!z2) {
                i2 = i6 - i14;
            }
            this.o = b3 + i2;
            return;
        }
        int i15 = i7 - i13;
        if (z2) {
            i = 0;
        } else {
            i = i6 - i14;
        }
        if (i15 != 0 || i != 0) {
            while (E2 != 0 && E2 != b2 && (i != 0 || i15 != 0)) {
                int r3 = r(E2);
                if (i15 != 0) {
                    int[] iArr3 = this.b;
                    int i16 = (r3 * 5) + 3;
                    iArr3[i16] = iArr3[i16] + i15;
                }
                if (i != 0) {
                    int[] iArr4 = this.b;
                    ok6.c(r3, (iArr4[(r3 * 5) + 1] & 67108863) + i, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(r3 * 5) + 1] & 1073741824) != 0) {
                    i = 0;
                }
                E2 = E(iArr5, E2);
            }
        }
        this.o += i;
    }

    public final void k() {
        if (this.n <= 0) {
            r05.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                tx0.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (o() - this.h) - this.q.b();
        }
    }

    public final void l(int i) {
        boolean z;
        boolean z2 = false;
        if (this.n <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            tx0.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z2 = true;
            }
            if (!z2) {
                tx0.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            P();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void m(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((p() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(r(i3) * 5) + 2] = i;
            int i4 = this.b[(r(i3) * 5) + 3] + i3;
            m(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i, eo2 eo2Var) {
        int i2;
        int i3;
        int i4;
        eo2 eo2Var2 = eo2Var;
        int E = E(this.b, i);
        int p = p();
        int u = u(i) + i;
        int i5 = i;
        q94 q94Var = null;
        o94 o94Var = null;
        loop0: while (i5 < u) {
            int f = f(i5);
            int i6 = i5 + 1;
            int f2 = f(i6);
            while (f < f2) {
                Object obj = this.c[h(f)];
                if (obj instanceof br2) {
                    br2 br2Var = (br2) obj;
                    if (!(br2Var instanceof br2)) {
                        br2Var = null;
                    }
                    if (br2Var != null) {
                        int i7 = br2Var.b;
                        if (i7 >= 0) {
                            int u2 = u(i5) + i5;
                            int i8 = i6;
                            int i9 = 0;
                            while (i8 < u2 && i9 < i7) {
                                int r = r(i8);
                                int i10 = E;
                                int[] iArr = this.b;
                                int i11 = r * 5;
                                i8 = iArr[i11 + 3] + i8;
                                if (i8 < u2 && (iArr[i11 + 1] & 536870912) == 0) {
                                    i9++;
                                }
                                E = i10;
                            }
                            i4 = E;
                            if (q94Var == null) {
                                int[] iArr2 = p93.a;
                                q94Var = new q94();
                            }
                            if (o94Var == null) {
                                o94Var = new o94();
                            }
                            q94Var.a(i8);
                            o94Var.a(i8);
                            o94Var.a(f);
                            f++;
                            E = i4;
                        }
                    } else {
                        tx0.b("Inconsistent composition");
                        e41.c();
                        return;
                    }
                }
                i4 = E;
                eo2Var2.o(Integer.valueOf(f), obj);
                f++;
                E = i4;
            }
            int i12 = E;
            if (i6 < p) {
                E = E(this.b, i6);
            } else {
                E = -1;
            }
            if (E != i5) {
                int i13 = i12;
                while (true) {
                    if (o94Var != null && q94Var != null && q94Var.f(i5)) {
                        int i14 = o94Var.b;
                        int i15 = i14 / 2;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            int i18 = i16 * 2;
                            int i19 = p;
                            int c = o94Var.c(i18);
                            if (c == i5) {
                                int c2 = o94Var.c(i18 + 1);
                                eo2Var2.o(Integer.valueOf(c2), this.c[h(c2)]);
                            } else if (i18 != i17) {
                                int i20 = i17 + 1;
                                o94Var.f(i17, c);
                                i17 += 2;
                                o94Var.f(i20, o94Var.c(i18 + 1));
                            } else {
                                i17 += 2;
                            }
                            i16++;
                            eo2Var2 = eo2Var;
                            p = i19;
                        }
                        i2 = p;
                        if (i17 != i14) {
                            if (i17 < 0 || i17 > (i3 = o94Var.b) || i14 < 0 || i14 > i3) {
                                break loop0;
                            } else if (i14 >= i17) {
                                if (i14 != i17) {
                                    if (i14 < i3) {
                                        int[] iArr3 = o94Var.a;
                                        fv.r0(i17, i14, i3, iArr3, iArr3);
                                    }
                                    o94Var.b -= i14 - i17;
                                }
                            } else {
                                i.h("The end index must be < start index");
                                return;
                            }
                        }
                    } else {
                        i2 = p;
                    }
                    if (i5 != i && i13 != E) {
                        i5 = i13;
                        p = i2;
                        i13 = E(this.b, i13);
                        eo2Var2 = eo2Var;
                    }
                }
            } else {
                i2 = p;
            }
            eo2Var2 = eo2Var;
            i5 = i6;
            p = i2;
        }
    }

    public final int o() {
        return this.b.length / 5;
    }

    public final int p() {
        return o() - this.h;
    }

    public final Object q(int i) {
        int r = r(i);
        int[] iArr = this.b;
        int i2 = (r * 5) + 1;
        if ((iArr[i2] & 268435456) != 0) {
            return this.c[Integer.bitCount(iArr[i2] >> 29) + g(iArr, r)];
        }
        return ox0.a;
    }

    public final int r(int i) {
        int i2;
        int i3 = this.h;
        if (i < this.g) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return (i3 * i2) + i;
    }

    public final int s(int i) {
        return this.b[r(i) * 5];
    }

    public final Object t(int i) {
        int r = r(i);
        int[] iArr = this.b;
        int i2 = r * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
        }
        return null;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + p() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final int u(int i) {
        return this.b[(r(i) * 5) + 3];
    }

    public final boolean v(int i, int i2) {
        int o;
        int u;
        if (i2 == this.v) {
            o = this.u;
        } else {
            r93 r93Var = this.p;
            if (i2 > r93Var.a(0)) {
                u = u(i2);
            } else {
                int[] iArr = r93Var.a;
                int min = Math.min(iArr.length, r93Var.b);
                int i3 = 0;
                while (true) {
                    if (i3 < min) {
                        if (iArr[i3] == i2) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 < 0) {
                    u = u(i2);
                } else {
                    o = (o() - this.h) - this.q.a[i3];
                }
            }
            o = u + i2;
        }
        if (i <= i2 || i >= o) {
            return false;
        }
        return true;
    }

    public final void w(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.t;
            B(i3);
            int i4 = this.g;
            int i5 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i6;
                fv.r0(0, 0, i4 * 5, iArr, iArr2);
                fv.r0((i4 + i8) * 5, (i5 + i4) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i5 = i8;
            }
            int i9 = this.u;
            if (i9 >= i4) {
                this.u = i9 + i;
            }
            int i10 = i4 + i;
            this.g = i10;
            this.h = i5 - i;
            if (i6 > 0) {
                i2 = f(i3 + i);
            } else {
                i2 = 0;
            }
            if (this.m >= i4) {
                i7 = this.k;
            }
            int i11 = i(i2, i7, this.l, this.c.length);
            for (int i12 = i4; i12 < i10; i12++) {
                this.b[(i12 * 5) + 4] = i11;
            }
            int i13 = this.m;
            if (i13 >= i4) {
                this.m = i13 + i;
            }
        }
    }

    public final void x(int i, int i2) {
        if (i > 0) {
            C(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean y(int i) {
        if ((this.b[(r(i) * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }
}
