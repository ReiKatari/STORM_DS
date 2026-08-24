package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r60  reason: default package */
/* loaded from: classes.dex */
public final class r60 implements sm6 {
    public static final p60 a = new Object();
    public static final boolean b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p60] */
    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, q60.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        b = z;
    }

    @Override // defpackage.sm6
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.sm6
    public final boolean b() {
        return b;
    }

    @Override // defpackage.sm6
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && !applicationProtocol.equals("")) {
            return applicationProtocol;
        }
        return null;
    }

    @Override // defpackage.sm6
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            kx4 kx4Var = kx4.a;
            parameters.setApplicationProtocols((String[]) q61.j(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
