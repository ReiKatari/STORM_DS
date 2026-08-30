package c1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ b1 L;
    public final /* synthetic */ long R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(b1 b1Var, long j2, int i2) {
        super(1);
        this.B = i2;
        this.L = b1Var;
        this.R = j2;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [nc.l, mc.l] */
    /* JADX WARN: Type inference failed for: r1v17, types: [nc.l, mc.l] */
    @Override // mc.l
    public final Object k(Object obj) {
        long j2;
        int i2;
        long j10;
        long j11;
        switch (this.B) {
            case 0:
                int i10 = x0.f2548a[((m0) obj).ordinal()];
                long j12 = this.R;
                if (i10 != 1) {
                    b1 b1Var = this.L;
                    if (i10 != 2) {
                        if (i10 == 3) {
                            k0 k0Var = b1Var.f2388o0.f2403a.f2523c;
                            if (k0Var != null) {
                                j12 = ((x4.l) k0Var.f2453b.k(new x4.l(j12))).f14346a;
                            }
                        } else {
                            m9.o.o();
                            return null;
                        }
                    } else {
                        k0 k0Var2 = b1Var.f2387n0.f2397a.f2523c;
                        if (k0Var2 != null) {
                            j12 = ((x4.l) k0Var2.f2453b.k(new x4.l(j12))).f14346a;
                        }
                    }
                }
                return new x4.l(j12);
            case DSiCameraSource.FrontCamera /* 1 */:
                m0 m0Var = (m0) obj;
                b1 b1Var2 = this.L;
                if (b1Var2.f2391s0 != null && b1Var2.Q0() != null && !nc.k.a(b1Var2.f2391s0, b1Var2.Q0()) && (i2 = x0.f2548a[m0Var.ordinal()]) != 1 && i2 != 2) {
                    if (i2 == 3) {
                        k0 k0Var3 = b1Var2.f2388o0.f2403a.f2523c;
                        if (k0Var3 != null) {
                            mc.l lVar = k0Var3.f2453b;
                            long j13 = this.R;
                            long j14 = ((x4.l) lVar.k(new x4.l(j13))).f14346a;
                            b3.d Q0 = b1Var2.Q0();
                            Q0.getClass();
                            x4.m mVar = x4.m.Ltr;
                            long a10 = ((b3.h) Q0).a(j13, j14, mVar);
                            b3.d dVar = b1Var2.f2391s0;
                            dVar.getClass();
                            j2 = x4.j.b(a10, dVar.a(j13, j14, mVar));
                            return new x4.j(j2);
                        }
                    } else {
                        m9.o.o();
                        return null;
                    }
                }
                j2 = 0;
                return new x4.j(j2);
            default:
                m0 m0Var2 = (m0) obj;
                b1 b1Var3 = this.L;
                p2 p2Var = b1Var3.f2387n0.f2397a.f2522b;
                long j15 = this.R;
                long j16 = 0;
                if (p2Var != null) {
                    j10 = ((x4.j) p2Var.f2503a.k(new x4.l(j15))).f14340a;
                } else {
                    j10 = 0;
                }
                p2 p2Var2 = b1Var3.f2388o0.f2403a.f2522b;
                if (p2Var2 != null) {
                    j11 = ((x4.j) p2Var2.f2503a.k(new x4.l(j15))).f14340a;
                } else {
                    j11 = 0;
                }
                int i11 = x0.f2548a[m0Var2.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            j16 = j11;
                        } else {
                            m9.o.o();
                            return null;
                        }
                    } else {
                        j16 = j10;
                    }
                }
                return new x4.j(j16);
        }
    }
}
