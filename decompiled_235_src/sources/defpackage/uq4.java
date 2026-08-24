package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uq4  reason: default package */
/* loaded from: classes.dex */
public final class uq4 {
    public final s63 a;
    public final p94 b;
    public final q94 c;
    public final n94 d;
    public final p94 e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final pq3 n;
    public final m44 o;

    public uq4(s63 s63Var, pq3 pq3Var, jr4 jr4Var) {
        this.a = s63Var;
        p94 p94Var = h93.a;
        this.b = new p94();
        this.c = new q94();
        int i = c93.a;
        this.d = new n94();
        this.e = new p94();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.n = pq3Var;
        this.o = new m44(jr4Var);
    }

    public final int a(m44 m44Var, int i, boolean z) {
        List list;
        List list2;
        p94 p94Var = this.e;
        if (p94Var.a(i)) {
            Object b = p94Var.b(i);
            b.getClass();
            return ((xa0) b).b;
        }
        p94 p94Var2 = this.b;
        int i2 = 0;
        if (p94Var2.a(i)) {
            if (z && (list2 = (List) p94Var2.b(i)) != null) {
                int size = list2.size();
                while (i2 < size) {
                    ((oq3) list2.get(i2)).a();
                    i2++;
                }
                return -1;
            }
            return -1;
        }
        wa0 wa0Var = new wa0(this, m44Var, 0);
        long j = m44Var.q().u;
        pq3 pq3Var = (pq3) m44Var.R;
        if (pq3Var != null) {
            p94Var2.i(i, hf.b0(pq3Var.a(i, j, true, new qk4(2, wa0Var, m44Var))));
            if (z && (list = (List) p94Var2.b(i)) != null) {
                int size2 = list.size();
                while (i2 < size2) {
                    ((oq3) list.get(i2)).a();
                    i2++;
                }
                return -1;
            }
            return -1;
        }
        nb3.a0("state");
        throw null;
    }

