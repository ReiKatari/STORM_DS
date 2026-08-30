package a4;

import androidx.preference.Preference;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h1 extends nc.l implements mc.a {
    public final /* synthetic */ int B;
    public final /* synthetic */ i1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(i1 i1Var, int i2) {
        super(0);
        this.B = i2;
        this.L = i1Var;
    }

    @Override // mc.a
    public final Object b() {
        y3.h1 placementScope;
        switch (this.B) {
            case 0:
                i1 i1Var = this.L;
                t0 t0Var = i1Var.Y;
                t0Var.f342i = 0;
                p2.b z10 = t0Var.f334a.z();
                Object[] objArr = z10.A;
                int i2 = z10.L;
                for (int i10 = 0; i10 < i2; i10++) {
                    i1 i1Var2 = ((o0) objArr[i10]).B0.f348p;
                    i1Var2.f221b0 = i1Var2.f222c0;
                    i1Var2.f222c0 = Preference.DEFAULT_ORDER;
                    i1Var2.f233n0 = false;
                    if (i1Var2.f225f0 == k0.InLayoutBlock) {
                        i1Var2.f225f0 = k0.NotUsed;
                    }
                }
                o0 o0Var = t0Var.f334a;
                o0 o0Var2 = t0Var.f334a;
                p2.b z11 = o0Var.z();
                Object[] objArr2 = z11.A;
                int i11 = z11.L;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((o0) objArr2[i12]).B0.f348p.f236r0.f308d = false;
                }
                if (i1Var.z().f362e0) {
                    a1.f0 f0Var = (a1.f0) o0Var2.n();
                    int i13 = ((p2.b) f0Var.B).L;
                    for (int i14 = 0; i14 < i13; i14++) {
                        ((o0) f0Var.get(i14)).A0.f266d.f362e0 = true;
                    }
                }
                i1Var.z().F0().b();
                if (i1Var.z().f362e0) {
                    a1.f0 f0Var2 = (a1.f0) o0Var2.n();
                    int i15 = ((p2.b) f0Var2.B).L;
                    for (int i16 = 0; i16 < i15; i16++) {
                        ((o0) f0Var2.get(i16)).A0.f266d.f362e0 = false;
                    }
                }
                p2.b z12 = o0Var2.z();
                Object[] objArr3 = z12.A;
                int i17 = z12.L;
                for (int i18 = 0; i18 < i17; i18++) {
                    o0 o0Var3 = (o0) objArr3[i18];
                    t0 t0Var2 = o0Var3.B0;
                    if (t0Var2.f348p.f221b0 != o0Var3.v()) {
                        o0Var2.O();
                        o0Var2.C();
                        if (o0Var3.v() == Integer.MAX_VALUE) {
                            if (t0Var2.f336c || l.o(o0Var3)) {
                                c1 c1Var = t0Var2.f349q;
                                c1Var.getClass();
                                c1Var.w0(false);
                            }
                            t0Var2.f348p.y0();
                        }
                    }
                }
                p2.b z13 = o0Var2.z();
                Object[] objArr4 = z13.A;
                int i19 = z13.L;
                for (int i20 = 0; i20 < i19; i20++) {
                    p0 p0Var = ((o0) objArr4[i20]).B0.f348p.f236r0;
                    p0Var.f309e = p0Var.f308d;
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                i1 i1Var3 = this.L;
                i1Var3.Y.a().e(i1Var3.f240v0);
                return yb.y.f14813a;
            default:
                i1 i1Var4 = this.L;
                t0 t0Var3 = i1Var4.Y;
                r1 r1Var = t0Var3.a().f319m0;
                if (r1Var == null || (placementScope = r1Var.f363f0) == null) {
                    placementScope = ((b4.x) s0.a(t0Var3.f334a)).getPlacementScope();
                }
                mc.l lVar = i1Var4.A0;
                if (lVar == null) {
                    r1 a10 = t0Var3.a();
                    long j2 = i1Var4.B0;
                    float f8 = i1Var4.C0;
                    placementScope.getClass();
                    y3.h1.a(placementScope, a10);
                    a10.q0(x4.j.c(j2, a10.X), f8, null);
                } else {
                    r1 a11 = t0Var3.a();
                    long j10 = i1Var4.B0;
                    float f10 = i1Var4.C0;
                    placementScope.getClass();
                    y3.h1.a(placementScope, a11);
                    a11.q0(x4.j.c(j10, a11.X), f10, lVar);
                }
                return yb.y.f14813a;
        }
    }
}
