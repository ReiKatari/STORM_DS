package e5;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends p {

    /* renamed from: d1  reason: collision with root package name */
    public g[] f4358d1;
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

    /* renamed from: a1  reason: collision with root package name */
    public g[] f4355a1 = null;

    /* renamed from: b1  reason: collision with root package name */
    public g[] f4356b1 = null;

    /* renamed from: c1  reason: collision with root package name */
    public int[] f4357c1 = null;

    /* renamed from: e1  reason: collision with root package name */
    public int f4359e1 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06fa  */
    @Override // e5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(int r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.j.V(int, int, int, int):void");
    }

    public final int X(g gVar, int i2) {
        g gVar2;
        if (gVar == null) {
            return 0;
        }
        if (gVar.T[1] == f.MATCH_CONSTRAINT) {
            int i10 = gVar.f4322s;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (gVar.f4330z * i2);
                if (i11 != gVar.l()) {
                    gVar.f4300g = true;
                    W(gVar, gVar.T[0], gVar.r(), f.FIXED, i11);
                }
                return i11;
            }
            gVar2 = gVar;
            if (i10 == 1) {
                return gVar2.l();
            }
            if (i10 == 3) {
                return (int) ((gVar2.r() * gVar2.X) + 0.5f);
            }
        } else {
            gVar2 = gVar;
        }
        return gVar2.l();
    }

    public final int Y(g gVar, int i2) {
        g gVar2;
        if (gVar == null) {
            return 0;
        }
        if (gVar.T[0] == f.MATCH_CONSTRAINT) {
            int i10 = gVar.f4320r;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (gVar.f4327w * i2);
                if (i11 != gVar.r()) {
                    gVar.f4300g = true;
                    W(gVar, f.FIXED, i11, gVar.T[1], gVar.l());
                }
                return i11;
            }
            gVar2 = gVar;
            if (i10 == 1) {
                return gVar2.r();
            }
            if (i10 == 3) {
                return (int) ((gVar2.l() * gVar2.X) + 0.5f);
            }
        } else {
            gVar2 = gVar;
        }
        return gVar2.r();
    }

    @Override // e5.g
    public final void b(c5.c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        g gVar;
        float f8;
        int i2;
        boolean z13;
        super.b(cVar, z10);
        g gVar2 = this.U;
        if (gVar2 != null && ((h) gVar2).f4336y0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = this.W0;
        ArrayList arrayList = this.Z0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        int size = arrayList.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            i iVar = (i) arrayList.get(i11);
                            if (i11 == size - 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            iVar.b(i11, z11, z13);
                        }
                    }
                } else if (this.f4357c1 != null && this.f4356b1 != null && this.f4355a1 != null) {
                    for (int i12 = 0; i12 < this.f4359e1; i12++) {
                        this.f4358d1[i12].E();
                    }
                    int[] iArr = this.f4357c1;
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    float f10 = this.M0;
                    g gVar3 = null;
                    int i15 = 0;
                    while (i15 < i13) {
                        if (z11) {
                            i2 = (i13 - i15) - 1;
                            f8 = 1.0f - this.M0;
                        } else {
                            f8 = f10;
                            i2 = i15;
                        }
                        g gVar4 = this.f4356b1[i2];
                        if (gVar4 != null) {
                            d dVar = gVar4.I;
                            if (gVar4.f4303h0 != 8) {
                                if (i15 == 0) {
                                    gVar4.f(dVar, this.I, this.f4374z0);
                                    gVar4.f4309k0 = this.G0;
                                    gVar4.f4297e0 = f8;
                                }
                                if (i15 == i13 - 1) {
                                    gVar4.f(gVar4.K, this.K, this.A0);
                                }
                                if (i15 > 0 && gVar3 != null) {
                                    d dVar2 = gVar3.K;
                                    gVar4.f(dVar, dVar2, this.S0);
                                    gVar3.f(dVar2, dVar, 0);
                                }
                                gVar3 = gVar4;
                            }
                        }
                        i15++;
                        f10 = f8;
                    }
                    for (int i16 = 0; i16 < i14; i16++) {
                        g gVar5 = this.f4355a1[i16];
                        if (gVar5 != null) {
                            d dVar3 = gVar5.J;
                            if (gVar5.f4303h0 != 8) {
                                if (i16 == 0) {
                                    gVar5.f(dVar3, this.J, this.f4370v0);
                                    gVar5.f4311l0 = this.H0;
                                    gVar5.f4299f0 = this.N0;
                                }
                                if (i16 == i14 - 1) {
                                    gVar5.f(gVar5.L, this.L, this.f4371w0);
                                }
                                if (i16 > 0 && gVar3 != null) {
                                    d dVar4 = gVar3.L;
                                    gVar5.f(dVar3, dVar4, this.T0);
                                    gVar3.f(dVar4, dVar3, 0);
                                }
                                gVar3 = gVar5;
                            }
                        }
                    }
                    for (int i17 = 0; i17 < i13; i17++) {
                        for (int i18 = 0; i18 < i14; i18++) {
                            int i19 = (i18 * i13) + i17;
                            if (this.Y0 == 1) {
                                i19 = (i17 * i14) + i18;
                            }
                            g[] gVarArr = this.f4358d1;
                            if (i19 < gVarArr.length && (gVar = gVarArr[i19]) != null && gVar.f4303h0 != 8) {
                                g gVar6 = this.f4356b1[i17];
                                g gVar7 = this.f4355a1[i18];
                                if (gVar != gVar6) {
                                    gVar.f(gVar.I, gVar6.I, 0);
                                    gVar.f(gVar.K, gVar6.K, 0);
                                }
                                if (gVar != gVar7) {
                                    gVar.f(gVar.J, gVar7.J, 0);
                                    gVar.f(gVar.L, gVar7.L, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i20 = 0; i20 < size2; i20++) {
                    i iVar2 = (i) arrayList.get(i20);
                    if (i20 == size2 - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    iVar2.b(i20, z11, z12);
                }
            }
        } else if (arrayList.size() > 0) {
            ((i) arrayList.get(0)).b(0, z11, true);
        }
        this.B0 = false;
    }

    @Override // e5.m, e5.g
    public final void g(g gVar, HashMap hashMap) {
        super.g(gVar, hashMap);
        j jVar = (j) gVar;
        this.G0 = jVar.G0;
        this.H0 = jVar.H0;
        this.I0 = jVar.I0;
        this.J0 = jVar.J0;
        this.K0 = jVar.K0;
        this.L0 = jVar.L0;
        this.M0 = jVar.M0;
        this.N0 = jVar.N0;
        this.O0 = jVar.O0;
        this.P0 = jVar.P0;
        this.Q0 = jVar.Q0;
        this.R0 = jVar.R0;
        this.S0 = jVar.S0;
        this.T0 = jVar.T0;
        this.U0 = jVar.U0;
        this.V0 = jVar.V0;
        this.W0 = jVar.W0;
        this.X0 = jVar.X0;
        this.Y0 = jVar.Y0;
    }
}
