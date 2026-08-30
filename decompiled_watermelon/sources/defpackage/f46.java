package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f46  reason: default package */
/* loaded from: classes.dex */
public final class f46 extends ConnectivityManager.NetworkCallback {
    public static final f46 a = new ConnectivityManager.NetworkCallback();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    public static void a() {
        int i;
        Object rz0Var;
        boolean canBeSatisfiedBy;
        ArrayList arrayList = new ArrayList();
        synchronized (b) {
            try {
                if (e && f != null) {
                    Iterator it = c.entrySet().iterator();
                    while (true) {
                        i = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        mi2 mi2Var = (mi2) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        f46 f46Var = a;
                        NetworkCapabilities networkCapabilities = d;
                        f46Var.getClass();
                        Boolean bool = f;
                        bool.getClass();
                        if (!bool.booleanValue()) {
                            canBeSatisfiedBy = networkRequest.canBeSatisfiedBy(networkCapabilities);
                            if (canBeSatisfiedBy) {
                                i = 1;
                            }
                        }
                        if (i != 0) {
                            rz0Var = qz0.a;
                        } else {
                            rz0Var = new rz0(7);
                        }
                        arrayList.add(new ti4(mi2Var, rz0Var));
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ti4 ti4Var = (ti4) obj;
                        ((mi2) ti4Var.A).n((sz0) ti4Var.B);
                    }
                    return;
                }
                y70 f2 = y70.f();
                String str = zg7.a;
                f2.b(str, "Not dispatching constraint state yet: isBlocked=" + f + ", capabilitiesInitialized=" + e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        y70 f2 = y70.f();
        String str = zg7.a;
        f2.b(str, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (b) {
            if (b53.x(f, Boolean.valueOf(z))) {
                return;
            }
            f = Boolean.valueOf(z);
            a();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        y70.f().b(zg7.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        y70.f().b(zg7.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            d = null;
            for (mi2 mi2Var : c.keySet()) {
                mi2Var.n(new rz0(7));
            }
        }
    }
}
