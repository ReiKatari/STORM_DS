package d9;

import fj.g0;
import gk.y;
import java.io.IOException;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends fj.n {
    public final /* synthetic */ int B = 0;
    public Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y yVar, fj.g gVar) {
        super(gVar);
        this.L = yVar;
    }

    @Override // fj.n, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.B) {
            case 2:
                ((pi.c) this.L).L.close();
                super.close();
                return;
            default:
                super.close();
                return;
        }
    }

    @Override // fj.n, fj.g0
    public long k(fj.e eVar, long j2) {
        switch (this.B) {
            case 0:
                try {
                    return super.k(eVar, j2);
                } catch (Exception e6) {
                    this.L = e6;
                    throw e6;
                }
            case DSiCameraSource.FrontCamera /* 1 */:
                try {
                    return super.k(eVar, j2);
                } catch (IOException e10) {
                    ((y) this.L).X = e10;
                    throw e10;
                }
            default:
                return super.k(eVar, j2);
        }
    }

    public /* synthetic */ b(g0 g0Var) {
        super(g0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g0 g0Var, pi.c cVar) {
        super(g0Var);
        this.L = cVar;
    }
}
