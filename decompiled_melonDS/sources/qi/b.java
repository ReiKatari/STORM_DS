package qi;

import od.x;
import p7.o;
import uc.h;
import zb.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends o {

    /* renamed from: c  reason: collision with root package name */
    public final nc.e f12544c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12545d;

    /* renamed from: e  reason: collision with root package name */
    public final o f12546e;

    public b(nc.e eVar, Object obj, o oVar) {
        obj.getClass();
        oVar.getClass();
        this.f12544c = eVar;
        this.f12545d = obj;
        this.f12546e = oVar;
    }

    @Override // p7.o
    public final Object i(nc.e eVar) {
        if (eVar.equals(this.f12544c)) {
            Class cls = eVar.f10259a;
            cls.getClass();
            return cls.cast(this.f12545d);
        }
        return this.f12546e.i(eVar);
    }

    @Override // p7.o
    public final o n(nc.e eVar, Object obj) {
        nc.e eVar2 = this.f12544c;
        boolean equals = eVar.equals(eVar2);
        o oVar = this.f12546e;
        if (!equals) {
            o n10 = oVar.n(eVar, null);
            if (n10 == oVar) {
                oVar = this;
            } else {
                oVar = new b(eVar2, this.f12545d, n10);
            }
        }
        if (obj != null) {
            return new b(eVar, obj, oVar);
        }
        return oVar;
    }

    public final String toString() {
        return l.Y(l.j0(h.L(h.J(this, new x(11)))), null, "{", "}", new x(12), 25);
    }
}
