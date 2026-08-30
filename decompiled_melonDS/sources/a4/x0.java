package a4;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class x0 extends y3.i1 implements y3.x0, k1 {
    public u0 Y;
    public mc.l Z;

    /* renamed from: b0  reason: collision with root package name */
    public g2 f359b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f360c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f361d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f362e0;

    /* renamed from: f0  reason: collision with root package name */
    public final y3.q0 f363f0 = new y3.q0(0, this);

    /* renamed from: g0  reason: collision with root package name */
    public k2 f364g0;

    /* renamed from: h0  reason: collision with root package name */
    public a1.m0 f365h0;

    public static void J0(r1 r1Var) {
        o0 o0Var;
        p0 p0Var;
        r1 r1Var2 = r1Var.f318l0;
        o0 o0Var2 = r1Var.f315i0;
        if (r1Var2 != null) {
            o0Var = r1Var2.f315i0;
        } else {
            o0Var = null;
        }
        if (!nc.k.a(o0Var, o0Var2)) {
            o0Var2.B0.f348p.f236r0.f();
            return;
        }
        b K = o0Var2.B0.f348p.K();
        if (K != null && (p0Var = ((i1) K).f236r0) != null) {
            p0Var.f();
        }
    }

    public abstract x0 B0();

    public abstract y3.z C0();

    public abstract boolean D0();

    public abstract o0 E0();

    public abstract y3.w0 F0();

    public abstract x0 G0();

    public abstract long H0();

    public final u0 I0() {
        u0 u0Var = this.Y;
        if (u0Var == null) {
            u0 u0Var2 = new u0(this);
            this.Y = u0Var2;
            return u0Var2;
        }
        return u0Var;
    }

    public final void K0(a1.n0 n0Var) {
        o0 o0Var;
        Object[] objArr = n0Var.f75b;
        long[] jArr = n0Var.f74a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128 && (o0Var = (o0) ((s2) objArr[(i2 << 3) + i11]).get()) != null) {
                            if (q()) {
                                o0Var.U(false);
                            } else {
                                o0Var.W(false);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void L0();

    @Override // y3.i1
    public final int i0(y3.q qVar) {
        int w02;
        if (!D0() || (w02 = w0(qVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return w02 + ((int) (this.X & 4294967295L));
    }

    @Override // y3.x0
    public final y3.w0 k0(int i2, int i10, Map map, mc.l lVar, mc.l lVar2) {
        if ((i2 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            x3.a.c("Size(" + i2 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new w0(i2, i10, map, lVar, lVar2, this, 0);
    }

    @Override // y3.v
    public boolean q() {
        return false;
    }

    @Override // a4.k1
    public final void s(boolean z10) {
        o0 o0Var;
        i0 i0Var;
        x0 G0 = G0();
        i0 i0Var2 = null;
        if (G0 != null) {
            o0Var = G0.E0();
        } else {
            o0Var = null;
        }
        if (nc.k.a(o0Var, E0())) {
            this.f360c0 = z10;
            return;
        }
        if (o0Var != null) {
            i0Var = o0Var.B0.f337d;
        } else {
            i0Var = null;
        }
        if (i0Var != i0.LayingOut) {
            if (o0Var != null) {
                i0Var2 = o0Var.B0.f337d;
            }
            if (i0Var2 != i0.LookaheadLayingOut) {
                return;
            }
        }
        this.f360c0 = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(a4.o0 r32, y3.s r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.x0.v0(a4.o0, y3.s):void");
    }

    public abstract int w0(y3.q qVar);

    public final void y0(g2 g2Var, long j2, long j10) {
        boolean z10;
        char c4;
        long j11;
        long j12;
        long j13;
        o0 o0Var;
        boolean z11;
        int i2;
        char c10;
        long j14;
        x0 x0Var;
        a1.n0 n0Var;
        e2 snapshotObserver;
        a1.m0 m0Var = this.f365h0;
        k2 k2Var = this.f364g0;
        if (k2Var == null) {
            k2Var = new k2();
            this.f364g0 = k2Var;
        }
        k2 k2Var2 = k2Var;
        c2 c2Var = E0().f286j0;
        if (c2Var != null && (snapshotObserver = ((b4.x) c2Var).getSnapshotObserver()) != null) {
            snapshotObserver.f194a.c(g2Var, e.R, new v0(this, j2, j10, g2Var));
        }
        boolean q10 = q();
        a1.n0 n0Var2 = (a1.n0) k2Var2.f252e;
        a1.n0 n0Var3 = (a1.n0) k2Var2.f253f;
        int i10 = k2Var2.f248a;
        for (int i11 = 0; i11 < i10; i11++) {
            byte b10 = ((byte[]) k2Var2.f251d)[i11];
            if (b10 == 3) {
                y3.s sVar = ((y3.s[]) k2Var2.f249b)[i11];
                sVar.getClass();
                n0Var3.k(sVar);
            } else if (b10 != 0 && m0Var != null) {
                y3.s sVar2 = ((y3.s[]) k2Var2.f249b)[i11];
                sVar2.getClass();
                a1.n0 n0Var4 = (a1.n0) m0Var.k(sVar2);
                if (n0Var4 != null) {
                    n0Var2.j(n0Var4);
                }
            }
        }
        int i12 = k2Var2.f248a;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            byte[] bArr = (byte[]) k2Var2.f251d;
            if (bArr[i14] == 2) {
                i13++;
            } else if (i13 > 0) {
                y3.s[] sVarArr = (y3.s[]) k2Var2.f249b;
                sVarArr[i14 - i13] = sVarArr[i14];
            }
            bArr[i14] = 2;
        }
        int i15 = k2Var2.f248a;
        for (int i16 = i15 - i13; i16 < i15; i16++) {
            ((y3.s[]) k2Var2.f249b)[i16] = null;
        }
        k2Var2.f248a -= i13;
        x0 G0 = G0();
        Object[] objArr = n0Var3.f75b;
        long[] jArr = n0Var3.f74a;
        int length = jArr.length - 2;
        char c11 = 7;
        long j15 = -9187201950435737472L;
        int i17 = 8;
        if (length >= 0) {
            j12 = 128;
            int i18 = 0;
            while (true) {
                long j16 = jArr[i18];
                j13 = 255;
                if ((((~j16) << c11) & j16 & j15) != j15) {
                    int i19 = 8 - ((~(i18 - length)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j16 & 255) < 128) {
                            c10 = c11;
                            y3.s sVar3 = (y3.s) objArr[(i18 << 3) + i20];
                            j14 = j15;
                            if (G0 == null) {
                                x0Var = this;
                            } else {
                                x0Var = G0;
                            }
                            i2 = i17;
                            x0 x0Var2 = x0Var;
                            while (true) {
                                k2 k2Var3 = x0Var2.f364g0;
                                if (k2Var3 != null) {
                                    z11 = q10;
                                    if (zb.k.d((y3.s[]) k2Var3.f249b, sVar3)) {
                                        break;
                                    }
                                } else {
                                    z11 = q10;
                                }
                                x0 G02 = x0Var2.G0();
                                if (G02 == null) {
                                    break;
                                }
                                x0Var2 = G02;
                                q10 = z11;
                            }
                            a1.m0 m0Var2 = x0Var2.f365h0;
                            if (m0Var2 != null) {
                                n0Var = (a1.n0) m0Var2.k(sVar3);
                            } else {
                                n0Var = null;
                            }
                            if (n0Var != null) {
                                x0Var.K0(n0Var);
                            }
                        } else {
                            z11 = q10;
                            i2 = i17;
                            c10 = c11;
                            j14 = j15;
                        }
                        j16 >>= i2;
                        i20++;
                        c11 = c10;
                        j15 = j14;
                        i17 = i2;
                        q10 = z11;
                    }
                    z10 = q10;
                    c4 = c11;
                    j11 = j15;
                    if (i19 != i17) {
                        break;
                    }
                } else {
                    z10 = q10;
                    c4 = c11;
                    j11 = j15;
                }
                if (i18 == length) {
                    break;
                }
                i18++;
                c11 = c4;
                j15 = j11;
                q10 = z10;
                i17 = 8;
            }
        } else {
            z10 = q10;
            c4 = 7;
            j11 = -9187201950435737472L;
            j12 = 128;
            j13 = 255;
        }
        n0Var3.b();
        Object[] objArr2 = n0Var2.f75b;
        long[] jArr2 = n0Var2.f74a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i21 = 0;
            while (true) {
                long j17 = jArr2[i21];
                if ((((~j17) << c4) & j17 & j11) != j11) {
                    int i22 = 8 - ((~(i21 - length2)) >>> 31);
                    for (int i23 = 0; i23 < i22; i23++) {
                        if ((j17 & j13) < j12 && (o0Var = (o0) ((s2) objArr2[(i21 << 3) + i23]).get()) != null) {
                            if (z10) {
                                o0Var.U(false);
                            } else {
                                o0Var.W(false);
                            }
                        }
                        j17 >>= 8;
                    }
                    if (i22 != 8) {
                        break;
                    }
                }
                if (i21 == length2) {
                    break;
                }
                i21++;
            }
        }
        n0Var2.b();
    }

    public final void z0(y3.w0 w0Var) {
        boolean z10;
        long j2;
        long j10;
        a1.m0 m0Var = this.f365h0;
        if (!this.f362e0) {
            mc.l e6 = w0Var.e();
            boolean z11 = false;
            if (e6 == null) {
                if (m0Var != null) {
                    Object[] objArr = m0Var.f69c;
                    long[] jArr = m0Var.f67a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j11 = jArr[i2];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if ((255 & j11) < 128) {
                                        K0((a1.n0) objArr[(i2 << 3) + i11]);
                                    }
                                    j11 >>= 8;
                                }
                                if (i10 != 8) {
                                    break;
                                }
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        }
                    }
                    m0Var.a();
                }
            } else {
                if (this.Z != e6) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && I0().A) {
                    y3.z C0 = C0();
                    long u4 = p7.n.u(C0.a(0L));
                    long Z = C0.Z();
                    j10 = u4;
                    j2 = Z;
                    z10 = (x4.j.a(u4, I0().B) && x4.l.b(Z, I0().L)) ? true : true;
                } else {
                    j2 = 0;
                    j10 = 9223372034707292159L;
                }
                if (z10) {
                    g2 g2Var = this.f359b0;
                    if (g2Var != null) {
                        g2Var.A = w0Var;
                    } else {
                        g2Var = new g2(w0Var, this);
                        this.f359b0 = g2Var;
                    }
                    y0(g2Var, j10, j2);
                    this.Z = w0Var.e();
                }
            }
        }
    }
}
