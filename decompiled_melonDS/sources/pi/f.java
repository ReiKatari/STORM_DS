package pi;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements Closeable, Flushable {
    public final ri.h A;

    public f(File file, long j2) {
        fj.t tVar = fj.k.A;
        String str = fj.x.B;
        fj.x n10 = x8.e.n(file);
        tVar.getClass();
        si.c cVar = si.c.f12936l;
        cVar.getClass();
        this.A = new ri.h(tVar, n10, j2, cVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    public final void d(x0 x0Var) {
        x0Var.getClass();
        ri.h hVar = this.A;
        String r5 = p7.a.r((r) x0Var.f14089b);
        synchronized (hVar) {
            r5.getClass();
            hVar.v();
            hVar.d();
            ri.h.J(r5);
            ri.d dVar = (ri.d) hVar.f12766c0.get(r5);
            if (dVar == null) {
                return;
            }
            hVar.H(dVar);
            if (hVar.Z <= hVar.L) {
                hVar.f12772i0 = false;
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.A.flush();
    }
}
