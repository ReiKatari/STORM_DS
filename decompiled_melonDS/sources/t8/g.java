package t8;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import mc.l;
import p8.v;
import yb.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final g f13143a = new ConnectivityManager.NetworkCallback();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f13144b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f13145c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static NetworkCapabilities f13146d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f13147e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f13148f;

    public static void a() {
        int i2;
        Object bVar;
        boolean canBeSatisfiedBy;
        ArrayList arrayList = new ArrayList();
        synchronized (f13144b) {
            try {
                Iterator it = f13145c.entrySet().iterator();
                while (true) {
                    i2 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    l lVar = (l) entry.getKey();
                    NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                    g gVar = f13143a;
                    NetworkCapabilities networkCapabilities = f13146d;
                    gVar.getClass();
                    if (!f13148f) {
                        canBeSatisfiedBy = networkRequest.canBeSatisfiedBy(networkCapabilities);
                        if (canBeSatisfiedBy) {
                            i2 = 1;
                        }
                    }
                    if (i2 != 0) {
                        bVar = a.f13135a;
                    } else {
                        bVar = new b(7);
                    }
                    arrayList.add(new j(lVar, bVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            j jVar = (j) obj;
            ((l) jVar.A).k((c) jVar.B);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z10) {
        network.getClass();
        v.e().a(h.f13149a, "NetworkRequestConstraintController onBlockedStatusChanged callback");
        synchronized (f13144b) {
            if (f13148f == z10) {
                return;
            }
            f13148f = z10;
            a();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        v.e().a(h.f13149a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (f13144b) {
            f13146d = networkCapabilities;
        }
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        v.e().a(h.f13149a, "NetworkRequestConstraintController onLost callback");
        synchronized (f13144b) {
            f13146d = null;
            for (l lVar : f13145c.keySet()) {
                lVar.k(new b(7));
            }
        }
    }
}
