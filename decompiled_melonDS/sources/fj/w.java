package fj;

import java.io.FileOutputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w implements e0 {
    public final FileOutputStream A;
    public final i0 B;

    public w(FileOutputStream fileOutputStream, i0 i0Var) {
        this.A = fileOutputStream;
        this.B = i0Var;
    }

    @Override // fj.e0
    public final void A(e eVar, long j2) {
        d0.d.K(eVar.B, 0L, j2);
        while (j2 > 0) {
            this.B.f();
            b0 b0Var = eVar.A;
            b0Var.getClass();
            int min = (int) Math.min(j2, b0Var.f4978c - b0Var.f4977b);
            this.A.write(b0Var.f4976a, b0Var.f4977b, min);
            int i2 = b0Var.f4977b + min;
            b0Var.f4977b = i2;
            long j10 = min;
            j2 -= j10;
            eVar.B -= j10;
            if (i2 == b0Var.f4978c) {
                eVar.A = b0Var.a();
                c0.a(b0Var);
            }
        }
    }

    @Override // fj.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // fj.e0
    public final i0 f() {
        return this.B;
    }

    @Override // fj.e0, java.io.Flushable
    public final void flush() {
        this.A.flush();
    }

    public final String toString() {
        return "sink(" + this.A + ')';
    }
}
