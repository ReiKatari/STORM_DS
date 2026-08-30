package bi;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ me.magnum.melonds.ui.romlist.a Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(me.magnum.melonds.ui.romlist.a aVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = aVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                cc.c cVar = (cc.c) obj2;
                yb.y yVar = yb.y.f14813a;
                ((a0) t(cVar, (oe.g0) obj)).v(yVar);
                return yVar;
            default:
                cc.c cVar2 = (cc.c) obj2;
                yb.y yVar2 = yb.y.f14813a;
                ((a0) t(cVar2, (List) obj)).v(yVar2);
                return yVar2;
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                a0 a0Var = new a0(this.Z, cVar, 0);
                a0Var.Y = obj;
                return a0Var;
            default:
                a0 a0Var2 = new a0(this.Z, cVar, 1);
                a0Var2.Y = obj;
                return a0Var2;
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        boolean z10;
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        me.magnum.melonds.ui.romlist.a aVar = this.Z;
        switch (i2) {
            case 0:
                oe.g0 g0Var = (oe.g0) this.Y;
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                a4.n nVar = aVar.Y;
                if (nVar != null) {
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nVar.L;
                    if (g0Var == oe.g0.SCANNING) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    swipeRefreshLayout.setRefreshing(z10);
                    me.magnum.melonds.ui.romlist.a.i(aVar);
                    return yVar;
                }
                nc.k.f("binding");
                throw null;
            default:
                List list = (List) this.Y;
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                y yVar2 = aVar.f9574b0;
                if (yVar2 != null) {
                    list.getClass();
                    ArrayList arrayList = yVar2.f2327i;
                    j7.o.c(new x(arrayList, list)).a(yVar2);
                    arrayList.clear();
                    arrayList.addAll(list);
                    me.magnum.melonds.ui.romlist.a.i(aVar);
                    return yVar;
                }
                nc.k.f("romListAdapter");
                throw null;
        }
    }
}
