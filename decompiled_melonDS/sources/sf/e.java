package sf;

import ec.j;
import java.util.List;
import mc.t;
import oe.a0;
import ve.i;
import ve.o;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends j implements t {
    public /* synthetic */ a0 X;
    public /* synthetic */ ve.b Y;
    public /* synthetic */ bf.a Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ List f12892b0;

    /* renamed from: c0  reason: collision with root package name */
    public /* synthetic */ i f12893c0;

    public e(cc.c cVar) {
        super(6, cVar);
    }

    @Override // mc.t
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        e eVar = new e((cc.c) obj6);
        eVar.X = (a0) obj;
        eVar.Y = (ve.b) obj2;
        eVar.Z = (bf.a) obj3;
        eVar.f12892b0 = (List) obj4;
        eVar.f12893c0 = (i) obj5;
        return eVar.v(y.f14813a);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        a0 a0Var = this.X;
        ve.b bVar = this.Y;
        bf.a aVar = this.Z;
        List list = this.f12892b0;
        i iVar = this.f12893c0;
        dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        if (a0Var != null && bVar != null && aVar != null && list != null && iVar != null) {
            return new o(a0Var, bVar, aVar, list, iVar);
        }
        return null;
    }
}
