package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ix0  reason: default package */
/* loaded from: classes.dex */
public final class ix0 implements kc1 {
    @Override // defpackage.kc1
    public final boolean a(SSLSocket sSLSocket) {
        if (kx0.b && Conscrypt.isConscrypt(sSLSocket)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [db6, java.lang.Object] */
    @Override // defpackage.kc1
    public final db6 c(SSLSocket sSLSocket) {
        return new Object();
    }
}
