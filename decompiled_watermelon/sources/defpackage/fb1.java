package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fb1  reason: default package */
/* loaded from: classes.dex */
public final class fb1 implements g76 {
    public final OutputStream A;
    public final eb6 B;
    public final /* synthetic */ q9 L;

    public fb1(q9 q9Var) {
        this.L = q9Var;
        Socket socket = (Socket) q9Var.B;
        this.A = socket.getOutputStream();
        this.B = new eb6(socket);
    }

    @Override // defpackage.g76, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        OutputStream outputStream = this.A;
        q9 q9Var = this.L;
        eb6 eb6Var = this.B;
        eb6Var.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) q9Var.L;
            Socket socket = (Socket) q9Var.B;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
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

    @Override // defpackage.g76
    public final kt6 f() {
        return this.B;
    }

    @Override // defpackage.g76, java.io.Flushable
    public final void flush() {
        eb6 eb6Var = this.B;
        eb6Var.h();
        try {
            this.A.flush();
            if (!eb6Var.i()) {
                return;
            }
            throw eb6Var.j(null);
        } catch (IOException e) {
            if (!eb6Var.i()) {
                throw e;
            }
            throw eb6Var.j(e);
        } finally {
            eb6Var.i();
        }
    }

    @Override // defpackage.g76
    public final void l(f60 f60Var, long j) {
        a53.q(f60Var.B, 0L, j);
        while (j > 0) {
            eb6 eb6Var = this.B;
            eb6Var.f();
            cy5 cy5Var = f60Var.A;
            cy5Var.getClass();
            int min = (int) Math.min(j, cy5Var.c - cy5Var.b);
            eb6Var.h();
            try {
                try {
                    this.A.write(cy5Var.a, cy5Var.b, min);
                    if (!eb6Var.i()) {
                        int i = cy5Var.b + min;
                        cy5Var.b = i;
                        long j2 = min;
                        j -= j2;
                        f60Var.B -= j2;
                        if (i == cy5Var.c) {
                            f60Var.A = cy5Var.a();
                            fy5.a(cy5Var);
                        }
                    } else {
                        throw eb6Var.j(null);
                    }
                } catch (IOException e) {
                    if (!eb6Var.i()) {
                        throw e;
                    }
                    throw eb6Var.j(e);
                }
            } catch (Throwable th) {
                eb6Var.i();
                throw th;
            }
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.L.B) + ')';
    }
}
