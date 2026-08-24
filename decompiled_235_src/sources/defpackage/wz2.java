package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wz2  reason: default package */
/* loaded from: classes.dex */
public final class wz2 extends pw {
    public final /* synthetic */ xz2 n;

    public wz2(xz2 xz2Var) {
        this.n = xz2Var;
    }

    @Override // defpackage.pw
    public final IOException k(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // defpackage.pw
    public final void l() {
        this.n.e(a62.CANCEL);
        qz2 qz2Var = this.n.B;
        synchronized (qz2Var) {
            long j = qz2Var.j0;
            long j2 = qz2Var.i0;
            if (j < j2) {
                return;
            }
            qz2Var.i0 = j2 + 1;
            qz2Var.k0 = System.nanoTime() + 1000000000;
            pz6.b(qz2Var.d0, i61.n(new StringBuilder(), qz2Var.L, " ping"), 0L, new er2(qz2Var, 2), 6);
        }
    }

    public final void m() {
        if (!j()) {
            return;
        }
        throw k(null);
    }
}
