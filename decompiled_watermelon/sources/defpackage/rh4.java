package defpackage;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rh4  reason: default package */
/* loaded from: classes.dex */
public final class rh4 {
    public final ka3 a;
    public final j14 b;
    public final k14 c;
    public final h14 d;
    public final j14 e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final qj3 n;
    public final os o;

    public rh4(ka3 ka3Var, qj3 qj3Var, gi4 gi4Var) {
        this.a = ka3Var;
        j14 j14Var = z23.a;
        this.b = new j14();
        this.c = new k14();
        int i = u23.a;
        this.d = new h14();
        this.e = new j14();
        this.g = -1;
        this.h = Preference.DEFAULT_ORDER;
        this.i = Integer.MIN_VALUE;
        this.n = qj3Var;
        this.o = new os(gi4Var);
    }

    public final int a(os osVar, int i, boolean z) {
        List list;
        List list2;
        j14 j14Var = this.e;
        if (j14Var.a(i)) {
            Object b = j14Var.b(i);
            b.getClass();
            return ((p80) b).b;
        }
        j14 j14Var2 = this.b;
        int i2 = 0;
        if (j14Var2.a(i)) {
            if (z && (list2 = (List) j14Var2.b(i)) != null) {
                int size = list2.size();
                while (i2 < size) {
                    ((pj3) list2.get(i2)).a();
                    i2++;
                }
                return -1;
            }
            return -1;
        }
        o80 o80Var = new o80(this, osVar, 0);
        long j = osVar.B().u;
        qj3 qj3Var = (qj3) osVar.R;
        if (qj3Var != null) {
            j14Var2.i(i, l07.b0(qj3Var.a(i, j, true, new gi2(27, o80Var, osVar))));
            if (z && (list = (List) j14Var2.b(i)) != null) {
                int size2 = list.size();
                while (i2 < size2) {
                    ((pj3) list.get(i2)).a();
                    i2++;
                }
                return -1;
            }
            return -1;
        }
        b53.g0("state");
        throw null;
    }

