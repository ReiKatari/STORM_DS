package b4;

import android.view.View;
import android.view.ViewParent;
import java.util.Set;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m3 extends nc.l implements mc.p {
    public final /* synthetic */ int B;
    public final /* synthetic */ n3 L;
    public final /* synthetic */ mc.p R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(n3 n3Var, mc.p pVar, int i2) {
        super(2);
        this.B = i2;
        this.L = n3Var;
        this.R = pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        Set set;
        View view;
        Object obj3;
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
                    r0.a(this.L.A, this.R, rVar, 0);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    n3 n3Var = this.L;
                    x xVar = n3Var.A;
                    Object tag = xVar.getTag(R.id.inspection_slot_table_set);
                    if ((tag instanceof Set) && (!(tag instanceof oc.a) || (tag instanceof oc.e))) {
                        set = (Set) tag;
                    } else {
                        set = null;
                    }
                    if (set == null) {
                        ViewParent parent = xVar.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            obj3 = view.getTag(R.id.inspection_slot_table_set);
                        } else {
                            obj3 = null;
                        }
                        if ((obj3 instanceof Set) && (!(obj3 instanceof oc.a) || (obj3 instanceof oc.e))) {
                            set = obj3;
                        } else {
                            set = null;
                        }
                    }
                    if (set != null) {
                        set.add(rVar2.w());
                        rVar2.f10009q = true;
                        rVar2.C = true;
                        rVar2.f9996c.b();
                        rVar2.H.b();
                        n2.h2 h2Var = rVar2.I;
                        n2.e2 e2Var = h2Var.f9904a;
                        h2Var.f9908e = e2Var.f9901d0;
                        h2Var.f9909f = e2Var.f9902e0;
                    }
                    boolean h2 = rVar2.h(n3Var);
                    Object L = rVar2.L();
                    n2.e eVar = n2.l.f9953a;
                    if (h2 || L == eVar) {
                        L = new l3(n3Var, null, 0);
                        rVar2.h0(L);
                    }
                    n2.s.g(xVar, (mc.p) L, rVar2);
                    boolean h10 = rVar2.h(n3Var);
                    Object L2 = rVar2.L();
                    if (h10 || L2 == eVar) {
                        L2 = new l3(n3Var, null, 1);
                        rVar2.h0(L2);
                    }
                    n2.s.g(xVar, (mc.p) L2, rVar2);
                    n2.s.a(a3.j.f151a.a(set), v2.h.c(-280240369, new m3(n3Var, this.R, 0), rVar2), rVar2, 56);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
        }
    }
}
