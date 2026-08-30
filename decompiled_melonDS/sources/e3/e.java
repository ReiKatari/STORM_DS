package e3;

import a4.p2;
import d2.t;
import nc.l;
import nc.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends l implements mc.l {
    public final /* synthetic */ int B = 0;
    public final /* synthetic */ p L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t tVar, f fVar, p pVar) {
        super(1);
        this.L = pVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.B) {
            case 0:
                f fVar = (f) obj;
                if (!fVar.f1777h0) {
                    return p2.SkipSubtreeAndContinueTraversal;
                }
                if (fVar.f4256j0 != null) {
                    x3.a.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                fVar.f4256j0 = null;
                p pVar = this.L;
                pVar.A = pVar.A;
                return p2.ContinueTraversal;
            default:
                if (((v3.f) obj).f13648k0) {
                    this.L.A = false;
                    return p2.CancelTraversal;
                }
                return p2.ContinueTraversal;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p pVar) {
        super(1);
        this.L = pVar;
    }
}
