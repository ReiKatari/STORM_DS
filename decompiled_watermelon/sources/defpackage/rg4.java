package defpackage;

import java.io.FileOutputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rg4  reason: default package */
/* loaded from: classes.dex */
public final class rg4 implements g76 {
    public final FileOutputStream A;
    public final kt6 B;

    public rg4(FileOutputStream fileOutputStream, kt6 kt6Var) {
        this.A = fileOutputStream;
        this.B = kt6Var;
    }

    @Override // defpackage.g76, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // defpackage.g76
    public final kt6 f() {
        return this.B;
    }

    @Override // defpackage.g76, java.io.Flushable
    public final void flush() {
        this.A.flush();
    }

    @Override // defpackage.g76
    public final void l(f60 f60Var, long j) {
        a53.q(f60Var.B, 0L, j);
        while (j > 0) {
            this.B.f();
            cy5 cy5Var = f60Var.A;
            cy5Var.getClass();
            int min = (int) Math.min(j, cy5Var.c - cy5Var.b);
            this.A.write(cy5Var.a, cy5Var.b, min);
            int i = cy5Var.b + min;
            cy5Var.b = i;
            long j2 = min;
            j -= j2;
            f60Var.B -= j2;
            if (i == cy5Var.c) {
                f60Var.A = cy5Var.a();
                fy5.a(cy5Var);
            }
        }
    }

    public final String toString() {
        return "sink(" + this.A + ')';
    }
}