    public final boolean b() {
        if (this.h != Integer.MAX_VALUE && this.i != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [p80, java.lang.Object] */
    public final void c(os osVar, int i, int i2) {
        p80 p80Var;
        int i3;
        int i4;
        j14 j14Var = this.e;
        p80 p80Var2 = (p80) j14Var.b(i);
        k45 k45Var = p80.c;
        if (p80Var2 != null) {
            p80Var2.b = i2;
            p80Var2.a = k45Var;
            p80Var = p80Var2;
        } else {
            ?? obj = new Object();
            obj.a = k45Var;
            obj.b = i2;
            p80Var = obj;
        }
        j14Var.i(i, p80Var);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        if (Math.signum(this.f) <= RecyclerView.A1) {
            if (this.k > 0) {
                i3 = this.i + 1;
                i4 = i3;
            }
            i4 = -1;
        } else {
            if (Math.signum(this.f) > RecyclerView.A1 && this.j > 0) {
                i3 = this.h - 1;
                i4 = i3;
            }
            i4 = -1;
        }
        if (i4 > 0) {
            osVar.getClass();
            if (i4 != -1 && i4 < this.m) {
                o80 o80Var = new o80(this, osVar, 1);
                long j = osVar.B().u;
                qj3 qj3Var = (qj3) osVar.R;
                if (qj3Var != null) {
                    this.b.i(i4, l07.b0(qj3Var.a(i4, j, true, new gi2(27, o80Var, osVar))));
                } else {
                    b53.g0("state");
                    throw null;
                }
            }
        }
        h();
    }

    public final void d(os osVar, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
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
                int X = jv3.X(Math.abs(f)) + this.k;
                int i8 = i3 - i4;
                if (X > i8) {
                    X = i8;
                }
                this.k = X;
            } else {
                this.k = i3 - i4;
                this.i = i2;
            }
            while (this.k > 0) {
                int i9 = this.i;
                osVar.getClass();
                if (i9 != -1 && (i7 = this.i) < this.m - 1) {
                    if (f == RecyclerView.A1) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (i7 + 1 == i2 + 1 && z5 && Math.abs(f) >= i4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    int a = a(osVar, this.i + 1, z6);
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
            int X2 = jv3.X(Math.abs(f)) + this.j;
            int i10 = i3 - i5;
            if (X2 > i10) {
                X2 = i10;
            }
            this.j = X2;
        } else {
            this.j = i3 - i5;
            this.h = i;
        }
        while (this.j > 0 && (i6 = this.h) > 0) {
            if (f == RecyclerView.A1) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i6 - 1 == i - 1 && z3 && Math.abs(f) >= i5) {
                z4 = true;
            } else {
                z4 = false;
            }
            int a2 = a(osVar, this.h - 1, z4);
            if (a2 != -1) {
                this.h--;
                this.j -= a2;
            } else {
                return;
            }
        }
    }

    public final void e(float f, zh4 zh4Var) {
        rh4 rh4Var;
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        os osVar = this.o;
        osVar.L = zh4Var;
        osVar.R = this.n;
        float f2 = -f;
        h();
        if (osVar.x()) {
            sn2.z(osVar.B());
            osVar.B();
            this.m = osVar.F();
            int w = osVar.w();
            int z3 = osVar.z();
            int F = osVar.F();
            int D = osVar.D();
            int C = osVar.C();
            int i4 = (f2 > RecyclerView.A1 ? 1 : (f2 == RecyclerView.A1 ? 0 : -1));
            j14 j14Var = this.e;
            if (i4 <= 0) {
                this.j = 0 - D;
                this.h = w;
                while (this.j > 0 && (i3 = this.h) > 0 && j14Var.a(i3 - 1)) {
                    Object b = j14Var.b(this.h - 1);
                    b.getClass();
                    this.h--;
                    this.j -= ((p80) b).b;
                }
                f(0, this.h - 1);
            } else {
                this.k = 0 - C;
                this.i = z3;
                while (this.k > 0 && (i2 = this.i) < F - 1 && j14Var.a(i2 + 1)) {
                    Object b2 = j14Var.b(this.i + 1);
                    b2.getClass();
                    int i5 = ((p80) b2).b;
                    this.i++;
                    this.k -= i5;
                }
                f(this.i + 1, F - 1);
            }
        }
        if (osVar.x()) {
            sn2.z(osVar.B());
            if (osVar.B().t != null) {
                i = ((ki4) this.a.B).o;
                z = false;
            } else {
                z = false;
                i = 0;
            }
            int w2 = osVar.w();
            int z4 = osVar.z();
            int D2 = osVar.D();
            int C2 = osVar.C();
            if (f2 <= RecyclerView.A1) {
                z2 = true;
            } else {
                z2 = z;
            }
            rh4Var = this;
            rh4Var.d(osVar, w2, z4, i, C2, D2, f2, z2);
        } else {
            rh4Var = this;
        }
        rh4Var.f = f2;
        rh4Var.h();
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
        k14 k14Var = this.c;
        k14Var.b();
        j14 j14Var = this.b;
        int[] iArr3 = j14Var.b;
        long[] jArr3 = j14Var.a;
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
                            k14Var.a(i4);
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
        h14 h14Var = this.d;
        int[] iArr4 = h14Var.b;
        long[] jArr4 = h14Var.a;
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
                                k14Var.a(i11);
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
        j14 j14Var2 = this.e;
        int[] iArr5 = j14Var2.b;
        long[] jArr5 = j14Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr5[i12];
                if ((((~j6) << c2) & j6 & j3) != j3) {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr5[(i12 << 3) + i14]) && i3 <= i2) {
                            k14Var.a(i3);
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
        int[] iArr6 = k14Var.b;
        long[] jArr6 = k14Var.a;
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
                            List list = (List) j14Var.g(i18);
                            if (list != null) {
                                int size = list.size();
                                for (int i19 = 0; i19 < size; i19++) {
                                    ((pj3) list.get(i19)).cancel();
                                }
                            }
                            int c4 = h14Var.c(i18);
                            if (c4 >= 0) {
                                h14Var.e--;
                                long[] jArr7 = h14Var.a;
                                int i20 = h14Var.d;
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
                            j14Var2.g(i18);
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
        this.h = Preference.DEFAULT_ORDER;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        j14 j14Var = this.b;
        long[] jArr = j14Var.a;
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
                            int i5 = j14Var.b[i4];
                            List list = (List) j14Var.c[i4];
                            int size = list.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                ((pj3) list.get(i6)).cancel();
                            }
                            j14Var.h(i4);
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
        a53.U(this.j, "prefetchWindowStartExtraSpace");
        a53.U(this.k, "prefetchWindowEndExtraSpace");
        a53.U(this.h, "prefetchWindowStartIndex");
        a53.U(this.i, "prefetchWindowEndIndex");
    }
}
