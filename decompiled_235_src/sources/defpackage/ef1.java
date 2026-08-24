package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ef1  reason: default package */
/* loaded from: classes.dex */
public final class ef1 implements in6 {
    public final InputStream A;
    public final tm6 B;
    public final /* synthetic */ eb L;

    public ef1(eb ebVar) {
        this.L = ebVar;
        Socket socket = (Socket) ebVar.B;
        this.A = socket.getInputStream();
        this.B = new tm6(socket);
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
            tm6 tm6Var = this.B;
            tm6Var.f();
            o96 j0 = k80Var.j0(1);
            int min = (int) Math.min(j, 8192 - j0.c);
            try {
                tm6Var.i();
                try {
                    int read = this.A.read(j0.a, j0.c, min);
                    if (!tm6Var.j()) {
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
                    }
                    throw tm6Var.k(null);
                } catch (IOException e) {
                    if (!tm6Var.j()) {
                        throw e;
                    }
                    throw tm6Var.k(e);
                }
            } catch (AssertionError e2) {
                if (xy7.a(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        }
        i.f(lb1.h(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        eb ebVar = this.L;
        tm6 tm6Var = this.B;
        tm6Var.i();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) ebVar.L;
            Socket socket = (Socket) ebVar.B;
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
                if (!tm6Var.j()) {
                    return;
                }
                throw tm6Var.k(null);
            }
        } catch (IOException e) {
            if (!tm6Var.j()) {
                throw e;
            }
            throw tm6Var.k(e);
        } finally {
            tm6Var.j();
        }
    }

    public final String toString() {
        return "source(" + ((Socket) this.L.B) + ')';
    }
}
