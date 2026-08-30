package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eb6  reason: default package */
/* loaded from: classes.dex */
public final class eb6 extends xv {
    public final Socket n;

    public eb6(Socket socket) {
        this.n = socket;
    }

    @Override // defpackage.xv
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // defpackage.xv
    public final void k() {
        Socket socket = this.n;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (fk7.a(e)) {
                Logger logger = fk7.a;
                Level level = Level.WARNING;
                logger.log(level, "Failed to close timed out socket " + socket, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            Logger logger2 = fk7.a;
            Level level2 = Level.WARNING;
            logger2.log(level2, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
