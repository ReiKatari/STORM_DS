package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fs3  reason: default package */
/* loaded from: classes.dex */
public abstract class fs3 extends yn4 implements xz3, vv3 {
    public ds3 Y;
    public mi2 Z;
    public ao4 c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public final gs3 g0 = new gs3(0, this);
    public y9 h0;
    public d24 i0;

    public static void K0(m74 m74Var) {
        vf3 vf3Var;
        wf3 wf3Var;
        m74 m74Var2 = m74Var.m0;
        vf3 vf3Var2 = m74Var.j0;
        if (m74Var2 != null) {
            vf3Var = m74Var2.j0;
        } else {
            vf3Var = null;
        }
        if (!b53.x(vf3Var, vf3Var2)) {
            vf3Var2.B0.p.s0.f();
            return;
        }
        zb t = vf3Var2.B0.p.t();
        if (t != null && (wf3Var = ((sv3) t).s0) != null) {
            wf3Var.f();
        }
    }

    public abstract rd3 B0();

    public abstract boolean C0();

    public abstract vf3 F0();

    public abstract uv3 G0();

    public abstract fs3 H0();

    public abstract long I0();

    public final ds3 J0() {
        ds3 ds3Var = this.Y;
        if (ds3Var == null) {
            ds3 ds3Var2 = new ds3(this);
            this.Y = ds3Var2;
            return ds3Var2;
        }
        return ds3Var;
    }

