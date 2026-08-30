package nd;

import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class r extends a {

    /* renamed from: a  reason: collision with root package name */
    public final jd.a f10356a;

    public r(jd.a aVar) {
        this.f10356a = aVar;
    }

    @Override // jd.a
    public void d(md.d dVar, Object obj) {
        int i2 = i(obj);
        ld.e e6 = e();
        e6.getClass();
        md.b a10 = dVar.a(e6);
        Iterator h2 = h(obj);
        for (int i10 = 0; i10 < i2; i10++) {
            ((ij.a) a10).J(e(), i10, this.f10356a, h2.next());
        }
        a10.b(e6);
    }

    @Override // nd.a
    public void k(md.a aVar, int i2, Object obj) {
        n(i2, obj, aVar.o(e(), i2, this.f10356a, null));
    }

    public abstract void n(int i2, Object obj, Object obj2);
}
