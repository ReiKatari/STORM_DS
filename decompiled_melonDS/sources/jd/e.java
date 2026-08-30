package jd;

import java.util.List;
import java.util.Map;
import mc.l;
import nd.o1;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements l {
    public final /* synthetic */ int A;
    public final /* synthetic */ f B;

    public /* synthetic */ e(f fVar, int i2) {
        this.A = i2;
        this.B = fVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        ld.a aVar = (ld.a) obj;
        switch (this.A) {
            case 0:
                aVar.getClass();
                ld.a.a(aVar, "type", o1.f10344b);
                StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Sealed<");
                f fVar = this.B;
                sb2.append(fVar.f7809a.c());
                sb2.append('>');
                e eVar = new e(fVar, 1);
                ld.a.a(aVar, "value", aj.g.h(sb2.toString(), ld.h.f9042o, new ld.e[0], eVar));
                List list = fVar.f7810b;
                list.getClass();
                aVar.f9010b = list;
                return y.f14813a;
            default:
                aVar.getClass();
                for (Map.Entry entry : this.B.f7813e.entrySet()) {
                    ld.a.a(aVar, (String) entry.getKey(), ((a) entry.getValue()).e());
                }
                return y.f14813a;
        }
    }
}
