package gj;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends fj.b {

    /* renamed from: n  reason: collision with root package name */
    public final Socket f5692n;

    public i(Socket socket) {
        this.f5692n = socket;
    }

    @Override // fj.b
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // fj.b
    public final void k() {
        Socket socket = this.f5692n;
        try {
            socket.close();
        } catch (AssertionError e6) {
            if (m.a(e6)) {
                Logger logger = m.f5711a;
                Level level = Level.WARNING;
                logger.log(level, "Failed to close timed out socket " + socket, (Throwable) e6);
                return;
            }
            throw e6;
        } catch (Exception e10) {
            Logger logger2 = m.f5711a;
            Level level2 = Level.WARNING;
            logger2.log(level2, "Failed to close timed out socket " + socket, (Throwable) e10);
        }
    }
}
