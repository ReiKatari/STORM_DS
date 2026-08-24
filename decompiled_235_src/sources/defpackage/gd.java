package defpackage;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gd  reason: default package */
/* loaded from: classes.dex */
public final class gd implements sm6 {
    @Override // defpackage.sm6
    public final boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // defpackage.sm6
    public final boolean b() {
        kx4 kx4Var = kx4.a;
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @Override // defpackage.sm6
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!applicationProtocol.equals("")) {
                    return applicationProtocol;
                }
                return null;
            }
            return null;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // defpackage.sm6
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            kx4 kx4Var = kx4.a;
            sSLParameters.setApplicationProtocols((String[]) q61.j(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
