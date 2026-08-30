package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u64  reason: default package */
/* loaded from: classes.dex */
public final class u64 {
    public final Context a;

    public u64(Context context) {
        this.a = context;
    }

    public final boolean a() {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            networkCapabilities = null;
        } else {
            networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        }
        if (networkCapabilities == null) {
            return false;
        }
        return networkCapabilities.hasCapability(12);
    }

    public final boolean b() {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            networkCapabilities = null;
        } else {
            networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        }
        if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            return true;
        }
        return false;
    }
}
