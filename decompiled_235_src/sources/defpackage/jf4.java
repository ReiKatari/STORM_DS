package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jf4  reason: default package */
/* loaded from: classes.dex */
public final class jf4 {
    public final Context a;

    public jf4(Context context) {
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
