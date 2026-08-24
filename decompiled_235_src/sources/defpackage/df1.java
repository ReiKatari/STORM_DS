package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: df1  reason: default package */
/* loaded from: classes.dex */
public final class df1 implements ui6 {
    public final OutputStream A;
    public final tm6 B;
    public final /* synthetic */ eb L;

    public df1(eb ebVar) {
        this.L = ebVar;
        Socket socket = (Socket) ebVar.B;
        this.A = socket.getOutputStream();
        this.B = new tm6(socket);
    }

    @Override // defpackage.ui6
    public final void O(k80 k80Var, long j) {
        hf.D(k80Var.B, 0L, j);
        while (j > 0) {
            tm6 tm6Var = this.B;
            tm6Var.f();
            o96 o96Var = k80Var.A;
            o96Var.getClass();
            int min = (int) Math.min(j, o96Var.c - o96Var.b);
            tm6Var.i();
            try {
                try {
                    this.A.write(o96Var.a, o96Var.b, min);
                    if (!tm6Var.j()) {
                        int i = o96Var.b + min;
                        o96Var.b = i;
                        long j2 = min;
                        j -= j2;
                        k80Var.B -= j2;
                        if (i == o96Var.c) {
                            k80Var.A = o96Var.a();
                            r96.a(o96Var);
                        }
                    } else {
                        throw tm6Var.k(null);
                    }
                } catch (IOException e) {
                    if (!tm6Var.j()) {
                        throw e;
                    }
                    throw tm6Var.k(e);
                }
            } catch (Throwable th) {
                tm6Var.j();
                throw th;
            }
        }
    }

    @Override // defpackage.ui6
    public final b67 b() {
        return this.B;
    }

    @Override // defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        OutputStream outputStream = this.A;
        eb ebVar = this.L;
        tm6 tm6Var = this.B;
        tm6Var.i();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) ebVar.L;
            Socket socket = (Socket) ebVar.B;
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

    @Override // defpackage.ui6, java.io.Flushable
    public final void flush() {
        tm6 tm6Var = this.B;
        tm6Var.i();
        try {
            this.A.flush();
            if (!tm6Var.j()) {
                return;
            }
            throw tm6Var.k(null);
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
        return "sink(" + ((Socket) this.L.B) + ')';
    }
}
