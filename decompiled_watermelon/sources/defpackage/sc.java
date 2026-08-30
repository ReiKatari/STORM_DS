package defpackage;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sc  reason: default package */
/* loaded from: classes.dex */
public final class sc implements db6 {
    @Override // defpackage.db6
    public final boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // defpackage.db6
    public final String b(SSLSocket sSLSocket) {
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

    @Override // defpackage.db6
    public final boolean c() {
        fo4 fo4Var = fo4.a;
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @Override // defpackage.db6
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            fo4 fo4Var = fo4.a;
            sSLParameters.setApplicationProtocols((String[]) jo1.p(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
