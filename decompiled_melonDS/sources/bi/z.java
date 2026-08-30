package bi;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kf.l0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ me.magnum.melonds.ui.romlist.a f2329a;

    public z(me.magnum.melonds.ui.romlist.a aVar) {
        this.f2329a = aVar;
    }

    public final void a(ze.a aVar) {
        aVar.getClass();
        me.magnum.melonds.ui.romlist.a aVar2 = this.f2329a;
        cf.c cVar = aVar2.j().f2285b;
        Date time = Calendar.getInstance().getTime();
        time.getClass();
        l0 l0Var = (l0) cVar;
        l0Var.getClass();
        ArrayList arrayList = l0Var.f8252i;
        int size = arrayList.size();
        int i2 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ze.a aVar3 = (ze.a) obj;
                aVar3.getClass();
                if (nc.k.a(aVar3.f15056d, aVar.f15056d)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            aVar.f15059g = time;
            arrayList.set(i2, aVar);
            l0Var.g();
        }
        mc.l lVar = aVar2.f9575c0;
        if (lVar != null) {
            lVar.k(aVar);
        }
    }
}
