package a4;

import androidx.preference.Preference;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 extends nc.l implements mc.a {
    public final /* synthetic */ int B;
    public final /* synthetic */ c1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(c1 c1Var, int i2) {
        super(0);
        this.B = i2;
        this.L = c1Var;
    }

    @Override // mc.a
    public final Object b() {
        y0 V0;
        switch (this.B) {
            case 0:
                c1 c1Var = this.L;
                t0 t0Var = c1Var.Y;
                t0Var.f341h = 0;
                p2.b z10 = t0Var.f334a.z();
                Object[] objArr = z10.A;
                int i2 = z10.L;
                for (int i10 = 0; i10 < i2; i10++) {
                    c1 c1Var2 = ((o0) objArr[i10]).B0.f349q;
                    c1Var2.getClass();
                    c1Var2.f161b0 = c1Var2.f162c0;
                    c1Var2.f162c0 = Preference.DEFAULT_ORDER;
                    if (c1Var2.f163d0 == k0.InLayoutBlock) {
                        c1Var2.f163d0 = k0.NotUsed;
                    }
                }
                o0 o0Var = t0Var.f334a;
                o0 o0Var2 = t0Var.f334a;
                p2.b z11 = o0Var.z();
                Object[] objArr2 = z11.A;
                int i11 = z11.L;
                for (int i12 = 0; i12 < i11; i12++) {
                    c1 c1Var3 = ((o0) objArr2[i12]).B0.f349q;
                    c1Var3.getClass();
                    c1Var3.f171l0.f308d = false;
                }
                u uVar = c1Var.z().O0;
                if (uVar != null) {
                    boolean z12 = uVar.f362e0;
                    a1.f0 f0Var = (a1.f0) o0Var2.n();
                    int i13 = ((p2.b) f0Var.B).L;
                    for (int i14 = 0; i14 < i13; i14++) {
                        y0 V02 = ((o0) f0Var.get(i14)).A0.f266d.V0();
                        if (V02 != null) {
                            V02.f362e0 = z12;
                        }
                    }
                }
                u uVar2 = c1Var.z().O0;
                uVar2.getClass();
                uVar2.F0().b();
                if (c1Var.z().O0 != null) {
                    a1.f0 f0Var2 = (a1.f0) o0Var2.n();
                    int i15 = ((p2.b) f0Var2.B).L;
                    for (int i16 = 0; i16 < i15; i16++) {
                        y0 V03 = ((o0) f0Var2.get(i16)).A0.f266d.V0();
                        if (V03 != null) {
                            V03.f362e0 = false;
                        }
                    }
                }
                p2.b z13 = o0Var2.z();
                Object[] objArr3 = z13.A;
                int i17 = z13.L;
                for (int i18 = 0; i18 < i17; i18++) {
                    c1 c1Var4 = ((o0) objArr3[i18]).B0.f349q;
                    c1Var4.getClass();
                    int i19 = c1Var4.f161b0;
                    int i20 = c1Var4.f162c0;
                    if (i19 != i20 && i20 == Integer.MAX_VALUE) {
                        c1Var4.w0(true);
                    }
                }
                p2.b z14 = o0Var2.z();
                Object[] objArr4 = z14.A;
                int i21 = z14.L;
                for (int i22 = 0; i22 < i21; i22++) {
                    c1 c1Var5 = ((o0) objArr4[i22]).B0.f349q;
                    c1Var5.getClass();
                    p0 p0Var = c1Var5.f171l0;
                    p0Var.f309e = p0Var.f308d;
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                c1 c1Var6 = this.L;
                t0 t0Var2 = c1Var6.Y;
                y3.h1 h1Var = null;
                if (!l.o(t0Var2.f334a) && !t0Var2.f336c) {
                    r1 r1Var = t0Var2.a().f319m0;
                    if (r1Var != null && (V0 = r1Var.V0()) != null) {
                        h1Var = V0.f363f0;
                    }
                } else {
                    r1 r1Var2 = t0Var2.a().f319m0;
                    if (r1Var2 != null) {
                        h1Var = r1Var2.f363f0;
                    }
                }
                if (h1Var == null) {
                    h1Var = ((b4.x) s0.a(t0Var2.f334a)).getPlacementScope();
                }
                y0 V04 = t0Var2.a().V0();
                V04.getClass();
                y3.h1.l(h1Var, V04, c1Var6.f168i0);
                return yb.y.f14813a;
            default:
                c1 c1Var7 = this.L;
                y0 V05 = c1Var7.Y.a().V0();
                V05.getClass();
                V05.e(c1Var7.f177s0);
                return yb.y.f14813a;
        }
    }
}
