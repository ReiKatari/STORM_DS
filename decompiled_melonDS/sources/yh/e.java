package yh;

import ah.b0;
import androidx.lifecycle.p0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p7.t;
import xe.o;
import zb.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends qg.b {

    /* renamed from: i  reason: collision with root package name */
    public final p0 f14830i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(cf.b bVar, cf.d dVar, p0 p0Var) {
        super(bVar, dVar);
        bVar.getClass();
        dVar.getClass();
        p0Var.getClass();
        this.f14830i = p0Var;
    }

    @Override // qg.b
    public final Object e(ArrayList arrayList, cc.c cVar) {
        zh.a aVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            o oVar = (o) obj;
            if (oVar.f14586b) {
                aVar = zh.a.Unlocked;
            } else {
                aVar = zh.a.Locked;
            }
            Object obj2 = linkedHashMap.get(aVar);
            if (obj2 == null) {
                linkedHashMap.containsKey(aVar);
            }
            List list = (List) obj2;
            pg.b bVar = new pg.b(oVar);
            if (list != null) {
                list.add(bVar);
            } else {
                list = t.A(bVar);
            }
            linkedHashMap.put(aVar, list);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList2.add(new zh.b((zh.a) entry.getKey(), (List) entry.getValue()));
        }
        return l.l0(arrayList2, new b0(16));
    }

    @Override // qg.b
    public final ze.a f() {
        Object a10 = this.f14830i.a("rom");
        a10.getClass();
        return ((eg.j) a10).A;
    }
}
