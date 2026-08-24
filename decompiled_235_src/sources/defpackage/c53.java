package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c53  reason: default package */
/* loaded from: classes.dex */
public final class c53 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public final Object b;

    public c53(bi2 bi2Var) {
        this.a = 0;
        this.b = bi2Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 3:
                m44.b((m44) this.b, network, true);
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
                if (network.equals(((if4) this.b).g.getActiveNetwork())) {
                    ga0 f = ga0.f();
                    String str = hf4.a;
                    f.b(str, "Network blocked status changed: " + z);
                    if4 if4Var = (if4) this.b;
                    Object obj = if4Var.e;
                    if (obj == null) {
                        obj = if4Var.d();
                    }
                    gf4 gf4Var = (gf4) obj;
                    if4 if4Var2 = (if4) this.b;
                    synchronized (if4Var2.h) {
                        if (if4Var2.i != z) {
                            if4Var2.i = z;
                            ((if4) this.b).f(new gf4(gf4Var.a, gf4Var.b, gf4Var.c, gf4Var.d, z));
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
                ga0.f().b(zv7.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((bi2) this.b).g(v21.a);
                return;
            case 1:
                network.getClass();
                networkCapabilities.getClass();
                boolean hasCapability = networkCapabilities.hasCapability(16);
                r35 r35Var = (r35) this.b;
                if (hasCapability) {
                    r35Var.c(ue4.CONNECTED);
                    return;
                } else {
                    r35Var.c(ue4.DISCONNECTED);
                    return;
                }
            case 2:
                network.getClass();
                networkCapabilities.getClass();
                ga0 f = ga0.f();
                String str = hf4.a;
                f.b(str, "Network capabilities changed: " + networkCapabilities);
                if4 if4Var = (if4) this.b;
                if4Var.f(hf4.a(if4Var.g, if4Var.i));
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
                ga0.f().b(zv7.a, "NetworkRequestConstraintController onLost callback");
                ((bi2) obj).g(new w21(7));
                return;
            case 1:
                network.getClass();
                ((r35) obj).c(ue4.DISCONNECTED);
                return;
            case 2:
                network.getClass();
                ga0.f().b(hf4.a, "Network connection lost");
                ((if4) obj).f(new gf4(false, false, false, false, false));
                return;
            default:
                m44.b((m44) obj, network, false);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.a) {
            case 1:
                ((r35) this.b).c(ue4.DISCONNECTED);
                return;
            default:
                super.onUnavailable();
                return;
        }
    }

    public /* synthetic */ c53(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
