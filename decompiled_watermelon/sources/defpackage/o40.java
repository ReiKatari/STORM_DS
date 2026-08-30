package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o40  reason: default package */
/* loaded from: classes.dex */
public final class o40 implements db6 {
    public static final m40 a = new Object();
    public static final boolean b;

    /* JADX WARN: Type inference failed for: r0v0, types: [m40, java.lang.Object] */
    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, n40.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        b = z;
    }

    @Override // defpackage.db6
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.db6
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && !applicationProtocol.equals("")) {
            return applicationProtocol;
        }
        return null;
    }

    @Override // defpackage.db6
    public final boolean c() {
        return b;
    }

    @Override // defpackage.db6
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            fo4 fo4Var = fo4.a;
            parameters.setApplicationProtocols((String[]) jo1.p(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
