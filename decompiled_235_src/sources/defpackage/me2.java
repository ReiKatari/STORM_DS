package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: me2  reason: default package */
/* loaded from: classes.dex */
public final class me2 extends rq7 {
    public l21[] d1;
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
    public l21[] a1 = null;
    public l21[] b1 = null;
    public int[] c1 = null;
    public int e1 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06fa  */
    @Override // defpackage.rq7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        ke2 ke2Var;
        char c;
        boolean z;
        int i10;
        boolean z2;
        int i11;
        boolean z3;
        boolean z4;
        int i12;
        int i13;
        boolean z5;
        Object obj;
        l21 l21Var;
        int i14;
        boolean z6;
        int i15;
        boolean z7;
        boolean z8;
        int i16;
        int i17;
        p11 p11Var;
        if (this.u0 > 0) {
            l21 l21Var2 = this.U;
            if (l21Var2 != null) {
                p11Var = ((m21) l21Var2).x0;
            } else {
                p11Var = null;
            }
            if (p11Var == null) {
                this.C0 = 0;
                this.D0 = 0;
                this.B0 = false;
                return;
            }
            for (int i18 = 0; i18 < this.u0; i18++) {
                l21 l21Var3 = this.t0[i18];
                if (l21Var3 != null && !(l21Var3 instanceof av2)) {
                    k21 k = l21Var3.k(0);
                    k21 k2 = l21Var3.k(1);
                    k21 k21Var = k21.MATCH_CONSTRAINT;
                    if (k != k21Var || l21Var3.r == 1 || k2 != k21Var || l21Var3.s == 1) {
                        if (k == k21Var) {
                            k = k21.WRAP_CONTENT;
                        }
                        if (k2 == k21Var) {
                            k2 = k21.WRAP_CONTENT;
                        }
                        e30 e30Var = this.E0;
                        e30Var.a = k;
                        e30Var.b = k2;
                        e30Var.c = l21Var3.r();
                        e30Var.d = l21Var3.l();
                        p11Var.b(l21Var3, e30Var);
                        l21Var3.P(e30Var.e);
                        l21Var3.M(e30Var.f);
                        l21Var3.J(e30Var.g);
                    }
                }
            }
        }
        int i19 = this.z0;
        int i20 = this.A0;
        int i21 = this.v0;
        int i22 = this.w0;
        int[] iArr2 = new int[2];
        int i23 = (i2 - i19) - i20;
        int i24 = this.Y0;
        if (i24 == 1) {
            i23 = (i4 - i21) - i22;
        }
        int i25 = i23;
        int i26 = this.G0;
        if (i24 == 0) {
            if (i26 == -1) {
                this.G0 = 0;
            }
            if (this.H0 == -1) {
                this.H0 = 0;
            }
        } else {
            if (i26 == -1) {
                this.G0 = 0;
            }
            if (this.H0 == -1) {
                this.H0 = 0;
            }
        }
        l21[] l21VarArr = this.t0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            i5 = this.u0;
            if (i27 >= i5) {
                break;
            }
            if (this.t0[i27].h0 == 8) {
                i28++;
            }
            i27++;
        }
        if (i28 > 0) {
            l21VarArr = new l21[i5 - i28];
            int i30 = 0;
            for (int i31 = 0; i31 < this.u0; i31++) {
                l21 l21Var4 = this.t0[i31];
                if (l21Var4.h0 != 8) {
                    l21VarArr[i30] = l21Var4;
                    i30++;
                }
            }
            i5 = i30;
        }
        l21[] l21VarArr2 = l21VarArr;
        this.d1 = l21VarArr2;
        this.e1 = i5;
        int i32 = this.W0;
        ArrayList arrayList = this.Z0;
        if (i32 != 0) {
            h11 h11Var = this.J;
            h11 h11Var2 = this.I;
            i8 = i19;
            h11 h11Var3 = this.K;
            h11 h11Var4 = this.L;
            if (i32 != 1) {
                if (i32 != 2) {
                    if (i32 == 3) {
                        int i33 = this.Y0;
                        if (i5 != 0) {
                            arrayList.clear();
                            iArr = iArr2;
                            i6 = i21;
                            i7 = i22;
                            ke2 ke2Var2 = new ke2(this, i33, this.I, this.J, this.K, this.L, i25);
                            arrayList.add(ke2Var2);
                            if (i33 == 0) {
                                int i34 = 0;
                                int i35 = 0;
                                i14 = 0;
                                int i36 = 0;
                                while (i34 < i5) {
                                    i35++;
                                    int i37 = i20;
                                    l21 l21Var5 = l21VarArr2[i34];
                                    int Y = Y(l21Var5, i25);
                                    int i38 = i33;
                                    int i39 = i34;
                                    if (l21Var5.T[0] == k21.MATCH_CONSTRAINT) {
                                        i14++;
                                    }
                                    int i40 = i14;
                                    if ((i36 == i25 || this.S0 + i36 + Y > i25) && ke2Var2.b != null) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (!z8 && i39 > 0 && (i17 = this.X0) > 0 && i35 > i17) {
                                        z8 = true;
                                    }
                                    if (z8) {
                                        i33 = i38;
                                        i16 = i39;
                                        ke2Var2 = new ke2(this, i33, this.I, this.J, this.K, this.L, i25);
                                        ke2Var2.n = i16;
                                        arrayList.add(ke2Var2);
                                        i36 = Y;
                                        i35 = 1;
                                    } else {
                                        i33 = i38;
                                        i16 = i39;
                                        if (i16 > 0) {
                                            i36 = this.S0 + Y + i36;
                                        } else {
                                            i36 = Y;
                                        }
                                    }
                                    ke2Var2.a(l21Var5);
                                    i34 = i16 + 1;
                                    i14 = i40;
                                    i20 = i37;
                                }
                                i9 = i20;
                            } else {
                                i9 = i20;
                                int i41 = 0;
                                int i42 = 0;
                                int i43 = 0;
                                int i44 = 0;
                                while (i44 < i5) {
                                    i41++;
                                    l21 l21Var6 = l21VarArr2[i44];
                                    int X = X(l21Var6, i25);
                                    int i45 = i33;
                                    if (l21Var6.T[1] == k21.MATCH_CONSTRAINT) {
                                        i42++;
                                    }
                                    int i46 = i42;
                                    if ((i43 == i25 || this.T0 + i43 + X > i25) && ke2Var2.b != null) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (!z6 && i44 > 0 && (i15 = this.X0) > 0 && i41 > i15) {
                                        z6 = true;
                                    }
                                    if (z6) {
                                        i33 = i45;
                                        ke2Var2 = new ke2(this, i33, this.I, this.J, this.K, this.L, i25);
                                        ke2Var2.n = i44;
                                        arrayList.add(ke2Var2);
                                        i43 = X;
                                        i41 = 1;
                                    } else {
                                        i33 = i45;
                                        if (i44 > 0) {
                                            i43 = this.T0 + X + i43;
                                        } else {
                                            i43 = X;
                                        }
                                    }
                                    ke2Var2.a(l21Var6);
                                    i44++;
                                    i42 = i46;
                                }
                                i14 = i42;
                            }
                            int size = arrayList.size();
                            int i47 = this.z0;
                            int i48 = this.v0;
                            int i49 = this.A0;
                            int i50 = this.w0;
                            k21[] k21VarArr = this.T;
                            k21 k21Var2 = k21VarArr[0];
                            k21 k21Var3 = k21.WRAP_CONTENT;
                            if (k21Var2 != k21Var3 && k21VarArr[1] != k21Var3) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (i14 > 0 && z7) {
                                for (int i51 = 0; i51 < size; i51++) {
                                    ke2 ke2Var3 = (ke2) arrayList.get(i51);
                                    if (i33 == 0) {
                                        ke2Var3.e(i25 - ke2Var3.d());
                                    } else {
                                        ke2Var3.e(i25 - ke2Var3.c());
                                    }
                                }
                            }
                            int i52 = i47;
                            int i53 = i48;
                            int i54 = i49;
                            int i55 = i50;
                            h11 h11Var5 = h11Var2;
                            h11 h11Var6 = h11Var;
                            int i56 = 0;
                            int i57 = 0;
                            h11 h11Var7 = h11Var3;
                            h11 h11Var8 = h11Var4;
                            for (int i58 = 0; i58 < size; i58++) {
                                ke2 ke2Var4 = (ke2) arrayList.get(i58);
                                if (i33 == 0) {
                                    if (i58 < size - 1) {
                                        h11Var8 = ((ke2) arrayList.get(i58 + 1)).b.J;
                                        i55 = 0;
                                    } else {
                                        i55 = this.w0;
                                        h11Var8 = h11Var4;
                                    }
                                    h11 h11Var9 = ke2Var4.b.L;
                                    ke2Var4.f(i33, h11Var5, h11Var6, h11Var7, h11Var8, i52, i53, i54, i55, i25);
                                    i56 = Math.max(i56, ke2Var4.d());
                                    int c2 = ke2Var4.c() + i57;
                                    if (i58 > 0) {
                                        c2 += this.T0;
                                    }
                                    i57 = c2;
                                    h11Var6 = h11Var9;
                                    i53 = 0;
                                } else {
                                    if (i58 < size - 1) {
                                        h11Var7 = ((ke2) arrayList.get(i58 + 1)).b.I;
                                        i54 = 0;
                                    } else {
                                        i54 = this.A0;
                                        h11Var7 = h11Var3;
                                    }
                                    h11 h11Var10 = ke2Var4.b.K;
                                    ke2Var4.f(i33, h11Var5, h11Var6, h11Var7, h11Var8, i52, i53, i54, i55, i25);
                                    int d = ke2Var4.d() + i56;
                                    int max = Math.max(i57, ke2Var4.c());
                                    if (i58 > 0) {
                                        d += this.S0;
                                    }
                                    i57 = max;
                                    i56 = d;
                                    h11Var5 = h11Var10;
                                    i52 = 0;
                                }
                            }
                            iArr[0] = i56;
                            iArr[1] = i57;
                        }
                    }
                    i7 = i22;
                    iArr = iArr2;
                    i9 = i20;
                    i6 = i21;
                } else {
                    i7 = i22;
                    iArr = iArr2;
                    i9 = i20;
                    i6 = i21;
                    int i59 = this.Y0;
                    int i60 = this.X0;
                    if (i59 == 0) {
                        if (i60 <= 0) {
                            int i61 = 0;
                            i13 = 0;
                            for (int i62 = 0; i62 < i5; i62++) {
                                if (i62 > 0) {
                                    i61 += this.S0;
                                }
                                l21 l21Var7 = l21VarArr2[i62];
                                if (l21Var7 != null) {
                                    int Y2 = Y(l21Var7, i25) + i61;
                                    if (Y2 > i25) {
                                        break;
                                    }
                                    i13++;
                                    i61 = Y2;
                                }
                            }
                        } else {
                            i13 = i60;
                        }
                        i60 = 0;
                    } else {
                        if (i60 <= 0) {
                            int i63 = 0;
                            int i64 = 0;
                            for (int i65 = 0; i65 < i5; i65++) {
                                if (i65 > 0) {
                                    i63 += this.T0;
                                }
                                l21 l21Var8 = l21VarArr2[i65];
                                if (l21Var8 != null) {
                                    int X2 = X(l21Var8, i25) + i63;
                                    if (X2 > i25) {
                                        break;
                                    }
                                    i64++;
                                    i63 = X2;
                                }
                            }
                            i60 = i64;
                        }
                        i13 = 0;
                    }
                    if (this.c1 == null) {
                        this.c1 = new int[2];
                    }
                    if ((i60 == 0 && i59 == 1) || (i13 == 0 && i59 == 0)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    while (!z5) {
                        if (i59 == 0) {
                            i60 = (int) Math.ceil(i5 / i13);
                        } else {
                            i13 = (int) Math.ceil(i5 / i60);
                        }
                        l21[] l21VarArr3 = this.b1;
                        if (l21VarArr3 == null || l21VarArr3.length < i13) {
                            obj = null;
                            this.b1 = new l21[i13];
                        } else {
                            obj = null;
                            Arrays.fill(l21VarArr3, (Object) null);
                        }
                        l21[] l21VarArr4 = this.a1;
                        if (l21VarArr4 != null && l21VarArr4.length >= i60) {
                            Arrays.fill(l21VarArr4, obj);
                        } else {
                            this.a1 = new l21[i60];
                        }
                        for (int i66 = 0; i66 < i13; i66++) {
                            for (int i67 = 0; i67 < i60; i67++) {
                                int i68 = (i67 * i13) + i66;
                                if (i59 == 1) {
                                    i68 = (i66 * i60) + i67;
                                }
                                if (i68 < l21VarArr2.length && (l21Var = l21VarArr2[i68]) != null) {
                                    int Y3 = Y(l21Var, i25);
                                    l21 l21Var9 = this.b1[i66];
                                    if (l21Var9 == null || l21Var9.r() < Y3) {
                                        this.b1[i66] = l21Var;
                                    }
                                    int X3 = X(l21Var, i25);
                                    l21 l21Var10 = this.a1[i67];
                                    if (l21Var10 == null || l21Var10.l() < X3) {
                                        this.a1[i67] = l21Var;
                                    }
                                }
                            }
                        }
                        int i69 = 0;
                        for (int i70 = 0; i70 < i13; i70++) {
                            l21 l21Var11 = this.b1[i70];
                            if (l21Var11 != null) {
                                if (i70 > 0) {
                                    i69 += this.S0;
                                }
                                i69 = Y(l21Var11, i25) + i69;
                            }
                        }
                        int i71 = 0;
                        for (int i72 = 0; i72 < i60; i72++) {
                            l21 l21Var12 = this.a1[i72];
                            if (l21Var12 != null) {
                                if (i72 > 0) {
                                    i71 += this.T0;
                                }
                                i71 = X(l21Var12, i25) + i71;
                            }
                        }
                        iArr[0] = i69;
                        iArr[1] = i71;
                        if (i59 == 0) {
                            if (i69 > i25 && i13 > 1) {
                                i13--;
                            }
                            z5 = true;
                        } else {
                            if (i71 > i25 && i60 > 1) {
                                i60--;
                            }
                            z5 = true;
                        }
                    }
                    int[] iArr3 = this.c1;
                    iArr3[0] = i13;
                    iArr3[1] = i60;
                    c = 1;
                    int i73 = iArr[i29] + i8 + i9;
                    int i74 = iArr[c] + i6 + i7;
                    if (i != 1073741824) {
                        i73 = i2;
                    } else if (i == Integer.MIN_VALUE) {
                        i73 = Math.min(i73, i2);
                    } else if (i != 0) {
                        i73 = i29;
                    }
                    if (i3 != 1073741824) {
                        i74 = i4;
                    } else if (i3 == Integer.MIN_VALUE) {
                        i74 = Math.min(i74, i4);
                    } else if (i3 != 0) {
                        i74 = i29;
                    }
                    this.C0 = i73;
                    this.D0 = i74;
                    P(i73);
                    M(i74);
                    if (this.u0 <= 0) {
                        z = c;
                    } else {
                        z = i29;
                    }
                    this.B0 = z;
                }
            } else {
                i7 = i22;
                iArr = iArr2;
                i9 = i20;
                i6 = i21;
                int i75 = this.Y0;
                if (i5 != 0) {
                    arrayList.clear();
                    ke2 ke2Var5 = new ke2(this, i75, this.I, this.J, this.K, this.L, i25);
                    arrayList.add(ke2Var5);
                    if (i75 == 0) {
                        i10 = 0;
                        int i76 = 0;
                        int i77 = 0;
                        while (i77 < i5) {
                            l21 l21Var13 = l21VarArr2[i77];
                            int Y4 = Y(l21Var13, i25);
                            if (l21Var13.T[0] == k21.MATCH_CONSTRAINT) {
                                i10++;
                            }
                            int i78 = i10;
                            if ((i76 == i25 || this.S0 + i76 + Y4 > i25) && ke2Var5.b != null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4 && i77 > 0 && (i12 = this.X0) > 0 && i77 % i12 == 0) {
                                z4 = true;
                            }
                            if (z4) {
                                ke2Var5 = new ke2(this, i75, this.I, this.J, this.K, this.L, i25);
                                ke2Var5.n = i77;
                                arrayList.add(ke2Var5);
                            } else if (i77 > 0) {
                                i76 = this.S0 + Y4 + i76;
                                ke2Var5.a(l21Var13);
                                i77++;
                                i10 = i78;
                            }
                            i76 = Y4;
                            ke2Var5.a(l21Var13);
                            i77++;
                            i10 = i78;
                        }
                    } else {
                        i10 = 0;
                        int i79 = 0;
                        int i80 = 0;
                        while (i80 < i5) {
                            l21 l21Var14 = l21VarArr2[i80];
                            int X4 = X(l21Var14, i25);
                            if (l21Var14.T[1] == k21.MATCH_CONSTRAINT) {
                                i10++;
                            }
                            int i81 = i10;
                            if ((i79 == i25 || this.T0 + i79 + X4 > i25) && ke2Var5.b != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2 && i80 > 0 && (i11 = this.X0) > 0 && i80 % i11 == 0) {
                                z2 = true;
                            }
                            if (z2) {
                                ke2Var5 = new ke2(this, i75, this.I, this.J, this.K, this.L, i25);
                                ke2Var5.n = i80;
                                arrayList.add(ke2Var5);
                            } else if (i80 > 0) {
                                i79 = this.T0 + X4 + i79;
                                ke2Var5.a(l21Var14);
                                i80++;
                                i10 = i81;
                            }
                            i79 = X4;
                            ke2Var5.a(l21Var14);
                            i80++;
                            i10 = i81;
                        }
                    }
                    int size2 = arrayList.size();
                    int i82 = this.z0;
                    int i83 = this.v0;
                    int i84 = this.A0;
                    int i85 = this.w0;
                    k21[] k21VarArr2 = this.T;
                    k21 k21Var4 = k21VarArr2[0];
                    k21 k21Var5 = k21.WRAP_CONTENT;
                    if (k21Var4 != k21Var5 && k21VarArr2[1] != k21Var5) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (i10 > 0 && z3) {
                        for (int i86 = 0; i86 < size2; i86++) {
                            ke2 ke2Var6 = (ke2) arrayList.get(i86);
                            if (i75 == 0) {
                                ke2Var6.e(i25 - ke2Var6.d());
                            } else {
                                ke2Var6.e(i25 - ke2Var6.c());
                            }
                        }
                    }
                    int i87 = i82;
                    int i88 = i83;
                    int i89 = i84;
                    int i90 = i85;
                    h11 h11Var11 = h11Var2;
                    h11 h11Var12 = h11Var;
                    int i91 = 0;
                    int i92 = 0;
                    h11 h11Var13 = h11Var3;
                    h11 h11Var14 = h11Var4;
                    for (int i93 = 0; i93 < size2; i93++) {
                        ke2 ke2Var7 = (ke2) arrayList.get(i93);
                        if (i75 == 0) {
                            if (i93 < size2 - 1) {
                                h11Var14 = ((ke2) arrayList.get(i93 + 1)).b.J;
                                i90 = 0;
                            } else {
                                i90 = this.w0;
                                h11Var14 = h11Var4;
                            }
                            h11 h11Var15 = ke2Var7.b.L;
                            ke2Var7.f(i75, h11Var11, h11Var12, h11Var13, h11Var14, i87, i88, i89, i90, i25);
                            i91 = Math.max(i91, ke2Var7.d());
                            int c3 = ke2Var7.c() + i92;
                            if (i93 > 0) {
                                c3 += this.T0;
                            }
                            i92 = c3;
                            h11Var12 = h11Var15;
                            i88 = 0;
                        } else {
                            if (i93 < size2 - 1) {
                                h11Var13 = ((ke2) arrayList.get(i93 + 1)).b.I;
                                i89 = 0;
                            } else {
                                i89 = this.A0;
                                h11Var13 = h11Var3;
                            }
                            h11 h11Var16 = ke2Var7.b.K;
                            ke2Var7.f(i75, h11Var11, h11Var12, h11Var13, h11Var14, i87, i88, i89, i90, i25);
                            int d2 = ke2Var7.d() + i91;
                            int max2 = Math.max(i92, ke2Var7.c());
                            if (i93 > 0) {
                                d2 += this.S0;
                            }
                            i92 = max2;
                            i91 = d2;
                            h11Var11 = h11Var16;
                            i87 = 0;
                        }
                    }
                    iArr[0] = i91;
                    iArr[1] = i92;
                }
            }
            c = 1;
            int i732 = iArr[i29] + i8 + i9;
            int i742 = iArr[c] + i6 + i7;
            if (i != 1073741824) {
            }
            if (i3 != 1073741824) {
            }
            this.C0 = i732;
            this.D0 = i742;
            P(i732);
            M(i742);
            if (this.u0 <= 0) {
            }
            this.B0 = z;
        }
        i6 = i21;
        i7 = i22;
        iArr = iArr2;
        i8 = i19;
        i9 = i20;
        int i94 = this.Y0;
        if (i5 != 0) {
            if (arrayList.size() == 0) {
                ke2Var = new ke2(this, i94, this.I, this.J, this.K, this.L, i25);
                arrayList.add(ke2Var);
            } else {
                ke2 ke2Var8 = (ke2) arrayList.get(0);
                ke2Var8.c = 0;
                ke2Var8.b = null;
                ke2Var8.l = 0;
                ke2Var8.m = 0;
                ke2Var8.n = 0;
                ke2Var8.o = 0;
                ke2Var8.p = 0;
                ke2Var8.f(i94, this.I, this.J, this.K, this.L, this.z0, this.v0, this.A0, this.w0, i25);
                ke2Var = ke2Var8;
            }
            for (int i95 = 0; i95 < i5; i95++) {
                ke2Var.a(l21VarArr2[i95]);
            }
            i29 = 0;
            iArr[0] = ke2Var.d();
            c = 1;
            iArr[1] = ke2Var.c();
            int i7322 = iArr[i29] + i8 + i9;
            int i7422 = iArr[c] + i6 + i7;
            if (i != 1073741824) {
            }
            if (i3 != 1073741824) {
            }
            this.C0 = i7322;
            this.D0 = i7422;
            P(i7322);
            M(i7422);
            if (this.u0 <= 0) {
            }
            this.B0 = z;
        }
        c = 1;
        int i73222 = iArr[i29] + i8 + i9;
        int i74222 = iArr[c] + i6 + i7;
        if (i != 1073741824) {
        }
        if (i3 != 1073741824) {
        }
        this.C0 = i73222;
        this.D0 = i74222;
        P(i73222);
        M(i74222);
        if (this.u0 <= 0) {
        }
        this.B0 = z;
    }

    public final int X(l21 l21Var, int i) {
        l21 l21Var2;
        if (l21Var == null) {
            return 0;
        }
        if (l21Var.T[1] == k21.MATCH_CONSTRAINT) {
            int i2 = l21Var.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (l21Var.z * i);
                if (i3 != l21Var.l()) {
                    l21Var.g = true;
                    W(l21Var, l21Var.T[0], l21Var.r(), k21.FIXED, i3);
                }
                return i3;
            }
            l21Var2 = l21Var;
            if (i2 == 1) {
                return l21Var2.l();
            }
            if (i2 == 3) {
                return (int) ((l21Var2.r() * l21Var2.X) + 0.5f);
            }
        } else {
            l21Var2 = l21Var;
        }
        return l21Var2.l();
    }

    public final int Y(l21 l21Var, int i) {
        l21 l21Var2;
        if (l21Var == null) {
            return 0;
        }
        if (l21Var.T[0] == k21.MATCH_CONSTRAINT) {
            int i2 = l21Var.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (l21Var.w * i);
                if (i3 != l21Var.r()) {
                    l21Var.g = true;
                    W(l21Var, k21.FIXED, i3, l21Var.T[1], l21Var.l());
                }
                return i3;
            }
            l21Var2 = l21Var;
            if (i2 == 1) {
                return l21Var2.r();
            }
            if (i2 == 3) {
                return (int) ((l21Var2.l() * l21Var2.X) + 0.5f);
            }
        } else {
            l21Var2 = l21Var;
        }
        return l21Var2.r();
    }

    @Override // defpackage.l21
    public final void b(jv3 jv3Var, boolean z) {
        boolean z2;
        boolean z3;
        l21 l21Var;
        float f;
        int i;
        boolean z4;
        super.b(jv3Var, z);
        l21 l21Var2 = this.U;
        if (l21Var2 != null && ((m21) l21Var2).y0) {
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
                            ke2 ke2Var = (ke2) arrayList.get(i3);
                            if (i3 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            ke2Var.b(i3, z2, z4);
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
                    l21 l21Var3 = null;
                    int i7 = 0;
                    while (i7 < i5) {
                        if (z2) {
                            i = (i5 - i7) - 1;
                            f = 1.0f - this.M0;
                        } else {
                            f = f2;
                            i = i7;
                        }
                        l21 l21Var4 = this.b1[i];
                        if (l21Var4 != null) {
                            h11 h11Var = l21Var4.I;
                            if (l21Var4.h0 != 8) {
                                if (i7 == 0) {
                                    l21Var4.f(h11Var, this.I, this.z0);
                                    l21Var4.k0 = this.G0;
                                    l21Var4.e0 = f;
                                }
                                if (i7 == i5 - 1) {
                                    l21Var4.f(l21Var4.K, this.K, this.A0);
                                }
                                if (i7 > 0 && l21Var3 != null) {
                                    h11 h11Var2 = l21Var3.K;
                                    l21Var4.f(h11Var, h11Var2, this.S0);
                                    l21Var3.f(h11Var2, h11Var, 0);
                                }
                                l21Var3 = l21Var4;
                            }
                        }
                        i7++;
                        f2 = f;
                    }
                    for (int i8 = 0; i8 < i6; i8++) {
                        l21 l21Var5 = this.a1[i8];
                        if (l21Var5 != null) {
                            h11 h11Var3 = l21Var5.J;
                            if (l21Var5.h0 != 8) {
                                if (i8 == 0) {
                                    l21Var5.f(h11Var3, this.J, this.v0);
                                    l21Var5.l0 = this.H0;
                                    l21Var5.f0 = this.N0;
                                }
                                if (i8 == i6 - 1) {
                                    l21Var5.f(l21Var5.L, this.L, this.w0);
                                }
                                if (i8 > 0 && l21Var3 != null) {
                                    h11 h11Var4 = l21Var3.L;
                                    l21Var5.f(h11Var3, h11Var4, this.T0);
                                    l21Var3.f(h11Var4, h11Var3, 0);
                                }
                                l21Var3 = l21Var5;
                            }
                        }
                    }
                    for (int i9 = 0; i9 < i5; i9++) {
                        for (int i10 = 0; i10 < i6; i10++) {
                            int i11 = (i10 * i5) + i9;
                            if (this.Y0 == 1) {
                                i11 = (i9 * i6) + i10;
                            }
                            l21[] l21VarArr = this.d1;
                            if (i11 < l21VarArr.length && (l21Var = l21VarArr[i11]) != null && l21Var.h0 != 8) {
                                l21 l21Var6 = this.b1[i9];
                                l21 l21Var7 = this.a1[i10];
                                if (l21Var != l21Var6) {
                                    l21Var.f(l21Var.I, l21Var6.I, 0);
                                    l21Var.f(l21Var.K, l21Var6.K, 0);
                                }
                                if (l21Var != l21Var7) {
                                    l21Var.f(l21Var.J, l21Var7.J, 0);
                                    l21Var.f(l21Var.L, l21Var7.L, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ke2 ke2Var2 = (ke2) arrayList.get(i12);
                    if (i12 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ke2Var2.b(i12, z2, z3);
                }
            }
        } else if (arrayList.size() > 0) {
            ((ke2) arrayList.get(0)).b(0, z2, true);
        }
        this.B0 = false;
    }

    @Override // defpackage.gx2, defpackage.l21
    public final void g(l21 l21Var, HashMap hashMap) {
        super.g(l21Var, hashMap);
        me2 me2Var = (me2) l21Var;
        this.G0 = me2Var.G0;
        this.H0 = me2Var.H0;
        this.I0 = me2Var.I0;
        this.J0 = me2Var.J0;
        this.K0 = me2Var.K0;
        this.L0 = me2Var.L0;
        this.M0 = me2Var.M0;
        this.N0 = me2Var.N0;
        this.O0 = me2Var.O0;
        this.P0 = me2Var.P0;
        this.Q0 = me2Var.Q0;
        this.R0 = me2Var.R0;
        this.S0 = me2Var.S0;
        this.T0 = me2Var.T0;
        this.U0 = me2Var.U0;
        this.V0 = me2Var.V0;
        this.W0 = me2Var.W0;
        this.X0 = me2Var.X0;
        this.Y0 = me2Var.Y0;
    }
}
