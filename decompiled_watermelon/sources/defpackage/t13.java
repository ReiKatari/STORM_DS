package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t13  reason: default package */
/* loaded from: classes.dex */
public final class t13 implements sb6 {
    public final InputStream A;
    public final kt6 B;

    public t13(InputStream inputStream, kt6 kt6Var) {
        inputStream.getClass();
        this.A = inputStream;
        this.B = kt6Var;
    }

    @Override // defpackage.sb6
    public final long L(f60 f60Var, long j) {
        f60Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            try {
                this.B.f();
                cy5 f0 = f60Var.f0(1);
                int read = this.A.read(f0.a, f0.c, (int) Math.min(j, 8192 - f0.c));
                if (read == -1) {
                    if (f0.b == f0.c) {
                        f60Var.A = f0.a();
                        fy5.a(f0);
                        return -1L;
                    }
                    return -1L;
                }
                f0.c += read;
                long j2 = read;
                f60Var.B += j2;
                return j2;
            } catch (AssertionError e) {
                if (fk7.a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        i.g(wh1.h(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // defpackage.sb6
    public final kt6 f() {
        return this.B;
    }

    public final String toString() {
        return "source(" + this.A + ')';
    }
}
