package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i01  reason: default package */
/* loaded from: classes.dex */
public final class i01 implements sm6 {
    public static final g01 a = new Object();
    public static final boolean b;

    /* JADX WARN: Type inference failed for: r0v0, types: [g01, java.lang.Object] */
    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, h01.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (h01.a()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    @Override // defpackage.sm6
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.sm6
    public final boolean b() {
        return b;
    }

    @Override // defpackage.sm6
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.sm6
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            kx4 kx4Var = kx4.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) q61.j(list).toArray(new String[0]));
        }
    }
}
