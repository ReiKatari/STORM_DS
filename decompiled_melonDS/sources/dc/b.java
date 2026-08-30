package dc;

import ec.h;
import mc.p;
import nc.w;
import p7.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends h {
    public int B;
    public final /* synthetic */ p L;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, Object obj, cc.c cVar) {
        super(cVar);
        this.L = pVar;
        this.R = obj;
        cVar.getClass();
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.B;
        if (i2 != 0) {
            if (i2 == 1) {
                this.B = 2;
                j.I(obj);
                return obj;
            }
            a0.j.p("This coroutine had already completed");
            return null;
        }
        this.B = 1;
        j.I(obj);
        p pVar = this.L;
        pVar.getClass();
        w.b(2, pVar);
        return pVar.j(this.R, this);
    }
}
