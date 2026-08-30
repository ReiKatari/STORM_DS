package wi;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kf.s0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w extends fj.b {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ x f14284n;

    public w(x xVar) {
        this.f14284n = xVar;
    }

    @Override // fj.b
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // fj.b
    public final void k() {
        this.f14284n.e(c.CANCEL);
        p pVar = this.f14284n.B;
        synchronized (pVar) {
            long j2 = pVar.f14265h0;
            long j10 = pVar.f14264g0;
            if (j2 < j10) {
                return;
            }
            pVar.f14264g0 = j10 + 1;
            pVar.f14266i0 = System.nanoTime() + 1000000000;
            si.b.b(pVar.f14259b0, w.d.s(new StringBuilder(), pVar.L, " ping"), new s0(20, pVar));
        }
    }

    public final void l() {
        if (!i()) {
            return;
        }
        throw j(null);
    }
}
