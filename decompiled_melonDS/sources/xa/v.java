package xa;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class v extends ua.u {

    /* renamed from: a  reason: collision with root package name */
    public final x f14522a;

    public v(x xVar) {
        this.f14522a = xVar;
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        Object d4 = d();
        Map map = this.f14522a.f14525a;
        try {
            aVar.i();
            while (aVar.F()) {
                u uVar = (u) map.get(aVar.X());
                if (uVar == null) {
                    aVar.k0();
                } else {
                    f(d4, aVar, uVar);
                }
            }
            aVar.w();
            return e(d4);
        } catch (IllegalAccessException e6) {
            p7.n nVar = za.c.f15005a;
            m9.o.m("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
            return null;
        } catch (IllegalStateException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        if (obj == null) {
            cVar.F();
            return;
        }
        cVar.m();
        try {
            for (u uVar : this.f14522a.f14526b) {
                uVar.a(cVar, obj);
            }
            cVar.w();
        } catch (IllegalAccessException e6) {
            p7.n nVar = za.c.f15005a;
            m9.o.m("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, cb.a aVar, u uVar);
}
