package a4;

import android.os.Build;
import android.view.ViewParent;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class r1 extends x0 implements y3.u0, y3.z, d2 {
    public static final i3.k0 I0 = new i3.k0();
    public static final y J0 = new y();
    public static final float[] K0 = i3.e0.a();
    public static final o1 L0 = new o1(0);
    public static final o1 M0 = new o1(1);
    public boolean A0;
    public boolean B0;
    public l3.b C0;
    public i3.q D0;
    public p1 E0;
    public boolean G0;
    public b2 H0;

    /* renamed from: i0  reason: collision with root package name */
    public final o0 f315i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f316j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f317k0;

    /* renamed from: l0  reason: collision with root package name */
    public r1 f318l0;

    /* renamed from: m0  reason: collision with root package name */
    public r1 f319m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f320n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f321o0;
    public mc.l p0;

    /* renamed from: q0  reason: collision with root package name */
    public x4.c f322q0;

    /* renamed from: r0  reason: collision with root package name */
    public x4.m f323r0;

    /* renamed from: t0  reason: collision with root package name */
    public y3.w0 f325t0;

    /* renamed from: u0  reason: collision with root package name */
    public a1.d0 f326u0;

    /* renamed from: w0  reason: collision with root package name */
    public float f328w0;

    /* renamed from: x0  reason: collision with root package name */
    public h3.a f329x0;

    /* renamed from: y0  reason: collision with root package name */
    public y f330y0;

    /* renamed from: s0  reason: collision with root package name */
    public float f324s0 = 0.8f;

    /* renamed from: v0  reason: collision with root package name */
    public long f327v0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public i3.n0 f331z0 = i3.z.f6703b;
    public final q1 F0 = new q1(this, 1);

    public r1(o0 o0Var) {
        this.f315i0 = o0Var;
        this.f322q0 = o0Var.f295t0;
        this.f323r0 = o0Var.f296u0;
    }

    public static r1 r1(y3.z zVar) {
        y3.r0 r0Var;
        r1 r1Var;
        if (zVar instanceof y3.r0) {
            r0Var = (y3.r0) zVar;
        } else {
            r0Var = null;
        }
        if (r0Var != null && (r1Var = r0Var.A.f371i0) != null) {
            return r1Var;
        }
        zVar.getClass();
        return (r1) zVar;
    }

    @Override // a4.x0
    public final x0 B0() {
        return this.f318l0;
    }

    @Override // y3.z
    public final long C(y3.z zVar, long j2) {
        return F(zVar, j2, true);
    }

    @Override // a4.x0
    public final boolean D0() {
        if (this.f325t0 != null) {
            return true;
        }
        return false;
    }

    @Override // a4.x0
    public final o0 E0() {
        return this.f315i0;
    }

    @Override // y3.z
    public final long F(y3.z zVar, long j2, boolean z10) {
        if (zVar instanceof y3.r0) {
            y3.r0 r0Var = (y3.r0) zVar;
            r0Var.A.f371i0.g1();
            return r0Var.F(this, j2 ^ (-9223372034707292160L), z10) ^ (-9223372034707292160L);
        }
        r1 r12 = r1(zVar);
        r12.g1();
        r1 T0 = T0(r12);
        while (r12 != T0) {
            b2 b2Var = r12.H0;
            if (b2Var != null) {
                b4.y1 y1Var = (b4.y1) b2Var;
                float[] b10 = y1Var.b();
                if (!y1Var.f2025m0) {
                    j2 = i3.e0.b(j2, b10);
                }
            }
            if (z10 || !r12.f360c0) {
                j2 = p7.n.p(j2, r12.f327v0);
            }
            r12 = r12.f319m0;
            r12.getClass();
        }
        return N0(T0, j2, z10);
    }

    @Override // a4.x0
    public final y3.w0 F0() {
        y3.w0 w0Var = this.f325t0;
        if (w0Var != null) {
            return w0Var;
        }
        a0.j.p("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // a4.x0
    public final x0 G0() {
        return this.f319m0;
    }

    @Override // a4.x0
    public final long H0() {
        return this.f327v0;
    }

    @Override // a4.x0
    public final void L0() {
        q0(this.f327v0, this.f328w0, this.p0);
    }

    public final void M0(r1 r1Var, h3.a aVar, boolean z10) {
        if (r1Var != this) {
            r1 r1Var2 = this.f319m0;
            if (r1Var2 != null) {
                r1Var2.M0(r1Var, aVar, z10);
            }
            long j2 = this.f327v0;
            float f8 = (int) (j2 >> 32);
            aVar.f6046b -= f8;
            aVar.f6048d -= f8;
            float f10 = (int) (j2 & 4294967295L);
            aVar.f6047c -= f10;
            aVar.f6049e -= f10;
            b2 b2Var = this.H0;
            if (b2Var != null) {
                b4.y1 y1Var = (b4.y1) b2Var;
                float[] a10 = y1Var.a();
                if (!y1Var.f2025m0) {
                    if (a10 == null) {
                        aVar.f6046b = 0.0f;
                        aVar.f6047c = 0.0f;
                        aVar.f6048d = 0.0f;
                        aVar.f6049e = 0.0f;
                    } else {
                        i3.e0.c(a10, aVar);
                    }
                }
                if (this.f321o0 && z10) {
                    long j10 = this.L;
                    aVar.e(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                }
            }
        }
    }

    public final long N0(r1 r1Var, long j2, boolean z10) {
        if (r1Var == this) {
            return j2;
        }
        r1 r1Var2 = this.f319m0;
        if (r1Var2 != null && !nc.k.a(r1Var, r1Var2)) {
            return U0(r1Var2.N0(r1Var, j2, z10), z10);
        }
        return U0(j2, z10);
    }

    public final long O0(long j2) {
        float max = Math.max(0.0f, (Float.intBitsToFloat((int) (j2 >> 32)) - n0()) / 2.0f);
        return (Float.floatToRawIntBits(Math.max(0.0f, (Float.intBitsToFloat((int) (j2 & 4294967295L)) - j0()) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final float P0(long j2, long j10) {
        float n02;
        float j02;
        if (n0() >= Float.intBitsToFloat((int) (j10 >> 32)) && j0() >= Float.intBitsToFloat((int) (j10 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long O0 = O0(j10);
        float intBitsToFloat = Float.intBitsToFloat((int) (O0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (O0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (intBitsToFloat3 < 0.0f) {
            n02 = -intBitsToFloat3;
        } else {
            n02 = intBitsToFloat3 - n0();
        }
        float max = Math.max(0.0f, n02);
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        if (intBitsToFloat4 < 0.0f) {
            j02 = -intBitsToFloat4;
        } else {
            j02 = intBitsToFloat4 - j0();
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, j02)) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i2 = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i2) <= intBitsToFloat) {
                int i10 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i10) <= intBitsToFloat2) {
                    float intBitsToFloat5 = Float.intBitsToFloat(i2);
                    float intBitsToFloat6 = Float.intBitsToFloat(i10);
                    return (intBitsToFloat6 * intBitsToFloat6) + (intBitsToFloat5 * intBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // y3.z
    public final long Q(long j2) {
        if (!X0().f1777h0) {
            x3.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return F(y3.c0.i(this), ((b4.x) s0.a(this.f315i0)).C(j2), true);
    }

    public final void Q0(i3.q qVar, l3.b bVar) {
        boolean z10;
        b2 b2Var = this.H0;
        if (b2Var != null) {
            b4.y1 y1Var = (b4.y1) b2Var;
            k3.b bVar2 = y1Var.f2019g0;
            y1Var.g();
            if (y1Var.A.f8682a.F() > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            y1Var.f2026n0 = z10;
            n nVar = bVar2.B;
            nVar.G(qVar);
            nVar.L = bVar;
            k0.d.t(bVar2, y1Var.A);
            return;
        }
        long j2 = this.f327v0;
        float f8 = (int) (j2 >> 32);
        float f10 = (int) (j2 & 4294967295L);
        qVar.k(f8, f10);
        R0(qVar, bVar);
        qVar.k(-f8, -f10);
    }

    public final void R0(i3.q qVar, l3.b bVar) {
        i3.q qVar2;
        l3.b bVar2;
        b3.o Y0 = Y0(4);
        if (Y0 == null) {
            m1(qVar, bVar);
            return;
        }
        o0 o0Var = this.f315i0;
        o0Var.getClass();
        r0 sharedDrawScope = ((b4.x) s0.a(o0Var)).getSharedDrawScope();
        long T = zb.k.T(this.L);
        sharedDrawScope.getClass();
        p2.b bVar3 = null;
        while (Y0 != null) {
            if (Y0 instanceof p) {
                qVar2 = qVar;
                bVar2 = bVar;
                sharedDrawScope.d(qVar2, T, this, (p) Y0, bVar2);
            } else {
                qVar2 = qVar;
                bVar2 = bVar;
                if ((Y0.L & 4) != 0 && (Y0 instanceof k)) {
                    int i2 = 0;
                    for (b3.o oVar = ((k) Y0).f247j0; oVar != null; oVar = oVar.Y) {
                        if ((oVar.L & 4) != 0) {
                            i2++;
                            if (i2 == 1) {
                                Y0 = oVar;
                            } else {
                                if (bVar3 == null) {
                                    bVar3 = new p2.b(new b3.o[16]);
                                }
                                if (Y0 != null) {
                                    bVar3.b(Y0);
                                    Y0 = null;
                                }
                                bVar3.b(oVar);
                            }
                        }
                    }
                    if (i2 == 1) {
                        qVar = qVar2;
                        bVar = bVar2;
                    }
                }
            }
            Y0 = l.e(bVar3);
            qVar = qVar2;
            bVar = bVar2;
        }
    }

    public abstract void S0();

    public final r1 T0(r1 r1Var) {
        o0 o0Var = r1Var.f315i0;
        o0 o0Var2 = this.f315i0;
        if (o0Var == o0Var2) {
            b3.o X0 = r1Var.X0();
            b3.o X02 = X0();
            if (!X02.A.f1777h0) {
                x3.a.c("visitLocalAncestors called on an unattached node");
            }
            for (b3.o oVar = X02.A.X; oVar != null; oVar = oVar.X) {
                if ((oVar.L & 2) != 0 && oVar == X0) {
                    return r1Var;
                }
            }
            return this;
        }
        while (o0Var.f287k0 > o0Var2.f287k0) {
            o0Var = o0Var.u();
            o0Var.getClass();
        }
        o0 o0Var3 = o0Var2;
        while (o0Var3.f287k0 > o0Var.f287k0) {
            o0Var3 = o0Var3.u();
            o0Var3.getClass();
        }
        while (o0Var != o0Var3) {
            o0Var = o0Var.u();
            o0Var3 = o0Var3.u();
            if (o0Var != null) {
                if (o0Var3 == null) {
                }
            }
            a0.j.h("layouts are not part of the same hierarchy");
            return null;
        }
        if (o0Var3 != o0Var2) {
            if (o0Var != r1Var.f315i0) {
                return o0Var.A0.f265c;
            }
            return r1Var;
        }
        return this;
    }

    @Override // y3.z
    public final boolean U() {
        return X0().f1777h0;
    }

    public final long U0(long j2, boolean z10) {
        if (z10 || !this.f360c0) {
            long j10 = this.f327v0;
            j2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) - ((int) (j10 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) - ((int) (j10 >> 32))) << 32);
        }
        b2 b2Var = this.H0;
        if (b2Var != null) {
            b4.y1 y1Var = (b4.y1) b2Var;
            float[] a10 = y1Var.a();
            if (a10 == null) {
                return 9187343241974906880L;
            }
            if (!y1Var.f2025m0) {
                return i3.e0.b(j2, a10);
            }
            return j2;
        }
        return j2;
    }

    @Override // y3.z
    public final void V(float[] fArr) {
        c2 a10 = s0.a(this.f315i0);
        r1 r12 = r1(y3.c0.i(this));
        u1(r12, fArr);
        if (a10 instanceof b4.x) {
            ((b4.x) a10).p(fArr);
            return;
        }
        long a11 = r12.a(0L);
        if ((9223372034707292159L & a11) != 9205357640488583168L) {
            i3.e0.f(fArr, Float.intBitsToFloat((int) (a11 >> 32)), Float.intBitsToFloat((int) (a11 & 4294967295L)));
        }
    }

    public abstract y0 V0();

    public final long W0() {
        return this.f322q0.W(this.f315i0.f297v0.g());
    }

    public abstract b3.o X0();

    public final b3.o Y0(int i2) {
        boolean g10 = s1.g(i2);
        b3.o X0 = X0();
        if (g10 || (X0 = X0.X) != null) {
            for (b3.o Z0 = Z0(g10); Z0 != null && (Z0.R & i2) != 0; Z0 = Z0.Y) {
                if ((Z0.L & i2) != 0) {
                    return Z0;
                }
                if (Z0 == X0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // y3.z
    public final long Z() {
        return this.L;
    }

    public final b3.o Z0(boolean z10) {
        b3.o X0;
        n1 n1Var = this.f315i0.A0;
        if (n1Var.f266d == this) {
            return n1Var.f268f;
        }
        r1 r1Var = this.f319m0;
        if (z10) {
            if (r1Var != null && (X0 = r1Var.X0()) != null) {
                return X0.Y;
            }
            return null;
        } else if (r1Var != null) {
            return r1Var.X0();
        } else {
            return null;
        }
    }

    @Override // y3.z
    public final long a(long j2) {
        if (!X0().f1777h0) {
            x3.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((b4.x) s0.a(this.f315i0)).q(a0(j2));
    }

    @Override // y3.z
    public final long a0(long j2) {
        if (!X0().f1777h0) {
            x3.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        g1();
        for (r1 r1Var = this; r1Var != null; r1Var = r1Var.f319m0) {
            o0 o0Var = r1Var.f315i0;
            if (r1Var == o0Var.A0.f266d && !o0Var.L) {
                long b10 = ((b4.x) s0.a(o0Var)).getRectManager().b(o0Var);
                if (!x4.j.a(b10, 9223372034707292159L)) {
                    return p7.n.p(j2, b10);
                }
            }
            b2 b2Var = r1Var.H0;
            if (b2Var != null) {
                b4.y1 y1Var = (b4.y1) b2Var;
                float[] b11 = y1Var.b();
                if (!y1Var.f2025m0) {
                    j2 = i3.e0.b(j2, b11);
                }
            }
            j2 = p7.n.p(j2, r1Var.f327v0);
        }
        return j2;
    }

    public final void a1(b3.o oVar, o1 o1Var, long j2, t tVar, int i2, boolean z10) {
        if (oVar == null) {
            d1(o1Var, j2, tVar, i2, z10);
            return;
        }
        int i10 = tVar.L;
        a1.h0 h0Var = tVar.A;
        tVar.b(i10 + 1, h0Var.f45b);
        tVar.L++;
        h0Var.a(oVar);
        tVar.B.a(l.a(-1.0f, z10, false));
        a1(l.d(oVar, o1Var.b()), o1Var, j2, tVar, i2, z10);
        tVar.L = i10;
    }

    @Override // x4.c
    public final float b() {
        return this.f315i0.f295t0.b();
    }

    public final void b1(b3.o oVar, o1 o1Var, long j2, t tVar, int i2, boolean z10, float f8) {
        if (oVar == null) {
            d1(o1Var, j2, tVar, i2, z10);
            return;
        }
        int i10 = tVar.L;
        a1.h0 h0Var = tVar.A;
        tVar.b(i10 + 1, h0Var.f45b);
        tVar.L++;
        h0Var.a(oVar);
        tVar.B.a(l.a(f8, z10, false));
        l1(l.d(oVar, o1Var.b()), o1Var, j2, tVar, i2, z10, f8, true);
        tVar.L = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
        if (a4.l.g(r18.a(), a4.l.a(r2, r7, false)) > 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c1(a4.o1 r15, long r16, a4.t r18, int r19, boolean r20) {
        /*
            r14 = this;
            r3 = r16
            r5 = r18
            r6 = r19
            int r0 = r15.b()
            b3.o r1 = r14.Y0(r0)
            boolean r0 = r14.x1(r3)
            r8 = 0
            r9 = 2139095040(0x7f800000, float:Infinity)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 1
            if (r0 != 0) goto L4c
            if (r6 != r11) goto L4b
            long r12 = r14.W0()
            float r0 = r14.P0(r3, r12)
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            r2 = r2 & r10
            if (r2 >= r9) goto L4b
            int r2 = r5.L
            a1.h0 r7 = r5.A
            int r7 = r7.f45b
            int r7 = r7 - r11
            if (r2 != r7) goto L36
            goto L44
        L36:
            long r7 = a4.l.a(r0, r8, r8)
            long r9 = r5.a()
            int r2 = a4.l.g(r9, r7)
            if (r2 <= 0) goto L4b
        L44:
            r7 = 0
            r2 = r15
            r8 = r0
            r0 = r14
            r0.b1(r1, r2, r3, r5, r6, r7, r8)
        L4b:
            return
        L4c:
            if (r1 != 0) goto L52
            r14.d1(r15, r16, r18, r19, r20)
            return
        L52:
            r0 = 32
            long r2 = r16 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r16 & r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L90
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L90
            int r3 = r14.n0()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L90
            int r0 = r14.j0()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L90
            r0 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.a1(r1, r2, r3, r5, r6, r7)
            return
        L90:
            r3 = r16
            r5 = r18
            r6 = r19
            if (r6 != r11) goto La1
            long r12 = r14.W0()
            float r2 = r14.P0(r3, r12)
            goto La3
        La1:
            r2 = 2139095040(0x7f800000, float:Infinity)
        La3:
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            r7 = r7 & r10
            if (r7 >= r9) goto Lcb
            int r7 = r5.L
            a1.h0 r9 = r5.A
            int r9 = r9.f45b
            int r9 = r9 - r11
            if (r7 != r9) goto Lb6
            r7 = r20
            goto Lc6
        Lb6:
            r7 = r20
            long r9 = a4.l.a(r2, r7, r8)
            long r12 = r5.a()
            int r9 = a4.l.g(r12, r9)
            if (r9 <= 0) goto Lcd
        Lc6:
            r9 = r11
        Lc7:
            r0 = r14
            r8 = r2
            r2 = r15
            goto Lcf
        Lcb:
            r7 = r20
        Lcd:
            r9 = r8
            goto Lc7
        Lcf:
            r0.l1(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.r1.c1(a4.o1, long, a4.t, int, boolean):void");
    }

    public void d1(o1 o1Var, long j2, t tVar, int i2, boolean z10) {
        r1 r1Var = this.f318l0;
        if (r1Var != null) {
            r1Var.c1(o1Var, r1Var.U0(j2, true), tVar, i2, z10);
        }
    }

    public final void e1() {
        b2 b2Var = this.H0;
        if (b2Var != null) {
            ((b4.y1) b2Var).c();
            return;
        }
        r1 r1Var = this.f319m0;
        if (r1Var != null) {
            r1Var.e1();
        }
    }

    public final boolean f1() {
        if (this.H0 != null && this.f324s0 <= 0.0f) {
            return true;
        }
        r1 r1Var = this.f319m0;
        if (r1Var != null) {
            return r1Var.f1();
        }
        return false;
    }

    public final void g1() {
        this.f315i0.B0.b();
    }

    @Override // y3.v
    public final x4.m getLayoutDirection() {
        return this.f315i0.f296u0;
    }

    @Override // y3.z
    public final long h(long j2) {
        if (!X0().f1777h0) {
            x3.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        y3.z i2 = y3.c0.i(this);
        b4.x xVar = (b4.x) s0.a(this.f315i0);
        xVar.y();
        return F(i2, h3.b.d(i3.e0.b(j2, xVar.V0), i2.a0(0L)), true);
    }

    public final void h1() {
        mc.l lVar;
        b3.o oVar;
        boolean g10 = s1.g(128);
        b3.o Z0 = Z0(g10);
        if (Z0 != null && (Z0.A.R & 128) != 0) {
            z2.f e6 = z2.q.e();
            if (e6 != null) {
                lVar = e6.e();
            } else {
                lVar = null;
            }
            z2.f h2 = z2.q.h(e6);
            try {
                if (g10) {
                    oVar = X0();
                } else {
                    oVar = X0().X;
                    if (oVar == null) {
                    }
                }
                for (b3.o Z02 = Z0(g10); Z02 != null; Z02 = Z02.Y) {
                    if ((Z02.R & 128) == 0) {
                        break;
                    }
                    if ((Z02.L & 128) != 0) {
                        b3.o oVar2 = Z02;
                        p2.b bVar = null;
                        while (oVar2 != null) {
                            if (oVar2 instanceof z) {
                                ((z) oVar2).o(this.L);
                            } else if ((oVar2.L & 128) != 0 && (oVar2 instanceof k)) {
                                int i2 = 0;
                                for (b3.o oVar3 = ((k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                    if ((oVar3.L & 128) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            oVar2 = oVar3;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new p2.b(new b3.o[16]);
                                            }
                                            if (oVar2 != null) {
                                                bVar.b(oVar2);
                                                oVar2 = null;
                                            }
                                            bVar.b(oVar3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            oVar2 = l.e(bVar);
                        }
                    }
                    if (Z02 == oVar) {
                        break;
                    }
                }
            } finally {
                z2.q.k(e6, h2, lVar);
            }
        }
    }

    public final void i1() {
        boolean g10 = s1.g(4194304);
        b3.o X0 = X0();
        if (g10 || (X0 = X0.X) != null) {
            for (b3.o Z0 = Z0(g10); Z0 != null && (Z0.R & 4194304) != 0; Z0 = Z0.Y) {
                if ((Z0.L & 4194304) != 0) {
                    b3.o oVar = Z0;
                    p2.b bVar = null;
                    while (oVar != null) {
                        if (oVar instanceof z) {
                            ((z) oVar).s(this);
                        } else if ((oVar.L & 4194304) != 0 && (oVar instanceof k)) {
                            int i2 = 0;
                            for (b3.o oVar2 = ((k) oVar).f247j0; oVar2 != null; oVar2 = oVar2.Y) {
                                if ((oVar2.L & 4194304) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        oVar = oVar2;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new p2.b(new b3.o[16]);
                                        }
                                        if (oVar != null) {
                                            bVar.b(oVar);
                                            oVar = null;
                                        }
                                        bVar.b(oVar2);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        oVar = l.e(bVar);
                    }
                }
                if (Z0 == X0) {
                    return;
                }
            }
        }
    }

    @Override // x4.c
    public final float j() {
        return this.f315i0.f295t0.j();
    }

    public final void j1() {
        this.f320n0 = true;
        this.F0.b();
        p1();
        if (!x4.j.a(this.f327v0, 0L)) {
            this.f315i0.N();
        }
    }

    @Override // y3.z
    public final h3.c k(y3.z zVar, boolean z10) {
        if (!X0().f1777h0) {
            x3.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!zVar.U()) {
            x3.a.c("LayoutCoordinates " + zVar + " is not attached!");
        }
        r1 r12 = r1(zVar);
        r12.g1();
        r1 T0 = T0(r12);
        h3.a aVar = this.f329x0;
        if (aVar == null) {
            aVar = new h3.a();
            this.f329x0 = aVar;
        }
        aVar.f6046b = 0.0f;
        aVar.f6047c = 0.0f;
        aVar.f6048d = (int) (zVar.Z() >> 32);
        aVar.f6049e = (int) (zVar.Z() & 4294967295L);
        while (r12 != T0) {
            r12.o1(aVar, z10, false);
            if (aVar.f()) {
                return h3.c.f6051e;
            }
            r12 = r12.f319m0;
            r12.getClass();
        }
        M0(T0, aVar, z10);
        return new h3.c(aVar.f6046b, aVar.f6047c, aVar.f6048d, aVar.f6049e);
    }

    public final void k1() {
        boolean g10 = s1.g(1048576);
        b3.o Z0 = Z0(g10);
        if (Z0 != null && (Z0.A.R & 1048576) != 0) {
            b3.o X0 = X0();
            if (g10 || (X0 = X0.X) != null) {
                for (b3.o Z02 = Z0(g10); Z02 != null && (Z02.R & 1048576) != 0; Z02 = Z02.Y) {
                    if ((Z02.L & 1048576) != 0) {
                        b3.o oVar = Z02;
                        p2.b bVar = null;
                        while (oVar != null) {
                            if ((oVar.L & 1048576) != 0 && (oVar instanceof k)) {
                                int i2 = 0;
                                for (b3.o oVar2 = ((k) oVar).f247j0; oVar2 != null; oVar2 = oVar2.Y) {
                                    if ((oVar2.L & 1048576) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            oVar = oVar2;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new p2.b(new b3.o[16]);
                                            }
                                            if (oVar != null) {
                                                bVar.b(oVar);
                                                oVar = null;
                                            }
                                            bVar.b(oVar2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            oVar = l.e(bVar);
                        }
                    }
                    if (Z02 == X0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // y3.z
    public final long l(long j2) {
        long a02 = a0(j2);
        b4.x xVar = (b4.x) s0.a(this.f315i0);
        xVar.y();
        return i3.e0.b(a02, xVar.U0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l1(b3.o r22, a4.o1 r23, long r24, a4.t r26, int r27, boolean r28, float r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.r1.l1(b3.o, a4.o1, long, a4.t, int, boolean, float, boolean):void");
    }

    public abstract void m1(i3.q qVar, l3.b bVar);

    @Override // y3.i1, y3.u0
    public final Object n() {
        o0 o0Var = this.f315i0;
        if (!o0Var.A0.d(64)) {
            return null;
        }
        X0();
        Object obj = null;
        for (b3.o oVar = o0Var.A0.f267e; oVar != null; oVar = oVar.X) {
            if ((oVar.L & 64) != 0) {
                b3.o oVar2 = oVar;
                p2.b bVar = null;
                while (oVar2 != null) {
                    if (oVar2 instanceof f2) {
                        obj = ((f2) oVar2).z0(o0Var.f295t0, obj);
                    } else if ((oVar2.L & 64) != 0 && (oVar2 instanceof k)) {
                        int i2 = 0;
                        for (b3.o oVar3 = ((k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                            if ((oVar3.L & 64) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    oVar2 = oVar3;
                                } else {
                                    if (bVar == null) {
                                        bVar = new p2.b(new b3.o[16]);
                                    }
                                    if (oVar2 != null) {
                                        bVar.b(oVar2);
                                        oVar2 = null;
                                    }
                                    bVar.b(oVar3);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    oVar2 = l.e(bVar);
                }
            }
        }
        return obj;
    }

    public final void n1(long j2, float f8, mc.l lVar) {
        v1(lVar, false);
        boolean a10 = x4.j.a(this.f327v0, j2);
        o0 o0Var = this.f315i0;
        if (!a10) {
            ((b4.x) s0.a(o0Var)).I(-4.0f);
            this.f327v0 = j2;
            o0Var.B0.f348p.z0();
            b2 b2Var = this.H0;
            if (b2Var != null) {
                ((b4.y1) b2Var).d(j2);
            } else {
                r1 r1Var = this.f319m0;
                if (r1Var != null) {
                    r1Var.e1();
                }
            }
            o0Var.N();
            x0.J0(this);
            c2 c2Var = o0Var.f286j0;
            if (c2Var != null) {
                ((b4.x) c2Var).u(o0Var);
            }
        }
        this.f328w0 = f8;
        if (this == o0Var.A0.f266d) {
            ((b4.x) s0.a(o0Var)).getRectManager().f(o0Var, false);
        }
        if (!this.f362e0) {
            z0(F0());
        }
    }

    @Override // y3.z
    public final y3.z o() {
        boolean z10 = X0().f1777h0;
        o0 o0Var = this.f315i0;
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (o0 o0Var2 = o0Var; o0Var2 != null; o0Var2 = o0Var2.u()) {
                sb2.append("\n|");
                sb2.append(o0Var2);
                sb2.append(" isAttached=");
                sb2.append(o0Var2.H());
                sb2.append(" modifier=");
                sb2.append(o0Var2.F0);
                sb2.append(" tail=");
                sb2.append(X0());
            }
            x3.a.c(sb2.toString());
        }
        g1();
        return o0Var.A0.f266d.f319m0;
    }

    public final void o1(h3.a aVar, boolean z10, boolean z11) {
        b2 b2Var = this.H0;
        if (b2Var != null) {
            if (this.f321o0) {
                if (z11) {
                    long W0 = W0();
                    float intBitsToFloat = Float.intBitsToFloat((int) (W0 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (W0 & 4294967295L)) / 2.0f;
                    long j2 = this.L;
                    aVar.e(-intBitsToFloat, -intBitsToFloat2, ((int) (j2 >> 32)) + intBitsToFloat, ((int) (j2 & 4294967295L)) + intBitsToFloat2);
                } else if (z10) {
                    long j10 = this.L;
                    aVar.e(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                }
                if (aVar.f()) {
                    return;
                }
            }
            b4.y1 y1Var = (b4.y1) b2Var;
            float[] b10 = y1Var.b();
            if (!y1Var.f2025m0) {
                if (b10 == null) {
                    aVar.f6046b = 0.0f;
                    aVar.f6047c = 0.0f;
                    aVar.f6048d = 0.0f;
                    aVar.f6049e = 0.0f;
                } else {
                    i3.e0.c(b10, aVar);
                }
            }
        }
        long j11 = this.f327v0;
        float f8 = (int) (j11 >> 32);
        aVar.f6046b += f8;
        aVar.f6048d += f8;
        float f10 = (int) (j11 & 4294967295L);
        aVar.f6047c += f10;
        aVar.f6049e += f10;
    }

    public final void p1() {
        if (this.H0 != null) {
            v1(null, false);
            this.f315i0.W(false);
        }
    }

    public final void q1(y3.w0 w0Var) {
        r1 r1Var;
        y3.w0 w0Var2 = this.f325t0;
        if (w0Var != w0Var2) {
            this.f325t0 = w0Var;
            o0 o0Var = this.f315i0;
            int i2 = 0;
            if (w0Var2 == null || w0Var.c() != w0Var2.c() || w0Var.a() != w0Var2.a()) {
                int c4 = w0Var.c();
                int a10 = w0Var.a();
                b2 b2Var = this.H0;
                if (b2Var != null) {
                    ((b4.y1) b2Var).e((c4 << 32) | (a10 & 4294967295L));
                } else if (o0Var.I() && (r1Var = this.f319m0) != null) {
                    r1Var.e1();
                }
                r0((a10 & 4294967295L) | (c4 << 32));
                if (this.p0 != null) {
                    w1(false);
                }
                boolean g10 = s1.g(4);
                b3.o X0 = X0();
                if (g10 || (X0 = X0.X) != null) {
                    for (b3.o Z0 = Z0(g10); Z0 != null && (Z0.R & 4) != 0; Z0 = Z0.Y) {
                        if ((Z0.L & 4) != 0) {
                            b3.o oVar = Z0;
                            p2.b bVar = null;
                            while (oVar != null) {
                                if (oVar instanceof p) {
                                    ((p) oVar).q0();
                                } else if ((oVar.L & 4) != 0 && (oVar instanceof k)) {
                                    int i10 = 0;
                                    for (b3.o oVar2 = ((k) oVar).f247j0; oVar2 != null; oVar2 = oVar2.Y) {
                                        if ((oVar2.L & 4) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                oVar = oVar2;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new p2.b(new b3.o[16]);
                                                }
                                                if (oVar != null) {
                                                    bVar.b(oVar);
                                                    oVar = null;
                                                }
                                                bVar.b(oVar2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVar = l.e(bVar);
                            }
                        }
                        if (Z0 == X0) {
                            break;
                        }
                    }
                }
                c2 c2Var = o0Var.f286j0;
                if (c2Var != null) {
                    ((b4.x) c2Var).u(o0Var);
                }
            }
            a1.d0 d0Var = this.f326u0;
            if ((d0Var != null && d0Var.f36e != 0) || !w0Var.d().isEmpty()) {
                a1.d0 d0Var2 = this.f326u0;
                Map d4 = w0Var.d();
                if (d0Var2 != null && d0Var2.f36e == d4.size()) {
                    Object[] objArr = d0Var2.f33b;
                    int[] iArr = d0Var2.f34c;
                    long[] jArr = d0Var2.f32a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        loop0: while (true) {
                            long j2 = jArr[i11];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = i2; i13 < i12; i13++) {
                                    if ((255 & j2) < 128) {
                                        int i14 = (i11 << 3) + i13;
                                        Object obj = objArr[i14];
                                        int i15 = iArr[i14];
                                        Integer num = (Integer) d4.get((y3.q) obj);
                                        if (num == null || num.intValue() != i15) {
                                            break loop0;
                                        }
                                    }
                                    j2 >>= 8;
                                }
                                if (i12 != 8) {
                                    return;
                                }
                            }
                            if (i11 != length) {
                                i11++;
                                i2 = 0;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                o0Var.B0.f348p.f236r0.f();
                a1.d0 d0Var3 = this.f326u0;
                if (d0Var3 == null) {
                    a1.d0 d0Var4 = a1.r0.f92a;
                    d0Var3 = new a1.d0();
                    this.f326u0 = d0Var3;
                }
                d0Var3.a();
                for (Map.Entry entry : w0Var.d().entrySet()) {
                    d0Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
                }
            }
        }
    }

    public final h3.c s1() {
        if (X0().f1777h0) {
            y3.z i2 = y3.c0.i(this);
            h3.a aVar = this.f329x0;
            if (aVar == null) {
                aVar = new h3.a();
                this.f329x0 = aVar;
            }
            long O0 = O0(W0());
            int i10 = (int) (O0 >> 32);
            aVar.f6046b = -Float.intBitsToFloat(i10);
            int i11 = (int) (O0 & 4294967295L);
            aVar.f6047c = -Float.intBitsToFloat(i11);
            aVar.f6048d = Float.intBitsToFloat(i10) + n0();
            aVar.f6049e = Float.intBitsToFloat(i11) + j0();
            r1 r1Var = this;
            while (r1Var != i2) {
                r1Var.o1(aVar, false, true);
                if (!aVar.f()) {
                    r1Var = r1Var.f319m0;
                    r1Var.getClass();
                }
            }
            return new h3.c(aVar.f6046b, aVar.f6047c, aVar.f6048d, aVar.f6049e);
        }
        return h3.c.f6051e;
    }

    public final void t1(r1 r1Var, float[] fArr) {
        float[] a10;
        if (!nc.k.a(r1Var, this)) {
            r1 r1Var2 = this.f319m0;
            r1Var2.getClass();
            r1Var2.t1(r1Var, fArr);
            if (!x4.j.a(this.f327v0, 0L)) {
                float[] fArr2 = K0;
                i3.e0.d(fArr2);
                long j2 = this.f327v0;
                i3.e0.f(fArr2, -((int) (j2 >> 32)), -((int) (j2 & 4294967295L)));
                i3.e0.e(fArr, fArr2);
            }
            b2 b2Var = this.H0;
            if (b2Var != null && (a10 = ((b4.y1) b2Var).a()) != null) {
                i3.e0.e(fArr, a10);
            }
        }
    }

    @Override // y3.z
    public final void u(y3.z zVar, float[] fArr) {
        r1 r12 = r1(zVar);
        r12.g1();
        r1 T0 = T0(r12);
        i3.e0.d(fArr);
        r12.u1(T0, fArr);
        t1(T0, fArr);
    }

    public final void u1(r1 r1Var, float[] fArr) {
        r1 r1Var2 = this;
        while (!r1Var2.equals(r1Var)) {
            b2 b2Var = r1Var2.H0;
            if (b2Var != null) {
                i3.e0.e(fArr, ((b4.y1) b2Var).b());
            }
            long j2 = r1Var2.f327v0;
            if (!x4.j.a(j2, 0L)) {
                float[] fArr2 = K0;
                i3.e0.d(fArr2);
                i3.e0.f(fArr2, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                i3.e0.e(fArr, fArr2);
            }
            r1Var2 = r1Var2.f319m0;
            r1Var2.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v1(mc.l r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.r1.v1(mc.l, boolean):void");
    }

    @Override // a4.d2
    public final boolean w() {
        if (this.H0 != null && !this.f320n0 && this.f315i0.H()) {
            return true;
        }
        return false;
    }

    public final void w1(boolean z10) {
        char c4;
        b4.x xVar;
        boolean z11;
        b4.x xVar2;
        boolean z12;
        c2 c2Var;
        float f8;
        mc.a aVar;
        mc.a aVar2;
        b2 b2Var = this.H0;
        mc.l lVar = this.p0;
        if (b2Var != null) {
            if (lVar != null) {
                i3.k0 k0Var = I0;
                k0Var.a();
                o0 o0Var = this.f315i0;
                k0Var.f6649h0 = o0Var.f295t0;
                k0Var.f6650i0 = o0Var.f296u0;
                k0Var.f6648g0 = zb.k.T(this.L);
                ((b4.x) s0.a(o0Var)).getSnapshotObserver().f194a.c(this, e.Y, new n0(1, lVar, this));
                y yVar = this.f330y0;
                if (yVar == null) {
                    yVar = new y();
                    this.f330y0 = yVar;
                }
                y yVar2 = J0;
                yVar2.getClass();
                yVar2.f366a = yVar.f366a;
                yVar2.f367b = yVar.f367b;
                yVar2.f368c = yVar.f368c;
                yVar2.f369d = yVar.f369d;
                yVar2.f370e = yVar.f370e;
                float f10 = k0Var.B;
                yVar.f366a = f10;
                yVar.f367b = k0Var.L;
                yVar.f368c = k0Var.f6643b0;
                yVar.f369d = k0Var.f6644c0;
                long j2 = k0Var.f6645d0;
                yVar.f370e = j2;
                b4.y1 y1Var = (b4.y1) b2Var;
                b4.x xVar3 = y1Var.L;
                int i2 = k0Var.A | y1Var.f2020h0;
                y1Var.f2018f0 = k0Var.f6650i0;
                y1Var.f2017e0 = k0Var.f6649h0;
                int i10 = i2 & 4096;
                if (i10 != 0) {
                    y1Var.f2021i0 = j2;
                }
                if ((i2 & 1) != 0) {
                    l3.d dVar = y1Var.A.f8682a;
                    if (dVar.d() != f10) {
                        dVar.n(f10);
                    }
                }
                if ((i2 & 2) != 0) {
                    l3.b bVar = y1Var.A;
                    float f11 = k0Var.L;
                    l3.d dVar2 = bVar.f8682a;
                    if (dVar2.H() != f11) {
                        dVar2.A(f11);
                    }
                }
                if ((i2 & 4) != 0) {
                    l3.b bVar2 = y1Var.A;
                    float f12 = k0Var.R;
                    l3.d dVar3 = bVar2.f8682a;
                    if (dVar3.a() != f12) {
                        dVar3.c(f12);
                    }
                }
                if ((i2 & 8) != 0) {
                    l3.d dVar4 = y1Var.A.f8682a;
                    if (dVar4.s() != 0.0f) {
                        dVar4.t();
                    }
                }
                if ((i2 & 16) != 0) {
                    l3.d dVar5 = y1Var.A.f8682a;
                    if (dVar5.f() != 0.0f) {
                        dVar5.g();
                    }
                }
                if ((i2 & 32) != 0) {
                    l3.b bVar3 = y1Var.A;
                    float f13 = k0Var.X;
                    l3.d dVar6 = bVar3.f8682a;
                    if (dVar6.F() != f13) {
                        dVar6.e(f13);
                        bVar3.f8688g = true;
                        bVar3.a();
                    }
                    if (k0Var.X > 0.0f && !y1Var.f2026n0 && (aVar2 = y1Var.X) != null) {
                        aVar2.b();
                    }
                }
                if ((i2 & 64) != 0) {
                    l3.b bVar4 = y1Var.A;
                    long j10 = k0Var.Y;
                    l3.d dVar7 = bVar4.f8682a;
                    if (!i3.s.c(j10, dVar7.L())) {
                        dVar7.k(j10);
                    }
                }
                if ((i2 & 128) != 0) {
                    l3.b bVar5 = y1Var.A;
                    long j11 = k0Var.Z;
                    l3.d dVar8 = bVar5.f8682a;
                    if (!i3.s.c(j11, dVar8.j())) {
                        dVar8.z(j11);
                    }
                }
                if ((i2 & 1024) != 0) {
                    l3.b bVar6 = y1Var.A;
                    float f14 = k0Var.f6643b0;
                    l3.d dVar9 = bVar6.f8682a;
                    if (dVar9.I() != f14) {
                        dVar9.h(f14);
                    }
                }
                if ((i2 & 256) != 0) {
                    l3.d dVar10 = y1Var.A.f8682a;
                    if (dVar10.w() != 0.0f) {
                        dVar10.b();
                    }
                }
                if ((i2 & 512) != 0) {
                    l3.d dVar11 = y1Var.A.f8682a;
                    if (dVar11.D() != 0.0f) {
                        dVar11.i();
                    }
                }
                if ((i2 & 2048) != 0) {
                    l3.b bVar7 = y1Var.A;
                    float f15 = k0Var.f6644c0;
                    l3.d dVar12 = bVar7.f8682a;
                    if (dVar12.p() != f15) {
                        dVar12.E(f15);
                    }
                }
                if (i10 != 0) {
                    c4 = ' ';
                    boolean a10 = i3.q0.a(y1Var.f2021i0, i3.q0.f6677b);
                    l3.b bVar8 = y1Var.A;
                    if (a10) {
                        if (!h3.b.b(bVar8.f8702v, 9205357640488583168L)) {
                            bVar8.f8702v = 9205357640488583168L;
                            bVar8.f8682a.K(9205357640488583168L);
                        }
                    } else {
                        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (y1Var.f2021i0 & 4294967295L)) * ((int) (y1Var.Y & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (y1Var.f2021i0 >> 32)) * ((int) (y1Var.Y >> 32))) << 32);
                        if (!h3.b.b(bVar8.f8702v, floatToRawIntBits)) {
                            bVar8.f8702v = floatToRawIntBits;
                            bVar8.f8682a.K(floatToRawIntBits);
                        }
                    }
                } else {
                    c4 = ' ';
                }
                if ((i2 & 16384) != 0) {
                    l3.b bVar9 = y1Var.A;
                    boolean z13 = k0Var.f6647f0;
                    if (bVar9.f8703w != z13) {
                        bVar9.f8703w = z13;
                        bVar9.f8688g = true;
                        bVar9.a();
                    }
                }
                if ((131072 & i2) != 0) {
                    l3.d dVar13 = y1Var.A.f8682a;
                }
                if ((262144 & i2) != 0) {
                    l3.d dVar14 = y1Var.A.f8682a;
                    if (!nc.k.a(dVar14.x(), null)) {
                        dVar14.m();
                    }
                }
                if ((524288 & i2) != 0) {
                    l3.b bVar10 = y1Var.A;
                    int i11 = k0Var.f6651j0;
                    l3.d dVar15 = bVar10.f8682a;
                    if (dVar15.J() != i11) {
                        dVar15.o(i11);
                    }
                }
                if ((32768 & i2) != 0) {
                    l3.d dVar16 = y1Var.A.f8682a;
                    if (dVar16.v() != 0) {
                        dVar16.y(0);
                    }
                }
                if ((i2 & 7963) != 0) {
                    y1Var.f2023k0 = true;
                    y1Var.f2024l0 = true;
                }
                if (!nc.k.a(y1Var.f2022j0, k0Var.f6652k0)) {
                    i3.z zVar = k0Var.f6652k0;
                    y1Var.f2022j0 = zVar;
                    if (zVar == null) {
                        xVar = xVar3;
                    } else {
                        l3.b bVar11 = y1Var.A;
                        if (zVar instanceof i3.g0) {
                            h3.c cVar = ((i3.g0) zVar).f6634f;
                            float f16 = cVar.f6052a;
                            float f17 = cVar.f6053b;
                            xVar = xVar3;
                            bVar11.f(0.0f, (Float.floatToRawIntBits(f16) << c4) | (Float.floatToRawIntBits(f17) & 4294967295L), (Float.floatToRawIntBits(cVar.f6054c - f16) << c4) | (Float.floatToRawIntBits(cVar.f6055d - f17) & 4294967295L));
                        } else {
                            xVar = xVar3;
                            if (zVar instanceof i3.f0) {
                                i3.h hVar = ((i3.f0) zVar).f6631f;
                                bVar11.f8692k = null;
                                bVar11.f8690i = 9205357640488583168L;
                                bVar11.f8689h = 0L;
                                bVar11.f8691j = 0.0f;
                                bVar11.f8688g = true;
                                bVar11.f8694n = false;
                                bVar11.f8693l = hVar;
                                bVar11.a();
                            } else if (zVar instanceof i3.h0) {
                                i3.h0 h0Var = (i3.h0) zVar;
                                i3.h hVar2 = h0Var.f6640g;
                                if (hVar2 != null) {
                                    bVar11.f8692k = null;
                                    bVar11.f8690i = 9205357640488583168L;
                                    bVar11.f8689h = 0L;
                                    bVar11.f8691j = 0.0f;
                                    bVar11.f8688g = true;
                                    bVar11.f8694n = false;
                                    bVar11.f8693l = hVar2;
                                    bVar11.a();
                                } else {
                                    h3.d dVar17 = h0Var.f6639f;
                                    float f18 = dVar17.f6057b;
                                    long floatToRawIntBits2 = (Float.floatToRawIntBits(f8) << c4) | (Float.floatToRawIntBits(f18) & 4294967295L);
                                    float f19 = dVar17.f6058c - dVar17.f6056a;
                                    float f20 = dVar17.f6059d - f18;
                                    bVar11.f(Float.intBitsToFloat((int) (dVar17.f6063h >> c4)), floatToRawIntBits2, (Float.floatToRawIntBits(f19) << c4) | (Float.floatToRawIntBits(f20) & 4294967295L));
                                }
                            } else {
                                m9.o.o();
                                return;
                            }
                        }
                        if ((zVar instanceof i3.f0) && Build.VERSION.SDK_INT < 33 && (aVar = y1Var.X) != null) {
                            aVar.b();
                        }
                    }
                    z11 = true;
                } else {
                    xVar = xVar3;
                    z11 = false;
                }
                y1Var.f2020h0 = k0Var.A;
                if (i2 != 0 || z11) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        ViewParent parent = xVar.getParent();
                        if (parent != null) {
                            xVar2 = xVar;
                            parent.onDescendantInvalidated(xVar2, xVar2);
                        } else {
                            xVar2 = xVar;
                        }
                    } else {
                        xVar2 = xVar;
                        xVar2.invalidate();
                    }
                    if (xVar2.f1970i0) {
                        xVar2.I(0.0f);
                    }
                }
                boolean z14 = this.f321o0;
                this.f321o0 = k0Var.f6647f0;
                this.f324s0 = k0Var.R;
                if (yVar2.f366a == yVar.f366a && yVar2.f367b == yVar.f367b && yVar2.f368c == yVar.f368c && yVar2.f369d == yVar.f369d && i3.q0.a(yVar2.f370e, yVar.f370e)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z10 && ((!z12 || z14 != this.f321o0) && (c2Var = o0Var.f286j0) != null)) {
                    ((b4.x) c2Var).u(o0Var);
                }
                if (!z12) {
                    t0 t0Var = o0Var.B0;
                    if (t0Var.f345l > 0) {
                        if (t0Var.f344k || t0Var.f343j) {
                            o0Var.W(false);
                        }
                        t0Var.f348p.z0();
                    }
                    o0Var.N();
                    b4.x xVar4 = (b4.x) s0.a(o0Var);
                    j4.b rectManager = xVar4.getRectManager();
                    if (this == o0Var.A0.f266d) {
                        rectManager.f(o0Var, false);
                    } else {
                        rectManager.getClass();
                        if (o0Var.I()) {
                            long g10 = j4.b.g(o0Var);
                            if (!x4.j.a(g10, 9223372034707292159L)) {
                                o0Var.Y = g10;
                                o0Var.Z = false;
                                p2.b z15 = o0Var.z();
                                Object[] objArr = z15.A;
                                int i12 = z15.L;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    rectManager.f((o0) objArr[i13], false);
                                }
                                rectManager.e(o0Var);
                            } else {
                                rectManager.d(o0Var);
                            }
                        }
                    }
                    if (o0Var.I0 > 0) {
                        a0.g gVar = xVar4.Q0.f206e;
                        gVar.getClass();
                        if (o0Var.I0 > 0) {
                            ((p2.b) gVar.B).b(o0Var);
                            o0Var.H0 = true;
                        }
                        xVar4.B(null);
                        return;
                    }
                    return;
                }
                return;
            }
            throw w.d.g("updateLayerParameters requires a non-null layerBlock");
        } else if (lVar != null) {
            x3.a.c("null layer with a non-null layerBlock");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x1(long r26) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.r1.x1(long):boolean");
    }

    @Override // a4.x0
    public final y3.z C0() {
        return this;
    }
}
