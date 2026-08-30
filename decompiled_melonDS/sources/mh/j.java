package mh;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import b4.r0;
import cd.o1;
import n2.w0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements mc.p {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ ah.e0 B;
    public final /* synthetic */ mc.a L;

    public /* synthetic */ j(ah.e0 e0Var, mc.a aVar) {
        this.B = e0Var;
        this.L = aVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        n2.m mVar = (n2.m) obj;
        Integer num = (Integer) obj2;
        switch (this.A) {
            case 0:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                boolean O = rVar.O(intValue & 1, z10);
                yb.y yVar = yb.y.f14813a;
                if (O) {
                    ViewParent parent = ((View) rVar.j(r0.f1941f)).getParent();
                    parent.getClass();
                    ((a5.e0) parent).f384f0.setDimAmount(0.8f);
                    Context context = (Context) rVar.j(r0.f1937b);
                    ah.e0 e0Var = this.B;
                    w0 m = n2.s.m((o1) e0Var.f12534e.getValue(), rVar);
                    boolean h2 = rVar.h(e0Var) | rVar.h(context);
                    Object L = rVar.L();
                    if (h2 || L == n2.l.f9953a) {
                        L = new m(e0Var, context, null, 0);
                        rVar.h0(L);
                    }
                    n2.s.g(yVar, (mc.p) L, rVar);
                    ij.a.u(true, v2.h.c(40524724, new k(e0Var, this.L, m, 0), rVar), rVar, 54, 0);
                } else {
                    rVar.R();
                }
                return yVar;
            default:
                num.getClass();
                g0.a(this.B, this.L, mVar, n2.s.F(1));
                return yb.y.f14813a;
        }
    }

    public /* synthetic */ j(ah.e0 e0Var, mc.a aVar, int i2) {
        this.B = e0Var;
        this.L = aVar;
    }
}