    public final boolean b() {
        if (this.h != Integer.MAX_VALUE && this.i != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [xa0, java.lang.Object] */
    public final void c(m44 m44Var, int i, int i2) {
        xa0 xa0Var;
        int i3;
        int i4;
        p94 p94Var = this.e;
        xa0 xa0Var2 = (xa0) p94Var.b(i);
        vs0 vs0Var = xa0.c;
        if (xa0Var2 != null) {
            xa0Var2.b = i2;
            xa0Var2.a = vs0Var;
            xa0Var = xa0Var2;
        } else {
            ?? obj = new Object();
            obj.a = vs0Var;
            obj.b = i2;
            xa0Var = obj;
        }
        p94Var.i(i, xa0Var);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        if (Math.signum(this.f) <= RecyclerView.B1) {
            if (this.k > 0) {
                i3 = this.i + 1;
                i4 = i3;
            }
            i4 = -1;
        } else {
            if (Math.signum(this.f) > RecyclerView.B1 && this.j > 0) {
                i3 = this.h - 1;
                i4 = i3;
            }
            i4 = -1;
        }
        if (i4 > 0) {
            m44Var.getClass();
            if (i4 != -1 && i4 < this.m) {
                wa0 wa0Var = new wa0(this, m44Var, 1);
                long j = m44Var.q().u;
                pq3 pq3Var = (pq3) m44Var.R;
                if (pq3Var != null) {
                    this.b.i(i4, hf.b0(pq3Var.a(i4, j, true, new qk4(2, wa0Var, m44Var))));
                } else {
                    nb3.a0("state");
                    throw null;
                }
            }
        }
        h();
    }

    public final void d(m44 m44Var, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        boolean z2;
        int i6;
        boolean z3;
        boolean z4;
        int i7;
        boolean z5;
        boolean z6;
        if (Math.signum(f) == Math.signum(this.f)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (z2 && !this.l) {
                int E = u24.E(Math.abs(f)) + this.k;
                int i8 = i3 - i4;
                if (E > i8) {
                    E = i8;
                }
                this.k = E;
            } else {
                this.k = i3 - i4;
                this.i = i2;
            }
            while (this.k > 0) {
                int i9 = this.i;
                m44Var.getClass();
                if (i9 != -1 && (i7 = this.i) < this.m - 1) {
                    if (f == RecyclerView.B1) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (i7 + 1 == i2 + 1 && z5 && Math.abs(f) >= i4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    int a = a(m44Var, this.i + 1, z6);
                    if (a != -1) {
                        this.i++;
                        this.k -= a;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            return;
        }
        if (z2 && !this.l) {
            int E2 = u24.E(Math.abs(f)) + this.j;
            int i10 = i3 - i5;
            if (E2 > i10) {
                E2 = i10;
            }
            this.j = E2;
        } else {
            this.j = i3 - i5;
            this.h = i;
        }
        while (this.j > 0 && (i6 = this.h) > 0) {
            if (f == RecyclerView.B1) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i6 - 1 == i - 1 && z3 && Math.abs(f) >= i5) {
                z4 = true;
            } else {
                z4 = false;
            }
            int a2 = a(m44Var, this.h - 1, z4);
            if (a2 != -1) {
                this.h--;
                this.j -= a2;
            } else {
                return;
            }
        }
    }

    public final void e(float f, cr4 cr4Var) {
        uq4 uq4Var;
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        m44 m44Var = this.o;
        m44Var.L = cr4Var;
        m44Var.R = this.n;
        float f2 = -f;
        h();
        if (m44Var.o()) {
            gi2.G(m44Var.q());
            m44Var.q();
            this.m = m44Var.w();
            int m = m44Var.m();
            int p = m44Var.p();
            int w = m44Var.w();
            int s = m44Var.s();
            int r = m44Var.r();
            int i4 = (f2 > RecyclerView.B1 ? 1 : (f2 == RecyclerView.B1 ? 0 : -1));
            p94 p94Var = this.e;
            if (i4 <= 0) {
                this.j = 0 - s;
                this.h = m;
                while (this.j > 0 && (i3 = this.h) > 0 && p94Var.a(i3 - 1)) {
                    Object b = p94Var.b(this.h - 1);
                    b.getClass();
                    this.h--;
                    this.j -= ((xa0) b).b;
                }
                f(0, this.h - 1);
            } else {
                this.k = 0 - r;
                this.i = p;
                while (this.k > 0 && (i2 = this.i) < w - 1 && p94Var.a(i2 + 1)) {
                    Object b2 = p94Var.b(this.i + 1);
                    b2.getClass();
                    int i5 = ((xa0) b2).b;
                    this.i++;
                    this.k -= i5;
                }
                f(this.i + 1, w - 1);
            }
        }
        if (m44Var.o()) {
            gi2.G(m44Var.q());
            if (m44Var.q().t != null) {
                i = ((nr4) this.a.B).o;
                z = false;
            } else {
                z = false;
                i = 0;
            }
            int m2 = m44Var.m();
            int p2 = m44Var.p();
            int s2 = m44Var.s();
            int r2 = m44Var.r();
            if (f2 <= RecyclerView.B1) {
                z2 = true;
            } else {
                z2 = z;
            }
            uq4Var = this;
            uq4Var.d(m44Var, m2, p2, i, r2, s2, f2, z2);
        } else {
            uq4Var = this;
        }
        uq4Var.f = f2;
        uq4Var.h();
    }

    public final void f(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        int i3;
        char c3;
        int i4;
        q94 q94Var = this.c;
        q94Var.b();
        p94 p94Var = this.b;
        int[] iArr3 = p94Var.b;
        long[] jArr3 = p94Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr3[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr3[(i5 << 3) + i7]) && i4 <= i2) {
                            q94Var.a(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        n94 n94Var = this.d;
        int[] iArr4 = n94Var.b;
        long[] jArr4 = n94Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr4[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr4[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                q94Var.a(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        p94 p94Var2 = this.e;
        int[] iArr5 = p94Var2.b;
        long[] jArr5 = p94Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr5[i12];
                if ((((~j6) << c2) & j6 & j3) != j3) {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr5[(i12 << 3) + i14]) && i3 <= i2) {
                            q94Var.a(i3);
                        }
                        j6 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length3) {
                    break;
                }
                i12++;
            }
        }
        int[] iArr6 = q94Var.b;
        long[] jArr6 = q94Var.a;
        int length4 = jArr6.length - 2;
        if (length4 >= 0) {
            int i15 = 0;
            while (true) {
                long j7 = jArr6[i15];
                if ((((~j7) << c2) & j7 & j3) != j3) {
                    int i16 = 8 - ((~(i15 - length4)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j7 & j2) < j) {
                            int i18 = iArr6[(i15 << 3) + i17];
                            List list = (List) p94Var.g(i18);
                            if (list != null) {
                                int size = list.size();
                                for (int i19 = 0; i19 < size; i19++) {
                                    ((oq3) list.get(i19)).cancel();
                                }
                            }
                            int c4 = n94Var.c(i18);
                            if (c4 >= 0) {
                                n94Var.e--;
                                long[] jArr7 = n94Var.a;
                                int i20 = n94Var.d;
                                int i21 = c4 >> 3;
                                int i22 = (c4 & 7) << 3;
                                iArr2 = iArr6;
                                jArr2 = jArr6;
                                long j8 = (jArr7[i21] & (~(j2 << i22))) | (254 << i22);
                                jArr7[i21] = j8;
                                jArr7[(((c4 - 7) & i20) + (i20 & 7)) >> 3] = j8;
                            } else {
                                iArr2 = iArr6;
                                jArr2 = jArr6;
                            }
                            p94Var2.g(i18);
                        } else {
                            iArr2 = iArr6;
                            jArr2 = jArr6;
                        }
                        j7 >>= 8;
                        i17++;
                        iArr6 = iArr2;
                        jArr6 = jArr2;
                    }
                    iArr = iArr6;
                    jArr = jArr6;
                    if (i16 != 8) {
                        return;
                    }
                } else {
                    iArr = iArr6;
                    jArr = jArr6;
                }
                if (i15 != length4) {
                    i15++;
                    iArr6 = iArr;
                    jArr6 = jArr;
                } else {
                    return;
                }
            }
        }
    }

    public final void g() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        p94 p94Var = this.b;
        long[] jArr = p94Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = p94Var.b[i4];
                            List list = (List) p94Var.c[i4];
                            int size = list.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                ((oq3) list.get(i6)).cancel();
                            }
                            p94Var.h(i4);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h() {
        lb4.J(this.j, "prefetchWindowStartExtraSpace");
        lb4.J(this.k, "prefetchWindowEndExtraSpace");
        lb4.J(this.h, "prefetchWindowStartIndex");
        lb4.J(this.i, "prefetchWindowEndIndex");
    }
}
