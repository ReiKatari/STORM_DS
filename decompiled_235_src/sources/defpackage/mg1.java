package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mg1  reason: default package */
/* loaded from: classes.dex */
public final class mg1 implements sm6 {
    public final lg1 a;
    public sm6 b;

    public mg1(lg1 lg1Var) {
        this.a = lg1Var;
    }

    @Override // defpackage.sm6
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // defpackage.sm6
    public final boolean b() {
        return true;
    }

    @Override // defpackage.sm6
    public final String c(SSLSocket sSLSocket) {
        sm6 e = e(sSLSocket);
        if (e != null) {
            return e.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.sm6
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        sm6 e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized sm6 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.j(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
