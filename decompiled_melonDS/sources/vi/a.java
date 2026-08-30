package vi;

import fj.a0;
import fj.g0;
import fj.i0;
import fj.o;
import java.io.IOException;
import pi.q;
import pi.r;
import pi.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a implements g0 {
    public final r A;
    public final o B;
    public boolean L;
    public final /* synthetic */ g R;

    public a(g gVar, r rVar) {
        rVar.getClass();
        this.R = gVar;
        this.A = rVar;
        this.B = new o(((a0) gVar.f13840c.B).A.f());
    }

    public final void d(q qVar) {
        x xVar;
        pi.b bVar;
        qVar.getClass();
        g gVar = this.R;
        int i2 = gVar.f13841d;
        if (i2 != 6) {
            if (i2 == 5) {
                o oVar = this.B;
                i0 i0Var = oVar.f4990e;
                oVar.f4990e = i0.f4986d;
                i0Var.a();
                i0Var.b();
                gVar.f13841d = 6;
                if (qVar.size() > 0 && (xVar = gVar.f13838a) != null && (bVar = xVar.f11836j) != null) {
                    ui.f.b(bVar, this.A, qVar);
                    return;
                }
                return;
            }
            int i10 = gVar.f13841d;
            throw new IllegalStateException("state: " + i10);
        }
    }

    @Override // fj.g0
    public final i0 f() {
        return this.B;
    }

    @Override // fj.g0
    public long k(fj.e eVar, long j2) {
        g gVar = this.R;
        eVar.getClass();
        try {
            return ((a0) gVar.f13840c.B).k(eVar, j2);
        } catch (IOException e6) {
            gVar.f13839b.h();
            d(g.f13837f);
            throw e6;
        }
    }
}
