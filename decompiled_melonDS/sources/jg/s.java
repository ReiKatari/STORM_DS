package jg;

import cd.y0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s implements cd.h {
    public final /* synthetic */ int A;
    public final /* synthetic */ y0 B;

    public /* synthetic */ s(y0 y0Var, int i2) {
        this.A = i2;
        this.B = y0Var;
    }

    @Override // cd.h
    public final Object c(cd.i iVar, cc.c cVar) {
        switch (this.A) {
            case 0:
                Object c4 = this.B.A.c(new a9.h(iVar, 12), cVar);
                if (c4 != dc.a.COROUTINE_SUSPENDED) {
                    return y.f14813a;
                }
                return c4;
            default:
                Object c10 = this.B.A.c(new a9.h(iVar, 13), cVar);
                if (c10 != dc.a.COROUTINE_SUSPENDED) {
                    return y.f14813a;
                }
                return c10;
        }
    }
}
