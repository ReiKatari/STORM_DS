package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gb1  reason: default package */
/* loaded from: classes.dex */
public final class gb1 implements sb6 {
    public final InputStream A;
    public final eb6 B;
    public final /* synthetic */ q9 L;

    public gb1(q9 q9Var) {
        this.L = q9Var;
        Socket socket = (Socket) q9Var.B;
        this.A = socket.getInputStream();
        this.B = new eb6(socket);
    }

    @Override // defpackage.sb6
    public final long L(f60 f60Var, long j) {
        f60Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            eb6 eb6Var = this.B;
            eb6Var.f();
            cy5 f0 = f60Var.f0(1);
            int min = (int) Math.min(j, 8192 - f0.c);
            try {
                eb6Var.h();
                try {
                    int read = this.A.read(f0.a, f0.c, min);
                    if (!eb6Var.i()) {
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
                    }
                    throw eb6Var.j(null);
                } catch (IOException e) {
                    if (!eb6Var.i()) {
                        throw e;
                    }
                    throw eb6Var.j(e);
                }
            } catch (AssertionError e2) {
                if (fk7.a(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        }
        i.g(wh1.h(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        q9 q9Var = this.L;
        eb6 eb6Var = this.B;
        eb6Var.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) q9Var.L;
            Socket socket = (Socket) q9Var.B;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isInputShutdown()) {
                        try {
                            socket.shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.A.close();
                        }
                    } else {
                        return;
                    }
                } else {
                    socket.close();
                }
                if (!eb6Var.i()) {
                    return;
                }
                throw eb6Var.j(null);
            }
        } catch (IOException e) {
            if (!eb6Var.i()) {
                throw e;
            }
            throw eb6Var.j(e);
        } finally {
            eb6Var.i();
        }
    }

    @Override // defpackage.sb6
    public final kt6 f() {
        return this.B;
    }

    public final String toString() {
        return "source(" + ((Socket) this.L.B) + ')';
    }
}
