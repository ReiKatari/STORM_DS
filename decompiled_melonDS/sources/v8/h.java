package v8;

import android.net.NetworkCapabilities;
import p8.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13773a = v.g("NetworkStateTracker");

    /* JADX WARN: Can't wrap try/catch for region: R(17:2|3|4|(3:36|37|(13:39|7|8|(9:10|11|(2:13|(6:15|16|17|18|19|20))|31|16|17|18|19|20)|33|11|(0)|31|16|17|18|19|20))|6|7|8|(0)|33|11|(0)|31|16|17|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
        p8.v.e().d(r1, "Unable to validate active network", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: SecurityException -> 0x002c, TRY_LEAVE, TryCatch #3 {SecurityException -> 0x002c, blocks: (B:12:0x001b, B:14:0x0025), top: B:42:0x001b, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[Catch: SecurityException -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #1 {SecurityException -> 0x0015, blocks: (B:6:0x000d, B:22:0x0040), top: B:38:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final t8.e a(android.net.ConnectivityManager r9, boolean r10) {
        /*
            java.lang.String r1 = v8.h.f13773a
            r9.getClass()
            android.net.NetworkInfo r2 = r9.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L55
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L19
            boolean r0 = r2.isConnected()     // Catch: java.lang.SecurityException -> L15
            if (r0 == 0) goto L19
            r5 = r3
            goto L1b
        L15:
            r0 = move-exception
            r9 = r0
            r7 = r10
            goto L58
        L19:
            r5 = r3
            r3 = r4
        L1b:
            android.net.Network r0 = r9.getActiveNetwork()     // Catch: java.lang.SecurityException -> L2c
            android.net.NetworkCapabilities r0 = r9.getNetworkCapabilities(r0)     // Catch: java.lang.SecurityException -> L2c
            if (r0 == 0) goto L2e
            r6 = 16
            boolean r0 = r0.hasCapability(r6)     // Catch: java.lang.SecurityException -> L2c
            goto L3a
        L2c:
            r0 = move-exception
            goto L30
        L2e:
            r0 = r4
            goto L3a
        L30:
            p8.v r6 = p8.v.e()     // Catch: java.lang.SecurityException -> L55
            java.lang.String r7 = "Unable to validate active network"
            r6.d(r1, r7, r0)     // Catch: java.lang.SecurityException -> L55
            goto L2e
        L3a:
            boolean r9 = r9.isActiveNetworkMetered()     // Catch: java.lang.SecurityException -> L55
            if (r2 == 0) goto L48
            boolean r2 = r2.isRoaming()     // Catch: java.lang.SecurityException -> L15
            if (r2 != 0) goto L48
            r6 = r5
            goto L49
        L48:
            r6 = r4
        L49:
            t8.e r2 = new t8.e     // Catch: java.lang.SecurityException -> L55
            r5 = r9
            r7 = r10
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.SecurityException -> L52
            return r2
        L52:
            r0 = move-exception
        L53:
            r9 = r0
            goto L58
        L55:
            r0 = move-exception
            r7 = r10
            goto L53
        L58:
            p8.v r10 = p8.v.e()
            java.lang.String r0 = "Unable to get active network state"
            r10.d(r1, r0, r9)
            t8.e r3 = new t8.e
            r6 = 0
            r8 = r7
            r7 = 1
            r4 = 0
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.h.a(android.net.ConnectivityManager, boolean):t8.e");
    }

    public static final t8.e b(NetworkCapabilities networkCapabilities, boolean z10) {
        return new t8.e(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18), z10);
    }
}
