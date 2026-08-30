package l9;

import a4.n;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import he.g;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p8.v;
import v8.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends ConnectivityManager.NetworkCallback {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f9004c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9005a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9006b;

    public f(g gVar) {
        this.f9005a = 1;
        this.f9006b = gVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f9005a) {
            case 0:
                n.i((n) this.f9006b, network, true);
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z10) {
        switch (this.f9005a) {
            case 2:
                network.getClass();
                if (network.equals(((v8.g) this.f9006b).f13769g.getActiveNetwork())) {
                    v e6 = v.e();
                    String str = h.f13773a;
                    e6.a(str, "Network blocked status changed: " + z10);
                    v8.g gVar = (v8.g) this.f9006b;
                    Object obj = gVar.f13766e;
                    if (obj == null) {
                        obj = gVar.d();
                    }
                    t8.e eVar = (t8.e) obj;
                    v8.g gVar2 = (v8.g) this.f9006b;
                    synchronized (gVar2.f13770h) {
                        if (gVar2.f13771i != z10) {
                            gVar2.f13771i = z10;
                            ((v8.g) this.f9006b).f(new t8.e(eVar.f13138a, eVar.f13139b, eVar.f13140c, eVar.f13141d, z10));
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z10);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        t8.e a10;
        switch (this.f9005a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                network.getClass();
                networkCapabilities.getClass();
                v.e().a(t8.h.f13149a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((g) this.f9006b).k(t8.a.f13135a);
                return;
            case 2:
                network.getClass();
                networkCapabilities.getClass();
                v e6 = v.e();
                String str = h.f13773a;
                e6.a(str, "Network capabilities changed: " + networkCapabilities);
                v8.g gVar = (v8.g) this.f9006b;
                if (Build.VERSION.SDK_INT >= 28) {
                    a10 = h.b(networkCapabilities, gVar.f13771i);
                } else {
                    a10 = h.a(gVar.f13769g, gVar.f13771i);
                }
                gVar.f(a10);
                return;
            case 3:
                network.getClass();
                networkCapabilities.getClass();
                boolean hasCapability = networkCapabilities.hasCapability(16);
                bd.v vVar = (bd.v) this.f9006b;
                if (hasCapability) {
                    vVar.a(vf.a.CONNECTED);
                    return;
                } else {
                    vVar.a(vf.a.DISCONNECTED);
                    return;
                }
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        switch (this.f9005a) {
            case 0:
                n.i((n) this.f9006b, network, false);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                network.getClass();
                v.e().a(t8.h.f13149a, "NetworkRequestConstraintController onLost callback");
                ((g) this.f9006b).k(new t8.b(7));
                return;
            case 2:
                network.getClass();
                v.e().a(h.f13773a, "Network connection lost");
                ((v8.g) this.f9006b).f(new t8.e(false, false, false, false, false));
                return;
            default:
                super.onLost(network);
                return;
        }
    }

    public /* synthetic */ f(int i2, Object obj) {
        this.f9005a = i2;
        this.f9006b = obj;
    }
}
