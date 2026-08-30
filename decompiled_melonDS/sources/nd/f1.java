package nd;

import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class f1 extends r {

    /* renamed from: b  reason: collision with root package name */
    public final e1 f10304b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(jd.a aVar) {
        super(aVar);
        aVar.getClass();
        this.f10304b = new e1(aVar.e());
    }

    @Override // nd.a, jd.a
    public final Object a(md.c cVar) {
        return j(cVar);
    }

    @Override // nd.r, jd.a
    public final void d(md.d dVar, Object obj) {
        int i2 = i(obj);
        e1 e1Var = this.f10304b;
        e1Var.getClass();
        md.b a10 = dVar.a(e1Var);
        p(a10, obj, i2);
        a10.b(e1Var);
    }

    @Override // jd.a
    public final ld.e e() {
        return this.f10304b;
    }

    @Override // nd.a
    public final Object f() {
        return (d1) l(o());
    }

    @Override // nd.a
    public final int g(Object obj) {
        d1 d1Var = (d1) obj;
        d1Var.getClass();
        return d1Var.d();
    }

    @Override // nd.a
    public final Iterator h(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // nd.a
    public final Object m(Object obj) {
        d1 d1Var = (d1) obj;
        d1Var.getClass();
        return d1Var.a();
    }

    @Override // nd.r
    public final void n(int i2, Object obj, Object obj2) {
        ((d1) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object o();

    public abstract void p(md.b bVar, Object obj, int i2);
}
