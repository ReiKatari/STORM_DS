package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vt2  reason: default package */
/* loaded from: classes.dex */
public final class vt2 extends xv {
    public final /* synthetic */ wt2 n;

    public vt2(wt2 wt2Var) {
        this.n = wt2Var;
    }

    @Override // defpackage.xv
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // defpackage.xv
    public final void k() {
        this.n.e(l12.CANCEL);
        pt2 pt2Var = this.n.B;
        synchronized (pt2Var) {
            long j = pt2Var.i0;
            long j2 = pt2Var.h0;
            if (j < j2) {
                return;
            }
            pt2Var.h0 = j2 + 1;
            pt2Var.j0 = System.nanoTime() + 1000000000;
            en6.b(pt2Var.c0, b31.q(new StringBuilder(), pt2Var.L, " ping"), new b5(29, pt2Var));
        }
    }

    public final void l() {
        if (!i()) {
            return;
        }
        throw j(null);
    }
}
