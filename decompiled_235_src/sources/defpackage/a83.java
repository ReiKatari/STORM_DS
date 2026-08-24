package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a83  reason: default package */
/* loaded from: classes.dex */
public final class a83 implements in6 {
    public final InputStream A;
    public final b67 B;

    public a83(InputStream inputStream, b67 b67Var) {
        inputStream.getClass();
        this.A = inputStream;
        this.B = b67Var;
    }

    @Override // defpackage.in6
    public final b67 b() {
        return this.B;
    }

    @Override // defpackage.in6
    public final long b0(k80 k80Var, long j) {
        k80Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            try {
                this.B.f();
                o96 j0 = k80Var.j0(1);
                int read = this.A.read(j0.a, j0.c, (int) Math.min(j, 8192 - j0.c));
                if (read == -1) {
                    if (j0.b == j0.c) {
                        k80Var.A = j0.a();
                        r96.a(j0);
                        return -1L;
                    }
                    return -1L;
                }
                j0.c += read;
                long j2 = read;
                k80Var.B += j2;
                return j2;
            } catch (AssertionError e) {
                if (xy7.a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        i.f(lb1.h(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    public final String toString() {
        return "source(" + this.A + ')';
    }
}
