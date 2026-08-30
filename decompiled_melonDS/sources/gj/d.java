package gj;

import fj.b0;
import fj.c0;
import fj.e0;
import fj.i0;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements e0 {
    public final OutputStream A;
    public final i B;
    public final /* synthetic */ b9.e L;

    public d(b9.e eVar) {
        this.L = eVar;
        Socket socket = (Socket) eVar.B;
        this.A = socket.getOutputStream();
        this.B = new i(socket);
    }

    @Override // fj.e0
    public final void A(fj.e eVar, long j2) {
        d0.d.K(eVar.B, 0L, j2);
        while (j2 > 0) {
            i iVar = this.B;
            iVar.f();
            b0 b0Var = eVar.A;
            b0Var.getClass();
            int min = (int) Math.min(j2, b0Var.f4978c - b0Var.f4977b);
            iVar.h();
            try {
                try {
                    this.A.write(b0Var.f4976a, b0Var.f4977b, min);
                    if (!iVar.i()) {
                        int i2 = b0Var.f4977b + min;
                        b0Var.f4977b = i2;
                        long j10 = min;
                        j2 -= j10;
                        eVar.B -= j10;
                        if (i2 == b0Var.f4978c) {
                            eVar.A = b0Var.a();
                            c0.a(b0Var);
                        }
                    } else {
                        throw iVar.j(null);
                    }
                } catch (IOException e6) {
                    if (!iVar.i()) {
                        throw e6;
                    }
                    throw iVar.j(e6);
                }
            } catch (Throwable th2) {
                iVar.i();
                throw th2;
            }
        }
    }

    @Override // fj.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i2;
        OutputStream outputStream = this.A;
        b9.e eVar = this.L;
        i iVar = this.B;
        iVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) eVar.L;
            Socket socket = (Socket) eVar.B;
            atomicInteger.getClass();
            while (true) {
                int i10 = atomicInteger.get();
                if ((i10 & 1) != 0) {
                    i2 = 0;
                    break;
                }
                int i11 = i10 | 1;
                if (atomicInteger.compareAndSet(i10, i11)) {
                    i2 = i11;
                    break;
                }
            }
            if (i2 != 0) {
                if (i2 != 3) {
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
                if (!iVar.i()) {
                    return;
                }
                throw iVar.j(null);
            }
        } catch (IOException e6) {
            if (!iVar.i()) {
                throw e6;
            }
            throw iVar.j(e6);
        } finally {
            iVar.i();
        }
    }

    @Override // fj.e0
    public final i0 f() {
        return this.B;
    }

    @Override // fj.e0, java.io.Flushable
    public final void flush() {
        i iVar = this.B;
        iVar.h();
        try {
            this.A.flush();
            if (!iVar.i()) {
                return;
            }
            throw iVar.j(null);
        } catch (IOException e6) {
            if (!iVar.i()) {
                throw e6;
            }
            throw iVar.j(e6);
        } finally {
            iVar.i();
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.L.B) + ')';
    }
}
