package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p31  reason: default package */
/* loaded from: classes.dex */
public final class p31 extends z64 implements fy0, j34 {
    public lo4 k0;
    public final m86 l0;
    public boolean m0;
    public z70 n0;
    public final a86 o0;
    public boolean q0;
    public boolean s0;
    public final p70 p0 = new p70(0);
    public long r0 = -1;

    public p31(lo4 lo4Var, m86 m86Var, boolean z, z70 z70Var, a86 a86Var) {
        this.k0 = lo4Var;
        this.l0 = m86Var;
        this.m0 = z;
        this.n0 = z70Var;
        this.o0 = a86Var;
    }

    public static final float R0(p31 p31Var, z70 z70Var, long j) {
        char c;
        float f;
        long j2;
        of5 of5Var;
        int compare;
        long j3 = p31Var.r0;
        ua4 ua4Var = p31Var.p0.a;
        int i = ua4Var.L - 1;
        Object[] objArr = ua4Var.A;
        of5 of5Var2 = null;
        if (i < objArr.length) {
            of5Var = null;
            while (true) {
                if (i >= 0) {
                    of5 of5Var3 = (of5) ((l31) objArr[i]).a.c();
                    if (of5Var3 != null) {
                        long c2 = of5Var3.c();
                        long S = qo2.S(p31Var.S0());
                        f = RecyclerView.B1;
                        int i2 = m31.a[p31Var.k0.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                c = ' ';
                                j2 = 4294967295L;
                                compare = Float.compare(Float.intBitsToFloat((int) (c2 >> 32)), Float.intBitsToFloat((int) (S >> 32)));
                            } else {
                                i.d();
                                return RecyclerView.B1;
                            }
                        } else {
                            c = ' ';
                            j2 = 4294967295L;
                            compare = Float.compare(Float.intBitsToFloat((int) (c2 & 4294967295L)), Float.intBitsToFloat((int) (S & 4294967295L)));
                        }
                        if (compare <= 0) {
                            of5Var = of5Var3;
                        } else if (of5Var == null) {
                            of5Var = of5Var3;
                        }
                    }
                    i--;
                } else {
                    c = ' ';
                    f = RecyclerView.B1;
                    j2 = 4294967295L;
                    break;
                }
            }
        } else {
            c = ' ';
            f = RecyclerView.B1;
            j2 = 4294967295L;
            of5Var = null;
        }
        if (of5Var == null) {
            if (p31Var.q0) {
                of5Var2 = (of5) p31Var.o0.c();
            }
            if (of5Var2 == null) {
                return f;
            }
            of5Var = of5Var2;
        }
        long S2 = qo2.S(j3);
        int i3 = m31.a[p31Var.k0.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                float f2 = of5Var.a;
                return z70Var.a(f2 - ((int) (j >> c)), of5Var.c - f2, Float.intBitsToFloat((int) (S2 >> c)));
            }
            i.d();
            return f;
        }
        float f3 = of5Var.b;
        return z70Var.a(f3 - ((int) (j & j2)), of5Var.d - f3, Float.intBitsToFloat((int) (S2 & j2)));
    }

    public static boolean T0(p31 p31Var, of5 of5Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = p31Var.S0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long V0 = p31Var.V0(of5Var, j3, j2);
        if (Math.abs(Float.intBitsToFloat((int) (V0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (V0 & 4294967295L))) <= 0.5f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    public final long S0() {
        long j = this.r0;
        if (q93.b(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void U0(long j) {
        z70 z70Var = this.n0;
        if (z70Var == null) {
            z70Var = (z70) hf.K(this, b80.a);
        }
        z70 z70Var2 = z70Var;
        if (this.s0) {
            s53.c("launchAnimation called when previous animation was running");
        }
        z70 z70Var3 = this.n0;
        if (z70Var3 == null) {
            z70Var3 = (z70) hf.K(this, b80.a);
        }
        z70Var3.getClass();
        z70.a.getClass();
        hv.L(F0(), null, a71.UNDISPATCHED, new o31(this, new nh7(y70.b), z70Var2, j, null), 1);
    }

    public final long V0(of5 of5Var, long j, long j2) {
        long S = qo2.S(j);
        int i = m31.a[this.k0.ordinal()];
        if (i != 1) {
            if (i == 2) {
                z70 z70Var = this.n0;
                if (z70Var == null) {
                    z70Var = (z70) hf.K(this, b80.a);
                }
                float f = of5Var.a;
                return (Float.floatToRawIntBits(z70Var.a(f - ((int) (j2 >> 32)), of5Var.c - f, Float.intBitsToFloat((int) (S >> 32)))) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L);
            }
            i.d();
            return 0L;
        }
        z70 z70Var2 = this.n0;
        if (z70Var2 == null) {
            z70Var2 = (z70) hf.K(this, b80.a);
        }
        float f2 = of5Var.b;
        return (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(z70Var2.a(f2 - ((int) (j2 & 4294967295L)), of5Var.d - f2, Float.intBitsToFloat((int) (S & 4294967295L)))) & 4294967295L);
    }

    @Override // defpackage.j34
    public final void b(long j) {
        int p;
        long j2;
        long S0 = S0();
        this.r0 = j;
        int i = m31.a[this.k0.ordinal()];
        if (i != 1) {
            if (i == 2) {
                p = nb3.p((int) (j >> 32), (int) (S0 >> 32));
            } else {
                i.d();
                return;
            }
        } else {
            p = nb3.p((int) (j & 4294967295L), (int) (S0 & 4294967295L));
        }
        if (p < 0) {
            if (!this.m0) {
                if (this.k0 == lo4.Vertical) {
                    j2 = (((int) (S0 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L;
                } else {
                    j2 = (((int) (S0 >> 32)) - ((int) (j >> 32))) << 32;
                }
            } else {
                j2 = 0;
            }
            long j3 = j2;
            of5 of5Var = (of5) this.o0.c();
            if (of5Var != null && !this.s0 && !this.q0 && T0(this, of5Var, S0, 0L, 2) && !T0(this, of5Var, 0L, j3, 1)) {
                this.q0 = true;
                U0(j3);
            }
        }
    }
}
