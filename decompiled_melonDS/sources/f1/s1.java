package f1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ s1(u1.s1 s1Var, y3.i1 i1Var, int i2) {
        this.A = 2;
        this.L = s1Var;
        this.R = i1Var;
        this.B = i2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        int i2;
        n2.u uVar;
        long[] jArr;
        n2.u uVar2;
        long[] jArr2;
        int i10;
        boolean z10;
        l4.o0 o0Var;
        switch (this.A) {
            case 0:
                u1 u1Var = (u1) this.L;
                y3.i1 i1Var = (y3.i1) this.R;
                y3.h1 h1Var = (y3.h1) obj;
                int g10 = u1Var.f4656i0.f4669a.g();
                if (g10 < 0) {
                    g10 = 0;
                }
                int i11 = this.B;
                if (g10 > i11) {
                    g10 = i11;
                }
                int i12 = -g10;
                boolean z11 = u1Var.f4657j0;
                if (z11) {
                    i2 = 0;
                } else {
                    i2 = i12;
                }
                if (!z11) {
                    i12 = 0;
                }
                h1Var.A = true;
                y3.h1.o(h1Var, i1Var, i2, i12);
                h1Var.A = false;
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                n2.p1 p1Var = (n2.p1) this.L;
                a1.d0 d0Var = (a1.d0) this.R;
                n2.u uVar3 = (n2.u) obj;
                int i13 = p1Var.f9984e;
                int i14 = this.B;
                if (i13 == i14 && nc.k.a(d0Var, p1Var.f9985f) && (uVar3 instanceof n2.y)) {
                    long[] jArr3 = d0Var.f32a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j2 = jArr3[i15];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i16 = 8;
                                int i17 = 8 - ((~(i15 - length)) >>> 31);
                                int i18 = 0;
                                while (i18 < i17) {
                                    if ((255 & j2) < 128) {
                                        int i19 = (i15 << 3) + i18;
                                        Object obj2 = d0Var.f33b[i19];
                                        if (d0Var.f34c[i19] != i14) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            i10 = i16;
                                            n2.y yVar = (n2.y) uVar3;
                                            uVar2 = uVar3;
                                            a1.m0 m0Var = yVar.Z;
                                            k0.d.E(m0Var, obj2, p1Var);
                                            jArr2 = jArr3;
                                            if (obj2 instanceof n2.e0) {
                                                n2.e0 e0Var = (n2.e0) obj2;
                                                if (!m0Var.c(e0Var)) {
                                                    k0.d.G(yVar.f10069d0, e0Var);
                                                }
                                                a1.m0 m0Var2 = p1Var.f9986g;
                                                if (m0Var2 != null) {
                                                    m0Var2.k(obj2);
                                                }
                                            }
                                        } else {
                                            uVar2 = uVar3;
                                            jArr2 = jArr3;
                                            i10 = i16;
                                        }
                                        if (z10) {
                                            d0Var.f(i19);
                                        }
                                    } else {
                                        uVar2 = uVar3;
                                        jArr2 = jArr3;
                                        i10 = i16;
                                    }
                                    j2 >>= i10;
                                    i18++;
                                    i16 = i10;
                                    uVar3 = uVar2;
                                    jArr3 = jArr2;
                                }
                                uVar = uVar3;
                                jArr = jArr3;
                                if (i17 != i16) {
                                }
                            } else {
                                uVar = uVar3;
                                jArr = jArr3;
                            }
                            if (i15 != length) {
                                i15++;
                                uVar3 = uVar;
                                jArr3 = jArr;
                            }
                        }
                    }
                }
                return yb.y.f14813a;
            default:
                u1.s1 s1Var = (u1.s1) this.L;
                y3.i1 i1Var2 = (y3.i1) this.R;
                y3.h1 h1Var2 = (y3.h1) obj;
                int i20 = s1Var.f13427b;
                u1.i1 i1Var3 = s1Var.f13426a;
                q4.e0 e0Var2 = s1Var.f13428c;
                u1.k1 k1Var = (u1.k1) s1Var.f13429d.b();
                if (k1Var != null) {
                    o0Var = k1Var.f13358a;
                } else {
                    o0Var = null;
                }
                i1Var3.a(h1.n1.Vertical, u1.l0.j(h1Var2, i20, e0Var2, o0Var, false, i1Var2.A), this.B, i1Var2.B);
                y3.h1.n(h1Var2, i1Var2, 0, Math.round(-i1Var3.f13332a.g()));
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ s1(Object obj, int i2, Object obj2, int i10) {
        this.A = i10;
        this.L = obj;
        this.B = i2;
        this.R = obj2;
    }
}
