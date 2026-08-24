package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: la0  reason: default package */
/* loaded from: classes.dex */
public final class la0 implements Closeable, Flushable {
    public final kk1 A;

    public la0(File file, long j) {
        xf3 xf3Var = db2.A;
        String str = lt4.B;
        lt4 q = w31.q(file);
        xf3Var.getClass();
        qz6 qz6Var = qz6.l;
        qz6Var.getClass();
        this.A = new kk1(xf3Var, q, j, qz6Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    public final void e(pa paVar) {
        paVar.getClass();
        kk1 kk1Var = this.A;
        String K = g04.K((i03) paVar.B);
        synchronized (kk1Var) {
            K.getClass();
            kk1Var.r();
            kk1Var.e();
            kk1.N(K);
            dk1 dk1Var = (dk1) kk1Var.e0.get(K);
            if (dk1Var == null) {
                return;
            }
            kk1Var.F(dk1Var);
            if (kk1Var.Z <= kk1Var.L) {
                kk1Var.k0 = false;
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.A.flush();
    }
}
