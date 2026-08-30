package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kx0  reason: default package */
/* loaded from: classes.dex */
public final class kx0 implements db6 {
    public static final ix0 a = new Object();
    public static final boolean b;

    /* JADX WARN: Type inference failed for: r0v0, types: [ix0, java.lang.Object] */
    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, jx0.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (jx0.a()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    @Override // defpackage.db6
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.db6
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
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
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            fo4 fo4Var = fo4.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) jo1.p(list).toArray(new String[0]));
        }
    }
}
