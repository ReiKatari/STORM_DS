package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v92  reason: default package */
/* loaded from: classes.dex */
public final class v92 extends pc7 {
    public gz0[] d1;
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public float M0 = 0.5f;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public int S0 = 0;
    public int T0 = 0;
    public int U0 = 2;
    public int V0 = 2;
    public int W0 = 0;
    public int X0 = -1;
    public int Y0 = 0;
    public final ArrayList Z0 = new ArrayList();
    public gz0[] a1 = null;
    public gz0[] b1 = null;
    public int[] c1 = null;
    public int e1 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06fa  */
    @Override // defpackage.pc7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(int r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v92.V(int, int, int, int):void");
    }

    public final int X(gz0 gz0Var, int i) {
        gz0 gz0Var2;
        if (gz0Var == null) {
            return 0;
        }
        if (gz0Var.T[1] == fz0.MATCH_CONSTRAINT) {
            int i2 = gz0Var.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (gz0Var.z * i);
                if (i3 != gz0Var.l()) {
                    gz0Var.g = true;
                    W(gz0Var, gz0Var.T[0], gz0Var.r(), fz0.FIXED, i3);
                }
                return i3;
            }
            gz0Var2 = gz0Var;
            if (i2 == 1) {
                return gz0Var2.l();
            }
            if (i2 == 3) {
                return (int) ((gz0Var2.r() * gz0Var2.X) + 0.5f);
            }
        } else {
            gz0Var2 = gz0Var;
        }
        return gz0Var2.l();
    }

    public final int Y(gz0 gz0Var, int i) {
        gz0 gz0Var2;
        if (gz0Var == null) {
            return 0;
        }
        if (gz0Var.T[0] == fz0.MATCH_CONSTRAINT) {
            int i2 = gz0Var.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (gz0Var.w * i);
                if (i3 != gz0Var.r()) {
                    gz0Var.g = true;
                    W(gz0Var, fz0.FIXED, i3, gz0Var.T[1], gz0Var.l());
                }
                return i3;
            }
            gz0Var2 = gz0Var;
            if (i2 == 1) {
                return gz0Var2.r();
            }
            if (i2 == 3) {
                return (int) ((gz0Var2.l() * gz0Var2.X) + 0.5f);
            }
        } else {
            gz0Var2 = gz0Var;
        }
        return gz0Var2.r();
    }

    @Override // defpackage.gz0
    public final void b(ho3 ho3Var, boolean z) {
        boolean z2;
        boolean z3;
        gz0 gz0Var;
        float f;
        int i;
        boolean z4;
        super.b(ho3Var, z);
        gz0 gz0Var2 = this.U;
        if (gz0Var2 != null && ((hz0) gz0Var2).y0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.W0;
        ArrayList arrayList = this.Z0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            t92 t92Var = (t92) arrayList.get(i3);
                            if (i3 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            t92Var.b(i3, z2, z4);
                        }
                    }
                } else if (this.c1 != null && this.b1 != null && this.a1 != null) {
                    for (int i4 = 0; i4 < this.e1; i4++) {
                        this.d1[i4].E();
                    }
                    int[] iArr = this.c1;
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    float f2 = this.M0;
                    gz0 gz0Var3 = null;
                    int i7 = 0;
                    while (i7 < i5) {
                        if (z2) {
                            i = (i5 - i7) - 1;
                            f = 1.0f - this.M0;
                        } else {
                            f = f2;
                            i = i7;
                        }
                        gz0 gz0Var4 = this.b1[i];
                        if (gz0Var4 != null) {
                            cy0 cy0Var = gz0Var4.I;
                            if (gz0Var4.h0 != 8) {
                                if (i7 == 0) {
                                    gz0Var4.f(cy0Var, this.I, this.z0);
                                    gz0Var4.k0 = this.G0;
                                    gz0Var4.e0 = f;
                                }
                                if (i7 == i5 - 1) {
                                    gz0Var4.f(gz0Var4.K, this.K, this.A0);
                                }
                                if (i7 > 0 && gz0Var3 != null) {
                                    cy0 cy0Var2 = gz0Var3.K;
                                    gz0Var4.f(cy0Var, cy0Var2, this.S0);
                                    gz0Var3.f(cy0Var2, cy0Var, 0);
                                }
                                gz0Var3 = gz0Var4;
                            }
                        }
                        i7++;
                        f2 = f;
                    }
                    for (int i8 = 0; i8 < i6; i8++) {
                        gz0 gz0Var5 = this.a1[i8];
                        if (gz0Var5 != null) {
                            cy0 cy0Var3 = gz0Var5.J;
                            if (gz0Var5.h0 != 8) {
                                if (i8 == 0) {
                                    gz0Var5.f(cy0Var3, this.J, this.v0);
                                    gz0Var5.l0 = this.H0;
                                    gz0Var5.f0 = this.N0;
                                }
                                if (i8 == i6 - 1) {
                                    gz0Var5.f(gz0Var5.L, this.L, this.w0);
                                }
                                if (i8 > 0 && gz0Var3 != null) {
                                    cy0 cy0Var4 = gz0Var3.L;
                                    gz0Var5.f(cy0Var3, cy0Var4, this.T0);
                                    gz0Var3.f(cy0Var4, cy0Var3, 0);
                                }
                                gz0Var3 = gz0Var5;
                            }
                        }
                    }
                    for (int i9 = 0; i9 < i5; i9++) {
                        for (int i10 = 0; i10 < i6; i10++) {
                            int i11 = (i10 * i5) + i9;
                            if (this.Y0 == 1) {
                                i11 = (i9 * i6) + i10;
                            }
                            gz0[] gz0VarArr = this.d1;
                            if (i11 < gz0VarArr.length && (gz0Var = gz0VarArr[i11]) != null && gz0Var.h0 != 8) {
                                gz0 gz0Var6 = this.b1[i9];
                                gz0 gz0Var7 = this.a1[i10];
                                if (gz0Var != gz0Var6) {
                                    gz0Var.f(gz0Var.I, gz0Var6.I, 0);
                                    gz0Var.f(gz0Var.K, gz0Var6.K, 0);
                                }
                                if (gz0Var != gz0Var7) {
                                    gz0Var.f(gz0Var.J, gz0Var7.J, 0);
                                    gz0Var.f(gz0Var.L, gz0Var7.L, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    t92 t92Var2 = (t92) arrayList.get(i12);
                    if (i12 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    t92Var2.b(i12, z2, z3);
                }
            }
        } else if (arrayList.size() > 0) {
            ((t92) arrayList.get(0)).b(0, z2, true);
        }
        this.B0 = false;
    }

    @Override // defpackage.fr2, defpackage.gz0
    public final void g(gz0 gz0Var, HashMap hashMap) {
        super.g(gz0Var, hashMap);
        v92 v92Var = (v92) gz0Var;
        this.G0 = v92Var.G0;
        this.H0 = v92Var.H0;
        this.I0 = v92Var.I0;
        this.J0 = v92Var.J0;
        this.K0 = v92Var.K0;
        this.L0 = v92Var.L0;
        this.M0 = v92Var.M0;
        this.N0 = v92Var.N0;
        this.O0 = v92Var.O0;
        this.P0 = v92Var.P0;
        this.Q0 = v92Var.Q0;
        this.R0 = v92Var.R0;
        this.S0 = v92Var.S0;
        this.T0 = v92Var.T0;
        this.U0 = v92Var.U0;
        this.V0 = v92Var.V0;
        this.W0 = v92Var.W0;
        this.X0 = v92Var.X0;
        this.Y0 = v92Var.Y0;
    }
}
