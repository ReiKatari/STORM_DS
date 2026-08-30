package ti;

import fj.a0;
import fj.z;
import p1.c1;
import pi.d0;
import pi.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements pi.s {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13188a = new Object();

    /* JADX WARN: Type inference failed for: r2v1, types: [e9.a, java.lang.Object] */
    @Override // pi.s
    public final d0 a(ui.g gVar) {
        Object gVar2;
        n nVar = gVar.f13556a;
        synchronized (nVar) {
            if (nVar.f13225i0) {
                if (nVar.f13222f0 || nVar.f13221e0 || nVar.f13224h0 || nVar.f13223g0) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        g gVar3 = nVar.Z;
        gVar3.getClass();
        o e6 = gVar3.e();
        x xVar = nVar.A;
        e6.getClass();
        xVar.getClass();
        int i2 = gVar.f13562g;
        c1 c1Var = e6.f13235h;
        wi.p pVar = e6.f13236i;
        if (pVar != null) {
            gVar2 = new wi.q(xVar, e6, gVar, pVar);
        } else {
            e6.f13232e.setSoTimeout(i2);
            ((a0) c1Var.B).A.f().g(i2);
            ((z) c1Var.L).A.f().g(gVar.f13563h);
            gVar2 = new vi.g(xVar, e6, c1Var);
        }
        gVar3.getClass();
        ?? obj = new Object();
        obj.f4415b = nVar;
        obj.f4416c = gVar3;
        obj.f4417d = gVar2;
        nVar.f13220d0 = obj;
        nVar.f13227k0 = obj;
        synchronized (nVar) {
            nVar.f13221e0 = true;
            nVar.f13222f0 = true;
        }
        if (!nVar.f13226j0) {
            return ui.g.a(gVar, 0, obj, null, 61).b(gVar.f13560e);
        }
        fj.j.h("Canceled");
        return null;
    }
}
