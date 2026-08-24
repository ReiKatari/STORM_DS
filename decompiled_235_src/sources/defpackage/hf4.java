package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hf4  reason: default package */
/* loaded from: classes.dex */
public abstract class hf4 {
    public static final String a = ga0.h("NetworkStateTracker");

    /* JADX WARN: Can't wrap try/catch for region: R(17:2|3|4|(3:36|37|(13:39|7|8|(9:10|11|(2:13|(6:15|16|17|18|19|20))|31|16|17|18|19|20)|33|11|(0)|31|16|17|18|19|20))|6|7|8|(0)|33|11|(0)|31|16|17|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
        defpackage.ga0.f().e(r1, "Unable to validate active network", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: SecurityException -> 0x002c, TRY_LEAVE, TryCatch #3 {SecurityException -> 0x002c, blocks: (B:12:0x001b, B:14:0x0025), top: B:42:0x001b, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[Catch: SecurityException -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #1 {SecurityException -> 0x0015, blocks: (B:6:0x000d, B:22:0x0040), top: B:38:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final gf4 a(ConnectivityManager connectivityManager, boolean z) {
        boolean z2;
        SecurityException securityException;
        boolean z3;
        boolean z4;
        boolean z5;
        NetworkCapabilities networkCapabilities;
        String str = a;
        connectivityManager.getClass();
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z6 = true;
            try {
                if (activeNetworkInfo != null) {
                    try {
                        if (activeNetworkInfo.isConnected()) {
                            z3 = true;
                            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                            if (networkCapabilities != null) {
                                z4 = networkCapabilities.hasCapability(16);
                                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                                if (activeNetworkInfo != null) {
                                    if (!activeNetworkInfo.isRoaming()) {
                                        z5 = z3;
                                        z2 = z;
                                        return new gf4(z6, z4, isActiveNetworkMetered, z5, z2);
                                    }
                                }
                                z5 = false;
                                z2 = z;
                                return new gf4(z6, z4, isActiveNetworkMetered, z5, z2);
                            }
                            z4 = false;
                            boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
                            if (activeNetworkInfo != null) {
                            }
                            z5 = false;
                            z2 = z;
                            return new gf4(z6, z4, isActiveNetworkMetered2, z5, z2);
                        }
                    } catch (SecurityException e) {
                        securityException = e;
                        z2 = z;
                        ga0.f().e(str, "Unable to get active network state", securityException);
                        return new gf4(false, false, false, true, z2);
                    }
                }
                return new gf4(z6, z4, isActiveNetworkMetered2, z5, z2);
            } catch (SecurityException e2) {
                e = e2;
                securityException = e;
                ga0.f().e(str, "Unable to get active network state", securityException);
                return new gf4(false, false, false, true, z2);
            }
            z3 = true;
            z6 = false;
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
            }
            z4 = false;
            boolean isActiveNetworkMetered22 = connectivityManager.isActiveNetworkMetered();
            if (activeNetworkInfo != null) {
            }
            z5 = false;
            z2 = z;
        } catch (SecurityException e3) {
            e = e3;
            z2 = z;
        }
    }
}
