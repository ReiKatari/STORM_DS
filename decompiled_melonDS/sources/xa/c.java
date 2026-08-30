package xa;

import java.util.Collection;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends ua.u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14464a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14465b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14466c;

    public c(o oVar, wa.p pVar) {
        this.f14465b = oVar;
        this.f14466c = pVar;
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        switch (this.f14464a) {
            case 0:
                if (aVar.d0() == cb.b.NULL) {
                    aVar.Z();
                    return null;
                }
                Collection collection = (Collection) ((wa.p) this.f14466c).d();
                aVar.d();
                while (aVar.F()) {
                    collection.add(((o) this.f14465b).f14504c.b(aVar));
                }
                aVar.v();
                return collection;
            default:
                Class cls = (Class) this.f14465b;
                Object b10 = ((ua.u) ((v0) this.f14466c).L).b(aVar);
                if (b10 != null && !cls.isInstance(b10)) {
                    String name = cls.getName();
                    String name2 = b10.getClass().getName();
                    String B = aVar.B(true);
                    throw new RuntimeException("Expected a " + name + " but was " + name2 + "; at path " + B);
                }
                return b10;
        }
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        switch (this.f14464a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    cVar.F();
                    return;
                }
                cVar.i();
                for (Object obj2 : collection) {
                    ((o) this.f14465b).c(cVar, obj2);
                }
                cVar.v();
                return;
            default:
                ((ua.u) ((v0) this.f14466c).L).c(cVar, obj);
                return;
        }
    }

    public c(v0 v0Var, Class cls) {
        this.f14466c = v0Var;
        this.f14465b = cls;
    }
}
