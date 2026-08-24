package defpackage;

import android.net.NetworkInfo;
import android.net.Uri;
import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff4  reason: default package */
/* loaded from: classes.dex */
public final class ff4 extends xk5 {
    public final ss2 a;
    public final pq6 b;

    public ff4(ss2 ss2Var, pq6 pq6Var) {
        this.a = ss2Var;
        this.b = pq6Var;
    }

    @Override // defpackage.xk5
    public final boolean a(m44 m44Var) {
        String scheme = ((Uri) m44Var.B).getScheme();
        if (!"http".equals(scheme) && !"https".equals(scheme)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.xk5
    public final int b() {
        return 2;
    }

    @Override // defpackage.xk5
    public final aj c(m44 m44Var, int i) {
        ma0 ma0Var;
        qw4 qw4Var;
        if (i != 0) {
            if (ze4.isOfflineOnly(i)) {
                ma0Var = ma0.o;
            } else {
                ma0Var = new ma0(!ze4.shouldReadFromDiskCache(i), !ze4.shouldWriteToDiskCache(i), -1, -1, false, false, false, -1, -1, false, false, false, null);
            }
        } else {
            ma0Var = null;
        }
        s9 s9Var = new s9(13);
        s9Var.I(((Uri) m44Var.B).toString());
        if (ma0Var != null) {
            s9Var.l(ma0Var);
        }
        pa paVar = new pa(s9Var);
        xk4 xk4Var = this.a.B;
        xk4Var.getClass();
        wl5 e = new je5(xk4Var, paVar, false).e();
        yl5 yl5Var = e.Z;
        if (e.m0) {
            if (e.f0 == null) {
                qw4Var = qw4.NETWORK;
            } else {
                qw4Var = qw4.DISK;
            }
            if (qw4Var == qw4.DISK && yl5Var.h() == 0) {
                yl5Var.close();
                throw new IOException("Received response with 0 content-length header.");
            }
            if (qw4Var == qw4.NETWORK && yl5Var.h() > 0) {
                long h = yl5Var.h();
                sk1 sk1Var = this.b.b;
                sk1Var.sendMessage(sk1Var.obtainMessage(4, Long.valueOf(h)));
            }
            return new aj(yl5Var.n(), qw4Var);
        }
        yl5Var.close();
        throw new ef4(e.R);
    }

    @Override // defpackage.xk5
    public final boolean d(NetworkInfo networkInfo) {
        if (networkInfo != null && !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }
}
