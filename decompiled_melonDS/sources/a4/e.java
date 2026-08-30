package a4;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends nc.l implements mc.l {
    public static final e L = new e(1, 0);
    public static final e R = new e(1, 1);
    public static final e X = new e(1, 2);
    public static final e Y = new e(1, 3);
    public static final e Z = new e(1, 4);

    /* renamed from: b0  reason: collision with root package name */
    public static final e f185b0 = new e(1, 5);

    /* renamed from: c0  reason: collision with root package name */
    public static final e f186c0 = new e(1, 6);

    /* renamed from: d0  reason: collision with root package name */
    public static final e f187d0 = new e(1, 7);

    /* renamed from: e0  reason: collision with root package name */
    public static final e f188e0 = new e(1, 8);

    /* renamed from: f0  reason: collision with root package name */
    public static final e f189f0 = new e(1, 9);

    /* renamed from: g0  reason: collision with root package name */
    public static final e f190g0 = new e(1, 10);

    /* renamed from: h0  reason: collision with root package name */
    public static final e f191h0 = new e(1, 11);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, int i10) {
        super(i2);
        this.B = i10;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        o0 o0Var;
        switch (this.B) {
            case 0:
                h hVar = (h) obj;
                if (hVar instanceof o0) {
                    o0Var = (o0) hVar;
                } else {
                    o0Var = null;
                }
                if (o0Var != null && o0Var.J0) {
                    m9.o.h(hVar, "Apply is called on deactivated node ");
                    return null;
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                g2 g2Var = (g2) obj;
                if (g2Var.w()) {
                    x0 x0Var = g2Var.B;
                    if (!x0Var.f362e0) {
                        mc.l e6 = g2Var.A.e();
                        a1.m0 m0Var = x0Var.f365h0;
                        if (e6 == null) {
                            if (m0Var != null) {
                                Object[] objArr = m0Var.f69c;
                                long[] jArr = m0Var.f67a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        long j2 = jArr[i2];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i2 - length)) >>> 31);
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                if ((255 & j2) < 128) {
                                                    x0Var.K0((a1.n0) objArr[(i2 << 3) + i11]);
                                                }
                                                j2 >>= 8;
                                            }
                                            if (i10 != 8) {
                                            }
                                        }
                                        if (i2 != length) {
                                            i2++;
                                        }
                                    }
                                }
                                m0Var.a();
                            }
                        } else {
                            x0Var.y0(g2Var, 9223372034707292159L, 0L);
                            x0Var.Z = e6;
                        }
                    }
                }
                return yb.y.f14813a;
            case 2:
                b2 b2Var = ((r1) obj).H0;
                if (b2Var != null) {
                    ((b4.y1) b2Var).c();
                }
                return yb.y.f14813a;
            case 3:
                r1 r1Var = (r1) obj;
                o0 o0Var2 = r1Var.f315i0;
                try {
                    if (r1Var.w()) {
                        r1Var.w1(true);
                    }
                    return yb.y.f14813a;
                } catch (Throwable th2) {
                    o0Var2.a0(th2);
                    throw null;
                }
            case 4:
                y1 y1Var = (y1) obj;
                if (y1Var.w()) {
                    y1Var.A.J();
                }
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                o0 o0Var3 = (o0) obj;
                if (o0Var3.H()) {
                    o0Var3.W(false);
                }
                return yb.y.f14813a;
            case l1.c.f8509e /* 6 */:
                o0 o0Var4 = (o0) obj;
                if (o0Var4.H()) {
                    o0Var4.W(false);
                }
                return yb.y.f14813a;
            case 7:
                o0 o0Var5 = (o0) obj;
                if (o0Var5.H()) {
                    o0Var5.U(false);
                }
                return yb.y.f14813a;
            case 8:
                o0 o0Var6 = (o0) obj;
                if (o0Var6.H()) {
                    o0Var6.U(false);
                }
                return yb.y.f14813a;
            case l1.c.f8508d /* 9 */:
                o0 o0Var7 = (o0) obj;
                if (o0Var7.H()) {
                    o0.V(o0Var7, false, 7);
                }
                return yb.y.f14813a;
            case l1.c.f8510f /* 10 */:
                o0 o0Var8 = (o0) obj;
                if (o0Var8.H()) {
                    o0.X(o0Var8, false, 7);
                }
                return yb.y.f14813a;
            default:
                o0 o0Var9 = (o0) obj;
                if (o0Var9.H()) {
                    o0Var9.F();
                }
                return yb.y.f14813a;
        }
    }
}
