package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lc1  reason: default package */
/* loaded from: classes.dex */
public final class lc1 implements db6 {
    public final kc1 a;
    public db6 b;

    public lc1(kc1 kc1Var) {
        this.a = kc1Var;
    }

    @Override // defpackage.db6
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // defpackage.db6
    public final String b(SSLSocket sSLSocket) {
        db6 e = e(sSLSocket);
        if (e != null) {
            return e.b(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.db6
    public final boolean c() {
        return true;
    }

    @Override // defpackage.db6
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        db6 e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized db6 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
