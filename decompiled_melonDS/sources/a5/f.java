package a5;

import androidx.compose.ui.platform.ComposeView;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.w0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends nc.l implements mc.p {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i2, int i10, Object obj) {
        super(2);
        this.B = i10;
        this.L = obj;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.B) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    Object L = rVar.L();
                    if (L == n2.l.f9953a) {
                        L = e.L;
                        rVar.h0(L);
                    }
                    k0.d.h(i4.n.a(b3.m.f1770a, false, (mc.l) L), (mc.p) ((w0) this.L).getValue(), rVar, 0);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Number) obj2).intValue();
                ((e0) this.L).a((n2.m) obj, n2.s.F(1));
                return yb.y.f14813a;
            case 2:
                ((Number) obj2).intValue();
                ((m0) this.L).a((n2.m) obj, n2.s.F(1));
                return yb.y.f14813a;
            case 3:
                b3.p pVar = (b3.p) obj;
                b3.p pVar2 = (b3.n) obj2;
                n2.m mVar2 = (n2.m) this.L;
                if (pVar2 instanceof b3.k) {
                    mc.q qVar = ((b3.k) pVar2).f1769a;
                    nc.w.b(3, qVar);
                    pVar2 = b3.a.b((b3.p) qVar.i(b3.m.f1770a, mVar2, 0), mVar2);
                }
                return pVar.f(pVar2);
            case 4:
                n2.m mVar3 = (n2.m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar3;
                if (rVar2.O(intValue2 & 1, z11)) {
                    ((b4.a) this.L).a(rVar2, 0);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                ((Number) obj2).intValue();
                ((ComposeView) this.L).a((n2.m) obj, n2.s.F(1));
                return yb.y.f14813a;
            default:
                ((Number) obj2).intValue();
                y3.c0.a((v2.c) this.L, (n2.m) obj, n2.s.F(7));
                return yb.y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i2, Object obj) {
        super(2);
        this.B = i2;
        this.L = obj;
    }
}
