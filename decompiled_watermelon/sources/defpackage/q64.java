package defpackage;

import android.net.NetworkInfo;
import android.net.Uri;
import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q64  reason: default package */
/* loaded from: classes.dex */
public final class q64 extends fb5 {
    public final ka3 a;
    public final af6 b;

    public q64(ka3 ka3Var, af6 af6Var) {
        this.a = ka3Var;
        this.b = af6Var;
    }

    @Override // defpackage.fb5
    public final boolean a(n85 n85Var) {
        String scheme = ((Uri) n85Var.B).getScheme();
        if (!"http".equals(scheme) && !"https".equals(scheme)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fb5
    public final int b() {
        return 2;
    }

    @Override // defpackage.fb5
    public final oi c(n85 n85Var, int i) {
        e80 e80Var;
        ln4 ln4Var;
        if (i != 0) {
            if (l64.isOfflineOnly(i)) {
                e80Var = e80.o;
            } else {
                e80Var = new e80(!l64.shouldReadFromDiskCache(i), !l64.shouldWriteToDiskCache(i), -1, -1, false, false, false, -1, -1, false, false, false, null);
            }
        } else {
            e80Var = null;
        }
        r9 r9Var = new r9(13);
        r9Var.I(((Uri) n85Var.B).toString());
        if (e80Var != null) {
            r9Var.l(e80Var);
        }
        ka kaVar = new ka(r9Var);
        zb4 zb4Var = (zb4) this.a.B;
        zb4Var.getClass();
        ec5 f = new w45(zb4Var, kaVar).f();
        gc5 gc5Var = f.Z;
        if (f.l0) {
            if (f.e0 == null) {
                ln4Var = ln4.NETWORK;
            } else {
                ln4Var = ln4.DISK;
            }
            if (ln4Var == ln4.DISK && gc5Var.d() == 0) {
                gc5Var.close();
                throw new IOException("Received response with 0 content-length header.");
            }
            if (ln4Var == ln4.NETWORK && gc5Var.d() > 0) {
                long d = gc5Var.d();
                og1 og1Var = this.b.b;
                og1Var.sendMessage(og1Var.obtainMessage(4, Long.valueOf(d)));
            }
            return new oi(gc5Var.p(), ln4Var);
        }
        gc5Var.close();
        throw new p64(f.R);
    }

    @Override // defpackage.fb5
    public final boolean d(NetworkInfo networkInfo) {
        if (networkInfo != null && !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }
}
