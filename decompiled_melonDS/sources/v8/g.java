package v8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import p8.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: g  reason: collision with root package name */
    public final ConnectivityManager f13769g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f13770h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f13771i;

    /* renamed from: j  reason: collision with root package name */
    public final l9.f f13772j;

    public g(Context context, z8.a aVar) {
        super(context, aVar);
        Object systemService = ((Context) this.f13764c).getSystemService("connectivity");
        systemService.getClass();
        this.f13769g = (ConnectivityManager) systemService;
        this.f13770h = new Object();
        this.f13772j = new l9.f(2, this);
    }

    @Override // v8.e
    public final Object d() {
        if (Build.VERSION.SDK_INT >= 28) {
            ConnectivityManager connectivityManager = this.f13769g;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return h.b(networkCapabilities, this.f13771i);
            }
        }
        return h.a(this.f13769g, this.f13771i);
    }

    @Override // v8.e
    public final void g() {
        try {
            v.e().a(h.f13773a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f13769g;
            l9.f fVar = this.f13772j;
            connectivityManager.getClass();
            fVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(fVar);
        } catch (IllegalArgumentException e6) {
            v.e().d(h.f13773a, "Received exception while registering network callback", e6);
        } catch (SecurityException e10) {
            v.e().d(h.f13773a, "Received exception while registering network callback", e10);
        }
    }

    @Override // v8.e
    public final void h() {
        try {
            v.e().a(h.f13773a, "Unregistering network callback");
            this.f13769g.unregisterNetworkCallback(this.f13772j);
        } catch (IllegalArgumentException e6) {
            v.e().d(h.f13773a, "Received exception while unregistering network callback", e6);
        } catch (SecurityException e10) {
            v.e().d(h.f13773a, "Received exception while unregistering network callback", e10);
        }
    }
}
