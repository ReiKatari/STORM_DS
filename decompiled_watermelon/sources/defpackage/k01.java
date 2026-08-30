package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k01  reason: default package */
/* loaded from: classes.dex */
public final class k01 extends yy3 implements jv0, yv3 {
    public jf4 j0;
    public final ax5 k0;
    public boolean l0;
    public v50 m0;
    public final nw5 n0;
    public boolean p0;
    public boolean r0;
    public final l50 o0 = new l50(0);
    public long q0 = -1;

    public k01(jf4 jf4Var, ax5 ax5Var, boolean z, v50 v50Var, nw5 nw5Var) {
        this.j0 = jf4Var;
        this.k0 = ax5Var;
        this.l0 = z;
        this.m0 = v50Var;
        this.n0 = nw5Var;
    }

    public static final float R0(k01 k01Var, v50 v50Var, long j) {
        char c;
        float f;
        long j2;
        y55 y55Var;
        int compare;
        long j3 = k01Var.q0;
        o24 o24Var = k01Var.o0.a;
        int i = o24Var.L - 1;
        Object[] objArr = o24Var.A;
        y55 y55Var2 = null;
        if (i < objArr.length) {
            y55Var = null;
            while (true) {
                if (i >= 0) {
                    y55 y55Var3 = (y55) ((g01) objArr[i]).a.c();
                    if (y55Var3 != null) {
                        long c2 = y55Var3.c();
                        long U = hk2.U(k01Var.S0());
                        f = RecyclerView.A1;
                        int i2 = h01.a[k01Var.j0.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                c = ' ';
                                j2 = 4294967295L;
                                compare = Float.compare(Float.intBitsToFloat((int) (c2 >> 32)), Float.intBitsToFloat((int) (U >> 32)));
                            } else {
                                i.c();
                                return RecyclerView.A1;
                            }
                        } else {
                            c = ' ';
                            j2 = 4294967295L;
                            compare = Float.compare(Float.intBitsToFloat((int) (c2 & 4294967295L)), Float.intBitsToFloat((int) (U & 4294967295L)));
                        }
                        if (compare <= 0) {
                            y55Var = y55Var3;
                        } else if (y55Var == null) {
                            y55Var = y55Var3;
                        }
                    }
                    i--;
                } else {
                    c = ' ';
                    f = RecyclerView.A1;
                    j2 = 4294967295L;
                    break;
                }
            }
        } else {
            c = ' ';
            f = RecyclerView.A1;
            j2 = 4294967295L;
            y55Var = null;
        }
        if (y55Var == null) {
            if (k01Var.p0) {
                y55Var2 = (y55) k01Var.n0.c();
            }
            if (y55Var2 == null) {
                return f;
            }
            y55Var = y55Var2;
        }
        long U2 = hk2.U(j3);
        int i3 = h01.a[k01Var.j0.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                float f2 = y55Var.a;
                return v50Var.a(f2 - ((int) (j >> c)), y55Var.c - f2, Float.intBitsToFloat((int) (U2 >> c)));
            }
            i.c();
            return f;
        }
        float f3 = y55Var.b;
        return v50Var.a(f3 - ((int) (j & j2)), y55Var.d - f3, Float.intBitsToFloat((int) (U2 & j2)));
    }

    public static boolean T0(k01 k01Var, y55 y55Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = k01Var.S0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long V0 = k01Var.V0(y55Var, j3, j2);
        if (Math.abs(Float.intBitsToFloat((int) (V0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (V0 & 4294967295L))) <= 0.5f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    public final long S0() {
        long j = this.q0;
        if (i33.b(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void U0(long j) {
        v50 v50Var = this.m0;
        if (v50Var == null) {
            v50Var = (v50) mh7.t(this, x50.a);
        }
        v50 v50Var2 = v50Var;
        if (this.r0) {
            pz2.c("launchAnimation called when previous animation was running");
        }
        v50 v50Var3 = this.m0;
        if (v50Var3 == null) {
            v50Var3 = (v50) mh7.t(this, x50.a);
        }
        v50Var3.getClass();
        v50.a.getClass();
        tq5.w(F0(), null, s31.UNDISPATCHED, new j01(this, new s37(u50.b), v50Var2, j, null), 1);
    }

    public final long V0(y55 y55Var, long j, long j2) {
        long U = hk2.U(j);
        int i = h01.a[this.j0.ordinal()];
        if (i != 1) {
            if (i == 2) {
                v50 v50Var = this.m0;
                if (v50Var == null) {
                    v50Var = (v50) mh7.t(this, x50.a);
                }
                float f = y55Var.a;
                return (Float.floatToRawIntBits(v50Var.a(f - ((int) (j2 >> 32)), y55Var.c - f, Float.intBitsToFloat((int) (U >> 32)))) << 32) | (Float.floatToRawIntBits(RecyclerView.A1) & 4294967295L);
            }
            i.c();
            return 0L;
        }
        v50 v50Var2 = this.m0;
        if (v50Var2 == null) {
            v50Var2 = (v50) mh7.t(this, x50.a);
        }
        float f2 = y55Var.b;
        return (Float.floatToRawIntBits(RecyclerView.A1) << 32) | (Float.floatToRawIntBits(v50Var2.a(f2 - ((int) (j2 & 4294967295L)), y55Var.d - f2, Float.intBitsToFloat((int) (U & 4294967295L)))) & 4294967295L);
    }

    @Override // defpackage.yv3
    public final void c(long j) {
        int E;
        long j2;
        long S0 = S0();
        this.q0 = j;
        int i = h01.a[this.j0.ordinal()];
        if (i != 1) {
            if (i == 2) {
                E = b53.E((int) (j >> 32), (int) (S0 >> 32));
            } else {
                i.c();
                return;
            }
        } else {
            E = b53.E((int) (j & 4294967295L), (int) (S0 & 4294967295L));
        }
        if (E < 0) {
            if (!this.l0) {
                if (this.j0 == jf4.Vertical) {
                    j2 = (((int) (S0 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L;
                } else {
                    j2 = (((int) (S0 >> 32)) - ((int) (j >> 32))) << 32;
                }
            } else {
                j2 = 0;
            }
            long j3 = j2;
            y55 y55Var = (y55) this.n0.c();
            if (y55Var != null && !this.r0 && !this.p0 && T0(this, y55Var, S0, 0L, 2) && !T0(this, y55Var, 0L, j3, 1)) {
                this.p0 = true;
                U0(j3);
            }
        }
    }
}
