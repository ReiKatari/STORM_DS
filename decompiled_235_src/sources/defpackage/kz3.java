package defpackage;

import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kz3  reason: default package */
/* loaded from: classes.dex */
public abstract class kz3 extends dx4 implements z74, g34 {
    public iz3 Y;
    public qn2 Z;
    public fx4 d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public final lz3 h0 = new lz3(this, 0);
    public z9 i0;
    public ja4 j0;

    public static void K0(eg4 eg4Var) {
        sm3 sm3Var;
        tm3 tm3Var;
        eg4 eg4Var2 = eg4Var.n0;
        sm3 sm3Var2 = eg4Var.k0;
        if (eg4Var2 != null) {
            sm3Var = eg4Var2.k0;
        } else {
            sm3Var = null;
        }
        if (!nb3.k(sm3Var, sm3Var2)) {
            sm3Var2.C0.p.t0.f();
            return;
        }
        nc j = sm3Var2.C0.p.j();
        if (j != null && (tm3Var = ((d34) j).t0) != null) {
            tm3Var.f();
        }
    }

    public abstract jk3 A0();

    public abstract boolean C0();

    public abstract sm3 F0();

    public abstract f34 G0();

    @Override // defpackage.z74
    public final void H(boolean z) {
        sm3 sm3Var;
        om3 om3Var;
        kz3 H0 = H0();
        om3 om3Var2 = null;
        if (H0 != null) {
            sm3Var = H0.F0();
        } else {
            sm3Var = null;
        }
        if (nb3.k(sm3Var, F0())) {
            this.e0 = z;
            return;
        }
        if (sm3Var != null) {
            om3Var = sm3Var.C0.d;
        } else {
            om3Var = null;
        }
        if (om3Var != om3.LayingOut) {
            if (sm3Var != null) {
                om3Var2 = sm3Var.C0.d;
            }
            if (om3Var2 != om3.LookaheadLayingOut) {
                return;
            }
        }
        this.e0 = z;
    }

    public abstract kz3 H0();

    public abstract long I0();

    public final iz3 J0() {
        iz3 iz3Var = this.Y;
        if (iz3Var == null) {
            iz3 iz3Var2 = new iz3(this);
            this.Y = iz3Var2;
            return iz3Var2;
        }
        return iz3Var;
    }

