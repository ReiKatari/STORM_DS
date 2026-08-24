package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rf6  reason: default package */
/* loaded from: classes.dex */
public final class rf6 extends ConnectivityManager.NetworkCallback {
    public static final rf6 a = new ConnectivityManager.NetworkCallback();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    public static void a() {
        int i;
        Object w21Var;
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
                        qn2 qn2Var = (qn2) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        rf6 rf6Var = a;
                        NetworkCapabilities networkCapabilities = d;
                        rf6Var.getClass();
                        Boolean bool = f;
                        bool.getClass();
                        if (!bool.booleanValue()) {
                            canBeSatisfiedBy = networkRequest.canBeSatisfiedBy(networkCapabilities);
                            if (canBeSatisfiedBy) {
                                i = 1;
                            }
                        }
                        if (i != 0) {
                            w21Var = v21.a;
                        } else {
                            w21Var = new w21(7);
                        }
                        arrayList.add(new vr4(qn2Var, w21Var));
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        vr4 vr4Var = (vr4) obj;
                        ((qn2) vr4Var.A).g((x21) vr4Var.B);
                    }
                    return;
                }
                ga0 f2 = ga0.f();
                String str = zv7.a;
                f2.b(str, "Not dispatching constraint state yet: isBlocked=" + f + ", capabilitiesInitialized=" + e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        ga0 f2 = ga0.f();
        String str = zv7.a;
        f2.b(str, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (b) {
            if (nb3.k(f, Boolean.valueOf(z))) {
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
        ga0.f().b(zv7.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        ga0.f().b(zv7.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            d = null;
            for (qn2 qn2Var : c.keySet()) {
                qn2Var.g(new w21(7));
            }
        }
    }
}
