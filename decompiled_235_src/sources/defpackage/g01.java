package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g01  reason: default package */
/* loaded from: classes.dex */
public final class g01 implements lg1 {
    @Override // defpackage.lg1
    public final boolean a(SSLSocket sSLSocket) {
        if (i01.b && Conscrypt.isConscrypt(sSLSocket)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, sm6] */
    @Override // defpackage.lg1
    public final sm6 j(SSLSocket sSLSocket) {
        return new Object();
    }
}
