package fj;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r implements g0 {
    public final InputStream A;
    public final i0 B;

    public r(InputStream inputStream, i0 i0Var) {
        inputStream.getClass();
        this.A = inputStream;
        this.B = i0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // fj.g0
    public final i0 f() {
        return this.B;
    }

    @Override // fj.g0
    public final long k(e eVar, long j2) {
        eVar.getClass();
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 == 0) {
            return 0L;
        }
        if (i2 >= 0) {
            try {
                this.B.f();
                b0 a02 = eVar.a0(1);
                int read = this.A.read(a02.f4976a, a02.f4978c, (int) Math.min(j2, 8192 - a02.f4978c));
                if (read == -1) {
                    if (a02.f4977b == a02.f4978c) {
                        eVar.A = a02.a();
                        c0.a(a02);
                        return -1L;
                    }
                    return -1L;
                }
                a02.f4978c += read;
                long j10 = read;
                eVar.B += j10;
                return j10;
            } catch (AssertionError e6) {
                if (gj.m.a(e6)) {
                    throw new IOException(e6);
                }
                throw e6;
            }
        }
        a0.j.e(kc.a.e(j2, "byteCount < 0: "));
        return 0L;
    }

    public final String toString() {
        return "source(" + this.A + ')';
    }
}
