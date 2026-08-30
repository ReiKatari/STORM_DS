package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yy2  reason: default package */
/* loaded from: classes.dex */
public final class yy2 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public final Object b;

    public yy2(gi2 gi2Var) {
        this.a = 0;
        this.b = gi2Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 3:
                os.h((os) this.b, network, true);
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.a) {
            case 2:
                network.getClass();
                if (network.equals(((t64) this.b).g.getActiveNetwork())) {
                    y70 f = y70.f();
                    String str = s64.a;
                    f.b(str, "Network blocked status changed: " + z);
                    t64 t64Var = (t64) this.b;
                    Object obj = t64Var.e;
                    if (obj == null) {
                        obj = t64Var.d();
                    }
                    r64 r64Var = (r64) obj;
                    t64 t64Var2 = (t64) this.b;
                    synchronized (t64Var2.h) {
                        if (t64Var2.i != z) {
                            t64Var2.i = z;
                            ((t64) this.b).f(new r64(r64Var.a, r64Var.b, r64Var.c, r64Var.d, z));
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 0:
                network.getClass();
                networkCapabilities.getClass();
                y70.f().b(zg7.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((gi2) this.b).n(qz0.a);
                return;
            case 1:
                network.getClass();
                networkCapabilities.getClass();
                boolean hasCapability = networkCapabilities.hasCapability(16);
                nu4 nu4Var = (nu4) this.b;
                if (hasCapability) {
                    nu4Var.c(g64.CONNECTED);
                    return;
                } else {
                    nu4Var.c(g64.DISCONNECTED);
                    return;
                }
            case 2:
                network.getClass();
                networkCapabilities.getClass();
                y70 f = y70.f();
                String str = s64.a;
                f.b(str, "Network capabilities changed: " + networkCapabilities);
                t64 t64Var = (t64) this.b;
                t64Var.f(s64.a(t64Var.g, t64Var.i));
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                network.getClass();
                y70.f().b(zg7.a, "NetworkRequestConstraintController onLost callback");
                ((gi2) obj).n(new rz0(7));
                return;
            case 1:
                network.getClass();
                ((nu4) obj).c(g64.DISCONNECTED);
                return;
            case 2:
                network.getClass();
                y70.f().b(s64.a, "Network connection lost");
                ((t64) obj).f(new r64(false, false, false, false, false));
                return;
            default:
                os.h((os) obj, network, false);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.a) {
            case 1:
                ((nu4) this.b).c(g64.DISCONNECTED);
                return;
            default:
                super.onUnavailable();
                return;
        }
    }

    public /* synthetic */ yy2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
