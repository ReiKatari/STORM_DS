package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d80  reason: default package */
/* loaded from: classes.dex */
public final class d80 implements Closeable, Flushable {
    public final gg1 A;

    public d80(File file, long j) {
        d93 d93Var = j62.A;
        String str = jk4.B;
        jk4 p = hm1.p(file);
        d93Var.getClass();
        fn6 fn6Var = fn6.l;
        fn6Var.getClass();
        this.A = new gg1(d93Var, p, j, fn6Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    public final void d(ka kaVar) {
        kaVar.getClass();
        gg1 gg1Var = this.A;
        String W = n40.W((hu2) kaVar.B);
        synchronized (gg1Var) {
            W.getClass();
            gg1Var.x();
            gg1Var.d();
            gg1.N(W);
            zf1 zf1Var = (zf1) gg1Var.d0.get(W);
            if (zf1Var == null) {
                return;
            }
            gg1Var.J(zf1Var);
            if (gg1Var.Z <= gg1Var.L) {
                gg1Var.j0 = false;
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.A.flush();
    }
}
