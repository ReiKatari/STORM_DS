package od;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements jd.a {

    /* renamed from: a  reason: collision with root package name */
    public static final g f10893a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final f f10894b = f.f10890b;

    @Override // jd.a
    public final Object a(md.c cVar) {
        k0.d.k(cVar);
        return new e((List) new nd.d(o.f10898a, 0).j(cVar));
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        e eVar = (e) obj;
        eVar.getClass();
        k0.d.i(dVar);
        o oVar = o.f10898a;
        ld.e e6 = oVar.e();
        e6.getClass();
        nd.c cVar = new nd.c(e6, 1);
        int size = eVar.size();
        md.b a10 = dVar.a(cVar);
        Iterator<l> it = eVar.iterator();
        for (int i2 = 0; i2 < size; i2++) {
            ((ij.a) a10).J(cVar, i2, oVar, it.next());
        }
        a10.b(cVar);
    }

    @Override // jd.a
    public final ld.e e() {
        return f10894b;
    }
}
