package l1;

import a4.p2;
import a4.q2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ l0 B;

    public /* synthetic */ k0(l0 l0Var, int i2) {
        this.A = i2;
        this.B = l0Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        q2 q2Var = (q2) obj;
        switch (this.A) {
            case 0:
                q2Var.getClass();
                l0 l0Var = (l0) q2Var;
                b2 b2Var = this.B.f8582j0;
                if (!nc.k.a(l0Var.f8581i0, b2Var)) {
                    l0Var.f8581i0 = b2Var;
                    l0Var.P0();
                }
                return p2.SkipSubtreeAndContinueTraversal;
            default:
                q2Var.getClass();
                this.B.f8581i0 = ((l0) q2Var).f8582j0;
                return Boolean.FALSE;
        }
    }
}
