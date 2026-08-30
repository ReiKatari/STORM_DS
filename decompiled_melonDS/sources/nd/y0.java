package nd;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y0 implements jd.a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10391a;

    /* renamed from: b  reason: collision with root package name */
    public final List f10392b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10393c;

    public y0(Object obj, String str) {
        obj.getClass();
        this.f10391a = obj;
        this.f10392b = zb.q.A;
        this.f10393c = p7.a.s(yb.h.PUBLICATION, new a3.e(26, str, this));
    }

    @Override // jd.a
    public final Object a(md.c cVar) {
        ld.e e6 = e();
        md.a a10 = cVar.a(e6);
        int g10 = a10.g(e());
        if (g10 == -1) {
            a10.b(e6);
            return this.f10391a;
        }
        throw new IllegalArgumentException(w.d.l(g10, "Unexpected index "));
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        obj.getClass();
        dVar.a(e()).b(e());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yb.f, java.lang.Object] */
    @Override // jd.a
    public final ld.e e() {
        return (ld.e) this.f10393c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y0(String str, Object obj, Annotation[] annotationArr) {
        this(obj, str);
        obj.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.f10392b = asList;
    }
}
