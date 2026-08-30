package vi;

import a0.j;
import fj.e0;
import fj.i0;
import fj.o;
import fj.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements e0 {
    public final o A;
    public boolean B;
    public final /* synthetic */ g L;

    public b(g gVar) {
        this.L = gVar;
        this.A = new o(((z) gVar.f13840c.L).A.f());
    }

    @Override // fj.e0
    public final void A(fj.e eVar, long j2) {
        if (!this.B) {
            if (j2 == 0) {
                return;
            }
            z zVar = (z) this.L.f13840c.L;
            if (!zVar.L) {
                zVar.B.g0(j2);
                zVar.d();
                zVar.P("\r\n");
                zVar.A(eVar, j2);
                zVar.P("\r\n");
                return;
            }
            j.p("closed");
            return;
        }
        j.p("closed");
    }

    @Override // fj.e0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.B) {
            return;
        }
        this.B = true;
        ((z) this.L.f13840c.L).P("0\r\n\r\n");
        o oVar = this.A;
        i0 i0Var = oVar.f4990e;
        oVar.f4990e = i0.f4986d;
        i0Var.a();
        i0Var.b();
        this.L.f13841d = 3;
    }

    @Override // fj.e0
    public final i0 f() {
        return this.A;
    }

    @Override // fj.e0, java.io.Flushable
    public final synchronized void flush() {
        if (this.B) {
            return;
        }
        ((z) this.L.f13840c.L).flush();
    }
}
