package gj;

import fj.b0;
import fj.c0;
import fj.g0;
import fj.i0;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements g0 {
    public final InputStream A;
    public final i B;
    public final /* synthetic */ b9.e L;

    public e(b9.e eVar) {
        this.L = eVar;
        Socket socket = (Socket) eVar.B;
        this.A = socket.getInputStream();
        this.B = new i(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i2;
        b9.e eVar = this.L;
        i iVar = this.B;
        iVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) eVar.L;
            Socket socket = (Socket) eVar.B;
            atomicInteger.getClass();
            while (true) {
                int i10 = atomicInteger.get();
                if ((i10 & 2) != 0) {
                    i2 = 0;
                    break;
                }
                int i11 = i10 | 2;
                if (atomicInteger.compareAndSet(i10, i11)) {
                    i2 = i11;
                    break;
                }
            }
            if (i2 != 0) {
                if (i2 != 3) {
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

    @Override // fj.g0
    public final i0 f() {
        return this.B;
    }

    @Override // fj.g0
    public final long k(fj.e eVar, long j2) {
        eVar.getClass();
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 == 0) {
            return 0L;
        }
        if (i2 >= 0) {
            i iVar = this.B;
            iVar.f();
            b0 a02 = eVar.a0(1);
            int min = (int) Math.min(j2, 8192 - a02.f4978c);
            try {
                iVar.h();
                try {
                    int read = this.A.read(a02.f4976a, a02.f4978c, min);
                    if (!iVar.i()) {
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
                    }
                    throw iVar.j(null);
                } catch (IOException e6) {
                    if (!iVar.i()) {
                        throw e6;
                    }
                    throw iVar.j(e6);
                }
            } catch (AssertionError e10) {
                if (m.a(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }
        a0.j.e(kc.a.e(j2, "byteCount < 0: "));
        return 0L;
    }

    public final String toString() {
        return "source(" + ((Socket) this.L.B) + ')';
    }
}