    public final void L0(ka4 ka4Var) {
        sm3 sm3Var;
        Object[] objArr = ka4Var.b;
        long[] jArr = ka4Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (sm3Var = (sm3) ((ss7) objArr[(i << 3) + i3]).get()) != null) {
                            if (a0()) {
                                sm3Var.S(false);
                            } else {
                                sm3Var.U(false);
                            }
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

    public abstract void M0();

    @Override // defpackage.dx4
    public final int X(ey2 ey2Var) {
        int u0;
        if (!C0() || (u0 = u0(ey2Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return u0 + ((int) (this.X & 4294967295L));
    }

    @Override // defpackage.eb3
    public boolean a0() {
        return false;
    }

    @Override // defpackage.g34
    public final f34 o0(int i, int i2, Map map, qn2 qn2Var, qn2 qn2Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            p53.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new tt(i, i2, map, qn2Var, qn2Var2, this, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(sm3 sm3Var, hy2 hy2Var) {
        char c;
        long j;
        long j2;
        long j3;
        ja4 ja4Var;
        ja4 ja4Var2;
        Object g;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        ja4 ja4Var3 = this.j0;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (ja4Var3 != null) {
            Object[] objArr = ja4Var3.c;
            long[] jArr3 = ja4Var3.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                ka4 ka4Var = (ka4) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = ka4Var.b;
                                long[] jArr4 = ka4Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    sm3 sm3Var2 = (sm3) ((ss7) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (sm3Var2 != null) {
                                                        boolean H = sm3Var2.H();
                                                        i4 = i8;
                                                        if (H) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    ka4Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
                ja4Var = this.j0;
                if (ja4Var != null) {
                    long[] jArr5 = ja4Var.a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr5[i15];
                            if ((((~j11) << c) & j11 & j) != j) {
                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j2) < j3) {
                                        int i18 = (i15 << 3) + i17;
                                        hy2 hy2Var2 = (hy2) ja4Var.b[i18];
                                        if (((ka4) ja4Var.c[i18]).g()) {
                                            ja4Var.l(i18);
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                }
                            }
                            if (i15 == length3) {
                                break;
                            }
                            i15++;
                        }
                    }
                }
                ja4Var2 = this.j0;
                if (ja4Var2 == null) {
                    ja4Var2 = new ja4();
                    this.j0 = ja4Var2;
                }
                g = ja4Var2.g(hy2Var);
                if (g == null) {
                    g = new ka4();
                    ja4Var2.m(hy2Var, g);
                }
                ((ka4) g).k(new WeakReference(sm3Var));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        ja4Var = this.j0;
        if (ja4Var != null) {
        }
        ja4Var2 = this.j0;
        if (ja4Var2 == null) {
        }
        g = ja4Var2.g(hy2Var);
        if (g == null) {
        }
        ((ka4) g).k(new WeakReference(sm3Var));
    }

    public abstract int u0(ey2 ey2Var);

    public final void w0(fx4 fx4Var, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        sm3 sm3Var;
        boolean z2;
        int i;
        char c2;
        long j6;
        kz3 kz3Var;
        ka4 ka4Var;
        bq4 snapshotObserver;
        ja4 ja4Var = this.j0;
        z9 z9Var = this.i0;
        if (z9Var == null) {
            z9Var = new z9();
            this.i0 = z9Var;
        }
        z9 z9Var2 = z9Var;
        zp4 zp4Var = F0().k0;
        if (zp4Var != null && (snapshotObserver = ((te) zp4Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.d(fx4Var, hh2.Z, new jz3(this, j, j2, fx4Var));
        }
        boolean a0 = a0();
        ka4 ka4Var2 = (ka4) z9Var2.e;
        ka4 ka4Var3 = (ka4) z9Var2.f;
        int i2 = z9Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) z9Var2.d)[i3];
            if (b == 3) {
                hy2 hy2Var = ((hy2[]) z9Var2.b)[i3];
                hy2Var.getClass();
                ka4Var3.k(hy2Var);
            } else if (b != 0 && ja4Var != null) {
                hy2 hy2Var2 = ((hy2[]) z9Var2.b)[i3];
                hy2Var2.getClass();
                ka4 ka4Var4 = (ka4) ja4Var.k(hy2Var2);
                if (ka4Var4 != null) {
                    ka4Var2.j(ka4Var4);
                }
            }
        }
        int i4 = z9Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) z9Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                hy2[] hy2VarArr = (hy2[]) z9Var2.b;
                hy2VarArr[i6 - i5] = hy2VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = z9Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((hy2[]) z9Var2.b)[i8] = null;
        }
        z9Var2.a -= i5;
        kz3 H0 = H0();
        Object[] objArr = ka4Var3.b;
        long[] jArr = ka4Var3.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            hy2 hy2Var3 = (hy2) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            if (H0 == null) {
                                kz3Var = this;
                            } else {
                                kz3Var = H0;
                            }
                            i = i9;
                            kz3 kz3Var2 = kz3Var;
                            while (true) {
                                z9 z9Var3 = kz3Var2.i0;
                                if (z9Var3 != null) {
                                    z2 = a0;
                                    if (fv.o0((hy2[]) z9Var3.b, hy2Var3)) {
                                        break;
                                    }
                                } else {
                                    z2 = a0;
                                }
                                kz3 H02 = kz3Var2.H0();
                                if (H02 == null) {
                                    break;
                                }
                                kz3Var2 = H02;
                                a0 = z2;
                            }
                            ja4 ja4Var2 = kz3Var2.j0;
                            if (ja4Var2 != null) {
                                ka4Var = (ka4) ja4Var2.k(hy2Var3);
                            } else {
                                ka4Var = null;
                            }
                            if (ka4Var != null) {
                                kz3Var.L0(ka4Var);
                            }
                        } else {
                            z2 = a0;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        a0 = z2;
                    }
                    z = a0;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = a0;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                a0 = z;
                i9 = 8;
            }
        } else {
            z = a0;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        ka4Var3.b();
        Object[] objArr2 = ka4Var2.b;
        long[] jArr2 = ka4Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (sm3Var = (sm3) ((ss7) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                sm3Var.S(false);
                            } else {
                                sm3Var.U(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                }
                i13++;
            }
        }
        ka4Var2.b();
    }

    public final void x0(f34 f34Var) {
        boolean z;
        long j;
        long j2;
        ja4 ja4Var = this.j0;
        if (!this.g0) {
            qn2 c = f34Var.c();
            boolean z2 = false;
            if (c == null) {
                if (ja4Var != null) {
                    Object[] objArr = ja4Var.c;
                    long[] jArr = ja4Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j3 = jArr[i];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j3) < 128) {
                                        L0((ka4) objArr[(i << 3) + i3]);
                                    }
                                    j3 >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                    ja4Var.a();
                    return;
                }
                return;
            }
            if (this.Z != c) {
                z = true;
            } else {
                z = false;
            }
            if (!z && J0().A) {
                jk3 A0 = A0();
                long a0 = kn2.a0(A0.w(0L));
                long m = A0.m();
                j2 = a0;
                j = m;
                z = (i93.a(a0, J0().B) && q93.b(m, J0().L)) ? true : true;
            } else {
                j = 0;
                j2 = 9223372034707292159L;
            }
            if (z) {
                fx4 fx4Var = this.d0;
                if (fx4Var != null) {
                    fx4Var.A = f34Var;
                } else {
                    fx4Var = new fx4(f34Var, this);
                    this.d0 = fx4Var;
                }
                w0(fx4Var, j2, j);
                this.Z = f34Var.c();
            }
        }
    }

    public abstract kz3 z0();
}
