package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s64  reason: default package */
/* loaded from: classes.dex */
public abstract class s64 {
    public static final String a = y70.h("NetworkStateTracker");

    /* JADX WARN: Can't wrap try/catch for region: R(17:2|3|4|(3:36|37|(13:39|7|8|(9:10|11|(2:13|(6:15|16|17|18|19|20))|31|16|17|18|19|20)|33|11|(0)|31|16|17|18|19|20))|6|7|8|(0)|33|11|(0)|31|16|17|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
        defpackage.y70.f().e(r1, "Unable to validate active network", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: SecurityException -> 0x002c, TRY_LEAVE, TryCatch #3 {SecurityException -> 0x002c, blocks: (B:12:0x001b, B:14:0x0025), top: B:42:0x001b, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[Catch: SecurityException -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #1 {SecurityException -> 0x0015, blocks: (B:6:0x000d, B:22:0x0040), top: B:38:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.r64 a(android.net.ConnectivityManager r9, boolean r10) {
        /*
            java.lang.String r1 = defpackage.s64.a
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
            y70 r6 = defpackage.y70.f()     // Catch: java.lang.SecurityException -> L55
            java.lang.String r7 = "Unable to validate active network"
            r6.e(r1, r7, r0)     // Catch: java.lang.SecurityException -> L55
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
            r64 r2 = new r64     // Catch: java.lang.SecurityException -> L55
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
            y70 r10 = defpackage.y70.f()
            java.lang.String r0 = "Unable to get active network state"
            r10.e(r1, r0, r9)
            r64 r3 = new r64
            r6 = 0
            r8 = r7
            r7 = 1
            r4 = 0
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s64.a(android.net.ConnectivityManager, boolean):r64");
    }
}