    public final void L0(e24 e24Var) {
        vf3 vf3Var;
        Object[] objArr = e24Var.b;
        long[] jArr = e24Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (vf3Var = (vf3) ((vd7) objArr[(i << 3) + i3]).get()) != null) {
                            if (w()) {
                                vf3Var.S(false);
                            } else {
                                vf3Var.U(false);
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

    @Override // defpackage.vv3
    public final uv3 V(int i, int i2, Map map, mi2 mi2Var, mi2 mi2Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            mz2.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new dt(i, i2, map, mi2Var, mi2Var2, this, 1);
    }

    @Override // defpackage.yn4
    public final int j0(ds2 ds2Var) {
        int t0;
        if (!C0() || (t0 = t0(ds2Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return t0 + ((int) (this.X & 4294967295L));
    }

    @Override // defpackage.xz3
    public final void p(boolean z) {
        vf3 vf3Var;
        rf3 rf3Var;
        fs3 H0 = H0();
        rf3 rf3Var2 = null;
        if (H0 != null) {
            vf3Var = H0.F0();
        } else {
            vf3Var = null;
        }
        if (b53.x(vf3Var, F0())) {
            this.d0 = z;
            return;
        }
        if (vf3Var != null) {
            rf3Var = vf3Var.B0.d;
        } else {
            rf3Var = null;
        }
        if (rf3Var != rf3.LayingOut) {
            if (vf3Var != null) {
                rf3Var2 = vf3Var.B0.d;
            }
            if (rf3Var2 != rf3.LookaheadLayingOut) {
                return;
            }
        }
        this.d0 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0(defpackage.vf3 r32, defpackage.gs2 r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fs3.r0(vf3, gs2):void");
    }

    public abstract int t0(ds2 ds2Var);

    @Override // defpackage.s43
    public boolean w() {
        return false;
    }

    public final void w0(ao4 ao4Var, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        vf3 vf3Var;
        boolean z2;
        int i;
        char c2;
        long j6;
        fs3 fs3Var;
        e24 e24Var;
        yg4 snapshotObserver;
        d24 d24Var = this.i0;
        y9 y9Var = this.h0;
        if (y9Var == null) {
            y9Var = new y9();
            this.h0 = y9Var;
        }
        y9 y9Var2 = y9Var;
        wg4 wg4Var = F0().j0;
        if (wg4Var != null && (snapshotObserver = ((ee) wg4Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.d(ao4Var, qc2.Y, new es3(this, j, j2, ao4Var));
        }
        boolean w = w();
        e24 e24Var2 = (e24) y9Var2.e;
        e24 e24Var3 = (e24) y9Var2.f;
        int i2 = y9Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) y9Var2.d)[i3];
            if (b == 3) {
                gs2 gs2Var = ((gs2[]) y9Var2.b)[i3];
                gs2Var.getClass();
                e24Var3.k(gs2Var);
            } else if (b != 0 && d24Var != null) {
                gs2 gs2Var2 = ((gs2[]) y9Var2.b)[i3];
                gs2Var2.getClass();
                e24 e24Var4 = (e24) d24Var.k(gs2Var2);
                if (e24Var4 != null) {
                    e24Var2.j(e24Var4);
                }
            }
        }
        int i4 = y9Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) y9Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                gs2[] gs2VarArr = (gs2[]) y9Var2.b;
                gs2VarArr[i6 - i5] = gs2VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = y9Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((gs2[]) y9Var2.b)[i8] = null;
        }
        y9Var2.a -= i5;
        fs3 H0 = H0();
        Object[] objArr = e24Var3.b;
        long[] jArr = e24Var3.a;
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
                            gs2 gs2Var3 = (gs2) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            if (H0 == null) {
                                fs3Var = this;
                            } else {
                                fs3Var = H0;
                            }
                            i = i9;
                            fs3 fs3Var2 = fs3Var;
                            while (true) {
                                y9 y9Var3 = fs3Var2.h0;
                                if (y9Var3 != null) {
                                    z2 = w;
                                    if (nu.a0((gs2[]) y9Var3.b, gs2Var3)) {
                                        break;
                                    }
                                } else {
                                    z2 = w;
                                }
                                fs3 H02 = fs3Var2.H0();
                                if (H02 == null) {
                                    break;
                                }
                                fs3Var2 = H02;
                                w = z2;
                            }
                            d24 d24Var2 = fs3Var2.i0;
                            if (d24Var2 != null) {
                                e24Var = (e24) d24Var2.k(gs2Var3);
                            } else {
                                e24Var = null;
                            }
                            if (e24Var != null) {
                                fs3Var.L0(e24Var);
                            }
                        } else {
                            z2 = w;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        w = z2;
                    }
                    z = w;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = w;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                w = z;
                i9 = 8;
            }
        } else {
            z = w;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        e24Var3.b();
        Object[] objArr2 = e24Var2.b;
        long[] jArr2 = e24Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (vf3Var = (vf3) ((vd7) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                vf3Var.S(false);
                            } else {
                                vf3Var.U(false);
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
        e24Var2.b();
    }

    public final void x0(uv3 uv3Var) {
        boolean z;
        long j;
        long j2;
        d24 d24Var = this.i0;
        if (!this.f0) {
            mi2 d = uv3Var.d();
            boolean z2 = false;
            if (d == null) {
                if (d24Var != null) {
                    Object[] objArr = d24Var.c;
                    long[] jArr = d24Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j3 = jArr[i];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j3) < 128) {
                                        L0((e24) objArr[(i << 3) + i3]);
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
                    d24Var.a();
                    return;
                }
                return;
            }
            if (this.Z != d) {
                z = true;
            } else {
                z = false;
            }
            if (!z && J0().A) {
                rd3 B0 = B0();
                long P = mj2.P(B0.a(0L));
                long O = B0.O();
                j2 = P;
                j = O;
                z = (a33.a(P, J0().B) && i33.b(O, J0().L)) ? true : true;
            } else {
                j = 0;
                j2 = 9223372034707292159L;
            }
            if (z) {
                ao4 ao4Var = this.c0;
                if (ao4Var != null) {
                    ao4Var.A = uv3Var;
                } else {
                    ao4Var = new ao4(uv3Var, this);
                    this.c0 = ao4Var;
                }
                w0(ao4Var, j2, j);
                this.Z = uv3Var.d();
            }
        }
    }

    public abstract fs3 z0();
}
